package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
final class GeneralAppIdDecoder {
    private final StringBuilder buffer;
    private final CurrentParsingState current;
    private final BitArray information;

    GeneralAppIdDecoder(BitArray bitArray) {
    }

    private DecodedChar decodeAlphanumeric(int i) {
    }

    private DecodedChar decodeIsoIec646(int i) throws FormatException {
    }

    private DecodedNumeric decodeNumeric(int i) throws FormatException {
    }

    private boolean isAlphaOr646ToNumericLatch(int i) {
    }

    private boolean isAlphaTo646ToAlphaLatch(int i) {
    }

    private boolean isNumericToAlphaNumericLatch(int i) {
    }

    private boolean isStillAlpha(int i) {
    }

    private boolean isStillIsoIec646(int i) {
    }

    private boolean isStillNumeric(int i) {
    }

    private BlockParsedResult parseAlphaBlock() {
    }

    private DecodedInformation parseBlocks() throws FormatException {
    }

    private BlockParsedResult parseIsoIec646Block() throws FormatException {
    }

    private BlockParsedResult parseNumericBlock() throws FormatException {
    }

    String decodeAllCodes(StringBuilder sb, int i) throws NotFoundException, FormatException {
    }

    DecodedInformation decodeGeneralPurposeField(int i, String str) throws FormatException {
    }

    int extractNumericValueFromBitArray(int i, int i2) {
    }

    static int extractNumericValueFromBitArray(BitArray bitArray, int i, int i2) {
    }
}
