package com.andromo.dev576782.app537736;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0772e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import junit.framework.Assert;

public class Playlist implements Parcelable {
    public static final Creator CREATOR;
    Random f583a;
    private List f584b;
    private List f585c;
    private String f586d;
    private long f587e;
    private String f588f;
    private String f589g;
    private hd f590h;
    private hc f591i;
    private he f592j;
    private int f593k;
    private ct f594l;

    static {
        CREATOR = new gv();
    }

    private Playlist(Parcel parcel) {
        this.f590h = hd.SEQUENTIAL;
        this.f591i = hc.AUTOMATIC;
        this.f592j = he.OFF;
        this.f593k = -1;
        this.f594l = ct.Stopped;
        this.f583a = new Random();
        this.f587e = parcel.readLong();
        this.f586d = parcel.readString();
        this.f588f = parcel.readString();
        this.f589g = parcel.readString();
        this.f590h = hd.valueOf(parcel.readString());
        this.f591i = hc.valueOf(parcel.readString());
        this.f592j = he.valueOf(parcel.readString());
        this.f593k = parcel.readInt();
        this.f594l = ct.valueOf(parcel.readString());
        this.f584b = new ArrayList();
        this.f585c = new ArrayList();
        parcel.readTypedList(this.f584b, AudioItem.CREATOR);
        parcel.readList(this.f585c, Integer.class.getClassLoader());
    }

    private Playlist(ha haVar) {
        this.f590h = hd.SEQUENTIAL;
        this.f591i = hc.AUTOMATIC;
        this.f592j = he.OFF;
        this.f593k = -1;
        this.f594l = ct.Stopped;
        this.f583a = new Random();
        this.f587e = haVar.f994c;
        this.f586d = haVar.f995d;
        this.f588f = haVar.f997f;
        this.f589g = haVar.f996e;
        this.f590h = haVar.f998g;
        this.f591i = haVar.f999h;
        this.f592j = haVar.f1000i;
        this.f593k = haVar.f1001j;
        this.f584b = haVar.f1002k != null ? new ArrayList(haVar.f1002k) : null;
    }

    private Playlist(hf hfVar, Context context) {
        this.f590h = hd.SEQUENTIAL;
        this.f591i = hc.AUTOMATIC;
        this.f592j = he.OFF;
        this.f593k = -1;
        this.f594l = ct.Stopped;
        this.f583a = new Random();
        this.f587e = hfVar.f1022a;
        this.f586d = hfVar.f1023b;
        this.f588f = hfVar.f1024c;
        this.f589g = hfVar.f1025d;
        this.f590h = hfVar.f1026e;
        this.f591i = hfVar.f1027f;
        this.f592j = hfVar.f1028g;
        this.f593k = hfVar.f1029h;
        context.getResources();
        if (hfVar.f1031j == null || hfVar.f1031j == Collections.emptyList()) {
            this.f584b = Collections.emptyList();
        } else {
            this.f584b = new ArrayList(hfVar.f1031j);
        }
        if (hfVar.f1030i != null && hfVar.f1030i.size() == this.f584b.size()) {
            this.f585c = new ArrayList(hfVar.f1030i);
        }
    }

    private static void m1124a(List list, int i, int i2) {
        list.set(i, list.set(i2, list.get(i)));
    }

    private static void m1125a(List list, Random random) {
        Assert.assertTrue(list instanceof RandomAccess);
        int size = list.size();
        int i = size;
        Object obj = null;
        while (i > 1) {
            m1124a(list, i - 1, random.nextInt(i));
            Object obj2 = (i >= size || !((Number) list.get(i)).equals(Integer.valueOf(((Number) list.get(i - 1)).intValue() + 1))) ? null : 1;
            if (!(obj2 == null || r6 == null)) {
                m1124a(list, i - 1, i);
                obj2 = null;
            }
            i--;
            obj = obj2;
        }
    }

    public static boolean m1126a(Context context) {
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(2131623944);
        String[] stringArray2 = resources.getStringArray(2131623943);
        if (!(stringArray == null || stringArray2 == null || stringArray.length != stringArray2.length)) {
            Pattern compile = Pattern.compile("\\.(?:m3u|M3U|pls|PLS|asx|ASX)");
            int length = stringArray.length;
            for (int i = 0; i < length; i++) {
                if (ce.valueOf(stringArray[i]).m1315a()) {
                    return true;
                }
                CharSequence charSequence = stringArray2[i];
                if (charSequence != null && compile.matcher(charSequence).find()) {
                    return true;
                }
            }
        }
        return false;
    }

