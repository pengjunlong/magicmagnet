package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public abstract class zzjd implements Iterable<Byte>, Serializable {
    public static final zzjd zzb = null;
    private static final Comparator<zzjd> zzc = null;
    private static final zzjc zzd = null;
    private int zza;

    zzjd() {
    }

    public static zzjd zzj(byte[] bArr, int i, int i2) {
    }

    public static zzjd zzk(String str) {
    }

    static int zzn(int i, int i2, int i3) {
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
    }

    public final String toString() {
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzjd zze(int i, int i2);

    abstract void zzf(zziu zziuVar) throws IOException;

    protected abstract String zzg(Charset charset);

    public abstract boolean zzh();

    protected abstract int zzi(int i, int i2, int i3);

    public final String zzl(Charset charset) {
    }

    protected final int zzm() {
    }
}
