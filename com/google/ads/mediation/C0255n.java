package com.google.ads.mediation;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
/* renamed from: com.google.ads.mediation.n */
public abstract class C0255n {
    public final void m1744a(Map map) {
        Map hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C0270p c0270p = (C0270p) field.getAnnotation(C0270p.class);
            if (c0270p != null) {
                hashMap.put(c0270p.m1776a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            C0501b.m3025a("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    C0501b.m3025a("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    C0501b.m3025a("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Bad Type");
                }
            } else {
                "Unexpected server option: " + ((String) entry.getKey()) + " = \"" + ((String) entry.getValue()) + "\"";
                C0501b.m3027a(3);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C0270p) field3.getAnnotation(C0270p.class)).m1777b()) {
                C0501b.m3025a("Required server option missing: " + ((C0270p) field3.getAnnotation(C0270p.class)).m1776a());
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(((C0270p) field3.getAnnotation(C0270p.class)).m1776a());
            }
        }
        if (stringBuilder.length() > 0) {
            throw new C0269o("Required server option(s) missing: " + stringBuilder.toString());
        }
    }
}
