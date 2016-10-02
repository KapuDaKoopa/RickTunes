package com.google.android.gms.common.api.internal;

abstract class am {
    private final ak f4570a;

    protected am(ak akVar) {
        this.f4570a = akVar;
    }

    protected abstract void m5166a();

    public final void m5167a(al alVar) {
        alVar.f4555a.lock();
        try {
            if (alVar.f4565k == this.f4570a) {
                m5166a();
                alVar.f4555a.unlock();
            }
        } finally {
            alVar.f4555a.unlock();
        }
    }
}
