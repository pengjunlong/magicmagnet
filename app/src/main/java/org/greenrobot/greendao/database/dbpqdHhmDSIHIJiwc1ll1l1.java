package org.greenrobot.greendao.database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p000.bqbdpdpdKfXQmeJwqllll11l11;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class dbpqdHhmDSIHIJiwc1ll1l1 extends SQLiteOpenHelper {
    private final Context context;
    private InterfaceC2067dbpqdHhmDSIHIJiwc1ll1l1 encryptedHelper;
    private boolean loadSQLCipherNativeLibs;
    private final String name;
    private final int version;

    /* renamed from: org.greenrobot.greendao.database.dbpqdHhmDSIHIJiwc1ll1l1$dbpqdHhmDSIHIJiwc1ll1l1, reason: collision with other inner class name */
    interface InterfaceC2067dbpqdHhmDSIHIJiwc1ll1l1 {
        bqbdpdpdKfXQmeJwqllll11l11 dbpqdHhmDSIHIJiwc1ll1l1(String str);

        bqbdpdpdKfXQmeJwqllll11l11 dpbdbdpbLwkLpObyKsq1lll1(String str);

        bqbdpdpdKfXQmeJwqllll11l11 dpbdpqRKAscW1lll1l(char[] cArr);

        bqbdpdpdKfXQmeJwqllll11l11 dqqppqiKzJi1l1lll1l(char[] cArr);
    }

    public dbpqdHhmDSIHIJiwc1ll1l1(Context context, String str, int i) {
    }

    private InterfaceC2067dbpqdHhmDSIHIJiwc1ll1l1 checkEncryptedHelper() {
    }

    public bqbdpdpdKfXQmeJwqllll11l11 getEncryptedReadableDb(String str) {
    }

    public bqbdpdpdKfXQmeJwqllll11l11 getEncryptedWritableDb(String str) {
    }

    public bqbdpdpdKfXQmeJwqllll11l11 getReadableDb() {
    }

    public bqbdpdpdKfXQmeJwqllll11l11 getWritableDb() {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onCreate(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public void onOpen(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onUpgrade(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11, int i, int i2) {
    }

    public void setLoadSQLCipherNativeLibs(boolean z) {
    }

    protected bqbdpdpdKfXQmeJwqllll11l11 wrap(SQLiteDatabase sQLiteDatabase) {
    }

    public dbpqdHhmDSIHIJiwc1ll1l1(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
    }

    public bqbdpdpdKfXQmeJwqllll11l11 getEncryptedReadableDb(char[] cArr) {
    }

    public bqbdpdpdKfXQmeJwqllll11l11 getEncryptedWritableDb(char[] cArr) {
    }

    @SuppressLint({"NewApi"})
    public dbpqdHhmDSIHIJiwc1ll1l1(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
    }
}
