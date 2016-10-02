package com.andromo.dev576782.app537736;

import com.actionbarsherlock.internal.widget.IcsAdapterView;

final class cm implements hy {
    final /* synthetic */ AudioService f797a;

    cm(AudioService audioService) {
        this.f797a = audioService;
    }

    public final void m1327a(hv hvVar) {
        this.f797a.m1084q();
        if (!(hvVar == null || hvVar == hv.m1568a())) {
            String h = hvVar.m1575h();
            if (!(h == null || "".equals(h))) {
                if (this.f797a.f549q == null || !h.equals(this.f797a.f549q.m986c())) {
                    AudioService audioService = this.f797a;
                    cd cdVar = new cd(this.f797a.f549q);
                    cdVar.f780b = h;
                    audioService.f549q = cdVar.m1314a();
                    this.f797a.m1068c(this.f797a.m1090w());
                    this.f797a.m1051J();
                }
                this.f797a.f557y = null;
                if (this.f797a.m1033e(this.f797a.f549q.m985b())) {
                    this.f797a.m1059a(this.f797a.f549q.m985b(), gr.m1517a(this.f797a) ? AudioService.f518L : AudioService.f519M);
                    return;
                }
                return;
            }
        }
        if (this.f797a.f557y != null) {
            this.f797a.m1063b(this.f797a.f557y.m1580a());
            this.f797a.f557y = null;
        }
    }

    public final void m1328a(String str, int i) {
        "onError: " + i + " for: " + str;
        switch (i) {
            case -3:
            case IcsAdapterView.ITEM_VIEW_TYPE_IGNORE /*-1*/:
                "setting mLastBad7Html to: " + str;
                this.f797a.f525N = str;
                this.f797a.m1084q();
            default:
        }
    }
}
