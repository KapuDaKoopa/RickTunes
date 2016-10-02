package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum fu extends fr {
    fu(String str) {
        super(10, (byte) 0);
    }

    public final boolean m1478a() {
        return false;
    }

    public final boolean m1479a(gn gnVar) {
        return EnumSet.of(gn.PREPARED, gn.STARTED, gn.PAUSED, gn.STOPPED, gn.PLAYBACK_COMPLETED).contains(gnVar);
    }
}
