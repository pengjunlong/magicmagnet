package com.shuyu.gsyvideoplayer.render.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotListener;
import com.shuyu.gsyvideoplayer.listener.GSYVideoShotSaveListener;
import com.shuyu.gsyvideoplayer.render.glrender.GSYVideoGLViewBaseRender;
import com.shuyu.gsyvideoplayer.render.view.listener.GLSurfaceListener;
import com.shuyu.gsyvideoplayer.render.view.listener.GSYVideoGLRenderErrorListener;
import com.shuyu.gsyvideoplayer.render.view.listener.IGSYSurfaceListener;
import com.shuyu.gsyvideoplayer.utils.MeasureHelper;
import java.io.File;

@SuppressLint({"ViewConstructor"})
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class GSYVideoGLView extends GLSurfaceView implements GLSurfaceListener, IGSYRenderView, MeasureHelper.MeasureFormVideoParamsListener {
    public static final int MODE_LAYOUT_SIZE = 0;
    public static final int MODE_RENDER_SIZE = 1;
    private static final String TAG = null;
    private Context mContext;
    private ShaderInterface mEffect;
    private IGSYSurfaceListener mIGSYSurfaceListener;
    private float[] mMVPMatrix;
    private int mMode;
    private GLSurfaceListener mOnGSYSurfaceListener;
    private GSYVideoGLViewBaseRender mRenderer;
    private MeasureHelper.MeasureFormVideoParamsListener mVideoParamsListener;
    private MeasureHelper measureHelper;

    /* renamed from: com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView$1 */
    class C14591 implements GSYVideoShotListener {
        final /* synthetic */ GSYVideoGLView this$0;
        final /* synthetic */ File val$file;
        final /* synthetic */ GSYVideoShotSaveListener val$gsyVideoShotSaveListener;

        C14591(GSYVideoGLView gSYVideoGLView, GSYVideoShotSaveListener gSYVideoShotSaveListener, File file) {
        }

        @Override // com.shuyu.gsyvideoplayer.listener.GSYVideoShotListener
        public void getBitmap(Bitmap bitmap) {
        }
    }

    /* renamed from: com.shuyu.gsyvideoplayer.render.view.GSYVideoGLView$2 */
    class C14602 implements GSYVideoGLRenderErrorListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ IGSYSurfaceListener val$gsySurfaceListener;
        final /* synthetic */ int val$renderMode;
        final /* synthetic */ int val$rotate;
        final /* synthetic */ ViewGroup val$textureViewContainer;
        final /* synthetic */ MeasureHelper.MeasureFormVideoParamsListener val$videoParamsListener;

        C14602(Context context, ViewGroup viewGroup, int i, IGSYSurfaceListener iGSYSurfaceListener, MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener, int i2) {
        }

        @Override // com.shuyu.gsyvideoplayer.render.view.listener.GSYVideoGLRenderErrorListener
        public void onError(GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender, String str, int i, boolean z) {
        }
    }

    public interface ShaderInterface {
        String getShader(GLSurfaceView gLSurfaceView);
    }

    public GSYVideoGLView(Context context) {
    }

    public static GSYVideoGLView addGLView(Context context, ViewGroup viewGroup, int i, IGSYSurfaceListener iGSYSurfaceListener, MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener, ShaderInterface shaderInterface, float[] fArr, GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender, int i2) {
    }

    private void init(Context context) {
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoHeight() {
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getCurrentVideoWidth() {
    }

    public ShaderInterface getEffect() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public IGSYSurfaceListener getIGSYSurfaceListener() {
    }

    public float[] getMVPMatrix() {
    }

    public int getMode() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public View getRenderView() {
    }

    public GSYVideoGLViewBaseRender getRenderer() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public int getSizeH() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public int getSizeW() {
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarDen() {
    }

    @Override // com.shuyu.gsyvideoplayer.utils.MeasureHelper.MeasureFormVideoParamsListener
    public int getVideoSarNum() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public Bitmap initCover() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public Bitmap initCoverHigh() {
    }

    public void initRender() {
    }

    protected void initRenderMeasure() {
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i, int i2) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void onRenderPause() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void onRenderResume() {
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.listener.GLSurfaceListener
    public void onSurfaceAvailable(Surface surface) {
    }

    public void releaseAll() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void releaseRenderAll() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void saveFrame(File file, boolean z, GSYVideoShotSaveListener gSYVideoShotSaveListener) {
    }

    public void setCustomRenderer(GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender) {
    }

    public void setEffect(ShaderInterface shaderInterface) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void setGLEffectFilter(ShaderInterface shaderInterface) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void setGLMVPMatrix(float[] fArr) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void setGLRenderer(GSYVideoGLViewBaseRender gSYVideoGLViewBaseRender) {
    }

    public void setGSYVideoGLRenderErrorListener(GSYVideoGLRenderErrorListener gSYVideoGLRenderErrorListener) {
    }

    public void setGSYVideoShotListener(GSYVideoShotListener gSYVideoShotListener, boolean z) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void setIGSYSurfaceListener(IGSYSurfaceListener iGSYSurfaceListener) {
    }

    public void setMVPMatrix(float[] fArr) {
    }

    public void setMode(int i) {
    }

    public void setOnGSYSurfaceListener(GLSurfaceListener gLSurfaceListener) {
    }

    @Override // android.opengl.GLSurfaceView, com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void setRenderMode(int i) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void setRenderTransform(Matrix matrix) {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void setVideoParamsListener(MeasureHelper.MeasureFormVideoParamsListener measureFormVideoParamsListener) {
    }

    public void takeShotPic() {
    }

    @Override // com.shuyu.gsyvideoplayer.render.view.IGSYRenderView
    public void taskShotPic(GSYVideoShotListener gSYVideoShotListener, boolean z) {
    }

    public GSYVideoGLView(Context context, AttributeSet attributeSet) {
    }
}
