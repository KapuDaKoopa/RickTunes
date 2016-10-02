package com.andromo.dev576782.app537736;

import com.actionbarsherlock.internal.widget.IcsAdapterView;

final class bj implements hy {
    final /* synthetic */ AudioItem f749a;
    final /* synthetic */ Audio98819 f750b;

    bj(Audio98819 audio98819, AudioItem audioItem) {
        this.f750b = audio98819;
        this.f749a = audioItem;
    }

    public final void m1302a(hv hvVar) {
        this.f750b.m805a(this.f749a, hvVar);
    }

    public final void m1303a(String str, int i) {
        "onError: " + i + " for: " + str;
        switch (i) {
            case -3:
            case IcsAdapterView.ITEM_VIEW_TYPE_IGNORE /*-1*/:
                this.f750b.f444U = str;
            default:
        }
    }
}
