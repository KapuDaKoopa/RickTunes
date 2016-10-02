package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum fx extends fr {
    fx(String str) {
        super(13, (byte) 0);
    }

    public final boolean m1484a() {
        return true;
    }

    public final boolean m1485a(gn gnVar) {
        return EnumSet.of(gn.IDLE, new gn[]{gn.INITIALIZED, gn.PREPARED, gn.STARTED, gn.PAUSED, gn.STOPPED, gn.PLAYBACK_COMPLETED}).contains(gnVar);
    }
}
