package com.google.tagmanager;

import com.google.analytics.p009a.p010a.C0272a;
import com.google.analytics.p014b.p015a.p016a.C0286b;
import com.google.android.gms.C0772e;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class aw {
    private static final ak f5091a;
    private final C0820v f5092b;
    private final Map f5093c;
    private final Map f5094d;
    private final Map f5095e;
    private final C0801b f5096f;
    private final C0801b f5097g;
    private final Set f5098h;
    private final C0805f f5099i;
    private final Map f5100j;
    private volatile String f5101k;

    static {
        f5091a = new ak(bl.m5870a(), true);
    }

    private ak m5846a(C0286b c0286b, Set set, bm bmVar) {
        if (!c0286b.f1491n) {
            return new ak(c0286b, true);
        }
        C0286b a;
        int i;
        ak a2;
        switch (c0286b.f1479b) {
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                a = as.m5845a(c0286b);
                a.f1481d = new C0286b[c0286b.f1481d.length];
                for (i = 0; i < c0286b.f1481d.length; i++) {
                    a2 = m5846a(c0286b.f1481d[i], set, bmVar.m5829a());
                    if (a2 == f5091a) {
                        return f5091a;
                    }
                    a.f1481d[i] = (C0286b) a2.f5069a;
                }
                return new ak(a, false);
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                a = as.m5845a(c0286b);
                if (c0286b.f1482e.length != c0286b.f1483f.length) {
                    "Invalid serving value: " + c0286b.toString();
                    C0824z.m5936a();
                    return f5091a;
                }
                a.f1482e = new C0286b[c0286b.f1482e.length];
                a.f1483f = new C0286b[c0286b.f1482e.length];
                for (i = 0; i < c0286b.f1482e.length; i++) {
                    a2 = m5846a(c0286b.f1482e[i], set, bmVar.m5830b());
                    ak a3 = m5846a(c0286b.f1483f[i], set, bmVar.m5831c());
                    if (a2 == f5091a || a3 == f5091a) {
                        return f5091a;
                    }
                    a.f1482e[i] = (C0286b) a2.f5069a;
                    a.f1483f[i] = (C0286b) a3.f5069a;
                }
                return new ak(a, false);
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                if (set.contains(c0286b.f1484g)) {
                    "Macro cycle detected.  Current macro reference: " + c0286b.f1484g + ".  Previous macro references: " + set.toString() + ".";
                    C0824z.m5936a();
                    return f5091a;
                }
                set.add(c0286b.f1484g);
                a2 = bn.m5877a(m5849a(c0286b.f1484g, set, bmVar.m5833e()), c0286b.f1490m);
                set.remove(c0286b.f1484g);
                return a2;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                a = as.m5845a(c0286b);
                a.f1488k = new C0286b[c0286b.f1488k.length];
                for (i = 0; i < c0286b.f1488k.length; i++) {
                    a2 = m5846a(c0286b.f1488k[i], set, bmVar.m5832d());
                    if (a2 == f5091a) {
                        return f5091a;
                    }
                    a.f1488k[i] = (C0286b) a2.f5069a;
                }
                return new ak(a, false);
            default:
                "Unknown type: " + c0286b.f1479b;
                C0824z.m5936a();
                return f5091a;
        }
    }

    private ak m5847a(at atVar, Set set, ao aoVar) {
        ak a = m5850a(this.f5094d, atVar, set, aoVar);
        Object b = bl.m5873b((C0286b) a.f5069a);
        bl.m5871a(b);
        return new ak(b, a.f5070b);
    }

    private ak m5848a(au auVar, Set set, ar arVar) {
        boolean z = true;
        for (at a : auVar.f5084b) {
            ak a2 = m5847a(a, set, arVar.m5815a());
            if (((Boolean) a2.f5069a).booleanValue()) {
                bl.m5871a(Boolean.valueOf(false));
                return new ak(Boolean.valueOf(false), a2.f5070b);
            }
            boolean z2 = z && a2.f5070b;
            z = z2;
        }
        for (at a3 : auVar.f5083a) {
            a2 = m5847a(a3, set, arVar.m5816b());
            if (((Boolean) a2.f5069a).booleanValue()) {
                z = z && a2.f5070b;
            } else {
                bl.m5871a(Boolean.valueOf(false));
                return new ak(Boolean.valueOf(false), a2.f5070b);
            }
        }
        bl.m5871a(Boolean.valueOf(true));
        return new ak(Boolean.valueOf(true), z);
    }

    private ak m5849a(String str, Set set, ac acVar) {
        ba baVar = (ba) this.f5097g.m5859a();
        if (baVar == null || this.f5092b.m5929b()) {
            bb bbVar = (bb) this.f5100j.get(str);
            if (bbVar == null) {
                "Invalid macro: " + str;
                C0824z.m5936a();
                return f5091a;
            }
            at atVar;
            ak a = m5851a(bbVar.f5110a, bbVar.f5111b, bbVar.f5113d, bbVar.f5112c, bbVar.f5114e, set, acVar.m5808b());
            if (((Set) a.f5069a).isEmpty()) {
                atVar = bbVar.f5115f;
            } else {
                if (((Set) a.f5069a).size() > 1) {
                    C0824z.m5937a("Multiple macros active for macroName " + str);
                }
                atVar = (at) ((Set) a.f5069a).iterator().next();
            }
            if (atVar == null) {
                return f5091a;
            }
            ak a2 = m5850a(this.f5095e, atVar, set, acVar.m5807a());
            boolean z = a.f5070b && a2.f5070b;
            ak akVar = a2 == f5091a ? f5091a : new ak(a2.f5069a, z);
            C0286b c0286b = atVar.f5082b;
            if (akVar.f5070b) {
                C0801b c0801b = this.f5097g;
                ba baVar2 = new ba(akVar, c0286b);
            }
            m5853a(c0286b, set);
            return akVar;
        }
        m5853a(baVar.f5109b, set);
        return baVar.f5108a;
    }

    private ak m5850a(Map map, at atVar, Set set, ao aoVar) {
        C0286b c0286b = (C0286b) Collections.unmodifiableMap(atVar.f5081a).get(C0272a.FUNCTION.toString());
        if (c0286b == null) {
            C0824z.m5936a();
            return f5091a;
        }
        String str = c0286b.f1485h;
        C0821w c0821w = (C0821w) map.get(str);
        if (c0821w == null) {
            str + " has no backing implementation.";
            C0824z.m5936a();
            return f5091a;
        }
        ak akVar = (ak) this.f5096f.m5859a();
        if (akVar != null && !this.f5092b.m5929b()) {
            return akVar;
        }
        Map hashMap = new HashMap();
        Object obj = 1;
        for (Entry entry : Collections.unmodifiableMap(atVar.f5081a).entrySet()) {
            entry.getKey();
            aq a = aoVar.m5811a();
            C0286b c0286b2 = (C0286b) entry.getValue();
            entry.getValue();
            ak a2 = m5846a(c0286b2, set, a.m5813a());
            if (a2 == f5091a) {
                return f5091a;
            }
            Object obj2;
            if (a2.f5070b) {
                atVar.f5081a.put((String) entry.getKey(), (C0286b) a2.f5069a);
                obj2 = obj;
            } else {
                obj2 = null;
            }
            hashMap.put(entry.getKey(), a2.f5069a);
            obj = obj2;
        }
        if (hashMap.keySet().containsAll(c0821w.f5175a)) {
            boolean z = obj != null && c0821w.m5930a();
            ak akVar2 = new ak(c0821w.m5931b(), z);
            if (z) {
                C0801b c0801b = this.f5096f;
            }
            Object obj3 = akVar2.f5069a;
            return akVar2;
        }
        "Incorrect keys for function " + str + " required " + c0821w.f5175a + " had " + hashMap.keySet();
        C0824z.m5936a();
        return f5091a;
    }

    private ak m5851a(Set set, Map map, Map map2, Map map3, Map map4, Set set2, av avVar) {
        return m5852a(set, set2, new ax(this, map, map2, map3, map4), avVar);
    }

    private ak m5852a(Set set, Set set2, az azVar, av avVar) {
        Set hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        boolean z = true;
        for (au auVar : set) {
            ar a = avVar.m5827a();
            ak a2 = m5848a(auVar, set2, a);
            if (((Boolean) a2.f5069a).booleanValue()) {
                azVar.m5856a(auVar, hashSet, hashSet2, a);
            }
            boolean z2 = z && a2.f5070b;
            z = z2;
        }
        hashSet.removeAll(hashSet2);
        return new ak(hashSet, z);
    }

    private void m5853a(C0286b c0286b, Set set) {
        if (c0286b != null) {
            ak a = m5846a(c0286b, set, new aj());
            if (a != f5091a) {
                Object c = bl.m5875c((C0286b) a.f5069a);
                if (c instanceof Map) {
                    this.f5099i.m5894a((Map) c);
                } else if (c instanceof List) {
                    for (Object c2 : (List) c2) {
                        if (c2 instanceof Map) {
                            this.f5099i.m5894a((Map) c2);
                        } else {
                            C0824z.m5937a("pushAfterEvaluate: value not a Map");
                        }
                    }
                } else {
                    C0824z.m5937a("pushAfterEvaluate: value not a Map or List");
                }
            }
        }
    }

    private synchronized void m5854b(String str) {
        this.f5101k = str;
    }

    public final synchronized void m5855a(String str) {
        m5854b(str);
        C0811m a = this.f5092b.m5928a().m5927a();
        for (at a2 : (Set) m5852a(this.f5098h, new HashSet(), new ay(this), a.m5902b()).f5069a) {
            m5850a(this.f5093c, a2, new HashSet(), a.m5901a());
        }
        m5854b(null);
    }
}
