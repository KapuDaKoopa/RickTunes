package com.andromo.dev576782.app537736;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

final class bd implements OnSeekBarChangeListener {
    final /* synthetic */ Audio98819 f740a;

    bd(Audio98819 audio98819) {
        this.f740a = audio98819;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z && this.f740a.f470v != null) {
            if (this.f740a.m849i()) {
                this.f740a.f470v.m1053a(i);
            }
            this.f740a.m831d(fi.m1436a(i));
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
