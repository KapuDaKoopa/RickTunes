package com.google.android.gms.p006b;

import android.support.v4.app.NotificationCompat;
import com.actionbarsherlock.view.Menu;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.b.yl */
public final class yl {
    final ByteBuffer f4376a;

    private yl(ByteBuffer byteBuffer) {
        this.f4376a = byteBuffer;
        this.f4376a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private yl(byte[] bArr, int i) {
        this(ByteBuffer.wrap(bArr, 0, i));
    }

    public static int m4923a(int i) {
        return i >= 0 ? yl.m4939d(i) : 10;
    }

    private static int m4924a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '\u0080') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < '\u0800') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < '\u0800') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('\ud800' <= charAt2 && charAt2 <= '\udfff') {
                            if (Character.codePointAt(charSequence, i2) < Menu.CATEGORY_CONTAINER) {
                                throw new IllegalArgumentException("Unpaired surrogate at index " + i2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i2 = i3 + i;
                if (i2 < length) {
                    return i2;
                }
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
            }
        }
        i2 = i3;
        if (i2 < length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
    }

    private static int m4925a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = i + i2;
        while (i3 < length && i3 + i < i4) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '\u0080') {
                break;
            }
            bArr[i + i3] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        int i5 = i + i3;
        while (i3 < length) {
            int i6;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '\u0080' && i5 < i4) {
                i6 = i5 + 1;
                bArr[i5] = (byte) charAt2;
            } else if (charAt2 < '\u0800' && i5 <= i4 - 2) {
                r6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 6) | 960);
                i6 = r6 + 1;
                bArr[r6] = (byte) ((charAt2 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
            } else if ((charAt2 < '\ud800' || '\udfff' < charAt2) && i5 <= i4 - 3) {
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 12) | 480);
                i5 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
            } else if (i5 <= i4 - 4) {
                if (i3 + 1 != charSequence.length()) {
                    i3++;
                    charAt = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt2, charAt)) {
                        int toCodePoint = Character.toCodePoint(charAt2, charAt);
                        i6 = i5 + 1;
                        bArr[i5] = (byte) ((toCodePoint >>> 18) | 240);
                        i5 = i6 + 1;
                        bArr[i6] = (byte) (((toCodePoint >>> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        r6 = i5 + 1;
                        bArr[i5] = (byte) (((toCodePoint >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                        i6 = r6 + 1;
                        bArr[r6] = (byte) ((toCodePoint & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i3 - 1));
            } else if ('\ud800' > charAt2 || charAt2 > '\udfff' || (i3 + 1 != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3 + 1)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            } else {
                throw new IllegalArgumentException("Unpaired surrogate at index " + i3);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    public static int m4926a(String str) {
        int a = yl.m4924a((CharSequence) str);
        return a + yl.m4939d(a);
    }

    public static int m4927a(byte[] bArr) {
        return yl.m4939d(bArr.length) + bArr.length;
    }

    public static yl m4928a(byte[] bArr, int i) {
        return new yl(bArr, i);
    }

    private static void m4929a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(yl.m4925a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            yl.m4937b(charSequence, byteBuffer);
        }
    }

    public static int m4930b(int i) {
        return yl.m4939d(yv.m4985a(i, 0));
    }

    public static int m4931b(int i, int i2) {
        return yl.m4930b(i) + yl.m4923a(i2);
    }

    public static int m4932b(int i, long j) {
        return yl.m4930b(i) + yl.m4936b(j);
    }

    public static int m4933b(int i, ys ysVar) {
        int b = yl.m4930b(i);
        int d = ysVar.m1661d();
        return b + (d + yl.m4939d(d));
    }

    public static int m4934b(int i, String str) {
        return yl.m4930b(i) + yl.m4926a(str);
    }

    public static int m4935b(int i, byte[] bArr) {
        return yl.m4930b(i) + yl.m4927a(bArr);
    }

    public static int m4936b(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    private static void m4937b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '\u0080') {
                byteBuffer.put((byte) charAt);
            } else if (charAt < '\u0800') {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
            } else if (charAt < '\ud800' || '\udfff' < charAt) {
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
                byteBuffer.put((byte) ((charAt & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((toCodePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((toCodePoint >>> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
                        byteBuffer.put((byte) (((toCodePoint >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
                        byteBuffer.put((byte) ((toCodePoint & 63) | NotificationCompat.FLAG_HIGH_PRIORITY));
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i - 1));
            }
            i++;
        }
    }

    public static long m4938c(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int m4939d(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    private void m4940e(int i) {
        byte b = (byte) i;
        if (this.f4376a.hasRemaining()) {
            this.f4376a.put(b);
            return;
        }
        throw new ym(this.f4376a.position(), this.f4376a.limit());
    }

    public final void m4941a(int i, int i2) {
        m4951c(i, 0);
        if (i2 >= 0) {
            m4950c(i2);
        } else {
            m4947a((long) i2);
        }
    }

    public final void m4942a(int i, long j) {
        m4951c(i, 0);
        m4947a(j);
    }

    public final void m4943a(int i, ys ysVar) {
        m4951c(i, 2);
        m4948a(ysVar);
    }

    public final void m4944a(int i, String str) {
        m4951c(i, 2);
        try {
            int d = yl.m4939d(str.length());
            if (d == yl.m4939d(str.length() * 3)) {
                int position = this.f4376a.position();
                if (this.f4376a.remaining() < d) {
                    throw new ym(d + position, this.f4376a.limit());
                }
                this.f4376a.position(position + d);
                yl.m4929a((CharSequence) str, this.f4376a);
                int position2 = this.f4376a.position();
                this.f4376a.position(position);
                m4950c((position2 - position) - d);
                this.f4376a.position(position2);
                return;
            }
            m4950c(yl.m4924a((CharSequence) str));
            yl.m4929a((CharSequence) str, this.f4376a);
        } catch (Throwable e) {
            ym ymVar = new ym(this.f4376a.position(), this.f4376a.limit());
            ymVar.initCause(e);
            throw ymVar;
        }
    }

    public final void m4945a(int i, boolean z) {
        int i2 = 0;
        m4951c(i, 0);
        if (z) {
            i2 = 1;
        }
        m4940e(i2);
    }

    public final void m4946a(int i, byte[] bArr) {
        m4951c(i, 2);
        m4950c(bArr.length);
        m4949b(bArr);
    }

    public final void m4947a(long j) {
        while ((-128 & j) != 0) {
            m4940e((((int) j) & 127) | NotificationCompat.FLAG_HIGH_PRIORITY);
            j >>>= 7;
        }
        m4940e((int) j);
    }

    public final void m4948a(ys ysVar) {
        m4950c(ysVar.m1660c());
        ysVar.m1658a(this);
    }

    public final void m4949b(byte[] bArr) {
        int length = bArr.length;
        if (this.f4376a.remaining() >= length) {
            this.f4376a.put(bArr, 0, length);
            return;
        }
        throw new ym(this.f4376a.position(), this.f4376a.limit());
    }

    public final void m4950c(int i) {
        while ((i & -128) != 0) {
            m4940e((i & 127) | NotificationCompat.FLAG_HIGH_PRIORITY);
            i >>>= 7;
        }
        m4940e(i);
    }

    public final void m4951c(int i, int i2) {
        m4950c(yv.m4985a(i, i2));
    }
}
