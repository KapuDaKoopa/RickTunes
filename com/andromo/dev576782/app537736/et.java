package com.andromo.dev576782.app537736;

final class et implements dz {
    boolean f874a;
    final /* synthetic */ FileDownloader f875b;
    private String f876c;
    private long f877d;

    et(FileDownloader fileDownloader, String str) {
        this.f875b = fileDownloader;
        this.f876c = str;
    }

    public final boolean m1401a(long j) {
        if (!this.f874a) {
            this.f875b.m1107a(this.f876c, j, this.f877d);
        }
        return this.f874a;
    }

    public final void m1402b(long j) {
        this.f877d += j;
    }
}
