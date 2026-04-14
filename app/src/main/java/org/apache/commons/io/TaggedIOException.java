package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class TaggedIOException extends IOExceptionWithCause {
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;

    public TaggedIOException(IOException iOException, Serializable serializable) {
    }

    public static boolean isTaggedWith(Throwable th, Object obj) {
    }

    public static void throwCauseIfTaggedWith(Throwable th, Object obj) throws IOException {
    }

    @Override // java.lang.Throwable
    public /* bridge */ /* synthetic */ Throwable getCause() {
    }

    public Serializable getTag() {
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
    }
}
