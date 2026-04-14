package com.shuyu.gsyvideoplayer.player;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.Surface;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import com.shuyu.gsyvideoplayer.model.VideoOptionModel;
import java.util.List;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkLibLoader;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.misc.IjkTrackInfo;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class IjkPlayerManager extends BasePlayerManager {
    private static IjkLibLoader ijkLibLoader = null;
    private static int logLevel = 1;
    private IjkMediaPlayer mediaPlayer;
    private List<VideoOptionModel> optionModelList;
    private Surface surface;

    /* renamed from: com.shuyu.gsyvideoplayer.player.IjkPlayerManager$1 */
    class C14541 implements IjkMediaPlayer.OnNativeInvokeListener {
        final /* synthetic */ IjkPlayerManager this$0;

        C14541(IjkPlayerManager ijkPlayerManager) {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
        public boolean onNativeInvoke(int i, Bundle bundle) {
        }
    }

    public static IjkLibLoader getIjkLibLoader() {
    }

    public static int getLogLevel() {
    }

    private void initIJKOption(IjkMediaPlayer ijkMediaPlayer, List<VideoOptionModel> list) {
    }

    public static void setIjkLibLoader(IjkLibLoader ijkLibLoader2) {
    }

    public static void setLogLevel(int i) {
    }

    public void deselectTrack(int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getBufferedPercentage() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getCurrentPosition() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getDuration() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public IMediaPlayer getMediaPlayer() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public long getNetSpeed() {
    }

    public List<VideoOptionModel> getOptionModelList() {
    }

    public int getSelectedTrack(int i) {
    }

    public IjkTrackInfo[] getTrackInfo() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoHeight() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoSarDen() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoSarNum() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public int getVideoWidth() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void initVideoPlayer(Context context, Message message, List<VideoOptionModel> list, ICacheManager iCacheManager) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public boolean isPlaying() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public boolean isSurfaceSupportLockCanvas() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void pause() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void release() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void releaseSurface() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void seekTo(long j) {
    }

    public void selectTrack(int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setNeedMute(boolean z) {
    }

    public void setOptionModelList(List<VideoOptionModel> list) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setSpeed(float f, boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setSpeedPlaying(float f, boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setVolume(float f, float f2) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void showDisplay(Message message) {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void start() {
    }

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void stop() {
    }
}
