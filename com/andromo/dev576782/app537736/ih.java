package com.andromo.dev576782.app537736;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

final class ih implements OnClickListener {
    final /* synthetic */ ig f1109a;

    ih(ig igVar) {
        this.f1109a = igVar;
    }

    public final void onClick(View view) {
        Context context = view.getContext();
        if (context != null && this.f1109a.f1106c != null) {
            try {
                fa.m1415a(context, this.f1109a.f1106c);
                ao.m1272a("Static Ad", "Clicked");
            } catch (ActivityNotFoundException e) {
                Toast.makeText(context, "Error loading URL", 0).show();
                ao.m1272a("Static Ad", "Click Failed (Browser Not Found)");
            }
        }
    }
}
