package com.andromo.dev576782.app537736;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockListActivity;

public class Dashboard_000 extends SherlockListActivity implements gs {
    int f565a;
    private boolean f566b;

    public Dashboard_000() {
        this.f565a = -1;
        this.f566b = true;
    }

    public static Intent createIntent(Context context) {
        Intent intent = new Intent(context, Dashboard_000.class);
        intent.addFlags(67108864);
        return intent;
    }

    public String[] getClassNamesArray(Context context) {
        return context.getResources().getStringArray(2131623938);
    }

    public int getClassNamesArrayResId() {
        return 2131623938;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("HomeAsUp", false);
        "goingUp = " + booleanExtra;
        if (!booleanExtra) {
            Class a = C0208j.m1606a(getResources().getStringArray(2131623938), booleanExtra);
            if (a != null) {
                Intent intent = new Intent(this, a);
                if (booleanExtra) {
                    intent.putExtra("HomeAsUp", true);
                }
                intent.addFlags(67108864);
                startActivity(intent);
                finish();
            }
        }
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
    }
}
