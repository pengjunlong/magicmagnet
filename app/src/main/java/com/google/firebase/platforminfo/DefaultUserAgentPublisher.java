package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import java.util.Set;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    DefaultUserAgentPublisher(Set<LibraryVersion> set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
    }

    public static Component<UserAgentPublisher> component() {
    }

    public static /* synthetic */ UserAgentPublisher dbpqdHhmDSIHIJiwc1ll1l1(ComponentContainer componentContainer) {
    }

    private static /* synthetic */ UserAgentPublisher lambda$component$0(ComponentContainer componentContainer) {
    }

    private static String toUserAgent(Set<LibraryVersion> set) {
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
    }
}
