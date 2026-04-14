package com.shuyu.gsyvideoplayer.builder;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.shuyu.gsyvideoplayer.listener.GSYStateUiListener;
import com.shuyu.gsyvideoplayer.listener.GSYVideoProgressListener;
import com.shuyu.gsyvideoplayer.listener.LockClickListener;
import com.shuyu.gsyvideoplayer.listener.VideoAllCallBack;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import java.io.File;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GSYVideoOptionBuilder {
    protected boolean isShowDragProgressTextOnSeekBar;
    protected boolean mActionBar;
    protected boolean mAutoFullWithSize;
    protected Drawable mBottomProgressDrawable;
    protected Drawable mBottomShowProgressDrawable;
    protected Drawable mBottomShowProgressThumbDrawable;
    protected File mCachePath;
    protected boolean mCacheWithPlay;
    protected Drawable mDialogProgressBarDrawable;
    protected int mDialogProgressHighLightColor;
    protected int mDialogProgressNormalColor;
    protected int mDismissControlTime;
    protected GSYVideoGLView.ShaderInterface mEffectFilter;
    protected int mEnlargeImageRes;
    protected GSYStateUiListener mGSYStateUiListener;
    protected GSYVideoProgressListener mGSYVideoProgressListener;
    protected boolean mHideKey;
    private boolean mIsOnlyRotateLand;
    protected boolean mIsTouchWiget;
    protected boolean mIsTouchWigetFull;
    protected LockClickListener mLockClickListener;
    protected boolean mLockLand;
    protected boolean mLooping;
    protected Map<String, String> mMapHeadData;
    protected boolean mNeedLockFull;
    protected boolean mNeedOrientationUtils;
    protected boolean mNeedShowWifiTip;
    protected String mOverrideExtension;
    protected int mPlayPosition;
    protected String mPlayTag;
    protected boolean mReleaseWhenLossAudio;
    protected boolean mRotateViewAuto;
    protected boolean mRotateWithSystem;
    protected long mSeekOnStart;
    protected float mSeekRatio;
    protected boolean mSetUpLazy;
    protected boolean mShowFullAnimation;
    protected boolean mShowPauseCover;
    protected int mShrinkImageRes;
    protected boolean mSounchTouch;
    protected float mSpeed;
    protected boolean mStartAfterPrepared;
    protected boolean mStatusBar;
    protected boolean mSurfaceErrorPlay;
    protected View mThumbImageView;
    protected boolean mThumbPlay;
    protected String mUrl;
    protected VideoAllCallBack mVideoAllCallBack;
    protected String mVideoTitle;
    protected Drawable mVolumeProgressDrawable;

    public void build(StandardGSYVideoPlayer standardGSYVideoPlayer) {
    }

    public GSYVideoOptionBuilder setAutoFullWithSize(boolean z) {
    }

    public GSYVideoOptionBuilder setBottomProgressBarDrawable(Drawable drawable) {
    }

    public GSYVideoOptionBuilder setBottomShowProgressBarDrawable(Drawable drawable, Drawable drawable2) {
    }

    public GSYVideoOptionBuilder setCachePath(File file) {
    }

    public GSYVideoOptionBuilder setCacheWithPlay(boolean z) {
    }

    public GSYVideoOptionBuilder setDialogProgressBar(Drawable drawable) {
    }

    public GSYVideoOptionBuilder setDialogProgressColor(int i, int i2) {
    }

    public GSYVideoOptionBuilder setDialogVolumeProgressBar(Drawable drawable) {
    }

    public GSYVideoOptionBuilder setDismissControlTime(int i) {
    }

    public GSYVideoOptionBuilder setEffectFilter(GSYVideoGLView.ShaderInterface shaderInterface) {
    }

    public GSYVideoOptionBuilder setEnlargeImageRes(int i) {
    }

    public GSYVideoOptionBuilder setFullHideActionBar(boolean z) {
    }

    public GSYVideoOptionBuilder setFullHideStatusBar(boolean z) {
    }

    public GSYVideoOptionBuilder setGSYStateUiListener(GSYStateUiListener gSYStateUiListener) {
    }

    public GSYVideoOptionBuilder setGSYVideoProgressListener(GSYVideoProgressListener gSYVideoProgressListener) {
    }

    public GSYVideoOptionBuilder setHideKey(boolean z) {
    }

    public GSYVideoOptionBuilder setIsTouchWiget(boolean z) {
    }

    public GSYVideoOptionBuilder setIsTouchWigetFull(boolean z) {
    }

    public GSYVideoOptionBuilder setLockClickListener(LockClickListener lockClickListener) {
    }

    public GSYVideoOptionBuilder setLockLand(boolean z) {
    }

    public GSYVideoOptionBuilder setLooping(boolean z) {
    }

    public GSYVideoOptionBuilder setMapHeadData(Map<String, String> map) {
    }

    public GSYVideoOptionBuilder setNeedLockFull(boolean z) {
    }

    public GSYVideoOptionBuilder setNeedOrientationUtils(boolean z) {
    }

    public GSYVideoOptionBuilder setNeedShowWifiTip(boolean z) {
    }

    public GSYVideoOptionBuilder setOnlyRotateLand(boolean z) {
    }

    public GSYVideoOptionBuilder setOverrideExtension(String str) {
    }

    public GSYVideoOptionBuilder setPlayPosition(int i) {
    }

    public GSYVideoOptionBuilder setPlayTag(String str) {
    }

    public GSYVideoOptionBuilder setReleaseWhenLossAudio(boolean z) {
    }

    public GSYVideoOptionBuilder setRotateViewAuto(boolean z) {
    }

    public GSYVideoOptionBuilder setRotateWithSystem(boolean z) {
    }

    public GSYVideoOptionBuilder setSeekOnStart(long j) {
    }

    public GSYVideoOptionBuilder setSeekRatio(float f) {
    }

    @Deprecated
    public GSYVideoOptionBuilder setSetUpLazy(boolean z) {
    }

    public GSYVideoOptionBuilder setShowDragProgressTextOnSeekBar(boolean z) {
    }

    public GSYVideoOptionBuilder setShowFullAnimation(boolean z) {
    }

    public GSYVideoOptionBuilder setShowPauseCover(boolean z) {
    }

    public GSYVideoOptionBuilder setShrinkImageRes(int i) {
    }

    public GSYVideoOptionBuilder setSoundTouch(boolean z) {
    }

    public GSYVideoOptionBuilder setSpeed(float f) {
    }

    public GSYVideoOptionBuilder setStartAfterPrepared(boolean z) {
    }

    public GSYVideoOptionBuilder setSurfaceErrorPlay(boolean z) {
    }

    public GSYVideoOptionBuilder setThumbImageView(View view) {
    }

    public GSYVideoOptionBuilder setThumbPlay(boolean z) {
    }

    public GSYVideoOptionBuilder setUrl(String str) {
    }

    public GSYVideoOptionBuilder setVideoAllCallBack(VideoAllCallBack videoAllCallBack) {
    }

    public GSYVideoOptionBuilder setVideoTitle(String str) {
    }

    public void build(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
    }
}
