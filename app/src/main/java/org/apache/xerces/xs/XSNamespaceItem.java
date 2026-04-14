package org.apache.xerces.xs;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface XSNamespaceItem {
    XSObjectList getAnnotations();

    XSAttributeDeclaration getAttributeDeclaration(String str);

    XSAttributeGroupDefinition getAttributeGroup(String str);

    XSNamedMap getComponents(short s);

    StringList getDocumentLocations();

    XSElementDeclaration getElementDeclaration(String str);

    XSIDCDefinition getIDCDefinition(String str);

    XSModelGroupDefinition getModelGroupDefinition(String str);

    XSNotationDeclaration getNotationDeclaration(String str);

    String getSchemaNamespace();

    XSTypeDefinition getTypeDefinition(String str);
}
