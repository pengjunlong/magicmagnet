package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.io.filefilter.IOFileFilter;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class DirectoryWalker<T> {
    private final int depthLimit;
    private final FileFilter filter;

    public static class CancelException extends IOException {
        private static final long serialVersionUID = 1347339620135041008L;
        private final int depth;
        private final File file;

        public CancelException(File file, int i) {
        }

        public int getDepth() {
        }

        public File getFile() {
        }

        public CancelException(String str, File file, int i) {
        }
    }

    protected DirectoryWalker() {
    }

    protected final void checkIfCancelled(File file, int i, Collection<T> collection) throws IOException {
    }

    protected File[] filterDirectoryContents(File file, int i, File[] fileArr) throws IOException {
    }

    protected void handleCancelled(File file, Collection<T> collection, CancelException cancelException) throws IOException {
    }

    protected boolean handleDirectory(File file, int i, Collection<T> collection) throws IOException {
    }

    protected void handleDirectoryEnd(File file, int i, Collection<T> collection) throws IOException {
    }

    protected void handleDirectoryStart(File file, int i, Collection<T> collection) throws IOException {
    }

    protected void handleEnd(Collection<T> collection) throws IOException {
    }

    protected void handleFile(File file, int i, Collection<T> collection) throws IOException {
    }

    protected boolean handleIsCancelled(File file, int i, Collection<T> collection) throws IOException {
    }

    protected void handleRestricted(File file, int i, Collection<T> collection) throws IOException {
    }

    protected void handleStart(File file, Collection<T> collection) throws IOException {
    }

    protected final void walk(File file, Collection<T> collection) throws IOException {
    }

    protected DirectoryWalker(FileFilter fileFilter, int i) {
    }

    protected DirectoryWalker(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, int i) {
    }

    private void walk(File file, int i, Collection<T> collection) throws IOException {
    }
}
