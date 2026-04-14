package com.google.protobuf;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
