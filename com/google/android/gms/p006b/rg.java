package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@TargetApi(8)
@op
/* renamed from: com.google.android.gms.b.rg */
public class rg {
    public static boolean m4459a(tf tfVar) {
        if (tfVar == null) {
            return false;
        }
        tfVar.onPause();
        return true;
    }

    public static boolean m4460b(tf tfVar) {
        if (tfVar == null) {
            return false;
        }
        tfVar.onResume();
        return true;
    }

    public int m4461a() {
        return 0;
    }

    public Drawable m4462a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public tg m4463a(tf tfVar, boolean z) {
        return new tg(tfVar, z);
    }

    public String m4464a(Context context) {
        return "";
    }

    public String m4465a(SslError sslError) {
        return "";
    }

    public Set m4466a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        Set linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public void m4467a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            m4469a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public void m4468a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public void m4469a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean m4470a(Request request) {
        return false;
    }

    public boolean m4471a(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean m4472a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean m4473a(Window window) {
        return false;
    }

    public int m4474b() {
        return 1;
    }

    public boolean m4475b(View view) {
        return false;
    }

    public int m4476c() {
        return 5;
    }

    public WebChromeClient m4477c(tf tfVar) {
        return null;
    }

    public boolean m4478c(View view) {
        return false;
    }

    public LayoutParams m4479d() {
        return new LayoutParams(-2, -2);
    }
}
