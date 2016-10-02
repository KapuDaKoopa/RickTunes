package com.andromo.dev576782.app537736;

enum ei extends eb {
    ei(String str) {
        super(6, (byte) 0);
    }

    public final eb m1382a(char c, dp dpVar, dp dpVar2) {
        eb ebVar;
        if (dpVar2.m1337a() <= 5) {
            eb.m1360a(dpVar2);
            ebVar = i;
        } else if (c == '&') {
            eb.m1360a(dpVar2);
            ebVar = h;
        } else if (!Character.isDigit(c)) {
            if (c == 'x') {
                if (dpVar2.f841d == 2) {
                    ebVar = f;
                } else {
                    eb.m1360a(dpVar2);
                    ebVar = i;
                }
            } else if (c != ';') {
                eb.m1360a(dpVar2);
                ebVar = i;
            } else if (c == ';') {
                ebVar = i;
            }
        }
        dpVar2.m1342b(c);
        dpVar.m1342b(c);
        return ebVar;
    }

    public final boolean m1383a() {
        return true;
    }

    public final boolean m1384b() {
        return true;
    }
}
