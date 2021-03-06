package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import com.google.android.gms.C0772e;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.RequestHandler.Result;

class FileRequestHandler extends ContentStreamRequestHandler {
    FileRequestHandler(Context context) {
        super(context);
    }

    static int getFileExifRotation(Uri uri) {
        switch (new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1)) {
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                return 180;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                return 90;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                return 270;
            default:
                return 0;
        }
    }

    public boolean canHandleRequest(Request request) {
        return "file".equals(request.uri.getScheme());
    }

    public Result load(Request request, int i) {
        return new Result(null, getInputStream(request), LoadedFrom.DISK, getFileExifRotation(request.uri));
    }
}
