package org.adblockplus.libadblockplus.android.webview.content_type;

import android.webkit.WebResourceRequest;
import java.util.Map;
import org.adblockplus.libadblockplus.FilterEngine;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class UrlFileExtensionTypeDetector implements ContentTypeDetector {
    private static final String[] EXTENSIONS_CSS = null;
    private static final String[] EXTENSIONS_FONT = null;
    private static final String[] EXTENSIONS_HTML = null;
    private static final String[] EXTENSIONS_IMAGE = null;
    private static final String[] EXTENSIONS_JS = null;
    private static final String[] EXTENSIONS_MEDIA = null;
    private static final Map<String, FilterEngine.ContentType> extensionTypeMap = null;

    private static void mapExtensions(String[] strArr, FilterEngine.ContentType contentType) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.content_type.ContentTypeDetector
    public FilterEngine.ContentType detect(WebResourceRequest webResourceRequest) {
    }
}
