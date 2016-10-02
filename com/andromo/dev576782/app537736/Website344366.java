package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.C0772e;
import java.lang.reflect.InvocationTargetException;

public class Website344366 extends SherlockActivity {
    private static C0210l f617i;
    int f618a;
    WebView f619b;
    private int f620c;
    private boolean f621d;
    private MenuItem f622e;
    private boolean f623f;
    private boolean f624g;
    private boolean f625h;

    static {
        f617i = new C0210l();
    }

    public Website344366() {
        this.f618a = -1;
        this.f620c = -1;
        this.f621d = false;
        this.f623f = false;
        this.f624g = true;
        this.f625h = true;
    }

    private void m1196a(String str) {
        if (this.f619b != null) {
            try {
                WebView.class.getMethod(str, new Class[0]).invoke(this.f619b, new Object[0]);
            } catch (NoSuchMethodException e) {
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }

    protected final void m1200a() {
        if (this.f622e != null) {
            this.f622e.setActionView(2130903065);
        }
    }

    protected final void m1201b() {
        if (this.f622e != null) {
            this.f622e.setActionView(null);
        }
    }

    public void onBackPressed() {
        ag.m1235g(this);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130903083);
        ao.m1275b(this);
        if (this.f618a == -1) {
            this.f618a = C0208j.m1617b(this);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C0208j.m1612a(supportActionBar, false, f617i.m1619a(this, "none"));
            C0208j.m1609a((Activity) this, supportActionBar, this.f618a);
        }
        CookieSyncManager.createInstance(this);
        this.f619b = (WebView) findViewById(2131361994);
        this.f619b.setWebChromeClient(new im());
        if (this.f624g) {
            this.f619b.getSettings().setGeolocationEnabled(true);
        }
        this.f619b.setWebViewClient(new il());
        this.f619b.getSettings().setJavaScriptEnabled(true);
        this.f619b.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f619b.getSettings().setLightTouchEnabled(true);
        this.f619b.getSettings().setDatabaseEnabled(true);
        this.f619b.getSettings().setDatabasePath("/data/data/" + getPackageName() + "/databases/");
        this.f619b.getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT > 7) {
            this.f619b.getSettings().setPluginState(PluginState.ON);
        }
        this.f619b.getSettings().setBuiltInZoomControls(this.f625h);
        this.f619b.getSettings().setSupportZoom(this.f625h);
        this.f619b.getSettings().setLoadWithOverviewMode(this.f625h);
        this.f619b.getSettings().setUseWideViewPort(this.f625h);
        this.f619b.setDownloadListener(new ik(this));
        String str = "";
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("com.andromo.dev576782.app537736.NAVIGATION_PAGE");
        }
        if (str != null && !str.equals("")) {
            this.f619b.loadUrl("file:///android_asset/Website344366" + str);
        } else if (bundle != null) {
            this.f619b.restoreState(bundle);
        } else {
            this.f619b.loadUrl(getString(2131231052));
        }
        ag.m1226a(this, (LinearLayout) findViewById(2131361894), ae.NONE);
        aa.m1212a(this);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                return C0204h.m1530a((Context) this);
            default:
                return super.onCreateDialog(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater supportMenuInflater = getSupportMenuInflater();
        supportMenuInflater.inflate(2131689479, menu);
        C0208j.m1613a(supportMenuInflater, menu);
        this.f622e = menu.findItem(2131361995);
        if (this.f623f) {
            m1200a();
        }
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        ag.m1234f(this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f619b.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f619b.goBack();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131361995:
                if (this.f619b == null) {
                    return true;
                }
                this.f619b.reload();
                return true;
            default:
                return C0208j.m1615a((Activity) this, menuItem) || super.onOptionsItemSelected(menuItem);
        }
    }

    protected void onPause() {
        ag.m1232d(this);
        super.onPause();
        m1196a("onPause");
        CookieSyncManager.getInstance().stopSync();
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
        if (i == 0) {
            C0204h.m1531a(dialog);
        }
    }

    protected void onResume() {
        super.onResume();
        m1196a("onResume");
        CookieSyncManager.getInstance().startSync();
        ag.m1233e(this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        this.f619b.saveState(bundle);
    }

    protected void onStart() {
        super.onStart();
        ag.m1227b(this);
        C0208j.m1610a(getSupportActionBar(), this.f618a);
        ao.m1268a((Activity) this, "Website");
    }

    protected void onStop() {
        super.onStop();
        ag.m1230c(this);
        ao.m1267a((Activity) this);
    }
}
