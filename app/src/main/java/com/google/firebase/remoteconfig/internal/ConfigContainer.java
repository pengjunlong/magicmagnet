package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class ConfigContainer {
    static final String ABT_EXPERIMENTS_KEY = "abt_experiments_key";
    static final String CONFIGS_KEY = "configs_key";
    private static final Date DEFAULTS_FETCH_TIME = null;
    static final String FETCH_TIME_KEY = "fetch_time_key";
    static final String PERSONALIZATION_METADATA_KEY = "personalization_metadata_key";
    private JSONArray abtExperiments;
    private JSONObject configsJson;
    private JSONObject containerJson;
    private Date fetchTime;
    private JSONObject personalizationMetadata;

    public static class Builder {
        private JSONArray builderAbtExperiments;
        private JSONObject builderConfigsJson;
        private Date builderFetchTime;
        private JSONObject builderPersonalizationMetadata;

        /* synthetic */ Builder(C12041 c12041) {
        }

        public ConfigContainer build() throws JSONException {
        }

        public Builder replaceConfigsWith(Map<String, String> map) {
        }

        public Builder withAbtExperiments(JSONArray jSONArray) {
        }

        public Builder withFetchTime(Date date) {
        }

        public Builder withPersonalizationMetadata(JSONObject jSONObject) {
        }

        private Builder() {
        }

        public Builder replaceConfigsWith(JSONObject jSONObject) {
        }

        public Builder(ConfigContainer configContainer) {
        }
    }

    /* synthetic */ ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, C12041 c12041) throws JSONException {
    }

    static /* synthetic */ Date access$000() {
    }

    static ConfigContainer copyOf(JSONObject jSONObject) throws JSONException {
    }

    public static Builder newBuilder() {
    }

    public boolean equals(Object obj) {
    }

    public JSONArray getAbtExperiments() {
    }

    public JSONObject getConfigs() {
    }

    public Date getFetchTime() {
    }

    public JSONObject getPersonalizationMetadata() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    private ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
    }

    public static Builder newBuilder(ConfigContainer configContainer) {
    }
}
