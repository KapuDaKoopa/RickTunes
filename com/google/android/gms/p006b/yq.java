package com.google.android.gms.p006b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.b.yq */
final class yq implements Cloneable {
    private yo f4387a;
    private Object f4388b;
    private List f4389c;

    yq() {
        this.f4389c = new ArrayList();
    }

    private byte[] m4966c() {
        byte[] bArr = new byte[m4967a()];
        m4968a(yl.m4928a(bArr, bArr.length));
        return bArr;
    }

    final int m4967a() {
        if (this.f4388b != null) {
            return this.f4387a.m4958a(this.f4388b);
        }
        int i = 0;
        for (yu yuVar : this.f4389c) {
            i = (yuVar.f4392b.length + (yl.m4939d(yuVar.f4391a) + 0)) + i;
        }
        return i;
    }

    final void m4968a(yl ylVar) {
        if (this.f4388b != null) {
            this.f4387a.m4959a(this.f4388b, ylVar);
            return;
        }
        for (yu yuVar : this.f4389c) {
            ylVar.m4950c(yuVar.f4391a);
            ylVar.m4949b(yuVar.f4392b);
        }
    }

    public final yq m4969b() {
        int i = 0;
        yq yqVar = new yq();
        try {
            yqVar.f4387a = this.f4387a;
            if (this.f4389c == null) {
                yqVar.f4389c = null;
            } else {
                yqVar.f4389c.addAll(this.f4389c);
            }
            if (this.f4388b != null) {
                if (this.f4388b instanceof ys) {
                    yqVar.f4388b = ((ys) this.f4388b).m1659b();
                } else if (this.f4388b instanceof byte[]) {
                    yqVar.f4388b = ((byte[]) this.f4388b).clone();
                } else if (this.f4388b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f4388b;
                    Object obj = new byte[bArr.length][];
                    yqVar.f4388b = obj;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        obj[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.f4388b instanceof boolean[]) {
                    yqVar.f4388b = ((boolean[]) this.f4388b).clone();
                } else if (this.f4388b instanceof int[]) {
                    yqVar.f4388b = ((int[]) this.f4388b).clone();
                } else if (this.f4388b instanceof long[]) {
                    yqVar.f4388b = ((long[]) this.f4388b).clone();
                } else if (this.f4388b instanceof float[]) {
                    yqVar.f4388b = ((float[]) this.f4388b).clone();
                } else if (this.f4388b instanceof double[]) {
                    yqVar.f4388b = ((double[]) this.f4388b).clone();
                } else if (this.f4388b instanceof ys[]) {
                    ys[] ysVarArr = (ys[]) this.f4388b;
                    Object obj2 = new ys[ysVarArr.length];
                    yqVar.f4388b = obj2;
                    while (i < ysVarArr.length) {
                        obj2[i] = ysVarArr[i].m1659b();
                        i++;
                    }
                }
            }
            return yqVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ Object clone() {
        return m4969b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yq)) {
            return false;
        }
        yq yqVar = (yq) obj;
        if (this.f4388b != null && yqVar.f4388b != null) {
            return this.f4387a == yqVar.f4387a ? !this.f4387a.f4379b.isArray() ? this.f4388b.equals(yqVar.f4388b) : this.f4388b instanceof byte[] ? Arrays.equals((byte[]) this.f4388b, (byte[]) yqVar.f4388b) : this.f4388b instanceof int[] ? Arrays.equals((int[]) this.f4388b, (int[]) yqVar.f4388b) : this.f4388b instanceof long[] ? Arrays.equals((long[]) this.f4388b, (long[]) yqVar.f4388b) : this.f4388b instanceof float[] ? Arrays.equals((float[]) this.f4388b, (float[]) yqVar.f4388b) : this.f4388b instanceof double[] ? Arrays.equals((double[]) this.f4388b, (double[]) yqVar.f4388b) : this.f4388b instanceof boolean[] ? Arrays.equals((boolean[]) this.f4388b, (boolean[]) yqVar.f4388b) : Arrays.deepEquals((Object[]) this.f4388b, (Object[]) yqVar.f4388b) : false;
        } else {
            if (this.f4389c != null && yqVar.f4389c != null) {
                return this.f4389c.equals(yqVar.f4389c);
            }
            try {
                return Arrays.equals(m4966c(), yqVar.m4966c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m4966c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
