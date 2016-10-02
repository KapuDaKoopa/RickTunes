package com.andromo.dev576782.app537736;

import android.widget.ScrollView;

final class bq implements Runnable {
    final /* synthetic */ ScrollView f759a;
    final /* synthetic */ Audio98819 f760b;

    bq(Audio98819 audio98819, ScrollView scrollView) {
        this.f760b = audio98819;
        this.f759a = scrollView;
    }

    public final void run() {
        this.f759a.scrollTo(0, this.f760b.f435L);
    }
}
