package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class ConnectionResult implements SafeParcelable {
    public static final Creator CREATOR;
    public static final ConnectionResult f4498a;
    final int f4499b;
    private final int f4500c;
    private final PendingIntent f4501d;
    private final String f4502e;

    static {
        f4498a = new ConnectionResult(0);
        CREATOR = new C0709h();
    }

    public ConnectionResult(int i) {
        this(i, null, (byte) 0);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f4499b = i;
        this.f4500c = i2;
        this.f4501d = pendingIntent;
        this.f4502e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, byte b) {
        this(1, i, pendingIntent, null);
    }

    static String m5054a(int i) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                return "SUCCESS";
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return "SERVICE_MISSING";
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                return "SERVICE_DISABLED";
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                return "SIGN_IN_REQUIRED";
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                return "INVALID_ACCOUNT";
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                return "RESOLUTION_REQUIRED";
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                return "NETWORK_ERROR";
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                return "INTERNAL_ERROR";
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                return "SERVICE_INVALID";
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                return "DEVELOPER_ERROR";
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                return "LICENSE_CHECK_FAILED";
            case C0772e.MapAttrs_useViewLifecycle /*13*/:
                return "CANCELED";
            case C0772e.MapAttrs_zOrderOnTop /*14*/:
                return "TIMEOUT";
            case C0772e.MapAttrs_uiMapToolbar /*15*/:
                return "INTERRUPTED";
            case C0772e.MapAttrs_ambientEnabled /*16*/:
                return "API_UNAVAILABLE";
            case hp.SherlockTheme_actionModeCloseDrawable /*17*/:
                return "SIGN_IN_FAILED";
            case hp.SherlockTheme_actionModeShareDrawable /*18*/:
                return "SERVICE_UPDATING";
            case hp.SherlockTheme_actionModePopupWindowStyle /*19*/:
                return "SERVICE_MISSING_PERMISSION";
            case hp.SherlockTheme_buttonStyleSmall /*20*/:
                return "RESTRICTED_PROFILE";
            default:
                return "UNKNOWN_ERROR_CODE(" + i + ")";
        }
    }

    public final void m5055a(Activity activity, int i) {
        if (m5056a()) {
            activity.startIntentSenderForResult(this.f4501d.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final boolean m5056a() {
        return (this.f4500c == 0 || this.f4501d == null) ? false : true;
    }

    public final boolean m5057b() {
        return this.f4500c == 0;
    }

    public final int m5058c() {
        return this.f4500c;
    }

    public final PendingIntent m5059d() {
        return this.f4501d;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m5060e() {
        return this.f4502e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f4500c == connectionResult.f4500c && av.m5525a(this.f4501d, connectionResult.f4501d) && av.m5525a(this.f4502e, connectionResult.f4502e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4500c), this.f4501d, this.f4502e});
    }

    public final String toString() {
        return av.m5524a(this).m5526a("statusCode", m5054a(this.f4500c)).m5526a("resolution", this.f4501d).m5526a("message", this.f4502e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0709h.m5365a(this, parcel, i);
    }
}
