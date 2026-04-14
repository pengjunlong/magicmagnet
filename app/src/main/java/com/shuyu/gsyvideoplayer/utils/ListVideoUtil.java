package com.shuyu.gsyvideoplayer.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.listener.VideoAllCallBack;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import java.io.File;
import java.util.Map;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ListVideoUtil {
    private String TAG;
    private boolean autoRotation;
    private File cachePath;
    private Context context;
    private boolean fullLandFrist;
    private ViewGroup fullViewContainer;
    private StandardGSYVideoPlayer gsyVideoPlayer;
    private Handler handler;
    private boolean hideActionBar;
    private boolean hideKey;
    private boolean hideStatusBar;
    private boolean isFull;
    private boolean isLoop;
    private boolean isSmall;
    private int[] listItemRect;
    private int[] listItemSize;
    private ViewGroup.LayoutParams listParams;
    private ViewGroup listParent;
    private String mTitle;
    private Map<String, String> mapHeadData;
    private boolean needLockFull;
    protected boolean needShowWifiTip;
    private OrientationUtils orientationUtils;
    private int playPosition;
    private boolean showFullAnimation;
    private int speed;
    private int systemUiVisibility;
    private String url;
    private VideoAllCallBack videoAllCallBack;

    /* renamed from: com.shuyu.gsyvideoplayer.utils.ListVideoUtil$1 */
    class ViewOnClickListenerC14691 implements View.OnClickListener {
        final /* synthetic */ ListVideoUtil this$0;

        ViewOnClickListenerC14691(ListVideoUtil listVideoUtil) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.ListVideoUtil$2 */
    class ViewOnClickListenerC14702 implements View.OnClickListener {
        final /* synthetic */ ListVideoUtil this$0;

        ViewOnClickListenerC14702(ListVideoUtil listVideoUtil) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.ListVideoUtil$3 */
    class RunnableC14713 implements Runnable {
        final /* synthetic */ ListVideoUtil this$0;

        RunnableC14713(ListVideoUtil listVideoUtil) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.ListVideoUtil$4 */
    class RunnableC14724 implements Runnable {
        final /* synthetic */ ListVideoUtil this$0;

        RunnableC14724(ListVideoUtil listVideoUtil) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.ListVideoUtil$5 */
    class RunnableC14735 implements Runnable {
        final /* synthetic */ ListVideoUtil this$0;
        final /* synthetic */ GSYVideoPlayer val$gsyVideoPlayer;

        /* renamed from: com.shuyu.gsyvideoplayer.utils.ListVideoUtil$5$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ RunnableC14735 this$1;

            AnonymousClass1(RunnableC14735 runnableC14735) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        RunnableC14735(ListVideoUtil listVideoUtil, GSYVideoPlayer gSYVideoPlayer) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.utils.ListVideoUtil$6 */
    class RunnableC14746 implements Runnable {
        final /* synthetic */ ListVideoUtil this$0;

        RunnableC14746(ListVideoUtil listVideoUtil) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public ListVideoUtil(Context context) {
    }

    static /* synthetic */ StandardGSYVideoPlayer access$000(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ void access$100(ListVideoUtil listVideoUtil, GSYVideoPlayer gSYVideoPlayer) {
    }

    static /* synthetic */ String access$1000(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ String access$1100(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ boolean access$1200(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ Context access$1300(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ int access$1400(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ boolean access$1500(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ boolean access$1600(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ int[] access$1700(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ int[] access$1800(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ void access$1900(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ ViewGroup access$200(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ Handler access$2000(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ void access$300(ListVideoUtil listVideoUtil, GSYBaseVideoPlayer gSYBaseVideoPlayer) {
    }

    static /* synthetic */ void access$400(ListVideoUtil listVideoUtil, int i) {
    }

    static /* synthetic */ boolean access$502(ListVideoUtil listVideoUtil, boolean z) {
    }

    static /* synthetic */ OrientationUtils access$600(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ ViewGroup.LayoutParams access$700(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ ViewGroup access$800(ListVideoUtil listVideoUtil) {
    }

    static /* synthetic */ VideoAllCallBack access$900(ListVideoUtil listVideoUtil) {
    }

    private boolean isCurrentViewPlaying(int i, String str) {
    }

    private boolean isPlayView(int i, String str) {
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

    public File getCachePath() {
    }

    public long getCurrentPositionWhenPlaying() {
    }

    public long getDuration() {
    }

    public StandardGSYVideoPlayer getGsyVideoPlayer() {
    }

    public Map<String, String> getMapHeadData() {
    }

    public int getPlayPosition() {
    }

    public String getPlayTAG() {
    }

    public int getSpeed() {
    }

    public String getTitle() {
    }

    public boolean isAutoRotation() {
    }

    public boolean isFull() {
    }

    public boolean isFullLandFrist() {
    }

    public boolean isHideActionBar() {
    }

    public boolean isHideKey() {
    }

    public boolean isHideStatusBar() {
    }

    public boolean isLoop() {
    }

    public boolean isNeedLockFull() {
    }

    public boolean isNeedShowWifiTip() {
    }

    public boolean isShowFullAnimation() {
    }

    public boolean isSmall() {
    }

    public void releaseVideoPlayer() {
    }

    public void resolveFullBtn() {
    }

    public void setAutoRotation(boolean z) {
    }

    public void setCachePath(File file) {
    }

    public void setFullLandFrist(boolean z) {
    }

    public void setFullViewContainer(ViewGroup viewGroup) {
    }

    public void setHideActionBar(boolean z) {
    }

    public void setHideKey(boolean z) {
    }

    public void setHideStatusBar(boolean z) {
    }

    public void setLoop(boolean z) {
    }

    public void setMapHeadData(Map<String, String> map) {
    }

    public void setNeedLockFull(boolean z) {
    }

    public void setNeedShowWifiTip(boolean z) {
    }

    public void setPlayPositionAndTag(int i, String str) {
    }

    public void setShowFullAnimation(boolean z) {
    }

    public void setSpeed(int i) {
    }

    public void setTitle(String str) {
    }

    public void setVideoAllCallBack(VideoAllCallBack videoAllCallBack) {
    }

    public void showSmallVideo(Point point, boolean z, boolean z2) {
    }

    public void smallVideoToNormal() {
    }

    public void startPlay(String str) {
    }
}
