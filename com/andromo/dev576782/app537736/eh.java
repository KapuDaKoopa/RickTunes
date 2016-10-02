package com.andromo.dev576782.app537736;

enum eh extends eb {
    eh(String str) {
        super(5, (byte) 0);
    }

    public final eb m1379a(char c, dp dpVar, dp dpVar2) {
        eb ebVar;
        if (dpVar2.m1337a() <= 5) {
            eb.m1360a(dpVar2);
            ebVar = i;
        } else if (c == '&') {
            eb.m1360a(dpVar2);
            ebVar = h;
        } else if (!(Character.isDigit(c) || c == 'a' || c == 'A' || c == 'b' || c == 'B' || c == 'c' || c == 'C' || c == 'd' || c == 'D' || c == 'e' || c == 'E' || c == 'f' || c == 'F')) {
            if (c != ';') {
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

    public final boolean m1380a() {
        return true;
    }

    public final boolean m1381b() {
        return true;
    }
}
