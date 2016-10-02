package com.andromo.dev576782.app537736;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.NotificationCompat;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.C0772e;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URLConnection;

class dq extends AsyncTask {
    private static final String f842a;
    private dr f843b;
    private Context f844c;

    static {
        f842a = dq.class.getSimpleName();
    }

    public dq(Context context, dr drVar) {
        this.f844c = context.getApplicationContext();
        this.f843b = drVar;
    }

    private static String m1345a() {
        InputStreamReader inputStreamReader;
        String str;
        try {
            URLConnection a = dy.m1353a("http://pro.ip-api.com/csv/?key=3PjN9TMSUIC5qFL&fields=countryCode", null, "CountryFromIpTask (Mozilla Compatible)", 10000, 20000);
            String a2 = dy.m1352a(a, "UTF-8");
            StringBuilder stringBuilder = new StringBuilder();
            inputStreamReader = new InputStreamReader(a.getInputStream(), a2);
            char[] cArr = new char[64];
            do {
                int read = inputStreamReader.read(cArr, 0, cArr.length);
                if (read != -1) {
                    stringBuilder.append(cArr, 0, read);
                } else {
                    inputStreamReader.close();
                    str = f842a;
                    "response body: '" + stringBuilder.toString() + "'";
                    return stringBuilder.length() == 2 ? stringBuilder.toString() : null;
                }
            } while (stringBuilder.length() < NotificationCompat.FLAG_LOCAL_ONLY);
            str = f842a;
            stringBuilder.length() + " chars is >= max 256";
            inputStreamReader.close();
            return null;
        } catch (MalformedURLException e) {
            str = f842a;
            return null;
        } catch (IOException e2) {
            str = f842a;
            return null;
        } catch (Throwable th) {
            inputStreamReader.close();
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        Context context = this.f844c;
        if (context != null) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String networkCountryIso;
                switch (telephonyManager.getPhoneType()) {
                    case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                        Log.w(f842a, "Can't get country code using TelephonyManager, device = PHONE_TYPE_NONE");
                        str = null;
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                        networkCountryIso = telephonyManager.getNetworkCountryIso();
                        if (networkCountryIso != null && networkCountryIso.length() >= 2) {
                            str = f842a;
                            "Got country code of registered network operator using TelephonyManager on GSM device: " + networkCountryIso;
                            str = networkCountryIso;
                            break;
                        }
                        Log.w(f842a, "Couldn't get country code of registered network operator, device = PHONE_TYPE_GSM but reports country = " + networkCountryIso);
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        networkCountryIso = telephonyManager.getSimCountryIso();
                        if (networkCountryIso != null && networkCountryIso.length() >= 2) {
                            String str2 = f842a;
                            "Got country code of SIM provider using TelephonyManager on " + (telephonyManager.getPhoneType() == 2 ? "CDMA" : "GSM") + " device: " + networkCountryIso;
                            str = networkCountryIso;
                            break;
                        }
                        Log.w(f842a, "Couldn't get country code of SIM provider, device = " + (telephonyManager.getPhoneType() == 2 ? "PHONE_TYPE_CDMA" : "PHONE_TYPE_GSM") + ", reports country = " + networkCountryIso);
                        str = networkCountryIso;
                        break;
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                        Log.w(f842a, "Can't get country code using TelephonyManager, device = PHONE_TYPE_SIP, reports network country = " + telephonyManager.getNetworkCountryIso() + " and SIM country = " + telephonyManager.getSimCountryIso());
                        str = null;
                        break;
                    default:
                        Log.w(f842a, "Can't get country code using TelephonyManager, unknown device type: " + telephonyManager.getPhoneType());
                        str = null;
                        break;
                }
                if (str == null || str.length() < 2) {
                    str = m1345a();
                }
                if (str == null && str.length() >= 2) {
                    return str;
                }
                context = this.f844c;
                if (context != null) {
                    return null;
                }
                str = context.getResources().getConfiguration().locale.getCountry();
                if (str != null || str.length() < 2) {
                    Log.w(f842a, "Couldn't get country code from locale, locale.getCountry() returns: " + str);
                    return str;
                }
                String str3 = f842a;
                "Got country code from locale: " + str;
                return str;
            }
            str = f842a;
        }
        str = null;
        str = m1345a();
        if (str == null) {
        }
        context = this.f844c;
        if (context != null) {
            return null;
        }
        str = context.getResources().getConfiguration().locale.getCountry();
        if (str != null) {
        }
        Log.w(f842a, "Couldn't get country code from locale, locale.getCountry() returns: " + str);
        return str;
    }

    protected void onCancelled() {
        String str = f842a;
        this.f843b = null;
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        String str2 = f842a;
        if (!isCancelled() && this.f843b != null) {
            str2 = f842a;
            this.f843b.m1346a(str);
        }
    }
}
