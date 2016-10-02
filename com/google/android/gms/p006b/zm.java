package com.google.android.gms.p006b;

import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.google.android.gms.C0772e;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.google.android.gms.b.zm */
public final class zm implements zl {
    private final zn f4459a;
    private final SSLSocketFactory f4460b;

    public zm() {
        this((byte) 0);
    }

    private zm(byte b) {
        this('\u0000');
    }

    private zm(char c) {
        this.f4459a = null;
        this.f4460b = null;
    }

    private static HttpEntity m5029a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        HttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    public final HttpResponse m5030a(ue ueVar, Map map) {
        String a;
        String d = ueVar.m3557d();
        HashMap hashMap = new HashMap();
        hashMap.putAll(ueVar.m3550a());
        hashMap.putAll(map);
        if (this.f4459a != null) {
            a = this.f4459a.m5031a();
            if (a == null) {
                throw new IOException("URL blocked by rewriter: " + d);
            }
        }
        a = d;
        URL url = new URL(a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int l = ueVar.m3562l();
        httpURLConnection.setConnectTimeout(l);
        httpURLConnection.setReadTimeout(l);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && this.f4460b != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f4460b);
        }
        for (String d2 : hashMap.keySet()) {
            httpURLConnection.addRequestProperty(d2, (String) hashMap.get(d2));
        }
        switch (ueVar.m3553b()) {
            case IcsAdapterView.ITEM_VIEW_TYPE_IGNORE /*-1*/:
                ue.m3543h();
                break;
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                httpURLConnection.setRequestMethod("GET");
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                httpURLConnection.setRequestMethod("POST");
                ue.m3545j();
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                httpURLConnection.setRequestMethod("PUT");
                ue.m3545j();
                break;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                httpURLConnection.setRequestMethod("PATCH");
                ue.m3545j();
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (httpURLConnection.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        HttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage()));
        basicHttpResponse.setEntity(zm.m5029a(httpURLConnection));
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }
}
