package com.shuyu.gsyvideoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener;
import com.shuyu.gsyvideoplayer.model.VideoOptionModel;
import com.shuyu.gsyvideoplayer.player.IPlayerInitSuccessListener;
import com.shuyu.gsyvideoplayer.player.IPlayerManager;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge;
import java.io.BufferedInputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class GSYVideoBaseManager implements IMediaPlayer.OnPreparedListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnInfoListener, ICacheManager.ICacheAvailableListener, GSYVideoViewBridge {
    protected static final int BUFFER_TIME_OUT_ERROR = -192;
    protected static final int HANDLER_PREPARE = 0;
    protected static final int HANDLER_RELEASE = 2;
    protected static final int HANDLER_RELEASE_SURFACE = 3;
    protected static final int HANDLER_SETDISPLAY = 1;
    public static String TAG = "GSYVideoBaseManager";
    protected int bufferPoint;
    protected ICacheManager cacheManager;
    protected Context context;
    protected int currentVideoHeight;
    protected int currentVideoWidth;
    protected WeakReference<GSYMediaPlayerListener> lastListener;
    protected int lastState;
    protected WeakReference<GSYMediaPlayerListener> listener;
    protected MediaHandler mMediaHandler;
    protected IPlayerInitSuccessListener mPlayerInitSuccessListener;
    private Runnable mTimeOutRunnable;
    protected Handler mainThreadHandler;
    protected boolean needMute;
    protected boolean needTimeOutOther;
    protected List<VideoOptionModel> optionModelList;
    protected int playPosition;
    protected String playTag;
    protected IPlayerManager playerManager;
    protected int timeOut;

    /* renamed from: com.shuyu.gsyvideoplayer.GSYVideoBaseManager$1 */
    class RunnableC14451 implements Runnable {
        final /* synthetic */ GSYVideoBaseManager this$0;

        RunnableC14451(GSYVideoBaseManager gSYVideoBaseManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.GSYVideoBaseManager$2 */
    class RunnableC14462 implements Runnable {
        final /* synthetic */ GSYVideoBaseManager this$0;

        RunnableC14462(GSYVideoBaseManager gSYVideoBaseManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.GSYVideoBaseManager$3 */
    class RunnableC14473 implements Runnable {
        final /* synthetic */ GSYVideoBaseManager this$0;
        final /* synthetic */ int val$percent;

        RunnableC14473(GSYVideoBaseManager gSYVideoBaseManager, int i) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.GSYVideoBaseManager$4 */
    class RunnableC14484 implements Runnable {
        final /* synthetic */ GSYVideoBaseManager this$0;

        RunnableC14484(GSYVideoBaseManager gSYVideoBaseManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.GSYVideoBaseManager$5 */
    class RunnableC14495 implements Runnable {
        final /* synthetic */ GSYVideoBaseManager this$0;
        final /* synthetic */ int val$extra;
        final /* synthetic */ int val$what;

        RunnableC14495(GSYVideoBaseManager gSYVideoBaseManager, int i, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.GSYVideoBaseManager$6 */
    class RunnableC14506 implements Runnable {
        final /* synthetic */ GSYVideoBaseManager this$0;
        final /* synthetic */ int val$extra;
        final /* synthetic */ int val$what;

        RunnableC14506(GSYVideoBaseManager gSYVideoBaseManager, int i, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.GSYVideoBaseManager$7 */
    class RunnableC14517 implements Runnable {
        final /* synthetic */ GSYVideoBaseManager this$0;

        RunnableC14517(GSYVideoBaseManager gSYVideoBaseManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.GSYVideoBaseManager$8 */
    class RunnableC14528 implements Runnable {
        final /* synthetic */ GSYVideoBaseManager this$0;

        RunnableC14528(GSYVideoBaseManager gSYVideoBaseManager) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private class MediaHandler extends Handler {
        final /* synthetic */ GSYVideoBaseManager this$0;

        MediaHandler(GSYVideoBaseManager gSYVideoBaseManager, Looper looper) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    static /* synthetic */ void access$000(GSYVideoBaseManager gSYVideoBaseManager, Message message) {
    }

    static /* synthetic */ void access$100(GSYVideoBaseManager gSYVideoBaseManager, Message message) {
    }

    private void initVideo(Message message) {
    }

    private void showDisplay(Message message) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public boolean cachePreview(Context context, File file, String str) {
    }

    protected void cancelTimeOutBuffer() {
    }

    public void clearAllDefaultCache(Context context) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void clearCache(Context context, File file, String str) {
    }

    public void clearDefaultCache(Context context, File file, String str) {
    }

    public void enableRawPlay(Context context) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getBufferedPercentage() {
    }

    protected ICacheManager getCacheManager() {
    }

    public ICacheManager getCurCacheManager() {
    }

    public IPlayerManager getCurPlayerManager() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public long getCurrentPosition() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getCurrentVideoHeight() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getCurrentVideoWidth() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public long getDuration() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getLastState() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public long getNetSpeed() {
    }

    public List<VideoOptionModel> getOptionModelList() {
    }

    protected IPlayerManager getPlayManager() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getPlayPosition() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public String getPlayTag() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public IPlayerManager getPlayer() {
    }

    public IPlayerInitSuccessListener getPlayerPreparedSuccessListener() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getRotateInfoFlag() {
    }

    public int getTimeOut() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getVideoHeight() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getVideoSarDen() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getVideoSarNum() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public int getVideoWidth() {
    }

    protected void init() {
    }

    public void initContext(Context context) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public boolean isCacheFile() {
    }

    public boolean isNeedMute() {
    }

    public boolean isNeedTimeOutOther() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public boolean isPlaying() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public boolean isSurfaceSupportLockCanvas() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public GSYMediaPlayerListener lastListener() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public GSYMediaPlayerListener listener() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.cache.ICacheManager.ICacheAvailableListener
    public void onCacheAvailable(File file, String str, int i) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    public void onPrepared(IMediaPlayer iMediaPlayer) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void pause() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void prepare(String str, Map<String, String> map, boolean z, float f, boolean z2, File file) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void releaseMediaPlayer() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void releaseSurface(Surface surface) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void seekTo(long j) {
    }

    protected void sendMessage(Message message) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setCurrentVideoHeight(int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setCurrentVideoWidth(int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setDisplay(Surface surface) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setLastListener(GSYMediaPlayerListener gSYMediaPlayerListener) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setLastState(int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setListener(GSYMediaPlayerListener gSYMediaPlayerListener) {
    }

    public void setNeedMute(boolean z) {
    }

    public void setOptionModelList(List<VideoOptionModel> list) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setPlayPosition(int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setPlayTag(String str) {
    }

    public void setPlayerInitSuccessListener(IPlayerInitSuccessListener iPlayerInitSuccessListener) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setSpeed(float f, boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void setSpeedPlaying(float f, boolean z) {
    }

    public void setTimeOut(int i, boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void start() {
    }

    protected void startTimeOutBuffer() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void stop() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void prepare(String str, Map<String, String> map, boolean z, float f, boolean z2, File file, String str2) {
    }

    private void releaseSurface(Message message) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void prepare(BufferedInputStream bufferedInputStream, Map<String, String> map, boolean z, float f, boolean z2, File file) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoViewBridge
    public void prepare(BufferedInputStream bufferedInputStream, Map<String, String> map, boolean z, float f, boolean z2, File file, String str) {
    }
}
