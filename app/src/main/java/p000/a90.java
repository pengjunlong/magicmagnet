package p000;

import com.magicmagnet.data.user.AnnouncementResponse;
import com.magicmagnet.data.user.BaseResponse;
import com.magicmagnet.data.user.CheckLinkRequest;
import com.magicmagnet.data.user.CheckLinkResponse;
import com.magicmagnet.data.user.CheckLogRequest;
import com.magicmagnet.data.user.CheckLogResponse;
import com.magicmagnet.data.user.CheckSearchSwitchRequest;
import com.magicmagnet.data.user.CheckSearchSwitchResponse;
import com.magicmagnet.data.user.ConfigResponse;
import com.magicmagnet.data.user.FeedbackRequest;
import com.magicmagnet.data.user.FeedbackResponse;
import com.magicmagnet.data.user.FindUserNameRequest;
import com.magicmagnet.data.user.FindUserNameResponse;
import com.magicmagnet.data.user.GetAnnouncementRequest;
import com.magicmagnet.data.user.GetConfigRequest;
import com.magicmagnet.data.user.GetPasswordTipRequest;
import com.magicmagnet.data.user.GetPasswordTipResponse;
import com.magicmagnet.data.user.GetUpdateRequest;
import com.magicmagnet.data.user.LoginRequest;
import com.magicmagnet.data.user.LoginResponseV2;
import com.magicmagnet.data.user.ModifyPasswordRequest;
import com.magicmagnet.data.user.ParseRequest;
import com.magicmagnet.data.user.ParseRequestV2;
import com.magicmagnet.data.user.ProRequest;
import com.magicmagnet.data.user.ProResponse;
import com.magicmagnet.data.user.RegisterRequest;
import com.magicmagnet.data.user.ReportRequest;
import com.magicmagnet.data.user.ReportResponse;
import com.magicmagnet.data.user.ResetPwdRequest;
import com.magicmagnet.data.user.ResetPwdResponse;
import com.magicmagnet.data.user.ResetPwdSendEmailRequest;
import com.magicmagnet.data.user.ResetPwdSendEmailResponse;
import com.magicmagnet.data.user.SyncRequest;
import com.magicmagnet.data.user.SyncResponse;
import com.magicmagnet.data.user.UnvalidLinkRequest;
import com.magicmagnet.data.user.UpdateResponse;
import com.magicmagnet.data.user.UploadFileResponse;
import com.magicmagnet.data.user.UploadLogRequest;
import com.magicmagnet.data.user.UploadLogResponse;
import kotlin.Metadata;
import okhttp3.MultipartBody;

