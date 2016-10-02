package com.andromo.dev576782.app537736;

public enum da {
    NONE,
    READY,
    QUEUED,
    STREAMING,
    DOWNLOADING,
    DOWNLOADED,
    PLAYING,
    PAUSED,
    STOPPED,
    CANCELLED,
    ERROR;
    
    private final String f837l;

    private da(String str) {
        this.f837l = str;
    }

    public String toString() {
        return this.f837l;
    }
}
