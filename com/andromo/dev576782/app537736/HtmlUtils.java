package com.andromo.dev576782.app537736;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.regex.Pattern;

final class HtmlUtils {
    private static final Pattern f577a;
    private static final Pattern f578b;
    private static final Pattern f579c;

    class URLSpanNoClickNoUnderline extends URLSpan {
        public void onClick(View view) {
        }

        public void updateDrawState(TextPaint textPaint) {
        }
    }

    class URLSpanNoUnderline extends URLSpan {
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    static {
        f577a = Pattern.compile("</?([aA](?=\\s|>)){1}[^>]*>");
        f578b = Pattern.compile("(?:\r?\n)");
        f579c = Pattern.compile("(?:<[bB][rR]/?>){3,}");
    }

    private static CharSequence m1122a(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i < spannableStringBuilder.length()) {
            char charAt = spannableStringBuilder.charAt(i);
            if (charAt == '\n') {
                if (i2 == 0) {
                    i4 = i;
                }
                i2++;
                i3 = -1;
            } else if (charAt == '\u00a0') {
                if (i3 == -1) {
                    i3 = i;
                }
            } else if (!(i2 <= 0 || Character.isWhitespace(charAt) || charAt == '\u00a0')) {
                if (i2 > 2) {
                    if (i3 <= i4) {
                        i3 = i;
                    }
                    spannableStringBuilder.replace(i4, i3, "\n\n");
                    i -= i - i4;
                }
                i2 = 0;
                i3 = -1;
            }
            i++;
        }
        return spannableStringBuilder;
    }

    public static String m1123a(String str) {
        int length;
        int length2;
        CharSequence charSequence;
        CharSequence fromHtml = Html.fromHtml(str != null ? f578b.matcher(str).replaceAll("") : "");
        if (fromHtml == null) {
            fromHtml = "";
        } else {
            length = fromHtml.length();
            do {
                length--;
                if (length < 0) {
                    break;
                }
            } while (Character.isWhitespace(fromHtml.charAt(length)));
            fromHtml = fromHtml.subSequence(0, length + 1);
        }
        if (fromHtml == null) {
            fromHtml = "";
        } else {
            length2 = fromHtml.length();
            if (length2 == 0) {
                Object obj = "";
            } else {
                length = -1;
                while (length < length2) {
                    length++;
                    if (!Character.isWhitespace(fromHtml.charAt(length))) {
                        break;
                    }
                }
                fromHtml = fromHtml.subSequence(length, fromHtml.length());
            }
        }
        if (fromHtml == null) {
            charSequence = "";
        } else {
            charSequence = new SpannableStringBuilder(fromHtml);
            length2 = 0;
            int i = -1;
            while (length2 < charSequence.length()) {
                if (charSequence.charAt(length2) == '\ufffc') {
                    if (i < 0) {
                        i = length2;
                    }
                } else if (i != -1) {
                    charSequence.replace(i, length2, "", 0, 0);
                    length2 = i;
                    i = -1;
                }
                length2++;
            }
            if (i != -1) {
                charSequence = charSequence.subSequence(0, i);
            }
        }
        return m1122a(charSequence).toString();
    }
}
