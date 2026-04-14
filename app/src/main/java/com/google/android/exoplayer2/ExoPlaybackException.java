package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.MediaPeriodId;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final Bundleable.Creator<ExoPlaybackException> CREATOR = null;
    private static final String FIELD_IS_RECOVERABLE = null;
    private static final String FIELD_RENDERER_FORMAT = null;
    private static final String FIELD_RENDERER_FORMAT_SUPPORT = null;
    private static final String FIELD_RENDERER_INDEX = null;
    private static final String FIELD_RENDERER_NAME = null;
    private static final String FIELD_TYPE = null;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private ExoPlaybackException(int i, Throwable th, int i2) {
    }

    public static ExoPlaybackException createForRemote(String str) {
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, Format format, int i2, boolean z, int i3) {
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
    }

    public static /* synthetic */ ExoPlaybackException dbpqdHhmDSIHIJiwc1ll1l1(Bundle bundle) {
    }

    private static String deriveMessage(int i, String str, String str2, int i2, Format format, int i3) {
    }

    ExoPlaybackException copyWithMediaPeriodId(MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(PlaybackException playbackException) {
    }

    public Exception getRendererException() {
    }

    public IOException getSourceException() {
    }

    public RuntimeException getUnexpectedException() {
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    private ExoPlaybackException(int i, Throwable th, String str, int i2, String str2, int i3, Format format, int i4, boolean z) {
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
    }

    private ExoPlaybackException(Bundle bundle) {
    }

    private ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, Format format, int i4, MediaPeriodId mediaPeriodId, long j, boolean z) {
    }
}
