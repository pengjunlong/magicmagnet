package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import p000.aj1;
import p000.cl1;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll;
import p000.t51;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class DiskLruCache implements Closeable, Flushable {
    public static final long ANY_SEQUENCE_NUMBER = 0;
    public static final String CLEAN = null;
    public static final Companion Companion = null;
    public static final String DIRTY = null;
    public static final String JOURNAL_FILE = null;
    public static final String JOURNAL_FILE_BACKUP = null;
    public static final String JOURNAL_FILE_TEMP = null;
    public static final t51 LEGAL_KEY_PATTERN = null;
    public static final String MAGIC = null;
    public static final String READ = null;
    public static final String REMOVE = null;
    public static final String VERSION_1 = null;
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    @Metadata
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
        }

        public final void abort() throws IOException {
        }

        public final void commit() throws IOException {
        }

        public final void detach$okhttp() {
        }

        public final Entry getEntry$okhttp() {
        }

        public final boolean[] getWritten$okhttp() {
        }

        public final aj1 newSink(int i) {
        }

        public final cl1 newSource(int i) {
        }
    }

    @Metadata
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
        }

        private final Void invalidLengths(List<String> list) throws IOException {
        }

        private final cl1 newSource(int i) {
        }

        public final List<File> getCleanFiles$okhttp() {
        }

        public final Editor getCurrentEditor$okhttp() {
        }

        public final List<File> getDirtyFiles$okhttp() {
        }

        public final String getKey$okhttp() {
        }

        public final long[] getLengths$okhttp() {
        }

        public final int getLockingSourceCount$okhttp() {
        }

        public final boolean getReadable$okhttp() {
        }

        public final long getSequenceNumber$okhttp() {
        }

        public final boolean getZombie$okhttp() {
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
        }

        public final void setLockingSourceCount$okhttp(int i) {
        }

        public final void setReadable$okhttp(boolean z) {
        }

        public final void setSequenceNumber$okhttp(long j) {
        }

        public final void setZombie$okhttp(boolean z) {
        }

        public final Snapshot snapshot$okhttp() {
        }

        public final void writeLengths$okhttp(qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) throws IOException {
        }
    }

    @Metadata
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<cl1> sources;
        final /* synthetic */ DiskLruCache this$0;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends cl1> list, long[] jArr) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final Editor edit() throws IOException {
        }

        public final long getLength(int i) {
        }

        public final cl1 getSource(int i) {
        }

        public final String key() {
        }
    }

    public DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, TaskRunner taskRunner) {
    }

    public static final /* synthetic */ boolean access$getCivilizedFileSystem$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ boolean access$getInitialized$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ void access$setHasJournalErrors$p(DiskLruCache diskLruCache, boolean z) {
    }

    public static final /* synthetic */ void access$setJournalWriter$p(DiskLruCache diskLruCache, qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll qbdbqdqbqtxlkiajciumulbqabnb11l111ll) {
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(DiskLruCache diskLruCache, boolean z) {
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(DiskLruCache diskLruCache, boolean z) {
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(DiskLruCache diskLruCache, int i) {
    }

    private final synchronized void checkNotClosed() {
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
    }

    private final boolean journalRebuildRequired() {
    }

    private final qbdbqdqbqtXLkiaJCiUMuLbqaBnb11l111ll newJournalWriter() throws FileNotFoundException {
    }

    private final void processJournal() throws IOException {
    }

    private final void readJournal() throws IOException {
    }

    private final void readJournalLine(String str) throws IOException {
    }

    private final boolean removeOldestEntry() {
    }

    private final void validateKey(String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z) throws IOException {
    }

    public final void delete() throws IOException {
    }

    public final Editor edit(String str) throws IOException {
    }

    public final synchronized Editor edit(String str, long j) throws IOException {
    }

    public final synchronized void evictAll() throws IOException {
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
    }

    public final synchronized Snapshot get(String str) throws IOException {
    }

    public final boolean getClosed$okhttp() {
    }

    public final File getDirectory() {
    }

    public final FileSystem getFileSystem$okhttp() {
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
    }

    public final synchronized long getMaxSize() {
    }

    public final int getValueCount$okhttp() {
    }

    public final synchronized void initialize() throws IOException {
    }

    public final synchronized boolean isClosed() {
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
    }

    public final synchronized boolean remove(String str) throws IOException {
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
    }

    public final void setClosed$okhttp(boolean z) {
    }

    public final synchronized void setMaxSize(long j) {
    }

    public final synchronized long size() throws IOException {
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
    }

    public final void trimToSize() throws IOException {
    }
}