@Metadata
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public interface a90 {
    @nq0("/v1/check_log")
    jl0<CheckLogResponse> bbdbbpdOJSuInlll111l(@qdbpbqxnkrCfreybYwgiG1111l11l CheckLogRequest checkLogRequest);

    @nq0("/v1/upload_file")
    @yf0
    jl0<UploadFileResponse> bdddqmITkkeGpsxVXHR1l1llll(@ks0 MultipartBody.Part part);

    @nq0("/v1/sync")
    jl0<SyncResponse> bpdqqiQNVROMLC1ll1l1l11(@qdbpbqxnkrCfreybYwgiG1111l11l SyncRequest syncRequest);

    @nq0("/v1/update")
    jl0<UpdateResponse> bppbpdbCeZVhQNTixBml1lll11l(@qdbpbqxnkrCfreybYwgiG1111l11l GetUpdateRequest getUpdateRequest);

    @nq0("/v1/p")
    jl0<BaseResponse> bpppdpppqFAXRSTHUAmVJLvH11lllll1l(@qdbpbqxnkrCfreybYwgiG1111l11l ParseRequest parseRequest);

    @nq0("/v1/feedback")
    jl0<FeedbackResponse> dbbpbdqppoihgPlMHJlFSbeeOqw11l1ll1l1(@qdbpbqxnkrCfreybYwgiG1111l11l FeedbackRequest feedbackRequest);

    @nq0("/v2/ul")
    jl0<BaseResponse> dbbpdqqpdVUhpQ1ll11(@qdbpbqxnkrCfreybYwgiG1111l11l UnvalidLinkRequest unvalidLinkRequest);

    @nq0("/v1/ul")
    jl0<BaseResponse> dbppbdqpeLmcbs11l11(@qdbpbqxnkrCfreybYwgiG1111l11l UnvalidLinkRequest unvalidLinkRequest);

    @nq0("/v1/sw")
    Object dbpqdHhmDSIHIJiwc1ll1l1(@qdbpbqxnkrCfreybYwgiG1111l11l CheckSearchSwitchRequest checkSearchSwitchRequest, qpdqpbkgVDbrePuTwWYxml1ll1111l1<? super CheckSearchSwitchResponse> qpdqpbkgvdbreputwwyxml1ll1111l1);

    @nq0("/v1/tip")
    jl0<GetPasswordTipResponse> ddbbbeXHXx111ll(@qdbpbqxnkrCfreybYwgiG1111l11l GetPasswordTipRequest getPasswordTipRequest);

    @nq0("v1/resetPwd/send")
    jl0<ResetPwdSendEmailResponse> dddbpbpNqzZZJmSG1111l(@qdbpbqxnkrCfreybYwgiG1111l11l ResetPwdSendEmailRequest resetPwdSendEmailRequest);

    @nq0("v2/cl")
    jl0<CheckLinkResponse> ddqqbqdbbWaRXDGIeoSPFlBfekX1l1lll(@qdbpbqxnkrCfreybYwgiG1111l11l CheckLinkRequest checkLinkRequest);

    @nq0("/v1/announcement")
    jl0<AnnouncementResponse> dpbdbdpbLwkLpObyKsq1lll1(@qdbpbqxnkrCfreybYwgiG1111l11l GetAnnouncementRequest getAnnouncementRequest);

    @nq0("/v1/register")
    jl0<BaseResponse> dpbdpqRKAscW1lll1l(@qdbpbqxnkrCfreybYwgiG1111l11l RegisterRequest registerRequest);

    @nq0("/v1/config")
    jl0<ConfigResponse> dqdqbpQposEBDyDxIyyz1ll11(@qdbpbqxnkrCfreybYwgiG1111l11l GetConfigRequest getConfigRequest);

    @nq0("/v1/upload_log")
    jl0<UploadLogResponse> dqpdbEevAufTOvPphbjykClll1l11(@qdbpbqxnkrCfreybYwgiG1111l11l UploadLogRequest uploadLogRequest);

    @nq0("/v1/modify_pass")
    jl0<BaseResponse> dqpqqqbqQyjyB11111l1(@qdbpbqxnkrCfreybYwgiG1111l11l ModifyPasswordRequest modifyPasswordRequest);

    @nq0("/v2/login")
    jl0<LoginResponseV2> dqqppqiKzJi1l1lll1l(@qdbpbqxnkrCfreybYwgiG1111l11l LoginRequest loginRequest);

    @nq0("v1/report")
    jl0<ReportResponse> pbppbpqbamJRy11l1l1(@qdbpbqxnkrCfreybYwgiG1111l11l ReportRequest reportRequest);

    @nq0("/v1/find_username")
    jl0<FindUserNameResponse> ppbdpwWWljzmXXdHNabfWhgjl111l11(@qdbpbqxnkrCfreybYwgiG1111l11l FindUserNameRequest findUserNameRequest);

    @nq0("v1/resetPwd")
    jl0<ResetPwdResponse> qbddqbdJBkudFfhX1ll1l111(@qdbpbqxnkrCfreybYwgiG1111l11l ResetPwdRequest resetPwdRequest);

    @nq0("/v2/p")
    jl0<BaseResponse> qbdpqpstJKhhKkXrsOGvbWw1l1llll(@qdbpbqxnkrCfreybYwgiG1111l11l ParseRequestV2 parseRequestV2);

    @nq0("/v1/pro")
    jl0<ProResponse> qbdqqpbqpCWRpIKEKtzoceYOll1ll1l(@qdbpbqxnkrCfreybYwgiG1111l11l ProRequest proRequest);

    @nq0("v3/cl")
    jl0<CheckLinkResponse> qdqdpyALEmZFGGaahRTIU1ll11(@qdbpbqxnkrCfreybYwgiG1111l11l CheckLinkRequest checkLinkRequest);
}
