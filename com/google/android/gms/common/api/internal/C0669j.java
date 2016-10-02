package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.j */
final class C0669j implements ar {
    final /* synthetic */ C0667h f4612a;

    C0669j(C0667h c0667h) {
        this.f4612a = c0667h;
    }

    public final void m5210a(int i, boolean z) {
        this.f4612a.f4603g.lock();
        try {
            if (this.f4612a.f4602f) {
                this.f4612a.f4602f = false;
                C0667h.m5190a(this.f4612a, i, z);
                return;
            }
            this.f4612a.f4602f = true;
            this.f4612a.f4597a.m5155a(i);
            this.f4612a.f4603g.unlock();
        } finally {
            this.f4612a.f4603g.unlock();
        }
    }

    public final void m5211a(Bundle bundle) {
        this.f4612a.f4603g.lock();
        try {
            this.f4612a.f4601e = ConnectionResult.f4498a;
            C0667h.m5189a(this.f4612a);
        } finally {
            this.f4612a.f4603g.unlock();
        }
    }

    public final void m5212a(ConnectionResult connectionResult) {
        this.f4612a.f4603g.lock();
        try {
            this.f4612a.f4601e = connectionResult;
            C0667h.m5189a(this.f4612a);
        } finally {
            this.f4612a.f4603g.unlock();
        }
    }
}
