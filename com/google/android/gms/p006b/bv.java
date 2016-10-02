package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.PriorityQueue;

@op
/* renamed from: com.google.android.gms.b.bv */
public final class bv {
    private static long m3531a(long j, int i) {
        return i == 0 ? 1 : i != 1 ? i % 2 == 0 ? bv.m3531a((j * j) % 1073807359, i / 2) % 1073807359 : ((bv.m3531a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    private static long m3532a(String[] strArr, int i) {
        long a = (((long) bt.m3528a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i + 0; i2++) {
            a = (((a * 16785407) % 1073807359) + ((((long) bt.m3528a(strArr[i2])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }

    private static String m3533a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            C0501b.m3027a(6);
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(' ');
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    private static void m3534a(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        bw bwVar = new bw(j, str, i2);
        if ((priorityQueue.size() != i || ((bw) priorityQueue.peek()).f3006a <= bwVar.f3006a) && !priorityQueue.contains(bwVar)) {
            priorityQueue.add(bwVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void m3535a(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        if (strArr.length < i2) {
            bv.m3534a(i, bv.m3532a(strArr, strArr.length), bv.m3533a(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long a = bv.m3532a(strArr, i2);
        bv.m3534a(i, a, bv.m3533a(strArr, 0, i2), i2, priorityQueue);
        long a2 = bv.m3531a(16785407, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            a += 1073807359;
            a = (((((a - ((((((long) bt.m3528a(strArr[i3 - 1])) + 2147483647L) % 1073807359) * a2) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) bt.m3528a(strArr[(i3 + i2) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            bv.m3534a(i, a, bv.m3533a(strArr, i3, i2), strArr.length, priorityQueue);
        }
    }
}
