package com.magicmagnet.data.user;

import kotlin.Metadata;
import p000.pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll;
import p000.qh;
import p000.tp;
import p000.up;
import p000.xc0;
import p000.xp;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class BaseResponse {
    private final RESPONSE_CODE code;
    private final Msg error;
    private final Msg success;
    private final long time;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @xc0
    public static final class RESPONSE_CODE {
        private static final /* synthetic */ RESPONSE_CODE[] $VALUES = null;
        public static final RESPONSE_CODE ERROR_EMAIL_NOT_EXISTED = null;
        public static final RESPONSE_CODE ERROR_FORM_EMPTY = null;
        public static final RESPONSE_CODE ERROR_LOGIN_TOKEN_EXPIRED = null;
        public static final RESPONSE_CODE ERROR_LOGIN_WRONG_USERNAME_PASSWORD = null;
        public static final RESPONSE_CODE ERROR_MCODE_NOT_EXIST = null;
        public static final RESPONSE_CODE ERROR_MODIFY_PASS_OLD_NEW_PASS_SAME = null;
        public static final RESPONSE_CODE ERROR_MODIFY_PASS_OLD_PASS_NOT_OK = null;
        public static final RESPONSE_CODE ERROR_OTHER = null;
        public static final RESPONSE_CODE ERROR_PASS_TIP_EMPTY = null;
        public static final RESPONSE_CODE ERROR_PAYNO_NOT_EXIST = null;
        public static final RESPONSE_CODE ERROR_PRO_CODE_ALREADY_REGISTED = null;
        public static final RESPONSE_CODE ERROR_PRO_USER_IS_ALREADY_PRO = null;
        public static final RESPONSE_CODE ERROR_REGISTER_USERNAME_EXIST = null;
        public static final RESPONSE_CODE ERROR_SYNC_FAIL = null;
        public static final RESPONSE_CODE ERROR_UNKNOWN = null;
        public static final RESPONSE_CODE ERROR_USER_NOT_EXIST = null;
        public static final RESPONSE_CODE FAIL = null;
        public static final RESPONSE_CODE SUCCESS = null;
        public static final RESPONSE_CODE SUCCESS_FIND_USERNAME = null;
        public static final RESPONSE_CODE SUCCESS_GET_TIP = null;
        public static final RESPONSE_CODE SUCCESS_LOGIN = null;
        public static final RESPONSE_CODE SUCCESS_MODIFY_PASS = null;
        public static final RESPONSE_CODE SUCCESS_PRO = null;
        public static final RESPONSE_CODE SUCCESS_REGISTER = null;
        public static final RESPONSE_CODE SUCCESS_SYNC = null;

        private static final /* synthetic */ RESPONSE_CODE[] $values() {
        }

        private RESPONSE_CODE(String str, int i) {
        }

        public static RESPONSE_CODE valueOf(String str) {
        }

        public static RESPONSE_CODE[] values() {
        }
    }

    public BaseResponse(RESPONSE_CODE response_code, Msg msg, Msg msg2, long j) {
    }

    public final RESPONSE_CODE getCode() {
    }

    public final Msg getError() {
    }

    public final Msg getSuccess() {
    }

    public final long getTime() {
    }

    public final boolean isFail() {
    }

    public final boolean isKnownError() {
    }

    public final boolean isSuccessfully() {
    }

    public final boolean isTokenExpired() {
    }

    public final void logResponse(up upVar, xp xpVar, tp tpVar, qh<? extends Object> qhVar) {
    }

    @xc0
    public static final class Msg {
        private final AlertType alert;
        private final RESPONSE_CODE code;
        private final String msg;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        @xc0
        public static final class AlertType {
            private static final /* synthetic */ AlertType[] $VALUES = null;
            public static final AlertType DEFAULT = null;
            public static final AlertType DIALOG = null;
            public static final AlertType TOAST = null;

            private static final /* synthetic */ AlertType[] $values() {
            }

            private AlertType(String str, int i) {
            }

            public static AlertType valueOf(String str) {
            }

            public static AlertType[] values() {
            }
        }

        public Msg(RESPONSE_CODE response_code, String str, AlertType alertType) {
        }

        public static /* synthetic */ Msg copy$default(Msg msg, RESPONSE_CODE response_code, String str, AlertType alertType, int i, Object obj) {
        }

        public final RESPONSE_CODE component1() {
        }

        public final String component2() {
        }

        public final AlertType component3() {
        }

        public final Msg copy(RESPONSE_CODE response_code, String str, AlertType alertType) {
        }

        public boolean equals(Object obj) {
        }

        public final AlertType getAlert() {
        }

        public final RESPONSE_CODE getCode() {
        }

        public final String getMsg() {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public /* synthetic */ Msg(RESPONSE_CODE response_code, String str, AlertType alertType, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
        }
    }

    public /* synthetic */ BaseResponse(RESPONSE_CODE response_code, Msg msg, Msg msg2, long j, int i, pppqbqpenQQaaBhRnBYLVbtBMM1l1111ll pppqbqpenqqaabhrnbylvbtbmm1l1111ll) {
    }

    public BaseResponse() {
    }
}
