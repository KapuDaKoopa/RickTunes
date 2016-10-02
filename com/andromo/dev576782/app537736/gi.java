package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum gi extends fr {
    gi(String str) {
        super(8, (byte) 0);
    }

    public final boolean m1506a() {
        return false;
    }

    public final boolean m1507a(gn gnVar) {
        return EnumSet.of(gn.IDLE, new gn[]{gn.INITIALIZED, gn.PREPARED, gn.STARTED, gn.PAUSED, gn.STOPPED, gn.PLAYBACK_COMPLETED}).contains(gnVar);
    }
}
