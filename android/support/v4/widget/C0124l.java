package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.widget.DrawerLayout.SavedState;

/* renamed from: android.support.v4.widget.l */
final class C0124l implements Creator {
    C0124l() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SavedState[i];
    }
}
