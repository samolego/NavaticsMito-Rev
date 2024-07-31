package android.support.p011v7.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.p008v4.content.ContextCompat;
import android.text.TextUtils;

/* renamed from: android.support.v7.preference.PreferenceManager */
/* loaded from: classes.dex */
public class PreferenceManager {
    public static final String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
    private static final int STORAGE_DEFAULT = 0;
    private static final int STORAGE_DEVICE_PROTECTED = 1;
    private Context mContext;
    @Nullable
    private SharedPreferences.Editor mEditor;
    private boolean mNoCommit;
    private OnDisplayPreferenceDialogListener mOnDisplayPreferenceDialogListener;
    private OnNavigateToScreenListener mOnNavigateToScreenListener;
    private OnPreferenceTreeClickListener mOnPreferenceTreeClickListener;
    private PreferenceComparisonCallback mPreferenceComparisonCallback;
    @Nullable
    private PreferenceDataStore mPreferenceDataStore;
    private PreferenceScreen mPreferenceScreen;
    @Nullable
    private SharedPreferences mSharedPreferences;
    private int mSharedPreferencesMode;
    private String mSharedPreferencesName;
    private long mNextId = 0;
    private int mStorage = 0;

    /* renamed from: android.support.v7.preference.PreferenceManager$OnDisplayPreferenceDialogListener */
    /* loaded from: classes.dex */
    public interface OnDisplayPreferenceDialogListener {
        void onDisplayPreferenceDialog(Preference preference);
    }

    /* renamed from: android.support.v7.preference.PreferenceManager$OnNavigateToScreenListener */
    /* loaded from: classes.dex */
    public interface OnNavigateToScreenListener {
        void onNavigateToScreen(PreferenceScreen preferenceScreen);
    }

    /* renamed from: android.support.v7.preference.PreferenceManager$OnPreferenceTreeClickListener */
    /* loaded from: classes.dex */
    public interface OnPreferenceTreeClickListener {
        boolean onPreferenceTreeClick(Preference preference);
    }

    /* renamed from: android.support.v7.preference.PreferenceManager$PreferenceComparisonCallback */
    /* loaded from: classes.dex */
    public static abstract class PreferenceComparisonCallback {
        public abstract boolean arePreferenceContentsTheSame(Preference preference, Preference preference2);

        public abstract boolean arePreferenceItemsTheSame(Preference preference, Preference preference2);
    }

