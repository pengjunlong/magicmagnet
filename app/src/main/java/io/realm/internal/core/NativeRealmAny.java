package io.realm.internal.core;

import io.realm.internal.Keep;
import io.realm.internal.OsSharedRealm;
import io.realm.qbdqqpbqpCWRpIKEKtzoceYOll1ll1l;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import p000.jg0;
import p000.s41;
import p000.v41;
import p000.x41;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class NativeRealmAny implements jg0 {
    private static final long nativeFinalizerPtr = 0;
    private final long nativePtr;

    public NativeRealmAny(long j) {
    }

    private static long createRealmAnyLink(v41 v41Var) {
    }

    private static native byte[] nativeAsBinary(long j);

    private static native boolean nativeAsBoolean(long j);

    private static native long nativeAsDate(long j);

    private static native long[] nativeAsDecimal128(long j);

    private static native double nativeAsDouble(long j);

    private static native float nativeAsFloat(long j);

    private static native long nativeAsLong(long j);

    private static native String nativeAsObjectId(long j);

    private static native String nativeAsString(long j);

    private static native String nativeAsUUID(long j);

    private static native long nativeCreateBinary(byte[] bArr);

    private static native long nativeCreateBoolean(boolean z);

    private static native long nativeCreateDate(long j);

    private static native long nativeCreateDecimal128(long j, long j2);

    private static native long nativeCreateDouble(double d);

    private static native long nativeCreateFloat(float f);

    private static native long nativeCreateLink(long j, long j2);

    private static native long nativeCreateLong(long j);

    private static native long nativeCreateNull();

    private static native long nativeCreateObjectId(String str);

    private static native long nativeCreateString(String str);

    private static native long nativeCreateUUID(String str);

    private static native boolean nativeEquals(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmModelRowKey(long j);

    private static native String nativeGetRealmModelTableName(long j, long j2);

    private static native int nativeGetType(long j);

    public byte[] asBinary() {
    }

    public boolean asBoolean() {
    }

    public Date asDate() {
    }

    public Decimal128 asDecimal128() {
    }

    public double asDouble() {
    }

    public float asFloat() {
    }

    public long asLong() {
    }

    public ObjectId asObjectId() {
    }

    public String asString() {
    }

    public UUID asUUID() {
    }

    public boolean coercedEquals(NativeRealmAny nativeRealmAny) {
    }

    public <T extends s41> Class<T> getModelClass(OsSharedRealm osSharedRealm, x41 x41Var) {
    }

    @Override // p000.jg0
    public long getNativeFinalizerPtr() {
    }

    @Override // p000.jg0
    public long getNativePtr() {
    }

    public long getRealmModelRowKey() {
    }

    public String getRealmModelTableName(OsSharedRealm osSharedRealm) {
    }

    public qbdqqpbqpCWRpIKEKtzoceYOll1ll1l.dbpqdHhmDSIHIJiwc1ll1l1 getType() {
    }

    public NativeRealmAny(Boolean bool) {
    }

    public NativeRealmAny(Number number) {
    }

    public NativeRealmAny(Float f) {
    }

    public NativeRealmAny(Double d) {
    }

    public NativeRealmAny(String str) {
    }

    public NativeRealmAny(byte[] bArr) {
    }

    public NativeRealmAny(Date date) {
    }

    public NativeRealmAny(ObjectId objectId) {
    }

    public NativeRealmAny(Decimal128 decimal128) {
    }

    public NativeRealmAny(UUID uuid) {
    }

    public NativeRealmAny(v41 v41Var) {
    }

    public NativeRealmAny() {
    }
}
