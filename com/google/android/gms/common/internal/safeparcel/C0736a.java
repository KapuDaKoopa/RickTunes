package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public final class C0736a {
    public static int m5564a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = C0736a.m5565a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((Menu.USER_MASK & readInt) != 20293) {
            throw new C0737b("Expected object header. Got 0x" + Integer.toHexString(readInt), parcel);
        }
        readInt = dataPosition + a;
        if (readInt >= dataPosition && readInt <= parcel.dataSize()) {
            return readInt;
        }
        throw new C0737b("Size read is invalid start=" + dataPosition + " end=" + readInt, parcel);
    }

    public static int m5565a(Parcel parcel, int i) {
        return (i & Menu.CATEGORY_MASK) != Menu.CATEGORY_MASK ? (i >> 16) & Menu.USER_MASK : parcel.readInt();
    }

    public static Parcelable m5566a(Parcel parcel, int i, Creator creator) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    public static void m5567a(Parcel parcel, int i, int i2) {
        if (i != i2) {
            throw new C0737b("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
        }
    }

    public static void m5568b(Parcel parcel, int i) {
        parcel.setDataPosition(C0736a.m5565a(parcel, i) + parcel.dataPosition());
    }

    private static void m5569b(Parcel parcel, int i, int i2) {
        int a = C0736a.m5565a(parcel, i);
        if (a != i2) {
            throw new C0737b("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    public static Object[] m5570b(Parcel parcel, int i, Creator creator) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static ArrayList m5571c(Parcel parcel, int i, Creator creator) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static boolean m5572c(Parcel parcel, int i) {
        C0736a.m5569b(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int m5573d(Parcel parcel, int i) {
        C0736a.m5569b(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer m5574e(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        if (a == 0) {
            return null;
        }
        C0736a.m5567a(parcel, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long m5575f(Parcel parcel, int i) {
        C0736a.m5569b(parcel, i, 8);
        return parcel.readLong();
    }

    public static BigInteger m5576g(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return new BigInteger(createByteArray);
    }

    public static float m5577h(Parcel parcel, int i) {
        C0736a.m5569b(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double m5578i(Parcel parcel, int i) {
        C0736a.m5569b(parcel, i, 8);
        return parcel.readDouble();
    }

    public static BigDecimal m5579j(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(a + dataPosition);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static String m5580k(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder m5581l(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle m5582m(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] m5583n(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static int[] m5584o(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    public static BigDecimal[] m5585p(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    public static String[] m5586q(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList m5587r(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static Parcel m5588s(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(a + dataPosition);
        return obtain;
    }

    public static Parcel[] m5589t(Parcel parcel, int i) {
        int a = C0736a.m5565a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(readInt2 + dataPosition2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }
}
