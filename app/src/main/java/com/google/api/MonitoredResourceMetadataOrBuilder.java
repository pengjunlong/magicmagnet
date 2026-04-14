package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Struct;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface MonitoredResourceMetadataOrBuilder extends MessageLiteOrBuilder {
    boolean containsUserLabels(String str);

    Struct getSystemLabels();

    @Deprecated
    Map<String, String> getUserLabels();

    int getUserLabelsCount();

    Map<String, String> getUserLabelsMap();

    String getUserLabelsOrDefault(String str, String str2);

    String getUserLabelsOrThrow(String str);

    boolean hasSystemLabels();
}
