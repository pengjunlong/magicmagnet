package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class Striped64 extends Number {
    static final int NCPU = 0;
    private static final Unsafe UNSAFE = null;
    private static final long baseOffset = 0;
    private static final long busyOffset = 0;
    static final Random rng = null;
    static final ThreadLocal<int[]> threadHashCode = null;
    volatile transient long base;
    volatile transient int busy;
    volatile transient Cell[] cells;

    /* renamed from: com.google.common.cache.Striped64$1 */
    class C06661 implements PrivilegedExceptionAction<Unsafe> {
        C06661() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public /* bridge */ /* synthetic */ Unsafe run() throws Exception {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: run, reason: avoid collision after fix types in other method */
        public Unsafe run2() throws Exception {
        }
    }

    static final class Cell {
        private static final Unsafe UNSAFE = null;
        private static final long valueOffset = 0;
        volatile long p0;
        volatile long p1;
        volatile long p2;
        volatile long p3;
        volatile long p4;
        volatile long p5;
        volatile long p6;
        volatile long q0;
        volatile long q1;
        volatile long q2;
        volatile long q3;
        volatile long q4;
        volatile long q5;
        volatile long q6;
        volatile long value;

        Cell(long j) {
        }

        final boolean cas(long j, long j2) {
        }
    }

    Striped64() {
    }

    static /* synthetic */ Unsafe access$000() {
    }

    private static Unsafe getUnsafe() {
    }

    final boolean casBase(long j, long j2) {
    }

    final boolean casBusy() {
    }

    abstract long fn(long j, long j2);

    final void internalReset(long j) {
    }

    final void retryUpdate(long j, int[] iArr, boolean z) {
    }
}
