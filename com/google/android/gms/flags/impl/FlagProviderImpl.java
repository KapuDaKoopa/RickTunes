package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.p006b.xu;
import com.google.android.gms.p006b.xw;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;

public class FlagProviderImpl extends xu {
    private boolean f4988a;
    private SharedPreferences f4989b;

    public FlagProviderImpl() {
        this.f4988a = false;
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return ((Boolean) xw.m4902a(new C0775c(this.f4989b, str, Boolean.valueOf(z)))).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        return ((Integer) xw.m4902a(new C0777e(this.f4989b, str, Integer.valueOf(i)))).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        return ((Long) xw.m4902a(new C0779g(this.f4989b, str, Long.valueOf(j)))).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        return (String) xw.m4902a(new C0781i(this.f4989b, str, str2));
    }

    public void init(C0314a c0314a) {
        Context context = (Context) C0317d.m1997a(c0314a);
        if (!this.f4988a) {
            try {
                this.f4989b = C0782j.m5746a(context.createPackageContext("com.google.android.gms", 0));
                this.f4988a = true;
            } catch (NameNotFoundException e) {
            }
        }
    }
}
