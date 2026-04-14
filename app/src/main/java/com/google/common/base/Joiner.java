package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class Joiner {
    private final String separator;

    /* renamed from: com.google.common.base.Joiner$1 */
    class C06141 extends Joiner {
        final /* synthetic */ Joiner this$0;
        final /* synthetic */ String val$nullText;

        C06141(Joiner joiner, Joiner joiner2, String str) {
        }

        @Override // com.google.common.base.Joiner
        public Joiner skipNulls() {
        }

        @Override // com.google.common.base.Joiner
        CharSequence toString(Object obj) {
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
        }
    }

    /* renamed from: com.google.common.base.Joiner$2 */
    class C06152 extends Joiner {
        final /* synthetic */ Joiner this$0;

        C06152(Joiner joiner, Joiner joiner2) {
        }

        @Override // com.google.common.base.Joiner
        public <A extends Appendable> A appendTo(A a, Iterator<? extends Object> it) throws IOException {
        }

        @Override // com.google.common.base.Joiner
        public Joiner useForNull(String str) {
        }

        @Override // com.google.common.base.Joiner
        public MapJoiner withKeyValueSeparator(String str) {
        }
    }

    /* renamed from: com.google.common.base.Joiner$3 */
    class C06163 extends AbstractList<Object> {
        final /* synthetic */ Object val$first;
        final /* synthetic */ Object[] val$rest;
        final /* synthetic */ Object val$second;

        C06163(Object[] objArr, Object obj, Object obj2) {
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
        }
    }

    public static final class MapJoiner {
        private final Joiner joiner;
        private final String keyValueSeparator;

        /* synthetic */ MapJoiner(Joiner joiner, String str, C06141 c06141) {
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a, Map<?, ?> map) throws IOException {
        }

        public String join(Map<?, ?> map) {
        }

        public MapJoiner useForNull(String str) {
        }

        private MapJoiner(Joiner joiner, String str) {
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
        }

        @Beta
        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
        }

        @Beta
        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
        }
    }

    /* synthetic */ Joiner(Joiner joiner, C06141 c06141) {
    }

    static /* synthetic */ String access$100(Joiner joiner) {
    }

    private static Iterable<Object> iterable(Object obj, Object obj2, Object[] objArr) {
    }

    public static Joiner on(String str) {
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a, Iterable<? extends Object> iterable) throws IOException {
    }

    public final String join(Iterable<? extends Object> iterable) {
    }

    public Joiner skipNulls() {
    }

    CharSequence toString(Object obj) {
    }

    public Joiner useForNull(String str) {
    }

    public MapJoiner withKeyValueSeparator(char c) {
    }

    private Joiner(String str) {
    }

    public static Joiner on(char c) {
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a, Iterator<? extends Object> it) throws IOException {
    }

    public final String join(Iterator<? extends Object> it) {
    }

    public MapJoiner withKeyValueSeparator(String str) {
    }

    public final String join(Object[] objArr) {
    }

    private Joiner(Joiner joiner) {
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a, Object[] objArr) throws IOException {
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a, Object obj, Object obj2, Object... objArr) throws IOException {
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterable<? extends Object> iterable) {
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Iterator<? extends Object> it) {
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb, Object obj, Object obj2, Object... objArr) {
    }
}