    static void m1137n() {
    }

    public final int m1138a(AudioItem audioItem) {
        if (!(this.f584b == null || audioItem == null)) {
            int size = this.f584b.size();
            for (int i = 0; i < size; i++) {
                if (audioItem.equals(this.f584b.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int m1139a(String str) {
        if (!(this.f584b == null || str == null)) {
            int size = this.f584b.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase(((AudioItem) this.f584b.get(i)).m985b())) {
                    return i;
                }
            }
        }
        return -1;
    }

    final String m1140a() {
        return this.f588f;
    }

    public final String m1141a(int i) {
        AudioItem b = m1148b(i);
        return (b == null || b.m985b() == null) ? "" : b.m985b();
    }

    public final void m1142a(ct ctVar) {
        this.f594l = ctVar;
    }

    public final void m1143a(gx gxVar) {
        boolean a = gxVar.m1524a();
        int i = ((a || this.f592j != he.ONE_TRACK) && (gxVar.m1525b() || this.f591i != hc.MANUAL)) ? 0 : 1;
        if (this.f584b.size() <= 0) {
            this.f593k = -1;
        } else if (i == 0) {
            switch (gw.f987a[this.f590h.ordinal()]) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    if (this.f584b.size() > 2) {
                        i = this.f593k;
                        do {
                            this.f593k = this.f583a.nextInt(this.f584b.size());
                        } while (this.f593k == i);
                        return;
                    }
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    break;
                default:
                    return;
            }
            this.f593k++;
            if (this.f593k < this.f584b.size()) {
                return;
            }
            if (a || this.f592j == he.ALL_TRACKS) {
                this.f593k = 0;
            } else {
                this.f593k = this.f584b.size() - 1;
            }
        } else if (!m1157e(this.f593k)) {
            this.f593k = 0;
        }
    }

    public final void m1144a(hd hdVar) {
        this.f590h = hdVar;
    }

    public final void m1145a(he heVar) {
        this.f592j = heVar;
    }

    public final boolean m1146a(Playlist playlist) {
        return (playlist == null || this.f586d == null || !this.f586d.equals(playlist.f586d)) ? false : true;
    }

    public final boolean m1147a(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) obj;
        return el.m1391a(this.f587e, playlist.f587e) && el.m1392a(this.f586d, playlist.f586d) && el.m1392a(this.f588f, playlist.f588f) && el.m1392a(this.f589g, playlist.f589g) && el.m1392a(this.f590h, playlist.f590h) && el.m1392a(this.f591i, playlist.f591i) && el.m1392a(this.f592j, playlist.f592j) && el.m1391a((long) this.f593k, (long) playlist.f593k) && el.m1392a(this.f584b, playlist.f584b) && el.m1392a(this.f585c, playlist.f585c);
    }

    public final AudioItem m1148b(int i) {
        return (this.f584b == null || !m1157e(i)) ? null : (AudioItem) this.f584b.get(i);
    }

    public final String m1149b() {
        return this.f586d;
    }

    public final boolean m1150b(Playlist playlist) {
        return m1146a(playlist);
    }

    public final int m1151c() {
        return this.f584b != null ? this.f584b.size() : 0;
    }

    public final void m1152c(int i) {
        if (i >= 0 && i < this.f584b.size()) {
            if (this.f590h == hd.SHUFFLE) {
                if (this.f585c == null || this.f585c.size() != this.f584b.size()) {
                    m1165m();
                }
                if (this.f585c != null) {
                    i = this.f585c.indexOf(Integer.valueOf(i));
                }
            }
            this.f593k = i;
        }
        i = -1;
        this.f593k = i;
    }

    public final boolean m1153c(Playlist playlist) {
        if (playlist == null || playlist.f585c == null || (this.f584b != null && this.f584b.size() != 0 && playlist.f585c.size() != this.f584b.size())) {
            return false;
        }
        this.f585c = new ArrayList(playlist.f585c);
        return true;
    }

    public final String m1154d() {
        return this.f589g;
    }

    public final boolean m1155d(int i) {
        return i == m1162j();
    }

    public int describeContents() {
        return 0;
    }

    public final hd m1156e() {
        return this.f590h;
    }

    public final boolean m1157e(int i) {
        return i >= 0 && i < m1151c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) obj;
        return el.m1391a(this.f587e, playlist.f587e) && el.m1392a(this.f586d, playlist.f586d) && el.m1392a(this.f588f, playlist.f588f) && el.m1392a(this.f589g, playlist.f589g) && el.m1392a(this.f590h, playlist.f590h) && el.m1392a(this.f591i, playlist.f591i) && el.m1392a(this.f592j, playlist.f592j) && el.m1391a((long) this.f593k, (long) playlist.f593k) && el.m1392a(this.f594l, playlist.f594l) && el.m1392a(this.f584b, playlist.f584b) && el.m1392a(this.f585c, playlist.f585c);
    }

