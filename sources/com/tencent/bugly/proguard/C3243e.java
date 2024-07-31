package com.tencent.bugly.proguard;

import com.adapt.SPM_Rc;

/* compiled from: BUGLY */
/* renamed from: com.tencent.bugly.proguard.e */
/* loaded from: classes2.dex */
public final class C2472e {

    /* renamed from: a */
    private static final char[] f7636a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static String m5255a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f7636a;
            cArr[i2 + 1] = cArr2[b & SPM_Rc.VIBRATION_MODE.MAX_VOLUME];
            cArr[i2] = cArr2[((byte) (b >>> 4)) & SPM_Rc.VIBRATION_MODE.MAX_VOLUME];
        }
        return new String(cArr);
    }
}
