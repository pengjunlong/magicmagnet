package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multimap;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_1.dex */
public final class MediaType {
    public static final MediaType AAC_AUDIO = null;
    public static final MediaType ANY_APPLICATION_TYPE = null;
    public static final MediaType ANY_AUDIO_TYPE = null;
    public static final MediaType ANY_FONT_TYPE = null;
    public static final MediaType ANY_IMAGE_TYPE = null;
    public static final MediaType ANY_TEXT_TYPE = null;
    public static final MediaType ANY_TYPE = null;
    public static final MediaType ANY_VIDEO_TYPE = null;
    public static final MediaType APPLE_MOBILE_CONFIG = null;
    public static final MediaType APPLE_PASSBOOK = null;
    public static final MediaType APPLICATION_BINARY = null;
    private static final String APPLICATION_TYPE = "application";
    public static final MediaType APPLICATION_XML_UTF_8 = null;
    public static final MediaType ATOM_UTF_8 = null;
    private static final String AUDIO_TYPE = "audio";
    public static final MediaType BASIC_AUDIO = null;
    public static final MediaType BMP = null;
    public static final MediaType BZIP2 = null;
    public static final MediaType CACHE_MANIFEST_UTF_8 = null;
    private static final String CHARSET_ATTRIBUTE = "charset";
    public static final MediaType CRW = null;
    public static final MediaType CSS_UTF_8 = null;
    public static final MediaType CSV_UTF_8 = null;
    public static final MediaType DART_UTF_8 = null;
    public static final MediaType EOT = null;
    public static final MediaType EPUB = null;
    public static final MediaType FLV_VIDEO = null;
    public static final MediaType FONT_COLLECTION = null;
    public static final MediaType FONT_OTF = null;
    public static final MediaType FONT_SFNT = null;
    public static final MediaType FONT_TTF = null;
    private static final String FONT_TYPE = "font";
    public static final MediaType FONT_WOFF = null;
    public static final MediaType FONT_WOFF2 = null;
    public static final MediaType FORM_DATA = null;
    public static final MediaType GEO_JSON = null;
    public static final MediaType GIF = null;
    public static final MediaType GZIP = null;
    public static final MediaType HAL_JSON = null;
    public static final MediaType HEIF = null;
    public static final MediaType HTML_UTF_8 = null;
    public static final MediaType ICO = null;
    private static final String IMAGE_TYPE = "image";
    public static final MediaType I_CALENDAR_UTF_8 = null;
    public static final MediaType JAVASCRIPT_UTF_8 = null;
    public static final MediaType JOSE = null;
    public static final MediaType JOSE_JSON = null;
    public static final MediaType JP2K = null;
    public static final MediaType JPEG = null;
    public static final MediaType JSON_UTF_8 = null;
    public static final MediaType KEY_ARCHIVE = null;
    public static final MediaType KML = null;
    public static final MediaType KMZ = null;
    private static final Map<MediaType, MediaType> KNOWN_TYPES = null;
    public static final MediaType L16_AUDIO = null;
    public static final MediaType L24_AUDIO = null;
    private static final CharMatcher LINEAR_WHITE_SPACE = null;
    public static final MediaType MANIFEST_JSON_UTF_8 = null;
    public static final MediaType MBOX = null;
    public static final MediaType MEDIA_PRESENTATION_DESCRIPTION = null;
    public static final MediaType MICROSOFT_EXCEL = null;
    public static final MediaType MICROSOFT_OUTLOOK = null;
    public static final MediaType MICROSOFT_POWERPOINT = null;
    public static final MediaType MICROSOFT_WORD = null;
    public static final MediaType MP4_AUDIO = null;
    public static final MediaType MP4_VIDEO = null;
    public static final MediaType MPEG_AUDIO = null;
    public static final MediaType MPEG_VIDEO = null;
    public static final MediaType NACL_APPLICATION = null;
    public static final MediaType NACL_PORTABLE_APPLICATION = null;
    public static final MediaType OCTET_STREAM = null;
    public static final MediaType OGG_AUDIO = null;
    public static final MediaType OGG_CONTAINER = null;
    public static final MediaType OGG_VIDEO = null;
    public static final MediaType OOXML_DOCUMENT = null;
    public static final MediaType OOXML_PRESENTATION = null;
    public static final MediaType OOXML_SHEET = null;
    public static final MediaType OPENDOCUMENT_GRAPHICS = null;
    public static final MediaType OPENDOCUMENT_PRESENTATION = null;
    public static final MediaType OPENDOCUMENT_SPREADSHEET = null;
    public static final MediaType OPENDOCUMENT_TEXT = null;
    public static final MediaType OPENSEARCH_DESCRIPTION_UTF_8 = null;
    private static final Joiner.MapJoiner PARAMETER_JOINER = null;
    public static final MediaType PDF = null;
    public static final MediaType PLAIN_TEXT_UTF_8 = null;
    public static final MediaType PNG = null;
    public static final MediaType POSTSCRIPT = null;
    public static final MediaType PROTOBUF = null;
    public static final MediaType PSD = null;
    public static final MediaType QUICKTIME = null;
    private static final CharMatcher QUOTED_TEXT_MATCHER = null;
    public static final MediaType RDF_XML_UTF_8 = null;
    public static final MediaType RTF_UTF_8 = null;
    public static final MediaType SFNT = null;
    public static final MediaType SHOCKWAVE_FLASH = null;
    public static final MediaType SKETCHUP = null;
    public static final MediaType SOAP_XML_UTF_8 = null;
    public static final MediaType SVG_UTF_8 = null;
    public static final MediaType TAR = null;
    public static final MediaType TEXT_JAVASCRIPT_UTF_8 = null;
    private static final String TEXT_TYPE = "text";
    public static final MediaType THREE_GPP2_VIDEO = null;
    public static final MediaType THREE_GPP_VIDEO = null;
    public static final MediaType TIFF = null;
    private static final CharMatcher TOKEN_MATCHER = null;
    public static final MediaType TSV_UTF_8 = null;
    private static final ImmutableListMultimap<String, String> UTF_8_CONSTANT_PARAMETERS = null;
    public static final MediaType VCARD_UTF_8 = null;
    private static final String VIDEO_TYPE = "video";
    public static final MediaType VND_REAL_AUDIO = null;
    public static final MediaType VND_WAVE_AUDIO = null;
    public static final MediaType VORBIS_AUDIO = null;
    public static final MediaType VTT_UTF_8 = null;
    public static final MediaType WASM_APPLICATION = null;
    public static final MediaType WAX_AUDIO = null;
    public static final MediaType WEBM_AUDIO = null;
    public static final MediaType WEBM_VIDEO = null;
    public static final MediaType WEBP = null;
    private static final String WILDCARD = "*";
    public static final MediaType WMA_AUDIO = null;
    public static final MediaType WML_UTF_8 = null;
    public static final MediaType WMV = null;
    public static final MediaType WOFF = null;
    public static final MediaType WOFF2 = null;
    public static final MediaType XHTML_UTF_8 = null;
    public static final MediaType XML_UTF_8 = null;
    public static final MediaType XRD_UTF_8 = null;
    public static final MediaType ZIP = null;

