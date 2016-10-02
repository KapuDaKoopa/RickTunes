package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import java.util.List;
import java.util.concurrent.TimeUnit;

@op
/* renamed from: com.google.android.gms.b.ck */
public final class ck {
    public static final cb f3036A;
    public static final cb f3037B;
    public static final cb f3038C;
    public static final cb f3039D;
    public static final cb f3040E;
    public static final cb f3041F;
    public static final cb f3042G;
    public static final cb f3043H;
    public static final cb f3044I;
    public static final cb f3045J;
    public static final cb f3046K;
    public static final cb f3047L;
    public static final cb f3048M;
    public static final cb f3049N;
    public static final cb f3050O;
    public static final cb f3051P;
    public static final cb f3052Q;
    public static final cb f3053R;
    public static final cb f3054S;
    public static final cb f3055T;
    public static final cb f3056U;
    public static final cb f3057V;
    public static final cb f3058W;
    public static final cb f3059X;
    public static final cb f3060Y;
    public static final cb f3061Z;
    public static final cb f3062a;
    public static final cb aA;
    public static final cb aB;
    public static final cb aC;
    public static final cb aD;
    public static final cb aE;
    public static final cb aF;
    public static final cb aG;
    public static final cb aa;
    public static final cb ab;
    public static final cb ac;
    public static final cb ad;
    public static final cb ae;
    public static final cb af;
    public static final cb ag;
    public static final cb ah;
    public static final cb ai;
    public static final cb aj;
    public static final cb ak;
    public static final cb al;
    public static final cb am;
    public static final cb an;
    public static final cb ao;
    public static final cb ap;
    public static final cb aq;
    public static final cb ar;
    public static final cb as;
    public static final cb at;
    public static final cb au;
    public static final cb av;
    public static final cb aw;
    public static final cb ax;
    public static final cb ay;
    public static final cb az;
    public static final cb f3063b;
    public static final cb f3064c;
    public static final cb f3065d;
    public static final cb f3066e;
    public static final cb f3067f;
    public static final cb f3068g;
    public static final cb f3069h;
    public static final cb f3070i;
    public static final cb f3071j;
    public static final cb f3072k;
    public static final cb f3073l;
    public static final cb f3074m;
    public static final cb f3075n;
    public static final cb f3076o;
    public static final cb f3077p;
    public static final cb f3078q;
    public static final cb f3079r;
    public static final cb f3080s;
    public static final cb f3081t;
    public static final cb f3082u;
    public static final cb f3083v;
    public static final cb f3084w;
    public static final cb f3085x;
    public static final cb f3086y;
    public static final cb f3087z;

