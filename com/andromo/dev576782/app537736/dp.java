package com.andromo.dev576782.app537736;

import java.util.NoSuchElementException;

public final class dp {
    final char[] f838a;
    int f839b;
    int f840c;
    int f841d;

    public dp(int i) {
        int i2 = 4;
        if (i >= 4) {
            i2 = i - 1;
            i2 |= i2 >>> 1;
            i2 |= i2 >>> 2;
            i2 |= i2 >>> 4;
            i2 |= i2 >>> 8;
            i2 = (i2 | (i2 >>> 16)) + 1;
        }
        this.f838a = new char[i2];
        this.f839b = this.f838a.length - 1;
    }

    public final int m1337a() {
        return this.f838a.length - this.f841d;
    }

    public final void m1338a(char c) {
        char[] cArr = this.f838a;
        int i = (this.f840c - 1) & this.f839b;
        this.f840c = i;
        cArr[i] = c;
        if (this.f841d != this.f838a.length) {
            this.f841d++;
        }
    }

    public final boolean m1339a(CharSequence charSequence) {
        if (this.f841d < charSequence.length()) {
            return false;
        }
        int length = charSequence.length();
        int length2 = (this.f841d - charSequence.length()) + this.f840c;
        for (int i = 0; i < length; i++) {
            if (this.f838a[(length2 + i) & this.f839b] != charSequence.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean m1340a(char[] cArr) {
        if (this.f841d < cArr.length) {
            return false;
        }
        int length = cArr.length;
        int length2 = (this.f841d - cArr.length) + this.f840c;
        for (int i = 0; i < length; i++) {
            if (this.f838a[(length2 + i) & this.f839b] != cArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final char m1341b() {
        if (this.f841d == 0) {
            throw new NoSuchElementException();
        }
        char c = this.f838a[this.f840c];
        this.f840c = (this.f840c + 1) & this.f839b;
        this.f841d--;
        return c;
    }

    public final boolean m1342b(char c) {
        this.f838a[(this.f840c + this.f841d) & this.f839b] = c;
        if (this.f841d == this.f838a.length) {
            this.f840c = (this.f840c + 1) & this.f839b;
        } else {
            this.f841d++;
        }
        return true;
    }

    public final char m1343c() {
        return this.f841d == 0 ? '\u0000' : this.f838a[this.f840c];
    }

    public final char m1344d() {
        return this.f841d == 0 ? '\u0000' : this.f838a[((this.f840c + this.f841d) - 1) & this.f839b];
    }

    public final String toString() {
        Object obj = new char[this.f841d];
        if (this.f841d > 0) {
            int i = (this.f840c + this.f841d) & this.f839b;
            if (this.f840c < i) {
                System.arraycopy(this.f838a, this.f840c, obj, 0, this.f841d);
            } else if (this.f840c == 0) {
                System.arraycopy(this.f838a, 0, obj, 0, this.f841d);
            } else if (this.f840c >= i) {
                int length = this.f838a.length - this.f840c;
                System.arraycopy(this.f838a, this.f840c, obj, 0, length);
                System.arraycopy(this.f838a, 0, obj, length, i);
            }
        }
        return new String(obj);
    }
}
