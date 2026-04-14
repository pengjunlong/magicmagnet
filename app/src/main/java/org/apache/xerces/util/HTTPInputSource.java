package org.apache.xerces.util;

import java.io.InputStream;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.parser.XMLInputSource;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class HTTPInputSource extends XMLInputSource {
    protected boolean fFollowRedirects;
    protected Map fHTTPRequestProperties;

    public HTTPInputSource(String str, String str2, String str3) {
    }

    public boolean getFollowHTTPRedirects() {
    }

    public Iterator getHTTPRequestProperties() {
    }

    public String getHTTPRequestProperty(String str) {
    }

    public void setFollowHTTPRedirects(boolean z) {
    }

    public void setHTTPRequestProperty(String str, String str2) {
    }

    public HTTPInputSource(XMLResourceIdentifier xMLResourceIdentifier) {
    }

    public HTTPInputSource(String str, String str2, String str3, InputStream inputStream, String str4) {
    }

    public HTTPInputSource(String str, String str2, String str3, Reader reader, String str4) {
    }
}
