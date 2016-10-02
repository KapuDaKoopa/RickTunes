package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum fz extends fr {
    fz(String str) {
        super(15, (byte) 0);
    }

    public final boolean m1488a() {
        return true;
    }

    public final boolean m1489a(gn gnVar) {
        return EnumSet.of(gn.IDLE, new gn[]{gn.INITIALIZED, gn.PREPARED, gn.STARTED, gn.PAUSED, gn.STOPPED, gn.PLAYBACK_COMPLETED, gn.ERROR}).contains(gnVar);
    }
}
