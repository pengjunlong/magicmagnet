package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Timeline;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BasePlayer implements Player {
    protected final Timeline.Window window;

    protected BasePlayer() {
    }

    private int getRepeatModeForNavigation() {
    }

    private void repeatCurrentMediaItem(int i) {
    }

    private void seekToCurrentItem(long j, int i) {
    }

    private void seekToDefaultPositionInternal(int i, int i2) {
    }

    private void seekToNextMediaItemInternal(int i) {
    }

    private void seekToOffset(long j, int i) {
    }

    private void seekToPreviousMediaItemInternal(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItem(int i, MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItems(List<MediaItem> list) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean canAdvertiseSession() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void clearMediaItems() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getBufferedPercentage() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentDuration() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentLiveOffset() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final Object getCurrentManifest() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaItem getCurrentMediaItem() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final int getCurrentWindowIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaItem getMediaItemAt(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getMediaItemCount() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getNextMediaItemIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final int getNextWindowIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPreviousMediaItemIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final int getPreviousWindowIndex() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean hasNext() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasNextMediaItem() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean hasNextWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean hasPrevious() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasPreviousMediaItem() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean hasPreviousWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCommandAvailable(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentMediaItemDynamic() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentMediaItemLive() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentMediaItemSeekable() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean isCurrentWindowLive() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlaying() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void moveMediaItem(int i, int i2) {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final void next() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void pause() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void play() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final void previous() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeMediaItem(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekBack() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekForward() {
    }

    public abstract void seekTo(int i, long j, int i2, boolean z);

    @Override // com.google.android.exoplayer2.Player
    public final void seekTo(long j) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToDefaultPosition() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToNext() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToNextMediaItem() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final void seekToNextWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToPrevious() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToPreviousMediaItem() {
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public final void seekToPreviousWindow() {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(List<MediaItem> list) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaybackSpeed(float f) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItem(MediaItem mediaItem) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekTo(int i, long j) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(MediaItem mediaItem, long j) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekToDefaultPosition(int i) {
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItem(MediaItem mediaItem, boolean z) {
    }
}
