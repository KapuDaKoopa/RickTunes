package com.andromo.dev576782.app537736;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class PlaylistInfo implements Parcelable {
    public static final Creator CREATOR;
    public static final PlaylistInfo f595a;
    private final String f596b;
    private final String f597c;
    private final String f598d;
    private final String f599e;
    private final String f600f;
    private final String f601g;
    private volatile int f602h;

    static {
        f595a = new PlaylistInfo("", "", "", "", "", "");
        CREATOR = new hh();
    }

    private PlaylistInfo(Parcel parcel) {
        this.f596b = parcel.readString();
        this.f597c = parcel.readString();
        this.f598d = parcel.readString();
        this.f599e = parcel.readString();
        this.f600f = parcel.readString();
        this.f601g = parcel.readString();
    }

    private PlaylistInfo(hi hiVar) {
        this.f596b = hiVar.f1039a;
        this.f597c = hiVar.f1040b;
        this.f598d = hiVar.f1041c;
        this.f599e = hiVar.f1042d;
        this.f600f = hiVar.f1043e;
        this.f601g = hiVar.f1044f;
    }

    private PlaylistInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f596b = str;
        this.f597c = str2;
        this.f598d = str3;
        this.f599e = str4;
        this.f600f = str5;
        this.f601g = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaylistInfo)) {
            return false;
        }
        PlaylistInfo playlistInfo = (PlaylistInfo) obj;
        return el.m1392a(this.f596b, playlistInfo.f596b) && el.m1392a(this.f597c, playlistInfo.f597c) && el.m1392a(this.f598d, playlistInfo.f598d) && el.m1392a(this.f599e, playlistInfo.f599e) && el.m1392a(this.f600f, playlistInfo.f600f) && el.m1392a(this.f601g, playlistInfo.f601g);
    }

    public final int hashCode() {
        int i = this.f602h;
        if (i != 0) {
            return i;
        }
        i = ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(ev.m1410a(23, this.f596b), this.f597c), this.f598d), this.f599e), this.f600f), this.f601g);
        this.f602h = i;
        return i;
    }

    public final String toString() {
        return "PlaylistInfo { title: '" + this.f596b + "', subtitle: '" + this.f597c + "', artist: '" + this.f599e + "', description: '" + this.f598d + "', link: '" + this.f600f + "', image: '" + this.f601g + "'}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f596b);
        parcel.writeString(this.f597c);
        parcel.writeString(this.f598d);
        parcel.writeString(this.f599e);
        parcel.writeString(this.f600f);
        parcel.writeString(this.f601g);
    }
}
