package com.andromo.dev576782.app537736;

import java.lang.ref.SoftReference;
import java.util.HashMap;

final class dv extends ThreadLocal {
    dv() {
    }

    protected final /* synthetic */ Object initialValue() {
        return new SoftReference(new HashMap());
    }
}
