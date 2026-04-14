package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    /* renamed from: com.google.common.base.Splitter$1 */
    class C06251 implements Strategy {
        final /* synthetic */ CharMatcher val$separatorMatcher;

        /* renamed from: com.google.common.base.Splitter$1$1, reason: invalid class name */
        class AnonymousClass1 extends SplittingIterator {
            final /* synthetic */ C06251 this$0;

            AnonymousClass1(C06251 c06251, Splitter splitter, CharSequence charSequence) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            int separatorEnd(int i) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            int separatorStart(int i) {
            }
        }

        C06251(CharMatcher charMatcher) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
        }
    }

    /* renamed from: com.google.common.base.Splitter$2 */
    class C06262 implements Strategy {
        final /* synthetic */ String val$separator;

        /* renamed from: com.google.common.base.Splitter$2$1, reason: invalid class name */
        class AnonymousClass1 extends SplittingIterator {
            final /* synthetic */ C06262 this$0;

            AnonymousClass1(C06262 c06262, Splitter splitter, CharSequence charSequence) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i) {
            }
        }

        C06262(String str) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
        }
    }

    /* renamed from: com.google.common.base.Splitter$3 */
    class C06273 implements Strategy {
        final /* synthetic */ CommonPattern val$separatorPattern;

        /* renamed from: com.google.common.base.Splitter$3$1, reason: invalid class name */
        class AnonymousClass1 extends SplittingIterator {
            final /* synthetic */ CommonMatcher val$matcher;

            AnonymousClass1(C06273 c06273, Splitter splitter, CharSequence charSequence, CommonMatcher commonMatcher) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i) {
            }
        }

        C06273(CommonPattern commonPattern) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
        }
    }

    /* renamed from: com.google.common.base.Splitter$4 */
    class C06284 implements Strategy {
        final /* synthetic */ int val$length;

        /* renamed from: com.google.common.base.Splitter$4$1, reason: invalid class name */
        class AnonymousClass1 extends SplittingIterator {
            final /* synthetic */ C06284 this$0;

            AnonymousClass1(C06284 c06284, Splitter splitter, CharSequence charSequence) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i) {
            }
        }

        C06284(int i) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
        }
    }

    /* renamed from: com.google.common.base.Splitter$5 */
    class C06295 implements Iterable<String> {
        final /* synthetic */ Splitter this$0;
        final /* synthetic */ CharSequence val$sequence;

        C06295(Splitter splitter, CharSequence charSequence) {
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
        }

        public String toString() {
        }
    }

    @Beta
    public static final class MapSplitter {
        private static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final Splitter entrySplitter;
        private final Splitter outerSplitter;

        /* synthetic */ MapSplitter(Splitter splitter, Splitter splitter2, C06251 c06251) {
        }

        public Map<String, String> split(CharSequence charSequence) {
        }

        private MapSplitter(Splitter splitter, Splitter splitter2) {
        }
    }

    private static abstract class SplittingIterator extends AbstractIterator<String> {
        int limit;
        int offset;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
        }

        @Override // com.google.common.base.AbstractIterator
        protected /* bridge */ /* synthetic */ String computeNext() {
        }

        abstract int separatorEnd(int i);

        abstract int separatorStart(int i);

        @Override // com.google.common.base.AbstractIterator
        /* renamed from: computeNext, reason: avoid collision after fix types in other method */
        protected String computeNext2() {
        }
    }

    private interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
    }

    static /* synthetic */ Iterator access$000(Splitter splitter, CharSequence charSequence) {
    }

    static /* synthetic */ CharMatcher access$200(Splitter splitter) {
    }

    static /* synthetic */ boolean access$300(Splitter splitter) {
    }

    static /* synthetic */ int access$400(Splitter splitter) {
    }

    public static Splitter fixedLength(int i) {
    }

    public static Splitter on(char c) {
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
    }

    public Splitter limit(int i) {
    }

    public Splitter omitEmptyStrings() {
    }

    public Iterable<String> split(CharSequence charSequence) {
    }

    public List<String> splitToList(CharSequence charSequence) {
    }

    public Splitter trimResults() {
    }

    @Beta
    public MapSplitter withKeyValueSeparator(String str) {
    }

    private Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i) {
    }

    public static Splitter on(CharMatcher charMatcher) {
    }

    public Splitter trimResults(CharMatcher charMatcher) {
    }

    @Beta
    public MapSplitter withKeyValueSeparator(char c) {
    }

    @Beta
    public MapSplitter withKeyValueSeparator(Splitter splitter) {
    }

    public static Splitter on(String str) {
    }

    @GwtIncompatible
    public static Splitter on(Pattern pattern) {
    }

    private static Splitter on(CommonPattern commonPattern) {
    }
}
