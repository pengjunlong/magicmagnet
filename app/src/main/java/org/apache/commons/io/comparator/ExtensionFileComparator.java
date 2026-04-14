package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOCase;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class ExtensionFileComparator extends AbstractFileComparator implements Serializable {
    public static final Comparator<File> EXTENSION_COMPARATOR = null;
    public static final Comparator<File> EXTENSION_INSENSITIVE_COMPARATOR = null;
    public static final Comparator<File> EXTENSION_INSENSITIVE_REVERSE = null;
    public static final Comparator<File> EXTENSION_REVERSE = null;
    public static final Comparator<File> EXTENSION_SYSTEM_COMPARATOR = null;
    public static final Comparator<File> EXTENSION_SYSTEM_REVERSE = null;
    private final IOCase caseSensitivity;

    public ExtensionFileComparator() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(File file, File file2) {
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ List sort(List list) {
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public String toString() {
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(File file, File file2) {
    }

    @Override // org.apache.commons.io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
    }

    public ExtensionFileComparator(IOCase iOCase) {
    }
}
