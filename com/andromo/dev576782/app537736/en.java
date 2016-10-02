package com.andromo.dev576782.app537736;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.Html;
import android.widget.TextView;

public final class en {
    public static void m1395a(Context context) {
        Builder cancelable = new Builder(context).setTitle(2131230844).setMessage(Html.fromHtml(context.getString(2131230845))).setCancelable(false);
        cancelable.setIcon(2130837703);
        cancelable.setPositiveButton(17039370, new er(context));
        AlertDialog show = cancelable.show();
        if (show != null) {
            TextView textView = (TextView) show.findViewById(16908299);
            if (textView != null) {
                String string = context.getString(2131230903);
                em.m1393a();
                textView.setMovementMethod(em.m1394a(string));
            }
        }
    }
}
