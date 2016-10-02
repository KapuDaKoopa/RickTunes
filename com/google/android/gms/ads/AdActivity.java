package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.lx;
import com.google.android.gms.p006b.lz;

public class AdActivity extends Activity {
    private lz f1723a;

    private void m2000a() {
        if (this.f1723a != null) {
            try {
                this.f1723a.m2675l();
            } catch (Throwable e) {
                C0501b.m3026a("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f1723a != null) {
                z = this.f1723a.m2668e();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1723a = lx.m4192a((Activity) this);
        if (this.f1723a == null) {
            C0501b.m3025a("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f1723a.m2665a(bundle);
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.f1723a != null) {
                this.f1723a.m2674k();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.f1723a != null) {
                this.f1723a.m2672i();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f1723a != null) {
                this.f1723a.m2669f();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.f1723a != null) {
                this.f1723a.m2671h();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f1723a != null) {
                this.f1723a.m2666b(bundle);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.f1723a != null) {
                this.f1723a.m2670g();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected void onStop() {
        try {
            if (this.f1723a != null) {
                this.f1723a.m2673j();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m2000a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m2000a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m2000a();
    }
}
