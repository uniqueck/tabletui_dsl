package org.ckr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTabletUIDSLLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalTabletUIDSLLexer() {;} 
    public InternalTabletUIDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTabletUIDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTabletUIDSL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:11:7: ( 'settings' )
            // InternalTabletUIDSL.g:11:9: 'settings'
            {
            match("settings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:12:7: ( 'title' )
            // InternalTabletUIDSL.g:12:9: 'title'
            {
            match("title"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:13:7: ( 'fhemweb_url' )
            // InternalTabletUIDSL.g:13:9: 'fhemweb_url'
            {
            match("fhemweb_url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:14:7: ( 'width' )
            // InternalTabletUIDSL.g:14:9: 'width'
            {
            match("width"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:15:7: ( 'height' )
            // InternalTabletUIDSL.g:15:9: 'height'
            {
            match("height"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:16:7: ( 'columns' )
            // InternalTabletUIDSL.g:16:9: 'columns'
            {
            match("columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:17:7: ( 'rows' )
            // InternalTabletUIDSL.g:17:9: 'rows'
            {
            match("rows"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:18:7: ( 'debug' )
            // InternalTabletUIDSL.g:18:9: 'debug'
            {
            match("debug"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:19:7: ( 'drag&drop' )
            // InternalTabletUIDSL.g:19:9: 'drag&drop'
            {
            match("drag&drop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:20:7: ( 'gridster_margin' )
            // InternalTabletUIDSL.g:20:9: 'gridster_margin'
            {
            match("gridster_margin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:21:7: ( 'css' )
            // InternalTabletUIDSL.g:21:9: 'css'
            {
            match("css"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:22:7: ( 'true' )
            // InternalTabletUIDSL.g:22:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:23:7: ( 'false' )
            // InternalTabletUIDSL.g:23:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:24:7: ( '{' )
            // InternalTabletUIDSL.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:25:7: ( 'screensaver' )
            // InternalTabletUIDSL.g:25:9: 'screensaver'
            {
            match("screensaver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:26:7: ( '}' )
            // InternalTabletUIDSL.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:27:7: ( 'template' )
            // InternalTabletUIDSL.g:27:9: 'template'
            {
            match("template"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:28:7: ( 'header' )
            // InternalTabletUIDSL.g:28:9: 'header'
            {
            match("header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:29:7: ( 'row' )
            // InternalTabletUIDSL.g:29:9: 'row'
            {
            match("row"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:30:7: ( 'column' )
            // InternalTabletUIDSL.g:30:9: 'column'
            {
            match("column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:31:7: ( 'colspan' )
            // InternalTabletUIDSL.g:31:9: 'colspan'
            {
            match("colspan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:32:7: ( 'rowspan' )
            // InternalTabletUIDSL.g:32:9: 'rowspan'
            {
            match("rowspan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:33:7: ( 'class' )
            // InternalTabletUIDSL.g:33:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:34:7: ( 'style' )
            // InternalTabletUIDSL.g:34:9: 'style'
            {
            match("style"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:35:7: ( 'clock' )
            // InternalTabletUIDSL.g:35:9: 'clock'
            {
            match("clock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:36:7: ( 'format' )
            // InternalTabletUIDSL.g:36:9: 'format'
            {
            match("format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:37:7: ( 'interval' )
            // InternalTabletUIDSL.g:37:9: 'interval'
            {
            match("interval"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:38:7: ( 'days' )
            // InternalTabletUIDSL.g:38:9: 'days'
            {
            match("days"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:39:7: ( 'shortday-length' )
            // InternalTabletUIDSL.g:39:9: 'shortday-length'
            {
            match("shortday-length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:40:7: ( 'months' )
            // InternalTabletUIDSL.g:40:9: 'months'
            {
            match("months"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:41:7: ( 'shortmonth-length' )
            // InternalTabletUIDSL.g:41:9: 'shortmonth-length'
            {
            match("shortmonth-length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:42:7: ( 'swiper' )
            // InternalTabletUIDSL.g:42:9: 'swiper'
            {
            match("swiper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:43:7: ( 'autoplay' )
            // InternalTabletUIDSL.g:43:9: 'autoplay'
            {
            match("autoplay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:44:7: ( 'template-ref' )
            // InternalTabletUIDSL.g:44:9: 'template-ref'
            {
            match("template-ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:45:7: ( 'select' )
            // InternalTabletUIDSL.g:45:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:46:7: ( 'list' )
            // InternalTabletUIDSL.g:46:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:47:7: ( 'items' )
            // InternalTabletUIDSL.g:47:9: 'items'
            {
            match("items"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:48:7: ( 'alias' )
            // InternalTabletUIDSL.g:48:9: 'alias'
            {
            match("alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:49:7: ( 'cmd' )
            // InternalTabletUIDSL.g:49:9: 'cmd'
            {
            match("cmd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:50:7: ( 'quote' )
            // InternalTabletUIDSL.g:50:9: 'quote'
            {
            match("quote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:51:7: ( 'get' )
            // InternalTabletUIDSL.g:51:9: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:52:7: ( 'set' )
            // InternalTabletUIDSL.g:52:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:53:7: ( 'volume' )
            // InternalTabletUIDSL.g:53:9: 'volume'
            {
            match("volume"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:54:7: ( 'min' )
            // InternalTabletUIDSL.g:54:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:55:7: ( 'max' )
            // InternalTabletUIDSL.g:55:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:56:7: ( 'push' )
            // InternalTabletUIDSL.g:56:9: 'push'
            {
            match("push"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:57:7: ( 'set-on' )
            // InternalTabletUIDSL.g:57:9: 'set-on'
            {
            match("set-on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:58:7: ( 'icon' )
            // InternalTabletUIDSL.g:58:9: 'icon'
            {
            match("icon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:59:7: ( 'background-icon' )
            // InternalTabletUIDSL.g:59:9: 'background-icon'
            {
            match("background-icon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:60:7: ( 'doubleClick' )
            // InternalTabletUIDSL.g:60:9: 'doubleClick'
            {
            match("doubleClick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:61:7: ( 'countdown' )
            // InternalTabletUIDSL.g:61:9: 'countdown'
            {
            match("countdown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:62:7: ( 'url' )
            // InternalTabletUIDSL.g:62:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:63:7: ( 'image' )
            // InternalTabletUIDSL.g:63:9: 'image'
            {
            match("image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:64:7: ( 'size' )
            // InternalTabletUIDSL.g:64:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:65:7: ( 'switch' )
            // InternalTabletUIDSL.g:65:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:66:7: ( 'getOn' )
            // InternalTabletUIDSL.g:66:9: 'getOn'
            {
            match("getOn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:67:7: ( 'setOn' )
            // InternalTabletUIDSL.g:67:9: 'setOn'
            {
            match("setOn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:68:7: ( 'getOff' )
            // InternalTabletUIDSL.g:68:9: 'getOff'
            {
            match("getOff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:69:7: ( 'onColor' )
            // InternalTabletUIDSL.g:69:9: 'onColor'
            {
            match("onColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:70:7: ( 'offColor' )
            // InternalTabletUIDSL.g:70:9: 'offColor'
            {
            match("offColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:71:7: ( 'background-on-color' )
            // InternalTabletUIDSL.g:71:9: 'background-on-color'
            {
            match("background-on-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:72:7: ( 'custom' )
            // InternalTabletUIDSL.g:72:9: 'custom'
            {
            match("custom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:73:7: ( 'div' )
            // InternalTabletUIDSL.g:73:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:74:7: ( 'itunes_artwork' )
            // InternalTabletUIDSL.g:74:9: 'itunes_artwork'
            {
            match("itunes_artwork"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:75:7: ( 'opacity' )
            // InternalTabletUIDSL.g:75:9: 'opacity'
            {
            match("opacity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:76:7: ( 'weather' )
            // InternalTabletUIDSL.g:76:9: 'weather'
            {
            match("weather"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:77:7: ( 'imageset' )
            // InternalTabletUIDSL.g:77:9: 'imageset'
            {
            match("imageset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:78:7: ( 'image-path' )
            // InternalTabletUIDSL.g:78:9: 'image-path'
            {
            match("image-path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:79:7: ( 'meteocons' )
            // InternalTabletUIDSL.g:79:9: 'meteocons'
            {
            match("meteocons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:80:7: ( 'kleinklima' )
            // InternalTabletUIDSL.g:80:9: 'kleinklima'
            {
            match("kleinklima"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:81:7: ( 'reading' )
            // InternalTabletUIDSL.g:81:9: 'reading'
            {
            match("reading"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:82:7: ( 'calview' )
            // InternalTabletUIDSL.g:82:9: 'calview'
            {
            match("calview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:83:7: ( 'all-forecast-color' )
            // InternalTabletUIDSL.g:83:9: 'all-forecast-color'
            {
            match("all-forecast-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:84:7: ( 'all-today-color' )
            // InternalTabletUIDSL.g:84:9: 'all-today-color'
            {
            match("all-today-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:85:7: ( 'popup' )
            // InternalTabletUIDSL.g:85:9: 'popup'
            {
            match("popup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:86:7: ( 'openIcon' )
            // InternalTabletUIDSL.g:86:9: 'openIcon'
            {
            match("openIcon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:87:7: ( 'openBackgroundIcon' )
            // InternalTabletUIDSL.g:87:9: 'openBackgroundIcon'
            {
            match("openBackgroundIcon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:88:7: ( 'openClass' )
            // InternalTabletUIDSL.g:88:9: 'openClass'
            {
            match("openClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:89:7: ( 'dialogClass' )
            // InternalTabletUIDSL.g:89:9: 'dialogClass'
            {
            match("dialogClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:90:7: ( 'dialogHeaderClass' )
            // InternalTabletUIDSL.g:90:9: 'dialogHeaderClass'
            {
            match("dialogHeaderClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:91:7: ( 'link' )
            // InternalTabletUIDSL.g:91:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:92:7: ( 'color' )
            // InternalTabletUIDSL.g:92:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:93:7: ( 'backgroundColor' )
            // InternalTabletUIDSL.g:93:9: 'backgroundColor'
            {
            match("backgroundColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:94:7: ( 'label' )
            // InternalTabletUIDSL.g:94:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:95:7: ( 'page' )
            // InternalTabletUIDSL.g:95:9: 'page'
            {
            match("page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:96:7: ( 'fhem-cmd' )
            // InternalTabletUIDSL.g:96:9: 'fhem-cmd'
            {
            match("fhem-cmd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:97:7: ( 'button' )
            // InternalTabletUIDSL.g:97:9: 'button'
            {
            match("button"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:98:7: ( 'getWarn' )
            // InternalTabletUIDSL.g:98:9: 'getWarn'
            {
            match("getWarn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:99:7: ( 'on-color' )
            // InternalTabletUIDSL.g:99:9: 'on-color'
            {
            match("on-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:100:8: ( 'on-background-color' )
            // InternalTabletUIDSL.g:100:10: 'on-background-color'
            {
            match("on-background-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:101:8: ( 'off-color' )
            // InternalTabletUIDSL.g:101:10: 'off-color'
            {
            match("off-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:102:8: ( 'off-background-color' )
            // InternalTabletUIDSL.g:102:10: 'off-background-color'
            {
            match("off-background-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:103:8: ( 'klimatrend' )
            // InternalTabletUIDSL.g:103:10: 'klimatrend'
            {
            match("klimatrend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:104:8: ( 'refperiod' )
            // InternalTabletUIDSL.g:104:10: 'refperiod'
            {
            match("refperiod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:105:8: ( 'stagnatingColor' )
            // InternalTabletUIDSL.g:105:10: 'stagnatingColor'
            {
            match("stagnatingColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:106:8: ( 'risingColor' )
            // InternalTabletUIDSL.g:106:10: 'risingColor'
            {
            match("risingColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:107:8: ( 'fallingColor' )
            // InternalTabletUIDSL.g:107:10: 'fallingColor'
            {
            match("fallingColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:108:8: ( 'highmark' )
            // InternalTabletUIDSL.g:108:10: 'highmark'
            {
            match("highmark"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:109:8: ( 'highmarkIcon' )
            // InternalTabletUIDSL.g:109:10: 'highmarkIcon'
            {
            match("highmarkIcon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:110:8: ( 'highmarkRisingColor' )
            // InternalTabletUIDSL.g:110:10: 'highmarkRisingColor'
            {
            match("highmarkRisingColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:111:8: ( 'highmarkFallingColor' )
            // InternalTabletUIDSL.g:111:10: 'highmarkFallingColor'
            {
            match("highmarkFallingColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:112:8: ( 'symbol' )
            // InternalTabletUIDSL.g:112:10: 'symbol'
            {
            match("symbol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:113:8: ( 'icons' )
            // InternalTabletUIDSL.g:113:10: 'icons'
            {
            match("icons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:114:8: ( 'onColors' )
            // InternalTabletUIDSL.g:114:10: 'onColors'
            {
            match("onColors"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:115:8: ( 'onBackgroundColors' )
            // InternalTabletUIDSL.g:115:10: 'onBackgroundColors'
            {
            match("onBackgroundColors"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:116:8: ( 'SimpleClock' )
            // InternalTabletUIDSL.g:116:10: 'SimpleClock'
            {
            match("SimpleClock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:117:8: ( 'date-format' )
            // InternalTabletUIDSL.g:117:10: 'date-format'
            {
            match("date-format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:118:8: ( 'time-format' )
            // InternalTabletUIDSL.g:118:10: 'time-format'
            {
            match("time-format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:119:8: ( 'date-color' )
            // InternalTabletUIDSL.g:119:10: 'date-color'
            {
            match("date-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:120:8: ( 'time-color' )
            // InternalTabletUIDSL.g:120:10: 'time-color'
            {
            match("time-color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:121:8: ( 'bg-colors' )
            // InternalTabletUIDSL.g:121:10: 'bg-colors'
            {
            match("bg-colors"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:122:8: ( 'simpleChart' )
            // InternalTabletUIDSL.g:122:10: 'simpleChart'
            {
            match("simpleChart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:123:8: ( 'log-config' )
            // InternalTabletUIDSL.g:123:10: 'log-config'
            {
            match("log-config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:124:8: ( 'columnSpec' )
            // InternalTabletUIDSL.g:124:10: 'columnSpec'
            {
            match("columnSpec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:125:8: ( 'minValue' )
            // InternalTabletUIDSL.g:125:10: 'minValue'
            {
            match("minValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:126:8: ( 'maxValue' )
            // InternalTabletUIDSL.g:126:10: 'maxValue'
            {
            match("maxValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:127:8: ( 'xTicks' )
            // InternalTabletUIDSL.g:127:10: 'xTicks'
            {
            match("xTicks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:128:8: ( 'yTicks' )
            // InternalTabletUIDSL.g:128:10: 'yTicks'
            {
            match("yTicks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:129:8: ( 'daysago' )
            // InternalTabletUIDSL.g:129:10: 'daysago'
            {
            match("daysago"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:130:8: ( 'unit' )
            // InternalTabletUIDSL.g:130:10: 'unit'
            {
            match("unit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:131:8: ( 'part' )
            // InternalTabletUIDSL.g:131:10: 'part'
            {
            match("part"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:132:8: ( 'substitution' )
            // InternalTabletUIDSL.g:132:10: 'substitution'
            {
            match("substitution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:5287:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTabletUIDSL.g:5287:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTabletUIDSL.g:5287:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTabletUIDSL.g:5287:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTabletUIDSL.g:5287:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTabletUIDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:5289:10: ( ( '0' .. '9' )+ )
            // InternalTabletUIDSL.g:5289:12: ( '0' .. '9' )+
            {
            // InternalTabletUIDSL.g:5289:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTabletUIDSL.g:5289:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:5291:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTabletUIDSL.g:5291:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTabletUIDSL.g:5291:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTabletUIDSL.g:5291:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTabletUIDSL.g:5291:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTabletUIDSL.g:5291:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTabletUIDSL.g:5291:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTabletUIDSL.g:5291:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTabletUIDSL.g:5291:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTabletUIDSL.g:5291:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTabletUIDSL.g:5291:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:5293:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTabletUIDSL.g:5293:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTabletUIDSL.g:5293:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTabletUIDSL.g:5293:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:5295:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTabletUIDSL.g:5295:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTabletUIDSL.g:5295:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTabletUIDSL.g:5295:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalTabletUIDSL.g:5295:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTabletUIDSL.g:5295:41: ( '\\r' )? '\\n'
                    {
                    // InternalTabletUIDSL.g:5295:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTabletUIDSL.g:5295:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:5297:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTabletUIDSL.g:5297:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTabletUIDSL.g:5297:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTabletUIDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTabletUIDSL.g:5299:16: ( . )
            // InternalTabletUIDSL.g:5299:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTabletUIDSL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=129;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalTabletUIDSL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalTabletUIDSL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalTabletUIDSL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalTabletUIDSL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalTabletUIDSL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalTabletUIDSL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalTabletUIDSL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalTabletUIDSL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalTabletUIDSL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalTabletUIDSL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalTabletUIDSL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalTabletUIDSL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalTabletUIDSL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalTabletUIDSL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalTabletUIDSL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalTabletUIDSL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalTabletUIDSL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalTabletUIDSL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalTabletUIDSL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalTabletUIDSL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalTabletUIDSL.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalTabletUIDSL.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalTabletUIDSL.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalTabletUIDSL.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalTabletUIDSL.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalTabletUIDSL.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalTabletUIDSL.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalTabletUIDSL.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalTabletUIDSL.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalTabletUIDSL.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalTabletUIDSL.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalTabletUIDSL.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalTabletUIDSL.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalTabletUIDSL.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalTabletUIDSL.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalTabletUIDSL.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalTabletUIDSL.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalTabletUIDSL.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalTabletUIDSL.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalTabletUIDSL.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalTabletUIDSL.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalTabletUIDSL.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalTabletUIDSL.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalTabletUIDSL.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalTabletUIDSL.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalTabletUIDSL.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalTabletUIDSL.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalTabletUIDSL.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalTabletUIDSL.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalTabletUIDSL.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalTabletUIDSL.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalTabletUIDSL.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalTabletUIDSL.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalTabletUIDSL.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalTabletUIDSL.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalTabletUIDSL.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalTabletUIDSL.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalTabletUIDSL.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalTabletUIDSL.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalTabletUIDSL.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalTabletUIDSL.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalTabletUIDSL.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalTabletUIDSL.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalTabletUIDSL.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalTabletUIDSL.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalTabletUIDSL.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalTabletUIDSL.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalTabletUIDSL.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalTabletUIDSL.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalTabletUIDSL.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalTabletUIDSL.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalTabletUIDSL.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalTabletUIDSL.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalTabletUIDSL.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalTabletUIDSL.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalTabletUIDSL.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalTabletUIDSL.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalTabletUIDSL.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalTabletUIDSL.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalTabletUIDSL.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalTabletUIDSL.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalTabletUIDSL.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalTabletUIDSL.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalTabletUIDSL.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // InternalTabletUIDSL.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // InternalTabletUIDSL.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // InternalTabletUIDSL.g:1:526: T__97
                {
                mT__97(); 

                }
                break;
            case 88 :
                // InternalTabletUIDSL.g:1:532: T__98
                {
                mT__98(); 

                }
                break;
            case 89 :
                // InternalTabletUIDSL.g:1:538: T__99
                {
                mT__99(); 

                }
                break;
            case 90 :
                // InternalTabletUIDSL.g:1:544: T__100
                {
                mT__100(); 

                }
                break;
            case 91 :
                // InternalTabletUIDSL.g:1:551: T__101
                {
                mT__101(); 

                }
                break;
            case 92 :
                // InternalTabletUIDSL.g:1:558: T__102
                {
                mT__102(); 

                }
                break;
            case 93 :
                // InternalTabletUIDSL.g:1:565: T__103
                {
                mT__103(); 

                }
                break;
            case 94 :
                // InternalTabletUIDSL.g:1:572: T__104
                {
                mT__104(); 

                }
                break;
            case 95 :
                // InternalTabletUIDSL.g:1:579: T__105
                {
                mT__105(); 

                }
                break;
            case 96 :
                // InternalTabletUIDSL.g:1:586: T__106
                {
                mT__106(); 

                }
                break;
            case 97 :
                // InternalTabletUIDSL.g:1:593: T__107
                {
                mT__107(); 

                }
                break;
            case 98 :
                // InternalTabletUIDSL.g:1:600: T__108
                {
                mT__108(); 

                }
                break;
            case 99 :
                // InternalTabletUIDSL.g:1:607: T__109
                {
                mT__109(); 

                }
                break;
            case 100 :
                // InternalTabletUIDSL.g:1:614: T__110
                {
                mT__110(); 

                }
                break;
            case 101 :
                // InternalTabletUIDSL.g:1:621: T__111
                {
                mT__111(); 

                }
                break;
            case 102 :
                // InternalTabletUIDSL.g:1:628: T__112
                {
                mT__112(); 

                }
                break;
            case 103 :
                // InternalTabletUIDSL.g:1:635: T__113
                {
                mT__113(); 

                }
                break;
            case 104 :
                // InternalTabletUIDSL.g:1:642: T__114
                {
                mT__114(); 

                }
                break;
            case 105 :
                // InternalTabletUIDSL.g:1:649: T__115
                {
                mT__115(); 

                }
                break;
            case 106 :
                // InternalTabletUIDSL.g:1:656: T__116
                {
                mT__116(); 

                }
                break;
            case 107 :
                // InternalTabletUIDSL.g:1:663: T__117
                {
                mT__117(); 

                }
                break;
            case 108 :
                // InternalTabletUIDSL.g:1:670: T__118
                {
                mT__118(); 

                }
                break;
            case 109 :
                // InternalTabletUIDSL.g:1:677: T__119
                {
                mT__119(); 

                }
                break;
            case 110 :
                // InternalTabletUIDSL.g:1:684: T__120
                {
                mT__120(); 

                }
                break;
            case 111 :
                // InternalTabletUIDSL.g:1:691: T__121
                {
                mT__121(); 

                }
                break;
            case 112 :
                // InternalTabletUIDSL.g:1:698: T__122
                {
                mT__122(); 

                }
                break;
            case 113 :
                // InternalTabletUIDSL.g:1:705: T__123
                {
                mT__123(); 

                }
                break;
            case 114 :
                // InternalTabletUIDSL.g:1:712: T__124
                {
                mT__124(); 

                }
                break;
            case 115 :
                // InternalTabletUIDSL.g:1:719: T__125
                {
                mT__125(); 

                }
                break;
            case 116 :
                // InternalTabletUIDSL.g:1:726: T__126
                {
                mT__126(); 

                }
                break;
            case 117 :
                // InternalTabletUIDSL.g:1:733: T__127
                {
                mT__127(); 

                }
                break;
            case 118 :
                // InternalTabletUIDSL.g:1:740: T__128
                {
                mT__128(); 

                }
                break;
            case 119 :
                // InternalTabletUIDSL.g:1:747: T__129
                {
                mT__129(); 

                }
                break;
            case 120 :
                // InternalTabletUIDSL.g:1:754: T__130
                {
                mT__130(); 

                }
                break;
            case 121 :
                // InternalTabletUIDSL.g:1:761: T__131
                {
                mT__131(); 

                }
                break;
            case 122 :
                // InternalTabletUIDSL.g:1:768: T__132
                {
                mT__132(); 

                }
                break;
            case 123 :
                // InternalTabletUIDSL.g:1:775: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 124 :
                // InternalTabletUIDSL.g:1:783: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 125 :
                // InternalTabletUIDSL.g:1:792: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 126 :
                // InternalTabletUIDSL.g:1:804: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 127 :
                // InternalTabletUIDSL.g:1:820: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 128 :
                // InternalTabletUIDSL.g:1:836: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 129 :
                // InternalTabletUIDSL.g:1:844: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\11\52\2\uffff\16\52\1\41\2\uffff\3\41\2\uffff\10\52\1\uffff\32\52\2\uffff\36\52\5\uffff\1\u00bf\30\52\1\u00dc\2\52\1\u00df\2\52\1\u00e3\10\52\1\u00ec\2\52\1\u00f1\6\52\1\u00f9\1\u00fb\20\52\1\uffff\1\u010c\2\52\1\uffff\12\52\1\uffff\1\52\1\uffff\7\52\1\u0124\5\52\1\u012a\16\52\1\uffff\2\52\1\uffff\2\52\1\u013f\1\uffff\5\52\1\u0146\2\52\1\uffff\4\52\1\uffff\3\52\1\u0152\3\52\1\uffff\1\52\1\uffff\3\52\1\uffff\1\u015c\1\u015d\1\52\1\uffff\2\52\1\u0161\1\52\1\u0163\1\u0164\2\52\1\uffff\1\u0167\1\52\2\uffff\2\52\1\uffff\10\52\1\u0177\2\52\1\u017a\4\52\1\uffff\3\52\1\u0183\2\uffff\2\52\1\uffff\1\u0188\2\52\1\u018b\6\52\1\u0192\1\52\1\u0194\1\u0195\3\52\1\uffff\3\52\1\u019c\1\uffff\1\52\2\uffff\3\52\1\u01a3\3\52\1\u01a7\1\52\1\u01a9\1\uffff\1\u01ac\5\52\1\u01b2\4\uffff\1\u01b3\1\u01b4\1\52\1\uffff\1\u01b6\2\uffff\2\52\1\uffff\3\52\2\uffff\12\52\1\uffff\1\u01c6\1\52\1\uffff\3\52\1\u01cb\1\u01cc\1\52\1\u01ce\1\52\3\uffff\2\52\1\uffff\1\52\1\u01d3\1\uffff\1\52\1\u01d5\1\u01d6\1\52\1\u01da\1\52\1\uffff\1\52\2\uffff\1\u01dd\5\52\1\uffff\1\52\2\uffff\3\52\1\uffff\1\u01e8\2\52\1\uffff\1\52\1\uffff\1\52\2\uffff\1\u01ed\4\52\3\uffff\1\u01f2\1\uffff\1\52\1\u01f4\12\52\1\u01ff\1\u0200\1\52\1\uffff\4\52\2\uffff\1\52\1\uffff\4\52\1\uffff\1\u020b\2\uffff\1\52\1\u020d\1\52\1\uffff\1\u020f\1\52\1\uffff\1\u0211\1\u0212\1\u0213\2\52\1\u0216\4\52\1\uffff\1\u021b\3\52\1\uffff\4\52\1\uffff\1\52\1\uffff\1\u0225\2\52\1\u0228\6\52\2\uffff\1\u022f\6\52\1\u0237\2\52\1\uffff\1\u023d\1\uffff\1\52\1\uffff\1\52\3\uffff\2\52\1\uffff\4\52\1\uffff\1\u0246\1\52\1\u0248\1\u0249\1\u024a\1\52\1\u024c\1\52\1\u024e\1\uffff\1\52\1\u0250\1\uffff\1\u0251\5\52\1\uffff\2\52\1\uffff\3\52\2\uffff\5\52\1\uffff\1\52\1\u0262\1\u0263\5\52\1\uffff\1\52\3\uffff\1\u026a\1\uffff\1\52\1\uffff\1\52\2\uffff\1\52\1\u026e\15\52\1\u027c\2\uffff\6\52\1\uffff\3\52\1\uffff\1\u0287\1\u0288\1\52\1\u028a\1\52\1\uffff\1\u028c\1\52\1\u028e\4\52\1\uffff\1\u0293\1\u0294\1\u0295\3\52\1\uffff\3\52\2\uffff\1\u029e\1\uffff\1\52\1\uffff\1\u02a0\1\uffff\1\u02a1\1\u02a2\2\52\3\uffff\3\52\2\uffff\3\52\1\uffff\1\52\3\uffff\15\52\1\u02b9\3\52\1\u02bd\3\52\1\u02c1\1\uffff\1\u02c2\2\52\1\uffff\3\52\2\uffff\4\52\1\u02cc\4\52\1\uffff\1\u02d1\1\u02d2\1\u02d3\1\52\3\uffff\1\u02d5\1\uffff";
    static final String DFA12_eofS =
        "\u02d6\uffff";
    static final String DFA12_minS =
        "\1\0\1\143\1\145\1\141\2\145\1\141\1\145\1\141\1\145\2\uffff\1\143\1\141\1\154\1\141\1\165\1\157\2\141\1\156\1\146\1\154\1\151\2\124\1\101\2\uffff\2\0\1\52\2\uffff\1\154\1\162\1\141\1\157\1\151\2\155\1\142\1\uffff\1\155\1\165\1\155\1\145\1\154\1\162\1\144\2\141\1\147\1\154\1\163\1\141\1\144\1\163\1\154\1\167\1\141\1\163\1\142\1\141\1\164\1\165\1\141\1\151\1\164\2\uffff\1\164\1\145\1\157\1\141\2\156\1\170\2\164\1\151\1\156\1\142\1\147\1\157\1\154\1\163\1\160\1\147\1\143\1\164\1\55\1\154\1\151\1\55\1\146\1\141\1\145\1\155\2\151\5\uffff\1\55\2\145\1\154\1\147\1\162\1\160\1\145\1\160\1\142\1\163\1\154\2\145\1\160\1\155\1\154\1\155\2\164\1\147\1\144\1\150\1\157\1\156\1\60\1\163\1\143\1\60\1\164\1\166\1\60\1\144\1\160\1\151\1\165\1\147\1\163\1\145\1\142\1\60\1\154\1\144\1\60\1\145\1\155\2\156\1\147\1\164\2\60\1\145\1\157\1\141\1\55\1\164\1\153\1\145\1\55\1\164\1\165\1\150\1\165\1\145\1\164\1\153\1\164\1\uffff\1\60\1\164\1\157\1\142\1\141\1\55\1\143\1\156\1\151\1\155\1\160\2\143\1\151\1\uffff\1\156\1\uffff\1\143\2\145\1\156\1\164\1\145\1\143\1\60\1\154\1\157\1\164\1\145\1\55\1\60\1\154\1\55\1\145\1\151\1\141\3\150\1\145\2\155\1\160\1\162\1\164\1\uffff\1\163\1\153\1\uffff\1\157\1\151\1\60\1\uffff\1\151\1\145\1\156\1\147\1\46\1\60\1\55\1\154\1\uffff\1\157\1\163\1\146\1\141\1\uffff\1\162\1\163\1\145\1\60\1\145\1\150\1\141\1\uffff\1\141\1\uffff\1\157\1\160\1\163\1\146\2\60\1\154\1\uffff\1\145\1\155\1\60\1\160\2\60\1\147\1\157\1\uffff\1\60\1\154\2\uffff\1\143\1\157\1\142\1\151\1\102\1\156\1\141\1\154\2\153\1\156\1\60\1\164\1\156\1\60\1\141\1\144\1\162\1\150\1\uffff\1\145\1\154\1\151\1\60\1\143\1\uffff\1\141\1\145\1\uffff\1\60\1\156\1\164\1\60\1\145\1\164\1\162\1\141\1\156\1\141\1\60\1\144\2\60\1\155\1\145\1\141\1\uffff\1\156\1\162\1\147\1\60\1\uffff\1\147\1\uffff\1\143\1\145\1\147\1\164\1\60\1\146\1\162\1\166\1\60\1\163\1\60\1\uffff\1\55\1\163\2\154\1\143\1\154\1\60\4\uffff\2\60\1\145\1\uffff\1\60\2\uffff\1\162\1\156\1\uffff\1\157\1\153\1\154\2\uffff\1\164\1\143\1\141\1\154\1\153\1\164\1\145\2\163\1\147\1\uffff\1\60\1\163\1\uffff\1\164\1\141\1\157\2\60\1\103\1\60\1\164\3\uffff\1\164\1\142\1\uffff\1\147\1\60\1\uffff\1\162\2\60\1\162\1\60\1\156\1\uffff\1\157\2\uffff\1\60\1\167\1\156\1\147\1\151\1\103\1\uffff\1\157\2\uffff\2\103\1\145\1\uffff\1\60\1\156\1\141\1\uffff\1\137\1\uffff\1\145\2\uffff\1\60\2\165\1\157\1\141\3\uffff\1\60\1\uffff\1\157\1\60\1\162\1\147\1\157\1\171\1\157\1\143\1\141\1\154\1\162\1\103\2\60\1\163\1\uffff\1\141\1\151\1\171\1\156\2\uffff\1\150\1\uffff\1\165\1\145\1\137\1\103\1\uffff\1\60\2\uffff\1\153\1\60\1\160\1\uffff\1\60\1\167\1\uffff\3\60\2\157\1\60\2\154\1\145\1\162\1\uffff\1\60\1\154\1\141\1\164\1\uffff\2\145\1\156\1\171\1\uffff\1\165\1\uffff\1\60\2\162\1\60\1\156\1\153\1\163\1\151\1\145\1\154\2\uffff\1\60\1\166\1\156\1\55\1\164\1\141\1\164\1\55\1\165\1\157\1\uffff\1\60\1\uffff\1\145\1\uffff\1\156\3\uffff\1\144\1\154\1\uffff\1\151\2\141\1\137\1\uffff\1\60\1\162\3\60\1\163\1\60\1\156\1\60\1\uffff\1\157\1\60\1\uffff\1\60\1\147\1\163\1\155\1\156\1\157\1\uffff\1\145\1\147\1\uffff\1\150\1\162\1\151\2\uffff\1\162\1\154\1\143\1\151\1\141\1\uffff\1\143\2\60\1\157\1\143\1\163\1\144\1\155\1\uffff\1\164\3\uffff\1\60\1\uffff\1\144\1\uffff\1\165\2\uffff\1\162\1\60\1\141\1\144\1\143\1\162\1\103\1\55\1\164\1\157\1\154\2\157\1\163\1\154\1\60\2\uffff\1\162\1\153\1\163\1\145\1\141\1\167\1\uffff\1\55\1\156\1\157\1\uffff\2\60\1\153\1\60\1\157\1\uffff\1\60\1\156\1\60\1\162\1\156\1\151\1\154\1\uffff\3\60\2\162\1\157\1\151\1\157\1\144\1\165\2\uffff\1\60\1\uffff\1\154\1\uffff\1\60\1\uffff\2\60\1\156\1\151\3\uffff\1\103\1\147\1\162\2\uffff\1\154\1\103\1\156\1\uffff\1\157\3\uffff\1\147\1\156\1\154\1\151\1\153\2\157\1\144\1\162\1\103\1\147\1\141\1\156\1\60\1\162\1\154\1\111\1\60\1\157\1\103\1\163\1\60\1\uffff\1\60\1\157\1\143\1\uffff\1\154\1\157\1\163\2\uffff\1\162\2\157\1\154\1\60\1\163\1\156\1\162\1\157\1\uffff\3\60\1\162\3\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\171\1\162\1\157\2\151\1\165\1\157\2\162\2\uffff\1\164\1\157\1\165\1\157\1\165\1\157\2\165\1\162\1\160\1\154\1\151\2\124\1\172\2\uffff\2\uffff\1\57\2\uffff\1\164\1\162\1\171\1\157\1\151\1\172\1\155\1\142\1\uffff\1\164\1\165\1\155\1\145\1\154\1\162\1\144\1\141\1\151\1\147\1\165\1\163\1\157\1\144\1\163\1\154\1\167\1\146\1\163\1\142\1\141\1\171\1\165\1\166\1\151\1\164\2\uffff\1\164\1\165\1\157\1\141\2\156\1\170\2\164\1\154\1\163\1\142\1\147\1\157\1\154\1\163\1\160\1\162\1\143\1\164\1\55\1\154\1\151\1\103\1\146\1\145\1\151\1\155\2\151\5\uffff\1\172\2\145\1\154\1\147\1\162\1\164\1\145\1\160\1\142\1\163\1\154\2\145\1\160\1\155\1\163\1\155\2\164\1\147\1\144\1\150\1\165\1\156\1\172\1\163\1\143\1\172\1\164\1\166\1\172\1\144\1\160\1\151\1\165\1\147\1\163\1\145\1\142\1\172\1\154\1\144\1\172\1\145\1\155\2\156\1\147\1\164\2\172\1\145\1\157\1\141\1\55\1\164\1\153\1\145\1\55\1\164\1\165\1\150\1\165\1\145\1\164\1\153\1\164\1\uffff\1\172\1\164\1\157\1\143\1\141\1\103\1\143\1\156\1\151\1\155\1\160\2\143\1\151\1\uffff\1\156\1\uffff\1\143\2\145\1\156\1\164\1\145\1\143\1\172\1\154\1\157\1\164\1\145\1\55\1\172\1\154\1\167\1\145\1\151\1\141\3\150\1\145\2\155\1\160\1\162\1\164\1\uffff\1\163\1\153\1\uffff\1\157\1\151\1\172\1\uffff\1\151\1\145\1\156\1\147\1\46\1\172\1\55\1\154\1\uffff\1\157\1\163\1\156\1\141\1\uffff\1\162\1\163\1\145\1\172\1\145\1\150\1\141\1\uffff\1\141\1\uffff\1\157\1\160\1\163\1\164\2\172\1\154\1\uffff\1\145\1\155\1\172\1\160\2\172\1\147\1\157\1\uffff\1\172\1\154\2\uffff\1\143\1\157\1\143\1\151\1\111\1\156\1\141\1\154\2\153\1\156\1\172\1\164\1\156\1\172\1\141\1\155\1\162\1\150\1\uffff\1\145\1\154\1\151\1\172\1\146\1\uffff\1\141\1\145\1\uffff\1\172\1\156\1\164\1\172\1\145\1\164\1\162\1\141\1\156\1\141\1\172\1\144\2\172\1\155\1\145\1\141\1\uffff\1\156\1\162\1\147\1\172\1\uffff\1\147\1\uffff\1\146\1\145\1\147\1\164\1\172\1\146\1\162\1\166\1\172\1\163\1\172\1\uffff\1\172\1\163\2\154\1\143\1\154\1\172\4\uffff\2\172\1\145\1\uffff\1\172\2\uffff\1\162\1\156\1\uffff\1\157\1\153\1\154\2\uffff\1\164\1\143\1\141\1\154\1\153\1\164\1\145\2\163\1\147\1\uffff\1\172\1\163\1\uffff\1\164\1\141\1\157\2\172\1\103\1\172\1\164\3\uffff\1\164\1\142\1\uffff\1\147\1\172\1\uffff\1\162\2\172\1\162\1\172\1\156\1\uffff\1\157\2\uffff\1\172\1\167\1\156\1\147\1\151\1\103\1\uffff\1\157\2\uffff\1\103\1\110\1\145\1\uffff\1\172\1\156\1\141\1\uffff\1\137\1\uffff\1\145\2\uffff\1\172\2\165\1\157\1\141\3\uffff\1\172\1\uffff\1\157\1\172\1\162\1\147\1\157\1\171\1\157\1\143\1\141\1\154\1\162\1\103\2\172\1\163\1\uffff\1\141\1\151\1\171\1\156\2\uffff\1\150\1\uffff\1\165\1\145\1\137\1\103\1\uffff\1\172\2\uffff\1\153\1\172\1\160\1\uffff\1\172\1\167\1\uffff\3\172\2\157\1\172\2\154\1\145\1\162\1\uffff\1\172\1\154\1\141\1\164\1\uffff\2\145\1\156\1\171\1\uffff\1\165\1\uffff\1\172\2\162\1\172\1\156\1\153\1\163\1\151\1\145\1\154\2\uffff\1\172\1\166\1\156\1\55\1\164\1\141\1\164\1\172\1\165\1\157\1\uffff\1\172\1\uffff\1\145\1\uffff\1\156\3\uffff\1\144\1\154\1\uffff\1\151\2\141\1\137\1\uffff\1\172\1\162\3\172\1\163\1\172\1\156\1\172\1\uffff\1\157\1\172\1\uffff\1\172\1\147\1\163\1\155\1\156\1\157\1\uffff\1\145\1\147\1\uffff\1\150\1\162\1\151\2\uffff\1\162\1\154\1\143\1\151\1\141\1\uffff\1\143\2\172\1\157\1\143\1\163\1\144\1\155\1\uffff\1\164\3\uffff\1\172\1\uffff\1\144\1\uffff\1\165\2\uffff\1\162\1\172\1\141\1\144\1\143\1\162\1\103\1\55\1\164\1\157\1\154\2\157\1\163\1\154\1\172\2\uffff\1\162\1\153\1\163\1\145\1\141\1\167\1\uffff\1\103\1\156\1\157\1\uffff\2\172\1\153\1\172\1\157\1\uffff\1\172\1\156\1\172\1\162\1\156\1\151\1\154\1\uffff\3\172\2\162\3\157\1\144\1\165\2\uffff\1\172\1\uffff\1\154\1\uffff\1\172\1\uffff\2\172\1\156\1\151\3\uffff\1\103\1\147\1\162\2\uffff\1\154\1\103\1\156\1\uffff\1\157\3\uffff\1\147\1\156\1\154\1\151\1\153\2\157\1\144\1\162\1\103\1\147\1\141\1\156\1\172\1\162\1\154\1\111\1\172\1\157\1\103\1\163\1\172\1\uffff\1\172\1\157\1\143\1\uffff\1\154\1\157\1\163\2\uffff\1\162\2\157\1\154\1\172\1\163\1\156\1\162\1\157\1\uffff\3\172\1\162\3\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\16\1\20\17\uffff\1\173\1\174\3\uffff\1\u0080\1\u0081\10\uffff\1\173\32\uffff\1\16\1\20\36\uffff\1\174\1\175\1\176\1\177\1\u0080\104\uffff\1\157\16\uffff\1\57\1\uffff\1\52\34\uffff\1\13\2\uffff\1\47\3\uffff\1\23\10\uffff\1\77\4\uffff\1\51\7\uffff\1\54\1\uffff\1\55\7\uffff\1\161\10\uffff\1\64\2\uffff\1\131\1\132\23\uffff\1\66\5\uffff\1\14\2\uffff\1\126\21\uffff\1\7\4\uffff\1\11\1\uffff\1\34\13\uffff\1\60\7\uffff\1\111\1\112\1\44\1\121\3\uffff\1\56\1\uffff\1\125\1\171\2\uffff\1\170\3\uffff\1\133\1\134\12\uffff\1\71\2\uffff\1\30\10\uffff\1\2\1\154\1\156\2\uffff\1\15\2\uffff\1\4\6\uffff\1\122\1\uffff\1\27\1\31\6\uffff\1\10\1\uffff\1\153\1\155\3\uffff\1\70\3\uffff\1\45\1\uffff\1\147\1\uffff\1\104\1\65\5\uffff\1\46\1\124\1\50\1\uffff\1\113\17\uffff\1\43\4\uffff\1\40\1\67\1\uffff\1\146\4\uffff\1\32\1\uffff\1\5\1\22\3\uffff\1\24\2\uffff\1\76\12\uffff\1\72\4\uffff\1\36\4\uffff\1\53\1\uffff\1\127\12\uffff\1\165\1\166\12\uffff\1\102\1\uffff\1\6\1\uffff\1\25\1\uffff\1\110\1\26\1\107\2\uffff\1\167\4\uffff\1\130\11\uffff\1\73\2\uffff\1\101\6\uffff\1\1\2\uffff\1\35\3\uffff\1\42\1\21\5\uffff\1\142\10\uffff\1\33\1\uffff\1\103\1\163\1\164\1\uffff\1\41\1\uffff\1\150\1\uffff\1\74\1\114\20\uffff\1\63\1\136\6\uffff\1\105\3\uffff\1\116\5\uffff\1\37\7\uffff\1\162\12\uffff\1\106\1\135\1\uffff\1\17\1\uffff\1\160\1\uffff\1\3\4\uffff\1\140\1\62\1\117\3\uffff\1\61\1\75\3\uffff\1\152\1\uffff\1\172\1\141\1\143\26\uffff\1\100\3\uffff\1\137\3\uffff\1\12\1\123\11\uffff\1\120\4\uffff\1\151\1\115\1\144\1\uffff\1\145";
    static final String DFA12_specialS =
        "\1\2\34\uffff\1\0\1\1\u02b7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\4\41\1\36\7\41\1\37\12\34\7\41\22\33\1\27\7\33\3\41\1\32\1\33\1\41\1\16\1\23\1\6\1\10\1\33\1\3\1\11\1\5\1\14\1\33\1\26\1\17\1\15\1\33\1\25\1\22\1\20\1\7\1\1\1\2\1\24\1\21\1\4\1\30\1\31\1\33\1\12\1\41\1\13\uff82\41",
            "\1\43\1\uffff\1\42\2\uffff\1\45\1\47\12\uffff\1\44\1\51\1\uffff\1\46\1\uffff\1\50",
            "\1\55\3\uffff\1\53\10\uffff\1\54",
            "\1\57\6\uffff\1\56\6\uffff\1\60",
            "\1\62\3\uffff\1\61",
            "\1\63\3\uffff\1\64",
            "\1\72\12\uffff\1\67\1\70\1\uffff\1\65\3\uffff\1\66\1\uffff\1\71",
            "\1\74\3\uffff\1\75\5\uffff\1\73",
            "\1\100\3\uffff\1\76\3\uffff\1\102\5\uffff\1\101\2\uffff\1\77",
            "\1\104\14\uffff\1\103",
            "",
            "",
            "\1\111\11\uffff\1\112\1\107\5\uffff\1\110",
            "\1\115\3\uffff\1\116\3\uffff\1\114\5\uffff\1\113",
            "\1\120\10\uffff\1\117",
            "\1\122\7\uffff\1\121\5\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\130\15\uffff\1\127\5\uffff\1\126",
            "\1\131\5\uffff\1\133\15\uffff\1\132",
            "\1\135\3\uffff\1\134",
            "\1\137\7\uffff\1\136\1\uffff\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\146",
            "\0\146",
            "\1\147\4\uffff\1\150",
            "",
            "",
            "\1\153\7\uffff\1\152",
            "\1\154",
            "\1\156\27\uffff\1\155",
            "\1\157",
            "\1\160",
            "\1\162\14\uffff\1\161",
            "\1\163",
            "\1\164",
            "",
            "\1\166\6\uffff\1\165",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\177\7\uffff\1\176",
            "\1\u0080",
            "\1\u0081\10\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084\15\uffff\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a\4\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u0090\4\uffff\1\u008f",
            "\1\u0091",
            "\1\u0093\24\uffff\1\u0092",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097\17\uffff\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\2\uffff\1\u00a1",
            "\1\u00a3\4\uffff\1\u00a2",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\12\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b2\24\uffff\1\u00b3\1\u00b1",
            "\1\u00b4",
            "\1\u00b5\3\uffff\1\u00b6",
            "\1\u00b7\3\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bd\2\uffff\12\52\7\uffff\16\52\1\u00be\13\52\4\uffff\1\52\1\uffff\23\52\1\u00bc\6\52",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5\3\uffff\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d1\6\uffff\1\u00d0",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00da\3\uffff\1\u00d9\1\uffff\1\u00d8",
            "\1\u00db",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00dd",
            "\1\u00de",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e0",
            "\1\u00e1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00e2\7\52",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ed",
            "\1\u00ee",
            "\12\52\7\uffff\16\52\1\u00ef\7\52\1\u00f0\3\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\52\7\uffff\25\52\1\u00f8\4\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\25\52\1\u00fa\4\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010d",
            "\1\u010e",
            "\1\u0110\1\u010f",
            "\1\u0111",
            "\1\u0113\25\uffff\1\u0112",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012b",
            "\1\u012d\111\uffff\1\u012c",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\u013e\12\52",
            "",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u0145\31\52",
            "\1\u0147",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "\1\u014c\7\uffff\1\u014b",
            "\1\u014d",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u0151\7\52",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a\15\uffff\1\u015b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u015e",
            "",
            "\1\u015f",
            "\1\u0160",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0162",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0165",
            "\1\u0166",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0168",
            "",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016c\1\u016b",
            "\1\u016d",
            "\1\u016f\1\u0170\5\uffff\1\u016e",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0178",
            "\1\u0179",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017b",
            "\1\u017c\10\uffff\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0185\2\uffff\1\u0184",
            "",
            "\1\u0186",
            "\1\u0187",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0189",
            "\1\u018a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0193",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u019d",
            "",
            "\1\u019f\2\uffff\1\u019e",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01a8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01ab\2\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u01aa\7\52",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b5",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "",
            "",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01c7",
            "",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01cd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01cf",
            "",
            "",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "",
            "\1\u01d2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01d4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01d7",
            "\12\52\7\uffff\22\52\1\u01d9\7\52\4\uffff\1\52\1\uffff\22\52\1\u01d8\7\52",
            "\1\u01db",
            "",
            "\1\u01dc",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "",
            "\1\u01e3",
            "",
            "",
            "\1\u01e4",
            "\1\u01e5\4\uffff\1\u01e6",
            "\1\u01e7",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01e9",
            "\1\u01ea",
            "",
            "\1\u01eb",
            "",
            "\1\u01ec",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01f3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0201",
            "",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "",
            "",
            "\1\u0206",
            "",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u020c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u020e",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0210",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0214",
            "\1\u0215",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "",
            "\1\u0223",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u0224\7\52",
            "\1\u0226",
            "\1\u0227",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236\2\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0238",
            "\1\u0239",
            "",
            "\12\52\7\uffff\5\52\1\u023c\2\52\1\u023a\10\52\1\u023b\10\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u023e",
            "",
            "\1\u023f",
            "",
            "",
            "",
            "\1\u0240",
            "\1\u0241",
            "",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0247",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u024b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u024d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u024f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "",
            "\1\u0257",
            "\1\u0258",
            "",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "",
            "",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "",
            "\1\u0261",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "",
            "\1\u0269",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u026b",
            "",
            "\1\u026c",
            "",
            "",
            "\1\u026d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "",
            "\1\u0283\25\uffff\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0289",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u028b",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u028d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299\5\uffff\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u029f",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02a3",
            "\1\u02a4",
            "",
            "",
            "",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "",
            "",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "",
            "\1\u02ab",
            "",
            "",
            "",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02c3",
            "\1\u02c4",
            "",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "",
            "",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u02d4",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 102;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 102;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='s') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='f') ) {s = 3;}

                        else if ( (LA12_0=='w') ) {s = 4;}

                        else if ( (LA12_0=='h') ) {s = 5;}

                        else if ( (LA12_0=='c') ) {s = 6;}

                        else if ( (LA12_0=='r') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='g') ) {s = 9;}

                        else if ( (LA12_0=='{') ) {s = 10;}

                        else if ( (LA12_0=='}') ) {s = 11;}

                        else if ( (LA12_0=='i') ) {s = 12;}

                        else if ( (LA12_0=='m') ) {s = 13;}

                        else if ( (LA12_0=='a') ) {s = 14;}

                        else if ( (LA12_0=='l') ) {s = 15;}

                        else if ( (LA12_0=='q') ) {s = 16;}

                        else if ( (LA12_0=='v') ) {s = 17;}

                        else if ( (LA12_0=='p') ) {s = 18;}

                        else if ( (LA12_0=='b') ) {s = 19;}

                        else if ( (LA12_0=='u') ) {s = 20;}

                        else if ( (LA12_0=='o') ) {s = 21;}

                        else if ( (LA12_0=='k') ) {s = 22;}

                        else if ( (LA12_0=='S') ) {s = 23;}

                        else if ( (LA12_0=='x') ) {s = 24;}

                        else if ( (LA12_0=='y') ) {s = 25;}

                        else if ( (LA12_0=='^') ) {s = 26;}

                        else if ( ((LA12_0>='A' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='e'||LA12_0=='j'||LA12_0=='n'||LA12_0=='z') ) {s = 27;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 28;}

                        else if ( (LA12_0=='\"') ) {s = 29;}

                        else if ( (LA12_0=='\'') ) {s = 30;}

                        else if ( (LA12_0=='/') ) {s = 31;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 32;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}