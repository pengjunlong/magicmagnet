package com.tencent.tinker.android.dex.io;

import com.tencent.tinker.android.dex.Annotation;
import com.tencent.tinker.android.dex.AnnotationSet;
import com.tencent.tinker.android.dex.AnnotationSetRefList;
import com.tencent.tinker.android.dex.AnnotationsDirectory;
import com.tencent.tinker.android.dex.ClassData;
import com.tencent.tinker.android.dex.ClassDef;
import com.tencent.tinker.android.dex.Code;
import com.tencent.tinker.android.dex.DebugInfoItem;
import com.tencent.tinker.android.dex.EncodedValue;
import com.tencent.tinker.android.dex.FieldId;
import com.tencent.tinker.android.dex.MethodId;
import com.tencent.tinker.android.dex.ProtoId;
import com.tencent.tinker.android.dex.StringData;
import com.tencent.tinker.android.dex.TypeList;
import com.tencent.tinker.android.dex.util.ByteInput;
import com.tencent.tinker.android.dex.util.ByteOutput;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class DexDataBuffer implements ByteInput, ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 512;
    private static final Code.CatchHandler[] EMPTY_CATCHHANDLER_ARRAY = null;
    private static final short[] EMPTY_SHORT_ARRAY = null;
    private static final Code.Try[] EMPTY_TRY_ARRAY = null;
    private ByteBuffer data;
    private int dataBound;
    private boolean isResizeAllowed;

    /* renamed from: com.tencent.tinker.android.dex.io.DexDataBuffer$1 */
    class C16341 implements ByteOutput {
        final /* synthetic */ DexDataBuffer this$0;
        final /* synthetic */ ByteArrayOutputStream val$baosRef;

        C16341(DexDataBuffer dexDataBuffer, ByteArrayOutputStream byteArrayOutputStream) {
        }

        @Override // com.tencent.tinker.android.dex.util.ByteOutput
        public void writeByte(int i) {
        }
    }

    public DexDataBuffer() {
    }

    private void ensureBufferSize(int i) {
    }

    private int findCatchHandlerIndex(Code.CatchHandler[] catchHandlerArr, int i) {
    }

    private byte[] getBytesFrom(int i) {
    }

    private Code.CatchHandler readCatchHandler(int i) {
    }

    private Code.CatchHandler[] readCatchHandlers() {
    }

    private ClassData.Field[] readFields(int i) {
    }

    private ClassData.Method[] readMethods(int i) {
    }

    private Code.Try[] readTries(int i, Code.CatchHandler[] catchHandlerArr) {
    }

    private void writeCatchHandler(Code.CatchHandler catchHandler) {
    }

    private int[] writeCatchHandlers(Code.CatchHandler[] catchHandlerArr) {
    }

    private void writeFields(ClassData.Field[] fieldArr) {
    }

    private void writeMethods(ClassData.Method[] methodArr) {
    }

    private void writeTries(Code.Try[] tryArr, int[] iArr) {
    }

    public void alignToFourBytes() {
    }

    public void alignToFourBytesWithZeroFill() {
    }

    public byte[] array() {
    }

    public int available() {
    }

    public int position() {
    }

    public Annotation readAnnotation() {
    }

    public AnnotationSet readAnnotationSet() {
    }

    public AnnotationSetRefList readAnnotationSetRefList() {
    }

    public AnnotationsDirectory readAnnotationsDirectory() {
    }

    @Override // com.tencent.tinker.android.dex.util.ByteInput
    public byte readByte() {
    }

    public byte[] readByteArray(int i) {
    }

    public ClassData readClassData() {
    }

    public ClassDef readClassDef() {
    }

    public Code readCode() {
    }

    public DebugInfoItem readDebugInfoItem() {
    }

    public EncodedValue readEncodedArray() {
    }

    public FieldId readFieldId() {
    }

    public int readInt() {
    }

    public MethodId readMethodId() {
    }

    public ProtoId readProtoId() {
    }

    public short readShort() {
    }

    public short[] readShortArray(int i) {
    }

    public int readSleb128() {
    }

    public StringData readStringData() {
    }

    public TypeList readTypeList() {
    }

    public int readUleb128() {
    }

    public int readUleb128p1() {
    }

    public int readUnsignedByte() {
    }

    public int readUnsignedShort() {
    }

    public void skip(int i) {
    }

    public void skipWithAutoExpand(int i) {
    }

    public void write(byte[] bArr) {
    }

    public int writeAnnotation(Annotation annotation) {
    }

    public int writeAnnotationSet(AnnotationSet annotationSet) {
    }

    public int writeAnnotationSetRefList(AnnotationSetRefList annotationSetRefList) {
    }

    public int writeAnnotationsDirectory(AnnotationsDirectory annotationsDirectory) {
    }

    @Override // com.tencent.tinker.android.dex.util.ByteOutput
    public void writeByte(int i) {
    }

    public int writeClassData(ClassData classData) {
    }

    public int writeClassDef(ClassDef classDef) {
    }

    public int writeCode(Code code) {
    }

    public int writeDebugInfoItem(DebugInfoItem debugInfoItem) {
    }

    public int writeEncodedArray(EncodedValue encodedValue) {
    }

    public int writeFieldId(FieldId fieldId) {
    }

    public void writeInt(int i) {
    }

    public int writeMethodId(MethodId methodId) {
    }

    public int writeProtoId(ProtoId protoId) {
    }

    public void writeShort(short s) {
    }

    public void writeSleb128(int i) {
    }

    public int writeStringData(StringData stringData) {
    }

    public int writeTypeList(TypeList typeList) {
    }

    public void writeUleb128(int i) {
    }

    public void writeUleb128p1(int i) {
    }

    public void writeUnsignedShort(int i) {
    }

    public void position(int i) {
    }

    public void write(short[] sArr) {
    }

    public DexDataBuffer(ByteBuffer byteBuffer) {
    }

    public DexDataBuffer(ByteBuffer byteBuffer, boolean z) {
    }
}
