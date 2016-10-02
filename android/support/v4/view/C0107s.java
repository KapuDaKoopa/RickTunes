package android.support.v4.view;

import android.support.v4.app.NotificationCompat;
import android.view.KeyEvent;

/* renamed from: android.support.v4.view.s */
class C0107s implements C0106v {
    C0107s() {
    }

    private static int m524a(int i, int i2, int i3, int i4) {
        Object obj = 1;
        Object obj2 = (i2 & 1) != 0 ? 1 : null;
        int i5 = i3 | i4;
        if ((i5 & 1) == 0) {
            obj = null;
        }
        if (obj2 == null) {
            return obj != null ? i & (i2 ^ -1) : i;
        } else {
            if (obj == null) {
                return i & (i5 ^ -1);
            }
            throw new IllegalArgumentException("bad arguments");
        }
    }

    public int m525a(int i) {
        int i2 = (i & 192) != 0 ? i | 1 : i;
        if ((i2 & 48) != 0) {
            i2 |= 2;
        }
        return i2 & 247;
    }

    public void m526a(KeyEvent keyEvent) {
    }

    public boolean m527b(int i) {
        return C0107s.m524a(C0107s.m524a(m525a(i) & 247, 1, 64, NotificationCompat.FLAG_HIGH_PRIORITY), 2, 16, 32) == 1;
    }

    public boolean m528c(int i) {
        return (m525a(i) & 247) == 0;
    }
}
