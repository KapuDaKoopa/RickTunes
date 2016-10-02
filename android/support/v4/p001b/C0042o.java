package android.support.v4.p001b;

import java.io.PrintWriter;

/* renamed from: android.support.v4.b.o */
public final class C0042o {
    private static final Object f46a;
    private static char[] f47b;

    static {
        f46a = new Object();
        f47b = new char[24];
    }

    private static int m55a(char[] cArr, int i, char c, int i2, boolean z) {
        if (!z && i <= 0) {
            return i2;
        }
        int i3;
        int i4;
        if (i > 99) {
            i3 = i / 100;
            cArr[i2] = (char) (i3 + 48);
            i4 = i2 + 1;
            i3 = i - (i3 * 100);
        } else {
            i4 = i2;
            i3 = i;
        }
        if (i3 > 9 || i2 != i4) {
            int i5 = i3 / 10;
            cArr[i4] = (char) (i5 + 48);
            i4++;
            i3 -= i5 * 10;
        }
        cArr[i4] = (char) (i3 + 48);
        i4++;
        cArr[i4] = c;
        return i4 + 1;
    }

    public static void m56a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            C0042o.m58b(j - j2, printWriter);
        }
    }

    public static void m57a(long j, PrintWriter printWriter) {
        C0042o.m58b(j, printWriter);
    }

    private static void m58b(long j, PrintWriter printWriter) {
        boolean z = true;
        synchronized (f46a) {
            int a;
            if (f47b.length < 0) {
                f47b = new char[0];
            }
            char[] cArr = f47b;
            if (j == 0) {
                cArr[0] = '0';
            } else {
                char c;
                int i;
                int i2;
                int i3;
                int i4;
                if (j > 0) {
                    c = '+';
                } else {
                    j = -j;
                    c = '-';
                }
                int i5 = (int) (j % 1000);
                int floor = (int) Math.floor((double) (j / 1000));
                if (floor > 86400) {
                    i = floor / 86400;
                    floor -= 86400 * i;
                    i2 = i;
                } else {
                    i2 = 0;
                }
                if (floor > 3600) {
                    i = floor / 3600;
                    floor -= i * 3600;
                    i3 = i;
                } else {
                    i3 = 0;
                }
                if (floor > 60) {
                    i = floor / 60;
                    i4 = floor - (i * 60);
                    floor = i;
                } else {
                    i4 = floor;
                    floor = 0;
                }
                cArr[0] = c;
                i2 = C0042o.m55a(cArr, i2, 'd', 1, false);
                i3 = C0042o.m55a(cArr, i3, 'h', i2, i2 != 1);
                i = C0042o.m55a(cArr, floor, 'm', i3, i3 != 1);
                if (i == 1) {
                    z = false;
                }
                a = C0042o.m55a(cArr, i5, 'm', C0042o.m55a(cArr, i4, 's', i, z), true);
                cArr[a] = 's';
                a++;
            }
            printWriter.print(new String(f47b, 0, a));
        }
    }
}
