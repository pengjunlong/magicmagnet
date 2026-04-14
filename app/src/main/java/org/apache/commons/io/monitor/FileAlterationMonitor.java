package org.apache.commons.io.monitor;

import java.util.List;
import java.util.concurrent.ThreadFactory;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class FileAlterationMonitor implements Runnable {
    private final long interval;
    private final List<FileAlterationObserver> observers;
    private volatile boolean running;
    private Thread thread;
    private ThreadFactory threadFactory;

    public FileAlterationMonitor() {
    }

    public void addObserver(FileAlterationObserver fileAlterationObserver) {
    }

    public long getInterval() {
    }

    public Iterable<FileAlterationObserver> getObservers() {
    }

    public void removeObserver(FileAlterationObserver fileAlterationObserver) {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public synchronized void setThreadFactory(ThreadFactory threadFactory) {
    }

    public synchronized void start() throws Exception {
    }

    public synchronized void stop() throws Exception {
    }

    public FileAlterationMonitor(long j) {
    }

    public synchronized void stop(long j) throws Exception {
    }

    public FileAlterationMonitor(long j, FileAlterationObserver... fileAlterationObserverArr) {
    }
}
