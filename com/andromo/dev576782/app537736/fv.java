package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum fv extends fr {
    fv(String str) {
        super(11, (byte) 0);
    }

    public final boolean m1480a() {
        return true;
    }

    public final boolean m1481a(gn gnVar) {
        return EnumSet.of(gn.IDLE, new gn[]{gn.INITIALIZED, gn.PREPARED, gn.STARTED, gn.PAUSED, gn.STOPPED, gn.PLAYBACK_COMPLETED}).contains(gnVar);
    }
}
