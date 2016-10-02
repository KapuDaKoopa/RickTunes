package com.andromo.dev576782.app537736;

import android.os.AsyncTask;
import android.support.v4.app.FragmentTransaction;
import com.google.android.gms.C0772e;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URLConnection;

final class hx extends AsyncTask implements C0198do {
    private hy f1099a;
    private String f1100b;

    public hx(hy hyVar) {
        this.f1099a = hyVar;
    }

    private hv m1579a(String... strArr) {
        hv a = hv.m1568a();
        InputStreamReader inputStreamReader;
        try {
            this.f1100b = AudioItem.m971a(strArr[0]);
            URLConnection a2 = dy.m1353a(this.f1100b + "/7.html", null, "SevenTask (Mozilla Compatible)", 10000, 20000);
            String a3 = dy.m1352a(a2, "UTF-8");
            StringBuilder stringBuilder = new StringBuilder();
            inputStreamReader = new InputStreamReader(a2.getInputStream(), a3);
            char[] cArr = new char[FragmentTransaction.TRANSIT_EXIT_MASK];
            do {
                int read = inputStreamReader.read(cArr, 0, cArr.length);
                if (read != -1) {
                    stringBuilder.append(cArr, 0, read);
                } else {
                    inputStreamReader.close();
                    int indexOf = stringBuilder.indexOf("<body>") + 6;
                    if (indexOf >= 6) {
                        read = stringBuilder.indexOf("</body>");
                        if (indexOf < read && read < stringBuilder.length()) {
                            String[] split = stringBuilder.substring(indexOf, read).split(",");
                            if (split.length == 7) {
                                try {
                                    hw hwVar = new hw();
                                    hwVar.f1092a = Integer.parseInt(split[0]);
                                    hwVar.f1093b = Integer.parseInt(split[1]);
                                    hwVar.f1094c = Integer.parseInt(split[2]);
                                    hwVar.f1095d = Integer.parseInt(split[3]);
                                    hwVar.f1096e = Integer.parseInt(split[4]);
                                    hwVar.f1097f = Integer.parseInt(split[5]);
                                    a = hwVar.m1578a(split[6].trim()).m1577a();
                                } catch (NumberFormatException e) {
                                    "Error parsing 7.html for: '" + this.f1100b + "'";
                                    if (this.f1099a != null) {
                                        this.f1099a.m1301a(this.f1100b, -1);
                                    }
                                }
                            } else {
                                try {
                                    hw hwVar2 = new hw();
                                    for (int i = 0; i < split.length; i++) {
                                        switch (i) {
                                            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                                                hwVar2.f1092a = Integer.parseInt(split[i]);
                                                break;
                                            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                                                hwVar2.f1093b = Integer.parseInt(split[i]);
                                                break;
                                            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                                                hwVar2.f1094c = Integer.parseInt(split[i]);
                                                break;
                                            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                                                hwVar2.f1095d = Integer.parseInt(split[i]);
                                                break;
                                            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                                                hwVar2.f1096e = Integer.parseInt(split[i]);
                                                break;
                                            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                                                hwVar2.f1097f = Integer.parseInt(split[i]);
                                                break;
                                            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                                                hwVar2.m1578a(split[i].trim());
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    a = hwVar2.m1577a();
                                } catch (NumberFormatException e2) {
                                    if (this.f1099a != null) {
                                        this.f1099a.m1301a(this.f1100b, -1);
                                    }
                                }
                            }
                        }
                    }
                    return a;
                }
            } while (stringBuilder.length() < 16384);
            a = hv.m1568a();
            inputStreamReader.close();
        } catch (MalformedURLException e3) {
            a = hv.m1568a();
            if (this.f1099a != null) {
                this.f1099a.m1301a(this.f1100b, -3);
            }
        } catch (IOException e4) {
            a = hv.m1568a();
            if (this.f1099a != null) {
                this.f1099a.m1301a(this.f1100b, -2);
            }
        } catch (Throwable th) {
            inputStreamReader.close();
        }
        return a;
    }

    public final String m1580a() {
        return this.f1100b != null ? this.f1100b : "";
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1579a((String[]) objArr);
    }

    protected final void onCancelled() {
        this.f1099a = null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        hv hvVar = (hv) obj;
        if (!isCancelled() && this.f1099a != null) {
            if (hvVar == null) {
                hvVar = hv.m1568a();
            }
            this.f1099a.m1300a(hvVar);
        }
    }
}
