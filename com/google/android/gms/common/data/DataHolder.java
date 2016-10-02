package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepName
public final class DataHolder implements SafeParcelable {
    public static final C0705d CREATOR;
    private static final C0702b f4715l;
    Bundle f4716a;
    int[] f4717b;
    int f4718c;
    boolean f4719d;
    private final int f4720e;
    private final String[] f4721f;
    private final CursorWindow[] f4722g;
    private final int f4723h;
    private final Bundle f4724i;
    private Object f4725j;
    private boolean f4726k;

    static {
        CREATOR = new C0705d();
        f4715l = new C0703a(new String[0]);
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f4719d = false;
        this.f4726k = true;
        this.f4720e = i;
        this.f4721f = strArr;
        this.f4722g = cursorWindowArr;
        this.f4723h = i2;
        this.f4724i = bundle;
    }

    private boolean m5337g() {
        boolean z;
        synchronized (this) {
            z = this.f4719d;
        }
        return z;
    }

    private void m5338h() {
        synchronized (this) {
            if (!this.f4719d) {
                this.f4719d = true;
                for (CursorWindow close : this.f4722g) {
                    close.close();
                }
            }
        }
    }

    public final void m5339a() {
        int i;
        int i2 = 0;
        this.f4716a = new Bundle();
        for (i = 0; i < this.f4721f.length; i++) {
            this.f4716a.putInt(this.f4721f[i], i);
        }
        this.f4717b = new int[this.f4722g.length];
        i = 0;
        while (i2 < this.f4722g.length) {
            this.f4717b[i2] = i;
            i += this.f4722g[i2].getNumRows() - (i - this.f4722g[i2].getStartPosition());
            i2++;
        }
        this.f4718c = i;
    }

    final int m5340b() {
        return this.f4720e;
    }

    final String[] m5341c() {
        return this.f4721f;
    }

    final CursorWindow[] m5342d() {
        return this.f4722g;
    }

    public final int describeContents() {
        return 0;
    }

    public final int m5343e() {
        return this.f4723h;
    }

    public final Bundle m5344f() {
        return this.f4724i;
    }

    protected final void finalize() {
        try {
            if (this.f4726k && this.f4722g.length > 0 && !m5337g()) {
                "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + (this.f4725j == null ? "internal object: " + toString() : this.f4725j.toString()) + ")";
                m5338h();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0705d.m5346a(this, parcel, i);
    }
}
