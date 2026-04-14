package com.xunlei.downloadlib;

import android.content.Context;
import java.util.Date;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class XLAppKeyChecker {
    private static final byte APPTYPE_PRODUCT = 1;
    private static final String TAG = "XLAppKeyChecker";
    private short mAppId;
    private String mAppKey;
    private Context mContext;
    private String mPackageName;

    private class AppKeyEntity {
        private String MD5;
        private RawItemsEntity mItemsEntity;
        private String mRawItems;
        final /* synthetic */ XLAppKeyChecker this$0;

        private AppKeyEntity(XLAppKeyChecker xLAppKeyChecker) {
        }

        /* synthetic */ AppKeyEntity(XLAppKeyChecker xLAppKeyChecker, C17161 c17161) {
        }

        public String getMD5() {
        }

        public RawItemsEntity getmItemsEntity() {
        }

        public String getmRawItems() {
        }

        public void setMD5(String str) {
        }

        public void setmItemsEntity(RawItemsEntity rawItemsEntity) {
        }

        public void setmRawItems(String str) {
        }
    }

    public class KeyFormateException extends Exception {
        private static final long serialVersionUID = 13923744320L;
        final /* synthetic */ XLAppKeyChecker this$0;

        public KeyFormateException(XLAppKeyChecker xLAppKeyChecker) {
        }

        public KeyFormateException(XLAppKeyChecker xLAppKeyChecker, String str) {
        }
    }

    private class RawItemsEntity {
        private short mAppId;
        private Date mExpired;
        final /* synthetic */ XLAppKeyChecker this$0;

        private RawItemsEntity(XLAppKeyChecker xLAppKeyChecker) {
        }

        /* synthetic */ RawItemsEntity(XLAppKeyChecker xLAppKeyChecker, C17161 c17161) {
        }

        public short getAppId() {
        }

        public Date getExpired() {
        }

        public void setAppId(short s) {
        }

        public void setExpired(Date date) {
        }
    }

    public XLAppKeyChecker(Context context, String str) {
    }

    private AppKeyEntity getKeyEntity() {
    }

    private RawItemsEntity getRawItemsEntity(String str) {
    }

    private boolean verifyAppKeyExpired(AppKeyEntity appKeyEntity) {
    }

    private boolean verifyAppKeyMD5(AppKeyEntity appKeyEntity, String str) {
    }

    public String getSoAppKey() {
    }

    public boolean verify() {
    }
}
