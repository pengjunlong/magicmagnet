package com.google.zxing.integration.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class IntentIntegrator {
    public static final Collection<String> ALL_CODE_TYPES = null;
    public static final String CODE_128 = "CODE_128";
    public static final String CODE_39 = "CODE_39";
    public static final String CODE_93 = "CODE_93";
    public static final String DATA_MATRIX = "DATA_MATRIX";
    public static final String EAN_13 = "EAN_13";
    public static final String EAN_8 = "EAN_8";
    public static final String ITF = "ITF";
    public static final Collection<String> ONE_D_CODE_TYPES = null;
    public static final String PDF_417 = "PDF_417";
    public static final Collection<String> PRODUCT_CODE_TYPES = null;
    public static final String QR_CODE = "QR_CODE";
    public static final int REQUEST_CODE = 49374;
    public static final String RSS_14 = "RSS_14";
    public static final String RSS_EXPANDED = "RSS_EXPANDED";
    private static final String TAG = "IntentIntegrator";
    public static final String UPC_A = "UPC_A";
    public static final String UPC_E = "UPC_E";
    private final Activity activity;
    private Class<?> captureActivity;
    private Collection<String> desiredBarcodeFormats;
    private Fragment fragment;
    private final Map<String, Object> moreExtras;
    private int requestCode;
    private androidx.fragment.app.Fragment supportFragment;

    public IntentIntegrator(Activity activity) {
    }

    private void attachMoreExtras(Intent intent) {
    }

    @TargetApi(11)
    public static IntentIntegrator forFragment(Fragment fragment) {
    }

    public static IntentIntegrator forSupportFragment(androidx.fragment.app.Fragment fragment) {
    }

    private static List<String> list(String... strArr) {
    }

    public static IntentResult parseActivityResult(int i, int i2, Intent intent) {
    }

    public final IntentIntegrator addExtra(String str, Object obj) {
    }

    public Intent createScanIntent() {
    }

    public Class<?> getCaptureActivity() {
    }

    protected Class<?> getDefaultCaptureActivity() {
    }

    public Map<String, ?> getMoreExtras() {
    }

    public final void initiateScan() {
    }

    public IntentIntegrator setBarcodeImageEnabled(boolean z) {
    }

    public IntentIntegrator setBeepEnabled(boolean z) {
    }

    public IntentIntegrator setCameraId(int i) {
    }

    public IntentIntegrator setCaptureActivity(Class<?> cls) {
    }

    public IntentIntegrator setDesiredBarcodeFormats(Collection<String> collection) {
    }

    public IntentIntegrator setOrientationLocked(boolean z) {
    }

    public final IntentIntegrator setPrompt(String str) {
    }

    public IntentIntegrator setRequestCode(int i) {
    }

    public IntentIntegrator setTimeout(long j) {
    }

    public IntentIntegrator setTorchEnabled(boolean z) {
    }

    protected void startActivity(Intent intent) {
    }

    protected void startActivityForResult(Intent intent, int i) {
    }

    public static IntentResult parseActivityResult(int i, Intent intent) {
    }

    public final void initiateScan(Collection<String> collection) {
    }

    public IntentIntegrator setDesiredBarcodeFormats(String... strArr) {
    }
}
