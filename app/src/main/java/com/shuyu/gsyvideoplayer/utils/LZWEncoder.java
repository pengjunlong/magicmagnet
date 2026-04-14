package com.shuyu.gsyvideoplayer.utils;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class LZWEncoder {
    static final int BITS = 12;
    private static final int EOF = -1;
    static final int HSIZE = 5003;
    int ClearCode;
    int EOFCode;
    int a_count;
    byte[] accum;
    boolean clear_flg;
    int[] codetab;
    private int curPixel;
    int cur_accum;
    int cur_bits;
    int free_ent;
    int g_init_bits;
    int hsize;
    int[] htab;
    private int imgH;
    private int imgW;
    private int initCodeSize;
    int[] masks;
    int maxbits;
    int maxcode;
    int maxmaxcode;
    int n_bits;
    private byte[] pixAry;
    private int remaining;

    LZWEncoder(int i, int i2, byte[] bArr, int i3) {
    }

    private int nextPixel() {
    }

    final int MAXCODE(int i) {
    }

    void char_out(byte b, OutputStream outputStream) throws IOException {
    }

    void cl_block(OutputStream outputStream) throws IOException {
    }

    void cl_hash(int i) {
    }

    void compress(int i, OutputStream outputStream) throws IOException {
    }

    void encode(OutputStream outputStream) throws IOException {
    }

    void flush_char(OutputStream outputStream) throws IOException {
    }

    void output(int i, OutputStream outputStream) throws IOException {
    }
}
