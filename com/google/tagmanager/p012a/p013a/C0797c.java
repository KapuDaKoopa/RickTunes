package com.google.tagmanager.p012a.p013a;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

/* renamed from: com.google.tagmanager.a.a.c */
public final class C0797c {
    public static String m5797a(C0274b c0274b) {
        if (c0274b == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            C0797c.m5799a(c0274b.getClass().getSimpleName(), c0274b.getClass(), c0274b, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        }
    }

    private static String m5798a(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    private static void m5799a(String str, Class cls, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        int length;
        if (C0274b.class.isAssignableFrom(cls)) {
            if (obj != null) {
                stringBuffer2.append(stringBuffer).append(str);
                stringBuffer.append("  ");
                stringBuffer2.append(" <\n");
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!((modifiers & 1) != 1 || (modifiers & 8) == 8 || name.startsWith("_") || name.endsWith("_"))) {
                        Class type = field.getType();
                        Object obj2 = field.get(obj);
                        if (type.isArray()) {
                            Class componentType = type.getComponentType();
                            if (componentType != Byte.TYPE) {
                                length = obj2 == null ? 0 : Array.getLength(obj2);
                                for (modifiers = 0; modifiers < length; modifiers++) {
                                    C0797c.m5799a(name, componentType, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                                }
                            }
                        }
                        C0797c.m5799a(name, type, obj2, stringBuffer, stringBuffer2);
                    }
                }
                stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length());
                stringBuffer2.append(stringBuffer).append(">\n");
            }
        } else if (obj != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            for (length = 0; length < str.length(); length++) {
                char charAt = str.charAt(length);
                if (length == 0) {
                    stringBuffer3.append(Character.toLowerCase(charAt));
                } else if (Character.isUpperCase(charAt)) {
                    stringBuffer3.append('_').append(Character.toLowerCase(charAt));
                } else {
                    stringBuffer3.append(charAt);
                }
            }
            stringBuffer2.append(stringBuffer).append(stringBuffer3.toString()).append(": ");
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.startsWith("http") && str2.length() > 200) {
                    str2 = str2.substring(0, 200) + "[...]";
                }
                stringBuffer2.append("\"").append(C0797c.m5798a(str2)).append("\"");
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }
}
