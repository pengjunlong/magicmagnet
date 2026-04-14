package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_PLAYBACK_SPEED = 4194304;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

    @Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = null;
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    private static final int KEYCODE_MEDIA_PAUSE = 127;
    private static final int KEYCODE_MEDIA_PLAY = 126;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    final long mActions;
    final long mActiveItemId;
    final long mBufferedPosition;
    List<CustomAction> mCustomActions;
    final int mErrorCode;
    final CharSequence mErrorMessage;
    final Bundle mExtras;
    final long mPosition;
    final float mSpeed;
    final int mState;
    private PlaybackState mStateFwk;
    final long mUpdateTime;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$1 */
    class C00281 implements Parcelable.Creator<PlaybackStateCompat> {
        C00281() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PlaybackStateCompat createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PlaybackStateCompat[] newArray(int i) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Actions {
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void addCustomAction(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        }

        static PlaybackState build(PlaybackState.Builder builder) {
        }

        static PlaybackState.Builder createBuilder() {
        }

        static PlaybackState.CustomAction.Builder createCustomActionBuilder(String str, CharSequence charSequence, int i) {
        }

        static String getAction(PlaybackState.CustomAction customAction) {
        }

        static long getActions(PlaybackState playbackState) {
        }

        static long getActiveQueueItemId(PlaybackState playbackState) {
        }

        static long getBufferedPosition(PlaybackState playbackState) {
        }

        static List<PlaybackState.CustomAction> getCustomActions(PlaybackState playbackState) {
        }

        static CharSequence getErrorMessage(PlaybackState playbackState) {
        }

        static Bundle getExtras(PlaybackState.CustomAction customAction) {
        }

        static int getIcon(PlaybackState.CustomAction customAction) {
        }

        static long getLastPositionUpdateTime(PlaybackState playbackState) {
        }

        static CharSequence getName(PlaybackState.CustomAction customAction) {
        }

        static float getPlaybackSpeed(PlaybackState playbackState) {
        }

        static long getPosition(PlaybackState playbackState) {
        }

        static int getState(PlaybackState playbackState) {
        }

        static void setActions(PlaybackState.Builder builder, long j) {
        }

        static void setActiveQueueItemId(PlaybackState.Builder builder, long j) {
        }

        static void setBufferedPosition(PlaybackState.Builder builder, long j) {
        }

        static void setErrorMessage(PlaybackState.Builder builder, CharSequence charSequence) {
        }

        static void setExtras(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        }

        static void setState(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        }

        static PlaybackState.CustomAction build(PlaybackState.CustomAction.Builder builder) {
        }
    }

    private static class Api22Impl {
        private Api22Impl() {
        }

        static Bundle getExtras(PlaybackState playbackState) {
        }

        static void setExtras(PlaybackState.Builder builder, Bundle bundle) {
        }
    }

    public static final class Builder {
        private long mActions;
        private long mActiveItemId;
        private long mBufferedPosition;
        private final List<CustomAction> mCustomActions;
        private int mErrorCode;
        private CharSequence mErrorMessage;
        private Bundle mExtras;
        private long mPosition;
        private float mRate;
        private int mState;
        private long mUpdateTime;

        public Builder() {
        }

        public Builder addCustomAction(String str, String str2, int i) {
        }

        public PlaybackStateCompat build() {
        }

        public Builder setActions(long j) {
        }

        public Builder setActiveQueueItemId(long j) {
        }

        public Builder setBufferedPosition(long j) {
        }

        @Deprecated
        public Builder setErrorMessage(CharSequence charSequence) {
        }

        public Builder setExtras(Bundle bundle) {
        }

        public Builder setState(int i, long j, float f) {
        }

        public Builder addCustomAction(CustomAction customAction) {
        }

        public Builder setErrorMessage(int i, CharSequence charSequence) {
        }

        public Builder setState(int i, long j, float f, long j2) {
        }

        public Builder(PlaybackStateCompat playbackStateCompat) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaKeyAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
    }

    public static PlaybackStateCompat fromPlaybackState(Object obj) {
    }

    public static int toKeyCode(long j) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public long getActions() {
    }

    public long getActiveQueueItemId() {
    }

    public long getBufferedPosition() {
    }

    public long getCurrentPosition(Long l) {
    }

    public List<CustomAction> getCustomActions() {
    }

    public int getErrorCode() {
    }

    public CharSequence getErrorMessage() {
    }

    public Bundle getExtras() {
    }

    public long getLastPositionUpdateTime() {
    }

    public float getPlaybackSpeed() {
    }

    public Object getPlaybackState() {
    }

    public long getPosition() {
    }

    public int getState() {
    }

    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = null;
        private final String mAction;
        private PlaybackState.CustomAction mCustomActionFwk;
        private final Bundle mExtras;
        private final int mIcon;
        private final CharSequence mName;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$1 */
        class C00291 implements Parcelable.Creator<CustomAction> {
            C00291() {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CustomAction createFromParcel(Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CustomAction[] newArray(int i) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
            }
        }

        public static final class Builder {
            private final String mAction;
            private Bundle mExtras;
            private final int mIcon;
            private final CharSequence mName;

            public Builder(String str, CharSequence charSequence, int i) {
            }

            public CustomAction build() {
            }

            public Builder setExtras(Bundle bundle) {
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
        }

        public static CustomAction fromCustomAction(Object obj) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        public String getAction() {
        }

        public Object getCustomAction() {
        }

        public Bundle getExtras() {
        }

        public int getIcon() {
        }

        public CharSequence getName() {
        }

        public String toString() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }

        CustomAction(Parcel parcel) {
        }
    }

    PlaybackStateCompat(Parcel parcel) {
    }
}
