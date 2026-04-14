package p000;

import com.magicmagnet.data.bean.BackUp;
import com.magicmagnet.data.user.AnnouncementResponse;
import com.magicmagnet.data.user.BaseResponse;
import com.magicmagnet.data.user.FindUserNameRequest;
import com.magicmagnet.data.user.FindUserNameResponse;
import com.magicmagnet.data.user.GetPasswordTipRequest;
import com.magicmagnet.data.user.GetPasswordTipResponse;
import com.magicmagnet.data.user.LoginRequest;
import com.magicmagnet.data.user.LoginResponseV2;
import com.magicmagnet.data.user.ModifyPasswordRequest;
import com.magicmagnet.data.user.ProRequest;
import com.magicmagnet.data.user.ProResponse;
import com.magicmagnet.data.user.RegisterRequest;
import com.magicmagnet.data.user.ResetPwdRequest;
import com.magicmagnet.data.user.ResetPwdResponse;
import com.magicmagnet.data.user.ResetPwdSendEmailRequest;
import com.magicmagnet.data.user.ResetPwdSendEmailResponse;
import com.magicmagnet.data.user.SyncRequest;
import com.magicmagnet.data.user.SyncResponse;
import kotlin.Metadata;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface wt extends tp {
    jl0<String> bbdbbpdOJSuInlll111l();

    void bddbppbdHQMVgPvQSDhmnXZYkDh1ll111(String str);

    jl0<Boolean> bpbbpbppqsLrtEPjeDMEnOv1l1l1();

    jl0<Boolean> bpdddqbpEtpkwNYukGjjNs1l111();

    jl0<SyncResponse> bpdqqiQNVROMLC1ll1l1l11(SyncRequest syncRequest);

    jl0<Boolean> bpqbbpqpqkDmeOUxxUylkHyYgWv11111(v60 v60Var);

    jl0<AnnouncementResponse> bpqpbicsQtfVpOtr11l1l();

    jl0<GetPasswordTipResponse> ddbbbeXHXx111ll(GetPasswordTipRequest getPasswordTipRequest);

    jl0<ResetPwdSendEmailResponse> dddbpbpNqzZZJmSG1111l(ResetPwdSendEmailRequest resetPwdSendEmailRequest);

    jl0<BaseResponse> dpbdpqRKAscW1lll1l(RegisterRequest registerRequest);

    jl0<BaseResponse> dqpqqqbqQyjyB11111l1(ModifyPasswordRequest modifyPasswordRequest);

    jl0<LoginResponseV2> dqqppqiKzJi1l1lll1l(LoginRequest loginRequest);

    jl0<BackUp> pbddqdbpoVvTyZPOoYl1111(String str);

    void pdpqqbqbpFAaViLnU1l1ll11l1(String str);

    jl0<FindUserNameResponse> ppbdpwWWljzmXXdHNabfWhgjl111l11(FindUserNameRequest findUserNameRequest);

    jl0<ResetPwdResponse> qbddqbdJBkudFfhX1ll1l111(ResetPwdRequest resetPwdRequest);

    jl0<ProResponse> qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(ProRequest proRequest);

    jl0<Boolean> qbpbddbpyaPAbpThgWCvm11l11l1(BackUp backUp, boolean z);

    jl0<v60> qppqdpppIauLKaAtRkB11111l();

    void qqbqbddiRRgLpniPxlUfQzP1l1l1l(String str);
}
