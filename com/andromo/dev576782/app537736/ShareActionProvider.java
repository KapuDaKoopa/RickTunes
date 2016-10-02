package com.andromo.dev576782.app537736;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.View;
import com.actionbarsherlock.C0152R;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.SubMenu;

public class ShareActionProvider extends ActionProvider {
    private int f606a;
    private final ib f607b;
    private final Context f608c;
    private String f609d;
    private hz f610e;
    private C0206u f611f;

    public ShareActionProvider(Context context) {
        super(context);
        this.f606a = 4;
        this.f607b = new ib();
        this.f609d = com.actionbarsherlock.widget.ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.f608c = context;
    }

    public final void m1179a(Intent intent) {
        C0211m.m1620a(this.f608c, this.f609d).m1636a(intent);
    }

    public final void m1180a(String str) {
        this.f609d = str;
        if (this.f610e != null) {
            if (this.f611f == null) {
                this.f611f = new ia();
            }
            C0211m.m1620a(this.f608c, this.f609d).m1637a(this.f611f);
        }
    }

    public boolean hasSubMenu() {
        return true;
    }

    public View onCreateActionView() {
        C0211m a = C0211m.m1620a(this.f608c, this.f609d);
        View activityChooserView = new ActivityChooserView(this.f608c);
        activityChooserView.m787a(a);
        TypedValue typedValue = new TypedValue();
        this.f608c.getTheme().resolveAttribute(C0152R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.m785a(this.f608c.getResources().getDrawable(typedValue.resourceId));
        activityChooserView.m786a((ActionProvider) this);
        activityChooserView.m790d();
        activityChooserView.m784a();
        return activityChooserView;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
        int i;
        subMenu.clear();
        C0211m a = C0211m.m1620a(this.f608c, this.f609d);
        PackageManager packageManager = this.f608c.getPackageManager();
        int a2 = a.m1633a();
        int min = Math.min(a2, this.f606a);
        for (i = 0; i < min; i++) {
            ResolveInfo a3 = a.m1635a(i);
            subMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f607b);
        }
        if (min < a2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f608c.getString(2131231043));
            for (i = 0; i < a2; i++) {
                a3 = a.m1635a(i);
                addSubMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f607b);
            }
        }
    }
}
