package com.shuyu.gsyvideoplayer.utils;

import com.shuyu.gsyvideoplayer.listener.GSYVideoGifSaveListener;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotSaveListener;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import java.io.File;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class GifCreateHelper {
    private int mDelay;
    private int mFrequencyCount;
    private GSYVideoGifSaveListener mGSYVideoGifSaveListener;
    private List<String> mPicList;
    private StandardGSYVideoPlayer mPlayer;
    private int mSampleSize;
    private boolean mSaveShotBitmapSuccess;
    private int mScaleSize;
    private Timer mTimer;
    private TaskLocal mTimerTask;
    private File mTmpPath;

    /* renamed from: com.shuyu.gsyvideoplayer.utils.GifCreateHelper$1 */
    class RunnableC14671 implements Runnable {
        final /* synthetic */ GifCreateHelper this$0;
        final /* synthetic */ File val$path;

        RunnableC14671(GifCreateHelper gifCreateHelper, File file) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.GifCreateHelper$2 */
    class C14682 implements GSYVideoShotSaveListener {
        final /* synthetic */ GifCreateHelper this$0;

        C14682(GifCreateHelper gifCreateHelper) {
        }

        @Override // com.shuyu.gsyvideoplayer.listener.GSYVideoShotSaveListener
        public void result(boolean z, File file) {
        }
    }

    private class TaskLocal extends TimerTask {
        final /* synthetic */ GifCreateHelper this$0;

        private TaskLocal(GifCreateHelper gifCreateHelper) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }

        /* synthetic */ TaskLocal(GifCreateHelper gifCreateHelper, RunnableC14671 runnableC14671) {
        }
    }

    public GifCreateHelper(StandardGSYVideoPlayer standardGSYVideoPlayer, GSYVideoGifSaveListener gSYVideoGifSaveListener) {
    }

    static /* synthetic */ List access$100(GifCreateHelper gifCreateHelper) {
    }

    static /* synthetic */ int access$200(GifCreateHelper gifCreateHelper) {
    }

    static /* synthetic */ int access$300(GifCreateHelper gifCreateHelper) {
    }

    static /* synthetic */ int access$400(GifCreateHelper gifCreateHelper) {
    }

    static /* synthetic */ GSYVideoGifSaveListener access$500(GifCreateHelper gifCreateHelper) {
    }

    static /* synthetic */ boolean access$600(GifCreateHelper gifCreateHelper) {
    }

    static /* synthetic */ boolean access$602(GifCreateHelper gifCreateHelper, boolean z) {
    }

    static /* synthetic */ void access$700(GifCreateHelper gifCreateHelper) {
    }

    private void startSaveBitmap() {
    }

    public void cancelTask() {
    }

    public void createGif(File file, List<String> list, int i, int i2, int i3, GSYVideoGifSaveListener gSYVideoGifSaveListener) {
    }

    public void startGif(File file) {
    }

    public void stopGif(File file) {
    }

    public GifCreateHelper(StandardGSYVideoPlayer standardGSYVideoPlayer, GSYVideoGifSaveListener gSYVideoGifSaveListener, int i, int i2, int i3, int i4) {
    }
}
