package com.tencent.tinker.commons.dexpatcher.util;

import com.tencent.tinker.android.dex.DexException;
import com.tencent.tinker.android.dx.instruction.InstructionVisitor;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class InstructionTransformer {
    private final AbstractIndexMap indexMap;

    private final class InstructionTransformVisitor extends InstructionVisitor {
        final /* synthetic */ InstructionTransformer this$0;

        InstructionTransformVisitor(InstructionTransformer instructionTransformer, InstructionVisitor instructionVisitor) {
        }

        private int transformIndexIfNeeded(int i, int i2) {
        }

        @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
        public void visitFiveRegisterInsn(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8, int i9, int i10) {
        }

        @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
        public void visitFourRegisterInsn(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8, int i9) {
        }

        @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
        public void visitOneRegisterInsn(int i, int i2, int i3, int i4, int i5, long j, int i6) {
        }

        @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
        public void visitRegisterRangeInsn(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7) {
        }

        @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
        public void visitThreeRegisterInsn(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8) {
        }

        @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
        public void visitTwoRegisterInsn(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7) {
        }

        @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
        public void visitZeroRegisterInsn(int i, int i2, int i3, int i4, int i5, long j) {
        }
    }

    public InstructionTransformer(AbstractIndexMap abstractIndexMap) {
    }

    static /* synthetic */ AbstractIndexMap access$000(InstructionTransformer instructionTransformer) {
    }

    public short[] transform(short[] sArr) throws DexException {
    }
}
