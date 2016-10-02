package com.andromo.dev576782.app537736;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import com.actionbarsherlock.C0152R;
import com.actionbarsherlock.internal.widget.IcsLinearLayout;
import com.actionbarsherlock.internal.widget.IcsListPopupWindow;
import com.actionbarsherlock.view.ActionProvider;

class ActivityChooserView extends ViewGroup {
    private static final boolean f395t;
    ActionProvider f396a;
    private final C0222y f397b;
    private final C0223z f398c;
    private final IcsLinearLayout f399d;
    private final Drawable f400e;
    private final FrameLayout f401f;
    private final ImageView f402g;
    private final FrameLayout f403h;
    private final ImageView f404i;
    private final int f405j;
    private final DataSetObserver f406k;
    private final OnGlobalLayoutListener f407l;
    private IcsListPopupWindow f408m;
    private OnDismissListener f409n;
    private boolean f410o;
    private int f411p;
    private boolean f412q;
    private int f413r;
    private final Context f414s;

    static {
        f395t = VERSION.SDK_INT >= 11;
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f406k = new C0219v(this);
        this.f407l = new C0220w(this);
        this.f411p = 4;
        this.f414s = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0152R.styleable.SherlockActivityChooserView, i, 0);
        this.f411p = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(this.f414s).inflate(C0152R.layout.abs__activity_chooser_view, this, true);
        this.f398c = new C0223z();
        this.f399d = (IcsLinearLayout) findViewById(C0152R.id.abs__activity_chooser_view_content);
        this.f400e = this.f399d.getBackground();
        this.f403h = (FrameLayout) findViewById(C0152R.id.abs__default_activity_button);
        this.f403h.setOnClickListener(this.f398c);
        this.f403h.setOnLongClickListener(this.f398c);
        this.f404i = (ImageView) this.f403h.findViewById(C0152R.id.abs__image);
        this.f401f = (FrameLayout) findViewById(C0152R.id.abs__expand_activities_button);
        this.f401f.setOnClickListener(this.f398c);
        this.f402g = (ImageView) this.f401f.findViewById(C0152R.id.abs__image);
        this.f402g.setImageDrawable(drawable);
        this.f397b = new C0222y();
        this.f397b.registerDataSetObserver(new C0221x(this));
        Resources resources = context.getResources();
        this.f405j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0152R.dimen.abs__config_prefDialogWidth));
    }

    private void m770a(int i) {
        if (this.f397b.m1651e() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f407l);
        boolean z = this.f403h.getVisibility() == 0;
        int c = this.f397b.m1649c();
        int i2 = z ? 1 : 0;
        if (i == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED || c <= i2 + i) {
            this.f397b.m1646a(false);
            this.f397b.m1644a(i);
        } else {
            this.f397b.m1646a(true);
            this.f397b.m1644a(i - 1);
        }
        IcsListPopupWindow f = m779f();
        if (!f.isShowing()) {
            if (this.f410o || !z) {
                this.f397b.m1647a(true, z);
            } else {
                this.f397b.m1647a(false, false);
            }
            f.setContentWidth(Math.min(this.f397b.m1643a(), this.f405j));
            f.show();
            if (this.f396a != null) {
                this.f396a.subUiVisibilityChanged(true);
            }
            f.getListView().setContentDescription(this.f414s.getString(C0152R.string.abs__activitychooserview_choose_application));
        }
    }

    static /* synthetic */ void m774c(ActivityChooserView activityChooserView) {
        if (activityChooserView.f397b.getCount() > 0) {
            activityChooserView.f401f.setEnabled(true);
        } else {
            activityChooserView.f401f.setEnabled(false);
        }
        activityChooserView.f403h.setVisibility(8);
        if (activityChooserView.f403h.getVisibility() == 0) {
            activityChooserView.f399d.setBackgroundDrawable(activityChooserView.f400e);
            return;
        }
        activityChooserView.f399d.setBackgroundDrawable(null);
        activityChooserView.f399d.setPadding(0, 0, 0, 0);
    }

    private IcsListPopupWindow m779f() {
        if (this.f408m == null) {
            this.f408m = new IcsListPopupWindow(getContext());
            this.f408m.setAdapter(this.f397b);
            this.f408m.setAnchorView(this);
            this.f408m.setModal(true);
            this.f408m.setOnItemClickListener(this.f398c);
            this.f408m.setOnDismissListener(this.f398c);
        }
        return this.f408m;
    }

    public final void m784a() {
        this.f402g.setContentDescription(this.f414s.getString(C0152R.string.abs__shareactionprovider_share_with));
    }

    public final void m785a(Drawable drawable) {
        this.f402g.setImageDrawable(drawable);
    }

    public final void m786a(ActionProvider actionProvider) {
        this.f396a = actionProvider;
    }

    public final void m787a(C0211m c0211m) {
        this.f397b.m1645a(c0211m);
        if (m779f().isShowing()) {
            m788b();
            if (!m779f().isShowing() && this.f412q) {
                this.f410o = false;
                m770a(this.f411p);
            }
        }
    }

    public final boolean m788b() {
        if (m779f().isShowing()) {
            m779f().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f407l);
            }
        }
        return true;
    }

    public final boolean m789c() {
        return m779f().isShowing();
    }

    public final void m790d() {
        this.f413r = C0152R.string.abs__shareactionprovider_share_with_application;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0211m e = this.f397b.m1651e();
        if (e != null) {
            e.registerObserver(this.f406k);
        }
        this.f412q = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0211m e = this.f397b.m1651e();
        if (e != null) {
            try {
                e.unregisterObserver(this.f406k);
            } catch (IllegalStateException e2) {
            }
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f407l);
        }
        this.f412q = false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f399d.layout(0, 0, i3 - i, i4 - i2);
        if (m779f().isShowing()) {
            m770a(this.f397b.m1650d());
        } else {
            m788b();
        }
    }

    protected void onMeasure(int i, int i2) {
        View view = this.f399d;
        if (this.f403h.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
