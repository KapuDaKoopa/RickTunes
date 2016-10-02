package com.google.android.gms.p006b;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.pb */
public final class pb {
    private static final SimpleDateFormat f3812a;

    static {
        f3812a = new SimpleDateFormat("yyyyMMdd", Locale.US);
    }

    public static AdResponseParcel m4325a(Context context, AdRequestInfoParcel adRequestInfoParcel, String str) {
        try {
            String str2;
            long j;
            String optString;
            String str3;
            boolean optBoolean;
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            boolean z = (adRequestInfoParcel == null || adRequestInfoParcel.f2334m == 0) ? false : true;
            CharSequence optString5 = z ? jSONObject.optString("ad_json", null) : jSONObject.optString("ad_html", null);
            long j2 = -1;
            String optString6 = jSONObject.optString("debug_dialog", null);
            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            String optString7 = jSONObject.optString("orientation", null);
            int i = -1;
            if ("portrait".equals(optString7)) {
                i = ar.m2242g().m4474b();
            } else if ("landscape".equals(optString7)) {
                i = ar.m2242g().m4461a();
            }
            AdResponseParcel adResponseParcel = null;
            if (TextUtils.isEmpty(optString5)) {
                if (TextUtils.isEmpty(optString3)) {
                    C0501b.m3025a("Could not parse the mediation config: Missing required " + (z ? "ad_json" : "ad_html") + " or ad_url field.");
                    return new AdResponseParcel(0);
                }
                adResponseParcel = or.m4314a(adRequestInfoParcel, context, adRequestInfoParcel.f2332k.f2539b, optString3, null, null, null);
                optString2 = adResponseParcel.f2357b;
                str2 = adResponseParcel.f2358c;
                j2 = adResponseParcel.f2369n;
            } else if (TextUtils.isEmpty(optString2)) {
                C0501b.m3025a("Could not parse the mediation config: Missing required ad_base_url field");
                return new AdResponseParcel(0);
            } else {
                CharSequence charSequence = optString5;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list = adResponseParcel == null ? null : adResponseParcel.f2359d;
            if (optJSONArray != null) {
                list = pb.m4328a(optJSONArray, list);
            }
            optJSONArray = jSONObject.optJSONArray("impression_urls");
            List list2 = adResponseParcel == null ? null : adResponseParcel.f2361f;
            if (optJSONArray != null) {
                list2 = pb.m4328a(optJSONArray, list2);
            }
            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
            List list3 = adResponseParcel == null ? null : adResponseParcel.f2365j;
            if (optJSONArray != null) {
                list3 = pb.m4328a(optJSONArray, list3);
            }
            if (adResponseParcel != null) {
                if (adResponseParcel.f2367l != -1) {
                    i = adResponseParcel.f2367l;
                }
                if (adResponseParcel.f2362g > 0) {
                    j = adResponseParcel.f2362g;
                    optString = jSONObject.optString("active_view");
                    str3 = null;
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                        str3 = jSONObject.optString("ad_passback_url", null);
                    }
                    return new AdResponseParcel(adRequestInfoParcel, optString2, str2, list, list2, j, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j2, optString6, optBoolean, str3, optString, jSONObject.optBoolean("custom_render_allowed", false), z, adRequestInfoParcel.f2337p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optInt("oauth2_token_status", 0), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), RewardItemParcel.m2952a(jSONObject.optJSONArray("rewards")), pb.m4328a(jSONObject.optJSONArray("video_start_urls"), null), pb.m4328a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false));
                }
            }
            j = j3;
            optString = jSONObject.optString("active_view");
            str3 = null;
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str3 = jSONObject.optString("ad_passback_url", null);
            }
            return new AdResponseParcel(adRequestInfoParcel, optString2, str2, list, list2, j, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j2, optString6, optBoolean, str3, optString, jSONObject.optBoolean("custom_render_allowed", false), z, adRequestInfoParcel.f2337p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optInt("oauth2_token_status", 0), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), RewardItemParcel.m2952a(jSONObject.optJSONArray("rewards")), pb.m4328a(jSONObject.optJSONArray("video_start_urls"), null), pb.m4328a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false));
        } catch (JSONException e) {
            C0501b.m3025a("Could not parse the mediation config: " + e.getMessage());
            return new AdResponseParcel(0);
        }
    }

    private static Integer m4326a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static String m4327a(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    private static List m4328a(JSONArray jSONArray, List list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    public static JSONObject m4329a(AdRequestInfoParcel adRequestInfoParcel, pi piVar, String str, List list, Bundle bundle) {
        try {
            Object obj;
            Map hashMap = new HashMap();
            if (list.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", list));
            }
            if (adRequestInfoParcel.f2323b != null) {
                hashMap.put("ad_pos", adRequestInfoParcel.f2323b);
            }
            AdRequestParcel adRequestParcel = adRequestInfoParcel.f2324c;
            String a = qh.m4381a();
            if (a != null) {
                hashMap.put("abf", a);
            }
            if (adRequestParcel.f1885b != -1) {
                hashMap.put("cust_age", f3812a.format(new Date(adRequestParcel.f1885b)));
            }
            if (adRequestParcel.f1886c != null) {
                hashMap.put("extras", adRequestParcel.f1886c);
            }
            if (adRequestParcel.f1887d != -1) {
                hashMap.put("cust_gender", Integer.valueOf(adRequestParcel.f1887d));
            }
            if (adRequestParcel.f1888e != null) {
                hashMap.put("kw", adRequestParcel.f1888e);
            }
            if (adRequestParcel.f1890g != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(adRequestParcel.f1890g));
            }
            if (adRequestParcel.f1889f) {
                hashMap.put("adtest", "on");
            }
            if (adRequestParcel.f1884a >= 2) {
                if (adRequestParcel.f1891h) {
                    hashMap.put("d_imp_hdr", Integer.valueOf(1));
                }
                if (!TextUtils.isEmpty(adRequestParcel.f1892i)) {
                    hashMap.put("ppid", adRequestParcel.f1892i);
                }
                if (adRequestParcel.f1893j != null) {
                    SearchAdRequestParcel searchAdRequestParcel = adRequestParcel.f1893j;
                    if (Color.alpha(searchAdRequestParcel.f1914b) != 0) {
                        hashMap.put("acolor", pb.m4327a(searchAdRequestParcel.f1914b));
                    }
                    if (Color.alpha(searchAdRequestParcel.f1915c) != 0) {
                        hashMap.put("bgcolor", pb.m4327a(searchAdRequestParcel.f1915c));
                    }
                    if (!(Color.alpha(searchAdRequestParcel.f1916d) == 0 || Color.alpha(searchAdRequestParcel.f1917e) == 0)) {
                        hashMap.put("gradientto", pb.m4327a(searchAdRequestParcel.f1916d));
                        hashMap.put("gradientfrom", pb.m4327a(searchAdRequestParcel.f1917e));
                    }
                    if (Color.alpha(searchAdRequestParcel.f1918f) != 0) {
                        hashMap.put("bcolor", pb.m4327a(searchAdRequestParcel.f1918f));
                    }
                    hashMap.put("bthick", Integer.toString(searchAdRequestParcel.f1919g));
                    switch (searchAdRequestParcel.f1920h) {
                        case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                            obj = "none";
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                            obj = "dashed";
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                            obj = "dotted";
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                            obj = "solid";
                            break;
                        default:
                            obj = null;
                            break;
                    }
                    if (obj != null) {
                        hashMap.put("btype", obj);
                    }
                    switch (searchAdRequestParcel.f1921i) {
                        case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                            obj = "light";
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                            obj = "medium";
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                            obj = "dark";
                            break;
                        default:
                            obj = null;
                            break;
                    }
                    if (obj != null) {
                        hashMap.put("callbuttoncolor", obj);
                    }
                    if (searchAdRequestParcel.f1922j != null) {
                        hashMap.put("channel", searchAdRequestParcel.f1922j);
                    }
                    if (Color.alpha(searchAdRequestParcel.f1923k) != 0) {
                        hashMap.put("dcolor", pb.m4327a(searchAdRequestParcel.f1923k));
                    }
                    if (searchAdRequestParcel.f1924l != null) {
                        hashMap.put("font", searchAdRequestParcel.f1924l);
                    }
                    if (Color.alpha(searchAdRequestParcel.f1925m) != 0) {
                        hashMap.put("hcolor", pb.m4327a(searchAdRequestParcel.f1925m));
                    }
                    hashMap.put("headersize", Integer.toString(searchAdRequestParcel.f1926n));
                    if (searchAdRequestParcel.f1927o != null) {
                        hashMap.put("q", searchAdRequestParcel.f1927o);
                    }
                }
            }
            if (adRequestParcel.f1884a >= 3 && adRequestParcel.f1895l != null) {
                hashMap.put("url", adRequestParcel.f1895l);
            }
            if (adRequestParcel.f1884a >= 5) {
                if (adRequestParcel.f1897n != null) {
                    hashMap.put("custom_targeting", adRequestParcel.f1897n);
                }
                if (adRequestParcel.f1898o != null) {
                    hashMap.put("category_exclusions", adRequestParcel.f1898o);
                }
                if (adRequestParcel.f1899p != null) {
                    hashMap.put("request_agent", adRequestParcel.f1899p);
                }
            }
            if (adRequestParcel.f1884a >= 6 && adRequestParcel.f1900q != null) {
                hashMap.put("request_pkg", adRequestParcel.f1900q);
            }
            if (adRequestParcel.f1884a >= 7) {
                hashMap.put("is_designed_for_families", Boolean.valueOf(adRequestParcel.f1901r));
            }
            hashMap.put("format", adRequestInfoParcel.f2325d.f1903b);
            if (adRequestInfoParcel.f2325d.f1907f == -1) {
                hashMap.put("smart_w", "full");
            }
            if (adRequestInfoParcel.f2325d.f1904c == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (adRequestInfoParcel.f2325d.f1911j) {
                hashMap.put("fluid", "height");
            }
            if (adRequestInfoParcel.f2325d.f1909h != null) {
                StringBuilder stringBuilder = new StringBuilder();
                for (AdSizeParcel adSizeParcel : adRequestInfoParcel.f2325d.f1909h) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    stringBuilder.append(adSizeParcel.f1907f == -1 ? (int) (((float) adSizeParcel.f1908g) / piVar.f3877r) : adSizeParcel.f1907f);
                    stringBuilder.append("x");
                    stringBuilder.append(adSizeParcel.f1904c == -2 ? (int) (((float) adSizeParcel.f1905d) / piVar.f3877r) : adSizeParcel.f1904c);
                }
                hashMap.put("sz", stringBuilder);
            }
            if (adRequestInfoParcel.f2334m != 0) {
                hashMap.put("native_version", Integer.valueOf(adRequestInfoParcel.f2334m));
                if (!adRequestInfoParcel.f2325d.f1912k) {
                    hashMap.put("native_templates", adRequestInfoParcel.f2335n);
                    String str2 = "native_image_orientation";
                    NativeAdOptionsParcel nativeAdOptionsParcel = adRequestInfoParcel.f2347z;
                    switch (nativeAdOptionsParcel != null ? nativeAdOptionsParcel.f2049c : 0) {
                        case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                            obj = "portrait";
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                            obj = "landscape";
                            break;
                        default:
                            obj = "any";
                            break;
                    }
                    hashMap.put(str2, obj);
                    if (!adRequestInfoParcel.f2315A.isEmpty()) {
                        hashMap.put("native_custom_templates", adRequestInfoParcel.f2315A);
                    }
                }
            }
            hashMap.put("slotname", adRequestInfoParcel.f2326e);
            hashMap.put("pn", adRequestInfoParcel.f2327f.packageName);
            if (adRequestInfoParcel.f2328g != null) {
                hashMap.put("vc", Integer.valueOf(adRequestInfoParcel.f2328g.versionCode));
            }
            hashMap.put("ms", str);
            hashMap.put("seq_num", adRequestInfoParcel.f2330i);
            hashMap.put("session_id", adRequestInfoParcel.f2331j);
            hashMap.put("js", adRequestInfoParcel.f2332k.f2539b);
            hashMap.put("am", Integer.valueOf(piVar.f3860a));
            hashMap.put("cog", pb.m4326a(piVar.f3861b));
            hashMap.put("coh", pb.m4326a(piVar.f3862c));
            if (!TextUtils.isEmpty(piVar.f3863d)) {
                hashMap.put("carrier", piVar.f3863d);
            }
            hashMap.put("gl", piVar.f3864e);
            if (piVar.f3865f) {
                hashMap.put("simulator", Integer.valueOf(1));
            }
            if (piVar.f3866g) {
                hashMap.put("is_sidewinder", Integer.valueOf(1));
            }
            hashMap.put("ma", pb.m4326a(piVar.f3867h));
            hashMap.put("sp", pb.m4326a(piVar.f3868i));
            hashMap.put("hl", piVar.f3869j);
            if (!TextUtils.isEmpty(piVar.f3870k)) {
                hashMap.put("mv", piVar.f3870k);
            }
            hashMap.put("muv", Integer.valueOf(piVar.f3871l));
            if (piVar.f3872m != -2) {
                hashMap.put("cnt", Integer.valueOf(piVar.f3872m));
            }
            hashMap.put("gnt", Integer.valueOf(piVar.f3873n));
            hashMap.put("pt", Integer.valueOf(piVar.f3874o));
            hashMap.put("rm", Integer.valueOf(piVar.f3875p));
            hashMap.put("riv", Integer.valueOf(piVar.f3876q));
            Bundle bundle2 = new Bundle();
            bundle2.putString("build", piVar.f3884y);
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("is_charging", piVar.f3881v);
            bundle3.putDouble("battery_level", piVar.f3880u);
            bundle2.putBundle("battery", bundle3);
            bundle3 = new Bundle();
            bundle3.putInt("active_network_state", piVar.f3883x);
            bundle3.putBoolean("active_network_metered", piVar.f3882w);
            bundle2.putBundle("network", bundle3);
            hashMap.put("device", bundle2);
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (adRequestInfoParcel.f2324c.f1884a >= 2 && adRequestInfoParcel.f2324c.f1894k != null) {
                Location location = adRequestInfoParcel.f2324c.f1894k;
                HashMap hashMap2 = new HashMap();
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                hashMap2.put("radius", valueOf);
                hashMap2.put("lat", valueOf3);
                hashMap2.put("long", valueOf4);
                hashMap2.put("time", valueOf2);
                hashMap.put("uule", hashMap2);
            }
            if (adRequestInfoParcel.f2322a >= 2) {
                hashMap.put("quality_signals", adRequestInfoParcel.f2333l);
            }
            if (adRequestInfoParcel.f2322a >= 4 && adRequestInfoParcel.f2337p) {
                hashMap.put("forceHttps", Boolean.valueOf(adRequestInfoParcel.f2337p));
            }
            if (bundle != null) {
                hashMap.put("content_info", bundle);
            }
            if (adRequestInfoParcel.f2322a >= 5) {
                hashMap.put("u_sd", Float.valueOf(adRequestInfoParcel.f2341t));
                hashMap.put("sh", Integer.valueOf(adRequestInfoParcel.f2340s));
                hashMap.put("sw", Integer.valueOf(adRequestInfoParcel.f2339r));
            } else {
                hashMap.put("u_sd", Float.valueOf(piVar.f3877r));
                hashMap.put("sh", Integer.valueOf(piVar.f3879t));
                hashMap.put("sw", Integer.valueOf(piVar.f3878s));
            }
            if (adRequestInfoParcel.f2322a >= 6) {
                if (!TextUtils.isEmpty(adRequestInfoParcel.f2342u)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(adRequestInfoParcel.f2342u));
                    } catch (Throwable e) {
                        C0501b.m3026a("Problem serializing view hierarchy to JSON", e);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(adRequestInfoParcel.f2343v));
            }
            if (adRequestInfoParcel.f2322a >= 7) {
                hashMap.put("request_id", adRequestInfoParcel.f2344w);
            }
            if (adRequestInfoParcel.f2322a >= 11 && adRequestInfoParcel.f2317C != null) {
                hashMap.put("capability", adRequestInfoParcel.f2317C.m2806a());
            }
            if (adRequestInfoParcel.f2322a >= 12 && !TextUtils.isEmpty(adRequestInfoParcel.f2318D)) {
                hashMap.put("anchor", adRequestInfoParcel.f2318D);
            }
            if (adRequestInfoParcel.f2322a >= 13) {
                hashMap.put("avol", Float.valueOf(adRequestInfoParcel.f2319E));
            }
            if (adRequestInfoParcel.f2322a >= 14 && adRequestInfoParcel.f2320F > 0) {
                hashMap.put("target_api", Integer.valueOf(adRequestInfoParcel.f2320F));
            }
            if (adRequestInfoParcel.f2322a >= 15) {
                hashMap.put("scroll_index", Integer.valueOf(adRequestInfoParcel.f2321G == -1 ? -1 : adRequestInfoParcel.f2321G));
            }
            if (C0501b.m3027a(2)) {
                "Ad Request JSON: " + ar.m2240e().m4454a(hashMap).toString(2);
                qk.m4383a();
            }
            return ar.m2240e().m4454a(hashMap);
        } catch (JSONException e2) {
            C0501b.m3025a("Problem serializing ad request to JSON: " + e2.getMessage());
            return null;
        }
    }
}
