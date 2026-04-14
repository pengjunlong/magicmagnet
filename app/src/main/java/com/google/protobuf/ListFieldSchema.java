package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE = null;
    private static final ListFieldSchema LITE_INSTANCE = null;

    private static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = null;

        private ListFieldSchemaFull() {
        }

        static <E> List<E> getList(Object obj, long j) {
        }

        @Override // com.google.protobuf.ListFieldSchema
        void makeImmutableListAt(Object obj, long j) {
        }

        @Override // com.google.protobuf.ListFieldSchema
        <E> void mergeListsAt(Object obj, Object obj2, long j) {
        }

        @Override // com.google.protobuf.ListFieldSchema
        <L> List<L> mutableListAt(Object obj, long j) {
        }

        /* synthetic */ ListFieldSchemaFull(C13151 c13151) {
        }

        private static <L> List<L> mutableListAt(Object obj, long j, int i) {
        }
    }

    private static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
        }

        static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j) {
        }

        @Override // com.google.protobuf.ListFieldSchema
        void makeImmutableListAt(Object obj, long j) {
        }

        @Override // com.google.protobuf.ListFieldSchema
        <E> void mergeListsAt(Object obj, Object obj2, long j) {
        }

        @Override // com.google.protobuf.ListFieldSchema
        <L> List<L> mutableListAt(Object obj, long j) {
        }

        /* synthetic */ ListFieldSchemaLite(C13151 c13151) {
        }
    }

    /* synthetic */ ListFieldSchema(C13151 c13151) {
    }

    static ListFieldSchema full() {
    }

    static ListFieldSchema lite() {
    }

    abstract void makeImmutableListAt(Object obj, long j);

    abstract <L> void mergeListsAt(Object obj, Object obj2, long j);

    abstract <L> List<L> mutableListAt(Object obj, long j);

    private ListFieldSchema() {
    }
}
