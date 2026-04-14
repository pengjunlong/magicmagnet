package tv.danmaku.ijk.media.exo2;

import android.content.Context;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import com.shuyu.gsyvideoplayer.model.VideoOptionModel;
import com.shuyu.gsyvideoplayer.player.BasePlayerManager;
import java.util.List;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Exo2PlayerManager extends BasePlayerManager {
    private Context context;
    private PlaceholderSurface dummySurface;
    private long lastTimeStamp;
    private long lastTotalRxBytes;
    private IjkExo2MediaPlayer mediaPlayer;
    private Surface surface;

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

    @Override // com.shuyu.gsyvideoplayer.player.IPlayerManager
    public void setNeedMute(boolean z) {
    }

    public void setSeekParameter(SeekParameters seekParameters) {
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

    private long getNetSpeed(Context context) {
    }
}
