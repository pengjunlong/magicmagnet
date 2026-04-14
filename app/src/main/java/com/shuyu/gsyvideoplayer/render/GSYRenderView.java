package com.shuyu.gsyvideoplayer.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotListener;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotSaveListener;
import com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import com.shuyu.gsyvideoplayer.render.view.IGSYRenderView;
import com.shuyu.gsyvideoplayer.render.view.listener.IGSYSurfaceListener;
import com.shuyu.gsyvideoplayer.utils.MeasureHelper;
import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GSYRenderView {
    protected IGSYRenderView mShowView;

    public static void addToParent(ViewGroup viewGroup, View view) {
    }

    public static int getTextureParams() {
    }

    public void addView(Context context, ViewGroup viewGroup, int i, IGSYSurfaceListener iGSYSurfaceListener, MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener, GSYVideoGLView.ShaderInterface shaderInterface, float[] fArr, GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender, int i2) {
    }

    public int getHeight() {
    }

    public ViewGroup.LayoutParams getLayoutParams() {
    }

    public float getRotation() {
    }

    public View getShowView() {
    }

    public int getWidth() {
    }

    public Bitmap initCover() {
    }

    public Bitmap initCoverHigh() {
    }

    public void invalidate() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void releaseAll() {
    }

    public void requestLayout() {
    }

    public void saveFrame(File file, GSYVideoShotSaveListener gSYVideoShotSaveListener) {
    }

    public void setEffectFilter(GSYVideoGLView.ShaderInterface shaderInterface) {
    }

    public void setGLRenderMode(int i) {
    }

    public void setGLRenderer(GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender) {
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
    }

    public void setMatrixGL(float[] fArr) {
    }

    public void setRotation(float f) {
    }

    public void setTransform(Matrix matrix) {
    }

    public void taskShotPic(GSYVideoShotListener gSYVideoShotListener) {
    }

    public void saveFrame(File file, boolean z, GSYVideoShotSaveListener gSYVideoShotSaveListener) {
    }

    public void taskShotPic(GSYVideoShotListener gSYVideoShotListener, boolean z) {
    }
}
