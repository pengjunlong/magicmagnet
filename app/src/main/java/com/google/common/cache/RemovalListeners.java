package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class RemovalListeners {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* renamed from: com.google.common.cache.RemovalListeners$1 */
    class C06651<K, V> implements RemovalListener<K, V> {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ RemovalListener val$listener;

        /* renamed from: com.google.common.cache.RemovalListeners$1$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            final /* synthetic */ C06651 this$0;
            final /* synthetic */ RemovalNotification val$notification;

            AnonymousClass1(C06651 c06651, RemovalNotification removalNotification) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        C06651(Executor executor, RemovalListener removalListener) {
        }

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(RemovalNotification<K, V> removalNotification) {
        }
    }

    private RemovalListeners() {
    }

    public static <K, V> RemovalListener<K, V> asynchronous(RemovalListener<K, V> removalListener, Executor executor) {
    }
}
