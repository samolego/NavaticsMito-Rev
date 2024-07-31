package butterknife.internal;

import android.view.View;

/* renamed from: butterknife.internal.a */
/* loaded from: classes.dex */
public abstract class DebouncingOnClickListener implements View.OnClickListener {

    /* renamed from: a */
    static boolean f139a = true;

    /* renamed from: b */
    private static final Runnable f140b = new Runnable() { // from class: butterknife.internal.a.1
        @Override // java.lang.Runnable
        public void run() {
            DebouncingOnClickListener.f139a = true;
        }
    };

    /* renamed from: a */
    public abstract void mo7462a(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (f139a) {
            f139a = false;
            view.post(f140b);
            mo7462a(view);
        }
    }
}
