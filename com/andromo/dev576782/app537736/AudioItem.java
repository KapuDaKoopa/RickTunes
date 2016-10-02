package com.andromo.dev576782.app537736;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class AudioItem implements Parcelable {
    public static final Creator CREATOR;
    public static final AudioItem f502a;
    private final String f503b;
    private final String f504c;
    private final String f505d;
    private final ce f506e;
    private final String f507f;
    private final String f508g;
    private final String f509h;
    private final int f510i;
    private volatile int f511j;

    static {
        f502a = new AudioItem("", "", "", ce.f788b, "", "", "", 0);
        CREATOR = new cc();
    }

    private AudioItem(Parcel parcel) {
        this.f503b = parcel.readString();
        this.f504c = parcel.readString();
        this.f505d = parcel.readString();
        this.f506e = ce.valueOf(parcel.readString());
        this.f507f = parcel.readString();
        this.f508g = parcel.readString();
        this.f509h = parcel.readString();
        this.f510i = parcel.readInt();
    }

    private AudioItem(cd cdVar) {
        this.f503b = cdVar.f779a;
        this.f504c = cdVar.f780b;
        this.f505d = cdVar.f781c;
        this.f506e = cdVar.f782d;
        this.f507f = cdVar.f783e;
        this.f508g = cdVar.f784f;
        this.f509h = cdVar.f785g;
        this.f510i = cdVar.f786h;
    }

    public AudioItem(String str, String str2, String str3, ce ceVar, String str4, String str5, String str6, int i) {
        this.f503b = str;
        this.f504c = str2;
        this.f505d = str3;
        this.f506e = ceVar;
        this.f507f = str4;
        this.f508g = str5;
        this.f509h = str6;
        this.f510i = i;
    }

    public static final AudioItem m968a() {
        return f502a;
    }

    public static final synchronized AudioItem m969a(DataInputStream dataInputStream) {
        AudioItem audioItem;
        synchronized (AudioItem.class) {
            if (dataInputStream != null) {
                dataInputStream.readInt();
                audioItem = new AudioItem(dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readUTF(), ce.valueOf(dataInputStream.readUTF()), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readInt());
            } else {
                audioItem = f502a;
            }
        }
        return audioItem;
    }

    static String m970a(fj fjVar, String str, String str2) {
        if (str != null && str.length() != 0) {
            return str;
        }
        if (fjVar != null) {
            str = fjVar.m1442b();
        }
        return (str == null || str.length() == 0) ? str2 : str;
    }

    static String m971a(String str) {
        return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
    }

    static String m972a(String str, String str2) {
        return (str == null || str.length() == 0) ? str2 : str;
    }

    public static boolean m973a(AudioItem audioItem, AudioItem audioItem2) {
        return (audioItem == null || audioItem2 == null || audioItem.f503b == null || audioItem2.f503b == null) ? false : m971a(audioItem.f503b).equalsIgnoreCase(m971a(audioItem2.f503b));
    }

    static String m975b(fj fjVar, String str, String str2) {
        return (str == null || str.length() == 0) ? fj.m1439a(fjVar, str2) : str;
    }

    public final synchronized void m983a(DataOutputStream dataOutputStream) {
        if (dataOutputStream != null) {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeUTF(this.f503b);
            dataOutputStream.writeUTF(this.f504c);
            dataOutputStream.writeUTF(this.f505d);
            dataOutputStream.writeUTF(this.f506e.name());
            dataOutputStream.writeUTF(this.f507f);
            dataOutputStream.writeUTF(this.f508g);
            dataOutputStream.writeUTF(this.f509h);
            dataOutputStream.writeInt(this.f510i);
        }
    }

    public final boolean m984a(AudioItem audioItem) {
        return (audioItem == null || this.f503b == null || audioItem.f503b == null) ? false : m971a(this.f503b).equalsIgnoreCase(m971a(audioItem.f503b));
    }

    public final String m985b() {
        return this.f503b;
    }

    public final String m986c() {
        return this.f504c;
    }

    public final String m987d() {
        return this.f505d;
    }

    public final int describeContents() {
        return 0;
    }

    public final ce m988e() {
        return this.f506e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioItem)) {
            return false;
        }
        AudioItem audioItem = (AudioItem) obj;
        return el.m1392a(this.f503b, audioItem.f503b) && el.m1392a(this.f504c, audioItem.f504c) && el.m1392a(this.f505d, audioItem.f505d) && el.m1392a(this.f506e, audioItem.f506e) && el.m1392a(this.f507f, audioItem.f507f) && el.m1392a(this.f508g, audioItem.f508g) && el.m1392a(this.f509h, audioItem.f509h) && el.m1391a((long) this.f510i, (long) audioItem.f510i);
    }

    public final String m989f() {
        return this.f507f;
    }

    public final String m990g() {
        return this.f508g;
    }

    public final String m991h() {
        return this.f509h;
    }

    public final int hashCode() {
        int i = this.f511j;
        if (i != 0) {
            return i;
        }
        i = (ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(23, this.f503b), this.f504c), this.f505d), this.f506e), this.f507f), this.f508g), this.f509h) * 37) + this.f510i;
        this.f511j = i;
        return i;
    }

    public final boolean m992i() {
        return this.f506e == ce.f787a;
    }

    public final boolean m993j() {
        return this.f506e != null && this.f506e.m1316b();
    }

    public final boolean m994k() {
        return this.f506e != ce.f787a && this.f503b != null && this.f503b.length() > 4 && "file:".equalsIgnoreCase(this.f503b.substring(0, 5));
    }

    public final boolean m995l() {
        return (this.f506e == ce.f787a || this.f503b == null) ? false : this.f503b.length() > 5 ? "http:".equalsIgnoreCase(this.f503b.substring(0, 5)) || "https:".equalsIgnoreCase(this.f503b.substring(0, 6)) || "rtsp:".equalsIgnoreCase(this.f503b.substring(0, 5)) : this.f503b.length() > 4 ? "http:".equalsIgnoreCase(this.f503b.substring(0, 5)) || "rtsp:".equalsIgnoreCase(this.f503b.substring(0, 5)) : false;
    }

    public final String toString() {
        return "AudioItem { file: '" + this.f503b + "', title: '" + this.f504c + "', trackType: '" + this.f506e.name() + "', description: '" + this.f505d + "', artist: '" + this.f507f + "', album: '" + this.f508g + "', date: '" + this.f509h + "', duration: " + this.f510i + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f503b);
        parcel.writeString(this.f504c);
        parcel.writeString(this.f505d);
        parcel.writeString(this.f506e.name());
        parcel.writeString(this.f507f);
        parcel.writeString(this.f508g);
        parcel.writeString(this.f509h);
        parcel.writeInt(this.f510i);
    }
}
