package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DynamicColors {
    private static final DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION = null;
    private static final Map<String, DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_BRANDS = null;
    private static final Map<String, DeviceSupportCondition> DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = null;
    private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = null;

    @SuppressLint({"PrivateApi"})
    private static final DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION = null;
    private static final int USE_DEFAULT_THEME_OVERLAY = 0;

    /* renamed from: com.google.android.material.color.DynamicColors$1 */
    class C03111 implements DeviceSupportCondition {
        C03111() {
        }

        @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
        public boolean isSupported() {
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColors$2 */
    class C03122 implements DeviceSupportCondition {
        private Long version;

        C03122() {
        }

        @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
        public boolean isSupported() {
        }
    }

    private interface DeviceSupportCondition {
        boolean isSupported();
    }

    private static class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final DynamicColorsOptions dynamicColorsOptions;

        DynamicColorsActivityLifecycleCallbacks(DynamicColorsOptions dynamicColorsOptions) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public interface OnAppliedCallback {
        void onApplied(Activity activity);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(Activity activity, int i);
    }

    private DynamicColors() {
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity) {
    }

    public static void applyToActivitiesIfAvailable(Application application) {
    }

    public static void applyToActivityIfAvailable(Activity activity) {
    }

    private static int getDefaultThemeOverlay(Context context) {
    }

    @SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
    }

    public static Context wrapContextIfAvailable(Context context) {
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity, int i) {
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, int i) {
    }

    public static void applyToActivityIfAvailable(Activity activity, DynamicColorsOptions dynamicColorsOptions) {
    }

    public static Context wrapContextIfAvailable(Context context, int i) {
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity, Precondition precondition) {
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, Precondition precondition) {
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, int i, Precondition precondition) {
    }

    public static void applyToActivitiesIfAvailable(Application application, DynamicColorsOptions dynamicColorsOptions) {
    }
}