    public final hc m1158f() {
        return this.f591i;
    }

    public final he m1159g() {
        return this.f592j;
    }

    public final ct m1160h() {
        return this.f594l;
    }

    public int hashCode() {
        long j = this.f587e;
        return ev.m1410a(ev.m1410a(ev.m1410a((ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(((int) (j ^ (j >>> 32))) + 851, this.f586d), this.f588f), this.f589g), this.f590h), this.f591i), this.f592j) * 37) + this.f593k, this.f594l), this.f584b), this.f585c);
    }

    public final AudioItem m1161i() {
        return m1148b(m1162j());
    }

    public final int m1162j() {
        if (this.f590h != hd.SHUFFLE) {
            return this.f593k;
        }
        if (this.f585c == null || this.f585c.size() != this.f584b.size()) {
            m1165m();
        }
        return (this.f585c == null || this.f593k == -1) ? -1 : ((Integer) this.f585c.get(this.f593k)).intValue();
    }

    public final boolean m1163k() {
        boolean z = true;
        boolean z2 = this.f591i == hc.AUTOMATIC || this.f592j != he.OFF;
        if (this.f593k != -1) {
            if ((this.f592j == he.ONE_TRACK ? this.f593k : this.f593k + 1) >= this.f584b.size()) {
                if (this.f592j != he.ALL_TRACKS) {
                    z = false;
                }
                z2 = z;
            }
        }
        m1143a(gx.f989b);
        return z2;
    }

    public final void m1164l() {
        if (this.f584b.size() == 0) {
            this.f593k = -1;
        } else if (this.f593k == -1) {
            this.f593k = this.f584b.size() - 1;
        } else {
            this.f593k--;
            if (this.f593k < 0) {
                this.f593k = this.f584b.size() - 1;
            }
        }
    }

    public final void m1165m() {
        int size = this.f584b.size();
        if (size == 3) {
            this.f585c = new ArrayList(3);
            if (this.f583a == null) {
                this.f583a = new Random();
            }
            int nextInt = this.f583a.nextInt(3);
            this.f585c.add(Integer.valueOf(nextInt));
            this.f585c.add(Integer.valueOf((nextInt + 5) % 3));
            this.f585c.add(Integer.valueOf((nextInt + 4) % 3));
            return;
        }
        if (this.f585c == null || this.f585c.size() != this.f584b.size()) {
            this.f585c = new ArrayList(size);
            for (nextInt = 0; nextInt < size; nextInt++) {
                this.f585c.add(Integer.valueOf(nextInt));
            }
        }
        if (size > 3) {
            if (this.f583a == null) {
                this.f583a = new Random();
            }
            m1125a(this.f585c, this.f583a);
        }
    }

    public String toString() {
        String property = System.getProperty("line.separator");
        return "Playlist {" + property + " playlistId:\"" + this.f586d + "\"" + property + " activityClassName:\"" + this.f588f + "\"" + property + " folder:\"" + this.f589g + "\"" + property + " playlistMode:" + this.f590h + property + " playbackMode:" + this.f591i + property + " repeatMode:" + this.f592j + property + " playerState:" + this.f594l + property + " currentTrack:" + this.f593k + property + " itemCount:" + m1151c() + property + " items:" + (this.f584b != null ? this.f584b.toString() : "[]") + " sequence:" + (this.f585c != null ? this.f585c.toString() : "[]") + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f587e);
        parcel.writeString(this.f586d);
        parcel.writeString(this.f588f);
        parcel.writeString(this.f589g);
        parcel.writeString(this.f590h.name());
        parcel.writeString(this.f591i.name());
        parcel.writeString(this.f592j.name());
        parcel.writeInt(this.f593k);
        parcel.writeString(this.f594l.name());
        parcel.writeTypedList(this.f584b);
        parcel.writeList(this.f585c);
    }
}
