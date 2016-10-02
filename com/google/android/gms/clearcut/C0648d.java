package com.google.android.gms.clearcut;

import com.google.android.gms.p006b.za;
import java.util.ArrayList;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.clearcut.d */
public final class C0648d {
    public int f4487a;
    public String f4488b;
    public String f4489c;
    public String f4490d;
    public int f4491e;
    public final C0649e f4492f;
    public C0649e f4493g;
    public ArrayList f4494h;
    public final za f4495i;
    public boolean f4496j;
    public final /* synthetic */ C0646b f4497k;

    private C0648d(C0646b c0646b, byte[] bArr) {
        this(c0646b, bArr, (byte) 0);
    }

    private C0648d(C0646b c0646b, byte[] bArr, byte b) {
        this.f4497k = c0646b;
        this.f4487a = this.f4497k.f4478i;
        this.f4488b = this.f4497k.f4477h;
        this.f4489c = this.f4497k.f4479j;
        this.f4490d = this.f4497k.f4480k;
        this.f4491e = this.f4497k.f4482m;
        this.f4494h = null;
        this.f4495i = new za();
        this.f4496j = false;
        this.f4489c = c0646b.f4479j;
        this.f4490d = c0646b.f4480k;
        this.f4495i.f4412b = c0646b.f4484o.m4887a();
        this.f4495i.f4413c = c0646b.f4484o.m4888b();
        za zaVar = this.f4495i;
        c0646b.f4485p;
        zaVar.f4431u = (long) C0645a.m5032a(c0646b.f4474e);
        zaVar = this.f4495i;
        c0646b.f4486q;
        zaVar.f4426p = (long) (TimeZone.getDefault().getOffset(this.f4495i.f4412b) / 1000);
        if (bArr != null) {
            this.f4495i.f4421k = bArr;
        }
        this.f4492f = null;
    }
}
