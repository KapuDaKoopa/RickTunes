package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.p001b.C0042o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.a */
public abstract class C0044a extends C0043k {
    volatile C0046b f62a;
    volatile C0046b f63b;
    long f64c;
    long f65d;
    Handler f66e;

    public C0044a(Context context) {
        super(context);
        this.f65d = -10000;
    }

    protected final void m67a() {
        super.m61a();
        if (this.f62a != null) {
            if (this.f63b != null) {
                if (this.f62a.f77b) {
                    this.f62a.f77b = false;
                    this.f66e.removeCallbacks(this.f62a);
                }
                this.f62a = null;
            } else {
                if (this.f62a.f77b) {
                    this.f62a.f77b = false;
                    this.f66e.removeCallbacks(this.f62a);
                } else if (this.f62a.m82d()) {
                    this.f63b = this.f62a;
                }
                this.f62a = null;
            }
        }
        this.f62a = new C0046b(this);
        m70b();
    }

    final void m68a(C0046b c0046b) {
        if (this.f63b == c0046b) {
            if (this.f61m) {
                this.f60l = true;
            }
            this.f65d = SystemClock.uptimeMillis();
            this.f63b = null;
            m70b();
        }
    }

    public final void m69a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.m63a(str, fileDescriptor, printWriter, strArr);
        if (this.f62a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f62a);
            printWriter.print(" waiting=");
            printWriter.println(this.f62a.f77b);
        }
        if (this.f63b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f63b);
            printWriter.print(" waiting=");
            printWriter.println(this.f63b.f77b);
        }
        if (this.f64c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0042o.m57a(this.f64c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0042o.m56a(this.f65d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    final void m70b() {
        if (this.f63b == null && this.f62a != null) {
            if (this.f62a.f77b) {
                this.f62a.f77b = false;
                this.f66e.removeCallbacks(this.f62a);
            }
            if (this.f64c <= 0 || SystemClock.uptimeMillis() >= this.f65d + this.f64c) {
                this.f62a.m78a(C0045m.f70d);
                return;
            }
            this.f62a.f77b = true;
            this.f66e.postAtTime(this.f62a, this.f65d + this.f64c);
        }
    }

    public abstract Object m71c();
}
