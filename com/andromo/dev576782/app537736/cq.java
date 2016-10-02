package com.andromo.dev576782.app537736;

import com.actionbarsherlock.internal.widget.IcsAdapterView;

final class cq implements hy {
    final /* synthetic */ AudioService f801a;

    cq(AudioService audioService) {
        this.f801a = audioService;
    }

    public final void m1332a(hv hvVar) {
        "SevenTask.Listener.onCompleted: " + hvVar.toString();
        if (hvVar == null || hvVar == hv.m1568a()) {
            this.f801a.m1035f(this.f801a.getString(2131231007));
        } else if (!hvVar.m1576i()) {
            this.f801a.m1035f(this.f801a.getString(2131231001));
        } else if (this.f801a.f554v) {
            this.f801a.m1035f(this.f801a.getString(2131231007));
        } else {
            this.f801a.f521B.postDelayed(this.f801a.f529R, 100);
            this.f801a.f537e.m1456a();
            this.f801a.f533a = ct.Stopped;
            this.f801a.f554v = true;
        }
        this.f801a.f557y = null;
    }

    public final void m1333a(String str, int i) {
        "onError: " + i + " for: " + str;
        switch (i) {
            case -3:
            case IcsAdapterView.ITEM_VIEW_TYPE_IGNORE /*-1*/:
                "setting mLastBad7Html to: " + str;
                this.f801a.f525N = str;
                this.f801a.m1084q();
            default:
        }
    }
}
