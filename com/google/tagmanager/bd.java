package com.google.tagmanager;

import android.content.SharedPreferences.Editor;

final class bd implements Runnable {
    final /* synthetic */ Editor f5116a;

    bd(Editor editor) {
        this.f5116a = editor;
    }

    public final void run() {
        this.f5116a.commit();
    }
}
