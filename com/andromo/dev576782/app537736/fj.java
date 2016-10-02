package com.andromo.dev576782.app537736;

import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import java.util.HashMap;

final class fj {
    public static final fj f904a;
    private final String f905b;
    private final String f906c;
    private final String f907d;
    private final String f908e;
    private final String f909f;
    private final String f910g;
    private volatile int f911h;

    static {
        f904a = new fj("", "", "", "", "", "");
    }

    private fj(fk fkVar) {
        this.f905b = fkVar.f912a;
        this.f906c = fkVar.f913b;
        this.f907d = fkVar.f914c;
        this.f908e = fkVar.f915d;
        this.f909f = fkVar.f916e;
        this.f910g = fkVar.f917f;
    }

    private fj(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f905b = str;
        this.f906c = str2;
        this.f907d = str3;
        this.f908e = str4;
        this.f909f = str5;
        this.f910g = str6;
    }

    public static final fj m1437a() {
        return f904a;
    }

    static fj m1438a(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        fj a;
        try {
            if (VERSION.SDK_INT >= 14) {
                mediaMetadataRetriever.setDataSource(str, new HashMap());
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            a = new fk().m1448a(mediaMetadataRetriever.extractMetadata(7)).m1449b(mediaMetadataRetriever.extractMetadata(2) != null ? mediaMetadataRetriever.extractMetadata(2) : mediaMetadataRetriever.extractMetadata(13)).m1450c(mediaMetadataRetriever.extractMetadata(1)).m1451d(mediaMetadataRetriever.extractMetadata(8)).m1452e(mediaMetadataRetriever.extractMetadata(9)).m1453f(mediaMetadataRetriever.extractMetadata(6)).m1447a();
            return a;
        } catch (IllegalArgumentException e) {
            a = e;
            a.printStackTrace();
            return f904a;
        } catch (RuntimeException e2) {
            a = e2;
            a.printStackTrace();
            return f904a;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    static String m1439a(fj fjVar, String str) {
        if (!m1440b(str)) {
            return str;
        }
        if (fjVar == null || fjVar == f904a) {
            return str.replace("<->", "").replace("<title>", "").replace("<artist>", "").replace("<album>", "").replace("<year>", "").replace("<duration>", "").replace("<genre>", "").replace("()", "").replace("[]", "").trim();
        }
        if (str.contains("<->")) {
            CharSequence charSequence = fjVar.f905b.length() > 0 ? " - " + fjVar.f905b : "";
            CharSequence charSequence2 = fjVar.f906c.length() > 0 ? " - " + fjVar.f906c : "";
            CharSequence charSequence3 = fjVar.f907d.length() > 0 ? " - " + fjVar.f907d : "";
            CharSequence charSequence4 = fjVar.f908e.length() > 0 ? " - " + fjVar.f908e : "";
            str = str.replace("<-><title>", charSequence).replace("<-><artist>", charSequence2).replace("<-><album>", charSequence3).replace("<-><year>", charSequence4).replace("<-><duration>", fjVar.f909f.length() > 0 ? " - " + fjVar.m1441g() : "").replace("<-><genre>", fjVar.f910g.length() > 0 ? " - " + fjVar.f910g : "");
        }
        String replace = str.replace("<title>", fjVar.f905b).replace("<artist>", fjVar.f906c).replace("<album>", fjVar.f907d).replace("<year>", fjVar.f908e).replace("<duration>", fjVar.m1441g()).replace("<genre>", fjVar.f910g).replace("()", "").replace("[]", "");
        if (replace.startsWith(" - ")) {
            replace = replace.substring(2);
        }
        if (replace.endsWith(" - ")) {
            replace = replace.substring(0, replace.length() - 2);
        }
        return replace.replace("  ", " ").trim();
    }

    static boolean m1440b(String str) {
        return str.contains("<title>") || str.contains("<artist>") || str.contains("<album>") || str.contains("<year>") || str.contains("<duration>") || str.contains("<genre>");
    }

    private String m1441g() {
        if (this.f909f == null || this.f909f.length() == 0) {
            return "0:00";
        }
        if (((long) Integer.parseInt(this.f909f)) >= 3600000) {
            return String.format("%d:%02d:%02d", new Object[]{Integer.valueOf((int) (((long) Integer.parseInt(this.f909f)) / 3600000)), Integer.valueOf((int) ((((long) Integer.parseInt(this.f909f)) % 3600000) / 60000)), Integer.valueOf(((int) (((long) Integer.parseInt(this.f909f)) % 60000)) / 1000)});
        }
        return String.format("%d:%02d", new Object[]{Long.valueOf(((long) Integer.parseInt(this.f909f)) / 60000), Long.valueOf((((long) Integer.parseInt(this.f909f)) % 60000) / 1000)});
    }

    public final String m1442b() {
        return this.f905b;
    }

    public final String m1443c() {
        return this.f906c;
    }

    public final String m1444d() {
        return this.f907d;
    }

    public final String m1445e() {
        return this.f908e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fj)) {
            return false;
        }
        fj fjVar = (fj) obj;
        return el.m1392a(this.f905b, fjVar.f905b) && el.m1392a(this.f906c, fjVar.f906c) && el.m1392a(this.f907d, fjVar.f907d) && el.m1392a(this.f908e, fjVar.f908e) && el.m1392a(this.f909f, fjVar.f909f) && el.m1392a(this.f910g, fjVar.f910g);
    }

    public final int m1446f() {
        return (this.f909f == null || this.f909f.length() <= 0) ? 0 : Integer.parseInt(this.f909f) / 1000;
    }

    public final int hashCode() {
        int i = this.f911h;
        if (i != 0) {
            return i;
        }
        i = ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(23, this.f905b), this.f906c), this.f907d), this.f908e), this.f909f), this.f910g);
        this.f911h = i;
        return i;
    }

    public final String toString() {
        return "MediaMetadata { title:'" + this.f905b + "', artist:'" + this.f906c + "', album:'" + this.f907d + "', year:'" + this.f908e + "', duration:'" + this.f909f + "', genre:'" + this.f910g + "'}";
    }
}
