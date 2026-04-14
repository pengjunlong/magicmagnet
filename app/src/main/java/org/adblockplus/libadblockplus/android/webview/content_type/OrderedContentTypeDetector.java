package org.adblockplus.libadblockplus.android.webview.content_type;

import android.webkit.WebResourceRequest;
import org.adblockplus.libadblockplus.FilterEngine;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class OrderedContentTypeDetector implements ContentTypeDetector {
    private final ContentTypeDetector[] detectors;

    public OrderedContentTypeDetector(ContentTypeDetector... contentTypeDetectorArr) {
    }

    @Override // org.adblockplus.libadblockplus.android.webview.content_type.ContentTypeDetector
    public FilterEngine.ContentType detect(WebResourceRequest webResourceRequest) {
    }
}
