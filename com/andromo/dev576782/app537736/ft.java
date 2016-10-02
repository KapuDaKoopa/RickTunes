package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum ft extends fr {
    ft(String str) {
        super(9, (byte) 0);
    }

    public final boolean m1476a() {
        return false;
    }

    public final boolean m1477a(gn gnVar) {
        return EnumSet.of(gn.IDLE, new gn[]{gn.INITIALIZED, gn.PREPARED, gn.STARTED, gn.PAUSED, gn.STOPPED, gn.PLAYBACK_COMPLETED}).contains(gnVar);
    }
}
