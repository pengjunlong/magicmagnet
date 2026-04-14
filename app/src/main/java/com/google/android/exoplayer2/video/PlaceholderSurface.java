package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final PlaceholderSurfaceThread thread;
    private boolean threadReleased;

    private static class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private PlaceholderSurface surface;

        private void initInternal(int i) throws GlUtil.GlException {
        }

        private void releaseInternal() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }

        public PlaceholderSurface init(int i) {
        }

        public void release() {
        }
    }

    /* synthetic */ PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z, C02381 c02381) {
    }

    private static int getSecureMode(Context context) {
    }

    public static synchronized boolean isSecureSupported(Context context) {
    }

    public static PlaceholderSurface newInstanceV17(Context context, boolean z) {
    }

    @Override // android.view.Surface
    public void release() {
    }

    private PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
    }
}
