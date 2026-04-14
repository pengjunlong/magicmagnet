package com.shuyu.gsyvideoplayer;

import android.content.res.Configuration;
import android.view.View;
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder;
import com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack;
import com.shuyu.gsyvideoplayer.utils.OrientationOption;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.GSYADVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class GSYBaseADActivityDetail<T extends GSYBaseVideoPlayer, R extends GSYADVideoPlayer> extends GSYBaseActivityDetail<T> {
    protected OrientationUtils mADOrientationUtils;

    /* renamed from: com.shuyu.gsyvideoplayer.GSYBaseADActivityDetail$1 */
    class ViewOnClickListenerC14421 implements View.OnClickListener {
        final /* synthetic */ GSYBaseADActivityDetail this$0;

        ViewOnClickListenerC14421(GSYBaseADActivityDetail gSYBaseADActivityDetail) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.GSYBaseADActivityDetail$2 */
    class C14432 extends GSYSampleCallBack {
        final /* synthetic */ GSYBaseADActivityDetail this$0;

        C14432(GSYBaseADActivityDetail gSYBaseADActivityDetail) {
        }

        @Override // com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack, com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
        public void onAutoComplete(String str, Object... objArr) {
        }

        @Override // com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack, com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
        public void onQuitFullscreen(String str, Object... objArr) {
        }

        @Override // com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack, com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
        public void onStartPrepared(String str, Object... objArr) {
        }
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail
    public void clickForFullScreen() {
    }

    public abstract GSYVideoOptionBuilder getGSYADVideoOptionBuilder();

    public abstract R getGSYADVideoPlayer();

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail
    public OrientationOption getOrientationOption() {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail
    public void initVideo() {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail
    public void initVideoBuilderMode() {
    }

    protected boolean isADStarted() {
    }

    public abstract boolean isNeedAdOnStart();

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onComplete(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onEnterFullscreen(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onPrepared(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail, com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onStartPrepared(String str, Object... objArr) {
    }

    public void showADFull() {
    }

    @Override // com.shuyu.gsyvideoplayer.GSYBaseActivityDetail
    public void showFull() {
    }

    public void startAdPlay() {
    }
}
