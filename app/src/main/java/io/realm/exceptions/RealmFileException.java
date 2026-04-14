package io.realm.exceptions;

import io.realm.internal.Keep;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class RealmFileException extends RuntimeException {
    private final Kind kind;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @Keep
    public static final class Kind {
        private static final /* synthetic */ Kind[] $VALUES = null;
        public static final Kind ACCESS_ERROR = null;
        public static final Kind BAD_HISTORY = null;
        public static final Kind EXISTS = null;
        public static final Kind FORMAT_UPGRADE_REQUIRED = null;
        public static final Kind INCOMPATIBLE_LOCK_FILE = null;
        public static final Kind INCOMPATIBLE_SYNC_FILE = null;
        public static final Kind NOT_FOUND = null;
        public static final Kind PERMISSION_DENIED = null;

        private Kind(String str, int i) {
        }

        static Kind getKind(byte b) {
        }

        public static Kind valueOf(String str) {
        }

        public static Kind[] values() {
        }
    }

    public RealmFileException(byte b, String str) {
    }

    public Kind getKind() {
    }

    @Override // java.lang.Throwable
    public String toString() {
    }

    public RealmFileException(Kind kind, String str) {
    }

    public RealmFileException(Kind kind, Throwable th) {
    }

    public RealmFileException(Kind kind, String str, Throwable th) {
    }
}
