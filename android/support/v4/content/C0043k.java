package android.support.v4.content;

import android.content.Context;
import android.support.v4.p001b.C0033d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.k */
public class C0043k {
    public int f54f;
    public C0023l f55g;
    Context f56h;
    public boolean f57i;
    public boolean f58j;
    public boolean f59k;
    public boolean f60l;
    public boolean f61m;

    public C0043k(Context context) {
        this.f57i = false;
        this.f58j = false;
        this.f59k = true;
        this.f60l = false;
        this.f61m = false;
        this.f56h = context.getApplicationContext();
    }

    protected void m61a() {
    }

    public final void m62a(C0023l c0023l) {
        if (this.f55g == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f55g != c0023l) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f55g = null;
        }
    }

    public void m63a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f54f);
        printWriter.print(" mListener=");
        printWriter.println(this.f55g);
        if (this.f57i || this.f60l || this.f61m) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f57i);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f60l);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f61m);
        }
        if (this.f58j || this.f59k) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f58j);
            printWriter.print(" mReset=");
            printWriter.println(this.f59k);
        }
    }

    public final void m64d() {
        this.f57i = true;
        this.f59k = false;
        this.f58j = false;
        m65e();
    }

    protected void m65e() {
    }

    public final void m66f() {
        m61a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0033d.m36a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f54f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
