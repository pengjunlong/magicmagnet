package org.apache.commons.io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FileCleaningTracker {
    final List<String> deleteFailures;
    volatile boolean exitWhenFinished;

    /* renamed from: q */
    ReferenceQueue<Object> f1184q;
    Thread reaper;
    final Collection<Tracker> trackers;

    private final class Reaper extends Thread {
        final /* synthetic */ FileCleaningTracker this$0;

        Reaper(FileCleaningTracker fileCleaningTracker) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    private static final class Tracker extends PhantomReference<Object> {
        private final FileDeleteStrategy deleteStrategy;
        private final String path;

        Tracker(String str, FileDeleteStrategy fileDeleteStrategy, Object obj, ReferenceQueue<? super Object> referenceQueue) {
        }

        public boolean delete() {
        }

        public String getPath() {
        }
    }

    private synchronized void addTracker(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
    }

    public synchronized void exitWhenFinished() {
    }

    public List<String> getDeleteFailures() {
    }

    public int getTrackCount() {
    }

    public void track(File file, Object obj) {
    }

    public void track(File file, Object obj, FileDeleteStrategy fileDeleteStrategy) {
    }

    public void track(String str, Object obj) {
    }

    public void track(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
    }
}
