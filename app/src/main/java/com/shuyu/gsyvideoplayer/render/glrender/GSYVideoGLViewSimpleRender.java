package com.shuyu.gsyvideoplayer.render.glrender;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotListener;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@SuppressLint({"ViewConstructor"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GSYVideoGLViewSimpleRender extends GSYVideoGLViewBaseRender {
    private static final int FLOAT_SIZE_BYTES = 4;
    protected static final int GL_TEXTURE_EXTERNAL_OES = 36197;
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
    private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
    private GSYVideoGLView.ShaderInterface mEffect;
    private GSYVideoShotListener mGSYVideoShotListener;
    private int mProgram;
    private SurfaceTexture mSurface;
    private boolean mTakeShotPic;
    private int[] mTextureID;
    private FloatBuffer mTriangleVertices;
    private final float[] mTriangleVerticesData;
    private boolean mUpdateSurface;
    private final String mVertexShader;
    private int maPositionHandle;
    private int maTextureHandle;
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;

    protected void bindDrawFrameTexture() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender
    public GSYVideoGLView.ShaderInterface getEffect() {
    }

    protected String getFragmentShader() {
    }

    public int getMaPositionHandle() {
    }

    public int getMaTextureHandle() {
    }

    public int getMuMVPMatrixHandle() {
    }

    public int getMuSTMatrixHandle() {
    }

    public int getProgram() {
    }

    public float[] getSTMatrix() {
    }

    public int[] getTextureID() {
    }

    protected String getVertexShader() {
    }

    protected void initDrawFrame() {
    }

    protected void initPointerAndDraw() {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender
    public void releaseAll() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender
    public void setEffect(GSYVideoGLView.ShaderInterface shaderInterface) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender
    public void setGSYVideoShotListener(GSYVideoShotListener gSYVideoShotListener, boolean z) {
    }

    protected void takeBitmap(GL10 gl10) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender
    public void takeShotPic() {
    }
}
