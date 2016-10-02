package com.andromo.dev576782.app537736;

enum eg extends eb {
    eg(String str) {
        super(4, (byte) 0);
    }

    public final eb m1376a(char c, dp dpVar, dp dpVar2) {
        eb ebVar;
        if (dpVar2.m1337a() <= 5) {
            eb.m1360a(dpVar2);
            ebVar = i;
        } else if (c == '&') {
            eb.m1360a(dpVar2);
            ebVar = h;
        } else if (!Character.isLetter(c)) {
            if (c == '#') {
                if (dpVar2.f841d == 1) {
                    ebVar = g;
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

    public final boolean m1377a() {
        return true;
    }

    public final boolean m1378b() {
        return true;
    }
}
