package com.shuyu.gsyvideoplayer.render.glrender;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotListener;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.render.view.listener.GLSurfaceListener;
import com.shuyu.gsyvideoplayer.render.view.listener.GSYVideoGLRenderErrorListener;
import javax.microedition.khronos.opengles.GL10;

@SuppressLint({"ViewConstructor"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class GSYVideoGLViewBaseRender implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {
    protected boolean mChangeProgram;
    protected boolean mChangeProgramSupportError;
    protected int mCurrentVideoHeight;
    protected int mCurrentVideoWidth;
    protected int mCurrentViewHeight;
    protected int mCurrentViewWidth;
    protected GLSurfaceListener mGSYSurfaceListener;
    protected GSYVideoGLRenderErrorListener mGSYVideoGLRenderErrorListener;
    protected Handler mHandler;
    protected boolean mHighShot;
    protected float[] mMVPMatrix;
    protected float[] mSTMatrix;
    protected GLSurfaceView mSurfaceView;

    /* renamed from: com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender$1 */
    class RunnableC14551 implements Runnable {
        final /* synthetic */ GSYVideoGLViewBaseRender this$0;
        final /* synthetic */ Surface val$surface;

        RunnableC14551(GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender, Surface surface) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender$2 */
    class RunnableC14562 implements Runnable {
        final /* synthetic */ GSYVideoGLViewBaseRender this$0;
        final /* synthetic */ int val$error;
        final /* synthetic */ String val$op;

        RunnableC14562(GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender, String str, int i) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    protected void checkGlError(String str) {
    }

    protected Bitmap createBitmapFromGLSurface(int i, int i2, int i3, int i4, GL10 gl10) {
    }

    protected int createProgram(String str, String str2) {
    }

    public int getCurrentVideoHeight() {
    }

    public int getCurrentVideoWidth() {
    }

    public int getCurrentViewHeight() {
    }

    public int getCurrentViewWidth() {
    }

    public GSYVideoGLView.ShaderInterface getEffect() {
    }

    public float[] getMVPMatrix() {
    }

    public void initRenderSize() {
    }

    protected int loadShader(int i, String str) {
    }

    public abstract void releaseAll();

    public void sendSurfaceForPlayer(Surface surface) {
    }

    public void setCurrentVideoHeight(int i) {
    }

    public void setCurrentVideoWidth(int i) {
    }

    public void setCurrentViewHeight(int i) {
    }

    public void setCurrentViewWidth(int i) {
    }

    public void setEffect(GSYVideoGLView.ShaderInterface shaderInterface) {
    }

    public void setGSYSurfaceListener(GLSurfaceListener gLSurfaceListener) {
    }

    public void setGSYVideoGLRenderErrorListener(GSYVideoGLRenderErrorListener gSYVideoGLRenderErrorListener) {
    }

    public void setGSYVideoShotListener(GSYVideoShotListener gSYVideoShotListener, boolean z) {
    }

    public void setMVPMatrix(float[] fArr) {
    }

    public void setSurfaceView(GLSurfaceView gLSurfaceView) {
    }

    public void takeShotPic() {
    }
}
