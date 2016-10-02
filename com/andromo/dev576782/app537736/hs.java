package com.andromo.dev576782.app537736;

final class hs implements Runnable {
    final /* synthetic */ CharSequence f1077a;
    final /* synthetic */ SetRingtoneService f1078b;

    hs(SetRingtoneService setRingtoneService, CharSequence charSequence) {
        this.f1078b = setRingtoneService;
        this.f1077a = charSequence;
    }

    public final void run() {
        if (this.f1078b.f605b != null) {
            this.f1078b.f605b.setText(this.f1077a);
            this.f1078b.f605b.show();
        }
    }
}
