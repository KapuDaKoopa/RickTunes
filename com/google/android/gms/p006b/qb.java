package com.google.android.gms.p006b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@op
/* renamed from: com.google.android.gms.b.qb */
public final class qb {
    public final qd f3960a;
    public final LinkedList f3961b;
    public final Object f3962c;
    public long f3963d;
    public long f3964e;
    public boolean f3965f;
    public long f3966g;
    public long f3967h;
    public long f3968i;
    public long f3969j;
    private final String f3970k;
    private final String f3971l;

    private qb(qd qdVar, String str, String str2) {
        this.f3962c = new Object();
        this.f3963d = -1;
        this.f3964e = -1;
        this.f3965f = false;
        this.f3966g = -1;
        this.f3967h = 0;
        this.f3968i = -1;
        this.f3969j = -1;
        this.f3960a = qdVar;
        this.f3970k = str;
        this.f3971l = str2;
        this.f3961b = new LinkedList();
    }

    public qb(String str, String str2) {
        this(ar.m2243h(), str, str2);
    }

    public final Bundle m4355a() {
        Bundle bundle;
        synchronized (this.f3962c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f3970k);
            bundle.putString("slotid", this.f3971l);
            bundle.putBoolean("ismediation", this.f3965f);
            bundle.putLong("treq", this.f3968i);
            bundle.putLong("tresponse", this.f3969j);
            bundle.putLong("timp", this.f3964e);
            bundle.putLong("tload", this.f3966g);
            bundle.putLong("pcc", this.f3967h);
            bundle.putLong("tfetch", this.f3963d);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f3961b.iterator();
            while (it.hasNext()) {
                qc qcVar = (qc) it.next();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("topen", qcVar.f3972a);
                bundle2.putLong("tclose", qcVar.f3973b);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
