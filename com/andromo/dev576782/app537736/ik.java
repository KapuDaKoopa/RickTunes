package com.andromo.dev576782.app537736;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

final class ik implements DownloadListener {
    final /* synthetic */ Website344366 f1173a;

    ik(Website344366 website344366) {
        this.f1173a = website344366;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), str4);
        try {
            this.f1173a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            fa.m1415a(this.f1173a.f619b.getContext(), str);
        }
    }
}
