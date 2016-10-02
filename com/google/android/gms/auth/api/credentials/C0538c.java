package com.google.android.gms.auth.api.credentials;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
public final class C0538c {
    private final TreeSet f2697a;
    private final List f2698b;
    private final List f2699c;
    private int f2700d;
    private int f2701e;

    public C0538c() {
        this.f2697a = new TreeSet();
        this.f2698b = new ArrayList();
        this.f2699c = new ArrayList();
        this.f2700d = 12;
        this.f2701e = 16;
    }

    private static TreeSet m3171a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new C0539d(str2 + " cannot be null or empty");
        }
        TreeSet treeSet = new TreeSet();
        for (int i : str.toCharArray()) {
            if (PasswordSpecification.m3168a(i)) {
                throw new C0539d(str2 + " must only contain ASCII printable characters");
            }
            treeSet.add(Character.valueOf(i));
        }
        return treeSet;
    }

    public final C0538c m3172a() {
        this.f2700d = 12;
        this.f2701e = 16;
        return this;
    }

    public final C0538c m3173a(String str) {
        this.f2697a.addAll(C0538c.m3171a(str, "allowedChars"));
        return this;
    }

    public final PasswordSpecification m3174b() {
        if (this.f2697a.isEmpty()) {
            throw new C0539d("no allowed characters specified");
        }
        int i = 0;
        for (Integer intValue : this.f2699c) {
            i = intValue.intValue() + i;
        }
        if (i > this.f2701e) {
            throw new C0539d("required character count cannot be greater than the max password size");
        }
        boolean[] zArr = new boolean[95];
        for (String toCharArray : this.f2698b) {
            for (char c : toCharArray.toCharArray()) {
                if (zArr[c - 32]) {
                    throw new C0539d("character " + c + " occurs in more than one required character set");
                }
                zArr[c - 32] = true;
            }
        }
        return new PasswordSpecification(1, PasswordSpecification.m3167a(this.f2697a), this.f2698b, this.f2699c, this.f2700d, this.f2701e);
    }

    public final C0538c m3175b(String str) {
        this.f2698b.add(PasswordSpecification.m3167a(C0538c.m3171a(str, "requiredChars")));
        this.f2699c.add(Integer.valueOf(1));
        return this;
    }
}
