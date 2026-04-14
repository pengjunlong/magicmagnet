package com.shuyu.gsyvideoplayer.video.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.shuyu.gsyvideoplayer.utils.OrientationOption;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class GSYBaseVideoPlayer extends GSYVideoControlView {
    protected boolean isNeedAutoAdaptation;
    protected boolean mActionBar;
    protected boolean mAutoFullWithSize;
    protected View.OnClickListener mBackFromFullScreenListener;
    protected Runnable mCheckoutTask;
    protected boolean mFullAnimEnd;
    protected Handler mInnerHandler;
    private boolean mIsOnlyRotateLand;
    protected int[] mListItemRect;
    protected int[] mListItemSize;
    protected boolean mLockLand;
    protected boolean mNeedOrientationUtils;
    protected OrientationUtils mOrientationUtils;
    protected boolean mRotateViewAuto;
    protected boolean mRotateWithSystem;
    protected boolean mShowFullAnimation;
    protected View mSmallClose;
    protected boolean mStatusBar;
    protected int mSystemUiVisibility;

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$1 */
    class ViewOnClickListenerC14811 implements View.OnClickListener {
        final /* synthetic */ GSYBaseVideoPlayer this$0;

        ViewOnClickListenerC14811(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$2 */
    class RunnableC14822 implements Runnable {
        final /* synthetic */ GSYBaseVideoPlayer this$0;
        final /* synthetic */ FrameLayout val$frameLayout;
        final /* synthetic */ GSYBaseVideoPlayer val$gsyVideoPlayer;
        final /* synthetic */ boolean val$isLockLand;
        final /* synthetic */ boolean val$isVertical;

        RunnableC14822(GSYBaseVideoPlayer gSYBaseVideoPlayer, boolean z, boolean z2, GSYBaseVideoPlayer gSYBaseVideoPlayer2, FrameLayout frameLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$3 */
    class RunnableC14833 implements Runnable {
        final /* synthetic */ GSYBaseVideoPlayer this$0;

        RunnableC14833(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$4 */
    class RunnableC14844 implements Runnable {
        final /* synthetic */ GSYBaseVideoPlayer this$0;
        final /* synthetic */ GSYVideoPlayer val$gsyVideoPlayer;
        final /* synthetic */ View val$oldF;
        final /* synthetic */ ViewGroup val$vp;

        RunnableC14844(GSYBaseVideoPlayer gSYBaseVideoPlayer, View view, ViewGroup viewGroup, GSYVideoPlayer gSYVideoPlayer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$5 */
    class RunnableC14855 implements Runnable {
        final /* synthetic */ GSYBaseVideoPlayer this$0;

        RunnableC14855(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$6 */
    class ViewOnClickListenerC14866 implements View.OnClickListener {
        final /* synthetic */ GSYBaseVideoPlayer this$0;

        ViewOnClickListenerC14866(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$7 */
    class ViewOnClickListenerC14877 implements View.OnClickListener {
        final /* synthetic */ GSYBaseVideoPlayer this$0;

        ViewOnClickListenerC14877(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$8 */
    class RunnableC14888 implements Runnable {
        final /* synthetic */ GSYBaseVideoPlayer this$0;
        final /* synthetic */ Context val$context;
        final /* synthetic */ FrameLayout val$frameLayout;
        final /* synthetic */ GSYBaseVideoPlayer val$gsyVideoPlayer;
        final /* synthetic */ ViewGroup val$vp;

        RunnableC14888(GSYBaseVideoPlayer gSYBaseVideoPlayer, ViewGroup viewGroup, Context context, GSYBaseVideoPlayer gSYBaseVideoPlayer2, FrameLayout frameLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer$9 */
    class RunnableC14899 implements Runnable {
        final /* synthetic */ GSYBaseVideoPlayer this$0;
        final /* synthetic */ GSYBaseVideoPlayer val$gsyVideoPlayer;

        RunnableC14899(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public GSYBaseVideoPlayer(Context context, Boolean bool) {
    }

    private ViewGroup getViewGroup() {
    }

    private void pauseFullBackCoverLogic(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
    }

    private void pauseFullCoverLogic() {
    }

    private void removeVideo(ViewGroup viewGroup, int i) {
    }

    private void saveLocationStatus(Context context, boolean z, boolean z2) {
    }

    protected void autoAdaptation() {
    }

    protected void backToNormal() {
    }

    protected void checkAutoFullSizeWhenFull() {
    }

    protected void checkAutoFullWithSizeAndAdaptation(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
    }

    protected void checkoutState() {
    }

    protected void clearFullscreenLayout() {
    }

    protected void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
    }

    public GSYBaseVideoPlayer getCurrentPlayer() {
    }

    protected abstract int getFullId();

    public GSYVideoPlayer getFullWindowPlayer() {
    }

    public OrientationOption getOrientationOption() {
    }

    public int getSaveBeforeFullSystemUiVisibility() {
    }

    protected abstract int getSmallId();

    public GSYVideoPlayer getSmallWindowPlayer() {
    }

    public void hideSmallVideo() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    protected void init(Context context) {
    }

    public boolean isAutoFullWithSize() {
    }

    public boolean isFullHideActionBar() {
    }

    public boolean isFullHideStatusBar() {
    }

    public boolean isLockLand() {
    }

    protected boolean isLockLandByAutoFullSize() {
    }

    public boolean isNeedAutoAdaptation() {
    }

    public boolean isNeedOrientationUtils() {
    }

    public boolean isOnlyRotateLand() {
    }

    public boolean isRotateViewAuto() {
    }

    public boolean isRotateWithSystem() {
    }

    public boolean isShowFullAnimation() {
    }

    public boolean isVerticalFullByVideoSize() {
    }

    protected boolean isVerticalVideo() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void lockTouchLogic() {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onBackFullscreen() {
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration, OrientationUtils orientationUtils) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onInfo(int i, int i2) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onPrepared() {
    }

    protected void resolveFullVideoShow(Context context, GSYBaseVideoPlayer gSYBaseVideoPlayer, FrameLayout frameLayout) {
    }

    protected void resolveNormalVideoShow(View view, ViewGroup viewGroup, GSYVideoPlayer gSYVideoPlayer) {
    }

    public void setAutoFullWithSize(boolean z) {
    }

    public void setBackFromFullScreenListener(View.OnClickListener onClickListener) {
    }

    public void setFullHideActionBar(boolean z) {
    }

    public void setFullHideStatusBar(boolean z) {
    }

    public void setLockLand(boolean z) {
    }

    public void setNeedAutoAdaptation(boolean z) {
    }

    public void setNeedOrientationUtils(boolean z) {
    }

    public void setOnlyRotateLand(boolean z) {
    }

    public void setRotateViewAuto(boolean z) {
    }

    public void setRotateWithSystem(boolean z) {
    }

    public void setSaveBeforeFullSystemUiVisibility(int i) {
    }

    public void setShowFullAnimation(boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void setSmallVideoTextureView() {
    }

    public GSYBaseVideoPlayer showSmallVideo(Point point, boolean z, boolean z2) {
    }

    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean z, boolean z2) {
    }

    public void onConfigurationChanged(Activity activity, Configuration configuration, OrientationUtils orientationUtils, boolean z, boolean z2) {
    }

    public GSYBaseVideoPlayer(Context context) {
    }

    public GSYBaseVideoPlayer(Context context, AttributeSet attributeSet) {
    }

    public GSYBaseVideoPlayer(Context context, AttributeSet attributeSet, int i) {
    }
}
