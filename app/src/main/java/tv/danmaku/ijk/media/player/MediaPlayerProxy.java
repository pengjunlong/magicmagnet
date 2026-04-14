package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class MediaPlayerProxy implements IMediaPlayer {
    protected final IMediaPlayer mBackEndMediaPlayer;

    /* renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$1 */
    class C18831 implements IMediaPlayer.OnPreparedListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnPreparedListener val$finalListener;

        C18831(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnPreparedListener onPreparedListener) {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$2 */
    class C18842 implements IMediaPlayer.OnCompletionListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnCompletionListener val$finalListener;

        C18842(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnCompletionListener onCompletionListener) {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$3 */
    class C18853 implements IMediaPlayer.OnBufferingUpdateListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnBufferingUpdateListener val$finalListener;

        C18853(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$4 */
    class C18864 implements IMediaPlayer.OnSeekCompleteListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnSeekCompleteListener val$finalListener;

        C18864(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$5 */
    class C18875 implements IMediaPlayer.OnVideoSizeChangedListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnVideoSizeChangedListener val$finalListener;

        C18875(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$6 */
    class C18886 implements IMediaPlayer.OnErrorListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnErrorListener val$finalListener;

        C18886(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnErrorListener onErrorListener) {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$7 */
    class C18897 implements IMediaPlayer.OnInfoListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnInfoListener val$finalListener;

        C18897(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnInfoListener onInfoListener) {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        }
    }

    /* renamed from: tv.danmaku.ijk.media.player.MediaPlayerProxy$8 */
    class C18908 implements IMediaPlayer.OnTimedTextListener {
        final /* synthetic */ MediaPlayerProxy this$0;
        final /* synthetic */ IMediaPlayer.OnTimedTextListener val$finalListener;

        C18908(MediaPlayerProxy mediaPlayerProxy, IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
        }
    }

    public MediaPlayerProxy(IMediaPlayer iMediaPlayer) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getAudioSessionId() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getCurrentPosition() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public String getDataSource() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public long getDuration() {
    }

    public IMediaPlayer getInternalMediaPlayer() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public MediaInfo getMediaInfo() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public ITrackInfo[] getTrackInfo() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoHeight() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarDen() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoSarNum() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public int getVideoWidth() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isLooping() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlayable() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public boolean isPlaying() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void pause() throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void release() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void reset() {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void seekTo(long j) throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setAudioStreamType(int i) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setKeepInBackground(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLogEnabled(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setLooping(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setSurface(Surface surface) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setVolume(float f, float f2) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setWakeMode(Context context, int i) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void start() throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void stop() throws IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    @TargetApi(14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IOException, IllegalArgumentException, IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer
    public void setDataSource(IMediaDataSource iMediaDataSource) {
    }
}
