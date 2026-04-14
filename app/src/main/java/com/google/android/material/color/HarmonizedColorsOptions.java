package com.google.android.material.color;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class HarmonizedColorsOptions {
    private final int colorAttributeToHarmonizeWith;
    private final HarmonizedColorAttributes colorAttributes;
    private final int[] colorResourceIds;

    public static class Builder {
        private int colorAttributeToHarmonizeWith;
        private HarmonizedColorAttributes colorAttributes;
        private int[] colorResourceIds;

        static /* synthetic */ int[] access$000(Builder builder) {
        }

        static /* synthetic */ HarmonizedColorAttributes access$100(Builder builder) {
        }

        static /* synthetic */ int access$200(Builder builder) {
        }

        public HarmonizedColorsOptions build() {
        }

        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(int i) {
        }

        @CanIgnoreReturnValue
        public Builder setColorAttributes(HarmonizedColorAttributes harmonizedColorAttributes) {
        }

        @CanIgnoreReturnValue
        public Builder setColorResourceIds(int[] iArr) {
        }
    }

    /* synthetic */ HarmonizedColorsOptions(Builder builder, C03151 c03151) {
    }

    public static HarmonizedColorsOptions createMaterialDefaults() {
    }

    public int getColorAttributeToHarmonizeWith() {
    }

    public HarmonizedColorAttributes getColorAttributes() {
    }

    public int[] getColorResourceIds() {
    }

    int getThemeOverlayResourceId(int i) {
    }

    private HarmonizedColorsOptions(Builder builder) {
    }
}
