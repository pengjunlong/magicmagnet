package io.realm.internal;

import io.realm.internal.bpdqqiQNVROMLC1ll1l1l11;
import java.io.Closeable;
import java.util.List;
import p000.f41;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class RealmNotifier implements Closeable {
    private List<Runnable> finishedSendingNotificationsCallbacks;
    private final bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1<dpbdbdpbLwkLpObyKsq1lll1> onChangeCallBack;
    private bpdqqiQNVROMLC1ll1l1l11<dpbdbdpbLwkLpObyKsq1lll1> realmObserverPairs;
    private OsSharedRealm sharedRealm;
    private List<Runnable> startSendingNotificationsCallbacks;
    private List<Runnable> transactionCallbacks;

    class dbpqdHhmDSIHIJiwc1ll1l1 implements bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1<dpbdbdpbLwkLpObyKsq1lll1> {
        final /* synthetic */ RealmNotifier dbpqdHhmDSIHIJiwc1ll1l1;

        dbpqdHhmDSIHIJiwc1ll1l1(RealmNotifier realmNotifier) {
        }

        @Override // io.realm.internal.bpdqqiQNVROMLC1ll1l1l11.dbpqdHhmDSIHIJiwc1ll1l1
        public /* bridge */ /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, Object obj) {
        }

        public void dpbdbdpbLwkLpObyKsq1lll1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, Object obj) {
        }
    }

    private static class dpbdbdpbLwkLpObyKsq1lll1<T> extends bpdqqiQNVROMLC1ll1l1l11.dpbdbdpbLwkLpObyKsq1lll1<T, f41<T>> {
        dpbdbdpbLwkLpObyKsq1lll1(T t, f41<T> f41Var) {
        }

        static /* synthetic */ void dbpqdHhmDSIHIJiwc1ll1l1(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1, Object obj) {
        }

        private void dpbdbdpbLwkLpObyKsq1lll1(T t) {
        }
    }

    protected RealmNotifier(OsSharedRealm osSharedRealm) {
    }

    static /* synthetic */ OsSharedRealm access$000(RealmNotifier realmNotifier) {
    }

    private void removeAllChangeListeners() {
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
    }

    public <T> void addChangeListener(T t, f41<T> f41Var) {
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
    }

    public void addTransactionCallback(Runnable runnable) {
    }

    void beforeNotify() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    void didChange() {
    }

    void didSendNotifications() {
    }

    public int getListenersListSize() {
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e, f41<E> f41Var) {
    }

    public <E> void removeChangeListeners(E e) {
    }

    void willSendNotifications() {
    }
}
