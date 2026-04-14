package com.google.android.material.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    final float badgeRadius;
    final float badgeWidePadding;
    final float badgeWithTextRadius;
    private final State currentState;
    private final State overridingState;

    BadgeState(Context context, int i, int i2, int i3, State state) {
    }

    private TypedArray generateTypedArray(Context context, int i, int i2, int i3) {
    }

    private static int readColorFromAttributes(Context context, TypedArray typedArray, int i) {
    }

    void clearNumber() {
    }

    int getAdditionalHorizontalOffset() {
    }

    int getAdditionalVerticalOffset() {
    }

    int getAlpha() {
    }

    int getBackgroundColor() {
    }

    int getBadgeGravity() {
    }

    int getBadgeTextColor() {
    }

    int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
    }

    CharSequence getContentDescriptionNumberless() {
    }

    int getContentDescriptionQuantityStrings() {
    }

    int getHorizontalOffsetWithText() {
    }

    int getHorizontalOffsetWithoutText() {
    }

    int getMaxCharacterCount() {
    }

    int getNumber() {
    }

    Locale getNumberLocale() {
    }

    State getOverridingState() {
    }

    int getVerticalOffsetWithText() {
    }

    int getVerticalOffsetWithoutText() {
    }

    boolean hasNumber() {
    }

    boolean isVisible() {
    }

    void setAdditionalHorizontalOffset(int i) {
    }

    void setAdditionalVerticalOffset(int i) {
    }

    void setAlpha(int i) {
    }

    void setBackgroundColor(int i) {
    }

    void setBadgeGravity(int i) {
    }

    void setBadgeTextColor(int i) {
    }

    void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
    }

    void setContentDescriptionNumberless(CharSequence charSequence) {
    }

    void setContentDescriptionQuantityStringsResource(int i) {
    }

    void setHorizontalOffsetWithText(int i) {
    }

    void setHorizontalOffsetWithoutText(int i) {
    }

    void setMaxCharacterCount(int i) {
    }

    void setNumber(int i) {
    }

    void setNumberLocale(Locale locale) {
    }

    void setVerticalOffsetWithText(int i) {
    }

    void setVerticalOffsetWithoutText(int i) {
    }

    void setVisible(boolean z) {
    }

    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = null;
        private static final int NOT_SET = -2;
        private Integer additionalHorizontalOffset;
        private Integer additionalVerticalOffset;
        private int alpha;
        private Integer backgroundColor;
        private Integer badgeGravity;
        private int badgeResId;
        private Integer badgeTextColor;
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        private CharSequence contentDescriptionNumberless;
        private int contentDescriptionQuantityStrings;
        private Integer horizontalOffsetWithText;
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;
        private int maxCharacterCount;
        private int number;
        private Locale numberLocale;
        private Integer verticalOffsetWithText;
        private Integer verticalOffsetWithoutText;

        /* renamed from: com.google.android.material.badge.BadgeState$State$1 */
        class C02631 implements Parcelable.Creator<State> {
            C02631() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ State createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ State[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i) {
            }
        }

        public State() {
        }

        static /* synthetic */ int access$000(State state) {
        }

        static /* synthetic */ int access$002(State state, int i) {
        }

        static /* synthetic */ int access$100(State state) {
        }

        static /* synthetic */ Integer access$1000(State state) {
        }

        static /* synthetic */ Integer access$1002(State state, Integer num) {
        }

        static /* synthetic */ int access$102(State state, int i) {
        }

        static /* synthetic */ Integer access$1100(State state) {
        }

        static /* synthetic */ Integer access$1102(State state, Integer num) {
        }

        static /* synthetic */ Integer access$1200(State state) {
        }

        static /* synthetic */ Integer access$1202(State state, Integer num) {
        }

        static /* synthetic */ Integer access$1300(State state) {
        }

        static /* synthetic */ Integer access$1302(State state, Integer num) {
        }

        static /* synthetic */ Integer access$1400(State state) {
        }

        static /* synthetic */ Integer access$1402(State state, Integer num) {
        }

        static /* synthetic */ Integer access$1500(State state) {
        }

        static /* synthetic */ Integer access$1502(State state, Integer num) {
        }

        static /* synthetic */ Integer access$1600(State state) {
        }

        static /* synthetic */ Integer access$1602(State state, Integer num) {
        }

        static /* synthetic */ Locale access$1700(State state) {
        }

        static /* synthetic */ Locale access$1702(State state, Locale locale) {
        }

        static /* synthetic */ CharSequence access$200(State state) {
        }

        static /* synthetic */ CharSequence access$202(State state, CharSequence charSequence) {
        }

        static /* synthetic */ int access$300(State state) {
        }

        static /* synthetic */ int access$302(State state, int i) {
        }

        static /* synthetic */ int access$400(State state) {
        }

        static /* synthetic */ int access$402(State state, int i) {
        }

        static /* synthetic */ Boolean access$500(State state) {
        }

        static /* synthetic */ Boolean access$502(State state, Boolean bool) {
        }

        static /* synthetic */ int access$600(State state) {
        }

        static /* synthetic */ int access$602(State state, int i) {
        }

        static /* synthetic */ int access$700(State state) {
        }

        static /* synthetic */ int access$702(State state, int i) {
        }

        static /* synthetic */ Integer access$800(State state) {
        }

        static /* synthetic */ Integer access$802(State state, Integer num) {
        }

        static /* synthetic */ Integer access$900(State state) {
        }

        static /* synthetic */ Integer access$902(State state, Integer num) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        State(Parcel parcel) {
        }
    }
}
