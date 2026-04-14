package com.shuyu.gsyvideoplayer.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.shuyu.gsyvideoplayer.model.GSYVideoModel;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class GSYSampleADVideoPlayer extends ListGSYVideoPlayer {
    protected boolean isAdModel;
    protected boolean isFirstPrepared;
    protected TextView mADTime;
    protected View mJumpAd;
    protected ViewGroup mWidgetContainer;

    /* renamed from: com.shuyu.gsyvideoplayer.video.GSYSampleADVideoPlayer$1 */
    class ViewOnClickListenerC14781 implements View.OnClickListener {
        final /* synthetic */ GSYSampleADVideoPlayer this$0;

        ViewOnClickListenerC14781(GSYSampleADVideoPlayer gSYSampleADVideoPlayer) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static class GSYADVideoModel extends GSYVideoModel {
        public static int TYPE_AD = 1;
        public static int TYPE_NORMAL;
        private boolean isSkip;
        private int mType;

        public GSYADVideoModel(String str, String str2, int i) {
        }

        public int getType() {
        }

        public boolean isSkip() {
        }

        public void setSkip(boolean z) {
        }

        public void setType(int i) {
        }

        public GSYADVideoModel(String str, String str2, int i, boolean z) {
        }
    }

    public GSYSampleADVideoPlayer(Context context, Boolean bool) {
    }

    protected void changeAdUIState() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.ListGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer
    protected void cloneParams(GSYBaseVideoPlayer gSYBaseVideoPlayer, GSYBaseVideoPlayer gSYBaseVideoPlayer2) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    public int getLayoutId() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void hideAllWidget() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView
    protected void init(Context context) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.ListGSYVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer, com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView, com.shuyu.gsyvideoplayer.video.base.GSYVideoView, com.shuyu.gsyvideoplayer.listener.GSYMediaPlayerListener
    public void onPrepared() {
    }

    public boolean setAdUp(ArrayList<GSYADVideoModel> arrayList, boolean z, int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void setProgressAndTime(long j, long j2, long j3, long j4, boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.ListGSYVideoPlayer
    public boolean setUp(List<GSYVideoModel> list, boolean z, int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void touchDoubleUp(MotionEvent motionEvent) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void touchSurfaceMove(float f, float f2, float f3) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void touchSurfaceMoveFullLogic(float f, float f2) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.base.GSYVideoControlView
    protected void touchSurfaceUp() {
    }

    @Override // com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
    protected void updateStartImage() {
    }

    public boolean setAdUp(ArrayList<GSYADVideoModel> arrayList, boolean z, int i, File file) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.ListGSYVideoPlayer
    public boolean setUp(List<GSYVideoModel> list, boolean z, int i, File file) {
    }

    public boolean setAdUp(ArrayList<GSYADVideoModel> arrayList, boolean z, int i, File file, Map<String, String> map) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.ListGSYVideoPlayer
    public boolean setUp(List<GSYVideoModel> list, boolean z, int i, File file, Map<String, String> map) {
    }

    public GSYSampleADVideoPlayer(Context context) {
    }

    @Override // com.shuyu.gsyvideoplayer.video.ListGSYVideoPlayer
    protected boolean setUp(List<GSYVideoModel> list, boolean z, int i, File file, Map<String, String> map, boolean z2) {
    }

    public GSYSampleADVideoPlayer(Context context, AttributeSet attributeSet) {
    }
}
