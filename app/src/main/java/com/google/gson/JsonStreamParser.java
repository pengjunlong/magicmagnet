package com.google.gson;

import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.util.Iterator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(String str) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ JsonElement next() {
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    public JsonStreamParser(Reader reader) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() throws JsonParseException {
    }
}
