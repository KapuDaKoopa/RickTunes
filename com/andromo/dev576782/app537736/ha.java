package com.andromo.dev576782.app537736;

import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import com.actionbarsherlock.view.Menu;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class ha {
    private static int f991a;
    private static int f992b;
    private static final List f993n;
    private long f994c;
    private String f995d;
    private String f996e;
    private String f997f;
    private hd f998g;
    private hc f999h;
    private he f1000i;
    private int f1001j;
    private List f1002k;
    private List f1003l;
    private WifiLock f1004m;
    private volatile hb f1005o;

    static {
        f991a = Menu.CATEGORY_CONTAINER;
        f992b = 2097152;
        List arrayList = new ArrayList();
        arrayList.add("");
        arrayList.add("Mozilla/5.0 (Windows; U; Windows NT 5.1; de; rv:1.9) Gecko/2008052906 Firefox/3.0");
        arrayList.add(null);
        f993n = Collections.unmodifiableList(arrayList);
    }

    public ha(Context context) {
        this.f998g = hd.SEQUENTIAL;
        this.f999h = hc.AUTOMATIC;
        this.f1000i = he.OFF;
        this.f1001j = -1;
        this.f1005o = hb.PENDING;
        String name = context.getClass().getName();
        this.f997f = name;
        this.f995d = name;
        this.f1004m = ((WifiManager) context.getSystemService("wifi")).createWifiLock(1, "Andromo-Playlist-Builder");
    }

    public ha(String str, String str2) {
        this.f998g = hd.SEQUENTIAL;
        this.f999h = hc.AUTOMATIC;
        this.f1000i = he.OFF;
        this.f1001j = -1;
        this.f1005o = hb.PENDING;
        this.f995d = str;
        this.f997f = str2;
    }

    public final ha m1542a(Context context) {
        this.f1005o = hb.RUNNING;
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(2131623943);
        String[] stringArray2 = resources.getStringArray(2131623941);
        String[] stringArray3 = resources.getStringArray(2131623942);
        String[] stringArray4 = resources.getStringArray(2131623944);
        this.f1002k = null;
        this.f1005o = hb.RUNNING;
        if (!(stringArray == null || stringArray2 == null || stringArray3 == null || stringArray4 == null || stringArray.length != stringArray2.length || stringArray.length != stringArray3.length || stringArray.length != stringArray4.length)) {
            this.f1002k = new ArrayList(stringArray.length);
            int length = stringArray.length;
            for (int i = 0; i < length; i++) {
                if (this.f1005o == hb.CANCELLED) {
                    break;
                }
                String str = stringArray[i];
                ce valueOf = ce.valueOf(stringArray4[i]);
                cd cdVar = new cd();
                cdVar.f779a = str;
                cdVar.f780b = stringArray2[i];
                cdVar.f781c = stringArray3[i];
                cdVar.f782d = valueOf;
                this.f1002k.add(cdVar.m1314a());
            }
        }
        this.f994c = System.currentTimeMillis();
        this.f1005o = hb.DONE;
        return this;
    }

    public final ha m1543a(hc hcVar) {
        this.f999h = hcVar;
        return this;
    }

    public final ha m1544a(hd hdVar) {
        this.f998g = hdVar;
        return this;
    }

    public final ha m1545a(he heVar) {
        this.f1000i = heVar;
        return this;
    }

    public final ha m1546a(String str) {
        this.f997f = str;
        return this;
    }

    public final ha m1547a(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        int i;
        Throwable th;
        this.f1002k = null;
        this.f1005o = hb.RUNNING;
        if (this.f1003l == null) {
            this.f1003l = new ArrayList();
            this.f1003l.add(new fg());
            this.f1003l.add(new gt());
            this.f1003l.add(new C0196a());
            this.f1003l.add(new hm());
        }
        Collection arrayList = new ArrayList();
        arrayList.add("audio/ogg");
        arrayList.add("audio/mpeg");
        arrayList.add("audio/x-mpeg");
        arrayList.add("audio/mpeg3");
        arrayList.add("audio/x-mpeg3");
        arrayList.add("audio/wav");
        arrayList.add("audio/x-wav");
        arrayList.add("audio/flac");
        arrayList.add("audio/basic");
        arrayList.add("audio/mid");
        arrayList.add("audio/x-mid");
        arrayList.add("audio/midi");
        arrayList.add("audio/x-midi");
        arrayList.add("audio/mod");
        arrayList.add("audio/x-mod");
        arrayList.add("audio/aiff");
        arrayList.add("audio/x-aiff");
        arrayList.add("audio/xm");
        arrayList.add("video/mpeg");
        arrayList.add("video/x-mpeg");
        arrayList.add("video/quicktime");
        arrayList.add("video/avi");
        arrayList.add("video/ogg");
        arrayList.add("application/ogg");
        arrayList.add("application/x-shockwave-flash");
        arrayList.add("image/jpeg");
        arrayList.add("image/png");
        arrayList.add("application/pdf");
        arrayList.add("application/zip");
        if (!(strArr == null || strArr2 == null || strArr3 == null || strArr4 == null)) {
            if (strArr.length == strArr2.length && strArr.length == strArr3.length && strArr.length == strArr4.length) {
                this.f1002k = new ArrayList(strArr.length);
                Pattern compile = Pattern.compile("\\.(?:m3u|M3U|pls|PLS|asx|ASX)");
                int length = strArr.length;
                loop0:
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f1005o == hb.CANCELLED) {
                        break;
                    }
                    cd cdVar;
                    String str = strArr[i2];
                    ce valueOf = ce.valueOf(strArr4[i2]);
                    Object obj = (valueOf == ce.f787a || valueOf.m1315a() || !compile.matcher(str).find()) ? null : 1;
                    if (obj != null) {
                        if (valueOf == ce.f788b) {
                            valueOf = ce.f789c;
                        } else if (valueOf == ce.f790d) {
                            valueOf = ce.f791e;
                        }
                    }
                    int i3 = 0;
                    if (valueOf.m1315a()) {
                        obj = (valueOf == ce.f787a || str == null || str.length() <= 4 || !"file:".equalsIgnoreCase(str.substring(0, 5))) ? null : 1;
                        String toLowerCase;
                        int i4;
                        ByteArrayInputStream a;
                        hl a2;
                        if (obj == null) {
                            int i5 = 0;
                            int i6 = 0;
                            Object obj2 = 1;
                            while (obj2 != null) {
                                obj2 = null;
                                try {
                                    int i7 = f991a;
                                    toLowerCase = str.toLowerCase();
                                    if (toLowerCase.contains("rss") || toLowerCase.contains("xml") || toLowerCase.contains("podcast")) {
                                        i7 = f992b;
                                    }
                                    if (!(this.f1004m == null || this.f1004m.isHeld())) {
                                        this.f1004m.setReferenceCounted(false);
                                        try {
                                            this.f1004m.acquire();
                                        } catch (UnsupportedOperationException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    URLConnection a3 = dy.m1353a(str, "*/*", (String) f993n.get(i5), 10000, 30000);
                                    if (a3 == null) {
                                        continue;
                                    } else if (dy.m1356a(a3, arrayList)) {
                                        cdVar = new cd();
                                        cdVar.f779a = str;
                                        cdVar.f780b = strArr2[i2];
                                        cdVar.f781c = strArr3[i2];
                                        cdVar.f782d = valueOf;
                                        this.f1002k.add(cdVar.m1314a());
                                    } else {
                                        i4 = 0;
                                        for (hk hkVar : this.f1003l) {
                                            int i8;
                                            if (dy.m1356a(a3, hkVar.m1203a())) {
                                                i = i4 + 1;
                                                Collections.swap(this.f1003l, this.f1003l.indexOf(hkVar), i4);
                                                if (hkVar.m1204b()) {
                                                    int i9 = i;
                                                    i = f992b;
                                                    i8 = i9;
                                                } else {
                                                    i8 = i;
                                                    i = i7;
                                                }
                                            } else {
                                                i8 = i4;
                                                i = i7;
                                            }
                                            i4 = i8;
                                            i7 = i;
                                        }
                                        String a4 = dy.m1352a(a3, "UTF-8");
                                        a = dy.m1351a(a3, i7);
                                        for (hk hkVar2 : this.f1003l) {
                                            if (this.f1005o == hb.CANCELLED) {
                                                a.close();
                                                break loop0;
                                            }
                                            a2 = hkVar2.m1202a(a, str, strArr2[i2], strArr3[i2], valueOf, a4);
                                            if (this.f1005o == hb.CANCELLED || a2.f1061a.size() <= 0) {
                                                try {
                                                    if (!a2.f1063c) {
                                                        a.reset();
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    i4 = i6;
                                                }
                                            } else {
                                                i4 = a2.f1061a.size();
                                                try {
                                                    this.f1002k.addAll(a2.f1061a);
                                                    i6 = i4;
                                                    break;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    try {
                                                        a.close();
                                                        throw th;
                                                    } catch (MalformedURLException e2) {
                                                        i6 = i4;
                                                    } catch (IOException e3) {
                                                        i6 = i4;
                                                        i = i5 + 1;
                                                        i5 = i;
                                                        obj2 = i >= f993n.size() ? 1 : null;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                        a.close();
                                    }
                                } catch (MalformedURLException e4) {
                                } catch (IOException e5) {
                                    i = i5 + 1;
                                    if (i >= f993n.size()) {
                                    }
                                    i5 = i;
                                    obj2 = i >= f993n.size() ? 1 : null;
                                }
                            }
                            i3 = i6;
                        } else {
                            try {
                                toLowerCase = str.replaceFirst("file://", "/");
                                if (toLowerCase != null && toLowerCase.length() > 0) {
                                    a = eu.m1403a(toLowerCase, f991a);
                                    for (hk hkVar22 : this.f1003l) {
                                        if (this.f1005o == hb.CANCELLED) {
                                            a.close();
                                            break;
                                        }
                                        try {
                                            a2 = hkVar22.m1202a(a, str, strArr2[i2], strArr3[i2], valueOf, "UTF-8");
                                            if (this.f1005o != hb.CANCELLED && a2.f1061a.size() > 0) {
                                                i4 = a2.f1061a.size();
                                                try {
                                                    this.f1002k.addAll(a2.f1061a);
                                                    i3 = i4;
                                                    break;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    try {
                                                        a.close();
                                                        throw th;
                                                    } catch (FileNotFoundException e6) {
                                                        i3 = i4;
                                                    } catch (IOException e7) {
                                                        i3 = i4;
                                                    }
                                                }
                                            } else if (!a2.f1063c) {
                                                a.reset();
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            i4 = 0;
                                        }
                                    }
                                    break;
                                    a.close();
                                }
                            } catch (FileNotFoundException e8) {
                            } catch (IOException e9) {
                            }
                        }
                    }
                    if (i3 == 0) {
                        cdVar = new cd();
                        cdVar.f779a = str;
                        cdVar.f780b = strArr2[i2];
                        cdVar.f781c = strArr3[i2];
                        cdVar.f782d = valueOf;
                        this.f1002k.add(cdVar.m1314a());
                    }
                }
            }
            if (this.f1004m != null && this.f1004m.isHeld()) {
                this.f1004m.release();
            }
        }
        this.f994c = System.currentTimeMillis();
        this.f1005o = hb.DONE;
        return this;
    }

    public final boolean m1548a() {
        return this.f1005o == hb.CANCELLED;
    }

    public final ha m1549b(String str) {
        this.f996e = str;
        return this;
    }

    final boolean m1550b() {
        return this.f1005o == hb.PENDING;
    }

    public final boolean m1551c() {
        return this.f1005o == hb.RUNNING;
    }

    public final void m1552d() {
        this.f1005o = hb.CANCELLED;
        if (this.f1003l != null) {
            for (hk c : this.f1003l) {
                c.m1205c();
            }
        }
    }

    public final Playlist m1553e() {
        return new Playlist();
    }
}
