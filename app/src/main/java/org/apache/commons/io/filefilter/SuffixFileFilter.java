package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.io.IOCase;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class SuffixFileFilter extends AbstractFileFilter implements Serializable {
    private final IOCase caseSensitivity;
    private final String[] suffixes;

    public SuffixFileFilter(String str) {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
    }

    public SuffixFileFilter(String str, IOCase iOCase) {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
    }

    public SuffixFileFilter(String[] strArr) {
    }

    public SuffixFileFilter(String[] strArr, IOCase iOCase) {
    }

    public SuffixFileFilter(List<String> list) {
    }

    public SuffixFileFilter(List<String> list, IOCase iOCase) {
    }
}
