package org.apache.commons.io.input;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class Tailer implements Runnable {
    private static final int DEFAULT_BUFSIZE = 4096;
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final long delayMillis;
    private final boolean end;
    private final File file;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;

    public Tailer(File file, TailerListener tailerListener) {
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, int i) {
    }

    private long readLines(RandomAccessFile randomAccessFile) throws IOException {
    }

    public long getDelay() {
    }

    public File getFile() {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void stop() {
    }

    public Tailer(File file, TailerListener tailerListener, long j) {
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z) {
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, int i) {
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
    }

    public Tailer(File file, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z) {
    }

    public static Tailer create(File file, TailerListener tailerListener, long j, boolean z, boolean z2) {
    }

    public static Tailer create(File file, TailerListener tailerListener, long j) {
    }

    public static Tailer create(File file, TailerListener tailerListener) {
    }
}
