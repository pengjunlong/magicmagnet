package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class AgeFileFilter extends AbstractFileFilter implements Serializable {
    private final boolean acceptOlder;
    private final long cutoff;

    public AgeFileFilter(long j) {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
    }

    public AgeFileFilter(long j, boolean z) {
    }

    public AgeFileFilter(Date date) {
    }

    public AgeFileFilter(Date date, boolean z) {
    }

    public AgeFileFilter(File file) {
    }

    public AgeFileFilter(File file, boolean z) {
    }
}
