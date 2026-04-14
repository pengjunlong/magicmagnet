package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private int changeFrameRateStrategy;
    private final DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final FixedFrameRateEstimator frameRateEstimator;
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;
    private final VSyncSampler vsyncSampler;

    private static final class Api30 {
        private Api30() {
        }

        public static void setSurfaceFrameRate(Surface surface, float f) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public interface DisplayHelper {

        public interface Listener {
            void onDefaultDisplayChanged(Display display);
        }

        void register(Listener listener);

        void unregister();
    }

    private static final class DisplayHelperV16 implements DisplayHelper {
        private final WindowManager windowManager;

        private DisplayHelperV16(WindowManager windowManager) {
        }

        public static DisplayHelper maybeBuildNewInstance(Context context) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(DisplayHelper.Listener listener) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
        }
    }

    private static final class DisplayHelperV17 implements DisplayHelper, DisplayManager.DisplayListener {
        private final DisplayManager displayManager;
        private DisplayHelper.Listener listener;

        private DisplayHelperV17(DisplayManager displayManager) {
        }

        private Display getDefaultDisplay() {
        }

        public static DisplayHelper maybeBuildNewInstance(Context context) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(DisplayHelper.Listener listener) {
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
        }
    }

    private static final class VSyncSampler implements Choreographer.FrameCallback, Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 0;
        private static final VSyncSampler INSTANCE = null;
        private static final int MSG_ADD_OBSERVER = 1;
        private static final int MSG_REMOVE_OBSERVER = 2;
        private Choreographer choreographer;
        private final HandlerThread choreographerOwnerThread;
        private final Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs;

        private VSyncSampler() {
        }

        private void addObserverInternal() {
        }

        private void createChoreographerInstanceInternal() {
        }

        public static VSyncSampler getInstance() {
        }

        private void removeObserverInternal() {
        }

        public void addObserver() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }

        public void removeObserver() {
        }
    }

    public VideoFrameReleaseHelper(Context context) {
    }

    private static boolean adjustmentAllowed(long j, long j2) {
    }

    private void clearSurfaceFrameRate() {
    }

    private static long closestVsync(long j, long j2, long j3) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(VideoFrameReleaseHelper videoFrameReleaseHelper, Display display) {
    }

    private static DisplayHelper maybeBuildDisplayHelper(Context context) {
    }

    private void resetAdjustment() {
    }

    private void updateDefaultDisplayRefreshRateParams(Display display) {
    }

    private void updateSurfaceMediaFrameRate() {
    }

    private void updateSurfacePlaybackFrameRate(boolean z) {
    }

    public long adjustReleaseTime(long j) {
    }

    public void onFormatChanged(float f) {
    }

    public void onNextFrame(long j) {
    }

    public void onPlaybackSpeed(float f) {
    }

    public void onPositionReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    public void onSurfaceChanged(Surface surface) {
    }

    public void setChangeFrameRateStrategy(int i) {
    }
}
