package com.shuyu.gsyvideoplayer.utils;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder;
import com.shuyu.gsyvideoplayer.listener.GSYVideoProgressListener;
import com.shuyu.gsyvideoplayer.listener.LockClickListener;
import com.shuyu.gsyvideoplayer.listener.VideoAllCallBack;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import java.io.File;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class GSYVideoHelper {
    private String TAG;
    private boolean isFull;
    private boolean isSmall;
    private Context mContext;
    private ViewGroup mFullViewContainer;
    private StandardGSYVideoPlayer mGsyVideoPlayer;
    private Handler mHandler;
    private int[] mNormalItemRect;
    private int[] mNormalItemSize;
    private ViewGroup.LayoutParams mNormalParams;
    private OrientationOption mOrientationOption;
    private OrientationUtils mOrientationUtils;
    private ViewGroup mParent;
    private int mPlayPosition;
    private int mSystemUiVisibility;
    private GSYVideoHelperBuilder mVideoOptionBuilder;
    private ViewGroup mWindowViewContainer;

    /* renamed from: com.shuyu.gsyvideoplayer.utils.GSYVideoHelper$1 */
    class ViewOnClickListenerC14611 implements View.OnClickListener {
        final /* synthetic */ GSYVideoHelper this$0;

        ViewOnClickListenerC14611(GSYVideoHelper gSYVideoHelper) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.GSYVideoHelper$2 */
    class RunnableC14622 implements Runnable {
        final /* synthetic */ GSYVideoHelper this$0;

        RunnableC14622(GSYVideoHelper gSYVideoHelper) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.GSYVideoHelper$3 */
    class RunnableC14633 implements Runnable {
        final /* synthetic */ GSYVideoHelper this$0;

        RunnableC14633(GSYVideoHelper gSYVideoHelper) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.GSYVideoHelper$4 */
    class RunnableC14644 implements Runnable {
        final /* synthetic */ GSYVideoHelper this$0;
        final /* synthetic */ GSYVideoPlayer val$gsyVideoPlayer;

        /* renamed from: com.shuyu.gsyvideoplayer.utils.GSYVideoHelper$4$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ RunnableC14644 this$1;

            AnonymousClass1(RunnableC14644 runnableC14644) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        RunnableC14644(GSYVideoHelper gSYVideoHelper, GSYVideoPlayer gSYVideoPlayer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.GSYVideoHelper$5 */
    class RunnableC14655 implements Runnable {
        final /* synthetic */ GSYVideoHelper this$0;

        RunnableC14655(GSYVideoHelper gSYVideoHelper) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.GSYVideoHelper$6 */
    class ViewOnClickListenerC14666 implements View.OnClickListener {
        final /* synthetic */ GSYVideoHelper this$0;

        ViewOnClickListenerC14666(GSYVideoHelper gSYVideoHelper) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static class GSYVideoHelperBuilder extends GSYVideoOptionBuilder {
        protected boolean mHideActionBar;
        protected boolean mHideStatusBar;

        public Drawable getBottomProgressDrawable() {
        }

        public Drawable getBottomShowProgressDrawable() {
        }

        public Drawable getBottomShowProgressThumbDrawable() {
        }

        public File getCachePath() {
        }

        public Drawable getDialogProgressBarDrawable() {
        }

        public int getDialogProgressHighLightColor() {
        }

        public int getDialogProgressNormalColor() {
        }

        public int getDismissControlTime() {
        }

        public GSYVideoGLView.ShaderInterface getEffectFilter() {
        }

        public int getEnlargeImageRes() {
        }

        public GSYVideoProgressListener getGSYVideoProgressListener() {
        }

        public LockClickListener getLockClickListener() {
        }

        public Map<String, String> getMapHeadData() {
        }

        public int getPlayPosition() {
        }

        public String getPlayTag() {
        }

        public long getSeekOnStart() {
        }

        public float getSeekRatio() {
        }

        public int getShrinkImageRes() {
        }

        public float getSpeed() {
        }

        public View getThumbImageView() {
        }

        public String getUrl() {
        }

        public VideoAllCallBack getVideoAllCallBack() {
        }

        public String getVideoTitle() {
        }

        public Drawable getVolumeProgressDrawable() {
        }

        public boolean isCacheWithPlay() {
        }

        public boolean isHideActionBar() {
        }

        public boolean isHideKey() {
        }

        public boolean isHideStatusBar() {
        }

        public boolean isIsTouchWiget() {
        }

        public boolean isIsTouchWigetFull() {
        }

        public boolean isLockLand() {
        }

        public boolean isLooping() {
        }

        public boolean isNeedLockFull() {
        }

        public boolean isNeedShowWifiTip() {
        }

        public boolean isRotateViewAuto() {
        }

        public boolean isRotateWithSystem() {
        }

        public boolean isSetUpLazy() {
        }

        public boolean isShowFullAnimation() {
        }

        public boolean isShowPauseCover() {
        }

        public boolean isSounchTouch() {
        }

        public boolean isThumbPlay() {
        }

        public GSYVideoHelperBuilder setHideActionBar(boolean z) {
        }

        public GSYVideoHelperBuilder setHideStatusBar(boolean z) {
        }
    }

    public GSYVideoHelper(Context context) {
    }

    static /* synthetic */ StandardGSYVideoPlayer access$000(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ void access$100(GSYVideoHelper gSYVideoHelper, GSYVideoPlayer gSYVideoPlayer) {
    }

    static /* synthetic */ ViewGroup access$1000(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ GSYVideoHelperBuilder access$1100(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ Context access$1200(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ int access$1300(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ int[] access$1400(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ int[] access$1500(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ void access$1600(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ Handler access$1700(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ ViewGroup access$200(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ ViewGroup access$300(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ void access$400(GSYVideoHelper gSYVideoHelper, GSYBaseVideoPlayer gSYBaseVideoPlayer) {
    }

    static /* synthetic */ void access$500(GSYVideoHelper gSYVideoHelper, int i) {
    }

    static /* synthetic */ boolean access$602(GSYVideoHelper gSYVideoHelper, boolean z) {
    }

    static /* synthetic */ boolean access$700(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ OrientationUtils access$800(GSYVideoHelper gSYVideoHelper) {
    }

    static /* synthetic */ ViewGroup.LayoutParams access$900(GSYVideoHelper gSYVideoHelper) {
    }

    private boolean isCurrentViewPlaying(int i, String str) {
    }

    private boolean isPlayView(int i, String str) {
    }

    private boolean removeWindowContainer() {
    }

    private void resolveChangeFirstLogic(int i) {
    }

    private void resolveFullAdd() {
    }

    private void resolveMaterialAnimation() {
    }

    private void resolveMaterialFullVideoShow(GSYBaseVideoPlayer gSYBaseVideoPlayer) {
    }

    private void resolveMaterialToNormal(GSYVideoPlayer gSYVideoPlayer) {
    }

    private void resolveToFull() {
    }

    private void resolveToNormal() {
    }

    private void saveLocationStatus(Context context, boolean z, boolean z2) {
    }

    public void addVideoPlayer(int i, View view, String str, ViewGroup viewGroup, View view2) {
    }

    public boolean backFromFull() {
    }

    public void doFullBtnLogic() {
    }

    public GSYVideoOptionBuilder getGsyVideoOptionBuilder() {
    }

    public StandardGSYVideoPlayer getGsyVideoPlayer() {
    }

    public int getPlayPosition() {
    }

    public String getPlayTAG() {
    }

    public boolean isFull() {
    }

    public boolean isSmall() {
    }

    public void releaseVideoPlayer() {
    }

    public void setFullViewContainer(ViewGroup viewGroup) {
    }

    public void setGsyVideoOptionBuilder(GSYVideoHelperBuilder gSYVideoHelperBuilder) {
    }

    public void setOrientationOption(OrientationOption orientationOption) {
    }

    public void setPlayPositionAndTag(int i, String str) {
    }

    public void showSmallVideo(Point point, boolean z, boolean z2) {
    }

    public void smallVideoToNormal() {
    }

    public void startPlay() {
    }

    public GSYVideoHelper(Context context, StandardGSYVideoPlayer standardGSYVideoPlayer) {
    }
}
