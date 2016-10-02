package com.google.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity extends Activity {
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            C0824z.m5939c();
            Uri data = getIntent().getData();
            if (!be.m5861a((Context) this).m5864a(data)) {
                CharSequence charSequence = "Cannot preview the app with the uri: " + data + ". Launching current version instead.";
                C0824z.m5937a(charSequence);
                AlertDialog create = new Builder(this).create();
                create.setTitle("Preview failure");
                create.setMessage(charSequence);
                create.setButton(-1, "Continue", new al(this));
                create.show();
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                "Invoke the launch activity for package name: " + getPackageName();
                C0824z.m5939c();
                startActivity(launchIntentForPackage);
                return;
            }
            "No launch activity found for package name: " + getPackageName();
            C0824z.m5939c();
        } catch (Exception e) {
            "Calling preview threw an exception: " + e.getMessage();
            C0824z.m5936a();
        }
    }
}
