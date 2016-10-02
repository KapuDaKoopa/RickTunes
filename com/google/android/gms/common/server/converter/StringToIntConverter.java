package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.C0754a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class StringToIntConverter implements SafeParcelable, C0754a {
    public static final C0756b CREATOR;
    private final int f4901a;
    private final HashMap f4902b;
    private final HashMap f4903c;
    private final ArrayList f4904d;

    public final class Entry implements SafeParcelable {
        public static final C0757c CREATOR;
        final int f4898a;
        final String f4899b;
        final int f4900c;

        static {
            CREATOR = new C0757c();
        }

        Entry(int i, String str, int i2) {
            this.f4898a = i;
            this.f4899b = str;
            this.f4900c = i2;
        }

        Entry(String str, int i) {
            this.f4898a = 1;
            this.f4899b = str;
            this.f4900c = i;
        }

        public final int describeContents() {
            C0757c c0757c = CREATOR;
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C0757c c0757c = CREATOR;
            C0757c.m5656a(this, parcel);
        }
    }

    static {
        CREATOR = new C0756b();
    }

    public StringToIntConverter() {
        this.f4901a = 1;
        this.f4902b = new HashMap();
        this.f4903c = new HashMap();
        this.f4904d = null;
    }

    StringToIntConverter(int i, ArrayList arrayList) {
        this.f4901a = i;
        this.f4902b = new HashMap();
        this.f4903c = new HashMap();
        this.f4904d = null;
        m5650a(arrayList);
    }

    private void m5650a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            String str = entry.f4899b;
            int i = entry.f4900c;
            this.f4902b.put(str, Integer.valueOf(i));
            this.f4903c.put(Integer.valueOf(i), str);
        }
    }

    final int m5651a() {
        return this.f4901a;
    }

    public final /* synthetic */ Object m5652a(Object obj) {
        String str = (String) this.f4903c.get((Integer) obj);
        return (str == null && this.f4902b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    final ArrayList m5653b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f4902b.keySet()) {
            arrayList.add(new Entry(str, ((Integer) this.f4902b.get(str)).intValue()));
        }
        return arrayList;
    }

    public final int describeContents() {
        C0756b c0756b = CREATOR;
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0756b c0756b = CREATOR;
        C0756b.m5655a(this, parcel);
    }
}
