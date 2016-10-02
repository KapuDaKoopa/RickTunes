package com.andromo.dev576782.app537736;

enum ec extends eb {
    ec(String str) {
        super(0, (byte) 0);
    }

    public final eb m1364a(char c, dp dpVar, dp dpVar2) {
        eb ebVar;
        if (c == '[') {
            if (dpVar.m1340a(eb.f863j)) {
                ebVar = d;
            }
        } else if (c == '-') {
            if (dpVar.m1340a(eb.f864k)) {
                ebVar = c;
            }
        } else if (c == '?') {
            int i = dpVar.f841d - 1;
            if (i >= 0 && i < dpVar.f841d) {
                char[] cArr = dpVar.f838a;
                i = dpVar.f840c;
                i = dpVar.f839b;
            }
            if (dpVar.m1344d() == '<') {
                ebVar = b;
            }
        } else if (c == '&') {
            ebVar = e;
            dpVar2.m1342b(c);
        }
        dpVar.m1342b(c);
        return ebVar;
    }

    public final boolean m1365a() {
        return false;
    }

    public final boolean m1366b() {
        return false;
    }
}
