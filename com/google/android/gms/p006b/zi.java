package com.google.android.gms.p006b;

import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.google.android.gms.C0772e;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.google.android.gms.b.zi */
public final class zi implements zl {
    protected final HttpClient f4458a;

    public zi(HttpClient httpClient) {
        this.f4458a = httpClient;
    }

    private static void m5024a(HttpUriRequest httpUriRequest, Map map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    public final HttpResponse m5025a(ue ueVar, Map map) {
        HttpUriRequest httpGet;
        switch (ueVar.m3553b()) {
            case IcsAdapterView.ITEM_VIEW_TYPE_IGNORE /*-1*/:
                ue.m3543h();
                httpGet = new HttpGet(ueVar.m3557d());
                break;
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                httpGet = new HttpGet(ueVar.m3557d());
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                httpGet = new HttpPost(ueVar.m3557d());
                httpGet.addHeader("Content-Type", ue.m3544i());
                ue.m3545j();
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                httpGet = new HttpPut(ueVar.m3557d());
                httpGet.addHeader("Content-Type", ue.m3544i());
                ue.m3545j();
                break;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                httpGet = new HttpDelete(ueVar.m3557d());
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                httpGet = new HttpHead(ueVar.m3557d());
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                httpGet = new HttpOptions(ueVar.m3557d());
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                httpGet = new HttpTrace(ueVar.m3557d());
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                httpGet = new zj(ueVar.m3557d());
                httpGet.addHeader("Content-Type", ue.m3544i());
                ue.m3545j();
                break;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
        zi.m5024a(httpGet, map);
        zi.m5024a(httpGet, ueVar.m3550a());
        HttpParams params = httpGet.getParams();
        int l = ueVar.m3562l();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, l);
        return this.f4458a.execute(httpGet);
    }
}
