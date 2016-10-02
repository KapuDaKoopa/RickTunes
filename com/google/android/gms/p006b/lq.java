package com.google.android.gms.p006b;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.ar;

/* renamed from: com.google.android.gms.b.lq */
final class lq implements OnClickListener {
    final /* synthetic */ String f3614a;
    final /* synthetic */ String f3615b;
    final /* synthetic */ lp f3616c;

    lq(lp lpVar, String str, String str2) {
        this.f3616c = lpVar;
        this.f3614a = str;
        this.f3615b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f3616c.f3613b.getSystemService("download");
        try {
            lp lpVar = this.f3616c;
            String str = this.f3614a;
            String str2 = this.f3615b;
            Request request = new Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            ar.m2242g().m4470a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException e) {
            this.f3616c.m4178a("Could not store picture.");
        }
    }
}
