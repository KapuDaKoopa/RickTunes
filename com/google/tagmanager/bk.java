package com.google.tagmanager;

final class bk extends Number implements Comparable {
    private double f5128a;
    private long f5129b;
    private boolean f5130c;

    private bk() {
        this.f5129b = 0;
        this.f5130c = true;
    }

    private int m5866a(bk bkVar) {
        return (this.f5130c && bkVar.f5130c) ? new Long(this.f5129b).compareTo(Long.valueOf(bkVar.f5129b)) : Double.compare(doubleValue(), bkVar.doubleValue());
    }

    public static bk m5867a() {
        return new bk();
    }

    public final boolean m5868b() {
        return !this.f5130c;
    }

    public final byte byteValue() {
        return (byte) ((int) longValue());
    }

    public final boolean m5869c() {
        return this.f5130c;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return m5866a((bk) obj);
    }

    public final double doubleValue() {
        return this.f5130c ? (double) this.f5129b : this.f5128a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bk) && m5866a((bk) obj) == 0;
    }

    public final float floatValue() {
        return (float) doubleValue();
    }

    public final int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public final int intValue() {
        return (int) longValue();
    }

    public final long longValue() {
        return this.f5130c ? this.f5129b : (long) this.f5128a;
    }

    public final short shortValue() {
        return (short) ((int) longValue());
    }

    public final String toString() {
        return this.f5130c ? Long.toString(this.f5129b) : Double.toString(this.f5128a);
    }
}
