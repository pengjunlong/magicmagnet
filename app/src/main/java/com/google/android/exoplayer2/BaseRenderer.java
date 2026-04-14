package com.google.android.exoplayer2;

import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.MediaClock;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private final FormatHolder formatHolder;
    private int index;
    private long lastResetPositionUs;
    private PlayerId playerId;
    private long readingPositionUs;
    private int state;
    private SampleStream stream;
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;

    public BaseRenderer(int i) {
    }

    protected final ExoPlaybackException createRendererException(Throwable th, Format format, int i) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void disable() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final RendererCapabilities getCapabilities() {
    }

    protected final RendererConfiguration getConfiguration() {
    }

    protected final FormatHolder getFormatHolder() {
    }

    protected final int getIndex() {
    }

    protected final long getLastResetPositionUs() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public MediaClock getMediaClock() {
    }

    protected final PlayerId getPlayerId() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final long getReadingPositionUs() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final int getState() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final SampleStream getStream() {
    }

    protected final Format[] getStreamFormats() {
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final int getTrackType() {
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean hasReadStreamToEnd() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void init(int i, PlayerId playerId) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final boolean isCurrentStreamFinal() {
    }

    protected final boolean isSourceReady() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void maybeThrowStreamError() throws IOException {
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
    }

    protected void onPositionReset(long j, boolean z) throws ExoPlaybackException {
    }

    protected void onReset() {
    }

    protected void onStarted() throws ExoPlaybackException {
    }

    protected void onStopped() {
    }

    protected void onStreamChanged(Format[] formatArr, long j, long j2) throws ExoPlaybackException {
    }

    protected final int readSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j, long j2) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void reset() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void resetPosition(long j) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void setCurrentStreamFinal() {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public /* synthetic */ void setPlaybackSpeed(float f, float f2) {
    }

    protected int skipSource(long j) {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void start() throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public final void stop() {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
    }

    private void resetPosition(long j, boolean z) throws ExoPlaybackException {
    }

    protected final ExoPlaybackException createRendererException(Throwable th, Format format, boolean z, int i) {
    }
}
