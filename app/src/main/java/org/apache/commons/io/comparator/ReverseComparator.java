package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class ReverseComparator extends AbstractFileComparator implements Serializable {
    private final Comparator<File> delegate;

    public ReverseComparator(Comparator<File> comparator) {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(File file, File file2) {
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public String toString() {
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(File file, File file2) {
    }
}
