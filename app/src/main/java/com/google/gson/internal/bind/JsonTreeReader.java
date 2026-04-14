package com.google.gson.internal.bind;

import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class JsonTreeReader extends JsonReader {
    private static final Object SENTINEL_CLOSED = null;
    private static final Reader UNREADABLE_READER = null;
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;

    /* renamed from: com.google.gson.internal.bind.JsonTreeReader$1 */
    static class C12431 extends Reader {
        C12431() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
    }

    private void expect(JsonToken jsonToken) throws IOException {
    }

    private String locationString() {
    }

    private Object peekStack() {
    }

    private Object popStack() {
    }

    private void push(Object obj) {
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
    }

    public void promoteNameToValue() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
    }
}
