package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import p000.aj1;
import p000.cl1;
import p000.xc0;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public interface FileSystem {
    public static final Companion Companion = null;
    public static final FileSystem SYSTEM = null;

    @xc0
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        @Metadata
        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public aj1 appendingSink(File file) throws FileNotFoundException {
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
            }

            @Override // okhttp3.internal.io.FileSystem
            public aj1 sink(File file) throws FileNotFoundException {
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
            }

            @Override // okhttp3.internal.io.FileSystem
            public cl1 source(File file) throws FileNotFoundException {
            }

            public String toString() {
            }
        }

        private Companion() {
        }
    }

    aj1 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    aj1 sink(File file) throws FileNotFoundException;

    long size(File file);

    cl1 source(File file) throws FileNotFoundException;
}
