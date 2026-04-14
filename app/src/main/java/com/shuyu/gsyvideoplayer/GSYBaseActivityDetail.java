package com.shuyu.gsyvideoplayer;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder;
import com.shuyu.gsyvideoplayer.listener.VideoAllCallBack;
import com.shuyu.gsyvideoplayer.utils.OrientationOption;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class GSYBaseActivityDetail<T extends GSYBaseVideoPlayer> extends AppCompatActivity implements VideoAllCallBack {
    protected boolean isPause;
    protected boolean isPlay;
    protected OrientationUtils orientationUtils;

    /* renamed from: com.shuyu.gsyvideoplayer.GSYBaseActivityDetail$1 */
    class ViewOnClickListenerC14441 implements View.OnClickListener {
        final /* synthetic */ GSYBaseActivityDetail this$0;

        ViewOnClickListenerC14441(GSYBaseActivityDetail gSYBaseActivityDetail) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public abstract void clickForFullScreen();

    public abstract boolean getDetailOrientationRotateAuto();

    public abstract GSYVideoOptionBuilder getGSYVideoOptionBuilder();

    public abstract T getGSYVideoPlayer();

    public OrientationOption getOrientationOption() {
    }

    public boolean hideActionBarWhenFull() {
    }

    public boolean hideStatusBarWhenFull() {
    }

    public void initVideo() {
    }

    public void initVideoBuilderMode() {
    }

    public boolean isAutoFullWithSize() {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onAutoComplete(String str, Object... objArr) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickBlank(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickBlankFullscreen(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickResume(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickResumeFullscreen(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickSeekbar(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickSeekbarFullscreen(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickStartError(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickStartIcon(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickStartThumb(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickStop(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onClickStopFullscreen(String str, Object... objArr) {
    }

    public void onComplete(String str, Object... objArr) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
    }

    public void onEnterFullscreen(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onEnterSmallWidget(String str, Object... objArr) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onPlayError(String str, Object... objArr) {
    }

    public void onPrepared(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onQuitFullscreen(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onQuitSmallWidget(String str, Object... objArr) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
    }

    public void onStartPrepared(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onTouchScreenSeekLight(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onTouchScreenSeekPosition(String str, Object... objArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.listener.VideoAllCallBack
    public void onTouchScreenSeekVolume(String str, Object... objArr) {
    }

    public void showFull() {
    }
}
