package com.google.android.exoplayer2.drm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    private static final class Api18 {
        private Api18() {
        }

        public static boolean isDeniedByServerException(Throwable th) {
        }

        public static boolean isNotProvisionedException(Throwable th) {
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        public static boolean isMediaDrmStateException(Throwable th) {
        }

        public static int mediaDrmStateExceptionToErrorCode(Throwable th) {
        }
    }

    private static final class Api23 {
        private Api23() {
        }

        public static boolean isMediaDrmResetException(Throwable th) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    private DrmUtil() {
    }

    public static int getErrorCodeForMediaDrmException(Exception exc, int i) {
    }
}
