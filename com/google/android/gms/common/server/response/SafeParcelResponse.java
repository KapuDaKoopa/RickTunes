package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.p006b.xc;
import com.google.android.gms.p006b.xd;
import com.google.android.gms.p006b.xl;
import com.google.android.gms.p006b.xm;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse extends FastJsonResponse implements SafeParcelable {
    public static final C0762f CREATOR;
    private final int f4926a;
    private final Parcel f4927b;
    private final int f4928c;
    private final FieldMappingDictionary f4929d;
    private final String f4930e;
    private int f4931f;
    private int f4932g;

    static {
        CREATOR = new C0762f();
    }

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.f4926a = i;
        this.f4927b = (Parcel) ax.m5527a((Object) parcel);
        this.f4928c = 2;
        this.f4929d = fieldMappingDictionary;
        if (this.f4929d == null) {
            this.f4930e = null;
        } else {
            this.f4930e = this.f4929d.m5686c();
        }
        this.f4931f = 2;
    }

    private static HashMap m5687a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private static void m5688a(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                stringBuilder.append(obj);
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                stringBuilder.append("\"").append(xl.m4898a(obj.toString())).append("\"");
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                stringBuilder.append("\"").append(xd.m4884a((byte[]) obj)).append("\"");
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                stringBuilder.append("\"").append(xd.m4885b((byte[]) obj));
                stringBuilder.append("\"");
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                xm.m4899a(stringBuilder, (HashMap) obj);
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void m5689a(StringBuilder stringBuilder, Field field, Parcel parcel, int i) {
        boolean[] zArr = null;
        int i2 = 0;
        int length;
        if (field.m5664e()) {
            stringBuilder.append("[");
            int dataPosition;
            switch (field.m5663d()) {
                case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                    int[] o = C0736a.m5584o(parcel, i);
                    length = o.length;
                    while (i2 < length) {
                        if (i2 != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Integer.toString(o[i2]));
                        i2++;
                    }
                    break;
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    Object[] objArr;
                    length = C0736a.m5565a(parcel, i);
                    dataPosition = parcel.dataPosition();
                    if (length != 0) {
                        int readInt = parcel.readInt();
                        objArr = new BigInteger[readInt];
                        while (i2 < readInt) {
                            objArr[i2] = new BigInteger(parcel.createByteArray());
                            i2++;
                        }
                        parcel.setDataPosition(length + dataPosition);
                    }
                    xc.m4881a(stringBuilder, objArr);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    long[] createLongArray;
                    length = C0736a.m5565a(parcel, i);
                    i2 = parcel.dataPosition();
                    if (length != 0) {
                        createLongArray = parcel.createLongArray();
                        parcel.setDataPosition(length + i2);
                    }
                    xc.m4880a(stringBuilder, createLongArray);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    float[] createFloatArray;
                    length = C0736a.m5565a(parcel, i);
                    i2 = parcel.dataPosition();
                    if (length != 0) {
                        createFloatArray = parcel.createFloatArray();
                        parcel.setDataPosition(length + i2);
                    }
                    xc.m4879a(stringBuilder, createFloatArray);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    double[] createDoubleArray;
                    length = C0736a.m5565a(parcel, i);
                    i2 = parcel.dataPosition();
                    if (length != 0) {
                        createDoubleArray = parcel.createDoubleArray();
                        parcel.setDataPosition(length + i2);
                    }
                    xc.m4878a(stringBuilder, createDoubleArray);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    xc.m4881a(stringBuilder, C0736a.m5585p(parcel, i));
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    length = C0736a.m5565a(parcel, i);
                    i2 = parcel.dataPosition();
                    if (length != 0) {
                        zArr = parcel.createBooleanArray();
                        parcel.setDataPosition(length + i2);
                    }
                    xc.m4883a(stringBuilder, zArr);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    xc.m4882a(stringBuilder, C0736a.m5586q(parcel, i));
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    Parcel[] t = C0736a.m5589t(parcel, i);
                    dataPosition = t.length;
                    for (int i3 = 0; i3 < dataPosition; i3++) {
                        if (i3 > 0) {
                            stringBuilder.append(",");
                        }
                        t[i3].setDataPosition(0);
                        m5691a(stringBuilder, field.m5671l(), t[i3]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        switch (field.m5663d()) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                stringBuilder.append(C0736a.m5573d(parcel, i));
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                stringBuilder.append(C0736a.m5576g(parcel, i));
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                stringBuilder.append(C0736a.m5575f(parcel, i));
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                stringBuilder.append(C0736a.m5577h(parcel, i));
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                stringBuilder.append(C0736a.m5578i(parcel, i));
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                stringBuilder.append(C0736a.m5579j(parcel, i));
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                stringBuilder.append(C0736a.m5572c(parcel, i));
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                stringBuilder.append("\"").append(xl.m4898a(C0736a.m5580k(parcel, i))).append("\"");
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                stringBuilder.append("\"").append(xd.m4884a(C0736a.m5583n(parcel, i))).append("\"");
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                stringBuilder.append("\"").append(xd.m4885b(C0736a.m5583n(parcel, i)));
                stringBuilder.append("\"");
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                Bundle m = C0736a.m5582m(parcel, i);
                Set<String> keySet = m.keySet();
                keySet.size();
                stringBuilder.append("{");
                length = 1;
                for (String str : keySet) {
                    if (length == 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"").append(str).append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"").append(xl.m4898a(m.getString(str))).append("\"");
                    length = 0;
                }
                stringBuilder.append("}");
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                Parcel s = C0736a.m5588s(parcel, i);
                s.setDataPosition(0);
                m5691a(stringBuilder, field.m5671l(), s);
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    private static void m5690a(StringBuilder stringBuilder, Field field, Object obj) {
        if (field.m5662c()) {
            ArrayList arrayList = (ArrayList) obj;
            stringBuilder.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    stringBuilder.append(",");
                }
                m5688a(stringBuilder, field.m5661b(), arrayList.get(i));
            }
            stringBuilder.append("]");
            return;
        }
        m5688a(stringBuilder, field.m5661b(), obj);
    }

    private void m5691a(StringBuilder stringBuilder, Map map, Parcel parcel) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            Entry entry2;
            hashMap.put(Integer.valueOf(((Field) entry2.getValue()).m5666g()), entry2);
        }
        stringBuilder.append('{');
        int a = C0736a.m5564a(parcel);
        Object obj = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            entry2 = (Entry) hashMap.get(Integer.valueOf(Menu.USER_MASK & readInt));
            if (entry2 != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                String str = (String) entry2.getKey();
                Field field = (Field) entry2.getValue();
                stringBuilder.append("\"").append(str).append("\":");
                if (field.m5669j()) {
                    switch (field.m5663d()) {
                        case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, Integer.valueOf(C0736a.m5573d(parcel, readInt))));
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, C0736a.m5576g(parcel, readInt)));
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, Long.valueOf(C0736a.m5575f(parcel, readInt))));
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, Float.valueOf(C0736a.m5577h(parcel, readInt))));
                            break;
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, Double.valueOf(C0736a.m5578i(parcel, readInt))));
                            break;
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, C0736a.m5579j(parcel, readInt)));
                            break;
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, Boolean.valueOf(C0736a.m5572c(parcel, readInt))));
                            break;
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, C0736a.m5580k(parcel, readInt)));
                            break;
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, C0736a.m5583n(parcel, readInt)));
                            break;
                        case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                            m5690a(stringBuilder, field, FastJsonResponse.m5673a(field, m5687a(C0736a.m5582m(parcel, readInt))));
                            break;
                        case C0772e.MapAttrs_uiZoomControls /*11*/:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + field.m5663d());
                    }
                }
                m5689a(stringBuilder, field, parcel, readInt);
                obj = 1;
            }
        }
        if (parcel.dataPosition() != a) {
            throw new C0737b("Overread allowed size end=" + a, parcel);
        }
        stringBuilder.append('}');
    }

    public final Map m5692a() {
        return this.f4929d == null ? null : this.f4929d.m5684a(this.f4930e);
    }

    protected final Object m5693b() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected final boolean m5694c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final int m5695d() {
        return this.f4926a;
    }

    public int describeContents() {
        C0762f c0762f = CREATOR;
        return 0;
    }

    public final Parcel m5696e() {
        switch (this.f4931f) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                this.f4932g = C0738c.m5590a(this.f4927b, 20293);
                break;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                break;
        }
        C0738c.m5605b(this.f4927b, this.f4932g);
        this.f4931f = 2;
        return this.f4927b;
    }

    final FieldMappingDictionary m5697f() {
        switch (this.f4928c) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                return null;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return this.f4929d;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return this.f4929d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.f4928c);
        }
    }

    public String toString() {
        ax.m5528a(this.f4929d, (Object) "Cannot convert to JSON on client side.");
        Parcel e = m5696e();
        e.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        m5691a(stringBuilder, this.f4929d.m5684a(this.f4930e), e);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0762f c0762f = CREATOR;
        C0762f.m5702a(this, parcel, i);
    }
}
