package org.apache.xerces.impl.xpath.regex;

import java.util.Hashtable;
import java.util.Locale;

/* loaded from: /private/tmp/frida_dump/dex_pulled/00O000ll111l_2.dex */
class ParserForXMLSchema extends RegexParser {
    private static final String DIGITS = "09٠٩۰۹०९০৯੦੯૦૯୦୯௧௯౦౯೦೯൦൯๐๙໐໙༠༩";
    private static final String LETTERS = "AZazÀÖØöøıĴľŁňŊžƀǃǍǰǴǵǺȗɐʨʻˁΆΆΈΊΌΌΎΡΣώϐϖϚϚϜϜϞϞϠϠϢϳЁЌЎяёќўҁҐӄӇӈӋӌӐӫӮӵӸӹԱՖՙՙաֆאתװײءغفيٱڷںھۀێېۓەەۥۦअहऽऽक़ॡঅঌএঐওনপরললশহড়ঢ়য়ৡৰৱਅਊਏਐਓਨਪਰਲਲ਼ਵਸ਼ਸਹਖ਼ੜਫ਼ਫ਼ੲੴઅઋઍઍએઑઓનપરલળવહઽઽૠૠଅଌଏଐଓନପରଲଳଶହଽଽଡ଼ଢ଼ୟୡஅஊஎஐஒகஙசஜஜஞடணதநபமவஷஹఅఌఎఐఒనపళవహౠౡಅಌಎಐಒನಪಳವಹೞೞೠೡഅഌഎഐഒനപഹൠൡกฮะะาำเๅກຂຄຄງຈຊຊຍຍດທນຟມຣລລວວສຫອຮະະາຳຽຽເໄཀཇཉཀྵႠჅაჶᄀᄀᄂᄃᄅᄇᄉᄉᄋᄌᄎᄒᄼᄼᄾᄾᅀᅀᅌᅌᅎᅎᅐᅐᅔᅕᅙᅙᅟᅡᅣᅣᅥᅥᅧᅧᅩᅩᅭᅮᅲᅳᅵᅵᆞᆞᆨᆨᆫᆫᆮᆯᆷᆸᆺᆺᆼᇂᇫᇫᇰᇰᇹᇹḀẛẠỹἀἕἘἝἠὅὈὍὐὗὙὙὛὛὝὝὟώᾀᾴᾶᾼιιῂῄῆῌῐΐῖΊῠῬῲῴῶῼΩΩKÅ℮℮ↀↂ〇〇〡〩ぁゔァヺㄅㄬ一龥가힣";
    private static final String NAMECHARS = "-.0:AZ__az··ÀÖØöøıĴľŁňŊžƀǃǍǰǴǵǺȗɐʨʻˁːˑ̀͠͡ͅΆΊΌΌΎΡΣώϐϖϚϚϜϜϞϞϠϠϢϳЁЌЎяёќўҁ҃҆ҐӄӇӈӋӌӐӫӮӵӸӹԱՖՙՙաֆֹֻֽֿֿׁׂ֑֣֡ׄׄאתװײءغـْ٠٩ٰڷںھۀێېۓە۪ۭۨ۰۹ँःअह़्॑॔क़ॣ०९ঁঃঅঌএঐওনপরললশহ়়াৄেৈো্ৗৗড়ঢ়য়ৣ০ৱਂਂਅਊਏਐਓਨਪਰਲਲ਼ਵਸ਼ਸਹ਼਼ਾੂੇੈੋ੍ਖ਼ੜਫ਼ਫ਼੦ੴઁઃઅઋઍઍએઑઓનપરલળવહ઼ૅેૉો્ૠૠ૦૯ଁଃଅଌଏଐଓନପରଲଳଶହ଼ୃେୈୋ୍ୖୗଡ଼ଢ଼ୟୡ୦୯ஂஃஅஊஎஐஒகஙசஜஜஞடணதநபமவஷஹாூெைொ்ௗௗ௧௯ఁఃఅఌఎఐఒనపళవహాౄెైొ్ౕౖౠౡ౦౯ಂಃಅಌಎಐಒನಪಳವಹಾೄೆೈೊ್ೕೖೞೞೠೡ೦೯ംഃഅഌഎഐഒനപഹാൃെൈൊ്ൗൗൠൡ൦൯กฮะฺเ๎๐๙ກຂຄຄງຈຊຊຍຍດທນຟມຣລລວວສຫອຮະູົຽເໄໆໆ່ໍ໐໙༘༙༠༩༹༹༵༵༷༷༾ཇཉཀྵ྄ཱ྆ྋྐྕྗྗྙྭྱྷྐྵྐྵႠჅაჶᄀᄀᄂᄃᄅᄇᄉᄉᄋᄌᄎᄒᄼᄼᄾᄾᅀᅀᅌᅌᅎᅎᅐᅐᅔᅕᅙᅙᅟᅡᅣᅣᅥᅥᅧᅧᅩᅩᅭᅮᅲᅳᅵᅵᆞᆞᆨᆨᆫᆫᆮᆯᆷᆸᆺᆺᆼᇂᇫᇫᇰᇰᇹᇹḀẛẠỹἀἕἘἝἠὅὈὍὐὗὙὙὛὛὝὝὟώᾀᾴᾶᾼιιῂῄῆῌῐΐῖΊῠῬῲῴῶῼ⃐⃜⃡⃡ΩΩKÅ℮℮ↀↂ々々〇〇〡〯〱〵ぁゔ゙゚ゝゞァヺーヾㄅㄬ一龥가힣";
    private static final String SPACES = "\t\n\r\r  ";
    private static Hashtable ranges;
    private static Hashtable ranges2;

    public ParserForXMLSchema() {
    }

    protected static synchronized RangeToken getRange(String str, boolean z) {
    }

    static void setupRange(Token token, String str) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    boolean checkQuestion(int i) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    int decodeEscaped() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token getTokenForShorthand(int i) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    protected RangeToken parseCharacterClass(boolean z) throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    protected RangeToken parseSetOperations() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBackreference() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_A() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_B() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_C() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_I() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_X() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_Z() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_b() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_c() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_g() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_gt() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_i() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_lt() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processBacksolidus_z() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    int processCIinCharacterClass(RangeToken rangeToken, int i) {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processCaret() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processCondition() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processDollar() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processIndependent() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processLookahead() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processLookbehind() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processModifiers() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processNegativelookahead() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processNegativelookbehind() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processParen() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processParen2() throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processPlus(Token token) throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processQuestion(Token token) throws ParseException {
    }

    @Override // org.apache.xerces.impl.xpath.regex.RegexParser
    Token processStar(Token token) throws ParseException {
    }

    public ParserForXMLSchema(Locale locale) {
    }
}
