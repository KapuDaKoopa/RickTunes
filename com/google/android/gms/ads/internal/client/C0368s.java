package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.p006b.op;
import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.client.s */
public final class C0368s {
    public long f2013a;
    public Bundle f2014b;
    public int f2015c;
    public List f2016d;
    public boolean f2017e;
    public int f2018f;
    public boolean f2019g;
    public String f2020h;
    public SearchAdRequestParcel f2021i;
    public Location f2022j;
    public String f2023k;
    public Bundle f2024l;
    public Bundle f2025m;
    public List f2026n;
    public String f2027o;
    public String f2028p;
    public boolean f2029q;

    public C0368s() {
        this.f2013a = -1;
        this.f2014b = new Bundle();
        this.f2015c = -1;
        this.f2016d = new ArrayList();
        this.f2017e = false;
        this.f2018f = -1;
        this.f2019g = false;
        this.f2020h = null;
        this.f2021i = null;
        this.f2022j = null;
        this.f2023k = null;
        this.f2024l = new Bundle();
        this.f2025m = new Bundle();
        this.f2026n = new ArrayList();
        this.f2027o = null;
        this.f2028p = null;
        this.f2029q = false;
    }

    public C0368s(AdRequestParcel adRequestParcel) {
        this.f2013a = adRequestParcel.f1885b;
        this.f2014b = adRequestParcel.f1886c;
        this.f2015c = adRequestParcel.f1887d;
        this.f2016d = adRequestParcel.f1888e;
        this.f2017e = adRequestParcel.f1889f;
        this.f2018f = adRequestParcel.f1890g;
        this.f2019g = adRequestParcel.f1891h;
        this.f2020h = adRequestParcel.f1892i;
        this.f2021i = adRequestParcel.f1893j;
        this.f2022j = adRequestParcel.f1894k;
        this.f2023k = adRequestParcel.f1895l;
        this.f2024l = adRequestParcel.f1896m;
        this.f2025m = adRequestParcel.f1897n;
        this.f2026n = adRequestParcel.f1898o;
        this.f2027o = adRequestParcel.f1899p;
        this.f2028p = adRequestParcel.f1900q;
    }
}
