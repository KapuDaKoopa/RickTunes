package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.i */
final class C0668i implements ar {
    final /* synthetic */ C0667h f4611a;

    C0668i(C0667h c0667h) {
        this.f4611a = c0667h;
    }

    public final void m5207a(int i, boolean z) {
        this.f4611a.f4603g.lock();
        try {
            if (this.f4611a.f4602f || this.f4611a.f4601e == null || !this.f4611a.f4601e.m5057b()) {
                this.f4611a.f4602f = false;
                C0667h.m5190a(this.f4611a, i, z);
                return;
            }
            this.f4611a.f4602f = true;
            this.f4611a.f4598b.m5155a(i);
            this.f4611a.f4603g.unlock();
        } finally {
            this.f4611a.f4603g.unlock();
        }
    }

    public final void m5208a(Bundle bundle) {
        this.f4611a.f4603g.lock();
        try {
            C0667h c0667h = this.f4611a;
            if (c0667h.f4599c == null) {
                c0667h.f4599c = bundle;
            } else if (bundle != null) {
                c0667h.f4599c.putAll(bundle);
            }
            this.f4611a.f4600d = ConnectionResult.f4498a;
            C0667h.m5189a(this.f4611a);
        } finally {
            this.f4611a.f4603g.unlock();
        }
    }

    public final void m5209a(ConnectionResult connectionResult) {
        this.f4611a.f4603g.lock();
        try {
            this.f4611a.f4600d = connectionResult;
            C0667h.m5189a(this.f4611a);
        } finally {
            this.f4611a.f4603g.unlock();
        }
    }
}
