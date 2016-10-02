package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum fw extends fr {
    fw(String str) {
        super(12, (byte) 0);
    }

    public final boolean m1482a() {
        return true;
    }

    public final boolean m1483a(gn gnVar) {
        return EnumSet.of(gn.IDLE, new gn[]{gn.INITIALIZED, gn.PREPARED, gn.STARTED, gn.PAUSED, gn.STOPPED, gn.PLAYBACK_COMPLETED}).contains(gnVar);
    }
}
