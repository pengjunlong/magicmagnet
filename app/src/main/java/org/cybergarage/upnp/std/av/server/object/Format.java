package org.cybergarage.upnp.std.av.server.object;

import java.io.File;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface Format {
    FormatObject createObject(File file);

    boolean equals(File file);

    String getMediaClass();

    String getMimeType();
}
