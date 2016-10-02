package com.andromo.dev576782.app537736;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.C0152R;
import com.google.android.gms.C0772e;

/* renamed from: com.andromo.dev576782.app537736.y */
final class C0222y extends BaseAdapter {
    final /* synthetic */ ActivityChooserView f1221a;
    private C0211m f1222b;
    private int f1223c;
    private boolean f1224d;
    private boolean f1225e;
    private boolean f1226f;

    private C0222y(ActivityChooserView activityChooserView) {
        this.f1221a = activityChooserView;
        this.f1223c = 4;
        this.f1224d = true;
    }

    public final int m1643a() {
        int i = 0;
        int i2 = this.f1223c;
        this.f1223c = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = getCount();
        View view = null;
        int i3 = 0;
        while (i < count) {
            view = getView(i, view, null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
            i++;
        }
        this.f1223c = i2;
        return i3;
    }

    public final void m1644a(int i) {
        if (this.f1223c != i) {
            this.f1223c = i;
            notifyDataSetChanged();
        }
    }

    public final void m1645a(C0211m c0211m) {
        C0211m c0211m2 = this.f1221a.f397b.f1222b;
        if (c0211m2 != null && this.f1221a.isShown()) {
            try {
                c0211m2.unregisterObserver(this.f1221a.f406k);
            } catch (IllegalStateException e) {
            }
        }
        this.f1222b = c0211m;
        if (c0211m != null && this.f1221a.isShown()) {
            c0211m.registerObserver(this.f1221a.f406k);
        }
        notifyDataSetChanged();
    }

    public final void m1646a(boolean z) {
        if (this.f1226f != z) {
            this.f1226f = z;
            notifyDataSetChanged();
        }
    }

    public final void m1647a(boolean z, boolean z2) {
        if (this.f1224d != z || this.f1225e != z2) {
            this.f1224d = z;
            this.f1225e = z2;
            notifyDataSetChanged();
        }
    }

    public final ResolveInfo m1648b() {
        return this.f1222b.m1639b();
    }

    public final int m1649c() {
        return this.f1222b.m1633a();
    }

    public final int m1650d() {
        return this.f1223c;
    }

    public final C0211m m1651e() {
        return this.f1222b;
    }

    public final boolean m1652f() {
        return this.f1224d;
    }

    public final int getCount() {
        int a = this.f1222b.m1633a();
        if (!(this.f1224d || this.f1222b.m1639b() == null)) {
            a--;
        }
        a = Math.min(a, this.f1223c);
        return this.f1226f ? a + 1 : a;
    }

    public final Object getItem(int i) {
        switch (getItemViewType(i)) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                if (!(this.f1224d || this.f1222b.m1639b() == null)) {
                    i++;
                }
                return this.f1222b.m1635a(i);
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return (this.f1226f && i == getCount() - 1) ? 1 : 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                if (view == null || view.getId() != C0152R.id.abs__list_item) {
                    view = LayoutInflater.from(this.f1221a.getContext()).inflate(C0152R.layout.abs__activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = this.f1221a.f414s.getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C0152R.id.abs__icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C0152R.id.abs__title)).setText(resolveInfo.loadLabel(packageManager));
                if (!ActivityChooserView.f395t) {
                    return view;
                }
                if (this.f1224d && i == 0 && this.f1225e) {
                    view.setActivated(true);
                    return view;
                }
                view.setActivated(false);
                return view;
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                if (view != null && view.getId() == 1) {
                    return view;
                }
                view = LayoutInflater.from(this.f1221a.getContext()).inflate(C0152R.layout.abs__activity_chooser_view_list_item, viewGroup, false);
                view.setId(1);
                ((TextView) view.findViewById(C0152R.id.abs__title)).setText(this.f1221a.f414s.getString(2131231043));
                return view;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int getViewTypeCount() {
        return 3;
    }
}
