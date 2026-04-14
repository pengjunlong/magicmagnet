package com.tencent.tinker.android.dx.instruction;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class InstructionWriter extends InstructionVisitor {
    private final ShortArrayCodeOutput codeOut;
    private final boolean hasPromoter;
    private final InstructionPromoter insnPromoter;

    public InstructionWriter(ShortArrayCodeOutput shortArrayCodeOutput, InstructionPromoter instructionPromoter) {
    }

    @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
    public void visitFillArrayDataPayloadInsn(int i, int i2, Object obj, int i3, int i4) {
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
    public void visitPackedSwitchPayloadInsn(int i, int i2, int i3, int[] iArr) {
    }

    @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
    public void visitRegisterRangeInsn(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7) {
    }

    @Override // com.tencent.tinker.android.dx.instruction.InstructionVisitor
    public void visitSparseSwitchPayloadInsn(int i, int i2, int[] iArr, int[] iArr2) {
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
