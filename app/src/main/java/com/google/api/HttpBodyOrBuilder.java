package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface HttpBodyOrBuilder extends MessageLiteOrBuilder {
    String getContentType();

    ByteString getContentTypeBytes();

    ByteString getData();

    Any getExtensions(int i);

    int getExtensionsCount();

    List<Any> getExtensionsList();
}
