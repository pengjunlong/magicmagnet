package com.tencent.tinker.commons.dexpatcher.util;

import com.tencent.tinker.android.dex.Annotation;
import com.tencent.tinker.android.dex.AnnotationSet;
import com.tencent.tinker.android.dex.AnnotationSetRefList;
import com.tencent.tinker.android.dex.AnnotationsDirectory;
import com.tencent.tinker.android.dex.ClassData;
import com.tencent.tinker.android.dex.ClassDef;
import com.tencent.tinker.android.dex.Code;
import com.tencent.tinker.android.dex.DebugInfoItem;
import com.tencent.tinker.android.dex.EncodedValue;
import com.tencent.tinker.android.dex.EncodedValueReader;
import com.tencent.tinker.android.dex.FieldId;
import com.tencent.tinker.android.dex.MethodId;
import com.tencent.tinker.android.dex.ProtoId;
import com.tencent.tinker.android.dex.TypeList;
import com.tencent.tinker.android.dex.util.ByteInput;
import com.tencent.tinker.android.dex.util.ByteOutput;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class AbstractIndexMap {

    /* renamed from: com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap$1 */
    class C16371 implements ByteInput {
        final /* synthetic */ AbstractIndexMap this$0;
        final /* synthetic */ ByteArrayInputStream val$baisRef;

        C16371(AbstractIndexMap abstractIndexMap, ByteArrayInputStream byteArrayInputStream) {
        }

        @Override // com.tencent.tinker.android.dex.util.ByteInput
        public byte readByte() {
        }
    }

    /* renamed from: com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap$2 */
    class C16382 implements ByteOutput {
        final /* synthetic */ AbstractIndexMap this$0;
        final /* synthetic */ ByteArrayOutputStream val$baosRef;

        C16382(AbstractIndexMap abstractIndexMap, ByteArrayOutputStream byteArrayOutputStream) {
        }

        @Override // com.tencent.tinker.android.dex.util.ByteOutput
        public void writeByte(int i) {
        }
    }

    /* renamed from: com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap$3 */
    class C16393 implements ByteOutput {
        final /* synthetic */ AbstractIndexMap this$0;
        final /* synthetic */ ByteArrayOutputStream val$baos;

        C16393(AbstractIndexMap abstractIndexMap, ByteArrayOutputStream byteArrayOutputStream) {
        }

        @Override // com.tencent.tinker.android.dex.util.ByteOutput
        public void writeByte(int i) {
        }
    }

    /* renamed from: com.tencent.tinker.commons.dexpatcher.util.AbstractIndexMap$4 */
    class C16404 implements ByteOutput {
        final /* synthetic */ AbstractIndexMap this$0;
        final /* synthetic */ ByteArrayOutputStream val$baos;

        C16404(AbstractIndexMap abstractIndexMap, ByteArrayOutputStream byteArrayOutputStream) {
        }

        @Override // com.tencent.tinker.android.dex.util.ByteOutput
        public void writeByte(int i) {
        }
    }

    private final class EncodedValueTransformer {
        private final ByteOutput out;
        final /* synthetic */ AbstractIndexMap this$0;

        EncodedValueTransformer(AbstractIndexMap abstractIndexMap, ByteOutput byteOutput) {
        }

        static /* synthetic */ void access$000(EncodedValueTransformer encodedValueTransformer, EncodedValueReader encodedValueReader) {
        }

        static /* synthetic */ void access$100(EncodedValueTransformer encodedValueTransformer, EncodedValueReader encodedValueReader) {
        }

        private void transformAnnotation(EncodedValueReader encodedValueReader) {
        }

        private void transformArray(EncodedValueReader encodedValueReader) {
        }

        private void writeTypeAndArg(int i, int i2) {
        }

        public void transform(EncodedValueReader encodedValueReader) {
        }
    }

    private Code.CatchHandler[] adjustCatchHandlers(Code.CatchHandler[] catchHandlerArr) {
    }

    private byte[] adjustDebugInfoItemSTM(byte[] bArr) {
    }

    private ClassData.Field[] adjustFields(ClassData.Field[] fieldArr) {
    }

    private short[] adjustInstructions(short[] sArr) {
    }

    private ClassData.Method[] adjustMethods(ClassData.Method[] methodArr) {
    }

    private int[] adjustParameterNames(int[] iArr) {
    }

    public TypeList adjust(TypeList typeList) {
    }

    public abstract int adjustAnnotationOffset(int i);

    public abstract int adjustAnnotationSetOffset(int i);

    public abstract int adjustAnnotationSetRefListOffset(int i);

    public abstract int adjustAnnotationsDirectoryOffset(int i);

    public abstract int adjustClassDataOffset(int i);

    public abstract int adjustCodeOffset(int i);

    public abstract int adjustDebugInfoItemOffset(int i);

    public abstract int adjustFieldIdIndex(int i);

    public abstract int adjustMethodIdIndex(int i);

    public abstract int adjustProtoIdIndex(int i);

    public abstract int adjustStaticValuesOffset(int i);

    public abstract int adjustStringIndex(int i);

    public abstract int adjustTypeIdIndex(int i);

    public abstract int adjustTypeListOffset(int i);

    public MethodId adjust(MethodId methodId) {
    }

    public FieldId adjust(FieldId fieldId) {
    }

    public ProtoId adjust(ProtoId protoId) {
    }

    public ClassDef adjust(ClassDef classDef) {
    }

    public ClassData adjust(ClassData classData) {
    }

    public Code adjust(Code code) {
    }

    public DebugInfoItem adjust(DebugInfoItem debugInfoItem) {
    }

    public EncodedValue adjust(EncodedValue encodedValue) {
    }

    public Annotation adjust(Annotation annotation) {
    }

    public AnnotationSet adjust(AnnotationSet annotationSet) {
    }

    public AnnotationSetRefList adjust(AnnotationSetRefList annotationSetRefList) {
    }

    public AnnotationsDirectory adjust(AnnotationsDirectory annotationsDirectory) {
    }
}
