package com.magicmagnet.common.view;

import com.magicmagnet.common.NoProguard;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface IScrollable extends NoProguard {

    @Metadata
    public interface IScrollListener extends NoProguard {
        void scrollDown();

        void scrollUp();
    }

    void setListener(IScrollListener iScrollListener);

    void unsetListener();
}
