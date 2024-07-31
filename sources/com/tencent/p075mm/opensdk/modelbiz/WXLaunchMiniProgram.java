package com.tencent.p075mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p075mm.opensdk.modelbase.BaseReq;
import com.tencent.p075mm.opensdk.modelbase.BaseResp;
import com.tencent.p075mm.opensdk.utils.C2524d;
import com.tencent.p075mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram */
/* loaded from: classes2.dex */
public class WXLaunchMiniProgram {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req */
    /* loaded from: classes2.dex */
    public static final class Req extends BaseReq {
        public static final int MINIPROGRAM_TYPE_PREVIEW = 2;
        public static final int MINIPROGRAM_TYPE_TEST = 1;
        public static final int MINIPTOGRAM_TYPE_RELEASE = 0;
        private static final String TAG = "MicroMsg.SDK.WXLaunchMiniProgram.Req";
        public String userName;
        public String path = "";
        public int miniprogramType = 0;
        public String extData = "";

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseReq
        public final boolean checkArgs() {
            String str;
            String str2;
            if (C2524d.m4991i(this.userName)) {
                str = TAG;
                str2 = "userName is null";
            } else {
                int i = this.miniprogramType;
                if (i >= 0 && i <= 2) {
                    return true;
                }
                str = TAG;
                str2 = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
            }
            Log.m5000e(str, str2);
            return false;
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseReq
        public final int getType() {
            return 19;
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseReq
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_username", this.userName);
            bundle.putString("_launch_wxminiprogram_path", this.path);
            bundle.putString("_launch_wxminiprogram_extData", this.extData);
            bundle.putInt("_launch_wxminiprogram_type", this.miniprogramType);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp */
    /* loaded from: classes2.dex */
    public static final class Resp extends BaseResp {
        public String extMsg;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseResp
        public final boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseResp
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_launch_wxminiprogram_ext_msg");
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseResp
        public final int getType() {
            return 19;
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseResp
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.extMsg);
        }
    }
}