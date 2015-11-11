package org.ckr.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.ckr.services.TabletUIDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTabletUIDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'settings'", "'title'", "'width'", "'height'", "'columns'", "'rows'", "'drag&drop'", "'gridster_margin'", "'fhemweb_url'", "'debug'", "'css'", "'{'", "'}'", "'row'", "'column'", "'header'", "'colspan'", "'rowspan'", "'calview'", "'get'", "'max'", "'class'", "'all-forecast-color'", "'all-today-color'", "'button'", "'icon'", "'url'", "'color'", "'background-color'", "'symbol'", "'getOn'", "'getOff'", "'background-icon'", "'background-on-color'", "'on-color'", "'off-color'", "'icons'", "'['", "']'", "'onColors'", "'onBackgroundColors'", "'SimpleClock'", "'date-format'", "'time-format'", "'date-color'", "'time-color'", "'style'", "'bg-colors'", "'simpleChart'", "'log-config'", "'columnSpec'", "'minValue'", "'maxValue'", "'xTicks'", "'yTicks'", "'daysago'", "'label {'"
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
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
    public String getGrammarFileName() { return "../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g"; }


     
     	private TabletUIDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TabletUIDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTabletUI"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:60:1: entryRuleTabletUI : ruleTabletUI EOF ;
    public final void entryRuleTabletUI() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:61:1: ( ruleTabletUI EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:62:1: ruleTabletUI EOF
            {
             before(grammarAccess.getTabletUIRule()); 
            pushFollow(FOLLOW_ruleTabletUI_in_entryRuleTabletUI61);
            ruleTabletUI();

            state._fsp--;

             after(grammarAccess.getTabletUIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTabletUI68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTabletUI"


    // $ANTLR start "ruleTabletUI"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:69:1: ruleTabletUI : ( ( rule__TabletUI__Group__0 ) ) ;
    public final void ruleTabletUI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:73:2: ( ( ( rule__TabletUI__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:74:1: ( ( rule__TabletUI__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:74:1: ( ( rule__TabletUI__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:75:1: ( rule__TabletUI__Group__0 )
            {
             before(grammarAccess.getTabletUIAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:76:1: ( rule__TabletUI__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:76:2: rule__TabletUI__Group__0
            {
            pushFollow(FOLLOW_rule__TabletUI__Group__0_in_ruleTabletUI94);
            rule__TabletUI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTabletUIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTabletUI"


    // $ANTLR start "entryRuleSettings"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:88:1: entryRuleSettings : ruleSettings EOF ;
    public final void entryRuleSettings() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:89:1: ( ruleSettings EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:90:1: ruleSettings EOF
            {
             before(grammarAccess.getSettingsRule()); 
            pushFollow(FOLLOW_ruleSettings_in_entryRuleSettings121);
            ruleSettings();

            state._fsp--;

             after(grammarAccess.getSettingsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSettings128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSettings"


    // $ANTLR start "ruleSettings"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:97:1: ruleSettings : ( ( rule__Settings__Group__0 ) ) ;
    public final void ruleSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:101:2: ( ( ( rule__Settings__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:102:1: ( ( rule__Settings__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:102:1: ( ( rule__Settings__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:103:1: ( rule__Settings__Group__0 )
            {
             before(grammarAccess.getSettingsAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:104:1: ( rule__Settings__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:104:2: rule__Settings__Group__0
            {
            pushFollow(FOLLOW_rule__Settings__Group__0_in_ruleSettings154);
            rule__Settings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSettings"


    // $ANTLR start "entryRuleSettingsElement"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:116:1: entryRuleSettingsElement : ruleSettingsElement EOF ;
    public final void entryRuleSettingsElement() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:117:1: ( ruleSettingsElement EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:118:1: ruleSettingsElement EOF
            {
             before(grammarAccess.getSettingsElementRule()); 
            pushFollow(FOLLOW_ruleSettingsElement_in_entryRuleSettingsElement181);
            ruleSettingsElement();

            state._fsp--;

             after(grammarAccess.getSettingsElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSettingsElement188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSettingsElement"


    // $ANTLR start "ruleSettingsElement"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:125:1: ruleSettingsElement : ( ( rule__SettingsElement__Alternatives ) ) ;
    public final void ruleSettingsElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:129:2: ( ( ( rule__SettingsElement__Alternatives ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:130:1: ( ( rule__SettingsElement__Alternatives ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:130:1: ( ( rule__SettingsElement__Alternatives ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:131:1: ( rule__SettingsElement__Alternatives )
            {
             before(grammarAccess.getSettingsElementAccess().getAlternatives()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:132:1: ( rule__SettingsElement__Alternatives )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:132:2: rule__SettingsElement__Alternatives
            {
            pushFollow(FOLLOW_rule__SettingsElement__Alternatives_in_ruleSettingsElement214);
            rule__SettingsElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSettingsElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSettingsElement"


    // $ANTLR start "entryRuleCSS"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:144:1: entryRuleCSS : ruleCSS EOF ;
    public final void entryRuleCSS() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:145:1: ( ruleCSS EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:146:1: ruleCSS EOF
            {
             before(grammarAccess.getCSSRule()); 
            pushFollow(FOLLOW_ruleCSS_in_entryRuleCSS241);
            ruleCSS();

            state._fsp--;

             after(grammarAccess.getCSSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSS248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSS"


    // $ANTLR start "ruleCSS"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:153:1: ruleCSS : ( ( rule__CSS__Group__0 ) ) ;
    public final void ruleCSS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:157:2: ( ( ( rule__CSS__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:158:1: ( ( rule__CSS__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:158:1: ( ( rule__CSS__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:159:1: ( rule__CSS__Group__0 )
            {
             before(grammarAccess.getCSSAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:160:1: ( rule__CSS__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:160:2: rule__CSS__Group__0
            {
            pushFollow(FOLLOW_rule__CSS__Group__0_in_ruleCSS274);
            rule__CSS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSS"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:172:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:173:1: ( ruleAbstractElement EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:174:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement301);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:181:1: ruleAbstractElement : ( rulePage ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:185:2: ( ( rulePage ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:186:1: ( rulePage )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:186:1: ( rulePage )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:187:1: rulePage
            {
             before(grammarAccess.getAbstractElementAccess().getPageParserRuleCall()); 
            pushFollow(FOLLOW_rulePage_in_ruleAbstractElement334);
            rulePage();

            state._fsp--;

             after(grammarAccess.getAbstractElementAccess().getPageParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleBOOL"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:200:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:201:1: ( ruleBOOL EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:202:1: ruleBOOL EOF
            {
             before(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL360);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getBOOLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:209:1: ruleBOOL : ( ( rule__BOOL__Alternatives ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:213:2: ( ( ( rule__BOOL__Alternatives ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:214:1: ( ( rule__BOOL__Alternatives ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:214:1: ( ( rule__BOOL__Alternatives ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:215:1: ( rule__BOOL__Alternatives )
            {
             before(grammarAccess.getBOOLAccess().getAlternatives()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:216:1: ( rule__BOOL__Alternatives )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:216:2: rule__BOOL__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL393);
            rule__BOOL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRulePage"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:228:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:229:1: ( rulePage EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:230:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage420);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:237:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:241:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:242:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:242:1: ( ( rule__Page__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:243:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:244:1: ( rule__Page__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:244:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage453);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleGridster"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:256:1: entryRuleGridster : ruleGridster EOF ;
    public final void entryRuleGridster() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:257:1: ( ruleGridster EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:258:1: ruleGridster EOF
            {
             before(grammarAccess.getGridsterRule()); 
            pushFollow(FOLLOW_ruleGridster_in_entryRuleGridster480);
            ruleGridster();

            state._fsp--;

             after(grammarAccess.getGridsterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGridster487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGridster"


    // $ANTLR start "ruleGridster"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:265:1: ruleGridster : ( ( rule__Gridster__Group__0 ) ) ;
    public final void ruleGridster() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:269:2: ( ( ( rule__Gridster__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:270:1: ( ( rule__Gridster__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:270:1: ( ( rule__Gridster__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:271:1: ( rule__Gridster__Group__0 )
            {
             before(grammarAccess.getGridsterAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:272:1: ( rule__Gridster__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:272:2: rule__Gridster__Group__0
            {
            pushFollow(FOLLOW_rule__Gridster__Group__0_in_ruleGridster513);
            rule__Gridster__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridsterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGridster"


    // $ANTLR start "entryRuleWidget"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:284:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:285:1: ( ruleWidget EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:286:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget540);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:293:1: ruleWidget : ( ( rule__Widget__Alternatives ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:297:2: ( ( ( rule__Widget__Alternatives ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:298:1: ( ( rule__Widget__Alternatives ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:298:1: ( ( rule__Widget__Alternatives ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:299:1: ( rule__Widget__Alternatives )
            {
             before(grammarAccess.getWidgetAccess().getAlternatives()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:300:1: ( rule__Widget__Alternatives )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:300:2: rule__Widget__Alternatives
            {
            pushFollow(FOLLOW_rule__Widget__Alternatives_in_ruleWidget573);
            rule__Widget__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleCalview"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:314:1: entryRuleCalview : ruleCalview EOF ;
    public final void entryRuleCalview() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:315:1: ( ruleCalview EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:316:1: ruleCalview EOF
            {
             before(grammarAccess.getCalviewRule()); 
            pushFollow(FOLLOW_ruleCalview_in_entryRuleCalview602);
            ruleCalview();

            state._fsp--;

             after(grammarAccess.getCalviewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalview609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalview"


    // $ANTLR start "ruleCalview"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:323:1: ruleCalview : ( ( rule__Calview__Group__0 ) ) ;
    public final void ruleCalview() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:327:2: ( ( ( rule__Calview__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:328:1: ( ( rule__Calview__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:328:1: ( ( rule__Calview__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:329:1: ( rule__Calview__Group__0 )
            {
             before(grammarAccess.getCalviewAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:330:1: ( rule__Calview__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:330:2: rule__Calview__Group__0
            {
            pushFollow(FOLLOW_rule__Calview__Group__0_in_ruleCalview635);
            rule__Calview__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalviewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalview"


    // $ANTLR start "entryRuleButton"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:342:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:343:1: ( ruleButton EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:344:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton662);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:351:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:355:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:356:1: ( ( rule__Button__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:356:1: ( ( rule__Button__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:357:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:358:1: ( rule__Button__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:358:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton695);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleSymbol"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:370:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:371:1: ( ruleSymbol EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:372:1: ruleSymbol EOF
            {
             before(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol722);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:379:1: ruleSymbol : ( ( rule__Symbol__Group__0 ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:383:2: ( ( ( rule__Symbol__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:384:1: ( ( rule__Symbol__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:384:1: ( ( rule__Symbol__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:385:1: ( rule__Symbol__Group__0 )
            {
             before(grammarAccess.getSymbolAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:386:1: ( rule__Symbol__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:386:2: rule__Symbol__Group__0
            {
            pushFollow(FOLLOW_rule__Symbol__Group__0_in_ruleSymbol755);
            rule__Symbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleSimpleClock"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:398:1: entryRuleSimpleClock : ruleSimpleClock EOF ;
    public final void entryRuleSimpleClock() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:399:1: ( ruleSimpleClock EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:400:1: ruleSimpleClock EOF
            {
             before(grammarAccess.getSimpleClockRule()); 
            pushFollow(FOLLOW_ruleSimpleClock_in_entryRuleSimpleClock782);
            ruleSimpleClock();

            state._fsp--;

             after(grammarAccess.getSimpleClockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleClock789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleClock"


    // $ANTLR start "ruleSimpleClock"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:407:1: ruleSimpleClock : ( ( rule__SimpleClock__Group__0 ) ) ;
    public final void ruleSimpleClock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:411:2: ( ( ( rule__SimpleClock__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:412:1: ( ( rule__SimpleClock__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:412:1: ( ( rule__SimpleClock__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:413:1: ( rule__SimpleClock__Group__0 )
            {
             before(grammarAccess.getSimpleClockAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:414:1: ( rule__SimpleClock__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:414:2: rule__SimpleClock__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__0_in_ruleSimpleClock815);
            rule__SimpleClock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleClock"


    // $ANTLR start "entryRuleSimpleChart"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:426:1: entryRuleSimpleChart : ruleSimpleChart EOF ;
    public final void entryRuleSimpleChart() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:427:1: ( ruleSimpleChart EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:428:1: ruleSimpleChart EOF
            {
             before(grammarAccess.getSimpleChartRule()); 
            pushFollow(FOLLOW_ruleSimpleChart_in_entryRuleSimpleChart842);
            ruleSimpleChart();

            state._fsp--;

             after(grammarAccess.getSimpleChartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleChart849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleChart"


    // $ANTLR start "ruleSimpleChart"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:435:1: ruleSimpleChart : ( ( rule__SimpleChart__Group__0 ) ) ;
    public final void ruleSimpleChart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:439:2: ( ( ( rule__SimpleChart__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:440:1: ( ( rule__SimpleChart__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:440:1: ( ( rule__SimpleChart__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:441:1: ( rule__SimpleChart__Group__0 )
            {
             before(grammarAccess.getSimpleChartAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:442:1: ( rule__SimpleChart__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:442:2: rule__SimpleChart__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__0_in_ruleSimpleChart875);
            rule__SimpleChart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleChart"


    // $ANTLR start "entryRuleColor"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:454:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:455:1: ( ruleColor EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:456:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor902);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:463:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:467:2: ( ( ( rule__Color__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:468:1: ( ( rule__Color__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:468:1: ( ( rule__Color__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:469:1: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:470:1: ( rule__Color__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:470:2: rule__Color__Group__0
            {
            pushFollow(FOLLOW_rule__Color__Group__0_in_ruleColor935);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleLabel"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:482:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:483:1: ( ruleLabel EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:484:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel962);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:491:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:495:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:496:1: ( ( rule__Label__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:496:1: ( ( rule__Label__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:497:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:498:1: ( rule__Label__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:498:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel995);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "rule__SettingsElement__Alternatives"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:510:1: rule__SettingsElement__Alternatives : ( ( ruleCSS ) | ( ruleColor ) );
    public final void rule__SettingsElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:514:1: ( ( ruleCSS ) | ( ruleColor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==40) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:515:1: ( ruleCSS )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:515:1: ( ruleCSS )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:516:1: ruleCSS
                    {
                     before(grammarAccess.getSettingsElementAccess().getCSSParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCSS_in_rule__SettingsElement__Alternatives1031);
                    ruleCSS();

                    state._fsp--;

                     after(grammarAccess.getSettingsElementAccess().getCSSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:521:6: ( ruleColor )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:521:6: ( ruleColor )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:522:1: ruleColor
                    {
                     before(grammarAccess.getSettingsElementAccess().getColorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleColor_in_rule__SettingsElement__Alternatives1048);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getSettingsElementAccess().getColorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SettingsElement__Alternatives"


    // $ANTLR start "rule__BOOL__Alternatives"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:532:1: rule__BOOL__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:536:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:537:1: ( 'true' )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:537:1: ( 'true' )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:538:1: 'true'
                    {
                     before(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__BOOL__Alternatives1081); 
                     after(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:545:6: ( 'false' )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:545:6: ( 'false' )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:546:1: 'false'
                    {
                     before(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__BOOL__Alternatives1101); 
                     after(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOL__Alternatives"


    // $ANTLR start "rule__Widget__Alternatives"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:558:1: rule__Widget__Alternatives : ( ( ruleButton ) | ( ruleLabel ) | ( ruleSimpleClock ) | ( ruleSymbol ) | ( ruleCalview ) | ( ruleSimpleChart ) );
    public final void rule__Widget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:562:1: ( ( ruleButton ) | ( ruleLabel ) | ( ruleSimpleClock ) | ( ruleSymbol ) | ( ruleCalview ) | ( ruleSimpleChart ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 69:
                {
                alt3=2;
                }
                break;
            case 54:
                {
                alt3=3;
                }
                break;
            case 42:
                {
                alt3=4;
                }
                break;
            case 31:
                {
                alt3=5;
                }
                break;
            case 61:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:563:1: ( ruleButton )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:563:1: ( ruleButton )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:564:1: ruleButton
                    {
                     before(grammarAccess.getWidgetAccess().getButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__Widget__Alternatives1135);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:569:6: ( ruleLabel )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:569:6: ( ruleLabel )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:570:1: ruleLabel
                    {
                     before(grammarAccess.getWidgetAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLabel_in_rule__Widget__Alternatives1152);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getLabelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:575:6: ( ruleSimpleClock )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:575:6: ( ruleSimpleClock )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:576:1: ruleSimpleClock
                    {
                     before(grammarAccess.getWidgetAccess().getSimpleClockParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSimpleClock_in_rule__Widget__Alternatives1169);
                    ruleSimpleClock();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getSimpleClockParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:581:6: ( ruleSymbol )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:581:6: ( ruleSymbol )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:582:1: ruleSymbol
                    {
                     before(grammarAccess.getWidgetAccess().getSymbolParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSymbol_in_rule__Widget__Alternatives1186);
                    ruleSymbol();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getSymbolParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:587:6: ( ruleCalview )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:587:6: ( ruleCalview )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:588:1: ruleCalview
                    {
                     before(grammarAccess.getWidgetAccess().getCalviewParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCalview_in_rule__Widget__Alternatives1203);
                    ruleCalview();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getCalviewParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:593:6: ( ruleSimpleChart )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:593:6: ( ruleSimpleChart )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:594:1: ruleSimpleChart
                    {
                     before(grammarAccess.getWidgetAccess().getSimpleChartParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleSimpleChart_in_rule__Widget__Alternatives1220);
                    ruleSimpleChart();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getSimpleChartParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Alternatives"


    // $ANTLR start "rule__TabletUI__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:606:1: rule__TabletUI__Group__0 : rule__TabletUI__Group__0__Impl rule__TabletUI__Group__1 ;
    public final void rule__TabletUI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:610:1: ( rule__TabletUI__Group__0__Impl rule__TabletUI__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:611:2: rule__TabletUI__Group__0__Impl rule__TabletUI__Group__1
            {
            pushFollow(FOLLOW_rule__TabletUI__Group__0__Impl_in_rule__TabletUI__Group__01250);
            rule__TabletUI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabletUI__Group__1_in_rule__TabletUI__Group__01253);
            rule__TabletUI__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabletUI__Group__0"


    // $ANTLR start "rule__TabletUI__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:618:1: rule__TabletUI__Group__0__Impl : ( ( rule__TabletUI__SettingsAssignment_0 ) ) ;
    public final void rule__TabletUI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:622:1: ( ( ( rule__TabletUI__SettingsAssignment_0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:623:1: ( ( rule__TabletUI__SettingsAssignment_0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:623:1: ( ( rule__TabletUI__SettingsAssignment_0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:624:1: ( rule__TabletUI__SettingsAssignment_0 )
            {
             before(grammarAccess.getTabletUIAccess().getSettingsAssignment_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:625:1: ( rule__TabletUI__SettingsAssignment_0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:625:2: rule__TabletUI__SettingsAssignment_0
            {
            pushFollow(FOLLOW_rule__TabletUI__SettingsAssignment_0_in_rule__TabletUI__Group__0__Impl1280);
            rule__TabletUI__SettingsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTabletUIAccess().getSettingsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabletUI__Group__0__Impl"


    // $ANTLR start "rule__TabletUI__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:635:1: rule__TabletUI__Group__1 : rule__TabletUI__Group__1__Impl ;
    public final void rule__TabletUI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:639:1: ( rule__TabletUI__Group__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:640:2: rule__TabletUI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TabletUI__Group__1__Impl_in_rule__TabletUI__Group__11310);
            rule__TabletUI__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabletUI__Group__1"


    // $ANTLR start "rule__TabletUI__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:646:1: rule__TabletUI__Group__1__Impl : ( ( rule__TabletUI__ElementsAssignment_1 )* ) ;
    public final void rule__TabletUI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:650:1: ( ( ( rule__TabletUI__ElementsAssignment_1 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:651:1: ( ( rule__TabletUI__ElementsAssignment_1 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:651:1: ( ( rule__TabletUI__ElementsAssignment_1 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:652:1: ( rule__TabletUI__ElementsAssignment_1 )*
            {
             before(grammarAccess.getTabletUIAccess().getElementsAssignment_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:653:1: ( rule__TabletUI__ElementsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:653:2: rule__TabletUI__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TabletUI__ElementsAssignment_1_in_rule__TabletUI__Group__1__Impl1337);
            	    rule__TabletUI__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTabletUIAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabletUI__Group__1__Impl"


    // $ANTLR start "rule__Settings__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:667:1: rule__Settings__Group__0 : rule__Settings__Group__0__Impl rule__Settings__Group__1 ;
    public final void rule__Settings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:671:1: ( rule__Settings__Group__0__Impl rule__Settings__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:672:2: rule__Settings__Group__0__Impl rule__Settings__Group__1
            {
            pushFollow(FOLLOW_rule__Settings__Group__0__Impl_in_rule__Settings__Group__01372);
            rule__Settings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__1_in_rule__Settings__Group__01375);
            rule__Settings__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__0"


    // $ANTLR start "rule__Settings__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:679:1: rule__Settings__Group__0__Impl : ( 'settings' ) ;
    public final void rule__Settings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:683:1: ( ( 'settings' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:684:1: ( 'settings' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:684:1: ( 'settings' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:685:1: 'settings'
            {
             before(grammarAccess.getSettingsAccess().getSettingsKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Settings__Group__0__Impl1403); 
             after(grammarAccess.getSettingsAccess().getSettingsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__0__Impl"


    // $ANTLR start "rule__Settings__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:698:1: rule__Settings__Group__1 : rule__Settings__Group__1__Impl rule__Settings__Group__2 ;
    public final void rule__Settings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:702:1: ( rule__Settings__Group__1__Impl rule__Settings__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:703:2: rule__Settings__Group__1__Impl rule__Settings__Group__2
            {
            pushFollow(FOLLOW_rule__Settings__Group__1__Impl_in_rule__Settings__Group__11434);
            rule__Settings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__2_in_rule__Settings__Group__11437);
            rule__Settings__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__1"


    // $ANTLR start "rule__Settings__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:710:1: rule__Settings__Group__1__Impl : ( 'title' ) ;
    public final void rule__Settings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:714:1: ( ( 'title' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:715:1: ( 'title' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:715:1: ( 'title' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:716:1: 'title'
            {
             before(grammarAccess.getSettingsAccess().getTitleKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Settings__Group__1__Impl1465); 
             after(grammarAccess.getSettingsAccess().getTitleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__1__Impl"


    // $ANTLR start "rule__Settings__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:729:1: rule__Settings__Group__2 : rule__Settings__Group__2__Impl rule__Settings__Group__3 ;
    public final void rule__Settings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:733:1: ( rule__Settings__Group__2__Impl rule__Settings__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:734:2: rule__Settings__Group__2__Impl rule__Settings__Group__3
            {
            pushFollow(FOLLOW_rule__Settings__Group__2__Impl_in_rule__Settings__Group__21496);
            rule__Settings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__3_in_rule__Settings__Group__21499);
            rule__Settings__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__2"


    // $ANTLR start "rule__Settings__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:741:1: rule__Settings__Group__2__Impl : ( ( rule__Settings__TitleAssignment_2 ) ) ;
    public final void rule__Settings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:745:1: ( ( ( rule__Settings__TitleAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:746:1: ( ( rule__Settings__TitleAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:746:1: ( ( rule__Settings__TitleAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:747:1: ( rule__Settings__TitleAssignment_2 )
            {
             before(grammarAccess.getSettingsAccess().getTitleAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:748:1: ( rule__Settings__TitleAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:748:2: rule__Settings__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Settings__TitleAssignment_2_in_rule__Settings__Group__2__Impl1526);
            rule__Settings__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__2__Impl"


    // $ANTLR start "rule__Settings__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:758:1: rule__Settings__Group__3 : rule__Settings__Group__3__Impl rule__Settings__Group__4 ;
    public final void rule__Settings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:762:1: ( rule__Settings__Group__3__Impl rule__Settings__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:763:2: rule__Settings__Group__3__Impl rule__Settings__Group__4
            {
            pushFollow(FOLLOW_rule__Settings__Group__3__Impl_in_rule__Settings__Group__31556);
            rule__Settings__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__4_in_rule__Settings__Group__31559);
            rule__Settings__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__3"


    // $ANTLR start "rule__Settings__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:770:1: rule__Settings__Group__3__Impl : ( ( rule__Settings__Group_3__0 )? ) ;
    public final void rule__Settings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:774:1: ( ( ( rule__Settings__Group_3__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:775:1: ( ( rule__Settings__Group_3__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:775:1: ( ( rule__Settings__Group_3__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:776:1: ( rule__Settings__Group_3__0 )?
            {
             before(grammarAccess.getSettingsAccess().getGroup_3()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:777:1: ( rule__Settings__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:777:2: rule__Settings__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Settings__Group_3__0_in_rule__Settings__Group__3__Impl1586);
                    rule__Settings__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSettingsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__3__Impl"


    // $ANTLR start "rule__Settings__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:787:1: rule__Settings__Group__4 : rule__Settings__Group__4__Impl rule__Settings__Group__5 ;
    public final void rule__Settings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:791:1: ( rule__Settings__Group__4__Impl rule__Settings__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:792:2: rule__Settings__Group__4__Impl rule__Settings__Group__5
            {
            pushFollow(FOLLOW_rule__Settings__Group__4__Impl_in_rule__Settings__Group__41617);
            rule__Settings__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__5_in_rule__Settings__Group__41620);
            rule__Settings__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__4"


    // $ANTLR start "rule__Settings__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:799:1: rule__Settings__Group__4__Impl : ( 'width' ) ;
    public final void rule__Settings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:803:1: ( ( 'width' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:804:1: ( 'width' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:804:1: ( 'width' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:805:1: 'width'
            {
             before(grammarAccess.getSettingsAccess().getWidthKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Settings__Group__4__Impl1648); 
             after(grammarAccess.getSettingsAccess().getWidthKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__4__Impl"


    // $ANTLR start "rule__Settings__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:818:1: rule__Settings__Group__5 : rule__Settings__Group__5__Impl rule__Settings__Group__6 ;
    public final void rule__Settings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:822:1: ( rule__Settings__Group__5__Impl rule__Settings__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:823:2: rule__Settings__Group__5__Impl rule__Settings__Group__6
            {
            pushFollow(FOLLOW_rule__Settings__Group__5__Impl_in_rule__Settings__Group__51679);
            rule__Settings__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__6_in_rule__Settings__Group__51682);
            rule__Settings__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__5"


    // $ANTLR start "rule__Settings__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:830:1: rule__Settings__Group__5__Impl : ( ( rule__Settings__WidthAssignment_5 ) ) ;
    public final void rule__Settings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:834:1: ( ( ( rule__Settings__WidthAssignment_5 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:835:1: ( ( rule__Settings__WidthAssignment_5 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:835:1: ( ( rule__Settings__WidthAssignment_5 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:836:1: ( rule__Settings__WidthAssignment_5 )
            {
             before(grammarAccess.getSettingsAccess().getWidthAssignment_5()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:837:1: ( rule__Settings__WidthAssignment_5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:837:2: rule__Settings__WidthAssignment_5
            {
            pushFollow(FOLLOW_rule__Settings__WidthAssignment_5_in_rule__Settings__Group__5__Impl1709);
            rule__Settings__WidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__5__Impl"


    // $ANTLR start "rule__Settings__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:847:1: rule__Settings__Group__6 : rule__Settings__Group__6__Impl rule__Settings__Group__7 ;
    public final void rule__Settings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:851:1: ( rule__Settings__Group__6__Impl rule__Settings__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:852:2: rule__Settings__Group__6__Impl rule__Settings__Group__7
            {
            pushFollow(FOLLOW_rule__Settings__Group__6__Impl_in_rule__Settings__Group__61739);
            rule__Settings__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__7_in_rule__Settings__Group__61742);
            rule__Settings__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__6"


    // $ANTLR start "rule__Settings__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:859:1: rule__Settings__Group__6__Impl : ( 'height' ) ;
    public final void rule__Settings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:863:1: ( ( 'height' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:864:1: ( 'height' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:864:1: ( 'height' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:865:1: 'height'
            {
             before(grammarAccess.getSettingsAccess().getHeightKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Settings__Group__6__Impl1770); 
             after(grammarAccess.getSettingsAccess().getHeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__6__Impl"


    // $ANTLR start "rule__Settings__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:878:1: rule__Settings__Group__7 : rule__Settings__Group__7__Impl rule__Settings__Group__8 ;
    public final void rule__Settings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:882:1: ( rule__Settings__Group__7__Impl rule__Settings__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:883:2: rule__Settings__Group__7__Impl rule__Settings__Group__8
            {
            pushFollow(FOLLOW_rule__Settings__Group__7__Impl_in_rule__Settings__Group__71801);
            rule__Settings__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__8_in_rule__Settings__Group__71804);
            rule__Settings__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__7"


    // $ANTLR start "rule__Settings__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:890:1: rule__Settings__Group__7__Impl : ( ( rule__Settings__HeightAssignment_7 ) ) ;
    public final void rule__Settings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:894:1: ( ( ( rule__Settings__HeightAssignment_7 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:895:1: ( ( rule__Settings__HeightAssignment_7 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:895:1: ( ( rule__Settings__HeightAssignment_7 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:896:1: ( rule__Settings__HeightAssignment_7 )
            {
             before(grammarAccess.getSettingsAccess().getHeightAssignment_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:897:1: ( rule__Settings__HeightAssignment_7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:897:2: rule__Settings__HeightAssignment_7
            {
            pushFollow(FOLLOW_rule__Settings__HeightAssignment_7_in_rule__Settings__Group__7__Impl1831);
            rule__Settings__HeightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getHeightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__7__Impl"


    // $ANTLR start "rule__Settings__Group__8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:907:1: rule__Settings__Group__8 : rule__Settings__Group__8__Impl rule__Settings__Group__9 ;
    public final void rule__Settings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:911:1: ( rule__Settings__Group__8__Impl rule__Settings__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:912:2: rule__Settings__Group__8__Impl rule__Settings__Group__9
            {
            pushFollow(FOLLOW_rule__Settings__Group__8__Impl_in_rule__Settings__Group__81861);
            rule__Settings__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__9_in_rule__Settings__Group__81864);
            rule__Settings__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__8"


    // $ANTLR start "rule__Settings__Group__8__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:919:1: rule__Settings__Group__8__Impl : ( 'columns' ) ;
    public final void rule__Settings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:923:1: ( ( 'columns' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:924:1: ( 'columns' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:924:1: ( 'columns' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:925:1: 'columns'
            {
             before(grammarAccess.getSettingsAccess().getColumnsKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__Settings__Group__8__Impl1892); 
             after(grammarAccess.getSettingsAccess().getColumnsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__8__Impl"


    // $ANTLR start "rule__Settings__Group__9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:938:1: rule__Settings__Group__9 : rule__Settings__Group__9__Impl rule__Settings__Group__10 ;
    public final void rule__Settings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:942:1: ( rule__Settings__Group__9__Impl rule__Settings__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:943:2: rule__Settings__Group__9__Impl rule__Settings__Group__10
            {
            pushFollow(FOLLOW_rule__Settings__Group__9__Impl_in_rule__Settings__Group__91923);
            rule__Settings__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__10_in_rule__Settings__Group__91926);
            rule__Settings__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__9"


    // $ANTLR start "rule__Settings__Group__9__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:950:1: rule__Settings__Group__9__Impl : ( ( rule__Settings__ColumnsAssignment_9 ) ) ;
    public final void rule__Settings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:954:1: ( ( ( rule__Settings__ColumnsAssignment_9 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:955:1: ( ( rule__Settings__ColumnsAssignment_9 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:955:1: ( ( rule__Settings__ColumnsAssignment_9 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:956:1: ( rule__Settings__ColumnsAssignment_9 )
            {
             before(grammarAccess.getSettingsAccess().getColumnsAssignment_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:957:1: ( rule__Settings__ColumnsAssignment_9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:957:2: rule__Settings__ColumnsAssignment_9
            {
            pushFollow(FOLLOW_rule__Settings__ColumnsAssignment_9_in_rule__Settings__Group__9__Impl1953);
            rule__Settings__ColumnsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getColumnsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__9__Impl"


    // $ANTLR start "rule__Settings__Group__10"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:967:1: rule__Settings__Group__10 : rule__Settings__Group__10__Impl rule__Settings__Group__11 ;
    public final void rule__Settings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:971:1: ( rule__Settings__Group__10__Impl rule__Settings__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:972:2: rule__Settings__Group__10__Impl rule__Settings__Group__11
            {
            pushFollow(FOLLOW_rule__Settings__Group__10__Impl_in_rule__Settings__Group__101983);
            rule__Settings__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__11_in_rule__Settings__Group__101986);
            rule__Settings__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__10"


    // $ANTLR start "rule__Settings__Group__10__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:979:1: rule__Settings__Group__10__Impl : ( 'rows' ) ;
    public final void rule__Settings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:983:1: ( ( 'rows' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:984:1: ( 'rows' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:984:1: ( 'rows' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:985:1: 'rows'
            {
             before(grammarAccess.getSettingsAccess().getRowsKeyword_10()); 
            match(input,18,FOLLOW_18_in_rule__Settings__Group__10__Impl2014); 
             after(grammarAccess.getSettingsAccess().getRowsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__10__Impl"


    // $ANTLR start "rule__Settings__Group__11"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:998:1: rule__Settings__Group__11 : rule__Settings__Group__11__Impl rule__Settings__Group__12 ;
    public final void rule__Settings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1002:1: ( rule__Settings__Group__11__Impl rule__Settings__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1003:2: rule__Settings__Group__11__Impl rule__Settings__Group__12
            {
            pushFollow(FOLLOW_rule__Settings__Group__11__Impl_in_rule__Settings__Group__112045);
            rule__Settings__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__12_in_rule__Settings__Group__112048);
            rule__Settings__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__11"


    // $ANTLR start "rule__Settings__Group__11__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1010:1: rule__Settings__Group__11__Impl : ( ( rule__Settings__RowsAssignment_11 ) ) ;
    public final void rule__Settings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1014:1: ( ( ( rule__Settings__RowsAssignment_11 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1015:1: ( ( rule__Settings__RowsAssignment_11 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1015:1: ( ( rule__Settings__RowsAssignment_11 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1016:1: ( rule__Settings__RowsAssignment_11 )
            {
             before(grammarAccess.getSettingsAccess().getRowsAssignment_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1017:1: ( rule__Settings__RowsAssignment_11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1017:2: rule__Settings__RowsAssignment_11
            {
            pushFollow(FOLLOW_rule__Settings__RowsAssignment_11_in_rule__Settings__Group__11__Impl2075);
            rule__Settings__RowsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getRowsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__11__Impl"


    // $ANTLR start "rule__Settings__Group__12"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1027:1: rule__Settings__Group__12 : rule__Settings__Group__12__Impl rule__Settings__Group__13 ;
    public final void rule__Settings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1031:1: ( rule__Settings__Group__12__Impl rule__Settings__Group__13 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1032:2: rule__Settings__Group__12__Impl rule__Settings__Group__13
            {
            pushFollow(FOLLOW_rule__Settings__Group__12__Impl_in_rule__Settings__Group__122105);
            rule__Settings__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__13_in_rule__Settings__Group__122108);
            rule__Settings__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__12"


    // $ANTLR start "rule__Settings__Group__12__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1039:1: rule__Settings__Group__12__Impl : ( ( rule__Settings__Group_12__0 )? ) ;
    public final void rule__Settings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1043:1: ( ( ( rule__Settings__Group_12__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1044:1: ( ( rule__Settings__Group_12__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1044:1: ( ( rule__Settings__Group_12__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1045:1: ( rule__Settings__Group_12__0 )?
            {
             before(grammarAccess.getSettingsAccess().getGroup_12()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1046:1: ( rule__Settings__Group_12__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1046:2: rule__Settings__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Settings__Group_12__0_in_rule__Settings__Group__12__Impl2135);
                    rule__Settings__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSettingsAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__12__Impl"


    // $ANTLR start "rule__Settings__Group__13"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1056:1: rule__Settings__Group__13 : rule__Settings__Group__13__Impl rule__Settings__Group__14 ;
    public final void rule__Settings__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1060:1: ( rule__Settings__Group__13__Impl rule__Settings__Group__14 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1061:2: rule__Settings__Group__13__Impl rule__Settings__Group__14
            {
            pushFollow(FOLLOW_rule__Settings__Group__13__Impl_in_rule__Settings__Group__132166);
            rule__Settings__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__14_in_rule__Settings__Group__132169);
            rule__Settings__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__13"


    // $ANTLR start "rule__Settings__Group__13__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1068:1: rule__Settings__Group__13__Impl : ( 'drag&drop' ) ;
    public final void rule__Settings__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1072:1: ( ( 'drag&drop' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1073:1: ( 'drag&drop' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1073:1: ( 'drag&drop' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1074:1: 'drag&drop'
            {
             before(grammarAccess.getSettingsAccess().getDragDropKeyword_13()); 
            match(input,19,FOLLOW_19_in_rule__Settings__Group__13__Impl2197); 
             after(grammarAccess.getSettingsAccess().getDragDropKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__13__Impl"


    // $ANTLR start "rule__Settings__Group__14"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1087:1: rule__Settings__Group__14 : rule__Settings__Group__14__Impl rule__Settings__Group__15 ;
    public final void rule__Settings__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1091:1: ( rule__Settings__Group__14__Impl rule__Settings__Group__15 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1092:2: rule__Settings__Group__14__Impl rule__Settings__Group__15
            {
            pushFollow(FOLLOW_rule__Settings__Group__14__Impl_in_rule__Settings__Group__142228);
            rule__Settings__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__15_in_rule__Settings__Group__142231);
            rule__Settings__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__14"


    // $ANTLR start "rule__Settings__Group__14__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1099:1: rule__Settings__Group__14__Impl : ( ( rule__Settings__DragdropAssignment_14 ) ) ;
    public final void rule__Settings__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1103:1: ( ( ( rule__Settings__DragdropAssignment_14 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1104:1: ( ( rule__Settings__DragdropAssignment_14 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1104:1: ( ( rule__Settings__DragdropAssignment_14 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1105:1: ( rule__Settings__DragdropAssignment_14 )
            {
             before(grammarAccess.getSettingsAccess().getDragdropAssignment_14()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1106:1: ( rule__Settings__DragdropAssignment_14 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1106:2: rule__Settings__DragdropAssignment_14
            {
            pushFollow(FOLLOW_rule__Settings__DragdropAssignment_14_in_rule__Settings__Group__14__Impl2258);
            rule__Settings__DragdropAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getDragdropAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__14__Impl"


    // $ANTLR start "rule__Settings__Group__15"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1116:1: rule__Settings__Group__15 : rule__Settings__Group__15__Impl rule__Settings__Group__16 ;
    public final void rule__Settings__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1120:1: ( rule__Settings__Group__15__Impl rule__Settings__Group__16 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1121:2: rule__Settings__Group__15__Impl rule__Settings__Group__16
            {
            pushFollow(FOLLOW_rule__Settings__Group__15__Impl_in_rule__Settings__Group__152288);
            rule__Settings__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__16_in_rule__Settings__Group__152291);
            rule__Settings__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__15"


    // $ANTLR start "rule__Settings__Group__15__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1128:1: rule__Settings__Group__15__Impl : ( 'gridster_margin' ) ;
    public final void rule__Settings__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1132:1: ( ( 'gridster_margin' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1133:1: ( 'gridster_margin' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1133:1: ( 'gridster_margin' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1134:1: 'gridster_margin'
            {
             before(grammarAccess.getSettingsAccess().getGridster_marginKeyword_15()); 
            match(input,20,FOLLOW_20_in_rule__Settings__Group__15__Impl2319); 
             after(grammarAccess.getSettingsAccess().getGridster_marginKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__15__Impl"


    // $ANTLR start "rule__Settings__Group__16"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1147:1: rule__Settings__Group__16 : rule__Settings__Group__16__Impl rule__Settings__Group__17 ;
    public final void rule__Settings__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1151:1: ( rule__Settings__Group__16__Impl rule__Settings__Group__17 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1152:2: rule__Settings__Group__16__Impl rule__Settings__Group__17
            {
            pushFollow(FOLLOW_rule__Settings__Group__16__Impl_in_rule__Settings__Group__162350);
            rule__Settings__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__17_in_rule__Settings__Group__162353);
            rule__Settings__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__16"


    // $ANTLR start "rule__Settings__Group__16__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1159:1: rule__Settings__Group__16__Impl : ( ( rule__Settings__MarginAssignment_16 ) ) ;
    public final void rule__Settings__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1163:1: ( ( ( rule__Settings__MarginAssignment_16 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1164:1: ( ( rule__Settings__MarginAssignment_16 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1164:1: ( ( rule__Settings__MarginAssignment_16 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1165:1: ( rule__Settings__MarginAssignment_16 )
            {
             before(grammarAccess.getSettingsAccess().getMarginAssignment_16()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1166:1: ( rule__Settings__MarginAssignment_16 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1166:2: rule__Settings__MarginAssignment_16
            {
            pushFollow(FOLLOW_rule__Settings__MarginAssignment_16_in_rule__Settings__Group__16__Impl2380);
            rule__Settings__MarginAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getMarginAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__16__Impl"


    // $ANTLR start "rule__Settings__Group__17"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1176:1: rule__Settings__Group__17 : rule__Settings__Group__17__Impl ;
    public final void rule__Settings__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1180:1: ( rule__Settings__Group__17__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1181:2: rule__Settings__Group__17__Impl
            {
            pushFollow(FOLLOW_rule__Settings__Group__17__Impl_in_rule__Settings__Group__172410);
            rule__Settings__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__17"


    // $ANTLR start "rule__Settings__Group__17__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1187:1: rule__Settings__Group__17__Impl : ( ( rule__Settings__SettingsAssignment_17 )* ) ;
    public final void rule__Settings__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1191:1: ( ( ( rule__Settings__SettingsAssignment_17 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1192:1: ( ( rule__Settings__SettingsAssignment_17 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1192:1: ( ( rule__Settings__SettingsAssignment_17 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1193:1: ( rule__Settings__SettingsAssignment_17 )*
            {
             before(grammarAccess.getSettingsAccess().getSettingsAssignment_17()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1194:1: ( rule__Settings__SettingsAssignment_17 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||LA7_0==40) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1194:2: rule__Settings__SettingsAssignment_17
            	    {
            	    pushFollow(FOLLOW_rule__Settings__SettingsAssignment_17_in_rule__Settings__Group__17__Impl2437);
            	    rule__Settings__SettingsAssignment_17();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSettingsAccess().getSettingsAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group__17__Impl"


    // $ANTLR start "rule__Settings__Group_3__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1240:1: rule__Settings__Group_3__0 : rule__Settings__Group_3__0__Impl rule__Settings__Group_3__1 ;
    public final void rule__Settings__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1244:1: ( rule__Settings__Group_3__0__Impl rule__Settings__Group_3__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1245:2: rule__Settings__Group_3__0__Impl rule__Settings__Group_3__1
            {
            pushFollow(FOLLOW_rule__Settings__Group_3__0__Impl_in_rule__Settings__Group_3__02504);
            rule__Settings__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group_3__1_in_rule__Settings__Group_3__02507);
            rule__Settings__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group_3__0"


    // $ANTLR start "rule__Settings__Group_3__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1252:1: rule__Settings__Group_3__0__Impl : ( 'fhemweb_url' ) ;
    public final void rule__Settings__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1256:1: ( ( 'fhemweb_url' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1257:1: ( 'fhemweb_url' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1257:1: ( 'fhemweb_url' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1258:1: 'fhemweb_url'
            {
             before(grammarAccess.getSettingsAccess().getFhemweb_urlKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Settings__Group_3__0__Impl2535); 
             after(grammarAccess.getSettingsAccess().getFhemweb_urlKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group_3__0__Impl"


    // $ANTLR start "rule__Settings__Group_3__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1271:1: rule__Settings__Group_3__1 : rule__Settings__Group_3__1__Impl ;
    public final void rule__Settings__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1275:1: ( rule__Settings__Group_3__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1276:2: rule__Settings__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Settings__Group_3__1__Impl_in_rule__Settings__Group_3__12566);
            rule__Settings__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group_3__1"


    // $ANTLR start "rule__Settings__Group_3__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1282:1: rule__Settings__Group_3__1__Impl : ( ( rule__Settings__Fhemweb_urlAssignment_3_1 ) ) ;
    public final void rule__Settings__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1286:1: ( ( ( rule__Settings__Fhemweb_urlAssignment_3_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1287:1: ( ( rule__Settings__Fhemweb_urlAssignment_3_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1287:1: ( ( rule__Settings__Fhemweb_urlAssignment_3_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1288:1: ( rule__Settings__Fhemweb_urlAssignment_3_1 )
            {
             before(grammarAccess.getSettingsAccess().getFhemweb_urlAssignment_3_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1289:1: ( rule__Settings__Fhemweb_urlAssignment_3_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1289:2: rule__Settings__Fhemweb_urlAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Settings__Fhemweb_urlAssignment_3_1_in_rule__Settings__Group_3__1__Impl2593);
            rule__Settings__Fhemweb_urlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getFhemweb_urlAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group_3__1__Impl"


    // $ANTLR start "rule__Settings__Group_12__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1303:1: rule__Settings__Group_12__0 : rule__Settings__Group_12__0__Impl rule__Settings__Group_12__1 ;
    public final void rule__Settings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1307:1: ( rule__Settings__Group_12__0__Impl rule__Settings__Group_12__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1308:2: rule__Settings__Group_12__0__Impl rule__Settings__Group_12__1
            {
            pushFollow(FOLLOW_rule__Settings__Group_12__0__Impl_in_rule__Settings__Group_12__02627);
            rule__Settings__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group_12__1_in_rule__Settings__Group_12__02630);
            rule__Settings__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group_12__0"


    // $ANTLR start "rule__Settings__Group_12__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1315:1: rule__Settings__Group_12__0__Impl : ( 'debug' ) ;
    public final void rule__Settings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1319:1: ( ( 'debug' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1320:1: ( 'debug' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1320:1: ( 'debug' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1321:1: 'debug'
            {
             before(grammarAccess.getSettingsAccess().getDebugKeyword_12_0()); 
            match(input,22,FOLLOW_22_in_rule__Settings__Group_12__0__Impl2658); 
             after(grammarAccess.getSettingsAccess().getDebugKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group_12__0__Impl"


    // $ANTLR start "rule__Settings__Group_12__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1334:1: rule__Settings__Group_12__1 : rule__Settings__Group_12__1__Impl ;
    public final void rule__Settings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1338:1: ( rule__Settings__Group_12__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1339:2: rule__Settings__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Settings__Group_12__1__Impl_in_rule__Settings__Group_12__12689);
            rule__Settings__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group_12__1"


    // $ANTLR start "rule__Settings__Group_12__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1345:1: rule__Settings__Group_12__1__Impl : ( ( rule__Settings__DebugAssignment_12_1 ) ) ;
    public final void rule__Settings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1349:1: ( ( ( rule__Settings__DebugAssignment_12_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1350:1: ( ( rule__Settings__DebugAssignment_12_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1350:1: ( ( rule__Settings__DebugAssignment_12_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1351:1: ( rule__Settings__DebugAssignment_12_1 )
            {
             before(grammarAccess.getSettingsAccess().getDebugAssignment_12_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1352:1: ( rule__Settings__DebugAssignment_12_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1352:2: rule__Settings__DebugAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Settings__DebugAssignment_12_1_in_rule__Settings__Group_12__1__Impl2716);
            rule__Settings__DebugAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSettingsAccess().getDebugAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Group_12__1__Impl"


    // $ANTLR start "rule__CSS__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1366:1: rule__CSS__Group__0 : rule__CSS__Group__0__Impl rule__CSS__Group__1 ;
    public final void rule__CSS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1370:1: ( rule__CSS__Group__0__Impl rule__CSS__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1371:2: rule__CSS__Group__0__Impl rule__CSS__Group__1
            {
            pushFollow(FOLLOW_rule__CSS__Group__0__Impl_in_rule__CSS__Group__02750);
            rule__CSS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CSS__Group__1_in_rule__CSS__Group__02753);
            rule__CSS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSS__Group__0"


    // $ANTLR start "rule__CSS__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1378:1: rule__CSS__Group__0__Impl : ( 'css' ) ;
    public final void rule__CSS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1382:1: ( ( 'css' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1383:1: ( 'css' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1383:1: ( 'css' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1384:1: 'css'
            {
             before(grammarAccess.getCSSAccess().getCssKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__CSS__Group__0__Impl2781); 
             after(grammarAccess.getCSSAccess().getCssKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSS__Group__0__Impl"


    // $ANTLR start "rule__CSS__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1397:1: rule__CSS__Group__1 : rule__CSS__Group__1__Impl ;
    public final void rule__CSS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1401:1: ( rule__CSS__Group__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1402:2: rule__CSS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSS__Group__1__Impl_in_rule__CSS__Group__12812);
            rule__CSS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSS__Group__1"


    // $ANTLR start "rule__CSS__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1408:1: rule__CSS__Group__1__Impl : ( ( rule__CSS__PathAssignment_1 ) ) ;
    public final void rule__CSS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1412:1: ( ( ( rule__CSS__PathAssignment_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1413:1: ( ( rule__CSS__PathAssignment_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1413:1: ( ( rule__CSS__PathAssignment_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1414:1: ( rule__CSS__PathAssignment_1 )
            {
             before(grammarAccess.getCSSAccess().getPathAssignment_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1415:1: ( rule__CSS__PathAssignment_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1415:2: rule__CSS__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__CSS__PathAssignment_1_in_rule__CSS__Group__1__Impl2839);
            rule__CSS__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSSAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSS__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1429:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1433:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1434:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02873);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02876);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1441:1: rule__Page__Group__0__Impl : ( ( rule__Page__NameAssignment_0 ) ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1445:1: ( ( ( rule__Page__NameAssignment_0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1446:1: ( ( rule__Page__NameAssignment_0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1446:1: ( ( rule__Page__NameAssignment_0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1447:1: ( rule__Page__NameAssignment_0 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1448:1: ( rule__Page__NameAssignment_0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1448:2: rule__Page__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_0_in_rule__Page__Group__0__Impl2903);
            rule__Page__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1458:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1462:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1463:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12933);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12936);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1470:1: rule__Page__Group__1__Impl : ( '{' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1474:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1475:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1475:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1476:1: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Page__Group__1__Impl2964); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1489:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1493:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1494:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22995);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22998);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1501:1: rule__Page__Group__2__Impl : ( ( rule__Page__ElementsAssignment_2 )* ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1505:1: ( ( ( rule__Page__ElementsAssignment_2 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1506:1: ( ( rule__Page__ElementsAssignment_2 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1506:1: ( ( rule__Page__ElementsAssignment_2 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1507:1: ( rule__Page__ElementsAssignment_2 )*
            {
             before(grammarAccess.getPageAccess().getElementsAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1508:1: ( rule__Page__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1508:2: rule__Page__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Page__ElementsAssignment_2_in_rule__Page__Group__2__Impl3025);
            	    rule__Page__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1518:1: rule__Page__Group__3 : rule__Page__Group__3__Impl ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1522:1: ( rule__Page__Group__3__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1523:2: rule__Page__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__33056);
            rule__Page__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1529:1: rule__Page__Group__3__Impl : ( '}' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1533:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1534:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1534:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1535:1: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Page__Group__3__Impl3084); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Gridster__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1556:1: rule__Gridster__Group__0 : rule__Gridster__Group__0__Impl rule__Gridster__Group__1 ;
    public final void rule__Gridster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1560:1: ( rule__Gridster__Group__0__Impl rule__Gridster__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1561:2: rule__Gridster__Group__0__Impl rule__Gridster__Group__1
            {
            pushFollow(FOLLOW_rule__Gridster__Group__0__Impl_in_rule__Gridster__Group__03123);
            rule__Gridster__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__1_in_rule__Gridster__Group__03126);
            rule__Gridster__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__0"


    // $ANTLR start "rule__Gridster__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1568:1: rule__Gridster__Group__0__Impl : ( '{' ) ;
    public final void rule__Gridster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1572:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1573:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1573:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1574:1: '{'
            {
             before(grammarAccess.getGridsterAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Gridster__Group__0__Impl3154); 
             after(grammarAccess.getGridsterAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__0__Impl"


    // $ANTLR start "rule__Gridster__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1587:1: rule__Gridster__Group__1 : rule__Gridster__Group__1__Impl rule__Gridster__Group__2 ;
    public final void rule__Gridster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1591:1: ( rule__Gridster__Group__1__Impl rule__Gridster__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1592:2: rule__Gridster__Group__1__Impl rule__Gridster__Group__2
            {
            pushFollow(FOLLOW_rule__Gridster__Group__1__Impl_in_rule__Gridster__Group__13185);
            rule__Gridster__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__2_in_rule__Gridster__Group__13188);
            rule__Gridster__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__1"


    // $ANTLR start "rule__Gridster__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1599:1: rule__Gridster__Group__1__Impl : ( ( rule__Gridster__Group_1__0 )? ) ;
    public final void rule__Gridster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1603:1: ( ( ( rule__Gridster__Group_1__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1604:1: ( ( rule__Gridster__Group_1__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1604:1: ( ( rule__Gridster__Group_1__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1605:1: ( rule__Gridster__Group_1__0 )?
            {
             before(grammarAccess.getGridsterAccess().getGroup_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1606:1: ( rule__Gridster__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1606:2: rule__Gridster__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Gridster__Group_1__0_in_rule__Gridster__Group__1__Impl3215);
                    rule__Gridster__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGridsterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__1__Impl"


    // $ANTLR start "rule__Gridster__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1616:1: rule__Gridster__Group__2 : rule__Gridster__Group__2__Impl rule__Gridster__Group__3 ;
    public final void rule__Gridster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1620:1: ( rule__Gridster__Group__2__Impl rule__Gridster__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1621:2: rule__Gridster__Group__2__Impl rule__Gridster__Group__3
            {
            pushFollow(FOLLOW_rule__Gridster__Group__2__Impl_in_rule__Gridster__Group__23246);
            rule__Gridster__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__3_in_rule__Gridster__Group__23249);
            rule__Gridster__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__2"


    // $ANTLR start "rule__Gridster__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1628:1: rule__Gridster__Group__2__Impl : ( 'row' ) ;
    public final void rule__Gridster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1632:1: ( ( 'row' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1633:1: ( 'row' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1633:1: ( 'row' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1634:1: 'row'
            {
             before(grammarAccess.getGridsterAccess().getRowKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Gridster__Group__2__Impl3277); 
             after(grammarAccess.getGridsterAccess().getRowKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__2__Impl"


    // $ANTLR start "rule__Gridster__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1647:1: rule__Gridster__Group__3 : rule__Gridster__Group__3__Impl rule__Gridster__Group__4 ;
    public final void rule__Gridster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1651:1: ( rule__Gridster__Group__3__Impl rule__Gridster__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1652:2: rule__Gridster__Group__3__Impl rule__Gridster__Group__4
            {
            pushFollow(FOLLOW_rule__Gridster__Group__3__Impl_in_rule__Gridster__Group__33308);
            rule__Gridster__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__4_in_rule__Gridster__Group__33311);
            rule__Gridster__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__3"


    // $ANTLR start "rule__Gridster__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1659:1: rule__Gridster__Group__3__Impl : ( ( rule__Gridster__RowAssignment_3 ) ) ;
    public final void rule__Gridster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1663:1: ( ( ( rule__Gridster__RowAssignment_3 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1664:1: ( ( rule__Gridster__RowAssignment_3 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1664:1: ( ( rule__Gridster__RowAssignment_3 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1665:1: ( rule__Gridster__RowAssignment_3 )
            {
             before(grammarAccess.getGridsterAccess().getRowAssignment_3()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1666:1: ( rule__Gridster__RowAssignment_3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1666:2: rule__Gridster__RowAssignment_3
            {
            pushFollow(FOLLOW_rule__Gridster__RowAssignment_3_in_rule__Gridster__Group__3__Impl3338);
            rule__Gridster__RowAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGridsterAccess().getRowAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__3__Impl"


    // $ANTLR start "rule__Gridster__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1676:1: rule__Gridster__Group__4 : rule__Gridster__Group__4__Impl rule__Gridster__Group__5 ;
    public final void rule__Gridster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1680:1: ( rule__Gridster__Group__4__Impl rule__Gridster__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1681:2: rule__Gridster__Group__4__Impl rule__Gridster__Group__5
            {
            pushFollow(FOLLOW_rule__Gridster__Group__4__Impl_in_rule__Gridster__Group__43368);
            rule__Gridster__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__5_in_rule__Gridster__Group__43371);
            rule__Gridster__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__4"


    // $ANTLR start "rule__Gridster__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1688:1: rule__Gridster__Group__4__Impl : ( 'column' ) ;
    public final void rule__Gridster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1692:1: ( ( 'column' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1693:1: ( 'column' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1693:1: ( 'column' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1694:1: 'column'
            {
             before(grammarAccess.getGridsterAccess().getColumnKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Gridster__Group__4__Impl3399); 
             after(grammarAccess.getGridsterAccess().getColumnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__4__Impl"


    // $ANTLR start "rule__Gridster__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1707:1: rule__Gridster__Group__5 : rule__Gridster__Group__5__Impl rule__Gridster__Group__6 ;
    public final void rule__Gridster__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1711:1: ( rule__Gridster__Group__5__Impl rule__Gridster__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1712:2: rule__Gridster__Group__5__Impl rule__Gridster__Group__6
            {
            pushFollow(FOLLOW_rule__Gridster__Group__5__Impl_in_rule__Gridster__Group__53430);
            rule__Gridster__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__6_in_rule__Gridster__Group__53433);
            rule__Gridster__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__5"


    // $ANTLR start "rule__Gridster__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1719:1: rule__Gridster__Group__5__Impl : ( ( rule__Gridster__ColumnAssignment_5 ) ) ;
    public final void rule__Gridster__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1723:1: ( ( ( rule__Gridster__ColumnAssignment_5 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1724:1: ( ( rule__Gridster__ColumnAssignment_5 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1724:1: ( ( rule__Gridster__ColumnAssignment_5 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1725:1: ( rule__Gridster__ColumnAssignment_5 )
            {
             before(grammarAccess.getGridsterAccess().getColumnAssignment_5()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1726:1: ( rule__Gridster__ColumnAssignment_5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1726:2: rule__Gridster__ColumnAssignment_5
            {
            pushFollow(FOLLOW_rule__Gridster__ColumnAssignment_5_in_rule__Gridster__Group__5__Impl3460);
            rule__Gridster__ColumnAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGridsterAccess().getColumnAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__5__Impl"


    // $ANTLR start "rule__Gridster__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1736:1: rule__Gridster__Group__6 : rule__Gridster__Group__6__Impl rule__Gridster__Group__7 ;
    public final void rule__Gridster__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1740:1: ( rule__Gridster__Group__6__Impl rule__Gridster__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1741:2: rule__Gridster__Group__6__Impl rule__Gridster__Group__7
            {
            pushFollow(FOLLOW_rule__Gridster__Group__6__Impl_in_rule__Gridster__Group__63490);
            rule__Gridster__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__7_in_rule__Gridster__Group__63493);
            rule__Gridster__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__6"


    // $ANTLR start "rule__Gridster__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1748:1: rule__Gridster__Group__6__Impl : ( ( rule__Gridster__Group_6__0 )? ) ;
    public final void rule__Gridster__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1752:1: ( ( ( rule__Gridster__Group_6__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1753:1: ( ( rule__Gridster__Group_6__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1753:1: ( ( rule__Gridster__Group_6__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1754:1: ( rule__Gridster__Group_6__0 )?
            {
             before(grammarAccess.getGridsterAccess().getGroup_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1755:1: ( rule__Gridster__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1755:2: rule__Gridster__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Gridster__Group_6__0_in_rule__Gridster__Group__6__Impl3520);
                    rule__Gridster__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGridsterAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__6__Impl"


    // $ANTLR start "rule__Gridster__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1765:1: rule__Gridster__Group__7 : rule__Gridster__Group__7__Impl rule__Gridster__Group__8 ;
    public final void rule__Gridster__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1769:1: ( rule__Gridster__Group__7__Impl rule__Gridster__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1770:2: rule__Gridster__Group__7__Impl rule__Gridster__Group__8
            {
            pushFollow(FOLLOW_rule__Gridster__Group__7__Impl_in_rule__Gridster__Group__73551);
            rule__Gridster__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__8_in_rule__Gridster__Group__73554);
            rule__Gridster__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__7"


    // $ANTLR start "rule__Gridster__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1777:1: rule__Gridster__Group__7__Impl : ( ( rule__Gridster__Group_7__0 )? ) ;
    public final void rule__Gridster__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1781:1: ( ( ( rule__Gridster__Group_7__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1782:1: ( ( rule__Gridster__Group_7__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1782:1: ( ( rule__Gridster__Group_7__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1783:1: ( rule__Gridster__Group_7__0 )?
            {
             before(grammarAccess.getGridsterAccess().getGroup_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1784:1: ( rule__Gridster__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1784:2: rule__Gridster__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Gridster__Group_7__0_in_rule__Gridster__Group__7__Impl3581);
                    rule__Gridster__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGridsterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__7__Impl"


    // $ANTLR start "rule__Gridster__Group__8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1794:1: rule__Gridster__Group__8 : rule__Gridster__Group__8__Impl rule__Gridster__Group__9 ;
    public final void rule__Gridster__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1798:1: ( rule__Gridster__Group__8__Impl rule__Gridster__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1799:2: rule__Gridster__Group__8__Impl rule__Gridster__Group__9
            {
            pushFollow(FOLLOW_rule__Gridster__Group__8__Impl_in_rule__Gridster__Group__83612);
            rule__Gridster__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__9_in_rule__Gridster__Group__83615);
            rule__Gridster__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__8"


    // $ANTLR start "rule__Gridster__Group__8__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1806:1: rule__Gridster__Group__8__Impl : ( ( rule__Gridster__ColorsAssignment_8 )* ) ;
    public final void rule__Gridster__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1810:1: ( ( ( rule__Gridster__ColorsAssignment_8 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1811:1: ( ( rule__Gridster__ColorsAssignment_8 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1811:1: ( ( rule__Gridster__ColorsAssignment_8 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1812:1: ( rule__Gridster__ColorsAssignment_8 )*
            {
             before(grammarAccess.getGridsterAccess().getColorsAssignment_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1813:1: ( rule__Gridster__ColorsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1813:2: rule__Gridster__ColorsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Gridster__ColorsAssignment_8_in_rule__Gridster__Group__8__Impl3642);
            	    rule__Gridster__ColorsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGridsterAccess().getColorsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__8__Impl"


    // $ANTLR start "rule__Gridster__Group__9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1823:1: rule__Gridster__Group__9 : rule__Gridster__Group__9__Impl rule__Gridster__Group__10 ;
    public final void rule__Gridster__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1827:1: ( rule__Gridster__Group__9__Impl rule__Gridster__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1828:2: rule__Gridster__Group__9__Impl rule__Gridster__Group__10
            {
            pushFollow(FOLLOW_rule__Gridster__Group__9__Impl_in_rule__Gridster__Group__93673);
            rule__Gridster__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__10_in_rule__Gridster__Group__93676);
            rule__Gridster__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__9"


    // $ANTLR start "rule__Gridster__Group__9__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1835:1: rule__Gridster__Group__9__Impl : ( ( rule__Gridster__WidgetsAssignment_9 )* ) ;
    public final void rule__Gridster__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1839:1: ( ( ( rule__Gridster__WidgetsAssignment_9 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1840:1: ( ( rule__Gridster__WidgetsAssignment_9 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1840:1: ( ( rule__Gridster__WidgetsAssignment_9 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1841:1: ( rule__Gridster__WidgetsAssignment_9 )*
            {
             before(grammarAccess.getGridsterAccess().getWidgetsAssignment_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1842:1: ( rule__Gridster__WidgetsAssignment_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31||LA13_0==37||LA13_0==42||LA13_0==54||LA13_0==61||LA13_0==69) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1842:2: rule__Gridster__WidgetsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Gridster__WidgetsAssignment_9_in_rule__Gridster__Group__9__Impl3703);
            	    rule__Gridster__WidgetsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGridsterAccess().getWidgetsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__9__Impl"


    // $ANTLR start "rule__Gridster__Group__10"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1852:1: rule__Gridster__Group__10 : rule__Gridster__Group__10__Impl ;
    public final void rule__Gridster__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1856:1: ( rule__Gridster__Group__10__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1857:2: rule__Gridster__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Gridster__Group__10__Impl_in_rule__Gridster__Group__103734);
            rule__Gridster__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__10"


    // $ANTLR start "rule__Gridster__Group__10__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1863:1: rule__Gridster__Group__10__Impl : ( '}' ) ;
    public final void rule__Gridster__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1867:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1868:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1868:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1869:1: '}'
            {
             before(grammarAccess.getGridsterAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_25_in_rule__Gridster__Group__10__Impl3762); 
             after(grammarAccess.getGridsterAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group__10__Impl"


    // $ANTLR start "rule__Gridster__Group_1__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1904:1: rule__Gridster__Group_1__0 : rule__Gridster__Group_1__0__Impl rule__Gridster__Group_1__1 ;
    public final void rule__Gridster__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1908:1: ( rule__Gridster__Group_1__0__Impl rule__Gridster__Group_1__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1909:2: rule__Gridster__Group_1__0__Impl rule__Gridster__Group_1__1
            {
            pushFollow(FOLLOW_rule__Gridster__Group_1__0__Impl_in_rule__Gridster__Group_1__03815);
            rule__Gridster__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group_1__1_in_rule__Gridster__Group_1__03818);
            rule__Gridster__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_1__0"


    // $ANTLR start "rule__Gridster__Group_1__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1916:1: rule__Gridster__Group_1__0__Impl : ( 'header' ) ;
    public final void rule__Gridster__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1920:1: ( ( 'header' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1921:1: ( 'header' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1921:1: ( 'header' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1922:1: 'header'
            {
             before(grammarAccess.getGridsterAccess().getHeaderKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Gridster__Group_1__0__Impl3846); 
             after(grammarAccess.getGridsterAccess().getHeaderKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_1__0__Impl"


    // $ANTLR start "rule__Gridster__Group_1__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1935:1: rule__Gridster__Group_1__1 : rule__Gridster__Group_1__1__Impl ;
    public final void rule__Gridster__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1939:1: ( rule__Gridster__Group_1__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1940:2: rule__Gridster__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Gridster__Group_1__1__Impl_in_rule__Gridster__Group_1__13877);
            rule__Gridster__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_1__1"


    // $ANTLR start "rule__Gridster__Group_1__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1946:1: rule__Gridster__Group_1__1__Impl : ( ( rule__Gridster__HeaderAssignment_1_1 ) ) ;
    public final void rule__Gridster__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1950:1: ( ( ( rule__Gridster__HeaderAssignment_1_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1951:1: ( ( rule__Gridster__HeaderAssignment_1_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1951:1: ( ( rule__Gridster__HeaderAssignment_1_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1952:1: ( rule__Gridster__HeaderAssignment_1_1 )
            {
             before(grammarAccess.getGridsterAccess().getHeaderAssignment_1_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1953:1: ( rule__Gridster__HeaderAssignment_1_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1953:2: rule__Gridster__HeaderAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Gridster__HeaderAssignment_1_1_in_rule__Gridster__Group_1__1__Impl3904);
            rule__Gridster__HeaderAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGridsterAccess().getHeaderAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_1__1__Impl"


    // $ANTLR start "rule__Gridster__Group_6__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1967:1: rule__Gridster__Group_6__0 : rule__Gridster__Group_6__0__Impl rule__Gridster__Group_6__1 ;
    public final void rule__Gridster__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1971:1: ( rule__Gridster__Group_6__0__Impl rule__Gridster__Group_6__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1972:2: rule__Gridster__Group_6__0__Impl rule__Gridster__Group_6__1
            {
            pushFollow(FOLLOW_rule__Gridster__Group_6__0__Impl_in_rule__Gridster__Group_6__03938);
            rule__Gridster__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group_6__1_in_rule__Gridster__Group_6__03941);
            rule__Gridster__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_6__0"


    // $ANTLR start "rule__Gridster__Group_6__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1979:1: rule__Gridster__Group_6__0__Impl : ( 'colspan' ) ;
    public final void rule__Gridster__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1983:1: ( ( 'colspan' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1984:1: ( 'colspan' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1984:1: ( 'colspan' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1985:1: 'colspan'
            {
             before(grammarAccess.getGridsterAccess().getColspanKeyword_6_0()); 
            match(input,29,FOLLOW_29_in_rule__Gridster__Group_6__0__Impl3969); 
             after(grammarAccess.getGridsterAccess().getColspanKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_6__0__Impl"


    // $ANTLR start "rule__Gridster__Group_6__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1998:1: rule__Gridster__Group_6__1 : rule__Gridster__Group_6__1__Impl ;
    public final void rule__Gridster__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2002:1: ( rule__Gridster__Group_6__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2003:2: rule__Gridster__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Gridster__Group_6__1__Impl_in_rule__Gridster__Group_6__14000);
            rule__Gridster__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_6__1"


    // $ANTLR start "rule__Gridster__Group_6__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2009:1: rule__Gridster__Group_6__1__Impl : ( ( rule__Gridster__ColspanAssignment_6_1 ) ) ;
    public final void rule__Gridster__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2013:1: ( ( ( rule__Gridster__ColspanAssignment_6_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2014:1: ( ( rule__Gridster__ColspanAssignment_6_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2014:1: ( ( rule__Gridster__ColspanAssignment_6_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2015:1: ( rule__Gridster__ColspanAssignment_6_1 )
            {
             before(grammarAccess.getGridsterAccess().getColspanAssignment_6_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2016:1: ( rule__Gridster__ColspanAssignment_6_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2016:2: rule__Gridster__ColspanAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Gridster__ColspanAssignment_6_1_in_rule__Gridster__Group_6__1__Impl4027);
            rule__Gridster__ColspanAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGridsterAccess().getColspanAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_6__1__Impl"


    // $ANTLR start "rule__Gridster__Group_7__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2030:1: rule__Gridster__Group_7__0 : rule__Gridster__Group_7__0__Impl rule__Gridster__Group_7__1 ;
    public final void rule__Gridster__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2034:1: ( rule__Gridster__Group_7__0__Impl rule__Gridster__Group_7__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2035:2: rule__Gridster__Group_7__0__Impl rule__Gridster__Group_7__1
            {
            pushFollow(FOLLOW_rule__Gridster__Group_7__0__Impl_in_rule__Gridster__Group_7__04061);
            rule__Gridster__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group_7__1_in_rule__Gridster__Group_7__04064);
            rule__Gridster__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_7__0"


    // $ANTLR start "rule__Gridster__Group_7__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2042:1: rule__Gridster__Group_7__0__Impl : ( 'rowspan' ) ;
    public final void rule__Gridster__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2046:1: ( ( 'rowspan' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2047:1: ( 'rowspan' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2047:1: ( 'rowspan' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2048:1: 'rowspan'
            {
             before(grammarAccess.getGridsterAccess().getRowspanKeyword_7_0()); 
            match(input,30,FOLLOW_30_in_rule__Gridster__Group_7__0__Impl4092); 
             after(grammarAccess.getGridsterAccess().getRowspanKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_7__0__Impl"


    // $ANTLR start "rule__Gridster__Group_7__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2061:1: rule__Gridster__Group_7__1 : rule__Gridster__Group_7__1__Impl ;
    public final void rule__Gridster__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2065:1: ( rule__Gridster__Group_7__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2066:2: rule__Gridster__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Gridster__Group_7__1__Impl_in_rule__Gridster__Group_7__14123);
            rule__Gridster__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_7__1"


    // $ANTLR start "rule__Gridster__Group_7__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2072:1: rule__Gridster__Group_7__1__Impl : ( ( rule__Gridster__RowspanAssignment_7_1 ) ) ;
    public final void rule__Gridster__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2076:1: ( ( ( rule__Gridster__RowspanAssignment_7_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2077:1: ( ( rule__Gridster__RowspanAssignment_7_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2077:1: ( ( rule__Gridster__RowspanAssignment_7_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2078:1: ( rule__Gridster__RowspanAssignment_7_1 )
            {
             before(grammarAccess.getGridsterAccess().getRowspanAssignment_7_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2079:1: ( rule__Gridster__RowspanAssignment_7_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2079:2: rule__Gridster__RowspanAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Gridster__RowspanAssignment_7_1_in_rule__Gridster__Group_7__1__Impl4150);
            rule__Gridster__RowspanAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getGridsterAccess().getRowspanAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__Group_7__1__Impl"


    // $ANTLR start "rule__Calview__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2094:1: rule__Calview__Group__0 : rule__Calview__Group__0__Impl rule__Calview__Group__1 ;
    public final void rule__Calview__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2098:1: ( rule__Calview__Group__0__Impl rule__Calview__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2099:2: rule__Calview__Group__0__Impl rule__Calview__Group__1
            {
            pushFollow(FOLLOW_rule__Calview__Group__0__Impl_in_rule__Calview__Group__04185);
            rule__Calview__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__1_in_rule__Calview__Group__04188);
            rule__Calview__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__0"


    // $ANTLR start "rule__Calview__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2106:1: rule__Calview__Group__0__Impl : ( 'calview' ) ;
    public final void rule__Calview__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2110:1: ( ( 'calview' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2111:1: ( 'calview' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2111:1: ( 'calview' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2112:1: 'calview'
            {
             before(grammarAccess.getCalviewAccess().getCalviewKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Calview__Group__0__Impl4216); 
             after(grammarAccess.getCalviewAccess().getCalviewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__0__Impl"


    // $ANTLR start "rule__Calview__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2125:1: rule__Calview__Group__1 : rule__Calview__Group__1__Impl rule__Calview__Group__2 ;
    public final void rule__Calview__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2129:1: ( rule__Calview__Group__1__Impl rule__Calview__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2130:2: rule__Calview__Group__1__Impl rule__Calview__Group__2
            {
            pushFollow(FOLLOW_rule__Calview__Group__1__Impl_in_rule__Calview__Group__14247);
            rule__Calview__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__2_in_rule__Calview__Group__14250);
            rule__Calview__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__1"


    // $ANTLR start "rule__Calview__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2137:1: rule__Calview__Group__1__Impl : ( '{' ) ;
    public final void rule__Calview__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2141:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2142:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2142:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2143:1: '{'
            {
             before(grammarAccess.getCalviewAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Calview__Group__1__Impl4278); 
             after(grammarAccess.getCalviewAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__1__Impl"


    // $ANTLR start "rule__Calview__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2156:1: rule__Calview__Group__2 : rule__Calview__Group__2__Impl rule__Calview__Group__3 ;
    public final void rule__Calview__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2160:1: ( rule__Calview__Group__2__Impl rule__Calview__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2161:2: rule__Calview__Group__2__Impl rule__Calview__Group__3
            {
            pushFollow(FOLLOW_rule__Calview__Group__2__Impl_in_rule__Calview__Group__24309);
            rule__Calview__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__3_in_rule__Calview__Group__24312);
            rule__Calview__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__2"


    // $ANTLR start "rule__Calview__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2168:1: rule__Calview__Group__2__Impl : ( ( rule__Calview__DeviceAssignment_2 ) ) ;
    public final void rule__Calview__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2172:1: ( ( ( rule__Calview__DeviceAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2173:1: ( ( rule__Calview__DeviceAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2173:1: ( ( rule__Calview__DeviceAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2174:1: ( rule__Calview__DeviceAssignment_2 )
            {
             before(grammarAccess.getCalviewAccess().getDeviceAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2175:1: ( rule__Calview__DeviceAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2175:2: rule__Calview__DeviceAssignment_2
            {
            pushFollow(FOLLOW_rule__Calview__DeviceAssignment_2_in_rule__Calview__Group__2__Impl4339);
            rule__Calview__DeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCalviewAccess().getDeviceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__2__Impl"


    // $ANTLR start "rule__Calview__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2185:1: rule__Calview__Group__3 : rule__Calview__Group__3__Impl rule__Calview__Group__4 ;
    public final void rule__Calview__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2189:1: ( rule__Calview__Group__3__Impl rule__Calview__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2190:2: rule__Calview__Group__3__Impl rule__Calview__Group__4
            {
            pushFollow(FOLLOW_rule__Calview__Group__3__Impl_in_rule__Calview__Group__34369);
            rule__Calview__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__4_in_rule__Calview__Group__34372);
            rule__Calview__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__3"


    // $ANTLR start "rule__Calview__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2197:1: rule__Calview__Group__3__Impl : ( 'get' ) ;
    public final void rule__Calview__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2201:1: ( ( 'get' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2202:1: ( 'get' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2202:1: ( 'get' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2203:1: 'get'
            {
             before(grammarAccess.getCalviewAccess().getGetKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Calview__Group__3__Impl4400); 
             after(grammarAccess.getCalviewAccess().getGetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__3__Impl"


    // $ANTLR start "rule__Calview__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2216:1: rule__Calview__Group__4 : rule__Calview__Group__4__Impl rule__Calview__Group__5 ;
    public final void rule__Calview__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2220:1: ( rule__Calview__Group__4__Impl rule__Calview__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2221:2: rule__Calview__Group__4__Impl rule__Calview__Group__5
            {
            pushFollow(FOLLOW_rule__Calview__Group__4__Impl_in_rule__Calview__Group__44431);
            rule__Calview__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__5_in_rule__Calview__Group__44434);
            rule__Calview__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__4"


    // $ANTLR start "rule__Calview__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2228:1: rule__Calview__Group__4__Impl : ( ( rule__Calview__GetAssignment_4 ) ) ;
    public final void rule__Calview__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2232:1: ( ( ( rule__Calview__GetAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2233:1: ( ( rule__Calview__GetAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2233:1: ( ( rule__Calview__GetAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2234:1: ( rule__Calview__GetAssignment_4 )
            {
             before(grammarAccess.getCalviewAccess().getGetAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2235:1: ( rule__Calview__GetAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2235:2: rule__Calview__GetAssignment_4
            {
            pushFollow(FOLLOW_rule__Calview__GetAssignment_4_in_rule__Calview__Group__4__Impl4461);
            rule__Calview__GetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCalviewAccess().getGetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__4__Impl"


    // $ANTLR start "rule__Calview__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2245:1: rule__Calview__Group__5 : rule__Calview__Group__5__Impl rule__Calview__Group__6 ;
    public final void rule__Calview__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2249:1: ( rule__Calview__Group__5__Impl rule__Calview__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2250:2: rule__Calview__Group__5__Impl rule__Calview__Group__6
            {
            pushFollow(FOLLOW_rule__Calview__Group__5__Impl_in_rule__Calview__Group__54491);
            rule__Calview__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__6_in_rule__Calview__Group__54494);
            rule__Calview__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__5"


    // $ANTLR start "rule__Calview__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2257:1: rule__Calview__Group__5__Impl : ( 'max' ) ;
    public final void rule__Calview__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2261:1: ( ( 'max' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2262:1: ( 'max' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2262:1: ( 'max' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2263:1: 'max'
            {
             before(grammarAccess.getCalviewAccess().getMaxKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Calview__Group__5__Impl4522); 
             after(grammarAccess.getCalviewAccess().getMaxKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__5__Impl"


    // $ANTLR start "rule__Calview__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2276:1: rule__Calview__Group__6 : rule__Calview__Group__6__Impl rule__Calview__Group__7 ;
    public final void rule__Calview__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2280:1: ( rule__Calview__Group__6__Impl rule__Calview__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2281:2: rule__Calview__Group__6__Impl rule__Calview__Group__7
            {
            pushFollow(FOLLOW_rule__Calview__Group__6__Impl_in_rule__Calview__Group__64553);
            rule__Calview__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__7_in_rule__Calview__Group__64556);
            rule__Calview__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__6"


    // $ANTLR start "rule__Calview__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2288:1: rule__Calview__Group__6__Impl : ( ( rule__Calview__MaxAssignment_6 ) ) ;
    public final void rule__Calview__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2292:1: ( ( ( rule__Calview__MaxAssignment_6 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2293:1: ( ( rule__Calview__MaxAssignment_6 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2293:1: ( ( rule__Calview__MaxAssignment_6 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2294:1: ( rule__Calview__MaxAssignment_6 )
            {
             before(grammarAccess.getCalviewAccess().getMaxAssignment_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2295:1: ( rule__Calview__MaxAssignment_6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2295:2: rule__Calview__MaxAssignment_6
            {
            pushFollow(FOLLOW_rule__Calview__MaxAssignment_6_in_rule__Calview__Group__6__Impl4583);
            rule__Calview__MaxAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCalviewAccess().getMaxAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__6__Impl"


    // $ANTLR start "rule__Calview__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2305:1: rule__Calview__Group__7 : rule__Calview__Group__7__Impl rule__Calview__Group__8 ;
    public final void rule__Calview__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2309:1: ( rule__Calview__Group__7__Impl rule__Calview__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2310:2: rule__Calview__Group__7__Impl rule__Calview__Group__8
            {
            pushFollow(FOLLOW_rule__Calview__Group__7__Impl_in_rule__Calview__Group__74613);
            rule__Calview__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__8_in_rule__Calview__Group__74616);
            rule__Calview__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__7"


    // $ANTLR start "rule__Calview__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2317:1: rule__Calview__Group__7__Impl : ( 'class' ) ;
    public final void rule__Calview__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2321:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2322:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2322:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2323:1: 'class'
            {
             before(grammarAccess.getCalviewAccess().getClassKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__Calview__Group__7__Impl4644); 
             after(grammarAccess.getCalviewAccess().getClassKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__7__Impl"


    // $ANTLR start "rule__Calview__Group__8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2336:1: rule__Calview__Group__8 : rule__Calview__Group__8__Impl rule__Calview__Group__9 ;
    public final void rule__Calview__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2340:1: ( rule__Calview__Group__8__Impl rule__Calview__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2341:2: rule__Calview__Group__8__Impl rule__Calview__Group__9
            {
            pushFollow(FOLLOW_rule__Calview__Group__8__Impl_in_rule__Calview__Group__84675);
            rule__Calview__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__9_in_rule__Calview__Group__84678);
            rule__Calview__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__8"


    // $ANTLR start "rule__Calview__Group__8__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2348:1: rule__Calview__Group__8__Impl : ( ( rule__Calview__ClassAssignment_8 ) ) ;
    public final void rule__Calview__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2352:1: ( ( ( rule__Calview__ClassAssignment_8 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2353:1: ( ( rule__Calview__ClassAssignment_8 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2353:1: ( ( rule__Calview__ClassAssignment_8 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2354:1: ( rule__Calview__ClassAssignment_8 )
            {
             before(grammarAccess.getCalviewAccess().getClassAssignment_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2355:1: ( rule__Calview__ClassAssignment_8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2355:2: rule__Calview__ClassAssignment_8
            {
            pushFollow(FOLLOW_rule__Calview__ClassAssignment_8_in_rule__Calview__Group__8__Impl4705);
            rule__Calview__ClassAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCalviewAccess().getClassAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__8__Impl"


    // $ANTLR start "rule__Calview__Group__9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2365:1: rule__Calview__Group__9 : rule__Calview__Group__9__Impl rule__Calview__Group__10 ;
    public final void rule__Calview__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2369:1: ( rule__Calview__Group__9__Impl rule__Calview__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2370:2: rule__Calview__Group__9__Impl rule__Calview__Group__10
            {
            pushFollow(FOLLOW_rule__Calview__Group__9__Impl_in_rule__Calview__Group__94735);
            rule__Calview__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__10_in_rule__Calview__Group__94738);
            rule__Calview__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__9"


    // $ANTLR start "rule__Calview__Group__9__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2377:1: rule__Calview__Group__9__Impl : ( ( rule__Calview__Group_9__0 )? ) ;
    public final void rule__Calview__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2381:1: ( ( ( rule__Calview__Group_9__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2382:1: ( ( rule__Calview__Group_9__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2382:1: ( ( rule__Calview__Group_9__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2383:1: ( rule__Calview__Group_9__0 )?
            {
             before(grammarAccess.getCalviewAccess().getGroup_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2384:1: ( rule__Calview__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2384:2: rule__Calview__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Calview__Group_9__0_in_rule__Calview__Group__9__Impl4765);
                    rule__Calview__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalviewAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__9__Impl"


    // $ANTLR start "rule__Calview__Group__10"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2394:1: rule__Calview__Group__10 : rule__Calview__Group__10__Impl rule__Calview__Group__11 ;
    public final void rule__Calview__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2398:1: ( rule__Calview__Group__10__Impl rule__Calview__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2399:2: rule__Calview__Group__10__Impl rule__Calview__Group__11
            {
            pushFollow(FOLLOW_rule__Calview__Group__10__Impl_in_rule__Calview__Group__104796);
            rule__Calview__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__11_in_rule__Calview__Group__104799);
            rule__Calview__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__10"


    // $ANTLR start "rule__Calview__Group__10__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2406:1: rule__Calview__Group__10__Impl : ( ( rule__Calview__Group_10__0 )? ) ;
    public final void rule__Calview__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2410:1: ( ( ( rule__Calview__Group_10__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2411:1: ( ( rule__Calview__Group_10__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2411:1: ( ( rule__Calview__Group_10__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2412:1: ( rule__Calview__Group_10__0 )?
            {
             before(grammarAccess.getCalviewAccess().getGroup_10()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2413:1: ( rule__Calview__Group_10__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2413:2: rule__Calview__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Calview__Group_10__0_in_rule__Calview__Group__10__Impl4826);
                    rule__Calview__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalviewAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__10__Impl"


    // $ANTLR start "rule__Calview__Group__11"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2423:1: rule__Calview__Group__11 : rule__Calview__Group__11__Impl ;
    public final void rule__Calview__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2427:1: ( rule__Calview__Group__11__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2428:2: rule__Calview__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Calview__Group__11__Impl_in_rule__Calview__Group__114857);
            rule__Calview__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__11"


    // $ANTLR start "rule__Calview__Group__11__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2434:1: rule__Calview__Group__11__Impl : ( '}' ) ;
    public final void rule__Calview__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2438:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2439:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2439:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2440:1: '}'
            {
             before(grammarAccess.getCalviewAccess().getRightCurlyBracketKeyword_11()); 
            match(input,25,FOLLOW_25_in_rule__Calview__Group__11__Impl4885); 
             after(grammarAccess.getCalviewAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group__11__Impl"


    // $ANTLR start "rule__Calview__Group_9__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2477:1: rule__Calview__Group_9__0 : rule__Calview__Group_9__0__Impl rule__Calview__Group_9__1 ;
    public final void rule__Calview__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2481:1: ( rule__Calview__Group_9__0__Impl rule__Calview__Group_9__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2482:2: rule__Calview__Group_9__0__Impl rule__Calview__Group_9__1
            {
            pushFollow(FOLLOW_rule__Calview__Group_9__0__Impl_in_rule__Calview__Group_9__04940);
            rule__Calview__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group_9__1_in_rule__Calview__Group_9__04943);
            rule__Calview__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group_9__0"


    // $ANTLR start "rule__Calview__Group_9__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2489:1: rule__Calview__Group_9__0__Impl : ( 'all-forecast-color' ) ;
    public final void rule__Calview__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2493:1: ( ( 'all-forecast-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2494:1: ( 'all-forecast-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2494:1: ( 'all-forecast-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2495:1: 'all-forecast-color'
            {
             before(grammarAccess.getCalviewAccess().getAllForecastColorKeyword_9_0()); 
            match(input,35,FOLLOW_35_in_rule__Calview__Group_9__0__Impl4971); 
             after(grammarAccess.getCalviewAccess().getAllForecastColorKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group_9__0__Impl"


    // $ANTLR start "rule__Calview__Group_9__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2508:1: rule__Calview__Group_9__1 : rule__Calview__Group_9__1__Impl ;
    public final void rule__Calview__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2512:1: ( rule__Calview__Group_9__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2513:2: rule__Calview__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Calview__Group_9__1__Impl_in_rule__Calview__Group_9__15002);
            rule__Calview__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group_9__1"


    // $ANTLR start "rule__Calview__Group_9__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2519:1: rule__Calview__Group_9__1__Impl : ( ( rule__Calview__AllFCAssignment_9_1 ) ) ;
    public final void rule__Calview__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2523:1: ( ( ( rule__Calview__AllFCAssignment_9_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2524:1: ( ( rule__Calview__AllFCAssignment_9_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2524:1: ( ( rule__Calview__AllFCAssignment_9_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2525:1: ( rule__Calview__AllFCAssignment_9_1 )
            {
             before(grammarAccess.getCalviewAccess().getAllFCAssignment_9_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2526:1: ( rule__Calview__AllFCAssignment_9_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2526:2: rule__Calview__AllFCAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Calview__AllFCAssignment_9_1_in_rule__Calview__Group_9__1__Impl5029);
            rule__Calview__AllFCAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCalviewAccess().getAllFCAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group_9__1__Impl"


    // $ANTLR start "rule__Calview__Group_10__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2540:1: rule__Calview__Group_10__0 : rule__Calview__Group_10__0__Impl rule__Calview__Group_10__1 ;
    public final void rule__Calview__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2544:1: ( rule__Calview__Group_10__0__Impl rule__Calview__Group_10__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2545:2: rule__Calview__Group_10__0__Impl rule__Calview__Group_10__1
            {
            pushFollow(FOLLOW_rule__Calview__Group_10__0__Impl_in_rule__Calview__Group_10__05063);
            rule__Calview__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group_10__1_in_rule__Calview__Group_10__05066);
            rule__Calview__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group_10__0"


    // $ANTLR start "rule__Calview__Group_10__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2552:1: rule__Calview__Group_10__0__Impl : ( 'all-today-color' ) ;
    public final void rule__Calview__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2556:1: ( ( 'all-today-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2557:1: ( 'all-today-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2557:1: ( 'all-today-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2558:1: 'all-today-color'
            {
             before(grammarAccess.getCalviewAccess().getAllTodayColorKeyword_10_0()); 
            match(input,36,FOLLOW_36_in_rule__Calview__Group_10__0__Impl5094); 
             after(grammarAccess.getCalviewAccess().getAllTodayColorKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group_10__0__Impl"


    // $ANTLR start "rule__Calview__Group_10__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2571:1: rule__Calview__Group_10__1 : rule__Calview__Group_10__1__Impl ;
    public final void rule__Calview__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2575:1: ( rule__Calview__Group_10__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2576:2: rule__Calview__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Calview__Group_10__1__Impl_in_rule__Calview__Group_10__15125);
            rule__Calview__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group_10__1"


    // $ANTLR start "rule__Calview__Group_10__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2582:1: rule__Calview__Group_10__1__Impl : ( ( rule__Calview__AllTCAssignment_10_1 ) ) ;
    public final void rule__Calview__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2586:1: ( ( ( rule__Calview__AllTCAssignment_10_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2587:1: ( ( rule__Calview__AllTCAssignment_10_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2587:1: ( ( rule__Calview__AllTCAssignment_10_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2588:1: ( rule__Calview__AllTCAssignment_10_1 )
            {
             before(grammarAccess.getCalviewAccess().getAllTCAssignment_10_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2589:1: ( rule__Calview__AllTCAssignment_10_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2589:2: rule__Calview__AllTCAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Calview__AllTCAssignment_10_1_in_rule__Calview__Group_10__1__Impl5152);
            rule__Calview__AllTCAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getCalviewAccess().getAllTCAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__Group_10__1__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2603:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2607:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2608:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__05186);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__05189);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2615:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2619:1: ( ( 'button' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2620:1: ( 'button' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2620:1: ( 'button' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2621:1: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Button__Group__0__Impl5217); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2634:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2638:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2639:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__15248);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__2_in_rule__Button__Group__15251);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2646:1: rule__Button__Group__1__Impl : ( '{' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2650:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2651:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2651:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2652:1: '{'
            {
             before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Button__Group__1__Impl5279); 
             after(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2665:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2669:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2670:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__25310);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__3_in_rule__Button__Group__25313);
            rule__Button__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2677:1: rule__Button__Group__2__Impl : ( ( rule__Button__IdAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2681:1: ( ( ( rule__Button__IdAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2682:1: ( ( rule__Button__IdAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2682:1: ( ( rule__Button__IdAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2683:1: ( rule__Button__IdAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getIdAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2684:1: ( rule__Button__IdAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2684:2: rule__Button__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__Button__IdAssignment_2_in_rule__Button__Group__2__Impl5340);
            rule__Button__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2694:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2698:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2699:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__35370);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__4_in_rule__Button__Group__35373);
            rule__Button__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2706:1: rule__Button__Group__3__Impl : ( ( rule__Button__Group_3__0 )? ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2710:1: ( ( ( rule__Button__Group_3__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2711:1: ( ( rule__Button__Group_3__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2711:1: ( ( rule__Button__Group_3__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2712:1: ( rule__Button__Group_3__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_3()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2713:1: ( rule__Button__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2713:2: rule__Button__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Button__Group_3__0_in_rule__Button__Group__3__Impl5400);
                    rule__Button__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2723:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2727:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2728:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__45431);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__5_in_rule__Button__Group__45434);
            rule__Button__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2735:1: rule__Button__Group__4__Impl : ( 'icon' ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2739:1: ( ( 'icon' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2740:1: ( 'icon' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2740:1: ( 'icon' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2741:1: 'icon'
            {
             before(grammarAccess.getButtonAccess().getIconKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__Button__Group__4__Impl5462); 
             after(grammarAccess.getButtonAccess().getIconKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__Button__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2754:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2758:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2759:2: rule__Button__Group__5__Impl rule__Button__Group__6
            {
            pushFollow(FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__55493);
            rule__Button__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__6_in_rule__Button__Group__55496);
            rule__Button__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__5"


    // $ANTLR start "rule__Button__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2766:1: rule__Button__Group__5__Impl : ( ( rule__Button__IconAssignment_5 ) ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2770:1: ( ( ( rule__Button__IconAssignment_5 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2771:1: ( ( rule__Button__IconAssignment_5 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2771:1: ( ( rule__Button__IconAssignment_5 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2772:1: ( rule__Button__IconAssignment_5 )
            {
             before(grammarAccess.getButtonAccess().getIconAssignment_5()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2773:1: ( rule__Button__IconAssignment_5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2773:2: rule__Button__IconAssignment_5
            {
            pushFollow(FOLLOW_rule__Button__IconAssignment_5_in_rule__Button__Group__5__Impl5523);
            rule__Button__IconAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getIconAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__5__Impl"


    // $ANTLR start "rule__Button__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2783:1: rule__Button__Group__6 : rule__Button__Group__6__Impl rule__Button__Group__7 ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2787:1: ( rule__Button__Group__6__Impl rule__Button__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2788:2: rule__Button__Group__6__Impl rule__Button__Group__7
            {
            pushFollow(FOLLOW_rule__Button__Group__6__Impl_in_rule__Button__Group__65553);
            rule__Button__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__7_in_rule__Button__Group__65556);
            rule__Button__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__6"


    // $ANTLR start "rule__Button__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2795:1: rule__Button__Group__6__Impl : ( 'class' ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2799:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2800:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2800:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2801:1: 'class'
            {
             before(grammarAccess.getButtonAccess().getClassKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__Button__Group__6__Impl5584); 
             after(grammarAccess.getButtonAccess().getClassKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__6__Impl"


    // $ANTLR start "rule__Button__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2814:1: rule__Button__Group__7 : rule__Button__Group__7__Impl rule__Button__Group__8 ;
    public final void rule__Button__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2818:1: ( rule__Button__Group__7__Impl rule__Button__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2819:2: rule__Button__Group__7__Impl rule__Button__Group__8
            {
            pushFollow(FOLLOW_rule__Button__Group__7__Impl_in_rule__Button__Group__75615);
            rule__Button__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__8_in_rule__Button__Group__75618);
            rule__Button__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__7"


    // $ANTLR start "rule__Button__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2826:1: rule__Button__Group__7__Impl : ( ( rule__Button__ClassAssignment_7 ) ) ;
    public final void rule__Button__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2830:1: ( ( ( rule__Button__ClassAssignment_7 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2831:1: ( ( rule__Button__ClassAssignment_7 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2831:1: ( ( rule__Button__ClassAssignment_7 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2832:1: ( rule__Button__ClassAssignment_7 )
            {
             before(grammarAccess.getButtonAccess().getClassAssignment_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2833:1: ( rule__Button__ClassAssignment_7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2833:2: rule__Button__ClassAssignment_7
            {
            pushFollow(FOLLOW_rule__Button__ClassAssignment_7_in_rule__Button__Group__7__Impl5645);
            rule__Button__ClassAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getClassAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__7__Impl"


    // $ANTLR start "rule__Button__Group__8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2843:1: rule__Button__Group__8 : rule__Button__Group__8__Impl rule__Button__Group__9 ;
    public final void rule__Button__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2847:1: ( rule__Button__Group__8__Impl rule__Button__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2848:2: rule__Button__Group__8__Impl rule__Button__Group__9
            {
            pushFollow(FOLLOW_rule__Button__Group__8__Impl_in_rule__Button__Group__85675);
            rule__Button__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__9_in_rule__Button__Group__85678);
            rule__Button__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__8"


    // $ANTLR start "rule__Button__Group__8__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2855:1: rule__Button__Group__8__Impl : ( ( rule__Button__Group_8__0 )? ) ;
    public final void rule__Button__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2859:1: ( ( ( rule__Button__Group_8__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2860:1: ( ( rule__Button__Group_8__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2860:1: ( ( rule__Button__Group_8__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2861:1: ( rule__Button__Group_8__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2862:1: ( rule__Button__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2862:2: rule__Button__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Button__Group_8__0_in_rule__Button__Group__8__Impl5705);
                    rule__Button__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__8__Impl"


    // $ANTLR start "rule__Button__Group__9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2872:1: rule__Button__Group__9 : rule__Button__Group__9__Impl rule__Button__Group__10 ;
    public final void rule__Button__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2876:1: ( rule__Button__Group__9__Impl rule__Button__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2877:2: rule__Button__Group__9__Impl rule__Button__Group__10
            {
            pushFollow(FOLLOW_rule__Button__Group__9__Impl_in_rule__Button__Group__95736);
            rule__Button__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__10_in_rule__Button__Group__95739);
            rule__Button__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__9"


    // $ANTLR start "rule__Button__Group__9__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2884:1: rule__Button__Group__9__Impl : ( ( rule__Button__Group_9__0 )? ) ;
    public final void rule__Button__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2888:1: ( ( ( rule__Button__Group_9__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2889:1: ( ( rule__Button__Group_9__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2889:1: ( ( rule__Button__Group_9__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2890:1: ( rule__Button__Group_9__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2891:1: ( rule__Button__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2891:2: rule__Button__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Button__Group_9__0_in_rule__Button__Group__9__Impl5766);
                    rule__Button__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__9__Impl"


    // $ANTLR start "rule__Button__Group__10"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2901:1: rule__Button__Group__10 : rule__Button__Group__10__Impl ;
    public final void rule__Button__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2905:1: ( rule__Button__Group__10__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2906:2: rule__Button__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__10__Impl_in_rule__Button__Group__105797);
            rule__Button__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__10"


    // $ANTLR start "rule__Button__Group__10__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2912:1: rule__Button__Group__10__Impl : ( '}' ) ;
    public final void rule__Button__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2916:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2917:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2917:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2918:1: '}'
            {
             before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_25_in_rule__Button__Group__10__Impl5825); 
             after(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__10__Impl"


    // $ANTLR start "rule__Button__Group_3__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2953:1: rule__Button__Group_3__0 : rule__Button__Group_3__0__Impl rule__Button__Group_3__1 ;
    public final void rule__Button__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2957:1: ( rule__Button__Group_3__0__Impl rule__Button__Group_3__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2958:2: rule__Button__Group_3__0__Impl rule__Button__Group_3__1
            {
            pushFollow(FOLLOW_rule__Button__Group_3__0__Impl_in_rule__Button__Group_3__05878);
            rule__Button__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_3__1_in_rule__Button__Group_3__05881);
            rule__Button__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3__0"


    // $ANTLR start "rule__Button__Group_3__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2965:1: rule__Button__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Button__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2969:1: ( ( 'url' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2970:1: ( 'url' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2970:1: ( 'url' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2971:1: 'url'
            {
             before(grammarAccess.getButtonAccess().getUrlKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__Button__Group_3__0__Impl5909); 
             after(grammarAccess.getButtonAccess().getUrlKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3__0__Impl"


    // $ANTLR start "rule__Button__Group_3__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2984:1: rule__Button__Group_3__1 : rule__Button__Group_3__1__Impl ;
    public final void rule__Button__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2988:1: ( rule__Button__Group_3__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2989:2: rule__Button__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_3__1__Impl_in_rule__Button__Group_3__15940);
            rule__Button__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3__1"


    // $ANTLR start "rule__Button__Group_3__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2995:1: rule__Button__Group_3__1__Impl : ( ( rule__Button__UrlAssignment_3_1 ) ) ;
    public final void rule__Button__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2999:1: ( ( ( rule__Button__UrlAssignment_3_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3000:1: ( ( rule__Button__UrlAssignment_3_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3000:1: ( ( rule__Button__UrlAssignment_3_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3001:1: ( rule__Button__UrlAssignment_3_1 )
            {
             before(grammarAccess.getButtonAccess().getUrlAssignment_3_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3002:1: ( rule__Button__UrlAssignment_3_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3002:2: rule__Button__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Button__UrlAssignment_3_1_in_rule__Button__Group_3__1__Impl5967);
            rule__Button__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getUrlAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_3__1__Impl"


    // $ANTLR start "rule__Button__Group_8__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3016:1: rule__Button__Group_8__0 : rule__Button__Group_8__0__Impl rule__Button__Group_8__1 ;
    public final void rule__Button__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3020:1: ( rule__Button__Group_8__0__Impl rule__Button__Group_8__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3021:2: rule__Button__Group_8__0__Impl rule__Button__Group_8__1
            {
            pushFollow(FOLLOW_rule__Button__Group_8__0__Impl_in_rule__Button__Group_8__06001);
            rule__Button__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_8__1_in_rule__Button__Group_8__06004);
            rule__Button__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_8__0"


    // $ANTLR start "rule__Button__Group_8__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3028:1: rule__Button__Group_8__0__Impl : ( 'color' ) ;
    public final void rule__Button__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3032:1: ( ( 'color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3033:1: ( 'color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3033:1: ( 'color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3034:1: 'color'
            {
             before(grammarAccess.getButtonAccess().getColorKeyword_8_0()); 
            match(input,40,FOLLOW_40_in_rule__Button__Group_8__0__Impl6032); 
             after(grammarAccess.getButtonAccess().getColorKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_8__0__Impl"


    // $ANTLR start "rule__Button__Group_8__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3047:1: rule__Button__Group_8__1 : rule__Button__Group_8__1__Impl ;
    public final void rule__Button__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3051:1: ( rule__Button__Group_8__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3052:2: rule__Button__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_8__1__Impl_in_rule__Button__Group_8__16063);
            rule__Button__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_8__1"


    // $ANTLR start "rule__Button__Group_8__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3058:1: rule__Button__Group_8__1__Impl : ( ( rule__Button__ColorAssignment_8_1 ) ) ;
    public final void rule__Button__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3062:1: ( ( ( rule__Button__ColorAssignment_8_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3063:1: ( ( rule__Button__ColorAssignment_8_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3063:1: ( ( rule__Button__ColorAssignment_8_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3064:1: ( rule__Button__ColorAssignment_8_1 )
            {
             before(grammarAccess.getButtonAccess().getColorAssignment_8_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3065:1: ( rule__Button__ColorAssignment_8_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3065:2: rule__Button__ColorAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Button__ColorAssignment_8_1_in_rule__Button__Group_8__1__Impl6090);
            rule__Button__ColorAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getColorAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_8__1__Impl"


    // $ANTLR start "rule__Button__Group_9__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3079:1: rule__Button__Group_9__0 : rule__Button__Group_9__0__Impl rule__Button__Group_9__1 ;
    public final void rule__Button__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3083:1: ( rule__Button__Group_9__0__Impl rule__Button__Group_9__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3084:2: rule__Button__Group_9__0__Impl rule__Button__Group_9__1
            {
            pushFollow(FOLLOW_rule__Button__Group_9__0__Impl_in_rule__Button__Group_9__06124);
            rule__Button__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_9__1_in_rule__Button__Group_9__06127);
            rule__Button__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_9__0"


    // $ANTLR start "rule__Button__Group_9__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3091:1: rule__Button__Group_9__0__Impl : ( 'background-color' ) ;
    public final void rule__Button__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3095:1: ( ( 'background-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3096:1: ( 'background-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3096:1: ( 'background-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3097:1: 'background-color'
            {
             before(grammarAccess.getButtonAccess().getBackgroundColorKeyword_9_0()); 
            match(input,41,FOLLOW_41_in_rule__Button__Group_9__0__Impl6155); 
             after(grammarAccess.getButtonAccess().getBackgroundColorKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_9__0__Impl"


    // $ANTLR start "rule__Button__Group_9__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3110:1: rule__Button__Group_9__1 : rule__Button__Group_9__1__Impl ;
    public final void rule__Button__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3114:1: ( rule__Button__Group_9__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3115:2: rule__Button__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_9__1__Impl_in_rule__Button__Group_9__16186);
            rule__Button__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_9__1"


    // $ANTLR start "rule__Button__Group_9__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3121:1: rule__Button__Group_9__1__Impl : ( ( rule__Button__BackgroundColorAssignment_9_1 ) ) ;
    public final void rule__Button__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3125:1: ( ( ( rule__Button__BackgroundColorAssignment_9_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3126:1: ( ( rule__Button__BackgroundColorAssignment_9_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3126:1: ( ( rule__Button__BackgroundColorAssignment_9_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3127:1: ( rule__Button__BackgroundColorAssignment_9_1 )
            {
             before(grammarAccess.getButtonAccess().getBackgroundColorAssignment_9_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3128:1: ( rule__Button__BackgroundColorAssignment_9_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3128:2: rule__Button__BackgroundColorAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Button__BackgroundColorAssignment_9_1_in_rule__Button__Group_9__1__Impl6213);
            rule__Button__BackgroundColorAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getBackgroundColorAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_9__1__Impl"


    // $ANTLR start "rule__Symbol__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3142:1: rule__Symbol__Group__0 : rule__Symbol__Group__0__Impl rule__Symbol__Group__1 ;
    public final void rule__Symbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3146:1: ( rule__Symbol__Group__0__Impl rule__Symbol__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3147:2: rule__Symbol__Group__0__Impl rule__Symbol__Group__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group__0__Impl_in_rule__Symbol__Group__06247);
            rule__Symbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__1_in_rule__Symbol__Group__06250);
            rule__Symbol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__0"


    // $ANTLR start "rule__Symbol__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3154:1: rule__Symbol__Group__0__Impl : ( 'symbol' ) ;
    public final void rule__Symbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3158:1: ( ( 'symbol' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3159:1: ( 'symbol' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3159:1: ( 'symbol' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3160:1: 'symbol'
            {
             before(grammarAccess.getSymbolAccess().getSymbolKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Symbol__Group__0__Impl6278); 
             after(grammarAccess.getSymbolAccess().getSymbolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__0__Impl"


    // $ANTLR start "rule__Symbol__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3173:1: rule__Symbol__Group__1 : rule__Symbol__Group__1__Impl rule__Symbol__Group__2 ;
    public final void rule__Symbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3177:1: ( rule__Symbol__Group__1__Impl rule__Symbol__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3178:2: rule__Symbol__Group__1__Impl rule__Symbol__Group__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group__1__Impl_in_rule__Symbol__Group__16309);
            rule__Symbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__2_in_rule__Symbol__Group__16312);
            rule__Symbol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__1"


    // $ANTLR start "rule__Symbol__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3185:1: rule__Symbol__Group__1__Impl : ( '{' ) ;
    public final void rule__Symbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3189:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3190:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3190:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3191:1: '{'
            {
             before(grammarAccess.getSymbolAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Symbol__Group__1__Impl6340); 
             after(grammarAccess.getSymbolAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__1__Impl"


    // $ANTLR start "rule__Symbol__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3204:1: rule__Symbol__Group__2 : rule__Symbol__Group__2__Impl rule__Symbol__Group__3 ;
    public final void rule__Symbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3208:1: ( rule__Symbol__Group__2__Impl rule__Symbol__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3209:2: rule__Symbol__Group__2__Impl rule__Symbol__Group__3
            {
            pushFollow(FOLLOW_rule__Symbol__Group__2__Impl_in_rule__Symbol__Group__26371);
            rule__Symbol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__3_in_rule__Symbol__Group__26374);
            rule__Symbol__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__2"


    // $ANTLR start "rule__Symbol__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3216:1: rule__Symbol__Group__2__Impl : ( ( rule__Symbol__DeviceAssignment_2 ) ) ;
    public final void rule__Symbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3220:1: ( ( ( rule__Symbol__DeviceAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3221:1: ( ( rule__Symbol__DeviceAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3221:1: ( ( rule__Symbol__DeviceAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3222:1: ( rule__Symbol__DeviceAssignment_2 )
            {
             before(grammarAccess.getSymbolAccess().getDeviceAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3223:1: ( rule__Symbol__DeviceAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3223:2: rule__Symbol__DeviceAssignment_2
            {
            pushFollow(FOLLOW_rule__Symbol__DeviceAssignment_2_in_rule__Symbol__Group__2__Impl6401);
            rule__Symbol__DeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getDeviceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__2__Impl"


    // $ANTLR start "rule__Symbol__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3233:1: rule__Symbol__Group__3 : rule__Symbol__Group__3__Impl rule__Symbol__Group__4 ;
    public final void rule__Symbol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3237:1: ( rule__Symbol__Group__3__Impl rule__Symbol__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3238:2: rule__Symbol__Group__3__Impl rule__Symbol__Group__4
            {
            pushFollow(FOLLOW_rule__Symbol__Group__3__Impl_in_rule__Symbol__Group__36431);
            rule__Symbol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__4_in_rule__Symbol__Group__36434);
            rule__Symbol__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__3"


    // $ANTLR start "rule__Symbol__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3245:1: rule__Symbol__Group__3__Impl : ( 'get' ) ;
    public final void rule__Symbol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3249:1: ( ( 'get' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3250:1: ( 'get' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3250:1: ( 'get' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3251:1: 'get'
            {
             before(grammarAccess.getSymbolAccess().getGetKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Symbol__Group__3__Impl6462); 
             after(grammarAccess.getSymbolAccess().getGetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__3__Impl"


    // $ANTLR start "rule__Symbol__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3264:1: rule__Symbol__Group__4 : rule__Symbol__Group__4__Impl rule__Symbol__Group__5 ;
    public final void rule__Symbol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3268:1: ( rule__Symbol__Group__4__Impl rule__Symbol__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3269:2: rule__Symbol__Group__4__Impl rule__Symbol__Group__5
            {
            pushFollow(FOLLOW_rule__Symbol__Group__4__Impl_in_rule__Symbol__Group__46493);
            rule__Symbol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__5_in_rule__Symbol__Group__46496);
            rule__Symbol__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__4"


    // $ANTLR start "rule__Symbol__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3276:1: rule__Symbol__Group__4__Impl : ( ( rule__Symbol__GetAssignment_4 ) ) ;
    public final void rule__Symbol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3280:1: ( ( ( rule__Symbol__GetAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3281:1: ( ( rule__Symbol__GetAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3281:1: ( ( rule__Symbol__GetAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3282:1: ( rule__Symbol__GetAssignment_4 )
            {
             before(grammarAccess.getSymbolAccess().getGetAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3283:1: ( rule__Symbol__GetAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3283:2: rule__Symbol__GetAssignment_4
            {
            pushFollow(FOLLOW_rule__Symbol__GetAssignment_4_in_rule__Symbol__Group__4__Impl6523);
            rule__Symbol__GetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getGetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__4__Impl"


    // $ANTLR start "rule__Symbol__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3293:1: rule__Symbol__Group__5 : rule__Symbol__Group__5__Impl rule__Symbol__Group__6 ;
    public final void rule__Symbol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3297:1: ( rule__Symbol__Group__5__Impl rule__Symbol__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3298:2: rule__Symbol__Group__5__Impl rule__Symbol__Group__6
            {
            pushFollow(FOLLOW_rule__Symbol__Group__5__Impl_in_rule__Symbol__Group__56553);
            rule__Symbol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__6_in_rule__Symbol__Group__56556);
            rule__Symbol__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__5"


    // $ANTLR start "rule__Symbol__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3305:1: rule__Symbol__Group__5__Impl : ( 'getOn' ) ;
    public final void rule__Symbol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3309:1: ( ( 'getOn' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3310:1: ( 'getOn' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3310:1: ( 'getOn' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3311:1: 'getOn'
            {
             before(grammarAccess.getSymbolAccess().getGetOnKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Symbol__Group__5__Impl6584); 
             after(grammarAccess.getSymbolAccess().getGetOnKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__5__Impl"


    // $ANTLR start "rule__Symbol__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3324:1: rule__Symbol__Group__6 : rule__Symbol__Group__6__Impl rule__Symbol__Group__7 ;
    public final void rule__Symbol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3328:1: ( rule__Symbol__Group__6__Impl rule__Symbol__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3329:2: rule__Symbol__Group__6__Impl rule__Symbol__Group__7
            {
            pushFollow(FOLLOW_rule__Symbol__Group__6__Impl_in_rule__Symbol__Group__66615);
            rule__Symbol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__7_in_rule__Symbol__Group__66618);
            rule__Symbol__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__6"


    // $ANTLR start "rule__Symbol__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3336:1: rule__Symbol__Group__6__Impl : ( ( rule__Symbol__GetOnAssignment_6 )* ) ;
    public final void rule__Symbol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3340:1: ( ( ( rule__Symbol__GetOnAssignment_6 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3341:1: ( ( rule__Symbol__GetOnAssignment_6 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3341:1: ( ( rule__Symbol__GetOnAssignment_6 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3342:1: ( rule__Symbol__GetOnAssignment_6 )*
            {
             before(grammarAccess.getSymbolAccess().getGetOnAssignment_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3343:1: ( rule__Symbol__GetOnAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3343:2: rule__Symbol__GetOnAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__GetOnAssignment_6_in_rule__Symbol__Group__6__Impl6645);
            	    rule__Symbol__GetOnAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSymbolAccess().getGetOnAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__6__Impl"


    // $ANTLR start "rule__Symbol__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3353:1: rule__Symbol__Group__7 : rule__Symbol__Group__7__Impl rule__Symbol__Group__8 ;
    public final void rule__Symbol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3357:1: ( rule__Symbol__Group__7__Impl rule__Symbol__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3358:2: rule__Symbol__Group__7__Impl rule__Symbol__Group__8
            {
            pushFollow(FOLLOW_rule__Symbol__Group__7__Impl_in_rule__Symbol__Group__76676);
            rule__Symbol__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__8_in_rule__Symbol__Group__76679);
            rule__Symbol__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__7"


    // $ANTLR start "rule__Symbol__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3365:1: rule__Symbol__Group__7__Impl : ( ( rule__Symbol__Group_7__0 )? ) ;
    public final void rule__Symbol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3369:1: ( ( ( rule__Symbol__Group_7__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3370:1: ( ( rule__Symbol__Group_7__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3370:1: ( ( rule__Symbol__Group_7__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3371:1: ( rule__Symbol__Group_7__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3372:1: ( rule__Symbol__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3372:2: rule__Symbol__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_7__0_in_rule__Symbol__Group__7__Impl6706);
                    rule__Symbol__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__7__Impl"


    // $ANTLR start "rule__Symbol__Group__8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3382:1: rule__Symbol__Group__8 : rule__Symbol__Group__8__Impl rule__Symbol__Group__9 ;
    public final void rule__Symbol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3386:1: ( rule__Symbol__Group__8__Impl rule__Symbol__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3387:2: rule__Symbol__Group__8__Impl rule__Symbol__Group__9
            {
            pushFollow(FOLLOW_rule__Symbol__Group__8__Impl_in_rule__Symbol__Group__86737);
            rule__Symbol__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__9_in_rule__Symbol__Group__86740);
            rule__Symbol__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__8"


    // $ANTLR start "rule__Symbol__Group__8__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3394:1: rule__Symbol__Group__8__Impl : ( ( rule__Symbol__Group_8__0 )? ) ;
    public final void rule__Symbol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3398:1: ( ( ( rule__Symbol__Group_8__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3399:1: ( ( rule__Symbol__Group_8__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3399:1: ( ( rule__Symbol__Group_8__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3400:1: ( rule__Symbol__Group_8__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3401:1: ( rule__Symbol__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3401:2: rule__Symbol__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_8__0_in_rule__Symbol__Group__8__Impl6767);
                    rule__Symbol__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__8__Impl"


    // $ANTLR start "rule__Symbol__Group__9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3411:1: rule__Symbol__Group__9 : rule__Symbol__Group__9__Impl rule__Symbol__Group__10 ;
    public final void rule__Symbol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3415:1: ( rule__Symbol__Group__9__Impl rule__Symbol__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3416:2: rule__Symbol__Group__9__Impl rule__Symbol__Group__10
            {
            pushFollow(FOLLOW_rule__Symbol__Group__9__Impl_in_rule__Symbol__Group__96798);
            rule__Symbol__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__10_in_rule__Symbol__Group__96801);
            rule__Symbol__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__9"


    // $ANTLR start "rule__Symbol__Group__9__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3423:1: rule__Symbol__Group__9__Impl : ( ( rule__Symbol__Group_9__0 )? ) ;
    public final void rule__Symbol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3427:1: ( ( ( rule__Symbol__Group_9__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3428:1: ( ( rule__Symbol__Group_9__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3428:1: ( ( rule__Symbol__Group_9__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3429:1: ( rule__Symbol__Group_9__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3430:1: ( rule__Symbol__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3430:2: rule__Symbol__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_9__0_in_rule__Symbol__Group__9__Impl6828);
                    rule__Symbol__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__9__Impl"


    // $ANTLR start "rule__Symbol__Group__10"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3440:1: rule__Symbol__Group__10 : rule__Symbol__Group__10__Impl rule__Symbol__Group__11 ;
    public final void rule__Symbol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3444:1: ( rule__Symbol__Group__10__Impl rule__Symbol__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3445:2: rule__Symbol__Group__10__Impl rule__Symbol__Group__11
            {
            pushFollow(FOLLOW_rule__Symbol__Group__10__Impl_in_rule__Symbol__Group__106859);
            rule__Symbol__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__11_in_rule__Symbol__Group__106862);
            rule__Symbol__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__10"


    // $ANTLR start "rule__Symbol__Group__10__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3452:1: rule__Symbol__Group__10__Impl : ( ( rule__Symbol__Group_10__0 )? ) ;
    public final void rule__Symbol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3456:1: ( ( ( rule__Symbol__Group_10__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3457:1: ( ( rule__Symbol__Group_10__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3457:1: ( ( rule__Symbol__Group_10__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3458:1: ( rule__Symbol__Group_10__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_10()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3459:1: ( rule__Symbol__Group_10__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3459:2: rule__Symbol__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_10__0_in_rule__Symbol__Group__10__Impl6889);
                    rule__Symbol__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__10__Impl"


    // $ANTLR start "rule__Symbol__Group__11"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3469:1: rule__Symbol__Group__11 : rule__Symbol__Group__11__Impl rule__Symbol__Group__12 ;
    public final void rule__Symbol__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3473:1: ( rule__Symbol__Group__11__Impl rule__Symbol__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3474:2: rule__Symbol__Group__11__Impl rule__Symbol__Group__12
            {
            pushFollow(FOLLOW_rule__Symbol__Group__11__Impl_in_rule__Symbol__Group__116920);
            rule__Symbol__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__12_in_rule__Symbol__Group__116923);
            rule__Symbol__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__11"


    // $ANTLR start "rule__Symbol__Group__11__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3481:1: rule__Symbol__Group__11__Impl : ( ( rule__Symbol__Group_11__0 )? ) ;
    public final void rule__Symbol__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3485:1: ( ( ( rule__Symbol__Group_11__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3486:1: ( ( rule__Symbol__Group_11__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3486:1: ( ( rule__Symbol__Group_11__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3487:1: ( rule__Symbol__Group_11__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3488:1: ( rule__Symbol__Group_11__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3488:2: rule__Symbol__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_11__0_in_rule__Symbol__Group__11__Impl6950);
                    rule__Symbol__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__11__Impl"


    // $ANTLR start "rule__Symbol__Group__12"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3498:1: rule__Symbol__Group__12 : rule__Symbol__Group__12__Impl rule__Symbol__Group__13 ;
    public final void rule__Symbol__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3502:1: ( rule__Symbol__Group__12__Impl rule__Symbol__Group__13 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3503:2: rule__Symbol__Group__12__Impl rule__Symbol__Group__13
            {
            pushFollow(FOLLOW_rule__Symbol__Group__12__Impl_in_rule__Symbol__Group__126981);
            rule__Symbol__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__13_in_rule__Symbol__Group__126984);
            rule__Symbol__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__12"


    // $ANTLR start "rule__Symbol__Group__12__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3510:1: rule__Symbol__Group__12__Impl : ( ( rule__Symbol__Group_12__0 )? ) ;
    public final void rule__Symbol__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3514:1: ( ( ( rule__Symbol__Group_12__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3515:1: ( ( rule__Symbol__Group_12__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3515:1: ( ( rule__Symbol__Group_12__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3516:1: ( rule__Symbol__Group_12__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_12()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3517:1: ( rule__Symbol__Group_12__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3517:2: rule__Symbol__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_12__0_in_rule__Symbol__Group__12__Impl7011);
                    rule__Symbol__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__12__Impl"


    // $ANTLR start "rule__Symbol__Group__13"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3527:1: rule__Symbol__Group__13 : rule__Symbol__Group__13__Impl rule__Symbol__Group__14 ;
    public final void rule__Symbol__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3531:1: ( rule__Symbol__Group__13__Impl rule__Symbol__Group__14 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3532:2: rule__Symbol__Group__13__Impl rule__Symbol__Group__14
            {
            pushFollow(FOLLOW_rule__Symbol__Group__13__Impl_in_rule__Symbol__Group__137042);
            rule__Symbol__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__14_in_rule__Symbol__Group__137045);
            rule__Symbol__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__13"


    // $ANTLR start "rule__Symbol__Group__13__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3539:1: rule__Symbol__Group__13__Impl : ( ( rule__Symbol__Group_13__0 )? ) ;
    public final void rule__Symbol__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3543:1: ( ( ( rule__Symbol__Group_13__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3544:1: ( ( rule__Symbol__Group_13__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3544:1: ( ( rule__Symbol__Group_13__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3545:1: ( rule__Symbol__Group_13__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_13()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3546:1: ( rule__Symbol__Group_13__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3546:2: rule__Symbol__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_13__0_in_rule__Symbol__Group__13__Impl7072);
                    rule__Symbol__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__13__Impl"


    // $ANTLR start "rule__Symbol__Group__14"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3556:1: rule__Symbol__Group__14 : rule__Symbol__Group__14__Impl rule__Symbol__Group__15 ;
    public final void rule__Symbol__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3560:1: ( rule__Symbol__Group__14__Impl rule__Symbol__Group__15 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3561:2: rule__Symbol__Group__14__Impl rule__Symbol__Group__15
            {
            pushFollow(FOLLOW_rule__Symbol__Group__14__Impl_in_rule__Symbol__Group__147103);
            rule__Symbol__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__15_in_rule__Symbol__Group__147106);
            rule__Symbol__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__14"


    // $ANTLR start "rule__Symbol__Group__14__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3568:1: rule__Symbol__Group__14__Impl : ( ( rule__Symbol__Group_14__0 )? ) ;
    public final void rule__Symbol__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3572:1: ( ( ( rule__Symbol__Group_14__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3573:1: ( ( rule__Symbol__Group_14__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3573:1: ( ( rule__Symbol__Group_14__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3574:1: ( rule__Symbol__Group_14__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_14()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3575:1: ( rule__Symbol__Group_14__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3575:2: rule__Symbol__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_14__0_in_rule__Symbol__Group__14__Impl7133);
                    rule__Symbol__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__14__Impl"


    // $ANTLR start "rule__Symbol__Group__15"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3585:1: rule__Symbol__Group__15 : rule__Symbol__Group__15__Impl rule__Symbol__Group__16 ;
    public final void rule__Symbol__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3589:1: ( rule__Symbol__Group__15__Impl rule__Symbol__Group__16 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3590:2: rule__Symbol__Group__15__Impl rule__Symbol__Group__16
            {
            pushFollow(FOLLOW_rule__Symbol__Group__15__Impl_in_rule__Symbol__Group__157164);
            rule__Symbol__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__16_in_rule__Symbol__Group__157167);
            rule__Symbol__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__15"


    // $ANTLR start "rule__Symbol__Group__15__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3597:1: rule__Symbol__Group__15__Impl : ( ( rule__Symbol__Group_15__0 )? ) ;
    public final void rule__Symbol__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3601:1: ( ( ( rule__Symbol__Group_15__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3602:1: ( ( rule__Symbol__Group_15__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3602:1: ( ( rule__Symbol__Group_15__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3603:1: ( rule__Symbol__Group_15__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_15()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3604:1: ( rule__Symbol__Group_15__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==53) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3604:2: rule__Symbol__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_15__0_in_rule__Symbol__Group__15__Impl7194);
                    rule__Symbol__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSymbolAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__15__Impl"


    // $ANTLR start "rule__Symbol__Group__16"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3614:1: rule__Symbol__Group__16 : rule__Symbol__Group__16__Impl ;
    public final void rule__Symbol__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3618:1: ( rule__Symbol__Group__16__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3619:2: rule__Symbol__Group__16__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group__16__Impl_in_rule__Symbol__Group__167225);
            rule__Symbol__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__16"


    // $ANTLR start "rule__Symbol__Group__16__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3625:1: rule__Symbol__Group__16__Impl : ( '}' ) ;
    public final void rule__Symbol__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3629:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3630:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3630:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3631:1: '}'
            {
             before(grammarAccess.getSymbolAccess().getRightCurlyBracketKeyword_16()); 
            match(input,25,FOLLOW_25_in_rule__Symbol__Group__16__Impl7253); 
             after(grammarAccess.getSymbolAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group__16__Impl"


    // $ANTLR start "rule__Symbol__Group_7__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3678:1: rule__Symbol__Group_7__0 : rule__Symbol__Group_7__0__Impl rule__Symbol__Group_7__1 ;
    public final void rule__Symbol__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3682:1: ( rule__Symbol__Group_7__0__Impl rule__Symbol__Group_7__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3683:2: rule__Symbol__Group_7__0__Impl rule__Symbol__Group_7__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_7__0__Impl_in_rule__Symbol__Group_7__07318);
            rule__Symbol__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_7__1_in_rule__Symbol__Group_7__07321);
            rule__Symbol__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_7__0"


    // $ANTLR start "rule__Symbol__Group_7__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3690:1: rule__Symbol__Group_7__0__Impl : ( 'getOff' ) ;
    public final void rule__Symbol__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3694:1: ( ( 'getOff' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3695:1: ( 'getOff' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3695:1: ( 'getOff' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3696:1: 'getOff'
            {
             before(grammarAccess.getSymbolAccess().getGetOffKeyword_7_0()); 
            match(input,44,FOLLOW_44_in_rule__Symbol__Group_7__0__Impl7349); 
             after(grammarAccess.getSymbolAccess().getGetOffKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_7__0__Impl"


    // $ANTLR start "rule__Symbol__Group_7__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3709:1: rule__Symbol__Group_7__1 : rule__Symbol__Group_7__1__Impl ;
    public final void rule__Symbol__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3713:1: ( rule__Symbol__Group_7__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3714:2: rule__Symbol__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_7__1__Impl_in_rule__Symbol__Group_7__17380);
            rule__Symbol__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_7__1"


    // $ANTLR start "rule__Symbol__Group_7__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3720:1: rule__Symbol__Group_7__1__Impl : ( ( rule__Symbol__GetOffAssignment_7_1 )* ) ;
    public final void rule__Symbol__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3724:1: ( ( ( rule__Symbol__GetOffAssignment_7_1 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3725:1: ( ( rule__Symbol__GetOffAssignment_7_1 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3725:1: ( ( rule__Symbol__GetOffAssignment_7_1 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3726:1: ( rule__Symbol__GetOffAssignment_7_1 )*
            {
             before(grammarAccess.getSymbolAccess().getGetOffAssignment_7_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3727:1: ( rule__Symbol__GetOffAssignment_7_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3727:2: rule__Symbol__GetOffAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__GetOffAssignment_7_1_in_rule__Symbol__Group_7__1__Impl7407);
            	    rule__Symbol__GetOffAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSymbolAccess().getGetOffAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_7__1__Impl"


    // $ANTLR start "rule__Symbol__Group_8__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3741:1: rule__Symbol__Group_8__0 : rule__Symbol__Group_8__0__Impl rule__Symbol__Group_8__1 ;
    public final void rule__Symbol__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3745:1: ( rule__Symbol__Group_8__0__Impl rule__Symbol__Group_8__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3746:2: rule__Symbol__Group_8__0__Impl rule__Symbol__Group_8__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_8__0__Impl_in_rule__Symbol__Group_8__07442);
            rule__Symbol__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_8__1_in_rule__Symbol__Group_8__07445);
            rule__Symbol__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_8__0"


    // $ANTLR start "rule__Symbol__Group_8__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3753:1: rule__Symbol__Group_8__0__Impl : ( 'class' ) ;
    public final void rule__Symbol__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3757:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3758:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3758:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3759:1: 'class'
            {
             before(grammarAccess.getSymbolAccess().getClassKeyword_8_0()); 
            match(input,34,FOLLOW_34_in_rule__Symbol__Group_8__0__Impl7473); 
             after(grammarAccess.getSymbolAccess().getClassKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_8__0__Impl"


    // $ANTLR start "rule__Symbol__Group_8__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3772:1: rule__Symbol__Group_8__1 : rule__Symbol__Group_8__1__Impl ;
    public final void rule__Symbol__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3776:1: ( rule__Symbol__Group_8__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3777:2: rule__Symbol__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_8__1__Impl_in_rule__Symbol__Group_8__17504);
            rule__Symbol__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_8__1"


    // $ANTLR start "rule__Symbol__Group_8__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3783:1: rule__Symbol__Group_8__1__Impl : ( ( rule__Symbol__ClassAssignment_8_1 ) ) ;
    public final void rule__Symbol__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3787:1: ( ( ( rule__Symbol__ClassAssignment_8_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3788:1: ( ( rule__Symbol__ClassAssignment_8_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3788:1: ( ( rule__Symbol__ClassAssignment_8_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3789:1: ( rule__Symbol__ClassAssignment_8_1 )
            {
             before(grammarAccess.getSymbolAccess().getClassAssignment_8_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3790:1: ( rule__Symbol__ClassAssignment_8_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3790:2: rule__Symbol__ClassAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Symbol__ClassAssignment_8_1_in_rule__Symbol__Group_8__1__Impl7531);
            rule__Symbol__ClassAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getClassAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_8__1__Impl"


    // $ANTLR start "rule__Symbol__Group_9__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3804:1: rule__Symbol__Group_9__0 : rule__Symbol__Group_9__0__Impl rule__Symbol__Group_9__1 ;
    public final void rule__Symbol__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3808:1: ( rule__Symbol__Group_9__0__Impl rule__Symbol__Group_9__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3809:2: rule__Symbol__Group_9__0__Impl rule__Symbol__Group_9__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_9__0__Impl_in_rule__Symbol__Group_9__07565);
            rule__Symbol__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_9__1_in_rule__Symbol__Group_9__07568);
            rule__Symbol__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_9__0"


    // $ANTLR start "rule__Symbol__Group_9__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3816:1: rule__Symbol__Group_9__0__Impl : ( 'background-icon' ) ;
    public final void rule__Symbol__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3820:1: ( ( 'background-icon' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3821:1: ( 'background-icon' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3821:1: ( 'background-icon' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3822:1: 'background-icon'
            {
             before(grammarAccess.getSymbolAccess().getBackgroundIconKeyword_9_0()); 
            match(input,45,FOLLOW_45_in_rule__Symbol__Group_9__0__Impl7596); 
             after(grammarAccess.getSymbolAccess().getBackgroundIconKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_9__0__Impl"


    // $ANTLR start "rule__Symbol__Group_9__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3835:1: rule__Symbol__Group_9__1 : rule__Symbol__Group_9__1__Impl ;
    public final void rule__Symbol__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3839:1: ( rule__Symbol__Group_9__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3840:2: rule__Symbol__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_9__1__Impl_in_rule__Symbol__Group_9__17627);
            rule__Symbol__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_9__1"


    // $ANTLR start "rule__Symbol__Group_9__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3846:1: rule__Symbol__Group_9__1__Impl : ( ( rule__Symbol__BgiconAssignment_9_1 ) ) ;
    public final void rule__Symbol__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3850:1: ( ( ( rule__Symbol__BgiconAssignment_9_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3851:1: ( ( rule__Symbol__BgiconAssignment_9_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3851:1: ( ( rule__Symbol__BgiconAssignment_9_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3852:1: ( rule__Symbol__BgiconAssignment_9_1 )
            {
             before(grammarAccess.getSymbolAccess().getBgiconAssignment_9_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3853:1: ( rule__Symbol__BgiconAssignment_9_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3853:2: rule__Symbol__BgiconAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Symbol__BgiconAssignment_9_1_in_rule__Symbol__Group_9__1__Impl7654);
            rule__Symbol__BgiconAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getBgiconAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_9__1__Impl"


    // $ANTLR start "rule__Symbol__Group_10__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3867:1: rule__Symbol__Group_10__0 : rule__Symbol__Group_10__0__Impl rule__Symbol__Group_10__1 ;
    public final void rule__Symbol__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3871:1: ( rule__Symbol__Group_10__0__Impl rule__Symbol__Group_10__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3872:2: rule__Symbol__Group_10__0__Impl rule__Symbol__Group_10__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_10__0__Impl_in_rule__Symbol__Group_10__07688);
            rule__Symbol__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_10__1_in_rule__Symbol__Group_10__07691);
            rule__Symbol__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_10__0"


    // $ANTLR start "rule__Symbol__Group_10__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3879:1: rule__Symbol__Group_10__0__Impl : ( 'background-on-color' ) ;
    public final void rule__Symbol__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3883:1: ( ( 'background-on-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3884:1: ( 'background-on-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3884:1: ( 'background-on-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3885:1: 'background-on-color'
            {
             before(grammarAccess.getSymbolAccess().getBackgroundOnColorKeyword_10_0()); 
            match(input,46,FOLLOW_46_in_rule__Symbol__Group_10__0__Impl7719); 
             after(grammarAccess.getSymbolAccess().getBackgroundOnColorKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_10__0__Impl"


    // $ANTLR start "rule__Symbol__Group_10__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3898:1: rule__Symbol__Group_10__1 : rule__Symbol__Group_10__1__Impl ;
    public final void rule__Symbol__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3902:1: ( rule__Symbol__Group_10__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3903:2: rule__Symbol__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_10__1__Impl_in_rule__Symbol__Group_10__17750);
            rule__Symbol__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_10__1"


    // $ANTLR start "rule__Symbol__Group_10__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3909:1: rule__Symbol__Group_10__1__Impl : ( ( rule__Symbol__OnBackGroundColorAssignment_10_1 ) ) ;
    public final void rule__Symbol__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3913:1: ( ( ( rule__Symbol__OnBackGroundColorAssignment_10_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3914:1: ( ( rule__Symbol__OnBackGroundColorAssignment_10_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3914:1: ( ( rule__Symbol__OnBackGroundColorAssignment_10_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3915:1: ( rule__Symbol__OnBackGroundColorAssignment_10_1 )
            {
             before(grammarAccess.getSymbolAccess().getOnBackGroundColorAssignment_10_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3916:1: ( rule__Symbol__OnBackGroundColorAssignment_10_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3916:2: rule__Symbol__OnBackGroundColorAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Symbol__OnBackGroundColorAssignment_10_1_in_rule__Symbol__Group_10__1__Impl7777);
            rule__Symbol__OnBackGroundColorAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getOnBackGroundColorAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_10__1__Impl"


    // $ANTLR start "rule__Symbol__Group_11__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3930:1: rule__Symbol__Group_11__0 : rule__Symbol__Group_11__0__Impl rule__Symbol__Group_11__1 ;
    public final void rule__Symbol__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3934:1: ( rule__Symbol__Group_11__0__Impl rule__Symbol__Group_11__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3935:2: rule__Symbol__Group_11__0__Impl rule__Symbol__Group_11__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_11__0__Impl_in_rule__Symbol__Group_11__07811);
            rule__Symbol__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_11__1_in_rule__Symbol__Group_11__07814);
            rule__Symbol__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_11__0"


    // $ANTLR start "rule__Symbol__Group_11__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3942:1: rule__Symbol__Group_11__0__Impl : ( 'on-color' ) ;
    public final void rule__Symbol__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3946:1: ( ( 'on-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3947:1: ( 'on-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3947:1: ( 'on-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3948:1: 'on-color'
            {
             before(grammarAccess.getSymbolAccess().getOnColorKeyword_11_0()); 
            match(input,47,FOLLOW_47_in_rule__Symbol__Group_11__0__Impl7842); 
             after(grammarAccess.getSymbolAccess().getOnColorKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_11__0__Impl"


    // $ANTLR start "rule__Symbol__Group_11__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3961:1: rule__Symbol__Group_11__1 : rule__Symbol__Group_11__1__Impl ;
    public final void rule__Symbol__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3965:1: ( rule__Symbol__Group_11__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3966:2: rule__Symbol__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_11__1__Impl_in_rule__Symbol__Group_11__17873);
            rule__Symbol__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_11__1"


    // $ANTLR start "rule__Symbol__Group_11__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3972:1: rule__Symbol__Group_11__1__Impl : ( ( rule__Symbol__OnColorAssignment_11_1 ) ) ;
    public final void rule__Symbol__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3976:1: ( ( ( rule__Symbol__OnColorAssignment_11_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3977:1: ( ( rule__Symbol__OnColorAssignment_11_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3977:1: ( ( rule__Symbol__OnColorAssignment_11_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3978:1: ( rule__Symbol__OnColorAssignment_11_1 )
            {
             before(grammarAccess.getSymbolAccess().getOnColorAssignment_11_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3979:1: ( rule__Symbol__OnColorAssignment_11_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3979:2: rule__Symbol__OnColorAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Symbol__OnColorAssignment_11_1_in_rule__Symbol__Group_11__1__Impl7900);
            rule__Symbol__OnColorAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getOnColorAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_11__1__Impl"


    // $ANTLR start "rule__Symbol__Group_12__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3993:1: rule__Symbol__Group_12__0 : rule__Symbol__Group_12__0__Impl rule__Symbol__Group_12__1 ;
    public final void rule__Symbol__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3997:1: ( rule__Symbol__Group_12__0__Impl rule__Symbol__Group_12__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3998:2: rule__Symbol__Group_12__0__Impl rule__Symbol__Group_12__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_12__0__Impl_in_rule__Symbol__Group_12__07934);
            rule__Symbol__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_12__1_in_rule__Symbol__Group_12__07937);
            rule__Symbol__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_12__0"


    // $ANTLR start "rule__Symbol__Group_12__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4005:1: rule__Symbol__Group_12__0__Impl : ( 'off-color' ) ;
    public final void rule__Symbol__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4009:1: ( ( 'off-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4010:1: ( 'off-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4010:1: ( 'off-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4011:1: 'off-color'
            {
             before(grammarAccess.getSymbolAccess().getOffColorKeyword_12_0()); 
            match(input,48,FOLLOW_48_in_rule__Symbol__Group_12__0__Impl7965); 
             after(grammarAccess.getSymbolAccess().getOffColorKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_12__0__Impl"


    // $ANTLR start "rule__Symbol__Group_12__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4024:1: rule__Symbol__Group_12__1 : rule__Symbol__Group_12__1__Impl ;
    public final void rule__Symbol__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4028:1: ( rule__Symbol__Group_12__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4029:2: rule__Symbol__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_12__1__Impl_in_rule__Symbol__Group_12__17996);
            rule__Symbol__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_12__1"


    // $ANTLR start "rule__Symbol__Group_12__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4035:1: rule__Symbol__Group_12__1__Impl : ( ( rule__Symbol__OffColorAssignment_12_1 ) ) ;
    public final void rule__Symbol__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4039:1: ( ( ( rule__Symbol__OffColorAssignment_12_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4040:1: ( ( rule__Symbol__OffColorAssignment_12_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4040:1: ( ( rule__Symbol__OffColorAssignment_12_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4041:1: ( rule__Symbol__OffColorAssignment_12_1 )
            {
             before(grammarAccess.getSymbolAccess().getOffColorAssignment_12_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4042:1: ( rule__Symbol__OffColorAssignment_12_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4042:2: rule__Symbol__OffColorAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Symbol__OffColorAssignment_12_1_in_rule__Symbol__Group_12__1__Impl8023);
            rule__Symbol__OffColorAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getOffColorAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_12__1__Impl"


    // $ANTLR start "rule__Symbol__Group_13__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4056:1: rule__Symbol__Group_13__0 : rule__Symbol__Group_13__0__Impl rule__Symbol__Group_13__1 ;
    public final void rule__Symbol__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4060:1: ( rule__Symbol__Group_13__0__Impl rule__Symbol__Group_13__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4061:2: rule__Symbol__Group_13__0__Impl rule__Symbol__Group_13__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_13__0__Impl_in_rule__Symbol__Group_13__08057);
            rule__Symbol__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_13__1_in_rule__Symbol__Group_13__08060);
            rule__Symbol__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_13__0"


    // $ANTLR start "rule__Symbol__Group_13__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4068:1: rule__Symbol__Group_13__0__Impl : ( 'icons' ) ;
    public final void rule__Symbol__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4072:1: ( ( 'icons' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4073:1: ( 'icons' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4073:1: ( 'icons' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4074:1: 'icons'
            {
             before(grammarAccess.getSymbolAccess().getIconsKeyword_13_0()); 
            match(input,49,FOLLOW_49_in_rule__Symbol__Group_13__0__Impl8088); 
             after(grammarAccess.getSymbolAccess().getIconsKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_13__0__Impl"


    // $ANTLR start "rule__Symbol__Group_13__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4087:1: rule__Symbol__Group_13__1 : rule__Symbol__Group_13__1__Impl rule__Symbol__Group_13__2 ;
    public final void rule__Symbol__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4091:1: ( rule__Symbol__Group_13__1__Impl rule__Symbol__Group_13__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4092:2: rule__Symbol__Group_13__1__Impl rule__Symbol__Group_13__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group_13__1__Impl_in_rule__Symbol__Group_13__18119);
            rule__Symbol__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_13__2_in_rule__Symbol__Group_13__18122);
            rule__Symbol__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_13__1"


    // $ANTLR start "rule__Symbol__Group_13__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4099:1: rule__Symbol__Group_13__1__Impl : ( '[' ) ;
    public final void rule__Symbol__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4103:1: ( ( '[' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4104:1: ( '[' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4104:1: ( '[' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4105:1: '['
            {
             before(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_13_1()); 
            match(input,50,FOLLOW_50_in_rule__Symbol__Group_13__1__Impl8150); 
             after(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_13__1__Impl"


    // $ANTLR start "rule__Symbol__Group_13__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4118:1: rule__Symbol__Group_13__2 : rule__Symbol__Group_13__2__Impl rule__Symbol__Group_13__3 ;
    public final void rule__Symbol__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4122:1: ( rule__Symbol__Group_13__2__Impl rule__Symbol__Group_13__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4123:2: rule__Symbol__Group_13__2__Impl rule__Symbol__Group_13__3
            {
            pushFollow(FOLLOW_rule__Symbol__Group_13__2__Impl_in_rule__Symbol__Group_13__28181);
            rule__Symbol__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_13__3_in_rule__Symbol__Group_13__28184);
            rule__Symbol__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_13__2"


    // $ANTLR start "rule__Symbol__Group_13__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4130:1: rule__Symbol__Group_13__2__Impl : ( ( rule__Symbol__IconsAssignment_13_2 )* ) ;
    public final void rule__Symbol__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4134:1: ( ( ( rule__Symbol__IconsAssignment_13_2 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4135:1: ( ( rule__Symbol__IconsAssignment_13_2 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4135:1: ( ( rule__Symbol__IconsAssignment_13_2 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4136:1: ( rule__Symbol__IconsAssignment_13_2 )*
            {
             before(grammarAccess.getSymbolAccess().getIconsAssignment_13_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4137:1: ( rule__Symbol__IconsAssignment_13_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4137:2: rule__Symbol__IconsAssignment_13_2
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__IconsAssignment_13_2_in_rule__Symbol__Group_13__2__Impl8211);
            	    rule__Symbol__IconsAssignment_13_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSymbolAccess().getIconsAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_13__2__Impl"


    // $ANTLR start "rule__Symbol__Group_13__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4147:1: rule__Symbol__Group_13__3 : rule__Symbol__Group_13__3__Impl ;
    public final void rule__Symbol__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4151:1: ( rule__Symbol__Group_13__3__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4152:2: rule__Symbol__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_13__3__Impl_in_rule__Symbol__Group_13__38242);
            rule__Symbol__Group_13__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_13__3"


    // $ANTLR start "rule__Symbol__Group_13__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4158:1: rule__Symbol__Group_13__3__Impl : ( ']' ) ;
    public final void rule__Symbol__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4162:1: ( ( ']' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4163:1: ( ']' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4163:1: ( ']' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4164:1: ']'
            {
             before(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_13_3()); 
            match(input,51,FOLLOW_51_in_rule__Symbol__Group_13__3__Impl8270); 
             after(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_13__3__Impl"


    // $ANTLR start "rule__Symbol__Group_14__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4185:1: rule__Symbol__Group_14__0 : rule__Symbol__Group_14__0__Impl rule__Symbol__Group_14__1 ;
    public final void rule__Symbol__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4189:1: ( rule__Symbol__Group_14__0__Impl rule__Symbol__Group_14__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4190:2: rule__Symbol__Group_14__0__Impl rule__Symbol__Group_14__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_14__0__Impl_in_rule__Symbol__Group_14__08309);
            rule__Symbol__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_14__1_in_rule__Symbol__Group_14__08312);
            rule__Symbol__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_14__0"


    // $ANTLR start "rule__Symbol__Group_14__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4197:1: rule__Symbol__Group_14__0__Impl : ( 'onColors' ) ;
    public final void rule__Symbol__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4201:1: ( ( 'onColors' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4202:1: ( 'onColors' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4202:1: ( 'onColors' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4203:1: 'onColors'
            {
             before(grammarAccess.getSymbolAccess().getOnColorsKeyword_14_0()); 
            match(input,52,FOLLOW_52_in_rule__Symbol__Group_14__0__Impl8340); 
             after(grammarAccess.getSymbolAccess().getOnColorsKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_14__0__Impl"


    // $ANTLR start "rule__Symbol__Group_14__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4216:1: rule__Symbol__Group_14__1 : rule__Symbol__Group_14__1__Impl rule__Symbol__Group_14__2 ;
    public final void rule__Symbol__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4220:1: ( rule__Symbol__Group_14__1__Impl rule__Symbol__Group_14__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4221:2: rule__Symbol__Group_14__1__Impl rule__Symbol__Group_14__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group_14__1__Impl_in_rule__Symbol__Group_14__18371);
            rule__Symbol__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_14__2_in_rule__Symbol__Group_14__18374);
            rule__Symbol__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_14__1"


    // $ANTLR start "rule__Symbol__Group_14__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4228:1: rule__Symbol__Group_14__1__Impl : ( '[' ) ;
    public final void rule__Symbol__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4232:1: ( ( '[' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4233:1: ( '[' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4233:1: ( '[' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4234:1: '['
            {
             before(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_14_1()); 
            match(input,50,FOLLOW_50_in_rule__Symbol__Group_14__1__Impl8402); 
             after(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_14__1__Impl"


    // $ANTLR start "rule__Symbol__Group_14__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4247:1: rule__Symbol__Group_14__2 : rule__Symbol__Group_14__2__Impl rule__Symbol__Group_14__3 ;
    public final void rule__Symbol__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4251:1: ( rule__Symbol__Group_14__2__Impl rule__Symbol__Group_14__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4252:2: rule__Symbol__Group_14__2__Impl rule__Symbol__Group_14__3
            {
            pushFollow(FOLLOW_rule__Symbol__Group_14__2__Impl_in_rule__Symbol__Group_14__28433);
            rule__Symbol__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_14__3_in_rule__Symbol__Group_14__28436);
            rule__Symbol__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_14__2"


    // $ANTLR start "rule__Symbol__Group_14__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4259:1: rule__Symbol__Group_14__2__Impl : ( ( rule__Symbol__OnColorsAssignment_14_2 )* ) ;
    public final void rule__Symbol__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4263:1: ( ( ( rule__Symbol__OnColorsAssignment_14_2 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4264:1: ( ( rule__Symbol__OnColorsAssignment_14_2 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4264:1: ( ( rule__Symbol__OnColorsAssignment_14_2 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4265:1: ( rule__Symbol__OnColorsAssignment_14_2 )*
            {
             before(grammarAccess.getSymbolAccess().getOnColorsAssignment_14_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4266:1: ( rule__Symbol__OnColorsAssignment_14_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4266:2: rule__Symbol__OnColorsAssignment_14_2
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__OnColorsAssignment_14_2_in_rule__Symbol__Group_14__2__Impl8463);
            	    rule__Symbol__OnColorsAssignment_14_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSymbolAccess().getOnColorsAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_14__2__Impl"


    // $ANTLR start "rule__Symbol__Group_14__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4276:1: rule__Symbol__Group_14__3 : rule__Symbol__Group_14__3__Impl ;
    public final void rule__Symbol__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4280:1: ( rule__Symbol__Group_14__3__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4281:2: rule__Symbol__Group_14__3__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_14__3__Impl_in_rule__Symbol__Group_14__38494);
            rule__Symbol__Group_14__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_14__3"


    // $ANTLR start "rule__Symbol__Group_14__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4287:1: rule__Symbol__Group_14__3__Impl : ( ']' ) ;
    public final void rule__Symbol__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4291:1: ( ( ']' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4292:1: ( ']' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4292:1: ( ']' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4293:1: ']'
            {
             before(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_14_3()); 
            match(input,51,FOLLOW_51_in_rule__Symbol__Group_14__3__Impl8522); 
             after(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_14__3__Impl"


    // $ANTLR start "rule__Symbol__Group_15__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4314:1: rule__Symbol__Group_15__0 : rule__Symbol__Group_15__0__Impl rule__Symbol__Group_15__1 ;
    public final void rule__Symbol__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4318:1: ( rule__Symbol__Group_15__0__Impl rule__Symbol__Group_15__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4319:2: rule__Symbol__Group_15__0__Impl rule__Symbol__Group_15__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_15__0__Impl_in_rule__Symbol__Group_15__08561);
            rule__Symbol__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_15__1_in_rule__Symbol__Group_15__08564);
            rule__Symbol__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_15__0"


    // $ANTLR start "rule__Symbol__Group_15__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4326:1: rule__Symbol__Group_15__0__Impl : ( 'onBackgroundColors' ) ;
    public final void rule__Symbol__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4330:1: ( ( 'onBackgroundColors' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4331:1: ( 'onBackgroundColors' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4331:1: ( 'onBackgroundColors' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4332:1: 'onBackgroundColors'
            {
             before(grammarAccess.getSymbolAccess().getOnBackgroundColorsKeyword_15_0()); 
            match(input,53,FOLLOW_53_in_rule__Symbol__Group_15__0__Impl8592); 
             after(grammarAccess.getSymbolAccess().getOnBackgroundColorsKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_15__0__Impl"


    // $ANTLR start "rule__Symbol__Group_15__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4345:1: rule__Symbol__Group_15__1 : rule__Symbol__Group_15__1__Impl rule__Symbol__Group_15__2 ;
    public final void rule__Symbol__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4349:1: ( rule__Symbol__Group_15__1__Impl rule__Symbol__Group_15__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4350:2: rule__Symbol__Group_15__1__Impl rule__Symbol__Group_15__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group_15__1__Impl_in_rule__Symbol__Group_15__18623);
            rule__Symbol__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_15__2_in_rule__Symbol__Group_15__18626);
            rule__Symbol__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_15__1"


    // $ANTLR start "rule__Symbol__Group_15__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4357:1: rule__Symbol__Group_15__1__Impl : ( '[' ) ;
    public final void rule__Symbol__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4361:1: ( ( '[' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4362:1: ( '[' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4362:1: ( '[' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4363:1: '['
            {
             before(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_15_1()); 
            match(input,50,FOLLOW_50_in_rule__Symbol__Group_15__1__Impl8654); 
             after(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_15__1__Impl"


    // $ANTLR start "rule__Symbol__Group_15__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4376:1: rule__Symbol__Group_15__2 : rule__Symbol__Group_15__2__Impl rule__Symbol__Group_15__3 ;
    public final void rule__Symbol__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4380:1: ( rule__Symbol__Group_15__2__Impl rule__Symbol__Group_15__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4381:2: rule__Symbol__Group_15__2__Impl rule__Symbol__Group_15__3
            {
            pushFollow(FOLLOW_rule__Symbol__Group_15__2__Impl_in_rule__Symbol__Group_15__28685);
            rule__Symbol__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_15__3_in_rule__Symbol__Group_15__28688);
            rule__Symbol__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_15__2"


    // $ANTLR start "rule__Symbol__Group_15__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4388:1: rule__Symbol__Group_15__2__Impl : ( ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )* ) ;
    public final void rule__Symbol__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4392:1: ( ( ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4393:1: ( ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4393:1: ( ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4394:1: ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )*
            {
             before(grammarAccess.getSymbolAccess().getOnBackgroundColorsAssignment_15_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4395:1: ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4395:2: rule__Symbol__OnBackgroundColorsAssignment_15_2
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__OnBackgroundColorsAssignment_15_2_in_rule__Symbol__Group_15__2__Impl8715);
            	    rule__Symbol__OnBackgroundColorsAssignment_15_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSymbolAccess().getOnBackgroundColorsAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_15__2__Impl"


    // $ANTLR start "rule__Symbol__Group_15__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4405:1: rule__Symbol__Group_15__3 : rule__Symbol__Group_15__3__Impl ;
    public final void rule__Symbol__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4409:1: ( rule__Symbol__Group_15__3__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4410:2: rule__Symbol__Group_15__3__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_15__3__Impl_in_rule__Symbol__Group_15__38746);
            rule__Symbol__Group_15__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_15__3"


    // $ANTLR start "rule__Symbol__Group_15__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4416:1: rule__Symbol__Group_15__3__Impl : ( ']' ) ;
    public final void rule__Symbol__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4420:1: ( ( ']' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4421:1: ( ']' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4421:1: ( ']' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4422:1: ']'
            {
             before(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_15_3()); 
            match(input,51,FOLLOW_51_in_rule__Symbol__Group_15__3__Impl8774); 
             after(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__Group_15__3__Impl"


    // $ANTLR start "rule__SimpleClock__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4443:1: rule__SimpleClock__Group__0 : rule__SimpleClock__Group__0__Impl rule__SimpleClock__Group__1 ;
    public final void rule__SimpleClock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4447:1: ( rule__SimpleClock__Group__0__Impl rule__SimpleClock__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4448:2: rule__SimpleClock__Group__0__Impl rule__SimpleClock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__0__Impl_in_rule__SimpleClock__Group__08813);
            rule__SimpleClock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__1_in_rule__SimpleClock__Group__08816);
            rule__SimpleClock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__0"


    // $ANTLR start "rule__SimpleClock__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4455:1: rule__SimpleClock__Group__0__Impl : ( 'SimpleClock' ) ;
    public final void rule__SimpleClock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4459:1: ( ( 'SimpleClock' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4460:1: ( 'SimpleClock' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4460:1: ( 'SimpleClock' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4461:1: 'SimpleClock'
            {
             before(grammarAccess.getSimpleClockAccess().getSimpleClockKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__SimpleClock__Group__0__Impl8844); 
             after(grammarAccess.getSimpleClockAccess().getSimpleClockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__0__Impl"


    // $ANTLR start "rule__SimpleClock__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4474:1: rule__SimpleClock__Group__1 : rule__SimpleClock__Group__1__Impl rule__SimpleClock__Group__2 ;
    public final void rule__SimpleClock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4478:1: ( rule__SimpleClock__Group__1__Impl rule__SimpleClock__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4479:2: rule__SimpleClock__Group__1__Impl rule__SimpleClock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__1__Impl_in_rule__SimpleClock__Group__18875);
            rule__SimpleClock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__2_in_rule__SimpleClock__Group__18878);
            rule__SimpleClock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__1"


    // $ANTLR start "rule__SimpleClock__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4486:1: rule__SimpleClock__Group__1__Impl : ( '{' ) ;
    public final void rule__SimpleClock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4490:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4491:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4491:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4492:1: '{'
            {
             before(grammarAccess.getSimpleClockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__SimpleClock__Group__1__Impl8906); 
             after(grammarAccess.getSimpleClockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__1__Impl"


    // $ANTLR start "rule__SimpleClock__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4505:1: rule__SimpleClock__Group__2 : rule__SimpleClock__Group__2__Impl rule__SimpleClock__Group__3 ;
    public final void rule__SimpleClock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4509:1: ( rule__SimpleClock__Group__2__Impl rule__SimpleClock__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4510:2: rule__SimpleClock__Group__2__Impl rule__SimpleClock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__2__Impl_in_rule__SimpleClock__Group__28937);
            rule__SimpleClock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__3_in_rule__SimpleClock__Group__28940);
            rule__SimpleClock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__2"


    // $ANTLR start "rule__SimpleClock__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4517:1: rule__SimpleClock__Group__2__Impl : ( ( rule__SimpleClock__IdAssignment_2 )? ) ;
    public final void rule__SimpleClock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4521:1: ( ( ( rule__SimpleClock__IdAssignment_2 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4522:1: ( ( rule__SimpleClock__IdAssignment_2 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4522:1: ( ( rule__SimpleClock__IdAssignment_2 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4523:1: ( rule__SimpleClock__IdAssignment_2 )?
            {
             before(grammarAccess.getSimpleClockAccess().getIdAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4524:1: ( rule__SimpleClock__IdAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4524:2: rule__SimpleClock__IdAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__IdAssignment_2_in_rule__SimpleClock__Group__2__Impl8967);
                    rule__SimpleClock__IdAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleClockAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__2__Impl"


    // $ANTLR start "rule__SimpleClock__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4534:1: rule__SimpleClock__Group__3 : rule__SimpleClock__Group__3__Impl rule__SimpleClock__Group__4 ;
    public final void rule__SimpleClock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4538:1: ( rule__SimpleClock__Group__3__Impl rule__SimpleClock__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4539:2: rule__SimpleClock__Group__3__Impl rule__SimpleClock__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__3__Impl_in_rule__SimpleClock__Group__38998);
            rule__SimpleClock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__4_in_rule__SimpleClock__Group__39001);
            rule__SimpleClock__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__3"


    // $ANTLR start "rule__SimpleClock__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4546:1: rule__SimpleClock__Group__3__Impl : ( 'date-format' ) ;
    public final void rule__SimpleClock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4550:1: ( ( 'date-format' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4551:1: ( 'date-format' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4551:1: ( 'date-format' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4552:1: 'date-format'
            {
             before(grammarAccess.getSimpleClockAccess().getDateFormatKeyword_3()); 
            match(input,55,FOLLOW_55_in_rule__SimpleClock__Group__3__Impl9029); 
             after(grammarAccess.getSimpleClockAccess().getDateFormatKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__3__Impl"


    // $ANTLR start "rule__SimpleClock__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4565:1: rule__SimpleClock__Group__4 : rule__SimpleClock__Group__4__Impl rule__SimpleClock__Group__5 ;
    public final void rule__SimpleClock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4569:1: ( rule__SimpleClock__Group__4__Impl rule__SimpleClock__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4570:2: rule__SimpleClock__Group__4__Impl rule__SimpleClock__Group__5
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__4__Impl_in_rule__SimpleClock__Group__49060);
            rule__SimpleClock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__5_in_rule__SimpleClock__Group__49063);
            rule__SimpleClock__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__4"


    // $ANTLR start "rule__SimpleClock__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4577:1: rule__SimpleClock__Group__4__Impl : ( ( rule__SimpleClock__DateFormatAssignment_4 ) ) ;
    public final void rule__SimpleClock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4581:1: ( ( ( rule__SimpleClock__DateFormatAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4582:1: ( ( rule__SimpleClock__DateFormatAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4582:1: ( ( rule__SimpleClock__DateFormatAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4583:1: ( rule__SimpleClock__DateFormatAssignment_4 )
            {
             before(grammarAccess.getSimpleClockAccess().getDateFormatAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4584:1: ( rule__SimpleClock__DateFormatAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4584:2: rule__SimpleClock__DateFormatAssignment_4
            {
            pushFollow(FOLLOW_rule__SimpleClock__DateFormatAssignment_4_in_rule__SimpleClock__Group__4__Impl9090);
            rule__SimpleClock__DateFormatAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClockAccess().getDateFormatAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__4__Impl"


    // $ANTLR start "rule__SimpleClock__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4594:1: rule__SimpleClock__Group__5 : rule__SimpleClock__Group__5__Impl rule__SimpleClock__Group__6 ;
    public final void rule__SimpleClock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4598:1: ( rule__SimpleClock__Group__5__Impl rule__SimpleClock__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4599:2: rule__SimpleClock__Group__5__Impl rule__SimpleClock__Group__6
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__5__Impl_in_rule__SimpleClock__Group__59120);
            rule__SimpleClock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__6_in_rule__SimpleClock__Group__59123);
            rule__SimpleClock__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__5"


    // $ANTLR start "rule__SimpleClock__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4606:1: rule__SimpleClock__Group__5__Impl : ( 'time-format' ) ;
    public final void rule__SimpleClock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4610:1: ( ( 'time-format' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4611:1: ( 'time-format' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4611:1: ( 'time-format' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4612:1: 'time-format'
            {
             before(grammarAccess.getSimpleClockAccess().getTimeFormatKeyword_5()); 
            match(input,56,FOLLOW_56_in_rule__SimpleClock__Group__5__Impl9151); 
             after(grammarAccess.getSimpleClockAccess().getTimeFormatKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__5__Impl"


    // $ANTLR start "rule__SimpleClock__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4625:1: rule__SimpleClock__Group__6 : rule__SimpleClock__Group__6__Impl rule__SimpleClock__Group__7 ;
    public final void rule__SimpleClock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4629:1: ( rule__SimpleClock__Group__6__Impl rule__SimpleClock__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4630:2: rule__SimpleClock__Group__6__Impl rule__SimpleClock__Group__7
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__6__Impl_in_rule__SimpleClock__Group__69182);
            rule__SimpleClock__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__7_in_rule__SimpleClock__Group__69185);
            rule__SimpleClock__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__6"


    // $ANTLR start "rule__SimpleClock__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4637:1: rule__SimpleClock__Group__6__Impl : ( ( rule__SimpleClock__TimeFormatAssignment_6 ) ) ;
    public final void rule__SimpleClock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4641:1: ( ( ( rule__SimpleClock__TimeFormatAssignment_6 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4642:1: ( ( rule__SimpleClock__TimeFormatAssignment_6 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4642:1: ( ( rule__SimpleClock__TimeFormatAssignment_6 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4643:1: ( rule__SimpleClock__TimeFormatAssignment_6 )
            {
             before(grammarAccess.getSimpleClockAccess().getTimeFormatAssignment_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4644:1: ( rule__SimpleClock__TimeFormatAssignment_6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4644:2: rule__SimpleClock__TimeFormatAssignment_6
            {
            pushFollow(FOLLOW_rule__SimpleClock__TimeFormatAssignment_6_in_rule__SimpleClock__Group__6__Impl9212);
            rule__SimpleClock__TimeFormatAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClockAccess().getTimeFormatAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__6__Impl"


    // $ANTLR start "rule__SimpleClock__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4654:1: rule__SimpleClock__Group__7 : rule__SimpleClock__Group__7__Impl rule__SimpleClock__Group__8 ;
    public final void rule__SimpleClock__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4658:1: ( rule__SimpleClock__Group__7__Impl rule__SimpleClock__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4659:2: rule__SimpleClock__Group__7__Impl rule__SimpleClock__Group__8
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__7__Impl_in_rule__SimpleClock__Group__79242);
            rule__SimpleClock__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__8_in_rule__SimpleClock__Group__79245);
            rule__SimpleClock__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__7"


    // $ANTLR start "rule__SimpleClock__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4666:1: rule__SimpleClock__Group__7__Impl : ( ( rule__SimpleClock__Group_7__0 )? ) ;
    public final void rule__SimpleClock__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4670:1: ( ( ( rule__SimpleClock__Group_7__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4671:1: ( ( rule__SimpleClock__Group_7__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4671:1: ( ( rule__SimpleClock__Group_7__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4672:1: ( rule__SimpleClock__Group_7__0 )?
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4673:1: ( rule__SimpleClock__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4673:2: rule__SimpleClock__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__Group_7__0_in_rule__SimpleClock__Group__7__Impl9272);
                    rule__SimpleClock__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleClockAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__7__Impl"


    // $ANTLR start "rule__SimpleClock__Group__8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4683:1: rule__SimpleClock__Group__8 : rule__SimpleClock__Group__8__Impl rule__SimpleClock__Group__9 ;
    public final void rule__SimpleClock__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4687:1: ( rule__SimpleClock__Group__8__Impl rule__SimpleClock__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4688:2: rule__SimpleClock__Group__8__Impl rule__SimpleClock__Group__9
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__8__Impl_in_rule__SimpleClock__Group__89303);
            rule__SimpleClock__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__9_in_rule__SimpleClock__Group__89306);
            rule__SimpleClock__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__8"


    // $ANTLR start "rule__SimpleClock__Group__8__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4695:1: rule__SimpleClock__Group__8__Impl : ( ( rule__SimpleClock__Group_8__0 )? ) ;
    public final void rule__SimpleClock__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4699:1: ( ( ( rule__SimpleClock__Group_8__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4700:1: ( ( rule__SimpleClock__Group_8__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4700:1: ( ( rule__SimpleClock__Group_8__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4701:1: ( rule__SimpleClock__Group_8__0 )?
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4702:1: ( rule__SimpleClock__Group_8__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==58) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4702:2: rule__SimpleClock__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__Group_8__0_in_rule__SimpleClock__Group__8__Impl9333);
                    rule__SimpleClock__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleClockAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__8__Impl"


    // $ANTLR start "rule__SimpleClock__Group__9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4712:1: rule__SimpleClock__Group__9 : rule__SimpleClock__Group__9__Impl rule__SimpleClock__Group__10 ;
    public final void rule__SimpleClock__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4716:1: ( rule__SimpleClock__Group__9__Impl rule__SimpleClock__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4717:2: rule__SimpleClock__Group__9__Impl rule__SimpleClock__Group__10
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__9__Impl_in_rule__SimpleClock__Group__99364);
            rule__SimpleClock__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__10_in_rule__SimpleClock__Group__99367);
            rule__SimpleClock__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__9"


    // $ANTLR start "rule__SimpleClock__Group__9__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4724:1: rule__SimpleClock__Group__9__Impl : ( ( rule__SimpleClock__Group_9__0 )? ) ;
    public final void rule__SimpleClock__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4728:1: ( ( ( rule__SimpleClock__Group_9__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4729:1: ( ( rule__SimpleClock__Group_9__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4729:1: ( ( rule__SimpleClock__Group_9__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4730:1: ( rule__SimpleClock__Group_9__0 )?
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4731:1: ( rule__SimpleClock__Group_9__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4731:2: rule__SimpleClock__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__Group_9__0_in_rule__SimpleClock__Group__9__Impl9394);
                    rule__SimpleClock__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleClockAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__9__Impl"


    // $ANTLR start "rule__SimpleClock__Group__10"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4741:1: rule__SimpleClock__Group__10 : rule__SimpleClock__Group__10__Impl rule__SimpleClock__Group__11 ;
    public final void rule__SimpleClock__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4745:1: ( rule__SimpleClock__Group__10__Impl rule__SimpleClock__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4746:2: rule__SimpleClock__Group__10__Impl rule__SimpleClock__Group__11
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__10__Impl_in_rule__SimpleClock__Group__109425);
            rule__SimpleClock__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__11_in_rule__SimpleClock__Group__109428);
            rule__SimpleClock__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__10"


    // $ANTLR start "rule__SimpleClock__Group__10__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4753:1: rule__SimpleClock__Group__10__Impl : ( ( rule__SimpleClock__Group_10__0 )? ) ;
    public final void rule__SimpleClock__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4757:1: ( ( ( rule__SimpleClock__Group_10__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4758:1: ( ( rule__SimpleClock__Group_10__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4758:1: ( ( rule__SimpleClock__Group_10__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4759:1: ( rule__SimpleClock__Group_10__0 )?
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_10()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4760:1: ( rule__SimpleClock__Group_10__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4760:2: rule__SimpleClock__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__Group_10__0_in_rule__SimpleClock__Group__10__Impl9455);
                    rule__SimpleClock__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleClockAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__10__Impl"


    // $ANTLR start "rule__SimpleClock__Group__11"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4770:1: rule__SimpleClock__Group__11 : rule__SimpleClock__Group__11__Impl rule__SimpleClock__Group__12 ;
    public final void rule__SimpleClock__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4774:1: ( rule__SimpleClock__Group__11__Impl rule__SimpleClock__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4775:2: rule__SimpleClock__Group__11__Impl rule__SimpleClock__Group__12
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__11__Impl_in_rule__SimpleClock__Group__119486);
            rule__SimpleClock__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__12_in_rule__SimpleClock__Group__119489);
            rule__SimpleClock__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__11"


    // $ANTLR start "rule__SimpleClock__Group__11__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4782:1: rule__SimpleClock__Group__11__Impl : ( ( rule__SimpleClock__Group_11__0 )* ) ;
    public final void rule__SimpleClock__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4786:1: ( ( ( rule__SimpleClock__Group_11__0 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4787:1: ( ( rule__SimpleClock__Group_11__0 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4787:1: ( ( rule__SimpleClock__Group_11__0 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4788:1: ( rule__SimpleClock__Group_11__0 )*
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4789:1: ( rule__SimpleClock__Group_11__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==60) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4789:2: rule__SimpleClock__Group_11__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleClock__Group_11__0_in_rule__SimpleClock__Group__11__Impl9516);
            	    rule__SimpleClock__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSimpleClockAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__11__Impl"


    // $ANTLR start "rule__SimpleClock__Group__12"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4799:1: rule__SimpleClock__Group__12 : rule__SimpleClock__Group__12__Impl ;
    public final void rule__SimpleClock__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4803:1: ( rule__SimpleClock__Group__12__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4804:2: rule__SimpleClock__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__12__Impl_in_rule__SimpleClock__Group__129547);
            rule__SimpleClock__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__12"


    // $ANTLR start "rule__SimpleClock__Group__12__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4810:1: rule__SimpleClock__Group__12__Impl : ( '}' ) ;
    public final void rule__SimpleClock__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4814:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4815:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4815:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4816:1: '}'
            {
             before(grammarAccess.getSimpleClockAccess().getRightCurlyBracketKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__SimpleClock__Group__12__Impl9575); 
             after(grammarAccess.getSimpleClockAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group__12__Impl"


    // $ANTLR start "rule__SimpleClock__Group_7__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4855:1: rule__SimpleClock__Group_7__0 : rule__SimpleClock__Group_7__0__Impl rule__SimpleClock__Group_7__1 ;
    public final void rule__SimpleClock__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4859:1: ( rule__SimpleClock__Group_7__0__Impl rule__SimpleClock__Group_7__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4860:2: rule__SimpleClock__Group_7__0__Impl rule__SimpleClock__Group_7__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_7__0__Impl_in_rule__SimpleClock__Group_7__09632);
            rule__SimpleClock__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_7__1_in_rule__SimpleClock__Group_7__09635);
            rule__SimpleClock__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_7__0"


    // $ANTLR start "rule__SimpleClock__Group_7__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4867:1: rule__SimpleClock__Group_7__0__Impl : ( 'date-color' ) ;
    public final void rule__SimpleClock__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4871:1: ( ( 'date-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4872:1: ( 'date-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4872:1: ( 'date-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4873:1: 'date-color'
            {
             before(grammarAccess.getSimpleClockAccess().getDateColorKeyword_7_0()); 
            match(input,57,FOLLOW_57_in_rule__SimpleClock__Group_7__0__Impl9663); 
             after(grammarAccess.getSimpleClockAccess().getDateColorKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_7__0__Impl"


    // $ANTLR start "rule__SimpleClock__Group_7__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4886:1: rule__SimpleClock__Group_7__1 : rule__SimpleClock__Group_7__1__Impl ;
    public final void rule__SimpleClock__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4890:1: ( rule__SimpleClock__Group_7__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4891:2: rule__SimpleClock__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_7__1__Impl_in_rule__SimpleClock__Group_7__19694);
            rule__SimpleClock__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_7__1"


    // $ANTLR start "rule__SimpleClock__Group_7__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4897:1: rule__SimpleClock__Group_7__1__Impl : ( ( rule__SimpleClock__DateColorAssignment_7_1 ) ) ;
    public final void rule__SimpleClock__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4901:1: ( ( ( rule__SimpleClock__DateColorAssignment_7_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4902:1: ( ( rule__SimpleClock__DateColorAssignment_7_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4902:1: ( ( rule__SimpleClock__DateColorAssignment_7_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4903:1: ( rule__SimpleClock__DateColorAssignment_7_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getDateColorAssignment_7_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4904:1: ( rule__SimpleClock__DateColorAssignment_7_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4904:2: rule__SimpleClock__DateColorAssignment_7_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__DateColorAssignment_7_1_in_rule__SimpleClock__Group_7__1__Impl9721);
            rule__SimpleClock__DateColorAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClockAccess().getDateColorAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_7__1__Impl"


    // $ANTLR start "rule__SimpleClock__Group_8__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4918:1: rule__SimpleClock__Group_8__0 : rule__SimpleClock__Group_8__0__Impl rule__SimpleClock__Group_8__1 ;
    public final void rule__SimpleClock__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4922:1: ( rule__SimpleClock__Group_8__0__Impl rule__SimpleClock__Group_8__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4923:2: rule__SimpleClock__Group_8__0__Impl rule__SimpleClock__Group_8__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_8__0__Impl_in_rule__SimpleClock__Group_8__09755);
            rule__SimpleClock__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_8__1_in_rule__SimpleClock__Group_8__09758);
            rule__SimpleClock__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_8__0"


    // $ANTLR start "rule__SimpleClock__Group_8__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4930:1: rule__SimpleClock__Group_8__0__Impl : ( 'time-color' ) ;
    public final void rule__SimpleClock__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4934:1: ( ( 'time-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4935:1: ( 'time-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4935:1: ( 'time-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4936:1: 'time-color'
            {
             before(grammarAccess.getSimpleClockAccess().getTimeColorKeyword_8_0()); 
            match(input,58,FOLLOW_58_in_rule__SimpleClock__Group_8__0__Impl9786); 
             after(grammarAccess.getSimpleClockAccess().getTimeColorKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_8__0__Impl"


    // $ANTLR start "rule__SimpleClock__Group_8__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4949:1: rule__SimpleClock__Group_8__1 : rule__SimpleClock__Group_8__1__Impl ;
    public final void rule__SimpleClock__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4953:1: ( rule__SimpleClock__Group_8__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4954:2: rule__SimpleClock__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_8__1__Impl_in_rule__SimpleClock__Group_8__19817);
            rule__SimpleClock__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_8__1"


    // $ANTLR start "rule__SimpleClock__Group_8__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4960:1: rule__SimpleClock__Group_8__1__Impl : ( ( rule__SimpleClock__TimeColorAssignment_8_1 ) ) ;
    public final void rule__SimpleClock__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4964:1: ( ( ( rule__SimpleClock__TimeColorAssignment_8_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4965:1: ( ( rule__SimpleClock__TimeColorAssignment_8_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4965:1: ( ( rule__SimpleClock__TimeColorAssignment_8_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4966:1: ( rule__SimpleClock__TimeColorAssignment_8_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getTimeColorAssignment_8_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4967:1: ( rule__SimpleClock__TimeColorAssignment_8_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4967:2: rule__SimpleClock__TimeColorAssignment_8_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__TimeColorAssignment_8_1_in_rule__SimpleClock__Group_8__1__Impl9844);
            rule__SimpleClock__TimeColorAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClockAccess().getTimeColorAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_8__1__Impl"


    // $ANTLR start "rule__SimpleClock__Group_9__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4981:1: rule__SimpleClock__Group_9__0 : rule__SimpleClock__Group_9__0__Impl rule__SimpleClock__Group_9__1 ;
    public final void rule__SimpleClock__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4985:1: ( rule__SimpleClock__Group_9__0__Impl rule__SimpleClock__Group_9__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4986:2: rule__SimpleClock__Group_9__0__Impl rule__SimpleClock__Group_9__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_9__0__Impl_in_rule__SimpleClock__Group_9__09878);
            rule__SimpleClock__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_9__1_in_rule__SimpleClock__Group_9__09881);
            rule__SimpleClock__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_9__0"


    // $ANTLR start "rule__SimpleClock__Group_9__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4993:1: rule__SimpleClock__Group_9__0__Impl : ( 'class' ) ;
    public final void rule__SimpleClock__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4997:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4998:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4998:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4999:1: 'class'
            {
             before(grammarAccess.getSimpleClockAccess().getClassKeyword_9_0()); 
            match(input,34,FOLLOW_34_in_rule__SimpleClock__Group_9__0__Impl9909); 
             after(grammarAccess.getSimpleClockAccess().getClassKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_9__0__Impl"


    // $ANTLR start "rule__SimpleClock__Group_9__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5012:1: rule__SimpleClock__Group_9__1 : rule__SimpleClock__Group_9__1__Impl ;
    public final void rule__SimpleClock__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5016:1: ( rule__SimpleClock__Group_9__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5017:2: rule__SimpleClock__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_9__1__Impl_in_rule__SimpleClock__Group_9__19940);
            rule__SimpleClock__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_9__1"


    // $ANTLR start "rule__SimpleClock__Group_9__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5023:1: rule__SimpleClock__Group_9__1__Impl : ( ( rule__SimpleClock__ClassAssignment_9_1 ) ) ;
    public final void rule__SimpleClock__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5027:1: ( ( ( rule__SimpleClock__ClassAssignment_9_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5028:1: ( ( rule__SimpleClock__ClassAssignment_9_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5028:1: ( ( rule__SimpleClock__ClassAssignment_9_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5029:1: ( rule__SimpleClock__ClassAssignment_9_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getClassAssignment_9_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5030:1: ( rule__SimpleClock__ClassAssignment_9_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5030:2: rule__SimpleClock__ClassAssignment_9_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__ClassAssignment_9_1_in_rule__SimpleClock__Group_9__1__Impl9967);
            rule__SimpleClock__ClassAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClockAccess().getClassAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_9__1__Impl"


    // $ANTLR start "rule__SimpleClock__Group_10__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5044:1: rule__SimpleClock__Group_10__0 : rule__SimpleClock__Group_10__0__Impl rule__SimpleClock__Group_10__1 ;
    public final void rule__SimpleClock__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5048:1: ( rule__SimpleClock__Group_10__0__Impl rule__SimpleClock__Group_10__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5049:2: rule__SimpleClock__Group_10__0__Impl rule__SimpleClock__Group_10__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_10__0__Impl_in_rule__SimpleClock__Group_10__010001);
            rule__SimpleClock__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_10__1_in_rule__SimpleClock__Group_10__010004);
            rule__SimpleClock__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_10__0"


    // $ANTLR start "rule__SimpleClock__Group_10__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5056:1: rule__SimpleClock__Group_10__0__Impl : ( 'style' ) ;
    public final void rule__SimpleClock__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5060:1: ( ( 'style' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5061:1: ( 'style' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5061:1: ( 'style' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5062:1: 'style'
            {
             before(grammarAccess.getSimpleClockAccess().getStyleKeyword_10_0()); 
            match(input,59,FOLLOW_59_in_rule__SimpleClock__Group_10__0__Impl10032); 
             after(grammarAccess.getSimpleClockAccess().getStyleKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_10__0__Impl"


    // $ANTLR start "rule__SimpleClock__Group_10__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5075:1: rule__SimpleClock__Group_10__1 : rule__SimpleClock__Group_10__1__Impl ;
    public final void rule__SimpleClock__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5079:1: ( rule__SimpleClock__Group_10__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5080:2: rule__SimpleClock__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_10__1__Impl_in_rule__SimpleClock__Group_10__110063);
            rule__SimpleClock__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_10__1"


    // $ANTLR start "rule__SimpleClock__Group_10__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5086:1: rule__SimpleClock__Group_10__1__Impl : ( ( rule__SimpleClock__StyleAssignment_10_1 ) ) ;
    public final void rule__SimpleClock__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5090:1: ( ( ( rule__SimpleClock__StyleAssignment_10_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5091:1: ( ( rule__SimpleClock__StyleAssignment_10_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5091:1: ( ( rule__SimpleClock__StyleAssignment_10_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5092:1: ( rule__SimpleClock__StyleAssignment_10_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getStyleAssignment_10_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5093:1: ( rule__SimpleClock__StyleAssignment_10_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5093:2: rule__SimpleClock__StyleAssignment_10_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__StyleAssignment_10_1_in_rule__SimpleClock__Group_10__1__Impl10090);
            rule__SimpleClock__StyleAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClockAccess().getStyleAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_10__1__Impl"


    // $ANTLR start "rule__SimpleClock__Group_11__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5107:1: rule__SimpleClock__Group_11__0 : rule__SimpleClock__Group_11__0__Impl rule__SimpleClock__Group_11__1 ;
    public final void rule__SimpleClock__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5111:1: ( rule__SimpleClock__Group_11__0__Impl rule__SimpleClock__Group_11__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5112:2: rule__SimpleClock__Group_11__0__Impl rule__SimpleClock__Group_11__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_11__0__Impl_in_rule__SimpleClock__Group_11__010124);
            rule__SimpleClock__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_11__1_in_rule__SimpleClock__Group_11__010127);
            rule__SimpleClock__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_11__0"


    // $ANTLR start "rule__SimpleClock__Group_11__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5119:1: rule__SimpleClock__Group_11__0__Impl : ( 'bg-colors' ) ;
    public final void rule__SimpleClock__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5123:1: ( ( 'bg-colors' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5124:1: ( 'bg-colors' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5124:1: ( 'bg-colors' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5125:1: 'bg-colors'
            {
             before(grammarAccess.getSimpleClockAccess().getBgColorsKeyword_11_0()); 
            match(input,60,FOLLOW_60_in_rule__SimpleClock__Group_11__0__Impl10155); 
             after(grammarAccess.getSimpleClockAccess().getBgColorsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_11__0__Impl"


    // $ANTLR start "rule__SimpleClock__Group_11__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5138:1: rule__SimpleClock__Group_11__1 : rule__SimpleClock__Group_11__1__Impl ;
    public final void rule__SimpleClock__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5142:1: ( rule__SimpleClock__Group_11__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5143:2: rule__SimpleClock__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_11__1__Impl_in_rule__SimpleClock__Group_11__110186);
            rule__SimpleClock__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_11__1"


    // $ANTLR start "rule__SimpleClock__Group_11__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5149:1: rule__SimpleClock__Group_11__1__Impl : ( ( rule__SimpleClock__BgColorsAssignment_11_1 ) ) ;
    public final void rule__SimpleClock__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5153:1: ( ( ( rule__SimpleClock__BgColorsAssignment_11_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5154:1: ( ( rule__SimpleClock__BgColorsAssignment_11_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5154:1: ( ( rule__SimpleClock__BgColorsAssignment_11_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5155:1: ( rule__SimpleClock__BgColorsAssignment_11_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getBgColorsAssignment_11_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5156:1: ( rule__SimpleClock__BgColorsAssignment_11_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5156:2: rule__SimpleClock__BgColorsAssignment_11_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__BgColorsAssignment_11_1_in_rule__SimpleClock__Group_11__1__Impl10213);
            rule__SimpleClock__BgColorsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleClockAccess().getBgColorsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__Group_11__1__Impl"


    // $ANTLR start "rule__SimpleChart__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5170:1: rule__SimpleChart__Group__0 : rule__SimpleChart__Group__0__Impl rule__SimpleChart__Group__1 ;
    public final void rule__SimpleChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5174:1: ( rule__SimpleChart__Group__0__Impl rule__SimpleChart__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5175:2: rule__SimpleChart__Group__0__Impl rule__SimpleChart__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__0__Impl_in_rule__SimpleChart__Group__010247);
            rule__SimpleChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__1_in_rule__SimpleChart__Group__010250);
            rule__SimpleChart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__0"


    // $ANTLR start "rule__SimpleChart__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5182:1: rule__SimpleChart__Group__0__Impl : ( 'simpleChart' ) ;
    public final void rule__SimpleChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5186:1: ( ( 'simpleChart' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5187:1: ( 'simpleChart' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5187:1: ( 'simpleChart' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5188:1: 'simpleChart'
            {
             before(grammarAccess.getSimpleChartAccess().getSimpleChartKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__SimpleChart__Group__0__Impl10278); 
             after(grammarAccess.getSimpleChartAccess().getSimpleChartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__0__Impl"


    // $ANTLR start "rule__SimpleChart__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5201:1: rule__SimpleChart__Group__1 : rule__SimpleChart__Group__1__Impl rule__SimpleChart__Group__2 ;
    public final void rule__SimpleChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5205:1: ( rule__SimpleChart__Group__1__Impl rule__SimpleChart__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5206:2: rule__SimpleChart__Group__1__Impl rule__SimpleChart__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__1__Impl_in_rule__SimpleChart__Group__110309);
            rule__SimpleChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__2_in_rule__SimpleChart__Group__110312);
            rule__SimpleChart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__1"


    // $ANTLR start "rule__SimpleChart__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5213:1: rule__SimpleChart__Group__1__Impl : ( '{' ) ;
    public final void rule__SimpleChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5217:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5218:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5218:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5219:1: '{'
            {
             before(grammarAccess.getSimpleChartAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__SimpleChart__Group__1__Impl10340); 
             after(grammarAccess.getSimpleChartAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__1__Impl"


    // $ANTLR start "rule__SimpleChart__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5232:1: rule__SimpleChart__Group__2 : rule__SimpleChart__Group__2__Impl rule__SimpleChart__Group__3 ;
    public final void rule__SimpleChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5236:1: ( rule__SimpleChart__Group__2__Impl rule__SimpleChart__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5237:2: rule__SimpleChart__Group__2__Impl rule__SimpleChart__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__2__Impl_in_rule__SimpleChart__Group__210371);
            rule__SimpleChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__3_in_rule__SimpleChart__Group__210374);
            rule__SimpleChart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__2"


    // $ANTLR start "rule__SimpleChart__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5244:1: rule__SimpleChart__Group__2__Impl : ( ( rule__SimpleChart__DeviceAssignment_2 ) ) ;
    public final void rule__SimpleChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5248:1: ( ( ( rule__SimpleChart__DeviceAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5249:1: ( ( rule__SimpleChart__DeviceAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5249:1: ( ( rule__SimpleChart__DeviceAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5250:1: ( rule__SimpleChart__DeviceAssignment_2 )
            {
             before(grammarAccess.getSimpleChartAccess().getDeviceAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5251:1: ( rule__SimpleChart__DeviceAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5251:2: rule__SimpleChart__DeviceAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleChart__DeviceAssignment_2_in_rule__SimpleChart__Group__2__Impl10401);
            rule__SimpleChart__DeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getDeviceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__2__Impl"


    // $ANTLR start "rule__SimpleChart__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5261:1: rule__SimpleChart__Group__3 : rule__SimpleChart__Group__3__Impl rule__SimpleChart__Group__4 ;
    public final void rule__SimpleChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5265:1: ( rule__SimpleChart__Group__3__Impl rule__SimpleChart__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5266:2: rule__SimpleChart__Group__3__Impl rule__SimpleChart__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__3__Impl_in_rule__SimpleChart__Group__310431);
            rule__SimpleChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__4_in_rule__SimpleChart__Group__310434);
            rule__SimpleChart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__3"


    // $ANTLR start "rule__SimpleChart__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5273:1: rule__SimpleChart__Group__3__Impl : ( 'log-config' ) ;
    public final void rule__SimpleChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5277:1: ( ( 'log-config' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5278:1: ( 'log-config' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5278:1: ( 'log-config' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5279:1: 'log-config'
            {
             before(grammarAccess.getSimpleChartAccess().getLogConfigKeyword_3()); 
            match(input,62,FOLLOW_62_in_rule__SimpleChart__Group__3__Impl10462); 
             after(grammarAccess.getSimpleChartAccess().getLogConfigKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__3__Impl"


    // $ANTLR start "rule__SimpleChart__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5292:1: rule__SimpleChart__Group__4 : rule__SimpleChart__Group__4__Impl rule__SimpleChart__Group__5 ;
    public final void rule__SimpleChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5296:1: ( rule__SimpleChart__Group__4__Impl rule__SimpleChart__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5297:2: rule__SimpleChart__Group__4__Impl rule__SimpleChart__Group__5
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__4__Impl_in_rule__SimpleChart__Group__410493);
            rule__SimpleChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__5_in_rule__SimpleChart__Group__410496);
            rule__SimpleChart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__4"


    // $ANTLR start "rule__SimpleChart__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5304:1: rule__SimpleChart__Group__4__Impl : ( ( rule__SimpleChart__Log_deviceAssignment_4 ) ) ;
    public final void rule__SimpleChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5308:1: ( ( ( rule__SimpleChart__Log_deviceAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5309:1: ( ( rule__SimpleChart__Log_deviceAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5309:1: ( ( rule__SimpleChart__Log_deviceAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5310:1: ( rule__SimpleChart__Log_deviceAssignment_4 )
            {
             before(grammarAccess.getSimpleChartAccess().getLog_deviceAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5311:1: ( rule__SimpleChart__Log_deviceAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5311:2: rule__SimpleChart__Log_deviceAssignment_4
            {
            pushFollow(FOLLOW_rule__SimpleChart__Log_deviceAssignment_4_in_rule__SimpleChart__Group__4__Impl10523);
            rule__SimpleChart__Log_deviceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getLog_deviceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__4__Impl"


    // $ANTLR start "rule__SimpleChart__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5321:1: rule__SimpleChart__Group__5 : rule__SimpleChart__Group__5__Impl rule__SimpleChart__Group__6 ;
    public final void rule__SimpleChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5325:1: ( rule__SimpleChart__Group__5__Impl rule__SimpleChart__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5326:2: rule__SimpleChart__Group__5__Impl rule__SimpleChart__Group__6
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__5__Impl_in_rule__SimpleChart__Group__510553);
            rule__SimpleChart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__6_in_rule__SimpleChart__Group__510556);
            rule__SimpleChart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__5"


    // $ANTLR start "rule__SimpleChart__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5333:1: rule__SimpleChart__Group__5__Impl : ( ( rule__SimpleChart__LogfileAssignment_5 ) ) ;
    public final void rule__SimpleChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5337:1: ( ( ( rule__SimpleChart__LogfileAssignment_5 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5338:1: ( ( rule__SimpleChart__LogfileAssignment_5 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5338:1: ( ( rule__SimpleChart__LogfileAssignment_5 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5339:1: ( rule__SimpleChart__LogfileAssignment_5 )
            {
             before(grammarAccess.getSimpleChartAccess().getLogfileAssignment_5()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5340:1: ( rule__SimpleChart__LogfileAssignment_5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5340:2: rule__SimpleChart__LogfileAssignment_5
            {
            pushFollow(FOLLOW_rule__SimpleChart__LogfileAssignment_5_in_rule__SimpleChart__Group__5__Impl10583);
            rule__SimpleChart__LogfileAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getLogfileAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__5__Impl"


    // $ANTLR start "rule__SimpleChart__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5350:1: rule__SimpleChart__Group__6 : rule__SimpleChart__Group__6__Impl rule__SimpleChart__Group__7 ;
    public final void rule__SimpleChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5354:1: ( rule__SimpleChart__Group__6__Impl rule__SimpleChart__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5355:2: rule__SimpleChart__Group__6__Impl rule__SimpleChart__Group__7
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__6__Impl_in_rule__SimpleChart__Group__610613);
            rule__SimpleChart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__7_in_rule__SimpleChart__Group__610616);
            rule__SimpleChart__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__6"


    // $ANTLR start "rule__SimpleChart__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5362:1: rule__SimpleChart__Group__6__Impl : ( 'columnSpec' ) ;
    public final void rule__SimpleChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5366:1: ( ( 'columnSpec' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5367:1: ( 'columnSpec' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5367:1: ( 'columnSpec' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5368:1: 'columnSpec'
            {
             before(grammarAccess.getSimpleChartAccess().getColumnSpecKeyword_6()); 
            match(input,63,FOLLOW_63_in_rule__SimpleChart__Group__6__Impl10644); 
             after(grammarAccess.getSimpleChartAccess().getColumnSpecKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__6__Impl"


    // $ANTLR start "rule__SimpleChart__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5381:1: rule__SimpleChart__Group__7 : rule__SimpleChart__Group__7__Impl rule__SimpleChart__Group__8 ;
    public final void rule__SimpleChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5385:1: ( rule__SimpleChart__Group__7__Impl rule__SimpleChart__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5386:2: rule__SimpleChart__Group__7__Impl rule__SimpleChart__Group__8
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__7__Impl_in_rule__SimpleChart__Group__710675);
            rule__SimpleChart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__8_in_rule__SimpleChart__Group__710678);
            rule__SimpleChart__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__7"


    // $ANTLR start "rule__SimpleChart__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5393:1: rule__SimpleChart__Group__7__Impl : ( ( rule__SimpleChart__ColumnSpecAssignment_7 ) ) ;
    public final void rule__SimpleChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5397:1: ( ( ( rule__SimpleChart__ColumnSpecAssignment_7 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5398:1: ( ( rule__SimpleChart__ColumnSpecAssignment_7 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5398:1: ( ( rule__SimpleChart__ColumnSpecAssignment_7 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5399:1: ( rule__SimpleChart__ColumnSpecAssignment_7 )
            {
             before(grammarAccess.getSimpleChartAccess().getColumnSpecAssignment_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5400:1: ( rule__SimpleChart__ColumnSpecAssignment_7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5400:2: rule__SimpleChart__ColumnSpecAssignment_7
            {
            pushFollow(FOLLOW_rule__SimpleChart__ColumnSpecAssignment_7_in_rule__SimpleChart__Group__7__Impl10705);
            rule__SimpleChart__ColumnSpecAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getColumnSpecAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__7__Impl"


    // $ANTLR start "rule__SimpleChart__Group__8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5410:1: rule__SimpleChart__Group__8 : rule__SimpleChart__Group__8__Impl rule__SimpleChart__Group__9 ;
    public final void rule__SimpleChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5414:1: ( rule__SimpleChart__Group__8__Impl rule__SimpleChart__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5415:2: rule__SimpleChart__Group__8__Impl rule__SimpleChart__Group__9
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__8__Impl_in_rule__SimpleChart__Group__810735);
            rule__SimpleChart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__9_in_rule__SimpleChart__Group__810738);
            rule__SimpleChart__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__8"


    // $ANTLR start "rule__SimpleChart__Group__8__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5422:1: rule__SimpleChart__Group__8__Impl : ( 'minValue' ) ;
    public final void rule__SimpleChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5426:1: ( ( 'minValue' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5427:1: ( 'minValue' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5427:1: ( 'minValue' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5428:1: 'minValue'
            {
             before(grammarAccess.getSimpleChartAccess().getMinValueKeyword_8()); 
            match(input,64,FOLLOW_64_in_rule__SimpleChart__Group__8__Impl10766); 
             after(grammarAccess.getSimpleChartAccess().getMinValueKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__8__Impl"


    // $ANTLR start "rule__SimpleChart__Group__9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5441:1: rule__SimpleChart__Group__9 : rule__SimpleChart__Group__9__Impl rule__SimpleChart__Group__10 ;
    public final void rule__SimpleChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5445:1: ( rule__SimpleChart__Group__9__Impl rule__SimpleChart__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5446:2: rule__SimpleChart__Group__9__Impl rule__SimpleChart__Group__10
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__9__Impl_in_rule__SimpleChart__Group__910797);
            rule__SimpleChart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__10_in_rule__SimpleChart__Group__910800);
            rule__SimpleChart__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__9"


    // $ANTLR start "rule__SimpleChart__Group__9__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5453:1: rule__SimpleChart__Group__9__Impl : ( ( rule__SimpleChart__MinAssignment_9 ) ) ;
    public final void rule__SimpleChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5457:1: ( ( ( rule__SimpleChart__MinAssignment_9 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5458:1: ( ( rule__SimpleChart__MinAssignment_9 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5458:1: ( ( rule__SimpleChart__MinAssignment_9 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5459:1: ( rule__SimpleChart__MinAssignment_9 )
            {
             before(grammarAccess.getSimpleChartAccess().getMinAssignment_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5460:1: ( rule__SimpleChart__MinAssignment_9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5460:2: rule__SimpleChart__MinAssignment_9
            {
            pushFollow(FOLLOW_rule__SimpleChart__MinAssignment_9_in_rule__SimpleChart__Group__9__Impl10827);
            rule__SimpleChart__MinAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getMinAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__9__Impl"


    // $ANTLR start "rule__SimpleChart__Group__10"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5470:1: rule__SimpleChart__Group__10 : rule__SimpleChart__Group__10__Impl rule__SimpleChart__Group__11 ;
    public final void rule__SimpleChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5474:1: ( rule__SimpleChart__Group__10__Impl rule__SimpleChart__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5475:2: rule__SimpleChart__Group__10__Impl rule__SimpleChart__Group__11
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__10__Impl_in_rule__SimpleChart__Group__1010857);
            rule__SimpleChart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__11_in_rule__SimpleChart__Group__1010860);
            rule__SimpleChart__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__10"


    // $ANTLR start "rule__SimpleChart__Group__10__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5482:1: rule__SimpleChart__Group__10__Impl : ( 'maxValue' ) ;
    public final void rule__SimpleChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5486:1: ( ( 'maxValue' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5487:1: ( 'maxValue' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5487:1: ( 'maxValue' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5488:1: 'maxValue'
            {
             before(grammarAccess.getSimpleChartAccess().getMaxValueKeyword_10()); 
            match(input,65,FOLLOW_65_in_rule__SimpleChart__Group__10__Impl10888); 
             after(grammarAccess.getSimpleChartAccess().getMaxValueKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__10__Impl"


    // $ANTLR start "rule__SimpleChart__Group__11"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5501:1: rule__SimpleChart__Group__11 : rule__SimpleChart__Group__11__Impl rule__SimpleChart__Group__12 ;
    public final void rule__SimpleChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5505:1: ( rule__SimpleChart__Group__11__Impl rule__SimpleChart__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5506:2: rule__SimpleChart__Group__11__Impl rule__SimpleChart__Group__12
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__11__Impl_in_rule__SimpleChart__Group__1110919);
            rule__SimpleChart__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__12_in_rule__SimpleChart__Group__1110922);
            rule__SimpleChart__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__11"


    // $ANTLR start "rule__SimpleChart__Group__11__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5513:1: rule__SimpleChart__Group__11__Impl : ( ( rule__SimpleChart__MaxAssignment_11 ) ) ;
    public final void rule__SimpleChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5517:1: ( ( ( rule__SimpleChart__MaxAssignment_11 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5518:1: ( ( rule__SimpleChart__MaxAssignment_11 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5518:1: ( ( rule__SimpleChart__MaxAssignment_11 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5519:1: ( rule__SimpleChart__MaxAssignment_11 )
            {
             before(grammarAccess.getSimpleChartAccess().getMaxAssignment_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5520:1: ( rule__SimpleChart__MaxAssignment_11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5520:2: rule__SimpleChart__MaxAssignment_11
            {
            pushFollow(FOLLOW_rule__SimpleChart__MaxAssignment_11_in_rule__SimpleChart__Group__11__Impl10949);
            rule__SimpleChart__MaxAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getMaxAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__11__Impl"


    // $ANTLR start "rule__SimpleChart__Group__12"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5530:1: rule__SimpleChart__Group__12 : rule__SimpleChart__Group__12__Impl rule__SimpleChart__Group__13 ;
    public final void rule__SimpleChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5534:1: ( rule__SimpleChart__Group__12__Impl rule__SimpleChart__Group__13 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5535:2: rule__SimpleChart__Group__12__Impl rule__SimpleChart__Group__13
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__12__Impl_in_rule__SimpleChart__Group__1210979);
            rule__SimpleChart__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__13_in_rule__SimpleChart__Group__1210982);
            rule__SimpleChart__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__12"


    // $ANTLR start "rule__SimpleChart__Group__12__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5542:1: rule__SimpleChart__Group__12__Impl : ( 'xTicks' ) ;
    public final void rule__SimpleChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5546:1: ( ( 'xTicks' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5547:1: ( 'xTicks' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5547:1: ( 'xTicks' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5548:1: 'xTicks'
            {
             before(grammarAccess.getSimpleChartAccess().getXTicksKeyword_12()); 
            match(input,66,FOLLOW_66_in_rule__SimpleChart__Group__12__Impl11010); 
             after(grammarAccess.getSimpleChartAccess().getXTicksKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__12__Impl"


    // $ANTLR start "rule__SimpleChart__Group__13"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5561:1: rule__SimpleChart__Group__13 : rule__SimpleChart__Group__13__Impl rule__SimpleChart__Group__14 ;
    public final void rule__SimpleChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5565:1: ( rule__SimpleChart__Group__13__Impl rule__SimpleChart__Group__14 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5566:2: rule__SimpleChart__Group__13__Impl rule__SimpleChart__Group__14
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__13__Impl_in_rule__SimpleChart__Group__1311041);
            rule__SimpleChart__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__14_in_rule__SimpleChart__Group__1311044);
            rule__SimpleChart__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__13"


    // $ANTLR start "rule__SimpleChart__Group__13__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5573:1: rule__SimpleChart__Group__13__Impl : ( ( rule__SimpleChart__XTicksAssignment_13 ) ) ;
    public final void rule__SimpleChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5577:1: ( ( ( rule__SimpleChart__XTicksAssignment_13 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5578:1: ( ( rule__SimpleChart__XTicksAssignment_13 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5578:1: ( ( rule__SimpleChart__XTicksAssignment_13 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5579:1: ( rule__SimpleChart__XTicksAssignment_13 )
            {
             before(grammarAccess.getSimpleChartAccess().getXTicksAssignment_13()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5580:1: ( rule__SimpleChart__XTicksAssignment_13 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5580:2: rule__SimpleChart__XTicksAssignment_13
            {
            pushFollow(FOLLOW_rule__SimpleChart__XTicksAssignment_13_in_rule__SimpleChart__Group__13__Impl11071);
            rule__SimpleChart__XTicksAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getXTicksAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__13__Impl"


    // $ANTLR start "rule__SimpleChart__Group__14"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5590:1: rule__SimpleChart__Group__14 : rule__SimpleChart__Group__14__Impl rule__SimpleChart__Group__15 ;
    public final void rule__SimpleChart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5594:1: ( rule__SimpleChart__Group__14__Impl rule__SimpleChart__Group__15 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5595:2: rule__SimpleChart__Group__14__Impl rule__SimpleChart__Group__15
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__14__Impl_in_rule__SimpleChart__Group__1411101);
            rule__SimpleChart__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__15_in_rule__SimpleChart__Group__1411104);
            rule__SimpleChart__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__14"


    // $ANTLR start "rule__SimpleChart__Group__14__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5602:1: rule__SimpleChart__Group__14__Impl : ( 'yTicks' ) ;
    public final void rule__SimpleChart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5606:1: ( ( 'yTicks' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5607:1: ( 'yTicks' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5607:1: ( 'yTicks' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5608:1: 'yTicks'
            {
             before(grammarAccess.getSimpleChartAccess().getYTicksKeyword_14()); 
            match(input,67,FOLLOW_67_in_rule__SimpleChart__Group__14__Impl11132); 
             after(grammarAccess.getSimpleChartAccess().getYTicksKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__14__Impl"


    // $ANTLR start "rule__SimpleChart__Group__15"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5621:1: rule__SimpleChart__Group__15 : rule__SimpleChart__Group__15__Impl rule__SimpleChart__Group__16 ;
    public final void rule__SimpleChart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5625:1: ( rule__SimpleChart__Group__15__Impl rule__SimpleChart__Group__16 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5626:2: rule__SimpleChart__Group__15__Impl rule__SimpleChart__Group__16
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__15__Impl_in_rule__SimpleChart__Group__1511163);
            rule__SimpleChart__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__16_in_rule__SimpleChart__Group__1511166);
            rule__SimpleChart__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__15"


    // $ANTLR start "rule__SimpleChart__Group__15__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5633:1: rule__SimpleChart__Group__15__Impl : ( ( rule__SimpleChart__YTicksAssignment_15 ) ) ;
    public final void rule__SimpleChart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5637:1: ( ( ( rule__SimpleChart__YTicksAssignment_15 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5638:1: ( ( rule__SimpleChart__YTicksAssignment_15 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5638:1: ( ( rule__SimpleChart__YTicksAssignment_15 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5639:1: ( rule__SimpleChart__YTicksAssignment_15 )
            {
             before(grammarAccess.getSimpleChartAccess().getYTicksAssignment_15()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5640:1: ( rule__SimpleChart__YTicksAssignment_15 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5640:2: rule__SimpleChart__YTicksAssignment_15
            {
            pushFollow(FOLLOW_rule__SimpleChart__YTicksAssignment_15_in_rule__SimpleChart__Group__15__Impl11193);
            rule__SimpleChart__YTicksAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getYTicksAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__15__Impl"


    // $ANTLR start "rule__SimpleChart__Group__16"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5650:1: rule__SimpleChart__Group__16 : rule__SimpleChart__Group__16__Impl rule__SimpleChart__Group__17 ;
    public final void rule__SimpleChart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5654:1: ( rule__SimpleChart__Group__16__Impl rule__SimpleChart__Group__17 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5655:2: rule__SimpleChart__Group__16__Impl rule__SimpleChart__Group__17
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__16__Impl_in_rule__SimpleChart__Group__1611223);
            rule__SimpleChart__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__17_in_rule__SimpleChart__Group__1611226);
            rule__SimpleChart__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__16"


    // $ANTLR start "rule__SimpleChart__Group__16__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5662:1: rule__SimpleChart__Group__16__Impl : ( 'daysago' ) ;
    public final void rule__SimpleChart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5666:1: ( ( 'daysago' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5667:1: ( 'daysago' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5667:1: ( 'daysago' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5668:1: 'daysago'
            {
             before(grammarAccess.getSimpleChartAccess().getDaysagoKeyword_16()); 
            match(input,68,FOLLOW_68_in_rule__SimpleChart__Group__16__Impl11254); 
             after(grammarAccess.getSimpleChartAccess().getDaysagoKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__16__Impl"


    // $ANTLR start "rule__SimpleChart__Group__17"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5681:1: rule__SimpleChart__Group__17 : rule__SimpleChart__Group__17__Impl rule__SimpleChart__Group__18 ;
    public final void rule__SimpleChart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5685:1: ( rule__SimpleChart__Group__17__Impl rule__SimpleChart__Group__18 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5686:2: rule__SimpleChart__Group__17__Impl rule__SimpleChart__Group__18
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__17__Impl_in_rule__SimpleChart__Group__1711285);
            rule__SimpleChart__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__18_in_rule__SimpleChart__Group__1711288);
            rule__SimpleChart__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__17"


    // $ANTLR start "rule__SimpleChart__Group__17__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5693:1: rule__SimpleChart__Group__17__Impl : ( ( rule__SimpleChart__DaysagoAssignment_17 ) ) ;
    public final void rule__SimpleChart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5697:1: ( ( ( rule__SimpleChart__DaysagoAssignment_17 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5698:1: ( ( rule__SimpleChart__DaysagoAssignment_17 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5698:1: ( ( rule__SimpleChart__DaysagoAssignment_17 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5699:1: ( rule__SimpleChart__DaysagoAssignment_17 )
            {
             before(grammarAccess.getSimpleChartAccess().getDaysagoAssignment_17()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5700:1: ( rule__SimpleChart__DaysagoAssignment_17 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5700:2: rule__SimpleChart__DaysagoAssignment_17
            {
            pushFollow(FOLLOW_rule__SimpleChart__DaysagoAssignment_17_in_rule__SimpleChart__Group__17__Impl11315);
            rule__SimpleChart__DaysagoAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getDaysagoAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__17__Impl"


    // $ANTLR start "rule__SimpleChart__Group__18"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5710:1: rule__SimpleChart__Group__18 : rule__SimpleChart__Group__18__Impl rule__SimpleChart__Group__19 ;
    public final void rule__SimpleChart__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5714:1: ( rule__SimpleChart__Group__18__Impl rule__SimpleChart__Group__19 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5715:2: rule__SimpleChart__Group__18__Impl rule__SimpleChart__Group__19
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__18__Impl_in_rule__SimpleChart__Group__1811345);
            rule__SimpleChart__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__19_in_rule__SimpleChart__Group__1811348);
            rule__SimpleChart__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__18"


    // $ANTLR start "rule__SimpleChart__Group__18__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5722:1: rule__SimpleChart__Group__18__Impl : ( 'class' ) ;
    public final void rule__SimpleChart__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5726:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5727:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5727:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5728:1: 'class'
            {
             before(grammarAccess.getSimpleChartAccess().getClassKeyword_18()); 
            match(input,34,FOLLOW_34_in_rule__SimpleChart__Group__18__Impl11376); 
             after(grammarAccess.getSimpleChartAccess().getClassKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__18__Impl"


    // $ANTLR start "rule__SimpleChart__Group__19"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5741:1: rule__SimpleChart__Group__19 : rule__SimpleChart__Group__19__Impl rule__SimpleChart__Group__20 ;
    public final void rule__SimpleChart__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5745:1: ( rule__SimpleChart__Group__19__Impl rule__SimpleChart__Group__20 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5746:2: rule__SimpleChart__Group__19__Impl rule__SimpleChart__Group__20
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__19__Impl_in_rule__SimpleChart__Group__1911407);
            rule__SimpleChart__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__20_in_rule__SimpleChart__Group__1911410);
            rule__SimpleChart__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__19"


    // $ANTLR start "rule__SimpleChart__Group__19__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5753:1: rule__SimpleChart__Group__19__Impl : ( ( rule__SimpleChart__ClassAssignment_19 ) ) ;
    public final void rule__SimpleChart__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5757:1: ( ( ( rule__SimpleChart__ClassAssignment_19 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5758:1: ( ( rule__SimpleChart__ClassAssignment_19 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5758:1: ( ( rule__SimpleChart__ClassAssignment_19 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5759:1: ( rule__SimpleChart__ClassAssignment_19 )
            {
             before(grammarAccess.getSimpleChartAccess().getClassAssignment_19()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5760:1: ( rule__SimpleChart__ClassAssignment_19 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5760:2: rule__SimpleChart__ClassAssignment_19
            {
            pushFollow(FOLLOW_rule__SimpleChart__ClassAssignment_19_in_rule__SimpleChart__Group__19__Impl11437);
            rule__SimpleChart__ClassAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getSimpleChartAccess().getClassAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__19__Impl"


    // $ANTLR start "rule__SimpleChart__Group__20"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5770:1: rule__SimpleChart__Group__20 : rule__SimpleChart__Group__20__Impl ;
    public final void rule__SimpleChart__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5774:1: ( rule__SimpleChart__Group__20__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5775:2: rule__SimpleChart__Group__20__Impl
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__20__Impl_in_rule__SimpleChart__Group__2011467);
            rule__SimpleChart__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__20"


    // $ANTLR start "rule__SimpleChart__Group__20__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5781:1: rule__SimpleChart__Group__20__Impl : ( '}' ) ;
    public final void rule__SimpleChart__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5785:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5786:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5786:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5787:1: '}'
            {
             before(grammarAccess.getSimpleChartAccess().getRightCurlyBracketKeyword_20()); 
            match(input,25,FOLLOW_25_in_rule__SimpleChart__Group__20__Impl11495); 
             after(grammarAccess.getSimpleChartAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Group__20__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5842:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5846:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5847:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__011568);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Color__Group__1_in_rule__Color__Group__011571);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5854:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5858:1: ( ( 'color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5859:1: ( 'color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5859:1: ( 'color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5860:1: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Color__Group__0__Impl11599); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5873:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5877:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5878:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__111630);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Color__Group__2_in_rule__Color__Group__111633);
            rule__Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5885:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5889:1: ( ( ( rule__Color__NameAssignment_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5890:1: ( ( rule__Color__NameAssignment_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5890:1: ( ( rule__Color__NameAssignment_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5891:1: ( rule__Color__NameAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5892:1: ( rule__Color__NameAssignment_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5892:2: rule__Color__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Color__NameAssignment_1_in_rule__Color__Group__1__Impl11660);
            rule__Color__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5902:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5906:1: ( rule__Color__Group__2__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5907:2: rule__Color__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__211690);
            rule__Color__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5913:1: rule__Color__Group__2__Impl : ( ( rule__Color__RgbAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5917:1: ( ( ( rule__Color__RgbAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5918:1: ( ( rule__Color__RgbAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5918:1: ( ( rule__Color__RgbAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5919:1: ( rule__Color__RgbAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getRgbAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5920:1: ( rule__Color__RgbAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5920:2: rule__Color__RgbAssignment_2
            {
            pushFollow(FOLLOW_rule__Color__RgbAssignment_2_in_rule__Color__Group__2__Impl11717);
            rule__Color__RgbAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRgbAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5936:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5940:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5941:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__011753);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__011756);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5948:1: rule__Label__Group__0__Impl : ( 'label {' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5952:1: ( ( 'label {' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5953:1: ( 'label {' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5953:1: ( 'label {' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5954:1: 'label {'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__Label__Group__0__Impl11784); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5967:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5971:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5972:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__111815);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__2_in_rule__Label__Group__111818);
            rule__Label__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5979:1: rule__Label__Group__1__Impl : ( ( rule__Label__IdAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5983:1: ( ( ( rule__Label__IdAssignment_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5984:1: ( ( rule__Label__IdAssignment_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5984:1: ( ( rule__Label__IdAssignment_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5985:1: ( rule__Label__IdAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getIdAssignment_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5986:1: ( rule__Label__IdAssignment_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5986:2: rule__Label__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Label__IdAssignment_1_in_rule__Label__Group__1__Impl11845);
            rule__Label__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5996:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6000:1: ( rule__Label__Group__2__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6001:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__2__Impl_in_rule__Label__Group__211875);
            rule__Label__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6007:1: rule__Label__Group__2__Impl : ( '}' ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6011:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6012:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6012:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6013:1: '}'
            {
             before(grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Label__Group__2__Impl11903); 
             after(grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__TabletUI__SettingsAssignment_0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6033:1: rule__TabletUI__SettingsAssignment_0 : ( ruleSettings ) ;
    public final void rule__TabletUI__SettingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6037:1: ( ( ruleSettings ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6038:1: ( ruleSettings )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6038:1: ( ruleSettings )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6039:1: ruleSettings
            {
             before(grammarAccess.getTabletUIAccess().getSettingsSettingsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSettings_in_rule__TabletUI__SettingsAssignment_011945);
            ruleSettings();

            state._fsp--;

             after(grammarAccess.getTabletUIAccess().getSettingsSettingsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabletUI__SettingsAssignment_0"


    // $ANTLR start "rule__TabletUI__ElementsAssignment_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6048:1: rule__TabletUI__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__TabletUI__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6052:1: ( ( ruleAbstractElement ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6053:1: ( ruleAbstractElement )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6053:1: ( ruleAbstractElement )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6054:1: ruleAbstractElement
            {
             before(grammarAccess.getTabletUIAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__TabletUI__ElementsAssignment_111976);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getTabletUIAccess().getElementsAbstractElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TabletUI__ElementsAssignment_1"


    // $ANTLR start "rule__Settings__TitleAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6063:1: rule__Settings__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Settings__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6067:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6068:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6068:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6069:1: RULE_STRING
            {
             before(grammarAccess.getSettingsAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Settings__TitleAssignment_212007); 
             after(grammarAccess.getSettingsAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__TitleAssignment_2"


    // $ANTLR start "rule__Settings__Fhemweb_urlAssignment_3_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6078:1: rule__Settings__Fhemweb_urlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Settings__Fhemweb_urlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6082:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6083:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6083:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6084:1: RULE_STRING
            {
             before(grammarAccess.getSettingsAccess().getFhemweb_urlSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Settings__Fhemweb_urlAssignment_3_112038); 
             after(grammarAccess.getSettingsAccess().getFhemweb_urlSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__Fhemweb_urlAssignment_3_1"


    // $ANTLR start "rule__Settings__WidthAssignment_5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6093:1: rule__Settings__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__Settings__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6097:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6098:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6098:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6099:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__WidthAssignment_512069); 
             after(grammarAccess.getSettingsAccess().getWidthINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__WidthAssignment_5"


    // $ANTLR start "rule__Settings__HeightAssignment_7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6108:1: rule__Settings__HeightAssignment_7 : ( RULE_INT ) ;
    public final void rule__Settings__HeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6112:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6113:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6113:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6114:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getHeightINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__HeightAssignment_712100); 
             after(grammarAccess.getSettingsAccess().getHeightINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__HeightAssignment_7"


    // $ANTLR start "rule__Settings__ColumnsAssignment_9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6123:1: rule__Settings__ColumnsAssignment_9 : ( RULE_INT ) ;
    public final void rule__Settings__ColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6127:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6128:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6128:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6129:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getColumnsINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__ColumnsAssignment_912131); 
             after(grammarAccess.getSettingsAccess().getColumnsINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__ColumnsAssignment_9"


    // $ANTLR start "rule__Settings__RowsAssignment_11"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6138:1: rule__Settings__RowsAssignment_11 : ( RULE_INT ) ;
    public final void rule__Settings__RowsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6142:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6143:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6143:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6144:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getRowsINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__RowsAssignment_1112162); 
             after(grammarAccess.getSettingsAccess().getRowsINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__RowsAssignment_11"


    // $ANTLR start "rule__Settings__DebugAssignment_12_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6153:1: rule__Settings__DebugAssignment_12_1 : ( ruleBOOL ) ;
    public final void rule__Settings__DebugAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6157:1: ( ( ruleBOOL ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6158:1: ( ruleBOOL )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6158:1: ( ruleBOOL )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6159:1: ruleBOOL
            {
             before(grammarAccess.getSettingsAccess().getDebugBOOLParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__Settings__DebugAssignment_12_112193);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getSettingsAccess().getDebugBOOLParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__DebugAssignment_12_1"


    // $ANTLR start "rule__Settings__DragdropAssignment_14"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6168:1: rule__Settings__DragdropAssignment_14 : ( ruleBOOL ) ;
    public final void rule__Settings__DragdropAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6172:1: ( ( ruleBOOL ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6173:1: ( ruleBOOL )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6173:1: ( ruleBOOL )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6174:1: ruleBOOL
            {
             before(grammarAccess.getSettingsAccess().getDragdropBOOLParserRuleCall_14_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__Settings__DragdropAssignment_1412224);
            ruleBOOL();

            state._fsp--;

             after(grammarAccess.getSettingsAccess().getDragdropBOOLParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__DragdropAssignment_14"


    // $ANTLR start "rule__Settings__MarginAssignment_16"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6183:1: rule__Settings__MarginAssignment_16 : ( RULE_INT ) ;
    public final void rule__Settings__MarginAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6187:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6188:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6188:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6189:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getMarginINTTerminalRuleCall_16_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__MarginAssignment_1612255); 
             after(grammarAccess.getSettingsAccess().getMarginINTTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__MarginAssignment_16"


    // $ANTLR start "rule__Settings__SettingsAssignment_17"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6198:1: rule__Settings__SettingsAssignment_17 : ( ruleSettingsElement ) ;
    public final void rule__Settings__SettingsAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6202:1: ( ( ruleSettingsElement ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6203:1: ( ruleSettingsElement )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6203:1: ( ruleSettingsElement )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6204:1: ruleSettingsElement
            {
             before(grammarAccess.getSettingsAccess().getSettingsSettingsElementParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleSettingsElement_in_rule__Settings__SettingsAssignment_1712286);
            ruleSettingsElement();

            state._fsp--;

             after(grammarAccess.getSettingsAccess().getSettingsSettingsElementParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Settings__SettingsAssignment_17"


    // $ANTLR start "rule__CSS__PathAssignment_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6213:1: rule__CSS__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CSS__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6217:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6218:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6218:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6219:1: RULE_STRING
            {
             before(grammarAccess.getCSSAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CSS__PathAssignment_112317); 
             after(grammarAccess.getCSSAccess().getPathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSS__PathAssignment_1"


    // $ANTLR start "rule__Page__NameAssignment_0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6228:1: rule__Page__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6232:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6233:1: ( RULE_ID )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6233:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6234:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_012348); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_0"


    // $ANTLR start "rule__Page__ElementsAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6243:1: rule__Page__ElementsAssignment_2 : ( ruleGridster ) ;
    public final void rule__Page__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6247:1: ( ( ruleGridster ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6248:1: ( ruleGridster )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6248:1: ( ruleGridster )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6249:1: ruleGridster
            {
             before(grammarAccess.getPageAccess().getElementsGridsterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGridster_in_rule__Page__ElementsAssignment_212379);
            ruleGridster();

            state._fsp--;

             after(grammarAccess.getPageAccess().getElementsGridsterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ElementsAssignment_2"


    // $ANTLR start "rule__Gridster__HeaderAssignment_1_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6258:1: rule__Gridster__HeaderAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Gridster__HeaderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6262:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6263:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6263:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6264:1: RULE_STRING
            {
             before(grammarAccess.getGridsterAccess().getHeaderSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Gridster__HeaderAssignment_1_112410); 
             after(grammarAccess.getGridsterAccess().getHeaderSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__HeaderAssignment_1_1"


    // $ANTLR start "rule__Gridster__RowAssignment_3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6273:1: rule__Gridster__RowAssignment_3 : ( RULE_INT ) ;
    public final void rule__Gridster__RowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6277:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6278:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6278:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6279:1: RULE_INT
            {
             before(grammarAccess.getGridsterAccess().getRowINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gridster__RowAssignment_312441); 
             after(grammarAccess.getGridsterAccess().getRowINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__RowAssignment_3"


    // $ANTLR start "rule__Gridster__ColumnAssignment_5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6288:1: rule__Gridster__ColumnAssignment_5 : ( RULE_INT ) ;
    public final void rule__Gridster__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6292:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6293:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6293:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6294:1: RULE_INT
            {
             before(grammarAccess.getGridsterAccess().getColumnINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gridster__ColumnAssignment_512472); 
             after(grammarAccess.getGridsterAccess().getColumnINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__ColumnAssignment_5"


    // $ANTLR start "rule__Gridster__ColspanAssignment_6_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6303:1: rule__Gridster__ColspanAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Gridster__ColspanAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6307:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6308:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6308:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6309:1: RULE_INT
            {
             before(grammarAccess.getGridsterAccess().getColspanINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gridster__ColspanAssignment_6_112503); 
             after(grammarAccess.getGridsterAccess().getColspanINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__ColspanAssignment_6_1"


    // $ANTLR start "rule__Gridster__RowspanAssignment_7_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6318:1: rule__Gridster__RowspanAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__Gridster__RowspanAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6322:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6323:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6323:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6324:1: RULE_INT
            {
             before(grammarAccess.getGridsterAccess().getRowspanINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gridster__RowspanAssignment_7_112534); 
             after(grammarAccess.getGridsterAccess().getRowspanINTTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__RowspanAssignment_7_1"


    // $ANTLR start "rule__Gridster__ColorsAssignment_8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6333:1: rule__Gridster__ColorsAssignment_8 : ( ruleColor ) ;
    public final void rule__Gridster__ColorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6337:1: ( ( ruleColor ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6338:1: ( ruleColor )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6338:1: ( ruleColor )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6339:1: ruleColor
            {
             before(grammarAccess.getGridsterAccess().getColorsColorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__Gridster__ColorsAssignment_812565);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getGridsterAccess().getColorsColorParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__ColorsAssignment_8"


    // $ANTLR start "rule__Gridster__WidgetsAssignment_9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6348:1: rule__Gridster__WidgetsAssignment_9 : ( ruleWidget ) ;
    public final void rule__Gridster__WidgetsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6352:1: ( ( ruleWidget ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6353:1: ( ruleWidget )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6353:1: ( ruleWidget )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6354:1: ruleWidget
            {
             before(grammarAccess.getGridsterAccess().getWidgetsWidgetParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__Gridster__WidgetsAssignment_912596);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getGridsterAccess().getWidgetsWidgetParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gridster__WidgetsAssignment_9"


    // $ANTLR start "rule__Calview__DeviceAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6365:1: rule__Calview__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Calview__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6369:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6370:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6370:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6371:1: RULE_STRING
            {
             before(grammarAccess.getCalviewAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calview__DeviceAssignment_212629); 
             after(grammarAccess.getCalviewAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__DeviceAssignment_2"


    // $ANTLR start "rule__Calview__GetAssignment_4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6380:1: rule__Calview__GetAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Calview__GetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6384:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6385:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6385:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6386:1: RULE_STRING
            {
             before(grammarAccess.getCalviewAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calview__GetAssignment_412660); 
             after(grammarAccess.getCalviewAccess().getGetSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__GetAssignment_4"


    // $ANTLR start "rule__Calview__MaxAssignment_6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6395:1: rule__Calview__MaxAssignment_6 : ( RULE_INT ) ;
    public final void rule__Calview__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6399:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6400:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6400:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6401:1: RULE_INT
            {
             before(grammarAccess.getCalviewAccess().getMaxINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Calview__MaxAssignment_612691); 
             after(grammarAccess.getCalviewAccess().getMaxINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__MaxAssignment_6"


    // $ANTLR start "rule__Calview__ClassAssignment_8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6410:1: rule__Calview__ClassAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Calview__ClassAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6414:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6415:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6415:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6416:1: RULE_STRING
            {
             before(grammarAccess.getCalviewAccess().getClassSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calview__ClassAssignment_812722); 
             after(grammarAccess.getCalviewAccess().getClassSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__ClassAssignment_8"


    // $ANTLR start "rule__Calview__AllFCAssignment_9_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6425:1: rule__Calview__AllFCAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Calview__AllFCAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6429:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6430:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6430:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6431:1: ( RULE_ID )
            {
             before(grammarAccess.getCalviewAccess().getAllFCColorCrossReference_9_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6432:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6433:1: RULE_ID
            {
             before(grammarAccess.getCalviewAccess().getAllFCColorIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calview__AllFCAssignment_9_112757); 
             after(grammarAccess.getCalviewAccess().getAllFCColorIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getCalviewAccess().getAllFCColorCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__AllFCAssignment_9_1"


    // $ANTLR start "rule__Calview__AllTCAssignment_10_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6444:1: rule__Calview__AllTCAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Calview__AllTCAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6448:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6449:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6449:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6450:1: ( RULE_ID )
            {
             before(grammarAccess.getCalviewAccess().getAllTCColorCrossReference_10_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6451:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6452:1: RULE_ID
            {
             before(grammarAccess.getCalviewAccess().getAllTCColorIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calview__AllTCAssignment_10_112796); 
             after(grammarAccess.getCalviewAccess().getAllTCColorIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getCalviewAccess().getAllTCColorCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calview__AllTCAssignment_10_1"


    // $ANTLR start "rule__Button__IdAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6463:1: rule__Button__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6467:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6468:1: ( RULE_ID )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6468:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6469:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__IdAssignment_212831); 
             after(grammarAccess.getButtonAccess().getIdIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__IdAssignment_2"


    // $ANTLR start "rule__Button__UrlAssignment_3_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6478:1: rule__Button__UrlAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Button__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6482:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6483:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6483:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6484:1: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getUrlPageCrossReference_3_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6485:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6486:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getUrlPageIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__UrlAssignment_3_112866); 
             after(grammarAccess.getButtonAccess().getUrlPageIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getUrlPageCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__UrlAssignment_3_1"


    // $ANTLR start "rule__Button__IconAssignment_5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6497:1: rule__Button__IconAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Button__IconAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6501:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6502:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6502:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6503:1: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getIconSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Button__IconAssignment_512901); 
             after(grammarAccess.getButtonAccess().getIconSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__IconAssignment_5"


    // $ANTLR start "rule__Button__ClassAssignment_7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6512:1: rule__Button__ClassAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Button__ClassAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6516:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6517:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6517:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6518:1: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getClassSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Button__ClassAssignment_712932); 
             after(grammarAccess.getButtonAccess().getClassSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ClassAssignment_7"


    // $ANTLR start "rule__Button__ColorAssignment_8_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6527:1: rule__Button__ColorAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Button__ColorAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6531:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6532:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6532:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6533:1: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getColorColorCrossReference_8_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6534:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6535:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getColorColorIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__ColorAssignment_8_112967); 
             after(grammarAccess.getButtonAccess().getColorColorIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getColorColorCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ColorAssignment_8_1"


    // $ANTLR start "rule__Button__BackgroundColorAssignment_9_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6546:1: rule__Button__BackgroundColorAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Button__BackgroundColorAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6550:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6551:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6551:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6552:1: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getBackgroundColorColorCrossReference_9_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6553:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6554:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getBackgroundColorColorIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__BackgroundColorAssignment_9_113006); 
             after(grammarAccess.getButtonAccess().getBackgroundColorColorIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getBackgroundColorColorCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__BackgroundColorAssignment_9_1"


    // $ANTLR start "rule__Symbol__DeviceAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6565:1: rule__Symbol__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Symbol__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6569:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6570:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6570:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6571:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__DeviceAssignment_213041); 
             after(grammarAccess.getSymbolAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__DeviceAssignment_2"


    // $ANTLR start "rule__Symbol__GetAssignment_4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6580:1: rule__Symbol__GetAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Symbol__GetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6584:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6585:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6585:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6586:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__GetAssignment_413072); 
             after(grammarAccess.getSymbolAccess().getGetSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__GetAssignment_4"


    // $ANTLR start "rule__Symbol__GetOnAssignment_6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6595:1: rule__Symbol__GetOnAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Symbol__GetOnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6599:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6600:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6600:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6601:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getGetOnSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__GetOnAssignment_613103); 
             after(grammarAccess.getSymbolAccess().getGetOnSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__GetOnAssignment_6"


    // $ANTLR start "rule__Symbol__GetOffAssignment_7_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6610:1: rule__Symbol__GetOffAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Symbol__GetOffAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6614:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6615:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6615:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6616:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getGetOffSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__GetOffAssignment_7_113134); 
             after(grammarAccess.getSymbolAccess().getGetOffSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__GetOffAssignment_7_1"


    // $ANTLR start "rule__Symbol__ClassAssignment_8_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6625:1: rule__Symbol__ClassAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Symbol__ClassAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6629:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6630:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6630:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6631:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getClassSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__ClassAssignment_8_113165); 
             after(grammarAccess.getSymbolAccess().getClassSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__ClassAssignment_8_1"


    // $ANTLR start "rule__Symbol__BgiconAssignment_9_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6640:1: rule__Symbol__BgiconAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__Symbol__BgiconAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6644:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6645:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6645:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6646:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getBgiconSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__BgiconAssignment_9_113196); 
             after(grammarAccess.getSymbolAccess().getBgiconSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__BgiconAssignment_9_1"


    // $ANTLR start "rule__Symbol__OnBackGroundColorAssignment_10_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6655:1: rule__Symbol__OnBackGroundColorAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OnBackGroundColorAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6659:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6660:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6660:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6661:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOnBackGroundColorColorCrossReference_10_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6662:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6663:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOnBackGroundColorColorIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OnBackGroundColorAssignment_10_113231); 
             after(grammarAccess.getSymbolAccess().getOnBackGroundColorColorIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getSymbolAccess().getOnBackGroundColorColorCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__OnBackGroundColorAssignment_10_1"


    // $ANTLR start "rule__Symbol__OnColorAssignment_11_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6674:1: rule__Symbol__OnColorAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OnColorAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6678:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6679:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6679:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6680:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOnColorColorCrossReference_11_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6681:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6682:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOnColorColorIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OnColorAssignment_11_113270); 
             after(grammarAccess.getSymbolAccess().getOnColorColorIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getSymbolAccess().getOnColorColorCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__OnColorAssignment_11_1"


    // $ANTLR start "rule__Symbol__OffColorAssignment_12_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6693:1: rule__Symbol__OffColorAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OffColorAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6697:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6698:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6698:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6699:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOffColorColorCrossReference_12_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6700:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6701:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOffColorColorIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OffColorAssignment_12_113309); 
             after(grammarAccess.getSymbolAccess().getOffColorColorIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getSymbolAccess().getOffColorColorCrossReference_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__OffColorAssignment_12_1"


    // $ANTLR start "rule__Symbol__IconsAssignment_13_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6712:1: rule__Symbol__IconsAssignment_13_2 : ( RULE_STRING ) ;
    public final void rule__Symbol__IconsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6716:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6717:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6717:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6718:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getIconsSTRINGTerminalRuleCall_13_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__IconsAssignment_13_213344); 
             after(grammarAccess.getSymbolAccess().getIconsSTRINGTerminalRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__IconsAssignment_13_2"


    // $ANTLR start "rule__Symbol__OnColorsAssignment_14_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6727:1: rule__Symbol__OnColorsAssignment_14_2 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OnColorsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6731:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6732:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6732:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6733:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOnColorsColorCrossReference_14_2_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6734:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6735:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOnColorsColorIDTerminalRuleCall_14_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OnColorsAssignment_14_213379); 
             after(grammarAccess.getSymbolAccess().getOnColorsColorIDTerminalRuleCall_14_2_0_1()); 

            }

             after(grammarAccess.getSymbolAccess().getOnColorsColorCrossReference_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__OnColorsAssignment_14_2"


    // $ANTLR start "rule__Symbol__OnBackgroundColorsAssignment_15_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6746:1: rule__Symbol__OnBackgroundColorsAssignment_15_2 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OnBackgroundColorsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6750:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6751:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6751:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6752:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOnBackgroundColorsColorCrossReference_15_2_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6753:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6754:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOnBackgroundColorsColorIDTerminalRuleCall_15_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OnBackgroundColorsAssignment_15_213418); 
             after(grammarAccess.getSymbolAccess().getOnBackgroundColorsColorIDTerminalRuleCall_15_2_0_1()); 

            }

             after(grammarAccess.getSymbolAccess().getOnBackgroundColorsColorCrossReference_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__OnBackgroundColorsAssignment_15_2"


    // $ANTLR start "rule__SimpleClock__IdAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6765:1: rule__SimpleClock__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__SimpleClock__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6769:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6770:1: ( RULE_ID )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6770:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6771:1: RULE_ID
            {
             before(grammarAccess.getSimpleClockAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleClock__IdAssignment_213453); 
             after(grammarAccess.getSimpleClockAccess().getIdIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__IdAssignment_2"


    // $ANTLR start "rule__SimpleClock__DateFormatAssignment_4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6780:1: rule__SimpleClock__DateFormatAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SimpleClock__DateFormatAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6784:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6785:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6785:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6786:1: RULE_STRING
            {
             before(grammarAccess.getSimpleClockAccess().getDateFormatSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleClock__DateFormatAssignment_413484); 
             after(grammarAccess.getSimpleClockAccess().getDateFormatSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__DateFormatAssignment_4"


    // $ANTLR start "rule__SimpleClock__TimeFormatAssignment_6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6795:1: rule__SimpleClock__TimeFormatAssignment_6 : ( RULE_STRING ) ;
    public final void rule__SimpleClock__TimeFormatAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6799:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6800:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6800:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6801:1: RULE_STRING
            {
             before(grammarAccess.getSimpleClockAccess().getTimeFormatSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleClock__TimeFormatAssignment_613515); 
             after(grammarAccess.getSimpleClockAccess().getTimeFormatSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__TimeFormatAssignment_6"


    // $ANTLR start "rule__SimpleClock__DateColorAssignment_7_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6810:1: rule__SimpleClock__DateColorAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleClock__DateColorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6814:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6815:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6815:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6816:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleClockAccess().getDateColorColorCrossReference_7_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6817:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6818:1: RULE_ID
            {
             before(grammarAccess.getSimpleClockAccess().getDateColorColorIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleClock__DateColorAssignment_7_113550); 
             after(grammarAccess.getSimpleClockAccess().getDateColorColorIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getSimpleClockAccess().getDateColorColorCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__DateColorAssignment_7_1"


    // $ANTLR start "rule__SimpleClock__TimeColorAssignment_8_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6829:1: rule__SimpleClock__TimeColorAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleClock__TimeColorAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6833:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6834:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6834:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6835:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleClockAccess().getTimeColorColorCrossReference_8_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6836:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6837:1: RULE_ID
            {
             before(grammarAccess.getSimpleClockAccess().getTimeColorColorIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleClock__TimeColorAssignment_8_113589); 
             after(grammarAccess.getSimpleClockAccess().getTimeColorColorIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getSimpleClockAccess().getTimeColorColorCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__TimeColorAssignment_8_1"


    // $ANTLR start "rule__SimpleClock__ClassAssignment_9_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6848:1: rule__SimpleClock__ClassAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__SimpleClock__ClassAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6852:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6853:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6853:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6854:1: RULE_STRING
            {
             before(grammarAccess.getSimpleClockAccess().getClassSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleClock__ClassAssignment_9_113624); 
             after(grammarAccess.getSimpleClockAccess().getClassSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__ClassAssignment_9_1"


    // $ANTLR start "rule__SimpleClock__StyleAssignment_10_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6863:1: rule__SimpleClock__StyleAssignment_10_1 : ( RULE_STRING ) ;
    public final void rule__SimpleClock__StyleAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6867:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6868:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6868:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6869:1: RULE_STRING
            {
             before(grammarAccess.getSimpleClockAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleClock__StyleAssignment_10_113655); 
             after(grammarAccess.getSimpleClockAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__StyleAssignment_10_1"


    // $ANTLR start "rule__SimpleClock__BgColorsAssignment_11_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6878:1: rule__SimpleClock__BgColorsAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleClock__BgColorsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6882:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6883:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6883:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6884:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleClockAccess().getBgColorsColorCrossReference_11_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6885:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6886:1: RULE_ID
            {
             before(grammarAccess.getSimpleClockAccess().getBgColorsColorIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleClock__BgColorsAssignment_11_113690); 
             after(grammarAccess.getSimpleClockAccess().getBgColorsColorIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getSimpleClockAccess().getBgColorsColorCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleClock__BgColorsAssignment_11_1"


    // $ANTLR start "rule__SimpleChart__DeviceAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6897:1: rule__SimpleChart__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6901:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6902:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6902:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6903:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__DeviceAssignment_213725); 
             after(grammarAccess.getSimpleChartAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__DeviceAssignment_2"


    // $ANTLR start "rule__SimpleChart__Log_deviceAssignment_4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6912:1: rule__SimpleChart__Log_deviceAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__Log_deviceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6916:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6917:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6917:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6918:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getLog_deviceSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__Log_deviceAssignment_413756); 
             after(grammarAccess.getSimpleChartAccess().getLog_deviceSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__Log_deviceAssignment_4"


    // $ANTLR start "rule__SimpleChart__LogfileAssignment_5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6927:1: rule__SimpleChart__LogfileAssignment_5 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__LogfileAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6931:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6932:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6932:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6933:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getLogfileSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__LogfileAssignment_513787); 
             after(grammarAccess.getSimpleChartAccess().getLogfileSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__LogfileAssignment_5"


    // $ANTLR start "rule__SimpleChart__ColumnSpecAssignment_7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6942:1: rule__SimpleChart__ColumnSpecAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__ColumnSpecAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6946:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6947:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6947:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6948:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getColumnSpecSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__ColumnSpecAssignment_713818); 
             after(grammarAccess.getSimpleChartAccess().getColumnSpecSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__ColumnSpecAssignment_7"


    // $ANTLR start "rule__SimpleChart__MinAssignment_9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6957:1: rule__SimpleChart__MinAssignment_9 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__MinAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6961:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6962:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6962:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6963:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getMinSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__MinAssignment_913849); 
             after(grammarAccess.getSimpleChartAccess().getMinSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__MinAssignment_9"


    // $ANTLR start "rule__SimpleChart__MaxAssignment_11"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6972:1: rule__SimpleChart__MaxAssignment_11 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__MaxAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6976:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6977:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6977:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6978:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getMaxSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__MaxAssignment_1113880); 
             after(grammarAccess.getSimpleChartAccess().getMaxSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__MaxAssignment_11"


    // $ANTLR start "rule__SimpleChart__XTicksAssignment_13"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6987:1: rule__SimpleChart__XTicksAssignment_13 : ( RULE_INT ) ;
    public final void rule__SimpleChart__XTicksAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6991:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6992:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6992:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6993:1: RULE_INT
            {
             before(grammarAccess.getSimpleChartAccess().getXTicksINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SimpleChart__XTicksAssignment_1313911); 
             after(grammarAccess.getSimpleChartAccess().getXTicksINTTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__XTicksAssignment_13"


    // $ANTLR start "rule__SimpleChart__YTicksAssignment_15"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7002:1: rule__SimpleChart__YTicksAssignment_15 : ( RULE_INT ) ;
    public final void rule__SimpleChart__YTicksAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7006:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7007:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7007:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7008:1: RULE_INT
            {
             before(grammarAccess.getSimpleChartAccess().getYTicksINTTerminalRuleCall_15_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SimpleChart__YTicksAssignment_1513942); 
             after(grammarAccess.getSimpleChartAccess().getYTicksINTTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__YTicksAssignment_15"


    // $ANTLR start "rule__SimpleChart__DaysagoAssignment_17"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7017:1: rule__SimpleChart__DaysagoAssignment_17 : ( RULE_INT ) ;
    public final void rule__SimpleChart__DaysagoAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7021:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7022:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7022:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7023:1: RULE_INT
            {
             before(grammarAccess.getSimpleChartAccess().getDaysagoINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SimpleChart__DaysagoAssignment_1713973); 
             after(grammarAccess.getSimpleChartAccess().getDaysagoINTTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__DaysagoAssignment_17"


    // $ANTLR start "rule__SimpleChart__ClassAssignment_19"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7032:1: rule__SimpleChart__ClassAssignment_19 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__ClassAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7036:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7037:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7037:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7038:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getClassSTRINGTerminalRuleCall_19_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__ClassAssignment_1914004); 
             after(grammarAccess.getSimpleChartAccess().getClassSTRINGTerminalRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleChart__ClassAssignment_19"


    // $ANTLR start "rule__Color__NameAssignment_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7047:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7051:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7052:1: ( RULE_ID )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7052:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7053:1: RULE_ID
            {
             before(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Color__NameAssignment_114035); 
             after(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__NameAssignment_1"


    // $ANTLR start "rule__Color__RgbAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7062:1: rule__Color__RgbAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__RgbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7066:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7067:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7067:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7068:1: RULE_STRING
            {
             before(grammarAccess.getColorAccess().getRgbSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Color__RgbAssignment_214066); 
             after(grammarAccess.getColorAccess().getRgbSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__RgbAssignment_2"


    // $ANTLR start "rule__Label__IdAssignment_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7077:1: rule__Label__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7081:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7082:1: ( RULE_ID )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7082:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7083:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__IdAssignment_114097); 
             after(grammarAccess.getLabelAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__IdAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTabletUI_in_entryRuleTabletUI61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTabletUI68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__Group__0_in_ruleTabletUI94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSettings_in_entryRuleSettings121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSettings128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__0_in_ruleSettings154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSettingsElement_in_entryRuleSettingsElement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSettingsElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SettingsElement__Alternatives_in_ruleSettingsElement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSS_in_entryRuleCSS241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSS248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSS__Group__0_in_ruleCSS274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_ruleAbstractElement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Alternatives_in_ruleBOOL393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridster_in_entryRuleGridster480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGridster487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__0_in_ruleGridster513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Alternatives_in_ruleWidget573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalview_in_entryRuleCalview602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalview609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__0_in_ruleCalview635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__0_in_ruleSymbol755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClock_in_entryRuleSimpleClock782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClock789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__0_in_ruleSimpleClock815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleChart_in_entryRuleSimpleChart842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleChart849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__0_in_ruleSimpleChart875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0_in_ruleColor935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSS_in_rule__SettingsElement__Alternatives1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__SettingsElement__Alternatives1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BOOL__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOOL__Alternatives1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__Widget__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Widget__Alternatives1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClock_in_rule__Widget__Alternatives1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_rule__Widget__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalview_in_rule__Widget__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleChart_in_rule__Widget__Alternatives1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__Group__0__Impl_in_rule__TabletUI__Group__01250 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TabletUI__Group__1_in_rule__TabletUI__Group__01253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__SettingsAssignment_0_in_rule__TabletUI__Group__0__Impl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__Group__1__Impl_in_rule__TabletUI__Group__11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__ElementsAssignment_1_in_rule__TabletUI__Group__1__Impl1337 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Settings__Group__0__Impl_in_rule__Settings__Group__01372 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Settings__Group__1_in_rule__Settings__Group__01375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Settings__Group__0__Impl1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__1__Impl_in_rule__Settings__Group__11434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Settings__Group__2_in_rule__Settings__Group__11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Settings__Group__1__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__2__Impl_in_rule__Settings__Group__21496 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__Settings__Group__3_in_rule__Settings__Group__21499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__TitleAssignment_2_in_rule__Settings__Group__2__Impl1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__3__Impl_in_rule__Settings__Group__31556 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__Settings__Group__4_in_rule__Settings__Group__31559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_3__0_in_rule__Settings__Group__3__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__4__Impl_in_rule__Settings__Group__41617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__5_in_rule__Settings__Group__41620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Settings__Group__4__Impl1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__5__Impl_in_rule__Settings__Group__51679 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Settings__Group__6_in_rule__Settings__Group__51682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__WidthAssignment_5_in_rule__Settings__Group__5__Impl1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__6__Impl_in_rule__Settings__Group__61739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__7_in_rule__Settings__Group__61742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Settings__Group__6__Impl1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__7__Impl_in_rule__Settings__Group__71801 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Settings__Group__8_in_rule__Settings__Group__71804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__HeightAssignment_7_in_rule__Settings__Group__7__Impl1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__8__Impl_in_rule__Settings__Group__81861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__9_in_rule__Settings__Group__81864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Settings__Group__8__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__9__Impl_in_rule__Settings__Group__91923 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Settings__Group__10_in_rule__Settings__Group__91926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__ColumnsAssignment_9_in_rule__Settings__Group__9__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__10__Impl_in_rule__Settings__Group__101983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__11_in_rule__Settings__Group__101986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Settings__Group__10__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__11__Impl_in_rule__Settings__Group__112045 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Settings__Group__12_in_rule__Settings__Group__112048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__RowsAssignment_11_in_rule__Settings__Group__11__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__12__Impl_in_rule__Settings__Group__122105 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Settings__Group__13_in_rule__Settings__Group__122108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_12__0_in_rule__Settings__Group__12__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__13__Impl_in_rule__Settings__Group__132166 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Settings__Group__14_in_rule__Settings__Group__132169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Settings__Group__13__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__14__Impl_in_rule__Settings__Group__142228 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Settings__Group__15_in_rule__Settings__Group__142231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__DragdropAssignment_14_in_rule__Settings__Group__14__Impl2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__15__Impl_in_rule__Settings__Group__152288 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__16_in_rule__Settings__Group__152291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Settings__Group__15__Impl2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__16__Impl_in_rule__Settings__Group__162350 = new BitSet(new long[]{0x0000010000800000L});
    public static final BitSet FOLLOW_rule__Settings__Group__17_in_rule__Settings__Group__162353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__MarginAssignment_16_in_rule__Settings__Group__16__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__17__Impl_in_rule__Settings__Group__172410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__SettingsAssignment_17_in_rule__Settings__Group__17__Impl2437 = new BitSet(new long[]{0x0000010000800002L});
    public static final BitSet FOLLOW_rule__Settings__Group_3__0__Impl_in_rule__Settings__Group_3__02504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Settings__Group_3__1_in_rule__Settings__Group_3__02507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Settings__Group_3__0__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_3__1__Impl_in_rule__Settings__Group_3__12566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Fhemweb_urlAssignment_3_1_in_rule__Settings__Group_3__1__Impl2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_12__0__Impl_in_rule__Settings__Group_12__02627 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Settings__Group_12__1_in_rule__Settings__Group_12__02630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Settings__Group_12__0__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_12__1__Impl_in_rule__Settings__Group_12__12689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__DebugAssignment_12_1_in_rule__Settings__Group_12__1__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSS__Group__0__Impl_in_rule__CSS__Group__02750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSS__Group__1_in_rule__CSS__Group__02753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSS__Group__0__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSS__Group__1__Impl_in_rule__CSS__Group__12812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSS__PathAssignment_1_in_rule__CSS__Group__1__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02873 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_0_in_rule__Page__Group__0__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12933 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group__1__Impl2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22995 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ElementsAssignment_2_in_rule__Page__Group__2__Impl3025 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__33056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Page__Group__3__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__0__Impl_in_rule__Gridster__Group__03123 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__Gridster__Group__1_in_rule__Gridster__Group__03126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Gridster__Group__0__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__1__Impl_in_rule__Gridster__Group__13185 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__Gridster__Group__2_in_rule__Gridster__Group__13188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_1__0_in_rule__Gridster__Group__1__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__2__Impl_in_rule__Gridster__Group__23246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__3_in_rule__Gridster__Group__23249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Gridster__Group__2__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__3__Impl_in_rule__Gridster__Group__33308 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Gridster__Group__4_in_rule__Gridster__Group__33311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__RowAssignment_3_in_rule__Gridster__Group__3__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__4__Impl_in_rule__Gridster__Group__43368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__5_in_rule__Gridster__Group__43371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Gridster__Group__4__Impl3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__5__Impl_in_rule__Gridster__Group__53430 = new BitSet(new long[]{0x20400520E2800000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__6_in_rule__Gridster__Group__53433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__ColumnAssignment_5_in_rule__Gridster__Group__5__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__6__Impl_in_rule__Gridster__Group__63490 = new BitSet(new long[]{0x20400520E2800000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__7_in_rule__Gridster__Group__63493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_6__0_in_rule__Gridster__Group__6__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__7__Impl_in_rule__Gridster__Group__73551 = new BitSet(new long[]{0x20400520E2800000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__8_in_rule__Gridster__Group__73554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_7__0_in_rule__Gridster__Group__7__Impl3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__8__Impl_in_rule__Gridster__Group__83612 = new BitSet(new long[]{0x20400520E2800000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__9_in_rule__Gridster__Group__83615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__ColorsAssignment_8_in_rule__Gridster__Group__8__Impl3642 = new BitSet(new long[]{0x0000010000800002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__9__Impl_in_rule__Gridster__Group__93673 = new BitSet(new long[]{0x20400520E2800000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__10_in_rule__Gridster__Group__93676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__WidgetsAssignment_9_in_rule__Gridster__Group__9__Impl3703 = new BitSet(new long[]{0x2040042080000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__10__Impl_in_rule__Gridster__Group__103734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Gridster__Group__10__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_1__0__Impl_in_rule__Gridster__Group_1__03815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Gridster__Group_1__1_in_rule__Gridster__Group_1__03818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Gridster__Group_1__0__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_1__1__Impl_in_rule__Gridster__Group_1__13877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__HeaderAssignment_1_1_in_rule__Gridster__Group_1__1__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_6__0__Impl_in_rule__Gridster__Group_6__03938 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group_6__1_in_rule__Gridster__Group_6__03941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Gridster__Group_6__0__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_6__1__Impl_in_rule__Gridster__Group_6__14000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__ColspanAssignment_6_1_in_rule__Gridster__Group_6__1__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_7__0__Impl_in_rule__Gridster__Group_7__04061 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group_7__1_in_rule__Gridster__Group_7__04064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Gridster__Group_7__0__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_7__1__Impl_in_rule__Gridster__Group_7__14123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__RowspanAssignment_7_1_in_rule__Gridster__Group_7__1__Impl4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__0__Impl_in_rule__Calview__Group__04185 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__1_in_rule__Calview__Group__04188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Calview__Group__0__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__1__Impl_in_rule__Calview__Group__14247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Calview__Group__2_in_rule__Calview__Group__14250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Calview__Group__1__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__2__Impl_in_rule__Calview__Group__24309 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__3_in_rule__Calview__Group__24312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__DeviceAssignment_2_in_rule__Calview__Group__2__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__3__Impl_in_rule__Calview__Group__34369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Calview__Group__4_in_rule__Calview__Group__34372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Calview__Group__3__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__4__Impl_in_rule__Calview__Group__44431 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__5_in_rule__Calview__Group__44434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__GetAssignment_4_in_rule__Calview__Group__4__Impl4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__5__Impl_in_rule__Calview__Group__54491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calview__Group__6_in_rule__Calview__Group__54494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Calview__Group__5__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__6__Impl_in_rule__Calview__Group__64553 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__7_in_rule__Calview__Group__64556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__MaxAssignment_6_in_rule__Calview__Group__6__Impl4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__7__Impl_in_rule__Calview__Group__74613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Calview__Group__8_in_rule__Calview__Group__74616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Calview__Group__7__Impl4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__8__Impl_in_rule__Calview__Group__84675 = new BitSet(new long[]{0x0000001802000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__9_in_rule__Calview__Group__84678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__ClassAssignment_8_in_rule__Calview__Group__8__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__9__Impl_in_rule__Calview__Group__94735 = new BitSet(new long[]{0x0000001802000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__10_in_rule__Calview__Group__94738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_9__0_in_rule__Calview__Group__9__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__10__Impl_in_rule__Calview__Group__104796 = new BitSet(new long[]{0x0000001802000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__11_in_rule__Calview__Group__104799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_10__0_in_rule__Calview__Group__10__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__11__Impl_in_rule__Calview__Group__114857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Calview__Group__11__Impl4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_9__0__Impl_in_rule__Calview__Group_9__04940 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Calview__Group_9__1_in_rule__Calview__Group_9__04943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Calview__Group_9__0__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_9__1__Impl_in_rule__Calview__Group_9__15002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__AllFCAssignment_9_1_in_rule__Calview__Group_9__1__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_10__0__Impl_in_rule__Calview__Group_10__05063 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Calview__Group_10__1_in_rule__Calview__Group_10__05066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Calview__Group_10__0__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_10__1__Impl_in_rule__Calview__Group_10__15125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__AllTCAssignment_10_1_in_rule__Calview__Group_10__1__Impl5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__05186 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__05189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Button__Group__0__Impl5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__15248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Button__Group__2_in_rule__Button__Group__15251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Button__Group__1__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__25310 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Button__Group__3_in_rule__Button__Group__25313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__IdAssignment_2_in_rule__Button__Group__2__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__35370 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Button__Group__4_in_rule__Button__Group__35373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_3__0_in_rule__Button__Group__3__Impl5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__45431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group__5_in_rule__Button__Group__45434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Button__Group__4__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__55493 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Button__Group__6_in_rule__Button__Group__55496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__IconAssignment_5_in_rule__Button__Group__5__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__6__Impl_in_rule__Button__Group__65553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group__7_in_rule__Button__Group__65556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Button__Group__6__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__7__Impl_in_rule__Button__Group__75615 = new BitSet(new long[]{0x0000030002000000L});
    public static final BitSet FOLLOW_rule__Button__Group__8_in_rule__Button__Group__75618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__ClassAssignment_7_in_rule__Button__Group__7__Impl5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__8__Impl_in_rule__Button__Group__85675 = new BitSet(new long[]{0x0000030002000000L});
    public static final BitSet FOLLOW_rule__Button__Group__9_in_rule__Button__Group__85678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_8__0_in_rule__Button__Group__8__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__9__Impl_in_rule__Button__Group__95736 = new BitSet(new long[]{0x0000030002000000L});
    public static final BitSet FOLLOW_rule__Button__Group__10_in_rule__Button__Group__95739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_9__0_in_rule__Button__Group__9__Impl5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__10__Impl_in_rule__Button__Group__105797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Button__Group__10__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_3__0__Impl_in_rule__Button__Group_3__05878 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Button__Group_3__1_in_rule__Button__Group_3__05881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Button__Group_3__0__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_3__1__Impl_in_rule__Button__Group_3__15940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__UrlAssignment_3_1_in_rule__Button__Group_3__1__Impl5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_8__0__Impl_in_rule__Button__Group_8__06001 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Button__Group_8__1_in_rule__Button__Group_8__06004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Button__Group_8__0__Impl6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_8__1__Impl_in_rule__Button__Group_8__16063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__ColorAssignment_8_1_in_rule__Button__Group_8__1__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_9__0__Impl_in_rule__Button__Group_9__06124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Button__Group_9__1_in_rule__Button__Group_9__06127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Button__Group_9__0__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_9__1__Impl_in_rule__Button__Group_9__16186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__BackgroundColorAssignment_9_1_in_rule__Button__Group_9__1__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__0__Impl_in_rule__Symbol__Group__06247 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group__1_in_rule__Symbol__Group__06250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Symbol__Group__0__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__1__Impl_in_rule__Symbol__Group__16309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__2_in_rule__Symbol__Group__16312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Symbol__Group__1__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__2__Impl_in_rule__Symbol__Group__26371 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group__3_in_rule__Symbol__Group__26374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__DeviceAssignment_2_in_rule__Symbol__Group__2__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__3__Impl_in_rule__Symbol__Group__36431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__4_in_rule__Symbol__Group__36434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Symbol__Group__3__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__4__Impl_in_rule__Symbol__Group__46493 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group__5_in_rule__Symbol__Group__46496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__GetAssignment_4_in_rule__Symbol__Group__4__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__5__Impl_in_rule__Symbol__Group__56553 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__6_in_rule__Symbol__Group__56556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Symbol__Group__5__Impl6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__6__Impl_in_rule__Symbol__Group__66615 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__7_in_rule__Symbol__Group__66618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__GetOnAssignment_6_in_rule__Symbol__Group__6__Impl6645 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Symbol__Group__7__Impl_in_rule__Symbol__Group__76676 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__8_in_rule__Symbol__Group__76679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_7__0_in_rule__Symbol__Group__7__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__8__Impl_in_rule__Symbol__Group__86737 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__9_in_rule__Symbol__Group__86740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_8__0_in_rule__Symbol__Group__8__Impl6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__9__Impl_in_rule__Symbol__Group__96798 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__10_in_rule__Symbol__Group__96801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_9__0_in_rule__Symbol__Group__9__Impl6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__10__Impl_in_rule__Symbol__Group__106859 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__11_in_rule__Symbol__Group__106862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_10__0_in_rule__Symbol__Group__10__Impl6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__11__Impl_in_rule__Symbol__Group__116920 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__12_in_rule__Symbol__Group__116923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_11__0_in_rule__Symbol__Group__11__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__12__Impl_in_rule__Symbol__Group__126981 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__13_in_rule__Symbol__Group__126984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_12__0_in_rule__Symbol__Group__12__Impl7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__13__Impl_in_rule__Symbol__Group__137042 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__14_in_rule__Symbol__Group__137045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__0_in_rule__Symbol__Group__13__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__14__Impl_in_rule__Symbol__Group__147103 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__15_in_rule__Symbol__Group__147106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__0_in_rule__Symbol__Group__14__Impl7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__15__Impl_in_rule__Symbol__Group__157164 = new BitSet(new long[]{0x0033F00402000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__16_in_rule__Symbol__Group__157167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__0_in_rule__Symbol__Group__15__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__16__Impl_in_rule__Symbol__Group__167225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Symbol__Group__16__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_7__0__Impl_in_rule__Symbol__Group_7__07318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_7__1_in_rule__Symbol__Group_7__07321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Symbol__Group_7__0__Impl7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_7__1__Impl_in_rule__Symbol__Group_7__17380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__GetOffAssignment_7_1_in_rule__Symbol__Group_7__1__Impl7407 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Symbol__Group_8__0__Impl_in_rule__Symbol__Group_8__07442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_8__1_in_rule__Symbol__Group_8__07445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Symbol__Group_8__0__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_8__1__Impl_in_rule__Symbol__Group_8__17504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__ClassAssignment_8_1_in_rule__Symbol__Group_8__1__Impl7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_9__0__Impl_in_rule__Symbol__Group_9__07565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_9__1_in_rule__Symbol__Group_9__07568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Symbol__Group_9__0__Impl7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_9__1__Impl_in_rule__Symbol__Group_9__17627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__BgiconAssignment_9_1_in_rule__Symbol__Group_9__1__Impl7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_10__0__Impl_in_rule__Symbol__Group_10__07688 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_10__1_in_rule__Symbol__Group_10__07691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Symbol__Group_10__0__Impl7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_10__1__Impl_in_rule__Symbol__Group_10__17750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OnBackGroundColorAssignment_10_1_in_rule__Symbol__Group_10__1__Impl7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_11__0__Impl_in_rule__Symbol__Group_11__07811 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_11__1_in_rule__Symbol__Group_11__07814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Symbol__Group_11__0__Impl7842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_11__1__Impl_in_rule__Symbol__Group_11__17873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OnColorAssignment_11_1_in_rule__Symbol__Group_11__1__Impl7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_12__0__Impl_in_rule__Symbol__Group_12__07934 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_12__1_in_rule__Symbol__Group_12__07937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Symbol__Group_12__0__Impl7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_12__1__Impl_in_rule__Symbol__Group_12__17996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OffColorAssignment_12_1_in_rule__Symbol__Group_12__1__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__0__Impl_in_rule__Symbol__Group_13__08057 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__1_in_rule__Symbol__Group_13__08060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Symbol__Group_13__0__Impl8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__1__Impl_in_rule__Symbol__Group_13__18119 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__2_in_rule__Symbol__Group_13__18122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Symbol__Group_13__1__Impl8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__2__Impl_in_rule__Symbol__Group_13__28181 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__3_in_rule__Symbol__Group_13__28184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__IconsAssignment_13_2_in_rule__Symbol__Group_13__2__Impl8211 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__3__Impl_in_rule__Symbol__Group_13__38242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Symbol__Group_13__3__Impl8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__0__Impl_in_rule__Symbol__Group_14__08309 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__1_in_rule__Symbol__Group_14__08312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Symbol__Group_14__0__Impl8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__1__Impl_in_rule__Symbol__Group_14__18371 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__2_in_rule__Symbol__Group_14__18374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Symbol__Group_14__1__Impl8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__2__Impl_in_rule__Symbol__Group_14__28433 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__3_in_rule__Symbol__Group_14__28436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OnColorsAssignment_14_2_in_rule__Symbol__Group_14__2__Impl8463 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__3__Impl_in_rule__Symbol__Group_14__38494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Symbol__Group_14__3__Impl8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__0__Impl_in_rule__Symbol__Group_15__08561 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__1_in_rule__Symbol__Group_15__08564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Symbol__Group_15__0__Impl8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__1__Impl_in_rule__Symbol__Group_15__18623 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__2_in_rule__Symbol__Group_15__18626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Symbol__Group_15__1__Impl8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__2__Impl_in_rule__Symbol__Group_15__28685 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__3_in_rule__Symbol__Group_15__28688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OnBackgroundColorsAssignment_15_2_in_rule__Symbol__Group_15__2__Impl8715 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__3__Impl_in_rule__Symbol__Group_15__38746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Symbol__Group_15__3__Impl8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__0__Impl_in_rule__SimpleClock__Group__08813 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__1_in_rule__SimpleClock__Group__08816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__SimpleClock__Group__0__Impl8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__1__Impl_in_rule__SimpleClock__Group__18875 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__2_in_rule__SimpleClock__Group__18878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SimpleClock__Group__1__Impl8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__2__Impl_in_rule__SimpleClock__Group__28937 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__3_in_rule__SimpleClock__Group__28940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__IdAssignment_2_in_rule__SimpleClock__Group__2__Impl8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__3__Impl_in_rule__SimpleClock__Group__38998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__4_in_rule__SimpleClock__Group__39001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__SimpleClock__Group__3__Impl9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__4__Impl_in_rule__SimpleClock__Group__49060 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__5_in_rule__SimpleClock__Group__49063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__DateFormatAssignment_4_in_rule__SimpleClock__Group__4__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__5__Impl_in_rule__SimpleClock__Group__59120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__6_in_rule__SimpleClock__Group__59123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__SimpleClock__Group__5__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__6__Impl_in_rule__SimpleClock__Group__69182 = new BitSet(new long[]{0x1E00000402000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__7_in_rule__SimpleClock__Group__69185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__TimeFormatAssignment_6_in_rule__SimpleClock__Group__6__Impl9212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__7__Impl_in_rule__SimpleClock__Group__79242 = new BitSet(new long[]{0x1E00000402000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__8_in_rule__SimpleClock__Group__79245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_7__0_in_rule__SimpleClock__Group__7__Impl9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__8__Impl_in_rule__SimpleClock__Group__89303 = new BitSet(new long[]{0x1E00000402000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__9_in_rule__SimpleClock__Group__89306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_8__0_in_rule__SimpleClock__Group__8__Impl9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__9__Impl_in_rule__SimpleClock__Group__99364 = new BitSet(new long[]{0x1E00000402000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__10_in_rule__SimpleClock__Group__99367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_9__0_in_rule__SimpleClock__Group__9__Impl9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__10__Impl_in_rule__SimpleClock__Group__109425 = new BitSet(new long[]{0x1E00000402000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__11_in_rule__SimpleClock__Group__109428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_10__0_in_rule__SimpleClock__Group__10__Impl9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__11__Impl_in_rule__SimpleClock__Group__119486 = new BitSet(new long[]{0x1E00000402000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__12_in_rule__SimpleClock__Group__119489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_11__0_in_rule__SimpleClock__Group__11__Impl9516 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__12__Impl_in_rule__SimpleClock__Group__129547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SimpleClock__Group__12__Impl9575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_7__0__Impl_in_rule__SimpleClock__Group_7__09632 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_7__1_in_rule__SimpleClock__Group_7__09635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__SimpleClock__Group_7__0__Impl9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_7__1__Impl_in_rule__SimpleClock__Group_7__19694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__DateColorAssignment_7_1_in_rule__SimpleClock__Group_7__1__Impl9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_8__0__Impl_in_rule__SimpleClock__Group_8__09755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_8__1_in_rule__SimpleClock__Group_8__09758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__SimpleClock__Group_8__0__Impl9786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_8__1__Impl_in_rule__SimpleClock__Group_8__19817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__TimeColorAssignment_8_1_in_rule__SimpleClock__Group_8__1__Impl9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_9__0__Impl_in_rule__SimpleClock__Group_9__09878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_9__1_in_rule__SimpleClock__Group_9__09881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleClock__Group_9__0__Impl9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_9__1__Impl_in_rule__SimpleClock__Group_9__19940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__ClassAssignment_9_1_in_rule__SimpleClock__Group_9__1__Impl9967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_10__0__Impl_in_rule__SimpleClock__Group_10__010001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_10__1_in_rule__SimpleClock__Group_10__010004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__SimpleClock__Group_10__0__Impl10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_10__1__Impl_in_rule__SimpleClock__Group_10__110063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__StyleAssignment_10_1_in_rule__SimpleClock__Group_10__1__Impl10090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_11__0__Impl_in_rule__SimpleClock__Group_11__010124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_11__1_in_rule__SimpleClock__Group_11__010127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__SimpleClock__Group_11__0__Impl10155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_11__1__Impl_in_rule__SimpleClock__Group_11__110186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__BgColorsAssignment_11_1_in_rule__SimpleClock__Group_11__1__Impl10213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__0__Impl_in_rule__SimpleChart__Group__010247 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__1_in_rule__SimpleChart__Group__010250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__SimpleChart__Group__0__Impl10278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__1__Impl_in_rule__SimpleChart__Group__110309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__2_in_rule__SimpleChart__Group__110312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SimpleChart__Group__1__Impl10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__2__Impl_in_rule__SimpleChart__Group__210371 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__3_in_rule__SimpleChart__Group__210374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__DeviceAssignment_2_in_rule__SimpleChart__Group__2__Impl10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__3__Impl_in_rule__SimpleChart__Group__310431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__4_in_rule__SimpleChart__Group__310434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__SimpleChart__Group__3__Impl10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__4__Impl_in_rule__SimpleChart__Group__410493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__5_in_rule__SimpleChart__Group__410496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Log_deviceAssignment_4_in_rule__SimpleChart__Group__4__Impl10523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__5__Impl_in_rule__SimpleChart__Group__510553 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__6_in_rule__SimpleChart__Group__510556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__LogfileAssignment_5_in_rule__SimpleChart__Group__5__Impl10583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__6__Impl_in_rule__SimpleChart__Group__610613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__7_in_rule__SimpleChart__Group__610616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__SimpleChart__Group__6__Impl10644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__7__Impl_in_rule__SimpleChart__Group__710675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__8_in_rule__SimpleChart__Group__710678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__ColumnSpecAssignment_7_in_rule__SimpleChart__Group__7__Impl10705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__8__Impl_in_rule__SimpleChart__Group__810735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__9_in_rule__SimpleChart__Group__810738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__SimpleChart__Group__8__Impl10766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__9__Impl_in_rule__SimpleChart__Group__910797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__10_in_rule__SimpleChart__Group__910800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__MinAssignment_9_in_rule__SimpleChart__Group__9__Impl10827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__10__Impl_in_rule__SimpleChart__Group__1010857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__11_in_rule__SimpleChart__Group__1010860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__SimpleChart__Group__10__Impl10888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__11__Impl_in_rule__SimpleChart__Group__1110919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__12_in_rule__SimpleChart__Group__1110922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__MaxAssignment_11_in_rule__SimpleChart__Group__11__Impl10949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__12__Impl_in_rule__SimpleChart__Group__1210979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__13_in_rule__SimpleChart__Group__1210982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__SimpleChart__Group__12__Impl11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__13__Impl_in_rule__SimpleChart__Group__1311041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__14_in_rule__SimpleChart__Group__1311044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__XTicksAssignment_13_in_rule__SimpleChart__Group__13__Impl11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__14__Impl_in_rule__SimpleChart__Group__1411101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__15_in_rule__SimpleChart__Group__1411104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__SimpleChart__Group__14__Impl11132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__15__Impl_in_rule__SimpleChart__Group__1511163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__16_in_rule__SimpleChart__Group__1511166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__YTicksAssignment_15_in_rule__SimpleChart__Group__15__Impl11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__16__Impl_in_rule__SimpleChart__Group__1611223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__17_in_rule__SimpleChart__Group__1611226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__SimpleChart__Group__16__Impl11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__17__Impl_in_rule__SimpleChart__Group__1711285 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__18_in_rule__SimpleChart__Group__1711288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__DaysagoAssignment_17_in_rule__SimpleChart__Group__17__Impl11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__18__Impl_in_rule__SimpleChart__Group__1811345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__19_in_rule__SimpleChart__Group__1811348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SimpleChart__Group__18__Impl11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__19__Impl_in_rule__SimpleChart__Group__1911407 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__20_in_rule__SimpleChart__Group__1911410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__ClassAssignment_19_in_rule__SimpleChart__Group__19__Impl11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__20__Impl_in_rule__SimpleChart__Group__2011467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SimpleChart__Group__20__Impl11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__011568 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__011571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Color__Group__0__Impl11599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__111630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Color__Group__2_in_rule__Color__Group__111633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__NameAssignment_1_in_rule__Color__Group__1__Impl11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__211690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__RgbAssignment_2_in_rule__Color__Group__2__Impl11717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__011753 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__011756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__Label__Group__0__Impl11784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__111815 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Label__Group__2_in_rule__Label__Group__111818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__IdAssignment_1_in_rule__Label__Group__1__Impl11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__2__Impl_in_rule__Label__Group__211875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Label__Group__2__Impl11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSettings_in_rule__TabletUI__SettingsAssignment_011945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__TabletUI__ElementsAssignment_111976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Settings__TitleAssignment_212007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Settings__Fhemweb_urlAssignment_3_112038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__WidthAssignment_512069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__HeightAssignment_712100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__ColumnsAssignment_912131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__RowsAssignment_1112162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__Settings__DebugAssignment_12_112193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__Settings__DragdropAssignment_1412224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__MarginAssignment_1612255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSettingsElement_in_rule__Settings__SettingsAssignment_1712286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CSS__PathAssignment_112317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_012348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridster_in_rule__Page__ElementsAssignment_212379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Gridster__HeaderAssignment_1_112410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gridster__RowAssignment_312441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gridster__ColumnAssignment_512472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gridster__ColspanAssignment_6_112503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gridster__RowspanAssignment_7_112534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Gridster__ColorsAssignment_812565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__Gridster__WidgetsAssignment_912596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calview__DeviceAssignment_212629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calview__GetAssignment_412660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Calview__MaxAssignment_612691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calview__ClassAssignment_812722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calview__AllFCAssignment_9_112757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calview__AllTCAssignment_10_112796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__IdAssignment_212831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__UrlAssignment_3_112866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Button__IconAssignment_512901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Button__ClassAssignment_712932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__ColorAssignment_8_112967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__BackgroundColorAssignment_9_113006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__DeviceAssignment_213041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__GetAssignment_413072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__GetOnAssignment_613103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__GetOffAssignment_7_113134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__ClassAssignment_8_113165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__BgiconAssignment_9_113196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OnBackGroundColorAssignment_10_113231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OnColorAssignment_11_113270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OffColorAssignment_12_113309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__IconsAssignment_13_213344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OnColorsAssignment_14_213379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OnBackgroundColorsAssignment_15_213418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleClock__IdAssignment_213453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleClock__DateFormatAssignment_413484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleClock__TimeFormatAssignment_613515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleClock__DateColorAssignment_7_113550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleClock__TimeColorAssignment_8_113589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleClock__ClassAssignment_9_113624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleClock__StyleAssignment_10_113655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleClock__BgColorsAssignment_11_113690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__DeviceAssignment_213725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__Log_deviceAssignment_413756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__LogfileAssignment_513787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__ColumnSpecAssignment_713818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__MinAssignment_913849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__MaxAssignment_1113880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SimpleChart__XTicksAssignment_1313911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SimpleChart__YTicksAssignment_1513942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SimpleChart__DaysagoAssignment_1713973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__ClassAssignment_1914004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Color__NameAssignment_114035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Color__RgbAssignment_214066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__IdAssignment_114097 = new BitSet(new long[]{0x0000000000000002L});

}