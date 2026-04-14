package com.google.firebase;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder() {
        }

        public FirebaseOptions build() {
        }

        public Builder setApiKey(String str) {
        }

        public Builder setApplicationId(String str) {
        }

        public Builder setDatabaseUrl(String str) {
        }

        @KeepForSdk
        public Builder setGaTrackingId(String str) {
        }

        public Builder setGcmSenderId(String str) {
        }

        public Builder setProjectId(String str) {
        }

        public Builder setStorageBucket(String str) {
        }

        public Builder(FirebaseOptions firebaseOptions) {
        }
    }

    /* synthetic */ FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, C10801 c10801) {
    }

    static /* synthetic */ String access$000(FirebaseOptions firebaseOptions) {
    }

    static /* synthetic */ String access$100(FirebaseOptions firebaseOptions) {
    }

    static /* synthetic */ String access$200(FirebaseOptions firebaseOptions) {
    }

    static /* synthetic */ String access$300(FirebaseOptions firebaseOptions) {
    }

    static /* synthetic */ String access$400(FirebaseOptions firebaseOptions) {
    }

    static /* synthetic */ String access$500(FirebaseOptions firebaseOptions) {
    }

    static /* synthetic */ String access$600(FirebaseOptions firebaseOptions) {
    }

    public static FirebaseOptions fromResource(Context context) {
    }

    public boolean equals(Object obj) {
    }

    public String getApiKey() {
    }

    public String getApplicationId() {
    }

    public String getDatabaseUrl() {
    }

    @KeepForSdk
    public String getGaTrackingId() {
    }

    public String getGcmSenderId() {
    }

    public String getProjectId() {
    }

    public String getStorageBucket() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
    }
}
