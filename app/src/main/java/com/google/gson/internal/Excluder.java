package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT = null;
    private static final double IGNORE_VERSIONS = -1.0d;
    private List<ExclusionStrategy> deserializationStrategies;
    private int modifiers;
    private boolean requireExpose;
    private List<ExclusionStrategy> serializationStrategies;
    private boolean serializeInnerClasses;
    private double version;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.Excluder$1 */
    class C12301<T> extends TypeAdapter<T> {
        private TypeAdapter<T> delegate;
        final /* synthetic */ Excluder this$0;
        final /* synthetic */ Gson val$gson;
        final /* synthetic */ boolean val$skipDeserialize;
        final /* synthetic */ boolean val$skipSerialize;
        final /* synthetic */ TypeToken val$type;

        C12301(Excluder excluder, boolean z, boolean z2, Gson gson, TypeToken typeToken) {
        }

        private TypeAdapter<T> delegate() {
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t) throws IOException {
        }
    }

    private boolean excludeClassChecks(Class<?> cls) {
    }

    private boolean excludeClassInStrategy(Class<?> cls, boolean z) {
    }

    private boolean isAnonymousOrLocal(Class<?> cls) {
    }

    private boolean isInnerClass(Class<?> cls) {
    }

    private boolean isStatic(Class<?> cls) {
    }

    private boolean isValidSince(Since since) {
    }

    private boolean isValidUntil(Until until) {
    }

    private boolean isValidVersion(Since since, Until until) {
    }

    /* renamed from: clone, reason: collision with other method in class */
    protected /* bridge */ /* synthetic */ Object m873clone() throws CloneNotSupportedException {
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
    }

    public Excluder disableInnerClassSerialization() {
    }

    public boolean excludeClass(Class<?> cls, boolean z) {
    }

    public boolean excludeField(Field field, boolean z) {
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
    }

    public Excluder withModifiers(int... iArr) {
    }

    public Excluder withVersion(double d) {
    }

    protected Excluder clone() {
    }
}
