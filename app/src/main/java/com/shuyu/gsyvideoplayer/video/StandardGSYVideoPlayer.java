package com.shuyu.gsyvideoplayer.video;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotListener;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotSaveListener;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class StandardGSYVideoPlayer extends GSYVideoPlayer {
    protected Drawable mBottomProgressDrawable;
    protected Drawable mBottomShowProgressDrawable;
    protected Drawable mBottomShowProgressThumbDrawable;
    protected Dialog mBrightnessDialog;
    protected TextView mBrightnessDialogTv;
    protected ImageView mDialogIcon;
    protected ProgressBar mDialogProgressBar;
    protected Drawable mDialogProgressBarDrawable;
    protected int mDialogProgressHighLightColor;
    protected int mDialogProgressNormalColor;
    protected TextView mDialogSeekTime;
    protected TextView mDialogTotalTime;
    protected ProgressBar mDialogVolumeProgressBar;
    protected Dialog mProgressDialog;
    protected Dialog mVolumeDialog;
    protected Drawable mVolumeProgressDrawable;

    /* renamed from: com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer$1 */
    class DialogInterfaceOnClickListenerC14791 implements DialogInterface.OnClickListener {
        final /* synthetic */ StandardGSYVideoPlayer this$0;

        DialogInterfaceOnClickListenerC14791(StandardGSYVideoPlayer standardGSYVideoPlayer) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer$2 */
    class DialogInterfaceOnClickListenerC14802 implements DialogInterface.OnClickListener {
        final /* synthetic */ StandardGSYVideoPlayer this$0;

        DialogInterfaceOnClickListenerC14802(StandardGSYVideoPlayer standardGSYVideoPlayer) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public StandardGSYVideoPlayer(Context context, Boolean bool) {
    }

    private void initFullUI(StandardGSYVideoPlayer standardGSYVideoPlayer) {
    }

    protected void changeUiToClear() {
    }

    protected void changeUiToCompleteClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToCompleteShow() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToError() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToNormal() {
    }

    protected void changeUiToPauseClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToPauseShow() {
    }

    protected void changeUiToPlayingBufferingClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToPlayingBufferingShow() {
    }

    protected void changeUiToPlayingClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToPlayingShow() {
    }

    protected void changeUiToPrepareingClear() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void changeUiToPreparingShow() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void dismissBrightnessDialog() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void dismissProgressDialog() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void dismissVolumeDialog() {
    }

    protected int getBrightnessLayoutId() {
    }

    protected int getBrightnessTextId() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
    }

    protected int getProgressDialogAllDurationTextId() {
    }

    protected int getProgressDialogCurrentDurationTextId() {
    }

    protected int getProgressDialogImageId() {
    }

    protected int getProgressDialogLayoutId() {
    }

    protected int getProgressDialogProgressId() {
    }

    protected int getVolumeLayoutId() {
    }

    protected int getVolumeProgressId() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void hideAllWidget() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    protected void init(Context context) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void onClickUiToggle(MotionEvent motionEvent) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
    }

    public void restartTimerTask() {
    }

    public void saveFrame(File file, GSYVideoShotSaveListener gSYVideoShotSaveListener) {
    }

    public void setBottomProgressBarDrawable(Drawable drawable) {
    }

    public void setBottomShowProgressBarDrawable(Drawable drawable, Drawable drawable2) {
    }

    public void setDialogProgressBar(Drawable drawable) {
    }

    public void setDialogProgressColor(int i, int i2) {
    }

    public void setDialogVolumeProgressBar(Drawable drawable) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void showBrightnessDialog(float f) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void showProgressDialog(float f, String str, long j, String str2, long j2) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void showVolumeDialog(float f, int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void showWifiDialog() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public void startPlayLogic() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean z, boolean z2) {
    }

    public void taskShotPic(GSYVideoShotListener gSYVideoShotListener) {
    }

    protected void updateStartImage() {
    }

    public void saveFrame(File file, boolean z, GSYVideoShotSaveListener gSYVideoShotSaveListener) {
    }

    public void taskShotPic(GSYVideoShotListener gSYVideoShotListener, boolean z) {
    }

    public StandardGSYVideoPlayer(Context context) {
    }

    public StandardGSYVideoPlayer(Context context, AttributeSet attributeSet) {
    }
}
