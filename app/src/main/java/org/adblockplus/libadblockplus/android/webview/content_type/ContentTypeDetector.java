package org.adblockplus.libadblockplus.android.webview.content_type;

import android.webkit.WebResourceRequest;
import org.adblockplus.libadblockplus.FilterEngine;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface ContentTypeDetector {
    FilterEngine.ContentType detect(WebResourceRequest webResourceRequest);
}
