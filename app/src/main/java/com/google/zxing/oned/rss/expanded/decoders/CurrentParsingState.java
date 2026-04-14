package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class CurrentParsingState {
    private State encoding;
    private int position;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    private static final class State {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State ALPHA = null;
        public static final State ISO_IEC_646 = null;
        public static final State NUMERIC = null;

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
        }

        public static State[] values() {
        }
    }

    CurrentParsingState() {
    }

    int getPosition() {
    }

    void incrementPosition(int i) {
    }

    boolean isAlpha() {
    }

    boolean isIsoIec646() {
    }

    boolean isNumeric() {
    }

    void setAlpha() {
    }

    void setIsoIec646() {
    }

    void setNumeric() {
    }

    void setPosition(int i) {
    }
}
