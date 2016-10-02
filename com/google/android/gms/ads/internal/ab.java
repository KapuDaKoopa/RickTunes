package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.formats.C0383d;
import com.google.android.gms.ads.internal.formats.C0384e;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.dj;
import com.google.android.gms.p006b.dk;
import com.google.android.gms.p006b.fk;
import com.google.android.gms.p006b.jv;
import com.google.android.gms.p006b.kr;
import com.google.android.gms.p006b.ku;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pz;
import com.google.android.gms.p006b.tf;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@op
public final class ab {
    public static View m2091a(pz pzVar) {
        if (pzVar == null) {
            C0501b.m3027a(6);
            return null;
        } else if (m2100b(pzVar)) {
            return pzVar.f3926b.m4564b();
        } else {
            try {
                C0314a a = pzVar.f3939o.m3964a();
                if (a != null) {
                    return (View) C0317d.m1997a(a);
                }
                C0501b.m3025a("View in mediation adapter is null.");
                return null;
            } catch (Throwable e) {
                C0501b.m3026a("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    static /* synthetic */ dj m2092a(Object obj) {
        return obj instanceof IBinder ? dk.m2489a((IBinder) obj) : null;
    }

    static fk m2093a(kr krVar, ku kuVar, C0447q c0447q) {
        return new ag(krVar, c0447q, kuVar);
    }

    private static String m2094a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            C0501b.m3025a("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        return "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    static String m2095a(dj djVar) {
        if (djVar == null) {
            C0501b.m3025a("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = djVar.m2487b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException e) {
            C0501b.m3025a("Unable to get image uri. Trying data uri next");
        }
        return m2099b(djVar);
    }

    static /* synthetic */ JSONObject m2096a(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                if ("image".equals(jSONObject2.getString(str2))) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(str2, m2094a((Bitmap) obj));
                    } else {
                        C0501b.m3025a("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    C0501b.m3025a("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
        }
        return jSONObject;
    }

    static /* synthetic */ void m2097a(tf tfVar) {
        OnClickListener A = tfVar.m4552A();
        if (A != null) {
            A.onClick(tfVar.m4564b());
        }
    }

    public static boolean m2098a(tf tfVar, jv jvVar, CountDownLatch countDownLatch) {
        boolean z;
        try {
            View b = tfVar.m4564b();
            if (b == null) {
                C0501b.m3025a("AdWebView is null");
                z = false;
            } else {
                b.setVisibility(4);
                List list = jvVar.f3503b.f3464n;
                if (list == null || list.isEmpty()) {
                    C0501b.m3025a("No template ids present in mediation response");
                    z = false;
                } else {
                    tfVar.m4579l().m4611a("/nativeExpressAssetsLoaded", new ae(countDownLatch));
                    tfVar.m4579l().m4611a("/nativeExpressAssetsLoadingFailed", new af(countDownLatch));
                    kr h = jvVar.f3504c.m3979h();
                    ku i = jvVar.f3504c.m3980i();
                    if (list.contains("2") && h != null) {
                        tfVar.m4579l().m4609a(new ac(new C0383d(h.m4014a(), h.m4016b(), h.m4018c(), h.m4019d(), h.m4020e(), h.m4021f(), h.m4022g(), h.m4023h(), null, h.m4027l()), jvVar.f3503b.f3463m, tfVar));
                    } else if (!list.contains("1") || i == null) {
                        C0501b.m3025a("No matching template id and mapper");
                        z = false;
                    } else {
                        tfVar.m4579l().m4609a(new ad(new C0384e(i.m4043a(), i.m4045b(), i.m4047c(), i.m4048d(), i.m4049e(), i.m4050f(), null, i.m4054j()), jvVar.f3503b.f3463m, tfVar));
                    }
                    String str = jvVar.f3503b.f3461k;
                    String str2 = jvVar.f3503b.f3462l;
                    if (str2 != null) {
                        tfVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                    } else {
                        tfVar.loadData(str, "text/html", "UTF-8");
                    }
                    z = true;
                }
            }
        } catch (Throwable e) {
            C0501b.m3026a("Unable to invoke load assets", e);
            z = false;
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    private static String m2099b(dj djVar) {
        try {
            C0314a a = djVar.m2486a();
            if (a == null) {
                C0501b.m3025a("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) C0317d.m1997a(a);
            if (drawable instanceof BitmapDrawable) {
                return m2094a(((BitmapDrawable) drawable).getBitmap());
            }
            C0501b.m3025a("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException e) {
            C0501b.m3025a("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    public static boolean m2100b(pz pzVar) {
        return (pzVar == null || !pzVar.f3937m || pzVar.f3938n == null || pzVar.f3938n.f3461k == null) ? false : true;
    }
}
