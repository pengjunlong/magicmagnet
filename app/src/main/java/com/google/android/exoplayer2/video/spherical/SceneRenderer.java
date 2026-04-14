package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    private static final String TAG = "SceneRenderer";
    private volatile int defaultStereoMode;
    private final AtomicBoolean frameAvailable;
    private final FrameRotationQueue frameRotationQueue;
    private byte[] lastProjectionData;
    private int lastStereoMode;
    private final TimedValueQueue<Projection> projectionQueue;
    private final ProjectionRenderer projectionRenderer;
    private final AtomicBoolean resetRotationAtNextFrame;
    private final float[] rotationMatrix;
    private final TimedValueQueue<Long> sampleTimestampQueue;
    private SurfaceTexture surfaceTexture;
    private final float[] tempMatrix;
    private int textureId;

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(SceneRenderer sceneRenderer, SurfaceTexture surfaceTexture) {
    }

    private /* synthetic */ void lambda$init$0(SurfaceTexture surfaceTexture) {
    }

    private void setProjection(byte[] bArr, int i, long j) {
    }

    public void drawFrame(float[] fArr, boolean z) {
    }

    public SurfaceTexture init() {
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotion(long j, float[] fArr) {
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j2, Format format, MediaFormat mediaFormat) {
    }

    public void setDefaultStereoMode(int i) {
    }

    public void shutdown() {
    }
}
