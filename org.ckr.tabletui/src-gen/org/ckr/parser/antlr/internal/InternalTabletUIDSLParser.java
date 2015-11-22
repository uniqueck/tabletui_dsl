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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'settings'", "'title'", "'fhemweb_url'", "'width'", "'height'", "'columns'", "'rows'", "'debug'", "'drag&drop'", "'gridster_margin'", "'css'", "'true'", "'false'", "'{'", "'}'", "'header'", "'row'", "'column'", "'colspan'", "'rowspan'", "'switch'", "'get'", "'getOn'", "'getOff'", "'class'", "'onColor'", "'offColor'", "'background-on-color'", "'background-icon'", "'icon'", "'div'", "'calview'", "'max'", "'all-forecast-color'", "'all-today-color'", "'button'", "'url'", "'color'", "'background-color'", "'symbol'", "'on-color'", "'off-color'", "'icons'", "'['", "']'", "'onColors'", "'onBackgroundColors'", "'SimpleClock'", "'date-format'", "'time-format'", "'date-color'", "'time-color'", "'style'", "'bg-colors'", "'simpleChart'", "'log-config'", "'columnSpec'", "'minValue'", "'maxValue'", "'xTicks'", "'yTicks'", "'daysago'", "'label'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalTabletUIDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTabletUIDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTabletUIDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g"; }



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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:67:1: entryRuleTabletUI returns [EObject current=null] : iv_ruleTabletUI= ruleTabletUI EOF ;
    public final EObject entryRuleTabletUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabletUI = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:68:2: (iv_ruleTabletUI= ruleTabletUI EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:69:2: iv_ruleTabletUI= ruleTabletUI EOF
            {
             newCompositeNode(grammarAccess.getTabletUIRule()); 
            pushFollow(FOLLOW_ruleTabletUI_in_entryRuleTabletUI75);
            iv_ruleTabletUI=ruleTabletUI();

            state._fsp--;

             current =iv_ruleTabletUI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabletUI85); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:76:1: ruleTabletUI returns [EObject current=null] : ( ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleTabletUI() throws RecognitionException {
        EObject current = null;

        EObject lv_settings_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:79:28: ( ( ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:80:1: ( ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:80:1: ( ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:80:2: ( (lv_settings_0_0= ruleSettings ) ) ( (lv_elements_1_0= ruleAbstractElement ) )*
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:80:2: ( (lv_settings_0_0= ruleSettings ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:81:1: (lv_settings_0_0= ruleSettings )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:81:1: (lv_settings_0_0= ruleSettings )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:82:3: lv_settings_0_0= ruleSettings
            {
             
            	        newCompositeNode(grammarAccess.getTabletUIAccess().getSettingsSettingsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSettings_in_ruleTabletUI131);
            lv_settings_0_0=ruleSettings();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTabletUIRule());
            	        }
                   		set(
                   			current, 
                   			"settings",
                    		lv_settings_0_0, 
                    		"Settings");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:98:2: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:99:1: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:99:1: (lv_elements_1_0= ruleAbstractElement )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:100:3: lv_elements_1_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTabletUIAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleTabletUI152);
            	    lv_elements_1_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTabletUIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"AbstractElement");
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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:124:1: entryRuleSettings returns [EObject current=null] : iv_ruleSettings= ruleSettings EOF ;
    public final EObject entryRuleSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettings = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:125:2: (iv_ruleSettings= ruleSettings EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:126:2: iv_ruleSettings= ruleSettings EOF
            {
             newCompositeNode(grammarAccess.getSettingsRule()); 
            pushFollow(FOLLOW_ruleSettings_in_entryRuleSettings189);
            iv_ruleSettings=ruleSettings();

            state._fsp--;

             current =iv_ruleSettings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSettings199); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:133:1: ruleSettings returns [EObject current=null] : (otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )* ) ;
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
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:136:28: ( (otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )* ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:137:1: (otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )* )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:137:1: (otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )* )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:137:3: otherlv_0= 'settings' otherlv_1= 'title' ( (lv_title_2_0= RULE_STRING ) ) (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )? otherlv_5= 'width' ( (lv_width_6_0= RULE_INT ) ) otherlv_7= 'height' ( (lv_height_8_0= RULE_INT ) ) otherlv_9= 'columns' ( (lv_columns_10_0= RULE_INT ) ) otherlv_11= 'rows' ( (lv_rows_12_0= RULE_INT ) ) (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )? otherlv_15= 'drag&drop' ( (lv_dragdrop_16_0= ruleBOOL ) ) otherlv_17= 'gridster_margin' ( (lv_margin_18_0= RULE_INT ) ) ( (lv_settings_19_0= ruleSettingsElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSettings236); 

                	newLeafNode(otherlv_0, grammarAccess.getSettingsAccess().getSettingsKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSettings248); 

                	newLeafNode(otherlv_1, grammarAccess.getSettingsAccess().getTitleKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:145:1: ( (lv_title_2_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:146:1: (lv_title_2_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:146:1: (lv_title_2_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:147:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSettings265); 

            			newLeafNode(lv_title_2_0, grammarAccess.getSettingsAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:163:2: (otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:163:4: otherlv_3= 'fhemweb_url' ( (lv_fhemweb_url_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSettings283); 

                        	newLeafNode(otherlv_3, grammarAccess.getSettingsAccess().getFhemweb_urlKeyword_3_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:167:1: ( (lv_fhemweb_url_4_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:168:1: (lv_fhemweb_url_4_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:168:1: (lv_fhemweb_url_4_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:169:3: lv_fhemweb_url_4_0= RULE_STRING
                    {
                    lv_fhemweb_url_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSettings300); 

                    			newLeafNode(lv_fhemweb_url_4_0, grammarAccess.getSettingsAccess().getFhemweb_urlSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSettingsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fhemweb_url",
                            		lv_fhemweb_url_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSettings319); 

                	newLeafNode(otherlv_5, grammarAccess.getSettingsAccess().getWidthKeyword_4());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:189:1: ( (lv_width_6_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:190:1: (lv_width_6_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:190:1: (lv_width_6_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:191:3: lv_width_6_0= RULE_INT
            {
            lv_width_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSettings336); 

            			newLeafNode(lv_width_6_0, grammarAccess.getSettingsAccess().getWidthINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"width",
                    		lv_width_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleSettings353); 

                	newLeafNode(otherlv_7, grammarAccess.getSettingsAccess().getHeightKeyword_6());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:211:1: ( (lv_height_8_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:212:1: (lv_height_8_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:212:1: (lv_height_8_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:213:3: lv_height_8_0= RULE_INT
            {
            lv_height_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSettings370); 

            			newLeafNode(lv_height_8_0, grammarAccess.getSettingsAccess().getHeightINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"height",
                    		lv_height_8_0, 
                    		"INT");
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSettings387); 

                	newLeafNode(otherlv_9, grammarAccess.getSettingsAccess().getColumnsKeyword_8());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:233:1: ( (lv_columns_10_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:234:1: (lv_columns_10_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:234:1: (lv_columns_10_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:235:3: lv_columns_10_0= RULE_INT
            {
            lv_columns_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSettings404); 

            			newLeafNode(lv_columns_10_0, grammarAccess.getSettingsAccess().getColumnsINTTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"columns",
                    		lv_columns_10_0, 
                    		"INT");
            	    

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleSettings421); 

                	newLeafNode(otherlv_11, grammarAccess.getSettingsAccess().getRowsKeyword_10());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:255:1: ( (lv_rows_12_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:256:1: (lv_rows_12_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:256:1: (lv_rows_12_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:257:3: lv_rows_12_0= RULE_INT
            {
            lv_rows_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSettings438); 

            			newLeafNode(lv_rows_12_0, grammarAccess.getSettingsAccess().getRowsINTTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rows",
                    		lv_rows_12_0, 
                    		"INT");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:273:2: (otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:273:4: otherlv_13= 'debug' ( (lv_debug_14_0= ruleBOOL ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleSettings456); 

                        	newLeafNode(otherlv_13, grammarAccess.getSettingsAccess().getDebugKeyword_12_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:277:1: ( (lv_debug_14_0= ruleBOOL ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:278:1: (lv_debug_14_0= ruleBOOL )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:278:1: (lv_debug_14_0= ruleBOOL )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:279:3: lv_debug_14_0= ruleBOOL
                    {
                     
                    	        newCompositeNode(grammarAccess.getSettingsAccess().getDebugBOOLParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBOOL_in_ruleSettings477);
                    lv_debug_14_0=ruleBOOL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSettingsRule());
                    	        }
                           		set(
                           			current, 
                           			"debug",
                            		lv_debug_14_0, 
                            		"BOOL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleSettings491); 

                	newLeafNode(otherlv_15, grammarAccess.getSettingsAccess().getDragDropKeyword_13());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:299:1: ( (lv_dragdrop_16_0= ruleBOOL ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:300:1: (lv_dragdrop_16_0= ruleBOOL )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:300:1: (lv_dragdrop_16_0= ruleBOOL )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:301:3: lv_dragdrop_16_0= ruleBOOL
            {
             
            	        newCompositeNode(grammarAccess.getSettingsAccess().getDragdropBOOLParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOL_in_ruleSettings512);
            lv_dragdrop_16_0=ruleBOOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSettingsRule());
            	        }
                   		set(
                   			current, 
                   			"dragdrop",
                    		lv_dragdrop_16_0, 
                    		"BOOL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleSettings524); 

                	newLeafNode(otherlv_17, grammarAccess.getSettingsAccess().getGridster_marginKeyword_15());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:321:1: ( (lv_margin_18_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:322:1: (lv_margin_18_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:322:1: (lv_margin_18_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:323:3: lv_margin_18_0= RULE_INT
            {
            lv_margin_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSettings541); 

            			newLeafNode(lv_margin_18_0, grammarAccess.getSettingsAccess().getMarginINTTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSettingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"margin",
                    		lv_margin_18_0, 
                    		"INT");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:339:2: ( (lv_settings_19_0= ruleSettingsElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21||LA4_0==48) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:340:1: (lv_settings_19_0= ruleSettingsElement )
            	    {
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:340:1: (lv_settings_19_0= ruleSettingsElement )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:341:3: lv_settings_19_0= ruleSettingsElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSettingsAccess().getSettingsSettingsElementParserRuleCall_17_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSettingsElement_in_ruleSettings567);
            	    lv_settings_19_0=ruleSettingsElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSettingsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"settings",
            	            		lv_settings_19_0, 
            	            		"SettingsElement");
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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:365:1: entryRuleSettingsElement returns [EObject current=null] : iv_ruleSettingsElement= ruleSettingsElement EOF ;
    public final EObject entryRuleSettingsElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingsElement = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:366:2: (iv_ruleSettingsElement= ruleSettingsElement EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:367:2: iv_ruleSettingsElement= ruleSettingsElement EOF
            {
             newCompositeNode(grammarAccess.getSettingsElementRule()); 
            pushFollow(FOLLOW_ruleSettingsElement_in_entryRuleSettingsElement604);
            iv_ruleSettingsElement=ruleSettingsElement();

            state._fsp--;

             current =iv_ruleSettingsElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSettingsElement614); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:374:1: ruleSettingsElement returns [EObject current=null] : (this_CSS_0= ruleCSS | this_Color_1= ruleColor ) ;
    public final EObject ruleSettingsElement() throws RecognitionException {
        EObject current = null;

        EObject this_CSS_0 = null;

        EObject this_Color_1 = null;


         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:377:28: ( (this_CSS_0= ruleCSS | this_Color_1= ruleColor ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:378:1: (this_CSS_0= ruleCSS | this_Color_1= ruleColor )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:378:1: (this_CSS_0= ruleCSS | this_Color_1= ruleColor )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==48) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:379:5: this_CSS_0= ruleCSS
                    {
                     
                            newCompositeNode(grammarAccess.getSettingsElementAccess().getCSSParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCSS_in_ruleSettingsElement661);
                    this_CSS_0=ruleCSS();

                    state._fsp--;

                     
                            current = this_CSS_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:389:5: this_Color_1= ruleColor
                    {
                     
                            newCompositeNode(grammarAccess.getSettingsElementAccess().getColorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleColor_in_ruleSettingsElement688);
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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:405:1: entryRuleCSS returns [EObject current=null] : iv_ruleCSS= ruleCSS EOF ;
    public final EObject entryRuleCSS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSS = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:406:2: (iv_ruleCSS= ruleCSS EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:407:2: iv_ruleCSS= ruleCSS EOF
            {
             newCompositeNode(grammarAccess.getCSSRule()); 
            pushFollow(FOLLOW_ruleCSS_in_entryRuleCSS723);
            iv_ruleCSS=ruleCSS();

            state._fsp--;

             current =iv_ruleCSS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSS733); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:414:1: ruleCSS returns [EObject current=null] : (otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:417:28: ( (otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) ) ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:418:1: (otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) ) )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:418:1: (otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:418:3: otherlv_0= 'css' ( (lv_path_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCSS770); 

                	newLeafNode(otherlv_0, grammarAccess.getCSSAccess().getCssKeyword_0());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:422:1: ( (lv_path_1_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:423:1: (lv_path_1_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:423:1: (lv_path_1_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:424:3: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCSS787); 

            			newLeafNode(lv_path_1_0, grammarAccess.getCSSAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCSSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_1_0, 
                    		"STRING");
            	    

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:448:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:449:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:450:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement828);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement838); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:457:1: ruleAbstractElement returns [EObject current=null] : this_Page_0= rulePage ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Page_0 = null;


         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:460:28: (this_Page_0= rulePage )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:462:5: this_Page_0= rulePage
            {
             
                    newCompositeNode(grammarAccess.getAbstractElementAccess().getPageParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePage_in_ruleAbstractElement884);
            this_Page_0=rulePage();

            state._fsp--;

             
                    current = this_Page_0; 
                    afterParserOrEnumRuleCall();
                

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:478:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:479:2: (iv_ruleBOOL= ruleBOOL EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:480:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL919);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL930); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:487:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:490:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:491:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:491:1: (kw= 'true' | kw= 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:492:2: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleBOOL968); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:499:2: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleBOOL987); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:512:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:513:2: (iv_rulePage= rulePage EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:514:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage1027);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage1037); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:521:1: rulePage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_elements_2_0= ruleGridster ) )* otherlv_3= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:524:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_elements_2_0= ruleGridster ) )* otherlv_3= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:525:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_elements_2_0= ruleGridster ) )* otherlv_3= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:525:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_elements_2_0= ruleGridster ) )* otherlv_3= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:525:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_elements_2_0= ruleGridster ) )* otherlv_3= '}'
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:525:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:526:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:526:1: (lv_name_0_0= RULE_ID )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:527:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage1079); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulePage1096); 

                	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:547:1: ( (lv_elements_2_0= ruleGridster ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:548:1: (lv_elements_2_0= ruleGridster )
            	    {
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:548:1: (lv_elements_2_0= ruleGridster )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:549:3: lv_elements_2_0= ruleGridster
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getElementsGridsterParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGridster_in_rulePage1117);
            	    lv_elements_2_0=ruleGridster();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"Gridster");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_rulePage1130); 

                	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleGridster"
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:577:1: entryRuleGridster returns [EObject current=null] : iv_ruleGridster= ruleGridster EOF ;
    public final EObject entryRuleGridster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGridster = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:578:2: (iv_ruleGridster= ruleGridster EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:579:2: iv_ruleGridster= ruleGridster EOF
            {
             newCompositeNode(grammarAccess.getGridsterRule()); 
            pushFollow(FOLLOW_ruleGridster_in_entryRuleGridster1166);
            iv_ruleGridster=ruleGridster();

            state._fsp--;

             current =iv_ruleGridster; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGridster1176); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:586:1: ruleGridster returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? ( (lv_colors_11_0= ruleColor ) )* ( (lv_widgets_12_0= ruleWidget ) )* otherlv_13= '}' ) ;
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
        Token otherlv_13=null;
        EObject lv_colors_11_0 = null;

        EObject lv_widgets_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:589:28: ( (otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? ( (lv_colors_11_0= ruleColor ) )* ( (lv_widgets_12_0= ruleWidget ) )* otherlv_13= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:590:1: (otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? ( (lv_colors_11_0= ruleColor ) )* ( (lv_widgets_12_0= ruleWidget ) )* otherlv_13= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:590:1: (otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? ( (lv_colors_11_0= ruleColor ) )* ( (lv_widgets_12_0= ruleWidget ) )* otherlv_13= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:590:3: otherlv_0= '{' (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )? otherlv_3= 'row' ( (lv_row_4_0= RULE_INT ) ) otherlv_5= 'column' ( (lv_column_6_0= RULE_INT ) ) (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )? (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )? ( (lv_colors_11_0= ruleColor ) )* ( (lv_widgets_12_0= ruleWidget ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGridster1213); 

                	newLeafNode(otherlv_0, grammarAccess.getGridsterAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:594:1: (otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:594:3: otherlv_1= 'header' ( (lv_header_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleGridster1226); 

                        	newLeafNode(otherlv_1, grammarAccess.getGridsterAccess().getHeaderKeyword_1_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:598:1: ( (lv_header_2_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:599:1: (lv_header_2_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:599:1: (lv_header_2_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:600:3: lv_header_2_0= RULE_STRING
                    {
                    lv_header_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGridster1243); 

                    			newLeafNode(lv_header_2_0, grammarAccess.getGridsterAccess().getHeaderSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridsterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"header",
                            		lv_header_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleGridster1262); 

                	newLeafNode(otherlv_3, grammarAccess.getGridsterAccess().getRowKeyword_2());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:620:1: ( (lv_row_4_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:621:1: (lv_row_4_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:621:1: (lv_row_4_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:622:3: lv_row_4_0= RULE_INT
            {
            lv_row_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGridster1279); 

            			newLeafNode(lv_row_4_0, grammarAccess.getGridsterAccess().getRowINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGridsterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"row",
                    		lv_row_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleGridster1296); 

                	newLeafNode(otherlv_5, grammarAccess.getGridsterAccess().getColumnKeyword_4());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:642:1: ( (lv_column_6_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:643:1: (lv_column_6_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:643:1: (lv_column_6_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:644:3: lv_column_6_0= RULE_INT
            {
            lv_column_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGridster1313); 

            			newLeafNode(lv_column_6_0, grammarAccess.getGridsterAccess().getColumnINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGridsterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"column",
                    		lv_column_6_0, 
                    		"INT");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:660:2: (otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:660:4: otherlv_7= 'colspan' ( (lv_colspan_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleGridster1331); 

                        	newLeafNode(otherlv_7, grammarAccess.getGridsterAccess().getColspanKeyword_6_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:664:1: ( (lv_colspan_8_0= RULE_INT ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:665:1: (lv_colspan_8_0= RULE_INT )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:665:1: (lv_colspan_8_0= RULE_INT )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:666:3: lv_colspan_8_0= RULE_INT
                    {
                    lv_colspan_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGridster1348); 

                    			newLeafNode(lv_colspan_8_0, grammarAccess.getGridsterAccess().getColspanINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridsterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"colspan",
                            		lv_colspan_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:682:4: (otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:682:6: otherlv_9= 'rowspan' ( (lv_rowspan_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleGridster1368); 

                        	newLeafNode(otherlv_9, grammarAccess.getGridsterAccess().getRowspanKeyword_7_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:686:1: ( (lv_rowspan_10_0= RULE_INT ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:687:1: (lv_rowspan_10_0= RULE_INT )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:687:1: (lv_rowspan_10_0= RULE_INT )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:688:3: lv_rowspan_10_0= RULE_INT
                    {
                    lv_rowspan_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGridster1385); 

                    			newLeafNode(lv_rowspan_10_0, grammarAccess.getGridsterAccess().getRowspanINTTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGridsterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rowspan",
                            		lv_rowspan_10_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:704:4: ( (lv_colors_11_0= ruleColor ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==48) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:705:1: (lv_colors_11_0= ruleColor )
            	    {
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:705:1: (lv_colors_11_0= ruleColor )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:706:3: lv_colors_11_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridsterAccess().getColorsColorParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleGridster1413);
            	    lv_colors_11_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridsterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_11_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:722:3: ( (lv_widgets_12_0= ruleWidget ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24||LA12_0==31||(LA12_0>=41 && LA12_0<=42)||LA12_0==46||LA12_0==50||LA12_0==58||LA12_0==65||LA12_0==73) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:723:1: (lv_widgets_12_0= ruleWidget )
            	    {
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:723:1: (lv_widgets_12_0= ruleWidget )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:724:3: lv_widgets_12_0= ruleWidget
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGridsterAccess().getWidgetsWidgetParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWidget_in_ruleGridster1435);
            	    lv_widgets_12_0=ruleWidget();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGridsterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"widgets",
            	            		lv_widgets_12_0, 
            	            		"Widget");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleGridster1448); 

                	newLeafNode(otherlv_13, grammarAccess.getGridsterAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleWidget"
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:752:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:753:2: (iv_ruleWidget= ruleWidget EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:754:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget1484);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget1494); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:761:1: ruleWidget returns [EObject current=null] : (this_Switch_0= ruleSwitch | this_Button_1= ruleButton | this_Label_2= ruleLabel | this_SimpleClock_3= ruleSimpleClock | this_Symbol_4= ruleSymbol | this_Calview_5= ruleCalview | this_SimpleChart_6= ruleSimpleChart | this_Custom_7= ruleCustom | this_Div_8= ruleDiv ) ;
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

        EObject this_Div_8 = null;


         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:764:28: ( (this_Switch_0= ruleSwitch | this_Button_1= ruleButton | this_Label_2= ruleLabel | this_SimpleClock_3= ruleSimpleClock | this_Symbol_4= ruleSymbol | this_Calview_5= ruleCalview | this_SimpleChart_6= ruleSimpleChart | this_Custom_7= ruleCustom | this_Div_8= ruleDiv ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:765:1: (this_Switch_0= ruleSwitch | this_Button_1= ruleButton | this_Label_2= ruleLabel | this_SimpleClock_3= ruleSimpleClock | this_Symbol_4= ruleSymbol | this_Calview_5= ruleCalview | this_SimpleChart_6= ruleSimpleChart | this_Custom_7= ruleCustom | this_Div_8= ruleDiv )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:765:1: (this_Switch_0= ruleSwitch | this_Button_1= ruleButton | this_Label_2= ruleLabel | this_SimpleClock_3= ruleSimpleClock | this_Symbol_4= ruleSymbol | this_Calview_5= ruleCalview | this_SimpleChart_6= ruleSimpleChart | this_Custom_7= ruleCustom | this_Div_8= ruleDiv )
            int alt13=9;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt13=1;
                }
                break;
            case 46:
                {
                alt13=2;
                }
                break;
            case 73:
                {
                alt13=3;
                }
                break;
            case 58:
                {
                alt13=4;
                }
                break;
            case 50:
                {
                alt13=5;
                }
                break;
            case 42:
                {
                alt13=6;
                }
                break;
            case 65:
                {
                alt13=7;
                }
                break;
            case 24:
                {
                alt13=8;
                }
                break;
            case 41:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:766:5: this_Switch_0= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSwitchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleWidget1541);
                    this_Switch_0=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:776:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleWidget1568);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:786:5: this_Label_2= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getLabelParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleWidget1595);
                    this_Label_2=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:796:5: this_SimpleClock_3= ruleSimpleClock
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSimpleClockParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSimpleClock_in_ruleWidget1622);
                    this_SimpleClock_3=ruleSimpleClock();

                    state._fsp--;

                     
                            current = this_SimpleClock_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:806:5: this_Symbol_4= ruleSymbol
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSymbolParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSymbol_in_ruleWidget1649);
                    this_Symbol_4=ruleSymbol();

                    state._fsp--;

                     
                            current = this_Symbol_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:816:5: this_Calview_5= ruleCalview
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCalviewParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleCalview_in_ruleWidget1676);
                    this_Calview_5=ruleCalview();

                    state._fsp--;

                     
                            current = this_Calview_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:826:5: this_SimpleChart_6= ruleSimpleChart
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getSimpleChartParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSimpleChart_in_ruleWidget1703);
                    this_SimpleChart_6=ruleSimpleChart();

                    state._fsp--;

                     
                            current = this_SimpleChart_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:836:5: this_Custom_7= ruleCustom
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCustomParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleCustom_in_ruleWidget1730);
                    this_Custom_7=ruleCustom();

                    state._fsp--;

                     
                            current = this_Custom_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:846:5: this_Div_8= ruleDiv
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getDivParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleDiv_in_ruleWidget1757);
                    this_Div_8=ruleDiv();

                    state._fsp--;

                     
                            current = this_Div_8; 
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


    // $ANTLR start "entryRuleSwitch"
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:862:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:863:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:864:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch1792);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch1802); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:871:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'onColor' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'offColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'background-on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-icon' ( (lv_backgroundIcon_18_0= RULE_STRING ) ) )? (otherlv_19= 'icon' ( (lv_icon_20_0= RULE_STRING ) ) )? otherlv_21= '}' ) ;
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
        Token lv_getOff_8_0=null;
        Token otherlv_9=null;
        Token lv_class_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_backgroundIcon_18_0=null;
        Token otherlv_19=null;
        Token lv_icon_20_0=null;
        Token otherlv_21=null;

         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:874:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'onColor' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'offColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'background-on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-icon' ( (lv_backgroundIcon_18_0= RULE_STRING ) ) )? (otherlv_19= 'icon' ( (lv_icon_20_0= RULE_STRING ) ) )? otherlv_21= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:875:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'onColor' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'offColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'background-on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-icon' ( (lv_backgroundIcon_18_0= RULE_STRING ) ) )? (otherlv_19= 'icon' ( (lv_icon_20_0= RULE_STRING ) ) )? otherlv_21= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:875:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'onColor' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'offColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'background-on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-icon' ( (lv_backgroundIcon_18_0= RULE_STRING ) ) )? (otherlv_19= 'icon' ( (lv_icon_20_0= RULE_STRING ) ) )? otherlv_21= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:875:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )? (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )? (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) ) )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'onColor' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= 'offColor' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'background-on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'background-icon' ( (lv_backgroundIcon_18_0= RULE_STRING ) ) )? (otherlv_19= 'icon' ( (lv_icon_20_0= RULE_STRING ) ) )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSwitch1839); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSwitch1851); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:883:1: ( (lv_device_2_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:884:1: (lv_device_2_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:884:1: (lv_device_2_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:885:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSwitch1868); 

            			newLeafNode(lv_device_2_0, grammarAccess.getSwitchAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSwitchRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:901:2: (otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:901:4: otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleSwitch1886); 

                        	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getGetKeyword_3_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:905:1: ( (lv_get_4_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:906:1: (lv_get_4_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:906:1: (lv_get_4_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:907:3: lv_get_4_0= RULE_STRING
                    {
                    lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSwitch1903); 

                    			newLeafNode(lv_get_4_0, grammarAccess.getSwitchAccess().getGetSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"get",
                            		lv_get_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:923:4: (otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:923:6: otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleSwitch1923); 

                        	newLeafNode(otherlv_5, grammarAccess.getSwitchAccess().getGetOnKeyword_4_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:927:1: ( (lv_getOn_6_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:928:1: (lv_getOn_6_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:928:1: (lv_getOn_6_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:929:3: lv_getOn_6_0= RULE_STRING
                    {
                    lv_getOn_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSwitch1940); 

                    			newLeafNode(lv_getOn_6_0, grammarAccess.getSwitchAccess().getGetOnSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"getOn",
                            		lv_getOn_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:945:4: (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:945:6: otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleSwitch1960); 

                        	newLeafNode(otherlv_7, grammarAccess.getSwitchAccess().getGetOffKeyword_5_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:949:1: ( (lv_getOff_8_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:950:1: (lv_getOff_8_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:950:1: (lv_getOff_8_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:951:3: lv_getOff_8_0= RULE_STRING
                    {
                    lv_getOff_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSwitch1977); 

                    			newLeafNode(lv_getOff_8_0, grammarAccess.getSwitchAccess().getGetOffSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"getOff",
                            		lv_getOff_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:967:4: (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:967:6: otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleSwitch1997); 

                        	newLeafNode(otherlv_9, grammarAccess.getSwitchAccess().getClassKeyword_6_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:971:1: ( (lv_class_10_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:972:1: (lv_class_10_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:972:1: (lv_class_10_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:973:3: lv_class_10_0= RULE_STRING
                    {
                    lv_class_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSwitch2014); 

                    			newLeafNode(lv_class_10_0, grammarAccess.getSwitchAccess().getClassSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:989:4: (otherlv_11= 'onColor' ( (otherlv_12= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:989:6: otherlv_11= 'onColor' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleSwitch2034); 

                        	newLeafNode(otherlv_11, grammarAccess.getSwitchAccess().getOnColorKeyword_7_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:993:1: ( (otherlv_12= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:994:1: (otherlv_12= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:994:1: (otherlv_12= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:995:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitch2054); 

                    		newLeafNode(otherlv_12, grammarAccess.getSwitchAccess().getOnColorColorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1006:4: (otherlv_13= 'offColor' ( (otherlv_14= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1006:6: otherlv_13= 'offColor' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleSwitch2069); 

                        	newLeafNode(otherlv_13, grammarAccess.getSwitchAccess().getOffColorKeyword_8_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1010:1: ( (otherlv_14= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1011:1: (otherlv_14= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1011:1: (otherlv_14= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1012:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitch2089); 

                    		newLeafNode(otherlv_14, grammarAccess.getSwitchAccess().getOffColorColorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1023:4: (otherlv_15= 'background-on-color' ( (otherlv_16= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1023:6: otherlv_15= 'background-on-color' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,38,FOLLOW_38_in_ruleSwitch2104); 

                        	newLeafNode(otherlv_15, grammarAccess.getSwitchAccess().getBackgroundOnColorKeyword_9_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1027:1: ( (otherlv_16= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1028:1: (otherlv_16= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1028:1: (otherlv_16= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1029:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitch2124); 

                    		newLeafNode(otherlv_16, grammarAccess.getSwitchAccess().getOnBackGroundColorColorCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1040:4: (otherlv_17= 'background-icon' ( (lv_backgroundIcon_18_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1040:6: otherlv_17= 'background-icon' ( (lv_backgroundIcon_18_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,39,FOLLOW_39_in_ruleSwitch2139); 

                        	newLeafNode(otherlv_17, grammarAccess.getSwitchAccess().getBackgroundIconKeyword_10_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1044:1: ( (lv_backgroundIcon_18_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1045:1: (lv_backgroundIcon_18_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1045:1: (lv_backgroundIcon_18_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1046:3: lv_backgroundIcon_18_0= RULE_STRING
                    {
                    lv_backgroundIcon_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSwitch2156); 

                    			newLeafNode(lv_backgroundIcon_18_0, grammarAccess.getSwitchAccess().getBackgroundIconSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"backgroundIcon",
                            		lv_backgroundIcon_18_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1062:4: (otherlv_19= 'icon' ( (lv_icon_20_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1062:6: otherlv_19= 'icon' ( (lv_icon_20_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,40,FOLLOW_40_in_ruleSwitch2176); 

                        	newLeafNode(otherlv_19, grammarAccess.getSwitchAccess().getIconKeyword_11_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1066:1: ( (lv_icon_20_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1067:1: (lv_icon_20_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1067:1: (lv_icon_20_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1068:3: lv_icon_20_0= RULE_STRING
                    {
                    lv_icon_20_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSwitch2193); 

                    			newLeafNode(lv_icon_20_0, grammarAccess.getSwitchAccess().getIconSTRINGTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSwitchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_20_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,25,FOLLOW_25_in_ruleSwitch2212); 

                	newLeafNode(otherlv_21, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1096:1: entryRuleCustom returns [EObject current=null] : iv_ruleCustom= ruleCustom EOF ;
    public final EObject entryRuleCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustom = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1097:2: (iv_ruleCustom= ruleCustom EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1098:2: iv_ruleCustom= ruleCustom EOF
            {
             newCompositeNode(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_ruleCustom_in_entryRuleCustom2248);
            iv_ruleCustom=ruleCustom();

            state._fsp--;

             current =iv_ruleCustom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustom2258); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1105:1: ruleCustom returns [EObject current=null] : (otherlv_0= '{' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= '}' ) ;
    public final EObject ruleCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1108:28: ( (otherlv_0= '{' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1109:1: (otherlv_0= '{' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1109:1: (otherlv_0= '{' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1109:3: otherlv_0= '{' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCustom2295); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1113:1: ( (lv_code_1_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1114:1: (lv_code_1_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1114:1: (lv_code_1_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1115:3: lv_code_1_0= RULE_STRING
            {
            lv_code_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustom2312); 

            			newLeafNode(lv_code_1_0, grammarAccess.getCustomAccess().getCodeSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleCustom2329); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_2());
                

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1143:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1144:2: (iv_ruleDiv= ruleDiv EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1145:2: iv_ruleDiv= ruleDiv EOF
            {
             newCompositeNode(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_ruleDiv_in_entryRuleDiv2365);
            iv_ruleDiv=ruleDiv();

            state._fsp--;

             current =iv_ruleDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiv2375); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1152:1: ruleDiv returns [EObject current=null] : (otherlv_0= 'div' otherlv_1= '{' otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) ( (lv_widgets_4_0= ruleWidget ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_class_3_0=null;
        Token otherlv_5=null;
        EObject lv_widgets_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1155:28: ( (otherlv_0= 'div' otherlv_1= '{' otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) ( (lv_widgets_4_0= ruleWidget ) )* otherlv_5= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1156:1: (otherlv_0= 'div' otherlv_1= '{' otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) ( (lv_widgets_4_0= ruleWidget ) )* otherlv_5= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1156:1: (otherlv_0= 'div' otherlv_1= '{' otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) ( (lv_widgets_4_0= ruleWidget ) )* otherlv_5= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1156:3: otherlv_0= 'div' otherlv_1= '{' otherlv_2= 'class' ( (lv_class_3_0= RULE_STRING ) ) ( (lv_widgets_4_0= ruleWidget ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleDiv2412); 

                	newLeafNode(otherlv_0, grammarAccess.getDivAccess().getDivKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDiv2424); 

                	newLeafNode(otherlv_1, grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDiv2436); 

                	newLeafNode(otherlv_2, grammarAccess.getDivAccess().getClassKeyword_2());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1168:1: ( (lv_class_3_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1169:1: (lv_class_3_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1169:1: (lv_class_3_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1170:3: lv_class_3_0= RULE_STRING
            {
            lv_class_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDiv2453); 

            			newLeafNode(lv_class_3_0, grammarAccess.getDivAccess().getClassSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDivRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1186:2: ( (lv_widgets_4_0= ruleWidget ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24||LA23_0==31||(LA23_0>=41 && LA23_0<=42)||LA23_0==46||LA23_0==50||LA23_0==58||LA23_0==65||LA23_0==73) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1187:1: (lv_widgets_4_0= ruleWidget )
            	    {
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1187:1: (lv_widgets_4_0= ruleWidget )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1188:3: lv_widgets_4_0= ruleWidget
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDivAccess().getWidgetsWidgetParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWidget_in_ruleDiv2479);
            	    lv_widgets_4_0=ruleWidget();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDivRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"widgets",
            	            		lv_widgets_4_0, 
            	            		"Widget");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleDiv2492); 

                	newLeafNode(otherlv_5, grammarAccess.getDivAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleCalview"
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1216:1: entryRuleCalview returns [EObject current=null] : iv_ruleCalview= ruleCalview EOF ;
    public final EObject entryRuleCalview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalview = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1217:2: (iv_ruleCalview= ruleCalview EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1218:2: iv_ruleCalview= ruleCalview EOF
            {
             newCompositeNode(grammarAccess.getCalviewRule()); 
            pushFollow(FOLLOW_ruleCalview_in_entryRuleCalview2528);
            iv_ruleCalview=ruleCalview();

            state._fsp--;

             current =iv_ruleCalview; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalview2538); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1225:1: ruleCalview returns [EObject current=null] : (otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
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
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1228:28: ( (otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1229:1: (otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1229:1: (otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1229:3: otherlv_0= 'calview' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'max' ( (lv_max_6_0= RULE_INT ) ) otherlv_7= 'class' ( (lv_class_8_0= RULE_STRING ) ) (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleCalview2575); 

                	newLeafNode(otherlv_0, grammarAccess.getCalviewAccess().getCalviewKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCalview2587); 

                	newLeafNode(otherlv_1, grammarAccess.getCalviewAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1237:1: ( (lv_device_2_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1238:1: (lv_device_2_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1238:1: (lv_device_2_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1239:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCalview2604); 

            			newLeafNode(lv_device_2_0, grammarAccess.getCalviewAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleCalview2621); 

                	newLeafNode(otherlv_3, grammarAccess.getCalviewAccess().getGetKeyword_3());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1259:1: ( (lv_get_4_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1260:1: (lv_get_4_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1260:1: (lv_get_4_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1261:3: lv_get_4_0= RULE_STRING
            {
            lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCalview2638); 

            			newLeafNode(lv_get_4_0, grammarAccess.getCalviewAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"get",
                    		lv_get_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleCalview2655); 

                	newLeafNode(otherlv_5, grammarAccess.getCalviewAccess().getMaxKeyword_5());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1281:1: ( (lv_max_6_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1282:1: (lv_max_6_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1282:1: (lv_max_6_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1283:3: lv_max_6_0= RULE_INT
            {
            lv_max_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCalview2672); 

            			newLeafNode(lv_max_6_0, grammarAccess.getCalviewAccess().getMaxINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"max",
                    		lv_max_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleCalview2689); 

                	newLeafNode(otherlv_7, grammarAccess.getCalviewAccess().getClassKeyword_7());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1303:1: ( (lv_class_8_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1304:1: (lv_class_8_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1304:1: (lv_class_8_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1305:3: lv_class_8_0= RULE_STRING
            {
            lv_class_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCalview2706); 

            			newLeafNode(lv_class_8_0, grammarAccess.getCalviewAccess().getClassSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCalviewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_8_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1321:2: (otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1321:4: otherlv_9= 'all-forecast-color' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleCalview2724); 

                        	newLeafNode(otherlv_9, grammarAccess.getCalviewAccess().getAllForecastColorKeyword_9_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1325:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1326:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1326:1: (otherlv_10= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1327:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalviewRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalview2744); 

                    		newLeafNode(otherlv_10, grammarAccess.getCalviewAccess().getAllFCColorCrossReference_9_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1338:4: (otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1338:6: otherlv_11= 'all-today-color' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleCalview2759); 

                        	newLeafNode(otherlv_11, grammarAccess.getCalviewAccess().getAllTodayColorKeyword_10_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1342:1: ( (otherlv_12= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1343:1: (otherlv_12= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1343:1: (otherlv_12= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1344:3: otherlv_12= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCalviewRule());
                    	        }
                            
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCalview2779); 

                    		newLeafNode(otherlv_12, grammarAccess.getCalviewAccess().getAllTCColorCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleCalview2793); 

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


    // $ANTLR start "entryRuleButton"
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1367:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1368:2: (iv_ruleButton= ruleButton EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1369:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton2829);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton2839); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1376:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' otherlv_1= '{' (otherlv_2= 'url' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) (otherlv_8= 'color' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'background-color' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_icon_5_0=null;
        Token otherlv_6=null;
        Token lv_class_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1379:28: ( (otherlv_0= 'button' otherlv_1= '{' (otherlv_2= 'url' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) (otherlv_8= 'color' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'background-color' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1380:1: (otherlv_0= 'button' otherlv_1= '{' (otherlv_2= 'url' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) (otherlv_8= 'color' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'background-color' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1380:1: (otherlv_0= 'button' otherlv_1= '{' (otherlv_2= 'url' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) (otherlv_8= 'color' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'background-color' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1380:3: otherlv_0= 'button' otherlv_1= '{' (otherlv_2= 'url' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) otherlv_6= 'class' ( (lv_class_7_0= RULE_STRING ) ) (otherlv_8= 'color' ( (otherlv_9= RULE_ID ) ) )? (otherlv_10= 'background-color' ( (otherlv_11= RULE_ID ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleButton2876); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleButton2888); 

                	newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1388:1: (otherlv_2= 'url' ( (otherlv_3= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1388:3: otherlv_2= 'url' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleButton2901); 

                        	newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getUrlKeyword_2_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1392:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1393:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1393:1: (otherlv_3= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1394:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton2921); 

                    		newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getUrlPageCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleButton2935); 

                	newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getIconKeyword_3());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1409:1: ( (lv_icon_5_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1410:1: (lv_icon_5_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1410:1: (lv_icon_5_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1411:3: lv_icon_5_0= RULE_STRING
            {
            lv_icon_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton2952); 

            			newLeafNode(lv_icon_5_0, grammarAccess.getButtonAccess().getIconSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"icon",
                    		lv_icon_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleButton2969); 

                	newLeafNode(otherlv_6, grammarAccess.getButtonAccess().getClassKeyword_5());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1431:1: ( (lv_class_7_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1432:1: (lv_class_7_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1432:1: (lv_class_7_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1433:3: lv_class_7_0= RULE_STRING
            {
            lv_class_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton2986); 

            			newLeafNode(lv_class_7_0, grammarAccess.getButtonAccess().getClassSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_7_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1449:2: (otherlv_8= 'color' ( (otherlv_9= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1449:4: otherlv_8= 'color' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleButton3004); 

                        	newLeafNode(otherlv_8, grammarAccess.getButtonAccess().getColorKeyword_7_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1453:1: ( (otherlv_9= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1454:1: (otherlv_9= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1454:1: (otherlv_9= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1455:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton3024); 

                    		newLeafNode(otherlv_9, grammarAccess.getButtonAccess().getColorColorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1466:4: (otherlv_10= 'background-color' ( (otherlv_11= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1466:6: otherlv_10= 'background-color' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleButton3039); 

                        	newLeafNode(otherlv_10, grammarAccess.getButtonAccess().getBackgroundColorKeyword_8_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1470:1: ( (otherlv_11= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1471:1: (otherlv_11= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1471:1: (otherlv_11= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1472:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getButtonRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton3059); 

                    		newLeafNode(otherlv_11, grammarAccess.getButtonAccess().getBackgroundColorColorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleButton3073); 

                	newLeafNode(otherlv_12, grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleSymbol"
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1495:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1496:2: (iv_ruleSymbol= ruleSymbol EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1497:2: iv_ruleSymbol= ruleSymbol EOF
            {
             newCompositeNode(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol3109);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol3119); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1504:1: ruleSymbol returns [EObject current=null] : (otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) )* )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'background-icon' ( (lv_bgicon_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-on-color' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'off-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'icons' otherlv_20= '[' ( (lv_icons_21_0= RULE_STRING ) )* otherlv_22= ']' )? (otherlv_23= 'onColors' otherlv_24= '[' ( (otherlv_25= RULE_ID ) )* otherlv_26= ']' )? (otherlv_27= 'onBackgroundColors' otherlv_28= '[' ( (otherlv_29= RULE_ID ) )* otherlv_30= ']' )? otherlv_31= '}' ) ;
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
        Token lv_getOff_8_0=null;
        Token otherlv_9=null;
        Token lv_class_10_0=null;
        Token otherlv_11=null;
        Token lv_bgicon_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_icons_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;

         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1507:28: ( (otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) )* )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'background-icon' ( (lv_bgicon_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-on-color' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'off-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'icons' otherlv_20= '[' ( (lv_icons_21_0= RULE_STRING ) )* otherlv_22= ']' )? (otherlv_23= 'onColors' otherlv_24= '[' ( (otherlv_25= RULE_ID ) )* otherlv_26= ']' )? (otherlv_27= 'onBackgroundColors' otherlv_28= '[' ( (otherlv_29= RULE_ID ) )* otherlv_30= ']' )? otherlv_31= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1508:1: (otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) )* )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'background-icon' ( (lv_bgicon_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-on-color' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'off-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'icons' otherlv_20= '[' ( (lv_icons_21_0= RULE_STRING ) )* otherlv_22= ']' )? (otherlv_23= 'onColors' otherlv_24= '[' ( (otherlv_25= RULE_ID ) )* otherlv_26= ']' )? (otherlv_27= 'onBackgroundColors' otherlv_28= '[' ( (otherlv_29= RULE_ID ) )* otherlv_30= ']' )? otherlv_31= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1508:1: (otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) )* )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'background-icon' ( (lv_bgicon_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-on-color' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'off-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'icons' otherlv_20= '[' ( (lv_icons_21_0= RULE_STRING ) )* otherlv_22= ']' )? (otherlv_23= 'onColors' otherlv_24= '[' ( (otherlv_25= RULE_ID ) )* otherlv_26= ']' )? (otherlv_27= 'onBackgroundColors' otherlv_28= '[' ( (otherlv_29= RULE_ID ) )* otherlv_30= ']' )? otherlv_31= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1508:3: otherlv_0= 'symbol' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'getOn' ( (lv_getOn_6_0= RULE_STRING ) )* (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) )* )? (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )? (otherlv_11= 'background-icon' ( (lv_bgicon_12_0= RULE_STRING ) ) )? (otherlv_13= 'background-on-color' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= 'on-color' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= 'off-color' ( (otherlv_18= RULE_ID ) ) )? (otherlv_19= 'icons' otherlv_20= '[' ( (lv_icons_21_0= RULE_STRING ) )* otherlv_22= ']' )? (otherlv_23= 'onColors' otherlv_24= '[' ( (otherlv_25= RULE_ID ) )* otherlv_26= ']' )? (otherlv_27= 'onBackgroundColors' otherlv_28= '[' ( (otherlv_29= RULE_ID ) )* otherlv_30= ']' )? otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleSymbol3156); 

                	newLeafNode(otherlv_0, grammarAccess.getSymbolAccess().getSymbolKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSymbol3168); 

                	newLeafNode(otherlv_1, grammarAccess.getSymbolAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1516:1: ( (lv_device_2_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1517:1: (lv_device_2_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1517:1: (lv_device_2_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1518:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSymbol3185); 

            			newLeafNode(lv_device_2_0, grammarAccess.getSymbolAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleSymbol3202); 

                	newLeafNode(otherlv_3, grammarAccess.getSymbolAccess().getGetKeyword_3());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1538:1: ( (lv_get_4_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1539:1: (lv_get_4_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1539:1: (lv_get_4_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1540:3: lv_get_4_0= RULE_STRING
            {
            lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSymbol3219); 

            			newLeafNode(lv_get_4_0, grammarAccess.getSymbolAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"get",
                    		lv_get_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleSymbol3236); 

                	newLeafNode(otherlv_5, grammarAccess.getSymbolAccess().getGetOnKeyword_5());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1560:1: ( (lv_getOn_6_0= RULE_STRING ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1561:1: (lv_getOn_6_0= RULE_STRING )
            	    {
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1561:1: (lv_getOn_6_0= RULE_STRING )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1562:3: lv_getOn_6_0= RULE_STRING
            	    {
            	    lv_getOn_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSymbol3253); 

            	    			newLeafNode(lv_getOn_6_0, grammarAccess.getSymbolAccess().getGetOnSTRINGTerminalRuleCall_6_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSymbolRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"getOn",
            	            		lv_getOn_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1578:3: (otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1578:5: otherlv_7= 'getOff' ( (lv_getOff_8_0= RULE_STRING ) )*
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleSymbol3272); 

                        	newLeafNode(otherlv_7, grammarAccess.getSymbolAccess().getGetOffKeyword_7_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1582:1: ( (lv_getOff_8_0= RULE_STRING ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_STRING) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1583:1: (lv_getOff_8_0= RULE_STRING )
                    	    {
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1583:1: (lv_getOff_8_0= RULE_STRING )
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1584:3: lv_getOff_8_0= RULE_STRING
                    	    {
                    	    lv_getOff_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSymbol3289); 

                    	    			newLeafNode(lv_getOff_8_0, grammarAccess.getSymbolAccess().getGetOffSTRINGTerminalRuleCall_7_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"getOff",
                    	            		lv_getOff_8_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1600:5: (otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1600:7: otherlv_9= 'class' ( (lv_class_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleSymbol3310); 

                        	newLeafNode(otherlv_9, grammarAccess.getSymbolAccess().getClassKeyword_8_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1604:1: ( (lv_class_10_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1605:1: (lv_class_10_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1605:1: (lv_class_10_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1606:3: lv_class_10_0= RULE_STRING
                    {
                    lv_class_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSymbol3327); 

                    			newLeafNode(lv_class_10_0, grammarAccess.getSymbolAccess().getClassSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1622:4: (otherlv_11= 'background-icon' ( (lv_bgicon_12_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1622:6: otherlv_11= 'background-icon' ( (lv_bgicon_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleSymbol3347); 

                        	newLeafNode(otherlv_11, grammarAccess.getSymbolAccess().getBackgroundIconKeyword_9_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1626:1: ( (lv_bgicon_12_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1627:1: (lv_bgicon_12_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1627:1: (lv_bgicon_12_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1628:3: lv_bgicon_12_0= RULE_STRING
                    {
                    lv_bgicon_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSymbol3364); 

                    			newLeafNode(lv_bgicon_12_0, grammarAccess.getSymbolAccess().getBgiconSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bgicon",
                            		lv_bgicon_12_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1644:4: (otherlv_13= 'background-on-color' ( (otherlv_14= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1644:6: otherlv_13= 'background-on-color' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,38,FOLLOW_38_in_ruleSymbol3384); 

                        	newLeafNode(otherlv_13, grammarAccess.getSymbolAccess().getBackgroundOnColorKeyword_10_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1648:1: ( (otherlv_14= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1649:1: (otherlv_14= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1649:1: (otherlv_14= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1650:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbol3404); 

                    		newLeafNode(otherlv_14, grammarAccess.getSymbolAccess().getOnBackGroundColorColorCrossReference_10_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1661:4: (otherlv_15= 'on-color' ( (otherlv_16= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1661:6: otherlv_15= 'on-color' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,51,FOLLOW_51_in_ruleSymbol3419); 

                        	newLeafNode(otherlv_15, grammarAccess.getSymbolAccess().getOnColorKeyword_11_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1665:1: ( (otherlv_16= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1666:1: (otherlv_16= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1666:1: (otherlv_16= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1667:3: otherlv_16= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                            
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbol3439); 

                    		newLeafNode(otherlv_16, grammarAccess.getSymbolAccess().getOnColorColorCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1678:4: (otherlv_17= 'off-color' ( (otherlv_18= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==52) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1678:6: otherlv_17= 'off-color' ( (otherlv_18= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,52,FOLLOW_52_in_ruleSymbol3454); 

                        	newLeafNode(otherlv_17, grammarAccess.getSymbolAccess().getOffColorKeyword_12_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1682:1: ( (otherlv_18= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1683:1: (otherlv_18= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1683:1: (otherlv_18= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1684:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbol3474); 

                    		newLeafNode(otherlv_18, grammarAccess.getSymbolAccess().getOffColorColorCrossReference_12_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1695:4: (otherlv_19= 'icons' otherlv_20= '[' ( (lv_icons_21_0= RULE_STRING ) )* otherlv_22= ']' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1695:6: otherlv_19= 'icons' otherlv_20= '[' ( (lv_icons_21_0= RULE_STRING ) )* otherlv_22= ']'
                    {
                    otherlv_19=(Token)match(input,53,FOLLOW_53_in_ruleSymbol3489); 

                        	newLeafNode(otherlv_19, grammarAccess.getSymbolAccess().getIconsKeyword_13_0());
                        
                    otherlv_20=(Token)match(input,54,FOLLOW_54_in_ruleSymbol3501); 

                        	newLeafNode(otherlv_20, grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_13_1());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1703:1: ( (lv_icons_21_0= RULE_STRING ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_STRING) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1704:1: (lv_icons_21_0= RULE_STRING )
                    	    {
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1704:1: (lv_icons_21_0= RULE_STRING )
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1705:3: lv_icons_21_0= RULE_STRING
                    	    {
                    	    lv_icons_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSymbol3518); 

                    	    			newLeafNode(lv_icons_21_0, grammarAccess.getSymbolAccess().getIconsSTRINGTerminalRuleCall_13_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"icons",
                    	            		lv_icons_21_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,55,FOLLOW_55_in_ruleSymbol3536); 

                        	newLeafNode(otherlv_22, grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_13_3());
                        

                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1725:3: (otherlv_23= 'onColors' otherlv_24= '[' ( (otherlv_25= RULE_ID ) )* otherlv_26= ']' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1725:5: otherlv_23= 'onColors' otherlv_24= '[' ( (otherlv_25= RULE_ID ) )* otherlv_26= ']'
                    {
                    otherlv_23=(Token)match(input,56,FOLLOW_56_in_ruleSymbol3551); 

                        	newLeafNode(otherlv_23, grammarAccess.getSymbolAccess().getOnColorsKeyword_14_0());
                        
                    otherlv_24=(Token)match(input,54,FOLLOW_54_in_ruleSymbol3563); 

                        	newLeafNode(otherlv_24, grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_14_1());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1733:1: ( (otherlv_25= RULE_ID ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1734:1: (otherlv_25= RULE_ID )
                    	    {
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1734:1: (otherlv_25= RULE_ID )
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1735:3: otherlv_25= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	    	        }
                    	            
                    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbol3583); 

                    	    		newLeafNode(otherlv_25, grammarAccess.getSymbolAccess().getOnColorsColorCrossReference_14_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,55,FOLLOW_55_in_ruleSymbol3596); 

                        	newLeafNode(otherlv_26, grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_14_3());
                        

                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1750:3: (otherlv_27= 'onBackgroundColors' otherlv_28= '[' ( (otherlv_29= RULE_ID ) )* otherlv_30= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1750:5: otherlv_27= 'onBackgroundColors' otherlv_28= '[' ( (otherlv_29= RULE_ID ) )* otherlv_30= ']'
                    {
                    otherlv_27=(Token)match(input,57,FOLLOW_57_in_ruleSymbol3611); 

                        	newLeafNode(otherlv_27, grammarAccess.getSymbolAccess().getOnBackgroundColorsKeyword_15_0());
                        
                    otherlv_28=(Token)match(input,54,FOLLOW_54_in_ruleSymbol3623); 

                        	newLeafNode(otherlv_28, grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_15_1());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1758:1: ( (otherlv_29= RULE_ID ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1759:1: (otherlv_29= RULE_ID )
                    	    {
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1759:1: (otherlv_29= RULE_ID )
                    	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1760:3: otherlv_29= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSymbolRule());
                    	    	        }
                    	            
                    	    otherlv_29=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbol3643); 

                    	    		newLeafNode(otherlv_29, grammarAccess.getSymbolAccess().getOnBackgroundColorsColorCrossReference_15_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,55,FOLLOW_55_in_ruleSymbol3656); 

                        	newLeafNode(otherlv_30, grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_15_3());
                        

                    }
                    break;

            }

            otherlv_31=(Token)match(input,25,FOLLOW_25_in_ruleSymbol3670); 

                	newLeafNode(otherlv_31, grammarAccess.getSymbolAccess().getRightCurlyBracketKeyword_16());
                

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1787:1: entryRuleSimpleClock returns [EObject current=null] : iv_ruleSimpleClock= ruleSimpleClock EOF ;
    public final EObject entryRuleSimpleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleClock = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1788:2: (iv_ruleSimpleClock= ruleSimpleClock EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1789:2: iv_ruleSimpleClock= ruleSimpleClock EOF
            {
             newCompositeNode(grammarAccess.getSimpleClockRule()); 
            pushFollow(FOLLOW_ruleSimpleClock_in_entryRuleSimpleClock3706);
            iv_ruleSimpleClock=ruleSimpleClock();

            state._fsp--;

             current =iv_ruleSimpleClock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleClock3716); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1796:1: ruleSimpleClock returns [EObject current=null] : (otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' ) ;
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
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1799:28: ( (otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1800:1: (otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1800:1: (otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1800:3: otherlv_0= 'SimpleClock' otherlv_1= '{' ( (lv_id_2_0= RULE_ID ) )? otherlv_3= 'date-format' ( (lv_dateFormat_4_0= RULE_STRING ) ) otherlv_5= 'time-format' ( (lv_timeFormat_6_0= RULE_STRING ) ) (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )? (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )? (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleSimpleClock3753); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleClockAccess().getSimpleClockKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSimpleClock3765); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleClockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1808:1: ( (lv_id_2_0= RULE_ID ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1809:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1809:1: (lv_id_2_0= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1810:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleClock3782); 

                    			newLeafNode(lv_id_2_0, grammarAccess.getSimpleClockAccess().getIdIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleSimpleClock3800); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleClockAccess().getDateFormatKeyword_3());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1830:1: ( (lv_dateFormat_4_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1831:1: (lv_dateFormat_4_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1831:1: (lv_dateFormat_4_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1832:3: lv_dateFormat_4_0= RULE_STRING
            {
            lv_dateFormat_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleClock3817); 

            			newLeafNode(lv_dateFormat_4_0, grammarAccess.getSimpleClockAccess().getDateFormatSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleClockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dateFormat",
                    		lv_dateFormat_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,60,FOLLOW_60_in_ruleSimpleClock3834); 

                	newLeafNode(otherlv_5, grammarAccess.getSimpleClockAccess().getTimeFormatKeyword_5());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1852:1: ( (lv_timeFormat_6_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1853:1: (lv_timeFormat_6_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1853:1: (lv_timeFormat_6_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1854:3: lv_timeFormat_6_0= RULE_STRING
            {
            lv_timeFormat_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleClock3851); 

            			newLeafNode(lv_timeFormat_6_0, grammarAccess.getSimpleClockAccess().getTimeFormatSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleClockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timeFormat",
                    		lv_timeFormat_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1870:2: (otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1870:4: otherlv_7= 'date-color' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_61_in_ruleSimpleClock3869); 

                        	newLeafNode(otherlv_7, grammarAccess.getSimpleClockAccess().getDateColorKeyword_7_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1874:1: ( (otherlv_8= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1875:1: (otherlv_8= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1875:1: (otherlv_8= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1876:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleClock3889); 

                    		newLeafNode(otherlv_8, grammarAccess.getSimpleClockAccess().getDateColorColorCrossReference_7_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1887:4: (otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1887:6: otherlv_9= 'time-color' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,62,FOLLOW_62_in_ruleSimpleClock3904); 

                        	newLeafNode(otherlv_9, grammarAccess.getSimpleClockAccess().getTimeColorKeyword_8_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1891:1: ( (otherlv_10= RULE_ID ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1892:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1892:1: (otherlv_10= RULE_ID )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1893:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleClock3924); 

                    		newLeafNode(otherlv_10, grammarAccess.getSimpleClockAccess().getTimeColorColorCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1904:4: (otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1904:6: otherlv_11= 'class' ( (lv_class_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleSimpleClock3939); 

                        	newLeafNode(otherlv_11, grammarAccess.getSimpleClockAccess().getClassKeyword_9_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1908:1: ( (lv_class_12_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1909:1: (lv_class_12_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1909:1: (lv_class_12_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1910:3: lv_class_12_0= RULE_STRING
                    {
                    lv_class_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleClock3956); 

                    			newLeafNode(lv_class_12_0, grammarAccess.getSimpleClockAccess().getClassSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"class",
                            		lv_class_12_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1926:4: (otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==63) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1926:6: otherlv_13= 'style' ( (lv_style_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,63,FOLLOW_63_in_ruleSimpleClock3976); 

                        	newLeafNode(otherlv_13, grammarAccess.getSimpleClockAccess().getStyleKeyword_10_0());
                        
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1930:1: ( (lv_style_14_0= RULE_STRING ) )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1931:1: (lv_style_14_0= RULE_STRING )
                    {
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1931:1: (lv_style_14_0= RULE_STRING )
                    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1932:3: lv_style_14_0= RULE_STRING
                    {
                    lv_style_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleClock3993); 

                    			newLeafNode(lv_style_14_0, grammarAccess.getSimpleClockAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleClockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"style",
                            		lv_style_14_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1948:4: (otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==64) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1948:6: otherlv_15= 'bg-colors' ( (otherlv_16= RULE_ID ) )
            	    {
            	    otherlv_15=(Token)match(input,64,FOLLOW_64_in_ruleSimpleClock4013); 

            	        	newLeafNode(otherlv_15, grammarAccess.getSimpleClockAccess().getBgColorsKeyword_11_0());
            	        
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1952:1: ( (otherlv_16= RULE_ID ) )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1953:1: (otherlv_16= RULE_ID )
            	    {
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1953:1: (otherlv_16= RULE_ID )
            	    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1954:3: otherlv_16= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSimpleClockRule());
            	    	        }
            	            
            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleClock4033); 

            	    		newLeafNode(otherlv_16, grammarAccess.getSimpleClockAccess().getBgColorsColorCrossReference_11_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_17=(Token)match(input,25,FOLLOW_25_in_ruleSimpleClock4047); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1977:1: entryRuleSimpleChart returns [EObject current=null] : iv_ruleSimpleChart= ruleSimpleChart EOF ;
    public final EObject entryRuleSimpleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleChart = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1978:2: (iv_ruleSimpleChart= ruleSimpleChart EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1979:2: iv_ruleSimpleChart= ruleSimpleChart EOF
            {
             newCompositeNode(grammarAccess.getSimpleChartRule()); 
            pushFollow(FOLLOW_ruleSimpleChart_in_entryRuleSimpleChart4083);
            iv_ruleSimpleChart=ruleSimpleChart();

            state._fsp--;

             current =iv_ruleSimpleChart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleChart4093); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1986:1: ruleSimpleChart returns [EObject current=null] : (otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}' ) ;
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
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1989:28: ( (otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1990:1: (otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1990:1: (otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1990:3: otherlv_0= 'simpleChart' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'log-config' ( (lv_log_device_4_0= RULE_STRING ) ) ( (lv_logfile_5_0= RULE_STRING ) ) otherlv_6= 'columnSpec' ( (lv_columnSpec_7_0= RULE_STRING ) ) otherlv_8= 'minValue' ( (lv_min_9_0= RULE_STRING ) ) otherlv_10= 'maxValue' ( (lv_max_11_0= RULE_STRING ) ) otherlv_12= 'xTicks' ( (lv_xTicks_13_0= RULE_INT ) ) otherlv_14= 'yTicks' ( (lv_yTicks_15_0= RULE_INT ) ) otherlv_16= 'daysago' ( (lv_daysago_17_0= RULE_INT ) ) otherlv_18= 'class' ( (lv_class_19_0= RULE_STRING ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleSimpleChart4130); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleChartAccess().getSimpleChartKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSimpleChart4142); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleChartAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1998:1: ( (lv_device_2_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1999:1: (lv_device_2_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:1999:1: (lv_device_2_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2000:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleChart4159); 

            			newLeafNode(lv_device_2_0, grammarAccess.getSimpleChartAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleSimpleChart4176); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleChartAccess().getLogConfigKeyword_3());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2020:1: ( (lv_log_device_4_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2021:1: (lv_log_device_4_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2021:1: (lv_log_device_4_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2022:3: lv_log_device_4_0= RULE_STRING
            {
            lv_log_device_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleChart4193); 

            			newLeafNode(lv_log_device_4_0, grammarAccess.getSimpleChartAccess().getLog_deviceSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"log_device",
                    		lv_log_device_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2038:2: ( (lv_logfile_5_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2039:1: (lv_logfile_5_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2039:1: (lv_logfile_5_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2040:3: lv_logfile_5_0= RULE_STRING
            {
            lv_logfile_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleChart4215); 

            			newLeafNode(lv_logfile_5_0, grammarAccess.getSimpleChartAccess().getLogfileSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"logfile",
                    		lv_logfile_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,67,FOLLOW_67_in_ruleSimpleChart4232); 

                	newLeafNode(otherlv_6, grammarAccess.getSimpleChartAccess().getColumnSpecKeyword_6());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2060:1: ( (lv_columnSpec_7_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2061:1: (lv_columnSpec_7_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2061:1: (lv_columnSpec_7_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2062:3: lv_columnSpec_7_0= RULE_STRING
            {
            lv_columnSpec_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleChart4249); 

            			newLeafNode(lv_columnSpec_7_0, grammarAccess.getSimpleChartAccess().getColumnSpecSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"columnSpec",
                    		lv_columnSpec_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,68,FOLLOW_68_in_ruleSimpleChart4266); 

                	newLeafNode(otherlv_8, grammarAccess.getSimpleChartAccess().getMinValueKeyword_8());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2082:1: ( (lv_min_9_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2083:1: (lv_min_9_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2083:1: (lv_min_9_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2084:3: lv_min_9_0= RULE_STRING
            {
            lv_min_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleChart4283); 

            			newLeafNode(lv_min_9_0, grammarAccess.getSimpleChartAccess().getMinSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"min",
                    		lv_min_9_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_10=(Token)match(input,69,FOLLOW_69_in_ruleSimpleChart4300); 

                	newLeafNode(otherlv_10, grammarAccess.getSimpleChartAccess().getMaxValueKeyword_10());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2104:1: ( (lv_max_11_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2105:1: (lv_max_11_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2105:1: (lv_max_11_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2106:3: lv_max_11_0= RULE_STRING
            {
            lv_max_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleChart4317); 

            			newLeafNode(lv_max_11_0, grammarAccess.getSimpleChartAccess().getMaxSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"max",
                    		lv_max_11_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,70,FOLLOW_70_in_ruleSimpleChart4334); 

                	newLeafNode(otherlv_12, grammarAccess.getSimpleChartAccess().getXTicksKeyword_12());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2126:1: ( (lv_xTicks_13_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2127:1: (lv_xTicks_13_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2127:1: (lv_xTicks_13_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2128:3: lv_xTicks_13_0= RULE_INT
            {
            lv_xTicks_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSimpleChart4351); 

            			newLeafNode(lv_xTicks_13_0, grammarAccess.getSimpleChartAccess().getXTicksINTTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"xTicks",
                    		lv_xTicks_13_0, 
                    		"INT");
            	    

            }


            }

            otherlv_14=(Token)match(input,71,FOLLOW_71_in_ruleSimpleChart4368); 

                	newLeafNode(otherlv_14, grammarAccess.getSimpleChartAccess().getYTicksKeyword_14());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2148:1: ( (lv_yTicks_15_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2149:1: (lv_yTicks_15_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2149:1: (lv_yTicks_15_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2150:3: lv_yTicks_15_0= RULE_INT
            {
            lv_yTicks_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSimpleChart4385); 

            			newLeafNode(lv_yTicks_15_0, grammarAccess.getSimpleChartAccess().getYTicksINTTerminalRuleCall_15_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"yTicks",
                    		lv_yTicks_15_0, 
                    		"INT");
            	    

            }


            }

            otherlv_16=(Token)match(input,72,FOLLOW_72_in_ruleSimpleChart4402); 

                	newLeafNode(otherlv_16, grammarAccess.getSimpleChartAccess().getDaysagoKeyword_16());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2170:1: ( (lv_daysago_17_0= RULE_INT ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2171:1: (lv_daysago_17_0= RULE_INT )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2171:1: (lv_daysago_17_0= RULE_INT )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2172:3: lv_daysago_17_0= RULE_INT
            {
            lv_daysago_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSimpleChart4419); 

            			newLeafNode(lv_daysago_17_0, grammarAccess.getSimpleChartAccess().getDaysagoINTTerminalRuleCall_17_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"daysago",
                    		lv_daysago_17_0, 
                    		"INT");
            	    

            }


            }

            otherlv_18=(Token)match(input,35,FOLLOW_35_in_ruleSimpleChart4436); 

                	newLeafNode(otherlv_18, grammarAccess.getSimpleChartAccess().getClassKeyword_18());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2192:1: ( (lv_class_19_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2193:1: (lv_class_19_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2193:1: (lv_class_19_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2194:3: lv_class_19_0= RULE_STRING
            {
            lv_class_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleChart4453); 

            			newLeafNode(lv_class_19_0, grammarAccess.getSimpleChartAccess().getClassSTRINGTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleChartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_19_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleSimpleChart4470); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2222:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2223:2: (iv_ruleColor= ruleColor EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2224:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor4506);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor4516); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2231:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_rgb_2_0=null;

         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2234:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) ) ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2235:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) ) )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2235:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2235:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rgb_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleColor4553); 

                	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2239:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2240:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2240:1: (lv_name_1_0= RULE_ID )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2241:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColor4570); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2257:2: ( (lv_rgb_2_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2258:1: (lv_rgb_2_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2258:1: (lv_rgb_2_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2259:3: lv_rgb_2_0= RULE_STRING
            {
            lv_rgb_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleColor4592); 

            			newLeafNode(lv_rgb_2_0, grammarAccess.getColorAccess().getRgbSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rgb",
                    		lv_rgb_2_0, 
                    		"STRING");
            	    

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2283:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2284:2: (iv_ruleLabel= ruleLabel EOF )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2285:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel4633);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel4643); 

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
    // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2292:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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

         enterRule(); 
            
        try {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2295:28: ( (otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2296:1: (otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2296:1: (otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2296:3: otherlv_0= 'label' otherlv_1= '{' ( (lv_device_2_0= RULE_STRING ) ) otherlv_3= 'get' ( (lv_get_4_0= RULE_STRING ) ) otherlv_5= 'class' ( (lv_class_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleLabel4680); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleLabel4692); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2304:1: ( (lv_device_2_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2305:1: (lv_device_2_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2305:1: (lv_device_2_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2306:3: lv_device_2_0= RULE_STRING
            {
            lv_device_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel4709); 

            			newLeafNode(lv_device_2_0, grammarAccess.getLabelAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"device",
                    		lv_device_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleLabel4726); 

                	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getGetKeyword_3());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2326:1: ( (lv_get_4_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2327:1: (lv_get_4_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2327:1: (lv_get_4_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2328:3: lv_get_4_0= RULE_STRING
            {
            lv_get_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel4743); 

            			newLeafNode(lv_get_4_0, grammarAccess.getLabelAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"get",
                    		lv_get_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleLabel4760); 

                	newLeafNode(otherlv_5, grammarAccess.getLabelAccess().getClassKeyword_5());
                
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2348:1: ( (lv_class_6_0= RULE_STRING ) )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2349:1: (lv_class_6_0= RULE_STRING )
            {
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2349:1: (lv_class_6_0= RULE_STRING )
            // ../org.ckr.tabletui/src-gen/org/ckr/parser/antlr/internal/InternalTabletUIDSL.g:2350:3: lv_class_6_0= RULE_STRING
            {
            lv_class_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel4777); 

            			newLeafNode(lv_class_6_0, grammarAccess.getLabelAccess().getClassSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleLabel4794); 

                	newLeafNode(otherlv_7, grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_7());
                

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


 

    public static final BitSet FOLLOW_ruleTabletUI_in_entryRuleTabletUI75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabletUI85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSettings_in_ruleTabletUI131 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleTabletUI152 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleSettings_in_entryRuleSettings189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSettings199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSettings236 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSettings248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSettings265 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSettings283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSettings300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSettings319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSettings336 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSettings353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSettings370 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSettings387 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSettings404 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSettings421 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSettings438 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleSettings456 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleSettings477 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSettings491 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleBOOL_in_ruleSettings512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSettings524 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSettings541 = new BitSet(new long[]{0x0001000000200002L});
    public static final BitSet FOLLOW_ruleSettingsElement_in_ruleSettings567 = new BitSet(new long[]{0x0001000000200002L});
    public static final BitSet FOLLOW_ruleSettingsElement_in_entryRuleSettingsElement604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSettingsElement614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSS_in_ruleSettingsElement661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_ruleSettingsElement688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSS_in_entryRuleCSS723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSS733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCSS770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCSS787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_ruleAbstractElement884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBOOL968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBOOL987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage1079 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePage1096 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleGridster_in_rulePage1117 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_rulePage1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridster_in_entryRuleGridster1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGridster1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGridster1213 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleGridster1226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGridster1243 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleGridster1262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGridster1279 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGridster1296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGridster1313 = new BitSet(new long[]{0x04054600E3200000L,0x0000000000000202L});
    public static final BitSet FOLLOW_29_in_ruleGridster1331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGridster1348 = new BitSet(new long[]{0x04054600C3200000L,0x0000000000000202L});
    public static final BitSet FOLLOW_30_in_ruleGridster1368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGridster1385 = new BitSet(new long[]{0x0405460083200000L,0x0000000000000202L});
    public static final BitSet FOLLOW_ruleColor_in_ruleGridster1413 = new BitSet(new long[]{0x0405460083200000L,0x0000000000000202L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleGridster1435 = new BitSet(new long[]{0x0404460083000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_25_in_ruleGridster1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleWidget1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleWidget1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleWidget1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClock_in_ruleWidget1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_ruleWidget1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalview_in_ruleWidget1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleChart_in_ruleWidget1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustom_in_ruleWidget1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiv_in_ruleWidget1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSwitch1839 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSwitch1851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSwitch1868 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_32_in_ruleSwitch1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSwitch1903 = new BitSet(new long[]{0x000001FE02000000L});
    public static final BitSet FOLLOW_33_in_ruleSwitch1923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSwitch1940 = new BitSet(new long[]{0x000001FC02000000L});
    public static final BitSet FOLLOW_34_in_ruleSwitch1960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSwitch1977 = new BitSet(new long[]{0x000001F802000000L});
    public static final BitSet FOLLOW_35_in_ruleSwitch1997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSwitch2014 = new BitSet(new long[]{0x000001F002000000L});
    public static final BitSet FOLLOW_36_in_ruleSwitch2034 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitch2054 = new BitSet(new long[]{0x000001E002000000L});
    public static final BitSet FOLLOW_37_in_ruleSwitch2069 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitch2089 = new BitSet(new long[]{0x000001C002000000L});
    public static final BitSet FOLLOW_38_in_ruleSwitch2104 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitch2124 = new BitSet(new long[]{0x0000018002000000L});
    public static final BitSet FOLLOW_39_in_ruleSwitch2139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSwitch2156 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitch2176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSwitch2193 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSwitch2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustom_in_entryRuleCustom2248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustom2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCustom2295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustom2312 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCustom2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiv_in_entryRuleDiv2365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiv2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDiv2412 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDiv2424 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDiv2436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDiv2453 = new BitSet(new long[]{0x0404460083000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleDiv2479 = new BitSet(new long[]{0x0404460083000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_25_in_ruleDiv2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalview_in_entryRuleCalview2528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalview2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCalview2575 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCalview2587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCalview2604 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCalview2621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCalview2638 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleCalview2655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCalview2672 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCalview2689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCalview2706 = new BitSet(new long[]{0x0000300002000000L});
    public static final BitSet FOLLOW_44_in_ruleCalview2724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalview2744 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_45_in_ruleCalview2759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCalview2779 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCalview2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton2829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleButton2876 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleButton2888 = new BitSet(new long[]{0x0000810000000000L});
    public static final BitSet FOLLOW_47_in_ruleButton2901 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton2921 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleButton2935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton2952 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleButton2969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton2986 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_48_in_ruleButton3004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton3024 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_49_in_ruleButton3039 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton3059 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleButton3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol3109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSymbol3156 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSymbol3168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSymbol3185 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSymbol3202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSymbol3219 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSymbol3236 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSymbol3253 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_34_in_ruleSymbol3272 = new BitSet(new long[]{0x033800C802000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSymbol3289 = new BitSet(new long[]{0x033800C802000010L});
    public static final BitSet FOLLOW_35_in_ruleSymbol3310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSymbol3327 = new BitSet(new long[]{0x033800C002000000L});
    public static final BitSet FOLLOW_39_in_ruleSymbol3347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSymbol3364 = new BitSet(new long[]{0x0338004002000000L});
    public static final BitSet FOLLOW_38_in_ruleSymbol3384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbol3404 = new BitSet(new long[]{0x0338000002000000L});
    public static final BitSet FOLLOW_51_in_ruleSymbol3419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbol3439 = new BitSet(new long[]{0x0330000002000000L});
    public static final BitSet FOLLOW_52_in_ruleSymbol3454 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbol3474 = new BitSet(new long[]{0x0320000002000000L});
    public static final BitSet FOLLOW_53_in_ruleSymbol3489 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSymbol3501 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSymbol3518 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_55_in_ruleSymbol3536 = new BitSet(new long[]{0x0300000002000000L});
    public static final BitSet FOLLOW_56_in_ruleSymbol3551 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSymbol3563 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbol3583 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_55_in_ruleSymbol3596 = new BitSet(new long[]{0x0200000002000000L});
    public static final BitSet FOLLOW_57_in_ruleSymbol3611 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSymbol3623 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbol3643 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_55_in_ruleSymbol3656 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSymbol3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClock_in_entryRuleSimpleClock3706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClock3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSimpleClock3753 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSimpleClock3765 = new BitSet(new long[]{0x0800000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleClock3782 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleSimpleClock3800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleClock3817 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleSimpleClock3834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleClock3851 = new BitSet(new long[]{0xE000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61_in_ruleSimpleClock3869 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleClock3889 = new BitSet(new long[]{0xC000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62_in_ruleSimpleClock3904 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleClock3924 = new BitSet(new long[]{0x8000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35_in_ruleSimpleClock3939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleClock3956 = new BitSet(new long[]{0x8000000002000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleSimpleClock3976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleClock3993 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleSimpleClock4013 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleClock4033 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_25_in_ruleSimpleClock4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleChart_in_entryRuleSimpleChart4083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleChart4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSimpleChart4130 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSimpleChart4142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleChart4159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleSimpleChart4176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleChart4193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleChart4215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSimpleChart4232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleChart4249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleSimpleChart4266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleChart4283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSimpleChart4300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleChart4317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleSimpleChart4334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleChart4351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleSimpleChart4368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleChart4385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleSimpleChart4402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleChart4419 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSimpleChart4436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleChart4453 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSimpleChart4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor4506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleColor4553 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColor4570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleColor4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel4633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleLabel4680 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLabel4692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel4709 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLabel4726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel4743 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleLabel4760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel4777 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLabel4794 = new BitSet(new long[]{0x0000000000000002L});

}