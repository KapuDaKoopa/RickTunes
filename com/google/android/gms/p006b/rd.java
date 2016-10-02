package com.google.android.gms.p006b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.ads.internal.ah;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.C0706q;
import com.google.android.gms.common.internal.ax;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.rd */
public final class rd {
    public static final Handler f4041a;
    private final Object f4042b;
    private boolean f4043c;
    private String f4044d;
    private boolean f4045e;

    static {
        f4041a = new ql(Looper.getMainLooper());
    }

    public rd() {
        this.f4042b = new Object();
        this.f4043c = true;
        this.f4045e = false;
    }

    public static Bitmap m4399a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static DisplayMetrics m4400a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static PopupWindow m4401a(View view, int i, int i2) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String m4403a(Context context, View view, AdSizeParcel adSizeParcel) {
        if (!((Boolean) ar.m2249n().m3580a(ck.f3061Z)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", adSizeParcel.f1907f);
            jSONObject2.put("height", adSizeParcel.f1904c);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", rd.m4452j(context));
            if (!adSizeParcel.f1906e) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (Throwable e) {
            C0501b.m3026a("Fail to get view hierarchy json", e);
            return null;
        }
    }

    private static String m4404a(Context context, aa aaVar, String str) {
        if (aaVar != null) {
            try {
                Uri parse = Uri.parse(str);
                if (aaVar.m3419b(parse)) {
                    parse = aaVar.m3415a(parse, context);
                }
                str = parse.toString();
            } catch (Exception e) {
            }
        }
        return str;
    }

    public static String m4406a(tf tfVar, String str) {
        return rd.m4404a(tfVar.getContext(), tfVar.m4581n(), str);
    }

    public static String m4407a(InputStreamReader inputStreamReader) {
        StringBuilder stringBuilder = new StringBuilder(FragmentTransaction.TRANSIT_EXIT_MASK);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    public static String m4408a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    public static Map m4409a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : ar.m2242g().m4466a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private JSONArray m4410a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m4421a(jSONArray, a);
        }
        return jSONArray;
    }

    private JSONObject m4411a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m4422a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static void m4412a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void m4413a(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static void m4414a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static void m4415a(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        rd.m4417a(context, str, arrayList);
    }

    public static void m4416a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            ar.m2240e();
            bundle.putString("device", rd.m4438c());
            bundle.putString("appid", applicationContext.getPackageName());
            bundle.putString("eids", TextUtils.join(",", ck.m3581a()));
            if (str != null) {
                bundle.putString("js", str);
            } else {
                bundle.putString("gmscore_version", Integer.toString(C0706q.m5360f(context)));
            }
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        ar.m2240e();
        rd.m4415a(context, str, appendQueryParameter.toString());
    }

    public static void m4417a(Context context, String str, List list) {
        for (String sgVar : list) {
            new sg(context, str, sgVar).m2709g();
        }
    }

    public static void m4418a(Context context, String str, List list, String str2) {
        for (String sgVar : list) {
            new sg(context, str, sgVar, str2).m2709g();
        }
    }

    public static void m4419a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f4041a.post(runnable);
        }
    }

    public static void m4420a(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", str);
        httpURLConnection.setUseCaches(false);
    }

    private void m4421a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m4411a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m4454a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m4410a((Collection) obj));
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : objArr) {
                m4421a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    private void m4422a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m4411a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m4454a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m4410a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m4410a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static boolean m4423a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, Menu.CATEGORY_CONTAINER);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            C0501b.m3025a("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean z;
        String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            C0501b.m3025a(String.format(str, new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            C0501b.m3025a(String.format(str, new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & NotificationCompat.FLAG_HIGH_PRIORITY) == 0) {
            C0501b.m3025a(String.format(str, new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            C0501b.m3025a(String.format(str, new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
            C0501b.m3025a(String.format(str, new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            C0501b.m3025a(String.format(str, new Object[]{"screenSize"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        C0501b.m3025a(String.format(str, new Object[]{"smallestScreenSize"}));
        return false;
    }

    public static boolean m4424a(Context context, Bitmap bitmap, String str) {
        ax.m5537c("saveImageToFile must not be called on the main UI thread.");
        try {
            OutputStream openFileOutput = context.openFileOutput(str, 0);
            bitmap.compress(CompressFormat.PNG, 100, openFileOutput);
            openFileOutput.close();
            bitmap.recycle();
            return true;
        } catch (Exception e) {
            C0501b.m3027a(6);
            return false;
        }
    }

    public static boolean m4425a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    public static boolean m4426a(View view, Context context) {
        KeyguardManager keyguardManager = null;
        Context applicationContext = context.getApplicationContext();
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return rd.m4427a(view, powerManager, keyguardManager);
    }

    public static boolean m4427a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        if (view.getVisibility() == 0 && view.isShown()) {
            boolean z = powerManager == null || powerManager.isScreenOn();
            if (z) {
                if (ar.m2240e().f4043c) {
                    return true;
                }
                if (!(keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m4429a(ClassLoader classLoader, Class cls, String str) {
        boolean z = false;
        try {
            z = cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
        }
        return z;
    }

    public static int[] m4430a(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return rd.m4448f();
        }
        return new int[]{window.findViewById(16908290).getWidth(), window.findViewById(16908290).getHeight()};
    }

    public static int m4431b(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        return parent == null ? -1 : ((AdapterView) parent).getPositionForView(view);
    }

    public static int m4432b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            C0501b.m3025a("Could not parse value:" + e);
            return 0;
        }
    }

    public static Bitmap m4433b(Context context, String str) {
        ax.m5537c("getBackgroundImage must not be called on the main UI thread.");
        try {
            InputStream openFileInput = context.openFileInput(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(openFileInput);
            openFileInput.close();
            return decodeStream;
        } catch (Exception e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public static String m4434b() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                Object obj = new byte[8];
                System.arraycopy(instance.digest(), 0, obj, 0, 8);
                bigInteger = new BigInteger(1, obj).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    public static void m4435b(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static void m4436b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) ar.m2249n().m3580a(ck.an)).booleanValue()) {
            rd.m4416a(context, str, str2, bundle, z);
        }
    }

    public static int[] m4437b(Activity activity) {
        int[] a = rd.m4430a(activity);
        r1 = new int[2];
        C0374z.m2455a();
        r1[0] = C0500a.m3018b((Context) activity, a[0]);
        C0374z.m2455a();
        r1[1] = C0500a.m3018b((Context) activity, a[1]);
        return r1;
    }

    public static String m4438c() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : str + " " + str2;
    }

    protected static String m4439c(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }

    public static void m4440c(Context context, String str) {
        ax.m5537c("deleteFile must not be called on the main UI thread.");
        context.deleteFile(str);
    }

    public static boolean m4441c(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static int[] m4442c(Activity activity) {
        Window window = activity.getWindow();
        int[] f = (window == null || window.findViewById(16908290) == null) ? rd.m4448f() : new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
        r1 = new int[2];
        C0374z.m2455a();
        r1[0] = C0500a.m3018b((Context) activity, f[0]);
        C0374z.m2455a();
        r1[1] = C0500a.m3018b((Context) activity, f[1]);
        return r1;
    }

    public static float m4443d() {
        ar.m2254s();
        ah b = ah.m2110b();
        return (b == null || !b.m2114d()) ? 1.0f : b.m2113c();
    }

    public static AlertDialog.Builder m4444d(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static bx m4445e(Context context) {
        return new bx(context);
    }

    private static String m4446e() {
        StringBuffer stringBuffer = new StringBuffer(NotificationCompat.FLAG_LOCAL_ONLY);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    public static boolean m4447f(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (powerManager == null ? false : powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    private static int[] m4448f() {
        return new int[]{0, 0};
    }

    public static Bitmap m4449g(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            View decorView = ((Activity) context).getWindow().getDecorView();
            Bitmap createBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            decorView.layout(0, 0, decorView.getWidth(), decorView.getHeight());
            decorView.draw(canvas);
            return createBitmap;
        } catch (RuntimeException e) {
            C0501b.m3027a(6);
            return null;
        }
    }

    public static float m4450h(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        return streamMaxVolume == 0 ? 0.0f : ((float) audioManager.getStreamVolume(3)) / ((float) streamMaxVolume);
    }

    public static int m4451i(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
    }

    private static String m4452j(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (!(runningTasks == null || runningTasks.isEmpty())) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception e) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m4453a(android.content.Context r4, java.lang.String r5) {
        /*
        r3 = this;
        r1 = r3.f4042b;
        monitor-enter(r1);
        r0 = r3.f4044d;	 Catch:{ all -> 0x0059 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r3.f4044d;	 Catch:{ all -> 0x0059 }
        monitor-exit(r1);	 Catch:{ all -> 0x0059 }
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = com.google.android.gms.ads.internal.ar.m2242g();	 Catch:{ Exception -> 0x008f }
        r0 = r0.m4464a(r4);	 Catch:{ Exception -> 0x008f }
        r3.f4044d = r0;	 Catch:{ Exception -> 0x008f }
    L_0x0015:
        r0 = r3.f4044d;	 Catch:{ all -> 0x0059 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0059 }
        if (r0 == 0) goto L_0x0062;
    L_0x001d:
        com.google.android.gms.ads.internal.client.C0374z.m2455a();	 Catch:{ all -> 0x0059 }
        r0 = com.google.android.gms.ads.internal.util.client.C0500a.m3020b();	 Catch:{ all -> 0x0059 }
        if (r0 != 0) goto L_0x005c;
    L_0x0026:
        r0 = 0;
        r3.f4044d = r0;	 Catch:{ all -> 0x0059 }
        r0 = f4041a;	 Catch:{ all -> 0x0059 }
        r2 = new com.google.android.gms.b.re;	 Catch:{ all -> 0x0059 }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x0059 }
        r0.post(r2);	 Catch:{ all -> 0x0059 }
    L_0x0033:
        r0 = r3.f4044d;	 Catch:{ all -> 0x0059 }
        if (r0 != 0) goto L_0x0062;
    L_0x0037:
        r0 = r3.f4042b;	 Catch:{ InterruptedException -> 0x003d }
        r0.wait();	 Catch:{ InterruptedException -> 0x003d }
        goto L_0x0033;
    L_0x003d:
        r0 = move-exception;
        r0 = com.google.android.gms.p006b.rd.m4446e();	 Catch:{ all -> 0x0059 }
        r3.f4044d = r0;	 Catch:{ all -> 0x0059 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0059 }
        r2 = "Interrupted, use default user agent: ";
        r0.<init>(r2);	 Catch:{ all -> 0x0059 }
        r2 = r3.f4044d;	 Catch:{ all -> 0x0059 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0059 }
        r0 = r0.toString();	 Catch:{ all -> 0x0059 }
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r0);	 Catch:{ all -> 0x0059 }
        goto L_0x0033;
    L_0x0059:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x005c:
        r0 = com.google.android.gms.p006b.rd.m4439c(r4);	 Catch:{ Exception -> 0x0087 }
        r3.f4044d = r0;	 Catch:{ Exception -> 0x0087 }
    L_0x0062:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0059 }
        r0.<init>();	 Catch:{ all -> 0x0059 }
        r2 = r3.f4044d;	 Catch:{ all -> 0x0059 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0059 }
        r2 = " (Mobile; ";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0059 }
        r0 = r0.append(r5);	 Catch:{ all -> 0x0059 }
        r2 = ")";
        r0 = r0.append(r2);	 Catch:{ all -> 0x0059 }
        r0 = r0.toString();	 Catch:{ all -> 0x0059 }
        r3.f4044d = r0;	 Catch:{ all -> 0x0059 }
        r0 = r3.f4044d;	 Catch:{ all -> 0x0059 }
        monitor-exit(r1);	 Catch:{ all -> 0x0059 }
        goto L_0x000a;
    L_0x0087:
        r0 = move-exception;
        r0 = com.google.android.gms.p006b.rd.m4446e();	 Catch:{ all -> 0x0059 }
        r3.f4044d = r0;	 Catch:{ all -> 0x0059 }
        goto L_0x0062;
    L_0x008f:
        r0 = move-exception;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.rd.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public final JSONObject m4454a(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m4422a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: " + e.getMessage());
        }
    }

    public final void m4455a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m4453a(context, str));
    }

    public final void m4456a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m4453a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean m4457a() {
        return this.f4043c;
    }

    public final boolean m4458b(Context context) {
        if (this.f4045e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new rf(), intentFilter);
        this.f4045e = true;
        return true;
    }
}