    private static int getDefaultSharedPreferencesMode() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PreferenceManager(Context context) {
        this.mContext = context;
        setSharedPreferencesName(getDefaultSharedPreferencesName(context));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PreferenceScreen inflateFromResource(Context context, int i, PreferenceScreen preferenceScreen) {
        setNoCommit(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new PreferenceInflater(context, this).inflate(i, preferenceScreen);
        preferenceScreen2.onAttachedToHierarchy(this);
        setNoCommit(false);
        return preferenceScreen2;
    }

    public PreferenceScreen createPreferenceScreen(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.onAttachedToHierarchy(this);
        return preferenceScreen;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNextId() {
        long j;
        synchronized (this) {
            j = this.mNextId;
            this.mNextId = 1 + j;
        }
        return j;
    }

    public String getSharedPreferencesName() {
        return this.mSharedPreferencesName;
    }

    public void setSharedPreferencesName(String str) {
        this.mSharedPreferencesName = str;
        this.mSharedPreferences = null;
    }

    public int getSharedPreferencesMode() {
        return this.mSharedPreferencesMode;
    }

    public void setSharedPreferencesMode(int i) {
        this.mSharedPreferencesMode = i;
        this.mSharedPreferences = null;
    }

    public void setStorageDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mStorage = 0;
            this.mSharedPreferences = null;
        }
    }

    public void setStorageDeviceProtected() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mStorage = 1;
            this.mSharedPreferences = null;
        }
    }

    public boolean isStorageDefault() {
        return Build.VERSION.SDK_INT < 24 || this.mStorage == 0;
    }

    public boolean isStorageDeviceProtected() {
        return Build.VERSION.SDK_INT >= 24 && this.mStorage == 1;
    }

    public void setPreferenceDataStore(PreferenceDataStore preferenceDataStore) {
        this.mPreferenceDataStore = preferenceDataStore;
    }

    @Nullable
    public PreferenceDataStore getPreferenceDataStore() {
        return this.mPreferenceDataStore;
    }

    public SharedPreferences getSharedPreferences() {
        Context createDeviceProtectedStorageContext;
        if (getPreferenceDataStore() != null) {
            return null;
        }
        if (this.mSharedPreferences == null) {
            if (this.mStorage == 1) {
                createDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(this.mContext);
            } else {
                createDeviceProtectedStorageContext = this.mContext;
            }
            this.mSharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences(this.mSharedPreferencesName, this.mSharedPreferencesMode);
        }
        return this.mSharedPreferences;
    }

    public static SharedPreferences getDefaultSharedPreferences(Context context) {
        return context.getSharedPreferences(getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode());
    }

    private static String getDefaultSharedPreferencesName(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceScreen;
    }

    public boolean setPreferences(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.mPreferenceScreen;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.onDetached();
            }
            this.mPreferenceScreen = preferenceScreen;
            return true;
        }
        return false;
    }

    public Preference findPreference(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.mPreferenceScreen;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.findPreference(charSequence);
    }

    public static void setDefaultValues(Context context, int i, boolean z) {
        setDefaultValues(context, getDefaultSharedPreferencesName(context), getDefaultSharedPreferencesMode(), i, z);
    }

    public static void setDefaultValues(Context context, String str, int i, int i2, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(KEY_HAS_SET_DEFAULT_VALUES, 0);
        if (z || !sharedPreferences.getBoolean(KEY_HAS_SET_DEFAULT_VALUES, false)) {
            PreferenceManager preferenceManager = new PreferenceManager(context);
            preferenceManager.setSharedPreferencesName(str);
            preferenceManager.setSharedPreferencesMode(i);
            preferenceManager.inflateFromResource(context, i2, null);
            sharedPreferences.edit().putBoolean(KEY_HAS_SET_DEFAULT_VALUES, true).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SharedPreferences.Editor getEditor() {
        if (this.mPreferenceDataStore != null) {
            return null;
        }
        if (this.mNoCommit) {
            if (this.mEditor == null) {
                this.mEditor = getSharedPreferences().edit();
            }
            return this.mEditor;
        }
        return getSharedPreferences().edit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldCommit() {
        return !this.mNoCommit;
    }

    private void setNoCommit(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.mEditor) != null) {
            editor.apply();
        }
        this.mNoCommit = z;
    }

    public Context getContext() {
        return this.mContext;
    }

    public PreferenceComparisonCallback getPreferenceComparisonCallback() {
        return this.mPreferenceComparisonCallback;
    }

    public void setPreferenceComparisonCallback(PreferenceComparisonCallback preferenceComparisonCallback) {
        this.mPreferenceComparisonCallback = preferenceComparisonCallback;
    }

    public OnDisplayPreferenceDialogListener getOnDisplayPreferenceDialogListener() {
        return this.mOnDisplayPreferenceDialogListener;
    }

    public void setOnDisplayPreferenceDialogListener(OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener) {
        this.mOnDisplayPreferenceDialogListener = onDisplayPreferenceDialogListener;
    }

    public void showDialog(Preference preference) {
        OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener = this.mOnDisplayPreferenceDialogListener;
        if (onDisplayPreferenceDialogListener != null) {
            onDisplayPreferenceDialogListener.onDisplayPreferenceDialog(preference);
        }
    }

    public void setOnPreferenceTreeClickListener(OnPreferenceTreeClickListener onPreferenceTreeClickListener) {
        this.mOnPreferenceTreeClickListener = onPreferenceTreeClickListener;
    }

    public OnPreferenceTreeClickListener getOnPreferenceTreeClickListener() {
        return this.mOnPreferenceTreeClickListener;
    }

    public void setOnNavigateToScreenListener(OnNavigateToScreenListener onNavigateToScreenListener) {
        this.mOnNavigateToScreenListener = onNavigateToScreenListener;
    }

    public OnNavigateToScreenListener getOnNavigateToScreenListener() {
        return this.mOnNavigateToScreenListener;
    }

    /* renamed from: android.support.v7.preference.PreferenceManager$SimplePreferenceComparisonCallback */
    /* loaded from: classes.dex */
    public static class SimplePreferenceComparisonCallback extends PreferenceComparisonCallback {
        @Override // android.support.p011v7.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceItemsTheSame(Preference preference, Preference preference2) {
            return preference.getId() == preference2.getId();
        }

        @Override // android.support.p011v7.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceContentsTheSame(Preference preference, Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if (!(preference == preference2 && preference.wasDetached()) && TextUtils.equals(preference.getTitle(), preference2.getTitle()) && TextUtils.equals(preference.getSummary(), preference2.getSummary())) {
                Drawable icon = preference.getIcon();
                Drawable icon2 = preference2.getIcon();
                if ((icon == icon2 || (icon != null && icon.equals(icon2))) && preference.isEnabled() == preference2.isEnabled() && preference.isSelectable() == preference2.isSelectable()) {
                    if (!(preference instanceof TwoStatePreference) || ((TwoStatePreference) preference).isChecked() == ((TwoStatePreference) preference2).isChecked()) {
                        return !(preference instanceof DropDownPreference) || preference == preference2;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }
}
