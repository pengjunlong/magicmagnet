package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.MembersInjector;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class MembersInjectors {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class NoOpMembersInjector implements MembersInjector<Object> {
        private static final /* synthetic */ NoOpMembersInjector[] $VALUES = null;
        public static final NoOpMembersInjector INSTANCE = null;

        private NoOpMembersInjector(String str, int i) {
        }

        public static NoOpMembersInjector valueOf(String str) {
        }

        public static NoOpMembersInjector[] values() {
        }

        @Override // com.google.android.datatransport.runtime.dagger.MembersInjector
        public void injectMembers(Object obj) {
        }
    }

    private MembersInjectors() {
    }

    public static <T> MembersInjector<T> noOp() {
    }
}
