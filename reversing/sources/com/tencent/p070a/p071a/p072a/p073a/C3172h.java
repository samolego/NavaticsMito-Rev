package com.tencent.p070a.p071a.p072a.p073a;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import com.tencent.wxop.stat.common.C2563f;
import org.json.JSONObject;

/* renamed from: com.tencent.a.a.a.a.h */
/* loaded from: classes2.dex */
public final class C2401h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m5562a(Context context) {
        try {
            if (m5561a(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (deviceId != null) {
                    return deviceId;
                }
            } else {
                Log.i("MID", "Could not get permission of android.permission.READ_PHONE_STATE");
            }
            return "";
        } catch (Throwable th) {
            Log.w("MID", th);
            return "";
        }
    }

    /* renamed from: a */
    private static void m5559a(String str, Throwable th) {
        Log.e("MID", str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m5558a(JSONObject jSONObject, String str, String str2) {
        if (m5560a(str2)) {
            jSONObject.put(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5561a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            m5559a("checkPermission error", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m5560a(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m5557b(Context context) {
        String str;
        if (m5561a(context, "android.permission.ACCESS_WIFI_STATE")) {
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                return wifiManager == null ? "" : wifiManager.getConnectionInfo().getMacAddress();
            } catch (Exception e) {
                str = "get wifi address error" + e;
            }
        } else {
            str = "Could not get permission of android.permission.ACCESS_WIFI_STATE";
        }
        Log.i("MID", str);
        return "";
    }

    /* renamed from: b */
    public static boolean m5556b(String str) {
        return str != null && str.trim().length() >= 40;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m5555c(String str) {
        if (str == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(C2563f.m4861b(Base64.decode(str.getBytes("UTF-8"), 0)), "UTF-8").trim().replace("\t", "").replace("\n", "").replace("\r", "");
        } catch (Throwable th) {
            m5559a("decode error", th);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m5554d(String str) {
        if (str == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(Base64.encode(C2563f.m4863a(str.getBytes("UTF-8")), 0), "UTF-8").trim().replace("\t", "").replace("\n", "").replace("\r", "");
        } catch (Throwable th) {
            m5559a("decode error", th);
            return str;
        }
    }
}
