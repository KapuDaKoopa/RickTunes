package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.actionbarsherlock.view.Menu;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.c */
public final class C0738c {
    public static int m5590a(Parcel parcel, int i) {
        parcel.writeInt(Menu.CATEGORY_MASK | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m5591a(Parcel parcel, int i, float f) {
        C0738c.m5592a(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void m5592a(Parcel parcel, int i, int i2) {
        if (i2 >= Menu.USER_MASK) {
            parcel.writeInt(Menu.CATEGORY_MASK | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static void m5593a(Parcel parcel, int i, long j) {
        C0738c.m5592a(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void m5594a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int a = C0738c.m5590a(parcel, i);
            parcel.writeBundle(bundle);
            C0738c.m5605b(parcel, a);
        }
    }

    public static void m5595a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = C0738c.m5590a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            C0738c.m5605b(parcel, a);
        }
    }

    public static void m5596a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int a = C0738c.m5590a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            C0738c.m5605b(parcel, a);
        }
    }

    public static void m5597a(Parcel parcel, int i, Integer num) {
        if (num != null) {
            C0738c.m5592a(parcel, i, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void m5598a(Parcel parcel, int i, String str) {
        if (str != null) {
            int a = C0738c.m5590a(parcel, i);
            parcel.writeString(str);
            C0738c.m5605b(parcel, a);
        }
    }

    public static void m5599a(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = C0738c.m5590a(parcel, i);
            parcel.writeStringList(list);
            C0738c.m5605b(parcel, a);
        }
    }

    public static void m5600a(Parcel parcel, int i, boolean z) {
        C0738c.m5592a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void m5601a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int a = C0738c.m5590a(parcel, i);
            parcel.writeByteArray(bArr);
            C0738c.m5605b(parcel, a);
        }
    }

    public static void m5602a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int a = C0738c.m5590a(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C0738c.m5604a(parcel, parcelable, i2);
                }
            }
            C0738c.m5605b(parcel, a);
        }
    }

    public static void m5603a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int a = C0738c.m5590a(parcel, i);
            parcel.writeStringArray(strArr);
            C0738c.m5605b(parcel, a);
        }
    }

    private static void m5604a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void m5605b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void m5606b(Parcel parcel, int i, int i2) {
        C0738c.m5592a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m5607b(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = C0738c.m5590a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C0738c.m5604a(parcel, parcelable, 0);
                }
            }
            C0738c.m5605b(parcel, a);
        }
    }
}
