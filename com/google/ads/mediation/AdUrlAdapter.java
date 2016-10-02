package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.C0239d;
import com.google.android.gms.ads.mediation.C0240h;
import com.google.android.gms.ads.mediation.C0241f;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class AdUrlAdapter extends C0242a implements C0239d, C0241f, C0240h {
    protected final Bundle m1705a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle2);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }

    public final String m1706a(Bundle bundle) {
        return "adurl";
    }
}
