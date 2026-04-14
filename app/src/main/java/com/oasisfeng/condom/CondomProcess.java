package com.oasisfeng.condom;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.annotation.Keep;
import com.oasisfeng.condom.CondomCore;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Keep
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public class CondomProcess {
    static String FULL_TAG = "CondomProcess";
    static String TAG = "CondomProcess";
    private static final String TAG_INCOMPATIBILITY = "Incompatibility";

    /* renamed from: com.oasisfeng.condom.CondomProcess$1 */
    static class RunnableC14351 implements Runnable {
        final /* synthetic */ String[] bpdqqiQNVROMLC1ll1l1l11;
        final /* synthetic */ Application dpbdpqRKAscW1lll1l;

        RunnableC14351(Application application, String[] strArr) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static class CondomProcessActivityManager extends CondomSystemService {
        private CondomCore dqpqqqbqQyjyB11111l1;

        /* renamed from: com.oasisfeng.condom.CondomProcess$CondomProcessActivityManager$1 */
        class C14361 implements CondomCore.WrappedValueProcedureThrows<Integer, Throwable> {
            final /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1;
            final /* synthetic */ Method dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ CondomProcessActivityManager dpbdpqRKAscW1lll1l;
            final /* synthetic */ Object[] dqqppqiKzJi1l1lll1l;

            C14361(CondomProcessActivityManager condomProcessActivityManager, Object obj, Method method, Object[] objArr) {
            }

            @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
            public /* bridge */ /* synthetic */ Integer dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
            }

            public Integer dpbdbdpbLwkLpObyKsq1lll1() throws Throwable {
            }
        }

        /* renamed from: com.oasisfeng.condom.CondomProcess$CondomProcessActivityManager$2 */
        class C14372 implements CondomCore.WrappedValueProcedureThrows<Integer, Throwable> {
            final /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1;
            final /* synthetic */ Method dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ CondomProcessActivityManager dpbdpqRKAscW1lll1l;
            final /* synthetic */ Object[] dqqppqiKzJi1l1lll1l;

            C14372(CondomProcessActivityManager condomProcessActivityManager, Object obj, Method method, Object[] objArr) {
            }

            @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
            public /* bridge */ /* synthetic */ Integer dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
            }

            public Integer dpbdbdpbLwkLpObyKsq1lll1() throws Throwable {
            }
        }

        /* renamed from: com.oasisfeng.condom.CondomProcess$CondomProcessActivityManager$3 */
        class C14383 implements CondomCore.WrappedValueProcedureThrows<ComponentName, Throwable> {
            final /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1;
            final /* synthetic */ Method dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ CondomProcessActivityManager dpbdpqRKAscW1lll1l;
            final /* synthetic */ Object[] dqqppqiKzJi1l1lll1l;

            C14383(CondomProcessActivityManager condomProcessActivityManager, Object obj, Method method, Object[] objArr) {
            }

            @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
            public /* bridge */ /* synthetic */ ComponentName dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
            }

            public ComponentName dpbdbdpbLwkLpObyKsq1lll1() throws Throwable {
            }
        }

        CondomProcessActivityManager(CondomCore condomCore, Object obj) {
        }

        private Object bpdqqiQNVROMLC1ll1l1l11(Object obj, Method method, Object[] objArr) throws Throwable {
        }

        static /* synthetic */ CondomCore dbpqdHhmDSIHIJiwc1ll1l1(CondomProcessActivityManager condomProcessActivityManager, CondomCore condomCore) {
        }

        static /* synthetic */ Object dpbdbdpbLwkLpObyKsq1lll1(CondomProcessActivityManager condomProcessActivityManager, Object obj, Method method, Object[] objArr) throws Throwable {
        }

        static /* synthetic */ Object dpbdpqRKAscW1lll1l(CondomProcessActivityManager condomProcessActivityManager, Object obj, Method method, Object[] objArr) throws Throwable {
        }

        static /* synthetic */ Object dqqppqiKzJi1l1lll1l(CondomProcessActivityManager condomProcessActivityManager, Object obj, Method method, Object[] objArr) throws Throwable {
        }

        @Override // com.oasisfeng.condom.CondomProcess.CondomSystemService, java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    static class CondomProcessPackageManager extends CondomSystemService {
        private Method dbppbdqpeLmcbs11l11;
        CondomCore ddbbbeXHXx111ll;
        private Method dqpdbEevAufTOvPphbjykClll1l11;
        final Intent dqpqqqbqQyjyB11111l1;

        /* renamed from: com.oasisfeng.condom.CondomProcess$CondomProcessPackageManager$1 */
        class C14391 implements CondomCore.WrappedValueProcedureThrows<List<ResolveInfo>, Exception> {
            final /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1;
            final /* synthetic */ CondomProcessPackageManager dpbdbdpbLwkLpObyKsq1lll1;

            C14391(CondomProcessPackageManager condomProcessPackageManager, Object obj) {
            }

            @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
            public /* bridge */ /* synthetic */ List<ResolveInfo> dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
            }

            public List<ResolveInfo> dpbdbdpbLwkLpObyKsq1lll1() throws Exception {
            }
        }

        /* renamed from: com.oasisfeng.condom.CondomProcess$CondomProcessPackageManager$2 */
        class C14402 implements CondomCore.WrappedValueProcedureThrows<ResolveInfo, Throwable> {
            final /* synthetic */ int bpdqqiQNVROMLC1ll1l1l11;
            final /* synthetic */ Object dbpqdHhmDSIHIJiwc1ll1l1;
            final /* synthetic */ Method dpbdbdpbLwkLpObyKsq1lll1;
            final /* synthetic */ Intent dpbdpqRKAscW1lll1l;
            final /* synthetic */ Object[] dqqppqiKzJi1l1lll1l;
            final /* synthetic */ CondomProcessPackageManager ppbdpwWWljzmXXdHNabfWhgjl111l11;

            C14402(CondomProcessPackageManager condomProcessPackageManager, Object obj, Method method, Object[] objArr, Intent intent, int i) {
            }

            @Override // com.oasisfeng.condom.CondomCore.WrappedValueProcedureThrows
            public /* bridge */ /* synthetic */ ResolveInfo dbpqdHhmDSIHIJiwc1ll1l1() throws Throwable {
            }

            public ResolveInfo dpbdbdpbLwkLpObyKsq1lll1() throws Throwable {
            }
        }

        CondomProcessPackageManager(CondomCore condomCore, Object obj) {
        }

        private <T> List<T> bpdqqiQNVROMLC1ll1l1l11(Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        }

        static /* synthetic */ List dbpqdHhmDSIHIJiwc1ll1l1(CondomProcessPackageManager condomProcessPackageManager, Object obj) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        }

        static /* synthetic */ Object dpbdbdpbLwkLpObyKsq1lll1(CondomProcessPackageManager condomProcessPackageManager, Object obj, Method method, Object[] objArr) throws Throwable {
        }

        static /* synthetic */ Object dpbdpqRKAscW1lll1l(CondomProcessPackageManager condomProcessPackageManager, Object obj, Method method, Object[] objArr) throws Throwable {
        }

        static /* synthetic */ Method dqqppqiKzJi1l1lll1l(CondomProcessPackageManager condomProcessPackageManager) {
        }

        private Object ppbdpwWWljzmXXdHNabfWhgjl111l11(Object obj, Method method, Object[] objArr) throws Throwable {
        }

        @Override // com.oasisfeng.condom.CondomProcess.CondomSystemService, java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    private static class CondomSystemService implements InvocationHandler {
        private final String bpdqqiQNVROMLC1ll1l1l11;
        private final Object dpbdpqRKAscW1lll1l;
        final boolean ppbdpwWWljzmXXdHNabfWhgjl111l11;

        CondomSystemService(Object obj, String str, boolean z) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }
    }

    private CondomProcess() {
    }

    static /* synthetic */ void access$000(Application application, String[] strArr) {
    }

    private static void doValidateProcessNames(Application application, String[] strArr) {
    }

    private static String getFullProcessName(Context context, String str) {
    }

    private static String getProcessName(Context context) {
    }

    private static void install(Application application, String str, CondomOptions condomOptions) {
    }

    @SuppressLint({"PrivateApi"})
    private static void installCondomProcessActivityManager(CondomCore condomCore) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    }

    @SuppressLint({"PrivateApi"})
    private static void installCondomProcessPackageManager(CondomCore condomCore) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
    }

    public static void installExcept(Application application, CondomOptions condomOptions, String... strArr) {
    }

    public static void installExceptDefaultProcess(Application application) {
    }

    public static void installInCurrentProcess(Application application, String str, CondomOptions condomOptions) {
    }

    private static void validateCondomOptions(CondomOptions condomOptions) {
    }

    private static void validateProcessNames(Application application, String[] strArr) {
    }

    public static void installExceptDefaultProcess(Application application, CondomOptions condomOptions) {
    }
}
