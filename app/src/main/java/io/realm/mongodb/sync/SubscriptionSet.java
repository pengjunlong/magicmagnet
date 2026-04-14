package io.realm.mongodb.sync;

import io.realm.RealmQuery;
import io.realm.internal.Keep;
import java.util.concurrent.TimeUnit;
import p000.e41;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface SubscriptionSet extends Iterable<Subscription> {

    @Keep
    public interface StateChangeCallback {
        void onError(Throwable th);

        void onStateChange(SubscriptionSet subscriptionSet);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    public static final class dbpqdHhmDSIHIJiwc1ll1l1 {
        public static final dbpqdHhmDSIHIJiwc1ll1l1 bpdqqiQNVROMLC1ll1l1l11 = null;
        public static final dbpqdHhmDSIHIJiwc1ll1l1 dbppbdqpeLmcbs11l11 = null;
        public static final dbpqdHhmDSIHIJiwc1ll1l1 ddbbbeXHXx111ll = null;
        public static final dbpqdHhmDSIHIJiwc1ll1l1 dqpdbEevAufTOvPphbjykClll1l11 = null;
        public static final dbpqdHhmDSIHIJiwc1ll1l1 dqpqqqbqQyjyB11111l1 = null;
        private static final /* synthetic */ dbpqdHhmDSIHIJiwc1ll1l1[] pbppbpqbamJRy11l1l1 = null;
        public static final dbpqdHhmDSIHIJiwc1ll1l1 ppbdpwWWljzmXXdHNabfWhgjl111l11 = null;
        private final byte dpbdpqRKAscW1lll1l;

        private dbpqdHhmDSIHIJiwc1ll1l1(String str, int i, byte b) {
        }

        public static dbpqdHhmDSIHIJiwc1ll1l1 valueOf(String str) {
        }

        public static dbpqdHhmDSIHIJiwc1ll1l1[] values() {
        }
    }

    public interface dpbdbdpbLwkLpObyKsq1lll1 extends dqqppqiKzJi1l1lll1l {
    }

    public interface dqqppqiKzJi1l1lll1l {
    }

    Subscription find(RealmQuery realmQuery);

    Subscription find(String str);

    String getErrorMessage();

    dbpqdHhmDSIHIJiwc1ll1l1 getState();

    int size();

    SubscriptionSet update(dqqppqiKzJi1l1lll1l dqqppqikzji1l1lll1l);

    e41 updateAsync(dpbdbdpbLwkLpObyKsq1lll1 dpbdbdpblwklpobyksq1lll1);

    boolean waitForSynchronization();

    boolean waitForSynchronization(Long l, TimeUnit timeUnit);

    e41 waitForSynchronizationAsync(StateChangeCallback stateChangeCallback);

    e41 waitForSynchronizationAsync(Long l, TimeUnit timeUnit, StateChangeCallback stateChangeCallback);
}
