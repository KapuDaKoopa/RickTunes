package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.C0772e;

public class About50148 extends SherlockActivity {
    private static C0210l f390e;
    int f391a;
    private int f392b;
    private boolean f393c;
    private ImageView f394d;

    static {
        f390e = new C0210l();
    }

    public About50148() {
        this.f391a = -1;
        this.f392b = -1;
        this.f393c = false;
    }

    public final void m768a(String str) {
        if (!fa.m1417a(str)) {
            try {
                fa.m1415a(this, str);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this, 2131230902, 0).show();
            }
        } else if (!fa.m1418b(this, str)) {
            Toast.makeText(this, getString(2131230903, new Object[]{str}), 0).show();
        }
    }

    public void onBackPressed() {
        ag.m1235g(this);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        CharSequence string;
        super.onCreate(bundle);
        setContentView(2130903040);
        if (VERSION.SDK_INT >= 14) {
            boolean z = ez.f886a > 0 && ez.f887b > 0;
            if (z) {
                "Max texture size previously determined: " + ez.f886a + " x " + ez.f887b;
            } else {
                ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
                if (viewGroup != null) {
                    viewGroup.addView(new MaxTextureSizeView(this));
                }
            }
        } else {
            "No access to canvas.getMaximumBitmapWidth on API " + VERSION.SDK_INT + ", using 1024 x 1024";
            ez.f886a = 1024;
            ez.f887b = 1024;
        }
        ao.m1275b(this);
        if (this.f391a == -1) {
            this.f391a = C0208j.m1617b(this);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C0208j.m1612a(supportActionBar, false, f390e.m1619a(this, "none"));
            C0208j.m1609a((Activity) this, supportActionBar, this.f391a);
        }
        this.f394d = null;
        this.f394d = (ImageView) findViewById(2131361896);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131361895);
        if (!(this.f394d == null || linearLayout == null || !this.f393c)) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            this.f394d.setImageDrawable(null);
            linearLayout.setVisibility(0);
            this.f394d.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(2131361897);
        if (textView != null) {
            string = getString(2131230785);
            if (!string.equals("")) {
                textView.setText(string);
                textView.setVisibility(0);
            }
        }
        textView = (TextView) findViewById(2131361898);
        if (textView != null) {
            string = getString(2131230786);
            if (!string.equals("")) {
                textView.setText(string);
                textView.setVisibility(0);
            }
        }
        textView = (TextView) findViewById(2131361899);
        if (textView != null) {
            String string2 = getString(2131230787);
            if (!string2.equals("")) {
                textView.setText(Html.fromHtml(string2));
                textView.setVisibility(0);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(2131361900);
        if (relativeLayout != null) {
            String string3;
            ImageButton imageButton = (ImageButton) findViewById(2131361901);
            if (imageButton != null) {
                string3 = getString(2131230788);
                if (!string3.equals("")) {
                    relativeLayout.setVisibility(0);
                    imageButton.setVisibility(0);
                    imageButton.setOnClickListener(new C0199c(this, string3));
                }
            }
            imageButton = (ImageButton) findViewById(2131361902);
            if (imageButton != null) {
                string3 = getString(2131230789);
                if (!string3.equals("")) {
                    relativeLayout.setVisibility(0);
                    imageButton.setVisibility(0);
                    imageButton.setOnClickListener(new C0200d(this, string3));
                }
            }
            imageButton = (ImageButton) findViewById(2131361903);
            if (imageButton != null) {
                string3 = getString(2131230790);
                if (!string3.equals("")) {
                    relativeLayout.setVisibility(0);
                    imageButton.setVisibility(0);
                    imageButton.setOnClickListener(new C0201e(this, string3));
                }
            }
            imageButton = (ImageButton) findViewById(2131361904);
            if (imageButton != null) {
                string3 = getString(2131230791);
                if (!string3.equals("")) {
                    relativeLayout.setVisibility(0);
                    imageButton.setVisibility(0);
                    imageButton.setOnClickListener(new C0202f(this, string3));
                }
            }
            imageButton = (ImageButton) findViewById(2131361905);
            if (imageButton != null) {
                string3 = getString(2131230792);
                if (!string3.equals("")) {
                    relativeLayout.setVisibility(0);
                    imageButton.setVisibility(0);
                    imageButton.setOnClickListener(new C0203g(this, string3));
                }
            }
        }
        ag.m1225a(this, (LinearLayout) findViewById(2131361894));
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
        C0208j.m1613a(getSupportMenuInflater(), menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        ag.m1234f(this);
        super.onDestroy();
        if (this.f394d != null) {
            this.f394d.setImageDrawable(null);
            this.f394d.setBackgroundDrawable(null);
            this.f394d = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return C0208j.m1615a((Activity) this, menuItem) || super.onOptionsItemSelected(menuItem);
    }

    protected void onPause() {
        ag.m1232d(this);
        super.onPause();
    }

    protected void onPrepareDialog(int i, Dialog dialog) {
        super.onPrepareDialog(i, dialog);
        if (i == 0) {
            C0204h.m1531a(dialog);
        }
    }

    protected void onResume() {
        super.onResume();
        ag.m1233e(this);
    }

    protected void onStart() {
        super.onStart();
        ag.m1227b(this);
        C0208j.m1610a(getSupportActionBar(), this.f391a);
        ao.m1268a((Activity) this, "About");
    }

    protected void onStop() {
        super.onStop();
        ag.m1230c(this);
        ao.m1267a((Activity) this);
    }
}
