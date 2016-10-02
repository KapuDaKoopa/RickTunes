package com.andromo.dev576782.app537736;

import java.io.FilterReader;
import java.io.Reader;

public final class ea extends FilterReader {
    private eb f851a;
    private dp f852b;
    private dp f853c;

    public ea(Reader reader) {
        super(reader);
        this.f851a = eb.f854a;
        this.f852b = new dp(32);
        this.f853c = new dp(32);
    }

    public final int read() {
        while (true) {
            eb a;
            ea eaVar;
            if (this.f851a == eb.f861h) {
                if (this.f853c.f841d == 1) {
                    if (this.f853c.m1343c() != '&') {
                        return this.f853c.m1341b();
                    }
                    this.f851a = eb.f858e;
                } else if (this.f853c.f841d > 0) {
                    return this.f853c.m1341b();
                } else {
                    this.f851a = eb.f854a;
                }
            } else if (this.f851a == eb.f862i) {
                if (this.f853c.f841d > 0) {
                    return this.f853c.m1341b();
                }
                this.f851a = eb.f854a;
            }
            int read = this.in.read();
            if (read != -1) {
                a = this.f851a.m1361a((char) read, this.f852b, this.f853c);
                eaVar = this;
            } else {
                if (this.f851a.m1362a()) {
                    eb.m1360a(this.f853c);
                }
                if (this.f853c.f841d > 0) {
                    a = eb.f862i;
                    eaVar = this;
                } else {
                    a = eb.f854a;
                    eaVar = this;
                }
            }
            eaVar.f851a = a;
            if (this.f851a != eb.f862i && this.f851a != eb.f861h && !this.f851a.m1363b()) {
                return read;
            }
        }
    }

    public final int read(char[] cArr, int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            int read = read();
            if (read == -1) {
                break;
            }
            int i5 = i4 + 1;
            cArr[i4] = (char) read;
            i4 = i5;
        }
        return i4 - i > 0 ? i4 - i : -1;
    }
}
