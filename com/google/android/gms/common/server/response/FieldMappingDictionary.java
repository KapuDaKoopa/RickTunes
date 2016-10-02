package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FieldMappingDictionary implements SafeParcelable {
    public static final C0760d CREATOR;
    private final int f4922a;
    private final HashMap f4923b;
    private final ArrayList f4924c;
    private final String f4925d;

    public class Entry implements SafeParcelable {
        public static final C0761e CREATOR;
        final int f4916a;
        final String f4917b;
        final ArrayList f4918c;

        static {
            CREATOR = new C0761e();
        }

        Entry(int i, String str, ArrayList arrayList) {
            this.f4916a = i;
            this.f4917b = str;
            this.f4918c = arrayList;
        }

        Entry(String str, Map map) {
            this.f4916a = 1;
            this.f4917b = str;
            this.f4918c = m5679a(map);
        }

        private static ArrayList m5679a(Map map) {
            if (map == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                arrayList.add(new FieldMapPair(str, (Field) map.get(str)));
            }
            return arrayList;
        }

        final HashMap m5680a() {
            HashMap hashMap = new HashMap();
            int size = this.f4918c.size();
            for (int i = 0; i < size; i++) {
                FieldMapPair fieldMapPair = (FieldMapPair) this.f4918c.get(i);
                hashMap.put(fieldMapPair.f4920b, fieldMapPair.f4921c);
            }
            return hashMap;
        }

        public int describeContents() {
            C0761e c0761e = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0761e c0761e = CREATOR;
            C0761e.m5701a(this, parcel);
        }
    }

    public class FieldMapPair implements SafeParcelable {
        public static final C0759c CREATOR;
        final int f4919a;
        final String f4920b;
        final Field f4921c;

        static {
            CREATOR = new C0759c();
        }

        FieldMapPair(int i, String str, Field field) {
            this.f4919a = i;
            this.f4920b = str;
            this.f4921c = field;
        }

        FieldMapPair(String str, Field field) {
            this.f4919a = 1;
            this.f4920b = str;
            this.f4921c = field;
        }

        public int describeContents() {
            C0759c c0759c = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0759c c0759c = CREATOR;
            C0759c.m5699a(this, parcel, i);
        }
    }

    static {
        CREATOR = new C0760d();
    }

    FieldMappingDictionary(int i, ArrayList arrayList, String str) {
        this.f4922a = i;
        this.f4924c = null;
        this.f4923b = m5681a(arrayList);
        this.f4925d = (String) ax.m5527a((Object) str);
        m5682d();
    }

    private static HashMap m5681a(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Entry entry = (Entry) arrayList.get(i);
            hashMap.put(entry.f4917b, entry.m5680a());
        }
        return hashMap;
    }

    private void m5682d() {
        for (String str : this.f4923b.keySet()) {
            Map map = (Map) this.f4923b.get(str);
            for (String str2 : map.keySet()) {
                ((Field) map.get(str2)).m5660a(this);
            }
        }
    }

    final int m5683a() {
        return this.f4922a;
    }

    public final Map m5684a(String str) {
        return (Map) this.f4923b.get(str);
    }

    final ArrayList m5685b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f4923b.keySet()) {
            arrayList.add(new Entry(str, (Map) this.f4923b.get(str)));
        }
        return arrayList;
    }

    public final String m5686c() {
        return this.f4925d;
    }

    public int describeContents() {
        C0760d c0760d = CREATOR;
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f4923b.keySet()) {
            stringBuilder.append(str).append(":\n");
            Map map = (Map) this.f4923b.get(str);
            for (String str2 : map.keySet()) {
                stringBuilder.append("  ").append(str2).append(": ");
                stringBuilder.append(map.get(str2));
            }
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0760d c0760d = CREATOR;
        C0760d.m5700a(this, parcel);
    }
}
