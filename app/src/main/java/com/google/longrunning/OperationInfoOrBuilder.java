package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface OperationInfoOrBuilder extends MessageLiteOrBuilder {
    String getMetadataType();

    ByteString getMetadataTypeBytes();

    String getResponseType();

    ByteString getResponseTypeBytes();
}
