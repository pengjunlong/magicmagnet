package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        String extract(T t);
    }

    private LibraryVersionComponent() {
    }

    public static Component<?> create(String str, String str2) {
    }

    public static /* synthetic */ LibraryVersion dbpqdHhmDSIHIJiwc1ll1l1(String str, VersionExtractor versionExtractor, ComponentContainer componentContainer) {
    }

    public static Component<?> fromContext(String str, VersionExtractor<Context> versionExtractor) {
    }

    private static /* synthetic */ LibraryVersion lambda$fromContext$0(String str, VersionExtractor versionExtractor, ComponentContainer componentContainer) {
    }
}
