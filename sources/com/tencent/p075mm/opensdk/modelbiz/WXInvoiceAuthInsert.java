package com.tencent.p075mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p075mm.opensdk.modelbase.BaseReq;
import com.tencent.p075mm.opensdk.modelbase.BaseResp;
import com.tencent.p075mm.opensdk.utils.C2524d;
import com.tencent.p075mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert */
/* loaded from: classes2.dex */
public class WXInvoiceAuthInsert {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Req */
    /* loaded from: classes2.dex */
    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXInvoiceAuthInsert.Req";
        private static final int URL_LENGTH_LIMIT = 10240;
        public String url;

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseReq
        public final boolean checkArgs() {
            if (C2524d.m4991i(this.url)) {
                Log.m4999i(TAG, "url should not be empty");
                return false;
            } else if (this.url.length() > URL_LENGTH_LIMIT) {
                Log.m5000e(TAG, "url must be in 10k");
                return false;
            } else {
                return true;
            }
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseReq
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.url = bundle.getString("_wxapi_invoice_auth_insert_req_url");
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseReq
        public final int getType() {
            return 20;
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseReq
        public final void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_invoice_auth_insert_req_url", this.url);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Resp */
    /* loaded from: classes2.dex */
    public static final class Resp extends BaseResp {
        public String wxOrderId;

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseResp
        public final boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseResp
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.wxOrderId = bundle.getString("_wxapi_invoice_auth_insert_order_id");
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseResp
        public final int getType() {
            return 20;
        }

        @Override // com.tencent.p075mm.opensdk.modelbase.BaseResp
        public final void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_invoice_auth_insert_order_id", this.wxOrderId);
        }
    }
}
