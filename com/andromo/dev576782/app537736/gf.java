package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum gf extends fr {
    gf(String str) {
        super(5, (byte) 0);
    }

    public final boolean m1500a() {
        return true;
    }

    public final boolean m1501a(gn gnVar) {
        return EnumSet.of(gn.PREPARED, gn.STARTED, gn.PAUSED, gn.STOPPED, gn.PLAYBACK_COMPLETED).contains(gnVar);
    }
}
