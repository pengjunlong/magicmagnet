package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.cl1;
import p000.dppbpdpFXDhtOnccosy1lll1l;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbbbpbbbiFxIAmEwllll11;
import p000.qqbddbbsOSPMeeOGlgesDt1l1l1;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Hpack {
    public static final Hpack INSTANCE = null;
    private static final Map<qqbddbbsOSPMeeOGlgesDt1l1l1, Integer> NAME_TO_FIRST_INDEX = null;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE = null;

    private Hpack() {
    }

    private final Map<qqbddbbsOSPMeeOGlgesDt1l1l1, Integer> nameToFirstIndex() {
    }

    public final qqbddbbsOSPMeeOGlgesDt1l1l1 checkLowercase(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException {
    }

    public final Map<qqbddbbsOSPMeeOGlgesDt1l1l1, Integer> getNAME_TO_FIRST_INDEX() {
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
    }

    @Metadata
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final qbbbpbbbiFxIAmEwllll11 source;

        public Reader(cl1 cl1Var, int i) {
        }

        public Reader(cl1 cl1Var, int i, int i2) {
        }

        private final void adjustDynamicTableByteCount() {
        }

        private final void clearDynamicTable() {
        }

        private final int dynamicTableIndex(int i) {
        }

        private final int evictToRecoverBytes(int i) {
        }

        private final qqbddbbsOSPMeeOGlgesDt1l1l1 getName(int i) throws IOException {
        }

        private final void insertIntoDynamicTable(int i, Header header) {
        }

        private final boolean isStaticHeader(int i) {
        }

        private final int readByte() throws IOException {
        }

        private final void readIndexedHeader(int i) throws IOException {
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws IOException {
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
        }

        public final List<Header> getAndResetHeaderList() {
        }

        public final int maxDynamicTableByteCount() {
        }

        public final qqbddbbsOSPMeeOGlgesDt1l1l1 readByteString() throws IOException {
        }

        public final void readHeaders() throws IOException {
        }

        public final int readInt(int i, int i2) throws IOException {
        }

        public /* synthetic */ Reader(cl1 cl1Var, int i, int i2, int i3, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    @Metadata
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final dppbpdpFXDhtOnccosy1lll1l out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l) {
        }

        public Writer(int i, boolean z, dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l) {
        }

        public Writer(dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l) {
        }

        private final void adjustDynamicTableByteCount() {
        }

        private final void clearDynamicTable() {
        }

        private final int evictToRecoverBytes(int i) {
        }

        private final void insertIntoDynamicTable(Header header) {
        }

        public final void resizeHeaderTable(int i) {
        }

        public final void writeByteString(qqbddbbsOSPMeeOGlgesDt1l1l1 qqbddbbsospmeeoglgesdt1l1l1) throws IOException {
        }

        public final void writeHeaders(List<Header> list) throws IOException {
        }

        public final void writeInt(int i, int i2, int i3) {
        }

        public /* synthetic */ Writer(int i, boolean z, dppbpdpFXDhtOnccosy1lll1l dppbpdpfxdhtonccosy1lll1l, int i2, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }
}
