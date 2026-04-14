package com.shuyu.gsyvideoplayer.render.effect;

import android.opengl.GLSurfaceView;
import com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GaussianBlurEffect implements GSYVideoGLView.ShaderInterface {
    public static final int TYPEX = 1;
    public static final int TYPEXY = 3;
    public static final int TYPEY = 2;
    private String blurTypeString;
    private float radius;

    public GaussianBlurEffect(float f) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView.ShaderInterface
    public String getShader(GLSurfaceView gLSurfaceView) {
    }

    public GaussianBlurEffect(float f, int i) {
    }
}
