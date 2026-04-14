package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class LineReader {
    private final char[] buf;
    private final CharBuffer cbuf;
    private final LineBuffer lineBuf;
    private final Queue<String> lines;
    private final Readable readable;
    private final Reader reader;

    /* renamed from: com.google.common.io.LineReader$1 */
    class C09461 extends LineBuffer {
        final /* synthetic */ LineReader this$0;

        C09461(LineReader lineReader) {
        }

        @Override // com.google.common.io.LineBuffer
        protected void handleLine(String str, String str2) {
        }
    }

    public LineReader(Readable readable) {
    }

    static /* synthetic */ Queue access$000(LineReader lineReader) {
    }

    @CanIgnoreReturnValue
    public String readLine() throws IOException {
    }
}
