package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C0591j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInOptions implements SafeParcelable {
    public static final Creator CREATOR;
    public static final Scope f2757a;
    public static final Scope f2758b;
    public static final Scope f2759c;
    public static final GoogleSignInOptions f2760d;
    private static Comparator f2761m;
    final int f2762e;
    private final ArrayList f2763f;
    private Account f2764g;
    private boolean f2765h;
    private final boolean f2766i;
    private final boolean f2767j;
    private String f2768k;
    private String f2769l;

    static {
        f2757a = new Scope("profile");
        f2758b = new Scope("email");
        f2759c = new Scope("openid");
        C0570d a = new C0570d().m3265a();
        a.f2779a.add(f2757a);
        f2760d = a.m3266b();
        CREATOR = new C0573g();
        f2761m = new C0569c();
    }

    GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.f2762e = i;
        this.f2763f = arrayList;
        this.f2764g = account;
        this.f2765h = z;
        this.f2766i = z2;
        this.f2767j = z3;
        this.f2768k = str;
        this.f2769l = str2;
    }

    private GoogleSignInOptions(Set set, Account account, boolean z, boolean z2, boolean z3, String str, String str2) {
        this(2, new ArrayList(set), account, z, z2, z3, str, str2);
    }

    public static GoogleSignInOptions m3234a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Set hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        Object optString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(hashSet, !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null));
    }

    private JSONObject m3242i() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f2763f, f2761m);
            Iterator it = this.f2763f.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).m5065a());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f2764g != null) {
                jSONObject.put("accountName", this.f2764g.name);
            }
            jSONObject.put("idTokenRequested", this.f2765h);
            jSONObject.put("forceCodeForRefreshToken", this.f2767j);
            jSONObject.put("serverAuthRequested", this.f2766i);
            if (!TextUtils.isEmpty(this.f2768k)) {
                jSONObject.put("serverClientId", this.f2768k);
            }
            if (!TextUtils.isEmpty(this.f2769l)) {
                jSONObject.put("hostedDomain", this.f2769l);
            }
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final ArrayList m3243a() {
        return new ArrayList(this.f2763f);
    }

    public final Account m3244b() {
        return this.f2764g;
    }

    public final boolean m3245c() {
        return this.f2765h;
    }

    public final boolean m3246d() {
        return this.f2766i;
    }

    public int describeContents() {
        return 0;
    }

    public final boolean m3247e() {
        return this.f2767j;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f2763f.size() != googleSignInOptions.m3243a().size() || !this.f2763f.containsAll(googleSignInOptions.m3243a())) {
                return false;
            }
            if (this.f2764g == null) {
                if (googleSignInOptions.f2764g != null) {
                    return false;
                }
            } else if (!this.f2764g.equals(googleSignInOptions.f2764g)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f2768k)) {
                if (!TextUtils.isEmpty(googleSignInOptions.f2768k)) {
                    return false;
                }
            } else if (!this.f2768k.equals(googleSignInOptions.f2768k)) {
                return false;
            }
            return this.f2767j == googleSignInOptions.f2767j && this.f2765h == googleSignInOptions.f2765h && this.f2766i == googleSignInOptions.f2766i;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public final String m3248f() {
        return this.f2768k;
    }

    public final String m3249g() {
        return this.f2769l;
    }

    public final String m3250h() {
        return m3242i().toString();
    }

    public int hashCode() {
        Object arrayList = new ArrayList();
        Iterator it = this.f2763f.iterator();
        while (it.hasNext()) {
            arrayList.add(((Scope) it.next()).m5065a());
        }
        Collections.sort(arrayList);
        return new C0591j().m3379a(arrayList).m3379a(this.f2764g).m3379a(this.f2768k).m3380a(this.f2767j).m3380a(this.f2765h).m3380a(this.f2766i).m3378a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0573g.m3269a(this, parcel, i);
    }
}
