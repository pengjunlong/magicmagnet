package com.magicmagnet.data.bean;

import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface IAutoCheckData extends IData {
    void available();

    void finisLoading();

    AutoCheckState getState_();

    void loading();

    void unavailable();
}
