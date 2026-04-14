package com.shuyu.gsyvideoplayer.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import java.lang.ref.WeakReference;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OrientationUtils {
    private static final int LAND_TYPE_NORMAL = 1;
    private static final int LAND_TYPE_NULL = 0;
    private static final int LAND_TYPE_REVERSE = 2;
    private WeakReference<Activity> mActivity;
    private boolean mClick;
    private boolean mClickLand;
    private boolean mClickPort;
    private boolean mEnable;
    private int mIsLand;
    private boolean mIsOnlyRotateLand;
    private boolean mIsPause;
    private OrientationEventListener mOrientationEventListener;
    private OrientationOption mOrientationOption;
    private boolean mRotateWithSystem;
    private int mScreenType;
    private GSYBaseVideoPlayer mVideoPlayer;

    /* renamed from: com.shuyu.gsyvideoplayer.utils.OrientationUtils$1 */
    class C14761 extends OrientationEventListener {
        final /* synthetic */ OrientationUtils this$0;
        final /* synthetic */ Context val$context;

        C14761(OrientationUtils orientationUtils, Context context, Context context2) {
        }

        @Override // android.view.OrientationEventListener
        @SuppressLint({"SourceLockedOrientationActivity"})
        public void onOrientationChanged(int i) {
        }
    }

    public OrientationUtils(Activity activity, GSYBaseVideoPlayer gSYBaseVideoPlayer) {
    }

    static /* synthetic */ boolean access$000(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ boolean access$100(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ void access$1000(OrientationUtils orientationUtils, int i) {
    }

    static /* synthetic */ GSYBaseVideoPlayer access$200(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ boolean access$300(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ OrientationOption access$400(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ boolean access$500(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ boolean access$502(OrientationUtils orientationUtils, boolean z) {
    }

    static /* synthetic */ int access$600(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ int access$602(OrientationUtils orientationUtils, int i) {
    }

    static /* synthetic */ boolean access$700(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ boolean access$702(OrientationUtils orientationUtils, boolean z) {
    }

    static /* synthetic */ boolean access$800(OrientationUtils orientationUtils) {
    }

    static /* synthetic */ boolean access$802(OrientationUtils orientationUtils, boolean z) {
    }

    static /* synthetic */ int access$902(OrientationUtils orientationUtils, int i) {
    }

    private void initGravity(Activity activity) {
    }

    private void setRequestedOrientation(int i) {
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public int backToProtVideo() {
    }

    public int getIsLand() {
    }

    public OrientationOption getOrientationOption() {
    }

    public int getScreenType() {
    }

    protected void init() {
    }

    public boolean isClick() {
    }

    public boolean isClickLand() {
    }

    public boolean isClickPort() {
    }

    public boolean isEnable() {
    }

    public boolean isOnlyRotateLand() {
    }

    public boolean isPause() {
    }

    public boolean isRotateWithSystem() {
    }

    public void releaseListener() {
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public void resolveByClick() {
    }

    public void setClick(boolean z) {
    }

    public void setClickLand(boolean z) {
    }

    public void setClickPort(boolean z) {
    }

    public void setEnable(boolean z) {
    }

    public void setIsLand(int i) {
    }

    public void setIsPause(boolean z) {
    }

    public void setOnlyRotateLand(boolean z) {
    }

    public void setOrientationOption(OrientationOption orientationOption) {
    }

    public void setRotateWithSystem(boolean z) {
    }

    public void setScreenType(int i) {
    }

    public OrientationUtils(Activity activity, GSYBaseVideoPlayer gSYBaseVideoPlayer, OrientationOption orientationOption) {
    }
}
