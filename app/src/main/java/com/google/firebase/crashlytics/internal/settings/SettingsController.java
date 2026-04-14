package com.google.firebase.crashlytics.internal.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.Settings;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SettingsRequest;
import com.google.firebase.crashlytics.internal.settings.network.SettingsSpiCall;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class SettingsController implements SettingsDataProvider {
    private static final String PREFS_BUILD_INSTANCE_IDENTIFIER = "existing_instance_identifier";
    private static final String SETTINGS_URL_FORMAT = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings";
    private final AtomicReference<TaskCompletionSource<AppSettingsData>> appSettingsData;
    private final CachedSettingsIo cachedSettingsIo;
    private final Context context;
    private final CurrentTimeProvider currentTimeProvider;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final AtomicReference<Settings> settings;
    private final SettingsJsonParser settingsJsonParser;
    private final SettingsRequest settingsRequest;
    private final SettingsSpiCall settingsSpiCall;

    /* renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$1 */
    class C11441 implements SuccessContinuation<Void, Void> {
        final /* synthetic */ SettingsController this$0;

        C11441(SettingsController settingsController) {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public /* bridge */ /* synthetic */ Task<Void> then(Void r1) throws Exception {
        }

        /* renamed from: then, reason: avoid collision after fix types in other method */
        public Task<Void> then2(Void r5) throws Exception {
        }
    }

    SettingsController(Context context, SettingsRequest settingsRequest, CurrentTimeProvider currentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
    }

    static /* synthetic */ SettingsRequest access$000(SettingsController settingsController) {
    }

    static /* synthetic */ SettingsSpiCall access$100(SettingsController settingsController) {
    }

    static /* synthetic */ SettingsJsonParser access$200(SettingsController settingsController) {
    }

    static /* synthetic */ CachedSettingsIo access$300(SettingsController settingsController) {
    }

    static /* synthetic */ void access$400(SettingsController settingsController, JSONObject jSONObject, String str) throws JSONException {
    }

    static /* synthetic */ boolean access$500(SettingsController settingsController, String str) {
    }

    static /* synthetic */ AtomicReference access$600(SettingsController settingsController) {
    }

    static /* synthetic */ AtomicReference access$700(SettingsController settingsController) {
    }

    public static SettingsController create(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, DataCollectionArbiter dataCollectionArbiter) {
    }

    private SettingsData getCachedSettingsData(SettingsCacheBehavior settingsCacheBehavior) {
    }

    private String getStoredBuildInstanceIdentifier() {
    }

    private void logSettings(JSONObject jSONObject, String str) throws JSONException {
    }

    @SuppressLint({"CommitPrefEdits"})
    private boolean setStoredBuildInstanceIdentifier(String str) {
    }

    boolean buildInstanceIdentifierChanged() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsDataProvider
    public Task<AppSettingsData> getAppSettings() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsDataProvider
    public Settings getSettings() {
    }

    public Task<Void> loadSettingsData(Executor executor) {
    }

    public Task<Void> loadSettingsData(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
    }
}
