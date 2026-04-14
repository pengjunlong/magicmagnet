package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.ClassData;
import com.tencent.tinker.android.dex.TableOfContents;
import com.tencent.tinker.android.dex.io.DexDataBuffer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Dex {
    private static final int CHECKSUM_OFFSET = 8;
    static final short[] EMPTY_SHORT_ARRAY = null;
    private static final int SIGNATURE_OFFSET = 12;
    private final ClassDefTable classDefs;
    private ByteBuffer data;
    private final FieldIdTable fieldIds;
    private final MethodIdTable methodIds;
    private int nextSectionStart;
    private final ProtoIdTable protoIds;
    private byte[] signature;
    private final StringTable strings;
    private final TableOfContents tableOfContents;
    private final TypeIndexToDescriptorIndexTable typeIds;
    private final TypeIndexToDescriptorTable typeNames;

    private final class ClassDefIterable implements Iterable<ClassDef> {
        final /* synthetic */ Dex this$0;

        private ClassDefIterable(Dex dex) {
        }

        @Override // java.lang.Iterable
        public Iterator<ClassDef> iterator() {
        }

        /* synthetic */ ClassDefIterable(Dex dex, C16321 c16321) {
        }
    }

    private final class ClassDefIterator implements Iterator<ClassDef> {
        private int count;
        private final Section in;
        final /* synthetic */ Dex this$0;

        private ClassDefIterator(Dex dex) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ClassDef next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public ClassDef next() {
        }

        /* synthetic */ ClassDefIterator(Dex dex, C16321 c16321) {
        }
    }

    private final class ClassDefTable extends AbstractList<ClassDef> implements RandomAccess {
        final /* synthetic */ Dex this$0;

        private ClassDefTable(Dex dex) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ ClassDefTable(Dex dex, C16321 c16321) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ClassDef get(int i) {
        }
    }

    private final class FieldIdTable extends AbstractList<FieldId> implements RandomAccess {
        final /* synthetic */ Dex this$0;

        private FieldIdTable(Dex dex) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ FieldIdTable(Dex dex, C16321 c16321) {
        }

        @Override // java.util.AbstractList, java.util.List
        public FieldId get(int i) {
        }
    }

    private final class MethodIdTable extends AbstractList<MethodId> implements RandomAccess {
        final /* synthetic */ Dex this$0;

        private MethodIdTable(Dex dex) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ MethodIdTable(Dex dex, C16321 c16321) {
        }

        @Override // java.util.AbstractList, java.util.List
        public MethodId get(int i) {
        }
    }

    private final class ProtoIdTable extends AbstractList<ProtoId> implements RandomAccess {
        final /* synthetic */ Dex this$0;

        private ProtoIdTable(Dex dex) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ ProtoIdTable(Dex dex, C16321 c16321) {
        }

        @Override // java.util.AbstractList, java.util.List
        public ProtoId get(int i) {
        }
    }

    public final class Section extends DexDataBuffer {
        private final String name;
        final /* synthetic */ Dex this$0;

        /* synthetic */ Section(Dex dex, String str, ByteBuffer byteBuffer, C16321 c16321) {
        }

        private void ensureFourBytesAligned(TableOfContents.Section section, boolean z) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public Annotation readAnnotation() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public AnnotationSet readAnnotationSet() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public AnnotationSetRefList readAnnotationSetRefList() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public AnnotationsDirectory readAnnotationsDirectory() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public ClassData readClassData() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public ClassDef readClassDef() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public Code readCode() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public DebugInfoItem readDebugInfoItem() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public EncodedValue readEncodedArray() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public FieldId readFieldId() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public MethodId readMethodId() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public ProtoId readProtoId() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public StringData readStringData() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public TypeList readTypeList() {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeAnnotation(Annotation annotation) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeAnnotationSet(AnnotationSet annotationSet) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeAnnotationSetRefList(AnnotationSetRefList annotationSetRefList) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeAnnotationsDirectory(AnnotationsDirectory annotationsDirectory) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeClassData(ClassData classData) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeClassDef(ClassDef classDef) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeCode(Code code) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeDebugInfoItem(DebugInfoItem debugInfoItem) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeEncodedArray(EncodedValue encodedValue) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeFieldId(FieldId fieldId) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeMethodId(MethodId methodId) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeProtoId(ProtoId protoId) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeStringData(StringData stringData) {
        }

        @Override // com.tencent.tinker.android.dex.io.DexDataBuffer
        public int writeTypeList(TypeList typeList) {
        }

        private Section(Dex dex, String str, ByteBuffer byteBuffer) {
        }
    }

    private final class StringTable extends AbstractList<String> implements RandomAccess {
        final /* synthetic */ Dex this$0;

        private StringTable(Dex dex) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ StringTable(Dex dex, C16321 c16321) {
        }

        @Override // java.util.AbstractList, java.util.List
        public String get(int i) {
        }
    }

    private final class TypeIndexToDescriptorIndexTable extends AbstractList<Integer> implements RandomAccess {
        final /* synthetic */ Dex this$0;

        private TypeIndexToDescriptorIndexTable(Dex dex) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ TypeIndexToDescriptorIndexTable(Dex dex, C16321 c16321) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i) {
        }
    }

    private final class TypeIndexToDescriptorTable extends AbstractList<String> implements RandomAccess {
        final /* synthetic */ Dex this$0;

        private TypeIndexToDescriptorTable(Dex dex) {
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }

        /* synthetic */ TypeIndexToDescriptorTable(Dex dex, C16321 c16321) {
        }

        @Override // java.util.AbstractList, java.util.List
        public String get(int i) {
        }
    }

    public Dex(byte[] bArr) throws IOException {
    }

    static /* synthetic */ void access$1000(int i, int i2) {
    }

    static /* synthetic */ StringTable access$1100(Dex dex) {
    }

    static /* synthetic */ TableOfContents access$900(Dex dex) {
    }

    private String bytesToHexString(byte[] bArr) {
    }

    private static void checkBounds(int i, int i2) {
    }

    private void loadFrom(InputStream inputStream) throws IOException {
    }

    public int annotationDirectoryOffsetFromClassDefIndex(int i) {
    }

    public Section appendSection(int i, String str) {
    }

    public Iterable<ClassDef> classDefIterable() {
    }

    public List<ClassDef> classDefs() {
    }

    public int computeChecksum() throws IOException {
    }

    public byte[] computeSignature(boolean z) {
    }

    public int declaringClassIndexFromMethodIndex(int i) {
    }

    public int descriptorIndexFromTypeIndex(int i) {
    }

    public List<FieldId> fieldIds() {
    }

    public int findClassDefIndexFromTypeIndex(int i) {
    }

    public int findFieldIndex(FieldId fieldId) {
    }

    public int findMethodIndex(MethodId methodId) {
    }

    public int findStringIndex(String str) {
    }

    public int findTypeIndex(String str) {
    }

    public byte[] getBytes() {
    }

    public int getLength() {
    }

    public int getNextSectionStart() {
    }

    public TableOfContents getTableOfContents() {
    }

    public short[] interfaceTypeIndicesFromClassDef(ClassDef classDef) {
    }

    public short[] interfaceTypeIndicesFromClassDefIndex(int i) {
    }

    public List<MethodId> methodIds() {
    }

    public int nameIndexFromFieldIndex(int i) {
    }

    public int nameIndexFromMethodIndex(int i) {
    }

    public Section openSection(int i) {
    }

    public short[] parameterTypeIndicesFromMethodId(MethodId methodId) {
    }

    public short[] parameterTypeIndicesFromMethodIndex(int i) {
    }

    public List<ProtoId> protoIds() {
    }

    public ClassData readClassData(ClassDef classDef) {
    }

    public Code readCode(ClassData.Method method) {
    }

    public int returnTypeIndexFromMethodIndex(int i) {
    }

    public List<String> strings() {
    }

    public List<Integer> typeIds() {
    }

    public int typeIndexFromClassDefIndex(int i) {
    }

    public int typeIndexFromFieldIndex(int i) {
    }

    public List<String> typeNames() {
    }

    public void writeHashes() throws IOException {
    }

    public void writeTo(OutputStream outputStream) throws IOException {
    }

    private Dex(ByteBuffer byteBuffer) throws IOException {
    }

    private void loadFrom(InputStream inputStream, int i) throws IOException {
    }

    public void writeTo(File file) throws IOException {
    }

    public Section openSection(TableOfContents.Section section) {
    }

    public Dex(int i) {
    }

    public Dex(InputStream inputStream) throws IOException {
    }

    public Dex(InputStream inputStream, int i) throws IOException {
    }

    public Dex(File file) throws IOException {
    }
}
