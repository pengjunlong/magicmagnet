package okhttp3;

import java.time.Instant;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.j00;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.rq0;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class Headers implements Iterable<rq0<? extends String, ? extends String>>, j00 {
    public static final Companion Companion = null;
    private final String[] namesAndValues;

    @xc0
    public static final class Builder {
        private final List<String> namesAndValues;

        public final Builder add(String str) {
        }

        public final Builder addAll(Headers headers) {
        }

        public final Builder addLenient$okhttp(String str) {
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
        }

        public final Headers build() {
        }

        public final String get(String str) {
        }

        public final List<String> getNamesAndValues$okhttp() {
        }

        public final Builder removeAll(String str) {
        }

        public final Builder set(String str, Date date) {
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
        }

        public final Builder set(String str, String str2) {
        }

        public final Builder add(String str, String str2) {
        }

        public final Builder addLenient$okhttp(String str, String str2) {
        }

        public final Builder add(String str, Date date) {
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
        }
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static final /* synthetic */ void access$checkName(Companion companion, String str) {
        }

        public static final /* synthetic */ void access$checkValue(Companion companion, String str, String str2) {
        }

        public static final /* synthetic */ String access$get(Companion companion, String[] strArr, String str) {
        }

        private final void checkName(String str) {
        }

        private final void checkValue(String str, String str2) {
        }

        private final String get(String[] strArr, String str) {
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m936deprecated_of(String... strArr) {
        }

        public final Headers of(String... strArr) {
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m935deprecated_of(Map<String, String> map) {
        }

        public final Headers of(Map<String, String> map) {
        }
    }

    private Headers(String[] strArr) {
    }

    public /* synthetic */ Headers(String[] strArr, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    public static final Headers of(Map<String, String> map) {
    }

    public static final Headers of(String... strArr) {
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m934deprecated_size() {
    }

    public final long byteCount() {
    }

    public boolean equals(Object obj) {
    }

    public final String get(String str) {
    }

    public final Date getDate(String str) {
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
    }

    public int hashCode() {
    }

    @Override // java.lang.Iterable
    public Iterator<rq0<? extends String, ? extends String>> iterator() {
    }

    public final String name(int i) {
    }

    public final Set<String> names() {
    }

    public final Builder newBuilder() {
    }

    public final int size() {
    }

    public final Map<String, List<String>> toMultimap() {
    }

    public String toString() {
    }

    public final String value(int i) {
    }

    public final List<String> values(String str) {
    }
}
