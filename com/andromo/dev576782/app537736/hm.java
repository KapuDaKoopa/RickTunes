package com.andromo.dev576782.app537736;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class hm implements hk {
    static final List f1064a;
    private boolean f1065b;
    private volatile boolean f1066c;

    static {
        List arrayList = new ArrayList();
        arrayList.add("application/rss+xml");
        arrayList.add("application/atom+xml");
        arrayList.add("application/xml");
        arrayList.add("text/xml");
        f1064a = Collections.unmodifiableList(arrayList);
    }

    public hm() {
        this.f1065b = true;
    }

    private hn m1558a(XmlPullParser xmlPullParser, String str) {
        hn hnVar = new hn();
        while (!this.f1066c) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String prefix = xmlPullParser.getPrefix();
                if (prefix == null) {
                    prefix = "";
                }
                if (prefix.length() == 0) {
                    if ("enclosure".equalsIgnoreCase(name)) {
                        prefix = in.m1603a(xmlPullParser, "url");
                        if (prefix.length() > 0) {
                            if (!URLUtil.isValidUrl(prefix)) {
                                name = gr.m1516a(prefix, str);
                                if (name.length() > 0 && gr.m1518a(name)) {
                                    hnVar.f1071e = name;
                                }
                            }
                            hnVar.f1071e = prefix;
                        }
                        prefix = in.m1603a(xmlPullParser, "type");
                        if (prefix.length() > 0) {
                            hnVar.f1072f = prefix;
                        }
                    } else if ("title".equalsIgnoreCase(name)) {
                        hnVar.f1067a = in.m1602a(xmlPullParser);
                    } else if ("description".equalsIgnoreCase(name)) {
                        if (hnVar.f1068b.length() == 0) {
                            if (this.f1065b) {
                                hnVar.f1068b = HtmlUtils.m1123a(in.m1602a(xmlPullParser));
                            } else {
                                hnVar.f1068b = in.m1602a(xmlPullParser);
                            }
                        }
                    } else if ("author".equalsIgnoreCase(name)) {
                        if (hnVar.f1069c.length() == 0) {
                            hnVar.f1069c = in.m1602a(xmlPullParser);
                        }
                    } else if ("pubDate".equalsIgnoreCase(name)) {
                        hnVar.f1070d = dt.m1347a(in.m1602a(xmlPullParser));
                    }
                } else if ("itunes".equalsIgnoreCase(prefix)) {
                    if ("itunes".equalsIgnoreCase(prefix) && "summary".equalsIgnoreCase(name)) {
                        if (this.f1065b) {
                            hnVar.f1068b = HtmlUtils.m1123a(in.m1602a(xmlPullParser));
                        } else {
                            hnVar.f1068b = in.m1602a(xmlPullParser);
                        }
                    } else if ("author".equalsIgnoreCase(name)) {
                        hnVar.f1069c = in.m1602a(xmlPullParser);
                    } else if ("duration".equalsIgnoreCase(name)) {
                        prefix = in.m1602a(xmlPullParser);
                        if (prefix != null && prefix.length() > 0) {
                            String[] split = prefix.split(":");
                            try {
                                if (split.length >= 3) {
                                    hnVar.f1073g = Integer.parseInt(split[2]) + (((Integer.parseInt(split[0]) * 60) * 60) + (Integer.parseInt(split[1]) * 60));
                                } else if (split.length == 2) {
                                    hnVar.f1073g = Integer.parseInt(split[1]) + (Integer.parseInt(split[0]) * 60);
                                } else {
                                    hnVar.f1073g = Integer.parseInt(split[0]);
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                    }
                }
            } else if (next == 3) {
                if ("item".equalsIgnoreCase(xmlPullParser.getName())) {
                    break;
                }
            } else {
                continue;
            }
        }
        return hnVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.andromo.dev576782.app537736.hl m1559a(java.io.ByteArrayInputStream r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.andromo.dev576782.app537736.ce r24, java.lang.String r25) {
        /*
        r19 = this;
        r15 = new com.andromo.dev576782.app537736.hl;
        r15.<init>();
        r3 = java.util.Collections.emptyList();
        r15.f1061a = r3;
        r16 = new com.andromo.dev576782.app537736.hi;
        r16.<init>();
        r14 = 0;
        r5 = 0;
        r4 = 0;
        r3 = org.xmlpull.v1.XmlPullParserFactory.newInstance();	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
        r6 = 1;
        r3.setNamespaceAware(r6);	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
        r17 = r3.newPullParser();	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
        r18 = new com.andromo.dev576782.app537736.ea;	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
        r3 = new java.io.InputStreamReader;	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
        r0 = r20;
        r1 = r25;
        r3.<init>(r0, r1);	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
        r0 = r18;
        r0.<init>(r3);	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
        r3 = 0;
        r0 = r17;
        r1 = r20;
        r0.setInput(r1, r3);	 Catch:{ all -> 0x0243 }
        r3 = r17.getEventType();	 Catch:{ all -> 0x0243 }
        r12 = r4;
        r13 = r5;
    L_0x003d:
        r4 = 1;
        if (r3 == r4) goto L_0x009f;
    L_0x0040:
        r0 = r19;
        r4 = r0.f1066c;	 Catch:{ all -> 0x007d }
        if (r4 != 0) goto L_0x009f;
    L_0x0046:
        if (r3 != 0) goto L_0x005a;
    L_0x0048:
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x007d }
        r3.<init>();	 Catch:{ all -> 0x007d }
        r15.f1061a = r3;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
    L_0x0052:
        r3 = r17.next();	 Catch:{ all -> 0x0243 }
        r12 = r4;
        r14 = r13;
        r13 = r5;
        goto L_0x003d;
    L_0x005a:
        r4 = 2;
        if (r3 != r4) goto L_0x0214;
    L_0x005d:
        r4 = r17.getName();	 Catch:{ all -> 0x007d }
        r3 = r17.getPrefix();	 Catch:{ all -> 0x007d }
        if (r3 != 0) goto L_0x0069;
    L_0x0067:
        r3 = "";
    L_0x0069:
        r5 = "rss";
        r5 = r5.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r5 == 0) goto L_0x0097;
    L_0x0071:
        if (r14 != 0) goto L_0x0075;
    L_0x0073:
        if (r13 == 0) goto L_0x0093;
    L_0x0075:
        r3 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ all -> 0x007d }
        r4 = "Unexpected XML: Can't have two RSS elements in the same document.";
        r3.<init>(r4);	 Catch:{ all -> 0x007d }
        throw r3;	 Catch:{ all -> 0x007d }
    L_0x007d:
        r3 = move-exception;
        r4 = r12;
        r5 = r13;
    L_0x0080:
        r18.close();	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
        throw r3;	 Catch:{ XmlPullParserException -> 0x0084, IOException -> 0x0237 }
    L_0x0084:
        r3 = move-exception;
    L_0x0085:
        r3.printStackTrace();
        if (r5 == 0) goto L_0x008c;
    L_0x008a:
        if (r4 != 0) goto L_0x0092;
    L_0x008c:
        r3 = java.util.Collections.emptyList();
        r15.f1061a = r3;
    L_0x0092:
        return r15;
    L_0x0093:
        r13 = 1;
        r4 = r12;
        r5 = r13;
        goto L_0x0052;
    L_0x0097:
        if (r14 != 0) goto L_0x00b1;
    L_0x0099:
        r3 = java.util.Collections.emptyList();	 Catch:{ all -> 0x007d }
        r15.f1061a = r3;	 Catch:{ all -> 0x007d }
    L_0x009f:
        r3 = new com.andromo.dev576782.app537736.PlaylistInfo;	 Catch:{ all -> 0x007d }
        r4 = 0;
        r0 = r16;
        r3.<init>(r4);	 Catch:{ all -> 0x007d }
        r15.f1062b = r3;	 Catch:{ all -> 0x007d }
        r18.close();	 Catch:{ XmlPullParserException -> 0x00ad, IOException -> 0x0237 }
        goto L_0x0092;
    L_0x00ad:
        r3 = move-exception;
        r4 = r12;
        r5 = r13;
        goto L_0x0085;
    L_0x00b1:
        r5 = "channel";
        r5 = r5.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r5 == 0) goto L_0x00c0;
    L_0x00b9:
        if (r13 == 0) goto L_0x020f;
    L_0x00bb:
        r12 = 1;
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x00c0:
        r5 = "item";
        r5 = r5.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r5 == 0) goto L_0x013b;
    L_0x00c8:
        if (r13 == 0) goto L_0x009f;
    L_0x00ca:
        if (r12 == 0) goto L_0x009f;
    L_0x00cc:
        r0 = r19;
        r1 = r17;
        r2 = r21;
        r7 = r0.m1558a(r1, r2);	 Catch:{ all -> 0x007d }
        r3 = 1;
        if (r7 == 0) goto L_0x00fe;
    L_0x00d9:
        r4 = "";
        r5 = r7.f1071e;	 Catch:{ all -> 0x007d }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x007d }
        if (r4 != 0) goto L_0x00fe;
    L_0x00e3:
        r4 = r7.f1072f;	 Catch:{ all -> 0x007d }
        if (r4 == 0) goto L_0x00fe;
    L_0x00e7:
        r4 = r7.f1072f;	 Catch:{ all -> 0x007d }
        r4 = r4.length();	 Catch:{ all -> 0x007d }
        if (r4 <= 0) goto L_0x00fe;
    L_0x00ef:
        r4 = r7.f1072f;	 Catch:{ all -> 0x007d }
        r4 = r4.toLowerCase();	 Catch:{ all -> 0x007d }
        r5 = "audio";
        r4 = r4.contains(r5);	 Catch:{ all -> 0x007d }
        if (r4 != 0) goto L_0x00fe;
    L_0x00fd:
        r3 = 0;
    L_0x00fe:
        if (r3 == 0) goto L_0x0136;
    L_0x0100:
        r3 = "";
        r4 = r7.f1067a;	 Catch:{ all -> 0x007d }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x010e;
    L_0x010a:
        r0 = r22;
        r7.f1067a = r0;	 Catch:{ all -> 0x007d }
    L_0x010e:
        r3 = "";
        r4 = r7.f1068b;	 Catch:{ all -> 0x007d }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x011c;
    L_0x0118:
        r0 = r23;
        r7.f1068b = r0;	 Catch:{ all -> 0x007d }
    L_0x011c:
        r3 = new com.andromo.dev576782.app537736.AudioItem;	 Catch:{ all -> 0x007d }
        r4 = r7.f1071e;	 Catch:{ all -> 0x007d }
        r5 = r7.f1067a;	 Catch:{ all -> 0x007d }
        r6 = r7.f1068b;	 Catch:{ all -> 0x007d }
        r8 = r7.f1069c;	 Catch:{ all -> 0x007d }
        r9 = "";
        r10 = r7.f1070d;	 Catch:{ all -> 0x007d }
        r11 = r7.f1073g;	 Catch:{ all -> 0x007d }
        r7 = r24;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x007d }
        r4 = r15.f1061a;	 Catch:{ all -> 0x007d }
        r4.add(r3);	 Catch:{ all -> 0x007d }
    L_0x0136:
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x013b:
        if (r13 == 0) goto L_0x020f;
    L_0x013d:
        if (r12 == 0) goto L_0x020f;
    L_0x013f:
        r5 = r3.length();	 Catch:{ all -> 0x007d }
        if (r5 != 0) goto L_0x0184;
    L_0x0145:
        r3 = "title";
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x015a;
    L_0x014d:
        r3 = com.andromo.dev576782.app537736.in.m1602a(r17);	 Catch:{ all -> 0x007d }
        r0 = r16;
        r0.f1039a = r3;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x015a:
        r3 = "description";
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x016f;
    L_0x0162:
        r3 = com.andromo.dev576782.app537736.in.m1602a(r17);	 Catch:{ all -> 0x007d }
        r0 = r16;
        r0.f1041c = r3;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x016f:
        r3 = "link";
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x020f;
    L_0x0177:
        r3 = com.andromo.dev576782.app537736.in.m1602a(r17);	 Catch:{ all -> 0x007d }
        r0 = r16;
        r0.f1043e = r3;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x0184:
        r5 = "itunes";
        r3 = r5.equalsIgnoreCase(r3);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x020f;
    L_0x018c:
        r3 = "subtitle";
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x01a1;
    L_0x0194:
        r3 = com.andromo.dev576782.app537736.in.m1602a(r17);	 Catch:{ all -> 0x007d }
        r0 = r16;
        r0.f1040b = r3;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x01a1:
        r3 = "summary";
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x01b6;
    L_0x01a9:
        r3 = com.andromo.dev576782.app537736.in.m1602a(r17);	 Catch:{ all -> 0x007d }
        r0 = r16;
        r0.f1041c = r3;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x01b6:
        r3 = "author";
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x01cb;
    L_0x01be:
        r3 = com.andromo.dev576782.app537736.in.m1602a(r17);	 Catch:{ all -> 0x007d }
        r0 = r16;
        r0.f1042d = r3;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x01cb:
        r3 = "image";
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x020f;
    L_0x01d3:
        r3 = "href";
        r0 = r17;
        r3 = com.andromo.dev576782.app537736.in.m1603a(r0, r3);	 Catch:{ all -> 0x007d }
        r4 = r3.length();	 Catch:{ all -> 0x007d }
        if (r4 <= 0) goto L_0x020f;
    L_0x01e1:
        r4 = android.webkit.URLUtil.isValidUrl(r3);	 Catch:{ all -> 0x007d }
        if (r4 == 0) goto L_0x01f0;
    L_0x01e7:
        r0 = r16;
        r0.f1044f = r3;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x01f0:
        r0 = r21;
        r4 = com.andromo.dev576782.app537736.gr.m1516a(r3, r0);	 Catch:{ all -> 0x007d }
        r5 = r4.length();	 Catch:{ all -> 0x007d }
        if (r5 <= 0) goto L_0x020b;
    L_0x01fc:
        r5 = com.andromo.dev576782.app537736.gr.m1518a(r4);	 Catch:{ all -> 0x007d }
        if (r5 == 0) goto L_0x020b;
    L_0x0202:
        r0 = r16;
        r0.f1044f = r4;	 Catch:{ all -> 0x007d }
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x020b:
        r0 = r16;
        r0.f1044f = r3;	 Catch:{ all -> 0x007d }
    L_0x020f:
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x0214:
        r4 = 3;
        if (r3 != r4) goto L_0x0246;
    L_0x0217:
        r3 = r17.getName();	 Catch:{ all -> 0x007d }
        r4 = "channel";
        r4 = r4.equalsIgnoreCase(r3);	 Catch:{ all -> 0x007d }
        if (r4 == 0) goto L_0x0229;
    L_0x0223:
        r12 = 0;
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x0229:
        r4 = "rss";
        r3 = r4.equalsIgnoreCase(r3);	 Catch:{ all -> 0x007d }
        if (r3 == 0) goto L_0x0246;
    L_0x0231:
        r13 = 0;
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
    L_0x0237:
        r3 = move-exception;
        r3.printStackTrace();
        r3 = java.util.Collections.emptyList();
        r15.f1061a = r3;
        goto L_0x0092;
    L_0x0243:
        r3 = move-exception;
        goto L_0x0080;
    L_0x0246:
        r4 = r12;
        r5 = r13;
        r13 = r14;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andromo.dev576782.app537736.hm.a(java.io.ByteArrayInputStream, java.lang.String, java.lang.String, java.lang.String, com.andromo.dev576782.app537736.ce, java.lang.String):com.andromo.dev576782.app537736.hl");
    }

    public final List m1560a() {
        return f1064a;
    }

    public final boolean m1561b() {
        return true;
    }

    public final void m1562c() {
        this.f1066c = true;
    }
}
