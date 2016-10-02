package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.p006b.xd;
import com.google.android.gms.p006b.xl;
import com.google.android.gms.p006b.xm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    public class Field implements SafeParcelable {
        public static final C0758b CREATOR;
        protected final int f4905a;
        protected final boolean f4906b;
        protected final int f4907c;
        protected final boolean f4908d;
        protected final String f4909e;
        protected final int f4910f;
        protected final Class f4911g;
        protected final String f4912h;
        private final int f4913i;
        private FieldMappingDictionary f4914j;
        private C0754a f4915k;

        static {
            CREATOR = new C0758b();
        }

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
            this.f4913i = i;
            this.f4905a = i2;
            this.f4906b = z;
            this.f4907c = i3;
            this.f4908d = z2;
            this.f4909e = str;
            this.f4910f = i4;
            if (str2 == null) {
                this.f4911g = null;
                this.f4912h = null;
            } else {
                this.f4911g = SafeParcelResponse.class;
                this.f4912h = str2;
            }
            if (converterWrapper == null) {
                this.f4915k = null;
            } else {
                this.f4915k = converterWrapper.m5648c();
            }
        }

        public final int m5658a() {
            return this.f4913i;
        }

        public final Object m5659a(Object obj) {
            return this.f4915k.m5649a(obj);
        }

        public final void m5660a(FieldMappingDictionary fieldMappingDictionary) {
            this.f4914j = fieldMappingDictionary;
        }

        public final int m5661b() {
            return this.f4905a;
        }

        public final boolean m5662c() {
            return this.f4906b;
        }

        public final int m5663d() {
            return this.f4907c;
        }

        public int describeContents() {
            C0758b c0758b = CREATOR;
            return 0;
        }

        public final boolean m5664e() {
            return this.f4908d;
        }

        public final String m5665f() {
            return this.f4909e;
        }

        public final int m5666g() {
            return this.f4910f;
        }

        public final Class m5667h() {
            return this.f4911g;
        }

        final String m5668i() {
            return this.f4912h == null ? null : this.f4912h;
        }

        public final boolean m5669j() {
            return this.f4915k != null;
        }

        final ConverterWrapper m5670k() {
            return this.f4915k == null ? null : ConverterWrapper.m5645a(this.f4915k);
        }

        public final Map m5671l() {
            ax.m5527a(this.f4912h);
            ax.m5527a(this.f4914j);
            return this.f4914j.m5684a(this.f4912h);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field\n");
            stringBuilder.append("            versionCode=").append(this.f4913i).append('\n');
            stringBuilder.append("                 typeIn=").append(this.f4905a).append('\n');
            stringBuilder.append("            typeInArray=").append(this.f4906b).append('\n');
            stringBuilder.append("                typeOut=").append(this.f4907c).append('\n');
            stringBuilder.append("           typeOutArray=").append(this.f4908d).append('\n');
            stringBuilder.append("        outputFieldName=").append(this.f4909e).append('\n');
            stringBuilder.append("      safeParcelFieldId=").append(this.f4910f).append('\n');
            stringBuilder.append("       concreteTypeName=").append(m5668i()).append('\n');
            if (this.f4911g != null) {
                stringBuilder.append("     concreteType.class=").append(this.f4911g.getCanonicalName()).append('\n');
            }
            stringBuilder.append("          converterName=").append(this.f4915k == null ? "null" : this.f4915k.getClass().getCanonicalName()).append('\n');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C0758b c0758b = CREATOR;
            C0758b.m5698a(this, parcel, i);
        }
    }

    private Object m5672a(Field field) {
        String f = field.m5665f();
        if (field.m5667h() != null) {
            field.m5665f();
            ax.m5533a(m5677b() == null, "Concrete field shouldn't be value object: %s", field.m5665f());
            field.m5664e();
            try {
                return getClass().getMethod("get" + Character.toUpperCase(f.charAt(0)) + f.substring(1), new Class[0]).invoke(this, new Object[0]);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        field.m5665f();
        return m5677b();
    }

    protected static Object m5673a(Field field, Object obj) {
        return field.f4915k != null ? field.m5659a(obj) : obj;
    }

    private static void m5674a(StringBuilder stringBuilder, Field field, Object obj) {
        if (field.m5661b() == 11) {
            stringBuilder.append(((FastJsonResponse) field.m5667h().cast(obj)).toString());
        } else if (field.m5661b() == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(xl.m4898a((String) obj));
            stringBuilder.append("\"");
        } else {
            stringBuilder.append(obj);
        }
    }

    private static void m5675a(StringBuilder stringBuilder, Field field, ArrayList arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m5674a(stringBuilder, field, obj);
            }
        }
        stringBuilder.append("]");
    }

    public abstract Map m5676a();

    protected abstract Object m5677b();

    protected abstract boolean m5678c();

    public String toString() {
        Map a = m5676a();
        StringBuilder stringBuilder = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field field = (Field) a.get(str);
            if (field.m5663d() != 11) {
                field.m5665f();
                if (m5678c()) {
                    Object a2 = m5673a(field, m5672a(field));
                    if (stringBuilder.length() == 0) {
                        stringBuilder.append("{");
                    } else {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"").append(str).append("\":");
                    if (a2 != null) {
                        switch (field.m5663d()) {
                            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                                stringBuilder.append("\"").append(xd.m4884a((byte[]) a2)).append("\"");
                                break;
                            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                                stringBuilder.append("\"").append(xd.m4885b((byte[]) a2)).append("\"");
                                break;
                            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                                xm.m4899a(stringBuilder, (HashMap) a2);
                                break;
                            default:
                                if (!field.m5662c()) {
                                    m5674a(stringBuilder, field, a2);
                                    break;
                                }
                                m5675a(stringBuilder, field, (ArrayList) a2);
                                break;
                        }
                    }
                    stringBuilder.append("null");
                }
            } else if (field.m5664e()) {
                field.m5665f();
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            } else {
                field.m5665f();
                throw new UnsupportedOperationException("Concrete types not supported");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
        } else {
            stringBuilder.append("{}");
        }
        return stringBuilder.toString();
    }
}
