package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

@Deprecated
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class WildcardFilter extends AbstractFileFilter implements Serializable {
    private final String[] wildcards;

    public WildcardFilter(String str) {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
    }

    public WildcardFilter(String[] strArr) {
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
    }

    public WildcardFilter(List<String> list) {
    }
}
