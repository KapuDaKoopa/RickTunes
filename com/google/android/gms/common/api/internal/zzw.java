package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.C0706q;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.internal.ax;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzw extends Fragment implements OnCancelListener {
    protected ap f4529a;
    private boolean f4530b;
    private boolean f4531c;
    private int f4532d;
    private ConnectionResult f4533e;
    private final Handler f4534f;
    private final SparseArray f4535g;

    public zzw() {
        this.f4532d = -1;
        this.f4534f = new Handler(Looper.getMainLooper());
        this.f4535g = new SparseArray();
    }

    public static zzw m5102a(FragmentActivity fragmentActivity) {
        ax.m5534b("Must be called from main thread of process");
        try {
            zzw com_google_android_gms_common_api_internal_zzw = (zzw) fragmentActivity.getSupportFragmentManager().findFragmentByTag("GmsSupportLifecycleFrag");
            return (com_google_android_gms_common_api_internal_zzw == null || com_google_android_gms_common_api_internal_zzw.isRemoving()) ? null : com_google_android_gms_common_api_internal_zzw;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFrag is not a SupportLifecycleFragment", e);
        }
    }

    public static zzw m5105b(FragmentActivity fragmentActivity) {
        zzw a = m5102a(fragmentActivity);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (a == null) {
            a = m5107c();
            if (a == null) {
                Log.w("GmsSupportLifecycleFrag", "Unable to find connection error message resources (Did you include play-services-base and the proper proguard rules?); error dialogs may be unavailable.");
                a = new zzw();
            }
            supportFragmentManager.beginTransaction().add((Fragment) a, "GmsSupportLifecycleFrag").commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.common.api.internal.zzw m5107c() {
        /*
        r1 = 0;
        r2 = 3;
        r0 = "com.google.android.gms.common.api.internal.SupportLifecycleFragmentImpl";
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0029, LinkageError -> 0x0011, SecurityException -> 0x0027 }
    L_0x0008:
        if (r0 == 0) goto L_0x001f;
    L_0x000a:
        r0 = r0.newInstance();	 Catch:{ IllegalAccessException -> 0x0025, InstantiationException -> 0x0021, ExceptionInInitializerError -> 0x0023, RuntimeException -> 0x0019 }
        r0 = (com.google.android.gms.common.api.internal.zzw) r0;	 Catch:{ IllegalAccessException -> 0x0025, InstantiationException -> 0x0021, ExceptionInInitializerError -> 0x0023, RuntimeException -> 0x0019 }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = move-exception;
    L_0x0012:
        r0 = "GmsSupportLifecycleFrag";
        android.util.Log.isLoggable(r0, r2);
        r0 = r1;
        goto L_0x0008;
    L_0x0019:
        r0 = move-exception;
    L_0x001a:
        r0 = "GmsSupportLifecycleFrag";
        android.util.Log.isLoggable(r0, r2);
    L_0x001f:
        r0 = r1;
        goto L_0x0010;
    L_0x0021:
        r0 = move-exception;
        goto L_0x001a;
    L_0x0023:
        r0 = move-exception;
        goto L_0x001a;
    L_0x0025:
        r0 = move-exception;
        goto L_0x001a;
    L_0x0027:
        r0 = move-exception;
        goto L_0x0012;
    L_0x0029:
        r0 = move-exception;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzw.c():com.google.android.gms.common.api.internal.zzw");
    }

    private void m5108c(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFrag", "Unresolved error while connecting client. Stopping auto-manage.");
        ax axVar = (ax) this.f4535g.get(i);
        if (axVar != null) {
            C0465m c0465m = (ax) this.f4535g.get(i);
            this.f4535g.remove(i);
            if (c0465m != null) {
                c0465m.f4577b.m5093b(c0465m);
                c0465m.f4577b.m5098g();
            }
            C0465m c0465m2 = axVar.f4578c;
            if (c0465m2 != null) {
                c0465m2.m2856a(connectionResult);
            }
        }
        m5114b();
    }

    protected C0697i m5111a() {
        return C0697i.m5318b();
    }

    protected void m5112a(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFrag", "Failed to connect due to user resolvable error " + (connectionResult.m5060e() + " (" + connectionResult.m5058c() + ": " + C0706q.m5348a(connectionResult.m5058c()) + ')'));
        m5108c(i, connectionResult);
    }

    public final void m5113a(int i, C0660i c0660i, C0465m c0465m) {
        ax.m5528a((Object) c0660i, (Object) "GoogleApiClient instance cannot be null");
        ax.m5532a(this.f4535g.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        this.f4535g.put(i, new ax(this, i, c0660i, c0465m));
        if (this.f4530b && !this.f4531c) {
            c0660i.m5096e();
        }
    }

    protected final void m5114b() {
        this.f4531c = false;
        this.f4532d = -1;
        this.f4533e = null;
        if (this.f4529a != null) {
            this.f4529a.m5122b();
            this.f4529a = null;
        }
        for (int i = 0; i < this.f4535g.size(); i++) {
            ((ax) this.f4535g.valueAt(i)).f4577b.m5096e();
        }
    }

    protected void m5115b(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFrag", "Unable to connect, GooglePlayServices is updating.");
        m5108c(i, connectionResult);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (int i = 0; i < this.f4535g.size(); i++) {
            ax axVar = (ax) this.f4535g.valueAt(i);
            printWriter.append(str).append("GoogleApiClient #").print(axVar.f4576a);
            printWriter.println(":");
            axVar.f4577b.m5088a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        switch(r5) {
            case 1: goto L_0x001b;
            case 2: goto L_0x000c;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = r1;
    L_0x0006:
        if (r0 == 0) goto L_0x002b;
    L_0x0008:
        r4.m5114b();
    L_0x000b:
        return;
    L_0x000c:
        r2 = r4.m5111a();
        r3 = r4.getActivity();
        r2 = r2.m5321a(r3);
        if (r2 != 0) goto L_0x0005;
    L_0x001a:
        goto L_0x0006;
    L_0x001b:
        r2 = -1;
        if (r6 == r2) goto L_0x0006;
    L_0x001e:
        if (r6 != 0) goto L_0x0005;
    L_0x0020:
        r0 = new com.google.android.gms.common.ConnectionResult;
        r2 = 13;
        r3 = 0;
        r0.<init>(r2, r3);
        r4.f4533e = r0;
        goto L_0x0005;
    L_0x002b:
        r0 = r4.f4532d;
        r1 = r4.f4533e;
        r4.m5108c(r0, r1);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzw.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        m5108c(this.f4532d, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4531c = bundle.getBoolean("resolving_error", false);
            this.f4532d = bundle.getInt("failed_client_id", -1);
            if (this.f4532d >= 0) {
                this.f4533e = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", this.f4531c);
        if (this.f4532d >= 0) {
            bundle.putInt("failed_client_id", this.f4532d);
            bundle.putInt("failed_status", this.f4533e.m5058c());
            bundle.putParcelable("failed_resolution", this.f4533e.m5059d());
        }
    }

    public void onStart() {
        super.onStart();
        this.f4530b = true;
        if (!this.f4531c) {
            for (int i = 0; i < this.f4535g.size(); i++) {
                ((ax) this.f4535g.valueAt(i)).f4577b.m5096e();
            }
        }
    }

    public void onStop() {
        super.onStop();
        this.f4530b = false;
        for (int i = 0; i < this.f4535g.size(); i++) {
            ((ax) this.f4535g.valueAt(i)).f4577b.m5098g();
        }
    }
}
