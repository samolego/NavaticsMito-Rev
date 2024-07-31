package android.support.p008v4.view.animation;

/* renamed from: android.support.v4.view.animation.LinearOutSlowInInterpolator */
/* loaded from: classes.dex */
public class LinearOutSlowInInterpolator extends LookupTableInterpolator {
    private static final float[] VALUES = {0.0f, 0.0222f, 0.0424f, 0.0613f, 0.0793f, 0.0966f, 0.1132f, 0.1293f, 0.1449f, 0.16f, 0.1747f, 0.189f, 0.2029f, 0.2165f, 0.2298f, 0.2428f, 0.2555f, 0.268f, 0.2802f, 0.2921f, 0.3038f, 0.3153f, 0.3266f, 0.3377f, 0.3486f, 0.3592f, 0.3697f, 0.3801f, 0.3902f, 0.4002f, 0.41f, 0.4196f, 0.4291f, 0.4385f, 0.4477f, 0.4567f, 0.4656f, 0.4744f, 0.4831f, 0.4916f, 0.5f, 0.5083f, 0.5164f, 0.5245f, 0.5324f, 0.5402f, 0.5479f, 0.5555f, 0.5629f, 0.5703f, 0.5776f, 0.5847f, 0.5918f, 0.5988f, 0.6057f, 0.6124f, 0.6191f, 0.6257f, 0.6322f, 0.6387f, 0.645f, 0.6512f, 0.6574f, 0.6635f, 0.6695f, 0.6754f, 0.6812f, 0.687f, 0.6927f, 0.6983f, 0.7038f, 0.7093f, 0.7147f, 0.72f, 0.7252f, 0.7304f, 0.7355f, 0.7406f, 0.7455f, 0.7504f, 0.7553f, 0.76f, 0.7647f, 0.7694f, 0.774f, 0.7785f, 0.7829f, 0.7873f, 0.7917f, 0.7959f, 0.8002f, 0.8043f, 0.8084f, 0.8125f, 0.8165f, 0.8204f, 0.8243f, 0.8281f, 0.8319f, 0.8356f, 0.8392f, 0.8429f, 0.8464f, 0.8499f, 0.8534f, 0.8568f, 0.8601f, 0.8634f, 0.8667f, 0.8699f, 0.8731f, 0.8762f, 0.8792f, 0.8823f, 0.8852f, 0.8882f, 0.891f, 0.8939f, 0.8967f, 0.8994f, 0.9021f, 0.9048f, 0.9074f, 0.91f, 0.9125f, 0.915f, 0.9174f, 0.9198f, 0.9222f, 0.9245f, 0.9268f, 0.929f, 0.9312f, 0.9334f, 0.9355f, 0.9376f, 0.9396f, 0.9416f, 0.9436f, 0.9455f, 0.9474f, 0.9492f, 0.951f, 0.9528f, 0.9545f, 0.9562f, 0.9579f, 0.9595f, 0.9611f, 0.9627f, 0.9642f, 0.9657f, 0.9672f, 0.9686f, 0.97f, 0.9713f, 0.9726f, 0.9739f, 0.9752f, 0.9764f, 0.9776f, 0.9787f, 0.9798f, 0.9809f, 0.982f, 0.983f, 0.984f, 0.9849f, 0.9859f, 0.9868f, 0.9876f, 0.9885f, 0.9893f, 0.99f, 0.9908f, 0.9915f, 0.9922f, 0.9928f, 0.9934f, 0.994f, 0.9946f, 0.9951f, 0.9956f, 0.9961f, 0.9966f, 0.997f, 0.9974f, 0.9977f, 0.9981f, 0.9984f, 0.9987f, 0.9989f, 0.9992f, 0.9994f, 0.9995f, 0.9997f, 0.9998f, 0.9999f, 0.9999f, 1.0f, 1.0f};

    @Override // android.support.p008v4.view.animation.LookupTableInterpolator, android.animation.TimeInterpolator
    public /* bridge */ /* synthetic */ float getInterpolation(float f) {
        return super.getInterpolation(f);
    }

    public LinearOutSlowInInterpolator() {
        super(VALUES);
    }
}
