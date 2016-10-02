package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.h */
public final class C0770h implements Creator {
    static void m5745a(WakeLockEvent wakeLockEvent, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, wakeLockEvent.f4945a);
        C0738c.m5593a(parcel, 2, wakeLockEvent.m5719a());
        C0738c.m5598a(parcel, 4, wakeLockEvent.m5721c());
        C0738c.m5606b(parcel, 5, wakeLockEvent.m5723e());
        C0738c.m5599a(parcel, 6, wakeLockEvent.m5724f());
        C0738c.m5593a(parcel, 8, wakeLockEvent.m5726h());
        C0738c.m5598a(parcel, 10, wakeLockEvent.m5722d());
        C0738c.m5606b(parcel, 11, wakeLockEvent.m5720b());
        C0738c.m5598a(parcel, 12, wakeLockEvent.m5725g());
        C0738c.m5598a(parcel, 13, wakeLockEvent.m5729k());
        C0738c.m5606b(parcel, 14, wakeLockEvent.m5728j());
        C0738c.m5591a(parcel, 15, wakeLockEvent.m5731m());
        C0738c.m5593a(parcel, 16, wakeLockEvent.m5732n());
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        List list = null;
        String str2 = null;
        long j2 = 0;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        float f = 0.0f;
        long j3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    j = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    list = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    j2 = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomGestures /*12*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    str4 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_zOrderOnTop /*14*/:
                    i4 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiMapToolbar /*15*/:
                    f = C0736a.m5577h(parcel, readInt);
                    break;
                case C0772e.MapAttrs_ambientEnabled /*16*/:
                    j3 = C0736a.m5575f(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
