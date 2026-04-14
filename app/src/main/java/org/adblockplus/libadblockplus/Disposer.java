package org.adblockplus.libadblockplus;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Disposer extends WeakReference<Disposable> {
    private static final HashSet<Disposer> disposerSet = null;
    static final ReferenceQueue<Disposable> referenceQueue = null;
    private final Disposable disposable;
    private volatile boolean disposed;

    private static final class Cleaner implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public Disposer(Disposable disposable, Disposable disposable2) {
    }

    public synchronized void dispose() {
    }
}
