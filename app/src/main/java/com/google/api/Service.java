package com.google.api;

import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Endpoint;
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class Service extends GeneratedMessageLite<Service, Builder> implements ServiceOrBuilder {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE = null;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Service> PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Internal.ProtobufList<Api> apis_;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Internal.ProtobufList<Endpoint> endpoints_;
    private Internal.ProtobufList<Enum> enums_;
    private Http http_;
    private String id_;
    private Logging logging_;
    private Internal.ProtobufList<LogDescriptor> logs_;
    private Internal.ProtobufList<MetricDescriptor> metrics_;
    private Internal.ProtobufList<MonitoredResourceDescriptor> monitoredResources_;
    private Monitoring monitoring_;
    private String name_;
    private String producerProjectId_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private String title_;
    private Internal.ProtobufList<Type> types_;
    private Usage usage_;

    /* renamed from: com.google.api.Service$1 */
    static /* synthetic */ class C05931 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f87xa1df5c61 = null;
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Service, Builder> implements ServiceOrBuilder {
        /* synthetic */ Builder(C05931 c05931) {
        }

        public Builder addAllApis(Iterable<? extends Api> iterable) {
        }

        public Builder addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        }

        public Builder addAllEnums(Iterable<? extends Enum> iterable) {
        }

        public Builder addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        }

        public Builder addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        }

        public Builder addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        }

        public Builder addAllTypes(Iterable<? extends Type> iterable) {
        }

        public Builder addApis(Api api) {
        }

        public Builder addEndpoints(Endpoint endpoint) {
        }

        public Builder addEnums(Enum r2) {
        }

        public Builder addLogs(LogDescriptor logDescriptor) {
        }

        public Builder addMetrics(MetricDescriptor metricDescriptor) {
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        }

        public Builder addTypes(Type type) {
        }

        public Builder clearApis() {
        }

        public Builder clearAuthentication() {
        }

        public Builder clearBackend() {
        }

        public Builder clearBilling() {
        }

        public Builder clearConfigVersion() {
        }

        public Builder clearContext() {
        }

        public Builder clearControl() {
        }

        public Builder clearDocumentation() {
        }

        public Builder clearEndpoints() {
        }

        public Builder clearEnums() {
        }

        public Builder clearHttp() {
        }

        public Builder clearId() {
        }

        public Builder clearLogging() {
        }

        public Builder clearLogs() {
        }

        public Builder clearMetrics() {
        }

        public Builder clearMonitoredResources() {
        }

        public Builder clearMonitoring() {
        }

        public Builder clearName() {
        }

        public Builder clearProducerProjectId() {
        }

        public Builder clearQuota() {
        }

        public Builder clearSourceInfo() {
        }

        public Builder clearSystemParameters() {
        }

        public Builder clearTitle() {
        }

        public Builder clearTypes() {
        }

        public Builder clearUsage() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Api getApis(int i) {
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getApisCount() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Api> getApisList() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Authentication getAuthentication() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Backend getBackend() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Billing getBilling() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public UInt32Value getConfigVersion() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Context getContext() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Control getControl() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Documentation getDocumentation() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Endpoint getEndpoints(int i) {
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getEndpointsCount() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Endpoint> getEndpointsList() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Enum getEnums(int i) {
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getEnumsCount() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Enum> getEnumsList() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Http getHttp() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getId() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getIdBytes() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Logging getLogging() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public LogDescriptor getLogs(int i) {
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getLogsCount() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<LogDescriptor> getLogsList() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public MetricDescriptor getMetrics(int i) {
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getMetricsCount() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<MetricDescriptor> getMetricsList() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public MonitoredResourceDescriptor getMonitoredResources(int i) {
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getMonitoredResourcesCount() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Monitoring getMonitoring() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getName() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getNameBytes() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getProducerProjectId() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getProducerProjectIdBytes() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Quota getQuota() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public SourceInfo getSourceInfo() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public SystemParameters getSystemParameters() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public String getTitle() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public ByteString getTitleBytes() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Type getTypes(int i) {
        }

        @Override // com.google.api.ServiceOrBuilder
        public int getTypesCount() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public List<Type> getTypesList() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public Usage getUsage() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasAuthentication() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasBackend() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasBilling() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasConfigVersion() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasContext() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasControl() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasDocumentation() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasHttp() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasLogging() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasMonitoring() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasQuota() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasSourceInfo() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasSystemParameters() {
        }

        @Override // com.google.api.ServiceOrBuilder
        public boolean hasUsage() {
        }

        public Builder mergeAuthentication(Authentication authentication) {
        }

        public Builder mergeBackend(Backend backend) {
        }

        public Builder mergeBilling(Billing billing) {
        }

        public Builder mergeConfigVersion(UInt32Value uInt32Value) {
        }

        public Builder mergeContext(Context context) {
        }

        public Builder mergeControl(Control control) {
        }

        public Builder mergeDocumentation(Documentation documentation) {
        }

        public Builder mergeHttp(Http http) {
        }

        public Builder mergeLogging(Logging logging) {
        }

        public Builder mergeMonitoring(Monitoring monitoring) {
        }

        public Builder mergeQuota(Quota quota) {
        }

        public Builder mergeSourceInfo(SourceInfo sourceInfo) {
        }

        public Builder mergeSystemParameters(SystemParameters systemParameters) {
        }

        public Builder mergeUsage(Usage usage) {
        }

        public Builder removeApis(int i) {
        }

        public Builder removeEndpoints(int i) {
        }

        public Builder removeEnums(int i) {
        }

        public Builder removeLogs(int i) {
        }

        public Builder removeMetrics(int i) {
        }

        public Builder removeMonitoredResources(int i) {
        }

        public Builder removeTypes(int i) {
        }

        public Builder setApis(int i, Api api) {
        }

        public Builder setAuthentication(Authentication authentication) {
        }

        public Builder setBackend(Backend backend) {
        }

        public Builder setBilling(Billing billing) {
        }

        public Builder setConfigVersion(UInt32Value uInt32Value) {
        }

        public Builder setContext(Context context) {
        }

        public Builder setControl(Control control) {
        }

        public Builder setDocumentation(Documentation documentation) {
        }

        public Builder setEndpoints(int i, Endpoint endpoint) {
        }

        public Builder setEnums(int i, Enum r3) {
        }

        public Builder setHttp(Http http) {
        }

        public Builder setId(String str) {
        }

        public Builder setIdBytes(ByteString byteString) {
        }

        public Builder setLogging(Logging logging) {
        }

        public Builder setLogs(int i, LogDescriptor logDescriptor) {
        }

        public Builder setMetrics(int i, MetricDescriptor metricDescriptor) {
        }

        public Builder setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        }

        public Builder setMonitoring(Monitoring monitoring) {
        }

        public Builder setName(String str) {
        }

        public Builder setNameBytes(ByteString byteString) {
        }

        public Builder setProducerProjectId(String str) {
        }

        public Builder setProducerProjectIdBytes(ByteString byteString) {
        }

        public Builder setQuota(Quota quota) {
        }

        public Builder setSourceInfo(SourceInfo sourceInfo) {
        }

        public Builder setSystemParameters(SystemParameters systemParameters) {
        }

        public Builder setTitle(String str) {
        }

        public Builder setTitleBytes(ByteString byteString) {
        }

        public Builder setTypes(int i, Type type) {
        }

        public Builder setUsage(Usage usage) {
        }

        private Builder() {
        }

        public Builder addApis(int i, Api api) {
        }

        public Builder addEndpoints(int i, Endpoint endpoint) {
        }

        public Builder addEnums(int i, Enum r3) {
        }

        public Builder addLogs(int i, LogDescriptor logDescriptor) {
        }

        public Builder addMetrics(int i, MetricDescriptor metricDescriptor) {
        }

        public Builder addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        }

        public Builder addTypes(int i, Type type) {
        }

        public Builder setApis(int i, Api.Builder builder) {
        }

        public Builder setAuthentication(Authentication.Builder builder) {
        }

        public Builder setBackend(Backend.Builder builder) {
        }

        public Builder setBilling(Billing.Builder builder) {
        }

        public Builder setConfigVersion(UInt32Value.Builder builder) {
        }

        public Builder setContext(Context.Builder builder) {
        }

        public Builder setControl(Control.Builder builder) {
        }

        public Builder setDocumentation(Documentation.Builder builder) {
        }

        public Builder setEndpoints(int i, Endpoint.Builder builder) {
        }

        public Builder setEnums(int i, Enum.Builder builder) {
        }

        public Builder setHttp(Http.Builder builder) {
        }

        public Builder setLogging(Logging.Builder builder) {
        }

        public Builder setLogs(int i, LogDescriptor.Builder builder) {
        }

        public Builder setMetrics(int i, MetricDescriptor.Builder builder) {
        }

        public Builder setMonitoredResources(int i, MonitoredResourceDescriptor.Builder builder) {
        }

        public Builder setMonitoring(Monitoring.Builder builder) {
        }

        public Builder setQuota(Quota.Builder builder) {
        }

        public Builder setSourceInfo(SourceInfo.Builder builder) {
        }

        public Builder setSystemParameters(SystemParameters.Builder builder) {
        }

        public Builder setTypes(int i, Type.Builder builder) {
        }

        public Builder setUsage(Usage.Builder builder) {
        }

        public Builder addApis(Api.Builder builder) {
        }

        public Builder addEndpoints(Endpoint.Builder builder) {
        }

        public Builder addEnums(Enum.Builder builder) {
        }

        public Builder addLogs(LogDescriptor.Builder builder) {
        }

        public Builder addMetrics(MetricDescriptor.Builder builder) {
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor.Builder builder) {
        }

        public Builder addTypes(Type.Builder builder) {
        }

        public Builder addApis(int i, Api.Builder builder) {
        }

        public Builder addEndpoints(int i, Endpoint.Builder builder) {
        }

        public Builder addEnums(int i, Enum.Builder builder) {
        }

        public Builder addLogs(int i, LogDescriptor.Builder builder) {
        }

        public Builder addMetrics(int i, MetricDescriptor.Builder builder) {
        }

        public Builder addMonitoredResources(int i, MonitoredResourceDescriptor.Builder builder) {
        }

        public Builder addTypes(int i, Type.Builder builder) {
        }
    }

    private Service() {
    }

    static /* synthetic */ Service access$000() {
    }

    static /* synthetic */ void access$100(Service service, UInt32Value uInt32Value) {
    }

    static /* synthetic */ void access$1000(Service service, String str) {
    }

    static /* synthetic */ void access$1100(Service service) {
    }

    static /* synthetic */ void access$1200(Service service, ByteString byteString) {
    }

    static /* synthetic */ void access$1300(Service service, String str) {
    }

    static /* synthetic */ void access$1400(Service service) {
    }

    static /* synthetic */ void access$1500(Service service, ByteString byteString) {
    }

    static /* synthetic */ void access$1600(Service service, int i, Api api) {
    }

    static /* synthetic */ void access$1700(Service service, Api api) {
    }

    static /* synthetic */ void access$1800(Service service, int i, Api api) {
    }

    static /* synthetic */ void access$1900(Service service, Iterable iterable) {
    }

    static /* synthetic */ void access$200(Service service, UInt32Value uInt32Value) {
    }

    static /* synthetic */ void access$2000(Service service) {
    }

    static /* synthetic */ void access$2100(Service service, int i) {
    }

    static /* synthetic */ void access$2200(Service service, int i, Type type) {
    }

    static /* synthetic */ void access$2300(Service service, Type type) {
    }

    static /* synthetic */ void access$2400(Service service, int i, Type type) {
    }

    static /* synthetic */ void access$2500(Service service, Iterable iterable) {
    }

    static /* synthetic */ void access$2600(Service service) {
    }

    static /* synthetic */ void access$2700(Service service, int i) {
    }

    static /* synthetic */ void access$2800(Service service, int i, Enum r2) {
    }

    static /* synthetic */ void access$2900(Service service, Enum r1) {
    }

    static /* synthetic */ void access$300(Service service) {
    }

    static /* synthetic */ void access$3000(Service service, int i, Enum r2) {
    }

    static /* synthetic */ void access$3100(Service service, Iterable iterable) {
    }

    static /* synthetic */ void access$3200(Service service) {
    }

    static /* synthetic */ void access$3300(Service service, int i) {
    }

    static /* synthetic */ void access$3400(Service service, Documentation documentation) {
    }

    static /* synthetic */ void access$3500(Service service, Documentation documentation) {
    }

    static /* synthetic */ void access$3600(Service service) {
    }

    static /* synthetic */ void access$3700(Service service, Backend backend) {
    }

    static /* synthetic */ void access$3800(Service service, Backend backend) {
    }

    static /* synthetic */ void access$3900(Service service) {
    }

    static /* synthetic */ void access$400(Service service, String str) {
    }

    static /* synthetic */ void access$4000(Service service, Http http) {
    }

    static /* synthetic */ void access$4100(Service service, Http http) {
    }

    static /* synthetic */ void access$4200(Service service) {
    }

    static /* synthetic */ void access$4300(Service service, Quota quota) {
    }

    static /* synthetic */ void access$4400(Service service, Quota quota) {
    }

    static /* synthetic */ void access$4500(Service service) {
    }

    static /* synthetic */ void access$4600(Service service, Authentication authentication) {
    }

    static /* synthetic */ void access$4700(Service service, Authentication authentication) {
    }

    static /* synthetic */ void access$4800(Service service) {
    }

    static /* synthetic */ void access$4900(Service service, Context context) {
    }

    static /* synthetic */ void access$500(Service service) {
    }

    static /* synthetic */ void access$5000(Service service, Context context) {
    }

    static /* synthetic */ void access$5100(Service service) {
    }

    static /* synthetic */ void access$5200(Service service, Usage usage) {
    }

    static /* synthetic */ void access$5300(Service service, Usage usage) {
    }

    static /* synthetic */ void access$5400(Service service) {
    }

    static /* synthetic */ void access$5500(Service service, int i, Endpoint endpoint) {
    }

    static /* synthetic */ void access$5600(Service service, Endpoint endpoint) {
    }

    static /* synthetic */ void access$5700(Service service, int i, Endpoint endpoint) {
    }

    static /* synthetic */ void access$5800(Service service, Iterable iterable) {
    }

    static /* synthetic */ void access$5900(Service service) {
    }

    static /* synthetic */ void access$600(Service service, ByteString byteString) {
    }

    static /* synthetic */ void access$6000(Service service, int i) {
    }

    static /* synthetic */ void access$6100(Service service, Control control) {
    }

    static /* synthetic */ void access$6200(Service service, Control control) {
    }

    static /* synthetic */ void access$6300(Service service) {
    }

    static /* synthetic */ void access$6400(Service service, int i, LogDescriptor logDescriptor) {
    }

    static /* synthetic */ void access$6500(Service service, LogDescriptor logDescriptor) {
    }

    static /* synthetic */ void access$6600(Service service, int i, LogDescriptor logDescriptor) {
    }

    static /* synthetic */ void access$6700(Service service, Iterable iterable) {
    }

    static /* synthetic */ void access$6800(Service service) {
    }

    static /* synthetic */ void access$6900(Service service, int i) {
    }

    static /* synthetic */ void access$700(Service service, String str) {
    }

    static /* synthetic */ void access$7000(Service service, int i, MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$7100(Service service, MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$7200(Service service, int i, MetricDescriptor metricDescriptor) {
    }

    static /* synthetic */ void access$7300(Service service, Iterable iterable) {
    }

    static /* synthetic */ void access$7400(Service service) {
    }

    static /* synthetic */ void access$7500(Service service, int i) {
    }

    static /* synthetic */ void access$7600(Service service, int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$7700(Service service, MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$7800(Service service, int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    static /* synthetic */ void access$7900(Service service, Iterable iterable) {
    }

    static /* synthetic */ void access$800(Service service) {
    }

    static /* synthetic */ void access$8000(Service service) {
    }

    static /* synthetic */ void access$8100(Service service, int i) {
    }

    static /* synthetic */ void access$8200(Service service, Billing billing) {
    }

    static /* synthetic */ void access$8300(Service service, Billing billing) {
    }

    static /* synthetic */ void access$8400(Service service) {
    }

    static /* synthetic */ void access$8500(Service service, Logging logging) {
    }

    static /* synthetic */ void access$8600(Service service, Logging logging) {
    }

    static /* synthetic */ void access$8700(Service service) {
    }

    static /* synthetic */ void access$8800(Service service, Monitoring monitoring) {
    }

    static /* synthetic */ void access$8900(Service service, Monitoring monitoring) {
    }

    static /* synthetic */ void access$900(Service service, ByteString byteString) {
    }

    static /* synthetic */ void access$9000(Service service) {
    }

    static /* synthetic */ void access$9100(Service service, SystemParameters systemParameters) {
    }

    static /* synthetic */ void access$9200(Service service, SystemParameters systemParameters) {
    }

    static /* synthetic */ void access$9300(Service service) {
    }

    static /* synthetic */ void access$9400(Service service, SourceInfo sourceInfo) {
    }

    static /* synthetic */ void access$9500(Service service, SourceInfo sourceInfo) {
    }

    static /* synthetic */ void access$9600(Service service) {
    }

    private void addAllApis(Iterable<? extends Api> iterable) {
    }

    private void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
    }

    private void addAllEnums(Iterable<? extends Enum> iterable) {
    }

    private void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
    }

    private void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
    }

    private void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
    }

    private void addAllTypes(Iterable<? extends Type> iterable) {
    }

    private void addApis(Api api) {
    }

    private void addEndpoints(Endpoint endpoint) {
    }

    private void addEnums(Enum r2) {
    }

    private void addLogs(LogDescriptor logDescriptor) {
    }

    private void addMetrics(MetricDescriptor metricDescriptor) {
    }

    private void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    private void addTypes(Type type) {
    }

    private void clearApis() {
    }

    private void clearAuthentication() {
    }

    private void clearBackend() {
    }

    private void clearBilling() {
    }

    private void clearConfigVersion() {
    }

    private void clearContext() {
    }

    private void clearControl() {
    }

    private void clearDocumentation() {
    }

    private void clearEndpoints() {
    }

    private void clearEnums() {
    }

    private void clearHttp() {
    }

    private void clearId() {
    }

    private void clearLogging() {
    }

    private void clearLogs() {
    }

    private void clearMetrics() {
    }

    private void clearMonitoredResources() {
    }

    private void clearMonitoring() {
    }

    private void clearName() {
    }

    private void clearProducerProjectId() {
    }

    private void clearQuota() {
    }

    private void clearSourceInfo() {
    }

    private void clearSystemParameters() {
    }

    private void clearTitle() {
    }

    private void clearTypes() {
    }

    private void clearUsage() {
    }

    private void ensureApisIsMutable() {
    }

    private void ensureEndpointsIsMutable() {
    }

    private void ensureEnumsIsMutable() {
    }

    private void ensureLogsIsMutable() {
    }

    private void ensureMetricsIsMutable() {
    }

    private void ensureMonitoredResourcesIsMutable() {
    }

    private void ensureTypesIsMutable() {
    }

    public static Service getDefaultInstance() {
    }

    private void mergeAuthentication(Authentication authentication) {
    }

    private void mergeBackend(Backend backend) {
    }

    private void mergeBilling(Billing billing) {
    }

    private void mergeConfigVersion(UInt32Value uInt32Value) {
    }

    private void mergeContext(Context context) {
    }

    private void mergeControl(Control control) {
    }

    private void mergeDocumentation(Documentation documentation) {
    }

    private void mergeHttp(Http http) {
    }

    private void mergeLogging(Logging logging) {
    }

    private void mergeMonitoring(Monitoring monitoring) {
    }

    private void mergeQuota(Quota quota) {
    }

    private void mergeSourceInfo(SourceInfo sourceInfo) {
    }

    private void mergeSystemParameters(SystemParameters systemParameters) {
    }

    private void mergeUsage(Usage usage) {
    }

    public static Builder newBuilder() {
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
    }

    public static Parser<Service> parser() {
    }

    private void removeApis(int i) {
    }

    private void removeEndpoints(int i) {
    }

    private void removeEnums(int i) {
    }

    private void removeLogs(int i) {
    }

    private void removeMetrics(int i) {
    }

    private void removeMonitoredResources(int i) {
    }

    private void removeTypes(int i) {
    }

    private void setApis(int i, Api api) {
    }

    private void setAuthentication(Authentication authentication) {
    }

    private void setBackend(Backend backend) {
    }

    private void setBilling(Billing billing) {
    }

    private void setConfigVersion(UInt32Value uInt32Value) {
    }

    private void setContext(Context context) {
    }

    private void setControl(Control control) {
    }

    private void setDocumentation(Documentation documentation) {
    }

    private void setEndpoints(int i, Endpoint endpoint) {
    }

    private void setEnums(int i, Enum r3) {
    }

    private void setHttp(Http http) {
    }

    private void setId(String str) {
    }

    private void setIdBytes(ByteString byteString) {
    }

    private void setLogging(Logging logging) {
    }

    private void setLogs(int i, LogDescriptor logDescriptor) {
    }

    private void setMetrics(int i, MetricDescriptor metricDescriptor) {
    }

    private void setMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    private void setMonitoring(Monitoring monitoring) {
    }

    private void setName(String str) {
    }

    private void setNameBytes(ByteString byteString) {
    }

    private void setProducerProjectId(String str) {
    }

    private void setProducerProjectIdBytes(ByteString byteString) {
    }

    private void setQuota(Quota quota) {
    }

    private void setSourceInfo(SourceInfo sourceInfo) {
    }

    private void setSystemParameters(SystemParameters systemParameters) {
    }

    private void setTitle(String str) {
    }

    private void setTitleBytes(ByteString byteString) {
    }

    private void setTypes(int i, Type type) {
    }

    private void setUsage(Usage usage) {
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Api getApis(int i) {
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getApisCount() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Api> getApisList() {
    }

    public ApiOrBuilder getApisOrBuilder(int i) {
    }

    public List<? extends ApiOrBuilder> getApisOrBuilderList() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Authentication getAuthentication() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Backend getBackend() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Billing getBilling() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public UInt32Value getConfigVersion() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Context getContext() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Control getControl() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Documentation getDocumentation() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Endpoint getEndpoints(int i) {
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getEndpointsCount() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Endpoint> getEndpointsList() {
    }

    public EndpointOrBuilder getEndpointsOrBuilder(int i) {
    }

    public List<? extends EndpointOrBuilder> getEndpointsOrBuilderList() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Enum getEnums(int i) {
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getEnumsCount() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Enum> getEnumsList() {
    }

    public EnumOrBuilder getEnumsOrBuilder(int i) {
    }

    public List<? extends EnumOrBuilder> getEnumsOrBuilderList() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Http getHttp() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getId() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getIdBytes() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Logging getLogging() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public LogDescriptor getLogs(int i) {
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getLogsCount() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<LogDescriptor> getLogsList() {
    }

    public LogDescriptorOrBuilder getLogsOrBuilder(int i) {
    }

    public List<? extends LogDescriptorOrBuilder> getLogsOrBuilderList() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public MetricDescriptor getMetrics(int i) {
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getMetricsCount() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<MetricDescriptor> getMetricsList() {
    }

    public MetricDescriptorOrBuilder getMetricsOrBuilder(int i) {
    }

    public List<? extends MetricDescriptorOrBuilder> getMetricsOrBuilderList() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public MonitoredResourceDescriptor getMonitoredResources(int i) {
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getMonitoredResourcesCount() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
    }

    public MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int i) {
    }

    public List<? extends MonitoredResourceDescriptorOrBuilder> getMonitoredResourcesOrBuilderList() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Monitoring getMonitoring() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getName() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getNameBytes() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getProducerProjectId() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getProducerProjectIdBytes() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Quota getQuota() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public SourceInfo getSourceInfo() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public SystemParameters getSystemParameters() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public String getTitle() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public ByteString getTitleBytes() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Type getTypes(int i) {
    }

    @Override // com.google.api.ServiceOrBuilder
    public int getTypesCount() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public List<Type> getTypesList() {
    }

    public TypeOrBuilder getTypesOrBuilder(int i) {
    }

    public List<? extends TypeOrBuilder> getTypesOrBuilderList() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public Usage getUsage() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasAuthentication() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasBackend() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasBilling() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasConfigVersion() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasContext() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasControl() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasDocumentation() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasHttp() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasLogging() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasMonitoring() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasQuota() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasSourceInfo() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasSystemParameters() {
    }

    @Override // com.google.api.ServiceOrBuilder
    public boolean hasUsage() {
    }

    public static Builder newBuilder(Service service) {
    }

    public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Service parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
    }

    private void addApis(int i, Api api) {
    }

    private void addEndpoints(int i, Endpoint endpoint) {
    }

    private void addEnums(int i, Enum r3) {
    }

    private void addLogs(int i, LogDescriptor logDescriptor) {
    }

    private void addMetrics(int i, MetricDescriptor metricDescriptor) {
    }

    private void addMonitoredResources(int i, MonitoredResourceDescriptor monitoredResourceDescriptor) {
    }

    private void addTypes(int i, Type type) {
    }

    public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Service parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
    }

    public static Service parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
    }

    public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }

    public static Service parseFrom(CodedInputStream codedInputStream) throws IOException {
    }

    public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
    }
}
