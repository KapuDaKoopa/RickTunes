package com.andromo.dev576782.app537736;

final class ht implements Runnable {
    final /* synthetic */ CharSequence f1079a;
    final /* synthetic */ SetRingtoneService f1080b;

    ht(SetRingtoneService setRingtoneService, CharSequence charSequence) {
        this.f1080b = setRingtoneService;
        this.f1079a = charSequence;
    }

    public final void run() {
        if (this.f1080b.f605b != null) {
            this.f1080b.f605b.setText(this.f1079a);
            this.f1080b.f605b.show();
        }
    }
}
