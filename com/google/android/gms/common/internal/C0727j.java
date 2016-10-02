package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.p006b.yf;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.j */
public final class C0727j {
    public final Account f4840a;
    public final Set f4841b;
    public final Set f4842c;
    public final Map f4843d;
    public final String f4844e;
    final String f4845f;
    public final yf f4846g;
    public Integer f4847h;
    private final int f4848i;
    private final View f4849j;

    public C0727j(Account account, Set set, Map map, int i, View view, String str, String str2, yf yfVar) {
        this.f4840a = account;
        this.f4841b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f4843d = map;
        this.f4849j = view;
        this.f4848i = i;
        this.f4844e = str;
        this.f4845f = str2;
        this.f4846g = yfVar;
        Set hashSet = new HashSet(this.f4841b);
        for (C0728k c0728k : this.f4843d.values()) {
            hashSet.addAll(c0728k.f4850a);
        }
        this.f4842c = Collections.unmodifiableSet(hashSet);
    }
}
