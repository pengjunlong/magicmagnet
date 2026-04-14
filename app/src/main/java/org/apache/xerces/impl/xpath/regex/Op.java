package org.apache.xerces.impl.xpath.regex;

import java.util.Vector;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class Op {
    static final int ANCHOR = 5;
    static final int BACKREFERENCE = 16;
    static final int CAPTURE = 15;
    static final int CHAR = 1;
    static final int CLOSURE = 7;
    static final int CONDITION = 26;
    static final boolean COUNT = false;
    static final int DOT = 0;
    static final int INDEPENDENT = 24;
    static final int LOOKAHEAD = 20;
    static final int LOOKBEHIND = 22;
    static final int MODIFIER = 25;
    static final int NEGATIVELOOKAHEAD = 21;
    static final int NEGATIVELOOKBEHIND = 23;
    static final int NONGREEDYCLOSURE = 8;
    static final int NONGREEDYQUESTION = 10;
    static final int NRANGE = 4;
    static final int QUESTION = 9;
    static final int RANGE = 3;
    static final int STRING = 6;
    static final int UNION = 11;
    static int nofinstances;
    Op next;
    final int type;

    static class CharOp extends Op {
        final int charData;

        CharOp(int i, int i2) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Op
        int getData() {
        }
    }

    static class ChildOp extends Op {
        Op child;

        ChildOp(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Op
        Op getChild() {
        }

        void setChild(Op op) {
        }
    }

    static class ConditionOp extends Op {
        final Op condition;
        final Op no;
        final int refNumber;
        final Op yes;

        ConditionOp(int i, int i2, Op op, Op op2, Op op3) {
        }
    }

    static class ModifierOp extends ChildOp {
        final int v1;
        final int v2;

        ModifierOp(int i, int i2, int i3) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Op
        int getData() {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Op
        int getData2() {
        }
    }

    static class RangeOp extends Op {
        final Token tok;

        RangeOp(int i, Token token) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Op
        RangeToken getToken() {
        }
    }

    static class StringOp extends Op {
        final String string;

        StringOp(int i, String str) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Op
        String getString() {
        }
    }

    static class UnionOp extends Op {
        final Vector branches;

        UnionOp(int i, int i2) {
        }

        void addElement(Op op) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Op
        Op elementAt(int i) {
        }

        @Override // org.apache.xerces.impl.xpath.regex.Op
        int size() {
        }
    }

    protected Op(int i) {
    }

    static CharOp createAnchor(int i) {
    }

    static CharOp createBackReference(int i) {
    }

    static CharOp createCapture(int i, Op op) {
    }

    static CharOp createChar(int i) {
    }

    static ChildOp createClosure(int i) {
    }

    static ConditionOp createCondition(Op op, int i, Op op2, Op op3, Op op4) {
    }

    static Op createDot() {
    }

    static ChildOp createIndependent(Op op, Op op2) {
    }

    static ChildOp createLook(int i, Op op, Op op2) {
    }

    static ModifierOp createModifier(Op op, Op op2, int i, int i2) {
    }

    static ChildOp createNonGreedyClosure() {
    }

    static ChildOp createQuestion(boolean z) {
    }

    static RangeOp createRange(Token token) {
    }

    static StringOp createString(String str) {
    }

    static UnionOp createUnion(int i) {
    }

    Op elementAt(int i) {
    }

    Op getChild() {
    }

    int getData() {
    }

    int getData2() {
    }

    String getString() {
    }

    RangeToken getToken() {
    }

    int size() {
    }
}
