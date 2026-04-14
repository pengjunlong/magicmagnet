package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class LazyField extends LazyFieldLite {
    private final MessageLite defaultInstance;

    static class LazyEntry<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, LazyField> entry;

        /* synthetic */ LazyEntry(Map.Entry entry, C13141 c13141) {
        }

        public LazyField getField() {
        }

        @Override // java.util.Map.Entry
        public K getKey() {
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
        }

        private LazyEntry(Map.Entry<K, LazyField> entry) {
        }
    }

    static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> iterator;

        public LazyIterator(Iterator<Map.Entry<K, Object>> it) {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        public Map.Entry<K, Object> next() {
        }
    }

    public LazyField(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
    }

    public MessageLite getValue() {
    }

    @Override // com.google.protobuf.LazyFieldLite
    public int hashCode() {
    }

    public String toString() {
    }
}
