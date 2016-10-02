package android.support.v4.p001b;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.b.g */
abstract class C0030g {
    C0037i f13b;
    C0038j f14c;
    C0040l f15d;

    C0030g() {
    }

    public static boolean m12a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    protected abstract int m13a();

    protected abstract int m14a(Object obj);

    protected abstract Object m15a(int i, int i2);

    protected abstract Object m16a(int i, Object obj);

    protected abstract void m17a(int i);

    protected abstract void m18a(Object obj, Object obj2);

    public final Object[] m19a(Object[] objArr, int i) {
        int a = m13a();
        Object[] objArr2 = objArr.length < a ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a) : objArr;
        for (int i2 = 0; i2 < a; i2++) {
            objArr2[i2] = m15a(i2, i);
        }
        if (objArr2.length > a) {
            objArr2[a] = null;
        }
        return objArr2;
    }

    protected abstract int m20b(Object obj);

    protected abstract Map m21b();

    public final Object[] m22b(int i) {
        int a = m13a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = m15a(i2, i);
        }
        return objArr;
    }

    protected abstract void m23c();
}
