package com.andromo.dev576782.app537736;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.google.android.gms.C0772e;

public final class ca implements OnAudioFocusChangeListener {
    AudioManager f777a;
    cb f778b;

    public ca(Context context, cb cbVar) {
        this.f777a = (AudioManager) context.getSystemService("audio");
        this.f778b = cbVar;
    }

    public final boolean m1312a() {
        return 1 == this.f777a.abandonAudioFocus(this);
    }

    public final boolean m1313a(int i) {
        return 1 == this.f777a.requestAudioFocus(this, 3, i);
    }

    public final void onAudioFocusChange(int i) {
        if (this.f778b != null) {
            switch (i) {
                case -3:
                    this.f778b.m997a(true);
                case IcsAdapterView.ITEM_VIEW_TYPE_HEADER_OR_FOOTER /*-2*/:
                case IcsAdapterView.ITEM_VIEW_TYPE_IGNORE /*-1*/:
                    this.f778b.m997a(false);
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    this.f778b.m996a();
                default:
            }
        }
    }
}
