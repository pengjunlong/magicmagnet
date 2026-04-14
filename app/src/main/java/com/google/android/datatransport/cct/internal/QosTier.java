package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class QosTier {
    private static final /* synthetic */ QosTier[] $VALUES = null;
    public static final QosTier DEFAULT = null;
    public static final QosTier FAST_IF_RADIO_AWAKE = null;
    public static final QosTier NEVER = null;
    public static final QosTier UNMETERED_ONLY = null;
    public static final QosTier UNMETERED_OR_DAILY = null;
    public static final QosTier UNRECOGNIZED = null;
    private static final SparseArray<QosTier> valueMap = null;
    private final int value;

    private QosTier(String str, int i, int i2) {
    }

    public static QosTier forNumber(int i) {
    }

    public static QosTier valueOf(String str) {
    }

    public static QosTier[] values() {
    }

    public final int getNumber() {
    }
}
