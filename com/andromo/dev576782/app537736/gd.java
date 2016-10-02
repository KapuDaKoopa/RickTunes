package com.andromo.dev576782.app537736;

import java.util.EnumSet;

enum gd extends fr {
    gd(String str) {
        super(3, (byte) 0);
    }

    public final boolean m1496a() {
        return true;
    }

    public final boolean m1497a(gn gnVar) {
        return EnumSet.of(gn.PREPARED, gn.STARTED, gn.PAUSED, gn.PLAYBACK_COMPLETED).contains(gnVar);
    }
}
