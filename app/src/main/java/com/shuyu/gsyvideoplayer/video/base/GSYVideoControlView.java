package com.shuyu.gsyvideoplayer.video.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.shuyu.gsyvideoplayer.listener.GSYStateUiListener;
import com.shuyu.gsyvideoplayer.listener.GSYVideoProgressListener;
import com.shuyu.gsyvideoplayer.listener.LockClickListener;
import java.io.File;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class GSYVideoControlView extends GSYVideoView implements View.OnClickListener, View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    Runnable dismissControlTask;
    protected GestureDetector gestureDetector;
    protected boolean isShowDragProgressTextOnSeekBar;
    protected ImageView mBackButton;
    protected ViewGroup mBottomContainer;
    protected ProgressBar mBottomProgressBar;
    protected boolean mBrightness;
    protected float mBrightnessData;
    protected boolean mChangePosition;
    protected boolean mChangeVolume;
    protected TextView mCurrentTimeTextView;
    protected int mDismissControlTime;
    protected long mDownPosition;
    protected float mDownX;
    protected float mDownY;
    protected int mEnlargeImageRes;
    protected boolean mFirstTouch;
    protected ImageView mFullscreenButton;
    protected GSYVideoProgressListener mGSYVideoProgressListener;
    protected int mGestureDownVolume;
    protected GSYStateUiListener mGsyStateUiListener;
    protected boolean mHadSeekTouch;
    protected boolean mHideKey;
    protected boolean mIsTouchWiget;
    protected boolean mIsTouchWigetFull;
    protected View mLoadingProgressBar;
    protected LockClickListener mLockClickListener;
    protected boolean mLockCurScreen;
    protected ImageView mLockScreen;
    protected float mMoveY;
    protected boolean mNeedLockFull;
    protected boolean mNeedShowWifiTip;
    protected boolean mPostDismiss;
    protected boolean mPostProgress;
    protected SeekBar mProgressBar;
    protected int mSeekEndOffset;
    protected float mSeekRatio;
    protected long mSeekTimePosition;
    protected boolean mSetUpLazy;
    protected boolean mShowVKey;
    protected int mShrinkImageRes;
    protected View mStartButton;
    protected boolean mSurfaceErrorPlay;
    protected int mThreshold;
    protected View mThumbImageView;
    protected RelativeLayout mThumbImageViewLayout;
    protected boolean mThumbPlay;
    protected TextView mTitleTextView;
    protected ViewGroup mTopContainer;
    protected TextView mTotalTimeTextView;
    protected boolean mTouchingProgressBar;
    Runnable progressTask;

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView$1 */
    class ViewOnClickListenerC14901 implements View.OnClickListener {
        final /* synthetic */ GSYVideoControlView this$0;

        ViewOnClickListenerC14901(GSYVideoControlView gSYVideoControlView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView$2 */
    class C14912 extends GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ GSYVideoControlView this$0;

        C14912(GSYVideoControlView gSYVideoControlView) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView$3 */
    class RunnableC14923 implements Runnable {
        final /* synthetic */ GSYVideoControlView this$0;
        final /* synthetic */ int val$percent;

        RunnableC14923(GSYVideoControlView gSYVideoControlView, int i) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView$4 */
    class RunnableC14934 implements Runnable {
        final /* synthetic */ GSYVideoControlView this$0;

        RunnableC14934(GSYVideoControlView gSYVideoControlView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView$5 */
    class RunnableC14945 implements Runnable {
        final /* synthetic */ GSYVideoControlView this$0;

        RunnableC14945(GSYVideoControlView gSYVideoControlView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public GSYVideoControlView(Context context) {
    }

    protected void cancelDismissControlViewTimer() {
    }

    protected void cancelProgressTimer() {
    }

    protected abstract void changeUiToCompleteShow();

    protected abstract void changeUiToError();

    protected abstract void changeUiToNormal();

    protected abstract void changeUiToPauseShow();

    protected abstract void changeUiToPlayingBufferingShow();

    protected abstract void changeUiToPlayingShow();

    protected abstract void changeUiToPreparingShow();

    public void clearThumbImageView() {
    }

    protected void clickStartIcon() {
    }

    protected abstract void dismissBrightnessDialog();

    protected abstract void dismissProgressDialog();

    protected abstract void dismissVolumeDialog();

    public ImageView getBackButton() {
    }

    public int getDismissControlTime() {
    }

    public int getEnlargeImageRes() {
    }

    public ImageView getFullscreenButton() {
    }

    public GSYStateUiListener getGSYStateUiListener() {
    }

    public float getSeekRatio() {
    }

    public int getShrinkImageRes() {
    }

    public View getStartButton() {
    }

    public View getThumbImageView() {
    }

    public RelativeLayout getThumbImageViewLayout() {
    }

    public TextView getTitleTextView() {
    }

    protected abstract void hideAllWidget();

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    protected void init(Context context) {
    }

    public void initUIState() {
    }

    public boolean isHideKey() {
    }

    public boolean isNeedLockFull() {
    }

    public boolean isNeedShowWifiTip() {
    }

    public boolean isShowDragProgressTextOnSeekBar() {
    }

    protected boolean isShowNetConfirm() {
    }

    public boolean isSurfaceErrorPlay() {
    }

    public boolean isTouchWiget() {
    }

    public boolean isTouchWigetFull() {
    }

    protected void lockTouchLogic() {
    }

    protected void loopSetProgressAndTime() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onAutoCompletion() {
    }

    protected void onBrightnessSlide(float f) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onBufferingUpdate(int i) {
    }

    public void onClick(View view) {
    }

    protected abstract void onClickUiToggle(MotionEvent motionEvent);

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onError(int i, int i2) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onPrepared() {
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    protected void prepareVideo() {
    }

    protected void resetProgressAndTime() {
    }

    protected void resolveThumbImage(View view) {
    }

    protected void resolveUIState(int i) {
    }

    public void setDismissControlTime(int i) {
    }

    public void setEnlargeImageRes(int i) {
    }

    public void setGSYStateUiListener(GSYStateUiListener gSYStateUiListener) {
    }

    public void setGSYVideoProgressListener(GSYVideoProgressListener gSYVideoProgressListener) {
    }

    public void setHideKey(boolean z) {
    }

    public void setIsTouchWiget(boolean z) {
    }

    public void setIsTouchWigetFull(boolean z) {
    }

    public void setLockClickListener(LockClickListener lockClickListener) {
    }

    public void setNeedLockFull(boolean z) {
    }

    public void setNeedShowWifiTip(boolean z) {
    }

    protected void setProgressAndTime(long j, long j2, long j3, long j4, boolean z) {
    }

    protected void setSecondaryProgress(long j) {
    }

    public void setSeekRatio(float f) {
    }

    public void setShowDragProgressTextOnSeekBar(boolean z) {
    }

    public void setShrinkImageRes(int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYTextureRenderView
    protected void setSmallVideoTextureView(View.OnTouchListener onTouchListener) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    protected void setStateAndUi(int i) {
    }

    public void setSurfaceErrorPlay(boolean z) {
    }

    protected void setTextAndProgress(int i) {
    }

    public void setThumbImageView(View view) {
    }

    public void setThumbPlay(boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public boolean setUp(String str, boolean z, String str2) {
    }

    public boolean setUpLazy(String str, boolean z, File file, Map<String, String> map, String str2) {
    }

    protected void setViewShowState(View view, int i) {
    }

    protected abstract void showBrightnessDialog(float f);

    protected void showDragProgressTextOnSeekBar(boolean z, int i) {
    }

    protected abstract void showProgressDialog(float f, String str, long j, String str2, long j2);

    protected abstract void showVolumeDialog(float f, int i);

    protected abstract void showWifiDialog();

    protected void startDismissControlViewTimer() {
    }

    protected void startProgressTimer() {
    }

    protected void touchDoubleUp(MotionEvent motionEvent) {
    }

    protected void touchLongPress(MotionEvent motionEvent) {
    }

    protected void touchSurfaceDown(float f, float f2) {
    }

    protected void touchSurfaceMove(float f, float f2, float f3) {
    }

    protected void touchSurfaceMoveFullLogic(float f, float f2) {
    }

    protected void touchSurfaceUp() {
    }

    protected void setTextAndProgress(int i, boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public boolean setUp(String str, boolean z, File file, String str2) {
    }

    public GSYVideoControlView(Context context, AttributeSet attributeSet) {
    }

    public GSYVideoControlView(Context context, AttributeSet attributeSet, int i) {
    }

    public GSYVideoControlView(Context context, Boolean bool) {
    }
}
