package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C0586c;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.api.internal.az;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.i */
public abstract class C0660i {
    private static final Set f4528a;

    static {
        f4528a = Collections.newSetFromMap(new WeakHashMap());
    }

    public static Set m5082a() {
        return f4528a;
    }

    public C0467c m5084a(C0655d c0655d) {
        throw new UnsupportedOperationException();
    }

    public C0586c m5085a(C0586c c0586c) {
        throw new UnsupportedOperationException();
    }

    public void m5086a(az azVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void m5087a(C0465m c0465m);

    public abstract void m5088a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public boolean m5089a(av avVar) {
        throw new UnsupportedOperationException();
    }

    public Context m5090b() {
        throw new UnsupportedOperationException();
    }

    public C0586c m5091b(C0586c c0586c) {
        throw new UnsupportedOperationException();
    }

    public void m5092b(az azVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void m5093b(C0465m c0465m);

    public Looper m5094c() {
        throw new UnsupportedOperationException();
    }

    public void m5095d() {
        throw new UnsupportedOperationException();
    }

    public abstract void m5096e();

    public abstract ConnectionResult m5097f();

    public abstract void m5098g();

    public abstract C0583o m5099h();
}
