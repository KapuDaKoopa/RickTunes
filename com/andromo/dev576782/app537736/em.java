package com.andromo.dev576782.app537736;

import android.content.ActivityNotFoundException;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

final class em extends LinkMovementMethod {
    private static em f866a;
    private static String f867b;

    em() {
    }

    public static em m1393a() {
        if (f866a == null) {
            f866a = new em();
        } else {
            f867b = null;
        }
        return f866a;
    }

    public static em m1394a(String str) {
        f867b = str;
        return f866a;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(textView, spannable, motionEvent);
        } catch (ActivityNotFoundException e) {
            if (motionEvent.getAction() == 1) {
                int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
                int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
                Layout layout = textView.getLayout();
                x = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(x, x, URLSpan.class);
                if (uRLSpanArr.length != 0) {
                    String url = uRLSpanArr[0].getURL();
                    if (!(f867b == null || url == null)) {
                        Toast.makeText(textView.getContext(), String.format(f867b, new Object[]{url}), 0).show();
                    }
                }
            }
            return true;
        }
    }
}
