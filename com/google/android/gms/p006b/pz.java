package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.C0382i;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.pz */
public final class pz {
    public final String f3921A;
    public final C0382i f3922B;
    public boolean f3923C;
    public boolean f3924D;
    public final AdRequestParcel f3925a;
    public final tf f3926b;
    public final List f3927c;
    public final int f3928d;
    public final List f3929e;
    public final List f3930f;
    public final int f3931g;
    public final long f3932h;
    public final String f3933i;
    public final JSONObject f3934j;
    public final boolean f3935k;
    public boolean f3936l;
    public final boolean f3937m;
    public final jo f3938n;
    public final kh f3939o;
    public final String f3940p;
    public final jp f3941q;
    public final jr f3942r;
    public final long f3943s;
    public final AdSizeParcel f3944t;
    public final long f3945u;
    public final RewardItemParcel f3946v;
    public final List f3947w;
    public final List f3948x;
    public final long f3949y;
    public final long f3950z;

    public pz(AdRequestParcel adRequestParcel, tf tfVar, List list, int i, List list2, List list3, int i2, long j, String str, boolean z, jo joVar, kh khVar, String str2, jp jpVar, jr jrVar, long j2, AdSizeParcel adSizeParcel, long j3, long j4, long j5, String str3, JSONObject jSONObject, C0382i c0382i, RewardItemParcel rewardItemParcel, List list4, List list5, boolean z2) {
        this.f3923C = false;
        this.f3924D = false;
        this.f3925a = adRequestParcel;
        this.f3926b = tfVar;
        this.f3927c = pz.m4352a(list);
        this.f3928d = i;
        this.f3929e = pz.m4352a(list2);
        this.f3930f = pz.m4352a(list3);
        this.f3931g = i2;
        this.f3932h = j;
        this.f3933i = str;
        this.f3937m = z;
        this.f3938n = joVar;
        this.f3939o = khVar;
        this.f3940p = str2;
        this.f3941q = jpVar;
        this.f3942r = jrVar;
        this.f3943s = j2;
        this.f3944t = adSizeParcel;
        this.f3945u = j3;
        this.f3949y = j4;
        this.f3950z = j5;
        this.f3921A = str3;
        this.f3934j = jSONObject;
        this.f3922B = c0382i;
        this.f3946v = rewardItemParcel;
        this.f3947w = pz.m4352a(list4);
        this.f3948x = pz.m4352a(list5);
        this.f3935k = z2;
    }

    public pz(qa qaVar) {
        this(qaVar.f3952a.f2324c, null, qaVar.f3953b.f2359d, qaVar.f3956e, qaVar.f3953b.f2361f, qaVar.f3953b.f2365j, qaVar.f3953b.f2367l, qaVar.f3953b.f2366k, qaVar.f3952a.f2330i, qaVar.f3953b.f2363h, null, null, null, qaVar.f3954c, null, qaVar.f3953b.f2364i, qaVar.f3955d, qaVar.f3953b.f2362g, qaVar.f3957f, qaVar.f3958g, qaVar.f3953b.f2370o, qaVar.f3959h, null, qaVar.f3953b.f2351D, qaVar.f3953b.f2352E, qaVar.f3953b.f2352E, qaVar.f3953b.f2354G);
    }

    private static List m4352a(List list) {
        return list == null ? null : Collections.unmodifiableList(list);
    }

    public final boolean m4353a() {
        return (this.f3926b == null || this.f3926b.m4579l() == null) ? false : this.f3926b.m4579l().m4616b();
    }
}
