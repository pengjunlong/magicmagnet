package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    public static final TypeAdapterFactory FACTORY = null;
    private final Gson gson;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1 */
    static class C12451 implements TypeAdapterFactory {
        C12451() {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        }
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2 */
    static /* synthetic */ class C12462 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;
    }

    ObjectTypeAdapter(Gson gson) {
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) throws IOException {
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
    }
}
