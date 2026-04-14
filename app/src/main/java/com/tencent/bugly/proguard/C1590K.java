package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.bugly.AbstractC1500a;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.K */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class C1590K extends SQLiteOpenHelper {

    /* renamed from: a */
    public static String f843a = "bugly_db";

    /* renamed from: b */
    public static int f844b = 15;

    /* renamed from: c */
    protected Context f845c;

    /* renamed from: d */
    private List<AbstractC1500a> f846d;

    public C1590K(Context context, List<AbstractC1500a> list) {
    }

    /* renamed from: a */
    protected synchronized boolean m556a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @TargetApi(11)
    public synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
