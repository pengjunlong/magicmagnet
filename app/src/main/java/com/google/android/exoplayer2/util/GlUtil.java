package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import java.nio.FloatBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class GlUtil {
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = null;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = null;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = null;
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;

    private static final class Api17 {
        private Api17() {
        }

        public static EGLContext createEglContext(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlException {
        }

        public static EGLDisplay createEglDisplay() throws GlException {
        }

        public static EGLSurface createEglPbufferSurface(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws GlException {
        }

        public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) throws GlException {
        }

        public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws GlException {
        }

        public static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws GlException {
        }

        private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        }

        public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws GlException {
        }
    }

    public static final class GlException extends Exception {
        public GlException(String str) {
        }
    }

    private GlUtil() {
    }

    static /* synthetic */ void access$000(String str) throws GlException {
    }

    private static void assertValidTextureSize(int i, int i2) throws GlException {
    }

    public static void bindTexture(int i, int i2) throws GlException {
    }

    private static void checkEglException(String str) throws GlException {
    }

    public static void checkGlError() throws GlException {
    }

    public static void checkGlException(boolean z, String str) throws GlException {
    }

    public static void clearOutputFrame() throws GlException {
    }

    public static float[] create4x4IdentityMatrix() {
    }

    public static FloatBuffer createBuffer(float[] fArr) {
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) throws GlException {
    }

    public static EGLDisplay createEglDisplay() throws GlException {
    }

    public static int createExternalTexture() throws GlException {
    }

    public static int createFboForTexture(int i) throws GlException {
    }

    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay, int[] iArr) throws GlException {
    }

    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i, int i2, int[] iArr) throws GlException {
    }

    public static int createTexture(int i, int i2, boolean z) throws GlException {
    }

    public static float[] createVertexBuffer(List<float[]> list) {
    }

    public static void deleteTexture(int i) throws GlException {
    }

    public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) throws GlException {
    }

    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws GlException {
    }

    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) throws GlException {
    }

    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws GlException {
    }

    public static EGLSurface focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlException {
    }

    private static int generateTexture() throws GlException {
    }

    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) throws GlException {
    }

    public static float[] getNormalizedCoordinateBounds() {
    }

    public static float[] getTextureCoordinateBounds() {
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
    }

    public static boolean isSurfacelessContextExtensionSupported() {
    }

    public static boolean isYuvTargetExtensionSupported() {
    }

    public static void setToIdentity(float[] fArr) {
    }

    private static FloatBuffer createBuffer(int i) {
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
    }

    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr) throws GlException {
    }

    private static int createTexture(int i, int i2, int i3, int i4) throws GlException {
    }
}
