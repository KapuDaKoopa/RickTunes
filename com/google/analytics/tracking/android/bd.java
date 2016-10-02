package com.google.analytics.tracking.android;

final class bd implements bb {
    private final long f1621a;
    private final int f1622b;
    private double f1623c;
    private long f1624d;
    private final Object f1625e;

    private bd() {
        this.f1625e = new Object();
        this.f1622b = 60;
        this.f1623c = (double) this.f1622b;
        this.f1621a = 2000;
    }

    public bd(byte b) {
        this();
    }

    public final boolean m1886a() {
        boolean z;
        synchronized (this.f1625e) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f1623c < ((double) this.f1622b)) {
                double d = ((double) (currentTimeMillis - this.f1624d)) / ((double) this.f1621a);
                if (d > 0.0d) {
                    this.f1623c = Math.min((double) this.f1622b, d + this.f1623c);
                }
            }
            this.f1624d = currentTimeMillis;
            if (this.f1623c >= 1.0d) {
                this.f1623c -= 1.0d;
                z = true;
            } else {
                as.m1832d("Excessive tracking detected.  Tracking call ignored.");
                z = false;
            }
        }
        return z;
    }
}
