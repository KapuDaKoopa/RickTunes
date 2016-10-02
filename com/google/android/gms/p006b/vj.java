package com.google.android.gms.p006b;

import com.google.android.gms.auth.api.signin.internal.IdpTokenType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.b.vj */
final class vj implements InvocationHandler {
    final /* synthetic */ Class f4282a;
    final /* synthetic */ vi f4283b;

    vj(vi viVar, Class cls) {
        this.f4283b = viVar;
        this.f4282a = cls;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Class cls = Class.forName("com.facebook.SessionState");
        Class[] parameterTypes = method.getParameterTypes();
        if (method.getName().equals("call") && parameterTypes.length == 3 && parameterTypes[0] == this.f4282a && parameterTypes[1] == cls && parameterTypes[2] == Exception.class) {
            if (((Boolean) this.f4282a.getDeclaredMethod("isOpened", new Class[0]).invoke(objArr[0], new Object[0])).booleanValue()) {
                this.f4283b.f4275d.m3293a(vi.m4803a(this.f4283b, IdpTokenType.f2792a, (String) this.f4282a.getDeclaredMethod("getAccessToken", new Class[0]).invoke(objArr[0], new Object[0]), this.f4283b.f4274c));
            }
            return null;
        }
        throw new ExceptionInInitializerError("Method not supported!");
    }
}
