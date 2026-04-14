package com.google.protobuf;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = null;

    /* renamed from: com.google.protobuf.MutabilityOracle$1 */
    static class C13221 implements MutabilityOracle {
        C13221() {
        }

        @Override // com.google.protobuf.MutabilityOracle
        public void ensureMutable() {
        }
    }

    void ensureMutable();
}
