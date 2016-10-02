package com.andromo.dev576782.app537736;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.app.NotificationCompat;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

/* renamed from: com.andromo.dev576782.app537736.h */
final class C0204h {
    static AlertDialog m1530a(Context context) {
        CharSequence string = context.getString(2131231031, new Object[]{context.getString(2131230764)});
        Context contextThemeWrapper = new ContextThemeWrapper(context, 2131165280);
        View inflate = View.inflate(contextThemeWrapper, 2130903041, null);
        TextView textView = (TextView) inflate.findViewById(2131361906);
        if (textView != null) {
            textView.setText(Html.fromHtml(context.getString(2131231032, new Object[]{C0204h.m1532b(context)})));
        }
        textView = (TextView) inflate.findViewById(2131361907);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(Html.fromHtml(context.getString(2131231033, new Object[]{"<b><a href=\"http://www.andromo.com/profiles/mcminers9\">mcminers9</a></b>"})));
            textView.setVisibility(0);
        }
        textView = (TextView) inflate.findViewById(2131361916);
        if (textView != null) {
            textView.setText(context.getString(2131231035, new Object[]{"4.6.2/336"}));
        }
        textView = (TextView) inflate.findViewById(2131361915);
        if (textView != null) {
            textView.setText(context.getString(2131231036, new Object[]{"2016"}));
        }
        OnClickListener c0205i = new C0205i(context);
        View findViewById = inflate.findViewById(2131361911);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        textView = (TextView) inflate.findViewById(2131361908);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(Html.fromHtml(context.getString(2131231034, new Object[]{"<b><a href=\"http://www.andromo.com/profiles/mcminers9\">Andromo</a></b>"})));
        }
        findViewById = inflate.findViewById(2131361913);
        if (findViewById != null) {
            findViewById.setOnClickListener(c0205i);
        }
        findViewById = inflate.findViewById(2131361912);
        if (findViewById != null) {
            findViewById.setOnClickListener(c0205i);
        }
        textView = (TextView) inflate.findViewById(2131361909);
        if (textView != null) {
            textView.setVisibility(8);
        }
        hr.m1567a();
        View findViewById2 = inflate.findViewById(2131361910);
        if (findViewById2 != null) {
            findViewById2.setVisibility(ao.m1277c(context) ? 0 : 8);
        }
        ao.m1272a("About Dialog", "Shown");
        return new Builder(contextThemeWrapper).setTitle(string).setView(inflate).setPositiveButton(17039370, null).setIcon(2130837703).create();
    }

    static void m1531a(Dialog dialog) {
        if (ao.m1274a()) {
            View findViewById = dialog.findViewById(2131361910);
            if (findViewById != null) {
                findViewById.setVisibility(ao.m1277c(dialog.getContext()) ? 0 : 8);
            }
        }
    }

    private static String m1532b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY).versionName;
        } catch (NameNotFoundException e) {
            return "";
        }
    }
}
