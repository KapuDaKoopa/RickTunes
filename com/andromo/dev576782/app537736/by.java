package com.andromo.dev576782.app537736;

final class by implements dx {
    final /* synthetic */ String f771a;
    final /* synthetic */ String f772b;
    final /* synthetic */ AudioCacheService f773c;

    by(AudioCacheService audioCacheService, String str, String str2) {
        this.f773c = audioCacheService;
        this.f771a = str;
        this.f772b = str2;
    }

    public final void m1310a(boolean z) {
        if (z) {
            this.f773c.f492c.m893a(this.f771a, false);
            this.f773c.f492c.m891a(this.f771a, da.READY);
            this.f773c.m953c(this.f771a, this.f772b);
            return;
        }
        this.f773c.m956d(this.f771a, this.f773c.getString(2131231002, new Object[]{this.f772b}));
    }
}
