package com.google.android.datatransport;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class Event<T> {
    public static <T> Event<T> ofData(int i, T t) {
    }

    public static <T> Event<T> ofTelemetry(int i, T t) {
    }

    public static <T> Event<T> ofUrgent(int i, T t) {
    }

    public abstract Integer getCode();

    public abstract T getPayload();

    public abstract Priority getPriority();

    public static <T> Event<T> ofData(T t) {
    }

    public static <T> Event<T> ofTelemetry(T t) {
    }

    public static <T> Event<T> ofUrgent(T t) {
    }
}
