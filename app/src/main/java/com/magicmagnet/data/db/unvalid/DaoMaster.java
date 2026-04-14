package com.magicmagnet.data.db.unvalid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import org.greenrobot.greendao.database.dbpqdHhmDSIHIJiwc1ll1l1;
import org.greenrobot.greendao.dpbdbdpbLwkLpObyKsq1lll1;
import org.greenrobot.greendao.dqqppqiKzJi1l1lll1l;
import p000.bqbdpdpdKfXQmeJwqllll11l11;
import p000.qu;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class DaoMaster extends dpbdbdpbLwkLpObyKsq1lll1 {
    public static final int SCHEMA_VERSION = 1;

    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String str) {
        }

        @Override // org.greenrobot.greendao.database.dbpqdHhmDSIHIJiwc1ll1l1
        public void onUpgrade(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11, int i, int i2) {
        }

        public DevOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
        }
    }

    public static abstract class OpenHelper extends dbpqdHhmDSIHIJiwc1ll1l1 {
        public OpenHelper(Context context, String str) {
        }

        @Override // org.greenrobot.greendao.database.dbpqdHhmDSIHIJiwc1ll1l1
        public void onCreate(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11) {
        }

        public OpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
        }
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
    }

    public static void createAllTables(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11, boolean z) {
    }

    public static void dropAllTables(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11, boolean z) {
    }

    public static DaoSession newDevSession(Context context, String str) {
    }

    @Override // org.greenrobot.greendao.dpbdbdpbLwkLpObyKsq1lll1
    public /* bridge */ /* synthetic */ dqqppqiKzJi1l1lll1l newSession() {
    }

    public DaoMaster(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11) {
    }

    @Override // org.greenrobot.greendao.dpbdbdpbLwkLpObyKsq1lll1
    public /* bridge */ /* synthetic */ dqqppqiKzJi1l1lll1l newSession(qu quVar) {
    }

    @Override // org.greenrobot.greendao.dpbdbdpbLwkLpObyKsq1lll1
    public DaoSession newSession() {
    }

    @Override // org.greenrobot.greendao.dpbdbdpbLwkLpObyKsq1lll1
    public DaoSession newSession(qu quVar) {
    }
}
