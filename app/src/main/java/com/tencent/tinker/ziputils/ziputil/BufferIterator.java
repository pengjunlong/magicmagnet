package com.tencent.tinker.ziputils.ziputil;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class BufferIterator {
    public abstract int readInt();

    public abstract short readShort();

    public abstract void seek(int i);

    public abstract void skip(int i);
}
