package org.adblockplus.libadblockplus.android.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.adblockplus.libadblockplus.android.Subscription;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Utils {

    @SuppressLint({"ConstantLocale"})
    public static final String LOCALE = null;
    public static final String SUBSCRIPTION_FIELD_LANGUAGES = "languages";
    public static final String SUBSCRIPTION_FIELD_TITLE = "title";
    public static final String SUBSCRIPTION_FIELD_URL = "url";

    public static String checkLocaleLanguageMatch(String str) {
    }

    public static Subscription chooseDefaultSubscription(List<Subscription> list) {
    }

    public static List<Subscription> chooseSelectedSubscriptions(List<Subscription> list, Set<String> set) {
    }

    public static Map<String, String> getLocaleToTitleMap(Context context) {
    }

    public static List<Subscription> getSubscriptionsFromResourceStream(InputStream inputStream) {
    }

    public static String parseLanguages(JSONArray jSONArray) {
    }

    public static Subscription parseSubscription(JSONObject jSONObject) {
    }
}
