package com.google.tagmanager;

import com.google.analytics.p014b.p015a.p016a.C0286b;
import com.google.android.gms.C0772e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class bl {
    private static final Object f5131a;
    private static Long f5132b;
    private static Double f5133c;
    private static bk f5134d;
    private static String f5135e;
    private static Boolean f5136f;
    private static List f5137g;
    private static Map f5138h;
    private static C0286b f5139i;

    static {
        f5131a = null;
        f5132b = new Long(0);
        f5133c = new Double(0.0d);
        f5134d = bk.m5867a();
        f5135e = new String("");
        f5136f = new Boolean(false);
        f5137g = new ArrayList(0);
        f5138h = new HashMap();
        f5139i = m5871a(f5135e);
    }

    public static C0286b m5870a() {
        return f5139i;
    }

    public static C0286b m5871a(Object obj) {
        int i = 1;
        boolean z = false;
        C0286b c0286b = new C0286b();
        if (obj instanceof C0286b) {
            return (C0286b) obj;
        }
        if (obj instanceof String) {
            c0286b.f1479b = 1;
            c0286b.f1480c = (String) obj;
        } else if (obj instanceof List) {
            c0286b.f1479b = 2;
            List<Object> list = (List) obj;
            r5 = new ArrayList(list.size());
            r1 = false;
            for (Object a : list) {
                C0286b a2 = m5871a(a);
                if (a2 == f5139i) {
                    return f5139i;
                }
                r0 = r1 || a2.f1491n;
                r5.add(a2);
                r1 = r0;
            }
            c0286b.f1481d = (C0286b[]) r5.toArray(new C0286b[0]);
            z = r1;
        } else if (obj instanceof Map) {
            c0286b.f1479b = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            r5 = new ArrayList(entrySet.size());
            List arrayList = new ArrayList(entrySet.size());
            r1 = false;
            for (Entry entry : entrySet) {
                C0286b a3 = m5871a(entry.getKey());
                C0286b a4 = m5871a(entry.getValue());
                if (a3 == f5139i || a4 == f5139i) {
                    return f5139i;
                }
                r0 = r1 || a3.f1491n || a4.f1491n;
                r5.add(a3);
                arrayList.add(a4);
                r1 = r0;
            }
            c0286b.f1482e = (C0286b[]) r5.toArray(new C0286b[0]);
            c0286b.f1483f = (C0286b[]) arrayList.toArray(new C0286b[0]);
            z = r1;
        } else {
            r0 = (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof bk) && ((bk) obj).m5868b());
            if (r0) {
                c0286b.f1479b = 1;
                c0286b.f1480c = obj.toString();
            } else {
                if (!((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof bk) && ((bk) obj).m5869c()))) {
                    i = 0;
                }
                if (i != 0) {
                    long longValue;
                    c0286b.f1479b = 6;
                    if (obj instanceof Number) {
                        longValue = ((Number) obj).longValue();
                    } else {
                        C0824z.m5936a();
                        longValue = 0;
                    }
                    c0286b.f1486i = longValue;
                } else if (obj instanceof Boolean) {
                    c0286b.f1479b = 8;
                    c0286b.f1487j = ((Boolean) obj).booleanValue();
                } else {
                    "Converting to Value from unknown object type: " + (obj == null ? "null" : obj.getClass().toString());
                    C0824z.m5936a();
                    return f5139i;
                }
            }
        }
        c0286b.f1491n = z;
        return c0286b;
    }

    public static String m5872a(C0286b c0286b) {
        return m5874b(m5875c(c0286b));
    }

    public static Boolean m5873b(C0286b c0286b) {
        Object c = m5875c(c0286b);
        if (c instanceof Boolean) {
            return (Boolean) c;
        }
        String b = m5874b(c);
        return "true".equalsIgnoreCase(b) ? Boolean.TRUE : "false".equalsIgnoreCase(b) ? Boolean.FALSE : f5136f;
    }

    private static String m5874b(Object obj) {
        return obj == null ? f5135e : obj.toString();
    }

    public static Object m5875c(C0286b c0286b) {
        int i = 0;
        if (c0286b == null) {
            return f5131a;
        }
        C0286b[] c0286bArr;
        int length;
        switch (c0286b.f1479b) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return c0286b.f1480c;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                ArrayList arrayList = new ArrayList(c0286b.f1481d.length);
                c0286bArr = c0286b.f1481d;
                length = c0286bArr.length;
                while (i < length) {
                    Object c = m5875c(c0286bArr[i]);
                    if (c == f5131a) {
                        return f5131a;
                    }
                    arrayList.add(c);
                    i++;
                }
                return arrayList;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                if (c0286b.f1482e.length != c0286b.f1483f.length) {
                    "Converting an invalid value to object: " + c0286b.toString();
                    C0824z.m5936a();
                    return f5131a;
                }
                Map linkedHashMap = new LinkedHashMap(c0286b.f1483f.length);
                while (i < c0286b.f1482e.length) {
                    Object c2 = m5875c(c0286b.f1482e[i]);
                    Object c3 = m5875c(c0286b.f1483f[i]);
                    if (c2 == f5131a || c3 == f5131a) {
                        return f5131a;
                    }
                    linkedHashMap.put(c2, c3);
                    i++;
                }
                return linkedHashMap;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                C0824z.m5936a();
                return f5131a;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                C0824z.m5936a();
                return f5131a;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                return Long.valueOf(c0286b.f1486i);
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                StringBuffer stringBuffer = new StringBuffer();
                c0286bArr = c0286b.f1488k;
                length = c0286bArr.length;
                while (i < length) {
                    String a = m5872a(c0286bArr[i]);
                    if (a == f5135e) {
                        return f5131a;
                    }
                    stringBuffer.append(a);
                    i++;
                }
                return stringBuffer.toString();
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                return Boolean.valueOf(c0286b.f1487j);
            default:
                "Failed to convert a value of type: " + c0286b.f1479b;
                C0824z.m5936a();
                return f5131a;
        }
    }
}
