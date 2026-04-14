package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.spherical.OrientationListener;
import com.google.android.exoplayer2.video.spherical.TouchTracker;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    private static final int FIELD_OF_VIEW_DEGREES = 90;
    private static final float PX_PER_DEGREES = 25.0f;
    static final float UPRIGHT_ROLL = 3.1415927f;
    private static final float Z_FAR = 100.0f;
    private static final float Z_NEAR = 0.1f;
    private boolean isOrientationListenerRegistered;
    private boolean isStarted;
    private final Handler mainHandler;
    private final OrientationListener orientationListener;
    private final Sensor orientationSensor;
    private final SceneRenderer scene;
    private final SensorManager sensorManager;
    private Surface surface;
    private SurfaceTexture surfaceTexture;
    private final TouchTracker touchTracker;
    private boolean useSensorRotation;
    private final CopyOnWriteArrayList<VideoSurfaceListener> videoSurfaceListeners;

    final class Renderer implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {
        private final float[] deviceOrientationMatrix;
        private float deviceRoll;
        private final float[] projectionMatrix;
        private final SceneRenderer scene;
        private final float[] tempMatrix;
        final /* synthetic */ SphericalGLSurfaceView this$0;
        private float touchPitch;
        private final float[] touchPitchMatrix;
        private final float[] touchYawMatrix;
        private final float[] viewMatrix;
        private final float[] viewProjectionMatrix;

        public Renderer(SphericalGLSurfaceView sphericalGLSurfaceView, SceneRenderer sceneRenderer) {
        }

        private float calculateFieldOfViewInYDirection(float f) {
        }

        private void updatePitchMatrix() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.OrientationListener.Listener
        public synchronized void onOrientationChange(float[] fArr, float f) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        public synchronized void onScrollChange(PointF pointF) {
        }

        @Override // com.google.android.exoplayer2.video.spherical.TouchTracker.Listener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        }
    }

    public interface VideoSurfaceListener {
        void onVideoSurfaceCreated(Surface surface);

        void onVideoSurfaceDestroyed(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
    }

    static /* synthetic */ void access$000(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
    }

    public static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
    }

    public static /* synthetic */ void dpbdbdpbLwkLpObyKsq1lll1(SphericalGLSurfaceView sphericalGLSurfaceView) {
    }

    private /* synthetic */ void lambda$onDetachedFromWindow$0() {
    }

    private /* synthetic */ void lambda$onSurfaceTextureAvailable$1(SurfaceTexture surfaceTexture) {
    }

    private void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture) {
    }

    private static void releaseSurface(SurfaceTexture surfaceTexture, Surface surface) {
    }

    private void updateOrientationListenerRegistration() {
    }

    public void addVideoSurfaceListener(VideoSurfaceListener videoSurfaceListener) {
    }

    public CameraMotionListener getCameraMotionListener() {
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
    }

    public Surface getVideoSurface() {
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
    }

    public void removeVideoSurfaceListener(VideoSurfaceListener videoSurfaceListener) {
    }

    public void setDefaultStereoMode(int i) {
    }

    public void setUseSensorRotation(boolean z) {
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
    }
}
