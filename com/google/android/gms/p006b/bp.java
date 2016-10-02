package com.google.android.gms.p006b;

import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@op
/* renamed from: com.google.android.gms.b.bp */
public final class bp {
    private final int f2997a;
    private final int f2998b;
    private final int f2999c;
    private final bo f3000d;

    public bp(int i) {
        this.f3000d = new bu();
        this.f2998b = i;
        this.f2997a = 6;
        this.f2999c = 0;
    }

    private String m3524a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        bs bsVar = new bs();
        Arrays.sort(split, new bq(this));
        int i = 0;
        while (i < split.length && i < this.f2998b) {
            if (split[i].trim().length() != 0) {
                try {
                    bsVar.m3527a(this.f3000d.m3523a(split[i]));
                } catch (IOException e) {
                    C0501b.m3027a(6);
                }
            }
            i++;
        }
        return bsVar.toString();
    }

    private String m3525b(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        bs bsVar = new bs();
        PriorityQueue priorityQueue = new PriorityQueue(this.f2998b, new br(this));
        for (String b : split) {
            String[] b2 = bt.m3529b(b);
            if (b2.length != 0) {
                bv.m3535a(b2, this.f2998b, this.f2997a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                bsVar.m3527a(this.f3000d.m3523a(((bw) it.next()).f3007b));
            } catch (IOException e) {
                C0501b.m3027a(6);
            }
        }
        return bsVar.toString();
    }

    public final String m3526a(ArrayList arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        switch (this.f2999c) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                return m3525b(stringBuffer.toString());
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return m3524a(stringBuffer.toString());
            default:
                return "";
        }
    }
}
