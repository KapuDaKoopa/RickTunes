package com.google.analytics.tracking.android;

import java.util.SortedSet;
import java.util.TreeSet;

final class an {
    private static final an f1524d;
    private SortedSet f1525a;
    private StringBuilder f1526b;
    private boolean f1527c;

    static {
        f1524d = new an();
    }

    private an() {
        this.f1525a = new TreeSet();
        this.f1526b = new StringBuilder();
        this.f1527c = false;
    }

    public static an m1810a() {
        return f1524d;
    }

    public final synchronized void m1811a(ao aoVar) {
        if (!this.f1527c) {
            this.f1525a.add(aoVar);
            this.f1526b.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(aoVar.ordinal()));
        }
    }

    public final synchronized void m1812a(boolean z) {
        this.f1527c = z;
    }

    public final synchronized String m1813b() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        int i = 6;
        int i2 = 0;
        while (this.f1525a.size() > 0) {
            ao aoVar = (ao) this.f1525a.first();
            this.f1525a.remove(aoVar);
            int ordinal = aoVar.ordinal();
            while (ordinal >= i) {
                stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i2));
                i += 6;
                i2 = 0;
            }
            i2 += 1 << (aoVar.ordinal() % 6);
        }
        if (i2 > 0 || stringBuilder.length() == 0) {
            stringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i2));
        }
        this.f1525a.clear();
        return stringBuilder.toString();
    }

    public final synchronized String m1814c() {
        String stringBuilder;
        if (this.f1526b.length() > 0) {
            this.f1526b.insert(0, ".");
        }
        stringBuilder = this.f1526b.toString();
        this.f1526b = new StringBuilder();
        return stringBuilder;
    }
}
