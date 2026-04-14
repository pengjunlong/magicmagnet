package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.Dex;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class TableOfContents {
    public static final short SECTION_TYPE_ANNOTATIONS = 8196;
    public static final short SECTION_TYPE_ANNOTATIONSDIRECTORIES = 8198;
    public static final short SECTION_TYPE_ANNOTATIONSETREFLISTS = 4098;
    public static final short SECTION_TYPE_ANNOTATIONSETS = 4099;
    public static final short SECTION_TYPE_CLASSDATA = 8192;
    public static final short SECTION_TYPE_CLASSDEFS = 6;
    public static final short SECTION_TYPE_CODES = 8193;
    public static final short SECTION_TYPE_DEBUGINFOS = 8195;
    public static final short SECTION_TYPE_ENCODEDARRAYS = 8197;
    public static final short SECTION_TYPE_FIELDIDS = 4;
    public static final short SECTION_TYPE_HEADER = 0;
    public static final short SECTION_TYPE_MAPLIST = 4096;
    public static final short SECTION_TYPE_METHODIDS = 5;
    public static final short SECTION_TYPE_PROTOIDS = 3;
    public static final short SECTION_TYPE_STRINGDATAS = 8194;
    public static final short SECTION_TYPE_STRINGIDS = 1;
    public static final short SECTION_TYPE_TYPEIDS = 2;
    public static final short SECTION_TYPE_TYPELISTS = 4097;
    public final Section annotationSetRefLists;
    public final Section annotationSets;
    public final Section annotations;
    public final Section annotationsDirectories;
    public int checksum;
    public final Section classDatas;
    public final Section classDefs;
    public final Section codes;
    public int dataOff;
    public int dataSize;
    public final Section debugInfos;
    public final Section encodedArrays;
    public final Section fieldIds;
    public int fileSize;
    public final Section header;
    public int linkOff;
    public int linkSize;
    public final Section mapList;
    public final Section methodIds;
    public final Section protoIds;
    public final Section[] sections;
    public byte[] signature;
    public final Section stringDatas;
    public final Section stringIds;
    public final Section typeIds;
    public final Section typeLists;

    public static class Section implements Comparable<Section> {
        public static final int UNDEF_INDEX = -1;
        public static final int UNDEF_OFFSET = -1;
        public int byteCount;
        public boolean isElementFourByteAligned;
        public int off;
        public int size;
        public final short type;

        public static abstract class Item<T> implements Comparable<T> {
            public int off;

            public Item(int i) {
            }

            public abstract int byteCountInDex();

            public boolean equals(Object obj) {
            }

            public int hashCode() {
            }
        }

        public Section(int i, boolean z) {
        }

        private int remapTypeOrderId(int i) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Section section) {
        }

        public boolean exists() {
        }

        public String toString() {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Section section) {
        }
    }

    private Section getSection(short s) {
    }

    private void readHeader(Dex.Section section) throws UnsupportedEncodingException {
    }

    private void readMap(Dex.Section section) throws IOException {
    }

    public void computeSizesFromOffsets() {
    }

    public Section getSectionByType(int i) {
    }

    public void readFrom(Dex dex) throws IOException {
    }

    public void writeHeader(Dex.Section section) throws IOException {
    }

    public void writeMap(Dex.Section section) throws IOException {
    }
}
