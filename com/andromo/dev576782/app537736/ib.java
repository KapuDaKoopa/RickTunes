package com.andromo.dev576782.app537736;

import android.content.Intent;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

final class ib implements OnMenuItemClickListener {
    final /* synthetic */ ShareActionProvider f1103a;

    private ib(ShareActionProvider shareActionProvider) {
        this.f1103a = shareActionProvider;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Intent b = C0211m.m1620a(this.f1103a.f608c, this.f1103a.f609d).m1638b(menuItem.getItemId());
        if (b != null) {
            this.f1103a.f608c.startActivity(b);
        }
        return true;
    }
}
