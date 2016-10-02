package com.andromo.dev576782.app537736;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

/* renamed from: com.andromo.dev576782.app537736.i */
final class C0205i implements OnClickListener {
    final /* synthetic */ Context f1101a;

    C0205i(Context context) {
        this.f1101a = context;
    }

    public final void onClick(View view) {
        try {
            fa.m1415a(this.f1101a, "http://www.andromo.com/?utm_source=about&utm_medium=app&utm_campaign=andromo_app");
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f1101a, 2131230937, 0).show();
        }
    }
}
