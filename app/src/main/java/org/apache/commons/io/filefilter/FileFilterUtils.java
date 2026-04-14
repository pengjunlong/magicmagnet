package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.IOCase;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FileFilterUtils {
    private static final IOFileFilter cvsFilter = null;
    private static final IOFileFilter svnFilter = null;

    public static IOFileFilter ageFileFilter(long j) {
    }

    public static IOFileFilter and(IOFileFilter... iOFileFilterArr) {
    }

    @Deprecated
    public static IOFileFilter andFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
    }

    public static IOFileFilter asFileFilter(FileFilter fileFilter) {
    }

    public static IOFileFilter directoryFileFilter() {
    }

    public static IOFileFilter falseFileFilter() {
    }

    public static IOFileFilter fileFileFilter() {
    }

    public static File[] filter(IOFileFilter iOFileFilter, File... fileArr) {
    }

    public static List<File> filterList(IOFileFilter iOFileFilter, Iterable<File> iterable) {
    }

    public static Set<File> filterSet(IOFileFilter iOFileFilter, File... fileArr) {
    }

    public static IOFileFilter magicNumberFileFilter(String str) {
    }

    public static IOFileFilter makeCVSAware(IOFileFilter iOFileFilter) {
    }

    public static IOFileFilter makeDirectoryOnly(IOFileFilter iOFileFilter) {
    }

    public static IOFileFilter makeFileOnly(IOFileFilter iOFileFilter) {
    }

    public static IOFileFilter makeSVNAware(IOFileFilter iOFileFilter) {
    }

    public static IOFileFilter nameFileFilter(String str) {
    }

    public static IOFileFilter notFileFilter(IOFileFilter iOFileFilter) {
    }

    public static IOFileFilter or(IOFileFilter... iOFileFilterArr) {
    }

    @Deprecated
    public static IOFileFilter orFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
    }

    public static IOFileFilter prefixFileFilter(String str) {
    }

    public static IOFileFilter sizeFileFilter(long j) {
    }

    public static IOFileFilter sizeRangeFileFilter(long j, long j2) {
    }

    public static IOFileFilter suffixFileFilter(String str) {
    }

    public static List<IOFileFilter> toList(IOFileFilter... iOFileFilterArr) {
    }

    public static IOFileFilter trueFileFilter() {
    }

    public static IOFileFilter ageFileFilter(long j, boolean z) {
    }

    public static IOFileFilter asFileFilter(FilenameFilter filenameFilter) {
    }

    public static List<File> filterList(IOFileFilter iOFileFilter, File... fileArr) {
    }

    public static IOFileFilter magicNumberFileFilter(String str, long j) {
    }

    public static IOFileFilter nameFileFilter(String str, IOCase iOCase) {
    }

    public static IOFileFilter prefixFileFilter(String str, IOCase iOCase) {
    }

    public static IOFileFilter sizeFileFilter(long j, boolean z) {
    }

    public static IOFileFilter suffixFileFilter(String str, IOCase iOCase) {
    }

    public static IOFileFilter ageFileFilter(Date date) {
    }

    public static Set<File> filterSet(IOFileFilter iOFileFilter, Iterable<File> iterable) {
    }

    public static IOFileFilter magicNumberFileFilter(byte[] bArr) {
    }

    public static IOFileFilter ageFileFilter(Date date, boolean z) {
    }

    public static IOFileFilter magicNumberFileFilter(byte[] bArr, long j) {
    }

    public static IOFileFilter ageFileFilter(File file) {
    }

    public static IOFileFilter ageFileFilter(File file, boolean z) {
    }

    public static File[] filter(IOFileFilter iOFileFilter, Iterable<File> iterable) {
    }

    private static <T extends Collection<File>> T filter(IOFileFilter iOFileFilter, Iterable<File> iterable, T t) {
    }
}
