package com.shuyu.gsyvideoplayer.render.effect;

import android.opengl.GLSurfaceView;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class VignetteEffect implements GSYVideoGLView.ShaderInterface {
    private int mHeight;
    private float mScale;
    private final float mShade;
    private int mWidth;

    public VignetteEffect(float f) {
    }

    private void initValues(GLSurfaceView gLSurfaceView) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView.ShaderInterface
    public String getShader(GLSurfaceView gLSurfaceView) {
    }
}
