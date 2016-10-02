package com.andromo.dev576782.app537736;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.webkit.URLUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public final class gr {
    public static String m1516a(String str, String str2) {
        int i = 0;
        String str3 = "";
        if (str == null) {
            return str3;
        }
        if ((str.length() > 4 && "http:".equalsIgnoreCase(str.substring(0, 5))) || ((str.length() > 5 && "https:".equalsIgnoreCase(str.substring(0, 6))) || (str.length() > 4 && "rtsp:".equalsIgnoreCase(str.substring(0, 5))))) {
            i = 1;
        }
        if (i != 0) {
            return str;
        }
        try {
            URI resolve = new URI(str2).resolve(new URI(str));
            if (resolve == null) {
                return str3;
            }
            str3 = resolve.toString();
            return !URLUtil.isValidUrl(str3) ? "" : str3;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean m1517a(Context context) {
        NetworkInfo b = m1519b(context);
        boolean z = (b == null || b.isRoaming() || (b.getType() != 9 && b.getType() != 1)) ? false : true;
        if (!z) {
            b = m1519b(context);
            if (b != null ? b.isConnected() : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean m1518a(String str) {
        boolean z;
        boolean z2 = false;
        if (str == null || str.length() <= 0) {
            return false;
        }
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            if (httpURLConnection.getResponseCode() == 200) {
                z2 = true;
            }
            httpURLConnection.disconnect();
            return z2;
        } catch (URISyntaxException e) {
            URISyntaxException uRISyntaxException = e;
            z = z2;
            uRISyntaxException.printStackTrace();
            return z;
        } catch (MalformedURLException e2) {
            MalformedURLException malformedURLException = e2;
            z = z2;
            malformedURLException.printStackTrace();
            return z;
        } catch (IOException e3) {
            IOException iOException = e3;
            z = z2;
            iOException.printStackTrace();
            return z;
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }

    private static NetworkInfo m1519b(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }
}
