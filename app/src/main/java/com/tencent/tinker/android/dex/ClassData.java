package com.tencent.tinker.android.dex;

import com.tencent.tinker.android.dex.TableOfContents;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public final class ClassData extends TableOfContents.Section.Item<ClassData> {
    public Method[] directMethods;
    public Field[] instanceFields;
    public Field[] staticFields;
    public Method[] virtualMethods;

    public static class Field implements Comparable<Field> {
        public int accessFlags;
        public int fieldIndex;

        public Field(int i, int i2) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Field field) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Field field) {
        }
    }

    public static class Method implements Comparable<Method> {
        public int accessFlags;
        public int codeOffset;
        public int methodIndex;

        public Method(int i, int i2, int i3) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Method method) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Method method) {
        }
    }

    public ClassData(int i, Field[] fieldArr, Field[] fieldArr2, Method[] methodArr, Method[] methodArr2) {
    }

    private int calcFieldsSize(Field[] fieldArr) {
    }

    private int calcMethodsSize(Method[] methodArr) {
    }

    @Override // com.tencent.tinker.android.dex.TableOfContents.Section.Item
    public int byteCountInDex() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
    }

    @Override // com.tencent.tinker.android.dex.TableOfContents.Section.Item
    public boolean equals(Object obj) {
    }

    @Override // com.tencent.tinker.android.dex.TableOfContents.Section.Item
    public int hashCode() {
    }

    public int compareTo(ClassData classData) {
    }
}
