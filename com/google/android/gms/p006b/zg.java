package com.google.android.gms.p006b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.b.zg */
final class zg {
    public long f4449a;
    public String f4450b;
    public String f4451c;
    public long f4452d;
    public long f4453e;
    public long f4454f;
    public long f4455g;
    public Map f4456h;

    private zg() {
    }

    public zg(String str, ax axVar) {
        this.f4450b = str;
        this.f4449a = (long) axVar.f2935a.length;
        this.f4451c = axVar.f2936b;
        this.f4452d = axVar.f2937c;
        this.f4453e = axVar.f2938d;
        this.f4454f = axVar.f2939e;
        this.f4455g = axVar.f2940f;
        this.f4456h = axVar.f2941g;
    }

    public static zg m5020a(InputStream inputStream) {
        zg zgVar = new zg();
        if (zf.m5004a(inputStream) != 538247942) {
            throw new IOException();
        }
        zgVar.f4450b = zf.m5012c(inputStream);
        zgVar.f4451c = zf.m5012c(inputStream);
        if (zgVar.f4451c.equals("")) {
            zgVar.f4451c = null;
        }
        zgVar.f4452d = zf.m5010b(inputStream);
        zgVar.f4453e = zf.m5010b(inputStream);
        zgVar.f4454f = zf.m5010b(inputStream);
        zgVar.f4455g = zf.m5010b(inputStream);
        zgVar.f4456h = zf.m5015d(inputStream);
        return zgVar;
    }

    public final boolean m5021a(OutputStream outputStream) {
        try {
            zf.m5005a(outputStream, 538247942);
            zf.m5007a(outputStream, this.f4450b);
            zf.m5007a(outputStream, this.f4451c == null ? "" : this.f4451c);
            zf.m5006a(outputStream, this.f4452d);
            zf.m5006a(outputStream, this.f4453e);
            zf.m5006a(outputStream, this.f4454f);
            zf.m5006a(outputStream, this.f4455g);
            Map map = this.f4456h;
            if (map != null) {
                zf.m5005a(outputStream, map.size());
                for (Entry entry : map.entrySet()) {
                    zf.m5007a(outputStream, (String) entry.getKey());
                    zf.m5007a(outputStream, (String) entry.getValue());
                }
            } else {
                zf.m5005a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            yh.m4916b("%s", e.toString());
            return false;
        }
    }
}
