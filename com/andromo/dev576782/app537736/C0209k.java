package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.andromo.dev576782.app537736.k */
final class C0209k implements OnNavigationListener {
    String[] f1179a;
    String[] f1180b;
    final String f1181c;
    final /* synthetic */ Context f1182d;
    final /* synthetic */ int f1183e;
    final /* synthetic */ int f1184f;
    final /* synthetic */ int f1185g;
    final /* synthetic */ Activity f1186h;
    final /* synthetic */ ActionBar f1187i;

    C0209k(Context context, int i, Activity activity, ActionBar actionBar) {
        this.f1182d = context;
        this.f1183e = 2131623936;
        this.f1184f = 2131623938;
        this.f1185g = i;
        this.f1186h = activity;
        this.f1187i = actionBar;
        this.f1179a = this.f1182d.getResources().getStringArray(this.f1183e);
        this.f1180b = this.f1182d.getResources().getStringArray(this.f1184f);
        this.f1181c = this.f1182d.getPackageName();
    }

    public final boolean onNavigationItemSelected(int i, long j) {
        String str = this.f1179a[i];
        if (i != this.f1185g) {
            if (i < this.f1180b.length) {
                String[] strArr = this.f1180b;
                String str2 = this.f1181c + "." + this.f1180b[i];
                try {
                    Class cls = Class.forName(str2);
                    if (Activity.class.isAssignableFrom(cls)) {
                        Intent intent = new Intent(this.f1182d, cls);
                        intent.addFlags(67108864);
                        aw.m1294a(this.f1186h, intent);
                    } else {
                        Object newInstance = cls.newInstance();
                        for (Method method : cls.getDeclaredMethods()) {
                            if (method.getName().equals("runIntent")) {
                                try {
                                    method.invoke(newInstance, new Object[]{this.f1182d});
                                    this.f1187i.setSelectedNavigationItem(this.f1185g);
                                } catch (InvocationTargetException e) {
                                    this.f1187i.setSelectedNavigationItem(this.f1185g);
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                    Toast.makeText(this.f1182d, "Unknown class '" + str2 + "' for '" + str + "' activity.", 0).show();
                    this.f1187i.setSelectedNavigationItem(this.f1185g);
                } catch (InstantiationException e3) {
                    this.f1187i.setSelectedNavigationItem(this.f1185g);
                } catch (IllegalAccessException e4) {
                    this.f1187i.setSelectedNavigationItem(this.f1185g);
                }
            } else {
                Toast.makeText(this.f1182d, "The '" + str + "' activity does not exist yet.", 0).show();
                this.f1187i.setSelectedNavigationItem(this.f1185g);
            }
        }
        return true;
    }
}
