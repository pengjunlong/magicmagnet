package com.shuyu.gsyvideoplayer.render.effect;

import android.opengl.GLSurfaceView;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;
import java.util.Random;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GrainEffect implements GSYVideoGLView.ShaderInterface {
    private int mHeight;
    private Random mRandom;
    private int mWidth;
    private float strength;

    public GrainEffect(float f) {
    }

    private void initValues(GLSurfaceView gLSurfaceView) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView.ShaderInterface
    public String getShader(GLSurfaceView gLSurfaceView) {
    }
}
