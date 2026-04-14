package org.apache.commons.io;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Iterator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class LineIterator implements Iterator<String> {
    private final BufferedReader bufferedReader;
    private String cachedLine;
    private boolean finished;

    public LineIterator(Reader reader) throws IllegalArgumentException {
    }

    public static void closeQuietly(LineIterator lineIterator) {
    }

    public void close() {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
    }

    protected boolean isValidLine(String str) {
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ String next() {
    }

    public String nextLine() {
    }

    @Override // java.util.Iterator
    public void remove() {
    }

    @Override // java.util.Iterator
    /* renamed from: next, reason: avoid collision after fix types in other method */
    public String next2() {
    }
}
