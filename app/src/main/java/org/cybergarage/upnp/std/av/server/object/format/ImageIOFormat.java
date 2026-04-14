package org.cybergarage.upnp.std.av.server.object.format;

import java.io.File;
import org.cybergarage.upnp.std.av.server.object.Format;
import org.cybergarage.upnp.std.av.server.object.FormatObject;
import org.cybergarage.xml.AttributeList;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public abstract class ImageIOFormat extends Header implements Format, FormatObject {
    private File imgFile;

    public ImageIOFormat() {
    }

    public abstract FormatObject createObject(File file);

    public abstract boolean equals(File file);

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public AttributeList getAttributeList() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getCreator() {
    }

    @Override // org.cybergarage.upnp.std.av.server.object.Format
    public String getMediaClass() {
    }

    public abstract String getMimeType();

    @Override // org.cybergarage.upnp.std.av.server.object.FormatObject
    public String getTitle() {
    }

    public void print() {
    }

    public ImageIOFormat(File file) {
    }
}
