package org.greenrobot.greendao;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p000.bqbdpdpdKfXQmeJwqllll11l11;
import p000.ey0;
import p000.h91;
import p000.pdddbdppbXDXrwiTFfril111ll1;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class dqqppqiKzJi1l1lll1l {
    private final bqbdpdpdKfXQmeJwqllll11l11 db;
    private final Map<Class<?>, dbpqdHhmDSIHIJiwc1ll1l1<?, ?>> entityToDao;
    private volatile h91 rxTxIo;
    private volatile h91 rxTxPlain;

    public dqqppqiKzJi1l1lll1l(bqbdpdpdKfXQmeJwqllll11l11 bqbdpdpdkfxqmejwqllll11l11) {
    }

    public <V> V callInTx(Callable<V> callable) throws Exception {
    }

    public <V> V callInTxNoException(Callable<V> callable) {
    }

    public <T> void delete(T t) {
    }

    public <T> void deleteAll(Class<T> cls) {
    }

    public Collection<dbpqdHhmDSIHIJiwc1ll1l1<?, ?>> getAllDaos() {
    }

    public dbpqdHhmDSIHIJiwc1ll1l1<?, ?> getDao(Class<? extends Object> cls) {
    }

    public bqbdpdpdKfXQmeJwqllll11l11 getDatabase() {
    }

    public <T> long insert(T t) {
    }

    public <T> long insertOrReplace(T t) {
    }

    public <T, K> T load(Class<T> cls, K k) {
    }

    public <T, K> List<T> loadAll(Class<T> cls) {
    }

    public <T> ey0<T> queryBuilder(Class<T> cls) {
    }

    public <T, K> List<T> queryRaw(Class<T> cls, String str, String... strArr) {
    }

    public <T> void refresh(T t) {
    }

    protected <T> void registerDao(Class<T> cls, dbpqdHhmDSIHIJiwc1ll1l1<T, ?> dbpqdhhmdsihijiwc1ll1l1) {
    }

    public void runInTx(Runnable runnable) {
    }

    public h91 rxTx() {
    }

    public h91 rxTxPlain() {
    }

    public pdddbdppbXDXrwiTFfril111ll1 startAsyncSession() {
    }

    public <T> void update(T t) {
    }
}
