package com.shuyu.gsyvideoplayer.video.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.shuyu.gsyvideoplayer.render.GSYRenderView;
import com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.render.view.listener.IGSYSurfaceListener;
import com.shuyu.gsyvideoplayer.utils.MeasureHelper;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class GSYTextureRenderView extends FrameLayout implements IGSYSurfaceListener, MeasureHelper.MeasureFormVideoParamsListener {
    protected GSYVideoGLView.ShaderInterface mEffectFilter;
    protected Bitmap mFullPauseBitmap;
    protected float[] mMatrixGL;
    protected int mMode;
    protected GSYVideoGLViewBaseRender mRenderer;
    protected int mRotate;
    protected Surface mSurface;
    protected GSYRenderView mTextureView;
    protected ViewGroup mTextureViewContainer;

    public GSYTextureRenderView(Context context) {
    }

    protected void addTextureView() {
    }

    protected void changeTextureViewShowType() {
    }

    public GSYVideoGLView.ShaderInterface getEffectFilter() {
    }

    public GSYRenderView getRenderProxy() {
    }

    protected int getTextureParams() {
    }

    protected void initCover() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.listener.IGSYSurfaceListener
    public void onSurfaceAvailable(Surface surface) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.listener.IGSYSurfaceListener
    public boolean onSurfaceDestroyed(Surface surface) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.listener.IGSYSurfaceListener
    public void onSurfaceSizeChanged(Surface surface, int i, int i2) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.listener.IGSYSurfaceListener
    public void onSurfaceUpdated(Surface surface) {
    }

    protected void pauseLogic(Surface surface, boolean z) {
    }

    protected abstract void releasePauseCover();

    protected abstract void releaseSurface(Surface surface);

    public void setCustomGLRenderer(GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender) {
    }

    protected abstract void setDisplay(Surface surface);

    public void setEffectFilter(GSYVideoGLView.ShaderInterface shaderInterface) {
    }

    public void setGLRenderMode(int i) {
    }

    public void setMatrixGL(float[] fArr) {
    }

    protected abstract void setSmallVideoTextureView();

    protected void setSmallVideoTextureView(View.OnTouchListener onTouchListener) {
    }

    protected abstract void showPauseCover();

    public GSYTextureRenderView(Context context, AttributeSet attributeSet) {
    }

    public GSYTextureRenderView(Context context, AttributeSet attributeSet, int i) {
    }
}
