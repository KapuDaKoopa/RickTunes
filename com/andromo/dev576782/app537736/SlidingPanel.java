package com.andromo.dev576782.app537736;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class SlidingPanel extends LinearLayout {
    AnimationListener f613a;
    private int f614b;
    private boolean f615c;
    private Animation f616d;

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int f612a;

        static {
            CREATOR = new ie();
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f612a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f612a);
        }
    }

    public SlidingPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f614b = 300;
        this.f615c = false;
        this.f616d = null;
        this.f613a = new id(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hp.SlidingPanel, 0, 0);
        this.f614b = obtainStyledAttributes.getInt(0, 300);
        obtainStyledAttributes.recycle();
        this.f616d = AnimationUtils.loadAnimation(context, 2130968576);
        "SlidingPanel construct isOpen: " + this.f615c;
    }
}
