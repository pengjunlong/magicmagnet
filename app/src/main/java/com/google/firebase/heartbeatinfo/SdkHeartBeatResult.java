package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    public static SdkHeartBeatResult create(String str, long j) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
    }

    public abstract long getMillis();

    public abstract String getSdkName();

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(SdkHeartBeatResult sdkHeartBeatResult) {
    }
}
