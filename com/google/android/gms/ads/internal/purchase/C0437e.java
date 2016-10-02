package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.mo;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.purchase.e */
public final class C0437e extends mo {
    private String f2283a;
    private Context f2284b;
    private String f2285c;
    private ArrayList f2286d;

    public C0437e(String str, ArrayList arrayList, Context context, String str2) {
        this.f2285c = str;
        this.f2286d = arrayList;
        this.f2283a = str2;
        this.f2284b = context;
    }

    private String m2767a(String str, HashMap hashMap) {
        Object obj;
        Object obj2 = "";
        try {
            obj = this.f2284b.getPackageManager().getPackageInfo(this.f2284b.getPackageName(), 0).versionName;
        } catch (Throwable e) {
            C0501b.m3026a("Error to retrieve app version", e);
            obj = obj2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - ar.m2243h().m4369b().f4000b;
        for (String str2 : hashMap.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{str2}), String.format("$1%s$2", new Object[]{hashMap.get(str2)}));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sessionid"}), String.format("$1%s$2", new Object[]{ar.m2243h().f3975b})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appid"}), String.format("$1%s$2", new Object[]{r2})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"osversion"}), String.format("$1%s$2", new Object[]{String.valueOf(VERSION.SDK_INT)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"sdkversion"}), String.format("$1%s$2", new Object[]{this.f2283a})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"appversion"}), String.format("$1%s$2", new Object[]{obj})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"timestamp"}), String.format("$1%s$2", new Object[]{String.valueOf(elapsedRealtime)})).replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"[^@]+"}), String.format("$1%s$2", new Object[]{""})).replaceAll("@@", "@");
    }

    private void m2768b() {
        try {
            this.f2284b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}).invoke(null, new Object[]{this.f2284b, this.f2285c, "", Boolean.valueOf(true)});
        } catch (ClassNotFoundException e) {
            C0501b.m3025a("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            C0501b.m3025a("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Throwable e3) {
            C0501b.m3026a("Fail to report a conversion.", e3);
        }
    }

    public final String m2769a() {
        return this.f2285c;
    }

    public final void m2770a(int i) {
        if (i == 1) {
            m2768b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", String.valueOf(i));
        hashMap.put("sku", this.f2285c);
        List linkedList = new LinkedList();
        Iterator it = this.f2286d.iterator();
        while (it.hasNext()) {
            linkedList.add(m2767a((String) it.next(), hashMap));
        }
        ar.m2240e();
        rd.m4417a(this.f2284b, this.f2283a, linkedList);
    }

    public final void m2771b(int i) {
        int i2 = 1;
        if (i == 0) {
            m2768b();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("google_play_status", String.valueOf(i));
        hashMap.put("sku", this.f2285c);
        String str = "status";
        if (i != 0) {
            i2 = i == 1 ? 2 : i == 4 ? 3 : 0;
        }
        hashMap.put(str, String.valueOf(i2));
        List linkedList = new LinkedList();
        Iterator it = this.f2286d.iterator();
        while (it.hasNext()) {
            linkedList.add(m2767a((String) it.next(), hashMap));
        }
        ar.m2240e();
        rd.m4417a(this.f2284b, this.f2283a, linkedList);
    }
}
