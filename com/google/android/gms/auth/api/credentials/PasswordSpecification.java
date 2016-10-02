package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class PasswordSpecification implements SafeParcelable {
    public static final C0556j CREATOR;
    public static final PasswordSpecification f2684a;
    public static final PasswordSpecification f2685b;
    final int f2686c;
    final String f2687d;
    final List f2688e;
    final List f2689f;
    final int f2690g;
    final int f2691h;
    private final int[] f2692i;
    private final Random f2693j;

    static {
        CREATOR = new C0556j();
        f2684a = new C0538c().m3172a().m3173a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").m3175b("abcdefghijkmnopqrstxyz").m3175b("ABCDEFGHJKLMNPQRSTXY").m3175b("3456789").m3174b();
        f2685b = new C0538c().m3172a().m3173a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").m3175b("abcdefghijklmnopqrstuvwxyz").m3175b("ABCDEFGHIJKLMNOPQRSTUVWXYZ").m3175b("1234567890").m3174b();
    }

    PasswordSpecification(int i, String str, List list, List list2, int i2, int i3) {
        this.f2686c = i;
        this.f2687d = str;
        this.f2688e = Collections.unmodifiableList(list);
        this.f2689f = Collections.unmodifiableList(list2);
        this.f2690g = i2;
        this.f2691h = i3;
        this.f2692i = m3169a();
        this.f2693j = new SecureRandom();
    }

    static /* synthetic */ String m3167a(Collection collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character charValue : collection) {
            int i2 = i + 1;
            cArr[i] = charValue.charValue();
            i = i2;
        }
        return new String(cArr);
    }

    static /* synthetic */ boolean m3168a(int i) {
        return i < 32 || i > 126;
    }

    private int[] m3169a() {
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        int i = 0;
        for (String toCharArray : this.f2688e) {
            for (char c : toCharArray.toCharArray()) {
                iArr[c - 32] = i;
            }
            i++;
        }
        return iArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0556j.m3208a(this, parcel);
    }
}
