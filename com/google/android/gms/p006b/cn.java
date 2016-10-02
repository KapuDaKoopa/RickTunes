package com.google.android.gms.p006b;

import android.content.Context;
import android.os.Environment;
import com.google.android.gms.ads.internal.ar;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@op
/* renamed from: com.google.android.gms.b.cn */
public final class cn {
    BlockingQueue f3094a;
    ExecutorService f3095b;
    public LinkedHashMap f3096c;
    Map f3097d;
    String f3098e;
    final Context f3099f;
    final String f3100g;
    AtomicBoolean f3101h;
    File f3102i;

    public cn(Context context, String str, String str2, Map map) {
        this.f3096c = new LinkedHashMap();
        this.f3097d = new HashMap();
        this.f3099f = context;
        this.f3100g = str;
        this.f3098e = str2;
        this.f3101h = new AtomicBoolean(false);
        this.f3101h.set(((Boolean) ar.m2249n().m3580a(ck.f3044I)).booleanValue());
        if (this.f3101h.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.f3102i = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f3096c.put(entry.getKey(), entry.getValue());
        }
        this.f3094a = new ArrayBlockingQueue(30);
        this.f3095b = Executors.newSingleThreadExecutor();
        this.f3095b.execute(new co(this));
        this.f3097d.put("action", cr.f3105b);
        this.f3097d.put("ad_format", cr.f3105b);
        this.f3097d.put("e", cr.f3106c);
    }

    public final cr m3585a(String str) {
        cr crVar = (cr) this.f3097d.get(str);
        return crVar != null ? crVar : cr.f3104a;
    }

    final Map m3586a(Map map, Map map2) {
        Map linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, m3585a(str).m3590a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final boolean m3587a(cz czVar) {
        return this.f3094a.offer(czVar);
    }
}
