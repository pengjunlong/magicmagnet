package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class DirectExecutor implements Executor {
    private static final /* synthetic */ DirectExecutor[] $VALUES = null;
    public static final DirectExecutor INSTANCE = null;

    private static /* synthetic */ DirectExecutor[] $values() {
    }

    private DirectExecutor(String str, int i) {
    }

    public static DirectExecutor valueOf(String str) {
    }

    public static DirectExecutor[] values() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
    }

    @Override // java.lang.Enum
    public String toString() {
    }
}
