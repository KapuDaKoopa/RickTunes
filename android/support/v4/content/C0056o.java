package android.support.v4.content;

import android.os.Process;

/* renamed from: android.support.v4.content.o */
final class C0056o extends C0055u {
    final /* synthetic */ C0045m f85a;

    C0056o(C0045m c0045m) {
        this.f85a = c0045m;
        super();
    }

    public final Object call() {
        this.f85a.f75i.set(true);
        Process.setThreadPriority(10);
        C0045m c0045m = this.f85a;
        C0045m c0045m2 = this.f85a;
        Object[] objArr = this.b;
        return c0045m.m74b(c0045m2.m81b());
    }
}
