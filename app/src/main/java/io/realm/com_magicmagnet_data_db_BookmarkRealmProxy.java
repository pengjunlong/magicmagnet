package io.realm;

import android.annotation.TargetApi;
import android.util.JsonReader;
import com.magicmagnet.data.db.Bookmark;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.dddqpBgcDmlll11;
import p000.f81;
import p000.s41;
import p000.v41;
import p000.zu;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
public class com_magicmagnet_data_db_BookmarkRealmProxy extends Bookmark implements v41 {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = null;
    private dbpqdHhmDSIHIJiwc1ll1l1 columnInfo;
    private dbbpdqqpdVUhpQ1ll11<Bookmark> proxyState;

    static final class dbpqdHhmDSIHIJiwc1ll1l1 extends dddqpBgcDmlll11 {
        long bpdqqiQNVROMLC1ll1l1l11;
        long ddbbbeXHXx111ll;
        long dqpqqqbqQyjyB11111l1;
        long ppbdpwWWljzmXXdHNabfWhgjl111l11;

        dbpqdHhmDSIHIJiwc1ll1l1(OsSchemaInfo osSchemaInfo) {
        }

        @Override // p000.dddqpBgcDmlll11
        protected final void dpbdbdpbLwkLpObyKsq1lll1(dddqpBgcDmlll11 dddqpbgcdmlll11, dddqpBgcDmlll11 dddqpbgcdmlll112) {
        }
    }

    com_magicmagnet_data_db_BookmarkRealmProxy() {
    }

    public static Bookmark copy(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, Bookmark bookmark, boolean z, Map<s41, v41> map, Set<zu> set) {
    }

    public static Bookmark copyOrUpdate(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, Bookmark bookmark, boolean z, Map<s41, v41> map, Set<zu> set) {
    }

    public static dbpqdHhmDSIHIJiwc1ll1l1 createColumnInfo(OsSchemaInfo osSchemaInfo) {
    }

    public static Bookmark createDetachedCopy(Bookmark bookmark, int i, int i2, Map<s41, v41.dbpqdHhmDSIHIJiwc1ll1l1<s41>> map) {
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
    }

    public static Bookmark createOrUpdateUsingJsonObject(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, JSONObject jSONObject, boolean z) throws JSONException {
    }

    @TargetApi(11)
    public static Bookmark createUsingJsonStream(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, JsonReader jsonReader) throws IOException {
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
    }

    public static String getSimpleClassName() {
    }

    public static long insert(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, Bookmark bookmark, Map<s41, Long> map) {
    }

    public static long insertOrUpdate(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, Bookmark bookmark, Map<s41, Long> map) {
    }

    static com_magicmagnet_data_db_BookmarkRealmProxy newProxyInstance(io.realm.dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, f81 f81Var) {
    }

    static Bookmark update(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, dbpqdHhmDSIHIJiwc1ll1l1 dbpqdhhmdsihijiwc1ll1l1, Bookmark bookmark, Bookmark bookmark2, Map<s41, v41> map, Set<zu> set) {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    @Override // p000.v41
    public void realm$injectObjectContext() {
    }

    @Override // com.magicmagnet.data.db.Bookmark, p000.mb2
    public Date realmGet$date() {
    }

    @Override // com.magicmagnet.data.db.Bookmark, p000.mb2
    public byte[] realmGet$icon() {
    }

    @Override // p000.v41
    public dbbpdqqpdVUhpQ1ll11<?> realmGet$proxyState() {
    }

    @Override // com.magicmagnet.data.db.Bookmark, p000.mb2
    public String realmGet$title() {
    }

    @Override // com.magicmagnet.data.db.Bookmark, p000.mb2
    public String realmGet$url() {
    }

    @Override // com.magicmagnet.data.db.Bookmark, p000.mb2
    public void realmSet$date(Date date) {
    }

    @Override // com.magicmagnet.data.db.Bookmark, p000.mb2
    public void realmSet$icon(byte[] bArr) {
    }

    @Override // com.magicmagnet.data.db.Bookmark, p000.mb2
    public void realmSet$title(String str) {
    }

    @Override // com.magicmagnet.data.db.Bookmark, p000.mb2
    public void realmSet$url(String str) {
    }

    public String toString() {
    }

    public static void insert(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, Iterator<? extends s41> it, Map<s41, Long> map) {
    }

    public static void insertOrUpdate(bppbpdbCeZVhQNTixBml1lll11l bppbpdbcezvhqntixbml1lll11l, Iterator<? extends s41> it, Map<s41, Long> map) {
    }
}
