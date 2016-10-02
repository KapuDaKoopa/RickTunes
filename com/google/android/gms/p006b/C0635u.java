package com.google.android.gms.p006b;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.ads.p004a.p005a.C0229d;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.api.C0660i;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: com.google.android.gms.b.u */
public abstract class C0635u implements C0496t {
    protected static C0660i f4203i;
    protected MotionEvent f4204a;
    protected LinkedList f4205b;
    protected long f4206c;
    protected long f4207d;
    protected long f4208e;
    protected long f4209f;
    protected DisplayMetrics f4210g;
    protected ac f4211h;
    private boolean f4212j;

    protected C0635u(Context context, ac acVar) {
        this.f4205b = new LinkedList();
        this.f4206c = 0;
        this.f4207d = 0;
        this.f4208e = 0;
        this.f4209f = 0;
        this.f4212j = false;
        this.f4211h = acVar;
        try {
            this.f4210g = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f4210g = new DisplayMetrics();
            this.f4210g.density = 1.0f;
        }
    }

    private String m4735a(Context context, String str, boolean z) {
        if (z) {
            try {
                ys c = m4742c(context);
                this.f4212j = true;
            } catch (NoSuchAlgorithmException e) {
                return Integer.toString(7);
            } catch (UnsupportedEncodingException e2) {
                return Integer.toString(7);
            } catch (IOException e3) {
                return Integer.toString(3);
            }
        }
        c = m4741b(context);
        if (c == null || c.m1661d() == 0) {
            return Integer.toString(5);
        }
        byte[] bArr;
        byte[] a = ys.m1656a(c);
        if (a.length > 239) {
            c = new C0229d();
            c.f1279t = Long.valueOf(1);
            a = ys.m1656a(c);
        }
        if (a.length < 239) {
            bArr = new byte[(239 - a.length)];
            new SecureRandom().nextBytes(bArr);
            a = ByteBuffer.allocate(240).put((byte) a.length).put(a).put(bArr).array();
        } else {
            a = ByteBuffer.allocate(240).put((byte) a.length).put(a).array();
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(a);
        a = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(instance.digest()).put(a).array();
        bArr = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        new C0620f().m3709a(a, bArr);
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new yk(str.getBytes("UTF-8")).m4922a(bArr);
        }
        return this.f4211h.m3420a(bArr);
    }

    public final String m4736a(Context context) {
        return m4735a(context, null, false);
    }

    public final String m4737a(Context context, String str) {
        return m4735a(context, str, true);
    }

    protected final String m4738a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return this.f4211h.m3420a(bArr);
    }

    public final void m4739a(int i, int i2, int i3) {
        if (this.f4204a != null) {
            this.f4204a.recycle();
        }
        this.f4204a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.f4210g.density, ((float) i2) * this.f4210g.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    public final void m4740a(MotionEvent motionEvent) {
        if (this.f4212j) {
            this.f4209f = 0;
            this.f4208e = 0;
            this.f4207d = 0;
            this.f4206c = 0;
            Iterator it = this.f4205b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f4205b.clear();
            this.f4204a = null;
            this.f4212j = false;
        }
        switch (motionEvent.getAction()) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                this.f4206c++;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                this.f4204a = MotionEvent.obtain(motionEvent);
                this.f4205b.add(this.f4204a);
                if (this.f4205b.size() > 6) {
                    ((MotionEvent) this.f4205b.remove()).recycle();
                }
                this.f4208e++;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                this.f4207d += (long) (motionEvent.getHistorySize() + 1);
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                this.f4209f++;
            default:
        }
    }

    protected abstract C0229d m4741b(Context context);

    protected abstract C0229d m4742c(Context context);
}
