package org.greenrobot.greendao;

import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.List;
import p000.bqbdpdpdKfXQmeJwqllll11l11;
import p000.cy0;
import p000.ey0;
import p000.fq1;
import p000.jx0;
import p000.nu;
import p000.ou;
import p000.pdqdbpqWhXJqBwhkJANuamnxll111ll;
import p000.pppbpqDDyVatfzXI11lll;
import p000.q81;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class dbpqdHhmDSIHIJiwc1ll1l1<T, K> {
    protected final pdqdbpqWhXJqBwhkJANuamnxll111ll config;
    protected final bqbdpdpdKfXQmeJwqllll11l11 db;
    protected final nu<K, T> identityScope;
    protected final ou<T> identityScopeLong;
    protected final boolean isStandardSQLite;
    protected final int pkOrdinal;
    private volatile q81<T, K> rxDao;
    private volatile q81<T, K> rxDaoPlain;
    protected final dqqppqiKzJi1l1lll1l session;
    protected final fq1 statements;

    public dbpqdHhmDSIHIJiwc1ll1l1(pdqdbpqWhXJqBwhkJANuamnxll111ll pdqdbpqwhxjqbwhkjanuamnxll111ll) {
    }

    private void deleteByKeyInsideSynchronized(K k, pppbpqDDyVatfzXI11lll pppbpqddyvatfzxi11lll) {
    }

    private void deleteInTxInternal(Iterable<T> iterable, Iterable<K> iterable2) {
    }

    private long executeInsert(T t, pppbpqDDyVatfzXI11lll pppbpqddyvatfzxi11lll, boolean z) {
    }

    private void executeInsertInTx(pppbpqDDyVatfzXI11lll pppbpqddyvatfzxi11lll, Iterable<T> iterable, boolean z) {
    }

    private long insertInsideTx(T t, pppbpqDDyVatfzXI11lll pppbpqddyvatfzxi11lll) {
    }

    private void loadAllUnlockOnWindowBounds(Cursor cursor, CursorWindow cursorWindow, List<T> list) {
    }

    private CursorWindow moveToNextUnlocked(Cursor cursor) {
    }

    protected void assertSinglePk() {
    }

    protected void attachEntity(T t) {
    }

    protected final void attachEntity(K k, T t, boolean z) {
    }

    protected abstract void bindValues(SQLiteStatement sQLiteStatement, T t);

    protected abstract void bindValues(pppbpqDDyVatfzXI11lll pppbpqddyvatfzxi11lll, T t);

    public long count() {
    }

    public void delete(T t) {
    }

    public void deleteAll() {
    }

    public void deleteByKey(K k) {
    }

    public void deleteByKeyInTx(Iterable<K> iterable) {
    }

    public void deleteInTx(Iterable<T> iterable) {
    }

    public boolean detach(T t) {
    }

    public void detachAll() {
    }

    public String[] getAllColumns() {
    }

    public bqbdpdpdKfXQmeJwqllll11l11 getDatabase() {
    }

    protected abstract K getKey(T t);

    protected K getKeyVerified(T t) {
    }

    public String[] getNonPkColumns() {
    }

    public String[] getPkColumns() {
    }

    public jx0 getPkProperty() {
    }

    public jx0[] getProperties() {
    }

    public dqqppqiKzJi1l1lll1l getSession() {
    }

    fq1 getStatements() {
    }

    public String getTablename() {
    }

    protected abstract boolean hasKey(T t);

    public long insert(T t) {
    }

    public void insertInTx(Iterable<T> iterable) {
    }

    public long insertOrReplace(T t) {
    }

    public void insertOrReplaceInTx(Iterable<T> iterable, boolean z) {
    }

    public long insertWithoutSettingPk(T t) {
    }

    protected abstract boolean isEntityUpdateable();

    public T load(K k) {
    }

    public List<T> loadAll() {
    }

    protected List<T> loadAllAndCloseCursor(Cursor cursor) {
    }

    protected List<T> loadAllFromCursor(Cursor cursor) {
    }

    public T loadByRowId(long j) {
    }

    protected final T loadCurrent(Cursor cursor, int i, boolean z) {
    }

    protected final <O> O loadCurrentOther(dbpqdHhmDSIHIJiwc1ll1l1<O, ?> dbpqdhhmdsihijiwc1ll1l1, Cursor cursor, int i) {
    }

    protected T loadUnique(Cursor cursor) {
    }

    protected T loadUniqueAndCloseCursor(Cursor cursor) {
    }

    public ey0<T> queryBuilder() {
    }

    public List<T> queryRaw(String str, String... strArr) {
    }

    public cy0<T> queryRawCreate(String str, Object... objArr) {
    }

    public cy0<T> queryRawCreateListArgs(String str, Collection<Object> collection) {
    }

    protected abstract T readEntity(Cursor cursor, int i);

    protected abstract void readEntity(Cursor cursor, T t, int i);

    protected abstract K readKey(Cursor cursor, int i);

    public void refresh(T t) {
    }

    public q81<T, K> rx() {
    }

    public q81<T, K> rxPlain() {
    }

    public void save(T t) {
    }

    public void saveInTx(T... tArr) {
    }

    public void update(T t) {
    }

    public void updateInTx(Iterable<T> iterable) {
    }

    protected void updateInsideSynchronized(T t, pppbpqDDyVatfzXI11lll pppbpqddyvatfzxi11lll, boolean z) {
    }

    protected abstract K updateKeyAfterInsert(T t, long j);

    protected void updateKeyAfterInsertAndAttach(T t, long j, boolean z) {
    }

    public dbpqdHhmDSIHIJiwc1ll1l1(pdqdbpqWhXJqBwhkJANuamnxll111ll pdqdbpqwhxjqbwhkjanuamnxll111ll, dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l) {
    }

    public void deleteByKeyInTx(K... kArr) {
    }

    public void deleteInTx(T... tArr) {
    }

    public void insertInTx(T... tArr) {
    }

    public void saveInTx(Iterable<T> iterable) {
    }

    public void insertInTx(Iterable<T> iterable, boolean z) {
    }

    public void insertOrReplaceInTx(Iterable<T> iterable) {
    }

    public void insertOrReplaceInTx(T... tArr) {
    }

    protected void updateInsideSynchronized(T t, SQLiteStatement sQLiteStatement, boolean z) {
    }

    public void updateInTx(T... tArr) {
    }
}
