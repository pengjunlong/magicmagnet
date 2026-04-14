package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class FileDeleteStrategy {
    public static final FileDeleteStrategy FORCE = null;
    public static final FileDeleteStrategy NORMAL = null;
    private final String name;

    static class ForceFileDeleteStrategy extends FileDeleteStrategy {
        ForceFileDeleteStrategy() {
        }

        @Override // org.apache.commons.io.FileDeleteStrategy
        protected boolean doDelete(File file) throws IOException {
        }
    }

    protected FileDeleteStrategy(String str) {
    }

    public void delete(File file) throws IOException {
    }

    public boolean deleteQuietly(File file) {
    }

    protected boolean doDelete(File file) throws IOException {
    }

    public String toString() {
    }
}
