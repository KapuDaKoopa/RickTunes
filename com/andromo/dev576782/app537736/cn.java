package com.andromo.dev576782.app537736;

final class cn implements ex {
    final /* synthetic */ AudioService f798a;

    cn(AudioService audioService) {
        this.f798a = audioService;
    }

    public final void m1330a(String str, String str2) {
        long j = 10000;
        boolean a = gr.m1517a(this.f798a);
        long M = a ? AudioService.f514H : AudioService.f516J;
        if (M >= 10000) {
            j = M;
        }
        if (str == null || "".equals(str) || "unspecified".equalsIgnoreCase(str)) {
            if (!(str2 == null || "".equals(str2) || "unspecified".equalsIgnoreCase(str2) || (this.f798a.f549q != null && str2.equals(this.f798a.f549q.m986c())))) {
                AudioService audioService = this.f798a;
                cd cdVar = new cd(this.f798a.f549q);
                cdVar.f780b = str2;
                audioService.f549q = cdVar.m1314a();
                this.f798a.m1068c(this.f798a.m1090w());
                this.f798a.m1051J();
            }
            AudioService.m1031e(this.f798a);
            j = a ? AudioService.f515I : AudioService.f517K;
            if (j > 60000) {
                j = 60000;
            }
        } else {
            if (this.f798a.f549q == null || !str.equals(this.f798a.f549q.m986c())) {
                AudioService audioService2 = this.f798a;
                cd cdVar2 = new cd(this.f798a.f549q);
                cdVar2.f780b = str;
                audioService2.f549q = cdVar2.m1314a();
                this.f798a.m1068c(this.f798a.m1090w());
                this.f798a.m1051J();
            }
            this.f798a.f524E = 0;
        }
        this.f798a.m1083p();
        if (this.f798a.f524E < (a ? AudioService.f512F : AudioService.f513G)) {
            this.f798a.m1064b(this.f798a.f549q.m985b(), j);
        }
        this.f798a.f555w = null;
    }
}
