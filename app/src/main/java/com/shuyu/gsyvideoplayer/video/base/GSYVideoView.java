package com.shuyu.gsyvideoplayer.video.base;

import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.Surface;
import com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener;
import com.shuyu.gsyvideoplayer.listener.VideoAllCallBack;
import com.shuyu.gsyvideoplayer.utils.NetInfoModule;
import java.io.File;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class GSYVideoView extends GSYTextureRenderView implements GSYMediaPlayerListener {
    public static final int CHANGE_DELAY_TIME = 2000;
    public static final int CURRENT_STATE_AUTO_COMPLETE = 6;
    public static final int CURRENT_STATE_ERROR = 7;
    public static final int CURRENT_STATE_NORMAL = 0;
    public static final int CURRENT_STATE_PAUSE = 5;
    public static final int CURRENT_STATE_PLAYING = 2;
    public static final int CURRENT_STATE_PLAYING_BUFFERING_START = 3;
    public static final int CURRENT_STATE_PREPAREING = 1;
    protected AudioManager mAudioManager;
    protected int mBackUpPlayingBufferState;
    protected int mBufferPoint;
    protected boolean mCache;
    protected File mCachePath;
    protected Context mContext;
    protected long mCurrentPosition;
    protected int mCurrentState;
    protected boolean mHadPlay;
    protected boolean mHadPrepared;
    protected boolean mIfCurrentIsFullscreen;
    protected boolean mLooping;
    protected Map<String, String> mMapHeadData;
    protected boolean mNetChanged;
    protected NetInfoModule mNetInfoModule;
    protected String mNetSate;
    protected String mOriginUrl;
    protected String mOverrideExtension;
    protected boolean mPauseBeforePrepared;
    protected int mPlayPosition;
    protected String mPlayTag;
    protected boolean mReleaseWhenLossAudio;
    protected long mSaveChangeViewTIme;
    protected int mScreenHeight;
    protected int mScreenWidth;
    protected long mSeekOnStart;
    protected boolean mShowPauseCover;
    protected boolean mSoundTouch;
    protected float mSpeed;
    protected boolean mStartAfterPrepared;
    protected String mTitle;
    protected String mUrl;
    protected VideoAllCallBack mVideoAllCallBack;
    protected AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoView$1 */
    class C14951 implements AudioManager.OnAudioFocusChangeListener {
        final /* synthetic */ GSYVideoView this$0;

        C14951(GSYVideoView gSYVideoView) {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoView$2 */
    class RunnableC14962 implements Runnable {
        final /* synthetic */ GSYVideoView this$0;

        RunnableC14962(GSYVideoView gSYVideoView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoView$3 */
    class RunnableC14973 implements Runnable {
        final /* synthetic */ GSYVideoView this$0;
        final /* synthetic */ long val$currentPosition;

        RunnableC14973(GSYVideoView gSYVideoView, long j) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoView$4 */
    class C14984 implements NetInfoModule.NetChangeListener {
        final /* synthetic */ GSYVideoView this$0;

        C14984(GSYVideoView gSYVideoView) {
        }

        @Override // com.shuyu.gsyvideoplayer.utils.NetInfoModule.NetChangeListener
        public void changed(String str) {
        }
    }

    public GSYVideoView(Context context) {
    }

    protected abstract boolean backFromFull(Context context);

    public void clearCurrentCache() {
    }

    protected void createNetWorkState() {
    }

    protected void deleteCacheFileWhenError() {
    }

    protected Context getActivityContext() {
    }

    public int getBuffterPoint() {
    }

    public long getCurrentPositionWhenPlaying() {
    }

    public int getCurrentState() {
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoHeight() {
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoWidth() {
    }

    public long getDuration() {
    }

    public abstract GSYVideoViewBridge getGSYVideoManager();

    public abstract int getLayoutId();

    public Map<String, String> getMapHeadData() {
    }

    public long getNetSpeed() {
    }

    public String getNetSpeedText() {
    }

    public String getOverrideExtension() {
    }

    public int getPlayPosition() {
    }

    public String getPlayTag() {
    }

    public long getSeekOnStart() {
    }

    public float getSpeed() {
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarDen() {
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarNum() {
    }

    protected void init(Context context) {
    }

    protected void initInflate(Context context) {
    }

    protected boolean isCurrentMediaListener() {
    }

    public boolean isIfCurrentIsFullscreen() {
    }

    public boolean isInPlayingState() {
    }

    public boolean isLooping() {
    }

    public boolean isReleaseWhenLossAudio() {
    }

    public boolean isShowPauseCover() {
    }

    public boolean isStartAfterPrepared() {
    }

    protected void listenerNetWorkState() {
    }

    protected void netWorkErrorLogic() {
    }

    public void onAutoCompletion() {
    }

    public void onCompletion() {
    }

    public void onError(int i, int i2) {
    }

    protected void onGankAudio() {
    }

    public void onInfo(int i, int i2) {
    }

    protected void onLossAudio() {
    }

    protected void onLossTransientAudio() {
    }

    protected void onLossTransientCanDuck() {
    }

    public void onPrepared() {
    }

    public void onSeekComplete() {
    }

    public void onVideoPause() {
    }

    public void onVideoReset() {
    }

    public void onVideoResume() {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onVideoSizeChanged() {
    }

    protected void prepareVideo() {
    }

    public void release() {
    }

    protected void releaseNetWorkState() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void releasePauseCover() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void releaseSurface(Surface surface) {
    }

    protected abstract void releaseVideos();

    public void seekTo(long j) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void setDisplay(Surface surface) {
    }

    public void setIfCurrentIsFullscreen(boolean z) {
    }

    public void setLooping(boolean z) {
    }

    public void setMapHeadData(Map<String, String> map) {
    }

    public void setOverrideExtension(String str) {
    }

    public void setPlayPosition(int i) {
    }

    public void setPlayTag(String str) {
    }

    public void setReleaseWhenLossAudio(boolean z) {
    }

    public void setSeekOnStart(long j) {
    }

    public void setShowPauseCover(boolean z) {
    }

    public void setSpeed(float f) {
    }

    public void setSpeedPlaying(float f, boolean z) {
    }

    public void setStartAfterPrepared(boolean z) {
    }

    protected abstract void setStateAndUi(int i);

    public boolean setUp(String str, boolean z, String str2) {
    }

    public void setVideoAllCallBack(VideoAllCallBack videoAllCallBack) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void showPauseCover() {
    }

    public void startAfterPrepared() {
    }

    protected void startButtonLogic() {
    }

    public abstract void startPlayLogic();

    protected void startPrepare() {
    }

    protected void unListenerNetWorkState() {
    }

    protected void updatePauseCover() {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onVideoResume(boolean z) {
    }

    public void setSpeed(float f, boolean z) {
    }

    public boolean setUp(String str, boolean z, File file, Map<String, String> map, String str2) {
    }

    public boolean setUp(String str, boolean z, File file, String str2) {
    }

    protected boolean setUp(String str, boolean z, File file, String str2, boolean z2) {
    }

    public GSYVideoView(Context context, AttributeSet attributeSet) {
    }

    public GSYVideoView(Context context, AttributeSet attributeSet, int i) {
    }

    public GSYVideoView(Context context, Boolean bool) {
    }
}
