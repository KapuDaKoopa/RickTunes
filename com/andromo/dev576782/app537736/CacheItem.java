package com.andromo.dev576782.app537736;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class CacheItem implements Parcelable {
    public static final Creator CREATOR;
    public static final CacheItem f559a;
    private final int f560b;
    private final da f561c;
    private final boolean f562d;
    private final String f563e;
    private volatile int f564f;

    static {
        f559a = new CacheItem(0, da.NONE, false, "");
        CREATOR = new cy();
    }

    private CacheItem(int i, da daVar, boolean z, String str) {
        this.f560b = i;
        this.f561c = daVar;
        this.f562d = z;
        this.f563e = str;
    }

    private CacheItem(Parcel parcel) {
        this.f560b = parcel.readInt();
        this.f561c = da.valueOf(parcel.readString());
        this.f562d = parcel.readInt() != 0;
        this.f563e = parcel.readString();
    }

    private CacheItem(cz czVar) {
        this.f560b = czVar.f819a;
        this.f561c = czVar.f820b;
        this.f562d = czVar.f821c;
        this.f563e = czVar.f822d;
    }

    public static final CacheItem m1095a() {
        return f559a;
    }

    public static final CacheItem m1096a(DataInputStream dataInputStream) {
        if (dataInputStream == null) {
            return f559a;
        }
        dataInputStream.readInt();
        return new CacheItem(dataInputStream.readInt(), da.valueOf(dataInputStream.readUTF()), dataInputStream.readBoolean(), dataInputStream.readUTF());
    }

    public final synchronized void m1100a(DataOutputStream dataOutputStream) {
        if (dataOutputStream != null) {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(this.f560b);
            dataOutputStream.writeUTF(this.f561c.name());
            dataOutputStream.writeBoolean(this.f562d);
            dataOutputStream.writeUTF(this.f563e);
        }
    }

    public final da m1101b() {
        return this.f561c;
    }

    public final boolean m1102c() {
        return this.f562d;
    }

    public final String m1103d() {
        return this.f563e;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CacheItem)) {
            return false;
        }
        CacheItem cacheItem = (CacheItem) obj;
        if (el.m1391a((long) this.f560b, (long) cacheItem.f560b) && el.m1392a(this.f561c, cacheItem.f561c)) {
            if ((this.f562d == cacheItem.f562d) && el.m1392a(this.f563e, cacheItem.f563e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f564f;
        if (i != 0) {
            return i;
        }
        i = ev.m1410a((this.f562d ? 1 : 0) + (ev.m1410a(this.f560b + 851, this.f561c) * 37), this.f563e);
        this.f564f = i;
        return i;
    }

    public final String toString() {
        return "CacheItem { seek: " + this.f560b + ", status: " + this.f561c + ", isCached: " + this.f562d + ", cacheFile: '" + this.f563e + "'}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f560b);
        parcel.writeString(this.f561c.name());
        parcel.writeInt(this.f562d ? 1 : 0);
        parcel.writeString(this.f563e);
    }
}