    @LazyInit
    private int hashCode;
    private final ImmutableListMultimap<String, String> parameters;

    @LazyInit
    private Optional<Charset> parsedCharset;
    private final String subtype;

    @LazyInit
    private String toString;
    private final String type;

    /* renamed from: com.google.common.net.MediaType$1 */
    class C09571 implements Function<Collection<String>, ImmutableMultiset<String>> {
        C09571(MediaType mediaType) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ ImmutableMultiset<String> apply(Collection<String> collection) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public ImmutableMultiset<String> apply2(Collection<String> collection) {
        }
    }

    /* renamed from: com.google.common.net.MediaType$2 */
    class C09582 implements Function<String, String> {
        C09582(MediaType mediaType) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ String apply(String str) {
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        public String apply2(String str) {
        }
    }

    private MediaType(String str, String str2, ImmutableListMultimap<String, String> immutableListMultimap) {
    }

    static /* synthetic */ CharMatcher access$000() {
    }

    static /* synthetic */ String access$100(String str) {
    }

    private static MediaType addKnownType(MediaType mediaType) {
    }

    private String computeToString() {
    }

    public static MediaType create(String str, String str2) {
    }

    static MediaType createApplicationType(String str) {
    }

    static MediaType createAudioType(String str) {
    }

    private static MediaType createConstant(String str, String str2) {
    }

    private static MediaType createConstantUtf8(String str, String str2) {
    }

    static MediaType createFontType(String str) {
    }

    static MediaType createImageType(String str) {
    }

    static MediaType createTextType(String str) {
    }

    static MediaType createVideoType(String str) {
    }

    private static String escapeAndQuote(String str) {
    }

    private static String normalizeParameterValue(String str, String str2) {
    }

    private static String normalizeToken(String str) {
    }

    private Map<String, ImmutableMultiset<String>> parametersAsMap() {
    }

    public static MediaType parse(String str) {
    }

    public Optional<Charset> charset() {
    }

    public boolean equals(Object obj) {
    }

    public boolean hasWildcard() {
    }

    public int hashCode() {
    }

    public boolean is(MediaType mediaType) {
    }

    public ImmutableListMultimap<String, String> parameters() {
    }

    public String subtype() {
    }

    public String toString() {
    }

    public String type() {
    }

    public MediaType withCharset(Charset charset) {
    }

    public MediaType withParameter(String str, String str2) {
    }

    public MediaType withParameters(Multimap<String, String> multimap) {
    }

    public MediaType withoutParameters() {
    }

    public MediaType withParameters(String str, Iterable<String> iterable) {
    }

    private static MediaType create(String str, String str2, Multimap<String, String> multimap) {
    }

    private static final class Tokenizer {
        final String input;
        int position;

        Tokenizer(String str) {
        }

        char consumeCharacter(CharMatcher charMatcher) {
        }

        String consumeToken(CharMatcher charMatcher) {
        }

        String consumeTokenIfPresent(CharMatcher charMatcher) {
        }

        boolean hasMore() {
        }

        char previewChar() {
        }

        char consumeCharacter(char c) {
        }
    }
}
