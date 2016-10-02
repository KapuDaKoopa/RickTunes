package com.google.android.gms.p017a;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.a.d */
public final class C0317d extends C0315b {
    private final Object f1720a;

    private C0317d(Object obj) {
        this.f1720a = obj;
    }

    public static C0314a m1996a(Object obj) {
        return new C0317d(obj);
    }

    public static Object m1997a(C0314a c0314a) {
        if (c0314a instanceof C0317d) {
            return ((C0317d) c0314a).f1720a;
        }
        IBinder asBinder = c0314a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (Throwable e22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
