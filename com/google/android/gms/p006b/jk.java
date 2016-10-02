package com.google.android.gms.p006b;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.jk */
public final class jk implements jj {
    private final ji f3449a;
    private final HashSet f3450b;

    public jk(ji jiVar) {
        this.f3449a = jiVar;
        this.f3450b = new HashSet();
    }

    public final void m3901a() {
        Iterator it = this.f3450b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            "Unregistering eventhandler: " + ((fk) simpleEntry.getValue()).toString();
            qk.m4383a();
            this.f3449a.m3844b((String) simpleEntry.getKey(), (fk) simpleEntry.getValue());
        }
        this.f3450b.clear();
    }

    public final void m3902a(String str, fk fkVar) {
        this.f3449a.m3841a(str, fkVar);
        this.f3450b.add(new SimpleEntry(str, fkVar));
    }

    public final void m3903a(String str, String str2) {
        this.f3449a.m3842a(str, str2);
    }

    public final void m3904a(String str, JSONObject jSONObject) {
        this.f3449a.m3843a(str, jSONObject);
    }

    public final void m3905b(String str, fk fkVar) {
        this.f3449a.m3844b(str, fkVar);
        this.f3450b.remove(new SimpleEntry(str, fkVar));
    }

    public final void m3906b(String str, JSONObject jSONObject) {
        this.f3449a.m3845b(str, jSONObject);
    }
}
