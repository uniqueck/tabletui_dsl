package org.ckr.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ckr.services.TabletUIDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTabletUIDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'settings'", "'title'", "'fhemweb_url'", "'width'", "'height'", "'columns'", "'rows'", "'debug'", "'drag&drop'", "'gridster_margin'", "'css'", "'true'", "'false'", "'{'", "'screensaver'", "'}'", "'template'", "'header'", "'row'", "'column'", "'colspan'", "'rowspan'", "'class'", "'style'", "'clock'", "'format'", "'interval'", "'days'", "'shortday-length'", "'months'", "'shortmonth-length'", "'swiper'", "'autoplay'", "'template-ref'", "'select'", "'list'", "'items'", "'alias'", "'cmd'", "'quote'", "'get'", "'set'", "'volume'", "'min'", "'max'", "'push'", "'set-on'", "'icon'", "'background-icon'", "'doubleClick'", "'countdown'", "'url'", "'image'", "'size'", "'switch'", "'getOn'", "'setOn'", "'getOff'", "'onColor'", "'offColor'", "'background-on-color'", "'custom'", "'div'", "'itunes_artwork'", "'opacity'", "'weather'", "'imageset'", "'image-path'", "'meteocons'", "'kleinklima'", "'reading'", "'calview'", "'all-forecast-color'", "'all-today-color'", "'popup'", "'openIcon'", "'openBackgroundIcon'", "'openClass'", "'dialogClass'", "'dialogHeaderClass'", "'link'", "'color'", "'backgroundColor'", "'label'", "'page'", "'fhem-cmd'", "'button'", "'getWarn'", "'on-color'", "'on-background-color'", "'off-color'", "'off-background-color'", "'klimatrend'", "'refperiod'", "'stagnatingColor'", "'risingColor'", "'fallingColor'", "'highmark'", "'highmarkIcon'", "'highmarkRisingColor'", "'highmarkFallingColor'", "'symbol'", "'icons'", "'onColors'", "'onBackgroundColors'", "'SimpleClock'", "'date-format'", "'time-format'", "'date-color'", "'time-color'", "'bg-colors'", "'simpleChart'", "'log-config'", "'columnSpec'", "'minValue'", "'maxValue'", "'xTicks'", "'yTicks'", "'daysago'", "'unit'", "'part'", "'substitution'"
    };
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


        public InternalTabletUIDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTabletUIDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTabletUIDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTabletUIDSL.g"; }



     	private TabletUIDSLGrammarAccess grammarAccess;
     	
        public InternalTabletUIDSLParser(TokenStream input, TabletUIDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TabletUI";	
       	}
       	
       	@Override
       	protected TabletUIDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTabletUI"
    // InternalTabletUIDSL.g:67:1: entryRuleTabletUI returns [EObject current=null] : iv_ruleTabletUI= ruleTabletUI EOF ;
    public final EObject entryRuleTabletUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabletUI = null;


        try {
            // InternalTabletUIDSL.g:68:2: (iv_ruleTabletUI= ruleTabletUI EOF )
            // InternalTabletUIDSL.g:69:2: iv_ruleTabletUI= ruleTabletUI EOF
            {
             newCompositeNode(grammarAccess.getTabletUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTabletUI=ruleTabletUI();

            state._fsp--;

             current =iv_ruleTabletUI; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTabletUI"


    // $ANTLR start "ruleTabletUI"
    // InternalTabletUIDSL.g:76:1: ruleTabletUI returns [EObject current=null] : ( ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleTabletUI() throws RecognitionException {
        EObject current = null;

        EObject lv_settings_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:79:28: ( ( ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ) )
            // InternalTabletUIDSL.g:80:1: ( ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* )
            {
            // InternalTabletUIDSL.g:80:1: ( ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* )
            // InternalTabletUIDSL.g:80:2: ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )*
            {
            // InternalTabletUIDSL.g:80:2: ( (lv_settings_0_0= ruleSettings ) )
            // InternalTabletUIDSL.g:81:1: (lv_settings_0_0= ruleSettings )
            {
            // InternalTabletUIDSL.g:81:1: (lv_settings_0_0= ruleSettings )
            // InternalTabletUIDSL.g:82:3: lv_settings_0_0= ruleSettings
            {
             
            	        newCompositeNode(grammarAccess.getTabletUIAccess().getSettingsSettingsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_3);
            lv_settings_0_0=ruleSettings();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTabletUIRule());
            	        }
                   		set(
                   			current, 
                   			"settings",
                    		lv_settings_0_0, 
                    		"org.ckr.TabletUIDSL.Settings");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalTabletUIDSL.g:98:2: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTabletUIDSL.g:99:1: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // InternalTabletUIDSL.g:99:1: (lv_elements_1_0= ruleAbstractElement )
            	    // InternalTabletUIDSL.g:100:3: lv_elements_1_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTabletUIAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTabletUIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"org.ckr.TabletUIDSL.AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTabletUI"


    // $ANTLR start "entryRuleSettings"
    // InternalTabletUIDSL.g:124:1: entryRuleSettings returns [EObject current=null] : iv_ruleSettings= ruleSettings EOF ;
    public final EObject entryRuleSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettings = null;


        try {
            // InternalTabletUIDSL.g:125:2: (iv_ruleSettings= ruleSettings EOF )
            // InternalTabletUIDSL.g:126:2: iv_ruleSettings= ruleSettings EOF
            {
             newCompositeNode(grammarAccess.getSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSettings=ruleSettings();

            state._fsp--;

             current =iv_ruleSettings; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSettings"


    // $ANTLR start "ruleSettings"
    // InternalTabletUIDSL.g:133:1: ruleSettings returns [EObject current=null] : (otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )* ) ;
    public final EObject ruleSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token lv_fhemweb_url_4_0=null;
        Token otherlv_5=null;
        Token lv_width_6_0=null;
        Token otherlv_7=null;
        Token lv_height_8_0=null;
        Token otherlv_9=null;
        Token lv_columns_10_0=null;
        Token otherlv_11=null;
        Token lv_rows_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_margin_18_0=null;
        AntlrDatatypeRuleToken lv_debug_14_0 = null;

        AntlrDatatypeRuleToken lv_dragdrop_16_0 = null;

        EObject lv_settings_19_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:136:28: ( (otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )* ) )
            // InternalTabletUIDSL.g:137:1: (otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )* )
            {
            // InternalTabletUIDSL.g:137:1: (otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )* )
            // InternalTabletUIDSL.g:137:3: otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getSettingsAccess().getSettingsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getSettingsAccess().getTitleKeyword_1());
                
            // InternalTabletUIDSL.g:145:1: ( (lv_title_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:146:1: (lv_title_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:146:1: (lv_title_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:147:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            			newLeafNode(lv_title_2_0, grammarAccess.getSettingsAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:163:2: (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTabletUIDSL.g:163:4: otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getSettingsAccess().getFhemweb_urlKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:167:1: ( (lv_fhemweb_url_4_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:168:1: (lv_fhemweb_url_4_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:168:1: (lv_fhemweb_url_4_0= RULE_STRING )
                    // InternalTabletUIDSL.g:169:3: lv_fhemweb_url_4_0= RULE_STRING
                    {
                    lv_fhemweb_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    			newLeafNode(lv_fhemweb_url_4_0, grammarAccess.getSettingsAccess().getFhemweb_urlSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSettingsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fhemweb_url",
                            		lv_fhemweb_url_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

                	newLeafNode(otherlv_5, grammarAccess.getSettingsAccess().getWidthKeyword_4());
                
            // InternalTabletUIDSL.g:189:1: ( (lv_width_6_0= RULE_INT ) )
            // InternalTabletUIDSL.g:190:1: (lv_width_6_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:190:1: (lv_width_6_0= RULE_INT )
            // InternalTabletUIDSL.g:191:3: lv_width_6_0= RULE_INT
            {
            lv_width_6_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            			newLeafNode(lv_width_6_0, grammarAccess.getSettingsAccess().getWidthINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_6_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

                	newLeafNode(otherlv_7, grammarAccess.getSettingsAccess().getHeightKeyword_6());
                
            // InternalTabletUIDSL.g:211:1: ( (lv_height_8_0= RULE_INT ) )
            // InternalTabletUIDSL.g:212:1: (lv_height_8_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:212:1: (lv_height_8_0= RULE_INT )
            // InternalTabletUIDSL.g:213:3: lv_height_8_0= RULE_INT
            {
            lv_height_8_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            			newLeafNode(lv_height_8_0, grammarAccess.getSettingsAccess().getHeightINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_8_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_8); 

                	newLeafNode(otherlv_9, grammarAccess.getSettingsAccess().getColumnsKeyword_8());
                
            // InternalTabletUIDSL.g:233:1: ( (lv_columns_10_0= RULE_INT ) )
            // InternalTabletUIDSL.g:234:1: (lv_columns_10_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:234:1: (lv_columns_10_0= RULE_INT )
            // InternalTabletUIDSL.g:235:3: lv_columns_10_0= RULE_INT
            {
            lv_columns_10_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            			newLeafNode(lv_columns_10_0, grammarAccess.getSettingsAccess().getColumnsINTTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"columns",
                    		lv_columns_10_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_8); 

                	newLeafNode(otherlv_11, grammarAccess.getSettingsAccess().getRowsKeyword_10());
                
            // InternalTabletUIDSL.g:255:1: ( (lv_rows_12_0= RULE_INT ) )
            // InternalTabletUIDSL.g:256:1: (lv_rows_12_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:256:1: (lv_rows_12_0= RULE_INT )
            // InternalTabletUIDSL.g:257:3: lv_rows_12_0= RULE_INT
            {
            lv_rows_12_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            			newLeafNode(lv_rows_12_0, grammarAccess.getSettingsAccess().getRowsINTTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rows",
                    		lv_rows_12_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            // InternalTabletUIDSL.g:273:2: (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTabletUIDSL.g:273:4: otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_13); 

                        	newLeafNode(otherlv_13, grammarAccess.getSettingsAccess().getDebugKeyword_12_0());
                        
                    // InternalTabletUIDSL.g:277:1: ( (lv_debug_14_0= ruleBOOL ) )
                    // InternalTabletUIDSL.g:278:1: (lv_debug_14_0= ruleBOOL )
                    {
                    // InternalTabletUIDSL.g:278:1: (lv_debug_14_0= ruleBOOL )
                    // InternalTabletUIDSL.g:279:3: lv_debug_14_0= ruleBOOL
                    {
                     
                    	        newCompositeNode(grammarAccess.getSettingsAccess().getDebugBOOLParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FOLLOW_14);
                    lv_debug_14_0=ruleBOOL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSettingsRule());
                    	        }
                           		set(
                           			current, 
                           			"debug",
                            		lv_debug_14_0, 
                            		"org.ckr.TabletUIDSL.BOOL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_13); 

                	newLeafNode(otherlv_15, grammarAccess.getSettingsAccess().getDragDropKeyword_13());
                
            // InternalTabletUIDSL.g:299:1: ( (lv_dragdrop_16_0= ruleBOOL ) )
            // InternalTabletUIDSL.g:300:1: (lv_dragdrop_16_0= ruleBOOL )
            {
            // InternalTabletUIDSL.g:300:1: (lv_dragdrop_16_0= ruleBOOL )
            // InternalTabletUIDSL.g:301:3: lv_dragdrop_16_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getSettingsAccess().getDragdropBOOLParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_15);
            lv_dragdrop_16_0=ruleBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSettingsRule());
            	        }
                   		set(
                   			current, 
                   			"dragdrop",
                    		lv_dragdrop_16_0, 
                    		"org.ckr.TabletUIDSL.BOOL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,20,FOLLOW_8); 

                	newLeafNode(otherlv_17, grammarAccess.getSettingsAccess().getGridster_marginKeyword_15());
                
            // InternalTabletUIDSL.g:321:1: ( (lv_margin_18_0= RULE_INT ) )
            // InternalTabletUIDSL.g:322:1: (lv_margin_18_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:322:1: (lv_margin_18_0= RULE_INT )
            // InternalTabletUIDSL.g:323:3: lv_margin_18_0= RULE_INT
            {
            lv_margin_18_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			newLeafNode(lv_margin_18_0, grammarAccess.getSettingsAccess().getMarginINTTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"margin",
                    		lv_margin_18_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            // InternalTabletUIDSL.g:339:2: ( (lv_settings_19_0= ruleSettingsElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21||LA4_0==92) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTabletUIDSL.g:340:1: (lv_settings_19_0= ruleSettingsElement )
            	    {
            	    // InternalTabletUIDSL.g:340:1: (lv_settings_19_0= ruleSettingsElement )
            	    // InternalTabletUIDSL.g:341:3: lv_settings_19_0= ruleSettingsElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSettingsAccess().getSettingsSettingsElementParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_16);
            	    lv_settings_19_0=ruleSettingsElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSettingsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"settings",
            	            		lv_settings_19_0, 
            	            		"org.ckr.TabletUIDSL.SettingsElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSettings"


    // $ANTLR start "entryRuleSettingsElement"
    // InternalTabletUIDSL.g:365:1: entryRuleSettingsElement returns [EObject current=null] : iv_ruleSettingsElement= ruleSettingsElement EOF ;
    public final EObject entryRuleSettingsElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingsElement = null;


        try {
            // InternalTabletUIDSL.g:366:2: (iv_ruleSettingsElement= ruleSettingsElement EOF )
            // InternalTabletUIDSL.g:367:2: iv_ruleSettingsElement= ruleSettingsElement EOF
            {
             newCompositeNode(grammarAccess.getSettingsElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSettingsElement=ruleSettingsElement();

            state._fsp--;

             current =iv_ruleSettingsElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSettingsElement"


    // $ANTLR start "ruleSettingsElement"
    // InternalTabletUIDSL.g:374:1: ruleSettingsElement returns [EObject current=null] : (this_CSS_0= ruleCSS | this_Color_1= ruleColor ) ;
    public final EObject ruleSettingsElement() throws RecognitionException {
        EObject current = null;

        EObject this_CSS_0 = null;

        EObject this_Color_1 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:377:28: ( (this_CSS_0= ruleCSS | this_Color_1= ruleColor ) )
            // InternalTabletUIDSL.g:378:1: (this_CSS_0= ruleCSS | this_Color_1= ruleColor )
            {
            // InternalTabletUIDSL.g:378:1: (this_CSS_0= ruleCSS | this_Color_1= ruleColor )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==92) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTabletUIDSL.g:379:5: this_CSS_0= ruleCSS
                    {
                     
                            newCompositeNode(grammarAccess.getSettingsElementAccess().getCSSParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CSS_0=ruleCSS();

                    state._fsp--;

                     
                            current = this_CSS_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalTabletUIDSL.g:389:5: this_Color_1= ruleColor
                    {
                     
                            newCompositeNode(grammarAccess.getSettingsElementAccess().getColorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Color_1=ruleColor();

                    state._fsp--;

                     
                            current = this_Color_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSettingsElement"


    // $ANTLR start "entryRuleCSS"
    // InternalTabletUIDSL.g:405:1: entryRuleCSS returns [EObject current=null] : iv_ruleCSS= ruleCSS EOF ;
    public final EObject entryRuleCSS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSS = null;


        try {
            // InternalTabletUIDSL.g:406:2: (iv_ruleCSS= ruleCSS EOF )
            // InternalTabletUIDSL.g:407:2: iv_ruleCSS= ruleCSS EOF
            {
             newCompositeNode(grammarAccess.getCSSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSS=ruleCSS();

            state._fsp--;

             current =iv_ruleCSS; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSS"


    // $ANTLR start "ruleCSS"
    // InternalTabletUIDSL.g:414:1: ruleCSS returns [EObject current=null] : (otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:417:28: ( (otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // InternalTabletUIDSL.g:418:1: (otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // InternalTabletUIDSL.g:418:1: (otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) ) )
            // InternalTabletUIDSL.g:418:3: otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getCSSAccess().getCssKeyword_0());
                
            // InternalTabletUIDSL.g:422:1: ( (lv_path_1_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:423:1: (lv_path_1_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:423:1: (lv_path_1_0= RULE_STRING )
            // InternalTabletUIDSL.g:424:3: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_path_1_0, grammarAccess.getCSSAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCSSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSS"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalTabletUIDSL.g:448:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalTabletUIDSL.g:449:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalTabletUIDSL.g:450:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalTabletUIDSL.g:457:1: ruleAbstractElement returns [EObject current=null] : (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Screensaver_2= ruleScreensaver ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Page_0 = null;

        EObject this_Template_1 = null;

        EObject this_Screensaver_2 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:460:28: ( (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Screensaver_2= ruleScreensaver ) )
            // InternalTabletUIDSL.g:461:1: (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Screensaver_2= ruleScreensaver )
            {
            // InternalTabletUIDSL.g:461:1: (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Screensaver_2= ruleScreensaver )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==27) ) {
                    alt6=2;
                }
                else if ( (LA6_1==24) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==25) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTabletUIDSL.g:462:5: this_Page_0= rulePage
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getPageParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Page_0=rulePage();

                    state._fsp--;

                     
                            current = this_Page_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalTabletUIDSL.g:472:5: this_Template_1= ruleTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTemplateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Template_1=ruleTemplate();

                    state._fsp--;

                     
                            current = this_Template_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalTabletUIDSL.g:482:5: this_Screensaver_2= ruleScreensaver
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getScreensaverParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Screensaver_2=ruleScreensaver();

                    state._fsp--;

                     
                            current = this_Screensaver_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleBOOL"
    // InternalTabletUIDSL.g:498:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // InternalTabletUIDSL.g:499:2: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalTabletUIDSL.g:500:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalTabletUIDSL.g:507:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:510:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalTabletUIDSL.g:511:1: (kw= 'true' | kw= 'false' )
            {
            // InternalTabletUIDSL.g:511:1: (kw= 'true' | kw= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTabletUIDSL.g:512:2: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalTabletUIDSL.g:519:2: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRulePage"
    // InternalTabletUIDSL.g:532:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalTabletUIDSL.g:533:2: (iv_rulePage= rulePage EOF )
            // InternalTabletUIDSL.g:534:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalTabletUIDSL.g:541:1: rulePage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'screensaver' ( (otherlv_3= RULE_ID ) ) )? ( (lv_elements_4_0= ruleGridster ) )* otherlv_5= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:544:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'screensaver' ( (otherlv_3= RULE_ID ) ) )? ( (lv_elements_4_0= ruleGridster ) )* otherlv_5= '}' ) )
            // InternalTabletUIDSL.g:545:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'screensaver' ( (otherlv_3= RULE_ID ) ) )? ( (lv_elements_4_0= ruleGridster ) )* otherlv_5= '}' )
            {
            // InternalTabletUIDSL.g:545:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'screensaver' ( (otherlv_3= RULE_ID ) ) )? ( (lv_elements_4_0= ruleGridster ) )* otherlv_5= '}' )
            // InternalTabletUIDSL.g:545:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'screensaver' ( (otherlv_3= RULE_ID ) ) )? ( (lv_elements_4_0= ruleGridster ) )* otherlv_5= '}'
            {
            // InternalTabletUIDSL.g:545:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTabletUIDSL.g:546:1: (lv_name_0_0= RULE_ID )
            {
            // InternalTabletUIDSL.g:546:1: (lv_name_0_0= RULE_ID )
            // InternalTabletUIDSL.g:547:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

                	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:567:1: (otherlv_2= 'screensaver' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTabletUIDSL.g:567:3: otherlv_2= 'screensaver' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_19); 

                        	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getScreensaverKeyword_2_0());
                        
                    // InternalTabletUIDSL.g:571:1: ( (otherlv_3= RULE_ID ) )
                    // InternalTabletUIDSL.g:572:1: (otherlv_3= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:572:1: (otherlv_3= RULE_ID )
                    // InternalTabletUIDSL.g:573:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPageRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    		newLeafNode(otherlv_3, grammarAccess.getPageAccess().getScreensaverScreensaverCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:584:4: ( (lv_elements_4_0= ruleGridster ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTabletUIDSL.g:585:1: (lv_elements_4_0= ruleGridster )
            	    {
            	    // InternalTabletUIDSL.g:585:1: (lv_elements_4_0= ruleGridster )
            	    // InternalTabletUIDSL.g:586:3: lv_elements_4_0= ruleGridster
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getElementsGridsterParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_20);
            	    lv_elements_4_0=ruleGridster();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"org.ckr.TabletUIDSL.Gridster");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleScreensaver"
    // InternalTabletUIDSL.g:614:1: entryRuleScreensaver returns [EObject current=null] : iv_ruleScreensaver= ruleScreensaver EOF ;
    public final EObject entryRuleScreensaver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreensaver = null;


        try {
            // InternalTabletUIDSL.g:615:2: (iv_ruleScreensaver= ruleScreensaver EOF )
            // InternalTabletUIDSL.g:616:2: iv_ruleScreensaver= ruleScreensaver EOF
            {
             newCompositeNode(grammarAccess.getScreensaverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScreensaver=ruleScreensaver();

            state._fsp--;

             current =iv_ruleScreensaver; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScreensaver"


    // $ANTLR start "ruleScreensaver"
    // InternalTabletUIDSL.g:623:1: ruleScreensaver returns [EObject current=null] : (otherlv_0= 'screensaver' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_widgets_3_0= ruleWidgetDef ) )* otherlv_4= '}' ) ;
    public final EObject ruleScreensaver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_widgets_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:626:28: ( (otherlv_0= 'screensaver' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_widgets_3_0= ruleWidgetDef ) )* otherlv_4= '}' ) )
            // InternalTabletUIDSL.g:627:1: (otherlv_0= 'screensaver' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_widgets_3_0= ruleWidgetDef ) )* otherlv_4= '}' )
            {
            // InternalTabletUIDSL.g:627:1: (otherlv_0= 'screensaver' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_widgets_3_0= ruleWidgetDef ) )* otherlv_4= '}' )
            // InternalTabletUIDSL.g:627:3: otherlv_0= 'screensaver' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_widgets_3_0= ruleWidgetDef ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getScreensaverAccess().getScreensaverKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_19); 

                	newLeafNode(otherlv_1, grammarAccess.getScreensaverAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:635:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalTabletUIDSL.g:636:1: (lv_name_2_0= RULE_ID )
            {
            // InternalTabletUIDSL.g:636:1: (lv_name_2_0= RULE_ID )
            // InternalTabletUIDSL.g:637:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			newLeafNode(lv_name_2_0, grammarAccess.getScreensaverAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScreensaverRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalTabletUIDSL.g:653:2: ( (lv_widgets_3_0= ruleWidgetDef ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35||LA10_0==42||(LA10_0>=44 && LA10_0<=45)||LA10_0==53||LA10_0==56||LA10_0==63||LA10_0==65||(LA10_0>=72 && LA10_0<=74)||LA10_0==76||LA10_0==82||LA10_0==85||LA10_0==91||LA10_0==94||LA10_0==97||LA10_0==103||LA10_0==112||LA10_0==116||LA10_0==122) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTabletUIDSL.g:654:1: (lv_widgets_3_0= ruleWidgetDef )
            	    {
            	    // InternalTabletUIDSL.g:654:1: (lv_widgets_3_0= ruleWidgetDef )
            	    // InternalTabletUIDSL.g:655:3: lv_widgets_3_0= ruleWidgetDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScreensaverAccess().getWidgetsWidgetDefParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_21);
            	    lv_widgets_3_0=ruleWidgetDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScreensaverRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"widgets",
            	            		lv_widgets_3_0, 
            	            		"org.ckr.TabletUIDSL.WidgetDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getScreensaverAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScreensaver"


    // $ANTLR start "entryRuleTemplate"
    // InternalTabletUIDSL.g:683:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalTabletUIDSL.g:684:2: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalTabletUIDSL.g:685:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalTabletUIDSL.g:692:1: ruleTemplate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'template' otherlv_2= '{' ( (lv_elements_3_0= ruleDiv ) )* otherlv_4= '}' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:695:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'template' otherlv_2= '{' ( (lv_elements_3_0= ruleDiv ) )* otherlv_4= '}' ) )
            // InternalTabletUIDSL.g:696:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'template' otherlv_2= '{' ( (lv_elements_3_0= ruleDiv ) )* otherlv_4= '}' )
            {
            // InternalTabletUIDSL.g:696:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'template' otherlv_2= '{' ( (lv_elements_3_0= ruleDiv ) )* otherlv_4= '}' )
            // InternalTabletUIDSL.g:696:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'template' otherlv_2= '{' ( (lv_elements_3_0= ruleDiv ) )* otherlv_4= '}'
            {
            // InternalTabletUIDSL.g:696:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTabletUIDSL.g:697:1: (lv_name_0_0= RULE_ID )
            {
            // InternalTabletUIDSL.g:697:1: (lv_name_0_0= RULE_ID )
            // InternalTabletUIDSL.g:698:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTemplateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_17); 

                	newLeafNode(otherlv_1, grammarAccess.getTemplateAccess().getTemplateKeyword_1());
                
            otherlv_2=(Token)match(input,24,FOLLOW_23); 

                	newLeafNode(otherlv_2, grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalTabletUIDSL.g:722:1: ( (lv_elements_3_0= ruleDiv ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==73) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTabletUIDSL.g:723:1: (lv_elements_3_0= ruleDiv )
            	    {
            	    // InternalTabletUIDSL.g:723:1: (lv_elements_3_0= ruleDiv )
            	    // InternalTabletUIDSL.g:724:3: lv_elements_3_0= ruleDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateAccess().getElementsDivParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_23);
            	    lv_elements_3_0=ruleDiv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"org.ckr.TabletUIDSL.Div");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleGridster"
    // InternalTabletUIDSL.g:752:1: entryRuleGridster returns [EObject current=null] : iv_ruleGridster= ruleGridster EOF ;
    public final EObject entryRuleGridster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridster = null;


        try {
            // InternalTabletUIDSL.g:753:2: (iv_ruleGridster= ruleGridster EOF )
            // InternalTabletUIDSL.g:754:2: iv_ruleGridster= ruleGridster EOF
            {
             newCompositeNode(grammarAccess.getGridsterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGridster=ruleGridster();

            state._fsp--;

             current =iv_ruleGridster; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGridster"


    // $ANTLR start "ruleGridster"
    // InternalTabletUIDSL.g:761:1: ruleGridster returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? ( (lv_colors_15_0= ruleColor ) )* ( (lv_widgets_16_0= ruleWidgetDef ) )* otherlv_17= '}' ) ;
    public final EObject ruleGridster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_header_2_0=null;
        Token otherlv_3=null;
        Token lv_row_4_0=null;
        Token otherlv_5=null;
        Token lv_column_6_0=null;
        Token otherlv_7=null;
        Token lv_colspan_8_0=null;
        Token otherlv_9=null;
        Token lv_rowspan_10_0=null;
        Token otherlv_11=null;
        Token lv_class_12_0=null;
        Token otherlv_13=null;
        Token lv_style_14_0=null;
        Token otherlv_17=null;
        EObject lv_colors_15_0 = null;

        EObject lv_widgets_16_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:764:28: ( (otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? ( (lv_colors_15_0= ruleColor ) )* ( (lv_widgets_16_0= ruleWidgetDef ) )* otherlv_17= '}' ) )
            // InternalTabletUIDSL.g:765:1: (otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? ( (lv_colors_15_0= ruleColor ) )* ( (lv_widgets_16_0= ruleWidgetDef ) )* otherlv_17= '}' )
            {
            // InternalTabletUIDSL.g:765:1: (otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? ( (lv_colors_15_0= ruleColor ) )* ( (lv_widgets_16_0= ruleWidgetDef ) )* otherlv_17= '}' )
            // InternalTabletUIDSL.g:765:3: otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? ( (lv_colors_15_0= ruleColor ) )* ( (lv_widgets_16_0= ruleWidgetDef ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24); 

                	newLeafNode(otherlv_0, grammarAccess.getGridsterAccess().getLeftCurlyBracketKeyword_0());
                
            // InternalTabletUIDSL.g:769:1: (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTabletUIDSL.g:769:3: otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_5); 

                        	newLeafNode(otherlv_1, grammarAccess.getGridsterAccess().getHeaderKeyword_1_0());
                        
                    // InternalTabletUIDSL.g:773:1: ( (lv_header_2_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:774:1: (lv_header_2_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:774:1: (lv_header_2_0= RULE_STRING )
                    // InternalTabletUIDSL.g:775:3: lv_header_2_0= RULE_STRING
                    {
                    lv_header_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    			newLeafNode(lv_header_2_0, grammarAccess.getGridsterAccess().getHeaderSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridsterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"header",
                            		lv_header_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_8); 

                	newLeafNode(otherlv_3, grammarAccess.getGridsterAccess().getRowKeyword_2());
                
            // InternalTabletUIDSL.g:795:1: ( (lv_row_4_0= RULE_INT ) )
            // InternalTabletUIDSL.g:796:1: (lv_row_4_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:796:1: (lv_row_4_0= RULE_INT )
            // InternalTabletUIDSL.g:797:3: lv_row_4_0= RULE_INT
            {
            lv_row_4_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            			newLeafNode(lv_row_4_0, grammarAccess.getGridsterAccess().getRowINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGridsterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"row",
                    		lv_row_4_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_8); 

                	newLeafNode(otherlv_5, grammarAccess.getGridsterAccess().getColumnKeyword_4());
                
            // InternalTabletUIDSL.g:817:1: ( (lv_column_6_0= RULE_INT ) )
            // InternalTabletUIDSL.g:818:1: (lv_column_6_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:818:1: (lv_column_6_0= RULE_INT )
            // InternalTabletUIDSL.g:819:3: lv_column_6_0= RULE_INT
            {
            lv_column_6_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            			newLeafNode(lv_column_6_0, grammarAccess.getGridsterAccess().getColumnINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGridsterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"column",
                    		lv_column_6_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            // InternalTabletUIDSL.g:835:2: (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTabletUIDSL.g:835:4: otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_8); 

                        	newLeafNode(otherlv_7, grammarAccess.getGridsterAccess().getColspanKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:839:1: ( (lv_colspan_8_0= RULE_INT ) )
                    // InternalTabletUIDSL.g:840:1: (lv_colspan_8_0= RULE_INT )
                    {
                    // InternalTabletUIDSL.g:840:1: (lv_colspan_8_0= RULE_INT )
                    // InternalTabletUIDSL.g:841:3: lv_colspan_8_0= RULE_INT
                    {
                    lv_colspan_8_0=(Token)match(input,RULE_INT,FOLLOW_28); 

                    			newLeafNode(lv_colspan_8_0, grammarAccess.getGridsterAccess().getColspanINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridsterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"colspan",
                            		lv_colspan_8_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:857:4: (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTabletUIDSL.g:857:6: otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_8); 

                        	newLeafNode(otherlv_9, grammarAccess.getGridsterAccess().getRowspanKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:861:1: ( (lv_rowspan_10_0= RULE_INT ) )
                    // InternalTabletUIDSL.g:862:1: (lv_rowspan_10_0= RULE_INT )
                    {
                    // InternalTabletUIDSL.g:862:1: (lv_rowspan_10_0= RULE_INT )
                    // InternalTabletUIDSL.g:863:3: lv_rowspan_10_0= RULE_INT
                    {
                    lv_rowspan_10_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    			newLeafNode(lv_rowspan_10_0, grammarAccess.getGridsterAccess().getRowspanINTTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridsterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rowspan",
                            		lv_rowspan_10_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:879:4: (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTabletUIDSL.g:879:6: otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getGridsterAccess().getClassKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:883:1: ( (lv_class_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:884:1: (lv_class_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:884:1: (lv_class_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:885:3: lv_class_12_0= RULE_STRING
                    {
                    lv_class_12_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    			newLeafNode(lv_class_12_0, grammarAccess.getGridsterAccess().getClassSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridsterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:901:4: (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTabletUIDSL.g:901:6: otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_5); 

                        	newLeafNode(otherlv_13, grammarAccess.getGridsterAccess().getStyleKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:905:1: ( (lv_style_14_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:906:1: (lv_style_14_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:906:1: (lv_style_14_0= RULE_STRING )
                    // InternalTabletUIDSL.g:907:3: lv_style_14_0= RULE_STRING
                    {
                    lv_style_14_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    			newLeafNode(lv_style_14_0, grammarAccess.getGridsterAccess().getStyleSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridsterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:923:4: ( (lv_colors_15_0= ruleColor ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==92) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTabletUIDSL.g:924:1: (lv_colors_15_0= ruleColor )
            	    {
            	    // InternalTabletUIDSL.g:924:1: (lv_colors_15_0= ruleColor )
            	    // InternalTabletUIDSL.g:925:3: lv_colors_15_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridsterAccess().getColorsColorParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_31);
            	    lv_colors_15_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridsterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_15_0, 
            	            		"org.ckr.TabletUIDSL.Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalTabletUIDSL.g:941:3: ( (lv_widgets_16_0= ruleWidgetDef ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35||LA18_0==42||(LA18_0>=44 && LA18_0<=45)||LA18_0==53||LA18_0==56||LA18_0==63||LA18_0==65||(LA18_0>=72 && LA18_0<=74)||LA18_0==76||LA18_0==82||LA18_0==85||LA18_0==91||LA18_0==94||LA18_0==97||LA18_0==103||LA18_0==112||LA18_0==116||LA18_0==122) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTabletUIDSL.g:942:1: (lv_widgets_16_0= ruleWidgetDef )
            	    {
            	    // InternalTabletUIDSL.g:942:1: (lv_widgets_16_0= ruleWidgetDef )
            	    // InternalTabletUIDSL.g:943:3: lv_widgets_16_0= ruleWidgetDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridsterAccess().getWidgetsWidgetDefParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_21);
            	    lv_widgets_16_0=ruleWidgetDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridsterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"widgets",
            	            		lv_widgets_16_0, 
            	            		"org.ckr.TabletUIDSL.WidgetDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_17=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_17, grammarAccess.getGridsterAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGridster"


    // $ANTLR start "entryRuleWidgetDef"
    // InternalTabletUIDSL.g:971:1: entryRuleWidgetDef returns [EObject current=null] : iv_ruleWidgetDef= ruleWidgetDef EOF ;
    public final EObject entryRuleWidgetDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetDef = null;


        try {
            // InternalTabletUIDSL.g:972:2: (iv_ruleWidgetDef= ruleWidgetDef EOF )
            // InternalTabletUIDSL.g:973:2: iv_ruleWidgetDef= ruleWidgetDef EOF
            {
             newCompositeNode(grammarAccess.getWidgetDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetDef=ruleWidgetDef();

            state._fsp--;

             current =iv_ruleWidgetDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidgetDef"


    // $ANTLR start "ruleWidgetDef"
    // InternalTabletUIDSL.g:980:1: ruleWidgetDef returns [EObject current=null] : (this_Div_0= ruleDiv | this_Widget_1= ruleWidget ) ;
    public final EObject ruleWidgetDef() throws RecognitionException {
        EObject current = null;

        EObject this_Div_0 = null;

        EObject this_Widget_1 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:983:28: ( (this_Div_0= ruleDiv | this_Widget_1= ruleWidget ) )
            // InternalTabletUIDSL.g:984:1: (this_Div_0= ruleDiv | this_Widget_1= ruleWidget )
            {
            // InternalTabletUIDSL.g:984:1: (this_Div_0= ruleDiv | this_Widget_1= ruleWidget )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==73) ) {
                alt19=1;
            }
            else if ( (LA19_0==35||LA19_0==42||(LA19_0>=44 && LA19_0<=45)||LA19_0==53||LA19_0==56||LA19_0==63||LA19_0==65||LA19_0==72||LA19_0==74||LA19_0==76||LA19_0==82||LA19_0==85||LA19_0==91||LA19_0==94||LA19_0==97||LA19_0==103||LA19_0==112||LA19_0==116||LA19_0==122) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTabletUIDSL.g:985:5: this_Div_0= ruleDiv
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetDefAccess().getDivParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Div_0=ruleDiv();

                    state._fsp--;

                     
                            current = this_Div_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalTabletUIDSL.g:995:5: this_Widget_1= ruleWidget
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetDefAccess().getWidgetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Widget_1=ruleWidget();

                    state._fsp--;

                     
                            current = this_Widget_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidgetDef"


    // $ANTLR start "entryRuleWidget"
    // InternalTabletUIDSL.g:1011:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalTabletUIDSL.g:1012:2: (iv_ruleWidget= ruleWidget EOF )
            // InternalTabletUIDSL.g:1013:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalTabletUIDSL.g:1020:1: ruleWidget returns [EObject current=null] : (this_Switch_0= ruleSwitch | this_Button_1= ruleButton | this_Label_2= ruleLabel | this_SimpleClock_3= ruleSimpleClock | this_Symbol_4= ruleSymbol | this_Calview_5= ruleCalview | this_SimpleChart_6= ruleSimpleChart | this_Custom_7= ruleCustom | this_Weather_8= ruleWeather | this_Klimatrend_9= ruleKlimatrend | this_itunes_artwork_10= ruleitunes_artwork | this_Image_11= ruleImage | this_Push_12= rulePush | this_Volume_13= ruleVolume | this_Select_14= ruleSelect | this_TemplateRef_15= ruleTemplateRef | this_Swiper_16= ruleSwiper | this_Popup_17= rulePopup | this_Link_18= ruleLink | this_Clock_19= ruleClock ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_Switch_0 = null;

        EObject this_Button_1 = null;

        EObject this_Label_2 = null;

        EObject this_SimpleClock_3 = null;

        EObject this_Symbol_4 = null;

        EObject this_Calview_5 = null;

        EObject this_SimpleChart_6 = null;

        EObject this_Custom_7 = null;

        EObject this_Weather_8 = null;

        EObject this_Klimatrend_9 = null;

        EObject this_itunes_artwork_10 = null;

        EObject this_Image_11 = null;

        EObject this_Push_12 = null;

        EObject this_Volume_13 = null;

        EObject this_Select_14 = null;

        EObject this_TemplateRef_15 = null;

        EObject this_Swiper_16 = null;

        EObject this_Popup_17 = null;

        EObject this_Link_18 = null;

        EObject this_Clock_19 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:1023:28: ( (this_Switch_0= ruleSwitch | this_Button_1= ruleButton | this_Label_2= ruleLabel | this_SimpleClock_3= ruleSimpleClock | this_Symbol_4= ruleSymbol | this_Calview_5= ruleCalview | this_SimpleChart_6= ruleSimpleChart | this_Custom_7= ruleCustom | this_Weather_8= ruleWeather | this_Klimatrend_9= ruleKlimatrend | this_itunes_artwork_10= ruleitunes_artwork | this_Image_11= ruleImage | this_Push_12= rulePush | this_Volume_13= ruleVolume | this_Select_14= ruleSelect | this_TemplateRef_15= ruleTemplateRef | this_Swiper_16= ruleSwiper | this_Popup_17= rulePopup | this_Link_18= ruleLink | this_Clock_19= ruleClock ) )
            // InternalTabletUIDSL.g:1024:1: (this_Switch_0= ruleSwitch | this_Button_1= ruleButton | this_Label_2= ruleLabel | this_SimpleClock_3= ruleSimpleClock | this_Symbol_4= ruleSymbol | this_Calview_5= ruleCalview | this_SimpleChart_6= ruleSimpleChart | this_Custom_7= ruleCustom | this_Weather_8= ruleWeather | this_Klimatrend_9= ruleKlimatrend | this_itunes_artwork_10= ruleitunes_artwork | this_Image_11= ruleImage | this_Push_12= rulePush | this_Volume_13= ruleVolume | this_Select_14= ruleSelect | this_TemplateRef_15= ruleTemplateRef | this_Swiper_16= ruleSwiper | this_Popup_17= rulePopup | this_Link_18= ruleLink | this_Clock_19= ruleClock )
            {
            // InternalTabletUIDSL.g:1024:1: (this_Switch_0= ruleSwitch | this_Button_1= ruleButton | this_Label_2= ruleLabel | this_SimpleClock_3= ruleSimpleClock | this_Symbol_4= ruleSymbol | this_Calview_5= ruleCalview | this_SimpleChart_6= ruleSimpleChart | this_Custom_7= ruleCustom | this_Weather_8= ruleWeather | this_Klimatrend_9= ruleKlimatrend | this_itunes_artwork_10= ruleitunes_artwork | this_Image_11= ruleImage | this_Push_12= rulePush | this_Volume_13= ruleVolume | this_Select_14= ruleSelect | this_TemplateRef_15= ruleTemplateRef | this_Swiper_16= ruleSwiper | this_Popup_17= rulePopup | this_Link_18= ruleLink | this_Clock_19= ruleClock )
            int alt20=20;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt20=1;
                }
                break;
            case 97:
                {
                alt20=2;
                }
                break;
            case 94:
                {
                alt20=3;
                }
                break;
            case 116:
                {
                alt20=4;
                }
                break;
            case 112:
                {
                alt20=5;
                }
                break;
            case 82:
                {
                alt20=6;
                }
                break;
            case 122:
                {
                alt20=7;
                }
                break;
            case 72:
                {
                alt20=8;
                }
                break;
            case 76:
                {
                alt20=9;
                }
                break;
            case 103:
                {
                alt20=10;
                }
                break;
            case 74:
                {
                alt20=11;
                }
                break;
            case 63:
                {
                alt20=12;
                }
                break;
            case 56:
                {
                alt20=13;
                }
                break;
            case 53:
                {
                alt20=14;
                }
                break;
            case 45:
                {
                alt20=15;
                }
                break;
            case 44:
                {
                alt20=16;
                }
                break;
            case 42:
                {
                alt20=17;
                }
                break;
            case 85:
                {
                alt20=18;
                }
                break;
            case 91:
                {
                alt20=19;
                }
                break;
            case 35:
                {
                alt20=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalTabletUIDSL.g:1025:5: this_Switch_0= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSwitchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Switch_0=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalTabletUIDSL.g:1035:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalTabletUIDSL.g:1045:5: this_Label_2= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getLabelParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Label_2=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalTabletUIDSL.g:1055:5: this_SimpleClock_3= ruleSimpleClock
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSimpleClockParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SimpleClock_3=ruleSimpleClock();

                    state._fsp--;

                     
                            current = this_SimpleClock_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalTabletUIDSL.g:1065:5: this_Symbol_4= ruleSymbol
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSymbolParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Symbol_4=ruleSymbol();

                    state._fsp--;

                     
                            current = this_Symbol_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalTabletUIDSL.g:1075:5: this_Calview_5= ruleCalview
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCalviewParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Calview_5=ruleCalview();

                    state._fsp--;

                     
                            current = this_Calview_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalTabletUIDSL.g:1085:5: this_SimpleChart_6= ruleSimpleChart
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSimpleChartParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SimpleChart_6=ruleSimpleChart();

                    state._fsp--;

                     
                            current = this_SimpleChart_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalTabletUIDSL.g:1095:5: this_Custom_7= ruleCustom
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCustomParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Custom_7=ruleCustom();

                    state._fsp--;

                     
                            current = this_Custom_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalTabletUIDSL.g:1105:5: this_Weather_8= ruleWeather
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getWeatherParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Weather_8=ruleWeather();

                    state._fsp--;

                     
                            current = this_Weather_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalTabletUIDSL.g:1115:5: this_Klimatrend_9= ruleKlimatrend
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getKlimatrendParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Klimatrend_9=ruleKlimatrend();

                    state._fsp--;

                     
                            current = this_Klimatrend_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalTabletUIDSL.g:1125:5: this_itunes_artwork_10= ruleitunes_artwork
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getItunes_artworkParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_itunes_artwork_10=ruleitunes_artwork();

                    state._fsp--;

                     
                            current = this_itunes_artwork_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalTabletUIDSL.g:1135:5: this_Image_11= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getImageParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Image_11=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // InternalTabletUIDSL.g:1145:5: this_Push_12= rulePush
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getPushParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Push_12=rulePush();

                    state._fsp--;

                     
                            current = this_Push_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // InternalTabletUIDSL.g:1155:5: this_Volume_13= ruleVolume
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getVolumeParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Volume_13=ruleVolume();

                    state._fsp--;

                     
                            current = this_Volume_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // InternalTabletUIDSL.g:1165:5: this_Select_14= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSelectParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Select_14=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // InternalTabletUIDSL.g:1175:5: this_TemplateRef_15= ruleTemplateRef
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getTemplateRefParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_2);
                    this_TemplateRef_15=ruleTemplateRef();

                    state._fsp--;

                     
                            current = this_TemplateRef_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // InternalTabletUIDSL.g:1185:5: this_Swiper_16= ruleSwiper
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSwiperParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Swiper_16=ruleSwiper();

                    state._fsp--;

                     
                            current = this_Swiper_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // InternalTabletUIDSL.g:1195:5: this_Popup_17= rulePopup
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getPopupParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Popup_17=rulePopup();

                    state._fsp--;

                     
                            current = this_Popup_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // InternalTabletUIDSL.g:1205:5: this_Link_18= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getLinkParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Link_18=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // InternalTabletUIDSL.g:1215:5: this_Clock_19= ruleClock
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getClockParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Clock_19=ruleClock();

                    state._fsp--;

                     
                            current = this_Clock_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleClock"
    // InternalTabletUIDSL.g:1231:1: entryRuleClock returns [EObject current=null] : iv_ruleClock= ruleClock EOF ;
    public final EObject entryRuleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClock = null;


        try {
            // InternalTabletUIDSL.g:1232:2: (iv_ruleClock= ruleClock EOF )
            // InternalTabletUIDSL.g:1233:2: iv_ruleClock= ruleClock EOF
            {
             newCompositeNode(grammarAccess.getClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClock=ruleClock();

            state._fsp--;

             current =iv_ruleClock; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClock"


    // $ANTLR start "ruleClock"
    // InternalTabletUIDSL.g:1240:1: ruleClock returns [EObject current=null] : (otherlv_0= 'clock' otherlv_1= '{' otherlv_2= 'format' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'class' ( (lv_class_5_0= RULE_STRING ) ) (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? (otherlv_8= 'interval' ( (lv_interval_9_0= RULE_INT ) ) )? (otherlv_10= 'days' ( (lv_days_11_0= RULE_STRING ) ) )? (otherlv_12= 'shortday-length' ( (lv_shortdayLength_13_0= RULE_INT ) ) )? (otherlv_14= 'months' ( (lv_month_15_0= RULE_STRING ) ) )? (otherlv_16= 'shortmonth-length' ( (lv_monthLength_17_0= RULE_INT ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_format_3_0=null;
        Token otherlv_4=null;
        Token lv_class_5_0=null;
        Token otherlv_6=null;
        Token lv_style_7_0=null;
        Token otherlv_8=null;
        Token lv_interval_9_0=null;
        Token otherlv_10=null;
        Token lv_days_11_0=null;
        Token otherlv_12=null;
        Token lv_shortdayLength_13_0=null;
        Token otherlv_14=null;
        Token lv_month_15_0=null;
        Token otherlv_16=null;
        Token lv_monthLength_17_0=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:1243:28: ( (otherlv_0= 'clock' otherlv_1= '{' otherlv_2= 'format' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'class' ( (lv_class_5_0= RULE_STRING ) ) (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? (otherlv_8= 'interval' ( (lv_interval_9_0= RULE_INT ) ) )? (otherlv_10= 'days' ( (lv_days_11_0= RULE_STRING ) ) )? (otherlv_12= 'shortday-length' ( (lv_shortdayLength_13_0= RULE_INT ) ) )? (otherlv_14= 'months' ( (lv_month_15_0= RULE_STRING ) ) )? (otherlv_16= 'shortmonth-length' ( (lv_monthLength_17_0= RULE_INT ) ) )? otherlv_18= '}' ) )
            // InternalTabletUIDSL.g:1244:1: (otherlv_0= 'clock' otherlv_1= '{' otherlv_2= 'format' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'class' ( (lv_class_5_0= RULE_STRING ) ) (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? (otherlv_8= 'interval' ( (lv_interval_9_0= RULE_INT ) ) )? (otherlv_10= 'days' ( (lv_days_11_0= RULE_STRING ) ) )? (otherlv_12= 'shortday-length' ( (lv_shortdayLength_13_0= RULE_INT ) ) )? (otherlv_14= 'months' ( (lv_month_15_0= RULE_STRING ) ) )? (otherlv_16= 'shortmonth-length' ( (lv_monthLength_17_0= RULE_INT ) ) )? otherlv_18= '}' )
            {
            // InternalTabletUIDSL.g:1244:1: (otherlv_0= 'clock' otherlv_1= '{' otherlv_2= 'format' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'class' ( (lv_class_5_0= RULE_STRING ) ) (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? (otherlv_8= 'interval' ( (lv_interval_9_0= RULE_INT ) ) )? (otherlv_10= 'days' ( (lv_days_11_0= RULE_STRING ) ) )? (otherlv_12= 'shortday-length' ( (lv_shortdayLength_13_0= RULE_INT ) ) )? (otherlv_14= 'months' ( (lv_month_15_0= RULE_STRING ) ) )? (otherlv_16= 'shortmonth-length' ( (lv_monthLength_17_0= RULE_INT ) ) )? otherlv_18= '}' )
            // InternalTabletUIDSL.g:1244:3: otherlv_0= 'clock' otherlv_1= '{' otherlv_2= 'format' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= 'class' ( (lv_class_5_0= RULE_STRING ) ) (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )? (otherlv_8= 'interval' ( (lv_interval_9_0= RULE_INT ) ) )? (otherlv_10= 'days' ( (lv_days_11_0= RULE_STRING ) ) )? (otherlv_12= 'shortday-length' ( (lv_shortdayLength_13_0= RULE_INT ) ) )? (otherlv_14= 'months' ( (lv_month_15_0= RULE_STRING ) ) )? (otherlv_16= 'shortmonth-length' ( (lv_monthLength_17_0= RULE_INT ) ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getClockAccess().getClockKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_32); 

                	newLeafNode(otherlv_1, grammarAccess.getClockAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,36,FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getClockAccess().getFormatKeyword_2());
                
            // InternalTabletUIDSL.g:1256:1: ( (lv_format_3_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:1257:1: (lv_format_3_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:1257:1: (lv_format_3_0= RULE_STRING )
            // InternalTabletUIDSL.g:1258:3: lv_format_3_0= RULE_STRING
            {
            lv_format_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            			newLeafNode(lv_format_3_0, grammarAccess.getClockAccess().getFormatSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"format",
                    		lv_format_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_5); 

                	newLeafNode(otherlv_4, grammarAccess.getClockAccess().getClassKeyword_4());
                
            // InternalTabletUIDSL.g:1278:1: ( (lv_class_5_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:1279:1: (lv_class_5_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:1279:1: (lv_class_5_0= RULE_STRING )
            // InternalTabletUIDSL.g:1280:3: lv_class_5_0= RULE_STRING
            {
            lv_class_5_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            			newLeafNode(lv_class_5_0, grammarAccess.getClockAccess().getClassSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_5_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:1296:2: (otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTabletUIDSL.g:1296:4: otherlv_6= 'style' ( (lv_style_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                        	newLeafNode(otherlv_6, grammarAccess.getClockAccess().getStyleKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:1300:1: ( (lv_style_7_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1301:1: (lv_style_7_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1301:1: (lv_style_7_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1302:3: lv_style_7_0= RULE_STRING
                    {
                    lv_style_7_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    			newLeafNode(lv_style_7_0, grammarAccess.getClockAccess().getStyleSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_7_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1318:4: (otherlv_8= 'interval' ( (lv_interval_9_0= RULE_INT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTabletUIDSL.g:1318:6: otherlv_8= 'interval' ( (lv_interval_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_8); 

                        	newLeafNode(otherlv_8, grammarAccess.getClockAccess().getIntervalKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:1322:1: ( (lv_interval_9_0= RULE_INT ) )
                    // InternalTabletUIDSL.g:1323:1: (lv_interval_9_0= RULE_INT )
                    {
                    // InternalTabletUIDSL.g:1323:1: (lv_interval_9_0= RULE_INT )
                    // InternalTabletUIDSL.g:1324:3: lv_interval_9_0= RULE_INT
                    {
                    lv_interval_9_0=(Token)match(input,RULE_INT,FOLLOW_36); 

                    			newLeafNode(lv_interval_9_0, grammarAccess.getClockAccess().getIntervalINTTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"interval",
                            		lv_interval_9_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1340:4: (otherlv_10= 'days' ( (lv_days_11_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTabletUIDSL.g:1340:6: otherlv_10= 'days' ( (lv_days_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_5); 

                        	newLeafNode(otherlv_10, grammarAccess.getClockAccess().getDaysKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:1344:1: ( (lv_days_11_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1345:1: (lv_days_11_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1345:1: (lv_days_11_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1346:3: lv_days_11_0= RULE_STRING
                    {
                    lv_days_11_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

                    			newLeafNode(lv_days_11_0, grammarAccess.getClockAccess().getDaysSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClockRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"days",
                            		lv_days_11_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1362:4: (otherlv_12= 'shortday-length' ( (lv_shortdayLength_13_0= RULE_INT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTabletUIDSL.g:1362:6: otherlv_12= 'shortday-length' ( (lv_shortdayLength_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_8); 

                        	newLeafNode(otherlv_12, grammarAccess.getClockAccess().getShortdayLengthKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:1366:1: ( (lv_shortdayLength_13_0= RULE_INT ) )
                    // InternalTabletUIDSL.g:1367:1: (lv_shortdayLength_13_0= RULE_INT )
                    {
                    // InternalTabletUIDSL.g:1367:1: (lv_shortdayLength_13_0= RULE_INT )
                    // InternalTabletUIDSL.g:1368:3: lv_shortdayLength_13_0= RULE_INT
                    {
                    lv_shortdayLength_13_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    			newLeafNode(lv_shortdayLength_13_0, grammarAccess.getClockAccess().getShortdayLengthINTTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"shortdayLength",
                            		lv_shortdayLength_13_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1384:4: (otherlv_14= 'months' ( (lv_month_15_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTabletUIDSL.g:1384:6: otherlv_14= 'months' ( (lv_month_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,40,FOLLOW_5); 

                        	newLeafNode(otherlv_14, grammarAccess.getClockAccess().getMonthsKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:1388:1: ( (lv_month_15_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1389:1: (lv_month_15_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1389:1: (lv_month_15_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1390:3: lv_month_15_0= RULE_STRING
                    {
                    lv_month_15_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    			newLeafNode(lv_month_15_0, grammarAccess.getClockAccess().getMonthSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClockRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"month",
                            		lv_month_15_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1406:4: (otherlv_16= 'shortmonth-length' ( (lv_monthLength_17_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTabletUIDSL.g:1406:6: otherlv_16= 'shortmonth-length' ( (lv_monthLength_17_0= RULE_INT ) )
                    {
                    otherlv_16=(Token)match(input,41,FOLLOW_8); 

                        	newLeafNode(otherlv_16, grammarAccess.getClockAccess().getShortmonthLengthKeyword_11_0());
                        
                    // InternalTabletUIDSL.g:1410:1: ( (lv_monthLength_17_0= RULE_INT ) )
                    // InternalTabletUIDSL.g:1411:1: (lv_monthLength_17_0= RULE_INT )
                    {
                    // InternalTabletUIDSL.g:1411:1: (lv_monthLength_17_0= RULE_INT )
                    // InternalTabletUIDSL.g:1412:3: lv_monthLength_17_0= RULE_INT
                    {
                    lv_monthLength_17_0=(Token)match(input,RULE_INT,FOLLOW_40); 

                    			newLeafNode(lv_monthLength_17_0, grammarAccess.getClockAccess().getMonthLengthINTTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"monthLength",
                            		lv_monthLength_17_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_18, grammarAccess.getClockAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClock"


    // $ANTLR start "entryRuleSwiper"
    // InternalTabletUIDSL.g:1440:1: entryRuleSwiper returns [EObject current=null] : iv_ruleSwiper= ruleSwiper EOF ;
    public final EObject entryRuleSwiper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwiper = null;


        try {
            // InternalTabletUIDSL.g:1441:2: (iv_ruleSwiper= ruleSwiper EOF )
            // InternalTabletUIDSL.g:1442:2: iv_ruleSwiper= ruleSwiper EOF
            {
             newCompositeNode(grammarAccess.getSwiperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwiper=ruleSwiper();

            state._fsp--;

             current =iv_ruleSwiper; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwiper"


    // $ANTLR start "ruleSwiper"
    // InternalTabletUIDSL.g:1449:1: ruleSwiper returns [EObject current=null] : (otherlv_0= 'swiper' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) (otherlv_6= 'autoplay' ( (lv_autoplay_7_0= RULE_INT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? ( (lv_divs_10_0= ruleDiv ) )* otherlv_11= '}' ) ;
    public final EObject ruleSwiper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;
        Token lv_height_5_0=null;
        Token otherlv_6=null;
        Token lv_autoplay_7_0=null;
        Token otherlv_8=null;
        Token lv_class_9_0=null;
        Token otherlv_11=null;
        EObject lv_divs_10_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:1452:28: ( (otherlv_0= 'swiper' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) (otherlv_6= 'autoplay' ( (lv_autoplay_7_0= RULE_INT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? ( (lv_divs_10_0= ruleDiv ) )* otherlv_11= '}' ) )
            // InternalTabletUIDSL.g:1453:1: (otherlv_0= 'swiper' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) (otherlv_6= 'autoplay' ( (lv_autoplay_7_0= RULE_INT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? ( (lv_divs_10_0= ruleDiv ) )* otherlv_11= '}' )
            {
            // InternalTabletUIDSL.g:1453:1: (otherlv_0= 'swiper' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) (otherlv_6= 'autoplay' ( (lv_autoplay_7_0= RULE_INT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? ( (lv_divs_10_0= ruleDiv ) )* otherlv_11= '}' )
            // InternalTabletUIDSL.g:1453:3: otherlv_0= 'swiper' otherlv_1= '{' otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) (otherlv_6= 'autoplay' ( (lv_autoplay_7_0= RULE_INT ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? ( (lv_divs_10_0= ruleDiv ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getSwiperAccess().getSwiperKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getSwiperAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getSwiperAccess().getWidthKeyword_2());
                
            // InternalTabletUIDSL.g:1465:1: ( (lv_width_3_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:1466:1: (lv_width_3_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:1466:1: (lv_width_3_0= RULE_STRING )
            // InternalTabletUIDSL.g:1467:3: lv_width_3_0= RULE_STRING
            {
            lv_width_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            			newLeafNode(lv_width_3_0, grammarAccess.getSwiperAccess().getWidthSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSwiperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_5); 

                	newLeafNode(otherlv_4, grammarAccess.getSwiperAccess().getHeightKeyword_4());
                
            // InternalTabletUIDSL.g:1487:1: ( (lv_height_5_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:1488:1: (lv_height_5_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:1488:1: (lv_height_5_0= RULE_STRING )
            // InternalTabletUIDSL.g:1489:3: lv_height_5_0= RULE_STRING
            {
            lv_height_5_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            			newLeafNode(lv_height_5_0, grammarAccess.getSwiperAccess().getHeightSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSwiperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_5_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:1505:2: (otherlv_6= 'autoplay' ( (lv_autoplay_7_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTabletUIDSL.g:1505:4: otherlv_6= 'autoplay' ( (lv_autoplay_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_8); 

                        	newLeafNode(otherlv_6, grammarAccess.getSwiperAccess().getAutoplayKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:1509:1: ( (lv_autoplay_7_0= RULE_INT ) )
                    // InternalTabletUIDSL.g:1510:1: (lv_autoplay_7_0= RULE_INT )
                    {
                    // InternalTabletUIDSL.g:1510:1: (lv_autoplay_7_0= RULE_INT )
                    // InternalTabletUIDSL.g:1511:3: lv_autoplay_7_0= RULE_INT
                    {
                    lv_autoplay_7_0=(Token)match(input,RULE_INT,FOLLOW_42); 

                    			newLeafNode(lv_autoplay_7_0, grammarAccess.getSwiperAccess().getAutoplayINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwiperRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"autoplay",
                            		lv_autoplay_7_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1527:4: (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTabletUIDSL.g:1527:6: otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_8, grammarAccess.getSwiperAccess().getClassKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:1531:1: ( (lv_class_9_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1532:1: (lv_class_9_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1532:1: (lv_class_9_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1533:3: lv_class_9_0= RULE_STRING
                    {
                    lv_class_9_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    			newLeafNode(lv_class_9_0, grammarAccess.getSwiperAccess().getClassSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwiperRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_9_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1549:4: ( (lv_divs_10_0= ruleDiv ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==73) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTabletUIDSL.g:1550:1: (lv_divs_10_0= ruleDiv )
            	    {
            	    // InternalTabletUIDSL.g:1550:1: (lv_divs_10_0= ruleDiv )
            	    // InternalTabletUIDSL.g:1551:3: lv_divs_10_0= ruleDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwiperAccess().getDivsDivParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_23);
            	    lv_divs_10_0=ruleDiv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwiperRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"divs",
            	            		lv_divs_10_0, 
            	            		"org.ckr.TabletUIDSL.Div");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_11=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_11, grammarAccess.getSwiperAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwiper"


    // $ANTLR start "entryRuleTemplateRef"
    // InternalTabletUIDSL.g:1579:1: entryRuleTemplateRef returns [EObject current=null] : iv_ruleTemplateRef= ruleTemplateRef EOF ;
    public final EObject entryRuleTemplateRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateRef = null;


        try {
            // InternalTabletUIDSL.g:1580:2: (iv_ruleTemplateRef= ruleTemplateRef EOF )
            // InternalTabletUIDSL.g:1581:2: iv_ruleTemplateRef= ruleTemplateRef EOF
            {
             newCompositeNode(grammarAccess.getTemplateRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateRef=ruleTemplateRef();

            state._fsp--;

             current =iv_ruleTemplateRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateRef"


    // $ANTLR start "ruleTemplateRef"
    // InternalTabletUIDSL.g:1588:1: ruleTemplateRef returns [EObject current=null] : (otherlv_0= 'template-ref' ( (lv_template_1_0= ruleTemplate ) ) ) ;
    public final EObject ruleTemplateRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_template_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:1591:28: ( (otherlv_0= 'template-ref' ( (lv_template_1_0= ruleTemplate ) ) ) )
            // InternalTabletUIDSL.g:1592:1: (otherlv_0= 'template-ref' ( (lv_template_1_0= ruleTemplate ) ) )
            {
            // InternalTabletUIDSL.g:1592:1: (otherlv_0= 'template-ref' ( (lv_template_1_0= ruleTemplate ) ) )
            // InternalTabletUIDSL.g:1592:3: otherlv_0= 'template-ref' ( (lv_template_1_0= ruleTemplate ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_19); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateRefAccess().getTemplateRefKeyword_0());
                
            // InternalTabletUIDSL.g:1596:1: ( (lv_template_1_0= ruleTemplate ) )
            // InternalTabletUIDSL.g:1597:1: (lv_template_1_0= ruleTemplate )
            {
            // InternalTabletUIDSL.g:1597:1: (lv_template_1_0= ruleTemplate )
            // InternalTabletUIDSL.g:1598:3: lv_template_1_0= ruleTemplate
            {
             
            	        newCompositeNode(grammarAccess.getTemplateRefAccess().getTemplateTemplateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_template_1_0=ruleTemplate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateRefRule());
            	        }
                   		add(
                   			current, 
                   			"template",
                    		lv_template_1_0, 
                    		"org.ckr.TabletUIDSL.Template");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateRef"


    // $ANTLR start "entryRuleSelect"
    // InternalTabletUIDSL.g:1622:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalTabletUIDSL.g:1623:2: (iv_ruleSelect= ruleSelect EOF )
            // InternalTabletUIDSL.g:1624:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalTabletUIDSL.g:1631:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'list' ( (lv_list_4_0= RULE_STRING ) ) )? (otherlv_5= 'items' ( (lv_items_6_0= RULE_STRING ) ) )? (otherlv_7= 'alias' ( (lv_alias_8_0= RULE_STRING ) ) )? (otherlv_9= 'cmd' ( (lv_cmd_10_0= RULE_STRING ) ) )? (otherlv_11= 'quote' ( (lv_quote_12_0= RULE_STRING ) ) )? (otherlv_13= 'get' ( (lv_get_14_0= RULE_STRING ) ) )? (otherlv_15= 'set' ( (lv_set_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_list_4_0=null;
        Token otherlv_5=null;
        Token lv_items_6_0=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        Token otherlv_9=null;
        Token lv_cmd_10_0=null;
        Token otherlv_11=null;
        Token lv_quote_12_0=null;
        Token otherlv_13=null;
        Token lv_get_14_0=null;
        Token otherlv_15=null;
        Token lv_set_16_0=null;
        Token otherlv_17=null;
        Token lv_class_18_0=null;
        Token otherlv_19=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:1634:28: ( (otherlv_0= 'select' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'list' ( (lv_list_4_0= RULE_STRING ) ) )? (otherlv_5= 'items' ( (lv_items_6_0= RULE_STRING ) ) )? (otherlv_7= 'alias' ( (lv_alias_8_0= RULE_STRING ) ) )? (otherlv_9= 'cmd' ( (lv_cmd_10_0= RULE_STRING ) ) )? (otherlv_11= 'quote' ( (lv_quote_12_0= RULE_STRING ) ) )? (otherlv_13= 'get' ( (lv_get_14_0= RULE_STRING ) ) )? (otherlv_15= 'set' ( (lv_set_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? otherlv_19= '}' ) )
            // InternalTabletUIDSL.g:1635:1: (otherlv_0= 'select' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'list' ( (lv_list_4_0= RULE_STRING ) ) )? (otherlv_5= 'items' ( (lv_items_6_0= RULE_STRING ) ) )? (otherlv_7= 'alias' ( (lv_alias_8_0= RULE_STRING ) ) )? (otherlv_9= 'cmd' ( (lv_cmd_10_0= RULE_STRING ) ) )? (otherlv_11= 'quote' ( (lv_quote_12_0= RULE_STRING ) ) )? (otherlv_13= 'get' ( (lv_get_14_0= RULE_STRING ) ) )? (otherlv_15= 'set' ( (lv_set_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? otherlv_19= '}' )
            {
            // InternalTabletUIDSL.g:1635:1: (otherlv_0= 'select' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'list' ( (lv_list_4_0= RULE_STRING ) ) )? (otherlv_5= 'items' ( (lv_items_6_0= RULE_STRING ) ) )? (otherlv_7= 'alias' ( (lv_alias_8_0= RULE_STRING ) ) )? (otherlv_9= 'cmd' ( (lv_cmd_10_0= RULE_STRING ) ) )? (otherlv_11= 'quote' ( (lv_quote_12_0= RULE_STRING ) ) )? (otherlv_13= 'get' ( (lv_get_14_0= RULE_STRING ) ) )? (otherlv_15= 'set' ( (lv_set_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? otherlv_19= '}' )
            // InternalTabletUIDSL.g:1635:3: otherlv_0= 'select' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'list' ( (lv_list_4_0= RULE_STRING ) ) )? (otherlv_5= 'items' ( (lv_items_6_0= RULE_STRING ) ) )? (otherlv_7= 'alias' ( (lv_alias_8_0= RULE_STRING ) ) )? (otherlv_9= 'cmd' ( (lv_cmd_10_0= RULE_STRING ) ) )? (otherlv_11= 'quote' ( (lv_quote_12_0= RULE_STRING ) ) )? (otherlv_13= 'get' ( (lv_get_14_0= RULE_STRING ) ) )? (otherlv_15= 'set' ( (lv_set_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:1643:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:1644:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:1644:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:1645:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            			newLeafNode(lv_device_2_0, grammarAccess.getSelectAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:1661:2: (otherlv_3= 'list' ( (lv_list_4_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTabletUIDSL.g:1661:4: otherlv_3= 'list' ( (lv_list_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getListKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:1665:1: ( (lv_list_4_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1666:1: (lv_list_4_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1666:1: (lv_list_4_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1667:3: lv_list_4_0= RULE_STRING
                    {
                    lv_list_4_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

                    			newLeafNode(lv_list_4_0, grammarAccess.getSelectAccess().getListSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"list",
                            		lv_list_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1683:4: (otherlv_5= 'items' ( (lv_items_6_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTabletUIDSL.g:1683:6: otherlv_5= 'items' ( (lv_items_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getSelectAccess().getItemsKeyword_4_0());
                        
                    // InternalTabletUIDSL.g:1687:1: ( (lv_items_6_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1688:1: (lv_items_6_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1688:1: (lv_items_6_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1689:3: lv_items_6_0= RULE_STRING
                    {
                    lv_items_6_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

                    			newLeafNode(lv_items_6_0, grammarAccess.getSelectAccess().getItemsSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"items",
                            		lv_items_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1705:4: (otherlv_7= 'alias' ( (lv_alias_8_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTabletUIDSL.g:1705:6: otherlv_7= 'alias' ( (lv_alias_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_5); 

                        	newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getAliasKeyword_5_0());
                        
                    // InternalTabletUIDSL.g:1709:1: ( (lv_alias_8_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1710:1: (lv_alias_8_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1710:1: (lv_alias_8_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1711:3: lv_alias_8_0= RULE_STRING
                    {
                    lv_alias_8_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

                    			newLeafNode(lv_alias_8_0, grammarAccess.getSelectAccess().getAliasSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"alias",
                            		lv_alias_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1727:4: (otherlv_9= 'cmd' ( (lv_cmd_10_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTabletUIDSL.g:1727:6: otherlv_9= 'cmd' ( (lv_cmd_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getSelectAccess().getCmdKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:1731:1: ( (lv_cmd_10_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1732:1: (lv_cmd_10_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1732:1: (lv_cmd_10_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1733:3: lv_cmd_10_0= RULE_STRING
                    {
                    lv_cmd_10_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

                    			newLeafNode(lv_cmd_10_0, grammarAccess.getSelectAccess().getCmdSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cmd",
                            		lv_cmd_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1749:4: (otherlv_11= 'quote' ( (lv_quote_12_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTabletUIDSL.g:1749:6: otherlv_11= 'quote' ( (lv_quote_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,50,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getSelectAccess().getQuoteKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:1753:1: ( (lv_quote_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1754:1: (lv_quote_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1754:1: (lv_quote_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1755:3: lv_quote_12_0= RULE_STRING
                    {
                    lv_quote_12_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

                    			newLeafNode(lv_quote_12_0, grammarAccess.getSelectAccess().getQuoteSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"quote",
                            		lv_quote_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1771:4: (otherlv_13= 'get' ( (lv_get_14_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTabletUIDSL.g:1771:6: otherlv_13= 'get' ( (lv_get_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,51,FOLLOW_5); 

                        	newLeafNode(otherlv_13, grammarAccess.getSelectAccess().getGetKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:1775:1: ( (lv_get_14_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1776:1: (lv_get_14_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1776:1: (lv_get_14_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1777:3: lv_get_14_0= RULE_STRING
                    {
                    lv_get_14_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

                    			newLeafNode(lv_get_14_0, grammarAccess.getSelectAccess().getGetSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"get",
                            		lv_get_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1793:4: (otherlv_15= 'set' ( (lv_set_16_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTabletUIDSL.g:1793:6: otherlv_15= 'set' ( (lv_set_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,52,FOLLOW_5); 

                        	newLeafNode(otherlv_15, grammarAccess.getSelectAccess().getSetKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:1797:1: ( (lv_set_16_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1798:1: (lv_set_16_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1798:1: (lv_set_16_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1799:3: lv_set_16_0= RULE_STRING
                    {
                    lv_set_16_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    			newLeafNode(lv_set_16_0, grammarAccess.getSelectAccess().getSetSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"set",
                            		lv_set_16_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1815:4: (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTabletUIDSL.g:1815:6: otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_17, grammarAccess.getSelectAccess().getClassKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:1819:1: ( (lv_class_18_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1820:1: (lv_class_18_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1820:1: (lv_class_18_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1821:3: lv_class_18_0= RULE_STRING
                    {
                    lv_class_18_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_class_18_0, grammarAccess.getSelectAccess().getClassSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_18_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_19, grammarAccess.getSelectAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVolume"
    // InternalTabletUIDSL.g:1849:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalTabletUIDSL.g:1850:2: (iv_ruleVolume= ruleVolume EOF )
            // InternalTabletUIDSL.g:1851:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalTabletUIDSL.g:1858:1: ruleVolume returns [EObject current=null] : (otherlv_0= 'volume' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? otherlv_5= 'set' ( (lv_set_6_0= RULE_STRING ) ) (otherlv_7= 'cmd' ( (lv_cmd_8_0= RULE_STRING ) ) )? (otherlv_9= 'min' ( (lv_min_10_0= RULE_STRING ) ) )? (otherlv_11= 'max' ( (lv_max_12_0= RULE_STRING ) ) )? (otherlv_13= 'class' ( (lv_class_14_0= RULE_STRING ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_set_6_0=null;
        Token otherlv_7=null;
        Token lv_cmd_8_0=null;
        Token otherlv_9=null;
        Token lv_min_10_0=null;
        Token otherlv_11=null;
        Token lv_max_12_0=null;
        Token otherlv_13=null;
        Token lv_class_14_0=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:1861:28: ( (otherlv_0= 'volume' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? otherlv_5= 'set' ( (lv_set_6_0= RULE_STRING ) ) (otherlv_7= 'cmd' ( (lv_cmd_8_0= RULE_STRING ) ) )? (otherlv_9= 'min' ( (lv_min_10_0= RULE_STRING ) ) )? (otherlv_11= 'max' ( (lv_max_12_0= RULE_STRING ) ) )? (otherlv_13= 'class' ( (lv_class_14_0= RULE_STRING ) ) )? otherlv_15= '}' ) )
            // InternalTabletUIDSL.g:1862:1: (otherlv_0= 'volume' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? otherlv_5= 'set' ( (lv_set_6_0= RULE_STRING ) ) (otherlv_7= 'cmd' ( (lv_cmd_8_0= RULE_STRING ) ) )? (otherlv_9= 'min' ( (lv_min_10_0= RULE_STRING ) ) )? (otherlv_11= 'max' ( (lv_max_12_0= RULE_STRING ) ) )? (otherlv_13= 'class' ( (lv_class_14_0= RULE_STRING ) ) )? otherlv_15= '}' )
            {
            // InternalTabletUIDSL.g:1862:1: (otherlv_0= 'volume' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? otherlv_5= 'set' ( (lv_set_6_0= RULE_STRING ) ) (otherlv_7= 'cmd' ( (lv_cmd_8_0= RULE_STRING ) ) )? (otherlv_9= 'min' ( (lv_min_10_0= RULE_STRING ) ) )? (otherlv_11= 'max' ( (lv_max_12_0= RULE_STRING ) ) )? (otherlv_13= 'class' ( (lv_class_14_0= RULE_STRING ) ) )? otherlv_15= '}' )
            // InternalTabletUIDSL.g:1862:3: otherlv_0= 'volume' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? otherlv_5= 'set' ( (lv_set_6_0= RULE_STRING ) ) (otherlv_7= 'cmd' ( (lv_cmd_8_0= RULE_STRING ) ) )? (otherlv_9= 'min' ( (lv_min_10_0= RULE_STRING ) ) )? (otherlv_11= 'max' ( (lv_max_12_0= RULE_STRING ) ) )? (otherlv_13= 'class' ( (lv_class_14_0= RULE_STRING ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getVolumeAccess().getVolumeKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:1870:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:1871:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:1871:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:1872:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

            			newLeafNode(lv_device_2_0, grammarAccess.getVolumeAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVolumeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:1888:2: (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTabletUIDSL.g:1888:4: otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getVolumeAccess().getGetKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:1892:1: ( (lv_get_4_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1893:1: (lv_get_4_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1893:1: (lv_get_4_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1894:3: lv_get_4_0= RULE_STRING
                    {
                    lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    			newLeafNode(lv_get_4_0, grammarAccess.getVolumeAccess().getGetSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVolumeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"get",
                            		lv_get_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,52,FOLLOW_5); 

                	newLeafNode(otherlv_5, grammarAccess.getVolumeAccess().getSetKeyword_4());
                
            // InternalTabletUIDSL.g:1914:1: ( (lv_set_6_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:1915:1: (lv_set_6_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:1915:1: (lv_set_6_0= RULE_STRING )
            // InternalTabletUIDSL.g:1916:3: lv_set_6_0= RULE_STRING
            {
            lv_set_6_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

            			newLeafNode(lv_set_6_0, grammarAccess.getVolumeAccess().getSetSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVolumeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"set",
                    		lv_set_6_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:1932:2: (otherlv_7= 'cmd' ( (lv_cmd_8_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalTabletUIDSL.g:1932:4: otherlv_7= 'cmd' ( (lv_cmd_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_5); 

                        	newLeafNode(otherlv_7, grammarAccess.getVolumeAccess().getCmdKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:1936:1: ( (lv_cmd_8_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1937:1: (lv_cmd_8_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1937:1: (lv_cmd_8_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1938:3: lv_cmd_8_0= RULE_STRING
                    {
                    lv_cmd_8_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

                    			newLeafNode(lv_cmd_8_0, grammarAccess.getVolumeAccess().getCmdSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVolumeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cmd",
                            		lv_cmd_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1954:4: (otherlv_9= 'min' ( (lv_min_10_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTabletUIDSL.g:1954:6: otherlv_9= 'min' ( (lv_min_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getVolumeAccess().getMinKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:1958:1: ( (lv_min_10_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1959:1: (lv_min_10_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1959:1: (lv_min_10_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1960:3: lv_min_10_0= RULE_STRING
                    {
                    lv_min_10_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    			newLeafNode(lv_min_10_0, grammarAccess.getVolumeAccess().getMinSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVolumeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"min",
                            		lv_min_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1976:4: (otherlv_11= 'max' ( (lv_max_12_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTabletUIDSL.g:1976:6: otherlv_11= 'max' ( (lv_max_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,55,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getVolumeAccess().getMaxKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:1980:1: ( (lv_max_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:1981:1: (lv_max_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:1981:1: (lv_max_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:1982:3: lv_max_12_0= RULE_STRING
                    {
                    lv_max_12_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    			newLeafNode(lv_max_12_0, grammarAccess.getVolumeAccess().getMaxSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVolumeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"max",
                            		lv_max_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:1998:4: (otherlv_13= 'class' ( (lv_class_14_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTabletUIDSL.g:1998:6: otherlv_13= 'class' ( (lv_class_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_13, grammarAccess.getVolumeAccess().getClassKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:2002:1: ( (lv_class_14_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2003:1: (lv_class_14_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2003:1: (lv_class_14_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2004:3: lv_class_14_0= RULE_STRING
                    {
                    lv_class_14_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_class_14_0, grammarAccess.getVolumeAccess().getClassSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVolumeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_15, grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRulePush"
    // InternalTabletUIDSL.g:2032:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // InternalTabletUIDSL.g:2033:2: (iv_rulePush= rulePush EOF )
            // InternalTabletUIDSL.g:2034:2: iv_rulePush= rulePush EOF
            {
             newCompositeNode(grammarAccess.getPushRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePush=rulePush();

            state._fsp--;

             current =iv_rulePush; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePush"


    // $ANTLR start "rulePush"
    // InternalTabletUIDSL.g:2041:1: rulePush returns [EObject current=null] : (otherlv_0= 'push' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'set' ( (lv_dataSet_4_0= RULE_STRING ) ) )? (otherlv_5= 'set-on' ( (lv_setOn_6_0= RULE_STRING ) ) )? otherlv_7= 'icon' ( (lv_icon_8_0= RULE_STRING ) ) (otherlv_9= 'background-icon' ( (lv_backgroundIcon_10_0= RULE_STRING ) ) )? (otherlv_11= 'cmd' ( (lv_cmd_12_0= RULE_STRING ) ) )? (otherlv_13= 'doubleClick' ( (lv_doubleClick_14_0= RULE_INT ) ) )? (otherlv_15= 'countdown' ( (lv_countdown_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? (otherlv_19= 'url' ( (lv_url_20_0= RULE_STRING ) ) )? otherlv_21= '}' ) ;
    public final EObject rulePush() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_dataSet_4_0=null;
        Token otherlv_5=null;
        Token lv_setOn_6_0=null;
        Token otherlv_7=null;
        Token lv_icon_8_0=null;
        Token otherlv_9=null;
        Token lv_backgroundIcon_10_0=null;
        Token otherlv_11=null;
        Token lv_cmd_12_0=null;
        Token otherlv_13=null;
        Token lv_doubleClick_14_0=null;
        Token otherlv_15=null;
        Token lv_countdown_16_0=null;
        Token otherlv_17=null;
        Token lv_class_18_0=null;
        Token otherlv_19=null;
        Token lv_url_20_0=null;
        Token otherlv_21=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:2044:28: ( (otherlv_0= 'push' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'set' ( (lv_dataSet_4_0= RULE_STRING ) ) )? (otherlv_5= 'set-on' ( (lv_setOn_6_0= RULE_STRING ) ) )? otherlv_7= 'icon' ( (lv_icon_8_0= RULE_STRING ) ) (otherlv_9= 'background-icon' ( (lv_backgroundIcon_10_0= RULE_STRING ) ) )? (otherlv_11= 'cmd' ( (lv_cmd_12_0= RULE_STRING ) ) )? (otherlv_13= 'doubleClick' ( (lv_doubleClick_14_0= RULE_INT ) ) )? (otherlv_15= 'countdown' ( (lv_countdown_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? (otherlv_19= 'url' ( (lv_url_20_0= RULE_STRING ) ) )? otherlv_21= '}' ) )
            // InternalTabletUIDSL.g:2045:1: (otherlv_0= 'push' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'set' ( (lv_dataSet_4_0= RULE_STRING ) ) )? (otherlv_5= 'set-on' ( (lv_setOn_6_0= RULE_STRING ) ) )? otherlv_7= 'icon' ( (lv_icon_8_0= RULE_STRING ) ) (otherlv_9= 'background-icon' ( (lv_backgroundIcon_10_0= RULE_STRING ) ) )? (otherlv_11= 'cmd' ( (lv_cmd_12_0= RULE_STRING ) ) )? (otherlv_13= 'doubleClick' ( (lv_doubleClick_14_0= RULE_INT ) ) )? (otherlv_15= 'countdown' ( (lv_countdown_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? (otherlv_19= 'url' ( (lv_url_20_0= RULE_STRING ) ) )? otherlv_21= '}' )
            {
            // InternalTabletUIDSL.g:2045:1: (otherlv_0= 'push' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'set' ( (lv_dataSet_4_0= RULE_STRING ) ) )? (otherlv_5= 'set-on' ( (lv_setOn_6_0= RULE_STRING ) ) )? otherlv_7= 'icon' ( (lv_icon_8_0= RULE_STRING ) ) (otherlv_9= 'background-icon' ( (lv_backgroundIcon_10_0= RULE_STRING ) ) )? (otherlv_11= 'cmd' ( (lv_cmd_12_0= RULE_STRING ) ) )? (otherlv_13= 'doubleClick' ( (lv_doubleClick_14_0= RULE_INT ) ) )? (otherlv_15= 'countdown' ( (lv_countdown_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? (otherlv_19= 'url' ( (lv_url_20_0= RULE_STRING ) ) )? otherlv_21= '}' )
            // InternalTabletUIDSL.g:2045:3: otherlv_0= 'push' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'set' ( (lv_dataSet_4_0= RULE_STRING ) ) )? (otherlv_5= 'set-on' ( (lv_setOn_6_0= RULE_STRING ) ) )? otherlv_7= 'icon' ( (lv_icon_8_0= RULE_STRING ) ) (otherlv_9= 'background-icon' ( (lv_backgroundIcon_10_0= RULE_STRING ) ) )? (otherlv_11= 'cmd' ( (lv_cmd_12_0= RULE_STRING ) ) )? (otherlv_13= 'doubleClick' ( (lv_doubleClick_14_0= RULE_INT ) ) )? (otherlv_15= 'countdown' ( (lv_countdown_16_0= RULE_STRING ) ) )? (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )? (otherlv_19= 'url' ( (lv_url_20_0= RULE_STRING ) ) )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getPushAccess().getPushKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_56); 

                	newLeafNode(otherlv_1, grammarAccess.getPushAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:2053:1: ( (lv_device_2_0= RULE_STRING ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTabletUIDSL.g:2054:1: (lv_device_2_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2054:1: (lv_device_2_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2055:3: lv_device_2_0= RULE_STRING
                    {
                    lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

                    			newLeafNode(lv_device_2_0, grammarAccess.getPushAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"device",
                            		lv_device_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2071:3: (otherlv_3= 'set' ( (lv_dataSet_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==52) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTabletUIDSL.g:2071:5: otherlv_3= 'set' ( (lv_dataSet_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getPushAccess().getSetKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:2075:1: ( (lv_dataSet_4_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2076:1: (lv_dataSet_4_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2076:1: (lv_dataSet_4_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2077:3: lv_dataSet_4_0= RULE_STRING
                    {
                    lv_dataSet_4_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    			newLeafNode(lv_dataSet_4_0, grammarAccess.getPushAccess().getDataSetSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dataSet",
                            		lv_dataSet_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2093:4: (otherlv_5= 'set-on' ( (lv_setOn_6_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTabletUIDSL.g:2093:6: otherlv_5= 'set-on' ( (lv_setOn_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getPushAccess().getSetOnKeyword_4_0());
                        
                    // InternalTabletUIDSL.g:2097:1: ( (lv_setOn_6_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2098:1: (lv_setOn_6_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2098:1: (lv_setOn_6_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2099:3: lv_setOn_6_0= RULE_STRING
                    {
                    lv_setOn_6_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

                    			newLeafNode(lv_setOn_6_0, grammarAccess.getPushAccess().getSetOnSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"setOn",
                            		lv_setOn_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,58,FOLLOW_5); 

                	newLeafNode(otherlv_7, grammarAccess.getPushAccess().getIconKeyword_5());
                
            // InternalTabletUIDSL.g:2119:1: ( (lv_icon_8_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:2120:1: (lv_icon_8_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:2120:1: (lv_icon_8_0= RULE_STRING )
            // InternalTabletUIDSL.g:2121:3: lv_icon_8_0= RULE_STRING
            {
            lv_icon_8_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            			newLeafNode(lv_icon_8_0, grammarAccess.getPushAccess().getIconSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPushRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"icon",
                    		lv_icon_8_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:2137:2: (otherlv_9= 'background-icon' ( (lv_backgroundIcon_10_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTabletUIDSL.g:2137:4: otherlv_9= 'background-icon' ( (lv_backgroundIcon_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,59,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getPushAccess().getBackgroundIconKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:2141:1: ( (lv_backgroundIcon_10_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2142:1: (lv_backgroundIcon_10_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2142:1: (lv_backgroundIcon_10_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2143:3: lv_backgroundIcon_10_0= RULE_STRING
                    {
                    lv_backgroundIcon_10_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

                    			newLeafNode(lv_backgroundIcon_10_0, grammarAccess.getPushAccess().getBackgroundIconSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"backgroundIcon",
                            		lv_backgroundIcon_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2159:4: (otherlv_11= 'cmd' ( (lv_cmd_12_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTabletUIDSL.g:2159:6: otherlv_11= 'cmd' ( (lv_cmd_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,49,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getPushAccess().getCmdKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:2163:1: ( (lv_cmd_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2164:1: (lv_cmd_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2164:1: (lv_cmd_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2165:3: lv_cmd_12_0= RULE_STRING
                    {
                    lv_cmd_12_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

                    			newLeafNode(lv_cmd_12_0, grammarAccess.getPushAccess().getCmdSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cmd",
                            		lv_cmd_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2181:4: (otherlv_13= 'doubleClick' ( (lv_doubleClick_14_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==60) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTabletUIDSL.g:2181:6: otherlv_13= 'doubleClick' ( (lv_doubleClick_14_0= RULE_INT ) )
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_8); 

                        	newLeafNode(otherlv_13, grammarAccess.getPushAccess().getDoubleClickKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:2185:1: ( (lv_doubleClick_14_0= RULE_INT ) )
                    // InternalTabletUIDSL.g:2186:1: (lv_doubleClick_14_0= RULE_INT )
                    {
                    // InternalTabletUIDSL.g:2186:1: (lv_doubleClick_14_0= RULE_INT )
                    // InternalTabletUIDSL.g:2187:3: lv_doubleClick_14_0= RULE_INT
                    {
                    lv_doubleClick_14_0=(Token)match(input,RULE_INT,FOLLOW_63); 

                    			newLeafNode(lv_doubleClick_14_0, grammarAccess.getPushAccess().getDoubleClickINTTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doubleClick",
                            		lv_doubleClick_14_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2203:4: (otherlv_15= 'countdown' ( (lv_countdown_16_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==61) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTabletUIDSL.g:2203:6: otherlv_15= 'countdown' ( (lv_countdown_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,61,FOLLOW_5); 

                        	newLeafNode(otherlv_15, grammarAccess.getPushAccess().getCountdownKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:2207:1: ( (lv_countdown_16_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2208:1: (lv_countdown_16_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2208:1: (lv_countdown_16_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2209:3: lv_countdown_16_0= RULE_STRING
                    {
                    lv_countdown_16_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

                    			newLeafNode(lv_countdown_16_0, grammarAccess.getPushAccess().getCountdownSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"countdown",
                            		lv_countdown_16_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2225:4: (otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==33) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTabletUIDSL.g:2225:6: otherlv_17= 'class' ( (lv_class_18_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_17, grammarAccess.getPushAccess().getClassKeyword_11_0());
                        
                    // InternalTabletUIDSL.g:2229:1: ( (lv_class_18_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2230:1: (lv_class_18_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2230:1: (lv_class_18_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2231:3: lv_class_18_0= RULE_STRING
                    {
                    lv_class_18_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

                    			newLeafNode(lv_class_18_0, grammarAccess.getPushAccess().getClassSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_18_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2247:4: (otherlv_19= 'url' ( (lv_url_20_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==62) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalTabletUIDSL.g:2247:6: otherlv_19= 'url' ( (lv_url_20_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,62,FOLLOW_5); 

                        	newLeafNode(otherlv_19, grammarAccess.getPushAccess().getUrlKeyword_12_0());
                        
                    // InternalTabletUIDSL.g:2251:1: ( (lv_url_20_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2252:1: (lv_url_20_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2252:1: (lv_url_20_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2253:3: lv_url_20_0= RULE_STRING
                    {
                    lv_url_20_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_url_20_0, grammarAccess.getPushAccess().getUrlSTRINGTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPushRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"url",
                            		lv_url_20_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_21, grammarAccess.getPushAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePush"


    // $ANTLR start "entryRuleImage"
    // InternalTabletUIDSL.g:2281:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalTabletUIDSL.g:2282:2: (iv_ruleImage= ruleImage EOF )
            // InternalTabletUIDSL.g:2283:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalTabletUIDSL.g:2290:1: ruleImage returns [EObject current=null] : (otherlv_0= 'image' ( (lv_device_1_0= RULE_STRING ) ) otherlv_2= 'get' ( (lv_get_3_0= RULE_STRING ) ) otherlv_4= 'size' ( (lv_size_5_0= RULE_STRING ) ) (otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_device_1_0=null;
        Token otherlv_2=null;
        Token lv_get_3_0=null;
        Token otherlv_4=null;
        Token lv_size_5_0=null;
        Token otherlv_6=null;
        Token lv_class_7_0=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:2293:28: ( (otherlv_0= 'image' ( (lv_device_1_0= RULE_STRING ) ) otherlv_2= 'get' ( (lv_get_3_0= RULE_STRING ) ) otherlv_4= 'size' ( (lv_size_5_0= RULE_STRING ) ) (otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) )? ) )
            // InternalTabletUIDSL.g:2294:1: (otherlv_0= 'image' ( (lv_device_1_0= RULE_STRING ) ) otherlv_2= 'get' ( (lv_get_3_0= RULE_STRING ) ) otherlv_4= 'size' ( (lv_size_5_0= RULE_STRING ) ) (otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) )? )
            {
            // InternalTabletUIDSL.g:2294:1: (otherlv_0= 'image' ( (lv_device_1_0= RULE_STRING ) ) otherlv_2= 'get' ( (lv_get_3_0= RULE_STRING ) ) otherlv_4= 'size' ( (lv_size_5_0= RULE_STRING ) ) (otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) )? )
            // InternalTabletUIDSL.g:2294:3: otherlv_0= 'image' ( (lv_device_1_0= RULE_STRING ) ) otherlv_2= 'get' ( (lv_get_3_0= RULE_STRING ) ) otherlv_4= 'size' ( (lv_size_5_0= RULE_STRING ) ) (otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
                
            // InternalTabletUIDSL.g:2298:1: ( (lv_device_1_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:2299:1: (lv_device_1_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:2299:1: (lv_device_1_0= RULE_STRING )
            // InternalTabletUIDSL.g:2300:3: lv_device_1_0= RULE_STRING
            {
            lv_device_1_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

            			newLeafNode(lv_device_1_0, grammarAccess.getImageAccess().getDeviceSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getImageAccess().getGetKeyword_2());
                
            // InternalTabletUIDSL.g:2320:1: ( (lv_get_3_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:2321:1: (lv_get_3_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:2321:1: (lv_get_3_0= RULE_STRING )
            // InternalTabletUIDSL.g:2322:3: lv_get_3_0= RULE_STRING
            {
            lv_get_3_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

            			newLeafNode(lv_get_3_0, grammarAccess.getImageAccess().getGetSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"get",
                    		lv_get_3_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,64,FOLLOW_5); 

                	newLeafNode(otherlv_4, grammarAccess.getImageAccess().getSizeKeyword_4());
                
            // InternalTabletUIDSL.g:2342:1: ( (lv_size_5_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:2343:1: (lv_size_5_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:2343:1: (lv_size_5_0= RULE_STRING )
            // InternalTabletUIDSL.g:2344:3: lv_size_5_0= RULE_STRING
            {
            lv_size_5_0=(Token)match(input,RULE_STRING,FOLLOW_68); 

            			newLeafNode(lv_size_5_0, grammarAccess.getImageAccess().getSizeSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"size",
                    		lv_size_5_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:2360:2: (otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTabletUIDSL.g:2360:4: otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_6, grammarAccess.getImageAccess().getClassKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:2364:1: ( (lv_class_7_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2365:1: (lv_class_7_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2365:1: (lv_class_7_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2366:3: lv_class_7_0= RULE_STRING
                    {
                    lv_class_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_class_7_0, grammarAccess.getImageAccess().getClassSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_7_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleSwitch"
    // InternalTabletUIDSL.g:2390:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalTabletUIDSL.g:2391:2: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalTabletUIDSL.g:2392:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalTabletUIDSL.g:2399:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'setOn' ( (lv_setOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'onColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'offColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-on-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'background-icon' ( (lv_backgroundIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'icon' ( (lv_icon_22_0= RULE_STRING ) ) )? otherlv_23= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_getOn_6_0=null;
        Token otherlv_7=null;
        Token lv_setOn_8_0=null;
        Token otherlv_9=null;
        Token lv_getOff_10_0=null;
        Token otherlv_11=null;
        Token lv_class_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_backgroundIcon_20_0=null;
        Token otherlv_21=null;
        Token lv_icon_22_0=null;
        Token otherlv_23=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:2402:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'setOn' ( (lv_setOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'onColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'offColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-on-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'background-icon' ( (lv_backgroundIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'icon' ( (lv_icon_22_0= RULE_STRING ) ) )? otherlv_23= '}' ) )
            // InternalTabletUIDSL.g:2403:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'setOn' ( (lv_setOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'onColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'offColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-on-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'background-icon' ( (lv_backgroundIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'icon' ( (lv_icon_22_0= RULE_STRING ) ) )? otherlv_23= '}' )
            {
            // InternalTabletUIDSL.g:2403:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'setOn' ( (lv_setOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'onColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'offColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-on-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'background-icon' ( (lv_backgroundIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'icon' ( (lv_icon_22_0= RULE_STRING ) ) )? otherlv_23= '}' )
            // InternalTabletUIDSL.g:2403:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'setOn' ( (lv_setOn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'onColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'offColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-on-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'background-icon' ( (lv_backgroundIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'icon' ( (lv_icon_22_0= RULE_STRING ) ) )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:2411:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:2412:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:2412:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:2413:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

            			newLeafNode(lv_device_2_0, grammarAccess.getSwitchAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSwitchRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:2429:2: (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==51) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalTabletUIDSL.g:2429:4: otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getGetKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:2433:1: ( (lv_get_4_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2434:1: (lv_get_4_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2434:1: (lv_get_4_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2435:3: lv_get_4_0= RULE_STRING
                    {
                    lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_70); 

                    			newLeafNode(lv_get_4_0, grammarAccess.getSwitchAccess().getGetSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"get",
                            		lv_get_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2451:4: (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==66) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTabletUIDSL.g:2451:6: otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getSwitchAccess().getGetOnKeyword_4_0());
                        
                    // InternalTabletUIDSL.g:2455:1: ( (lv_getOn_6_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2456:1: (lv_getOn_6_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2456:1: (lv_getOn_6_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2457:3: lv_getOn_6_0= RULE_STRING
                    {
                    lv_getOn_6_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

                    			newLeafNode(lv_getOn_6_0, grammarAccess.getSwitchAccess().getGetOnSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"getOn",
                            		lv_getOn_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2473:4: (otherlv_7= 'setOn' ( (lv_setOn_8_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==67) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTabletUIDSL.g:2473:6: otherlv_7= 'setOn' ( (lv_setOn_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,67,FOLLOW_5); 

                        	newLeafNode(otherlv_7, grammarAccess.getSwitchAccess().getSetOnKeyword_5_0());
                        
                    // InternalTabletUIDSL.g:2477:1: ( (lv_setOn_8_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2478:1: (lv_setOn_8_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2478:1: (lv_setOn_8_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2479:3: lv_setOn_8_0= RULE_STRING
                    {
                    lv_setOn_8_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    			newLeafNode(lv_setOn_8_0, grammarAccess.getSwitchAccess().getSetOnSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"setOn",
                            		lv_setOn_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2495:4: (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==68) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTabletUIDSL.g:2495:6: otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,68,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getSwitchAccess().getGetOffKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:2499:1: ( (lv_getOff_10_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2500:1: (lv_getOff_10_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2500:1: (lv_getOff_10_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2501:3: lv_getOff_10_0= RULE_STRING
                    {
                    lv_getOff_10_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

                    			newLeafNode(lv_getOff_10_0, grammarAccess.getSwitchAccess().getGetOffSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"getOff",
                            		lv_getOff_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2517:4: (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==33) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalTabletUIDSL.g:2517:6: otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getSwitchAccess().getClassKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:2521:1: ( (lv_class_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2522:1: (lv_class_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2522:1: (lv_class_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2523:3: lv_class_12_0= RULE_STRING
                    {
                    lv_class_12_0=(Token)match(input,RULE_STRING,FOLLOW_74); 

                    			newLeafNode(lv_class_12_0, grammarAccess.getSwitchAccess().getClassSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2539:4: (otherlv_13= 'onColor' ( (otherlv_14= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==69) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTabletUIDSL.g:2539:6: otherlv_13= 'onColor' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,69,FOLLOW_19); 

                        	newLeafNode(otherlv_13, grammarAccess.getSwitchAccess().getOnColorKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:2543:1: ( (otherlv_14= RULE_ID ) )
                    // InternalTabletUIDSL.g:2544:1: (otherlv_14= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:2544:1: (otherlv_14= RULE_ID )
                    // InternalTabletUIDSL.g:2545:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_75); 

                    		newLeafNode(otherlv_14, grammarAccess.getSwitchAccess().getOnColorColorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2556:4: (otherlv_15= 'offColor' ( (otherlv_16= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==70) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalTabletUIDSL.g:2556:6: otherlv_15= 'offColor' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,70,FOLLOW_19); 

                        	newLeafNode(otherlv_15, grammarAccess.getSwitchAccess().getOffColorKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:2560:1: ( (otherlv_16= RULE_ID ) )
                    // InternalTabletUIDSL.g:2561:1: (otherlv_16= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:2561:1: (otherlv_16= RULE_ID )
                    // InternalTabletUIDSL.g:2562:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_76); 

                    		newLeafNode(otherlv_16, grammarAccess.getSwitchAccess().getOffColorColorCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2573:4: (otherlv_17= 'background-on-color' ( (otherlv_18= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==71) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalTabletUIDSL.g:2573:6: otherlv_17= 'background-on-color' ( (otherlv_18= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,71,FOLLOW_19); 

                        	newLeafNode(otherlv_17, grammarAccess.getSwitchAccess().getBackgroundOnColorKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:2577:1: ( (otherlv_18= RULE_ID ) )
                    // InternalTabletUIDSL.g:2578:1: (otherlv_18= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:2578:1: (otherlv_18= RULE_ID )
                    // InternalTabletUIDSL.g:2579:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_77); 

                    		newLeafNode(otherlv_18, grammarAccess.getSwitchAccess().getOnBackGroundColorColorCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2590:4: (otherlv_19= 'background-icon' ( (lv_backgroundIcon_20_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==59) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTabletUIDSL.g:2590:6: otherlv_19= 'background-icon' ( (lv_backgroundIcon_20_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,59,FOLLOW_5); 

                        	newLeafNode(otherlv_19, grammarAccess.getSwitchAccess().getBackgroundIconKeyword_11_0());
                        
                    // InternalTabletUIDSL.g:2594:1: ( (lv_backgroundIcon_20_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2595:1: (lv_backgroundIcon_20_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2595:1: (lv_backgroundIcon_20_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2596:3: lv_backgroundIcon_20_0= RULE_STRING
                    {
                    lv_backgroundIcon_20_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

                    			newLeafNode(lv_backgroundIcon_20_0, grammarAccess.getSwitchAccess().getBackgroundIconSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"backgroundIcon",
                            		lv_backgroundIcon_20_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2612:4: (otherlv_21= 'icon' ( (lv_icon_22_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==58) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalTabletUIDSL.g:2612:6: otherlv_21= 'icon' ( (lv_icon_22_0= RULE_STRING ) )
                    {
                    otherlv_21=(Token)match(input,58,FOLLOW_5); 

                        	newLeafNode(otherlv_21, grammarAccess.getSwitchAccess().getIconKeyword_12_0());
                        
                    // InternalTabletUIDSL.g:2616:1: ( (lv_icon_22_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2617:1: (lv_icon_22_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2617:1: (lv_icon_22_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2618:3: lv_icon_22_0= RULE_STRING
                    {
                    lv_icon_22_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_icon_22_0, grammarAccess.getSwitchAccess().getIconSTRINGTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_22_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_23, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleCustom"
    // InternalTabletUIDSL.g:2646:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // InternalTabletUIDSL.g:2647:2: (iv_ruleCustom= ruleCustom EOF )
            // InternalTabletUIDSL.g:2648:2: iv_ruleCustom= ruleCustom EOF
            {
             newCompositeNode(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustom=ruleCustom();

            state._fsp--;

             current =iv_ruleCustom; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustom"


    // $ANTLR start "ruleCustom"
    // InternalTabletUIDSL.g:2655:1: ruleCustom returns [EObject current=null] : (otherlv_0= 'custom' otherlv_1= '{' ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '}' ) ;
    public final EObject ruleCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_code_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:2658:28: ( (otherlv_0= 'custom' otherlv_1= '{' ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '}' ) )
            // InternalTabletUIDSL.g:2659:1: (otherlv_0= 'custom' otherlv_1= '{' ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '}' )
            {
            // InternalTabletUIDSL.g:2659:1: (otherlv_0= 'custom' otherlv_1= '{' ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '}' )
            // InternalTabletUIDSL.g:2659:3: otherlv_0= 'custom' otherlv_1= '{' ( (lv_code_2_0= RULE_STRING ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getCustomKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:2667:1: ( (lv_code_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:2668:1: (lv_code_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:2668:1: (lv_code_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:2669:3: lv_code_2_0= RULE_STRING
            {
            lv_code_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            			newLeafNode(lv_code_2_0, grammarAccess.getCustomAccess().getCodeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustom"


    // $ANTLR start "entryRuleDiv"
    // InternalTabletUIDSL.g:2697:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalTabletUIDSL.g:2698:2: (iv_ruleDiv= ruleDiv EOF )
            // InternalTabletUIDSL.g:2699:2: iv_ruleDiv= ruleDiv EOF
            {
             newCompositeNode(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiv=ruleDiv();

            state._fsp--;

             current =iv_ruleDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // InternalTabletUIDSL.g:2706:1: ruleDiv returns [EObject current=null] : (otherlv_0= 'div' otherlv_1= '{' (otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_STRING ) ) )? ( (lv_widgets_6_0= ruleWidgetDef ) )* otherlv_7= '}' ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_class_3_0=null;
        Token otherlv_4=null;
        Token lv_style_5_0=null;
        Token otherlv_7=null;
        EObject lv_widgets_6_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:2709:28: ( (otherlv_0= 'div' otherlv_1= '{' (otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_STRING ) ) )? ( (lv_widgets_6_0= ruleWidgetDef ) )* otherlv_7= '}' ) )
            // InternalTabletUIDSL.g:2710:1: (otherlv_0= 'div' otherlv_1= '{' (otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_STRING ) ) )? ( (lv_widgets_6_0= ruleWidgetDef ) )* otherlv_7= '}' )
            {
            // InternalTabletUIDSL.g:2710:1: (otherlv_0= 'div' otherlv_1= '{' (otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_STRING ) ) )? ( (lv_widgets_6_0= ruleWidgetDef ) )* otherlv_7= '}' )
            // InternalTabletUIDSL.g:2710:3: otherlv_0= 'div' otherlv_1= '{' (otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) )? (otherlv_4= 'style' ( (lv_style_5_0= RULE_STRING ) ) )? ( (lv_widgets_6_0= ruleWidgetDef ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getDivAccess().getDivKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_79); 

                	newLeafNode(otherlv_1, grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:2718:1: (otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==33) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTabletUIDSL.g:2718:3: otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getDivAccess().getClassKeyword_2_0());
                        
                    // InternalTabletUIDSL.g:2722:1: ( (lv_class_3_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2723:1: (lv_class_3_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2723:1: (lv_class_3_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2724:3: lv_class_3_0= RULE_STRING
                    {
                    lv_class_3_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

                    			newLeafNode(lv_class_3_0, grammarAccess.getDivAccess().getClassSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDivRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_3_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2740:4: (otherlv_4= 'style' ( (lv_style_5_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==34) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalTabletUIDSL.g:2740:6: otherlv_4= 'style' ( (lv_style_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_5); 

                        	newLeafNode(otherlv_4, grammarAccess.getDivAccess().getStyleKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:2744:1: ( (lv_style_5_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2745:1: (lv_style_5_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2745:1: (lv_style_5_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2746:3: lv_style_5_0= RULE_STRING
                    {
                    lv_style_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    			newLeafNode(lv_style_5_0, grammarAccess.getDivAccess().getStyleSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDivRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_5_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2762:4: ( (lv_widgets_6_0= ruleWidgetDef ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==35||LA65_0==42||(LA65_0>=44 && LA65_0<=45)||LA65_0==53||LA65_0==56||LA65_0==63||LA65_0==65||(LA65_0>=72 && LA65_0<=74)||LA65_0==76||LA65_0==82||LA65_0==85||LA65_0==91||LA65_0==94||LA65_0==97||LA65_0==103||LA65_0==112||LA65_0==116||LA65_0==122) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalTabletUIDSL.g:2763:1: (lv_widgets_6_0= ruleWidgetDef )
            	    {
            	    // InternalTabletUIDSL.g:2763:1: (lv_widgets_6_0= ruleWidgetDef )
            	    // InternalTabletUIDSL.g:2764:3: lv_widgets_6_0= ruleWidgetDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDivAccess().getWidgetsWidgetDefParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_21);
            	    lv_widgets_6_0=ruleWidgetDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDivRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"widgets",
            	            		lv_widgets_6_0, 
            	            		"org.ckr.TabletUIDSL.WidgetDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_7=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getDivAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuleitunes_artwork"
    // InternalTabletUIDSL.g:2792:1: entryRuleitunes_artwork returns [EObject current=null] : iv_ruleitunes_artwork= ruleitunes_artwork EOF ;
    public final EObject entryRuleitunes_artwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleitunes_artwork = null;


        try {
            // InternalTabletUIDSL.g:2793:2: (iv_ruleitunes_artwork= ruleitunes_artwork EOF )
            // InternalTabletUIDSL.g:2794:2: iv_ruleitunes_artwork= ruleitunes_artwork EOF
            {
             newCompositeNode(grammarAccess.getItunes_artworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleitunes_artwork=ruleitunes_artwork();

            state._fsp--;

             current =iv_ruleitunes_artwork; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleitunes_artwork"


    // $ANTLR start "ruleitunes_artwork"
    // InternalTabletUIDSL.g:2801:1: ruleitunes_artwork returns [EObject current=null] : (otherlv_0= 'itunes_artwork' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )* (otherlv_5= 'opacity' ( (lv_opacity_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'style' ( (lv_style_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleitunes_artwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_opacity_6_0=null;
        Token otherlv_7=null;
        Token lv_size_8_0=null;
        Token otherlv_9=null;
        Token lv_class_10_0=null;
        Token otherlv_11=null;
        Token lv_style_12_0=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:2804:28: ( (otherlv_0= 'itunes_artwork' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )* (otherlv_5= 'opacity' ( (lv_opacity_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'style' ( (lv_style_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // InternalTabletUIDSL.g:2805:1: (otherlv_0= 'itunes_artwork' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )* (otherlv_5= 'opacity' ( (lv_opacity_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'style' ( (lv_style_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // InternalTabletUIDSL.g:2805:1: (otherlv_0= 'itunes_artwork' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )* (otherlv_5= 'opacity' ( (lv_opacity_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'style' ( (lv_style_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // InternalTabletUIDSL.g:2805:3: otherlv_0= 'itunes_artwork' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )* (otherlv_5= 'opacity' ( (lv_opacity_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'style' ( (lv_style_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getItunes_artworkAccess().getItunes_artworkKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getItunes_artworkAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:2813:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:2814:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:2814:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:2815:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

            			newLeafNode(lv_device_2_0, grammarAccess.getItunes_artworkAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getItunes_artworkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_81); 

                	newLeafNode(otherlv_3, grammarAccess.getItunes_artworkAccess().getGetKeyword_3());
                
            // InternalTabletUIDSL.g:2835:1: ( (lv_get_4_0= RULE_STRING ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_STRING) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalTabletUIDSL.g:2836:1: (lv_get_4_0= RULE_STRING )
            	    {
            	    // InternalTabletUIDSL.g:2836:1: (lv_get_4_0= RULE_STRING )
            	    // InternalTabletUIDSL.g:2837:3: lv_get_4_0= RULE_STRING
            	    {
            	    lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_81); 

            	    			newLeafNode(lv_get_4_0, grammarAccess.getItunes_artworkAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getItunes_artworkRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"get",
            	            		lv_get_4_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalTabletUIDSL.g:2853:3: (otherlv_5= 'opacity' ( (lv_opacity_6_0= RULE_STRING ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==75) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalTabletUIDSL.g:2853:5: otherlv_5= 'opacity' ( (lv_opacity_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,75,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getItunes_artworkAccess().getOpacityKeyword_5_0());
                        
                    // InternalTabletUIDSL.g:2857:1: ( (lv_opacity_6_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2858:1: (lv_opacity_6_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2858:1: (lv_opacity_6_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2859:3: lv_opacity_6_0= RULE_STRING
                    {
                    lv_opacity_6_0=(Token)match(input,RULE_STRING,FOLLOW_82); 

                    			newLeafNode(lv_opacity_6_0, grammarAccess.getItunes_artworkAccess().getOpacitySTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItunes_artworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"opacity",
                            		lv_opacity_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2875:4: (otherlv_7= 'size' ( (lv_size_8_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==64) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalTabletUIDSL.g:2875:6: otherlv_7= 'size' ( (lv_size_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,64,FOLLOW_5); 

                        	newLeafNode(otherlv_7, grammarAccess.getItunes_artworkAccess().getSizeKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:2879:1: ( (lv_size_8_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2880:1: (lv_size_8_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2880:1: (lv_size_8_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2881:3: lv_size_8_0= RULE_STRING
                    {
                    lv_size_8_0=(Token)match(input,RULE_STRING,FOLLOW_83); 

                    			newLeafNode(lv_size_8_0, grammarAccess.getItunes_artworkAccess().getSizeSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItunes_artworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2897:4: (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==33) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalTabletUIDSL.g:2897:6: otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getItunes_artworkAccess().getClassKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:2901:1: ( (lv_class_10_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2902:1: (lv_class_10_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2902:1: (lv_class_10_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2903:3: lv_class_10_0= RULE_STRING
                    {
                    lv_class_10_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    			newLeafNode(lv_class_10_0, grammarAccess.getItunes_artworkAccess().getClassSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItunes_artworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:2919:4: (otherlv_11= 'style' ( (lv_style_12_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==34) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalTabletUIDSL.g:2919:6: otherlv_11= 'style' ( (lv_style_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getItunes_artworkAccess().getStyleKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:2923:1: ( (lv_style_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2924:1: (lv_style_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2924:1: (lv_style_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2925:3: lv_style_12_0= RULE_STRING
                    {
                    lv_style_12_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_style_12_0, grammarAccess.getItunes_artworkAccess().getStyleSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItunes_artworkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_13, grammarAccess.getItunes_artworkAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleitunes_artwork"


    // $ANTLR start "entryRuleWeather"
    // InternalTabletUIDSL.g:2953:1: entryRuleWeather returns [EObject current=null] : iv_ruleWeather= ruleWeather EOF ;
    public final EObject entryRuleWeather() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeather = null;


        try {
            // InternalTabletUIDSL.g:2954:2: (iv_ruleWeather= ruleWeather EOF )
            // InternalTabletUIDSL.g:2955:2: iv_ruleWeather= ruleWeather EOF
            {
             newCompositeNode(grammarAccess.getWeatherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeather=ruleWeather();

            state._fsp--;

             current =iv_ruleWeather; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeather"


    // $ANTLR start "ruleWeather"
    // InternalTabletUIDSL.g:2962:1: ruleWeather returns [EObject current=null] : (otherlv_0= 'weather' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'imageset' ( (lv_imageset_8_0= ruleWeatherImageSet ) ) )? (otherlv_9= 'image-path' ( (lv_imagePath_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleWeather() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_class_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_imagePath_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_imageset_8_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:2965:28: ( (otherlv_0= 'weather' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'imageset' ( (lv_imageset_8_0= ruleWeatherImageSet ) ) )? (otherlv_9= 'image-path' ( (lv_imagePath_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // InternalTabletUIDSL.g:2966:1: (otherlv_0= 'weather' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'imageset' ( (lv_imageset_8_0= ruleWeatherImageSet ) ) )? (otherlv_9= 'image-path' ( (lv_imagePath_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // InternalTabletUIDSL.g:2966:1: (otherlv_0= 'weather' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'imageset' ( (lv_imageset_8_0= ruleWeatherImageSet ) ) )? (otherlv_9= 'image-path' ( (lv_imagePath_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // InternalTabletUIDSL.g:2966:3: otherlv_0= 'weather' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'imageset' ( (lv_imageset_8_0= ruleWeatherImageSet ) ) )? (otherlv_9= 'image-path' ( (lv_imagePath_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getWeatherAccess().getWeatherKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getWeatherAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:2974:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:2975:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:2975:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:2976:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_85); 

            			newLeafNode(lv_device_2_0, grammarAccess.getWeatherAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWeatherRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:2992:2: (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==51) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTabletUIDSL.g:2992:4: otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getWeatherAccess().getGetKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:2996:1: ( (lv_get_4_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:2997:1: (lv_get_4_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:2997:1: (lv_get_4_0= RULE_STRING )
                    // InternalTabletUIDSL.g:2998:3: lv_get_4_0= RULE_STRING
                    {
                    lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_86); 

                    			newLeafNode(lv_get_4_0, grammarAccess.getWeatherAccess().getGetSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWeatherRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"get",
                            		lv_get_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3014:4: (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==33) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalTabletUIDSL.g:3014:6: otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getWeatherAccess().getClassKeyword_4_0());
                        
                    // InternalTabletUIDSL.g:3018:1: ( (lv_class_6_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3019:1: (lv_class_6_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3019:1: (lv_class_6_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3020:3: lv_class_6_0= RULE_STRING
                    {
                    lv_class_6_0=(Token)match(input,RULE_STRING,FOLLOW_87); 

                    			newLeafNode(lv_class_6_0, grammarAccess.getWeatherAccess().getClassSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWeatherRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3036:4: (otherlv_7= 'imageset' ( (lv_imageset_8_0= ruleWeatherImageSet ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==77) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalTabletUIDSL.g:3036:6: otherlv_7= 'imageset' ( (lv_imageset_8_0= ruleWeatherImageSet ) )
                    {
                    otherlv_7=(Token)match(input,77,FOLLOW_88); 

                        	newLeafNode(otherlv_7, grammarAccess.getWeatherAccess().getImagesetKeyword_5_0());
                        
                    // InternalTabletUIDSL.g:3040:1: ( (lv_imageset_8_0= ruleWeatherImageSet ) )
                    // InternalTabletUIDSL.g:3041:1: (lv_imageset_8_0= ruleWeatherImageSet )
                    {
                    // InternalTabletUIDSL.g:3041:1: (lv_imageset_8_0= ruleWeatherImageSet )
                    // InternalTabletUIDSL.g:3042:3: lv_imageset_8_0= ruleWeatherImageSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getWeatherAccess().getImagesetWeatherImageSetParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_89);
                    lv_imageset_8_0=ruleWeatherImageSet();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWeatherRule());
                    	        }
                           		set(
                           			current, 
                           			"imageset",
                            		lv_imageset_8_0, 
                            		"org.ckr.TabletUIDSL.WeatherImageSet");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3058:4: (otherlv_9= 'image-path' ( (lv_imagePath_10_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==78) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalTabletUIDSL.g:3058:6: otherlv_9= 'image-path' ( (lv_imagePath_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,78,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getWeatherAccess().getImagePathKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:3062:1: ( (lv_imagePath_10_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3063:1: (lv_imagePath_10_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3063:1: (lv_imagePath_10_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3064:3: lv_imagePath_10_0= RULE_STRING
                    {
                    lv_imagePath_10_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_imagePath_10_0, grammarAccess.getWeatherAccess().getImagePathSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWeatherRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"imagePath",
                            		lv_imagePath_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_11, grammarAccess.getWeatherAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeather"


    // $ANTLR start "entryRuleWeatherImageSet"
    // InternalTabletUIDSL.g:3092:1: entryRuleWeatherImageSet returns [String current=null] : iv_ruleWeatherImageSet= ruleWeatherImageSet EOF ;
    public final String entryRuleWeatherImageSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWeatherImageSet = null;


        try {
            // InternalTabletUIDSL.g:3093:2: (iv_ruleWeatherImageSet= ruleWeatherImageSet EOF )
            // InternalTabletUIDSL.g:3094:2: iv_ruleWeatherImageSet= ruleWeatherImageSet EOF
            {
             newCompositeNode(grammarAccess.getWeatherImageSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeatherImageSet=ruleWeatherImageSet();

            state._fsp--;

             current =iv_ruleWeatherImageSet.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeatherImageSet"


    // $ANTLR start "ruleWeatherImageSet"
    // InternalTabletUIDSL.g:3101:1: ruleWeatherImageSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'meteocons' | kw= 'kleinklima' | kw= 'reading' ) ;
    public final AntlrDatatypeRuleToken ruleWeatherImageSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:3104:28: ( (kw= 'meteocons' | kw= 'kleinklima' | kw= 'reading' ) )
            // InternalTabletUIDSL.g:3105:1: (kw= 'meteocons' | kw= 'kleinklima' | kw= 'reading' )
            {
            // InternalTabletUIDSL.g:3105:1: (kw= 'meteocons' | kw= 'kleinklima' | kw= 'reading' )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt75=1;
                }
                break;
            case 80:
                {
                alt75=2;
                }
                break;
            case 81:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalTabletUIDSL.g:3106:2: kw= 'meteocons'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWeatherImageSetAccess().getMeteoconsKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalTabletUIDSL.g:3113:2: kw= 'kleinklima'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWeatherImageSetAccess().getKleinklimaKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalTabletUIDSL.g:3120:2: kw= 'reading'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getWeatherImageSetAccess().getReadingKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeatherImageSet"


    // $ANTLR start "entryRuleCalview"
    // InternalTabletUIDSL.g:3133:1: entryRuleCalview returns [EObject current=null] : iv_ruleCalview= ruleCalview EOF ;
    public final EObject entryRuleCalview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalview = null;


        try {
            // InternalTabletUIDSL.g:3134:2: (iv_ruleCalview= ruleCalview EOF )
            // InternalTabletUIDSL.g:3135:2: iv_ruleCalview= ruleCalview EOF
            {
             newCompositeNode(grammarAccess.getCalviewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalview=ruleCalview();

            state._fsp--;

             current =iv_ruleCalview; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalview"


    // $ANTLR start "ruleCalview"
    // InternalTabletUIDSL.g:3142:1: ruleCalview returns [EObject current=null] : (otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleCalview() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_max_6_0=null;
        Token otherlv_7=null;
        Token lv_class_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:3145:28: ( (otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // InternalTabletUIDSL.g:3146:1: (otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // InternalTabletUIDSL.g:3146:1: (otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // InternalTabletUIDSL.g:3146:3: otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getCalviewAccess().getCalviewKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getCalviewAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:3154:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3155:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3155:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:3156:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

            			newLeafNode(lv_device_2_0, grammarAccess.getCalviewAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getCalviewAccess().getGetKeyword_3());
                
            // InternalTabletUIDSL.g:3176:1: ( (lv_get_4_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3177:1: (lv_get_4_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3177:1: (lv_get_4_0= RULE_STRING )
            // InternalTabletUIDSL.g:3178:3: lv_get_4_0= RULE_STRING
            {
            lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_90); 

            			newLeafNode(lv_get_4_0, grammarAccess.getCalviewAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"get",
                    		lv_get_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,55,FOLLOW_8); 

                	newLeafNode(otherlv_5, grammarAccess.getCalviewAccess().getMaxKeyword_5());
                
            // InternalTabletUIDSL.g:3198:1: ( (lv_max_6_0= RULE_INT ) )
            // InternalTabletUIDSL.g:3199:1: (lv_max_6_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:3199:1: (lv_max_6_0= RULE_INT )
            // InternalTabletUIDSL.g:3200:3: lv_max_6_0= RULE_INT
            {
            lv_max_6_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            			newLeafNode(lv_max_6_0, grammarAccess.getCalviewAccess().getMaxINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"max",
                    		lv_max_6_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_5); 

                	newLeafNode(otherlv_7, grammarAccess.getCalviewAccess().getClassKeyword_7());
                
            // InternalTabletUIDSL.g:3220:1: ( (lv_class_8_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3221:1: (lv_class_8_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3221:1: (lv_class_8_0= RULE_STRING )
            // InternalTabletUIDSL.g:3222:3: lv_class_8_0= RULE_STRING
            {
            lv_class_8_0=(Token)match(input,RULE_STRING,FOLLOW_91); 

            			newLeafNode(lv_class_8_0, grammarAccess.getCalviewAccess().getClassSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_8_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:3238:2: (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==83) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalTabletUIDSL.g:3238:4: otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,83,FOLLOW_19); 

                        	newLeafNode(otherlv_9, grammarAccess.getCalviewAccess().getAllForecastColorKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:3242:1: ( (otherlv_10= RULE_ID ) )
                    // InternalTabletUIDSL.g:3243:1: (otherlv_10= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:3243:1: (otherlv_10= RULE_ID )
                    // InternalTabletUIDSL.g:3244:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalviewRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_92); 

                    		newLeafNode(otherlv_10, grammarAccess.getCalviewAccess().getAllFCColorCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3255:4: (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==84) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalTabletUIDSL.g:3255:6: otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,84,FOLLOW_19); 

                        	newLeafNode(otherlv_11, grammarAccess.getCalviewAccess().getAllTodayColorKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:3259:1: ( (otherlv_12= RULE_ID ) )
                    // InternalTabletUIDSL.g:3260:1: (otherlv_12= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:3260:1: (otherlv_12= RULE_ID )
                    // InternalTabletUIDSL.g:3261:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalviewRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_40); 

                    		newLeafNode(otherlv_12, grammarAccess.getCalviewAccess().getAllTCColorCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_13, grammarAccess.getCalviewAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalview"


    // $ANTLR start "entryRulePopup"
    // InternalTabletUIDSL.g:3284:1: entryRulePopup returns [EObject current=null] : iv_rulePopup= rulePopup EOF ;
    public final EObject entryRulePopup() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopup = null;


        try {
            // InternalTabletUIDSL.g:3285:2: (iv_rulePopup= rulePopup EOF )
            // InternalTabletUIDSL.g:3286:2: iv_rulePopup= rulePopup EOF
            {
             newCompositeNode(grammarAccess.getPopupRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePopup=rulePopup();

            state._fsp--;

             current =iv_rulePopup; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePopup"


    // $ANTLR start "rulePopup"
    // InternalTabletUIDSL.g:3293:1: rulePopup returns [EObject current=null] : (otherlv_0= 'popup' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? otherlv_6= 'openIcon' ( (lv_openIcon_7_0= RULE_STRING ) ) (otherlv_8= 'openBackgroundIcon' ( (lv_openBackgroundIcon_9_0= RULE_STRING ) ) )? (otherlv_10= 'openClass' ( (lv_openClass_11_0= RULE_STRING ) ) )? (otherlv_12= 'dialogClass' ( (lv_dialogClass_13_0= RULE_STRING ) ) )? (otherlv_14= 'dialogHeaderClass' ( (lv_dialogHeaderClass_15_0= RULE_STRING ) ) )? (otherlv_16= 'header' ( (lv_header_17_0= RULE_STRING ) ) )? ( (lv_widgets_18_0= ruleWidget ) )* otherlv_19= '}' ) ;
    public final EObject rulePopup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;
        Token lv_height_5_0=null;
        Token otherlv_6=null;
        Token lv_openIcon_7_0=null;
        Token otherlv_8=null;
        Token lv_openBackgroundIcon_9_0=null;
        Token otherlv_10=null;
        Token lv_openClass_11_0=null;
        Token otherlv_12=null;
        Token lv_dialogClass_13_0=null;
        Token otherlv_14=null;
        Token lv_dialogHeaderClass_15_0=null;
        Token otherlv_16=null;
        Token lv_header_17_0=null;
        Token otherlv_19=null;
        EObject lv_widgets_18_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:3296:28: ( (otherlv_0= 'popup' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? otherlv_6= 'openIcon' ( (lv_openIcon_7_0= RULE_STRING ) ) (otherlv_8= 'openBackgroundIcon' ( (lv_openBackgroundIcon_9_0= RULE_STRING ) ) )? (otherlv_10= 'openClass' ( (lv_openClass_11_0= RULE_STRING ) ) )? (otherlv_12= 'dialogClass' ( (lv_dialogClass_13_0= RULE_STRING ) ) )? (otherlv_14= 'dialogHeaderClass' ( (lv_dialogHeaderClass_15_0= RULE_STRING ) ) )? (otherlv_16= 'header' ( (lv_header_17_0= RULE_STRING ) ) )? ( (lv_widgets_18_0= ruleWidget ) )* otherlv_19= '}' ) )
            // InternalTabletUIDSL.g:3297:1: (otherlv_0= 'popup' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? otherlv_6= 'openIcon' ( (lv_openIcon_7_0= RULE_STRING ) ) (otherlv_8= 'openBackgroundIcon' ( (lv_openBackgroundIcon_9_0= RULE_STRING ) ) )? (otherlv_10= 'openClass' ( (lv_openClass_11_0= RULE_STRING ) ) )? (otherlv_12= 'dialogClass' ( (lv_dialogClass_13_0= RULE_STRING ) ) )? (otherlv_14= 'dialogHeaderClass' ( (lv_dialogHeaderClass_15_0= RULE_STRING ) ) )? (otherlv_16= 'header' ( (lv_header_17_0= RULE_STRING ) ) )? ( (lv_widgets_18_0= ruleWidget ) )* otherlv_19= '}' )
            {
            // InternalTabletUIDSL.g:3297:1: (otherlv_0= 'popup' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? otherlv_6= 'openIcon' ( (lv_openIcon_7_0= RULE_STRING ) ) (otherlv_8= 'openBackgroundIcon' ( (lv_openBackgroundIcon_9_0= RULE_STRING ) ) )? (otherlv_10= 'openClass' ( (lv_openClass_11_0= RULE_STRING ) ) )? (otherlv_12= 'dialogClass' ( (lv_dialogClass_13_0= RULE_STRING ) ) )? (otherlv_14= 'dialogHeaderClass' ( (lv_dialogHeaderClass_15_0= RULE_STRING ) ) )? (otherlv_16= 'header' ( (lv_header_17_0= RULE_STRING ) ) )? ( (lv_widgets_18_0= ruleWidget ) )* otherlv_19= '}' )
            // InternalTabletUIDSL.g:3297:3: otherlv_0= 'popup' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? otherlv_6= 'openIcon' ( (lv_openIcon_7_0= RULE_STRING ) ) (otherlv_8= 'openBackgroundIcon' ( (lv_openBackgroundIcon_9_0= RULE_STRING ) ) )? (otherlv_10= 'openClass' ( (lv_openClass_11_0= RULE_STRING ) ) )? (otherlv_12= 'dialogClass' ( (lv_dialogClass_13_0= RULE_STRING ) ) )? (otherlv_14= 'dialogHeaderClass' ( (lv_dialogHeaderClass_15_0= RULE_STRING ) ) )? (otherlv_16= 'header' ( (lv_header_17_0= RULE_STRING ) ) )? ( (lv_widgets_18_0= ruleWidget ) )* otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getPopupAccess().getPopupKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_93); 

                	newLeafNode(otherlv_1, grammarAccess.getPopupAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:3305:1: (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==14) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalTabletUIDSL.g:3305:3: otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getPopupAccess().getWidthKeyword_2_0());
                        
                    // InternalTabletUIDSL.g:3309:1: ( (lv_width_3_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3310:1: (lv_width_3_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3310:1: (lv_width_3_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3311:3: lv_width_3_0= RULE_STRING
                    {
                    lv_width_3_0=(Token)match(input,RULE_STRING,FOLLOW_94); 

                    			newLeafNode(lv_width_3_0, grammarAccess.getPopupAccess().getWidthSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPopupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"width",
                            		lv_width_3_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3327:4: (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==15) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalTabletUIDSL.g:3327:6: otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                        	newLeafNode(otherlv_4, grammarAccess.getPopupAccess().getHeightKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:3331:1: ( (lv_height_5_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3332:1: (lv_height_5_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3332:1: (lv_height_5_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3333:3: lv_height_5_0= RULE_STRING
                    {
                    lv_height_5_0=(Token)match(input,RULE_STRING,FOLLOW_95); 

                    			newLeafNode(lv_height_5_0, grammarAccess.getPopupAccess().getHeightSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPopupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"height",
                            		lv_height_5_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,86,FOLLOW_5); 

                	newLeafNode(otherlv_6, grammarAccess.getPopupAccess().getOpenIconKeyword_4());
                
            // InternalTabletUIDSL.g:3353:1: ( (lv_openIcon_7_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3354:1: (lv_openIcon_7_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3354:1: (lv_openIcon_7_0= RULE_STRING )
            // InternalTabletUIDSL.g:3355:3: lv_openIcon_7_0= RULE_STRING
            {
            lv_openIcon_7_0=(Token)match(input,RULE_STRING,FOLLOW_96); 

            			newLeafNode(lv_openIcon_7_0, grammarAccess.getPopupAccess().getOpenIconSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPopupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"openIcon",
                    		lv_openIcon_7_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:3371:2: (otherlv_8= 'openBackgroundIcon' ( (lv_openBackgroundIcon_9_0= RULE_STRING ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==87) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTabletUIDSL.g:3371:4: otherlv_8= 'openBackgroundIcon' ( (lv_openBackgroundIcon_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,87,FOLLOW_5); 

                        	newLeafNode(otherlv_8, grammarAccess.getPopupAccess().getOpenBackgroundIconKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:3375:1: ( (lv_openBackgroundIcon_9_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3376:1: (lv_openBackgroundIcon_9_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3376:1: (lv_openBackgroundIcon_9_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3377:3: lv_openBackgroundIcon_9_0= RULE_STRING
                    {
                    lv_openBackgroundIcon_9_0=(Token)match(input,RULE_STRING,FOLLOW_97); 

                    			newLeafNode(lv_openBackgroundIcon_9_0, grammarAccess.getPopupAccess().getOpenBackgroundIconSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPopupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"openBackgroundIcon",
                            		lv_openBackgroundIcon_9_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3393:4: (otherlv_10= 'openClass' ( (lv_openClass_11_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==88) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalTabletUIDSL.g:3393:6: otherlv_10= 'openClass' ( (lv_openClass_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,88,FOLLOW_5); 

                        	newLeafNode(otherlv_10, grammarAccess.getPopupAccess().getOpenClassKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:3397:1: ( (lv_openClass_11_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3398:1: (lv_openClass_11_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3398:1: (lv_openClass_11_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3399:3: lv_openClass_11_0= RULE_STRING
                    {
                    lv_openClass_11_0=(Token)match(input,RULE_STRING,FOLLOW_98); 

                    			newLeafNode(lv_openClass_11_0, grammarAccess.getPopupAccess().getOpenClassSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPopupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"openClass",
                            		lv_openClass_11_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3415:4: (otherlv_12= 'dialogClass' ( (lv_dialogClass_13_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==89) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalTabletUIDSL.g:3415:6: otherlv_12= 'dialogClass' ( (lv_dialogClass_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,89,FOLLOW_5); 

                        	newLeafNode(otherlv_12, grammarAccess.getPopupAccess().getDialogClassKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:3419:1: ( (lv_dialogClass_13_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3420:1: (lv_dialogClass_13_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3420:1: (lv_dialogClass_13_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3421:3: lv_dialogClass_13_0= RULE_STRING
                    {
                    lv_dialogClass_13_0=(Token)match(input,RULE_STRING,FOLLOW_99); 

                    			newLeafNode(lv_dialogClass_13_0, grammarAccess.getPopupAccess().getDialogClassSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPopupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dialogClass",
                            		lv_dialogClass_13_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3437:4: (otherlv_14= 'dialogHeaderClass' ( (lv_dialogHeaderClass_15_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==90) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalTabletUIDSL.g:3437:6: otherlv_14= 'dialogHeaderClass' ( (lv_dialogHeaderClass_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,90,FOLLOW_5); 

                        	newLeafNode(otherlv_14, grammarAccess.getPopupAccess().getDialogHeaderClassKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:3441:1: ( (lv_dialogHeaderClass_15_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3442:1: (lv_dialogHeaderClass_15_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3442:1: (lv_dialogHeaderClass_15_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3443:3: lv_dialogHeaderClass_15_0= RULE_STRING
                    {
                    lv_dialogHeaderClass_15_0=(Token)match(input,RULE_STRING,FOLLOW_100); 

                    			newLeafNode(lv_dialogHeaderClass_15_0, grammarAccess.getPopupAccess().getDialogHeaderClassSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPopupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dialogHeaderClass",
                            		lv_dialogHeaderClass_15_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3459:4: (otherlv_16= 'header' ( (lv_header_17_0= RULE_STRING ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==28) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalTabletUIDSL.g:3459:6: otherlv_16= 'header' ( (lv_header_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,28,FOLLOW_5); 

                        	newLeafNode(otherlv_16, grammarAccess.getPopupAccess().getHeaderKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:3463:1: ( (lv_header_17_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3464:1: (lv_header_17_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3464:1: (lv_header_17_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3465:3: lv_header_17_0= RULE_STRING
                    {
                    lv_header_17_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    			newLeafNode(lv_header_17_0, grammarAccess.getPopupAccess().getHeaderSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPopupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"header",
                            		lv_header_17_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3481:4: ( (lv_widgets_18_0= ruleWidget ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==35||LA85_0==42||(LA85_0>=44 && LA85_0<=45)||LA85_0==53||LA85_0==56||LA85_0==63||LA85_0==65||LA85_0==72||LA85_0==74||LA85_0==76||LA85_0==82||LA85_0==85||LA85_0==91||LA85_0==94||LA85_0==97||LA85_0==103||LA85_0==112||LA85_0==116||LA85_0==122) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalTabletUIDSL.g:3482:1: (lv_widgets_18_0= ruleWidget )
            	    {
            	    // InternalTabletUIDSL.g:3482:1: (lv_widgets_18_0= ruleWidget )
            	    // InternalTabletUIDSL.g:3483:3: lv_widgets_18_0= ruleWidget
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPopupAccess().getWidgetsWidgetParserRuleCall_11_0()); 
            	    	    
            	    pushFollow(FOLLOW_21);
            	    lv_widgets_18_0=ruleWidget();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPopupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"widgets",
            	            		lv_widgets_18_0, 
            	            		"org.ckr.TabletUIDSL.Widget");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            otherlv_19=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_19, grammarAccess.getPopupAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePopup"


    // $ANTLR start "entryRuleLink"
    // InternalTabletUIDSL.g:3511:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalTabletUIDSL.g:3512:2: (iv_ruleLink= ruleLink EOF )
            // InternalTabletUIDSL.g:3513:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalTabletUIDSL.g:3520:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? (otherlv_6= 'color' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? (otherlv_10= 'backgroundColor' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) otherlv_14= 'cmd' ( (lv_cmd_15_0= RULE_STRING ) ) otherlv_16= 'label' ( (lv_label_17_0= RULE_STRING ) ) otherlv_18= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;
        Token lv_height_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_class_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_icon_13_0=null;
        Token otherlv_14=null;
        Token lv_cmd_15_0=null;
        Token otherlv_16=null;
        Token lv_label_17_0=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:3523:28: ( (otherlv_0= 'link' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? (otherlv_6= 'color' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? (otherlv_10= 'backgroundColor' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) otherlv_14= 'cmd' ( (lv_cmd_15_0= RULE_STRING ) ) otherlv_16= 'label' ( (lv_label_17_0= RULE_STRING ) ) otherlv_18= '}' ) )
            // InternalTabletUIDSL.g:3524:1: (otherlv_0= 'link' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? (otherlv_6= 'color' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? (otherlv_10= 'backgroundColor' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) otherlv_14= 'cmd' ( (lv_cmd_15_0= RULE_STRING ) ) otherlv_16= 'label' ( (lv_label_17_0= RULE_STRING ) ) otherlv_18= '}' )
            {
            // InternalTabletUIDSL.g:3524:1: (otherlv_0= 'link' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? (otherlv_6= 'color' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? (otherlv_10= 'backgroundColor' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) otherlv_14= 'cmd' ( (lv_cmd_15_0= RULE_STRING ) ) otherlv_16= 'label' ( (lv_label_17_0= RULE_STRING ) ) otherlv_18= '}' )
            // InternalTabletUIDSL.g:3524:3: otherlv_0= 'link' otherlv_1= '{' (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )? (otherlv_6= 'color' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )? (otherlv_10= 'backgroundColor' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) otherlv_14= 'cmd' ( (lv_cmd_15_0= RULE_STRING ) ) otherlv_16= 'label' ( (lv_label_17_0= RULE_STRING ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_101); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:3532:1: (otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==14) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalTabletUIDSL.g:3532:3: otherlv_2= 'width' ( (lv_width_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getWidthKeyword_2_0());
                        
                    // InternalTabletUIDSL.g:3536:1: ( (lv_width_3_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3537:1: (lv_width_3_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3537:1: (lv_width_3_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3538:3: lv_width_3_0= RULE_STRING
                    {
                    lv_width_3_0=(Token)match(input,RULE_STRING,FOLLOW_102); 

                    			newLeafNode(lv_width_3_0, grammarAccess.getLinkAccess().getWidthSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"width",
                            		lv_width_3_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3554:4: (otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==15) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalTabletUIDSL.g:3554:6: otherlv_4= 'height' ( (lv_height_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getHeightKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:3558:1: ( (lv_height_5_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3559:1: (lv_height_5_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3559:1: (lv_height_5_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3560:3: lv_height_5_0= RULE_STRING
                    {
                    lv_height_5_0=(Token)match(input,RULE_STRING,FOLLOW_103); 

                    			newLeafNode(lv_height_5_0, grammarAccess.getLinkAccess().getHeightSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"height",
                            		lv_height_5_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3576:4: (otherlv_6= 'color' ( (otherlv_7= RULE_ID ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==92) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalTabletUIDSL.g:3576:6: otherlv_6= 'color' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,92,FOLLOW_19); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getColorKeyword_4_0());
                        
                    // InternalTabletUIDSL.g:3580:1: ( (otherlv_7= RULE_ID ) )
                    // InternalTabletUIDSL.g:3581:1: (otherlv_7= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:3581:1: (otherlv_7= RULE_ID )
                    // InternalTabletUIDSL.g:3582:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_104); 

                    		newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getColorColorCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3593:4: (otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==33) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalTabletUIDSL.g:3593:6: otherlv_8= 'class' ( (lv_class_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getClassKeyword_5_0());
                        
                    // InternalTabletUIDSL.g:3597:1: ( (lv_class_9_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3598:1: (lv_class_9_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3598:1: (lv_class_9_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3599:3: lv_class_9_0= RULE_STRING
                    {
                    lv_class_9_0=(Token)match(input,RULE_STRING,FOLLOW_105); 

                    			newLeafNode(lv_class_9_0, grammarAccess.getLinkAccess().getClassSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_9_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3615:4: (otherlv_10= 'backgroundColor' ( (otherlv_11= RULE_ID ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==93) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalTabletUIDSL.g:3615:6: otherlv_10= 'backgroundColor' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,93,FOLLOW_19); 

                        	newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getBackgroundColorKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:3619:1: ( (otherlv_11= RULE_ID ) )
                    // InternalTabletUIDSL.g:3620:1: (otherlv_11= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:3620:1: (otherlv_11= RULE_ID )
                    // InternalTabletUIDSL.g:3621:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_59); 

                    		newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getBackgroundColorColorCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,58,FOLLOW_5); 

                	newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getIconKeyword_7());
                
            // InternalTabletUIDSL.g:3636:1: ( (lv_icon_13_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3637:1: (lv_icon_13_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3637:1: (lv_icon_13_0= RULE_STRING )
            // InternalTabletUIDSL.g:3638:3: lv_icon_13_0= RULE_STRING
            {
            lv_icon_13_0=(Token)match(input,RULE_STRING,FOLLOW_106); 

            			newLeafNode(lv_icon_13_0, grammarAccess.getLinkAccess().getIconSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"icon",
                    		lv_icon_13_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_14=(Token)match(input,49,FOLLOW_5); 

                	newLeafNode(otherlv_14, grammarAccess.getLinkAccess().getCmdKeyword_9());
                
            // InternalTabletUIDSL.g:3658:1: ( (lv_cmd_15_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3659:1: (lv_cmd_15_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3659:1: (lv_cmd_15_0= RULE_STRING )
            // InternalTabletUIDSL.g:3660:3: lv_cmd_15_0= RULE_STRING
            {
            lv_cmd_15_0=(Token)match(input,RULE_STRING,FOLLOW_107); 

            			newLeafNode(lv_cmd_15_0, grammarAccess.getLinkAccess().getCmdSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cmd",
                    		lv_cmd_15_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_16=(Token)match(input,94,FOLLOW_5); 

                	newLeafNode(otherlv_16, grammarAccess.getLinkAccess().getLabelKeyword_11());
                
            // InternalTabletUIDSL.g:3680:1: ( (lv_label_17_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3681:1: (lv_label_17_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3681:1: (lv_label_17_0= RULE_STRING )
            // InternalTabletUIDSL.g:3682:3: lv_label_17_0= RULE_STRING
            {
            lv_label_17_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            			newLeafNode(lv_label_17_0, grammarAccess.getLinkAccess().getLabelSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_17_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_18=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_18, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleButtonUrl"
    // InternalTabletUIDSL.g:3710:1: entryRuleButtonUrl returns [EObject current=null] : iv_ruleButtonUrl= ruleButtonUrl EOF ;
    public final EObject entryRuleButtonUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonUrl = null;


        try {
            // InternalTabletUIDSL.g:3711:2: (iv_ruleButtonUrl= ruleButtonUrl EOF )
            // InternalTabletUIDSL.g:3712:2: iv_ruleButtonUrl= ruleButtonUrl EOF
            {
             newCompositeNode(grammarAccess.getButtonUrlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonUrl=ruleButtonUrl();

            state._fsp--;

             current =iv_ruleButtonUrl; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonUrl"


    // $ANTLR start "ruleButtonUrl"
    // InternalTabletUIDSL.g:3719:1: ruleButtonUrl returns [EObject current=null] : ( (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) ) | (otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'fhem-cmd' ( (lv_fhemCmd_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleButtonUrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_fhemCmd_5_0=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:3722:28: ( ( (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) ) | (otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'fhem-cmd' ( (lv_fhemCmd_5_0= RULE_STRING ) ) ) ) )
            // InternalTabletUIDSL.g:3723:1: ( (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) ) | (otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'fhem-cmd' ( (lv_fhemCmd_5_0= RULE_STRING ) ) ) )
            {
            // InternalTabletUIDSL.g:3723:1: ( (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) ) | (otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'fhem-cmd' ( (lv_fhemCmd_5_0= RULE_STRING ) ) ) )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt91=1;
                }
                break;
            case 95:
                {
                alt91=2;
                }
                break;
            case 96:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalTabletUIDSL.g:3723:2: (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) )
                    {
                    // InternalTabletUIDSL.g:3723:2: (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) )
                    // InternalTabletUIDSL.g:3723:4: otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_5); 

                        	newLeafNode(otherlv_0, grammarAccess.getButtonUrlAccess().getUrlKeyword_0_0());
                        
                    // InternalTabletUIDSL.g:3727:1: ( (lv_url_1_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3728:1: (lv_url_1_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3728:1: (lv_url_1_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3729:3: lv_url_1_0= RULE_STRING
                    {
                    lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_url_1_0, grammarAccess.getButtonUrlAccess().getUrlSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonUrlRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"url",
                            		lv_url_1_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTabletUIDSL.g:3746:6: (otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalTabletUIDSL.g:3746:6: (otherlv_2= 'page' ( (otherlv_3= RULE_ID ) ) )
                    // InternalTabletUIDSL.g:3746:8: otherlv_2= 'page' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,95,FOLLOW_19); 

                        	newLeafNode(otherlv_2, grammarAccess.getButtonUrlAccess().getPageKeyword_1_0());
                        
                    // InternalTabletUIDSL.g:3750:1: ( (otherlv_3= RULE_ID ) )
                    // InternalTabletUIDSL.g:3751:1: (otherlv_3= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:3751:1: (otherlv_3= RULE_ID )
                    // InternalTabletUIDSL.g:3752:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonUrlRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_3, grammarAccess.getButtonUrlAccess().getPagePageCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTabletUIDSL.g:3764:6: (otherlv_4= 'fhem-cmd' ( (lv_fhemCmd_5_0= RULE_STRING ) ) )
                    {
                    // InternalTabletUIDSL.g:3764:6: (otherlv_4= 'fhem-cmd' ( (lv_fhemCmd_5_0= RULE_STRING ) ) )
                    // InternalTabletUIDSL.g:3764:8: otherlv_4= 'fhem-cmd' ( (lv_fhemCmd_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,96,FOLLOW_5); 

                        	newLeafNode(otherlv_4, grammarAccess.getButtonUrlAccess().getFhemCmdKeyword_2_0());
                        
                    // InternalTabletUIDSL.g:3768:1: ( (lv_fhemCmd_5_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3769:1: (lv_fhemCmd_5_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3769:1: (lv_fhemCmd_5_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3770:3: lv_fhemCmd_5_0= RULE_STRING
                    {
                    lv_fhemCmd_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(lv_fhemCmd_5_0, grammarAccess.getButtonUrlAccess().getFhemCmdSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonUrlRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fhemCmd",
                            		lv_fhemCmd_5_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonUrl"


    // $ANTLR start "entryRuleButton"
    // InternalTabletUIDSL.g:3794:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalTabletUIDSL.g:3795:2: (iv_ruleButton= ruleButton EOF )
            // InternalTabletUIDSL.g:3796:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalTabletUIDSL.g:3803:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? ( (lv_target_11_0= ruleButtonUrl ) ) otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) (otherlv_14= 'background-icon' ( (lv_backgroundIcon_15_0= RULE_STRING ) ) )? otherlv_16= 'class' ( (lv_class_17_0= RULE_STRING ) ) (otherlv_18= 'on-color' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'on-background-color' ( (otherlv_21= RULE_ID ) ) )? (otherlv_22= 'off-color' ( (otherlv_23= RULE_ID ) ) )? (otherlv_24= 'off-background-color' ( (otherlv_25= RULE_ID ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_getOn_6_0=null;
        Token otherlv_7=null;
        Token lv_getWarn_8_0=null;
        Token otherlv_9=null;
        Token lv_getOff_10_0=null;
        Token otherlv_12=null;
        Token lv_icon_13_0=null;
        Token otherlv_14=null;
        Token lv_backgroundIcon_15_0=null;
        Token otherlv_16=null;
        Token lv_class_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_target_11_0 = null;


         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:3806:28: ( (otherlv_0= 'button' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? ( (lv_target_11_0= ruleButtonUrl ) ) otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) (otherlv_14= 'background-icon' ( (lv_backgroundIcon_15_0= RULE_STRING ) ) )? otherlv_16= 'class' ( (lv_class_17_0= RULE_STRING ) ) (otherlv_18= 'on-color' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'on-background-color' ( (otherlv_21= RULE_ID ) ) )? (otherlv_22= 'off-color' ( (otherlv_23= RULE_ID ) ) )? (otherlv_24= 'off-background-color' ( (otherlv_25= RULE_ID ) ) )? otherlv_26= '}' ) )
            // InternalTabletUIDSL.g:3807:1: (otherlv_0= 'button' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? ( (lv_target_11_0= ruleButtonUrl ) ) otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) (otherlv_14= 'background-icon' ( (lv_backgroundIcon_15_0= RULE_STRING ) ) )? otherlv_16= 'class' ( (lv_class_17_0= RULE_STRING ) ) (otherlv_18= 'on-color' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'on-background-color' ( (otherlv_21= RULE_ID ) ) )? (otherlv_22= 'off-color' ( (otherlv_23= RULE_ID ) ) )? (otherlv_24= 'off-background-color' ( (otherlv_25= RULE_ID ) ) )? otherlv_26= '}' )
            {
            // InternalTabletUIDSL.g:3807:1: (otherlv_0= 'button' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? ( (lv_target_11_0= ruleButtonUrl ) ) otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) (otherlv_14= 'background-icon' ( (lv_backgroundIcon_15_0= RULE_STRING ) ) )? otherlv_16= 'class' ( (lv_class_17_0= RULE_STRING ) ) (otherlv_18= 'on-color' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'on-background-color' ( (otherlv_21= RULE_ID ) ) )? (otherlv_22= 'off-color' ( (otherlv_23= RULE_ID ) ) )? (otherlv_24= 'off-background-color' ( (otherlv_25= RULE_ID ) ) )? otherlv_26= '}' )
            // InternalTabletUIDSL.g:3807:3: otherlv_0= 'button' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) )? (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )? ( (lv_target_11_0= ruleButtonUrl ) ) otherlv_12= 'icon' ( (lv_icon_13_0= RULE_STRING ) ) (otherlv_14= 'background-icon' ( (lv_backgroundIcon_15_0= RULE_STRING ) ) )? otherlv_16= 'class' ( (lv_class_17_0= RULE_STRING ) ) (otherlv_18= 'on-color' ( (otherlv_19= RULE_ID ) ) )? (otherlv_20= 'on-background-color' ( (otherlv_21= RULE_ID ) ) )? (otherlv_22= 'off-color' ( (otherlv_23= RULE_ID ) ) )? (otherlv_24= 'off-background-color' ( (otherlv_25= RULE_ID ) ) )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_108); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:3815:1: ( (lv_device_2_0= RULE_STRING ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_STRING) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalTabletUIDSL.g:3816:1: (lv_device_2_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3816:1: (lv_device_2_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3817:3: lv_device_2_0= RULE_STRING
                    {
                    lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_108); 

                    			newLeafNode(lv_device_2_0, grammarAccess.getButtonAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"device",
                            		lv_device_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3833:3: (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==51) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalTabletUIDSL.g:3833:5: otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getGetKeyword_3_0());
                        
                    // InternalTabletUIDSL.g:3837:1: ( (lv_get_4_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3838:1: (lv_get_4_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3838:1: (lv_get_4_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3839:3: lv_get_4_0= RULE_STRING
                    {
                    lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_108); 

                    			newLeafNode(lv_get_4_0, grammarAccess.getButtonAccess().getGetSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"get",
                            		lv_get_4_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3855:4: (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==66) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalTabletUIDSL.g:3855:6: otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getGetOnKeyword_4_0());
                        
                    // InternalTabletUIDSL.g:3859:1: ( (lv_getOn_6_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3860:1: (lv_getOn_6_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3860:1: (lv_getOn_6_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3861:3: lv_getOn_6_0= RULE_STRING
                    {
                    lv_getOn_6_0=(Token)match(input,RULE_STRING,FOLLOW_108); 

                    			newLeafNode(lv_getOn_6_0, grammarAccess.getButtonAccess().getGetOnSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"getOn",
                            		lv_getOn_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3877:4: (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==98) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalTabletUIDSL.g:3877:6: otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,98,FOLLOW_5); 

                        	newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getGetWarnKeyword_5_0());
                        
                    // InternalTabletUIDSL.g:3881:1: ( (lv_getWarn_8_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3882:1: (lv_getWarn_8_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3882:1: (lv_getWarn_8_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3883:3: lv_getWarn_8_0= RULE_STRING
                    {
                    lv_getWarn_8_0=(Token)match(input,RULE_STRING,FOLLOW_108); 

                    			newLeafNode(lv_getWarn_8_0, grammarAccess.getButtonAccess().getGetWarnSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"getWarn",
                            		lv_getWarn_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3899:4: (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==68) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalTabletUIDSL.g:3899:6: otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,68,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getButtonAccess().getGetOffKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:3903:1: ( (lv_getOff_10_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3904:1: (lv_getOff_10_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3904:1: (lv_getOff_10_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3905:3: lv_getOff_10_0= RULE_STRING
                    {
                    lv_getOff_10_0=(Token)match(input,RULE_STRING,FOLLOW_108); 

                    			newLeafNode(lv_getOff_10_0, grammarAccess.getButtonAccess().getGetOffSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"getOff",
                            		lv_getOff_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:3921:4: ( (lv_target_11_0= ruleButtonUrl ) )
            // InternalTabletUIDSL.g:3922:1: (lv_target_11_0= ruleButtonUrl )
            {
            // InternalTabletUIDSL.g:3922:1: (lv_target_11_0= ruleButtonUrl )
            // InternalTabletUIDSL.g:3923:3: lv_target_11_0= ruleButtonUrl
            {
             
            	        newCompositeNode(grammarAccess.getButtonAccess().getTargetButtonUrlParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_59);
            lv_target_11_0=ruleButtonUrl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getButtonRule());
            	        }
                   		set(
                   			current, 
                   			"target",
                    		lv_target_11_0, 
                    		"org.ckr.TabletUIDSL.ButtonUrl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,58,FOLLOW_5); 

                	newLeafNode(otherlv_12, grammarAccess.getButtonAccess().getIconKeyword_8());
                
            // InternalTabletUIDSL.g:3943:1: ( (lv_icon_13_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3944:1: (lv_icon_13_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3944:1: (lv_icon_13_0= RULE_STRING )
            // InternalTabletUIDSL.g:3945:3: lv_icon_13_0= RULE_STRING
            {
            lv_icon_13_0=(Token)match(input,RULE_STRING,FOLLOW_109); 

            			newLeafNode(lv_icon_13_0, grammarAccess.getButtonAccess().getIconSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"icon",
                    		lv_icon_13_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:3961:2: (otherlv_14= 'background-icon' ( (lv_backgroundIcon_15_0= RULE_STRING ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==59) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalTabletUIDSL.g:3961:4: otherlv_14= 'background-icon' ( (lv_backgroundIcon_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,59,FOLLOW_5); 

                        	newLeafNode(otherlv_14, grammarAccess.getButtonAccess().getBackgroundIconKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:3965:1: ( (lv_backgroundIcon_15_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:3966:1: (lv_backgroundIcon_15_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:3966:1: (lv_backgroundIcon_15_0= RULE_STRING )
                    // InternalTabletUIDSL.g:3967:3: lv_backgroundIcon_15_0= RULE_STRING
                    {
                    lv_backgroundIcon_15_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    			newLeafNode(lv_backgroundIcon_15_0, grammarAccess.getButtonAccess().getBackgroundIconSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"backgroundIcon",
                            		lv_backgroundIcon_15_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,33,FOLLOW_5); 

                	newLeafNode(otherlv_16, grammarAccess.getButtonAccess().getClassKeyword_11());
                
            // InternalTabletUIDSL.g:3987:1: ( (lv_class_17_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:3988:1: (lv_class_17_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:3988:1: (lv_class_17_0= RULE_STRING )
            // InternalTabletUIDSL.g:3989:3: lv_class_17_0= RULE_STRING
            {
            lv_class_17_0=(Token)match(input,RULE_STRING,FOLLOW_110); 

            			newLeafNode(lv_class_17_0, grammarAccess.getButtonAccess().getClassSTRINGTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_17_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:4005:2: (otherlv_18= 'on-color' ( (otherlv_19= RULE_ID ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==99) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalTabletUIDSL.g:4005:4: otherlv_18= 'on-color' ( (otherlv_19= RULE_ID ) )
                    {
                    otherlv_18=(Token)match(input,99,FOLLOW_19); 

                        	newLeafNode(otherlv_18, grammarAccess.getButtonAccess().getOnColorKeyword_13_0());
                        
                    // InternalTabletUIDSL.g:4009:1: ( (otherlv_19= RULE_ID ) )
                    // InternalTabletUIDSL.g:4010:1: (otherlv_19= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4010:1: (otherlv_19= RULE_ID )
                    // InternalTabletUIDSL.g:4011:3: otherlv_19= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                            
                    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_111); 

                    		newLeafNode(otherlv_19, grammarAccess.getButtonAccess().getOnColorColorCrossReference_13_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4022:4: (otherlv_20= 'on-background-color' ( (otherlv_21= RULE_ID ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==100) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalTabletUIDSL.g:4022:6: otherlv_20= 'on-background-color' ( (otherlv_21= RULE_ID ) )
                    {
                    otherlv_20=(Token)match(input,100,FOLLOW_19); 

                        	newLeafNode(otherlv_20, grammarAccess.getButtonAccess().getOnBackgroundColorKeyword_14_0());
                        
                    // InternalTabletUIDSL.g:4026:1: ( (otherlv_21= RULE_ID ) )
                    // InternalTabletUIDSL.g:4027:1: (otherlv_21= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4027:1: (otherlv_21= RULE_ID )
                    // InternalTabletUIDSL.g:4028:3: otherlv_21= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                            
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_112); 

                    		newLeafNode(otherlv_21, grammarAccess.getButtonAccess().getOnBackgroundColorColorCrossReference_14_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4039:4: (otherlv_22= 'off-color' ( (otherlv_23= RULE_ID ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==101) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalTabletUIDSL.g:4039:6: otherlv_22= 'off-color' ( (otherlv_23= RULE_ID ) )
                    {
                    otherlv_22=(Token)match(input,101,FOLLOW_19); 

                        	newLeafNode(otherlv_22, grammarAccess.getButtonAccess().getOffColorKeyword_15_0());
                        
                    // InternalTabletUIDSL.g:4043:1: ( (otherlv_23= RULE_ID ) )
                    // InternalTabletUIDSL.g:4044:1: (otherlv_23= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4044:1: (otherlv_23= RULE_ID )
                    // InternalTabletUIDSL.g:4045:3: otherlv_23= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                            
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_113); 

                    		newLeafNode(otherlv_23, grammarAccess.getButtonAccess().getOffColorColorCrossReference_15_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4056:4: (otherlv_24= 'off-background-color' ( (otherlv_25= RULE_ID ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==102) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalTabletUIDSL.g:4056:6: otherlv_24= 'off-background-color' ( (otherlv_25= RULE_ID ) )
                    {
                    otherlv_24=(Token)match(input,102,FOLLOW_19); 

                        	newLeafNode(otherlv_24, grammarAccess.getButtonAccess().getOffBackgroundColorKeyword_16_0());
                        
                    // InternalTabletUIDSL.g:4060:1: ( (otherlv_25= RULE_ID ) )
                    // InternalTabletUIDSL.g:4061:1: (otherlv_25= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4061:1: (otherlv_25= RULE_ID )
                    // InternalTabletUIDSL.g:4062:3: otherlv_25= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                            
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_40); 

                    		newLeafNode(otherlv_25, grammarAccess.getButtonAccess().getOffBackgroundColorColorCrossReference_16_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_26, grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleKlimatrend"
    // InternalTabletUIDSL.g:4085:1: entryRuleKlimatrend returns [EObject current=null] : iv_ruleKlimatrend= ruleKlimatrend EOF ;
    public final EObject entryRuleKlimatrend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKlimatrend = null;


        try {
            // InternalTabletUIDSL.g:4086:2: (iv_ruleKlimatrend= ruleKlimatrend EOF )
            // InternalTabletUIDSL.g:4087:2: iv_ruleKlimatrend= ruleKlimatrend EOF
            {
             newCompositeNode(grammarAccess.getKlimatrendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKlimatrend=ruleKlimatrend();

            state._fsp--;

             current =iv_ruleKlimatrend; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKlimatrend"


    // $ANTLR start "ruleKlimatrend"
    // InternalTabletUIDSL.g:4094:1: ruleKlimatrend returns [EObject current=null] : (otherlv_0= 'klimatrend' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? otherlv_7= 'refperiod' ( (lv_refperiod_8_0= RULE_INT ) ) (otherlv_9= 'stagnatingColor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'icon' ( (lv_icon_12_0= RULE_STRING ) ) )? (otherlv_13= 'risingColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'fallingColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'highmark' ( (lv_highmark_18_0= RULE_INT ) ) )? (otherlv_19= 'highmarkIcon' ( (lv_highmarkIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'highmarkRisingColor' ( (otherlv_22= RULE_ID ) ) )? (otherlv_23= 'highmarkFallingColor' ( (otherlv_24= RULE_ID ) ) )? otherlv_25= '}' ) ;
    public final EObject ruleKlimatrend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_class_6_0=null;
        Token otherlv_7=null;
        Token lv_refperiod_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_icon_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_highmark_18_0=null;
        Token otherlv_19=null;
        Token lv_highmarkIcon_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:4097:28: ( (otherlv_0= 'klimatrend' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? otherlv_7= 'refperiod' ( (lv_refperiod_8_0= RULE_INT ) ) (otherlv_9= 'stagnatingColor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'icon' ( (lv_icon_12_0= RULE_STRING ) ) )? (otherlv_13= 'risingColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'fallingColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'highmark' ( (lv_highmark_18_0= RULE_INT ) ) )? (otherlv_19= 'highmarkIcon' ( (lv_highmarkIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'highmarkRisingColor' ( (otherlv_22= RULE_ID ) ) )? (otherlv_23= 'highmarkFallingColor' ( (otherlv_24= RULE_ID ) ) )? otherlv_25= '}' ) )
            // InternalTabletUIDSL.g:4098:1: (otherlv_0= 'klimatrend' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? otherlv_7= 'refperiod' ( (lv_refperiod_8_0= RULE_INT ) ) (otherlv_9= 'stagnatingColor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'icon' ( (lv_icon_12_0= RULE_STRING ) ) )? (otherlv_13= 'risingColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'fallingColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'highmark' ( (lv_highmark_18_0= RULE_INT ) ) )? (otherlv_19= 'highmarkIcon' ( (lv_highmarkIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'highmarkRisingColor' ( (otherlv_22= RULE_ID ) ) )? (otherlv_23= 'highmarkFallingColor' ( (otherlv_24= RULE_ID ) ) )? otherlv_25= '}' )
            {
            // InternalTabletUIDSL.g:4098:1: (otherlv_0= 'klimatrend' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? otherlv_7= 'refperiod' ( (lv_refperiod_8_0= RULE_INT ) ) (otherlv_9= 'stagnatingColor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'icon' ( (lv_icon_12_0= RULE_STRING ) ) )? (otherlv_13= 'risingColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'fallingColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'highmark' ( (lv_highmark_18_0= RULE_INT ) ) )? (otherlv_19= 'highmarkIcon' ( (lv_highmarkIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'highmarkRisingColor' ( (otherlv_22= RULE_ID ) ) )? (otherlv_23= 'highmarkFallingColor' ( (otherlv_24= RULE_ID ) ) )? otherlv_25= '}' )
            // InternalTabletUIDSL.g:4098:3: otherlv_0= 'klimatrend' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? otherlv_7= 'refperiod' ( (lv_refperiod_8_0= RULE_INT ) ) (otherlv_9= 'stagnatingColor' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'icon' ( (lv_icon_12_0= RULE_STRING ) ) )? (otherlv_13= 'risingColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'fallingColor' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'highmark' ( (lv_highmark_18_0= RULE_INT ) ) )? (otherlv_19= 'highmarkIcon' ( (lv_highmarkIcon_20_0= RULE_STRING ) ) )? (otherlv_21= 'highmarkRisingColor' ( (otherlv_22= RULE_ID ) ) )? (otherlv_23= 'highmarkFallingColor' ( (otherlv_24= RULE_ID ) ) )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getKlimatrendAccess().getKlimatrendKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getKlimatrendAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:4106:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4107:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4107:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:4108:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

            			newLeafNode(lv_device_2_0, grammarAccess.getKlimatrendAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKlimatrendRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getKlimatrendAccess().getGetKeyword_3());
                
            // InternalTabletUIDSL.g:4128:1: ( (lv_get_4_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4129:1: (lv_get_4_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4129:1: (lv_get_4_0= RULE_STRING )
            // InternalTabletUIDSL.g:4130:3: lv_get_4_0= RULE_STRING
            {
            lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_114); 

            			newLeafNode(lv_get_4_0, grammarAccess.getKlimatrendAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKlimatrendRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"get",
                    		lv_get_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:4146:2: (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==33) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalTabletUIDSL.g:4146:4: otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getKlimatrendAccess().getClassKeyword_5_0());
                        
                    // InternalTabletUIDSL.g:4150:1: ( (lv_class_6_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:4151:1: (lv_class_6_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:4151:1: (lv_class_6_0= RULE_STRING )
                    // InternalTabletUIDSL.g:4152:3: lv_class_6_0= RULE_STRING
                    {
                    lv_class_6_0=(Token)match(input,RULE_STRING,FOLLOW_115); 

                    			newLeafNode(lv_class_6_0, grammarAccess.getKlimatrendAccess().getClassSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,104,FOLLOW_8); 

                	newLeafNode(otherlv_7, grammarAccess.getKlimatrendAccess().getRefperiodKeyword_6());
                
            // InternalTabletUIDSL.g:4172:1: ( (lv_refperiod_8_0= RULE_INT ) )
            // InternalTabletUIDSL.g:4173:1: (lv_refperiod_8_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:4173:1: (lv_refperiod_8_0= RULE_INT )
            // InternalTabletUIDSL.g:4174:3: lv_refperiod_8_0= RULE_INT
            {
            lv_refperiod_8_0=(Token)match(input,RULE_INT,FOLLOW_116); 

            			newLeafNode(lv_refperiod_8_0, grammarAccess.getKlimatrendAccess().getRefperiodINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKlimatrendRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"refperiod",
                    		lv_refperiod_8_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            // InternalTabletUIDSL.g:4190:2: (otherlv_9= 'stagnatingColor' ( (otherlv_10= RULE_ID ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==105) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalTabletUIDSL.g:4190:4: otherlv_9= 'stagnatingColor' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,105,FOLLOW_19); 

                        	newLeafNode(otherlv_9, grammarAccess.getKlimatrendAccess().getStagnatingColorKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:4194:1: ( (otherlv_10= RULE_ID ) )
                    // InternalTabletUIDSL.g:4195:1: (otherlv_10= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4195:1: (otherlv_10= RULE_ID )
                    // InternalTabletUIDSL.g:4196:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_117); 

                    		newLeafNode(otherlv_10, grammarAccess.getKlimatrendAccess().getStagnatingColorColorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4207:4: (otherlv_11= 'icon' ( (lv_icon_12_0= RULE_STRING ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==58) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalTabletUIDSL.g:4207:6: otherlv_11= 'icon' ( (lv_icon_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,58,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getKlimatrendAccess().getIconKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:4211:1: ( (lv_icon_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:4212:1: (lv_icon_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:4212:1: (lv_icon_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:4213:3: lv_icon_12_0= RULE_STRING
                    {
                    lv_icon_12_0=(Token)match(input,RULE_STRING,FOLLOW_118); 

                    			newLeafNode(lv_icon_12_0, grammarAccess.getKlimatrendAccess().getIconSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4229:4: (otherlv_13= 'risingColor' ( (otherlv_14= RULE_ID ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==106) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalTabletUIDSL.g:4229:6: otherlv_13= 'risingColor' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,106,FOLLOW_19); 

                        	newLeafNode(otherlv_13, grammarAccess.getKlimatrendAccess().getRisingColorKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:4233:1: ( (otherlv_14= RULE_ID ) )
                    // InternalTabletUIDSL.g:4234:1: (otherlv_14= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4234:1: (otherlv_14= RULE_ID )
                    // InternalTabletUIDSL.g:4235:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_119); 

                    		newLeafNode(otherlv_14, grammarAccess.getKlimatrendAccess().getRisingColorColorCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4246:4: (otherlv_15= 'fallingColor' ( (otherlv_16= RULE_ID ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==107) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalTabletUIDSL.g:4246:6: otherlv_15= 'fallingColor' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,107,FOLLOW_19); 

                        	newLeafNode(otherlv_15, grammarAccess.getKlimatrendAccess().getFallingColorKeyword_11_0());
                        
                    // InternalTabletUIDSL.g:4250:1: ( (otherlv_16= RULE_ID ) )
                    // InternalTabletUIDSL.g:4251:1: (otherlv_16= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4251:1: (otherlv_16= RULE_ID )
                    // InternalTabletUIDSL.g:4252:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_120); 

                    		newLeafNode(otherlv_16, grammarAccess.getKlimatrendAccess().getFallingColorColorCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4263:4: (otherlv_17= 'highmark' ( (lv_highmark_18_0= RULE_INT ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==108) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalTabletUIDSL.g:4263:6: otherlv_17= 'highmark' ( (lv_highmark_18_0= RULE_INT ) )
                    {
                    otherlv_17=(Token)match(input,108,FOLLOW_8); 

                        	newLeafNode(otherlv_17, grammarAccess.getKlimatrendAccess().getHighmarkKeyword_12_0());
                        
                    // InternalTabletUIDSL.g:4267:1: ( (lv_highmark_18_0= RULE_INT ) )
                    // InternalTabletUIDSL.g:4268:1: (lv_highmark_18_0= RULE_INT )
                    {
                    // InternalTabletUIDSL.g:4268:1: (lv_highmark_18_0= RULE_INT )
                    // InternalTabletUIDSL.g:4269:3: lv_highmark_18_0= RULE_INT
                    {
                    lv_highmark_18_0=(Token)match(input,RULE_INT,FOLLOW_121); 

                    			newLeafNode(lv_highmark_18_0, grammarAccess.getKlimatrendAccess().getHighmarkINTTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"highmark",
                            		lv_highmark_18_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4285:4: (otherlv_19= 'highmarkIcon' ( (lv_highmarkIcon_20_0= RULE_STRING ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==109) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalTabletUIDSL.g:4285:6: otherlv_19= 'highmarkIcon' ( (lv_highmarkIcon_20_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,109,FOLLOW_5); 

                        	newLeafNode(otherlv_19, grammarAccess.getKlimatrendAccess().getHighmarkIconKeyword_13_0());
                        
                    // InternalTabletUIDSL.g:4289:1: ( (lv_highmarkIcon_20_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:4290:1: (lv_highmarkIcon_20_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:4290:1: (lv_highmarkIcon_20_0= RULE_STRING )
                    // InternalTabletUIDSL.g:4291:3: lv_highmarkIcon_20_0= RULE_STRING
                    {
                    lv_highmarkIcon_20_0=(Token)match(input,RULE_STRING,FOLLOW_122); 

                    			newLeafNode(lv_highmarkIcon_20_0, grammarAccess.getKlimatrendAccess().getHighmarkIconSTRINGTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"highmarkIcon",
                            		lv_highmarkIcon_20_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4307:4: (otherlv_21= 'highmarkRisingColor' ( (otherlv_22= RULE_ID ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==110) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalTabletUIDSL.g:4307:6: otherlv_21= 'highmarkRisingColor' ( (otherlv_22= RULE_ID ) )
                    {
                    otherlv_21=(Token)match(input,110,FOLLOW_19); 

                        	newLeafNode(otherlv_21, grammarAccess.getKlimatrendAccess().getHighmarkRisingColorKeyword_14_0());
                        
                    // InternalTabletUIDSL.g:4311:1: ( (otherlv_22= RULE_ID ) )
                    // InternalTabletUIDSL.g:4312:1: (otherlv_22= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4312:1: (otherlv_22= RULE_ID )
                    // InternalTabletUIDSL.g:4313:3: otherlv_22= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                            
                    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_123); 

                    		newLeafNode(otherlv_22, grammarAccess.getKlimatrendAccess().getHighmarkRisingColorColorCrossReference_14_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4324:4: (otherlv_23= 'highmarkFallingColor' ( (otherlv_24= RULE_ID ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==111) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalTabletUIDSL.g:4324:6: otherlv_23= 'highmarkFallingColor' ( (otherlv_24= RULE_ID ) )
                    {
                    otherlv_23=(Token)match(input,111,FOLLOW_19); 

                        	newLeafNode(otherlv_23, grammarAccess.getKlimatrendAccess().getHighmarkFallingColorKeyword_15_0());
                        
                    // InternalTabletUIDSL.g:4328:1: ( (otherlv_24= RULE_ID ) )
                    // InternalTabletUIDSL.g:4329:1: (otherlv_24= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4329:1: (otherlv_24= RULE_ID )
                    // InternalTabletUIDSL.g:4330:3: otherlv_24= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getKlimatrendRule());
                    	        }
                            
                    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_40); 

                    		newLeafNode(otherlv_24, grammarAccess.getKlimatrendAccess().getHighmarkFallingColorColorCrossReference_15_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_25, grammarAccess.getKlimatrendAccess().getRightCurlyBracketKeyword_16());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKlimatrend"


    // $ANTLR start "entryRuleSymbol"
    // InternalTabletUIDSL.g:4353:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // InternalTabletUIDSL.g:4354:2: (iv_ruleSymbol= ruleSymbol EOF )
            // InternalTabletUIDSL.g:4355:2: iv_ruleSymbol= ruleSymbol EOF
            {
             newCompositeNode(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // InternalTabletUIDSL.g:4362:1: ruleSymbol returns [EObject current=null] : (otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )* )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-icon' ( (lv_bgicon_14_0= RULE_STRING ) ) )? (otherlv_15= 'off-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'icons' ( (lv_icons_18_0= RULE_STRING ) )* )? (otherlv_19= 'onColors' ( (otherlv_20= RULE_ID ) )* )? (otherlv_21= 'onBackgroundColors' ( (otherlv_22= RULE_ID ) )* )? otherlv_23= '}' ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_getOn_6_0=null;
        Token otherlv_7=null;
        Token lv_getWarn_8_0=null;
        Token otherlv_9=null;
        Token lv_getOff_10_0=null;
        Token otherlv_11=null;
        Token lv_class_12_0=null;
        Token otherlv_13=null;
        Token lv_bgicon_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_icons_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:4365:28: ( (otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )* )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-icon' ( (lv_bgicon_14_0= RULE_STRING ) ) )? (otherlv_15= 'off-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'icons' ( (lv_icons_18_0= RULE_STRING ) )* )? (otherlv_19= 'onColors' ( (otherlv_20= RULE_ID ) )* )? (otherlv_21= 'onBackgroundColors' ( (otherlv_22= RULE_ID ) )* )? otherlv_23= '}' ) )
            // InternalTabletUIDSL.g:4366:1: (otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )* )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-icon' ( (lv_bgicon_14_0= RULE_STRING ) ) )? (otherlv_15= 'off-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'icons' ( (lv_icons_18_0= RULE_STRING ) )* )? (otherlv_19= 'onColors' ( (otherlv_20= RULE_ID ) )* )? (otherlv_21= 'onBackgroundColors' ( (otherlv_22= RULE_ID ) )* )? otherlv_23= '}' )
            {
            // InternalTabletUIDSL.g:4366:1: (otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )* )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-icon' ( (lv_bgicon_14_0= RULE_STRING ) ) )? (otherlv_15= 'off-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'icons' ( (lv_icons_18_0= RULE_STRING ) )* )? (otherlv_19= 'onColors' ( (otherlv_20= RULE_ID ) )* )? (otherlv_21= 'onBackgroundColors' ( (otherlv_22= RULE_ID ) )* )? otherlv_23= '}' )
            // InternalTabletUIDSL.g:4366:3: otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )? (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )* )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-icon' ( (lv_bgicon_14_0= RULE_STRING ) ) )? (otherlv_15= 'off-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'icons' ( (lv_icons_18_0= RULE_STRING ) )* )? (otherlv_19= 'onColors' ( (otherlv_20= RULE_ID ) )* )? (otherlv_21= 'onBackgroundColors' ( (otherlv_22= RULE_ID ) )* )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getSymbolAccess().getSymbolKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getSymbolAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:4374:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4375:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4375:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:4376:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

            			newLeafNode(lv_device_2_0, grammarAccess.getSymbolAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getSymbolAccess().getGetKeyword_3());
                
            // InternalTabletUIDSL.g:4396:1: ( (lv_get_4_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4397:1: (lv_get_4_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4397:1: (lv_get_4_0= RULE_STRING )
            // InternalTabletUIDSL.g:4398:3: lv_get_4_0= RULE_STRING
            {
            lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_124); 

            			newLeafNode(lv_get_4_0, grammarAccess.getSymbolAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"get",
                    		lv_get_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,66,FOLLOW_125); 

                	newLeafNode(otherlv_5, grammarAccess.getSymbolAccess().getGetOnKeyword_5());
                
            // InternalTabletUIDSL.g:4418:1: ( (lv_getOn_6_0= RULE_STRING ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==RULE_STRING) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalTabletUIDSL.g:4419:1: (lv_getOn_6_0= RULE_STRING )
            	    {
            	    // InternalTabletUIDSL.g:4419:1: (lv_getOn_6_0= RULE_STRING )
            	    // InternalTabletUIDSL.g:4420:3: lv_getOn_6_0= RULE_STRING
            	    {
            	    lv_getOn_6_0=(Token)match(input,RULE_STRING,FOLLOW_125); 

            	    			newLeafNode(lv_getOn_6_0, grammarAccess.getSymbolAccess().getGetOnSTRINGTerminalRuleCall_6_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSymbolRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"getOn",
            	            		lv_getOn_6_0, 
            	            		"org.eclipse.xtext.common.Terminals.STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);

            // InternalTabletUIDSL.g:4436:3: (otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==98) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalTabletUIDSL.g:4436:5: otherlv_7= 'getWarn' ( (lv_getWarn_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,98,FOLLOW_5); 

                        	newLeafNode(otherlv_7, grammarAccess.getSymbolAccess().getGetWarnKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:4440:1: ( (lv_getWarn_8_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:4441:1: (lv_getWarn_8_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:4441:1: (lv_getWarn_8_0= RULE_STRING )
                    // InternalTabletUIDSL.g:4442:3: lv_getWarn_8_0= RULE_STRING
                    {
                    lv_getWarn_8_0=(Token)match(input,RULE_STRING,FOLLOW_126); 

                    			newLeafNode(lv_getWarn_8_0, grammarAccess.getSymbolAccess().getGetWarnSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"getWarn",
                            		lv_getWarn_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4458:4: (otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==68) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalTabletUIDSL.g:4458:6: otherlv_9= 'getOff' ( (lv_getOff_10_0= RULE_STRING ) )*
                    {
                    otherlv_9=(Token)match(input,68,FOLLOW_127); 

                        	newLeafNode(otherlv_9, grammarAccess.getSymbolAccess().getGetOffKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:4462:1: ( (lv_getOff_10_0= RULE_STRING ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==RULE_STRING) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalTabletUIDSL.g:4463:1: (lv_getOff_10_0= RULE_STRING )
                    	    {
                    	    // InternalTabletUIDSL.g:4463:1: (lv_getOff_10_0= RULE_STRING )
                    	    // InternalTabletUIDSL.g:4464:3: lv_getOff_10_0= RULE_STRING
                    	    {
                    	    lv_getOff_10_0=(Token)match(input,RULE_STRING,FOLLOW_127); 

                    	    			newLeafNode(lv_getOff_10_0, grammarAccess.getSymbolAccess().getGetOffSTRINGTerminalRuleCall_8_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"getOff",
                    	            		lv_getOff_10_0, 
                    	            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4480:5: (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==33) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalTabletUIDSL.g:4480:7: otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getSymbolAccess().getClassKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:4484:1: ( (lv_class_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:4485:1: (lv_class_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:4485:1: (lv_class_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:4486:3: lv_class_12_0= RULE_STRING
                    {
                    lv_class_12_0=(Token)match(input,RULE_STRING,FOLLOW_128); 

                    			newLeafNode(lv_class_12_0, grammarAccess.getSymbolAccess().getClassSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4502:4: (otherlv_13= 'background-icon' ( (lv_bgicon_14_0= RULE_STRING ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==59) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalTabletUIDSL.g:4502:6: otherlv_13= 'background-icon' ( (lv_bgicon_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,59,FOLLOW_5); 

                        	newLeafNode(otherlv_13, grammarAccess.getSymbolAccess().getBackgroundIconKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:4506:1: ( (lv_bgicon_14_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:4507:1: (lv_bgicon_14_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:4507:1: (lv_bgicon_14_0= RULE_STRING )
                    // InternalTabletUIDSL.g:4508:3: lv_bgicon_14_0= RULE_STRING
                    {
                    lv_bgicon_14_0=(Token)match(input,RULE_STRING,FOLLOW_129); 

                    			newLeafNode(lv_bgicon_14_0, grammarAccess.getSymbolAccess().getBgiconSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bgicon",
                            		lv_bgicon_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4524:4: (otherlv_15= 'off-color' ( (otherlv_16= RULE_ID ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==101) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalTabletUIDSL.g:4524:6: otherlv_15= 'off-color' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,101,FOLLOW_19); 

                        	newLeafNode(otherlv_15, grammarAccess.getSymbolAccess().getOffColorKeyword_11_0());
                        
                    // InternalTabletUIDSL.g:4528:1: ( (otherlv_16= RULE_ID ) )
                    // InternalTabletUIDSL.g:4529:1: (otherlv_16= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4529:1: (otherlv_16= RULE_ID )
                    // InternalTabletUIDSL.g:4530:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_130); 

                    		newLeafNode(otherlv_16, grammarAccess.getSymbolAccess().getOffColorColorCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4541:4: (otherlv_17= 'icons' ( (lv_icons_18_0= RULE_STRING ) )* )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==113) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalTabletUIDSL.g:4541:6: otherlv_17= 'icons' ( (lv_icons_18_0= RULE_STRING ) )*
                    {
                    otherlv_17=(Token)match(input,113,FOLLOW_131); 

                        	newLeafNode(otherlv_17, grammarAccess.getSymbolAccess().getIconsKeyword_12_0());
                        
                    // InternalTabletUIDSL.g:4545:1: ( (lv_icons_18_0= RULE_STRING ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==RULE_STRING) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalTabletUIDSL.g:4546:1: (lv_icons_18_0= RULE_STRING )
                    	    {
                    	    // InternalTabletUIDSL.g:4546:1: (lv_icons_18_0= RULE_STRING )
                    	    // InternalTabletUIDSL.g:4547:3: lv_icons_18_0= RULE_STRING
                    	    {
                    	    lv_icons_18_0=(Token)match(input,RULE_STRING,FOLLOW_131); 

                    	    			newLeafNode(lv_icons_18_0, grammarAccess.getSymbolAccess().getIconsSTRINGTerminalRuleCall_12_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"icons",
                    	            		lv_icons_18_0, 
                    	            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4563:5: (otherlv_19= 'onColors' ( (otherlv_20= RULE_ID ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==114) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalTabletUIDSL.g:4563:7: otherlv_19= 'onColors' ( (otherlv_20= RULE_ID ) )*
                    {
                    otherlv_19=(Token)match(input,114,FOLLOW_132); 

                        	newLeafNode(otherlv_19, grammarAccess.getSymbolAccess().getOnColorsKeyword_13_0());
                        
                    // InternalTabletUIDSL.g:4567:1: ( (otherlv_20= RULE_ID ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==RULE_ID) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalTabletUIDSL.g:4568:1: (otherlv_20= RULE_ID )
                    	    {
                    	    // InternalTabletUIDSL.g:4568:1: (otherlv_20= RULE_ID )
                    	    // InternalTabletUIDSL.g:4569:3: otherlv_20= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	    	        }
                    	            
                    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_132); 

                    	    		newLeafNode(otherlv_20, grammarAccess.getSymbolAccess().getOnColorsColorCrossReference_13_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4580:5: (otherlv_21= 'onBackgroundColors' ( (otherlv_22= RULE_ID ) )* )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==115) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalTabletUIDSL.g:4580:7: otherlv_21= 'onBackgroundColors' ( (otherlv_22= RULE_ID ) )*
                    {
                    otherlv_21=(Token)match(input,115,FOLLOW_133); 

                        	newLeafNode(otherlv_21, grammarAccess.getSymbolAccess().getOnBackgroundColorsKeyword_14_0());
                        
                    // InternalTabletUIDSL.g:4584:1: ( (otherlv_22= RULE_ID ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==RULE_ID) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalTabletUIDSL.g:4585:1: (otherlv_22= RULE_ID )
                    	    {
                    	    // InternalTabletUIDSL.g:4585:1: (otherlv_22= RULE_ID )
                    	    // InternalTabletUIDSL.g:4586:3: otherlv_22= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	    	        }
                    	            
                    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_133); 

                    	    		newLeafNode(otherlv_22, grammarAccess.getSymbolAccess().getOnBackgroundColorsColorCrossReference_14_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_23=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_23, grammarAccess.getSymbolAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleSimpleClock"
    // InternalTabletUIDSL.g:4609:1: entryRuleSimpleClock returns [EObject current=null] : iv_ruleSimpleClock= ruleSimpleClock EOF ;
    public final EObject entryRuleSimpleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleClock = null;


        try {
            // InternalTabletUIDSL.g:4610:2: (iv_ruleSimpleClock= ruleSimpleClock EOF )
            // InternalTabletUIDSL.g:4611:2: iv_ruleSimpleClock= ruleSimpleClock EOF
            {
             newCompositeNode(grammarAccess.getSimpleClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleClock=ruleSimpleClock();

            state._fsp--;

             current =iv_ruleSimpleClock; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleClock"


    // $ANTLR start "ruleSimpleClock"
    // InternalTabletUIDSL.g:4618:1: ruleSimpleClock returns [EObject current=null] : (otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' ) ;
    public final EObject ruleSimpleClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_dateFormat_4_0=null;
        Token otherlv_5=null;
        Token lv_timeFormat_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_class_12_0=null;
        Token otherlv_13=null;
        Token lv_style_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:4621:28: ( (otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' ) )
            // InternalTabletUIDSL.g:4622:1: (otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' )
            {
            // InternalTabletUIDSL.g:4622:1: (otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' )
            // InternalTabletUIDSL.g:4622:3: otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,116,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleClockAccess().getSimpleClockKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_134); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleClockAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:4630:1: ( (lv_id_2_0= RULE_ID ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==RULE_ID) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalTabletUIDSL.g:4631:1: (lv_id_2_0= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4631:1: (lv_id_2_0= RULE_ID )
                    // InternalTabletUIDSL.g:4632:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_135); 

                    			newLeafNode(lv_id_2_0, grammarAccess.getSimpleClockAccess().getIdIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_2_0, 
                            		"org.eclipse.xtext.common.Terminals.ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,117,FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleClockAccess().getDateFormatKeyword_3());
                
            // InternalTabletUIDSL.g:4652:1: ( (lv_dateFormat_4_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4653:1: (lv_dateFormat_4_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4653:1: (lv_dateFormat_4_0= RULE_STRING )
            // InternalTabletUIDSL.g:4654:3: lv_dateFormat_4_0= RULE_STRING
            {
            lv_dateFormat_4_0=(Token)match(input,RULE_STRING,FOLLOW_136); 

            			newLeafNode(lv_dateFormat_4_0, grammarAccess.getSimpleClockAccess().getDateFormatSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleClockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dateFormat",
                    		lv_dateFormat_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,118,FOLLOW_5); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleClockAccess().getTimeFormatKeyword_5());
                
            // InternalTabletUIDSL.g:4674:1: ( (lv_timeFormat_6_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4675:1: (lv_timeFormat_6_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4675:1: (lv_timeFormat_6_0= RULE_STRING )
            // InternalTabletUIDSL.g:4676:3: lv_timeFormat_6_0= RULE_STRING
            {
            lv_timeFormat_6_0=(Token)match(input,RULE_STRING,FOLLOW_137); 

            			newLeafNode(lv_timeFormat_6_0, grammarAccess.getSimpleClockAccess().getTimeFormatSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleClockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timeFormat",
                    		lv_timeFormat_6_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:4692:2: (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==119) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalTabletUIDSL.g:4692:4: otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,119,FOLLOW_19); 

                        	newLeafNode(otherlv_7, grammarAccess.getSimpleClockAccess().getDateColorKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:4696:1: ( (otherlv_8= RULE_ID ) )
                    // InternalTabletUIDSL.g:4697:1: (otherlv_8= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4697:1: (otherlv_8= RULE_ID )
                    // InternalTabletUIDSL.g:4698:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_138); 

                    		newLeafNode(otherlv_8, grammarAccess.getSimpleClockAccess().getDateColorColorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4709:4: (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==120) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalTabletUIDSL.g:4709:6: otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,120,FOLLOW_19); 

                        	newLeafNode(otherlv_9, grammarAccess.getSimpleClockAccess().getTimeColorKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:4713:1: ( (otherlv_10= RULE_ID ) )
                    // InternalTabletUIDSL.g:4714:1: (otherlv_10= RULE_ID )
                    {
                    // InternalTabletUIDSL.g:4714:1: (otherlv_10= RULE_ID )
                    // InternalTabletUIDSL.g:4715:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_139); 

                    		newLeafNode(otherlv_10, grammarAccess.getSimpleClockAccess().getTimeColorColorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4726:4: (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==33) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalTabletUIDSL.g:4726:6: otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getSimpleClockAccess().getClassKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:4730:1: ( (lv_class_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:4731:1: (lv_class_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:4731:1: (lv_class_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:4732:3: lv_class_12_0= RULE_STRING
                    {
                    lv_class_12_0=(Token)match(input,RULE_STRING,FOLLOW_140); 

                    			newLeafNode(lv_class_12_0, grammarAccess.getSimpleClockAccess().getClassSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4748:4: (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==34) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalTabletUIDSL.g:4748:6: otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_5); 

                        	newLeafNode(otherlv_13, grammarAccess.getSimpleClockAccess().getStyleKeyword_10_0());
                        
                    // InternalTabletUIDSL.g:4752:1: ( (lv_style_14_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:4753:1: (lv_style_14_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:4753:1: (lv_style_14_0= RULE_STRING )
                    // InternalTabletUIDSL.g:4754:3: lv_style_14_0= RULE_STRING
                    {
                    lv_style_14_0=(Token)match(input,RULE_STRING,FOLLOW_141); 

                    			newLeafNode(lv_style_14_0, grammarAccess.getSimpleClockAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:4770:4: (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==121) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // InternalTabletUIDSL.g:4770:6: otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) )
            	    {
            	    otherlv_15=(Token)match(input,121,FOLLOW_19); 

            	        	newLeafNode(otherlv_15, grammarAccess.getSimpleClockAccess().getBgColorsKeyword_11_0());
            	        
            	    // InternalTabletUIDSL.g:4774:1: ( (otherlv_16= RULE_ID ) )
            	    // InternalTabletUIDSL.g:4775:1: (otherlv_16= RULE_ID )
            	    {
            	    // InternalTabletUIDSL.g:4775:1: (otherlv_16= RULE_ID )
            	    // InternalTabletUIDSL.g:4776:3: otherlv_16= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSimpleClockRule());
            	    	        }
            	            
            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_141); 

            	    		newLeafNode(otherlv_16, grammarAccess.getSimpleClockAccess().getBgColorsColorCrossReference_11_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            otherlv_17=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_17, grammarAccess.getSimpleClockAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleClock"


    // $ANTLR start "entryRuleSimpleChart"
    // InternalTabletUIDSL.g:4799:1: entryRuleSimpleChart returns [EObject current=null] : iv_ruleSimpleChart= ruleSimpleChart EOF ;
    public final EObject entryRuleSimpleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleChart = null;


        try {
            // InternalTabletUIDSL.g:4800:2: (iv_ruleSimpleChart= ruleSimpleChart EOF )
            // InternalTabletUIDSL.g:4801:2: iv_ruleSimpleChart= ruleSimpleChart EOF
            {
             newCompositeNode(grammarAccess.getSimpleChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleChart=ruleSimpleChart();

            state._fsp--;

             current =iv_ruleSimpleChart; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleChart"


    // $ANTLR start "ruleSimpleChart"
    // InternalTabletUIDSL.g:4808:1: ruleSimpleChart returns [EObject current=null] : (otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}' ) ;
    public final EObject ruleSimpleChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_log_device_4_0=null;
        Token lv_logfile_5_0=null;
        Token otherlv_6=null;
        Token lv_columnSpec_7_0=null;
        Token otherlv_8=null;
        Token lv_min_9_0=null;
        Token otherlv_10=null;
        Token lv_max_11_0=null;
        Token otherlv_12=null;
        Token lv_xTicks_13_0=null;
        Token otherlv_14=null;
        Token lv_yTicks_15_0=null;
        Token otherlv_16=null;
        Token lv_daysago_17_0=null;
        Token otherlv_18=null;
        Token lv_class_19_0=null;
        Token otherlv_20=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:4811:28: ( (otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}' ) )
            // InternalTabletUIDSL.g:4812:1: (otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}' )
            {
            // InternalTabletUIDSL.g:4812:1: (otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}' )
            // InternalTabletUIDSL.g:4812:3: otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,122,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleChartAccess().getSimpleChartKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleChartAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:4820:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4821:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4821:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:4822:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_142); 

            			newLeafNode(lv_device_2_0, grammarAccess.getSimpleChartAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,123,FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleChartAccess().getLogConfigKeyword_3());
                
            // InternalTabletUIDSL.g:4842:1: ( (lv_log_device_4_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4843:1: (lv_log_device_4_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4843:1: (lv_log_device_4_0= RULE_STRING )
            // InternalTabletUIDSL.g:4844:3: lv_log_device_4_0= RULE_STRING
            {
            lv_log_device_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			newLeafNode(lv_log_device_4_0, grammarAccess.getSimpleChartAccess().getLog_deviceSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"log_device",
                    		lv_log_device_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:4860:2: ( (lv_logfile_5_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4861:1: (lv_logfile_5_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4861:1: (lv_logfile_5_0= RULE_STRING )
            // InternalTabletUIDSL.g:4862:3: lv_logfile_5_0= RULE_STRING
            {
            lv_logfile_5_0=(Token)match(input,RULE_STRING,FOLLOW_143); 

            			newLeafNode(lv_logfile_5_0, grammarAccess.getSimpleChartAccess().getLogfileSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"logfile",
                    		lv_logfile_5_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,124,FOLLOW_5); 

                	newLeafNode(otherlv_6, grammarAccess.getSimpleChartAccess().getColumnSpecKeyword_6());
                
            // InternalTabletUIDSL.g:4882:1: ( (lv_columnSpec_7_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4883:1: (lv_columnSpec_7_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4883:1: (lv_columnSpec_7_0= RULE_STRING )
            // InternalTabletUIDSL.g:4884:3: lv_columnSpec_7_0= RULE_STRING
            {
            lv_columnSpec_7_0=(Token)match(input,RULE_STRING,FOLLOW_144); 

            			newLeafNode(lv_columnSpec_7_0, grammarAccess.getSimpleChartAccess().getColumnSpecSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"columnSpec",
                    		lv_columnSpec_7_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,125,FOLLOW_5); 

                	newLeafNode(otherlv_8, grammarAccess.getSimpleChartAccess().getMinValueKeyword_8());
                
            // InternalTabletUIDSL.g:4904:1: ( (lv_min_9_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4905:1: (lv_min_9_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4905:1: (lv_min_9_0= RULE_STRING )
            // InternalTabletUIDSL.g:4906:3: lv_min_9_0= RULE_STRING
            {
            lv_min_9_0=(Token)match(input,RULE_STRING,FOLLOW_145); 

            			newLeafNode(lv_min_9_0, grammarAccess.getSimpleChartAccess().getMinSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"min",
                    		lv_min_9_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_10=(Token)match(input,126,FOLLOW_5); 

                	newLeafNode(otherlv_10, grammarAccess.getSimpleChartAccess().getMaxValueKeyword_10());
                
            // InternalTabletUIDSL.g:4926:1: ( (lv_max_11_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:4927:1: (lv_max_11_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:4927:1: (lv_max_11_0= RULE_STRING )
            // InternalTabletUIDSL.g:4928:3: lv_max_11_0= RULE_STRING
            {
            lv_max_11_0=(Token)match(input,RULE_STRING,FOLLOW_146); 

            			newLeafNode(lv_max_11_0, grammarAccess.getSimpleChartAccess().getMaxSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"max",
                    		lv_max_11_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,127,FOLLOW_8); 

                	newLeafNode(otherlv_12, grammarAccess.getSimpleChartAccess().getXTicksKeyword_12());
                
            // InternalTabletUIDSL.g:4948:1: ( (lv_xTicks_13_0= RULE_INT ) )
            // InternalTabletUIDSL.g:4949:1: (lv_xTicks_13_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:4949:1: (lv_xTicks_13_0= RULE_INT )
            // InternalTabletUIDSL.g:4950:3: lv_xTicks_13_0= RULE_INT
            {
            lv_xTicks_13_0=(Token)match(input,RULE_INT,FOLLOW_147); 

            			newLeafNode(lv_xTicks_13_0, grammarAccess.getSimpleChartAccess().getXTicksINTTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"xTicks",
                    		lv_xTicks_13_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_14=(Token)match(input,128,FOLLOW_8); 

                	newLeafNode(otherlv_14, grammarAccess.getSimpleChartAccess().getYTicksKeyword_14());
                
            // InternalTabletUIDSL.g:4970:1: ( (lv_yTicks_15_0= RULE_INT ) )
            // InternalTabletUIDSL.g:4971:1: (lv_yTicks_15_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:4971:1: (lv_yTicks_15_0= RULE_INT )
            // InternalTabletUIDSL.g:4972:3: lv_yTicks_15_0= RULE_INT
            {
            lv_yTicks_15_0=(Token)match(input,RULE_INT,FOLLOW_148); 

            			newLeafNode(lv_yTicks_15_0, grammarAccess.getSimpleChartAccess().getYTicksINTTerminalRuleCall_15_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"yTicks",
                    		lv_yTicks_15_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_16=(Token)match(input,129,FOLLOW_8); 

                	newLeafNode(otherlv_16, grammarAccess.getSimpleChartAccess().getDaysagoKeyword_16());
                
            // InternalTabletUIDSL.g:4992:1: ( (lv_daysago_17_0= RULE_INT ) )
            // InternalTabletUIDSL.g:4993:1: (lv_daysago_17_0= RULE_INT )
            {
            // InternalTabletUIDSL.g:4993:1: (lv_daysago_17_0= RULE_INT )
            // InternalTabletUIDSL.g:4994:3: lv_daysago_17_0= RULE_INT
            {
            lv_daysago_17_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            			newLeafNode(lv_daysago_17_0, grammarAccess.getSimpleChartAccess().getDaysagoINTTerminalRuleCall_17_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"daysago",
                    		lv_daysago_17_0, 
                    		"org.eclipse.xtext.common.Terminals.INT");
            	    

            }


            }

            otherlv_18=(Token)match(input,33,FOLLOW_5); 

                	newLeafNode(otherlv_18, grammarAccess.getSimpleChartAccess().getClassKeyword_18());
                
            // InternalTabletUIDSL.g:5014:1: ( (lv_class_19_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:5015:1: (lv_class_19_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:5015:1: (lv_class_19_0= RULE_STRING )
            // InternalTabletUIDSL.g:5016:3: lv_class_19_0= RULE_STRING
            {
            lv_class_19_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            			newLeafNode(lv_class_19_0, grammarAccess.getSimpleChartAccess().getClassSTRINGTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_19_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_20=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_20, grammarAccess.getSimpleChartAccess().getRightCurlyBracketKeyword_20());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleChart"


    // $ANTLR start "entryRuleColor"
    // InternalTabletUIDSL.g:5044:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalTabletUIDSL.g:5045:2: (iv_ruleColor= ruleColor EOF )
            // InternalTabletUIDSL.g:5046:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalTabletUIDSL.g:5053:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_rgb_2_0=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:5056:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) ) ) )
            // InternalTabletUIDSL.g:5057:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) ) )
            {
            // InternalTabletUIDSL.g:5057:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) ) )
            // InternalTabletUIDSL.g:5057:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,92,FOLLOW_19); 

                	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
                
            // InternalTabletUIDSL.g:5061:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalTabletUIDSL.g:5062:1: (lv_name_1_0= RULE_ID )
            {
            // InternalTabletUIDSL.g:5062:1: (lv_name_1_0= RULE_ID )
            // InternalTabletUIDSL.g:5063:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalTabletUIDSL.g:5079:2: ( (lv_rgb_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:5080:1: (lv_rgb_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:5080:1: (lv_rgb_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:5081:3: lv_rgb_2_0= RULE_STRING
            {
            lv_rgb_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_rgb_2_0, grammarAccess.getColorAccess().getRgbSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rgb",
                    		lv_rgb_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleLabel"
    // InternalTabletUIDSL.g:5105:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalTabletUIDSL.g:5106:2: (iv_ruleLabel= ruleLabel EOF )
            // InternalTabletUIDSL.g:5107:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalTabletUIDSL.g:5114:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'style' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= RULE_STRING ) ) )? (otherlv_11= 'part' ( (lv_part_12_0= RULE_STRING ) ) )? (otherlv_13= 'substitution' ( (lv_substitution_14_0= RULE_STRING ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_device_2_0=null;
        Token otherlv_3=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token lv_class_6_0=null;
        Token otherlv_7=null;
        Token lv_style_8_0=null;
        Token otherlv_9=null;
        Token lv_unit_10_0=null;
        Token otherlv_11=null;
        Token lv_part_12_0=null;
        Token otherlv_13=null;
        Token lv_substitution_14_0=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // InternalTabletUIDSL.g:5117:28: ( (otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'style' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= RULE_STRING ) ) )? (otherlv_11= 'part' ( (lv_part_12_0= RULE_STRING ) ) )? (otherlv_13= 'substitution' ( (lv_substitution_14_0= RULE_STRING ) ) )? otherlv_15= '}' ) )
            // InternalTabletUIDSL.g:5118:1: (otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'style' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= RULE_STRING ) ) )? (otherlv_11= 'part' ( (lv_part_12_0= RULE_STRING ) ) )? (otherlv_13= 'substitution' ( (lv_substitution_14_0= RULE_STRING ) ) )? otherlv_15= '}' )
            {
            // InternalTabletUIDSL.g:5118:1: (otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'style' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= RULE_STRING ) ) )? (otherlv_11= 'part' ( (lv_part_12_0= RULE_STRING ) ) )? (otherlv_13= 'substitution' ( (lv_substitution_14_0= RULE_STRING ) ) )? otherlv_15= '}' )
            // InternalTabletUIDSL.g:5118:3: otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )? (otherlv_7= 'style' ( (lv_style_8_0= RULE_STRING ) ) )? (otherlv_9= 'unit' ( (lv_unit_10_0= RULE_STRING ) ) )? (otherlv_11= 'part' ( (lv_part_12_0= RULE_STRING ) ) )? (otherlv_13= 'substitution' ( (lv_substitution_14_0= RULE_STRING ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_17); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalTabletUIDSL.g:5126:1: ( (lv_device_2_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:5127:1: (lv_device_2_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:5127:1: (lv_device_2_0= RULE_STRING )
            // InternalTabletUIDSL.g:5128:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

            			newLeafNode(lv_device_2_0, grammarAccess.getLabelAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,51,FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getGetKeyword_3());
                
            // InternalTabletUIDSL.g:5148:1: ( (lv_get_4_0= RULE_STRING ) )
            // InternalTabletUIDSL.g:5149:1: (lv_get_4_0= RULE_STRING )
            {
            // InternalTabletUIDSL.g:5149:1: (lv_get_4_0= RULE_STRING )
            // InternalTabletUIDSL.g:5150:3: lv_get_4_0= RULE_STRING
            {
            lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_149); 

            			newLeafNode(lv_get_4_0, grammarAccess.getLabelAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"get",
                    		lv_get_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalTabletUIDSL.g:5166:2: (otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==33) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalTabletUIDSL.g:5166:4: otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_5); 

                        	newLeafNode(otherlv_5, grammarAccess.getLabelAccess().getClassKeyword_5_0());
                        
                    // InternalTabletUIDSL.g:5170:1: ( (lv_class_6_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:5171:1: (lv_class_6_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:5171:1: (lv_class_6_0= RULE_STRING )
                    // InternalTabletUIDSL.g:5172:3: lv_class_6_0= RULE_STRING
                    {
                    lv_class_6_0=(Token)match(input,RULE_STRING,FOLLOW_150); 

                    			newLeafNode(lv_class_6_0, grammarAccess.getLabelAccess().getClassSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_6_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:5188:4: (otherlv_7= 'style' ( (lv_style_8_0= RULE_STRING ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==34) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalTabletUIDSL.g:5188:6: otherlv_7= 'style' ( (lv_style_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_5); 

                        	newLeafNode(otherlv_7, grammarAccess.getLabelAccess().getStyleKeyword_6_0());
                        
                    // InternalTabletUIDSL.g:5192:1: ( (lv_style_8_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:5193:1: (lv_style_8_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:5193:1: (lv_style_8_0= RULE_STRING )
                    // InternalTabletUIDSL.g:5194:3: lv_style_8_0= RULE_STRING
                    {
                    lv_style_8_0=(Token)match(input,RULE_STRING,FOLLOW_151); 

                    			newLeafNode(lv_style_8_0, grammarAccess.getLabelAccess().getStyleSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_8_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:5210:4: (otherlv_9= 'unit' ( (lv_unit_10_0= RULE_STRING ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==130) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalTabletUIDSL.g:5210:6: otherlv_9= 'unit' ( (lv_unit_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,130,FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getLabelAccess().getUnitKeyword_7_0());
                        
                    // InternalTabletUIDSL.g:5214:1: ( (lv_unit_10_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:5215:1: (lv_unit_10_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:5215:1: (lv_unit_10_0= RULE_STRING )
                    // InternalTabletUIDSL.g:5216:3: lv_unit_10_0= RULE_STRING
                    {
                    lv_unit_10_0=(Token)match(input,RULE_STRING,FOLLOW_152); 

                    			newLeafNode(lv_unit_10_0, grammarAccess.getLabelAccess().getUnitSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"unit",
                            		lv_unit_10_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:5232:4: (otherlv_11= 'part' ( (lv_part_12_0= RULE_STRING ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==131) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalTabletUIDSL.g:5232:6: otherlv_11= 'part' ( (lv_part_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,131,FOLLOW_5); 

                        	newLeafNode(otherlv_11, grammarAccess.getLabelAccess().getPartKeyword_8_0());
                        
                    // InternalTabletUIDSL.g:5236:1: ( (lv_part_12_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:5237:1: (lv_part_12_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:5237:1: (lv_part_12_0= RULE_STRING )
                    // InternalTabletUIDSL.g:5238:3: lv_part_12_0= RULE_STRING
                    {
                    lv_part_12_0=(Token)match(input,RULE_STRING,FOLLOW_153); 

                    			newLeafNode(lv_part_12_0, grammarAccess.getLabelAccess().getPartSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"part",
                            		lv_part_12_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalTabletUIDSL.g:5254:4: (otherlv_13= 'substitution' ( (lv_substitution_14_0= RULE_STRING ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==132) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalTabletUIDSL.g:5254:6: otherlv_13= 'substitution' ( (lv_substitution_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,132,FOLLOW_5); 

                        	newLeafNode(otherlv_13, grammarAccess.getLabelAccess().getSubstitutionKeyword_9_0());
                        
                    // InternalTabletUIDSL.g:5258:1: ( (lv_substitution_14_0= RULE_STRING ) )
                    // InternalTabletUIDSL.g:5259:1: (lv_substitution_14_0= RULE_STRING )
                    {
                    // InternalTabletUIDSL.g:5259:1: (lv_substitution_14_0= RULE_STRING )
                    // InternalTabletUIDSL.g:5260:3: lv_substitution_14_0= RULE_STRING
                    {
                    lv_substitution_14_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    			newLeafNode(lv_substitution_14_0, grammarAccess.getLabelAccess().getSubstitutionSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"substitution",
                            		lv_substitution_14_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,26,FOLLOW_2); 

                	newLeafNode(otherlv_15, grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L,0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8120340804000000L,0x0411008248241702L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8120340F84200000L,0x0411008258241702L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8120340F04200000L,0x0411008258241702L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8120340E04200000L,0x0411008258241702L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8120340C04200000L,0x0411008258241702L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x8120340804200000L,0x0411008258241702L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000003E404000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000003E004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000003C004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000038004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000030004000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080204000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000204000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x001FC00204000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x001F800204000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x001F000204000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x001E000204000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x001C000204000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0018000204000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000204000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00C2000204000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00C0000204000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000204000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0610000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0610000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x7802000204000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x7002000204000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x7000000204000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x6000000204000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x4000000204000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000000004000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0C08000204000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0C00000204000000L,0x00000000000000FCL});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0C00000204000000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0C00000204000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0C00000204000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0C00000004000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0C00000004000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0C00000004000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0C00000004000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0400000004000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x8120340E04000000L,0x0411008248241702L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x8120340C04000000L,0x0411008248241702L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000604000010L,0x0000000000000801L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000604000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000604000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0008000204000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000204000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000004000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000004000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000004000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000004000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x000000000000C000L,0x0000000000400000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000008000L,0x0000000000400000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x8120340814000000L,0x041100824FA41702L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x8120340814000000L,0x041100824F241702L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x8120340814000000L,0x041100824E241702L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x8120340814000000L,0x041100824C241702L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x8120340814000000L,0x0411008248241702L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x040000020000C000L,0x0000000030000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0400000200008000L,0x0000000030000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0400000200000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0400000200000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0400000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x4008000000000010L,0x0000000580000014L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0800000200000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000004000000L,0x0000007800000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000004000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000004000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000004000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000200000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0400000004000000L,0x0000FE0000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0400000004000000L,0x0000FC0000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000004000000L,0x0000FC0000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000004000000L,0x0000F80000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000004000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000004000000L,0x0000E00000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000004000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000004000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0800000204000010L,0x000E002400000010L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0800000204000000L,0x000E002000000010L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0800000204000010L,0x000E002000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0800000004000000L,0x000E002000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000004000000L,0x000E002000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000004000000L,0x000E000000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000004000010L,0x000C000000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000004000040L,0x0008000000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000040L,0x0020000000000000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000604000000L,0x0380000000000000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000604000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000604000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000404000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000004000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000604000000L,0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000404000000L,0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000010L});

}