package org.apache.commons.io.monitor;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOCase;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FileAlterationObserver implements Serializable {
    private final Comparator<File> comparator;
    private final FileFilter fileFilter;
    private final List<FileAlterationListener> listeners;
    private final FileEntry rootEntry;

    public FileAlterationObserver(String str) {
    }

    private FileEntry createFileEntry(FileEntry fileEntry, File file) {
    }

    private void doCreate(FileEntry fileEntry) {
    }

    private void doDelete(FileEntry fileEntry) {
    }

    private void doMatch(FileEntry fileEntry, File file) {
    }

    private File[] listFiles(File file) {
    }

    public void addListener(FileAlterationListener fileAlterationListener) {
    }

    public void checkAndNotify() {
    }

    public void destroy() throws Exception {
    }

    public File getDirectory() {
    }

    public FileFilter getFileFilter() {
    }

    public Iterable<FileAlterationListener> getListeners() {
    }

    public void initialize() throws Exception {
    }

    public void removeListener(FileAlterationListener fileAlterationListener) {
    }

    public String toString() {
    }

    public FileAlterationObserver(String str, FileFilter fileFilter) {
    }

    public FileAlterationObserver(String str, FileFilter fileFilter, IOCase iOCase) {
    }

    public FileAlterationObserver(File file) {
    }

    public FileAlterationObserver(File file, FileFilter fileFilter) {
    }

    public FileAlterationObserver(File file, FileFilter fileFilter, IOCase iOCase) {
    }

    protected FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, IOCase iOCase) {
    }

    private void checkAndNotify(FileEntry fileEntry, FileEntry[] fileEntryArr, File[] fileArr) {
    }
}
