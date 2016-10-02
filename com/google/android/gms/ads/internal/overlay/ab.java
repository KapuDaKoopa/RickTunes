package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.p006b.op;

@op
public final class ab extends FrameLayout implements OnClickListener {
    private final ImageButton f2175a;
    private final af f2176b;

    public ab(Context context, int i, af afVar) {
        super(context);
        this.f2176b = afVar;
        setOnClickListener(this);
        this.f2175a = new ImageButton(context);
        this.f2175a.setImageResource(17301527);
        this.f2175a.setBackgroundColor(0);
        this.f2175a.setOnClickListener(this);
        this.f2175a.setPadding(0, 0, 0, 0);
        this.f2175a.setContentDescription("Interstitial close button");
        C0374z.m2455a();
        int a = C0500a.m3009a(context, i);
        addView(this.f2175a, new LayoutParams(a, a, 17));
    }

    public final void m2629a(boolean z, boolean z2) {
        if (!z2) {
            this.f2175a.setVisibility(0);
        } else if (z) {
            this.f2175a.setVisibility(4);
        } else {
            this.f2175a.setVisibility(8);
        }
    }

    public final void onClick(View view) {
        if (this.f2176b != null) {
            this.f2176b.m2632c();
        }
    }
}
