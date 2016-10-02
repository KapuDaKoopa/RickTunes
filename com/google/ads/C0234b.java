package com.google.ads;

/* renamed from: com.google.ads.b */
public enum C0234b {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    
    private final String f1302e;

    private C0234b(String str) {
        this.f1302e = str;
    }

    public final String toString() {
        return this.f1302e;
    }
}
