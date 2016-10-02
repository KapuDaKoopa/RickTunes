package com.andromo.dev576782.app537736;

import org.xmlpull.v1.XmlPullParser;

public final class in {
    public static String m1602a(XmlPullParser xmlPullParser) {
        String nextText = xmlPullParser.nextText();
        if (xmlPullParser.getEventType() != 3) {
            xmlPullParser.nextTag();
        }
        return nextText;
    }

    public static String m1603a(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        if (str == null || "".equals(str)) {
            return str2;
        }
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (str.equalsIgnoreCase(xmlPullParser.getAttributeName(i))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return str2;
    }
}
