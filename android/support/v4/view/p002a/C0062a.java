package android.support.v4.view.p002a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import com.actionbarsherlock.view.Menu;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;

/* renamed from: android.support.v4.view.a.a */
public final class C0062a {
    private static final C0063c f185a;
    private final Object f186b;

    static {
        if (VERSION.SDK_INT >= 19) {
            f185a = new C0068f();
        } else if (VERSION.SDK_INT >= 18) {
            f185a = new C0067e();
        } else if (VERSION.SDK_INT >= 16) {
            f185a = new C0066d();
        } else if (VERSION.SDK_INT >= 14) {
            f185a = new C0065b();
        } else {
            f185a = new C0064g();
        }
    }

    public C0062a(Object obj) {
        this.f186b = obj;
    }

    public static C0062a m127a(C0062a c0062a) {
        Object a = f185a.m164a(c0062a.f186b);
        return a != null ? new C0062a(a) : null;
    }

    public final Object m128a() {
        return this.f186b;
    }

    public final void m129a(int i) {
        f185a.m165a(this.f186b, i);
    }

    public final void m130a(Rect rect) {
        f185a.m166a(this.f186b, rect);
    }

    public final void m131a(View view) {
        f185a.m178c(this.f186b, view);
    }

    public final void m132a(CharSequence charSequence) {
        f185a.m179c(this.f186b, charSequence);
    }

    public final void m133a(boolean z) {
        f185a.m180c(this.f186b, z);
    }

    public final int m134b() {
        return f185a.m170b(this.f186b);
    }

    public final void m135b(int i) {
        f185a.m171b(this.f186b, i);
    }

    public final void m136b(Rect rect) {
        f185a.m177c(this.f186b, rect);
    }

    public final void m137b(View view) {
        f185a.m167a(this.f186b, view);
    }

    public final void m138b(CharSequence charSequence) {
        f185a.m168a(this.f186b, charSequence);
    }

    public final void m139b(boolean z) {
        f185a.m183d(this.f186b, z);
    }

    public final int m140c() {
        return f185a.m202r(this.f186b);
    }

    public final void m141c(Rect rect) {
        f185a.m172b(this.f186b, rect);
    }

    public final void m142c(View view) {
        f185a.m173b(this.f186b, view);
    }

    public final void m143c(CharSequence charSequence) {
        f185a.m174b(this.f186b, charSequence);
    }

    public final void m144c(boolean z) {
        f185a.m190h(this.f186b, z);
    }

    public final void m145d(Rect rect) {
        f185a.m182d(this.f186b, rect);
    }

    public final void m146d(boolean z) {
        f185a.m192i(this.f186b, z);
    }

    public final boolean m147d() {
        return f185a.m195k(this.f186b);
    }

    public final void m148e(boolean z) {
        f185a.m188g(this.f186b, z);
    }

    public final boolean m149e() {
        return f185a.m196l(this.f186b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0062a c0062a = (C0062a) obj;
        return this.f186b == null ? c0062a.f186b == null : this.f186b.equals(c0062a.f186b);
    }

    public final void m150f(boolean z) {
        f185a.m169a(this.f186b, z);
    }

    public final boolean m151f() {
        return f185a.m203s(this.f186b);
    }

    public final void m152g(boolean z) {
        f185a.m185e(this.f186b, z);
    }

    public final boolean m153g() {
        return f185a.m204t(this.f186b);
    }

    public final void m154h(boolean z) {
        f185a.m175b(this.f186b, z);
    }

    public final boolean m155h() {
        return f185a.m200p(this.f186b);
    }

    public final int hashCode() {
        return this.f186b == null ? 0 : this.f186b.hashCode();
    }

    public final void m156i(boolean z) {
        f185a.m187f(this.f186b, z);
    }

    public final boolean m157i() {
        return f185a.m193i(this.f186b);
    }

    public final boolean m158j() {
        return f185a.m197m(this.f186b);
    }

    public final boolean m159k() {
        return f185a.m194j(this.f186b);
    }

    public final CharSequence m160l() {
        return f185a.m184e(this.f186b);
    }

    public final CharSequence m161m() {
        return f185a.m176c(this.f186b);
    }

    public final CharSequence m162n() {
        return f185a.m181d(this.f186b);
    }

    public final void m163o() {
        f185a.m201q(this.f186b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m130a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m141c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(m160l());
        stringBuilder.append("; className: ").append(m161m());
        stringBuilder.append("; text: ").append(f185a.m186f(this.f186b));
        stringBuilder.append("; contentDescription: ").append(m162n());
        stringBuilder.append("; viewId: ").append(f185a.m205u(this.f186b));
        stringBuilder.append("; checkable: ").append(f185a.m189g(this.f186b));
        stringBuilder.append("; checked: ").append(f185a.m191h(this.f186b));
        stringBuilder.append("; focusable: ").append(m147d());
        stringBuilder.append("; focused: ").append(m149e());
        stringBuilder.append("; selected: ").append(m155h());
        stringBuilder.append("; clickable: ").append(m157i());
        stringBuilder.append("; longClickable: ").append(m158j());
        stringBuilder.append("; enabled: ").append(m159k());
        stringBuilder.append("; password: ").append(f185a.m198n(this.f186b));
        stringBuilder.append("; scrollable: " + f185a.m199o(this.f186b));
        stringBuilder.append("; [");
        int b = m134b();
        while (b != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            int i = (numberOfTrailingZeros ^ -1) & b;
            switch (numberOfTrailingZeros) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    str = "ACTION_FOCUS";
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    str = "ACTION_SELECT";
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case C0772e.MapAttrs_ambientEnabled /*16*/:
                    str = "ACTION_CLICK";
                    break;
                case hp.SherlockTheme_searchDropdownBackground /*32*/:
                    str = "ACTION_LONG_CLICK";
                    break;
                case hp.SherlockTheme_listPopupWindowStyle /*64*/:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case NotificationCompat.FLAG_HIGH_PRIORITY /*128*/:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case NotificationCompat.FLAG_LOCAL_ONLY /*256*/:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case NotificationCompat.FLAG_GROUP_SUMMARY /*512*/:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case FragmentTransaction.TRANSIT_ENTER_MASK /*4096*/:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case FragmentTransaction.TRANSIT_EXIT_MASK /*8192*/:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case Menu.CATEGORY_CONTAINER /*65536*/:
                    str = "ACTION_CUT";
                    break;
                case Menu.CATEGORY_SYSTEM /*131072*/:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            stringBuilder.append(str);
            if (i != 0) {
                stringBuilder.append(", ");
            }
            b = i;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
