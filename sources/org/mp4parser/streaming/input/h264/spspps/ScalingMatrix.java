package org.mp4parser.streaming.input.h264.spspps;

import java.util.Arrays;

/* renamed from: org.mp4parser.streaming.input.h264.spspps.g */
/* loaded from: classes2.dex */
public class ScalingMatrix {

    /* renamed from: a */
    public ScalingList[] f12297a;

    /* renamed from: b */
    public ScalingList[] f12298b;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScalingMatrix{ScalingList4x4=");
        ScalingList[] scalingListArr = this.f12297a;
        sb.append(scalingListArr == null ? null : Arrays.asList(scalingListArr));
        sb.append("\n, ScalingList8x8=");
        ScalingList[] scalingListArr2 = this.f12298b;
        sb.append(scalingListArr2 != null ? Arrays.asList(scalingListArr2) : null);
        sb.append("\n");
        sb.append('}');
        return sb.toString();
    }
}
