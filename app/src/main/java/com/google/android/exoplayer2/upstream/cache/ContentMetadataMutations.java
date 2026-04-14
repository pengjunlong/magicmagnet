package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public class ContentMetadataMutations {
    private final Map<String, Object> editedValues;
    private final List<String> removedValues;

    @CanIgnoreReturnValue
    private ContentMetadataMutations checkAndSet(String str, Object obj) {
    }

    public static ContentMetadataMutations setContentLength(ContentMetadataMutations contentMetadataMutations, long j) {
    }

    public static ContentMetadataMutations setRedirectedUri(ContentMetadataMutations contentMetadataMutations, Uri uri) {
    }

    public Map<String, Object> getEditedValues() {
    }

    public List<String> getRemovedValues() {
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations remove(String str) {
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, String str2) {
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, long j) {
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, byte[] bArr) {
    }
}
