package com.google.geo.type;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.type.LatLng;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface ViewportOrBuilder extends MessageLiteOrBuilder {
    LatLng getHigh();

    LatLng getLow();

    boolean hasHigh();

    boolean hasLow();
}
