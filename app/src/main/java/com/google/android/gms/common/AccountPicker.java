package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_0.dex */
public final class AccountPicker {

    public static class AccountChooserOptions {
        private Account zza;
        private ArrayList<Account> zzb;
        private ArrayList<String> zzc;
        private boolean zzd;
        private String zze;
        private Bundle zzf;
        private boolean zzg;
        private int zzh;
        private String zzi;
        private boolean zzj;
        private zza zzk;
        private String zzl;
        private boolean zzm;

        public static class Builder {
            private Account zza;
            private ArrayList<Account> zzb;
            private ArrayList<String> zzc;
            private boolean zzd;
            private String zze;
            private Bundle zzf;
            private boolean zzg;
            private int zzh;
            private boolean zzi;

            public AccountChooserOptions build() {
            }

            public Builder setAllowableAccounts(List<Account> list) {
            }

            public Builder setAllowableAccountsTypes(List<String> list) {
            }

            public Builder setAlwaysShowAccountPicker(boolean z) {
            }

            public Builder setOptionsForAddingAccount(Bundle bundle) {
            }

            public Builder setSelectedAccount(Account account) {
            }

            public Builder setTitleOverrideText(String str) {
            }
        }

        public static class zza {
        }

        static /* synthetic */ boolean zza(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ String zzb(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ zza zzc(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ ArrayList zzd(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ ArrayList zze(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ Bundle zzf(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ Account zzg(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ boolean zzh(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ String zzi(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ boolean zzj(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ String zzk(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ int zzl(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ boolean zzm(AccountChooserOptions accountChooserOptions) {
        }

        static /* synthetic */ ArrayList zza(AccountChooserOptions accountChooserOptions, ArrayList arrayList) {
        }

        static /* synthetic */ ArrayList zzb(AccountChooserOptions accountChooserOptions, ArrayList arrayList) {
        }

        static /* synthetic */ String zzc(AccountChooserOptions accountChooserOptions, String str) {
        }

        static /* synthetic */ boolean zzd(AccountChooserOptions accountChooserOptions, boolean z) {
        }

        static /* synthetic */ boolean zza(AccountChooserOptions accountChooserOptions, boolean z) {
        }

        static /* synthetic */ boolean zzb(AccountChooserOptions accountChooserOptions, boolean z) {
        }

        static /* synthetic */ boolean zzc(AccountChooserOptions accountChooserOptions, boolean z) {
        }

        static /* synthetic */ zza zza(AccountChooserOptions accountChooserOptions, zza zzaVar) {
        }

        static /* synthetic */ String zzb(AccountChooserOptions accountChooserOptions, String str) {
        }

        static /* synthetic */ String zza(AccountChooserOptions accountChooserOptions, String str) {
        }

        static /* synthetic */ Bundle zza(AccountChooserOptions accountChooserOptions, Bundle bundle) {
        }

        static /* synthetic */ Account zza(AccountChooserOptions accountChooserOptions, Account account) {
        }

        static /* synthetic */ int zza(AccountChooserOptions accountChooserOptions, int i) {
        }
    }

    private AccountPicker() {
    }

    @Deprecated
    public static Intent newChooseAccountIntent(Account account, ArrayList<Account> arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle) {
    }

    public static Intent newChooseAccountIntent(AccountChooserOptions accountChooserOptions) {
    }
}
