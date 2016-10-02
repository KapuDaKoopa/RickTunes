package com.google.android.gms.p006b;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.C0491a;
import com.google.android.gms.p017a.C0314a;
import java.util.List;

/* renamed from: com.google.android.gms.b.kh */
public interface kh extends IInterface {
    C0314a m3964a();

    void m3965a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, C0491a c0491a, String str2);

    void m3966a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, kk kkVar);

    void m3967a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar);

    void m3968a(C0314a c0314a, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar, NativeAdOptionsParcel nativeAdOptionsParcel, List list);

    void m3969a(C0314a c0314a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, kk kkVar);

    void m3970a(C0314a c0314a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, kk kkVar);

    void m3971a(AdRequestParcel adRequestParcel, String str);

    void m3972a(AdRequestParcel adRequestParcel, String str, String str2);

    void m3973b();

    void m3974c();

    void m3975d();

    void m3976e();

    void m3977f();

    boolean m3978g();

    kr m3979h();

    ku m3980i();

    Bundle m3981j();

    Bundle m3982k();

    Bundle m3983l();
}
