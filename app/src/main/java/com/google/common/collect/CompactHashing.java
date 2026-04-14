package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    static final int DEFAULT_SIZE = 3;
    static final int HASH_TABLE_BITS_MASK = 31;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    static final int MAX_SIZE = 1073741823;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    static final int MODIFICATION_COUNT_INCREMENT = 32;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;
    static final byte UNSET = 0;

    private CompactHashing() {
    }

    static Object createTable(int i) {
    }

    static int getHashPrefix(int i, int i2) {
    }

    static int getNext(int i, int i2) {
    }

    static int maskCombine(int i, int i2, int i3) {
    }

    static int newCapacity(int i) {
    }

    static int remove(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
    }

    static void tableClear(Object obj) {
    }

    static int tableGet(Object obj, int i) {
    }

    static void tableSet(Object obj, int i, int i2) {
    }

    static int tableSize(int i) {
    }
}
