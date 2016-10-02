package com.google.android.gms.p006b;

import java.util.Arrays;

/* renamed from: com.google.android.gms.b.yz */
public final class yz extends yn {
    public byte[] f4408b;
    public byte[][] f4409c;
    public boolean f4410d;

    public yz() {
        this.f4408b = yv.f4400h;
        this.f4409c = yv.f4399g;
        this.f4410d = false;
        this.a = null;
        this.S = -1;
    }

    protected final int m4990a() {
        int i = 0;
        int a = super.m4953a();
        if (!Arrays.equals(this.f4408b, yv.f4400h)) {
            a += yl.m4935b(1, this.f4408b);
        }
        if (this.f4409c != null && this.f4409c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f4409c.length) {
                byte[] bArr = this.f4409c[i];
                if (bArr != null) {
                    i3++;
                    i2 += yl.m4927a(bArr);
                }
                i++;
            }
            a = (a + i2) + (i3 * 1);
        }
        if (!this.f4410d) {
            return a;
        }
        boolean z = this.f4410d;
        return a + (yl.m4930b(3) + 1);
    }

    public final void m4991a(yl ylVar) {
        if (!Arrays.equals(this.f4408b, yv.f4400h)) {
            ylVar.m4946a(1, this.f4408b);
        }
        if (this.f4409c != null && this.f4409c.length > 0) {
            for (byte[] bArr : this.f4409c) {
                if (bArr != null) {
                    ylVar.m4946a(2, bArr);
                }
            }
        }
        if (this.f4410d) {
            ylVar.m4945a(3, this.f4410d);
        }
        super.m4954a(ylVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        return !Arrays.equals(this.f4408b, yzVar.f4408b) ? false : !yr.m4978a(this.f4409c, yzVar.f4409c) ? false : this.f4410d != yzVar.f4410d ? false : (this.a == null || this.a.m4964b()) ? yzVar.a == null || yzVar.a.m4964b() : this.a.equals(yzVar.a);
    }

    public final int hashCode() {
        int hashCode = ((this.f4410d ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f4408b)) * 31) + yr.m4973a(this.f4409c)) * 31)) * 31;
        int hashCode2 = (this.a == null || this.a.m4964b()) ? 0 : this.a.hashCode();
        return hashCode2 + hashCode;
    }
}
