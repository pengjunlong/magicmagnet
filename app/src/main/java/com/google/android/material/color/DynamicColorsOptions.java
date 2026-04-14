package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.material.color.DynamicColors;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class DynamicColorsOptions {
    private static final DynamicColors.Precondition ALWAYS_ALLOW = null;
    private static final DynamicColors.OnAppliedCallback NO_OP_CALLBACK = null;
    private Integer contentBasedSeedColor;
    private final DynamicColors.OnAppliedCallback onAppliedCallback;
    private final DynamicColors.Precondition precondition;
    private final int themeOverlay;

    /* renamed from: com.google.android.material.color.DynamicColorsOptions$1 */
    class C03131 implements DynamicColors.Precondition {
        C03131() {
        }

        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(Activity activity, int i) {
        }
    }

    /* renamed from: com.google.android.material.color.DynamicColorsOptions$2 */
    class C03142 implements DynamicColors.OnAppliedCallback {
        C03142() {
        }

        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(Activity activity) {
        }
    }

    public static class Builder {
        private Bitmap contentBasedSource;
        private DynamicColors.OnAppliedCallback onAppliedCallback;
        private DynamicColors.Precondition precondition;
        private int themeOverlay;

        static /* synthetic */ int access$000(Builder builder) {
        }

        static /* synthetic */ DynamicColors.Precondition access$100(Builder builder) {
        }

        static /* synthetic */ DynamicColors.OnAppliedCallback access$200(Builder builder) {
        }

        static /* synthetic */ Bitmap access$300(Builder builder) {
        }

        public DynamicColorsOptions build() {
        }

        @CanIgnoreReturnValue
        public Builder setContentBasedSource(Bitmap bitmap) {
        }

        @CanIgnoreReturnValue
        public Builder setOnAppliedCallback(DynamicColors.OnAppliedCallback onAppliedCallback) {
        }

        @CanIgnoreReturnValue
        public Builder setPrecondition(DynamicColors.Precondition precondition) {
        }

        @CanIgnoreReturnValue
        public Builder setThemeOverlay(int i) {
        }
    }

    /* synthetic */ DynamicColorsOptions(Builder builder, C03131 c03131) {
    }

    static /* synthetic */ DynamicColors.Precondition access$400() {
    }

    static /* synthetic */ DynamicColors.OnAppliedCallback access$500() {
    }

    private static int extractSeedColorFromImage(Bitmap bitmap) {
    }

    public Integer getContentBasedSeedColor() {
    }

    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
    }

    public DynamicColors.Precondition getPrecondition() {
    }

    public int getThemeOverlay() {
    }

    private DynamicColorsOptions(Builder builder) {
    }
}
