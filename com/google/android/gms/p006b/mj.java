package com.google.android.gms.p006b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.mj */
public final class mj extends Handler {
    private final mh f3650a;

    public mj(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this(new mk(context));
    }

    private mj(mh mhVar) {
        this.f3650a = mhVar;
    }

    public final void handleMessage(Message message) {
        try {
            Bundle data = message.getData();
            if (data != null) {
                JSONObject jSONObject = new JSONObject(data.getString("data"));
                if ("fetch_html".equals(jSONObject.getString("message_name"))) {
                    try {
                        mh mhVar = this.f3650a;
                        jSONObject.getString("request_id");
                        mhVar.m4210a(jSONObject.getString("base_url"), jSONObject.getString("html"));
                    } catch (Exception e) {
                    }
                }
            }
        } catch (Exception e2) {
        }
    }
}
