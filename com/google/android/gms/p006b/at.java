package com.google.android.gms.p006b;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@op
/* renamed from: com.google.android.gms.b.at */
public final class at implements au {
    public final Object f2928a;
    public final WeakHashMap f2929b;
    private final ArrayList f2930c;
    private final Context f2931d;
    private final VersionInfoParcel f2932e;
    private final il f2933f;

    public at(Context context, VersionInfoParcel versionInfoParcel, il ilVar) {
        this.f2928a = new Object();
        this.f2929b = new WeakHashMap();
        this.f2930c = new ArrayList();
        this.f2931d = context.getApplicationContext();
        this.f2932e = versionInfoParcel;
        this.f2933f = ilVar;
    }

    private boolean m3476d(pz pzVar) {
        boolean z;
        synchronized (this.f2928a) {
            ai aiVar = (ai) this.f2929b.get(pzVar);
            z = aiVar != null && aiVar.m3451e();
        }
        return z;
    }

    public final ai m3477a(AdSizeParcel adSizeParcel, pz pzVar) {
        return m3478a(adSizeParcel, pzVar, pzVar.f3926b.m4564b());
    }

    public final ai m3478a(AdSizeParcel adSizeParcel, pz pzVar, View view) {
        return m3479a(adSizeParcel, pzVar, new aq(view, pzVar), null);
    }

    public final ai m3479a(AdSizeParcel adSizeParcel, pz pzVar, bf bfVar, ji jiVar) {
        ai aiVar;
        synchronized (this.f2928a) {
            if (m3476d(pzVar)) {
                aiVar = (ai) this.f2929b.get(pzVar);
            } else {
                if (jiVar != null) {
                    aiVar = new av(this.f2931d, adSizeParcel, pzVar, this.f2932e, bfVar, jiVar);
                } else {
                    aiVar = new ay(this.f2931d, adSizeParcel, pzVar, this.f2932e, bfVar, this.f2933f);
                }
                aiVar.m3440a((au) this);
                this.f2929b.put(pzVar, aiVar);
                this.f2930c.add(aiVar);
            }
        }
        return aiVar;
    }

    public final void m3480a(ai aiVar) {
        synchronized (this.f2928a) {
            if (!aiVar.m3451e()) {
                this.f2930c.remove(aiVar);
                Iterator it = this.f2929b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == aiVar) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void m3481a(pz pzVar) {
        synchronized (this.f2928a) {
            ai aiVar = (ai) this.f2929b.get(pzVar);
            if (aiVar != null) {
                aiVar.m3449c();
            }
        }
    }

    public final void m3482b(pz pzVar) {
        synchronized (this.f2928a) {
            ai aiVar = (ai) this.f2929b.get(pzVar);
            if (aiVar != null) {
                aiVar.m3454h();
            }
        }
    }

    public final void m3483c(pz pzVar) {
        synchronized (this.f2928a) {
            ai aiVar = (ai) this.f2929b.get(pzVar);
            if (aiVar != null) {
                aiVar.m3455i();
            }
        }
    }
}
