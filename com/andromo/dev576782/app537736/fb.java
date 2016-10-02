package com.andromo.dev576782.app537736;

public enum fb {
    GOOGLE_PLAY(0),
    AMAZON_APP_STORE(1),
    SAMSUNG_APP_STORE(2);
    
    private final int f895d;

    private fb(int i) {
        this.f895d = i;
    }

    public static fb m1420a() {
        return GOOGLE_PLAY.f895d == 0 ? GOOGLE_PLAY : AMAZON_APP_STORE.f895d == 0 ? AMAZON_APP_STORE : SAMSUNG_APP_STORE.f895d == 0 ? SAMSUNG_APP_STORE : GOOGLE_PLAY;
    }
}
