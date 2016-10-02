package com.andromo.dev576782.app537736;

import android.webkit.URLUtil;
import com.google.android.gms.C0772e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.andromo.dev576782.app537736.a */
public final class C0196a implements hk {
    static final List f626a;
    private boolean f627b;
    private volatile boolean f628c;

    static {
        List arrayList = new ArrayList();
        arrayList.add("audio/x-ms-asf");
        arrayList.add("video/x-ms-asf");
        arrayList.add("video/x-ms-asf-plugin");
        arrayList.add("video/x-ms-wax");
        arrayList.add("application/rss+xml");
        arrayList.add("application/atom+xml");
        arrayList.add("application/xml");
        arrayList.add("text/xml");
        f626a = Collections.unmodifiableList(arrayList);
    }

    public C0196a() {
        this.f627b = true;
    }

    private static int m1206a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            str = str.substring(0, lastIndexOf);
        }
        if (str == null || str.length() <= 0) {
            return 0;
        }
        String[] split = str.split(":");
        try {
            if (split.length >= 3) {
                return Integer.parseInt(split[2]) + (((Integer.parseInt(split[0]) * 60) * 60) + (Integer.parseInt(split[1]) * 60));
            } else if (split.length != 2) {
                return Integer.parseInt(split[0]);
            } else {
                return Integer.parseInt(split[1]) + (Integer.parseInt(split[0]) * 60);
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private C0197b m1207a(XmlPullParser xmlPullParser, String str) {
        C0197b c0197b = new C0197b();
        while (!this.f628c) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("ref".equalsIgnoreCase(name)) {
                    name = in.m1603a(xmlPullParser, "href").trim();
                    if (name.length() > 0) {
                        if (URLUtil.isValidUrl(name)) {
                            c0197b.f733e.add(name);
                        } else {
                            String a = gr.m1516a(name, str);
                            if (a.length() <= 0 || !gr.m1518a(a)) {
                                c0197b.f733e.add(name);
                            } else {
                                c0197b.f733e.add(a);
                            }
                        }
                    }
                } else if ("title".equalsIgnoreCase(name)) {
                    c0197b.f729a = in.m1602a(xmlPullParser).trim();
                } else if ("author".equalsIgnoreCase(name)) {
                    c0197b.f731c = in.m1602a(xmlPullParser).trim();
                } else if ("abstract".equalsIgnoreCase(name)) {
                    if (this.f627b) {
                        c0197b.f730b = HtmlUtils.m1123a(in.m1602a(xmlPullParser));
                    } else {
                        c0197b.f730b = in.m1602a(xmlPullParser).trim();
                    }
                } else if ("duration".equalsIgnoreCase(name)) {
                    c0197b.f732d = in.m1602a(xmlPullParser).trim();
                }
            } else if (next == 3) {
                if ("entry".equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
        }
        return c0197b;
    }

    public final hl m1208a(ByteArrayInputStream byteArrayInputStream, String str, String str2, String str3, ce ceVar, String str4) {
        hl hlVar = new hl();
        hlVar.f1061a = Collections.emptyList();
        Reader eaVar;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            eaVar = new ea(new InputStreamReader(byteArrayInputStream, str4));
            newPullParser.setInput(eaVar);
            boolean b = fj.m1440b(str3);
            Object obj = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1 && !this.f628c; eventType = newPullParser.next()) {
                Object obj2;
                switch (eventType) {
                    case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                        hlVar.f1061a = new ArrayList();
                        obj2 = obj;
                        continue;
                    case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        String name = newPullParser.getName();
                        if (!"asx".equalsIgnoreCase(name)) {
                            if (obj != null) {
                                if ("entry".equalsIgnoreCase(name)) {
                                    C0197b a = m1207a(newPullParser, str);
                                    if (a != null && a.f733e.size() > 0) {
                                        obj2 = (a.f729a == null || a.f729a.length() == 0) ? 1 : null;
                                        if (!this.f628c) {
                                            int a2;
                                            if (!ceVar.m1316b() && (obj2 != null || b)) {
                                                if (a.f733e.size() != 1) {
                                                    if (a.f733e.size() > 1) {
                                                        int i = 1;
                                                        for (String name2 : a.f733e) {
                                                            fj a3 = fj.m1438a(name2);
                                                            a.f729a = AudioItem.m970a(a3, a.f729a, str2);
                                                            if (b) {
                                                                a.f730b = AudioItem.m975b(a3, a.f730b, str3);
                                                            }
                                                            a2 = C0196a.m1206a(a.f732d);
                                                            if (a2 == 0) {
                                                                a2 = a3.m1446f();
                                                            }
                                                            cd cdVar = new cd();
                                                            cdVar.f779a = name2;
                                                            cdVar.f780b = i + ": " + a.f729a;
                                                            cdVar.f781c = a.f730b;
                                                            cdVar.f782d = ceVar;
                                                            cdVar.f783e = a3.m1443c();
                                                            cdVar.f784f = a3.m1444d();
                                                            cdVar.f785g = a3.m1445e();
                                                            cdVar.f786h = a2;
                                                            hlVar.f1061a.add(cdVar.m1314a());
                                                            i++;
                                                        }
                                                        obj2 = obj;
                                                        break;
                                                    }
                                                }
                                                for (String name22 : a.f733e) {
                                                    fj a4 = fj.m1438a(name22);
                                                    a.f729a = AudioItem.m970a(a4, a.f729a, str2);
                                                    if (b) {
                                                        a.f730b = AudioItem.m975b(a4, a.f730b, str3);
                                                    }
                                                    a2 = C0196a.m1206a(a.f732d);
                                                    if (a2 == 0) {
                                                        a2 = a4.m1446f();
                                                    }
                                                    cd cdVar2 = new cd();
                                                    cdVar2.f779a = name22;
                                                    cdVar2.f780b = a.f729a;
                                                    cdVar2.f781c = a.f730b;
                                                    cdVar2.f782d = ceVar;
                                                    cdVar2.f783e = a4.m1443c();
                                                    cdVar2.f784f = a4.m1444d();
                                                    cdVar2.f785g = a4.m1445e();
                                                    cdVar2.f786h = a2;
                                                    hlVar.f1061a.add(cdVar2.m1314a());
                                                }
                                                obj2 = obj;
                                                break;
                                            }
                                            if ("".equals(a.f729a)) {
                                                a.f729a = str2;
                                            }
                                            if ("".equals(a.f730b)) {
                                                a.f730b = str3;
                                            }
                                            if (a.f733e.size() != 1) {
                                                if (a.f733e.size() > 1) {
                                                    a2 = 1;
                                                    for (String name222 : a.f733e) {
                                                        cd cdVar3 = new cd();
                                                        cdVar3.f779a = name222;
                                                        cdVar3.f780b = a2 + ": " + a.f729a;
                                                        cdVar3.f781c = a.f730b;
                                                        cdVar3.f782d = ceVar;
                                                        cdVar3.f786h = C0196a.m1206a(a.f732d);
                                                        hlVar.f1061a.add(cdVar3.m1314a());
                                                        a2++;
                                                    }
                                                    break;
                                                }
                                            }
                                            for (String name2222 : a.f733e) {
                                                cd cdVar4 = new cd();
                                                cdVar4.f779a = name2222;
                                                cdVar4.f780b = a.f729a;
                                                cdVar4.f781c = a.f730b;
                                                cdVar4.f782d = ceVar;
                                                cdVar4.f786h = C0196a.m1206a(a.f732d);
                                                hlVar.f1061a.add(cdVar4.m1314a());
                                            }
                                            obj2 = obj;
                                            break;
                                        }
                                    }
                                }
                            }
                            hlVar.f1061a = Collections.emptyList();
                            eaVar.close();
                            return hlVar;
                        } else if (obj != null) {
                            throw new XmlPullParserException("Unexpected XML: Can't have two ASX elements in the same document.");
                        } else {
                            obj2 = 1;
                            continue;
                        }
                        break;
                }
                obj2 = obj;
                obj = obj2;
            }
            eaVar.close();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
            hlVar.f1061a = Collections.emptyList();
        } catch (IOException e2) {
            e2.printStackTrace();
            hlVar.f1061a = Collections.emptyList();
        } catch (Throwable th) {
            eaVar.close();
        }
        return hlVar;
    }

    public final List m1209a() {
        return f626a;
    }

    public final boolean m1210b() {
        return true;
    }

    public final void m1211c() {
        this.f628c = true;
    }
}
