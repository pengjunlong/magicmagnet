package com.tencent.tinker.android.dx.instruction;

import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class InstructionComparator {
    private final InstructionHolder[] insnHolders1;
    private final InstructionHolder[] insnHolders2;
    private final short[] insns1;
    private final short[] insns2;
    private final Set<String> visitedInsnAddrPairs;

    /* renamed from: com.tencent.tinker.android.dx.instruction.InstructionComparator$1 */
    class C16351 extends InstructionVisitor {
        final /* synthetic */ InstructionComparator this$0;
        final /* synthetic */ InstructionHolder[] val$result;

        C16351(InstructionComparator instructionComparator, InstructionVisitor instructionVisitor, InstructionHolder[] instructionHolderArr) {
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

    public InstructionComparator(short[] sArr, short[] sArr2) {
    }

    private boolean compareIndex(int i, int i2, int i3) {
    }

    private int getPromotedOpCodeOnDemand(InstructionHolder instructionHolder) {
    }

    private InstructionHolder[] readInstructionsIntoHolders(ShortArrayCodeInput shortArrayCodeInput, int i) {
    }

    public final boolean compare() {
    }

    protected abstract boolean compareField(int i, int i2);

    protected abstract boolean compareMethod(int i, int i2);

    protected abstract boolean compareString(int i, int i2);

    protected abstract boolean compareType(int i, int i2);

    public boolean isSameInstruction(int i, int i2) {
    }

    private static class PackedSwitchPayloadInsntructionHolder extends InstructionHolder {
        int firstKey;
        int[] targets;

        private PackedSwitchPayloadInsntructionHolder() {
        }

        /* synthetic */ PackedSwitchPayloadInsntructionHolder(C16351 c16351) {
        }
    }

    private static class SparseSwitchPayloadInsntructionHolder extends InstructionHolder {
        int[] keys;
        int[] targets;

        private SparseSwitchPayloadInsntructionHolder() {
        }

        /* synthetic */ SparseSwitchPayloadInsntructionHolder(C16351 c16351) {
        }
    }

    private static class FillArrayDataPayloadInstructionHolder extends InstructionHolder {
        Object data;
        int elementWidth;
        int size;

        private FillArrayDataPayloadInstructionHolder() {
        }

        /* synthetic */ FillArrayDataPayloadInstructionHolder(C16351 c16351) {
        }
    }

    public boolean isSameInstruction(InstructionHolder instructionHolder, InstructionHolder instructionHolder2) {
    }

    private static class InstructionHolder {

        /* renamed from: a */
        int f1139a;
        int address;

        /* renamed from: b */
        int f1140b;

        /* renamed from: c */
        int f1141c;

        /* renamed from: d */
        int f1142d;

        /* renamed from: e */
        int f1143e;
        int index;
        int insnFormat;
        long literal;
        int opcode;
        int registerCount;
        int target;

        private InstructionHolder() {
        }

        /* synthetic */ InstructionHolder(C16351 c16351) {
        }
    }
}
