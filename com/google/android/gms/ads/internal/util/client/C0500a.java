package com.google.android.gms.ads.internal.util.client;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0326b;
import com.google.android.gms.ads.C0341h;
import com.google.android.gms.ads.doubleclick.C0331c;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.C0706q;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.xn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

@op
/* renamed from: com.google.android.gms.ads.internal.util.client.a */
public final class C0500a {
    public static final Handler f2543a;
    private static final String f2544b;
    private static final String f2545c;
    private static final String f2546d;
    private static final String f2547e;
    private static final String f2548f;
    private static final String f2549g;

    static {
        f2543a = new Handler(Looper.getMainLooper());
        f2544b = AdView.class.getName();
        f2545c = C0341h.class.getName();
        f2546d = PublisherAdView.class.getName();
        f2547e = C0331c.class.getName();
        f2548f = SearchAdView.class.getName();
        f2549g = C0326b.class.getName();
    }

    public static int m3009a(Context context, int i) {
        return C0500a.m3010a(context.getResources().getDisplayMetrics(), i);
    }

    public static int m3010a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static String m3011a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || C0500a.m3017a()) {
            string = "emulator";
        }
        return C0500a.m3012a(string);
    }

    public static String m3012a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest.getInstance("MD5").update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r1.digest())});
            } catch (NoSuchAlgorithmException e) {
                i++;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3013a(java.lang.StackTraceElement[] r7, java.lang.String r8) {
        /*
        r1 = 0;
        r0 = 0;
    L_0x0002:
        r2 = r0 + 1;
        r3 = r7.length;
        if (r2 >= r3) goto L_0x0099;
    L_0x0007:
        r2 = r7[r0];
        r3 = r2.getClassName();
        r2 = r2.getMethodName();
        r4 = "loadAd";
        r2 = r4.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0086;
    L_0x0019:
        r2 = f2544b;
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 != 0) goto L_0x0049;
    L_0x0021:
        r2 = f2545c;
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 != 0) goto L_0x0049;
    L_0x0029:
        r2 = f2546d;
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 != 0) goto L_0x0049;
    L_0x0031:
        r2 = f2547e;
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 != 0) goto L_0x0049;
    L_0x0039:
        r2 = f2548f;
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 != 0) goto L_0x0049;
    L_0x0041:
        r2 = f2549g;
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 == 0) goto L_0x0086;
    L_0x0049:
        r0 = r0 + 1;
        r0 = r7[r0];
        r0 = r0.getClassName();
    L_0x0051:
        if (r8 == 0) goto L_0x0097;
    L_0x0053:
        r2 = ".";
        r4 = new java.util.StringTokenizer;
        r4.<init>(r8, r2);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r2 = 2;
        r3 = r4.hasMoreElements();
        if (r3 == 0) goto L_0x008e;
    L_0x0066:
        r3 = r4.nextToken();
        r5.append(r3);
    L_0x006d:
        r3 = r2 + -1;
        if (r2 <= 0) goto L_0x008a;
    L_0x0071:
        r2 = r4.hasMoreElements();
        if (r2 == 0) goto L_0x008a;
    L_0x0077:
        r2 = ".";
        r2 = r5.append(r2);
        r6 = r4.nextToken();
        r2.append(r6);
        r2 = r3;
        goto L_0x006d;
    L_0x0086:
        r0 = r0 + 1;
        goto L_0x0002;
    L_0x008a:
        r8 = r5.toString();
    L_0x008e:
        if (r0 == 0) goto L_0x0097;
    L_0x0090:
        r2 = r0.contains(r8);
        if (r2 != 0) goto L_0x0097;
    L_0x0096:
        return r0;
    L_0x0097:
        r0 = r1;
        goto L_0x0096;
    L_0x0099:
        r0 = r1;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.a.a(java.lang.StackTraceElement[], java.lang.String):java.lang.String");
    }

    public static void m3014a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str) {
        C0500a.m3015a(viewGroup, adSizeParcel, str, -16777216, -1);
    }

    private static void m3015a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            View frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = C0500a.m3009a(context, 3);
            frameLayout.addView(textView, new LayoutParams(adSizeParcel.f1908g - a, adSizeParcel.f1905d - a, 17));
            viewGroup.addView(frameLayout, adSizeParcel.f1908g, adSizeParcel.f1905d);
        }
    }

    public static void m3016a(ViewGroup viewGroup, AdSizeParcel adSizeParcel, String str, String str2) {
        C0501b.m3025a(str2);
        C0500a.m3015a(viewGroup, adSizeParcel, str, Menu.CATEGORY_MASK, -16777216);
    }

    public static boolean m3017a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static int m3018b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return C0500a.m3019b(displayMetrics, i);
    }

    public static int m3019b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    public static boolean m3020b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean m3021b(Context context) {
        return C0706q.m5347a(context) == 0;
    }

    public static boolean m3022c(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    public static boolean m3023d(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (xn.m4900a(17)) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
        } else {
            try {
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception e) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == i && displayMetrics.widthPixels == i2;
    }

    public static int m3024e(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }
}
