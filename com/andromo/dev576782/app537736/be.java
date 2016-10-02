package com.andromo.dev576782.app537736;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class be implements ServiceConnection {
    final /* synthetic */ Audio98819 f741a;

    be(Audio98819 audio98819) {
        this.f741a = audio98819;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f741a.f470v = (AudioService) ((ff) iBinder).m1429a();
        this.f741a.f468t = true;
        this.f741a.m861n();
        Audio98819 audio98819 = this.f741a;
        false;
        if (this.f741a.f470v.m1088u() == ct.Paused) {
            Audio98819.m864o(this.f741a);
        }
        if (!(this.f741a.f456h == null || this.f741a.f470v == null)) {
            Playlist t = this.f741a.f470v.m1087t();
            AudioService c;
            if (t == null || t.m1151c() == 0) {
                this.f741a.f470v.m1055a(this.f741a.f456h);
                this.f741a.f470v.m1061b();
                c = this.f741a.f470v;
                Audio98819 audio988192 = this.f741a;
                c.m1069c(false);
            } else if (this.f741a.f456h.m1146a(t)) {
                this.f741a.f456h = t;
                this.f741a.f470v.m1061b();
                c = this.f741a.f470v;
                Audio98819 audio988193 = this.f741a;
                c.m1069c(false);
                audio98819 = this.f741a;
                false;
                bs bsVar = (bs) this.f741a.getListAdapter();
                if (bsVar != null) {
                    bsVar.m1306a(t);
                }
            }
            audio98819 = this.f741a;
            false;
            if (this.f741a.f446X) {
                this.f741a.m816b(0);
                this.f741a.f446X = false;
            }
        }
        Audio98819.m867r(this.f741a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f741a.f468t = false;
    }
}
