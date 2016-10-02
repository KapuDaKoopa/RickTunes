package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import com.google.android.gms.ads.internal.ar;

/* renamed from: com.google.android.gms.b.lk */
final class lk implements OnClickListener {
    final /* synthetic */ lj f3587a;

    lk(lj ljVar) {
        this.f3587a = ljVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        lj ljVar = this.f3587a;
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", ljVar.f3581b);
        data.putExtra("eventLocation", ljVar.f3585f);
        data.putExtra("description", ljVar.f3584e);
        if (ljVar.f3582c > -1) {
            data.putExtra("beginTime", ljVar.f3582c);
        }
        if (ljVar.f3583d > -1) {
            data.putExtra("endTime", ljVar.f3583d);
        }
        data.setFlags(268435456);
        ar.m2240e();
        rd.m4414a(this.f3587a.f3580a, data);
    }
}
