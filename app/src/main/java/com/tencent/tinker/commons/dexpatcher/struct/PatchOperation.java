package com.tencent.tinker.commons.dexpatcher.struct;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class PatchOperation<T> {
    public static final int OP_ADD = 1;
    public static final int OP_DEL = 0;
    public static final int OP_REPLACE = 2;
    public int index;
    public T newItem;
    public int op;

    public PatchOperation(int i, int i2) {
    }

    public static String translateOpToString(int i) {
    }

    public String toString() {
    }

    public PatchOperation(int i, int i2, T t) {
    }
}
