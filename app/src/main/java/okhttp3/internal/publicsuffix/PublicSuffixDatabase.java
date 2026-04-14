package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class PublicSuffixDatabase {
    public static final Companion Companion = null;
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE = null;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = null;
    private static final PublicSuffixDatabase instance = null;
    private final AtomicBoolean listRead;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch;

    @xc0
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }

        public static final /* synthetic */ String access$binarySearch(Companion companion, byte[] bArr, byte[][] bArr2, int i) {
        }

        private final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
        }

        public final PublicSuffixDatabase get() {
        }
    }

    public static final /* synthetic */ PublicSuffixDatabase access$getInstance$cp() {
    }

    private final List<String> findMatchingRule(List<String> list) {
    }

    private final void readTheList() throws IOException {
    }

    private final void readTheListUninterruptibly() {
    }

    private final List<String> splitDomain(String str) {
    }

    public final String getEffectiveTldPlusOne(String str) {
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
    }
}
