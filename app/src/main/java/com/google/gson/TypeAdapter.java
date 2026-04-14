package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class TypeAdapter<T> {

    /* renamed from: com.google.gson.TypeAdapter$1 */
    class C12201 extends TypeAdapter<T> {
        final /* synthetic */ TypeAdapter this$0;

        C12201(TypeAdapter typeAdapter) {
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) throws IOException {
        }
    }

    public final T fromJson(Reader reader) throws IOException {
    }

    public final T fromJsonTree(JsonElement jsonElement) {
    }

    public final TypeAdapter<T> nullSafe() {
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
    }

    public final JsonElement toJsonTree(T t) {
    }

    public abstract void write(JsonWriter jsonWriter, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
    }

    public final String toJson(T t) {
    }
}
