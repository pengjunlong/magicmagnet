package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Streams {
    private Streams() {
    }

    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
    }

    public static Writer writerForAppendable(Appendable appendable) {
    }

    private static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite;

        static class CurrentWrite implements CharSequence {
            char[] chars;

            CurrentWrite() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
            }

            @Override // java.lang.CharSequence
            public int length() {
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
            }
        }

        AppendableWriter(Appendable appendable) {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
        }
    }
}
