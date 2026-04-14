package org.apache.commons.io.monitor;

import java.io.File;
import java.io.Serializable;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FileEntry implements Serializable {
    static final FileEntry[] EMPTY_ENTRIES = null;
    private FileEntry[] children;
    private boolean directory;
    private boolean exists;
    private final File file;
    private long lastModified;
    private long length;
    private String name;
    private final FileEntry parent;

    public FileEntry(File file) {
    }

    public FileEntry[] getChildren() {
    }

    public File getFile() {
    }

    public long getLastModified() {
    }

    public long getLength() {
    }

    public int getLevel() {
    }

    public String getName() {
    }

    public FileEntry getParent() {
    }

    public boolean isDirectory() {
    }

    public boolean isExists() {
    }

    public FileEntry newChildInstance(File file) {
    }

    public boolean refresh(File file) {
    }

    public void setChildren(FileEntry[] fileEntryArr) {
    }

    public void setDirectory(boolean z) {
    }

    public void setExists(boolean z) {
    }

    public void setLastModified(long j) {
    }

    public void setLength(long j) {
    }

    public void setName(String str) {
    }

    public FileEntry(FileEntry fileEntry, File file) {
    }
}
