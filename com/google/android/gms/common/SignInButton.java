package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0721d;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.p017a.C0319f;

public final class SignInButton extends FrameLayout implements OnClickListener {
    private int f4503a;
    private int f4504b;
    private Scope[] f4505c;
    private View f4506d;
    private OnClickListener f4507e;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4507e = null;
        m5062a(context, attributeSet);
        m5061a(this.f4503a, this.f4504b, this.f4505c);
    }

    private void m5061a(int i, int i2, Scope[] scopeArr) {
        this.f4503a = i;
        this.f4504b = i2;
        this.f4505c = scopeArr;
        Context context = getContext();
        if (this.f4506d != null) {
            removeView(this.f4506d);
        }
        try {
            this.f4506d = C0721d.m5543a(context, this.f4503a, this.f4504b, this.f4505c);
        } catch (C0319f e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f4503a;
            int i4 = this.f4504b;
            Scope[] scopeArr2 = this.f4505c;
            View com_google_android_gms_common_internal_zzac = new zzac(context);
            com_google_android_gms_common_internal_zzac.m5632a(context.getResources(), i3, i4, scopeArr2);
            this.f4506d = com_google_android_gms_common_internal_zzac;
        }
        addView(this.f4506d);
        this.f4506d.setEnabled(isEnabled());
        this.f4506d.setOnClickListener(this);
    }

    private void m5062a(Context context, AttributeSet attributeSet) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0772e.SignInButton, 0, 0);
        try {
            this.f4503a = obtainStyledAttributes.getInt(C0772e.SignInButton_buttonSize, 0);
            this.f4504b = obtainStyledAttributes.getInt(C0772e.SignInButton_colorScheme, 2);
            String string = obtainStyledAttributes.getString(C0772e.SignInButton_scopeUris);
            if (string == null) {
                this.f4505c = null;
            } else {
                String[] split = string.trim().split("\\s+");
                this.f4505c = new Scope[split.length];
                while (i < split.length) {
                    this.f4505c[i] = new Scope(split[i].toString());
                    i++;
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    public final void onClick(View view) {
        if (this.f4507e != null && view == this.f4506d) {
            this.f4507e.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        m5061a(this.f4503a, i, this.f4505c);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f4506d.setEnabled(z);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f4507e = onClickListener;
        if (this.f4506d != null) {
            this.f4506d.setOnClickListener(this);
        }
    }

    public final void setScopes(Scope[] scopeArr) {
        m5061a(this.f4503a, this.f4504b, scopeArr);
    }

    public final void setSize(int i) {
        m5061a(i, this.f4504b, this.f4505c);
    }
}
