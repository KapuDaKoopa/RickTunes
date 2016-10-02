package android.support.v4.p001b;

import android.support.v4.app.NotificationCompat;
import java.io.Writer;

/* renamed from: android.support.v4.b.e */
public final class C0034e extends Writer {
    private final String f20a;
    private StringBuilder f21b;

    public C0034e(String str) {
        this.f21b = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        this.f20a = str;
    }

    private void m37a() {
        if (this.f21b.length() > 0) {
            String str = this.f20a;
            this.f21b.toString();
            this.f21b.delete(0, this.f21b.length());
        }
    }

    public final void close() {
        m37a();
    }

    public final void flush() {
        m37a();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m37a();
            } else {
                this.f21b.append(c);
            }
        }
    }
}