    static {
        f3062a = cb.m3568a(0, "gads:sdk_core_experiment_id");
        f3063b = cb.m3571a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
        f3064c = cb.m3570a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
        f3065d = cb.m3568a(0, "gads:request_builder:singleton_webview_experiment_id");
        f3066e = cb.m3570a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(false));
        f3067f = cb.m3568a(0, "gads:sdk_use_dynamic_module_experiment_id");
        f3068g = cb.m3570a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
        f3069h = cb.m3570a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
        f3070i = cb.m3570a(0, "gads:block_autoclicks", Boolean.valueOf(false));
        f3071j = cb.m3568a(0, "gads:block_autoclicks_experiment_id");
        f3072k = cb.m3572a("gads:prefetch:experiment_id");
        f3073l = cb.m3568a(0, "gads:spam_app_context:experiment_id");
        f3074m = cb.m3570a(0, "gads:spam_app_context:enabled", Boolean.valueOf(false));
        f3075n = cb.m3568a(0, "gads:video_stream_cache:experiment_id");
        f3076o = cb.m3569a(0, "gads:video_stream_cache:limit_count", 5);
        f3077p = cb.m3569a(0, "gads:video_stream_cache:limit_space", 8388608);
        f3078q = cb.m3569a(0, "gads:video_stream_exo_cache:buffer_size", 8388608);
        f3079r = cb.m3573a("gads:video_stream_cache:limit_time_sec", 300);
        f3080s = cb.m3573a("gads:video_stream_cache:notify_interval_millis", 1000);
        f3081t = cb.m3569a(0, "gads:video_stream_cache:connect_timeout_millis", 10000);
        f3082u = cb.m3570a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
        f3083v = cb.m3571a(0, "gads:video:metric_frame_hash_times", "");
        f3084w = cb.m3573a("gads:video:metric_frame_hash_time_leniency", 500);
        f3085x = cb.m3572a("gads:spam_ad_id_decorator:experiment_id");
        f3086y = cb.m3570a(0, "gads:spam_ad_id_decorator:enabled", Boolean.valueOf(false));
        f3087z = cb.m3572a("gads:looper_for_gms_client:experiment_id");
        f3036A = cb.m3570a(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
        f3037B = cb.m3570a(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
        f3038C = cb.m3570a(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
        f3039D = cb.m3571a(0, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
        f3040E = cb.m3571a(0, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
        f3041F = cb.m3571a(0, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
        f3042G = cb.m3570a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
        f3043H = cb.m3571a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        f3044I = cb.m3570a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
        f3045J = cb.m3570a(0, "gads:enable_content_fetching", Boolean.valueOf(true));
        f3046K = cb.m3569a(0, "gads:content_length_weight", 1);
        f3047L = cb.m3569a(0, "gads:content_age_weight", 1);
        f3048M = cb.m3569a(0, "gads:min_content_len", 11);
        f3049N = cb.m3569a(0, "gads:fingerprint_number", 10);
        f3050O = cb.m3569a(0, "gads:sleep_sec", 10);
        f3051P = cb.m3570a(0, "gad:app_index_enabled", Boolean.valueOf(true));
        f3052Q = cb.m3570a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
        f3053R = cb.m3573a("gads:app_index:timeout_ms", 1000);
        f3054S = cb.m3568a(0, "gads:app_index:experiment_id");
        f3055T = cb.m3568a(0, "gads:kitkat_interstitial_workaround:experiment_id");
        f3056U = cb.m3570a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
        f3057V = cb.m3570a(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
        f3058W = cb.m3570a(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
        f3059X = cb.m3568a(0, "gads:interstitial_follow_url:experiment_id");
        f3060Y = cb.m3570a(0, "gads:analytics_enabled", Boolean.valueOf(true));
        f3061Z = cb.m3570a(0, "gads:ad_key_enabled", Boolean.valueOf(false));
        aa = cb.m3569a(0, "gads:webview_cache_version", 0);
        ab = cb.m3572a("gads:pan:experiment_id");
        ac = cb.m3571a(0, "gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
        ad = cb.m3570a(0, "gads:ad_manager_creator:enabled", Boolean.valueOf(true));
        ae = cb.m3570a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
        af = cb.m3571a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
        ag = cb.m3569a(1, "gads:interstitial_ad_pool:max_pools", 3);
        ah = cb.m3569a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
        ai = cb.m3569a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
        aj = cb.m3568a(1, "gads:interstitial_ad_pool:experiment_id");
        ak = cb.m3570a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
        al = cb.m3570a(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
        am = cb.m3573a("gads:device_info_caching_expiry_ms:expiry", 300000);
        an = cb.m3570a(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
        ao = cb.m3570a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
        ap = cb.m3570a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
        aq = cb.m3570a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
        ar = cb.m3570a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
        as = cb.m3570a(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
        at = cb.m3570a(0, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(false));
        au = cb.m3573a("gads:network:cache_prediction_duration_s", 300);
        av = cb.m3570a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
        aw = cb.m3570a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
        ax = cb.m3573a("gads:ad_loader:timeout_ms", 60000);
        ay = cb.m3573a("gads:rendering:timeout_ms", 60000);
        az = cb.m3570a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
        aA = cb.m3570a(0, "gass:enabled", Boolean.valueOf(false));
        aB = cb.m3570a(0, "gass:enable_int_signal", Boolean.valueOf(true));
        aC = cb.m3570a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
        aD = cb.m3570a(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
        aE = cb.m3570a(0, "gads:support_screen_shot", Boolean.valueOf(true));
        aF = cb.m3573a("gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
        aG = cb.m3570a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    }

    public static List m3581a() {
        return ar.m2248m().m3579a();
    }

    public static void m3582a(Context context) {
        sk.m4527a(new cl(context));
    }

    public static List m3583b() {
        cg m = ar.m2248m();
        List a = m.m3579a();
        for (cb a2 : m.f3030c) {
            String str = (String) ar.m2249n().m3580a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }
}
