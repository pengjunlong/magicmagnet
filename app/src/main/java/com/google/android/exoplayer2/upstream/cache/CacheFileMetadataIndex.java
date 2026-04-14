package com.google.android.exoplayer2.upstream.cache;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import java.util.Map;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
final class CacheFileMetadataIndex {
    private static final String[] COLUMNS = null;
    private static final int COLUMN_INDEX_LAST_TOUCH_TIMESTAMP = 2;
    private static final int COLUMN_INDEX_LENGTH = 1;
    private static final int COLUMN_INDEX_NAME = 0;
    private static final String COLUMN_LAST_TOUCH_TIMESTAMP = "last_touch_timestamp";
    private static final String COLUMN_LENGTH = "length";
    private static final String COLUMN_NAME = "name";
    private static final String TABLE_PREFIX = "ExoPlayerCacheFileMetadata";
    private static final String TABLE_SCHEMA = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
    private static final int TABLE_VERSION = 1;
    private static final String WHERE_NAME_EQUALS = "name = ?";
    private final DatabaseProvider databaseProvider;
    private String tableName;

    public CacheFileMetadataIndex(DatabaseProvider databaseProvider) {
    }

    public static void delete(DatabaseProvider databaseProvider, long j) throws DatabaseIOException {
    }

    private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
    }

    private Cursor getCursor() {
    }

    private static String getTableName(String str) {
    }

    public Map<String, CacheFileMetadata> getAll() throws DatabaseIOException {
    }

    public void initialize(long j) throws DatabaseIOException {
    }

    public void remove(String str) throws DatabaseIOException {
    }

    public void removeAll(Set<String> set) throws DatabaseIOException {
    }

    public void set(String str, long j, long j2) throws DatabaseIOException {
    }
}
