package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import com.google.android.gms.ads.purchase.C0522a;

public final class AdView extends BaseAdView {
    public AdView(Context context) {
        super(context);
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 1);
    }

    public final /* bridge */ /* synthetic */ void m2006a() {
        super.m2002a();
    }

    @RequiresPermission("android.permission.INTERNET")
    public final /* bridge */ /* synthetic */ void m2007a(C0328d c0328d) {
        super.m2003a(c0328d);
    }

    public final /* bridge */ /* synthetic */ void m2008b() {
        super.m2004b();
    }

    public final /* bridge */ /* synthetic */ void m2009c() {
        super.m2005c();
    }

    public final /* bridge */ /* synthetic */ C0259a getAdListener() {
        return super.getAdListener();
    }

    public final /* bridge */ /* synthetic */ C0333f getAdSize() {
        return super.getAdSize();
    }

    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    public final /* bridge */ /* synthetic */ C0522a getInAppPurchaseListener() {
        return super.getInAppPurchaseListener();
    }

    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public final /* bridge */ /* synthetic */ void setAdListener(C0259a c0259a) {
        super.setAdListener(c0259a);
    }

    public final /* bridge */ /* synthetic */ void setAdSize(C0333f c0333f) {
        super.setAdSize(c0333f);
    }

    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    public final /* bridge */ /* synthetic */ void setInAppPurchaseListener(C0522a c0522a) {
        super.setInAppPurchaseListener(c0522a);
    }
}
