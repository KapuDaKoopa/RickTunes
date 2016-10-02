package com.google.analytics.tracking.android;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class ag {
    final Map f1505a;
    final long f1506b;
    final String f1507c;
    final List f1508d;

    public ag(Map map, long j, String str, List list) {
        this.f1505a = map;
        this.f1506b = j;
        this.f1507c = str;
        this.f1508d = list;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PATH: ");
        stringBuilder.append(this.f1507c);
        if (this.f1505a != null) {
            stringBuilder.append("  PARAMS: ");
            for (Entry entry : this.f1505a.entrySet()) {
                stringBuilder.append((String) entry.getKey());
                stringBuilder.append("=");
                stringBuilder.append((String) entry.getValue());
                stringBuilder.append(",  ");
            }
        }
        return stringBuilder.toString();
    }
}
