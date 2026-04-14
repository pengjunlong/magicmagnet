package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.GlProgram;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.nio.FloatBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class ProjectionRenderer {
    private static final String FRAGMENT_SHADER = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";
    private static final String TAG = "ProjectionRenderer";
    private static final float[] TEX_MATRIX_BOTTOM = null;
    private static final float[] TEX_MATRIX_LEFT = null;
    private static final float[] TEX_MATRIX_RIGHT = null;
    private static final float[] TEX_MATRIX_TOP = null;
    private static final float[] TEX_MATRIX_WHOLE = null;
    private static final String VERTEX_SHADER = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";
    private MeshData leftMeshData;
    private int mvpMatrixHandle;
    private int positionHandle;
    private GlProgram program;
    private MeshData rightMeshData;
    private int stereoMode;
    private int texCoordsHandle;
    private int textureHandle;
    private int uTexMatrixHandle;

    private static class MeshData {
        private final int drawMode;
        private final FloatBuffer textureBuffer;
        private final FloatBuffer vertexBuffer;
        private final int vertexCount;

        public MeshData(Projection.SubMesh subMesh) {
        }

        static /* synthetic */ FloatBuffer access$000(MeshData meshData) {
        }

        static /* synthetic */ FloatBuffer access$100(MeshData meshData) {
        }

        static /* synthetic */ int access$200(MeshData meshData) {
        }

        static /* synthetic */ int access$300(MeshData meshData) {
        }
    }

    ProjectionRenderer() {
    }

    public static boolean isSupported(Projection projection) {
    }

    public void draw(int i, float[] fArr, boolean z) {
    }

    public void init() {
    }

    public void setProjection(Projection projection) {
    }

    public void shutdown() {
    }
}
