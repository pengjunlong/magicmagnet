package org.adblockplus.libadblockplus.sitekey;

import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface PublicKeyHolder {
    void clear();

    boolean contains(String str);

    String get(String str);

    String getAny(List<String> list, String str);

    void put(String str, String str2);
}
