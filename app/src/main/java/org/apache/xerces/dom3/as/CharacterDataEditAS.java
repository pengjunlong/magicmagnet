package org.apache.xerces.dom3.as;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface CharacterDataEditAS extends NodeEditAS {
    boolean canAppendData(String str);

    boolean canDeleteData(int i, int i2);

    boolean canInsertData(int i, String str);

    boolean canReplaceData(int i, int i2, String str);

    boolean canSetData(int i, int i2);

    boolean getIsWhitespaceOnly();
}
