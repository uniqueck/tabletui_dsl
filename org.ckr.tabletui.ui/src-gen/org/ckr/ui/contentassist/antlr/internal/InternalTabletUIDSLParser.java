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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'settings'", "'title'", "'width'", "'height'", "'columns'", "'rows'", "'drag&drop'", "'gridster_margin'", "'fhemweb_url'", "'debug'", "'css'", "'{'", "'}'", "'row'", "'column'", "'header'", "'colspan'", "'rowspan'", "'switch'", "'get'", "'getOn'", "'getOff'", "'class'", "'onColor'", "'offColor'", "'background-on-color'", "'background-icon'", "'icon'", "'div'", "'calview'", "'max'", "'all-forecast-color'", "'all-today-color'", "'button'", "'url'", "'color'", "'background-color'", "'symbol'", "'on-color'", "'off-color'", "'icons'", "'['", "']'", "'onColors'", "'onBackgroundColors'", "'SimpleClock'", "'date-format'", "'time-format'", "'date-color'", "'time-color'", "'style'", "'bg-colors'", "'simpleChart'", "'log-config'", "'columnSpec'", "'minValue'", "'maxValue'", "'xTicks'", "'yTicks'", "'daysago'", "'label'"
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


    // $ANTLR start "entryRuleSwitch"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:312:1: entryRuleSwitch : ruleSwitch EOF ;
    public final void entryRuleSwitch() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:313:1: ( ruleSwitch EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:314:1: ruleSwitch EOF
            {
             before(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch600);
            ruleSwitch();

            state._fsp--;

             after(grammarAccess.getSwitchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch607); 

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
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:321:1: ruleSwitch : ( ( rule__Switch__Group__0 ) ) ;
    public final void ruleSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:325:2: ( ( ( rule__Switch__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:326:1: ( ( rule__Switch__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:326:1: ( ( rule__Switch__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:327:1: ( rule__Switch__Group__0 )
            {
             before(grammarAccess.getSwitchAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:328:1: ( rule__Switch__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:328:2: rule__Switch__Group__0
            {
            pushFollow(FOLLOW_rule__Switch__Group__0_in_ruleSwitch633);
            rule__Switch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getGroup()); 

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
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleCustom"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:340:1: entryRuleCustom : ruleCustom EOF ;
    public final void entryRuleCustom() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:341:1: ( ruleCustom EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:342:1: ruleCustom EOF
            {
             before(grammarAccess.getCustomRule()); 
            pushFollow(FOLLOW_ruleCustom_in_entryRuleCustom660);
            ruleCustom();

            state._fsp--;

             after(grammarAccess.getCustomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustom667); 

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
    // $ANTLR end "entryRuleCustom"


    // $ANTLR start "ruleCustom"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:349:1: ruleCustom : ( ( rule__Custom__Group__0 ) ) ;
    public final void ruleCustom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:353:2: ( ( ( rule__Custom__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:354:1: ( ( rule__Custom__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:354:1: ( ( rule__Custom__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:355:1: ( rule__Custom__Group__0 )
            {
             before(grammarAccess.getCustomAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:356:1: ( rule__Custom__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:356:2: rule__Custom__Group__0
            {
            pushFollow(FOLLOW_rule__Custom__Group__0_in_ruleCustom693);
            rule__Custom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getGroup()); 

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
    // $ANTLR end "ruleCustom"


    // $ANTLR start "entryRuleDiv"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:368:1: entryRuleDiv : ruleDiv EOF ;
    public final void entryRuleDiv() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:369:1: ( ruleDiv EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:370:1: ruleDiv EOF
            {
             before(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_ruleDiv_in_entryRuleDiv720);
            ruleDiv();

            state._fsp--;

             after(grammarAccess.getDivRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiv727); 

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
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:377:1: ruleDiv : ( ( rule__Div__Group__0 ) ) ;
    public final void ruleDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:381:2: ( ( ( rule__Div__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:382:1: ( ( rule__Div__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:382:1: ( ( rule__Div__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:383:1: ( rule__Div__Group__0 )
            {
             before(grammarAccess.getDivAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:384:1: ( rule__Div__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:384:2: rule__Div__Group__0
            {
            pushFollow(FOLLOW_rule__Div__Group__0_in_ruleDiv753);
            rule__Div__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDivAccess().getGroup()); 

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
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuleCalview"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:396:1: entryRuleCalview : ruleCalview EOF ;
    public final void entryRuleCalview() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:397:1: ( ruleCalview EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:398:1: ruleCalview EOF
            {
             before(grammarAccess.getCalviewRule()); 
            pushFollow(FOLLOW_ruleCalview_in_entryRuleCalview780);
            ruleCalview();

            state._fsp--;

             after(grammarAccess.getCalviewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCalview787); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:405:1: ruleCalview : ( ( rule__Calview__Group__0 ) ) ;
    public final void ruleCalview() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:409:2: ( ( ( rule__Calview__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:410:1: ( ( rule__Calview__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:410:1: ( ( rule__Calview__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:411:1: ( rule__Calview__Group__0 )
            {
             before(grammarAccess.getCalviewAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:412:1: ( rule__Calview__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:412:2: rule__Calview__Group__0
            {
            pushFollow(FOLLOW_rule__Calview__Group__0_in_ruleCalview813);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:424:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:425:1: ( ruleButton EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:426:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton840);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton847); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:433:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:437:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:438:1: ( ( rule__Button__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:438:1: ( ( rule__Button__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:439:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:440:1: ( rule__Button__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:440:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton873);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:452:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:453:1: ( ruleSymbol EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:454:1: ruleSymbol EOF
            {
             before(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol900);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol907); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:461:1: ruleSymbol : ( ( rule__Symbol__Group__0 ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:465:2: ( ( ( rule__Symbol__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:466:1: ( ( rule__Symbol__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:466:1: ( ( rule__Symbol__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:467:1: ( rule__Symbol__Group__0 )
            {
             before(grammarAccess.getSymbolAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:468:1: ( rule__Symbol__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:468:2: rule__Symbol__Group__0
            {
            pushFollow(FOLLOW_rule__Symbol__Group__0_in_ruleSymbol933);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:480:1: entryRuleSimpleClock : ruleSimpleClock EOF ;
    public final void entryRuleSimpleClock() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:481:1: ( ruleSimpleClock EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:482:1: ruleSimpleClock EOF
            {
             before(grammarAccess.getSimpleClockRule()); 
            pushFollow(FOLLOW_ruleSimpleClock_in_entryRuleSimpleClock960);
            ruleSimpleClock();

            state._fsp--;

             after(grammarAccess.getSimpleClockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleClock967); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:489:1: ruleSimpleClock : ( ( rule__SimpleClock__Group__0 ) ) ;
    public final void ruleSimpleClock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:493:2: ( ( ( rule__SimpleClock__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:494:1: ( ( rule__SimpleClock__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:494:1: ( ( rule__SimpleClock__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:495:1: ( rule__SimpleClock__Group__0 )
            {
             before(grammarAccess.getSimpleClockAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:496:1: ( rule__SimpleClock__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:496:2: rule__SimpleClock__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__0_in_ruleSimpleClock993);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:508:1: entryRuleSimpleChart : ruleSimpleChart EOF ;
    public final void entryRuleSimpleChart() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:509:1: ( ruleSimpleChart EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:510:1: ruleSimpleChart EOF
            {
             before(grammarAccess.getSimpleChartRule()); 
            pushFollow(FOLLOW_ruleSimpleChart_in_entryRuleSimpleChart1020);
            ruleSimpleChart();

            state._fsp--;

             after(grammarAccess.getSimpleChartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleChart1027); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:517:1: ruleSimpleChart : ( ( rule__SimpleChart__Group__0 ) ) ;
    public final void ruleSimpleChart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:521:2: ( ( ( rule__SimpleChart__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:522:1: ( ( rule__SimpleChart__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:522:1: ( ( rule__SimpleChart__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:523:1: ( rule__SimpleChart__Group__0 )
            {
             before(grammarAccess.getSimpleChartAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:524:1: ( rule__SimpleChart__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:524:2: rule__SimpleChart__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__0_in_ruleSimpleChart1053);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:536:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:537:1: ( ruleColor EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:538:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor1080);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor1087); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:545:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:549:2: ( ( ( rule__Color__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:550:1: ( ( rule__Color__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:550:1: ( ( rule__Color__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:551:1: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:552:1: ( rule__Color__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:552:2: rule__Color__Group__0
            {
            pushFollow(FOLLOW_rule__Color__Group__0_in_ruleColor1113);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:564:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:565:1: ( ruleLabel EOF )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:566:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1140);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1147); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:573:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:577:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:578:1: ( ( rule__Label__Group__0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:578:1: ( ( rule__Label__Group__0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:579:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:580:1: ( rule__Label__Group__0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:580:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel1173);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:592:1: rule__SettingsElement__Alternatives : ( ( ruleCSS ) | ( ruleColor ) );
    public final void rule__SettingsElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:596:1: ( ( ruleCSS ) | ( ruleColor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==48) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:597:1: ( ruleCSS )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:597:1: ( ruleCSS )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:598:1: ruleCSS
                    {
                     before(grammarAccess.getSettingsElementAccess().getCSSParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCSS_in_rule__SettingsElement__Alternatives1209);
                    ruleCSS();

                    state._fsp--;

                     after(grammarAccess.getSettingsElementAccess().getCSSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:603:6: ( ruleColor )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:603:6: ( ruleColor )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:604:1: ruleColor
                    {
                     before(grammarAccess.getSettingsElementAccess().getColorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleColor_in_rule__SettingsElement__Alternatives1226);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:614:1: rule__BOOL__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BOOL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:618:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:619:1: ( 'true' )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:619:1: ( 'true' )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:620:1: 'true'
                    {
                     before(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__BOOL__Alternatives1259); 
                     after(grammarAccess.getBOOLAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:627:6: ( 'false' )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:627:6: ( 'false' )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:628:1: 'false'
                    {
                     before(grammarAccess.getBOOLAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__BOOL__Alternatives1279); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:640:1: rule__Widget__Alternatives : ( ( ruleSwitch ) | ( ruleButton ) | ( ruleLabel ) | ( ruleSimpleClock ) | ( ruleSymbol ) | ( ruleCalview ) | ( ruleSimpleChart ) | ( ruleCustom ) | ( ruleDiv ) );
    public final void rule__Widget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:644:1: ( ( ruleSwitch ) | ( ruleButton ) | ( ruleLabel ) | ( ruleSimpleClock ) | ( ruleSymbol ) | ( ruleCalview ) | ( ruleSimpleChart ) | ( ruleCustom ) | ( ruleDiv ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 73:
                {
                alt3=3;
                }
                break;
            case 58:
                {
                alt3=4;
                }
                break;
            case 50:
                {
                alt3=5;
                }
                break;
            case 42:
                {
                alt3=6;
                }
                break;
            case 65:
                {
                alt3=7;
                }
                break;
            case 24:
                {
                alt3=8;
                }
                break;
            case 41:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:645:1: ( ruleSwitch )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:645:1: ( ruleSwitch )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:646:1: ruleSwitch
                    {
                     before(grammarAccess.getWidgetAccess().getSwitchParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSwitch_in_rule__Widget__Alternatives1313);
                    ruleSwitch();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getSwitchParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:651:6: ( ruleButton )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:651:6: ( ruleButton )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:652:1: ruleButton
                    {
                     before(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__Widget__Alternatives1330);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:657:6: ( ruleLabel )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:657:6: ( ruleLabel )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:658:1: ruleLabel
                    {
                     before(grammarAccess.getWidgetAccess().getLabelParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLabel_in_rule__Widget__Alternatives1347);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getLabelParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:663:6: ( ruleSimpleClock )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:663:6: ( ruleSimpleClock )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:664:1: ruleSimpleClock
                    {
                     before(grammarAccess.getWidgetAccess().getSimpleClockParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSimpleClock_in_rule__Widget__Alternatives1364);
                    ruleSimpleClock();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getSimpleClockParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:669:6: ( ruleSymbol )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:669:6: ( ruleSymbol )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:670:1: ruleSymbol
                    {
                     before(grammarAccess.getWidgetAccess().getSymbolParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSymbol_in_rule__Widget__Alternatives1381);
                    ruleSymbol();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getSymbolParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:675:6: ( ruleCalview )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:675:6: ( ruleCalview )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:676:1: ruleCalview
                    {
                     before(grammarAccess.getWidgetAccess().getCalviewParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleCalview_in_rule__Widget__Alternatives1398);
                    ruleCalview();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getCalviewParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:681:6: ( ruleSimpleChart )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:681:6: ( ruleSimpleChart )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:682:1: ruleSimpleChart
                    {
                     before(grammarAccess.getWidgetAccess().getSimpleChartParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSimpleChart_in_rule__Widget__Alternatives1415);
                    ruleSimpleChart();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getSimpleChartParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:687:6: ( ruleCustom )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:687:6: ( ruleCustom )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:688:1: ruleCustom
                    {
                     before(grammarAccess.getWidgetAccess().getCustomParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleCustom_in_rule__Widget__Alternatives1432);
                    ruleCustom();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getCustomParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:693:6: ( ruleDiv )
                    {
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:693:6: ( ruleDiv )
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:694:1: ruleDiv
                    {
                     before(grammarAccess.getWidgetAccess().getDivParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleDiv_in_rule__Widget__Alternatives1449);
                    ruleDiv();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getDivParserRuleCall_8()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:706:1: rule__TabletUI__Group__0 : rule__TabletUI__Group__0__Impl rule__TabletUI__Group__1 ;
    public final void rule__TabletUI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:710:1: ( rule__TabletUI__Group__0__Impl rule__TabletUI__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:711:2: rule__TabletUI__Group__0__Impl rule__TabletUI__Group__1
            {
            pushFollow(FOLLOW_rule__TabletUI__Group__0__Impl_in_rule__TabletUI__Group__01479);
            rule__TabletUI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TabletUI__Group__1_in_rule__TabletUI__Group__01482);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:718:1: rule__TabletUI__Group__0__Impl : ( ( rule__TabletUI__SettingsAssignment_0 ) ) ;
    public final void rule__TabletUI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:722:1: ( ( ( rule__TabletUI__SettingsAssignment_0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:723:1: ( ( rule__TabletUI__SettingsAssignment_0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:723:1: ( ( rule__TabletUI__SettingsAssignment_0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:724:1: ( rule__TabletUI__SettingsAssignment_0 )
            {
             before(grammarAccess.getTabletUIAccess().getSettingsAssignment_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:725:1: ( rule__TabletUI__SettingsAssignment_0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:725:2: rule__TabletUI__SettingsAssignment_0
            {
            pushFollow(FOLLOW_rule__TabletUI__SettingsAssignment_0_in_rule__TabletUI__Group__0__Impl1509);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:735:1: rule__TabletUI__Group__1 : rule__TabletUI__Group__1__Impl ;
    public final void rule__TabletUI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:739:1: ( rule__TabletUI__Group__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:740:2: rule__TabletUI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TabletUI__Group__1__Impl_in_rule__TabletUI__Group__11539);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:746:1: rule__TabletUI__Group__1__Impl : ( ( rule__TabletUI__ElementsAssignment_1 )* ) ;
    public final void rule__TabletUI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:750:1: ( ( ( rule__TabletUI__ElementsAssignment_1 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:751:1: ( ( rule__TabletUI__ElementsAssignment_1 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:751:1: ( ( rule__TabletUI__ElementsAssignment_1 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:752:1: ( rule__TabletUI__ElementsAssignment_1 )*
            {
             before(grammarAccess.getTabletUIAccess().getElementsAssignment_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:753:1: ( rule__TabletUI__ElementsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:753:2: rule__TabletUI__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TabletUI__ElementsAssignment_1_in_rule__TabletUI__Group__1__Impl1566);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:767:1: rule__Settings__Group__0 : rule__Settings__Group__0__Impl rule__Settings__Group__1 ;
    public final void rule__Settings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:771:1: ( rule__Settings__Group__0__Impl rule__Settings__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:772:2: rule__Settings__Group__0__Impl rule__Settings__Group__1
            {
            pushFollow(FOLLOW_rule__Settings__Group__0__Impl_in_rule__Settings__Group__01601);
            rule__Settings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__1_in_rule__Settings__Group__01604);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:779:1: rule__Settings__Group__0__Impl : ( 'settings' ) ;
    public final void rule__Settings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:783:1: ( ( 'settings' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:784:1: ( 'settings' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:784:1: ( 'settings' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:785:1: 'settings'
            {
             before(grammarAccess.getSettingsAccess().getSettingsKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Settings__Group__0__Impl1632); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:798:1: rule__Settings__Group__1 : rule__Settings__Group__1__Impl rule__Settings__Group__2 ;
    public final void rule__Settings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:802:1: ( rule__Settings__Group__1__Impl rule__Settings__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:803:2: rule__Settings__Group__1__Impl rule__Settings__Group__2
            {
            pushFollow(FOLLOW_rule__Settings__Group__1__Impl_in_rule__Settings__Group__11663);
            rule__Settings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__2_in_rule__Settings__Group__11666);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:810:1: rule__Settings__Group__1__Impl : ( 'title' ) ;
    public final void rule__Settings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:814:1: ( ( 'title' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:815:1: ( 'title' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:815:1: ( 'title' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:816:1: 'title'
            {
             before(grammarAccess.getSettingsAccess().getTitleKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Settings__Group__1__Impl1694); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:829:1: rule__Settings__Group__2 : rule__Settings__Group__2__Impl rule__Settings__Group__3 ;
    public final void rule__Settings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:833:1: ( rule__Settings__Group__2__Impl rule__Settings__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:834:2: rule__Settings__Group__2__Impl rule__Settings__Group__3
            {
            pushFollow(FOLLOW_rule__Settings__Group__2__Impl_in_rule__Settings__Group__21725);
            rule__Settings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__3_in_rule__Settings__Group__21728);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:841:1: rule__Settings__Group__2__Impl : ( ( rule__Settings__TitleAssignment_2 ) ) ;
    public final void rule__Settings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:845:1: ( ( ( rule__Settings__TitleAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:846:1: ( ( rule__Settings__TitleAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:846:1: ( ( rule__Settings__TitleAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:847:1: ( rule__Settings__TitleAssignment_2 )
            {
             before(grammarAccess.getSettingsAccess().getTitleAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:848:1: ( rule__Settings__TitleAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:848:2: rule__Settings__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Settings__TitleAssignment_2_in_rule__Settings__Group__2__Impl1755);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:858:1: rule__Settings__Group__3 : rule__Settings__Group__3__Impl rule__Settings__Group__4 ;
    public final void rule__Settings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:862:1: ( rule__Settings__Group__3__Impl rule__Settings__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:863:2: rule__Settings__Group__3__Impl rule__Settings__Group__4
            {
            pushFollow(FOLLOW_rule__Settings__Group__3__Impl_in_rule__Settings__Group__31785);
            rule__Settings__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__4_in_rule__Settings__Group__31788);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:870:1: rule__Settings__Group__3__Impl : ( ( rule__Settings__Group_3__0 )? ) ;
    public final void rule__Settings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:874:1: ( ( ( rule__Settings__Group_3__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:875:1: ( ( rule__Settings__Group_3__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:875:1: ( ( rule__Settings__Group_3__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:876:1: ( rule__Settings__Group_3__0 )?
            {
             before(grammarAccess.getSettingsAccess().getGroup_3()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:877:1: ( rule__Settings__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:877:2: rule__Settings__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Settings__Group_3__0_in_rule__Settings__Group__3__Impl1815);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:887:1: rule__Settings__Group__4 : rule__Settings__Group__4__Impl rule__Settings__Group__5 ;
    public final void rule__Settings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:891:1: ( rule__Settings__Group__4__Impl rule__Settings__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:892:2: rule__Settings__Group__4__Impl rule__Settings__Group__5
            {
            pushFollow(FOLLOW_rule__Settings__Group__4__Impl_in_rule__Settings__Group__41846);
            rule__Settings__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__5_in_rule__Settings__Group__41849);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:899:1: rule__Settings__Group__4__Impl : ( 'width' ) ;
    public final void rule__Settings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:903:1: ( ( 'width' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:904:1: ( 'width' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:904:1: ( 'width' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:905:1: 'width'
            {
             before(grammarAccess.getSettingsAccess().getWidthKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Settings__Group__4__Impl1877); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:918:1: rule__Settings__Group__5 : rule__Settings__Group__5__Impl rule__Settings__Group__6 ;
    public final void rule__Settings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:922:1: ( rule__Settings__Group__5__Impl rule__Settings__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:923:2: rule__Settings__Group__5__Impl rule__Settings__Group__6
            {
            pushFollow(FOLLOW_rule__Settings__Group__5__Impl_in_rule__Settings__Group__51908);
            rule__Settings__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__6_in_rule__Settings__Group__51911);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:930:1: rule__Settings__Group__5__Impl : ( ( rule__Settings__WidthAssignment_5 ) ) ;
    public final void rule__Settings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:934:1: ( ( ( rule__Settings__WidthAssignment_5 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:935:1: ( ( rule__Settings__WidthAssignment_5 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:935:1: ( ( rule__Settings__WidthAssignment_5 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:936:1: ( rule__Settings__WidthAssignment_5 )
            {
             before(grammarAccess.getSettingsAccess().getWidthAssignment_5()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:937:1: ( rule__Settings__WidthAssignment_5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:937:2: rule__Settings__WidthAssignment_5
            {
            pushFollow(FOLLOW_rule__Settings__WidthAssignment_5_in_rule__Settings__Group__5__Impl1938);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:947:1: rule__Settings__Group__6 : rule__Settings__Group__6__Impl rule__Settings__Group__7 ;
    public final void rule__Settings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:951:1: ( rule__Settings__Group__6__Impl rule__Settings__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:952:2: rule__Settings__Group__6__Impl rule__Settings__Group__7
            {
            pushFollow(FOLLOW_rule__Settings__Group__6__Impl_in_rule__Settings__Group__61968);
            rule__Settings__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__7_in_rule__Settings__Group__61971);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:959:1: rule__Settings__Group__6__Impl : ( 'height' ) ;
    public final void rule__Settings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:963:1: ( ( 'height' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:964:1: ( 'height' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:964:1: ( 'height' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:965:1: 'height'
            {
             before(grammarAccess.getSettingsAccess().getHeightKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__Settings__Group__6__Impl1999); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:978:1: rule__Settings__Group__7 : rule__Settings__Group__7__Impl rule__Settings__Group__8 ;
    public final void rule__Settings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:982:1: ( rule__Settings__Group__7__Impl rule__Settings__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:983:2: rule__Settings__Group__7__Impl rule__Settings__Group__8
            {
            pushFollow(FOLLOW_rule__Settings__Group__7__Impl_in_rule__Settings__Group__72030);
            rule__Settings__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__8_in_rule__Settings__Group__72033);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:990:1: rule__Settings__Group__7__Impl : ( ( rule__Settings__HeightAssignment_7 ) ) ;
    public final void rule__Settings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:994:1: ( ( ( rule__Settings__HeightAssignment_7 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:995:1: ( ( rule__Settings__HeightAssignment_7 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:995:1: ( ( rule__Settings__HeightAssignment_7 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:996:1: ( rule__Settings__HeightAssignment_7 )
            {
             before(grammarAccess.getSettingsAccess().getHeightAssignment_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:997:1: ( rule__Settings__HeightAssignment_7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:997:2: rule__Settings__HeightAssignment_7
            {
            pushFollow(FOLLOW_rule__Settings__HeightAssignment_7_in_rule__Settings__Group__7__Impl2060);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1007:1: rule__Settings__Group__8 : rule__Settings__Group__8__Impl rule__Settings__Group__9 ;
    public final void rule__Settings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1011:1: ( rule__Settings__Group__8__Impl rule__Settings__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1012:2: rule__Settings__Group__8__Impl rule__Settings__Group__9
            {
            pushFollow(FOLLOW_rule__Settings__Group__8__Impl_in_rule__Settings__Group__82090);
            rule__Settings__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__9_in_rule__Settings__Group__82093);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1019:1: rule__Settings__Group__8__Impl : ( 'columns' ) ;
    public final void rule__Settings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1023:1: ( ( 'columns' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1024:1: ( 'columns' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1024:1: ( 'columns' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1025:1: 'columns'
            {
             before(grammarAccess.getSettingsAccess().getColumnsKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__Settings__Group__8__Impl2121); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1038:1: rule__Settings__Group__9 : rule__Settings__Group__9__Impl rule__Settings__Group__10 ;
    public final void rule__Settings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1042:1: ( rule__Settings__Group__9__Impl rule__Settings__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1043:2: rule__Settings__Group__9__Impl rule__Settings__Group__10
            {
            pushFollow(FOLLOW_rule__Settings__Group__9__Impl_in_rule__Settings__Group__92152);
            rule__Settings__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__10_in_rule__Settings__Group__92155);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1050:1: rule__Settings__Group__9__Impl : ( ( rule__Settings__ColumnsAssignment_9 ) ) ;
    public final void rule__Settings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1054:1: ( ( ( rule__Settings__ColumnsAssignment_9 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1055:1: ( ( rule__Settings__ColumnsAssignment_9 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1055:1: ( ( rule__Settings__ColumnsAssignment_9 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1056:1: ( rule__Settings__ColumnsAssignment_9 )
            {
             before(grammarAccess.getSettingsAccess().getColumnsAssignment_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1057:1: ( rule__Settings__ColumnsAssignment_9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1057:2: rule__Settings__ColumnsAssignment_9
            {
            pushFollow(FOLLOW_rule__Settings__ColumnsAssignment_9_in_rule__Settings__Group__9__Impl2182);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1067:1: rule__Settings__Group__10 : rule__Settings__Group__10__Impl rule__Settings__Group__11 ;
    public final void rule__Settings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1071:1: ( rule__Settings__Group__10__Impl rule__Settings__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1072:2: rule__Settings__Group__10__Impl rule__Settings__Group__11
            {
            pushFollow(FOLLOW_rule__Settings__Group__10__Impl_in_rule__Settings__Group__102212);
            rule__Settings__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__11_in_rule__Settings__Group__102215);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1079:1: rule__Settings__Group__10__Impl : ( 'rows' ) ;
    public final void rule__Settings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1083:1: ( ( 'rows' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1084:1: ( 'rows' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1084:1: ( 'rows' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1085:1: 'rows'
            {
             before(grammarAccess.getSettingsAccess().getRowsKeyword_10()); 
            match(input,18,FOLLOW_18_in_rule__Settings__Group__10__Impl2243); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1098:1: rule__Settings__Group__11 : rule__Settings__Group__11__Impl rule__Settings__Group__12 ;
    public final void rule__Settings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1102:1: ( rule__Settings__Group__11__Impl rule__Settings__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1103:2: rule__Settings__Group__11__Impl rule__Settings__Group__12
            {
            pushFollow(FOLLOW_rule__Settings__Group__11__Impl_in_rule__Settings__Group__112274);
            rule__Settings__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__12_in_rule__Settings__Group__112277);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1110:1: rule__Settings__Group__11__Impl : ( ( rule__Settings__RowsAssignment_11 ) ) ;
    public final void rule__Settings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1114:1: ( ( ( rule__Settings__RowsAssignment_11 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1115:1: ( ( rule__Settings__RowsAssignment_11 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1115:1: ( ( rule__Settings__RowsAssignment_11 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1116:1: ( rule__Settings__RowsAssignment_11 )
            {
             before(grammarAccess.getSettingsAccess().getRowsAssignment_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1117:1: ( rule__Settings__RowsAssignment_11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1117:2: rule__Settings__RowsAssignment_11
            {
            pushFollow(FOLLOW_rule__Settings__RowsAssignment_11_in_rule__Settings__Group__11__Impl2304);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1127:1: rule__Settings__Group__12 : rule__Settings__Group__12__Impl rule__Settings__Group__13 ;
    public final void rule__Settings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1131:1: ( rule__Settings__Group__12__Impl rule__Settings__Group__13 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1132:2: rule__Settings__Group__12__Impl rule__Settings__Group__13
            {
            pushFollow(FOLLOW_rule__Settings__Group__12__Impl_in_rule__Settings__Group__122334);
            rule__Settings__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__13_in_rule__Settings__Group__122337);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1139:1: rule__Settings__Group__12__Impl : ( ( rule__Settings__Group_12__0 )? ) ;
    public final void rule__Settings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1143:1: ( ( ( rule__Settings__Group_12__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1144:1: ( ( rule__Settings__Group_12__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1144:1: ( ( rule__Settings__Group_12__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1145:1: ( rule__Settings__Group_12__0 )?
            {
             before(grammarAccess.getSettingsAccess().getGroup_12()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1146:1: ( rule__Settings__Group_12__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1146:2: rule__Settings__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Settings__Group_12__0_in_rule__Settings__Group__12__Impl2364);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1156:1: rule__Settings__Group__13 : rule__Settings__Group__13__Impl rule__Settings__Group__14 ;
    public final void rule__Settings__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1160:1: ( rule__Settings__Group__13__Impl rule__Settings__Group__14 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1161:2: rule__Settings__Group__13__Impl rule__Settings__Group__14
            {
            pushFollow(FOLLOW_rule__Settings__Group__13__Impl_in_rule__Settings__Group__132395);
            rule__Settings__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__14_in_rule__Settings__Group__132398);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1168:1: rule__Settings__Group__13__Impl : ( 'drag&drop' ) ;
    public final void rule__Settings__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1172:1: ( ( 'drag&drop' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1173:1: ( 'drag&drop' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1173:1: ( 'drag&drop' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1174:1: 'drag&drop'
            {
             before(grammarAccess.getSettingsAccess().getDragDropKeyword_13()); 
            match(input,19,FOLLOW_19_in_rule__Settings__Group__13__Impl2426); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1187:1: rule__Settings__Group__14 : rule__Settings__Group__14__Impl rule__Settings__Group__15 ;
    public final void rule__Settings__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1191:1: ( rule__Settings__Group__14__Impl rule__Settings__Group__15 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1192:2: rule__Settings__Group__14__Impl rule__Settings__Group__15
            {
            pushFollow(FOLLOW_rule__Settings__Group__14__Impl_in_rule__Settings__Group__142457);
            rule__Settings__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__15_in_rule__Settings__Group__142460);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1199:1: rule__Settings__Group__14__Impl : ( ( rule__Settings__DragdropAssignment_14 ) ) ;
    public final void rule__Settings__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1203:1: ( ( ( rule__Settings__DragdropAssignment_14 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1204:1: ( ( rule__Settings__DragdropAssignment_14 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1204:1: ( ( rule__Settings__DragdropAssignment_14 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1205:1: ( rule__Settings__DragdropAssignment_14 )
            {
             before(grammarAccess.getSettingsAccess().getDragdropAssignment_14()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1206:1: ( rule__Settings__DragdropAssignment_14 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1206:2: rule__Settings__DragdropAssignment_14
            {
            pushFollow(FOLLOW_rule__Settings__DragdropAssignment_14_in_rule__Settings__Group__14__Impl2487);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1216:1: rule__Settings__Group__15 : rule__Settings__Group__15__Impl rule__Settings__Group__16 ;
    public final void rule__Settings__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1220:1: ( rule__Settings__Group__15__Impl rule__Settings__Group__16 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1221:2: rule__Settings__Group__15__Impl rule__Settings__Group__16
            {
            pushFollow(FOLLOW_rule__Settings__Group__15__Impl_in_rule__Settings__Group__152517);
            rule__Settings__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__16_in_rule__Settings__Group__152520);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1228:1: rule__Settings__Group__15__Impl : ( 'gridster_margin' ) ;
    public final void rule__Settings__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1232:1: ( ( 'gridster_margin' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1233:1: ( 'gridster_margin' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1233:1: ( 'gridster_margin' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1234:1: 'gridster_margin'
            {
             before(grammarAccess.getSettingsAccess().getGridster_marginKeyword_15()); 
            match(input,20,FOLLOW_20_in_rule__Settings__Group__15__Impl2548); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1247:1: rule__Settings__Group__16 : rule__Settings__Group__16__Impl rule__Settings__Group__17 ;
    public final void rule__Settings__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1251:1: ( rule__Settings__Group__16__Impl rule__Settings__Group__17 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1252:2: rule__Settings__Group__16__Impl rule__Settings__Group__17
            {
            pushFollow(FOLLOW_rule__Settings__Group__16__Impl_in_rule__Settings__Group__162579);
            rule__Settings__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group__17_in_rule__Settings__Group__162582);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1259:1: rule__Settings__Group__16__Impl : ( ( rule__Settings__MarginAssignment_16 ) ) ;
    public final void rule__Settings__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1263:1: ( ( ( rule__Settings__MarginAssignment_16 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1264:1: ( ( rule__Settings__MarginAssignment_16 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1264:1: ( ( rule__Settings__MarginAssignment_16 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1265:1: ( rule__Settings__MarginAssignment_16 )
            {
             before(grammarAccess.getSettingsAccess().getMarginAssignment_16()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1266:1: ( rule__Settings__MarginAssignment_16 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1266:2: rule__Settings__MarginAssignment_16
            {
            pushFollow(FOLLOW_rule__Settings__MarginAssignment_16_in_rule__Settings__Group__16__Impl2609);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1276:1: rule__Settings__Group__17 : rule__Settings__Group__17__Impl ;
    public final void rule__Settings__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1280:1: ( rule__Settings__Group__17__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1281:2: rule__Settings__Group__17__Impl
            {
            pushFollow(FOLLOW_rule__Settings__Group__17__Impl_in_rule__Settings__Group__172639);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1287:1: rule__Settings__Group__17__Impl : ( ( rule__Settings__SettingsAssignment_17 )* ) ;
    public final void rule__Settings__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1291:1: ( ( ( rule__Settings__SettingsAssignment_17 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1292:1: ( ( rule__Settings__SettingsAssignment_17 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1292:1: ( ( rule__Settings__SettingsAssignment_17 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1293:1: ( rule__Settings__SettingsAssignment_17 )*
            {
             before(grammarAccess.getSettingsAccess().getSettingsAssignment_17()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1294:1: ( rule__Settings__SettingsAssignment_17 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||LA7_0==48) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1294:2: rule__Settings__SettingsAssignment_17
            	    {
            	    pushFollow(FOLLOW_rule__Settings__SettingsAssignment_17_in_rule__Settings__Group__17__Impl2666);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1340:1: rule__Settings__Group_3__0 : rule__Settings__Group_3__0__Impl rule__Settings__Group_3__1 ;
    public final void rule__Settings__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1344:1: ( rule__Settings__Group_3__0__Impl rule__Settings__Group_3__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1345:2: rule__Settings__Group_3__0__Impl rule__Settings__Group_3__1
            {
            pushFollow(FOLLOW_rule__Settings__Group_3__0__Impl_in_rule__Settings__Group_3__02733);
            rule__Settings__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group_3__1_in_rule__Settings__Group_3__02736);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1352:1: rule__Settings__Group_3__0__Impl : ( 'fhemweb_url' ) ;
    public final void rule__Settings__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1356:1: ( ( 'fhemweb_url' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1357:1: ( 'fhemweb_url' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1357:1: ( 'fhemweb_url' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1358:1: 'fhemweb_url'
            {
             before(grammarAccess.getSettingsAccess().getFhemweb_urlKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Settings__Group_3__0__Impl2764); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1371:1: rule__Settings__Group_3__1 : rule__Settings__Group_3__1__Impl ;
    public final void rule__Settings__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1375:1: ( rule__Settings__Group_3__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1376:2: rule__Settings__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Settings__Group_3__1__Impl_in_rule__Settings__Group_3__12795);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1382:1: rule__Settings__Group_3__1__Impl : ( ( rule__Settings__Fhemweb_urlAssignment_3_1 ) ) ;
    public final void rule__Settings__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1386:1: ( ( ( rule__Settings__Fhemweb_urlAssignment_3_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1387:1: ( ( rule__Settings__Fhemweb_urlAssignment_3_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1387:1: ( ( rule__Settings__Fhemweb_urlAssignment_3_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1388:1: ( rule__Settings__Fhemweb_urlAssignment_3_1 )
            {
             before(grammarAccess.getSettingsAccess().getFhemweb_urlAssignment_3_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1389:1: ( rule__Settings__Fhemweb_urlAssignment_3_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1389:2: rule__Settings__Fhemweb_urlAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Settings__Fhemweb_urlAssignment_3_1_in_rule__Settings__Group_3__1__Impl2822);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1403:1: rule__Settings__Group_12__0 : rule__Settings__Group_12__0__Impl rule__Settings__Group_12__1 ;
    public final void rule__Settings__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1407:1: ( rule__Settings__Group_12__0__Impl rule__Settings__Group_12__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1408:2: rule__Settings__Group_12__0__Impl rule__Settings__Group_12__1
            {
            pushFollow(FOLLOW_rule__Settings__Group_12__0__Impl_in_rule__Settings__Group_12__02856);
            rule__Settings__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Settings__Group_12__1_in_rule__Settings__Group_12__02859);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1415:1: rule__Settings__Group_12__0__Impl : ( 'debug' ) ;
    public final void rule__Settings__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1419:1: ( ( 'debug' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1420:1: ( 'debug' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1420:1: ( 'debug' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1421:1: 'debug'
            {
             before(grammarAccess.getSettingsAccess().getDebugKeyword_12_0()); 
            match(input,22,FOLLOW_22_in_rule__Settings__Group_12__0__Impl2887); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1434:1: rule__Settings__Group_12__1 : rule__Settings__Group_12__1__Impl ;
    public final void rule__Settings__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1438:1: ( rule__Settings__Group_12__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1439:2: rule__Settings__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Settings__Group_12__1__Impl_in_rule__Settings__Group_12__12918);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1445:1: rule__Settings__Group_12__1__Impl : ( ( rule__Settings__DebugAssignment_12_1 ) ) ;
    public final void rule__Settings__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1449:1: ( ( ( rule__Settings__DebugAssignment_12_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1450:1: ( ( rule__Settings__DebugAssignment_12_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1450:1: ( ( rule__Settings__DebugAssignment_12_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1451:1: ( rule__Settings__DebugAssignment_12_1 )
            {
             before(grammarAccess.getSettingsAccess().getDebugAssignment_12_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1452:1: ( rule__Settings__DebugAssignment_12_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1452:2: rule__Settings__DebugAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Settings__DebugAssignment_12_1_in_rule__Settings__Group_12__1__Impl2945);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1466:1: rule__CSS__Group__0 : rule__CSS__Group__0__Impl rule__CSS__Group__1 ;
    public final void rule__CSS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1470:1: ( rule__CSS__Group__0__Impl rule__CSS__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1471:2: rule__CSS__Group__0__Impl rule__CSS__Group__1
            {
            pushFollow(FOLLOW_rule__CSS__Group__0__Impl_in_rule__CSS__Group__02979);
            rule__CSS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CSS__Group__1_in_rule__CSS__Group__02982);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1478:1: rule__CSS__Group__0__Impl : ( 'css' ) ;
    public final void rule__CSS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1482:1: ( ( 'css' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1483:1: ( 'css' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1483:1: ( 'css' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1484:1: 'css'
            {
             before(grammarAccess.getCSSAccess().getCssKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__CSS__Group__0__Impl3010); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1497:1: rule__CSS__Group__1 : rule__CSS__Group__1__Impl ;
    public final void rule__CSS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1501:1: ( rule__CSS__Group__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1502:2: rule__CSS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSS__Group__1__Impl_in_rule__CSS__Group__13041);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1508:1: rule__CSS__Group__1__Impl : ( ( rule__CSS__PathAssignment_1 ) ) ;
    public final void rule__CSS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1512:1: ( ( ( rule__CSS__PathAssignment_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1513:1: ( ( rule__CSS__PathAssignment_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1513:1: ( ( rule__CSS__PathAssignment_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1514:1: ( rule__CSS__PathAssignment_1 )
            {
             before(grammarAccess.getCSSAccess().getPathAssignment_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1515:1: ( rule__CSS__PathAssignment_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1515:2: rule__CSS__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__CSS__PathAssignment_1_in_rule__CSS__Group__1__Impl3068);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1529:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1533:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1534:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__03102);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__03105);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1541:1: rule__Page__Group__0__Impl : ( ( rule__Page__NameAssignment_0 ) ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1545:1: ( ( ( rule__Page__NameAssignment_0 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1546:1: ( ( rule__Page__NameAssignment_0 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1546:1: ( ( rule__Page__NameAssignment_0 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1547:1: ( rule__Page__NameAssignment_0 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1548:1: ( rule__Page__NameAssignment_0 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1548:2: rule__Page__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_0_in_rule__Page__Group__0__Impl3132);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1558:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1562:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1563:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__13162);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__13165);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1570:1: rule__Page__Group__1__Impl : ( '{' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1574:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1575:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1575:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1576:1: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Page__Group__1__Impl3193); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1589:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1593:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1594:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__23224);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__23227);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1601:1: rule__Page__Group__2__Impl : ( ( rule__Page__ElementsAssignment_2 )* ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1605:1: ( ( ( rule__Page__ElementsAssignment_2 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1606:1: ( ( rule__Page__ElementsAssignment_2 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1606:1: ( ( rule__Page__ElementsAssignment_2 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1607:1: ( rule__Page__ElementsAssignment_2 )*
            {
             before(grammarAccess.getPageAccess().getElementsAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1608:1: ( rule__Page__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1608:2: rule__Page__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Page__ElementsAssignment_2_in_rule__Page__Group__2__Impl3254);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1618:1: rule__Page__Group__3 : rule__Page__Group__3__Impl ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1622:1: ( rule__Page__Group__3__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1623:2: rule__Page__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__33285);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1629:1: rule__Page__Group__3__Impl : ( '}' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1633:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1634:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1634:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1635:1: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Page__Group__3__Impl3313); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1656:1: rule__Gridster__Group__0 : rule__Gridster__Group__0__Impl rule__Gridster__Group__1 ;
    public final void rule__Gridster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1660:1: ( rule__Gridster__Group__0__Impl rule__Gridster__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1661:2: rule__Gridster__Group__0__Impl rule__Gridster__Group__1
            {
            pushFollow(FOLLOW_rule__Gridster__Group__0__Impl_in_rule__Gridster__Group__03352);
            rule__Gridster__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__1_in_rule__Gridster__Group__03355);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1668:1: rule__Gridster__Group__0__Impl : ( '{' ) ;
    public final void rule__Gridster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1672:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1673:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1673:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1674:1: '{'
            {
             before(grammarAccess.getGridsterAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Gridster__Group__0__Impl3383); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1687:1: rule__Gridster__Group__1 : rule__Gridster__Group__1__Impl rule__Gridster__Group__2 ;
    public final void rule__Gridster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1691:1: ( rule__Gridster__Group__1__Impl rule__Gridster__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1692:2: rule__Gridster__Group__1__Impl rule__Gridster__Group__2
            {
            pushFollow(FOLLOW_rule__Gridster__Group__1__Impl_in_rule__Gridster__Group__13414);
            rule__Gridster__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__2_in_rule__Gridster__Group__13417);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1699:1: rule__Gridster__Group__1__Impl : ( ( rule__Gridster__Group_1__0 )? ) ;
    public final void rule__Gridster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1703:1: ( ( ( rule__Gridster__Group_1__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1704:1: ( ( rule__Gridster__Group_1__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1704:1: ( ( rule__Gridster__Group_1__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1705:1: ( rule__Gridster__Group_1__0 )?
            {
             before(grammarAccess.getGridsterAccess().getGroup_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1706:1: ( rule__Gridster__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1706:2: rule__Gridster__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Gridster__Group_1__0_in_rule__Gridster__Group__1__Impl3444);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1716:1: rule__Gridster__Group__2 : rule__Gridster__Group__2__Impl rule__Gridster__Group__3 ;
    public final void rule__Gridster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1720:1: ( rule__Gridster__Group__2__Impl rule__Gridster__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1721:2: rule__Gridster__Group__2__Impl rule__Gridster__Group__3
            {
            pushFollow(FOLLOW_rule__Gridster__Group__2__Impl_in_rule__Gridster__Group__23475);
            rule__Gridster__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__3_in_rule__Gridster__Group__23478);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1728:1: rule__Gridster__Group__2__Impl : ( 'row' ) ;
    public final void rule__Gridster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1732:1: ( ( 'row' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1733:1: ( 'row' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1733:1: ( 'row' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1734:1: 'row'
            {
             before(grammarAccess.getGridsterAccess().getRowKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Gridster__Group__2__Impl3506); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1747:1: rule__Gridster__Group__3 : rule__Gridster__Group__3__Impl rule__Gridster__Group__4 ;
    public final void rule__Gridster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1751:1: ( rule__Gridster__Group__3__Impl rule__Gridster__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1752:2: rule__Gridster__Group__3__Impl rule__Gridster__Group__4
            {
            pushFollow(FOLLOW_rule__Gridster__Group__3__Impl_in_rule__Gridster__Group__33537);
            rule__Gridster__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__4_in_rule__Gridster__Group__33540);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1759:1: rule__Gridster__Group__3__Impl : ( ( rule__Gridster__RowAssignment_3 ) ) ;
    public final void rule__Gridster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1763:1: ( ( ( rule__Gridster__RowAssignment_3 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1764:1: ( ( rule__Gridster__RowAssignment_3 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1764:1: ( ( rule__Gridster__RowAssignment_3 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1765:1: ( rule__Gridster__RowAssignment_3 )
            {
             before(grammarAccess.getGridsterAccess().getRowAssignment_3()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1766:1: ( rule__Gridster__RowAssignment_3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1766:2: rule__Gridster__RowAssignment_3
            {
            pushFollow(FOLLOW_rule__Gridster__RowAssignment_3_in_rule__Gridster__Group__3__Impl3567);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1776:1: rule__Gridster__Group__4 : rule__Gridster__Group__4__Impl rule__Gridster__Group__5 ;
    public final void rule__Gridster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1780:1: ( rule__Gridster__Group__4__Impl rule__Gridster__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1781:2: rule__Gridster__Group__4__Impl rule__Gridster__Group__5
            {
            pushFollow(FOLLOW_rule__Gridster__Group__4__Impl_in_rule__Gridster__Group__43597);
            rule__Gridster__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__5_in_rule__Gridster__Group__43600);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1788:1: rule__Gridster__Group__4__Impl : ( 'column' ) ;
    public final void rule__Gridster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1792:1: ( ( 'column' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1793:1: ( 'column' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1793:1: ( 'column' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1794:1: 'column'
            {
             before(grammarAccess.getGridsterAccess().getColumnKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Gridster__Group__4__Impl3628); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1807:1: rule__Gridster__Group__5 : rule__Gridster__Group__5__Impl rule__Gridster__Group__6 ;
    public final void rule__Gridster__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1811:1: ( rule__Gridster__Group__5__Impl rule__Gridster__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1812:2: rule__Gridster__Group__5__Impl rule__Gridster__Group__6
            {
            pushFollow(FOLLOW_rule__Gridster__Group__5__Impl_in_rule__Gridster__Group__53659);
            rule__Gridster__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__6_in_rule__Gridster__Group__53662);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1819:1: rule__Gridster__Group__5__Impl : ( ( rule__Gridster__ColumnAssignment_5 ) ) ;
    public final void rule__Gridster__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1823:1: ( ( ( rule__Gridster__ColumnAssignment_5 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1824:1: ( ( rule__Gridster__ColumnAssignment_5 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1824:1: ( ( rule__Gridster__ColumnAssignment_5 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1825:1: ( rule__Gridster__ColumnAssignment_5 )
            {
             before(grammarAccess.getGridsterAccess().getColumnAssignment_5()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1826:1: ( rule__Gridster__ColumnAssignment_5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1826:2: rule__Gridster__ColumnAssignment_5
            {
            pushFollow(FOLLOW_rule__Gridster__ColumnAssignment_5_in_rule__Gridster__Group__5__Impl3689);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1836:1: rule__Gridster__Group__6 : rule__Gridster__Group__6__Impl rule__Gridster__Group__7 ;
    public final void rule__Gridster__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1840:1: ( rule__Gridster__Group__6__Impl rule__Gridster__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1841:2: rule__Gridster__Group__6__Impl rule__Gridster__Group__7
            {
            pushFollow(FOLLOW_rule__Gridster__Group__6__Impl_in_rule__Gridster__Group__63719);
            rule__Gridster__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__7_in_rule__Gridster__Group__63722);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1848:1: rule__Gridster__Group__6__Impl : ( ( rule__Gridster__Group_6__0 )? ) ;
    public final void rule__Gridster__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1852:1: ( ( ( rule__Gridster__Group_6__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1853:1: ( ( rule__Gridster__Group_6__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1853:1: ( ( rule__Gridster__Group_6__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1854:1: ( rule__Gridster__Group_6__0 )?
            {
             before(grammarAccess.getGridsterAccess().getGroup_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1855:1: ( rule__Gridster__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1855:2: rule__Gridster__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Gridster__Group_6__0_in_rule__Gridster__Group__6__Impl3749);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1865:1: rule__Gridster__Group__7 : rule__Gridster__Group__7__Impl rule__Gridster__Group__8 ;
    public final void rule__Gridster__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1869:1: ( rule__Gridster__Group__7__Impl rule__Gridster__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1870:2: rule__Gridster__Group__7__Impl rule__Gridster__Group__8
            {
            pushFollow(FOLLOW_rule__Gridster__Group__7__Impl_in_rule__Gridster__Group__73780);
            rule__Gridster__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__8_in_rule__Gridster__Group__73783);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1877:1: rule__Gridster__Group__7__Impl : ( ( rule__Gridster__Group_7__0 )? ) ;
    public final void rule__Gridster__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1881:1: ( ( ( rule__Gridster__Group_7__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1882:1: ( ( rule__Gridster__Group_7__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1882:1: ( ( rule__Gridster__Group_7__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1883:1: ( rule__Gridster__Group_7__0 )?
            {
             before(grammarAccess.getGridsterAccess().getGroup_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1884:1: ( rule__Gridster__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1884:2: rule__Gridster__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Gridster__Group_7__0_in_rule__Gridster__Group__7__Impl3810);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1894:1: rule__Gridster__Group__8 : rule__Gridster__Group__8__Impl rule__Gridster__Group__9 ;
    public final void rule__Gridster__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1898:1: ( rule__Gridster__Group__8__Impl rule__Gridster__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1899:2: rule__Gridster__Group__8__Impl rule__Gridster__Group__9
            {
            pushFollow(FOLLOW_rule__Gridster__Group__8__Impl_in_rule__Gridster__Group__83841);
            rule__Gridster__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__9_in_rule__Gridster__Group__83844);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1906:1: rule__Gridster__Group__8__Impl : ( ( rule__Gridster__ColorsAssignment_8 )* ) ;
    public final void rule__Gridster__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1910:1: ( ( ( rule__Gridster__ColorsAssignment_8 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1911:1: ( ( rule__Gridster__ColorsAssignment_8 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1911:1: ( ( rule__Gridster__ColorsAssignment_8 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1912:1: ( rule__Gridster__ColorsAssignment_8 )*
            {
             before(grammarAccess.getGridsterAccess().getColorsAssignment_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1913:1: ( rule__Gridster__ColorsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==48) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1913:2: rule__Gridster__ColorsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__Gridster__ColorsAssignment_8_in_rule__Gridster__Group__8__Impl3871);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1923:1: rule__Gridster__Group__9 : rule__Gridster__Group__9__Impl rule__Gridster__Group__10 ;
    public final void rule__Gridster__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1927:1: ( rule__Gridster__Group__9__Impl rule__Gridster__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1928:2: rule__Gridster__Group__9__Impl rule__Gridster__Group__10
            {
            pushFollow(FOLLOW_rule__Gridster__Group__9__Impl_in_rule__Gridster__Group__93902);
            rule__Gridster__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group__10_in_rule__Gridster__Group__93905);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1935:1: rule__Gridster__Group__9__Impl : ( ( rule__Gridster__WidgetsAssignment_9 )* ) ;
    public final void rule__Gridster__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1939:1: ( ( ( rule__Gridster__WidgetsAssignment_9 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1940:1: ( ( rule__Gridster__WidgetsAssignment_9 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1940:1: ( ( rule__Gridster__WidgetsAssignment_9 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1941:1: ( rule__Gridster__WidgetsAssignment_9 )*
            {
             before(grammarAccess.getGridsterAccess().getWidgetsAssignment_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1942:1: ( rule__Gridster__WidgetsAssignment_9 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24||LA13_0==31||(LA13_0>=41 && LA13_0<=42)||LA13_0==46||LA13_0==50||LA13_0==58||LA13_0==65||LA13_0==73) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1942:2: rule__Gridster__WidgetsAssignment_9
            	    {
            	    pushFollow(FOLLOW_rule__Gridster__WidgetsAssignment_9_in_rule__Gridster__Group__9__Impl3932);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1952:1: rule__Gridster__Group__10 : rule__Gridster__Group__10__Impl ;
    public final void rule__Gridster__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1956:1: ( rule__Gridster__Group__10__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1957:2: rule__Gridster__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Gridster__Group__10__Impl_in_rule__Gridster__Group__103963);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1963:1: rule__Gridster__Group__10__Impl : ( '}' ) ;
    public final void rule__Gridster__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1967:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1968:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1968:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:1969:1: '}'
            {
             before(grammarAccess.getGridsterAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_25_in_rule__Gridster__Group__10__Impl3991); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2004:1: rule__Gridster__Group_1__0 : rule__Gridster__Group_1__0__Impl rule__Gridster__Group_1__1 ;
    public final void rule__Gridster__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2008:1: ( rule__Gridster__Group_1__0__Impl rule__Gridster__Group_1__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2009:2: rule__Gridster__Group_1__0__Impl rule__Gridster__Group_1__1
            {
            pushFollow(FOLLOW_rule__Gridster__Group_1__0__Impl_in_rule__Gridster__Group_1__04044);
            rule__Gridster__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group_1__1_in_rule__Gridster__Group_1__04047);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2016:1: rule__Gridster__Group_1__0__Impl : ( 'header' ) ;
    public final void rule__Gridster__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2020:1: ( ( 'header' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2021:1: ( 'header' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2021:1: ( 'header' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2022:1: 'header'
            {
             before(grammarAccess.getGridsterAccess().getHeaderKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Gridster__Group_1__0__Impl4075); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2035:1: rule__Gridster__Group_1__1 : rule__Gridster__Group_1__1__Impl ;
    public final void rule__Gridster__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2039:1: ( rule__Gridster__Group_1__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2040:2: rule__Gridster__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Gridster__Group_1__1__Impl_in_rule__Gridster__Group_1__14106);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2046:1: rule__Gridster__Group_1__1__Impl : ( ( rule__Gridster__HeaderAssignment_1_1 ) ) ;
    public final void rule__Gridster__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2050:1: ( ( ( rule__Gridster__HeaderAssignment_1_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2051:1: ( ( rule__Gridster__HeaderAssignment_1_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2051:1: ( ( rule__Gridster__HeaderAssignment_1_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2052:1: ( rule__Gridster__HeaderAssignment_1_1 )
            {
             before(grammarAccess.getGridsterAccess().getHeaderAssignment_1_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2053:1: ( rule__Gridster__HeaderAssignment_1_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2053:2: rule__Gridster__HeaderAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Gridster__HeaderAssignment_1_1_in_rule__Gridster__Group_1__1__Impl4133);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2067:1: rule__Gridster__Group_6__0 : rule__Gridster__Group_6__0__Impl rule__Gridster__Group_6__1 ;
    public final void rule__Gridster__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2071:1: ( rule__Gridster__Group_6__0__Impl rule__Gridster__Group_6__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2072:2: rule__Gridster__Group_6__0__Impl rule__Gridster__Group_6__1
            {
            pushFollow(FOLLOW_rule__Gridster__Group_6__0__Impl_in_rule__Gridster__Group_6__04167);
            rule__Gridster__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group_6__1_in_rule__Gridster__Group_6__04170);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2079:1: rule__Gridster__Group_6__0__Impl : ( 'colspan' ) ;
    public final void rule__Gridster__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2083:1: ( ( 'colspan' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2084:1: ( 'colspan' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2084:1: ( 'colspan' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2085:1: 'colspan'
            {
             before(grammarAccess.getGridsterAccess().getColspanKeyword_6_0()); 
            match(input,29,FOLLOW_29_in_rule__Gridster__Group_6__0__Impl4198); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2098:1: rule__Gridster__Group_6__1 : rule__Gridster__Group_6__1__Impl ;
    public final void rule__Gridster__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2102:1: ( rule__Gridster__Group_6__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2103:2: rule__Gridster__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Gridster__Group_6__1__Impl_in_rule__Gridster__Group_6__14229);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2109:1: rule__Gridster__Group_6__1__Impl : ( ( rule__Gridster__ColspanAssignment_6_1 ) ) ;
    public final void rule__Gridster__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2113:1: ( ( ( rule__Gridster__ColspanAssignment_6_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2114:1: ( ( rule__Gridster__ColspanAssignment_6_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2114:1: ( ( rule__Gridster__ColspanAssignment_6_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2115:1: ( rule__Gridster__ColspanAssignment_6_1 )
            {
             before(grammarAccess.getGridsterAccess().getColspanAssignment_6_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2116:1: ( rule__Gridster__ColspanAssignment_6_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2116:2: rule__Gridster__ColspanAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Gridster__ColspanAssignment_6_1_in_rule__Gridster__Group_6__1__Impl4256);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2130:1: rule__Gridster__Group_7__0 : rule__Gridster__Group_7__0__Impl rule__Gridster__Group_7__1 ;
    public final void rule__Gridster__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2134:1: ( rule__Gridster__Group_7__0__Impl rule__Gridster__Group_7__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2135:2: rule__Gridster__Group_7__0__Impl rule__Gridster__Group_7__1
            {
            pushFollow(FOLLOW_rule__Gridster__Group_7__0__Impl_in_rule__Gridster__Group_7__04290);
            rule__Gridster__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gridster__Group_7__1_in_rule__Gridster__Group_7__04293);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2142:1: rule__Gridster__Group_7__0__Impl : ( 'rowspan' ) ;
    public final void rule__Gridster__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2146:1: ( ( 'rowspan' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2147:1: ( 'rowspan' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2147:1: ( 'rowspan' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2148:1: 'rowspan'
            {
             before(grammarAccess.getGridsterAccess().getRowspanKeyword_7_0()); 
            match(input,30,FOLLOW_30_in_rule__Gridster__Group_7__0__Impl4321); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2161:1: rule__Gridster__Group_7__1 : rule__Gridster__Group_7__1__Impl ;
    public final void rule__Gridster__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2165:1: ( rule__Gridster__Group_7__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2166:2: rule__Gridster__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Gridster__Group_7__1__Impl_in_rule__Gridster__Group_7__14352);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2172:1: rule__Gridster__Group_7__1__Impl : ( ( rule__Gridster__RowspanAssignment_7_1 ) ) ;
    public final void rule__Gridster__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2176:1: ( ( ( rule__Gridster__RowspanAssignment_7_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2177:1: ( ( rule__Gridster__RowspanAssignment_7_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2177:1: ( ( rule__Gridster__RowspanAssignment_7_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2178:1: ( rule__Gridster__RowspanAssignment_7_1 )
            {
             before(grammarAccess.getGridsterAccess().getRowspanAssignment_7_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2179:1: ( rule__Gridster__RowspanAssignment_7_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2179:2: rule__Gridster__RowspanAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Gridster__RowspanAssignment_7_1_in_rule__Gridster__Group_7__1__Impl4379);
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


    // $ANTLR start "rule__Switch__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2193:1: rule__Switch__Group__0 : rule__Switch__Group__0__Impl rule__Switch__Group__1 ;
    public final void rule__Switch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2197:1: ( rule__Switch__Group__0__Impl rule__Switch__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2198:2: rule__Switch__Group__0__Impl rule__Switch__Group__1
            {
            pushFollow(FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__04413);
            rule__Switch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__04416);
            rule__Switch__Group__1();

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
    // $ANTLR end "rule__Switch__Group__0"


    // $ANTLR start "rule__Switch__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2205:1: rule__Switch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__Switch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2209:1: ( ( 'switch' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2210:1: ( 'switch' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2210:1: ( 'switch' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2211:1: 'switch'
            {
             before(grammarAccess.getSwitchAccess().getSwitchKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Switch__Group__0__Impl4444); 
             after(grammarAccess.getSwitchAccess().getSwitchKeyword_0()); 

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
    // $ANTLR end "rule__Switch__Group__0__Impl"


    // $ANTLR start "rule__Switch__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2224:1: rule__Switch__Group__1 : rule__Switch__Group__1__Impl rule__Switch__Group__2 ;
    public final void rule__Switch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2228:1: ( rule__Switch__Group__1__Impl rule__Switch__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2229:2: rule__Switch__Group__1__Impl rule__Switch__Group__2
            {
            pushFollow(FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__14475);
            rule__Switch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__14478);
            rule__Switch__Group__2();

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
    // $ANTLR end "rule__Switch__Group__1"


    // $ANTLR start "rule__Switch__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2236:1: rule__Switch__Group__1__Impl : ( '{' ) ;
    public final void rule__Switch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2240:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2241:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2241:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2242:1: '{'
            {
             before(grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Switch__Group__1__Impl4506); 
             after(grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Switch__Group__1__Impl"


    // $ANTLR start "rule__Switch__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2255:1: rule__Switch__Group__2 : rule__Switch__Group__2__Impl rule__Switch__Group__3 ;
    public final void rule__Switch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2259:1: ( rule__Switch__Group__2__Impl rule__Switch__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2260:2: rule__Switch__Group__2__Impl rule__Switch__Group__3
            {
            pushFollow(FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__24537);
            rule__Switch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__24540);
            rule__Switch__Group__3();

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
    // $ANTLR end "rule__Switch__Group__2"


    // $ANTLR start "rule__Switch__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2267:1: rule__Switch__Group__2__Impl : ( ( rule__Switch__DeviceAssignment_2 ) ) ;
    public final void rule__Switch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2271:1: ( ( ( rule__Switch__DeviceAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2272:1: ( ( rule__Switch__DeviceAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2272:1: ( ( rule__Switch__DeviceAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2273:1: ( rule__Switch__DeviceAssignment_2 )
            {
             before(grammarAccess.getSwitchAccess().getDeviceAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2274:1: ( rule__Switch__DeviceAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2274:2: rule__Switch__DeviceAssignment_2
            {
            pushFollow(FOLLOW_rule__Switch__DeviceAssignment_2_in_rule__Switch__Group__2__Impl4567);
            rule__Switch__DeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getDeviceAssignment_2()); 

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
    // $ANTLR end "rule__Switch__Group__2__Impl"


    // $ANTLR start "rule__Switch__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2284:1: rule__Switch__Group__3 : rule__Switch__Group__3__Impl rule__Switch__Group__4 ;
    public final void rule__Switch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2288:1: ( rule__Switch__Group__3__Impl rule__Switch__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2289:2: rule__Switch__Group__3__Impl rule__Switch__Group__4
            {
            pushFollow(FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__34597);
            rule__Switch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__34600);
            rule__Switch__Group__4();

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
    // $ANTLR end "rule__Switch__Group__3"


    // $ANTLR start "rule__Switch__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2296:1: rule__Switch__Group__3__Impl : ( ( rule__Switch__Group_3__0 )? ) ;
    public final void rule__Switch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2300:1: ( ( ( rule__Switch__Group_3__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2301:1: ( ( rule__Switch__Group_3__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2301:1: ( ( rule__Switch__Group_3__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2302:1: ( rule__Switch__Group_3__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_3()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2303:1: ( rule__Switch__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2303:2: rule__Switch__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_3__0_in_rule__Switch__Group__3__Impl4627);
                    rule__Switch__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Switch__Group__3__Impl"


    // $ANTLR start "rule__Switch__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2313:1: rule__Switch__Group__4 : rule__Switch__Group__4__Impl rule__Switch__Group__5 ;
    public final void rule__Switch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2317:1: ( rule__Switch__Group__4__Impl rule__Switch__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2318:2: rule__Switch__Group__4__Impl rule__Switch__Group__5
            {
            pushFollow(FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__44658);
            rule__Switch__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__5_in_rule__Switch__Group__44661);
            rule__Switch__Group__5();

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
    // $ANTLR end "rule__Switch__Group__4"


    // $ANTLR start "rule__Switch__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2325:1: rule__Switch__Group__4__Impl : ( ( rule__Switch__Group_4__0 )? ) ;
    public final void rule__Switch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2329:1: ( ( ( rule__Switch__Group_4__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2330:1: ( ( rule__Switch__Group_4__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2330:1: ( ( rule__Switch__Group_4__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2331:1: ( rule__Switch__Group_4__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2332:1: ( rule__Switch__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2332:2: rule__Switch__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_4__0_in_rule__Switch__Group__4__Impl4688);
                    rule__Switch__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Switch__Group__4__Impl"


    // $ANTLR start "rule__Switch__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2342:1: rule__Switch__Group__5 : rule__Switch__Group__5__Impl rule__Switch__Group__6 ;
    public final void rule__Switch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2346:1: ( rule__Switch__Group__5__Impl rule__Switch__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2347:2: rule__Switch__Group__5__Impl rule__Switch__Group__6
            {
            pushFollow(FOLLOW_rule__Switch__Group__5__Impl_in_rule__Switch__Group__54719);
            rule__Switch__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__6_in_rule__Switch__Group__54722);
            rule__Switch__Group__6();

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
    // $ANTLR end "rule__Switch__Group__5"


    // $ANTLR start "rule__Switch__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2354:1: rule__Switch__Group__5__Impl : ( ( rule__Switch__Group_5__0 )? ) ;
    public final void rule__Switch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2358:1: ( ( ( rule__Switch__Group_5__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2359:1: ( ( rule__Switch__Group_5__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2359:1: ( ( rule__Switch__Group_5__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2360:1: ( rule__Switch__Group_5__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_5()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2361:1: ( rule__Switch__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2361:2: rule__Switch__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_5__0_in_rule__Switch__Group__5__Impl4749);
                    rule__Switch__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Switch__Group__5__Impl"


    // $ANTLR start "rule__Switch__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2371:1: rule__Switch__Group__6 : rule__Switch__Group__6__Impl rule__Switch__Group__7 ;
    public final void rule__Switch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2375:1: ( rule__Switch__Group__6__Impl rule__Switch__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2376:2: rule__Switch__Group__6__Impl rule__Switch__Group__7
            {
            pushFollow(FOLLOW_rule__Switch__Group__6__Impl_in_rule__Switch__Group__64780);
            rule__Switch__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__7_in_rule__Switch__Group__64783);
            rule__Switch__Group__7();

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
    // $ANTLR end "rule__Switch__Group__6"


    // $ANTLR start "rule__Switch__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2383:1: rule__Switch__Group__6__Impl : ( ( rule__Switch__Group_6__0 )? ) ;
    public final void rule__Switch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2387:1: ( ( ( rule__Switch__Group_6__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2388:1: ( ( rule__Switch__Group_6__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2388:1: ( ( rule__Switch__Group_6__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2389:1: ( rule__Switch__Group_6__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2390:1: ( rule__Switch__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2390:2: rule__Switch__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_6__0_in_rule__Switch__Group__6__Impl4810);
                    rule__Switch__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Switch__Group__6__Impl"


    // $ANTLR start "rule__Switch__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2400:1: rule__Switch__Group__7 : rule__Switch__Group__7__Impl rule__Switch__Group__8 ;
    public final void rule__Switch__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2404:1: ( rule__Switch__Group__7__Impl rule__Switch__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2405:2: rule__Switch__Group__7__Impl rule__Switch__Group__8
            {
            pushFollow(FOLLOW_rule__Switch__Group__7__Impl_in_rule__Switch__Group__74841);
            rule__Switch__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__8_in_rule__Switch__Group__74844);
            rule__Switch__Group__8();

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
    // $ANTLR end "rule__Switch__Group__7"


    // $ANTLR start "rule__Switch__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2412:1: rule__Switch__Group__7__Impl : ( ( rule__Switch__Group_7__0 )? ) ;
    public final void rule__Switch__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2416:1: ( ( ( rule__Switch__Group_7__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2417:1: ( ( rule__Switch__Group_7__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2417:1: ( ( rule__Switch__Group_7__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2418:1: ( rule__Switch__Group_7__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2419:1: ( rule__Switch__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2419:2: rule__Switch__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_7__0_in_rule__Switch__Group__7__Impl4871);
                    rule__Switch__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Switch__Group__7__Impl"


    // $ANTLR start "rule__Switch__Group__8"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2429:1: rule__Switch__Group__8 : rule__Switch__Group__8__Impl rule__Switch__Group__9 ;
    public final void rule__Switch__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2433:1: ( rule__Switch__Group__8__Impl rule__Switch__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2434:2: rule__Switch__Group__8__Impl rule__Switch__Group__9
            {
            pushFollow(FOLLOW_rule__Switch__Group__8__Impl_in_rule__Switch__Group__84902);
            rule__Switch__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__9_in_rule__Switch__Group__84905);
            rule__Switch__Group__9();

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
    // $ANTLR end "rule__Switch__Group__8"


    // $ANTLR start "rule__Switch__Group__8__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2441:1: rule__Switch__Group__8__Impl : ( ( rule__Switch__Group_8__0 )? ) ;
    public final void rule__Switch__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2445:1: ( ( ( rule__Switch__Group_8__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2446:1: ( ( rule__Switch__Group_8__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2446:1: ( ( rule__Switch__Group_8__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2447:1: ( rule__Switch__Group_8__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2448:1: ( rule__Switch__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2448:2: rule__Switch__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_8__0_in_rule__Switch__Group__8__Impl4932);
                    rule__Switch__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Switch__Group__8__Impl"


    // $ANTLR start "rule__Switch__Group__9"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2458:1: rule__Switch__Group__9 : rule__Switch__Group__9__Impl rule__Switch__Group__10 ;
    public final void rule__Switch__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2462:1: ( rule__Switch__Group__9__Impl rule__Switch__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2463:2: rule__Switch__Group__9__Impl rule__Switch__Group__10
            {
            pushFollow(FOLLOW_rule__Switch__Group__9__Impl_in_rule__Switch__Group__94963);
            rule__Switch__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__10_in_rule__Switch__Group__94966);
            rule__Switch__Group__10();

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
    // $ANTLR end "rule__Switch__Group__9"


    // $ANTLR start "rule__Switch__Group__9__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2470:1: rule__Switch__Group__9__Impl : ( ( rule__Switch__Group_9__0 )? ) ;
    public final void rule__Switch__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2474:1: ( ( ( rule__Switch__Group_9__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2475:1: ( ( rule__Switch__Group_9__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2475:1: ( ( rule__Switch__Group_9__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2476:1: ( rule__Switch__Group_9__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2477:1: ( rule__Switch__Group_9__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2477:2: rule__Switch__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_9__0_in_rule__Switch__Group__9__Impl4993);
                    rule__Switch__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Switch__Group__9__Impl"


    // $ANTLR start "rule__Switch__Group__10"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2487:1: rule__Switch__Group__10 : rule__Switch__Group__10__Impl rule__Switch__Group__11 ;
    public final void rule__Switch__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2491:1: ( rule__Switch__Group__10__Impl rule__Switch__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2492:2: rule__Switch__Group__10__Impl rule__Switch__Group__11
            {
            pushFollow(FOLLOW_rule__Switch__Group__10__Impl_in_rule__Switch__Group__105024);
            rule__Switch__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__11_in_rule__Switch__Group__105027);
            rule__Switch__Group__11();

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
    // $ANTLR end "rule__Switch__Group__10"


    // $ANTLR start "rule__Switch__Group__10__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2499:1: rule__Switch__Group__10__Impl : ( ( rule__Switch__Group_10__0 )? ) ;
    public final void rule__Switch__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2503:1: ( ( ( rule__Switch__Group_10__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2504:1: ( ( rule__Switch__Group_10__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2504:1: ( ( rule__Switch__Group_10__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2505:1: ( rule__Switch__Group_10__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_10()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2506:1: ( rule__Switch__Group_10__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2506:2: rule__Switch__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_10__0_in_rule__Switch__Group__10__Impl5054);
                    rule__Switch__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Switch__Group__10__Impl"


    // $ANTLR start "rule__Switch__Group__11"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2516:1: rule__Switch__Group__11 : rule__Switch__Group__11__Impl rule__Switch__Group__12 ;
    public final void rule__Switch__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2520:1: ( rule__Switch__Group__11__Impl rule__Switch__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2521:2: rule__Switch__Group__11__Impl rule__Switch__Group__12
            {
            pushFollow(FOLLOW_rule__Switch__Group__11__Impl_in_rule__Switch__Group__115085);
            rule__Switch__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group__12_in_rule__Switch__Group__115088);
            rule__Switch__Group__12();

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
    // $ANTLR end "rule__Switch__Group__11"


    // $ANTLR start "rule__Switch__Group__11__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2528:1: rule__Switch__Group__11__Impl : ( ( rule__Switch__Group_11__0 )? ) ;
    public final void rule__Switch__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2532:1: ( ( ( rule__Switch__Group_11__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2533:1: ( ( rule__Switch__Group_11__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2533:1: ( ( rule__Switch__Group_11__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2534:1: ( rule__Switch__Group_11__0 )?
            {
             before(grammarAccess.getSwitchAccess().getGroup_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2535:1: ( rule__Switch__Group_11__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2535:2: rule__Switch__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Switch__Group_11__0_in_rule__Switch__Group__11__Impl5115);
                    rule__Switch__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSwitchAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Switch__Group__11__Impl"


    // $ANTLR start "rule__Switch__Group__12"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2545:1: rule__Switch__Group__12 : rule__Switch__Group__12__Impl ;
    public final void rule__Switch__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2549:1: ( rule__Switch__Group__12__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2550:2: rule__Switch__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group__12__Impl_in_rule__Switch__Group__125146);
            rule__Switch__Group__12__Impl();

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
    // $ANTLR end "rule__Switch__Group__12"


    // $ANTLR start "rule__Switch__Group__12__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2556:1: rule__Switch__Group__12__Impl : ( '}' ) ;
    public final void rule__Switch__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2560:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2561:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2561:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2562:1: '}'
            {
             before(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__Switch__Group__12__Impl5174); 
             after(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Switch__Group__12__Impl"


    // $ANTLR start "rule__Switch__Group_3__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2601:1: rule__Switch__Group_3__0 : rule__Switch__Group_3__0__Impl rule__Switch__Group_3__1 ;
    public final void rule__Switch__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2605:1: ( rule__Switch__Group_3__0__Impl rule__Switch__Group_3__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2606:2: rule__Switch__Group_3__0__Impl rule__Switch__Group_3__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_3__0__Impl_in_rule__Switch__Group_3__05231);
            rule__Switch__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_3__1_in_rule__Switch__Group_3__05234);
            rule__Switch__Group_3__1();

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
    // $ANTLR end "rule__Switch__Group_3__0"


    // $ANTLR start "rule__Switch__Group_3__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2613:1: rule__Switch__Group_3__0__Impl : ( 'get' ) ;
    public final void rule__Switch__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2617:1: ( ( 'get' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2618:1: ( 'get' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2618:1: ( 'get' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2619:1: 'get'
            {
             before(grammarAccess.getSwitchAccess().getGetKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__Switch__Group_3__0__Impl5262); 
             after(grammarAccess.getSwitchAccess().getGetKeyword_3_0()); 

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
    // $ANTLR end "rule__Switch__Group_3__0__Impl"


    // $ANTLR start "rule__Switch__Group_3__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2632:1: rule__Switch__Group_3__1 : rule__Switch__Group_3__1__Impl ;
    public final void rule__Switch__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2636:1: ( rule__Switch__Group_3__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2637:2: rule__Switch__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_3__1__Impl_in_rule__Switch__Group_3__15293);
            rule__Switch__Group_3__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_3__1"


    // $ANTLR start "rule__Switch__Group_3__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2643:1: rule__Switch__Group_3__1__Impl : ( ( rule__Switch__GetAssignment_3_1 ) ) ;
    public final void rule__Switch__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2647:1: ( ( ( rule__Switch__GetAssignment_3_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2648:1: ( ( rule__Switch__GetAssignment_3_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2648:1: ( ( rule__Switch__GetAssignment_3_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2649:1: ( rule__Switch__GetAssignment_3_1 )
            {
             before(grammarAccess.getSwitchAccess().getGetAssignment_3_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2650:1: ( rule__Switch__GetAssignment_3_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2650:2: rule__Switch__GetAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Switch__GetAssignment_3_1_in_rule__Switch__Group_3__1__Impl5320);
            rule__Switch__GetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getGetAssignment_3_1()); 

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
    // $ANTLR end "rule__Switch__Group_3__1__Impl"


    // $ANTLR start "rule__Switch__Group_4__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2664:1: rule__Switch__Group_4__0 : rule__Switch__Group_4__0__Impl rule__Switch__Group_4__1 ;
    public final void rule__Switch__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2668:1: ( rule__Switch__Group_4__0__Impl rule__Switch__Group_4__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2669:2: rule__Switch__Group_4__0__Impl rule__Switch__Group_4__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_4__0__Impl_in_rule__Switch__Group_4__05354);
            rule__Switch__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_4__1_in_rule__Switch__Group_4__05357);
            rule__Switch__Group_4__1();

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
    // $ANTLR end "rule__Switch__Group_4__0"


    // $ANTLR start "rule__Switch__Group_4__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2676:1: rule__Switch__Group_4__0__Impl : ( 'getOn' ) ;
    public final void rule__Switch__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2680:1: ( ( 'getOn' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2681:1: ( 'getOn' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2681:1: ( 'getOn' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2682:1: 'getOn'
            {
             before(grammarAccess.getSwitchAccess().getGetOnKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Switch__Group_4__0__Impl5385); 
             after(grammarAccess.getSwitchAccess().getGetOnKeyword_4_0()); 

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
    // $ANTLR end "rule__Switch__Group_4__0__Impl"


    // $ANTLR start "rule__Switch__Group_4__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2695:1: rule__Switch__Group_4__1 : rule__Switch__Group_4__1__Impl ;
    public final void rule__Switch__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2699:1: ( rule__Switch__Group_4__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2700:2: rule__Switch__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_4__1__Impl_in_rule__Switch__Group_4__15416);
            rule__Switch__Group_4__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_4__1"


    // $ANTLR start "rule__Switch__Group_4__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2706:1: rule__Switch__Group_4__1__Impl : ( ( rule__Switch__GetOnAssignment_4_1 ) ) ;
    public final void rule__Switch__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2710:1: ( ( ( rule__Switch__GetOnAssignment_4_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2711:1: ( ( rule__Switch__GetOnAssignment_4_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2711:1: ( ( rule__Switch__GetOnAssignment_4_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2712:1: ( rule__Switch__GetOnAssignment_4_1 )
            {
             before(grammarAccess.getSwitchAccess().getGetOnAssignment_4_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2713:1: ( rule__Switch__GetOnAssignment_4_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2713:2: rule__Switch__GetOnAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Switch__GetOnAssignment_4_1_in_rule__Switch__Group_4__1__Impl5443);
            rule__Switch__GetOnAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getGetOnAssignment_4_1()); 

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
    // $ANTLR end "rule__Switch__Group_4__1__Impl"


    // $ANTLR start "rule__Switch__Group_5__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2727:1: rule__Switch__Group_5__0 : rule__Switch__Group_5__0__Impl rule__Switch__Group_5__1 ;
    public final void rule__Switch__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2731:1: ( rule__Switch__Group_5__0__Impl rule__Switch__Group_5__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2732:2: rule__Switch__Group_5__0__Impl rule__Switch__Group_5__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_5__0__Impl_in_rule__Switch__Group_5__05477);
            rule__Switch__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_5__1_in_rule__Switch__Group_5__05480);
            rule__Switch__Group_5__1();

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
    // $ANTLR end "rule__Switch__Group_5__0"


    // $ANTLR start "rule__Switch__Group_5__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2739:1: rule__Switch__Group_5__0__Impl : ( 'getOff' ) ;
    public final void rule__Switch__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2743:1: ( ( 'getOff' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2744:1: ( 'getOff' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2744:1: ( 'getOff' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2745:1: 'getOff'
            {
             before(grammarAccess.getSwitchAccess().getGetOffKeyword_5_0()); 
            match(input,34,FOLLOW_34_in_rule__Switch__Group_5__0__Impl5508); 
             after(grammarAccess.getSwitchAccess().getGetOffKeyword_5_0()); 

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
    // $ANTLR end "rule__Switch__Group_5__0__Impl"


    // $ANTLR start "rule__Switch__Group_5__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2758:1: rule__Switch__Group_5__1 : rule__Switch__Group_5__1__Impl ;
    public final void rule__Switch__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2762:1: ( rule__Switch__Group_5__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2763:2: rule__Switch__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_5__1__Impl_in_rule__Switch__Group_5__15539);
            rule__Switch__Group_5__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_5__1"


    // $ANTLR start "rule__Switch__Group_5__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2769:1: rule__Switch__Group_5__1__Impl : ( ( rule__Switch__GetOffAssignment_5_1 ) ) ;
    public final void rule__Switch__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2773:1: ( ( ( rule__Switch__GetOffAssignment_5_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2774:1: ( ( rule__Switch__GetOffAssignment_5_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2774:1: ( ( rule__Switch__GetOffAssignment_5_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2775:1: ( rule__Switch__GetOffAssignment_5_1 )
            {
             before(grammarAccess.getSwitchAccess().getGetOffAssignment_5_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2776:1: ( rule__Switch__GetOffAssignment_5_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2776:2: rule__Switch__GetOffAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Switch__GetOffAssignment_5_1_in_rule__Switch__Group_5__1__Impl5566);
            rule__Switch__GetOffAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getGetOffAssignment_5_1()); 

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
    // $ANTLR end "rule__Switch__Group_5__1__Impl"


    // $ANTLR start "rule__Switch__Group_6__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2790:1: rule__Switch__Group_6__0 : rule__Switch__Group_6__0__Impl rule__Switch__Group_6__1 ;
    public final void rule__Switch__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2794:1: ( rule__Switch__Group_6__0__Impl rule__Switch__Group_6__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2795:2: rule__Switch__Group_6__0__Impl rule__Switch__Group_6__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_6__0__Impl_in_rule__Switch__Group_6__05600);
            rule__Switch__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_6__1_in_rule__Switch__Group_6__05603);
            rule__Switch__Group_6__1();

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
    // $ANTLR end "rule__Switch__Group_6__0"


    // $ANTLR start "rule__Switch__Group_6__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2802:1: rule__Switch__Group_6__0__Impl : ( 'class' ) ;
    public final void rule__Switch__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2806:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2807:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2807:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2808:1: 'class'
            {
             before(grammarAccess.getSwitchAccess().getClassKeyword_6_0()); 
            match(input,35,FOLLOW_35_in_rule__Switch__Group_6__0__Impl5631); 
             after(grammarAccess.getSwitchAccess().getClassKeyword_6_0()); 

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
    // $ANTLR end "rule__Switch__Group_6__0__Impl"


    // $ANTLR start "rule__Switch__Group_6__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2821:1: rule__Switch__Group_6__1 : rule__Switch__Group_6__1__Impl ;
    public final void rule__Switch__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2825:1: ( rule__Switch__Group_6__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2826:2: rule__Switch__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_6__1__Impl_in_rule__Switch__Group_6__15662);
            rule__Switch__Group_6__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_6__1"


    // $ANTLR start "rule__Switch__Group_6__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2832:1: rule__Switch__Group_6__1__Impl : ( ( rule__Switch__ClassAssignment_6_1 ) ) ;
    public final void rule__Switch__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2836:1: ( ( ( rule__Switch__ClassAssignment_6_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2837:1: ( ( rule__Switch__ClassAssignment_6_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2837:1: ( ( rule__Switch__ClassAssignment_6_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2838:1: ( rule__Switch__ClassAssignment_6_1 )
            {
             before(grammarAccess.getSwitchAccess().getClassAssignment_6_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2839:1: ( rule__Switch__ClassAssignment_6_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2839:2: rule__Switch__ClassAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Switch__ClassAssignment_6_1_in_rule__Switch__Group_6__1__Impl5689);
            rule__Switch__ClassAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getClassAssignment_6_1()); 

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
    // $ANTLR end "rule__Switch__Group_6__1__Impl"


    // $ANTLR start "rule__Switch__Group_7__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2853:1: rule__Switch__Group_7__0 : rule__Switch__Group_7__0__Impl rule__Switch__Group_7__1 ;
    public final void rule__Switch__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2857:1: ( rule__Switch__Group_7__0__Impl rule__Switch__Group_7__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2858:2: rule__Switch__Group_7__0__Impl rule__Switch__Group_7__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_7__0__Impl_in_rule__Switch__Group_7__05723);
            rule__Switch__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_7__1_in_rule__Switch__Group_7__05726);
            rule__Switch__Group_7__1();

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
    // $ANTLR end "rule__Switch__Group_7__0"


    // $ANTLR start "rule__Switch__Group_7__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2865:1: rule__Switch__Group_7__0__Impl : ( 'onColor' ) ;
    public final void rule__Switch__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2869:1: ( ( 'onColor' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2870:1: ( 'onColor' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2870:1: ( 'onColor' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2871:1: 'onColor'
            {
             before(grammarAccess.getSwitchAccess().getOnColorKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__Switch__Group_7__0__Impl5754); 
             after(grammarAccess.getSwitchAccess().getOnColorKeyword_7_0()); 

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
    // $ANTLR end "rule__Switch__Group_7__0__Impl"


    // $ANTLR start "rule__Switch__Group_7__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2884:1: rule__Switch__Group_7__1 : rule__Switch__Group_7__1__Impl ;
    public final void rule__Switch__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2888:1: ( rule__Switch__Group_7__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2889:2: rule__Switch__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_7__1__Impl_in_rule__Switch__Group_7__15785);
            rule__Switch__Group_7__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_7__1"


    // $ANTLR start "rule__Switch__Group_7__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2895:1: rule__Switch__Group_7__1__Impl : ( ( rule__Switch__OnColorAssignment_7_1 ) ) ;
    public final void rule__Switch__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2899:1: ( ( ( rule__Switch__OnColorAssignment_7_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2900:1: ( ( rule__Switch__OnColorAssignment_7_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2900:1: ( ( rule__Switch__OnColorAssignment_7_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2901:1: ( rule__Switch__OnColorAssignment_7_1 )
            {
             before(grammarAccess.getSwitchAccess().getOnColorAssignment_7_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2902:1: ( rule__Switch__OnColorAssignment_7_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2902:2: rule__Switch__OnColorAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Switch__OnColorAssignment_7_1_in_rule__Switch__Group_7__1__Impl5812);
            rule__Switch__OnColorAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getOnColorAssignment_7_1()); 

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
    // $ANTLR end "rule__Switch__Group_7__1__Impl"


    // $ANTLR start "rule__Switch__Group_8__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2916:1: rule__Switch__Group_8__0 : rule__Switch__Group_8__0__Impl rule__Switch__Group_8__1 ;
    public final void rule__Switch__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2920:1: ( rule__Switch__Group_8__0__Impl rule__Switch__Group_8__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2921:2: rule__Switch__Group_8__0__Impl rule__Switch__Group_8__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_8__0__Impl_in_rule__Switch__Group_8__05846);
            rule__Switch__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_8__1_in_rule__Switch__Group_8__05849);
            rule__Switch__Group_8__1();

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
    // $ANTLR end "rule__Switch__Group_8__0"


    // $ANTLR start "rule__Switch__Group_8__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2928:1: rule__Switch__Group_8__0__Impl : ( 'offColor' ) ;
    public final void rule__Switch__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2932:1: ( ( 'offColor' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2933:1: ( 'offColor' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2933:1: ( 'offColor' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2934:1: 'offColor'
            {
             before(grammarAccess.getSwitchAccess().getOffColorKeyword_8_0()); 
            match(input,37,FOLLOW_37_in_rule__Switch__Group_8__0__Impl5877); 
             after(grammarAccess.getSwitchAccess().getOffColorKeyword_8_0()); 

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
    // $ANTLR end "rule__Switch__Group_8__0__Impl"


    // $ANTLR start "rule__Switch__Group_8__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2947:1: rule__Switch__Group_8__1 : rule__Switch__Group_8__1__Impl ;
    public final void rule__Switch__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2951:1: ( rule__Switch__Group_8__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2952:2: rule__Switch__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_8__1__Impl_in_rule__Switch__Group_8__15908);
            rule__Switch__Group_8__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_8__1"


    // $ANTLR start "rule__Switch__Group_8__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2958:1: rule__Switch__Group_8__1__Impl : ( ( rule__Switch__OffColorAssignment_8_1 ) ) ;
    public final void rule__Switch__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2962:1: ( ( ( rule__Switch__OffColorAssignment_8_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2963:1: ( ( rule__Switch__OffColorAssignment_8_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2963:1: ( ( rule__Switch__OffColorAssignment_8_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2964:1: ( rule__Switch__OffColorAssignment_8_1 )
            {
             before(grammarAccess.getSwitchAccess().getOffColorAssignment_8_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2965:1: ( rule__Switch__OffColorAssignment_8_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2965:2: rule__Switch__OffColorAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Switch__OffColorAssignment_8_1_in_rule__Switch__Group_8__1__Impl5935);
            rule__Switch__OffColorAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getOffColorAssignment_8_1()); 

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
    // $ANTLR end "rule__Switch__Group_8__1__Impl"


    // $ANTLR start "rule__Switch__Group_9__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2979:1: rule__Switch__Group_9__0 : rule__Switch__Group_9__0__Impl rule__Switch__Group_9__1 ;
    public final void rule__Switch__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2983:1: ( rule__Switch__Group_9__0__Impl rule__Switch__Group_9__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2984:2: rule__Switch__Group_9__0__Impl rule__Switch__Group_9__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_9__0__Impl_in_rule__Switch__Group_9__05969);
            rule__Switch__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_9__1_in_rule__Switch__Group_9__05972);
            rule__Switch__Group_9__1();

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
    // $ANTLR end "rule__Switch__Group_9__0"


    // $ANTLR start "rule__Switch__Group_9__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2991:1: rule__Switch__Group_9__0__Impl : ( 'background-on-color' ) ;
    public final void rule__Switch__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2995:1: ( ( 'background-on-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2996:1: ( 'background-on-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2996:1: ( 'background-on-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:2997:1: 'background-on-color'
            {
             before(grammarAccess.getSwitchAccess().getBackgroundOnColorKeyword_9_0()); 
            match(input,38,FOLLOW_38_in_rule__Switch__Group_9__0__Impl6000); 
             after(grammarAccess.getSwitchAccess().getBackgroundOnColorKeyword_9_0()); 

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
    // $ANTLR end "rule__Switch__Group_9__0__Impl"


    // $ANTLR start "rule__Switch__Group_9__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3010:1: rule__Switch__Group_9__1 : rule__Switch__Group_9__1__Impl ;
    public final void rule__Switch__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3014:1: ( rule__Switch__Group_9__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3015:2: rule__Switch__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_9__1__Impl_in_rule__Switch__Group_9__16031);
            rule__Switch__Group_9__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_9__1"


    // $ANTLR start "rule__Switch__Group_9__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3021:1: rule__Switch__Group_9__1__Impl : ( ( rule__Switch__OnBackGroundColorAssignment_9_1 ) ) ;
    public final void rule__Switch__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3025:1: ( ( ( rule__Switch__OnBackGroundColorAssignment_9_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3026:1: ( ( rule__Switch__OnBackGroundColorAssignment_9_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3026:1: ( ( rule__Switch__OnBackGroundColorAssignment_9_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3027:1: ( rule__Switch__OnBackGroundColorAssignment_9_1 )
            {
             before(grammarAccess.getSwitchAccess().getOnBackGroundColorAssignment_9_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3028:1: ( rule__Switch__OnBackGroundColorAssignment_9_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3028:2: rule__Switch__OnBackGroundColorAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Switch__OnBackGroundColorAssignment_9_1_in_rule__Switch__Group_9__1__Impl6058);
            rule__Switch__OnBackGroundColorAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getOnBackGroundColorAssignment_9_1()); 

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
    // $ANTLR end "rule__Switch__Group_9__1__Impl"


    // $ANTLR start "rule__Switch__Group_10__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3042:1: rule__Switch__Group_10__0 : rule__Switch__Group_10__0__Impl rule__Switch__Group_10__1 ;
    public final void rule__Switch__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3046:1: ( rule__Switch__Group_10__0__Impl rule__Switch__Group_10__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3047:2: rule__Switch__Group_10__0__Impl rule__Switch__Group_10__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_10__0__Impl_in_rule__Switch__Group_10__06092);
            rule__Switch__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_10__1_in_rule__Switch__Group_10__06095);
            rule__Switch__Group_10__1();

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
    // $ANTLR end "rule__Switch__Group_10__0"


    // $ANTLR start "rule__Switch__Group_10__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3054:1: rule__Switch__Group_10__0__Impl : ( 'background-icon' ) ;
    public final void rule__Switch__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3058:1: ( ( 'background-icon' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3059:1: ( 'background-icon' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3059:1: ( 'background-icon' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3060:1: 'background-icon'
            {
             before(grammarAccess.getSwitchAccess().getBackgroundIconKeyword_10_0()); 
            match(input,39,FOLLOW_39_in_rule__Switch__Group_10__0__Impl6123); 
             after(grammarAccess.getSwitchAccess().getBackgroundIconKeyword_10_0()); 

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
    // $ANTLR end "rule__Switch__Group_10__0__Impl"


    // $ANTLR start "rule__Switch__Group_10__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3073:1: rule__Switch__Group_10__1 : rule__Switch__Group_10__1__Impl ;
    public final void rule__Switch__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3077:1: ( rule__Switch__Group_10__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3078:2: rule__Switch__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_10__1__Impl_in_rule__Switch__Group_10__16154);
            rule__Switch__Group_10__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_10__1"


    // $ANTLR start "rule__Switch__Group_10__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3084:1: rule__Switch__Group_10__1__Impl : ( ( rule__Switch__BackgroundIconAssignment_10_1 ) ) ;
    public final void rule__Switch__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3088:1: ( ( ( rule__Switch__BackgroundIconAssignment_10_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3089:1: ( ( rule__Switch__BackgroundIconAssignment_10_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3089:1: ( ( rule__Switch__BackgroundIconAssignment_10_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3090:1: ( rule__Switch__BackgroundIconAssignment_10_1 )
            {
             before(grammarAccess.getSwitchAccess().getBackgroundIconAssignment_10_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3091:1: ( rule__Switch__BackgroundIconAssignment_10_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3091:2: rule__Switch__BackgroundIconAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Switch__BackgroundIconAssignment_10_1_in_rule__Switch__Group_10__1__Impl6181);
            rule__Switch__BackgroundIconAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getBackgroundIconAssignment_10_1()); 

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
    // $ANTLR end "rule__Switch__Group_10__1__Impl"


    // $ANTLR start "rule__Switch__Group_11__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3105:1: rule__Switch__Group_11__0 : rule__Switch__Group_11__0__Impl rule__Switch__Group_11__1 ;
    public final void rule__Switch__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3109:1: ( rule__Switch__Group_11__0__Impl rule__Switch__Group_11__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3110:2: rule__Switch__Group_11__0__Impl rule__Switch__Group_11__1
            {
            pushFollow(FOLLOW_rule__Switch__Group_11__0__Impl_in_rule__Switch__Group_11__06215);
            rule__Switch__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Switch__Group_11__1_in_rule__Switch__Group_11__06218);
            rule__Switch__Group_11__1();

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
    // $ANTLR end "rule__Switch__Group_11__0"


    // $ANTLR start "rule__Switch__Group_11__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3117:1: rule__Switch__Group_11__0__Impl : ( 'icon' ) ;
    public final void rule__Switch__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3121:1: ( ( 'icon' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3122:1: ( 'icon' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3122:1: ( 'icon' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3123:1: 'icon'
            {
             before(grammarAccess.getSwitchAccess().getIconKeyword_11_0()); 
            match(input,40,FOLLOW_40_in_rule__Switch__Group_11__0__Impl6246); 
             after(grammarAccess.getSwitchAccess().getIconKeyword_11_0()); 

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
    // $ANTLR end "rule__Switch__Group_11__0__Impl"


    // $ANTLR start "rule__Switch__Group_11__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3136:1: rule__Switch__Group_11__1 : rule__Switch__Group_11__1__Impl ;
    public final void rule__Switch__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3140:1: ( rule__Switch__Group_11__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3141:2: rule__Switch__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group_11__1__Impl_in_rule__Switch__Group_11__16277);
            rule__Switch__Group_11__1__Impl();

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
    // $ANTLR end "rule__Switch__Group_11__1"


    // $ANTLR start "rule__Switch__Group_11__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3147:1: rule__Switch__Group_11__1__Impl : ( ( rule__Switch__IconAssignment_11_1 ) ) ;
    public final void rule__Switch__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3151:1: ( ( ( rule__Switch__IconAssignment_11_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3152:1: ( ( rule__Switch__IconAssignment_11_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3152:1: ( ( rule__Switch__IconAssignment_11_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3153:1: ( rule__Switch__IconAssignment_11_1 )
            {
             before(grammarAccess.getSwitchAccess().getIconAssignment_11_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3154:1: ( rule__Switch__IconAssignment_11_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3154:2: rule__Switch__IconAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Switch__IconAssignment_11_1_in_rule__Switch__Group_11__1__Impl6304);
            rule__Switch__IconAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSwitchAccess().getIconAssignment_11_1()); 

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
    // $ANTLR end "rule__Switch__Group_11__1__Impl"


    // $ANTLR start "rule__Custom__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3168:1: rule__Custom__Group__0 : rule__Custom__Group__0__Impl rule__Custom__Group__1 ;
    public final void rule__Custom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3172:1: ( rule__Custom__Group__0__Impl rule__Custom__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3173:2: rule__Custom__Group__0__Impl rule__Custom__Group__1
            {
            pushFollow(FOLLOW_rule__Custom__Group__0__Impl_in_rule__Custom__Group__06338);
            rule__Custom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Custom__Group__1_in_rule__Custom__Group__06341);
            rule__Custom__Group__1();

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
    // $ANTLR end "rule__Custom__Group__0"


    // $ANTLR start "rule__Custom__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3180:1: rule__Custom__Group__0__Impl : ( '{' ) ;
    public final void rule__Custom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3184:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3185:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3185:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3186:1: '{'
            {
             before(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Custom__Group__0__Impl6369); 
             after(grammarAccess.getCustomAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Custom__Group__0__Impl"


    // $ANTLR start "rule__Custom__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3199:1: rule__Custom__Group__1 : rule__Custom__Group__1__Impl rule__Custom__Group__2 ;
    public final void rule__Custom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3203:1: ( rule__Custom__Group__1__Impl rule__Custom__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3204:2: rule__Custom__Group__1__Impl rule__Custom__Group__2
            {
            pushFollow(FOLLOW_rule__Custom__Group__1__Impl_in_rule__Custom__Group__16400);
            rule__Custom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Custom__Group__2_in_rule__Custom__Group__16403);
            rule__Custom__Group__2();

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
    // $ANTLR end "rule__Custom__Group__1"


    // $ANTLR start "rule__Custom__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3211:1: rule__Custom__Group__1__Impl : ( ( rule__Custom__CodeAssignment_1 ) ) ;
    public final void rule__Custom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3215:1: ( ( ( rule__Custom__CodeAssignment_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3216:1: ( ( rule__Custom__CodeAssignment_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3216:1: ( ( rule__Custom__CodeAssignment_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3217:1: ( rule__Custom__CodeAssignment_1 )
            {
             before(grammarAccess.getCustomAccess().getCodeAssignment_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3218:1: ( rule__Custom__CodeAssignment_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3218:2: rule__Custom__CodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Custom__CodeAssignment_1_in_rule__Custom__Group__1__Impl6430);
            rule__Custom__CodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomAccess().getCodeAssignment_1()); 

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
    // $ANTLR end "rule__Custom__Group__1__Impl"


    // $ANTLR start "rule__Custom__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3228:1: rule__Custom__Group__2 : rule__Custom__Group__2__Impl ;
    public final void rule__Custom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3232:1: ( rule__Custom__Group__2__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3233:2: rule__Custom__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Custom__Group__2__Impl_in_rule__Custom__Group__26460);
            rule__Custom__Group__2__Impl();

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
    // $ANTLR end "rule__Custom__Group__2"


    // $ANTLR start "rule__Custom__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3239:1: rule__Custom__Group__2__Impl : ( '}' ) ;
    public final void rule__Custom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3243:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3244:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3244:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3245:1: '}'
            {
             before(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Custom__Group__2__Impl6488); 
             after(grammarAccess.getCustomAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Custom__Group__2__Impl"


    // $ANTLR start "rule__Div__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3264:1: rule__Div__Group__0 : rule__Div__Group__0__Impl rule__Div__Group__1 ;
    public final void rule__Div__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3268:1: ( rule__Div__Group__0__Impl rule__Div__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3269:2: rule__Div__Group__0__Impl rule__Div__Group__1
            {
            pushFollow(FOLLOW_rule__Div__Group__0__Impl_in_rule__Div__Group__06525);
            rule__Div__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Div__Group__1_in_rule__Div__Group__06528);
            rule__Div__Group__1();

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
    // $ANTLR end "rule__Div__Group__0"


    // $ANTLR start "rule__Div__Group__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3276:1: rule__Div__Group__0__Impl : ( 'div' ) ;
    public final void rule__Div__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3280:1: ( ( 'div' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3281:1: ( 'div' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3281:1: ( 'div' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3282:1: 'div'
            {
             before(grammarAccess.getDivAccess().getDivKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Div__Group__0__Impl6556); 
             after(grammarAccess.getDivAccess().getDivKeyword_0()); 

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
    // $ANTLR end "rule__Div__Group__0__Impl"


    // $ANTLR start "rule__Div__Group__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3295:1: rule__Div__Group__1 : rule__Div__Group__1__Impl rule__Div__Group__2 ;
    public final void rule__Div__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3299:1: ( rule__Div__Group__1__Impl rule__Div__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3300:2: rule__Div__Group__1__Impl rule__Div__Group__2
            {
            pushFollow(FOLLOW_rule__Div__Group__1__Impl_in_rule__Div__Group__16587);
            rule__Div__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Div__Group__2_in_rule__Div__Group__16590);
            rule__Div__Group__2();

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
    // $ANTLR end "rule__Div__Group__1"


    // $ANTLR start "rule__Div__Group__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3307:1: rule__Div__Group__1__Impl : ( '{' ) ;
    public final void rule__Div__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3311:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3312:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3312:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3313:1: '{'
            {
             before(grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Div__Group__1__Impl6618); 
             after(grammarAccess.getDivAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Div__Group__1__Impl"


    // $ANTLR start "rule__Div__Group__2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3326:1: rule__Div__Group__2 : rule__Div__Group__2__Impl rule__Div__Group__3 ;
    public final void rule__Div__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3330:1: ( rule__Div__Group__2__Impl rule__Div__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3331:2: rule__Div__Group__2__Impl rule__Div__Group__3
            {
            pushFollow(FOLLOW_rule__Div__Group__2__Impl_in_rule__Div__Group__26649);
            rule__Div__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Div__Group__3_in_rule__Div__Group__26652);
            rule__Div__Group__3();

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
    // $ANTLR end "rule__Div__Group__2"


    // $ANTLR start "rule__Div__Group__2__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3338:1: rule__Div__Group__2__Impl : ( 'class' ) ;
    public final void rule__Div__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3342:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3343:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3343:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3344:1: 'class'
            {
             before(grammarAccess.getDivAccess().getClassKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Div__Group__2__Impl6680); 
             after(grammarAccess.getDivAccess().getClassKeyword_2()); 

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
    // $ANTLR end "rule__Div__Group__2__Impl"


    // $ANTLR start "rule__Div__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3357:1: rule__Div__Group__3 : rule__Div__Group__3__Impl rule__Div__Group__4 ;
    public final void rule__Div__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3361:1: ( rule__Div__Group__3__Impl rule__Div__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3362:2: rule__Div__Group__3__Impl rule__Div__Group__4
            {
            pushFollow(FOLLOW_rule__Div__Group__3__Impl_in_rule__Div__Group__36711);
            rule__Div__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Div__Group__4_in_rule__Div__Group__36714);
            rule__Div__Group__4();

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
    // $ANTLR end "rule__Div__Group__3"


    // $ANTLR start "rule__Div__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3369:1: rule__Div__Group__3__Impl : ( ( rule__Div__ClassAssignment_3 ) ) ;
    public final void rule__Div__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3373:1: ( ( ( rule__Div__ClassAssignment_3 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3374:1: ( ( rule__Div__ClassAssignment_3 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3374:1: ( ( rule__Div__ClassAssignment_3 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3375:1: ( rule__Div__ClassAssignment_3 )
            {
             before(grammarAccess.getDivAccess().getClassAssignment_3()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3376:1: ( rule__Div__ClassAssignment_3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3376:2: rule__Div__ClassAssignment_3
            {
            pushFollow(FOLLOW_rule__Div__ClassAssignment_3_in_rule__Div__Group__3__Impl6741);
            rule__Div__ClassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDivAccess().getClassAssignment_3()); 

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
    // $ANTLR end "rule__Div__Group__3__Impl"


    // $ANTLR start "rule__Div__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3386:1: rule__Div__Group__4 : rule__Div__Group__4__Impl rule__Div__Group__5 ;
    public final void rule__Div__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3390:1: ( rule__Div__Group__4__Impl rule__Div__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3391:2: rule__Div__Group__4__Impl rule__Div__Group__5
            {
            pushFollow(FOLLOW_rule__Div__Group__4__Impl_in_rule__Div__Group__46771);
            rule__Div__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Div__Group__5_in_rule__Div__Group__46774);
            rule__Div__Group__5();

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
    // $ANTLR end "rule__Div__Group__4"


    // $ANTLR start "rule__Div__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3398:1: rule__Div__Group__4__Impl : ( ( rule__Div__WidgetsAssignment_4 )* ) ;
    public final void rule__Div__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3402:1: ( ( ( rule__Div__WidgetsAssignment_4 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3403:1: ( ( rule__Div__WidgetsAssignment_4 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3403:1: ( ( rule__Div__WidgetsAssignment_4 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3404:1: ( rule__Div__WidgetsAssignment_4 )*
            {
             before(grammarAccess.getDivAccess().getWidgetsAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3405:1: ( rule__Div__WidgetsAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24||LA23_0==31||(LA23_0>=41 && LA23_0<=42)||LA23_0==46||LA23_0==50||LA23_0==58||LA23_0==65||LA23_0==73) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3405:2: rule__Div__WidgetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Div__WidgetsAssignment_4_in_rule__Div__Group__4__Impl6801);
            	    rule__Div__WidgetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDivAccess().getWidgetsAssignment_4()); 

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
    // $ANTLR end "rule__Div__Group__4__Impl"


    // $ANTLR start "rule__Div__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3415:1: rule__Div__Group__5 : rule__Div__Group__5__Impl ;
    public final void rule__Div__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3419:1: ( rule__Div__Group__5__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3420:2: rule__Div__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Div__Group__5__Impl_in_rule__Div__Group__56832);
            rule__Div__Group__5__Impl();

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
    // $ANTLR end "rule__Div__Group__5"


    // $ANTLR start "rule__Div__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3426:1: rule__Div__Group__5__Impl : ( '}' ) ;
    public final void rule__Div__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3430:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3431:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3431:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3432:1: '}'
            {
             before(grammarAccess.getDivAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Div__Group__5__Impl6860); 
             after(grammarAccess.getDivAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Div__Group__5__Impl"


    // $ANTLR start "rule__Calview__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3457:1: rule__Calview__Group__0 : rule__Calview__Group__0__Impl rule__Calview__Group__1 ;
    public final void rule__Calview__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3461:1: ( rule__Calview__Group__0__Impl rule__Calview__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3462:2: rule__Calview__Group__0__Impl rule__Calview__Group__1
            {
            pushFollow(FOLLOW_rule__Calview__Group__0__Impl_in_rule__Calview__Group__06903);
            rule__Calview__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__1_in_rule__Calview__Group__06906);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3469:1: rule__Calview__Group__0__Impl : ( 'calview' ) ;
    public final void rule__Calview__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3473:1: ( ( 'calview' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3474:1: ( 'calview' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3474:1: ( 'calview' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3475:1: 'calview'
            {
             before(grammarAccess.getCalviewAccess().getCalviewKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Calview__Group__0__Impl6934); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3488:1: rule__Calview__Group__1 : rule__Calview__Group__1__Impl rule__Calview__Group__2 ;
    public final void rule__Calview__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3492:1: ( rule__Calview__Group__1__Impl rule__Calview__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3493:2: rule__Calview__Group__1__Impl rule__Calview__Group__2
            {
            pushFollow(FOLLOW_rule__Calview__Group__1__Impl_in_rule__Calview__Group__16965);
            rule__Calview__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__2_in_rule__Calview__Group__16968);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3500:1: rule__Calview__Group__1__Impl : ( '{' ) ;
    public final void rule__Calview__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3504:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3505:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3505:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3506:1: '{'
            {
             before(grammarAccess.getCalviewAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Calview__Group__1__Impl6996); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3519:1: rule__Calview__Group__2 : rule__Calview__Group__2__Impl rule__Calview__Group__3 ;
    public final void rule__Calview__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3523:1: ( rule__Calview__Group__2__Impl rule__Calview__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3524:2: rule__Calview__Group__2__Impl rule__Calview__Group__3
            {
            pushFollow(FOLLOW_rule__Calview__Group__2__Impl_in_rule__Calview__Group__27027);
            rule__Calview__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__3_in_rule__Calview__Group__27030);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3531:1: rule__Calview__Group__2__Impl : ( ( rule__Calview__DeviceAssignment_2 ) ) ;
    public final void rule__Calview__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3535:1: ( ( ( rule__Calview__DeviceAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3536:1: ( ( rule__Calview__DeviceAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3536:1: ( ( rule__Calview__DeviceAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3537:1: ( rule__Calview__DeviceAssignment_2 )
            {
             before(grammarAccess.getCalviewAccess().getDeviceAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3538:1: ( rule__Calview__DeviceAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3538:2: rule__Calview__DeviceAssignment_2
            {
            pushFollow(FOLLOW_rule__Calview__DeviceAssignment_2_in_rule__Calview__Group__2__Impl7057);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3548:1: rule__Calview__Group__3 : rule__Calview__Group__3__Impl rule__Calview__Group__4 ;
    public final void rule__Calview__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3552:1: ( rule__Calview__Group__3__Impl rule__Calview__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3553:2: rule__Calview__Group__3__Impl rule__Calview__Group__4
            {
            pushFollow(FOLLOW_rule__Calview__Group__3__Impl_in_rule__Calview__Group__37087);
            rule__Calview__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__4_in_rule__Calview__Group__37090);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3560:1: rule__Calview__Group__3__Impl : ( 'get' ) ;
    public final void rule__Calview__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3564:1: ( ( 'get' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3565:1: ( 'get' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3565:1: ( 'get' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3566:1: 'get'
            {
             before(grammarAccess.getCalviewAccess().getGetKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Calview__Group__3__Impl7118); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3579:1: rule__Calview__Group__4 : rule__Calview__Group__4__Impl rule__Calview__Group__5 ;
    public final void rule__Calview__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3583:1: ( rule__Calview__Group__4__Impl rule__Calview__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3584:2: rule__Calview__Group__4__Impl rule__Calview__Group__5
            {
            pushFollow(FOLLOW_rule__Calview__Group__4__Impl_in_rule__Calview__Group__47149);
            rule__Calview__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__5_in_rule__Calview__Group__47152);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3591:1: rule__Calview__Group__4__Impl : ( ( rule__Calview__GetAssignment_4 ) ) ;
    public final void rule__Calview__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3595:1: ( ( ( rule__Calview__GetAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3596:1: ( ( rule__Calview__GetAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3596:1: ( ( rule__Calview__GetAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3597:1: ( rule__Calview__GetAssignment_4 )
            {
             before(grammarAccess.getCalviewAccess().getGetAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3598:1: ( rule__Calview__GetAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3598:2: rule__Calview__GetAssignment_4
            {
            pushFollow(FOLLOW_rule__Calview__GetAssignment_4_in_rule__Calview__Group__4__Impl7179);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3608:1: rule__Calview__Group__5 : rule__Calview__Group__5__Impl rule__Calview__Group__6 ;
    public final void rule__Calview__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3612:1: ( rule__Calview__Group__5__Impl rule__Calview__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3613:2: rule__Calview__Group__5__Impl rule__Calview__Group__6
            {
            pushFollow(FOLLOW_rule__Calview__Group__5__Impl_in_rule__Calview__Group__57209);
            rule__Calview__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__6_in_rule__Calview__Group__57212);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3620:1: rule__Calview__Group__5__Impl : ( 'max' ) ;
    public final void rule__Calview__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3624:1: ( ( 'max' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3625:1: ( 'max' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3625:1: ( 'max' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3626:1: 'max'
            {
             before(grammarAccess.getCalviewAccess().getMaxKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Calview__Group__5__Impl7240); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3639:1: rule__Calview__Group__6 : rule__Calview__Group__6__Impl rule__Calview__Group__7 ;
    public final void rule__Calview__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3643:1: ( rule__Calview__Group__6__Impl rule__Calview__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3644:2: rule__Calview__Group__6__Impl rule__Calview__Group__7
            {
            pushFollow(FOLLOW_rule__Calview__Group__6__Impl_in_rule__Calview__Group__67271);
            rule__Calview__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__7_in_rule__Calview__Group__67274);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3651:1: rule__Calview__Group__6__Impl : ( ( rule__Calview__MaxAssignment_6 ) ) ;
    public final void rule__Calview__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3655:1: ( ( ( rule__Calview__MaxAssignment_6 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3656:1: ( ( rule__Calview__MaxAssignment_6 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3656:1: ( ( rule__Calview__MaxAssignment_6 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3657:1: ( rule__Calview__MaxAssignment_6 )
            {
             before(grammarAccess.getCalviewAccess().getMaxAssignment_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3658:1: ( rule__Calview__MaxAssignment_6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3658:2: rule__Calview__MaxAssignment_6
            {
            pushFollow(FOLLOW_rule__Calview__MaxAssignment_6_in_rule__Calview__Group__6__Impl7301);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3668:1: rule__Calview__Group__7 : rule__Calview__Group__7__Impl rule__Calview__Group__8 ;
    public final void rule__Calview__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3672:1: ( rule__Calview__Group__7__Impl rule__Calview__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3673:2: rule__Calview__Group__7__Impl rule__Calview__Group__8
            {
            pushFollow(FOLLOW_rule__Calview__Group__7__Impl_in_rule__Calview__Group__77331);
            rule__Calview__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__8_in_rule__Calview__Group__77334);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3680:1: rule__Calview__Group__7__Impl : ( 'class' ) ;
    public final void rule__Calview__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3684:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3685:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3685:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3686:1: 'class'
            {
             before(grammarAccess.getCalviewAccess().getClassKeyword_7()); 
            match(input,35,FOLLOW_35_in_rule__Calview__Group__7__Impl7362); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3699:1: rule__Calview__Group__8 : rule__Calview__Group__8__Impl rule__Calview__Group__9 ;
    public final void rule__Calview__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3703:1: ( rule__Calview__Group__8__Impl rule__Calview__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3704:2: rule__Calview__Group__8__Impl rule__Calview__Group__9
            {
            pushFollow(FOLLOW_rule__Calview__Group__8__Impl_in_rule__Calview__Group__87393);
            rule__Calview__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__9_in_rule__Calview__Group__87396);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3711:1: rule__Calview__Group__8__Impl : ( ( rule__Calview__ClassAssignment_8 ) ) ;
    public final void rule__Calview__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3715:1: ( ( ( rule__Calview__ClassAssignment_8 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3716:1: ( ( rule__Calview__ClassAssignment_8 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3716:1: ( ( rule__Calview__ClassAssignment_8 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3717:1: ( rule__Calview__ClassAssignment_8 )
            {
             before(grammarAccess.getCalviewAccess().getClassAssignment_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3718:1: ( rule__Calview__ClassAssignment_8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3718:2: rule__Calview__ClassAssignment_8
            {
            pushFollow(FOLLOW_rule__Calview__ClassAssignment_8_in_rule__Calview__Group__8__Impl7423);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3728:1: rule__Calview__Group__9 : rule__Calview__Group__9__Impl rule__Calview__Group__10 ;
    public final void rule__Calview__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3732:1: ( rule__Calview__Group__9__Impl rule__Calview__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3733:2: rule__Calview__Group__9__Impl rule__Calview__Group__10
            {
            pushFollow(FOLLOW_rule__Calview__Group__9__Impl_in_rule__Calview__Group__97453);
            rule__Calview__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__10_in_rule__Calview__Group__97456);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3740:1: rule__Calview__Group__9__Impl : ( ( rule__Calview__Group_9__0 )? ) ;
    public final void rule__Calview__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3744:1: ( ( ( rule__Calview__Group_9__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3745:1: ( ( rule__Calview__Group_9__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3745:1: ( ( rule__Calview__Group_9__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3746:1: ( rule__Calview__Group_9__0 )?
            {
             before(grammarAccess.getCalviewAccess().getGroup_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3747:1: ( rule__Calview__Group_9__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3747:2: rule__Calview__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Calview__Group_9__0_in_rule__Calview__Group__9__Impl7483);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3757:1: rule__Calview__Group__10 : rule__Calview__Group__10__Impl rule__Calview__Group__11 ;
    public final void rule__Calview__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3761:1: ( rule__Calview__Group__10__Impl rule__Calview__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3762:2: rule__Calview__Group__10__Impl rule__Calview__Group__11
            {
            pushFollow(FOLLOW_rule__Calview__Group__10__Impl_in_rule__Calview__Group__107514);
            rule__Calview__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group__11_in_rule__Calview__Group__107517);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3769:1: rule__Calview__Group__10__Impl : ( ( rule__Calview__Group_10__0 )? ) ;
    public final void rule__Calview__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3773:1: ( ( ( rule__Calview__Group_10__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3774:1: ( ( rule__Calview__Group_10__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3774:1: ( ( rule__Calview__Group_10__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3775:1: ( rule__Calview__Group_10__0 )?
            {
             before(grammarAccess.getCalviewAccess().getGroup_10()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3776:1: ( rule__Calview__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3776:2: rule__Calview__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Calview__Group_10__0_in_rule__Calview__Group__10__Impl7544);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3786:1: rule__Calview__Group__11 : rule__Calview__Group__11__Impl ;
    public final void rule__Calview__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3790:1: ( rule__Calview__Group__11__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3791:2: rule__Calview__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Calview__Group__11__Impl_in_rule__Calview__Group__117575);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3797:1: rule__Calview__Group__11__Impl : ( '}' ) ;
    public final void rule__Calview__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3801:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3802:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3802:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3803:1: '}'
            {
             before(grammarAccess.getCalviewAccess().getRightCurlyBracketKeyword_11()); 
            match(input,25,FOLLOW_25_in_rule__Calview__Group__11__Impl7603); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3840:1: rule__Calview__Group_9__0 : rule__Calview__Group_9__0__Impl rule__Calview__Group_9__1 ;
    public final void rule__Calview__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3844:1: ( rule__Calview__Group_9__0__Impl rule__Calview__Group_9__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3845:2: rule__Calview__Group_9__0__Impl rule__Calview__Group_9__1
            {
            pushFollow(FOLLOW_rule__Calview__Group_9__0__Impl_in_rule__Calview__Group_9__07658);
            rule__Calview__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group_9__1_in_rule__Calview__Group_9__07661);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3852:1: rule__Calview__Group_9__0__Impl : ( 'all-forecast-color' ) ;
    public final void rule__Calview__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3856:1: ( ( 'all-forecast-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3857:1: ( 'all-forecast-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3857:1: ( 'all-forecast-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3858:1: 'all-forecast-color'
            {
             before(grammarAccess.getCalviewAccess().getAllForecastColorKeyword_9_0()); 
            match(input,44,FOLLOW_44_in_rule__Calview__Group_9__0__Impl7689); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3871:1: rule__Calview__Group_9__1 : rule__Calview__Group_9__1__Impl ;
    public final void rule__Calview__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3875:1: ( rule__Calview__Group_9__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3876:2: rule__Calview__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Calview__Group_9__1__Impl_in_rule__Calview__Group_9__17720);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3882:1: rule__Calview__Group_9__1__Impl : ( ( rule__Calview__AllFCAssignment_9_1 ) ) ;
    public final void rule__Calview__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3886:1: ( ( ( rule__Calview__AllFCAssignment_9_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3887:1: ( ( rule__Calview__AllFCAssignment_9_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3887:1: ( ( rule__Calview__AllFCAssignment_9_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3888:1: ( rule__Calview__AllFCAssignment_9_1 )
            {
             before(grammarAccess.getCalviewAccess().getAllFCAssignment_9_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3889:1: ( rule__Calview__AllFCAssignment_9_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3889:2: rule__Calview__AllFCAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Calview__AllFCAssignment_9_1_in_rule__Calview__Group_9__1__Impl7747);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3903:1: rule__Calview__Group_10__0 : rule__Calview__Group_10__0__Impl rule__Calview__Group_10__1 ;
    public final void rule__Calview__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3907:1: ( rule__Calview__Group_10__0__Impl rule__Calview__Group_10__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3908:2: rule__Calview__Group_10__0__Impl rule__Calview__Group_10__1
            {
            pushFollow(FOLLOW_rule__Calview__Group_10__0__Impl_in_rule__Calview__Group_10__07781);
            rule__Calview__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Calview__Group_10__1_in_rule__Calview__Group_10__07784);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3915:1: rule__Calview__Group_10__0__Impl : ( 'all-today-color' ) ;
    public final void rule__Calview__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3919:1: ( ( 'all-today-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3920:1: ( 'all-today-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3920:1: ( 'all-today-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3921:1: 'all-today-color'
            {
             before(grammarAccess.getCalviewAccess().getAllTodayColorKeyword_10_0()); 
            match(input,45,FOLLOW_45_in_rule__Calview__Group_10__0__Impl7812); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3934:1: rule__Calview__Group_10__1 : rule__Calview__Group_10__1__Impl ;
    public final void rule__Calview__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3938:1: ( rule__Calview__Group_10__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3939:2: rule__Calview__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Calview__Group_10__1__Impl_in_rule__Calview__Group_10__17843);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3945:1: rule__Calview__Group_10__1__Impl : ( ( rule__Calview__AllTCAssignment_10_1 ) ) ;
    public final void rule__Calview__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3949:1: ( ( ( rule__Calview__AllTCAssignment_10_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3950:1: ( ( rule__Calview__AllTCAssignment_10_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3950:1: ( ( rule__Calview__AllTCAssignment_10_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3951:1: ( rule__Calview__AllTCAssignment_10_1 )
            {
             before(grammarAccess.getCalviewAccess().getAllTCAssignment_10_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3952:1: ( rule__Calview__AllTCAssignment_10_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3952:2: rule__Calview__AllTCAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Calview__AllTCAssignment_10_1_in_rule__Calview__Group_10__1__Impl7870);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3966:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3970:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3971:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__07904);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__07907);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3978:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3982:1: ( ( 'button' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3983:1: ( 'button' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3983:1: ( 'button' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3984:1: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Button__Group__0__Impl7935); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:3997:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4001:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4002:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__17966);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__2_in_rule__Button__Group__17969);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4009:1: rule__Button__Group__1__Impl : ( '{' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4013:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4014:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4014:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4015:1: '{'
            {
             before(grammarAccess.getButtonAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Button__Group__1__Impl7997); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4028:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4032:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4033:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28028);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28031);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4040:1: rule__Button__Group__2__Impl : ( ( rule__Button__Group_2__0 )? ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4044:1: ( ( ( rule__Button__Group_2__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4045:1: ( ( rule__Button__Group_2__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4045:1: ( ( rule__Button__Group_2__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4046:1: ( rule__Button__Group_2__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4047:1: ( rule__Button__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4047:2: rule__Button__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Button__Group_2__0_in_rule__Button__Group__2__Impl8058);
                    rule__Button__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_2()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4057:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4061:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4062:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38089);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38092);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4069:1: rule__Button__Group__3__Impl : ( 'icon' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4073:1: ( ( 'icon' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4074:1: ( 'icon' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4074:1: ( 'icon' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4075:1: 'icon'
            {
             before(grammarAccess.getButtonAccess().getIconKeyword_3()); 
            match(input,40,FOLLOW_40_in_rule__Button__Group__3__Impl8120); 
             after(grammarAccess.getButtonAccess().getIconKeyword_3()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4088:1: rule__Button__Group__4 : rule__Button__Group__4__Impl rule__Button__Group__5 ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4092:1: ( rule__Button__Group__4__Impl rule__Button__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4093:2: rule__Button__Group__4__Impl rule__Button__Group__5
            {
            pushFollow(FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48151);
            rule__Button__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48154);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4100:1: rule__Button__Group__4__Impl : ( ( rule__Button__IconAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4104:1: ( ( ( rule__Button__IconAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4105:1: ( ( rule__Button__IconAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4105:1: ( ( rule__Button__IconAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4106:1: ( rule__Button__IconAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getIconAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4107:1: ( rule__Button__IconAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4107:2: rule__Button__IconAssignment_4
            {
            pushFollow(FOLLOW_rule__Button__IconAssignment_4_in_rule__Button__Group__4__Impl8181);
            rule__Button__IconAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getIconAssignment_4()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4117:1: rule__Button__Group__5 : rule__Button__Group__5__Impl rule__Button__Group__6 ;
    public final void rule__Button__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4121:1: ( rule__Button__Group__5__Impl rule__Button__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4122:2: rule__Button__Group__5__Impl rule__Button__Group__6
            {
            pushFollow(FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58211);
            rule__Button__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__6_in_rule__Button__Group__58214);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4129:1: rule__Button__Group__5__Impl : ( 'class' ) ;
    public final void rule__Button__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4133:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4134:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4134:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4135:1: 'class'
            {
             before(grammarAccess.getButtonAccess().getClassKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__Button__Group__5__Impl8242); 
             after(grammarAccess.getButtonAccess().getClassKeyword_5()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4148:1: rule__Button__Group__6 : rule__Button__Group__6__Impl rule__Button__Group__7 ;
    public final void rule__Button__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4152:1: ( rule__Button__Group__6__Impl rule__Button__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4153:2: rule__Button__Group__6__Impl rule__Button__Group__7
            {
            pushFollow(FOLLOW_rule__Button__Group__6__Impl_in_rule__Button__Group__68273);
            rule__Button__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__7_in_rule__Button__Group__68276);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4160:1: rule__Button__Group__6__Impl : ( ( rule__Button__ClassAssignment_6 ) ) ;
    public final void rule__Button__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4164:1: ( ( ( rule__Button__ClassAssignment_6 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4165:1: ( ( rule__Button__ClassAssignment_6 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4165:1: ( ( rule__Button__ClassAssignment_6 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4166:1: ( rule__Button__ClassAssignment_6 )
            {
             before(grammarAccess.getButtonAccess().getClassAssignment_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4167:1: ( rule__Button__ClassAssignment_6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4167:2: rule__Button__ClassAssignment_6
            {
            pushFollow(FOLLOW_rule__Button__ClassAssignment_6_in_rule__Button__Group__6__Impl8303);
            rule__Button__ClassAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getClassAssignment_6()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4177:1: rule__Button__Group__7 : rule__Button__Group__7__Impl rule__Button__Group__8 ;
    public final void rule__Button__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4181:1: ( rule__Button__Group__7__Impl rule__Button__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4182:2: rule__Button__Group__7__Impl rule__Button__Group__8
            {
            pushFollow(FOLLOW_rule__Button__Group__7__Impl_in_rule__Button__Group__78333);
            rule__Button__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__8_in_rule__Button__Group__78336);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4189:1: rule__Button__Group__7__Impl : ( ( rule__Button__Group_7__0 )? ) ;
    public final void rule__Button__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4193:1: ( ( ( rule__Button__Group_7__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4194:1: ( ( rule__Button__Group_7__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4194:1: ( ( rule__Button__Group_7__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4195:1: ( rule__Button__Group_7__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4196:1: ( rule__Button__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4196:2: rule__Button__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Button__Group_7__0_in_rule__Button__Group__7__Impl8363);
                    rule__Button__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getGroup_7()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4206:1: rule__Button__Group__8 : rule__Button__Group__8__Impl rule__Button__Group__9 ;
    public final void rule__Button__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4210:1: ( rule__Button__Group__8__Impl rule__Button__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4211:2: rule__Button__Group__8__Impl rule__Button__Group__9
            {
            pushFollow(FOLLOW_rule__Button__Group__8__Impl_in_rule__Button__Group__88394);
            rule__Button__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__9_in_rule__Button__Group__88397);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4218:1: rule__Button__Group__8__Impl : ( ( rule__Button__Group_8__0 )? ) ;
    public final void rule__Button__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4222:1: ( ( ( rule__Button__Group_8__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4223:1: ( ( rule__Button__Group_8__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4223:1: ( ( rule__Button__Group_8__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4224:1: ( rule__Button__Group_8__0 )?
            {
             before(grammarAccess.getButtonAccess().getGroup_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4225:1: ( rule__Button__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4225:2: rule__Button__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Button__Group_8__0_in_rule__Button__Group__8__Impl8424);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4235:1: rule__Button__Group__9 : rule__Button__Group__9__Impl ;
    public final void rule__Button__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4239:1: ( rule__Button__Group__9__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4240:2: rule__Button__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__9__Impl_in_rule__Button__Group__98455);
            rule__Button__Group__9__Impl();

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4246:1: rule__Button__Group__9__Impl : ( '}' ) ;
    public final void rule__Button__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4250:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4251:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4251:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4252:1: '}'
            {
             before(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_25_in_rule__Button__Group__9__Impl8483); 
             after(grammarAccess.getButtonAccess().getRightCurlyBracketKeyword_9()); 

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


    // $ANTLR start "rule__Button__Group_2__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4285:1: rule__Button__Group_2__0 : rule__Button__Group_2__0__Impl rule__Button__Group_2__1 ;
    public final void rule__Button__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4289:1: ( rule__Button__Group_2__0__Impl rule__Button__Group_2__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4290:2: rule__Button__Group_2__0__Impl rule__Button__Group_2__1
            {
            pushFollow(FOLLOW_rule__Button__Group_2__0__Impl_in_rule__Button__Group_2__08534);
            rule__Button__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_2__1_in_rule__Button__Group_2__08537);
            rule__Button__Group_2__1();

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
    // $ANTLR end "rule__Button__Group_2__0"


    // $ANTLR start "rule__Button__Group_2__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4297:1: rule__Button__Group_2__0__Impl : ( 'url' ) ;
    public final void rule__Button__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4301:1: ( ( 'url' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4302:1: ( 'url' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4302:1: ( 'url' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4303:1: 'url'
            {
             before(grammarAccess.getButtonAccess().getUrlKeyword_2_0()); 
            match(input,47,FOLLOW_47_in_rule__Button__Group_2__0__Impl8565); 
             after(grammarAccess.getButtonAccess().getUrlKeyword_2_0()); 

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
    // $ANTLR end "rule__Button__Group_2__0__Impl"


    // $ANTLR start "rule__Button__Group_2__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4316:1: rule__Button__Group_2__1 : rule__Button__Group_2__1__Impl ;
    public final void rule__Button__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4320:1: ( rule__Button__Group_2__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4321:2: rule__Button__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_2__1__Impl_in_rule__Button__Group_2__18596);
            rule__Button__Group_2__1__Impl();

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
    // $ANTLR end "rule__Button__Group_2__1"


    // $ANTLR start "rule__Button__Group_2__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4327:1: rule__Button__Group_2__1__Impl : ( ( rule__Button__UrlAssignment_2_1 ) ) ;
    public final void rule__Button__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4331:1: ( ( ( rule__Button__UrlAssignment_2_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4332:1: ( ( rule__Button__UrlAssignment_2_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4332:1: ( ( rule__Button__UrlAssignment_2_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4333:1: ( rule__Button__UrlAssignment_2_1 )
            {
             before(grammarAccess.getButtonAccess().getUrlAssignment_2_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4334:1: ( rule__Button__UrlAssignment_2_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4334:2: rule__Button__UrlAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Button__UrlAssignment_2_1_in_rule__Button__Group_2__1__Impl8623);
            rule__Button__UrlAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getUrlAssignment_2_1()); 

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
    // $ANTLR end "rule__Button__Group_2__1__Impl"


    // $ANTLR start "rule__Button__Group_7__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4348:1: rule__Button__Group_7__0 : rule__Button__Group_7__0__Impl rule__Button__Group_7__1 ;
    public final void rule__Button__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4352:1: ( rule__Button__Group_7__0__Impl rule__Button__Group_7__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4353:2: rule__Button__Group_7__0__Impl rule__Button__Group_7__1
            {
            pushFollow(FOLLOW_rule__Button__Group_7__0__Impl_in_rule__Button__Group_7__08657);
            rule__Button__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_7__1_in_rule__Button__Group_7__08660);
            rule__Button__Group_7__1();

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
    // $ANTLR end "rule__Button__Group_7__0"


    // $ANTLR start "rule__Button__Group_7__0__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4360:1: rule__Button__Group_7__0__Impl : ( 'color' ) ;
    public final void rule__Button__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4364:1: ( ( 'color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4365:1: ( 'color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4365:1: ( 'color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4366:1: 'color'
            {
             before(grammarAccess.getButtonAccess().getColorKeyword_7_0()); 
            match(input,48,FOLLOW_48_in_rule__Button__Group_7__0__Impl8688); 
             after(grammarAccess.getButtonAccess().getColorKeyword_7_0()); 

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
    // $ANTLR end "rule__Button__Group_7__0__Impl"


    // $ANTLR start "rule__Button__Group_7__1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4379:1: rule__Button__Group_7__1 : rule__Button__Group_7__1__Impl ;
    public final void rule__Button__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4383:1: ( rule__Button__Group_7__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4384:2: rule__Button__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_7__1__Impl_in_rule__Button__Group_7__18719);
            rule__Button__Group_7__1__Impl();

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
    // $ANTLR end "rule__Button__Group_7__1"


    // $ANTLR start "rule__Button__Group_7__1__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4390:1: rule__Button__Group_7__1__Impl : ( ( rule__Button__ColorAssignment_7_1 ) ) ;
    public final void rule__Button__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4394:1: ( ( ( rule__Button__ColorAssignment_7_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4395:1: ( ( rule__Button__ColorAssignment_7_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4395:1: ( ( rule__Button__ColorAssignment_7_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4396:1: ( rule__Button__ColorAssignment_7_1 )
            {
             before(grammarAccess.getButtonAccess().getColorAssignment_7_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4397:1: ( rule__Button__ColorAssignment_7_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4397:2: rule__Button__ColorAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Button__ColorAssignment_7_1_in_rule__Button__Group_7__1__Impl8746);
            rule__Button__ColorAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getColorAssignment_7_1()); 

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
    // $ANTLR end "rule__Button__Group_7__1__Impl"


    // $ANTLR start "rule__Button__Group_8__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4411:1: rule__Button__Group_8__0 : rule__Button__Group_8__0__Impl rule__Button__Group_8__1 ;
    public final void rule__Button__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4415:1: ( rule__Button__Group_8__0__Impl rule__Button__Group_8__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4416:2: rule__Button__Group_8__0__Impl rule__Button__Group_8__1
            {
            pushFollow(FOLLOW_rule__Button__Group_8__0__Impl_in_rule__Button__Group_8__08780);
            rule__Button__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group_8__1_in_rule__Button__Group_8__08783);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4423:1: rule__Button__Group_8__0__Impl : ( 'background-color' ) ;
    public final void rule__Button__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4427:1: ( ( 'background-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4428:1: ( 'background-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4428:1: ( 'background-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4429:1: 'background-color'
            {
             before(grammarAccess.getButtonAccess().getBackgroundColorKeyword_8_0()); 
            match(input,49,FOLLOW_49_in_rule__Button__Group_8__0__Impl8811); 
             after(grammarAccess.getButtonAccess().getBackgroundColorKeyword_8_0()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4442:1: rule__Button__Group_8__1 : rule__Button__Group_8__1__Impl ;
    public final void rule__Button__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4446:1: ( rule__Button__Group_8__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4447:2: rule__Button__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group_8__1__Impl_in_rule__Button__Group_8__18842);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4453:1: rule__Button__Group_8__1__Impl : ( ( rule__Button__BackgroundColorAssignment_8_1 ) ) ;
    public final void rule__Button__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4457:1: ( ( ( rule__Button__BackgroundColorAssignment_8_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4458:1: ( ( rule__Button__BackgroundColorAssignment_8_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4458:1: ( ( rule__Button__BackgroundColorAssignment_8_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4459:1: ( rule__Button__BackgroundColorAssignment_8_1 )
            {
             before(grammarAccess.getButtonAccess().getBackgroundColorAssignment_8_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4460:1: ( rule__Button__BackgroundColorAssignment_8_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4460:2: rule__Button__BackgroundColorAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Button__BackgroundColorAssignment_8_1_in_rule__Button__Group_8__1__Impl8869);
            rule__Button__BackgroundColorAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getBackgroundColorAssignment_8_1()); 

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


    // $ANTLR start "rule__Symbol__Group__0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4474:1: rule__Symbol__Group__0 : rule__Symbol__Group__0__Impl rule__Symbol__Group__1 ;
    public final void rule__Symbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4478:1: ( rule__Symbol__Group__0__Impl rule__Symbol__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4479:2: rule__Symbol__Group__0__Impl rule__Symbol__Group__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group__0__Impl_in_rule__Symbol__Group__08903);
            rule__Symbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__1_in_rule__Symbol__Group__08906);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4486:1: rule__Symbol__Group__0__Impl : ( 'symbol' ) ;
    public final void rule__Symbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4490:1: ( ( 'symbol' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4491:1: ( 'symbol' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4491:1: ( 'symbol' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4492:1: 'symbol'
            {
             before(grammarAccess.getSymbolAccess().getSymbolKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Symbol__Group__0__Impl8934); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4505:1: rule__Symbol__Group__1 : rule__Symbol__Group__1__Impl rule__Symbol__Group__2 ;
    public final void rule__Symbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4509:1: ( rule__Symbol__Group__1__Impl rule__Symbol__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4510:2: rule__Symbol__Group__1__Impl rule__Symbol__Group__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group__1__Impl_in_rule__Symbol__Group__18965);
            rule__Symbol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__2_in_rule__Symbol__Group__18968);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4517:1: rule__Symbol__Group__1__Impl : ( '{' ) ;
    public final void rule__Symbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4521:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4522:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4522:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4523:1: '{'
            {
             before(grammarAccess.getSymbolAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Symbol__Group__1__Impl8996); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4536:1: rule__Symbol__Group__2 : rule__Symbol__Group__2__Impl rule__Symbol__Group__3 ;
    public final void rule__Symbol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4540:1: ( rule__Symbol__Group__2__Impl rule__Symbol__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4541:2: rule__Symbol__Group__2__Impl rule__Symbol__Group__3
            {
            pushFollow(FOLLOW_rule__Symbol__Group__2__Impl_in_rule__Symbol__Group__29027);
            rule__Symbol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__3_in_rule__Symbol__Group__29030);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4548:1: rule__Symbol__Group__2__Impl : ( ( rule__Symbol__DeviceAssignment_2 ) ) ;
    public final void rule__Symbol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4552:1: ( ( ( rule__Symbol__DeviceAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4553:1: ( ( rule__Symbol__DeviceAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4553:1: ( ( rule__Symbol__DeviceAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4554:1: ( rule__Symbol__DeviceAssignment_2 )
            {
             before(grammarAccess.getSymbolAccess().getDeviceAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4555:1: ( rule__Symbol__DeviceAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4555:2: rule__Symbol__DeviceAssignment_2
            {
            pushFollow(FOLLOW_rule__Symbol__DeviceAssignment_2_in_rule__Symbol__Group__2__Impl9057);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4565:1: rule__Symbol__Group__3 : rule__Symbol__Group__3__Impl rule__Symbol__Group__4 ;
    public final void rule__Symbol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4569:1: ( rule__Symbol__Group__3__Impl rule__Symbol__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4570:2: rule__Symbol__Group__3__Impl rule__Symbol__Group__4
            {
            pushFollow(FOLLOW_rule__Symbol__Group__3__Impl_in_rule__Symbol__Group__39087);
            rule__Symbol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__4_in_rule__Symbol__Group__39090);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4577:1: rule__Symbol__Group__3__Impl : ( 'get' ) ;
    public final void rule__Symbol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4581:1: ( ( 'get' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4582:1: ( 'get' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4582:1: ( 'get' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4583:1: 'get'
            {
             before(grammarAccess.getSymbolAccess().getGetKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Symbol__Group__3__Impl9118); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4596:1: rule__Symbol__Group__4 : rule__Symbol__Group__4__Impl rule__Symbol__Group__5 ;
    public final void rule__Symbol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4600:1: ( rule__Symbol__Group__4__Impl rule__Symbol__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4601:2: rule__Symbol__Group__4__Impl rule__Symbol__Group__5
            {
            pushFollow(FOLLOW_rule__Symbol__Group__4__Impl_in_rule__Symbol__Group__49149);
            rule__Symbol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__5_in_rule__Symbol__Group__49152);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4608:1: rule__Symbol__Group__4__Impl : ( ( rule__Symbol__GetAssignment_4 ) ) ;
    public final void rule__Symbol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4612:1: ( ( ( rule__Symbol__GetAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4613:1: ( ( rule__Symbol__GetAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4613:1: ( ( rule__Symbol__GetAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4614:1: ( rule__Symbol__GetAssignment_4 )
            {
             before(grammarAccess.getSymbolAccess().getGetAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4615:1: ( rule__Symbol__GetAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4615:2: rule__Symbol__GetAssignment_4
            {
            pushFollow(FOLLOW_rule__Symbol__GetAssignment_4_in_rule__Symbol__Group__4__Impl9179);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4625:1: rule__Symbol__Group__5 : rule__Symbol__Group__5__Impl rule__Symbol__Group__6 ;
    public final void rule__Symbol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4629:1: ( rule__Symbol__Group__5__Impl rule__Symbol__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4630:2: rule__Symbol__Group__5__Impl rule__Symbol__Group__6
            {
            pushFollow(FOLLOW_rule__Symbol__Group__5__Impl_in_rule__Symbol__Group__59209);
            rule__Symbol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__6_in_rule__Symbol__Group__59212);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4637:1: rule__Symbol__Group__5__Impl : ( 'getOn' ) ;
    public final void rule__Symbol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4641:1: ( ( 'getOn' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4642:1: ( 'getOn' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4642:1: ( 'getOn' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4643:1: 'getOn'
            {
             before(grammarAccess.getSymbolAccess().getGetOnKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Symbol__Group__5__Impl9240); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4656:1: rule__Symbol__Group__6 : rule__Symbol__Group__6__Impl rule__Symbol__Group__7 ;
    public final void rule__Symbol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4660:1: ( rule__Symbol__Group__6__Impl rule__Symbol__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4661:2: rule__Symbol__Group__6__Impl rule__Symbol__Group__7
            {
            pushFollow(FOLLOW_rule__Symbol__Group__6__Impl_in_rule__Symbol__Group__69271);
            rule__Symbol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__7_in_rule__Symbol__Group__69274);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4668:1: rule__Symbol__Group__6__Impl : ( ( rule__Symbol__GetOnAssignment_6 )* ) ;
    public final void rule__Symbol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4672:1: ( ( ( rule__Symbol__GetOnAssignment_6 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4673:1: ( ( rule__Symbol__GetOnAssignment_6 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4673:1: ( ( rule__Symbol__GetOnAssignment_6 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4674:1: ( rule__Symbol__GetOnAssignment_6 )*
            {
             before(grammarAccess.getSymbolAccess().getGetOnAssignment_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4675:1: ( rule__Symbol__GetOnAssignment_6 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4675:2: rule__Symbol__GetOnAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__GetOnAssignment_6_in_rule__Symbol__Group__6__Impl9301);
            	    rule__Symbol__GetOnAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4685:1: rule__Symbol__Group__7 : rule__Symbol__Group__7__Impl rule__Symbol__Group__8 ;
    public final void rule__Symbol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4689:1: ( rule__Symbol__Group__7__Impl rule__Symbol__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4690:2: rule__Symbol__Group__7__Impl rule__Symbol__Group__8
            {
            pushFollow(FOLLOW_rule__Symbol__Group__7__Impl_in_rule__Symbol__Group__79332);
            rule__Symbol__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__8_in_rule__Symbol__Group__79335);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4697:1: rule__Symbol__Group__7__Impl : ( ( rule__Symbol__Group_7__0 )? ) ;
    public final void rule__Symbol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4701:1: ( ( ( rule__Symbol__Group_7__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4702:1: ( ( rule__Symbol__Group_7__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4702:1: ( ( rule__Symbol__Group_7__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4703:1: ( rule__Symbol__Group_7__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4704:1: ( rule__Symbol__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4704:2: rule__Symbol__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_7__0_in_rule__Symbol__Group__7__Impl9362);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4714:1: rule__Symbol__Group__8 : rule__Symbol__Group__8__Impl rule__Symbol__Group__9 ;
    public final void rule__Symbol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4718:1: ( rule__Symbol__Group__8__Impl rule__Symbol__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4719:2: rule__Symbol__Group__8__Impl rule__Symbol__Group__9
            {
            pushFollow(FOLLOW_rule__Symbol__Group__8__Impl_in_rule__Symbol__Group__89393);
            rule__Symbol__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__9_in_rule__Symbol__Group__89396);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4726:1: rule__Symbol__Group__8__Impl : ( ( rule__Symbol__Group_8__0 )? ) ;
    public final void rule__Symbol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4730:1: ( ( ( rule__Symbol__Group_8__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4731:1: ( ( rule__Symbol__Group_8__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4731:1: ( ( rule__Symbol__Group_8__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4732:1: ( rule__Symbol__Group_8__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4733:1: ( rule__Symbol__Group_8__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4733:2: rule__Symbol__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_8__0_in_rule__Symbol__Group__8__Impl9423);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4743:1: rule__Symbol__Group__9 : rule__Symbol__Group__9__Impl rule__Symbol__Group__10 ;
    public final void rule__Symbol__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4747:1: ( rule__Symbol__Group__9__Impl rule__Symbol__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4748:2: rule__Symbol__Group__9__Impl rule__Symbol__Group__10
            {
            pushFollow(FOLLOW_rule__Symbol__Group__9__Impl_in_rule__Symbol__Group__99454);
            rule__Symbol__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__10_in_rule__Symbol__Group__99457);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4755:1: rule__Symbol__Group__9__Impl : ( ( rule__Symbol__Group_9__0 )? ) ;
    public final void rule__Symbol__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4759:1: ( ( ( rule__Symbol__Group_9__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4760:1: ( ( rule__Symbol__Group_9__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4760:1: ( ( rule__Symbol__Group_9__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4761:1: ( rule__Symbol__Group_9__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4762:1: ( rule__Symbol__Group_9__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4762:2: rule__Symbol__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_9__0_in_rule__Symbol__Group__9__Impl9484);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4772:1: rule__Symbol__Group__10 : rule__Symbol__Group__10__Impl rule__Symbol__Group__11 ;
    public final void rule__Symbol__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4776:1: ( rule__Symbol__Group__10__Impl rule__Symbol__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4777:2: rule__Symbol__Group__10__Impl rule__Symbol__Group__11
            {
            pushFollow(FOLLOW_rule__Symbol__Group__10__Impl_in_rule__Symbol__Group__109515);
            rule__Symbol__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__11_in_rule__Symbol__Group__109518);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4784:1: rule__Symbol__Group__10__Impl : ( ( rule__Symbol__Group_10__0 )? ) ;
    public final void rule__Symbol__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4788:1: ( ( ( rule__Symbol__Group_10__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4789:1: ( ( rule__Symbol__Group_10__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4789:1: ( ( rule__Symbol__Group_10__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4790:1: ( rule__Symbol__Group_10__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_10()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4791:1: ( rule__Symbol__Group_10__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4791:2: rule__Symbol__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_10__0_in_rule__Symbol__Group__10__Impl9545);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4801:1: rule__Symbol__Group__11 : rule__Symbol__Group__11__Impl rule__Symbol__Group__12 ;
    public final void rule__Symbol__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4805:1: ( rule__Symbol__Group__11__Impl rule__Symbol__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4806:2: rule__Symbol__Group__11__Impl rule__Symbol__Group__12
            {
            pushFollow(FOLLOW_rule__Symbol__Group__11__Impl_in_rule__Symbol__Group__119576);
            rule__Symbol__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__12_in_rule__Symbol__Group__119579);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4813:1: rule__Symbol__Group__11__Impl : ( ( rule__Symbol__Group_11__0 )? ) ;
    public final void rule__Symbol__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4817:1: ( ( ( rule__Symbol__Group_11__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4818:1: ( ( rule__Symbol__Group_11__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4818:1: ( ( rule__Symbol__Group_11__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4819:1: ( rule__Symbol__Group_11__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4820:1: ( rule__Symbol__Group_11__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4820:2: rule__Symbol__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_11__0_in_rule__Symbol__Group__11__Impl9606);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4830:1: rule__Symbol__Group__12 : rule__Symbol__Group__12__Impl rule__Symbol__Group__13 ;
    public final void rule__Symbol__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4834:1: ( rule__Symbol__Group__12__Impl rule__Symbol__Group__13 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4835:2: rule__Symbol__Group__12__Impl rule__Symbol__Group__13
            {
            pushFollow(FOLLOW_rule__Symbol__Group__12__Impl_in_rule__Symbol__Group__129637);
            rule__Symbol__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__13_in_rule__Symbol__Group__129640);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4842:1: rule__Symbol__Group__12__Impl : ( ( rule__Symbol__Group_12__0 )? ) ;
    public final void rule__Symbol__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4846:1: ( ( ( rule__Symbol__Group_12__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4847:1: ( ( rule__Symbol__Group_12__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4847:1: ( ( rule__Symbol__Group_12__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4848:1: ( rule__Symbol__Group_12__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_12()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4849:1: ( rule__Symbol__Group_12__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4849:2: rule__Symbol__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_12__0_in_rule__Symbol__Group__12__Impl9667);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4859:1: rule__Symbol__Group__13 : rule__Symbol__Group__13__Impl rule__Symbol__Group__14 ;
    public final void rule__Symbol__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4863:1: ( rule__Symbol__Group__13__Impl rule__Symbol__Group__14 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4864:2: rule__Symbol__Group__13__Impl rule__Symbol__Group__14
            {
            pushFollow(FOLLOW_rule__Symbol__Group__13__Impl_in_rule__Symbol__Group__139698);
            rule__Symbol__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__14_in_rule__Symbol__Group__139701);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4871:1: rule__Symbol__Group__13__Impl : ( ( rule__Symbol__Group_13__0 )? ) ;
    public final void rule__Symbol__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4875:1: ( ( ( rule__Symbol__Group_13__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4876:1: ( ( rule__Symbol__Group_13__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4876:1: ( ( rule__Symbol__Group_13__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4877:1: ( rule__Symbol__Group_13__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_13()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4878:1: ( rule__Symbol__Group_13__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==53) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4878:2: rule__Symbol__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_13__0_in_rule__Symbol__Group__13__Impl9728);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4888:1: rule__Symbol__Group__14 : rule__Symbol__Group__14__Impl rule__Symbol__Group__15 ;
    public final void rule__Symbol__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4892:1: ( rule__Symbol__Group__14__Impl rule__Symbol__Group__15 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4893:2: rule__Symbol__Group__14__Impl rule__Symbol__Group__15
            {
            pushFollow(FOLLOW_rule__Symbol__Group__14__Impl_in_rule__Symbol__Group__149759);
            rule__Symbol__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__15_in_rule__Symbol__Group__149762);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4900:1: rule__Symbol__Group__14__Impl : ( ( rule__Symbol__Group_14__0 )? ) ;
    public final void rule__Symbol__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4904:1: ( ( ( rule__Symbol__Group_14__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4905:1: ( ( rule__Symbol__Group_14__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4905:1: ( ( rule__Symbol__Group_14__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4906:1: ( rule__Symbol__Group_14__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_14()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4907:1: ( rule__Symbol__Group_14__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==56) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4907:2: rule__Symbol__Group_14__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_14__0_in_rule__Symbol__Group__14__Impl9789);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4917:1: rule__Symbol__Group__15 : rule__Symbol__Group__15__Impl rule__Symbol__Group__16 ;
    public final void rule__Symbol__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4921:1: ( rule__Symbol__Group__15__Impl rule__Symbol__Group__16 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4922:2: rule__Symbol__Group__15__Impl rule__Symbol__Group__16
            {
            pushFollow(FOLLOW_rule__Symbol__Group__15__Impl_in_rule__Symbol__Group__159820);
            rule__Symbol__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group__16_in_rule__Symbol__Group__159823);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4929:1: rule__Symbol__Group__15__Impl : ( ( rule__Symbol__Group_15__0 )? ) ;
    public final void rule__Symbol__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4933:1: ( ( ( rule__Symbol__Group_15__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4934:1: ( ( rule__Symbol__Group_15__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4934:1: ( ( rule__Symbol__Group_15__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4935:1: ( rule__Symbol__Group_15__0 )?
            {
             before(grammarAccess.getSymbolAccess().getGroup_15()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4936:1: ( rule__Symbol__Group_15__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4936:2: rule__Symbol__Group_15__0
                    {
                    pushFollow(FOLLOW_rule__Symbol__Group_15__0_in_rule__Symbol__Group__15__Impl9850);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4946:1: rule__Symbol__Group__16 : rule__Symbol__Group__16__Impl ;
    public final void rule__Symbol__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4950:1: ( rule__Symbol__Group__16__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4951:2: rule__Symbol__Group__16__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group__16__Impl_in_rule__Symbol__Group__169881);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4957:1: rule__Symbol__Group__16__Impl : ( '}' ) ;
    public final void rule__Symbol__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4961:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4962:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4962:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:4963:1: '}'
            {
             before(grammarAccess.getSymbolAccess().getRightCurlyBracketKeyword_16()); 
            match(input,25,FOLLOW_25_in_rule__Symbol__Group__16__Impl9909); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5010:1: rule__Symbol__Group_7__0 : rule__Symbol__Group_7__0__Impl rule__Symbol__Group_7__1 ;
    public final void rule__Symbol__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5014:1: ( rule__Symbol__Group_7__0__Impl rule__Symbol__Group_7__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5015:2: rule__Symbol__Group_7__0__Impl rule__Symbol__Group_7__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_7__0__Impl_in_rule__Symbol__Group_7__09974);
            rule__Symbol__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_7__1_in_rule__Symbol__Group_7__09977);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5022:1: rule__Symbol__Group_7__0__Impl : ( 'getOff' ) ;
    public final void rule__Symbol__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5026:1: ( ( 'getOff' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5027:1: ( 'getOff' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5027:1: ( 'getOff' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5028:1: 'getOff'
            {
             before(grammarAccess.getSymbolAccess().getGetOffKeyword_7_0()); 
            match(input,34,FOLLOW_34_in_rule__Symbol__Group_7__0__Impl10005); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5041:1: rule__Symbol__Group_7__1 : rule__Symbol__Group_7__1__Impl ;
    public final void rule__Symbol__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5045:1: ( rule__Symbol__Group_7__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5046:2: rule__Symbol__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_7__1__Impl_in_rule__Symbol__Group_7__110036);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5052:1: rule__Symbol__Group_7__1__Impl : ( ( rule__Symbol__GetOffAssignment_7_1 )* ) ;
    public final void rule__Symbol__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5056:1: ( ( ( rule__Symbol__GetOffAssignment_7_1 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5057:1: ( ( rule__Symbol__GetOffAssignment_7_1 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5057:1: ( ( rule__Symbol__GetOffAssignment_7_1 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5058:1: ( rule__Symbol__GetOffAssignment_7_1 )*
            {
             before(grammarAccess.getSymbolAccess().getGetOffAssignment_7_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5059:1: ( rule__Symbol__GetOffAssignment_7_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_STRING) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5059:2: rule__Symbol__GetOffAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__GetOffAssignment_7_1_in_rule__Symbol__Group_7__1__Impl10063);
            	    rule__Symbol__GetOffAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5073:1: rule__Symbol__Group_8__0 : rule__Symbol__Group_8__0__Impl rule__Symbol__Group_8__1 ;
    public final void rule__Symbol__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5077:1: ( rule__Symbol__Group_8__0__Impl rule__Symbol__Group_8__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5078:2: rule__Symbol__Group_8__0__Impl rule__Symbol__Group_8__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_8__0__Impl_in_rule__Symbol__Group_8__010098);
            rule__Symbol__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_8__1_in_rule__Symbol__Group_8__010101);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5085:1: rule__Symbol__Group_8__0__Impl : ( 'class' ) ;
    public final void rule__Symbol__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5089:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5090:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5090:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5091:1: 'class'
            {
             before(grammarAccess.getSymbolAccess().getClassKeyword_8_0()); 
            match(input,35,FOLLOW_35_in_rule__Symbol__Group_8__0__Impl10129); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5104:1: rule__Symbol__Group_8__1 : rule__Symbol__Group_8__1__Impl ;
    public final void rule__Symbol__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5108:1: ( rule__Symbol__Group_8__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5109:2: rule__Symbol__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_8__1__Impl_in_rule__Symbol__Group_8__110160);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5115:1: rule__Symbol__Group_8__1__Impl : ( ( rule__Symbol__ClassAssignment_8_1 ) ) ;
    public final void rule__Symbol__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5119:1: ( ( ( rule__Symbol__ClassAssignment_8_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5120:1: ( ( rule__Symbol__ClassAssignment_8_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5120:1: ( ( rule__Symbol__ClassAssignment_8_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5121:1: ( rule__Symbol__ClassAssignment_8_1 )
            {
             before(grammarAccess.getSymbolAccess().getClassAssignment_8_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5122:1: ( rule__Symbol__ClassAssignment_8_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5122:2: rule__Symbol__ClassAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Symbol__ClassAssignment_8_1_in_rule__Symbol__Group_8__1__Impl10187);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5136:1: rule__Symbol__Group_9__0 : rule__Symbol__Group_9__0__Impl rule__Symbol__Group_9__1 ;
    public final void rule__Symbol__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5140:1: ( rule__Symbol__Group_9__0__Impl rule__Symbol__Group_9__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5141:2: rule__Symbol__Group_9__0__Impl rule__Symbol__Group_9__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_9__0__Impl_in_rule__Symbol__Group_9__010221);
            rule__Symbol__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_9__1_in_rule__Symbol__Group_9__010224);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5148:1: rule__Symbol__Group_9__0__Impl : ( 'background-icon' ) ;
    public final void rule__Symbol__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5152:1: ( ( 'background-icon' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5153:1: ( 'background-icon' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5153:1: ( 'background-icon' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5154:1: 'background-icon'
            {
             before(grammarAccess.getSymbolAccess().getBackgroundIconKeyword_9_0()); 
            match(input,39,FOLLOW_39_in_rule__Symbol__Group_9__0__Impl10252); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5167:1: rule__Symbol__Group_9__1 : rule__Symbol__Group_9__1__Impl ;
    public final void rule__Symbol__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5171:1: ( rule__Symbol__Group_9__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5172:2: rule__Symbol__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_9__1__Impl_in_rule__Symbol__Group_9__110283);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5178:1: rule__Symbol__Group_9__1__Impl : ( ( rule__Symbol__BgiconAssignment_9_1 ) ) ;
    public final void rule__Symbol__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5182:1: ( ( ( rule__Symbol__BgiconAssignment_9_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5183:1: ( ( rule__Symbol__BgiconAssignment_9_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5183:1: ( ( rule__Symbol__BgiconAssignment_9_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5184:1: ( rule__Symbol__BgiconAssignment_9_1 )
            {
             before(grammarAccess.getSymbolAccess().getBgiconAssignment_9_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5185:1: ( rule__Symbol__BgiconAssignment_9_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5185:2: rule__Symbol__BgiconAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Symbol__BgiconAssignment_9_1_in_rule__Symbol__Group_9__1__Impl10310);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5199:1: rule__Symbol__Group_10__0 : rule__Symbol__Group_10__0__Impl rule__Symbol__Group_10__1 ;
    public final void rule__Symbol__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5203:1: ( rule__Symbol__Group_10__0__Impl rule__Symbol__Group_10__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5204:2: rule__Symbol__Group_10__0__Impl rule__Symbol__Group_10__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_10__0__Impl_in_rule__Symbol__Group_10__010344);
            rule__Symbol__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_10__1_in_rule__Symbol__Group_10__010347);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5211:1: rule__Symbol__Group_10__0__Impl : ( 'background-on-color' ) ;
    public final void rule__Symbol__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5215:1: ( ( 'background-on-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5216:1: ( 'background-on-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5216:1: ( 'background-on-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5217:1: 'background-on-color'
            {
             before(grammarAccess.getSymbolAccess().getBackgroundOnColorKeyword_10_0()); 
            match(input,38,FOLLOW_38_in_rule__Symbol__Group_10__0__Impl10375); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5230:1: rule__Symbol__Group_10__1 : rule__Symbol__Group_10__1__Impl ;
    public final void rule__Symbol__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5234:1: ( rule__Symbol__Group_10__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5235:2: rule__Symbol__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_10__1__Impl_in_rule__Symbol__Group_10__110406);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5241:1: rule__Symbol__Group_10__1__Impl : ( ( rule__Symbol__OnBackGroundColorAssignment_10_1 ) ) ;
    public final void rule__Symbol__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5245:1: ( ( ( rule__Symbol__OnBackGroundColorAssignment_10_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5246:1: ( ( rule__Symbol__OnBackGroundColorAssignment_10_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5246:1: ( ( rule__Symbol__OnBackGroundColorAssignment_10_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5247:1: ( rule__Symbol__OnBackGroundColorAssignment_10_1 )
            {
             before(grammarAccess.getSymbolAccess().getOnBackGroundColorAssignment_10_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5248:1: ( rule__Symbol__OnBackGroundColorAssignment_10_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5248:2: rule__Symbol__OnBackGroundColorAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Symbol__OnBackGroundColorAssignment_10_1_in_rule__Symbol__Group_10__1__Impl10433);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5262:1: rule__Symbol__Group_11__0 : rule__Symbol__Group_11__0__Impl rule__Symbol__Group_11__1 ;
    public final void rule__Symbol__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5266:1: ( rule__Symbol__Group_11__0__Impl rule__Symbol__Group_11__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5267:2: rule__Symbol__Group_11__0__Impl rule__Symbol__Group_11__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_11__0__Impl_in_rule__Symbol__Group_11__010467);
            rule__Symbol__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_11__1_in_rule__Symbol__Group_11__010470);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5274:1: rule__Symbol__Group_11__0__Impl : ( 'on-color' ) ;
    public final void rule__Symbol__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5278:1: ( ( 'on-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5279:1: ( 'on-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5279:1: ( 'on-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5280:1: 'on-color'
            {
             before(grammarAccess.getSymbolAccess().getOnColorKeyword_11_0()); 
            match(input,51,FOLLOW_51_in_rule__Symbol__Group_11__0__Impl10498); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5293:1: rule__Symbol__Group_11__1 : rule__Symbol__Group_11__1__Impl ;
    public final void rule__Symbol__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5297:1: ( rule__Symbol__Group_11__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5298:2: rule__Symbol__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_11__1__Impl_in_rule__Symbol__Group_11__110529);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5304:1: rule__Symbol__Group_11__1__Impl : ( ( rule__Symbol__OnColorAssignment_11_1 ) ) ;
    public final void rule__Symbol__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5308:1: ( ( ( rule__Symbol__OnColorAssignment_11_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5309:1: ( ( rule__Symbol__OnColorAssignment_11_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5309:1: ( ( rule__Symbol__OnColorAssignment_11_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5310:1: ( rule__Symbol__OnColorAssignment_11_1 )
            {
             before(grammarAccess.getSymbolAccess().getOnColorAssignment_11_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5311:1: ( rule__Symbol__OnColorAssignment_11_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5311:2: rule__Symbol__OnColorAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Symbol__OnColorAssignment_11_1_in_rule__Symbol__Group_11__1__Impl10556);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5325:1: rule__Symbol__Group_12__0 : rule__Symbol__Group_12__0__Impl rule__Symbol__Group_12__1 ;
    public final void rule__Symbol__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5329:1: ( rule__Symbol__Group_12__0__Impl rule__Symbol__Group_12__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5330:2: rule__Symbol__Group_12__0__Impl rule__Symbol__Group_12__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_12__0__Impl_in_rule__Symbol__Group_12__010590);
            rule__Symbol__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_12__1_in_rule__Symbol__Group_12__010593);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5337:1: rule__Symbol__Group_12__0__Impl : ( 'off-color' ) ;
    public final void rule__Symbol__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5341:1: ( ( 'off-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5342:1: ( 'off-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5342:1: ( 'off-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5343:1: 'off-color'
            {
             before(grammarAccess.getSymbolAccess().getOffColorKeyword_12_0()); 
            match(input,52,FOLLOW_52_in_rule__Symbol__Group_12__0__Impl10621); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5356:1: rule__Symbol__Group_12__1 : rule__Symbol__Group_12__1__Impl ;
    public final void rule__Symbol__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5360:1: ( rule__Symbol__Group_12__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5361:2: rule__Symbol__Group_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_12__1__Impl_in_rule__Symbol__Group_12__110652);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5367:1: rule__Symbol__Group_12__1__Impl : ( ( rule__Symbol__OffColorAssignment_12_1 ) ) ;
    public final void rule__Symbol__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5371:1: ( ( ( rule__Symbol__OffColorAssignment_12_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5372:1: ( ( rule__Symbol__OffColorAssignment_12_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5372:1: ( ( rule__Symbol__OffColorAssignment_12_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5373:1: ( rule__Symbol__OffColorAssignment_12_1 )
            {
             before(grammarAccess.getSymbolAccess().getOffColorAssignment_12_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5374:1: ( rule__Symbol__OffColorAssignment_12_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5374:2: rule__Symbol__OffColorAssignment_12_1
            {
            pushFollow(FOLLOW_rule__Symbol__OffColorAssignment_12_1_in_rule__Symbol__Group_12__1__Impl10679);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5388:1: rule__Symbol__Group_13__0 : rule__Symbol__Group_13__0__Impl rule__Symbol__Group_13__1 ;
    public final void rule__Symbol__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5392:1: ( rule__Symbol__Group_13__0__Impl rule__Symbol__Group_13__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5393:2: rule__Symbol__Group_13__0__Impl rule__Symbol__Group_13__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_13__0__Impl_in_rule__Symbol__Group_13__010713);
            rule__Symbol__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_13__1_in_rule__Symbol__Group_13__010716);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5400:1: rule__Symbol__Group_13__0__Impl : ( 'icons' ) ;
    public final void rule__Symbol__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5404:1: ( ( 'icons' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5405:1: ( 'icons' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5405:1: ( 'icons' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5406:1: 'icons'
            {
             before(grammarAccess.getSymbolAccess().getIconsKeyword_13_0()); 
            match(input,53,FOLLOW_53_in_rule__Symbol__Group_13__0__Impl10744); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5419:1: rule__Symbol__Group_13__1 : rule__Symbol__Group_13__1__Impl rule__Symbol__Group_13__2 ;
    public final void rule__Symbol__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5423:1: ( rule__Symbol__Group_13__1__Impl rule__Symbol__Group_13__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5424:2: rule__Symbol__Group_13__1__Impl rule__Symbol__Group_13__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group_13__1__Impl_in_rule__Symbol__Group_13__110775);
            rule__Symbol__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_13__2_in_rule__Symbol__Group_13__110778);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5431:1: rule__Symbol__Group_13__1__Impl : ( '[' ) ;
    public final void rule__Symbol__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5435:1: ( ( '[' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5436:1: ( '[' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5436:1: ( '[' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5437:1: '['
            {
             before(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_13_1()); 
            match(input,54,FOLLOW_54_in_rule__Symbol__Group_13__1__Impl10806); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5450:1: rule__Symbol__Group_13__2 : rule__Symbol__Group_13__2__Impl rule__Symbol__Group_13__3 ;
    public final void rule__Symbol__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5454:1: ( rule__Symbol__Group_13__2__Impl rule__Symbol__Group_13__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5455:2: rule__Symbol__Group_13__2__Impl rule__Symbol__Group_13__3
            {
            pushFollow(FOLLOW_rule__Symbol__Group_13__2__Impl_in_rule__Symbol__Group_13__210837);
            rule__Symbol__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_13__3_in_rule__Symbol__Group_13__210840);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5462:1: rule__Symbol__Group_13__2__Impl : ( ( rule__Symbol__IconsAssignment_13_2 )* ) ;
    public final void rule__Symbol__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5466:1: ( ( ( rule__Symbol__IconsAssignment_13_2 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5467:1: ( ( rule__Symbol__IconsAssignment_13_2 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5467:1: ( ( rule__Symbol__IconsAssignment_13_2 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5468:1: ( rule__Symbol__IconsAssignment_13_2 )*
            {
             before(grammarAccess.getSymbolAccess().getIconsAssignment_13_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5469:1: ( rule__Symbol__IconsAssignment_13_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_STRING) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5469:2: rule__Symbol__IconsAssignment_13_2
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__IconsAssignment_13_2_in_rule__Symbol__Group_13__2__Impl10867);
            	    rule__Symbol__IconsAssignment_13_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5479:1: rule__Symbol__Group_13__3 : rule__Symbol__Group_13__3__Impl ;
    public final void rule__Symbol__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5483:1: ( rule__Symbol__Group_13__3__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5484:2: rule__Symbol__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_13__3__Impl_in_rule__Symbol__Group_13__310898);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5490:1: rule__Symbol__Group_13__3__Impl : ( ']' ) ;
    public final void rule__Symbol__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5494:1: ( ( ']' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5495:1: ( ']' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5495:1: ( ']' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5496:1: ']'
            {
             before(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_13_3()); 
            match(input,55,FOLLOW_55_in_rule__Symbol__Group_13__3__Impl10926); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5517:1: rule__Symbol__Group_14__0 : rule__Symbol__Group_14__0__Impl rule__Symbol__Group_14__1 ;
    public final void rule__Symbol__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5521:1: ( rule__Symbol__Group_14__0__Impl rule__Symbol__Group_14__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5522:2: rule__Symbol__Group_14__0__Impl rule__Symbol__Group_14__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_14__0__Impl_in_rule__Symbol__Group_14__010965);
            rule__Symbol__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_14__1_in_rule__Symbol__Group_14__010968);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5529:1: rule__Symbol__Group_14__0__Impl : ( 'onColors' ) ;
    public final void rule__Symbol__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5533:1: ( ( 'onColors' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5534:1: ( 'onColors' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5534:1: ( 'onColors' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5535:1: 'onColors'
            {
             before(grammarAccess.getSymbolAccess().getOnColorsKeyword_14_0()); 
            match(input,56,FOLLOW_56_in_rule__Symbol__Group_14__0__Impl10996); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5548:1: rule__Symbol__Group_14__1 : rule__Symbol__Group_14__1__Impl rule__Symbol__Group_14__2 ;
    public final void rule__Symbol__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5552:1: ( rule__Symbol__Group_14__1__Impl rule__Symbol__Group_14__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5553:2: rule__Symbol__Group_14__1__Impl rule__Symbol__Group_14__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group_14__1__Impl_in_rule__Symbol__Group_14__111027);
            rule__Symbol__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_14__2_in_rule__Symbol__Group_14__111030);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5560:1: rule__Symbol__Group_14__1__Impl : ( '[' ) ;
    public final void rule__Symbol__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5564:1: ( ( '[' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5565:1: ( '[' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5565:1: ( '[' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5566:1: '['
            {
             before(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_14_1()); 
            match(input,54,FOLLOW_54_in_rule__Symbol__Group_14__1__Impl11058); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5579:1: rule__Symbol__Group_14__2 : rule__Symbol__Group_14__2__Impl rule__Symbol__Group_14__3 ;
    public final void rule__Symbol__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5583:1: ( rule__Symbol__Group_14__2__Impl rule__Symbol__Group_14__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5584:2: rule__Symbol__Group_14__2__Impl rule__Symbol__Group_14__3
            {
            pushFollow(FOLLOW_rule__Symbol__Group_14__2__Impl_in_rule__Symbol__Group_14__211089);
            rule__Symbol__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_14__3_in_rule__Symbol__Group_14__211092);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5591:1: rule__Symbol__Group_14__2__Impl : ( ( rule__Symbol__OnColorsAssignment_14_2 )* ) ;
    public final void rule__Symbol__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5595:1: ( ( ( rule__Symbol__OnColorsAssignment_14_2 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5596:1: ( ( rule__Symbol__OnColorsAssignment_14_2 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5596:1: ( ( rule__Symbol__OnColorsAssignment_14_2 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5597:1: ( rule__Symbol__OnColorsAssignment_14_2 )*
            {
             before(grammarAccess.getSymbolAccess().getOnColorsAssignment_14_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5598:1: ( rule__Symbol__OnColorsAssignment_14_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5598:2: rule__Symbol__OnColorsAssignment_14_2
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__OnColorsAssignment_14_2_in_rule__Symbol__Group_14__2__Impl11119);
            	    rule__Symbol__OnColorsAssignment_14_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5608:1: rule__Symbol__Group_14__3 : rule__Symbol__Group_14__3__Impl ;
    public final void rule__Symbol__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5612:1: ( rule__Symbol__Group_14__3__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5613:2: rule__Symbol__Group_14__3__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_14__3__Impl_in_rule__Symbol__Group_14__311150);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5619:1: rule__Symbol__Group_14__3__Impl : ( ']' ) ;
    public final void rule__Symbol__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5623:1: ( ( ']' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5624:1: ( ']' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5624:1: ( ']' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5625:1: ']'
            {
             before(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_14_3()); 
            match(input,55,FOLLOW_55_in_rule__Symbol__Group_14__3__Impl11178); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5646:1: rule__Symbol__Group_15__0 : rule__Symbol__Group_15__0__Impl rule__Symbol__Group_15__1 ;
    public final void rule__Symbol__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5650:1: ( rule__Symbol__Group_15__0__Impl rule__Symbol__Group_15__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5651:2: rule__Symbol__Group_15__0__Impl rule__Symbol__Group_15__1
            {
            pushFollow(FOLLOW_rule__Symbol__Group_15__0__Impl_in_rule__Symbol__Group_15__011217);
            rule__Symbol__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_15__1_in_rule__Symbol__Group_15__011220);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5658:1: rule__Symbol__Group_15__0__Impl : ( 'onBackgroundColors' ) ;
    public final void rule__Symbol__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5662:1: ( ( 'onBackgroundColors' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5663:1: ( 'onBackgroundColors' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5663:1: ( 'onBackgroundColors' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5664:1: 'onBackgroundColors'
            {
             before(grammarAccess.getSymbolAccess().getOnBackgroundColorsKeyword_15_0()); 
            match(input,57,FOLLOW_57_in_rule__Symbol__Group_15__0__Impl11248); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5677:1: rule__Symbol__Group_15__1 : rule__Symbol__Group_15__1__Impl rule__Symbol__Group_15__2 ;
    public final void rule__Symbol__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5681:1: ( rule__Symbol__Group_15__1__Impl rule__Symbol__Group_15__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5682:2: rule__Symbol__Group_15__1__Impl rule__Symbol__Group_15__2
            {
            pushFollow(FOLLOW_rule__Symbol__Group_15__1__Impl_in_rule__Symbol__Group_15__111279);
            rule__Symbol__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_15__2_in_rule__Symbol__Group_15__111282);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5689:1: rule__Symbol__Group_15__1__Impl : ( '[' ) ;
    public final void rule__Symbol__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5693:1: ( ( '[' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5694:1: ( '[' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5694:1: ( '[' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5695:1: '['
            {
             before(grammarAccess.getSymbolAccess().getLeftSquareBracketKeyword_15_1()); 
            match(input,54,FOLLOW_54_in_rule__Symbol__Group_15__1__Impl11310); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5708:1: rule__Symbol__Group_15__2 : rule__Symbol__Group_15__2__Impl rule__Symbol__Group_15__3 ;
    public final void rule__Symbol__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5712:1: ( rule__Symbol__Group_15__2__Impl rule__Symbol__Group_15__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5713:2: rule__Symbol__Group_15__2__Impl rule__Symbol__Group_15__3
            {
            pushFollow(FOLLOW_rule__Symbol__Group_15__2__Impl_in_rule__Symbol__Group_15__211341);
            rule__Symbol__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Symbol__Group_15__3_in_rule__Symbol__Group_15__211344);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5720:1: rule__Symbol__Group_15__2__Impl : ( ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )* ) ;
    public final void rule__Symbol__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5724:1: ( ( ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5725:1: ( ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5725:1: ( ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5726:1: ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )*
            {
             before(grammarAccess.getSymbolAccess().getOnBackgroundColorsAssignment_15_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5727:1: ( rule__Symbol__OnBackgroundColorsAssignment_15_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5727:2: rule__Symbol__OnBackgroundColorsAssignment_15_2
            	    {
            	    pushFollow(FOLLOW_rule__Symbol__OnBackgroundColorsAssignment_15_2_in_rule__Symbol__Group_15__2__Impl11371);
            	    rule__Symbol__OnBackgroundColorsAssignment_15_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5737:1: rule__Symbol__Group_15__3 : rule__Symbol__Group_15__3__Impl ;
    public final void rule__Symbol__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5741:1: ( rule__Symbol__Group_15__3__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5742:2: rule__Symbol__Group_15__3__Impl
            {
            pushFollow(FOLLOW_rule__Symbol__Group_15__3__Impl_in_rule__Symbol__Group_15__311402);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5748:1: rule__Symbol__Group_15__3__Impl : ( ']' ) ;
    public final void rule__Symbol__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5752:1: ( ( ']' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5753:1: ( ']' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5753:1: ( ']' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5754:1: ']'
            {
             before(grammarAccess.getSymbolAccess().getRightSquareBracketKeyword_15_3()); 
            match(input,55,FOLLOW_55_in_rule__Symbol__Group_15__3__Impl11430); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5775:1: rule__SimpleClock__Group__0 : rule__SimpleClock__Group__0__Impl rule__SimpleClock__Group__1 ;
    public final void rule__SimpleClock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5779:1: ( rule__SimpleClock__Group__0__Impl rule__SimpleClock__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5780:2: rule__SimpleClock__Group__0__Impl rule__SimpleClock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__0__Impl_in_rule__SimpleClock__Group__011469);
            rule__SimpleClock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__1_in_rule__SimpleClock__Group__011472);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5787:1: rule__SimpleClock__Group__0__Impl : ( 'SimpleClock' ) ;
    public final void rule__SimpleClock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5791:1: ( ( 'SimpleClock' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5792:1: ( 'SimpleClock' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5792:1: ( 'SimpleClock' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5793:1: 'SimpleClock'
            {
             before(grammarAccess.getSimpleClockAccess().getSimpleClockKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__SimpleClock__Group__0__Impl11500); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5806:1: rule__SimpleClock__Group__1 : rule__SimpleClock__Group__1__Impl rule__SimpleClock__Group__2 ;
    public final void rule__SimpleClock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5810:1: ( rule__SimpleClock__Group__1__Impl rule__SimpleClock__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5811:2: rule__SimpleClock__Group__1__Impl rule__SimpleClock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__1__Impl_in_rule__SimpleClock__Group__111531);
            rule__SimpleClock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__2_in_rule__SimpleClock__Group__111534);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5818:1: rule__SimpleClock__Group__1__Impl : ( '{' ) ;
    public final void rule__SimpleClock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5822:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5823:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5823:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5824:1: '{'
            {
             before(grammarAccess.getSimpleClockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__SimpleClock__Group__1__Impl11562); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5837:1: rule__SimpleClock__Group__2 : rule__SimpleClock__Group__2__Impl rule__SimpleClock__Group__3 ;
    public final void rule__SimpleClock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5841:1: ( rule__SimpleClock__Group__2__Impl rule__SimpleClock__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5842:2: rule__SimpleClock__Group__2__Impl rule__SimpleClock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__2__Impl_in_rule__SimpleClock__Group__211593);
            rule__SimpleClock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__3_in_rule__SimpleClock__Group__211596);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5849:1: rule__SimpleClock__Group__2__Impl : ( ( rule__SimpleClock__IdAssignment_2 )? ) ;
    public final void rule__SimpleClock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5853:1: ( ( ( rule__SimpleClock__IdAssignment_2 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5854:1: ( ( rule__SimpleClock__IdAssignment_2 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5854:1: ( ( rule__SimpleClock__IdAssignment_2 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5855:1: ( rule__SimpleClock__IdAssignment_2 )?
            {
             before(grammarAccess.getSimpleClockAccess().getIdAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5856:1: ( rule__SimpleClock__IdAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5856:2: rule__SimpleClock__IdAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__IdAssignment_2_in_rule__SimpleClock__Group__2__Impl11623);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5866:1: rule__SimpleClock__Group__3 : rule__SimpleClock__Group__3__Impl rule__SimpleClock__Group__4 ;
    public final void rule__SimpleClock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5870:1: ( rule__SimpleClock__Group__3__Impl rule__SimpleClock__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5871:2: rule__SimpleClock__Group__3__Impl rule__SimpleClock__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__3__Impl_in_rule__SimpleClock__Group__311654);
            rule__SimpleClock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__4_in_rule__SimpleClock__Group__311657);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5878:1: rule__SimpleClock__Group__3__Impl : ( 'date-format' ) ;
    public final void rule__SimpleClock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5882:1: ( ( 'date-format' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5883:1: ( 'date-format' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5883:1: ( 'date-format' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5884:1: 'date-format'
            {
             before(grammarAccess.getSimpleClockAccess().getDateFormatKeyword_3()); 
            match(input,59,FOLLOW_59_in_rule__SimpleClock__Group__3__Impl11685); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5897:1: rule__SimpleClock__Group__4 : rule__SimpleClock__Group__4__Impl rule__SimpleClock__Group__5 ;
    public final void rule__SimpleClock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5901:1: ( rule__SimpleClock__Group__4__Impl rule__SimpleClock__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5902:2: rule__SimpleClock__Group__4__Impl rule__SimpleClock__Group__5
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__4__Impl_in_rule__SimpleClock__Group__411716);
            rule__SimpleClock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__5_in_rule__SimpleClock__Group__411719);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5909:1: rule__SimpleClock__Group__4__Impl : ( ( rule__SimpleClock__DateFormatAssignment_4 ) ) ;
    public final void rule__SimpleClock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5913:1: ( ( ( rule__SimpleClock__DateFormatAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5914:1: ( ( rule__SimpleClock__DateFormatAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5914:1: ( ( rule__SimpleClock__DateFormatAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5915:1: ( rule__SimpleClock__DateFormatAssignment_4 )
            {
             before(grammarAccess.getSimpleClockAccess().getDateFormatAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5916:1: ( rule__SimpleClock__DateFormatAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5916:2: rule__SimpleClock__DateFormatAssignment_4
            {
            pushFollow(FOLLOW_rule__SimpleClock__DateFormatAssignment_4_in_rule__SimpleClock__Group__4__Impl11746);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5926:1: rule__SimpleClock__Group__5 : rule__SimpleClock__Group__5__Impl rule__SimpleClock__Group__6 ;
    public final void rule__SimpleClock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5930:1: ( rule__SimpleClock__Group__5__Impl rule__SimpleClock__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5931:2: rule__SimpleClock__Group__5__Impl rule__SimpleClock__Group__6
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__5__Impl_in_rule__SimpleClock__Group__511776);
            rule__SimpleClock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__6_in_rule__SimpleClock__Group__511779);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5938:1: rule__SimpleClock__Group__5__Impl : ( 'time-format' ) ;
    public final void rule__SimpleClock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5942:1: ( ( 'time-format' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5943:1: ( 'time-format' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5943:1: ( 'time-format' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5944:1: 'time-format'
            {
             before(grammarAccess.getSimpleClockAccess().getTimeFormatKeyword_5()); 
            match(input,60,FOLLOW_60_in_rule__SimpleClock__Group__5__Impl11807); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5957:1: rule__SimpleClock__Group__6 : rule__SimpleClock__Group__6__Impl rule__SimpleClock__Group__7 ;
    public final void rule__SimpleClock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5961:1: ( rule__SimpleClock__Group__6__Impl rule__SimpleClock__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5962:2: rule__SimpleClock__Group__6__Impl rule__SimpleClock__Group__7
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__6__Impl_in_rule__SimpleClock__Group__611838);
            rule__SimpleClock__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__7_in_rule__SimpleClock__Group__611841);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5969:1: rule__SimpleClock__Group__6__Impl : ( ( rule__SimpleClock__TimeFormatAssignment_6 ) ) ;
    public final void rule__SimpleClock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5973:1: ( ( ( rule__SimpleClock__TimeFormatAssignment_6 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5974:1: ( ( rule__SimpleClock__TimeFormatAssignment_6 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5974:1: ( ( rule__SimpleClock__TimeFormatAssignment_6 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5975:1: ( rule__SimpleClock__TimeFormatAssignment_6 )
            {
             before(grammarAccess.getSimpleClockAccess().getTimeFormatAssignment_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5976:1: ( rule__SimpleClock__TimeFormatAssignment_6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5976:2: rule__SimpleClock__TimeFormatAssignment_6
            {
            pushFollow(FOLLOW_rule__SimpleClock__TimeFormatAssignment_6_in_rule__SimpleClock__Group__6__Impl11868);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5986:1: rule__SimpleClock__Group__7 : rule__SimpleClock__Group__7__Impl rule__SimpleClock__Group__8 ;
    public final void rule__SimpleClock__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5990:1: ( rule__SimpleClock__Group__7__Impl rule__SimpleClock__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5991:2: rule__SimpleClock__Group__7__Impl rule__SimpleClock__Group__8
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__7__Impl_in_rule__SimpleClock__Group__711898);
            rule__SimpleClock__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__8_in_rule__SimpleClock__Group__711901);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:5998:1: rule__SimpleClock__Group__7__Impl : ( ( rule__SimpleClock__Group_7__0 )? ) ;
    public final void rule__SimpleClock__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6002:1: ( ( ( rule__SimpleClock__Group_7__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6003:1: ( ( rule__SimpleClock__Group_7__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6003:1: ( ( rule__SimpleClock__Group_7__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6004:1: ( rule__SimpleClock__Group_7__0 )?
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6005:1: ( rule__SimpleClock__Group_7__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6005:2: rule__SimpleClock__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__Group_7__0_in_rule__SimpleClock__Group__7__Impl11928);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6015:1: rule__SimpleClock__Group__8 : rule__SimpleClock__Group__8__Impl rule__SimpleClock__Group__9 ;
    public final void rule__SimpleClock__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6019:1: ( rule__SimpleClock__Group__8__Impl rule__SimpleClock__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6020:2: rule__SimpleClock__Group__8__Impl rule__SimpleClock__Group__9
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__8__Impl_in_rule__SimpleClock__Group__811959);
            rule__SimpleClock__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__9_in_rule__SimpleClock__Group__811962);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6027:1: rule__SimpleClock__Group__8__Impl : ( ( rule__SimpleClock__Group_8__0 )? ) ;
    public final void rule__SimpleClock__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6031:1: ( ( ( rule__SimpleClock__Group_8__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6032:1: ( ( rule__SimpleClock__Group_8__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6032:1: ( ( rule__SimpleClock__Group_8__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6033:1: ( rule__SimpleClock__Group_8__0 )?
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_8()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6034:1: ( rule__SimpleClock__Group_8__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6034:2: rule__SimpleClock__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__Group_8__0_in_rule__SimpleClock__Group__8__Impl11989);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6044:1: rule__SimpleClock__Group__9 : rule__SimpleClock__Group__9__Impl rule__SimpleClock__Group__10 ;
    public final void rule__SimpleClock__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6048:1: ( rule__SimpleClock__Group__9__Impl rule__SimpleClock__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6049:2: rule__SimpleClock__Group__9__Impl rule__SimpleClock__Group__10
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__9__Impl_in_rule__SimpleClock__Group__912020);
            rule__SimpleClock__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__10_in_rule__SimpleClock__Group__912023);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6056:1: rule__SimpleClock__Group__9__Impl : ( ( rule__SimpleClock__Group_9__0 )? ) ;
    public final void rule__SimpleClock__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6060:1: ( ( ( rule__SimpleClock__Group_9__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6061:1: ( ( rule__SimpleClock__Group_9__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6061:1: ( ( rule__SimpleClock__Group_9__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6062:1: ( rule__SimpleClock__Group_9__0 )?
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6063:1: ( rule__SimpleClock__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6063:2: rule__SimpleClock__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__Group_9__0_in_rule__SimpleClock__Group__9__Impl12050);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6073:1: rule__SimpleClock__Group__10 : rule__SimpleClock__Group__10__Impl rule__SimpleClock__Group__11 ;
    public final void rule__SimpleClock__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6077:1: ( rule__SimpleClock__Group__10__Impl rule__SimpleClock__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6078:2: rule__SimpleClock__Group__10__Impl rule__SimpleClock__Group__11
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__10__Impl_in_rule__SimpleClock__Group__1012081);
            rule__SimpleClock__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__11_in_rule__SimpleClock__Group__1012084);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6085:1: rule__SimpleClock__Group__10__Impl : ( ( rule__SimpleClock__Group_10__0 )? ) ;
    public final void rule__SimpleClock__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6089:1: ( ( ( rule__SimpleClock__Group_10__0 )? ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6090:1: ( ( rule__SimpleClock__Group_10__0 )? )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6090:1: ( ( rule__SimpleClock__Group_10__0 )? )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6091:1: ( rule__SimpleClock__Group_10__0 )?
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_10()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6092:1: ( rule__SimpleClock__Group_10__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==63) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6092:2: rule__SimpleClock__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__SimpleClock__Group_10__0_in_rule__SimpleClock__Group__10__Impl12111);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6102:1: rule__SimpleClock__Group__11 : rule__SimpleClock__Group__11__Impl rule__SimpleClock__Group__12 ;
    public final void rule__SimpleClock__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6106:1: ( rule__SimpleClock__Group__11__Impl rule__SimpleClock__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6107:2: rule__SimpleClock__Group__11__Impl rule__SimpleClock__Group__12
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__11__Impl_in_rule__SimpleClock__Group__1112142);
            rule__SimpleClock__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group__12_in_rule__SimpleClock__Group__1112145);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6114:1: rule__SimpleClock__Group__11__Impl : ( ( rule__SimpleClock__Group_11__0 )* ) ;
    public final void rule__SimpleClock__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6118:1: ( ( ( rule__SimpleClock__Group_11__0 )* ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6119:1: ( ( rule__SimpleClock__Group_11__0 )* )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6119:1: ( ( rule__SimpleClock__Group_11__0 )* )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6120:1: ( rule__SimpleClock__Group_11__0 )*
            {
             before(grammarAccess.getSimpleClockAccess().getGroup_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6121:1: ( rule__SimpleClock__Group_11__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==64) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6121:2: rule__SimpleClock__Group_11__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleClock__Group_11__0_in_rule__SimpleClock__Group__11__Impl12172);
            	    rule__SimpleClock__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6131:1: rule__SimpleClock__Group__12 : rule__SimpleClock__Group__12__Impl ;
    public final void rule__SimpleClock__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6135:1: ( rule__SimpleClock__Group__12__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6136:2: rule__SimpleClock__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group__12__Impl_in_rule__SimpleClock__Group__1212203);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6142:1: rule__SimpleClock__Group__12__Impl : ( '}' ) ;
    public final void rule__SimpleClock__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6146:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6147:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6147:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6148:1: '}'
            {
             before(grammarAccess.getSimpleClockAccess().getRightCurlyBracketKeyword_12()); 
            match(input,25,FOLLOW_25_in_rule__SimpleClock__Group__12__Impl12231); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6187:1: rule__SimpleClock__Group_7__0 : rule__SimpleClock__Group_7__0__Impl rule__SimpleClock__Group_7__1 ;
    public final void rule__SimpleClock__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6191:1: ( rule__SimpleClock__Group_7__0__Impl rule__SimpleClock__Group_7__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6192:2: rule__SimpleClock__Group_7__0__Impl rule__SimpleClock__Group_7__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_7__0__Impl_in_rule__SimpleClock__Group_7__012288);
            rule__SimpleClock__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_7__1_in_rule__SimpleClock__Group_7__012291);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6199:1: rule__SimpleClock__Group_7__0__Impl : ( 'date-color' ) ;
    public final void rule__SimpleClock__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6203:1: ( ( 'date-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6204:1: ( 'date-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6204:1: ( 'date-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6205:1: 'date-color'
            {
             before(grammarAccess.getSimpleClockAccess().getDateColorKeyword_7_0()); 
            match(input,61,FOLLOW_61_in_rule__SimpleClock__Group_7__0__Impl12319); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6218:1: rule__SimpleClock__Group_7__1 : rule__SimpleClock__Group_7__1__Impl ;
    public final void rule__SimpleClock__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6222:1: ( rule__SimpleClock__Group_7__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6223:2: rule__SimpleClock__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_7__1__Impl_in_rule__SimpleClock__Group_7__112350);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6229:1: rule__SimpleClock__Group_7__1__Impl : ( ( rule__SimpleClock__DateColorAssignment_7_1 ) ) ;
    public final void rule__SimpleClock__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6233:1: ( ( ( rule__SimpleClock__DateColorAssignment_7_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6234:1: ( ( rule__SimpleClock__DateColorAssignment_7_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6234:1: ( ( rule__SimpleClock__DateColorAssignment_7_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6235:1: ( rule__SimpleClock__DateColorAssignment_7_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getDateColorAssignment_7_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6236:1: ( rule__SimpleClock__DateColorAssignment_7_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6236:2: rule__SimpleClock__DateColorAssignment_7_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__DateColorAssignment_7_1_in_rule__SimpleClock__Group_7__1__Impl12377);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6250:1: rule__SimpleClock__Group_8__0 : rule__SimpleClock__Group_8__0__Impl rule__SimpleClock__Group_8__1 ;
    public final void rule__SimpleClock__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6254:1: ( rule__SimpleClock__Group_8__0__Impl rule__SimpleClock__Group_8__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6255:2: rule__SimpleClock__Group_8__0__Impl rule__SimpleClock__Group_8__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_8__0__Impl_in_rule__SimpleClock__Group_8__012411);
            rule__SimpleClock__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_8__1_in_rule__SimpleClock__Group_8__012414);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6262:1: rule__SimpleClock__Group_8__0__Impl : ( 'time-color' ) ;
    public final void rule__SimpleClock__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6266:1: ( ( 'time-color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6267:1: ( 'time-color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6267:1: ( 'time-color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6268:1: 'time-color'
            {
             before(grammarAccess.getSimpleClockAccess().getTimeColorKeyword_8_0()); 
            match(input,62,FOLLOW_62_in_rule__SimpleClock__Group_8__0__Impl12442); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6281:1: rule__SimpleClock__Group_8__1 : rule__SimpleClock__Group_8__1__Impl ;
    public final void rule__SimpleClock__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6285:1: ( rule__SimpleClock__Group_8__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6286:2: rule__SimpleClock__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_8__1__Impl_in_rule__SimpleClock__Group_8__112473);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6292:1: rule__SimpleClock__Group_8__1__Impl : ( ( rule__SimpleClock__TimeColorAssignment_8_1 ) ) ;
    public final void rule__SimpleClock__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6296:1: ( ( ( rule__SimpleClock__TimeColorAssignment_8_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6297:1: ( ( rule__SimpleClock__TimeColorAssignment_8_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6297:1: ( ( rule__SimpleClock__TimeColorAssignment_8_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6298:1: ( rule__SimpleClock__TimeColorAssignment_8_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getTimeColorAssignment_8_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6299:1: ( rule__SimpleClock__TimeColorAssignment_8_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6299:2: rule__SimpleClock__TimeColorAssignment_8_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__TimeColorAssignment_8_1_in_rule__SimpleClock__Group_8__1__Impl12500);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6313:1: rule__SimpleClock__Group_9__0 : rule__SimpleClock__Group_9__0__Impl rule__SimpleClock__Group_9__1 ;
    public final void rule__SimpleClock__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6317:1: ( rule__SimpleClock__Group_9__0__Impl rule__SimpleClock__Group_9__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6318:2: rule__SimpleClock__Group_9__0__Impl rule__SimpleClock__Group_9__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_9__0__Impl_in_rule__SimpleClock__Group_9__012534);
            rule__SimpleClock__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_9__1_in_rule__SimpleClock__Group_9__012537);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6325:1: rule__SimpleClock__Group_9__0__Impl : ( 'class' ) ;
    public final void rule__SimpleClock__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6329:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6330:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6330:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6331:1: 'class'
            {
             before(grammarAccess.getSimpleClockAccess().getClassKeyword_9_0()); 
            match(input,35,FOLLOW_35_in_rule__SimpleClock__Group_9__0__Impl12565); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6344:1: rule__SimpleClock__Group_9__1 : rule__SimpleClock__Group_9__1__Impl ;
    public final void rule__SimpleClock__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6348:1: ( rule__SimpleClock__Group_9__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6349:2: rule__SimpleClock__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_9__1__Impl_in_rule__SimpleClock__Group_9__112596);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6355:1: rule__SimpleClock__Group_9__1__Impl : ( ( rule__SimpleClock__ClassAssignment_9_1 ) ) ;
    public final void rule__SimpleClock__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6359:1: ( ( ( rule__SimpleClock__ClassAssignment_9_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6360:1: ( ( rule__SimpleClock__ClassAssignment_9_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6360:1: ( ( rule__SimpleClock__ClassAssignment_9_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6361:1: ( rule__SimpleClock__ClassAssignment_9_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getClassAssignment_9_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6362:1: ( rule__SimpleClock__ClassAssignment_9_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6362:2: rule__SimpleClock__ClassAssignment_9_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__ClassAssignment_9_1_in_rule__SimpleClock__Group_9__1__Impl12623);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6376:1: rule__SimpleClock__Group_10__0 : rule__SimpleClock__Group_10__0__Impl rule__SimpleClock__Group_10__1 ;
    public final void rule__SimpleClock__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6380:1: ( rule__SimpleClock__Group_10__0__Impl rule__SimpleClock__Group_10__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6381:2: rule__SimpleClock__Group_10__0__Impl rule__SimpleClock__Group_10__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_10__0__Impl_in_rule__SimpleClock__Group_10__012657);
            rule__SimpleClock__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_10__1_in_rule__SimpleClock__Group_10__012660);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6388:1: rule__SimpleClock__Group_10__0__Impl : ( 'style' ) ;
    public final void rule__SimpleClock__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6392:1: ( ( 'style' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6393:1: ( 'style' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6393:1: ( 'style' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6394:1: 'style'
            {
             before(grammarAccess.getSimpleClockAccess().getStyleKeyword_10_0()); 
            match(input,63,FOLLOW_63_in_rule__SimpleClock__Group_10__0__Impl12688); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6407:1: rule__SimpleClock__Group_10__1 : rule__SimpleClock__Group_10__1__Impl ;
    public final void rule__SimpleClock__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6411:1: ( rule__SimpleClock__Group_10__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6412:2: rule__SimpleClock__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_10__1__Impl_in_rule__SimpleClock__Group_10__112719);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6418:1: rule__SimpleClock__Group_10__1__Impl : ( ( rule__SimpleClock__StyleAssignment_10_1 ) ) ;
    public final void rule__SimpleClock__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6422:1: ( ( ( rule__SimpleClock__StyleAssignment_10_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6423:1: ( ( rule__SimpleClock__StyleAssignment_10_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6423:1: ( ( rule__SimpleClock__StyleAssignment_10_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6424:1: ( rule__SimpleClock__StyleAssignment_10_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getStyleAssignment_10_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6425:1: ( rule__SimpleClock__StyleAssignment_10_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6425:2: rule__SimpleClock__StyleAssignment_10_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__StyleAssignment_10_1_in_rule__SimpleClock__Group_10__1__Impl12746);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6439:1: rule__SimpleClock__Group_11__0 : rule__SimpleClock__Group_11__0__Impl rule__SimpleClock__Group_11__1 ;
    public final void rule__SimpleClock__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6443:1: ( rule__SimpleClock__Group_11__0__Impl rule__SimpleClock__Group_11__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6444:2: rule__SimpleClock__Group_11__0__Impl rule__SimpleClock__Group_11__1
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_11__0__Impl_in_rule__SimpleClock__Group_11__012780);
            rule__SimpleClock__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleClock__Group_11__1_in_rule__SimpleClock__Group_11__012783);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6451:1: rule__SimpleClock__Group_11__0__Impl : ( 'bg-colors' ) ;
    public final void rule__SimpleClock__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6455:1: ( ( 'bg-colors' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6456:1: ( 'bg-colors' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6456:1: ( 'bg-colors' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6457:1: 'bg-colors'
            {
             before(grammarAccess.getSimpleClockAccess().getBgColorsKeyword_11_0()); 
            match(input,64,FOLLOW_64_in_rule__SimpleClock__Group_11__0__Impl12811); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6470:1: rule__SimpleClock__Group_11__1 : rule__SimpleClock__Group_11__1__Impl ;
    public final void rule__SimpleClock__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6474:1: ( rule__SimpleClock__Group_11__1__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6475:2: rule__SimpleClock__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleClock__Group_11__1__Impl_in_rule__SimpleClock__Group_11__112842);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6481:1: rule__SimpleClock__Group_11__1__Impl : ( ( rule__SimpleClock__BgColorsAssignment_11_1 ) ) ;
    public final void rule__SimpleClock__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6485:1: ( ( ( rule__SimpleClock__BgColorsAssignment_11_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6486:1: ( ( rule__SimpleClock__BgColorsAssignment_11_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6486:1: ( ( rule__SimpleClock__BgColorsAssignment_11_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6487:1: ( rule__SimpleClock__BgColorsAssignment_11_1 )
            {
             before(grammarAccess.getSimpleClockAccess().getBgColorsAssignment_11_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6488:1: ( rule__SimpleClock__BgColorsAssignment_11_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6488:2: rule__SimpleClock__BgColorsAssignment_11_1
            {
            pushFollow(FOLLOW_rule__SimpleClock__BgColorsAssignment_11_1_in_rule__SimpleClock__Group_11__1__Impl12869);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6502:1: rule__SimpleChart__Group__0 : rule__SimpleChart__Group__0__Impl rule__SimpleChart__Group__1 ;
    public final void rule__SimpleChart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6506:1: ( rule__SimpleChart__Group__0__Impl rule__SimpleChart__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6507:2: rule__SimpleChart__Group__0__Impl rule__SimpleChart__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__0__Impl_in_rule__SimpleChart__Group__012903);
            rule__SimpleChart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__1_in_rule__SimpleChart__Group__012906);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6514:1: rule__SimpleChart__Group__0__Impl : ( 'simpleChart' ) ;
    public final void rule__SimpleChart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6518:1: ( ( 'simpleChart' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6519:1: ( 'simpleChart' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6519:1: ( 'simpleChart' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6520:1: 'simpleChart'
            {
             before(grammarAccess.getSimpleChartAccess().getSimpleChartKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__SimpleChart__Group__0__Impl12934); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6533:1: rule__SimpleChart__Group__1 : rule__SimpleChart__Group__1__Impl rule__SimpleChart__Group__2 ;
    public final void rule__SimpleChart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6537:1: ( rule__SimpleChart__Group__1__Impl rule__SimpleChart__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6538:2: rule__SimpleChart__Group__1__Impl rule__SimpleChart__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__1__Impl_in_rule__SimpleChart__Group__112965);
            rule__SimpleChart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__2_in_rule__SimpleChart__Group__112968);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6545:1: rule__SimpleChart__Group__1__Impl : ( '{' ) ;
    public final void rule__SimpleChart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6549:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6550:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6550:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6551:1: '{'
            {
             before(grammarAccess.getSimpleChartAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__SimpleChart__Group__1__Impl12996); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6564:1: rule__SimpleChart__Group__2 : rule__SimpleChart__Group__2__Impl rule__SimpleChart__Group__3 ;
    public final void rule__SimpleChart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6568:1: ( rule__SimpleChart__Group__2__Impl rule__SimpleChart__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6569:2: rule__SimpleChart__Group__2__Impl rule__SimpleChart__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__2__Impl_in_rule__SimpleChart__Group__213027);
            rule__SimpleChart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__3_in_rule__SimpleChart__Group__213030);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6576:1: rule__SimpleChart__Group__2__Impl : ( ( rule__SimpleChart__DeviceAssignment_2 ) ) ;
    public final void rule__SimpleChart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6580:1: ( ( ( rule__SimpleChart__DeviceAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6581:1: ( ( rule__SimpleChart__DeviceAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6581:1: ( ( rule__SimpleChart__DeviceAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6582:1: ( rule__SimpleChart__DeviceAssignment_2 )
            {
             before(grammarAccess.getSimpleChartAccess().getDeviceAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6583:1: ( rule__SimpleChart__DeviceAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6583:2: rule__SimpleChart__DeviceAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleChart__DeviceAssignment_2_in_rule__SimpleChart__Group__2__Impl13057);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6593:1: rule__SimpleChart__Group__3 : rule__SimpleChart__Group__3__Impl rule__SimpleChart__Group__4 ;
    public final void rule__SimpleChart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6597:1: ( rule__SimpleChart__Group__3__Impl rule__SimpleChart__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6598:2: rule__SimpleChart__Group__3__Impl rule__SimpleChart__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__3__Impl_in_rule__SimpleChart__Group__313087);
            rule__SimpleChart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__4_in_rule__SimpleChart__Group__313090);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6605:1: rule__SimpleChart__Group__3__Impl : ( 'log-config' ) ;
    public final void rule__SimpleChart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6609:1: ( ( 'log-config' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6610:1: ( 'log-config' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6610:1: ( 'log-config' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6611:1: 'log-config'
            {
             before(grammarAccess.getSimpleChartAccess().getLogConfigKeyword_3()); 
            match(input,66,FOLLOW_66_in_rule__SimpleChart__Group__3__Impl13118); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6624:1: rule__SimpleChart__Group__4 : rule__SimpleChart__Group__4__Impl rule__SimpleChart__Group__5 ;
    public final void rule__SimpleChart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6628:1: ( rule__SimpleChart__Group__4__Impl rule__SimpleChart__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6629:2: rule__SimpleChart__Group__4__Impl rule__SimpleChart__Group__5
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__4__Impl_in_rule__SimpleChart__Group__413149);
            rule__SimpleChart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__5_in_rule__SimpleChart__Group__413152);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6636:1: rule__SimpleChart__Group__4__Impl : ( ( rule__SimpleChart__Log_deviceAssignment_4 ) ) ;
    public final void rule__SimpleChart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6640:1: ( ( ( rule__SimpleChart__Log_deviceAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6641:1: ( ( rule__SimpleChart__Log_deviceAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6641:1: ( ( rule__SimpleChart__Log_deviceAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6642:1: ( rule__SimpleChart__Log_deviceAssignment_4 )
            {
             before(grammarAccess.getSimpleChartAccess().getLog_deviceAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6643:1: ( rule__SimpleChart__Log_deviceAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6643:2: rule__SimpleChart__Log_deviceAssignment_4
            {
            pushFollow(FOLLOW_rule__SimpleChart__Log_deviceAssignment_4_in_rule__SimpleChart__Group__4__Impl13179);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6653:1: rule__SimpleChart__Group__5 : rule__SimpleChart__Group__5__Impl rule__SimpleChart__Group__6 ;
    public final void rule__SimpleChart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6657:1: ( rule__SimpleChart__Group__5__Impl rule__SimpleChart__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6658:2: rule__SimpleChart__Group__5__Impl rule__SimpleChart__Group__6
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__5__Impl_in_rule__SimpleChart__Group__513209);
            rule__SimpleChart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__6_in_rule__SimpleChart__Group__513212);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6665:1: rule__SimpleChart__Group__5__Impl : ( ( rule__SimpleChart__LogfileAssignment_5 ) ) ;
    public final void rule__SimpleChart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6669:1: ( ( ( rule__SimpleChart__LogfileAssignment_5 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6670:1: ( ( rule__SimpleChart__LogfileAssignment_5 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6670:1: ( ( rule__SimpleChart__LogfileAssignment_5 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6671:1: ( rule__SimpleChart__LogfileAssignment_5 )
            {
             before(grammarAccess.getSimpleChartAccess().getLogfileAssignment_5()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6672:1: ( rule__SimpleChart__LogfileAssignment_5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6672:2: rule__SimpleChart__LogfileAssignment_5
            {
            pushFollow(FOLLOW_rule__SimpleChart__LogfileAssignment_5_in_rule__SimpleChart__Group__5__Impl13239);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6682:1: rule__SimpleChart__Group__6 : rule__SimpleChart__Group__6__Impl rule__SimpleChart__Group__7 ;
    public final void rule__SimpleChart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6686:1: ( rule__SimpleChart__Group__6__Impl rule__SimpleChart__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6687:2: rule__SimpleChart__Group__6__Impl rule__SimpleChart__Group__7
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__6__Impl_in_rule__SimpleChart__Group__613269);
            rule__SimpleChart__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__7_in_rule__SimpleChart__Group__613272);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6694:1: rule__SimpleChart__Group__6__Impl : ( 'columnSpec' ) ;
    public final void rule__SimpleChart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6698:1: ( ( 'columnSpec' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6699:1: ( 'columnSpec' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6699:1: ( 'columnSpec' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6700:1: 'columnSpec'
            {
             before(grammarAccess.getSimpleChartAccess().getColumnSpecKeyword_6()); 
            match(input,67,FOLLOW_67_in_rule__SimpleChart__Group__6__Impl13300); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6713:1: rule__SimpleChart__Group__7 : rule__SimpleChart__Group__7__Impl rule__SimpleChart__Group__8 ;
    public final void rule__SimpleChart__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6717:1: ( rule__SimpleChart__Group__7__Impl rule__SimpleChart__Group__8 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6718:2: rule__SimpleChart__Group__7__Impl rule__SimpleChart__Group__8
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__7__Impl_in_rule__SimpleChart__Group__713331);
            rule__SimpleChart__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__8_in_rule__SimpleChart__Group__713334);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6725:1: rule__SimpleChart__Group__7__Impl : ( ( rule__SimpleChart__ColumnSpecAssignment_7 ) ) ;
    public final void rule__SimpleChart__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6729:1: ( ( ( rule__SimpleChart__ColumnSpecAssignment_7 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6730:1: ( ( rule__SimpleChart__ColumnSpecAssignment_7 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6730:1: ( ( rule__SimpleChart__ColumnSpecAssignment_7 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6731:1: ( rule__SimpleChart__ColumnSpecAssignment_7 )
            {
             before(grammarAccess.getSimpleChartAccess().getColumnSpecAssignment_7()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6732:1: ( rule__SimpleChart__ColumnSpecAssignment_7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6732:2: rule__SimpleChart__ColumnSpecAssignment_7
            {
            pushFollow(FOLLOW_rule__SimpleChart__ColumnSpecAssignment_7_in_rule__SimpleChart__Group__7__Impl13361);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6742:1: rule__SimpleChart__Group__8 : rule__SimpleChart__Group__8__Impl rule__SimpleChart__Group__9 ;
    public final void rule__SimpleChart__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6746:1: ( rule__SimpleChart__Group__8__Impl rule__SimpleChart__Group__9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6747:2: rule__SimpleChart__Group__8__Impl rule__SimpleChart__Group__9
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__8__Impl_in_rule__SimpleChart__Group__813391);
            rule__SimpleChart__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__9_in_rule__SimpleChart__Group__813394);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6754:1: rule__SimpleChart__Group__8__Impl : ( 'minValue' ) ;
    public final void rule__SimpleChart__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6758:1: ( ( 'minValue' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6759:1: ( 'minValue' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6759:1: ( 'minValue' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6760:1: 'minValue'
            {
             before(grammarAccess.getSimpleChartAccess().getMinValueKeyword_8()); 
            match(input,68,FOLLOW_68_in_rule__SimpleChart__Group__8__Impl13422); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6773:1: rule__SimpleChart__Group__9 : rule__SimpleChart__Group__9__Impl rule__SimpleChart__Group__10 ;
    public final void rule__SimpleChart__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6777:1: ( rule__SimpleChart__Group__9__Impl rule__SimpleChart__Group__10 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6778:2: rule__SimpleChart__Group__9__Impl rule__SimpleChart__Group__10
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__9__Impl_in_rule__SimpleChart__Group__913453);
            rule__SimpleChart__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__10_in_rule__SimpleChart__Group__913456);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6785:1: rule__SimpleChart__Group__9__Impl : ( ( rule__SimpleChart__MinAssignment_9 ) ) ;
    public final void rule__SimpleChart__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6789:1: ( ( ( rule__SimpleChart__MinAssignment_9 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6790:1: ( ( rule__SimpleChart__MinAssignment_9 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6790:1: ( ( rule__SimpleChart__MinAssignment_9 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6791:1: ( rule__SimpleChart__MinAssignment_9 )
            {
             before(grammarAccess.getSimpleChartAccess().getMinAssignment_9()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6792:1: ( rule__SimpleChart__MinAssignment_9 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6792:2: rule__SimpleChart__MinAssignment_9
            {
            pushFollow(FOLLOW_rule__SimpleChart__MinAssignment_9_in_rule__SimpleChart__Group__9__Impl13483);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6802:1: rule__SimpleChart__Group__10 : rule__SimpleChart__Group__10__Impl rule__SimpleChart__Group__11 ;
    public final void rule__SimpleChart__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6806:1: ( rule__SimpleChart__Group__10__Impl rule__SimpleChart__Group__11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6807:2: rule__SimpleChart__Group__10__Impl rule__SimpleChart__Group__11
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__10__Impl_in_rule__SimpleChart__Group__1013513);
            rule__SimpleChart__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__11_in_rule__SimpleChart__Group__1013516);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6814:1: rule__SimpleChart__Group__10__Impl : ( 'maxValue' ) ;
    public final void rule__SimpleChart__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6818:1: ( ( 'maxValue' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6819:1: ( 'maxValue' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6819:1: ( 'maxValue' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6820:1: 'maxValue'
            {
             before(grammarAccess.getSimpleChartAccess().getMaxValueKeyword_10()); 
            match(input,69,FOLLOW_69_in_rule__SimpleChart__Group__10__Impl13544); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6833:1: rule__SimpleChart__Group__11 : rule__SimpleChart__Group__11__Impl rule__SimpleChart__Group__12 ;
    public final void rule__SimpleChart__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6837:1: ( rule__SimpleChart__Group__11__Impl rule__SimpleChart__Group__12 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6838:2: rule__SimpleChart__Group__11__Impl rule__SimpleChart__Group__12
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__11__Impl_in_rule__SimpleChart__Group__1113575);
            rule__SimpleChart__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__12_in_rule__SimpleChart__Group__1113578);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6845:1: rule__SimpleChart__Group__11__Impl : ( ( rule__SimpleChart__MaxAssignment_11 ) ) ;
    public final void rule__SimpleChart__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6849:1: ( ( ( rule__SimpleChart__MaxAssignment_11 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6850:1: ( ( rule__SimpleChart__MaxAssignment_11 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6850:1: ( ( rule__SimpleChart__MaxAssignment_11 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6851:1: ( rule__SimpleChart__MaxAssignment_11 )
            {
             before(grammarAccess.getSimpleChartAccess().getMaxAssignment_11()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6852:1: ( rule__SimpleChart__MaxAssignment_11 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6852:2: rule__SimpleChart__MaxAssignment_11
            {
            pushFollow(FOLLOW_rule__SimpleChart__MaxAssignment_11_in_rule__SimpleChart__Group__11__Impl13605);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6862:1: rule__SimpleChart__Group__12 : rule__SimpleChart__Group__12__Impl rule__SimpleChart__Group__13 ;
    public final void rule__SimpleChart__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6866:1: ( rule__SimpleChart__Group__12__Impl rule__SimpleChart__Group__13 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6867:2: rule__SimpleChart__Group__12__Impl rule__SimpleChart__Group__13
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__12__Impl_in_rule__SimpleChart__Group__1213635);
            rule__SimpleChart__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__13_in_rule__SimpleChart__Group__1213638);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6874:1: rule__SimpleChart__Group__12__Impl : ( 'xTicks' ) ;
    public final void rule__SimpleChart__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6878:1: ( ( 'xTicks' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6879:1: ( 'xTicks' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6879:1: ( 'xTicks' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6880:1: 'xTicks'
            {
             before(grammarAccess.getSimpleChartAccess().getXTicksKeyword_12()); 
            match(input,70,FOLLOW_70_in_rule__SimpleChart__Group__12__Impl13666); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6893:1: rule__SimpleChart__Group__13 : rule__SimpleChart__Group__13__Impl rule__SimpleChart__Group__14 ;
    public final void rule__SimpleChart__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6897:1: ( rule__SimpleChart__Group__13__Impl rule__SimpleChart__Group__14 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6898:2: rule__SimpleChart__Group__13__Impl rule__SimpleChart__Group__14
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__13__Impl_in_rule__SimpleChart__Group__1313697);
            rule__SimpleChart__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__14_in_rule__SimpleChart__Group__1313700);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6905:1: rule__SimpleChart__Group__13__Impl : ( ( rule__SimpleChart__XTicksAssignment_13 ) ) ;
    public final void rule__SimpleChart__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6909:1: ( ( ( rule__SimpleChart__XTicksAssignment_13 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6910:1: ( ( rule__SimpleChart__XTicksAssignment_13 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6910:1: ( ( rule__SimpleChart__XTicksAssignment_13 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6911:1: ( rule__SimpleChart__XTicksAssignment_13 )
            {
             before(grammarAccess.getSimpleChartAccess().getXTicksAssignment_13()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6912:1: ( rule__SimpleChart__XTicksAssignment_13 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6912:2: rule__SimpleChart__XTicksAssignment_13
            {
            pushFollow(FOLLOW_rule__SimpleChart__XTicksAssignment_13_in_rule__SimpleChart__Group__13__Impl13727);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6922:1: rule__SimpleChart__Group__14 : rule__SimpleChart__Group__14__Impl rule__SimpleChart__Group__15 ;
    public final void rule__SimpleChart__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6926:1: ( rule__SimpleChart__Group__14__Impl rule__SimpleChart__Group__15 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6927:2: rule__SimpleChart__Group__14__Impl rule__SimpleChart__Group__15
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__14__Impl_in_rule__SimpleChart__Group__1413757);
            rule__SimpleChart__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__15_in_rule__SimpleChart__Group__1413760);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6934:1: rule__SimpleChart__Group__14__Impl : ( 'yTicks' ) ;
    public final void rule__SimpleChart__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6938:1: ( ( 'yTicks' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6939:1: ( 'yTicks' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6939:1: ( 'yTicks' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6940:1: 'yTicks'
            {
             before(grammarAccess.getSimpleChartAccess().getYTicksKeyword_14()); 
            match(input,71,FOLLOW_71_in_rule__SimpleChart__Group__14__Impl13788); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6953:1: rule__SimpleChart__Group__15 : rule__SimpleChart__Group__15__Impl rule__SimpleChart__Group__16 ;
    public final void rule__SimpleChart__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6957:1: ( rule__SimpleChart__Group__15__Impl rule__SimpleChart__Group__16 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6958:2: rule__SimpleChart__Group__15__Impl rule__SimpleChart__Group__16
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__15__Impl_in_rule__SimpleChart__Group__1513819);
            rule__SimpleChart__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__16_in_rule__SimpleChart__Group__1513822);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6965:1: rule__SimpleChart__Group__15__Impl : ( ( rule__SimpleChart__YTicksAssignment_15 ) ) ;
    public final void rule__SimpleChart__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6969:1: ( ( ( rule__SimpleChart__YTicksAssignment_15 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6970:1: ( ( rule__SimpleChart__YTicksAssignment_15 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6970:1: ( ( rule__SimpleChart__YTicksAssignment_15 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6971:1: ( rule__SimpleChart__YTicksAssignment_15 )
            {
             before(grammarAccess.getSimpleChartAccess().getYTicksAssignment_15()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6972:1: ( rule__SimpleChart__YTicksAssignment_15 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6972:2: rule__SimpleChart__YTicksAssignment_15
            {
            pushFollow(FOLLOW_rule__SimpleChart__YTicksAssignment_15_in_rule__SimpleChart__Group__15__Impl13849);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6982:1: rule__SimpleChart__Group__16 : rule__SimpleChart__Group__16__Impl rule__SimpleChart__Group__17 ;
    public final void rule__SimpleChart__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6986:1: ( rule__SimpleChart__Group__16__Impl rule__SimpleChart__Group__17 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6987:2: rule__SimpleChart__Group__16__Impl rule__SimpleChart__Group__17
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__16__Impl_in_rule__SimpleChart__Group__1613879);
            rule__SimpleChart__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__17_in_rule__SimpleChart__Group__1613882);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6994:1: rule__SimpleChart__Group__16__Impl : ( 'daysago' ) ;
    public final void rule__SimpleChart__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6998:1: ( ( 'daysago' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6999:1: ( 'daysago' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:6999:1: ( 'daysago' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7000:1: 'daysago'
            {
             before(grammarAccess.getSimpleChartAccess().getDaysagoKeyword_16()); 
            match(input,72,FOLLOW_72_in_rule__SimpleChart__Group__16__Impl13910); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7013:1: rule__SimpleChart__Group__17 : rule__SimpleChart__Group__17__Impl rule__SimpleChart__Group__18 ;
    public final void rule__SimpleChart__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7017:1: ( rule__SimpleChart__Group__17__Impl rule__SimpleChart__Group__18 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7018:2: rule__SimpleChart__Group__17__Impl rule__SimpleChart__Group__18
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__17__Impl_in_rule__SimpleChart__Group__1713941);
            rule__SimpleChart__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__18_in_rule__SimpleChart__Group__1713944);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7025:1: rule__SimpleChart__Group__17__Impl : ( ( rule__SimpleChart__DaysagoAssignment_17 ) ) ;
    public final void rule__SimpleChart__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7029:1: ( ( ( rule__SimpleChart__DaysagoAssignment_17 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7030:1: ( ( rule__SimpleChart__DaysagoAssignment_17 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7030:1: ( ( rule__SimpleChart__DaysagoAssignment_17 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7031:1: ( rule__SimpleChart__DaysagoAssignment_17 )
            {
             before(grammarAccess.getSimpleChartAccess().getDaysagoAssignment_17()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7032:1: ( rule__SimpleChart__DaysagoAssignment_17 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7032:2: rule__SimpleChart__DaysagoAssignment_17
            {
            pushFollow(FOLLOW_rule__SimpleChart__DaysagoAssignment_17_in_rule__SimpleChart__Group__17__Impl13971);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7042:1: rule__SimpleChart__Group__18 : rule__SimpleChart__Group__18__Impl rule__SimpleChart__Group__19 ;
    public final void rule__SimpleChart__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7046:1: ( rule__SimpleChart__Group__18__Impl rule__SimpleChart__Group__19 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7047:2: rule__SimpleChart__Group__18__Impl rule__SimpleChart__Group__19
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__18__Impl_in_rule__SimpleChart__Group__1814001);
            rule__SimpleChart__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__19_in_rule__SimpleChart__Group__1814004);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7054:1: rule__SimpleChart__Group__18__Impl : ( 'class' ) ;
    public final void rule__SimpleChart__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7058:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7059:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7059:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7060:1: 'class'
            {
             before(grammarAccess.getSimpleChartAccess().getClassKeyword_18()); 
            match(input,35,FOLLOW_35_in_rule__SimpleChart__Group__18__Impl14032); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7073:1: rule__SimpleChart__Group__19 : rule__SimpleChart__Group__19__Impl rule__SimpleChart__Group__20 ;
    public final void rule__SimpleChart__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7077:1: ( rule__SimpleChart__Group__19__Impl rule__SimpleChart__Group__20 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7078:2: rule__SimpleChart__Group__19__Impl rule__SimpleChart__Group__20
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__19__Impl_in_rule__SimpleChart__Group__1914063);
            rule__SimpleChart__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleChart__Group__20_in_rule__SimpleChart__Group__1914066);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7085:1: rule__SimpleChart__Group__19__Impl : ( ( rule__SimpleChart__ClassAssignment_19 ) ) ;
    public final void rule__SimpleChart__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7089:1: ( ( ( rule__SimpleChart__ClassAssignment_19 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7090:1: ( ( rule__SimpleChart__ClassAssignment_19 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7090:1: ( ( rule__SimpleChart__ClassAssignment_19 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7091:1: ( rule__SimpleChart__ClassAssignment_19 )
            {
             before(grammarAccess.getSimpleChartAccess().getClassAssignment_19()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7092:1: ( rule__SimpleChart__ClassAssignment_19 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7092:2: rule__SimpleChart__ClassAssignment_19
            {
            pushFollow(FOLLOW_rule__SimpleChart__ClassAssignment_19_in_rule__SimpleChart__Group__19__Impl14093);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7102:1: rule__SimpleChart__Group__20 : rule__SimpleChart__Group__20__Impl ;
    public final void rule__SimpleChart__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7106:1: ( rule__SimpleChart__Group__20__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7107:2: rule__SimpleChart__Group__20__Impl
            {
            pushFollow(FOLLOW_rule__SimpleChart__Group__20__Impl_in_rule__SimpleChart__Group__2014123);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7113:1: rule__SimpleChart__Group__20__Impl : ( '}' ) ;
    public final void rule__SimpleChart__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7117:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7118:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7118:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7119:1: '}'
            {
             before(grammarAccess.getSimpleChartAccess().getRightCurlyBracketKeyword_20()); 
            match(input,25,FOLLOW_25_in_rule__SimpleChart__Group__20__Impl14151); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7174:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7178:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7179:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__014224);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Color__Group__1_in_rule__Color__Group__014227);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7186:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7190:1: ( ( 'color' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7191:1: ( 'color' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7191:1: ( 'color' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7192:1: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Color__Group__0__Impl14255); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7205:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7209:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7210:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__114286);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Color__Group__2_in_rule__Color__Group__114289);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7217:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7221:1: ( ( ( rule__Color__NameAssignment_1 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7222:1: ( ( rule__Color__NameAssignment_1 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7222:1: ( ( rule__Color__NameAssignment_1 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7223:1: ( rule__Color__NameAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7224:1: ( rule__Color__NameAssignment_1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7224:2: rule__Color__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Color__NameAssignment_1_in_rule__Color__Group__1__Impl14316);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7234:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7238:1: ( rule__Color__Group__2__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7239:2: rule__Color__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__214346);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7245:1: rule__Color__Group__2__Impl : ( ( rule__Color__RgbAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7249:1: ( ( ( rule__Color__RgbAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7250:1: ( ( rule__Color__RgbAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7250:1: ( ( rule__Color__RgbAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7251:1: ( rule__Color__RgbAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getRgbAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7252:1: ( rule__Color__RgbAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7252:2: rule__Color__RgbAssignment_2
            {
            pushFollow(FOLLOW_rule__Color__RgbAssignment_2_in_rule__Color__Group__2__Impl14373);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7268:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7272:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7273:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__014409);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__014412);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7280:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7284:1: ( ( 'label' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7285:1: ( 'label' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7285:1: ( 'label' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7286:1: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,73,FOLLOW_73_in_rule__Label__Group__0__Impl14440); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7299:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7303:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7304:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__114471);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__2_in_rule__Label__Group__114474);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7311:1: rule__Label__Group__1__Impl : ( '{' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7315:1: ( ( '{' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7316:1: ( '{' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7316:1: ( '{' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7317:1: '{'
            {
             before(grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Label__Group__1__Impl14502); 
             after(grammarAccess.getLabelAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7330:1: rule__Label__Group__2 : rule__Label__Group__2__Impl rule__Label__Group__3 ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7334:1: ( rule__Label__Group__2__Impl rule__Label__Group__3 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7335:2: rule__Label__Group__2__Impl rule__Label__Group__3
            {
            pushFollow(FOLLOW_rule__Label__Group__2__Impl_in_rule__Label__Group__214533);
            rule__Label__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__3_in_rule__Label__Group__214536);
            rule__Label__Group__3();

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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7342:1: rule__Label__Group__2__Impl : ( ( rule__Label__DeviceAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7346:1: ( ( ( rule__Label__DeviceAssignment_2 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7347:1: ( ( rule__Label__DeviceAssignment_2 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7347:1: ( ( rule__Label__DeviceAssignment_2 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7348:1: ( rule__Label__DeviceAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getDeviceAssignment_2()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7349:1: ( rule__Label__DeviceAssignment_2 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7349:2: rule__Label__DeviceAssignment_2
            {
            pushFollow(FOLLOW_rule__Label__DeviceAssignment_2_in_rule__Label__Group__2__Impl14563);
            rule__Label__DeviceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getDeviceAssignment_2()); 

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


    // $ANTLR start "rule__Label__Group__3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7359:1: rule__Label__Group__3 : rule__Label__Group__3__Impl rule__Label__Group__4 ;
    public final void rule__Label__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7363:1: ( rule__Label__Group__3__Impl rule__Label__Group__4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7364:2: rule__Label__Group__3__Impl rule__Label__Group__4
            {
            pushFollow(FOLLOW_rule__Label__Group__3__Impl_in_rule__Label__Group__314593);
            rule__Label__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__4_in_rule__Label__Group__314596);
            rule__Label__Group__4();

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
    // $ANTLR end "rule__Label__Group__3"


    // $ANTLR start "rule__Label__Group__3__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7371:1: rule__Label__Group__3__Impl : ( 'get' ) ;
    public final void rule__Label__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7375:1: ( ( 'get' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7376:1: ( 'get' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7376:1: ( 'get' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7377:1: 'get'
            {
             before(grammarAccess.getLabelAccess().getGetKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Label__Group__3__Impl14624); 
             after(grammarAccess.getLabelAccess().getGetKeyword_3()); 

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
    // $ANTLR end "rule__Label__Group__3__Impl"


    // $ANTLR start "rule__Label__Group__4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7390:1: rule__Label__Group__4 : rule__Label__Group__4__Impl rule__Label__Group__5 ;
    public final void rule__Label__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7394:1: ( rule__Label__Group__4__Impl rule__Label__Group__5 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7395:2: rule__Label__Group__4__Impl rule__Label__Group__5
            {
            pushFollow(FOLLOW_rule__Label__Group__4__Impl_in_rule__Label__Group__414655);
            rule__Label__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__5_in_rule__Label__Group__414658);
            rule__Label__Group__5();

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
    // $ANTLR end "rule__Label__Group__4"


    // $ANTLR start "rule__Label__Group__4__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7402:1: rule__Label__Group__4__Impl : ( ( rule__Label__GetAssignment_4 ) ) ;
    public final void rule__Label__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7406:1: ( ( ( rule__Label__GetAssignment_4 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7407:1: ( ( rule__Label__GetAssignment_4 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7407:1: ( ( rule__Label__GetAssignment_4 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7408:1: ( rule__Label__GetAssignment_4 )
            {
             before(grammarAccess.getLabelAccess().getGetAssignment_4()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7409:1: ( rule__Label__GetAssignment_4 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7409:2: rule__Label__GetAssignment_4
            {
            pushFollow(FOLLOW_rule__Label__GetAssignment_4_in_rule__Label__Group__4__Impl14685);
            rule__Label__GetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGetAssignment_4()); 

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
    // $ANTLR end "rule__Label__Group__4__Impl"


    // $ANTLR start "rule__Label__Group__5"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7419:1: rule__Label__Group__5 : rule__Label__Group__5__Impl rule__Label__Group__6 ;
    public final void rule__Label__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7423:1: ( rule__Label__Group__5__Impl rule__Label__Group__6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7424:2: rule__Label__Group__5__Impl rule__Label__Group__6
            {
            pushFollow(FOLLOW_rule__Label__Group__5__Impl_in_rule__Label__Group__514715);
            rule__Label__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__6_in_rule__Label__Group__514718);
            rule__Label__Group__6();

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
    // $ANTLR end "rule__Label__Group__5"


    // $ANTLR start "rule__Label__Group__5__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7431:1: rule__Label__Group__5__Impl : ( 'class' ) ;
    public final void rule__Label__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7435:1: ( ( 'class' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7436:1: ( 'class' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7436:1: ( 'class' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7437:1: 'class'
            {
             before(grammarAccess.getLabelAccess().getClassKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__Label__Group__5__Impl14746); 
             after(grammarAccess.getLabelAccess().getClassKeyword_5()); 

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
    // $ANTLR end "rule__Label__Group__5__Impl"


    // $ANTLR start "rule__Label__Group__6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7450:1: rule__Label__Group__6 : rule__Label__Group__6__Impl rule__Label__Group__7 ;
    public final void rule__Label__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7454:1: ( rule__Label__Group__6__Impl rule__Label__Group__7 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7455:2: rule__Label__Group__6__Impl rule__Label__Group__7
            {
            pushFollow(FOLLOW_rule__Label__Group__6__Impl_in_rule__Label__Group__614777);
            rule__Label__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__7_in_rule__Label__Group__614780);
            rule__Label__Group__7();

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
    // $ANTLR end "rule__Label__Group__6"


    // $ANTLR start "rule__Label__Group__6__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7462:1: rule__Label__Group__6__Impl : ( ( rule__Label__ClassAssignment_6 ) ) ;
    public final void rule__Label__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7466:1: ( ( ( rule__Label__ClassAssignment_6 ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7467:1: ( ( rule__Label__ClassAssignment_6 ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7467:1: ( ( rule__Label__ClassAssignment_6 ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7468:1: ( rule__Label__ClassAssignment_6 )
            {
             before(grammarAccess.getLabelAccess().getClassAssignment_6()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7469:1: ( rule__Label__ClassAssignment_6 )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7469:2: rule__Label__ClassAssignment_6
            {
            pushFollow(FOLLOW_rule__Label__ClassAssignment_6_in_rule__Label__Group__6__Impl14807);
            rule__Label__ClassAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getClassAssignment_6()); 

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
    // $ANTLR end "rule__Label__Group__6__Impl"


    // $ANTLR start "rule__Label__Group__7"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7479:1: rule__Label__Group__7 : rule__Label__Group__7__Impl ;
    public final void rule__Label__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7483:1: ( rule__Label__Group__7__Impl )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7484:2: rule__Label__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__7__Impl_in_rule__Label__Group__714837);
            rule__Label__Group__7__Impl();

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
    // $ANTLR end "rule__Label__Group__7"


    // $ANTLR start "rule__Label__Group__7__Impl"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7490:1: rule__Label__Group__7__Impl : ( '}' ) ;
    public final void rule__Label__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7494:1: ( ( '}' ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7495:1: ( '}' )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7495:1: ( '}' )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7496:1: '}'
            {
             before(grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__Label__Group__7__Impl14865); 
             after(grammarAccess.getLabelAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Label__Group__7__Impl"


    // $ANTLR start "rule__TabletUI__SettingsAssignment_0"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7526:1: rule__TabletUI__SettingsAssignment_0 : ( ruleSettings ) ;
    public final void rule__TabletUI__SettingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7530:1: ( ( ruleSettings ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7531:1: ( ruleSettings )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7531:1: ( ruleSettings )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7532:1: ruleSettings
            {
             before(grammarAccess.getTabletUIAccess().getSettingsSettingsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSettings_in_rule__TabletUI__SettingsAssignment_014917);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7541:1: rule__TabletUI__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__TabletUI__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7545:1: ( ( ruleAbstractElement ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7546:1: ( ruleAbstractElement )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7546:1: ( ruleAbstractElement )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7547:1: ruleAbstractElement
            {
             before(grammarAccess.getTabletUIAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__TabletUI__ElementsAssignment_114948);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7556:1: rule__Settings__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Settings__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7560:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7561:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7561:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7562:1: RULE_STRING
            {
             before(grammarAccess.getSettingsAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Settings__TitleAssignment_214979); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7571:1: rule__Settings__Fhemweb_urlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Settings__Fhemweb_urlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7575:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7576:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7576:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7577:1: RULE_STRING
            {
             before(grammarAccess.getSettingsAccess().getFhemweb_urlSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Settings__Fhemweb_urlAssignment_3_115010); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7586:1: rule__Settings__WidthAssignment_5 : ( RULE_INT ) ;
    public final void rule__Settings__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7590:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7591:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7591:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7592:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getWidthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__WidthAssignment_515041); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7601:1: rule__Settings__HeightAssignment_7 : ( RULE_INT ) ;
    public final void rule__Settings__HeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7605:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7606:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7606:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7607:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getHeightINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__HeightAssignment_715072); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7616:1: rule__Settings__ColumnsAssignment_9 : ( RULE_INT ) ;
    public final void rule__Settings__ColumnsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7620:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7621:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7621:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7622:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getColumnsINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__ColumnsAssignment_915103); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7631:1: rule__Settings__RowsAssignment_11 : ( RULE_INT ) ;
    public final void rule__Settings__RowsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7635:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7636:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7636:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7637:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getRowsINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__RowsAssignment_1115134); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7646:1: rule__Settings__DebugAssignment_12_1 : ( ruleBOOL ) ;
    public final void rule__Settings__DebugAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7650:1: ( ( ruleBOOL ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7651:1: ( ruleBOOL )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7651:1: ( ruleBOOL )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7652:1: ruleBOOL
            {
             before(grammarAccess.getSettingsAccess().getDebugBOOLParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__Settings__DebugAssignment_12_115165);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7661:1: rule__Settings__DragdropAssignment_14 : ( ruleBOOL ) ;
    public final void rule__Settings__DragdropAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7665:1: ( ( ruleBOOL ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7666:1: ( ruleBOOL )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7666:1: ( ruleBOOL )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7667:1: ruleBOOL
            {
             before(grammarAccess.getSettingsAccess().getDragdropBOOLParserRuleCall_14_0()); 
            pushFollow(FOLLOW_ruleBOOL_in_rule__Settings__DragdropAssignment_1415196);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7676:1: rule__Settings__MarginAssignment_16 : ( RULE_INT ) ;
    public final void rule__Settings__MarginAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7680:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7681:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7681:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7682:1: RULE_INT
            {
             before(grammarAccess.getSettingsAccess().getMarginINTTerminalRuleCall_16_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Settings__MarginAssignment_1615227); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7691:1: rule__Settings__SettingsAssignment_17 : ( ruleSettingsElement ) ;
    public final void rule__Settings__SettingsAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7695:1: ( ( ruleSettingsElement ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7696:1: ( ruleSettingsElement )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7696:1: ( ruleSettingsElement )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7697:1: ruleSettingsElement
            {
             before(grammarAccess.getSettingsAccess().getSettingsSettingsElementParserRuleCall_17_0()); 
            pushFollow(FOLLOW_ruleSettingsElement_in_rule__Settings__SettingsAssignment_1715258);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7706:1: rule__CSS__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CSS__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7710:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7711:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7711:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7712:1: RULE_STRING
            {
             before(grammarAccess.getCSSAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CSS__PathAssignment_115289); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7721:1: rule__Page__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7725:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7726:1: ( RULE_ID )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7726:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7727:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_015320); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7736:1: rule__Page__ElementsAssignment_2 : ( ruleGridster ) ;
    public final void rule__Page__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7740:1: ( ( ruleGridster ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7741:1: ( ruleGridster )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7741:1: ( ruleGridster )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7742:1: ruleGridster
            {
             before(grammarAccess.getPageAccess().getElementsGridsterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGridster_in_rule__Page__ElementsAssignment_215351);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7751:1: rule__Gridster__HeaderAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Gridster__HeaderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7755:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7756:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7756:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7757:1: RULE_STRING
            {
             before(grammarAccess.getGridsterAccess().getHeaderSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Gridster__HeaderAssignment_1_115382); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7766:1: rule__Gridster__RowAssignment_3 : ( RULE_INT ) ;
    public final void rule__Gridster__RowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7770:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7771:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7771:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7772:1: RULE_INT
            {
             before(grammarAccess.getGridsterAccess().getRowINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gridster__RowAssignment_315413); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7781:1: rule__Gridster__ColumnAssignment_5 : ( RULE_INT ) ;
    public final void rule__Gridster__ColumnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7785:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7786:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7786:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7787:1: RULE_INT
            {
             before(grammarAccess.getGridsterAccess().getColumnINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gridster__ColumnAssignment_515444); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7796:1: rule__Gridster__ColspanAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Gridster__ColspanAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7800:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7801:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7801:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7802:1: RULE_INT
            {
             before(grammarAccess.getGridsterAccess().getColspanINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gridster__ColspanAssignment_6_115475); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7811:1: rule__Gridster__RowspanAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__Gridster__RowspanAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7815:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7816:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7816:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7817:1: RULE_INT
            {
             before(grammarAccess.getGridsterAccess().getRowspanINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Gridster__RowspanAssignment_7_115506); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7826:1: rule__Gridster__ColorsAssignment_8 : ( ruleColor ) ;
    public final void rule__Gridster__ColorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7830:1: ( ( ruleColor ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7831:1: ( ruleColor )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7831:1: ( ruleColor )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7832:1: ruleColor
            {
             before(grammarAccess.getGridsterAccess().getColorsColorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__Gridster__ColorsAssignment_815537);
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7841:1: rule__Gridster__WidgetsAssignment_9 : ( ruleWidget ) ;
    public final void rule__Gridster__WidgetsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7845:1: ( ( ruleWidget ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7846:1: ( ruleWidget )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7846:1: ( ruleWidget )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7847:1: ruleWidget
            {
             before(grammarAccess.getGridsterAccess().getWidgetsWidgetParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__Gridster__WidgetsAssignment_915568);
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


    // $ANTLR start "rule__Switch__DeviceAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7856:1: rule__Switch__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Switch__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7860:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7861:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7861:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7862:1: RULE_STRING
            {
             before(grammarAccess.getSwitchAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Switch__DeviceAssignment_215599); 
             after(grammarAccess.getSwitchAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Switch__DeviceAssignment_2"


    // $ANTLR start "rule__Switch__GetAssignment_3_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7871:1: rule__Switch__GetAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Switch__GetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7875:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7876:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7876:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7877:1: RULE_STRING
            {
             before(grammarAccess.getSwitchAccess().getGetSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Switch__GetAssignment_3_115630); 
             after(grammarAccess.getSwitchAccess().getGetSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Switch__GetAssignment_3_1"


    // $ANTLR start "rule__Switch__GetOnAssignment_4_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7886:1: rule__Switch__GetOnAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Switch__GetOnAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7890:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7891:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7891:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7892:1: RULE_STRING
            {
             before(grammarAccess.getSwitchAccess().getGetOnSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Switch__GetOnAssignment_4_115661); 
             after(grammarAccess.getSwitchAccess().getGetOnSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Switch__GetOnAssignment_4_1"


    // $ANTLR start "rule__Switch__GetOffAssignment_5_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7901:1: rule__Switch__GetOffAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Switch__GetOffAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7905:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7906:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7906:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7907:1: RULE_STRING
            {
             before(grammarAccess.getSwitchAccess().getGetOffSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Switch__GetOffAssignment_5_115692); 
             after(grammarAccess.getSwitchAccess().getGetOffSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Switch__GetOffAssignment_5_1"


    // $ANTLR start "rule__Switch__ClassAssignment_6_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7916:1: rule__Switch__ClassAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Switch__ClassAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7920:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7921:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7921:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7922:1: RULE_STRING
            {
             before(grammarAccess.getSwitchAccess().getClassSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Switch__ClassAssignment_6_115723); 
             after(grammarAccess.getSwitchAccess().getClassSTRINGTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Switch__ClassAssignment_6_1"


    // $ANTLR start "rule__Switch__OnColorAssignment_7_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7931:1: rule__Switch__OnColorAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Switch__OnColorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7935:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7936:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7936:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7937:1: ( RULE_ID )
            {
             before(grammarAccess.getSwitchAccess().getOnColorColorCrossReference_7_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7938:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7939:1: RULE_ID
            {
             before(grammarAccess.getSwitchAccess().getOnColorColorIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Switch__OnColorAssignment_7_115758); 
             after(grammarAccess.getSwitchAccess().getOnColorColorIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getSwitchAccess().getOnColorColorCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Switch__OnColorAssignment_7_1"


    // $ANTLR start "rule__Switch__OffColorAssignment_8_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7950:1: rule__Switch__OffColorAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Switch__OffColorAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7954:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7955:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7955:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7956:1: ( RULE_ID )
            {
             before(grammarAccess.getSwitchAccess().getOffColorColorCrossReference_8_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7957:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7958:1: RULE_ID
            {
             before(grammarAccess.getSwitchAccess().getOffColorColorIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Switch__OffColorAssignment_8_115797); 
             after(grammarAccess.getSwitchAccess().getOffColorColorIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getSwitchAccess().getOffColorColorCrossReference_8_1_0()); 

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
    // $ANTLR end "rule__Switch__OffColorAssignment_8_1"


    // $ANTLR start "rule__Switch__OnBackGroundColorAssignment_9_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7969:1: rule__Switch__OnBackGroundColorAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Switch__OnBackGroundColorAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7973:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7974:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7974:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7975:1: ( RULE_ID )
            {
             before(grammarAccess.getSwitchAccess().getOnBackGroundColorColorCrossReference_9_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7976:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7977:1: RULE_ID
            {
             before(grammarAccess.getSwitchAccess().getOnBackGroundColorColorIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Switch__OnBackGroundColorAssignment_9_115836); 
             after(grammarAccess.getSwitchAccess().getOnBackGroundColorColorIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getSwitchAccess().getOnBackGroundColorColorCrossReference_9_1_0()); 

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
    // $ANTLR end "rule__Switch__OnBackGroundColorAssignment_9_1"


    // $ANTLR start "rule__Switch__BackgroundIconAssignment_10_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7988:1: rule__Switch__BackgroundIconAssignment_10_1 : ( RULE_STRING ) ;
    public final void rule__Switch__BackgroundIconAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7992:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7993:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7993:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:7994:1: RULE_STRING
            {
             before(grammarAccess.getSwitchAccess().getBackgroundIconSTRINGTerminalRuleCall_10_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Switch__BackgroundIconAssignment_10_115871); 
             after(grammarAccess.getSwitchAccess().getBackgroundIconSTRINGTerminalRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Switch__BackgroundIconAssignment_10_1"


    // $ANTLR start "rule__Switch__IconAssignment_11_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8003:1: rule__Switch__IconAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__Switch__IconAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8007:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8008:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8008:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8009:1: RULE_STRING
            {
             before(grammarAccess.getSwitchAccess().getIconSTRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Switch__IconAssignment_11_115902); 
             after(grammarAccess.getSwitchAccess().getIconSTRINGTerminalRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Switch__IconAssignment_11_1"


    // $ANTLR start "rule__Custom__CodeAssignment_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8018:1: rule__Custom__CodeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Custom__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8022:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8023:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8023:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8024:1: RULE_STRING
            {
             before(grammarAccess.getCustomAccess().getCodeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Custom__CodeAssignment_115933); 
             after(grammarAccess.getCustomAccess().getCodeSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Custom__CodeAssignment_1"


    // $ANTLR start "rule__Div__ClassAssignment_3"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8033:1: rule__Div__ClassAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Div__ClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8037:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8038:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8038:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8039:1: RULE_STRING
            {
             before(grammarAccess.getDivAccess().getClassSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Div__ClassAssignment_315964); 
             after(grammarAccess.getDivAccess().getClassSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Div__ClassAssignment_3"


    // $ANTLR start "rule__Div__WidgetsAssignment_4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8048:1: rule__Div__WidgetsAssignment_4 : ( ruleWidget ) ;
    public final void rule__Div__WidgetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8052:1: ( ( ruleWidget ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8053:1: ( ruleWidget )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8053:1: ( ruleWidget )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8054:1: ruleWidget
            {
             before(grammarAccess.getDivAccess().getWidgetsWidgetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__Div__WidgetsAssignment_415995);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getDivAccess().getWidgetsWidgetParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Div__WidgetsAssignment_4"


    // $ANTLR start "rule__Calview__DeviceAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8063:1: rule__Calview__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Calview__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8067:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8068:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8068:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8069:1: RULE_STRING
            {
             before(grammarAccess.getCalviewAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calview__DeviceAssignment_216026); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8078:1: rule__Calview__GetAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Calview__GetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8082:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8083:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8083:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8084:1: RULE_STRING
            {
             before(grammarAccess.getCalviewAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calview__GetAssignment_416057); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8093:1: rule__Calview__MaxAssignment_6 : ( RULE_INT ) ;
    public final void rule__Calview__MaxAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8097:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8098:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8098:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8099:1: RULE_INT
            {
             before(grammarAccess.getCalviewAccess().getMaxINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Calview__MaxAssignment_616088); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8108:1: rule__Calview__ClassAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Calview__ClassAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8112:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8113:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8113:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8114:1: RULE_STRING
            {
             before(grammarAccess.getCalviewAccess().getClassSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Calview__ClassAssignment_816119); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8123:1: rule__Calview__AllFCAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Calview__AllFCAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8127:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8128:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8128:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8129:1: ( RULE_ID )
            {
             before(grammarAccess.getCalviewAccess().getAllFCColorCrossReference_9_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8130:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8131:1: RULE_ID
            {
             before(grammarAccess.getCalviewAccess().getAllFCColorIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calview__AllFCAssignment_9_116154); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8142:1: rule__Calview__AllTCAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Calview__AllTCAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8146:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8147:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8147:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8148:1: ( RULE_ID )
            {
             before(grammarAccess.getCalviewAccess().getAllTCColorCrossReference_10_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8149:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8150:1: RULE_ID
            {
             before(grammarAccess.getCalviewAccess().getAllTCColorIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Calview__AllTCAssignment_10_116193); 
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


    // $ANTLR start "rule__Button__UrlAssignment_2_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8161:1: rule__Button__UrlAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Button__UrlAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8165:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8166:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8166:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8167:1: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getUrlPageCrossReference_2_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8168:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8169:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getUrlPageIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__UrlAssignment_2_116232); 
             after(grammarAccess.getButtonAccess().getUrlPageIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getUrlPageCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Button__UrlAssignment_2_1"


    // $ANTLR start "rule__Button__IconAssignment_4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8180:1: rule__Button__IconAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Button__IconAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8184:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8185:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8185:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8186:1: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getIconSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Button__IconAssignment_416267); 
             after(grammarAccess.getButtonAccess().getIconSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Button__IconAssignment_4"


    // $ANTLR start "rule__Button__ClassAssignment_6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8195:1: rule__Button__ClassAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Button__ClassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8199:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8200:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8200:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8201:1: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getClassSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Button__ClassAssignment_616298); 
             after(grammarAccess.getButtonAccess().getClassSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Button__ClassAssignment_6"


    // $ANTLR start "rule__Button__ColorAssignment_7_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8210:1: rule__Button__ColorAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Button__ColorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8214:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8215:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8215:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8216:1: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getColorColorCrossReference_7_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8217:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8218:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getColorColorIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__ColorAssignment_7_116333); 
             after(grammarAccess.getButtonAccess().getColorColorIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getColorColorCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Button__ColorAssignment_7_1"


    // $ANTLR start "rule__Button__BackgroundColorAssignment_8_1"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8229:1: rule__Button__BackgroundColorAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Button__BackgroundColorAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8233:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8234:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8234:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8235:1: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getBackgroundColorColorCrossReference_8_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8236:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8237:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getBackgroundColorColorIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Button__BackgroundColorAssignment_8_116372); 
             after(grammarAccess.getButtonAccess().getBackgroundColorColorIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getBackgroundColorColorCrossReference_8_1_0()); 

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
    // $ANTLR end "rule__Button__BackgroundColorAssignment_8_1"


    // $ANTLR start "rule__Symbol__DeviceAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8248:1: rule__Symbol__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Symbol__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8252:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8253:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8253:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8254:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__DeviceAssignment_216407); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8263:1: rule__Symbol__GetAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Symbol__GetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8267:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8268:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8268:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8269:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__GetAssignment_416438); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8278:1: rule__Symbol__GetOnAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Symbol__GetOnAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8282:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8283:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8283:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8284:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getGetOnSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__GetOnAssignment_616469); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8293:1: rule__Symbol__GetOffAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Symbol__GetOffAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8297:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8298:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8298:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8299:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getGetOffSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__GetOffAssignment_7_116500); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8308:1: rule__Symbol__ClassAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Symbol__ClassAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8312:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8313:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8313:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8314:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getClassSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__ClassAssignment_8_116531); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8323:1: rule__Symbol__BgiconAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__Symbol__BgiconAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8327:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8328:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8328:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8329:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getBgiconSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__BgiconAssignment_9_116562); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8338:1: rule__Symbol__OnBackGroundColorAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OnBackGroundColorAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8342:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8343:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8343:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8344:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOnBackGroundColorColorCrossReference_10_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8345:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8346:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOnBackGroundColorColorIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OnBackGroundColorAssignment_10_116597); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8357:1: rule__Symbol__OnColorAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OnColorAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8361:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8362:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8362:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8363:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOnColorColorCrossReference_11_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8364:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8365:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOnColorColorIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OnColorAssignment_11_116636); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8376:1: rule__Symbol__OffColorAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OffColorAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8380:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8381:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8381:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8382:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOffColorColorCrossReference_12_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8383:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8384:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOffColorColorIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OffColorAssignment_12_116675); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8395:1: rule__Symbol__IconsAssignment_13_2 : ( RULE_STRING ) ;
    public final void rule__Symbol__IconsAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8399:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8400:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8400:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8401:1: RULE_STRING
            {
             before(grammarAccess.getSymbolAccess().getIconsSTRINGTerminalRuleCall_13_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Symbol__IconsAssignment_13_216710); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8410:1: rule__Symbol__OnColorsAssignment_14_2 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OnColorsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8414:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8415:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8415:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8416:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOnColorsColorCrossReference_14_2_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8417:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8418:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOnColorsColorIDTerminalRuleCall_14_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OnColorsAssignment_14_216745); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8429:1: rule__Symbol__OnBackgroundColorsAssignment_15_2 : ( ( RULE_ID ) ) ;
    public final void rule__Symbol__OnBackgroundColorsAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8433:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8434:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8434:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8435:1: ( RULE_ID )
            {
             before(grammarAccess.getSymbolAccess().getOnBackgroundColorsColorCrossReference_15_2_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8436:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8437:1: RULE_ID
            {
             before(grammarAccess.getSymbolAccess().getOnBackgroundColorsColorIDTerminalRuleCall_15_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Symbol__OnBackgroundColorsAssignment_15_216784); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8448:1: rule__SimpleClock__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__SimpleClock__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8452:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8453:1: ( RULE_ID )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8453:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8454:1: RULE_ID
            {
             before(grammarAccess.getSimpleClockAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleClock__IdAssignment_216819); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8463:1: rule__SimpleClock__DateFormatAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SimpleClock__DateFormatAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8467:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8468:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8468:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8469:1: RULE_STRING
            {
             before(grammarAccess.getSimpleClockAccess().getDateFormatSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleClock__DateFormatAssignment_416850); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8478:1: rule__SimpleClock__TimeFormatAssignment_6 : ( RULE_STRING ) ;
    public final void rule__SimpleClock__TimeFormatAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8482:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8483:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8483:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8484:1: RULE_STRING
            {
             before(grammarAccess.getSimpleClockAccess().getTimeFormatSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleClock__TimeFormatAssignment_616881); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8493:1: rule__SimpleClock__DateColorAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleClock__DateColorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8497:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8498:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8498:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8499:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleClockAccess().getDateColorColorCrossReference_7_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8500:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8501:1: RULE_ID
            {
             before(grammarAccess.getSimpleClockAccess().getDateColorColorIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleClock__DateColorAssignment_7_116916); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8512:1: rule__SimpleClock__TimeColorAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleClock__TimeColorAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8516:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8517:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8517:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8518:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleClockAccess().getTimeColorColorCrossReference_8_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8519:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8520:1: RULE_ID
            {
             before(grammarAccess.getSimpleClockAccess().getTimeColorColorIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleClock__TimeColorAssignment_8_116955); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8531:1: rule__SimpleClock__ClassAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__SimpleClock__ClassAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8535:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8536:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8536:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8537:1: RULE_STRING
            {
             before(grammarAccess.getSimpleClockAccess().getClassSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleClock__ClassAssignment_9_116990); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8546:1: rule__SimpleClock__StyleAssignment_10_1 : ( RULE_STRING ) ;
    public final void rule__SimpleClock__StyleAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8550:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8551:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8551:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8552:1: RULE_STRING
            {
             before(grammarAccess.getSimpleClockAccess().getStyleSTRINGTerminalRuleCall_10_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleClock__StyleAssignment_10_117021); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8561:1: rule__SimpleClock__BgColorsAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleClock__BgColorsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8565:1: ( ( ( RULE_ID ) ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8566:1: ( ( RULE_ID ) )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8566:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8567:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleClockAccess().getBgColorsColorCrossReference_11_1_0()); 
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8568:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8569:1: RULE_ID
            {
             before(grammarAccess.getSimpleClockAccess().getBgColorsColorIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleClock__BgColorsAssignment_11_117056); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8580:1: rule__SimpleChart__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8584:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8585:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8585:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8586:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__DeviceAssignment_217091); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8595:1: rule__SimpleChart__Log_deviceAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__Log_deviceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8599:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8600:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8600:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8601:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getLog_deviceSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__Log_deviceAssignment_417122); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8610:1: rule__SimpleChart__LogfileAssignment_5 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__LogfileAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8614:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8615:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8615:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8616:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getLogfileSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__LogfileAssignment_517153); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8625:1: rule__SimpleChart__ColumnSpecAssignment_7 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__ColumnSpecAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8629:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8630:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8630:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8631:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getColumnSpecSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__ColumnSpecAssignment_717184); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8640:1: rule__SimpleChart__MinAssignment_9 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__MinAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8644:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8645:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8645:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8646:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getMinSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__MinAssignment_917215); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8655:1: rule__SimpleChart__MaxAssignment_11 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__MaxAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8659:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8660:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8660:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8661:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getMaxSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__MaxAssignment_1117246); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8670:1: rule__SimpleChart__XTicksAssignment_13 : ( RULE_INT ) ;
    public final void rule__SimpleChart__XTicksAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8674:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8675:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8675:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8676:1: RULE_INT
            {
             before(grammarAccess.getSimpleChartAccess().getXTicksINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SimpleChart__XTicksAssignment_1317277); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8685:1: rule__SimpleChart__YTicksAssignment_15 : ( RULE_INT ) ;
    public final void rule__SimpleChart__YTicksAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8689:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8690:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8690:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8691:1: RULE_INT
            {
             before(grammarAccess.getSimpleChartAccess().getYTicksINTTerminalRuleCall_15_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SimpleChart__YTicksAssignment_1517308); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8700:1: rule__SimpleChart__DaysagoAssignment_17 : ( RULE_INT ) ;
    public final void rule__SimpleChart__DaysagoAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8704:1: ( ( RULE_INT ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8705:1: ( RULE_INT )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8705:1: ( RULE_INT )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8706:1: RULE_INT
            {
             before(grammarAccess.getSimpleChartAccess().getDaysagoINTTerminalRuleCall_17_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SimpleChart__DaysagoAssignment_1717339); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8715:1: rule__SimpleChart__ClassAssignment_19 : ( RULE_STRING ) ;
    public final void rule__SimpleChart__ClassAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8719:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8720:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8720:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8721:1: RULE_STRING
            {
             before(grammarAccess.getSimpleChartAccess().getClassSTRINGTerminalRuleCall_19_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleChart__ClassAssignment_1917370); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8730:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8734:1: ( ( RULE_ID ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8735:1: ( RULE_ID )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8735:1: ( RULE_ID )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8736:1: RULE_ID
            {
             before(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Color__NameAssignment_117401); 
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
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8745:1: rule__Color__RgbAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__RgbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8749:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8750:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8750:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8751:1: RULE_STRING
            {
             before(grammarAccess.getColorAccess().getRgbSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Color__RgbAssignment_217432); 
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


    // $ANTLR start "rule__Label__DeviceAssignment_2"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8760:1: rule__Label__DeviceAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Label__DeviceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8764:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8765:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8765:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8766:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__DeviceAssignment_217463); 
             after(grammarAccess.getLabelAccess().getDeviceSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Label__DeviceAssignment_2"


    // $ANTLR start "rule__Label__GetAssignment_4"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8775:1: rule__Label__GetAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Label__GetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8779:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8780:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8780:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8781:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getGetSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__GetAssignment_417494); 
             after(grammarAccess.getLabelAccess().getGetSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Label__GetAssignment_4"


    // $ANTLR start "rule__Label__ClassAssignment_6"
    // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8790:1: rule__Label__ClassAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Label__ClassAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8794:1: ( ( RULE_STRING ) )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8795:1: ( RULE_STRING )
            {
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8795:1: ( RULE_STRING )
            // ../org.ckr.tabletui.ui/src-gen/org/ckr/ui/contentassist/antlr/internal/InternalTabletUIDSL.g:8796:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getClassSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__ClassAssignment_617525); 
             after(grammarAccess.getLabelAccess().getClassSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Label__ClassAssignment_6"

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
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__0_in_ruleSwitch633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustom_in_entryRuleCustom660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustom667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Custom__Group__0_in_ruleCustom693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiv_in_entryRuleDiv720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiv727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__0_in_ruleDiv753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalview_in_entryRuleCalview780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCalview787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__0_in_ruleCalview813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__0_in_ruleSymbol933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClock_in_entryRuleSimpleClock960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleClock967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__0_in_ruleSimpleClock993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleChart_in_entryRuleSimpleChart1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleChart1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__0_in_ruleSimpleChart1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0_in_ruleColor1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSS_in_rule__SettingsElement__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__SettingsElement__Alternatives1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BOOL__Alternatives1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BOOL__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_rule__Widget__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__Widget__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Widget__Alternatives1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleClock_in_rule__Widget__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_rule__Widget__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCalview_in_rule__Widget__Alternatives1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleChart_in_rule__Widget__Alternatives1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustom_in_rule__Widget__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiv_in_rule__Widget__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__Group__0__Impl_in_rule__TabletUI__Group__01479 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TabletUI__Group__1_in_rule__TabletUI__Group__01482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__SettingsAssignment_0_in_rule__TabletUI__Group__0__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__Group__1__Impl_in_rule__TabletUI__Group__11539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TabletUI__ElementsAssignment_1_in_rule__TabletUI__Group__1__Impl1566 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Settings__Group__0__Impl_in_rule__Settings__Group__01601 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Settings__Group__1_in_rule__Settings__Group__01604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Settings__Group__0__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__1__Impl_in_rule__Settings__Group__11663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Settings__Group__2_in_rule__Settings__Group__11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Settings__Group__1__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__2__Impl_in_rule__Settings__Group__21725 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__Settings__Group__3_in_rule__Settings__Group__21728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__TitleAssignment_2_in_rule__Settings__Group__2__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__3__Impl_in_rule__Settings__Group__31785 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_rule__Settings__Group__4_in_rule__Settings__Group__31788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_3__0_in_rule__Settings__Group__3__Impl1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__4__Impl_in_rule__Settings__Group__41846 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__5_in_rule__Settings__Group__41849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Settings__Group__4__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__5__Impl_in_rule__Settings__Group__51908 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Settings__Group__6_in_rule__Settings__Group__51911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__WidthAssignment_5_in_rule__Settings__Group__5__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__6__Impl_in_rule__Settings__Group__61968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__7_in_rule__Settings__Group__61971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Settings__Group__6__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__7__Impl_in_rule__Settings__Group__72030 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Settings__Group__8_in_rule__Settings__Group__72033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__HeightAssignment_7_in_rule__Settings__Group__7__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__8__Impl_in_rule__Settings__Group__82090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__9_in_rule__Settings__Group__82093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Settings__Group__8__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__9__Impl_in_rule__Settings__Group__92152 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Settings__Group__10_in_rule__Settings__Group__92155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__ColumnsAssignment_9_in_rule__Settings__Group__9__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__10__Impl_in_rule__Settings__Group__102212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__11_in_rule__Settings__Group__102215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Settings__Group__10__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__11__Impl_in_rule__Settings__Group__112274 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Settings__Group__12_in_rule__Settings__Group__112277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__RowsAssignment_11_in_rule__Settings__Group__11__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__12__Impl_in_rule__Settings__Group__122334 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__Settings__Group__13_in_rule__Settings__Group__122337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_12__0_in_rule__Settings__Group__12__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__13__Impl_in_rule__Settings__Group__132395 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Settings__Group__14_in_rule__Settings__Group__132398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Settings__Group__13__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__14__Impl_in_rule__Settings__Group__142457 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Settings__Group__15_in_rule__Settings__Group__142460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__DragdropAssignment_14_in_rule__Settings__Group__14__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__15__Impl_in_rule__Settings__Group__152517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Settings__Group__16_in_rule__Settings__Group__152520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Settings__Group__15__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__16__Impl_in_rule__Settings__Group__162579 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_rule__Settings__Group__17_in_rule__Settings__Group__162582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__MarginAssignment_16_in_rule__Settings__Group__16__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group__17__Impl_in_rule__Settings__Group__172639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__SettingsAssignment_17_in_rule__Settings__Group__17__Impl2666 = new BitSet(new long[]{0x0001000000800002L});
    public static final BitSet FOLLOW_rule__Settings__Group_3__0__Impl_in_rule__Settings__Group_3__02733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Settings__Group_3__1_in_rule__Settings__Group_3__02736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Settings__Group_3__0__Impl2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_3__1__Impl_in_rule__Settings__Group_3__12795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Fhemweb_urlAssignment_3_1_in_rule__Settings__Group_3__1__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_12__0__Impl_in_rule__Settings__Group_12__02856 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Settings__Group_12__1_in_rule__Settings__Group_12__02859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Settings__Group_12__0__Impl2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__Group_12__1__Impl_in_rule__Settings__Group_12__12918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Settings__DebugAssignment_12_1_in_rule__Settings__Group_12__1__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSS__Group__0__Impl_in_rule__CSS__Group__02979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSS__Group__1_in_rule__CSS__Group__02982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CSS__Group__0__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSS__Group__1__Impl_in_rule__CSS__Group__13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSS__PathAssignment_1_in_rule__CSS__Group__1__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__03102 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__03105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_0_in_rule__Page__Group__0__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__13162 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__13165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Page__Group__1__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__23224 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__23227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__ElementsAssignment_2_in_rule__Page__Group__2__Impl3254 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__33285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Page__Group__3__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__0__Impl_in_rule__Gridster__Group__03352 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__Gridster__Group__1_in_rule__Gridster__Group__03355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Gridster__Group__0__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__1__Impl_in_rule__Gridster__Group__13414 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__Gridster__Group__2_in_rule__Gridster__Group__13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_1__0_in_rule__Gridster__Group__1__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__2__Impl_in_rule__Gridster__Group__23475 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__3_in_rule__Gridster__Group__23478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Gridster__Group__2__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__3__Impl_in_rule__Gridster__Group__33537 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Gridster__Group__4_in_rule__Gridster__Group__33540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__RowAssignment_3_in_rule__Gridster__Group__3__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__4__Impl_in_rule__Gridster__Group__43597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group__5_in_rule__Gridster__Group__43600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Gridster__Group__4__Impl3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__5__Impl_in_rule__Gridster__Group__53659 = new BitSet(new long[]{0x04054600E3800000L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Gridster__Group__6_in_rule__Gridster__Group__53662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__ColumnAssignment_5_in_rule__Gridster__Group__5__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__6__Impl_in_rule__Gridster__Group__63719 = new BitSet(new long[]{0x04054600E3800000L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Gridster__Group__7_in_rule__Gridster__Group__63722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_6__0_in_rule__Gridster__Group__6__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__7__Impl_in_rule__Gridster__Group__73780 = new BitSet(new long[]{0x04054600E3800000L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Gridster__Group__8_in_rule__Gridster__Group__73783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_7__0_in_rule__Gridster__Group__7__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__8__Impl_in_rule__Gridster__Group__83841 = new BitSet(new long[]{0x04054600E3800000L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Gridster__Group__9_in_rule__Gridster__Group__83844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__ColorsAssignment_8_in_rule__Gridster__Group__8__Impl3871 = new BitSet(new long[]{0x0001000000800002L});
    public static final BitSet FOLLOW_rule__Gridster__Group__9__Impl_in_rule__Gridster__Group__93902 = new BitSet(new long[]{0x04054600E3800000L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Gridster__Group__10_in_rule__Gridster__Group__93905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__WidgetsAssignment_9_in_rule__Gridster__Group__9__Impl3932 = new BitSet(new long[]{0x0404460081000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Gridster__Group__10__Impl_in_rule__Gridster__Group__103963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Gridster__Group__10__Impl3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_1__0__Impl_in_rule__Gridster__Group_1__04044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Gridster__Group_1__1_in_rule__Gridster__Group_1__04047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Gridster__Group_1__0__Impl4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_1__1__Impl_in_rule__Gridster__Group_1__14106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__HeaderAssignment_1_1_in_rule__Gridster__Group_1__1__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_6__0__Impl_in_rule__Gridster__Group_6__04167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group_6__1_in_rule__Gridster__Group_6__04170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Gridster__Group_6__0__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_6__1__Impl_in_rule__Gridster__Group_6__14229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__ColspanAssignment_6_1_in_rule__Gridster__Group_6__1__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_7__0__Impl_in_rule__Gridster__Group_7__04290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gridster__Group_7__1_in_rule__Gridster__Group_7__04293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Gridster__Group_7__0__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__Group_7__1__Impl_in_rule__Gridster__Group_7__14352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gridster__RowspanAssignment_7_1_in_rule__Gridster__Group_7__1__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__04413 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__04416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Switch__Group__0__Impl4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__14475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__14478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Switch__Group__1__Impl4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__24537 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__24540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__DeviceAssignment_2_in_rule__Switch__Group__2__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__34597 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__34600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_3__0_in_rule__Switch__Group__3__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__44658 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__5_in_rule__Switch__Group__44661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_4__0_in_rule__Switch__Group__4__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__5__Impl_in_rule__Switch__Group__54719 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__6_in_rule__Switch__Group__54722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_5__0_in_rule__Switch__Group__5__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__6__Impl_in_rule__Switch__Group__64780 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__7_in_rule__Switch__Group__64783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_6__0_in_rule__Switch__Group__6__Impl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__7__Impl_in_rule__Switch__Group__74841 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__8_in_rule__Switch__Group__74844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_7__0_in_rule__Switch__Group__7__Impl4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__8__Impl_in_rule__Switch__Group__84902 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__9_in_rule__Switch__Group__84905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_8__0_in_rule__Switch__Group__8__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__9__Impl_in_rule__Switch__Group__94963 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__10_in_rule__Switch__Group__94966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_9__0_in_rule__Switch__Group__9__Impl4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__10__Impl_in_rule__Switch__Group__105024 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__11_in_rule__Switch__Group__105027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_10__0_in_rule__Switch__Group__10__Impl5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__11__Impl_in_rule__Switch__Group__115085 = new BitSet(new long[]{0x000001FF02000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__12_in_rule__Switch__Group__115088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_11__0_in_rule__Switch__Group__11__Impl5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__12__Impl_in_rule__Switch__Group__125146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Switch__Group__12__Impl5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_3__0__Impl_in_rule__Switch__Group_3__05231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Switch__Group_3__1_in_rule__Switch__Group_3__05234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Switch__Group_3__0__Impl5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_3__1__Impl_in_rule__Switch__Group_3__15293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__GetAssignment_3_1_in_rule__Switch__Group_3__1__Impl5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_4__0__Impl_in_rule__Switch__Group_4__05354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Switch__Group_4__1_in_rule__Switch__Group_4__05357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Switch__Group_4__0__Impl5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_4__1__Impl_in_rule__Switch__Group_4__15416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__GetOnAssignment_4_1_in_rule__Switch__Group_4__1__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_5__0__Impl_in_rule__Switch__Group_5__05477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Switch__Group_5__1_in_rule__Switch__Group_5__05480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Switch__Group_5__0__Impl5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_5__1__Impl_in_rule__Switch__Group_5__15539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__GetOffAssignment_5_1_in_rule__Switch__Group_5__1__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_6__0__Impl_in_rule__Switch__Group_6__05600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Switch__Group_6__1_in_rule__Switch__Group_6__05603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Switch__Group_6__0__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_6__1__Impl_in_rule__Switch__Group_6__15662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__ClassAssignment_6_1_in_rule__Switch__Group_6__1__Impl5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_7__0__Impl_in_rule__Switch__Group_7__05723 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Switch__Group_7__1_in_rule__Switch__Group_7__05726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Switch__Group_7__0__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_7__1__Impl_in_rule__Switch__Group_7__15785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__OnColorAssignment_7_1_in_rule__Switch__Group_7__1__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_8__0__Impl_in_rule__Switch__Group_8__05846 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Switch__Group_8__1_in_rule__Switch__Group_8__05849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Switch__Group_8__0__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_8__1__Impl_in_rule__Switch__Group_8__15908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__OffColorAssignment_8_1_in_rule__Switch__Group_8__1__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_9__0__Impl_in_rule__Switch__Group_9__05969 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Switch__Group_9__1_in_rule__Switch__Group_9__05972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Switch__Group_9__0__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_9__1__Impl_in_rule__Switch__Group_9__16031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__OnBackGroundColorAssignment_9_1_in_rule__Switch__Group_9__1__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_10__0__Impl_in_rule__Switch__Group_10__06092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Switch__Group_10__1_in_rule__Switch__Group_10__06095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Switch__Group_10__0__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_10__1__Impl_in_rule__Switch__Group_10__16154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__BackgroundIconAssignment_10_1_in_rule__Switch__Group_10__1__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_11__0__Impl_in_rule__Switch__Group_11__06215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Switch__Group_11__1_in_rule__Switch__Group_11__06218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Switch__Group_11__0__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group_11__1__Impl_in_rule__Switch__Group_11__16277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__IconAssignment_11_1_in_rule__Switch__Group_11__1__Impl6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Custom__Group__0__Impl_in_rule__Custom__Group__06338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Custom__Group__1_in_rule__Custom__Group__06341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Custom__Group__0__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Custom__Group__1__Impl_in_rule__Custom__Group__16400 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Custom__Group__2_in_rule__Custom__Group__16403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Custom__CodeAssignment_1_in_rule__Custom__Group__1__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Custom__Group__2__Impl_in_rule__Custom__Group__26460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Custom__Group__2__Impl6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__0__Impl_in_rule__Div__Group__06525 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Div__Group__1_in_rule__Div__Group__06528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Div__Group__0__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__1__Impl_in_rule__Div__Group__16587 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Div__Group__2_in_rule__Div__Group__16590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Div__Group__1__Impl6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__2__Impl_in_rule__Div__Group__26649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Div__Group__3_in_rule__Div__Group__26652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Div__Group__2__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__3__Impl_in_rule__Div__Group__36711 = new BitSet(new long[]{0x0404460083000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Div__Group__4_in_rule__Div__Group__36714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__ClassAssignment_3_in_rule__Div__Group__3__Impl6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__Group__4__Impl_in_rule__Div__Group__46771 = new BitSet(new long[]{0x0404460083000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Div__Group__5_in_rule__Div__Group__46774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Div__WidgetsAssignment_4_in_rule__Div__Group__4__Impl6801 = new BitSet(new long[]{0x0404460081000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Div__Group__5__Impl_in_rule__Div__Group__56832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Div__Group__5__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__0__Impl_in_rule__Calview__Group__06903 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__1_in_rule__Calview__Group__06906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Calview__Group__0__Impl6934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__1__Impl_in_rule__Calview__Group__16965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Calview__Group__2_in_rule__Calview__Group__16968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Calview__Group__1__Impl6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__2__Impl_in_rule__Calview__Group__27027 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__3_in_rule__Calview__Group__27030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__DeviceAssignment_2_in_rule__Calview__Group__2__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__3__Impl_in_rule__Calview__Group__37087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Calview__Group__4_in_rule__Calview__Group__37090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Calview__Group__3__Impl7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__4__Impl_in_rule__Calview__Group__47149 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__5_in_rule__Calview__Group__47152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__GetAssignment_4_in_rule__Calview__Group__4__Impl7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__5__Impl_in_rule__Calview__Group__57209 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Calview__Group__6_in_rule__Calview__Group__57212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Calview__Group__5__Impl7240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__6__Impl_in_rule__Calview__Group__67271 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__7_in_rule__Calview__Group__67274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__MaxAssignment_6_in_rule__Calview__Group__6__Impl7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__7__Impl_in_rule__Calview__Group__77331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Calview__Group__8_in_rule__Calview__Group__77334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Calview__Group__7__Impl7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__8__Impl_in_rule__Calview__Group__87393 = new BitSet(new long[]{0x0000300002000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__9_in_rule__Calview__Group__87396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__ClassAssignment_8_in_rule__Calview__Group__8__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__9__Impl_in_rule__Calview__Group__97453 = new BitSet(new long[]{0x0000300002000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__10_in_rule__Calview__Group__97456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_9__0_in_rule__Calview__Group__9__Impl7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__10__Impl_in_rule__Calview__Group__107514 = new BitSet(new long[]{0x0000300002000000L});
    public static final BitSet FOLLOW_rule__Calview__Group__11_in_rule__Calview__Group__107517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_10__0_in_rule__Calview__Group__10__Impl7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group__11__Impl_in_rule__Calview__Group__117575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Calview__Group__11__Impl7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_9__0__Impl_in_rule__Calview__Group_9__07658 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Calview__Group_9__1_in_rule__Calview__Group_9__07661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Calview__Group_9__0__Impl7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_9__1__Impl_in_rule__Calview__Group_9__17720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__AllFCAssignment_9_1_in_rule__Calview__Group_9__1__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_10__0__Impl_in_rule__Calview__Group_10__07781 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Calview__Group_10__1_in_rule__Calview__Group_10__07784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Calview__Group_10__0__Impl7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__Group_10__1__Impl_in_rule__Calview__Group_10__17843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Calview__AllTCAssignment_10_1_in_rule__Calview__Group_10__1__Impl7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__07904 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__07907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Button__Group__0__Impl7935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__17966 = new BitSet(new long[]{0x0000810000000000L});
    public static final BitSet FOLLOW_rule__Button__Group__2_in_rule__Button__Group__17969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Button__Group__1__Impl7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__2__Impl_in_rule__Button__Group__28028 = new BitSet(new long[]{0x0000810000000000L});
    public static final BitSet FOLLOW_rule__Button__Group__3_in_rule__Button__Group__28031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_2__0_in_rule__Button__Group__2__Impl8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__3__Impl_in_rule__Button__Group__38089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group__4_in_rule__Button__Group__38092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Button__Group__3__Impl8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__4__Impl_in_rule__Button__Group__48151 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Button__Group__5_in_rule__Button__Group__48154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__IconAssignment_4_in_rule__Button__Group__4__Impl8181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__5__Impl_in_rule__Button__Group__58211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Button__Group__6_in_rule__Button__Group__58214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Button__Group__5__Impl8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__6__Impl_in_rule__Button__Group__68273 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_rule__Button__Group__7_in_rule__Button__Group__68276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__ClassAssignment_6_in_rule__Button__Group__6__Impl8303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__7__Impl_in_rule__Button__Group__78333 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_rule__Button__Group__8_in_rule__Button__Group__78336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_7__0_in_rule__Button__Group__7__Impl8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__8__Impl_in_rule__Button__Group__88394 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_rule__Button__Group__9_in_rule__Button__Group__88397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_8__0_in_rule__Button__Group__8__Impl8424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__9__Impl_in_rule__Button__Group__98455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Button__Group__9__Impl8483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_2__0__Impl_in_rule__Button__Group_2__08534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Button__Group_2__1_in_rule__Button__Group_2__08537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Button__Group_2__0__Impl8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_2__1__Impl_in_rule__Button__Group_2__18596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__UrlAssignment_2_1_in_rule__Button__Group_2__1__Impl8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_7__0__Impl_in_rule__Button__Group_7__08657 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Button__Group_7__1_in_rule__Button__Group_7__08660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Button__Group_7__0__Impl8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_7__1__Impl_in_rule__Button__Group_7__18719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__ColorAssignment_7_1_in_rule__Button__Group_7__1__Impl8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_8__0__Impl_in_rule__Button__Group_8__08780 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Button__Group_8__1_in_rule__Button__Group_8__08783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Button__Group_8__0__Impl8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group_8__1__Impl_in_rule__Button__Group_8__18842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__BackgroundColorAssignment_8_1_in_rule__Button__Group_8__1__Impl8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__0__Impl_in_rule__Symbol__Group__08903 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group__1_in_rule__Symbol__Group__08906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Symbol__Group__0__Impl8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__1__Impl_in_rule__Symbol__Group__18965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__2_in_rule__Symbol__Group__18968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Symbol__Group__1__Impl8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__2__Impl_in_rule__Symbol__Group__29027 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group__3_in_rule__Symbol__Group__29030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__DeviceAssignment_2_in_rule__Symbol__Group__2__Impl9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__3__Impl_in_rule__Symbol__Group__39087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__4_in_rule__Symbol__Group__39090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Symbol__Group__3__Impl9118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__4__Impl_in_rule__Symbol__Group__49149 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group__5_in_rule__Symbol__Group__49152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__GetAssignment_4_in_rule__Symbol__Group__4__Impl9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__5__Impl_in_rule__Symbol__Group__59209 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__6_in_rule__Symbol__Group__59212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Symbol__Group__5__Impl9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__6__Impl_in_rule__Symbol__Group__69271 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__7_in_rule__Symbol__Group__69274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__GetOnAssignment_6_in_rule__Symbol__Group__6__Impl9301 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Symbol__Group__7__Impl_in_rule__Symbol__Group__79332 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__8_in_rule__Symbol__Group__79335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_7__0_in_rule__Symbol__Group__7__Impl9362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__8__Impl_in_rule__Symbol__Group__89393 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__9_in_rule__Symbol__Group__89396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_8__0_in_rule__Symbol__Group__8__Impl9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__9__Impl_in_rule__Symbol__Group__99454 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__10_in_rule__Symbol__Group__99457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_9__0_in_rule__Symbol__Group__9__Impl9484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__10__Impl_in_rule__Symbol__Group__109515 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__11_in_rule__Symbol__Group__109518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_10__0_in_rule__Symbol__Group__10__Impl9545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__11__Impl_in_rule__Symbol__Group__119576 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__12_in_rule__Symbol__Group__119579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_11__0_in_rule__Symbol__Group__11__Impl9606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__12__Impl_in_rule__Symbol__Group__129637 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__13_in_rule__Symbol__Group__129640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_12__0_in_rule__Symbol__Group__12__Impl9667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__13__Impl_in_rule__Symbol__Group__139698 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__14_in_rule__Symbol__Group__139701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__0_in_rule__Symbol__Group__13__Impl9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__14__Impl_in_rule__Symbol__Group__149759 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__15_in_rule__Symbol__Group__149762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__0_in_rule__Symbol__Group__14__Impl9789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__15__Impl_in_rule__Symbol__Group__159820 = new BitSet(new long[]{0x033800CC02000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group__16_in_rule__Symbol__Group__159823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__0_in_rule__Symbol__Group__15__Impl9850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group__16__Impl_in_rule__Symbol__Group__169881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Symbol__Group__16__Impl9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_7__0__Impl_in_rule__Symbol__Group_7__09974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_7__1_in_rule__Symbol__Group_7__09977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Symbol__Group_7__0__Impl10005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_7__1__Impl_in_rule__Symbol__Group_7__110036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__GetOffAssignment_7_1_in_rule__Symbol__Group_7__1__Impl10063 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Symbol__Group_8__0__Impl_in_rule__Symbol__Group_8__010098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_8__1_in_rule__Symbol__Group_8__010101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Symbol__Group_8__0__Impl10129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_8__1__Impl_in_rule__Symbol__Group_8__110160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__ClassAssignment_8_1_in_rule__Symbol__Group_8__1__Impl10187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_9__0__Impl_in_rule__Symbol__Group_9__010221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_9__1_in_rule__Symbol__Group_9__010224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Symbol__Group_9__0__Impl10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_9__1__Impl_in_rule__Symbol__Group_9__110283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__BgiconAssignment_9_1_in_rule__Symbol__Group_9__1__Impl10310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_10__0__Impl_in_rule__Symbol__Group_10__010344 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_10__1_in_rule__Symbol__Group_10__010347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Symbol__Group_10__0__Impl10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_10__1__Impl_in_rule__Symbol__Group_10__110406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OnBackGroundColorAssignment_10_1_in_rule__Symbol__Group_10__1__Impl10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_11__0__Impl_in_rule__Symbol__Group_11__010467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_11__1_in_rule__Symbol__Group_11__010470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Symbol__Group_11__0__Impl10498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_11__1__Impl_in_rule__Symbol__Group_11__110529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OnColorAssignment_11_1_in_rule__Symbol__Group_11__1__Impl10556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_12__0__Impl_in_rule__Symbol__Group_12__010590 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_12__1_in_rule__Symbol__Group_12__010593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Symbol__Group_12__0__Impl10621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_12__1__Impl_in_rule__Symbol__Group_12__110652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OffColorAssignment_12_1_in_rule__Symbol__Group_12__1__Impl10679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__0__Impl_in_rule__Symbol__Group_13__010713 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__1_in_rule__Symbol__Group_13__010716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Symbol__Group_13__0__Impl10744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__1__Impl_in_rule__Symbol__Group_13__110775 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__2_in_rule__Symbol__Group_13__110778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Symbol__Group_13__1__Impl10806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__2__Impl_in_rule__Symbol__Group_13__210837 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__3_in_rule__Symbol__Group_13__210840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__IconsAssignment_13_2_in_rule__Symbol__Group_13__2__Impl10867 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Symbol__Group_13__3__Impl_in_rule__Symbol__Group_13__310898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Symbol__Group_13__3__Impl10926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__0__Impl_in_rule__Symbol__Group_14__010965 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__1_in_rule__Symbol__Group_14__010968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Symbol__Group_14__0__Impl10996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__1__Impl_in_rule__Symbol__Group_14__111027 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__2_in_rule__Symbol__Group_14__111030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Symbol__Group_14__1__Impl11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__2__Impl_in_rule__Symbol__Group_14__211089 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__3_in_rule__Symbol__Group_14__211092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OnColorsAssignment_14_2_in_rule__Symbol__Group_14__2__Impl11119 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Symbol__Group_14__3__Impl_in_rule__Symbol__Group_14__311150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Symbol__Group_14__3__Impl11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__0__Impl_in_rule__Symbol__Group_15__011217 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__1_in_rule__Symbol__Group_15__011220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Symbol__Group_15__0__Impl11248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__1__Impl_in_rule__Symbol__Group_15__111279 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__2_in_rule__Symbol__Group_15__111282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Symbol__Group_15__1__Impl11310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__2__Impl_in_rule__Symbol__Group_15__211341 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__3_in_rule__Symbol__Group_15__211344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__OnBackgroundColorsAssignment_15_2_in_rule__Symbol__Group_15__2__Impl11371 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Symbol__Group_15__3__Impl_in_rule__Symbol__Group_15__311402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Symbol__Group_15__3__Impl11430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__0__Impl_in_rule__SimpleClock__Group__011469 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__1_in_rule__SimpleClock__Group__011472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__SimpleClock__Group__0__Impl11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__1__Impl_in_rule__SimpleClock__Group__111531 = new BitSet(new long[]{0x0800000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__2_in_rule__SimpleClock__Group__111534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SimpleClock__Group__1__Impl11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__2__Impl_in_rule__SimpleClock__Group__211593 = new BitSet(new long[]{0x0800000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__3_in_rule__SimpleClock__Group__211596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__IdAssignment_2_in_rule__SimpleClock__Group__2__Impl11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__3__Impl_in_rule__SimpleClock__Group__311654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__4_in_rule__SimpleClock__Group__311657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__SimpleClock__Group__3__Impl11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__4__Impl_in_rule__SimpleClock__Group__411716 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__5_in_rule__SimpleClock__Group__411719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__DateFormatAssignment_4_in_rule__SimpleClock__Group__4__Impl11746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__5__Impl_in_rule__SimpleClock__Group__511776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__6_in_rule__SimpleClock__Group__511779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__SimpleClock__Group__5__Impl11807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__6__Impl_in_rule__SimpleClock__Group__611838 = new BitSet(new long[]{0xE000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__7_in_rule__SimpleClock__Group__611841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__TimeFormatAssignment_6_in_rule__SimpleClock__Group__6__Impl11868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__7__Impl_in_rule__SimpleClock__Group__711898 = new BitSet(new long[]{0xE000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__8_in_rule__SimpleClock__Group__711901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_7__0_in_rule__SimpleClock__Group__7__Impl11928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__8__Impl_in_rule__SimpleClock__Group__811959 = new BitSet(new long[]{0xE000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__9_in_rule__SimpleClock__Group__811962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_8__0_in_rule__SimpleClock__Group__8__Impl11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__9__Impl_in_rule__SimpleClock__Group__912020 = new BitSet(new long[]{0xE000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__10_in_rule__SimpleClock__Group__912023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_9__0_in_rule__SimpleClock__Group__9__Impl12050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__10__Impl_in_rule__SimpleClock__Group__1012081 = new BitSet(new long[]{0xE000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__11_in_rule__SimpleClock__Group__1012084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_10__0_in_rule__SimpleClock__Group__10__Impl12111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__11__Impl_in_rule__SimpleClock__Group__1112142 = new BitSet(new long[]{0xE000000802000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__12_in_rule__SimpleClock__Group__1112145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_11__0_in_rule__SimpleClock__Group__11__Impl12172 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group__12__Impl_in_rule__SimpleClock__Group__1212203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SimpleClock__Group__12__Impl12231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_7__0__Impl_in_rule__SimpleClock__Group_7__012288 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_7__1_in_rule__SimpleClock__Group_7__012291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__SimpleClock__Group_7__0__Impl12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_7__1__Impl_in_rule__SimpleClock__Group_7__112350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__DateColorAssignment_7_1_in_rule__SimpleClock__Group_7__1__Impl12377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_8__0__Impl_in_rule__SimpleClock__Group_8__012411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_8__1_in_rule__SimpleClock__Group_8__012414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__SimpleClock__Group_8__0__Impl12442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_8__1__Impl_in_rule__SimpleClock__Group_8__112473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__TimeColorAssignment_8_1_in_rule__SimpleClock__Group_8__1__Impl12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_9__0__Impl_in_rule__SimpleClock__Group_9__012534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_9__1_in_rule__SimpleClock__Group_9__012537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SimpleClock__Group_9__0__Impl12565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_9__1__Impl_in_rule__SimpleClock__Group_9__112596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__ClassAssignment_9_1_in_rule__SimpleClock__Group_9__1__Impl12623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_10__0__Impl_in_rule__SimpleClock__Group_10__012657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_10__1_in_rule__SimpleClock__Group_10__012660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__SimpleClock__Group_10__0__Impl12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_10__1__Impl_in_rule__SimpleClock__Group_10__112719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__StyleAssignment_10_1_in_rule__SimpleClock__Group_10__1__Impl12746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_11__0__Impl_in_rule__SimpleClock__Group_11__012780 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_11__1_in_rule__SimpleClock__Group_11__012783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__SimpleClock__Group_11__0__Impl12811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__Group_11__1__Impl_in_rule__SimpleClock__Group_11__112842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleClock__BgColorsAssignment_11_1_in_rule__SimpleClock__Group_11__1__Impl12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__0__Impl_in_rule__SimpleChart__Group__012903 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__1_in_rule__SimpleChart__Group__012906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__SimpleChart__Group__0__Impl12934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__1__Impl_in_rule__SimpleChart__Group__112965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__2_in_rule__SimpleChart__Group__112968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SimpleChart__Group__1__Impl12996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__2__Impl_in_rule__SimpleChart__Group__213027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__3_in_rule__SimpleChart__Group__213030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__DeviceAssignment_2_in_rule__SimpleChart__Group__2__Impl13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__3__Impl_in_rule__SimpleChart__Group__313087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__4_in_rule__SimpleChart__Group__313090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__SimpleChart__Group__3__Impl13118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__4__Impl_in_rule__SimpleChart__Group__413149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__5_in_rule__SimpleChart__Group__413152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Log_deviceAssignment_4_in_rule__SimpleChart__Group__4__Impl13179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__5__Impl_in_rule__SimpleChart__Group__513209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__6_in_rule__SimpleChart__Group__513212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__LogfileAssignment_5_in_rule__SimpleChart__Group__5__Impl13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__6__Impl_in_rule__SimpleChart__Group__613269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__7_in_rule__SimpleChart__Group__613272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__SimpleChart__Group__6__Impl13300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__7__Impl_in_rule__SimpleChart__Group__713331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__8_in_rule__SimpleChart__Group__713334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__ColumnSpecAssignment_7_in_rule__SimpleChart__Group__7__Impl13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__8__Impl_in_rule__SimpleChart__Group__813391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__9_in_rule__SimpleChart__Group__813394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__SimpleChart__Group__8__Impl13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__9__Impl_in_rule__SimpleChart__Group__913453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__10_in_rule__SimpleChart__Group__913456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__MinAssignment_9_in_rule__SimpleChart__Group__9__Impl13483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__10__Impl_in_rule__SimpleChart__Group__1013513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__11_in_rule__SimpleChart__Group__1013516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__SimpleChart__Group__10__Impl13544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__11__Impl_in_rule__SimpleChart__Group__1113575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__12_in_rule__SimpleChart__Group__1113578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__MaxAssignment_11_in_rule__SimpleChart__Group__11__Impl13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__12__Impl_in_rule__SimpleChart__Group__1213635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__13_in_rule__SimpleChart__Group__1213638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__SimpleChart__Group__12__Impl13666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__13__Impl_in_rule__SimpleChart__Group__1313697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__14_in_rule__SimpleChart__Group__1313700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__XTicksAssignment_13_in_rule__SimpleChart__Group__13__Impl13727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__14__Impl_in_rule__SimpleChart__Group__1413757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__15_in_rule__SimpleChart__Group__1413760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__SimpleChart__Group__14__Impl13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__15__Impl_in_rule__SimpleChart__Group__1513819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__16_in_rule__SimpleChart__Group__1513822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__YTicksAssignment_15_in_rule__SimpleChart__Group__15__Impl13849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__16__Impl_in_rule__SimpleChart__Group__1613879 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__17_in_rule__SimpleChart__Group__1613882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__SimpleChart__Group__16__Impl13910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__17__Impl_in_rule__SimpleChart__Group__1713941 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__18_in_rule__SimpleChart__Group__1713944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__DaysagoAssignment_17_in_rule__SimpleChart__Group__17__Impl13971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__18__Impl_in_rule__SimpleChart__Group__1814001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__19_in_rule__SimpleChart__Group__1814004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SimpleChart__Group__18__Impl14032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__19__Impl_in_rule__SimpleChart__Group__1914063 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__20_in_rule__SimpleChart__Group__1914066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__ClassAssignment_19_in_rule__SimpleChart__Group__19__Impl14093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleChart__Group__20__Impl_in_rule__SimpleChart__Group__2014123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SimpleChart__Group__20__Impl14151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__0__Impl_in_rule__Color__Group__014224 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Color__Group__1_in_rule__Color__Group__014227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Color__Group__0__Impl14255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__1__Impl_in_rule__Color__Group__114286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Color__Group__2_in_rule__Color__Group__114289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__NameAssignment_1_in_rule__Color__Group__1__Impl14316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Group__2__Impl_in_rule__Color__Group__214346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__RgbAssignment_2_in_rule__Color__Group__2__Impl14373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__014409 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__014412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__Label__Group__0__Impl14440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__114471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label__Group__2_in_rule__Label__Group__114474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Label__Group__1__Impl14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__2__Impl_in_rule__Label__Group__214533 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Label__Group__3_in_rule__Label__Group__214536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__DeviceAssignment_2_in_rule__Label__Group__2__Impl14563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__3__Impl_in_rule__Label__Group__314593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label__Group__4_in_rule__Label__Group__314596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Label__Group__3__Impl14624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__4__Impl_in_rule__Label__Group__414655 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Label__Group__5_in_rule__Label__Group__414658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__GetAssignment_4_in_rule__Label__Group__4__Impl14685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__5__Impl_in_rule__Label__Group__514715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Label__Group__6_in_rule__Label__Group__514718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Label__Group__5__Impl14746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__6__Impl_in_rule__Label__Group__614777 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Label__Group__7_in_rule__Label__Group__614780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__ClassAssignment_6_in_rule__Label__Group__6__Impl14807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__7__Impl_in_rule__Label__Group__714837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Label__Group__7__Impl14865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSettings_in_rule__TabletUI__SettingsAssignment_014917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__TabletUI__ElementsAssignment_114948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Settings__TitleAssignment_214979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Settings__Fhemweb_urlAssignment_3_115010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__WidthAssignment_515041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__HeightAssignment_715072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__ColumnsAssignment_915103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__RowsAssignment_1115134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__Settings__DebugAssignment_12_115165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__Settings__DragdropAssignment_1415196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Settings__MarginAssignment_1615227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSettingsElement_in_rule__Settings__SettingsAssignment_1715258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CSS__PathAssignment_115289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_015320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGridster_in_rule__Page__ElementsAssignment_215351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Gridster__HeaderAssignment_1_115382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gridster__RowAssignment_315413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gridster__ColumnAssignment_515444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gridster__ColspanAssignment_6_115475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Gridster__RowspanAssignment_7_115506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__Gridster__ColorsAssignment_815537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__Gridster__WidgetsAssignment_915568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Switch__DeviceAssignment_215599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Switch__GetAssignment_3_115630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Switch__GetOnAssignment_4_115661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Switch__GetOffAssignment_5_115692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Switch__ClassAssignment_6_115723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Switch__OnColorAssignment_7_115758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Switch__OffColorAssignment_8_115797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Switch__OnBackGroundColorAssignment_9_115836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Switch__BackgroundIconAssignment_10_115871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Switch__IconAssignment_11_115902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Custom__CodeAssignment_115933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Div__ClassAssignment_315964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__Div__WidgetsAssignment_415995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calview__DeviceAssignment_216026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calview__GetAssignment_416057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Calview__MaxAssignment_616088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Calview__ClassAssignment_816119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calview__AllFCAssignment_9_116154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Calview__AllTCAssignment_10_116193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__UrlAssignment_2_116232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Button__IconAssignment_416267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Button__ClassAssignment_616298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__ColorAssignment_7_116333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Button__BackgroundColorAssignment_8_116372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__DeviceAssignment_216407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__GetAssignment_416438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__GetOnAssignment_616469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__GetOffAssignment_7_116500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__ClassAssignment_8_116531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__BgiconAssignment_9_116562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OnBackGroundColorAssignment_10_116597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OnColorAssignment_11_116636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OffColorAssignment_12_116675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Symbol__IconsAssignment_13_216710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OnColorsAssignment_14_216745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Symbol__OnBackgroundColorsAssignment_15_216784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleClock__IdAssignment_216819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleClock__DateFormatAssignment_416850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleClock__TimeFormatAssignment_616881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleClock__DateColorAssignment_7_116916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleClock__TimeColorAssignment_8_116955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleClock__ClassAssignment_9_116990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleClock__StyleAssignment_10_117021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleClock__BgColorsAssignment_11_117056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__DeviceAssignment_217091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__Log_deviceAssignment_417122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__LogfileAssignment_517153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__ColumnSpecAssignment_717184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__MinAssignment_917215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__MaxAssignment_1117246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SimpleChart__XTicksAssignment_1317277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SimpleChart__YTicksAssignment_1517308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SimpleChart__DaysagoAssignment_1717339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleChart__ClassAssignment_1917370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Color__NameAssignment_117401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Color__RgbAssignment_217432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__DeviceAssignment_217463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__GetAssignment_417494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__ClassAssignment_617525 = new BitSet(new long[]{0x0000000000000002L});

}