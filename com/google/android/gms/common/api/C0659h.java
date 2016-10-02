package com.google.android.gms.common.api;

import com.actionbarsherlock.internal.widget.IcsAdapterView;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;

/* renamed from: com.google.android.gms.common.api.h */
public final class C0659h {
    public static String m5081a(int i) {
        switch (i) {
            case IcsAdapterView.ITEM_VIEW_TYPE_IGNORE /*-1*/:
                return "SUCCESS_CACHE";
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
                return "ERROR";
            case C0772e.MapAttrs_zOrderOnTop /*14*/:
                return "INTERRUPTED";
            case C0772e.MapAttrs_uiMapToolbar /*15*/:
                return "TIMEOUT";
            case C0772e.MapAttrs_ambientEnabled /*16*/:
                return "CANCELED";
            case hp.SherlockTheme_actionModeCloseDrawable /*17*/:
                return "API_NOT_CONNECTED";
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case 3004:
                return "AUTH_TOKEN_ERROR";
            case 3005:
                return "AUTH_URL_RESOLUTION";
            default:
                return "unknown status code: " + i;
        }
    }
}
