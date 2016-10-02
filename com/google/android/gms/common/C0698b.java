package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.C0771d;

/* renamed from: com.google.android.gms.common.b */
public final class C0698b extends C0697i {
    public static final int f4706a;
    private static final C0698b f4707c;

    static {
        f4707c = new C0698b();
        f4706a = C0697i.f4705b;
    }

    C0698b() {
    }

    public static Dialog m5327a(Activity activity, OnCancelListener onCancelListener) {
        View progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        String e = C0706q.m5359e(activity);
        builder.setMessage(activity.getResources().getString(C0771d.common_google_play_services_updating_text, new Object[]{e}));
        builder.setTitle(C0771d.common_google_play_services_updating_title);
        builder.setPositiveButton("", null);
        Dialog create = builder.create();
        C0707e.m5362a(activity, onCancelListener, "GooglePlayServicesUpdatingDialog", create);
        return create;
    }

    public static C0698b m5328a() {
        return f4707c;
    }

    public final int m5329a(Context context) {
        return super.m5321a(context);
    }

    public final Intent m5330a(Context context, int i, String str) {
        return super.m5322a(context, i, str);
    }

    public final boolean m5331a(int i) {
        return super.m5323a(i);
    }

    public final boolean m5332a(Context context, int i) {
        return super.m5324a(context, i);
    }

    public final int m5333b(Context context) {
        return super.m5325b(context);
    }

    @Deprecated
    public final Intent m5334b(int i) {
        return super.m5326b(i);
    }
}
