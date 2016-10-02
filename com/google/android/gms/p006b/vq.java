package com.google.android.gms.p006b;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0653q;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.b.vq */
final class vq extends vp {
    final /* synthetic */ vk f4297a;
    private final LogEventParcelable f4298b;

    vq(vk vkVar, LogEventParcelable logEventParcelable, C0660i c0660i) {
        this.f4297a = vkVar;
        super(c0660i);
        this.f4298b = logEventParcelable;
    }

    protected final /* synthetic */ C0653q m4826a(Status status) {
        return status;
    }

    protected final /* synthetic */ void m4827a(C0467c c0467c) {
        vt vtVar = (vt) c0467c;
        vu vrVar = new vr(this);
        try {
            vk.m4818b(this.f4298b);
            vtVar.m4835a(vrVar, this.f4298b);
        } catch (Throwable th) {
            "MessageNanoProducer " + this.f4298b.f4466f.toString() + " threw: " + th.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vq)) {
            return false;
        }
        return this.f4298b.equals(((vq) obj).f4298b);
    }

    public final String toString() {
        return "MethodImpl(" + this.f4298b + ")";
    }
}
