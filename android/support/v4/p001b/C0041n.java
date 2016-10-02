package android.support.v4.p001b;

/* renamed from: android.support.v4.b.n */
public final class C0041n implements Cloneable {
    private static final Object f41a;
    private boolean f42b;
    private int[] f43c;
    private Object[] f44d;
    private int f45e;

    static {
        f41a = new Object();
    }

    public C0041n() {
        this((byte) 0);
    }

    private C0041n(byte b) {
        this.f42b = false;
        int a = C0032c.m33a(10);
        this.f43c = new int[a];
        this.f44d = new Object[a];
        this.f45e = 0;
    }

    private C0041n m44c() {
        try {
            C0041n c0041n = (C0041n) super.clone();
            try {
                c0041n.f43c = (int[]) this.f43c.clone();
                c0041n.f44d = (Object[]) this.f44d.clone();
                return c0041n;
            } catch (CloneNotSupportedException e) {
                return c0041n;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    private void m45d() {
        int i = this.f45e;
        int[] iArr = this.f43c;
        Object[] objArr = this.f44d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f41a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f42b = false;
        this.f45e = i2;
    }

    public final int m46a() {
        if (this.f42b) {
            m45d();
        }
        return this.f45e;
    }

    public final Object m47a(int i) {
        int a = C0032c.m34a(this.f43c, this.f45e, i);
        return (a < 0 || this.f44d[a] == f41a) ? null : this.f44d[a];
    }

    public final void m48a(int i, Object obj) {
        int a = C0032c.m34a(this.f43c, this.f45e, i);
        if (a >= 0) {
            this.f44d[a] = obj;
            return;
        }
        a ^= -1;
        if (a >= this.f45e || this.f44d[a] != f41a) {
            if (this.f42b && this.f45e >= this.f43c.length) {
                m45d();
                a = C0032c.m34a(this.f43c, this.f45e, i) ^ -1;
            }
            if (this.f45e >= this.f43c.length) {
                int a2 = C0032c.m33a(this.f45e + 1);
                Object obj2 = new int[a2];
                Object obj3 = new Object[a2];
                System.arraycopy(this.f43c, 0, obj2, 0, this.f43c.length);
                System.arraycopy(this.f44d, 0, obj3, 0, this.f44d.length);
                this.f43c = obj2;
                this.f44d = obj3;
            }
            if (this.f45e - a != 0) {
                System.arraycopy(this.f43c, a, this.f43c, a + 1, this.f45e - a);
                System.arraycopy(this.f44d, a, this.f44d, a + 1, this.f45e - a);
            }
            this.f43c[a] = i;
            this.f44d[a] = obj;
            this.f45e++;
            return;
        }
        this.f43c[a] = i;
        this.f44d[a] = obj;
    }

    public final void m49b() {
        int i = this.f45e;
        Object[] objArr = this.f44d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f45e = 0;
        this.f42b = false;
    }

    public final void m50b(int i) {
        int a = C0032c.m34a(this.f43c, this.f45e, i);
        if (a >= 0 && this.f44d[a] != f41a) {
            this.f44d[a] = f41a;
            this.f42b = true;
        }
    }

    public final void m51c(int i) {
        if (this.f44d[i] != f41a) {
            this.f44d[i] = f41a;
            this.f42b = true;
        }
    }

    public final /* synthetic */ Object clone() {
        return m44c();
    }

    public final int m52d(int i) {
        if (this.f42b) {
            m45d();
        }
        return this.f43c[i];
    }

    public final Object m53e(int i) {
        if (this.f42b) {
            m45d();
        }
        return this.f44d[i];
    }

    public final int m54f(int i) {
        if (this.f42b) {
            m45d();
        }
        return C0032c.m34a(this.f43c, this.f45e, i);
    }

    public final String toString() {
        if (m46a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f45e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f45e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m52d(i));
            stringBuilder.append('=');
            C0041n e = m53e(i);
            if (e != this) {
                stringBuilder.append(e);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
