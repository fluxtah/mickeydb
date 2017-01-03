package com.justeat.mickeydb.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.justeat.mickeydb.services.MickeyLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMickeyLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "'version'", "'function'", "'('", "','", "')'", "':'", "'{'", "';'", "'}'", "'action'", "'on'", "'unique'", "'notify'", "'/'", "'param'", "'like'", "'migrate'", "'from'", "'||'", "'*'", "'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'<>'", "'is'", "'is not'", "'in'", "'not in'", "'glob'", "'match'", "'regexp'", "'and'", "'or'", "'is null'", "'not null'", "'notnull'", "'new.'", "'old.'", "'.'", "'not'", "'exists'", "'case'", "'else'", "'end'", "'cast'", "'as'", "'$'", "'when'", "'then'", "'order by'", "'limit'", "'offset'", "'select'", "'distinct'", "'all'", "'where'", "'group by'", "'having'", "'asc'", "'desc'", "'natural'", "'left'", "'outer'", "'inner'", "'cross'", "'join'", "'null'", "'current_time'", "'current_date'", "'current_timestamp'", "'create'", "'temp'", "'table'", "'view'", "'trigger'", "'before'", "'after'", "'instead of'", "'delete'", "'insert'", "'update'", "'of'", "'for each row'", "'begin'", "'alter'", "'rename to'", "'add column'", "'drop'", "'if exists'", "'index'", "'primary key'", "'autoincrement'", "'default'", "'check'", "'constraint'", "'collate'", "'conflict'", "'replace'", "'into'", "'values'", "'set'", "'union all'", "'union'", "'intersect'", "'except'", "'text'", "'integer'", "'real'", "'blob'", "'none'", "'numeric'", "'boolean'", "'rollback'", "'abort'", "'fail'", "'ignore'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=5;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_NUMBER=6;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=7;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalMickeyLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMickeyLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMickeyLangParser.tokenNames; }
    public String getGrammarFileName() { return "../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g"; }



     	private MickeyLangGrammarAccess grammarAccess;
     	
        public InternalMickeyLangParser(TokenStream input, MickeyLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MickeyFile";	
       	}
       	
       	@Override
       	protected MickeyLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMickeyFile"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:68:1: entryRuleMickeyFile returns [EObject current=null] : iv_ruleMickeyFile= ruleMickeyFile EOF ;
    public final EObject entryRuleMickeyFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMickeyFile = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:69:2: (iv_ruleMickeyFile= ruleMickeyFile EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:70:2: iv_ruleMickeyFile= ruleMickeyFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMickeyFileRule()); 
            }
            pushFollow(FOLLOW_ruleMickeyFile_in_entryRuleMickeyFile75);
            iv_ruleMickeyFile=ruleMickeyFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMickeyFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMickeyFile85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMickeyFile"


    // $ANTLR start "ruleMickeyFile"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:77:1: ruleMickeyFile returns [EObject current=null] : (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleSignedNumber ) ) )? ( (lv_blocks_4_0= ruleMickeyBlock ) )* ) ;
    public final EObject ruleMickeyFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_databaseName_1_0 = null;

        AntlrDatatypeRuleToken lv_version_3_0 = null;

        EObject lv_blocks_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:80:28: ( (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleSignedNumber ) ) )? ( (lv_blocks_4_0= ruleMickeyBlock ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:81:1: (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleSignedNumber ) ) )? ( (lv_blocks_4_0= ruleMickeyBlock ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:81:1: (otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleSignedNumber ) ) )? ( (lv_blocks_4_0= ruleMickeyBlock ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:81:3: otherlv_0= 'database' ( (lv_databaseName_1_0= ruleQualifiedName ) ) (otherlv_2= 'version' ( (lv_version_3_0= ruleSignedNumber ) ) )? ( (lv_blocks_4_0= ruleMickeyBlock ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleMickeyFile122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMickeyFileAccess().getDatabaseKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:85:1: ( (lv_databaseName_1_0= ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:86:1: (lv_databaseName_1_0= ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:86:1: (lv_databaseName_1_0= ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:87:3: lv_databaseName_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMickeyFileAccess().getDatabaseNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMickeyFile143);
            lv_databaseName_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMickeyFileRule());
              	        }
                     		set(
                     			current, 
                     			"databaseName",
                      		lv_databaseName_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:103:2: (otherlv_2= 'version' ( (lv_version_3_0= ruleSignedNumber ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:103:4: otherlv_2= 'version' ( (lv_version_3_0= ruleSignedNumber ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleMickeyFile156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getMickeyFileAccess().getVersionKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:107:1: ( (lv_version_3_0= ruleSignedNumber ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:108:1: (lv_version_3_0= ruleSignedNumber )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:108:1: (lv_version_3_0= ruleSignedNumber )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:109:3: lv_version_3_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMickeyFileAccess().getVersionSignedNumberParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleMickeyFile177);
                    lv_version_3_0=ruleSignedNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMickeyFileRule());
                      	        }
                             		set(
                             			current, 
                             			"version",
                              		lv_version_3_0, 
                              		"SignedNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:125:4: ( (lv_blocks_4_0= ruleMickeyBlock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==22||LA2_0==29||LA2_0==94||LA2_0==108||LA2_0==111) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:126:1: (lv_blocks_4_0= ruleMickeyBlock )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:126:1: (lv_blocks_4_0= ruleMickeyBlock )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:127:3: lv_blocks_4_0= ruleMickeyBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMickeyFileAccess().getBlocksMickeyBlockParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMickeyBlock_in_ruleMickeyFile200);
            	    lv_blocks_4_0=ruleMickeyBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMickeyFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"blocks",
            	              		lv_blocks_4_0, 
            	              		"MickeyBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMickeyFile"


    // $ANTLR start "entryRuleMickeyBlock"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:151:1: entryRuleMickeyBlock returns [EObject current=null] : iv_ruleMickeyBlock= ruleMickeyBlock EOF ;
    public final EObject entryRuleMickeyBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMickeyBlock = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:152:2: (iv_ruleMickeyBlock= ruleMickeyBlock EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:153:2: iv_ruleMickeyBlock= ruleMickeyBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMickeyBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMickeyBlock_in_entryRuleMickeyBlock237);
            iv_ruleMickeyBlock=ruleMickeyBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMickeyBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMickeyBlock247); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMickeyBlock"


    // $ANTLR start "ruleMickeyBlock"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:160:1: ruleMickeyBlock returns [EObject current=null] : (this_MickeyFunction_0= ruleMickeyFunction | this_ActionStatement_1= ruleActionStatement | this_DDLStatement_2= ruleDDLStatement | this_MigrationBlock_3= ruleMigrationBlock ) ;
    public final EObject ruleMickeyBlock() throws RecognitionException {
        EObject current = null;

        EObject this_MickeyFunction_0 = null;

        EObject this_ActionStatement_1 = null;

        EObject this_DDLStatement_2 = null;

        EObject this_MigrationBlock_3 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:163:28: ( (this_MickeyFunction_0= ruleMickeyFunction | this_ActionStatement_1= ruleActionStatement | this_DDLStatement_2= ruleDDLStatement | this_MigrationBlock_3= ruleMigrationBlock ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:164:1: (this_MickeyFunction_0= ruleMickeyFunction | this_ActionStatement_1= ruleActionStatement | this_DDLStatement_2= ruleDDLStatement | this_MigrationBlock_3= ruleMigrationBlock )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:164:1: (this_MickeyFunction_0= ruleMickeyFunction | this_ActionStatement_1= ruleActionStatement | this_DDLStatement_2= ruleDDLStatement | this_MigrationBlock_3= ruleMigrationBlock )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 94:
            case 108:
            case 111:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:165:5: this_MickeyFunction_0= ruleMickeyFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMickeyBlockAccess().getMickeyFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMickeyFunction_in_ruleMickeyBlock294);
                    this_MickeyFunction_0=ruleMickeyFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MickeyFunction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:175:5: this_ActionStatement_1= ruleActionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMickeyBlockAccess().getActionStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleActionStatement_in_ruleMickeyBlock321);
                    this_ActionStatement_1=ruleActionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ActionStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:185:5: this_DDLStatement_2= ruleDDLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMickeyBlockAccess().getDDLStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMickeyBlock348);
                    this_DDLStatement_2=ruleDDLStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DDLStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:195:5: this_MigrationBlock_3= ruleMigrationBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMickeyBlockAccess().getMigrationBlockParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMigrationBlock_in_ruleMickeyBlock375);
                    this_MigrationBlock_3=ruleMigrationBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MigrationBlock_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMickeyBlock"


    // $ANTLR start "entryRuleMickeyFunction"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:211:1: entryRuleMickeyFunction returns [EObject current=null] : iv_ruleMickeyFunction= ruleMickeyFunction EOF ;
    public final EObject entryRuleMickeyFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMickeyFunction = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:212:2: (iv_ruleMickeyFunction= ruleMickeyFunction EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:213:2: iv_ruleMickeyFunction= ruleMickeyFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMickeyFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMickeyFunction_in_entryRuleMickeyFunction410);
            iv_ruleMickeyFunction=ruleMickeyFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMickeyFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMickeyFunction420); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMickeyFunction"


    // $ANTLR start "ruleMickeyFunction"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:220:1: ruleMickeyFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}' ) ;
    public final EObject ruleMickeyFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_statements_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:223:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:224:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:224:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:224:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( ( ruleQualifiedName ) ) )? otherlv_9= '{' ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleMickeyFunction457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMickeyFunctionAccess().getFunctionKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:228:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:229:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:229:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:230:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMickeyFunction474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMickeyFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMickeyFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMickeyFunction491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMickeyFunctionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:250:1: ( ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=129 && LA5_0<=132)||LA5_0==135) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:250:2: ( (lv_args_3_0= ruleFunctionArg ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )*
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:250:2: ( (lv_args_3_0= ruleFunctionArg ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:251:1: (lv_args_3_0= ruleFunctionArg )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:251:1: (lv_args_3_0= ruleFunctionArg )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:252:3: lv_args_3_0= ruleFunctionArg
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getArgsFunctionArgParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunctionArg_in_ruleMickeyFunction513);
                    lv_args_3_0=ruleFunctionArg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMickeyFunctionRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_3_0, 
                              		"FunctionArg");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:268:2: (otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:268:4: otherlv_4= ',' ( (lv_args_5_0= ruleFunctionArg ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMickeyFunction526); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMickeyFunctionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:272:1: ( (lv_args_5_0= ruleFunctionArg ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:273:1: (lv_args_5_0= ruleFunctionArg )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:273:1: (lv_args_5_0= ruleFunctionArg )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:274:3: lv_args_5_0= ruleFunctionArg
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getArgsFunctionArgParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFunctionArg_in_ruleMickeyFunction547);
                    	    lv_args_5_0=ruleFunctionArg();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMickeyFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_5_0, 
                    	              		"FunctionArg");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleMickeyFunction563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMickeyFunctionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:294:1: (otherlv_7= ':' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:294:3: otherlv_7= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleMickeyFunction576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMickeyFunctionAccess().getColonKeyword_5_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:298:1: ( ( ruleQualifiedName ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:299:1: ( ruleQualifiedName )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:299:1: ( ruleQualifiedName )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:300:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMickeyFunctionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getTypeTableDefinitionCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMickeyFunction599);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleMickeyFunction613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getMickeyFunctionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:317:1: ( ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==76||(LA7_0>=102 && LA7_0<=104)||LA7_0==121) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:317:2: ( (lv_statements_10_0= ruleDMLStatement ) ) otherlv_11= ';'
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:317:2: ( (lv_statements_10_0= ruleDMLStatement ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:318:1: (lv_statements_10_0= ruleDMLStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:318:1: (lv_statements_10_0= ruleDMLStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:319:3: lv_statements_10_0= ruleDMLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMickeyFunctionAccess().getStatementsDMLStatementParserRuleCall_7_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleMickeyFunction635);
            	    lv_statements_10_0=ruleDMLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMickeyFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_10_0, 
            	              		"DMLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleMickeyFunction647); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMickeyFunctionAccess().getSemicolonKeyword_7_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleMickeyFunction661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMickeyFunctionAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMickeyFunction"


    // $ANTLR start "entryRuleActionStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:351:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:352:2: (iv_ruleActionStatement= ruleActionStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:353:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleActionStatement_in_entryRuleActionStatement697);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActionStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionStatement707); if (state.failed) return current;

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
    // $ANTLR end "entryRuleActionStatement"


    // $ANTLR start "ruleActionStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:360:1: ruleActionStatement returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_unique_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_uri_2_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_notifications_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:363:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:364:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:364:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:364:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= ruleContentUri ) ) otherlv_3= 'on' ( ( ruleQualifiedName ) ) ( (lv_unique_5_0= 'unique' ) )? (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleActionStatement744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getActionKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:368:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:369:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:369:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:370:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionStatement761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getActionStatementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getActionStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:386:2: ( (lv_uri_2_0= ruleContentUri ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:387:1: (lv_uri_2_0= ruleContentUri )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:387:1: (lv_uri_2_0= ruleContentUri )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:388:3: lv_uri_2_0= ruleContentUri
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionStatementAccess().getUriContentUriParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleContentUri_in_ruleActionStatement787);
            lv_uri_2_0=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActionStatementRule());
              	        }
                     		set(
                     			current, 
                     			"uri",
                      		lv_uri_2_0, 
                      		"ContentUri");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleActionStatement799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getActionStatementAccess().getOnKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:408:1: ( ( ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:409:1: ( ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:409:1: ( ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:410:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getActionStatementRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionStatementAccess().getTypeTableDefinitionCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActionStatement822);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:423:2: ( (lv_unique_5_0= 'unique' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:424:1: (lv_unique_5_0= 'unique' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:424:1: (lv_unique_5_0= 'unique' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:425:3: lv_unique_5_0= 'unique'
                    {
                    lv_unique_5_0=(Token)match(input,24,FOLLOW_24_in_ruleActionStatement840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_unique_5_0, grammarAccess.getActionStatementAccess().getUniqueUniqueKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getActionStatementRule());
                      	        }
                             		setWithLastConsumed(current, "unique", true, "unique");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:438:3: (otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:438:5: otherlv_6= '{' ( (lv_params_7_0= ruleContentUriQueryParam ) )* ( (lv_notifications_8_0= ruleContentNotificationUri ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleActionStatement867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getActionStatementAccess().getLeftCurlyBracketKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:442:1: ( (lv_params_7_0= ruleContentUriQueryParam ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:443:1: (lv_params_7_0= ruleContentUriQueryParam )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:443:1: (lv_params_7_0= ruleContentUriQueryParam )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:444:3: lv_params_7_0= ruleContentUriQueryParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getActionStatementAccess().getParamsContentUriQueryParamParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleContentUriQueryParam_in_ruleActionStatement888);
                    	    lv_params_7_0=ruleContentUriQueryParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getActionStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_7_0, 
                    	              		"ContentUriQueryParam");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:460:3: ( (lv_notifications_8_0= ruleContentNotificationUri ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==25) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:461:1: (lv_notifications_8_0= ruleContentNotificationUri )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:461:1: (lv_notifications_8_0= ruleContentNotificationUri )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:462:3: lv_notifications_8_0= ruleContentNotificationUri
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getActionStatementAccess().getNotificationsContentNotificationUriParserRuleCall_6_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleContentNotificationUri_in_ruleActionStatement910);
                    	    lv_notifications_8_0=ruleContentNotificationUri();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getActionStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"notifications",
                    	              		lv_notifications_8_0, 
                    	              		"ContentNotificationUri");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleActionStatement923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getActionStatementAccess().getRightCurlyBracketKeyword_6_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleActionStatement"


    // $ANTLR start "entryRuleContentNotificationUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:490:1: entryRuleContentNotificationUri returns [EObject current=null] : iv_ruleContentNotificationUri= ruleContentNotificationUri EOF ;
    public final EObject entryRuleContentNotificationUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentNotificationUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:491:2: (iv_ruleContentNotificationUri= ruleContentNotificationUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:492:2: iv_ruleContentNotificationUri= ruleContentNotificationUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentNotificationUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentNotificationUri_in_entryRuleContentNotificationUri961);
            iv_ruleContentNotificationUri=ruleContentNotificationUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentNotificationUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentNotificationUri971); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContentNotificationUri"


    // $ANTLR start "ruleContentNotificationUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:499:1: ruleContentNotificationUri returns [EObject current=null] : (otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) ) ) ;
    public final EObject ruleContentNotificationUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_uri_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:502:28: ( (otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:503:1: (otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:503:1: (otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:503:3: otherlv_0= 'notify' ( (lv_uri_1_0= ruleNotifyContentUri ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleContentNotificationUri1008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentNotificationUriAccess().getNotifyKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:507:1: ( (lv_uri_1_0= ruleNotifyContentUri ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:508:1: (lv_uri_1_0= ruleNotifyContentUri )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:508:1: (lv_uri_1_0= ruleNotifyContentUri )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:509:3: lv_uri_1_0= ruleNotifyContentUri
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContentNotificationUriAccess().getUriNotifyContentUriParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotifyContentUri_in_ruleContentNotificationUri1029);
            lv_uri_1_0=ruleNotifyContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContentNotificationUriRule());
              	        }
                     		set(
                     			current, 
                     			"uri",
                      		lv_uri_1_0, 
                      		"NotifyContentUri");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContentNotificationUri"


    // $ANTLR start "entryRuleFunctionArg"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:533:1: entryRuleFunctionArg returns [EObject current=null] : iv_ruleFunctionArg= ruleFunctionArg EOF ;
    public final EObject entryRuleFunctionArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArg = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:534:2: (iv_ruleFunctionArg= ruleFunctionArg EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:535:2: iv_ruleFunctionArg= ruleFunctionArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionArgRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg1065);
            iv_ruleFunctionArg=ruleFunctionArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArg1075); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionArg"


    // $ANTLR start "ruleFunctionArg"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:542:1: ruleFunctionArg returns [EObject current=null] : ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFunctionArg() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:545:28: ( ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:546:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:546:1: ( ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:546:2: ( (lv_type_0_0= ruleColumnType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:546:2: ( (lv_type_0_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:547:1: (lv_type_0_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:547:1: (lv_type_0_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:548:3: lv_type_0_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionArgAccess().getTypeColumnTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleFunctionArg1121);
            lv_type_0_0=ruleColumnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionArgRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"ColumnType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:564:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:565:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:565:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:566:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionArg1138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionArgAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionArgRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionArg"


    // $ANTLR start "entryRuleNotifyContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:590:1: entryRuleNotifyContentUri returns [EObject current=null] : iv_ruleNotifyContentUri= ruleNotifyContentUri EOF ;
    public final EObject entryRuleNotifyContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotifyContentUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:591:2: (iv_ruleNotifyContentUri= ruleNotifyContentUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:592:2: iv_ruleNotifyContentUri= ruleNotifyContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotifyContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleNotifyContentUri_in_entryRuleNotifyContentUri1179);
            iv_ruleNotifyContentUri=ruleNotifyContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotifyContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotifyContentUri1189); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotifyContentUri"


    // $ANTLR start "ruleNotifyContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:599:1: ruleNotifyContentUri returns [EObject current=null] : ( () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )* ) ;
    public final EObject ruleNotifyContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_segments_1_0 = null;

        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:602:28: ( ( () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:603:1: ( () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:603:1: ( () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:603:2: () ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:603:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:604:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotifyContentUriAccess().getNotifyContentUriAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:609:2: ( (lv_segments_1_0= ruleNotifyContentUriSegment ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:610:1: (lv_segments_1_0= ruleNotifyContentUriSegment )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:610:1: (lv_segments_1_0= ruleNotifyContentUriSegment )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:611:3: lv_segments_1_0= ruleNotifyContentUriSegment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotifyContentUriAccess().getSegmentsNotifyContentUriSegmentParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotifyContentUriSegment_in_ruleNotifyContentUri1244);
                    lv_segments_1_0=ruleNotifyContentUriSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotifyContentUriRule());
                      	        }
                             		add(
                             			current, 
                             			"segments",
                              		lv_segments_1_0, 
                              		"NotifyContentUriSegment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:627:3: (otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:627:5: otherlv_2= '/' ( (lv_segments_3_0= ruleNotifyContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleNotifyContentUri1258); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNotifyContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:631:1: ( (lv_segments_3_0= ruleNotifyContentUriSegment ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:632:1: (lv_segments_3_0= ruleNotifyContentUriSegment )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:632:1: (lv_segments_3_0= ruleNotifyContentUriSegment )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:633:3: lv_segments_3_0= ruleNotifyContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNotifyContentUriAccess().getSegmentsNotifyContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotifyContentUriSegment_in_ruleNotifyContentUri1279);
            	    lv_segments_3_0=ruleNotifyContentUriSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNotifyContentUriRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_3_0, 
            	              		"NotifyContentUriSegment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotifyContentUri"


    // $ANTLR start "entryRuleNotifyContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:657:1: entryRuleNotifyContentUriSegment returns [EObject current=null] : iv_ruleNotifyContentUriSegment= ruleNotifyContentUriSegment EOF ;
    public final EObject entryRuleNotifyContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotifyContentUriSegment = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:658:2: (iv_ruleNotifyContentUriSegment= ruleNotifyContentUriSegment EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:659:2: iv_ruleNotifyContentUriSegment= ruleNotifyContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotifyContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleNotifyContentUriSegment_in_entryRuleNotifyContentUriSegment1317);
            iv_ruleNotifyContentUriSegment=ruleNotifyContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotifyContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotifyContentUriSegment1327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotifyContentUriSegment"


    // $ANTLR start "ruleNotifyContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:666:1: ruleNotifyContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) ) ;
    public final EObject ruleNotifyContentUriSegment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:669:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:670:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:670:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==19) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:670:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:670:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:671:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:671:1: (lv_name_0_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:672:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotifyContentUriSegment1369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getNotifyContentUriSegmentAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNotifyContentUriSegmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:689:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:689:6: ( () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:689:7: () otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:689:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:690:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNotifyContentUriSegmentAccess().getNotifyContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleNotifyContentUriSegment1402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNotifyContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:699:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:700:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:700:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:701:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotifyContentUriSegment1419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getNotifyContentUriSegmentAccess().getNameIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNotifyContentUriSegmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleNotifyContentUriSegment1436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNotifyContentUriSegmentAccess().getRightCurlyBracketKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotifyContentUriSegment"


    // $ANTLR start "entryRuleContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:729:1: entryRuleContentUri returns [EObject current=null] : iv_ruleContentUri= ruleContentUri EOF ;
    public final EObject entryRuleContentUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUri = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:730:2: (iv_ruleContentUri= ruleContentUri EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:731:2: iv_ruleContentUri= ruleContentUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriRule()); 
            }
            pushFollow(FOLLOW_ruleContentUri_in_entryRuleContentUri1473);
            iv_ruleContentUri=ruleContentUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUri1483); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContentUri"


    // $ANTLR start "ruleContentUri"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:738:1: ruleContentUri returns [EObject current=null] : ( () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) ;
    public final EObject ruleContentUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_segments_1_0 = null;

        EObject lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:741:28: ( ( () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:742:1: ( () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:742:1: ( () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:742:2: () ( (lv_segments_1_0= ruleContentUriSegment ) )? (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:742:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:743:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContentUriAccess().getContentUriAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:748:2: ( (lv_segments_1_0= ruleContentUriSegment ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:749:1: (lv_segments_1_0= ruleContentUriSegment )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:749:1: (lv_segments_1_0= ruleContentUriSegment )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:750:3: lv_segments_1_0= ruleContentUriSegment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri1538);
                    lv_segments_1_0=ruleContentUriSegment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContentUriRule());
                      	        }
                             		add(
                             			current, 
                             			"segments",
                              		lv_segments_1_0, 
                              		"ContentUriSegment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:766:3: (otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:766:5: otherlv_2= '/' ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleContentUri1552); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getContentUriAccess().getSolidusKeyword_2_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:770:1: ( (lv_segments_3_0= ruleContentUriSegment ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:771:1: (lv_segments_3_0= ruleContentUriSegment )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:771:1: (lv_segments_3_0= ruleContentUriSegment )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:772:3: lv_segments_3_0= ruleContentUriSegment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContentUriAccess().getSegmentsContentUriSegmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContentUriSegment_in_ruleContentUri1573);
            	    lv_segments_3_0=ruleContentUriSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContentUriRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_3_0, 
            	              		"ContentUriSegment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContentUri"


    // $ANTLR start "entryRuleContentUriQueryParam"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:796:1: entryRuleContentUriQueryParam returns [EObject current=null] : iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF ;
    public final EObject entryRuleContentUriQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriQueryParam = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:797:2: (iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:798:2: iv_ruleContentUriQueryParam= ruleContentUriQueryParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriQueryParamRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriQueryParam_in_entryRuleContentUriQueryParam1611);
            iv_ruleContentUriQueryParam=ruleContentUriQueryParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriQueryParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriQueryParam1621); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContentUriQueryParam"


    // $ANTLR start "ruleContentUriQueryParam"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:805:1: ruleContentUriQueryParam returns [EObject current=null] : (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleContentUriQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_like_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:808:28: ( (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:809:1: (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:809:1: (otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:809:3: otherlv_0= 'param' ( (lv_like_1_0= 'like' ) )? ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleContentUriQueryParam1658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContentUriQueryParamAccess().getParamKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:813:1: ( (lv_like_1_0= 'like' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:814:1: (lv_like_1_0= 'like' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:814:1: (lv_like_1_0= 'like' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:815:3: lv_like_1_0= 'like'
                    {
                    lv_like_1_0=(Token)match(input,28,FOLLOW_28_in_ruleContentUriQueryParam1676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_like_1_0, grammarAccess.getContentUriQueryParamAccess().getLikeLikeKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriQueryParamRule());
                      	        }
                             		setWithLastConsumed(current, "like", true, "like");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:828:3: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:829:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:829:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:830:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContentUriQueryParamRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriQueryParam1710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getContentUriQueryParamAccess().getColumnColumnSourceCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContentUriQueryParam"


    // $ANTLR start "entryRuleContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:849:1: entryRuleContentUriSegment returns [EObject current=null] : iv_ruleContentUriSegment= ruleContentUriSegment EOF ;
    public final EObject entryRuleContentUriSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUriSegment = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:850:2: (iv_ruleContentUriSegment= ruleContentUriSegment EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:851:2: iv_ruleContentUriSegment= ruleContentUriSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentUriSegmentRule()); 
            }
            pushFollow(FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1746);
            iv_ruleContentUriSegment=ruleContentUriSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContentUriSegment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContentUriSegment1756); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContentUriSegment"


    // $ANTLR start "ruleContentUriSegment"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:858:1: ruleContentUriSegment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ) ;
    public final EObject ruleContentUriSegment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:861:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:862:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:862:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==19) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:862:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:862:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:863:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:863:1: (lv_name_0_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:864:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getContentUriSegmentAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:881:6: ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:881:6: ( () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:881:7: () otherlv_2= '{' ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:881:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:882:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getContentUriSegmentAccess().getContentUriParamSegmentAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleContentUriSegment1831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentUriSegmentAccess().getLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:891:1: ( (otherlv_3= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:892:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:892:1: (otherlv_3= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:893:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentUriSegmentRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContentUriSegment1851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getContentUriSegmentAccess().getParamColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleContentUriSegment1863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContentUriSegmentAccess().getRightCurlyBracketKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContentUriSegment"


    // $ANTLR start "entryRuleMigrationBlock"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:916:1: entryRuleMigrationBlock returns [EObject current=null] : iv_ruleMigrationBlock= ruleMigrationBlock EOF ;
    public final EObject entryRuleMigrationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationBlock = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:917:2: (iv_ruleMigrationBlock= ruleMigrationBlock EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:918:2: iv_ruleMigrationBlock= ruleMigrationBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationBlockRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1900);
            iv_ruleMigrationBlock=ruleMigrationBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationBlock1910); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMigrationBlock"


    // $ANTLR start "ruleMigrationBlock"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:925:1: ruleMigrationBlock returns [EObject current=null] : ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' ) ;
    public final EObject ruleMigrationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:928:28: ( ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:929:1: ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:929:1: ( () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:929:2: () otherlv_1= 'migrate' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )* otherlv_8= '}'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:929:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:930:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMigrationBlockAccess().getMigrationBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleMigrationBlock1956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationBlockAccess().getMigrateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:939:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:940:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:940:1: (lv_name_2_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:941:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMigrationBlock1973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getMigrationBlockAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMigrationBlockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:957:2: (otherlv_3= 'from' ( ( ruleQualifiedName ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:957:4: otherlv_3= 'from' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleMigrationBlock1991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMigrationBlockAccess().getFromKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:961:1: ( ( ruleQualifiedName ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:962:1: ( ruleQualifiedName )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:962:1: ( ruleQualifiedName )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:963:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMigrationBlockRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getFromMigrationBlockCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMigrationBlock2014);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleMigrationBlock2028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMigrationBlockAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:980:1: ( ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==94||LA20_0==108||LA20_0==111) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:980:2: ( (lv_statements_6_0= ruleDDLStatement ) ) otherlv_7= ';'
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:980:2: ( (lv_statements_6_0= ruleDDLStatement ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:981:1: (lv_statements_6_0= ruleDDLStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:981:1: (lv_statements_6_0= ruleDDLStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:982:3: lv_statements_6_0= ruleDDLStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationBlockAccess().getStatementsDDLStatementParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDDLStatement_in_ruleMigrationBlock2050);
            	    lv_statements_6_0=ruleDDLStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMigrationBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"DDLStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleMigrationBlock2062); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMigrationBlockAccess().getSemicolonKeyword_5_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleMigrationBlock2076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMigrationBlockAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMigrationBlock"


    // $ANTLR start "entryRuleSqlExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1014:1: entryRuleSqlExpression returns [EObject current=null] : iv_ruleSqlExpression= ruleSqlExpression EOF ;
    public final EObject entryRuleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqlExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1015:2: (iv_ruleSqlExpression= ruleSqlExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1016:2: iv_ruleSqlExpression= ruleSqlExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqlExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression2112);
            iv_ruleSqlExpression=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSqlExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSqlExpression2122); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSqlExpression"


    // $ANTLR start "ruleSqlExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1023:1: ruleSqlExpression returns [EObject current=null] : this_ExprConcat_0= ruleExprConcat ;
    public final EObject ruleSqlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExprConcat_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1026:28: (this_ExprConcat_0= ruleExprConcat )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1028:5: this_ExprConcat_0= ruleExprConcat
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSqlExpressionAccess().getExprConcatParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExprConcat_in_ruleSqlExpression2168);
            this_ExprConcat_0=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprConcat_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSqlExpression"


    // $ANTLR start "entryRuleExprConcat"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1044:1: entryRuleExprConcat returns [EObject current=null] : iv_ruleExprConcat= ruleExprConcat EOF ;
    public final EObject entryRuleExprConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprConcat = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1045:2: (iv_ruleExprConcat= ruleExprConcat EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1046:2: iv_ruleExprConcat= ruleExprConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprConcatRule()); 
            }
            pushFollow(FOLLOW_ruleExprConcat_in_entryRuleExprConcat2202);
            iv_ruleExprConcat=ruleExprConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprConcat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprConcat2212); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprConcat"


    // $ANTLR start "ruleExprConcat"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1053:1: ruleExprConcat returns [EObject current=null] : (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) ;
    public final EObject ruleExprConcat() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprMult_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1056:28: ( (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1057:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1057:1: (this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1058:5: this_ExprMult_0= ruleExprMult ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprConcatAccess().getExprMultParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat2259);
            this_ExprMult_0=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprMult_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1066:1: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1066:2: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleExprMult ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1066:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1067:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprConcatAccess().getExprConcatLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1072:2: ( (lv_op_2_0= '||' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1073:1: (lv_op_2_0= '||' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1073:1: (lv_op_2_0= '||' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1074:3: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,31,FOLLOW_31_in_ruleExprConcat2286); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprConcatAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprConcatRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1087:2: ( (lv_right_3_0= ruleExprMult ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1088:1: (lv_right_3_0= ruleExprMult )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1088:1: (lv_right_3_0= ruleExprMult )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1089:3: lv_right_3_0= ruleExprMult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprConcatAccess().getRightExprMultParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprMult_in_ruleExprConcat2320);
            	    lv_right_3_0=ruleExprMult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprConcatRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprMult");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExprConcat"


    // $ANTLR start "entryRuleExprMult"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1113:1: entryRuleExprMult returns [EObject current=null] : iv_ruleExprMult= ruleExprMult EOF ;
    public final EObject entryRuleExprMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprMult = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1114:2: (iv_ruleExprMult= ruleExprMult EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1115:2: iv_ruleExprMult= ruleExprMult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprMultRule()); 
            }
            pushFollow(FOLLOW_ruleExprMult_in_entryRuleExprMult2358);
            iv_ruleExprMult=ruleExprMult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprMult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprMult2368); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprMult"


    // $ANTLR start "ruleExprMult"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1122:1: ruleExprMult returns [EObject current=null] : (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) ;
    public final EObject ruleExprMult() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_ExprAdd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1125:28: ( (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1126:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1126:1: (this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1127:5: this_ExprAdd_0= ruleExprAdd ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprMultAccess().getExprAddParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult2415);
            this_ExprAdd_0=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAdd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1135:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26||(LA23_0>=32 && LA23_0<=33)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1135:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) ) ( (lv_right_3_0= ruleExprAdd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1135:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1136:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprMultAccess().getExprMultLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1141:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1142:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1142:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1143:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1143:1: (lv_op_2_1= '*' | lv_op_2_2= '/' | lv_op_2_3= '%' )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1144:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_32_in_ruleExprMult2444); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprMultAccess().getOpAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1156:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_ruleExprMult2473); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprMultAccess().getOpSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1168:8: lv_op_2_3= '%'
            	            {
            	            lv_op_2_3=(Token)match(input,33,FOLLOW_33_in_ruleExprMult2502); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprMultAccess().getOpPercentSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprMultRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1183:2: ( (lv_right_3_0= ruleExprAdd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1184:1: (lv_right_3_0= ruleExprAdd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1184:1: (lv_right_3_0= ruleExprAdd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1185:3: lv_right_3_0= ruleExprAdd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprMultAccess().getRightExprAddParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAdd_in_ruleExprMult2539);
            	    lv_right_3_0=ruleExprAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprMultRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprAdd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExprMult"


    // $ANTLR start "entryRuleExprAdd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1209:1: entryRuleExprAdd returns [EObject current=null] : iv_ruleExprAdd= ruleExprAdd EOF ;
    public final EObject entryRuleExprAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAdd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1210:2: (iv_ruleExprAdd= ruleExprAdd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1211:2: iv_ruleExprAdd= ruleExprAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAddRule()); 
            }
            pushFollow(FOLLOW_ruleExprAdd_in_entryRuleExprAdd2577);
            iv_ruleExprAdd=ruleExprAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAdd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAdd2587); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprAdd"


    // $ANTLR start "ruleExprAdd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1218:1: ruleExprAdd returns [EObject current=null] : (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) ;
    public final EObject ruleExprAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_ExprBit_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1221:28: ( (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1222:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1222:1: (this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1223:5: this_ExprBit_0= ruleExprBit ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAddAccess().getExprBitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2634);
            this_ExprBit_0=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprBit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1231:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=34 && LA25_0<=35)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1231:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleExprBit ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1231:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1232:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAddAccess().getExprAddLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1237:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1238:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1238:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1239:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1239:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==34) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==35) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1240:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleExprAdd2663); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprAddAccess().getOpPlusSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprAddRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1252:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleExprAdd2692); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprAddAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprAddRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1267:2: ( (lv_right_3_0= ruleExprBit ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1268:1: (lv_right_3_0= ruleExprBit )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1268:1: (lv_right_3_0= ruleExprBit )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1269:3: lv_right_3_0= ruleExprBit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAddAccess().getRightExprBitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprBit_in_ruleExprAdd2729);
            	    lv_right_3_0=ruleExprBit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprAddRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprBit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExprAdd"


    // $ANTLR start "entryRuleExprBit"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1293:1: entryRuleExprBit returns [EObject current=null] : iv_ruleExprBit= ruleExprBit EOF ;
    public final EObject entryRuleExprBit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBit = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1294:2: (iv_ruleExprBit= ruleExprBit EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1295:2: iv_ruleExprBit= ruleExprBit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBitRule()); 
            }
            pushFollow(FOLLOW_ruleExprBit_in_entryRuleExprBit2767);
            iv_ruleExprBit=ruleExprBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprBit2777); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprBit"


    // $ANTLR start "ruleExprBit"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1302:1: ruleExprBit returns [EObject current=null] : (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) ;
    public final EObject ruleExprBit() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ExprRelate_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1305:28: ( (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1306:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1306:1: (this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1307:5: this_ExprRelate_0= ruleExprRelate ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprBitAccess().getExprRelateParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2824);
            this_ExprRelate_0=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprRelate_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1315:1: ( () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=36 && LA27_0<=39)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1315:2: () ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) ) ( (lv_right_3_0= ruleExprRelate ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1315:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1316:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprBitAccess().getExprBitLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1321:2: ( ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1322:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1322:1: ( (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1323:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1323:1: (lv_op_2_1= '<<' | lv_op_2_2= '>>' | lv_op_2_3= '&' | lv_op_2_4= '|' )
            	    int alt26=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1324:3: lv_op_2_1= '<<'
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_36_in_ruleExprBit2853); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprBitAccess().getOpLessThanSignLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1336:8: lv_op_2_2= '>>'
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_37_in_ruleExprBit2882); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprBitAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1348:8: lv_op_2_3= '&'
            	            {
            	            lv_op_2_3=(Token)match(input,38,FOLLOW_38_in_ruleExprBit2911); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprBitAccess().getOpAmpersandKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1360:8: lv_op_2_4= '|'
            	            {
            	            lv_op_2_4=(Token)match(input,39,FOLLOW_39_in_ruleExprBit2940); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprBitAccess().getOpVerticalLineKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprBitRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1375:2: ( (lv_right_3_0= ruleExprRelate ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1376:1: (lv_right_3_0= ruleExprRelate )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1376:1: (lv_right_3_0= ruleExprRelate )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1377:3: lv_right_3_0= ruleExprRelate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprBitAccess().getRightExprRelateParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprRelate_in_ruleExprBit2977);
            	    lv_right_3_0=ruleExprRelate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprBitRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprRelate");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExprBit"


    // $ANTLR start "entryRuleExprRelate"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1401:1: entryRuleExprRelate returns [EObject current=null] : iv_ruleExprRelate= ruleExprRelate EOF ;
    public final EObject entryRuleExprRelate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRelate = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1402:2: (iv_ruleExprRelate= ruleExprRelate EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1403:2: iv_ruleExprRelate= ruleExprRelate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRelateRule()); 
            }
            pushFollow(FOLLOW_ruleExprRelate_in_entryRuleExprRelate3015);
            iv_ruleExprRelate=ruleExprRelate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRelate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprRelate3025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprRelate"


    // $ANTLR start "ruleExprRelate"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1410:1: ruleExprRelate returns [EObject current=null] : (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) ;
    public final EObject ruleExprRelate() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_ExprEqual_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1413:28: ( (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1414:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1414:1: (this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1415:5: this_ExprEqual_0= ruleExprEqual ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprRelateAccess().getExprEqualParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate3072);
            this_ExprEqual_0=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprEqual_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1423:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=40 && LA29_0<=43)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1423:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleExprEqual ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1423:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1424:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprRelateAccess().getExprRelateLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1429:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1430:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1430:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1431:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1431:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt28=4;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1432:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_40_in_ruleExprRelate3101); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprRelateAccess().getOpLessThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1444:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_41_in_ruleExprRelate3130); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprRelateAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1456:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,42,FOLLOW_42_in_ruleExprRelate3159); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprRelateAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1468:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,43,FOLLOW_43_in_ruleExprRelate3188); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprRelateAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprRelateRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1483:2: ( (lv_right_3_0= ruleExprEqual ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1484:1: (lv_right_3_0= ruleExprEqual )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1484:1: (lv_right_3_0= ruleExprEqual )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1485:3: lv_right_3_0= ruleExprEqual
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprRelateAccess().getRightExprEqualParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprEqual_in_ruleExprRelate3225);
            	    lv_right_3_0=ruleExprEqual();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprRelateRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprEqual");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExprRelate"


    // $ANTLR start "entryRuleExprEqual"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1509:1: entryRuleExprEqual returns [EObject current=null] : iv_ruleExprEqual= ruleExprEqual EOF ;
    public final EObject entryRuleExprEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEqual = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1510:2: (iv_ruleExprEqual= ruleExprEqual EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1511:2: iv_ruleExprEqual= ruleExprEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqualRule()); 
            }
            pushFollow(FOLLOW_ruleExprEqual_in_entryRuleExprEqual3263);
            iv_ruleExprEqual=ruleExprEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEqual; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEqual3273); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprEqual"


    // $ANTLR start "ruleExprEqual"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1518:1: ruleExprEqual returns [EObject current=null] : (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) ;
    public final EObject ruleExprEqual() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        Token lv_op_2_7=null;
        Token lv_op_2_8=null;
        Token lv_op_2_9=null;
        Token lv_op_2_10=null;
        Token lv_op_2_11=null;
        Token lv_op_2_12=null;
        EObject this_ExprAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1521:28: ( (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1522:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1522:1: (this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1523:5: this_ExprAnd_0= ruleExprAnd ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprEqualAccess().getExprAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3320);
            this_ExprAnd_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1531:1: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==28||(LA31_0>=44 && LA31_0<=54)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1531:2: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) ) ( (lv_right_3_0= ruleExprAnd ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1531:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1532:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprEqualAccess().getExprEqualLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1537:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1538:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1538:1: ( (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1539:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1539:1: (lv_op_2_1= '=' | lv_op_2_2= '==' | lv_op_2_3= '!=' | lv_op_2_4= '<>' | lv_op_2_5= 'is' | lv_op_2_6= 'is not' | lv_op_2_7= 'in' | lv_op_2_8= 'not in' | lv_op_2_9= 'like' | lv_op_2_10= 'glob' | lv_op_2_11= 'match' | lv_op_2_12= 'regexp' )
            	    int alt30=12;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt30=4;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt30=5;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt30=6;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt30=7;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt30=8;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt30=9;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt30=10;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt30=11;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt30=12;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1540:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,44,FOLLOW_44_in_ruleExprEqual3349); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getExprEqualAccess().getOpEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1552:8: lv_op_2_2= '=='
            	            {
            	            lv_op_2_2=(Token)match(input,45,FOLLOW_45_in_ruleExprEqual3378); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getExprEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1564:8: lv_op_2_3= '!='
            	            {
            	            lv_op_2_3=(Token)match(input,46,FOLLOW_46_in_ruleExprEqual3407); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getExprEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1576:8: lv_op_2_4= '<>'
            	            {
            	            lv_op_2_4=(Token)match(input,47,FOLLOW_47_in_ruleExprEqual3436); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getExprEqualAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1588:8: lv_op_2_5= 'is'
            	            {
            	            lv_op_2_5=(Token)match(input,48,FOLLOW_48_in_ruleExprEqual3465); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_5, grammarAccess.getExprEqualAccess().getOpIsKeyword_1_1_0_4());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1600:8: lv_op_2_6= 'is not'
            	            {
            	            lv_op_2_6=(Token)match(input,49,FOLLOW_49_in_ruleExprEqual3494); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_6, grammarAccess.getExprEqualAccess().getOpIsNotKeyword_1_1_0_5());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1612:8: lv_op_2_7= 'in'
            	            {
            	            lv_op_2_7=(Token)match(input,50,FOLLOW_50_in_ruleExprEqual3523); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_7, grammarAccess.getExprEqualAccess().getOpInKeyword_1_1_0_6());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_7, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1624:8: lv_op_2_8= 'not in'
            	            {
            	            lv_op_2_8=(Token)match(input,51,FOLLOW_51_in_ruleExprEqual3552); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_8, grammarAccess.getExprEqualAccess().getOpNotInKeyword_1_1_0_7());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_8, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1636:8: lv_op_2_9= 'like'
            	            {
            	            lv_op_2_9=(Token)match(input,28,FOLLOW_28_in_ruleExprEqual3581); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_9, grammarAccess.getExprEqualAccess().getOpLikeKeyword_1_1_0_8());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_9, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1648:8: lv_op_2_10= 'glob'
            	            {
            	            lv_op_2_10=(Token)match(input,52,FOLLOW_52_in_ruleExprEqual3610); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_10, grammarAccess.getExprEqualAccess().getOpGlobKeyword_1_1_0_9());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_10, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1660:8: lv_op_2_11= 'match'
            	            {
            	            lv_op_2_11=(Token)match(input,53,FOLLOW_53_in_ruleExprEqual3639); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_11, grammarAccess.getExprEqualAccess().getOpMatchKeyword_1_1_0_10());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_11, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1672:8: lv_op_2_12= 'regexp'
            	            {
            	            lv_op_2_12=(Token)match(input,54,FOLLOW_54_in_ruleExprEqual3668); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_12, grammarAccess.getExprEqualAccess().getOpRegexpKeyword_1_1_0_11());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getExprEqualRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_12, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1687:2: ( (lv_right_3_0= ruleExprAnd ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1688:1: (lv_right_3_0= ruleExprAnd )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1688:1: (lv_right_3_0= ruleExprAnd )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1689:3: lv_right_3_0= ruleExprAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprEqualAccess().getRightExprAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprEqual3705);
            	    lv_right_3_0=ruleExprAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprEqualRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExprEqual"


    // $ANTLR start "entryRuleExprAnd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1713:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1714:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1715:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd3743);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd3753); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1722:1: ruleExprAnd returns [EObject current=null] : (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_ExprOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1725:28: ( (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1726:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1726:1: (this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1727:5: this_ExprOr_0= ruleExprOr ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprAndAccess().getExprOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3800);
            this_ExprOr_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExprOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1735:1: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==55) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1735:2: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleExprOr ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1735:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1736:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprAndAccess().getExprAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1741:2: ( (lv_op_2_0= 'and' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1742:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1742:1: (lv_op_2_0= 'and' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1743:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,55,FOLLOW_55_in_ruleExprAnd3827); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprAndAccess().getOpAndKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprAndRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1756:2: ( (lv_right_3_0= ruleExprOr ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1757:1: (lv_right_3_0= ruleExprOr )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1757:1: (lv_right_3_0= ruleExprOr )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1758:3: lv_right_3_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprAndAccess().getRightExprOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd3861);
            	    lv_right_3_0=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ExprOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1782:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1783:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1784:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr3899);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr3909); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1791:1: ruleExprOr returns [EObject current=null] : (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_NullCheckExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1794:28: ( (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1795:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1795:1: (this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1796:5: this_NullCheckExpression_0= ruleNullCheckExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprOrAccess().getNullCheckExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr3956);
            this_NullCheckExpression_0=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NullCheckExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1804:1: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==56) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1804:2: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1804:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1805:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExprOrAccess().getExprOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1810:2: ( (lv_op_2_0= 'or' ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1811:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1811:1: (lv_op_2_0= 'or' )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1812:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,56,FOLLOW_56_in_ruleExprOr3983); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getExprOrAccess().getOpOrKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExprOrRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1825:2: ( (lv_right_3_0= ruleNullCheckExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1826:1: (lv_right_3_0= ruleNullCheckExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1826:1: (lv_right_3_0= ruleNullCheckExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1827:3: lv_right_3_0= ruleNullCheckExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprOrAccess().getRightNullCheckExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNullCheckExpression_in_ruleExprOr4017);
            	    lv_right_3_0=ruleNullCheckExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"NullCheckExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleNullCheckExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1851:1: entryRuleNullCheckExpression returns [EObject current=null] : iv_ruleNullCheckExpression= ruleNullCheckExpression EOF ;
    public final EObject entryRuleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullCheckExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1852:2: (iv_ruleNullCheckExpression= ruleNullCheckExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1853:2: iv_ruleNullCheckExpression= ruleNullCheckExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullCheckExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression4055);
            iv_ruleNullCheckExpression=ruleNullCheckExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullCheckExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullCheckExpression4065); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullCheckExpression"


    // $ANTLR start "ruleNullCheckExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1860:1: ruleNullCheckExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) ;
    public final EObject ruleNullCheckExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1863:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1864:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1864:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1865:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression4112);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1873:1: ( () ( (lv_right_2_0= ruleNullExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=57 && LA34_0<=59)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1873:2: () ( (lv_right_2_0= ruleNullExpression ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1873:2: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1874:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getNullCheckExpressionAccess().getNullCheckExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1879:2: ( (lv_right_2_0= ruleNullExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1880:1: (lv_right_2_0= ruleNullExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1880:1: (lv_right_2_0= ruleNullExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1881:3: lv_right_2_0= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNullCheckExpressionAccess().getRightNullExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleNullCheckExpression4142);
                    lv_right_2_0=ruleNullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNullCheckExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"NullExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNullCheckExpression"


    // $ANTLR start "entryRuleNullExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1905:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1906:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1907:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression4180);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression4190); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1914:1: ruleNullExpression returns [EObject current=null] : ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1917:28: ( ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:1: ( ( () otherlv_1= 'is null' ) | ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==57) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=58 && LA36_0<=59)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:2: ( () otherlv_1= 'is null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:2: ( () otherlv_1= 'is null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:3: () otherlv_1= 'is null'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1918:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1919:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getIsNullAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleNullExpression4237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNullExpressionAccess().getIsNullKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1929:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1929:6: ( () (otherlv_3= 'not null' | otherlv_4= 'notnull' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1929:7: () (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1929:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1930:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNullExpressionAccess().getNotNullAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1935:2: (otherlv_3= 'not null' | otherlv_4= 'notnull' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==58) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==59) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1935:4: otherlv_3= 'not null'
                            {
                            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleNullExpression4267); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getNullExpressionAccess().getNotNullKeyword_1_1_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1940:7: otherlv_4= 'notnull'
                            {
                            otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleNullExpression4285); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNullExpressionAccess().getNotnullKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1952:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1953:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1954:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4323);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4333); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1961:1: rulePrimaryExpression returns [EObject current=null] : ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_all_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_not_21_0=null;
        Token lv_exists_22_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token lv_name_34_0=null;
        Token otherlv_35=null;
        Token lv_all_36_0=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        EObject lv_literalValue_15_0 = null;

        EObject lv_expression_18_0 = null;

        EObject lv_select_24_0 = null;

        EObject lv_caseExpression_28_0 = null;

        EObject lv_cases_29_0 = null;

        EObject lv_elseExpression_31_0 = null;

        EObject lv_arguments_37_0 = null;

        EObject lv_arguments_39_0 = null;

        EObject lv_expression_44_0 = null;

        Enumerator lv_type_46_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1964:28: ( ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1965:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1965:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )
            int alt46=10;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1965:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1965:2: ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1965:3: () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1965:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1966:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNewColumnAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_rulePrimaryExpression4380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getNewKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1975:1: ( (otherlv_2= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1976:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1976:1: (otherlv_2= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1977:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1989:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1989:6: ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1989:7: () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1989:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1990:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getOldColumnAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,61,FOLLOW_61_in_rulePrimaryExpression4429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getOldKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:1999:1: ( (otherlv_5= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2000:1: (otherlv_5= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2000:1: (otherlv_5= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2001:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2013:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2013:6: ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2013:7: () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2013:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2014:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getColumnSourceRefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2019:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt38=3;
                    alt38 = dfa38.predict(input);
                    switch (alt38) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2019:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2019:3: ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2019:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.'
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2019:4: ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2019:5: ( ( RULE_ID ) )=> (otherlv_7= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2025:1: (otherlv_7= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2026:3: otherlv_7= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4500); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_0_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_8=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4512); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2042:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2042:6: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2042:7: ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2042:7: ( (otherlv_9= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2043:1: (otherlv_9= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2043:1: (otherlv_9= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2044:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4540); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getSourceSelectSourceCrossReference_2_1_1_0_0()); 
                              	
                            }

                            }


                            }

                            otherlv_10=(Token)match(input,62,FOLLOW_62_in_rulePrimaryExpression4552); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getPrimaryExpressionAccess().getFullStopKeyword_2_1_1_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2059:1: ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) )
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==32) ) {
                                alt37=1;
                            }
                            else if ( (LA37_0==RULE_ID) ) {
                                alt37=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 0, input);

                                throw nvae;
                            }
                            switch (alt37) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2059:2: ( (lv_all_11_0= '*' ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2059:2: ( (lv_all_11_0= '*' ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2060:1: (lv_all_11_0= '*' )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2060:1: (lv_all_11_0= '*' )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2061:3: lv_all_11_0= '*'
                                    {
                                    lv_all_11_0=(Token)match(input,32,FOLLOW_32_in_rulePrimaryExpression4571); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_all_11_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_2_1_1_2_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                             		setWithLastConsumed(current, "all", true, "*");
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2075:6: ( (otherlv_12= RULE_ID ) )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2075:6: ( (otherlv_12= RULE_ID ) )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2076:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2076:1: (otherlv_12= RULE_ID )
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2077:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4610); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		newLeafNode(otherlv_12, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_2_1_1_2_1_0()); 
                                      	
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2089:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2089:6: ( (otherlv_13= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2090:1: (otherlv_13= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2090:1: (otherlv_13= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2091:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression4638); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getColumnColumnSourceCrossReference_2_1_2_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2103:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2103:6: ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2103:7: () ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2103:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2104:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2109:2: ( (lv_literalValue_15_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2110:1: (lv_literalValue_15_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2110:1: (lv_literalValue_15_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2111:3: lv_literalValue_15_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralValueLiteralValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4677);
                    lv_literalValue_15_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literalValue",
                              		lv_literalValue_15_0, 
                              		"LiteralValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2128:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2128:6: ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2128:7: () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2128:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2129:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNestedExpressionAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_17=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression4706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2138:1: ( (lv_expression_18_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2139:1: (lv_expression_18_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2139:1: (lv_expression_18_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2140:3: lv_expression_18_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4727);
                    lv_expression_18_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_18_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,17,FOLLOW_17_in_rulePrimaryExpression4739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2161:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2161:6: ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2161:7: () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2161:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2162:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSelectStatementExpressionAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2167:2: ( (lv_not_21_0= 'not' ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==63) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2168:1: (lv_not_21_0= 'not' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2168:1: (lv_not_21_0= 'not' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2169:3: lv_not_21_0= 'not'
                            {
                            lv_not_21_0=(Token)match(input,63,FOLLOW_63_in_rulePrimaryExpression4774); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_not_21_0, grammarAccess.getPrimaryExpressionAccess().getNotNotKeyword_5_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "not", true, "not");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2182:3: ( (lv_exists_22_0= 'exists' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==64) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2183:1: (lv_exists_22_0= 'exists' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2183:1: (lv_exists_22_0= 'exists' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2184:3: lv_exists_22_0= 'exists'
                            {
                            lv_exists_22_0=(Token)match(input,64,FOLLOW_64_in_rulePrimaryExpression4806); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_exists_22_0, grammarAccess.getPrimaryExpressionAccess().getExistsExistsKeyword_5_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "exists", true, "exists");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_23=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression4832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_5_3());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2201:1: ( (lv_select_24_0= ruleSelectStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2202:1: (lv_select_24_0= ruleSelectStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2202:1: (lv_select_24_0= ruleSelectStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2203:3: lv_select_24_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSelectSelectStatementParserRuleCall_5_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4853);
                    lv_select_24_0=ruleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"select",
                              		lv_select_24_0, 
                              		"SelectStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,17,FOLLOW_17_in_rulePrimaryExpression4865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_5_5());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2224:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2224:6: ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2224:7: () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2224:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2225:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAction_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_27=(Token)match(input,65,FOLLOW_65_in_rulePrimaryExpression4894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPrimaryExpressionAccess().getCaseKeyword_6_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2234:1: ( (lv_caseExpression_28_0= ruleSqlExpression ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_NUMBER)||LA41_0==15||LA41_0==35||(LA41_0>=60 && LA41_0<=61)||(LA41_0>=63 && LA41_0<=65)||LA41_0==68||LA41_0==70||(LA41_0>=90 && LA41_0<=93)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2235:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2235:1: (lv_caseExpression_28_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2236:3: lv_caseExpression_28_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionSqlExpressionParserRuleCall_6_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4915);
                            lv_caseExpression_28_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"caseExpression",
                                      		lv_caseExpression_28_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2252:3: ( (lv_cases_29_0= ruleCase ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==71) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2253:1: (lv_cases_29_0= ruleCase )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2253:1: (lv_cases_29_0= ruleCase )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2254:3: lv_cases_29_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression4937);
                    	    lv_cases_29_0=ruleCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"cases",
                    	              		lv_cases_29_0, 
                    	              		"Case");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2270:3: (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==66) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2270:5: otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            {
                            otherlv_30=(Token)match(input,66,FOLLOW_66_in_rulePrimaryExpression4951); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_30, grammarAccess.getPrimaryExpressionAccess().getElseKeyword_6_4_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2274:1: ( (lv_elseExpression_31_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2275:1: (lv_elseExpression_31_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2276:3: lv_elseExpression_31_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseExpressionSqlExpressionParserRuleCall_6_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4972);
                            lv_elseExpression_31_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"elseExpression",
                                      		lv_elseExpression_31_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_32=(Token)match(input,67,FOLLOW_67_in_rulePrimaryExpression4986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getPrimaryExpressionAccess().getEndKeyword_6_5());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2297:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2297:6: ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2297:7: () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2297:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2298:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2303:2: ( (lv_name_34_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2304:1: (lv_name_34_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2304:1: (lv_name_34_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2305:3: lv_name_34_0= RULE_ID
                    {
                    lv_name_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression5020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_34_0, grammarAccess.getPrimaryExpressionAccess().getNameIDTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_34_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_35=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression5037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_35, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_7_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2325:1: ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==32) ) {
                        alt45=1;
                    }
                    else if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_NUMBER)||LA45_0==15||LA45_0==35||(LA45_0>=60 && LA45_0<=61)||(LA45_0>=63 && LA45_0<=65)||LA45_0==68||LA45_0==70||(LA45_0>=90 && LA45_0<=93)) ) {
                        alt45=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2325:2: ( (lv_all_36_0= '*' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2325:2: ( (lv_all_36_0= '*' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2326:1: (lv_all_36_0= '*' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2326:1: (lv_all_36_0= '*' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2327:3: lv_all_36_0= '*'
                            {
                            lv_all_36_0=(Token)match(input,32,FOLLOW_32_in_rulePrimaryExpression5056); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_all_36_0, grammarAccess.getPrimaryExpressionAccess().getAllAsteriskKeyword_7_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "all", true, "*");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2341:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2341:6: ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2341:7: ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2341:7: ( (lv_arguments_37_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2342:1: (lv_arguments_37_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2342:1: (lv_arguments_37_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2343:3: lv_arguments_37_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5097);
                            lv_arguments_37_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_37_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2359:2: (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==16) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2359:4: otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_38=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression5110); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_38, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_7_3_1_1_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2363:1: ( (lv_arguments_39_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2364:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2364:1: (lv_arguments_39_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2365:3: lv_arguments_39_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgumentsSqlExpressionParserRuleCall_7_3_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5131);
                            	    lv_arguments_39_0=ruleSqlExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_39_0, 
                            	              		"SqlExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,17,FOLLOW_17_in_rulePrimaryExpression5147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2386:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2386:6: ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2386:7: () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2386:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2387:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getCastExpressionAction_8_0(),
                                  current);
                          
                    }

                    }

                    otherlv_42=(Token)match(input,68,FOLLOW_68_in_rulePrimaryExpression5176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getPrimaryExpressionAccess().getCastKeyword_8_1());
                          
                    }
                    otherlv_43=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression5188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_43, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2400:1: ( (lv_expression_44_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2401:1: (lv_expression_44_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2401:1: (lv_expression_44_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2402:3: lv_expression_44_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionSqlExpressionParserRuleCall_8_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5209);
                    lv_expression_44_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_44_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,69,FOLLOW_69_in_rulePrimaryExpression5221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_45, grammarAccess.getPrimaryExpressionAccess().getAsKeyword_8_4());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2422:1: ( (lv_type_46_0= ruleSqliteDataType ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2423:1: (lv_type_46_0= ruleSqliteDataType )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2423:1: (lv_type_46_0= ruleSqliteDataType )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2424:3: lv_type_46_0= ruleSqliteDataType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTypeSqliteDataTypeEnumRuleCall_8_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression5242);
                    lv_type_46_0=ruleSqliteDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_46_0, 
                              		"SqliteDataType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_47=(Token)match(input,17,FOLLOW_17_in_rulePrimaryExpression5254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_47, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_8_6());
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2445:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2445:6: ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2445:7: () otherlv_49= '$' ( (otherlv_50= RULE_ID ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2445:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2446:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getFunctionArgumentAction_9_0(),
                                  current);
                          
                    }

                    }

                    otherlv_49=(Token)match(input,70,FOLLOW_70_in_rulePrimaryExpression5283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getPrimaryExpressionAccess().getDollarSignKeyword_9_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2455:1: ( (otherlv_50= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2456:1: (otherlv_50= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2456:1: (otherlv_50= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2457:3: otherlv_50= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                      	        }
                              
                    }
                    otherlv_50=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression5303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_50, grammarAccess.getPrimaryExpressionAccess().getArgFunctionArgCrossReference_9_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleCase"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2476:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2477:2: (iv_ruleCase= ruleCase EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2478:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase5340);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase5350); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2485:1: ruleCase returns [EObject current=null] : (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_whenExpression_1_0 = null;

        EObject lv_thenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2488:28: ( (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2489:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2489:1: (otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2489:3: otherlv_0= 'when' ( (lv_whenExpression_1_0= ruleSqlExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleCase5387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getWhenKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2493:1: ( (lv_whenExpression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2494:1: (lv_whenExpression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2494:1: (lv_whenExpression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2495:3: lv_whenExpression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhenExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase5408);
            lv_whenExpression_1_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"whenExpression",
                      		lv_whenExpression_1_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleCase5420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getThenKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2515:1: ( (lv_thenExpression_3_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2516:1: (lv_thenExpression_3_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2516:1: (lv_thenExpression_3_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2517:3: lv_thenExpression_3_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCase5441);
            lv_thenExpression_3_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_3_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleSelectStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2541:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2542:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2543:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement5477);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement5487); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2550:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_core_0_0 = null;

        EObject lv_orderby_2_0 = null;

        EObject lv_limit_4_0 = null;

        EObject lv_limitOffset_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2553:28: ( ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2554:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2554:1: ( ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2554:2: ( (lv_core_0_0= ruleSelectCore ) ) (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )? (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2554:2: ( (lv_core_0_0= ruleSelectCore ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2555:1: (lv_core_0_0= ruleSelectCore )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2555:1: (lv_core_0_0= ruleSelectCore )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2556:3: lv_core_0_0= ruleSelectCore
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getCoreSelectCoreParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectCore_in_ruleSelectStatement5533);
            lv_core_0_0=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
              	        }
                     		set(
                     			current, 
                     			"core",
                      		lv_core_0_0, 
                      		"SelectCore");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2572:2: (otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==73) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2572:4: otherlv_1= 'order by' ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleSelectStatement5546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getOrderByKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2576:1: ( (lv_orderby_2_0= ruleOrderingTermList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2577:1: (lv_orderby_2_0= ruleOrderingTermList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2577:1: (lv_orderby_2_0= ruleOrderingTermList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2578:3: lv_orderby_2_0= ruleOrderingTermList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderbyOrderingTermListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5567);
                    lv_orderby_2_0=ruleOrderingTermList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"orderby",
                              		lv_orderby_2_0, 
                              		"OrderingTermList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2594:4: (otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==74) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2594:6: otherlv_3= 'limit' ( (lv_limit_4_0= ruleSqlExpression ) ) ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleSelectStatement5582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getLimitKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2598:1: ( (lv_limit_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2599:1: (lv_limit_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2599:1: (lv_limit_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2600:3: lv_limit_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitSqlExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5603);
                    lv_limit_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"limit",
                              		lv_limit_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2616:2: ( (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==16||LA49_0==75) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2616:3: (otherlv_5= 'offset' | otherlv_6= ',' ) ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2616:3: (otherlv_5= 'offset' | otherlv_6= ',' )
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==75) ) {
                                alt48=1;
                            }
                            else if ( (LA48_0==16) ) {
                                alt48=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 0, input);

                                throw nvae;
                            }
                            switch (alt48) {
                                case 1 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2616:5: otherlv_5= 'offset'
                                    {
                                    otherlv_5=(Token)match(input,75,FOLLOW_75_in_ruleSelectStatement5617); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getOffsetKeyword_2_2_0_0());
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2621:7: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSelectStatement5635); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getCommaKeyword_2_2_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2625:2: ( (lv_limitOffset_7_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2626:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2626:1: (lv_limitOffset_7_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2627:3: lv_limitOffset_7_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getLimitOffsetSqlExpressionParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleSelectStatement5657);
                            lv_limitOffset_7_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"limitOffset",
                                      		lv_limitOffset_7_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleOrderingTermList"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2651:1: entryRuleOrderingTermList returns [EObject current=null] : iv_ruleOrderingTermList= ruleOrderingTermList EOF ;
    public final EObject entryRuleOrderingTermList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTermList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2652:2: (iv_ruleOrderingTermList= ruleOrderingTermList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2653:2: iv_ruleOrderingTermList= ruleOrderingTermList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermListRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5697);
            iv_ruleOrderingTermList=ruleOrderingTermList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTermList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTermList5707); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrderingTermList"


    // $ANTLR start "ruleOrderingTermList"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2660:1: ruleOrderingTermList returns [EObject current=null] : ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) ;
    public final EObject ruleOrderingTermList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_orderingTerms_0_0 = null;

        EObject lv_orderingTerms_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2663:28: ( ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2664:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2664:1: ( ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2664:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) ) (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2664:2: ( (lv_orderingTerms_0_0= ruleOrderingTerm ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2665:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2665:1: (lv_orderingTerms_0_0= ruleOrderingTerm )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2666:3: lv_orderingTerms_0_0= ruleOrderingTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5753);
            lv_orderingTerms_0_0=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderingTermListRule());
              	        }
                     		add(
                     			current, 
                     			"orderingTerms",
                      		lv_orderingTerms_0_0, 
                      		"OrderingTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2682:2: (otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==16) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2682:4: otherlv_1= ',' ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOrderingTermList5766); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOrderingTermListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2686:1: ( (lv_orderingTerms_2_0= ruleOrderingTerm ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2687:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2687:1: (lv_orderingTerms_2_0= ruleOrderingTerm )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2688:3: lv_orderingTerms_2_0= ruleOrderingTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderingTermListAccess().getOrderingTermsOrderingTermParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5787);
            	    lv_orderingTerms_2_0=ruleOrderingTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrderingTermListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"orderingTerms",
            	              		lv_orderingTerms_2_0, 
            	              		"OrderingTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrderingTermList"


    // $ANTLR start "entryRuleSelectCore"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2712:1: entryRuleSelectCore returns [EObject current=null] : iv_ruleSelectCore= ruleSelectCore EOF ;
    public final EObject entryRuleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectCore = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2713:2: (iv_ruleSelectCore= ruleSelectCore EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2714:2: iv_ruleSelectCore= ruleSelectCore EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectCoreRule()); 
            }
            pushFollow(FOLLOW_ruleSelectCore_in_entryRuleSelectCore5825);
            iv_ruleSelectCore=ruleSelectCore();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectCore; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectCore5835); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectCore"


    // $ANTLR start "ruleSelectCore"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2721:1: ruleSelectCore returns [EObject current=null] : (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectCore() throws RecognitionException {
        EObject current = null;

        EObject this_SelectExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2724:28: ( (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2725:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2725:1: (this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2726:5: this_SelectExpression_0= ruleSelectExpression ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectCoreAccess().getSelectExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5882);
            this_SelectExpression_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SelectExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2734:1: ( () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=125 && LA52_0<=128)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2734:2: () ( (lv_op_2_0= ruleCompoundOperator ) ) ( (lv_right_3_0= ruleSelectExpression ) )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2734:2: ()
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2735:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSelectCoreAccess().getSelectCoreLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2740:2: ( (lv_op_2_0= ruleCompoundOperator ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2741:1: (lv_op_2_0= ruleCompoundOperator )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2741:1: (lv_op_2_0= ruleCompoundOperator )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2742:3: lv_op_2_0= ruleCompoundOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getOpCompoundOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompoundOperator_in_ruleSelectCore5912);
            	    lv_op_2_0=ruleCompoundOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"CompoundOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2758:2: ( (lv_right_3_0= ruleSelectExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2759:1: (lv_right_3_0= ruleSelectExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2759:1: (lv_right_3_0= ruleSelectExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2760:3: lv_right_3_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectCoreAccess().getRightSelectExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectCore5933);
            	    lv_right_3_0=ruleSelectExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectCoreRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"SelectExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectCore"


    // $ANTLR start "entryRuleSelectExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2784:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2785:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2786:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5971);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression5981); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectExpression"


    // $ANTLR start "ruleSelectExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2793:1: ruleSelectExpression returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_distinct_2_0=null;
        Token lv_all_3_0=null;
        Token lv_allColumns_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_selectList_5_0 = null;

        EObject lv_source_7_0 = null;

        EObject lv_where_9_0 = null;

        EObject lv_groupBy_11_0 = null;

        EObject lv_having_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2796:28: ( ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2797:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2797:1: ( () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2797:2: () otherlv_1= 'select' ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )? ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) ) (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )? (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )? (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )? (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2797:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2798:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelectExpressionAccess().getSelectExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleSelectExpression6027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelectExpressionAccess().getSelectKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2807:1: ( ( (lv_distinct_2_0= 'distinct' ) ) | ( (lv_all_3_0= 'all' ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==77) ) {
                alt53=1;
            }
            else if ( (LA53_0==78) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2807:2: ( (lv_distinct_2_0= 'distinct' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2807:2: ( (lv_distinct_2_0= 'distinct' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2808:1: (lv_distinct_2_0= 'distinct' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2808:1: (lv_distinct_2_0= 'distinct' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2809:3: lv_distinct_2_0= 'distinct'
                    {
                    lv_distinct_2_0=(Token)match(input,77,FOLLOW_77_in_ruleSelectExpression6046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_distinct_2_0, grammarAccess.getSelectExpressionAccess().getDistinctDistinctKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "distinct", true, "distinct");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2823:6: ( (lv_all_3_0= 'all' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2823:6: ( (lv_all_3_0= 'all' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2824:1: (lv_all_3_0= 'all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2824:1: (lv_all_3_0= 'all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2825:3: lv_all_3_0= 'all'
                    {
                    lv_all_3_0=(Token)match(input,78,FOLLOW_78_in_ruleSelectExpression6083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_all_3_0, grammarAccess.getSelectExpressionAccess().getAllAllKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "all", true, "all");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2838:4: ( ( (lv_allColumns_4_0= '*' ) ) | ( (lv_selectList_5_0= ruleSelectList ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==32) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_NUMBER)||LA54_0==15||LA54_0==35||(LA54_0>=60 && LA54_0<=61)||(LA54_0>=63 && LA54_0<=65)||LA54_0==68||LA54_0==70||(LA54_0>=90 && LA54_0<=93)) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2838:5: ( (lv_allColumns_4_0= '*' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2838:5: ( (lv_allColumns_4_0= '*' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2839:1: (lv_allColumns_4_0= '*' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2839:1: (lv_allColumns_4_0= '*' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2840:3: lv_allColumns_4_0= '*'
                    {
                    lv_allColumns_4_0=(Token)match(input,32,FOLLOW_32_in_ruleSelectExpression6117); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_allColumns_4_0, grammarAccess.getSelectExpressionAccess().getAllColumnsAsteriskKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "allColumns", true, "*");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2854:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2854:6: ( (lv_selectList_5_0= ruleSelectList ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2855:1: (lv_selectList_5_0= ruleSelectList )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2855:1: (lv_selectList_5_0= ruleSelectList )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2856:3: lv_selectList_5_0= ruleSelectList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectListSelectListParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectList_in_ruleSelectExpression6157);
                    lv_selectList_5_0=ruleSelectList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"selectList",
                              		lv_selectList_5_0, 
                              		"SelectList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2872:3: (otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2872:5: otherlv_6= 'from' ( (lv_source_7_0= ruleJoinSource ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleSelectExpression6171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSelectExpressionAccess().getFromKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2876:1: ( (lv_source_7_0= ruleJoinSource ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2877:1: (lv_source_7_0= ruleJoinSource )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2877:1: (lv_source_7_0= ruleJoinSource )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2878:3: lv_source_7_0= ruleJoinSource
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getSourceJoinSourceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJoinSource_in_ruleSelectExpression6192);
                    lv_source_7_0=ruleJoinSource();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_7_0, 
                              		"JoinSource");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2894:4: (otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==79) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2894:6: otherlv_8= 'where' ( (lv_where_9_0= ruleWhereExpressions ) )
                    {
                    otherlv_8=(Token)match(input,79,FOLLOW_79_in_ruleSelectExpression6207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSelectExpressionAccess().getWhereKeyword_5_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2898:1: ( (lv_where_9_0= ruleWhereExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2899:1: (lv_where_9_0= ruleWhereExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2899:1: (lv_where_9_0= ruleWhereExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2900:3: lv_where_9_0= ruleWhereExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getWhereWhereExpressionsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereExpressions_in_ruleSelectExpression6228);
                    lv_where_9_0=ruleWhereExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"where",
                              		lv_where_9_0, 
                              		"WhereExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2916:4: (otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==80) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2916:6: otherlv_10= 'group by' ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    {
                    otherlv_10=(Token)match(input,80,FOLLOW_80_in_ruleSelectExpression6243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectExpressionAccess().getGroupByKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2920:1: ( (lv_groupBy_11_0= ruleGroupByExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2921:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2921:1: (lv_groupBy_11_0= ruleGroupByExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2922:3: lv_groupBy_11_0= ruleGroupByExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getGroupByGroupByExpressionsParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression6264);
                    lv_groupBy_11_0=ruleGroupByExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"groupBy",
                              		lv_groupBy_11_0, 
                              		"GroupByExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2938:4: (otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==81) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2938:6: otherlv_12= 'having' ( (lv_having_13_0= ruleHavingExpressions ) )
                    {
                    otherlv_12=(Token)match(input,81,FOLLOW_81_in_ruleSelectExpression6279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSelectExpressionAccess().getHavingKeyword_7_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2942:1: ( (lv_having_13_0= ruleHavingExpressions ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2943:1: (lv_having_13_0= ruleHavingExpressions )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2943:1: (lv_having_13_0= ruleHavingExpressions )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2944:3: lv_having_13_0= ruleHavingExpressions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectExpressionAccess().getHavingHavingExpressionsParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingExpressions_in_ruleSelectExpression6300);
                    lv_having_13_0=ruleHavingExpressions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"having",
                              		lv_having_13_0, 
                              		"HavingExpressions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRuleSelectList"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2968:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2969:2: (iv_ruleSelectList= ruleSelectList EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2970:2: iv_ruleSelectList= ruleSelectList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectListRule()); 
            }
            pushFollow(FOLLOW_ruleSelectList_in_entryRuleSelectList6338);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectList6348); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectList"


    // $ANTLR start "ruleSelectList"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2977:1: ruleSelectList returns [EObject current=null] : ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_resultColumns_0_0 = null;

        EObject lv_resultColumns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2980:28: ( ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2981:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2981:1: ( ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2981:2: ( (lv_resultColumns_0_0= ruleResultColumn ) ) (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2981:2: ( (lv_resultColumns_0_0= ruleResultColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2982:1: (lv_resultColumns_0_0= ruleResultColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2982:1: (lv_resultColumns_0_0= ruleResultColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2983:3: lv_resultColumns_0_0= ruleResultColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList6394);
            lv_resultColumns_0_0=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectListRule());
              	        }
                     		add(
                     			current, 
                     			"resultColumns",
                      		lv_resultColumns_0_0, 
                      		"ResultColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2999:2: (otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==16) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2999:4: otherlv_1= ',' ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSelectList6407); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3003:1: ( (lv_resultColumns_2_0= ruleResultColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3004:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3004:1: (lv_resultColumns_2_0= ruleResultColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3005:3: lv_resultColumns_2_0= ruleResultColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectListAccess().getResultColumnsResultColumnParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResultColumn_in_ruleSelectList6428);
            	    lv_resultColumns_2_0=ruleResultColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"resultColumns",
            	              		lv_resultColumns_2_0, 
            	              		"ResultColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRuleWhereExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3029:1: entryRuleWhereExpressions returns [EObject current=null] : iv_ruleWhereExpressions= ruleWhereExpressions EOF ;
    public final EObject entryRuleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3030:2: (iv_ruleWhereExpressions= ruleWhereExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3031:2: iv_ruleWhereExpressions= ruleWhereExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions6466);
            iv_ruleWhereExpressions=ruleWhereExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereExpressions6476); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWhereExpressions"


    // $ANTLR start "ruleWhereExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3038:1: ruleWhereExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleWhereExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3041:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3042:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3042:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3043:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3043:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3044:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6521);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereExpressionsRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleWhereExpressions"


    // $ANTLR start "entryRuleGroupByExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3068:1: entryRuleGroupByExpressions returns [EObject current=null] : iv_ruleGroupByExpressions= ruleGroupByExpressions EOF ;
    public final EObject entryRuleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3069:2: (iv_ruleGroupByExpressions= ruleGroupByExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3070:2: iv_ruleGroupByExpressions= ruleGroupByExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6556);
            iv_ruleGroupByExpressions=ruleGroupByExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByExpressions6566); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroupByExpressions"


    // $ANTLR start "ruleGroupByExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3077:1: ruleGroupByExpressions returns [EObject current=null] : ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) ;
    public final EObject ruleGroupByExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_groupByExpressions_0_0 = null;

        EObject lv_groupByExpressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3080:28: ( ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3081:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3081:1: ( ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3081:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) ) (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3081:2: ( (lv_groupByExpressions_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3082:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3082:1: (lv_groupByExpressions_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3083:3: lv_groupByExpressions_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6612);
            lv_groupByExpressions_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroupByExpressionsRule());
              	        }
                     		add(
                     			current, 
                     			"groupByExpressions",
                      		lv_groupByExpressions_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3099:2: (otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==16) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3099:4: otherlv_1= ',' ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleGroupByExpressions6625); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getGroupByExpressionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3103:1: ( (lv_groupByExpressions_2_0= ruleSqlExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3104:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3104:1: (lv_groupByExpressions_2_0= ruleSqlExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3105:3: lv_groupByExpressions_2_0= ruleSqlExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByExpressionsAccess().getGroupByExpressionsSqlExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6646);
            	    lv_groupByExpressions_2_0=ruleSqlExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroupByExpressionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"groupByExpressions",
            	              		lv_groupByExpressions_2_0, 
            	              		"SqlExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroupByExpressions"


    // $ANTLR start "entryRuleHavingExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3129:1: entryRuleHavingExpressions returns [EObject current=null] : iv_ruleHavingExpressions= ruleHavingExpressions EOF ;
    public final EObject entryRuleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingExpressions = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3130:2: (iv_ruleHavingExpressions= ruleHavingExpressions EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3131:2: iv_ruleHavingExpressions= ruleHavingExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingExpressionsRule()); 
            }
            pushFollow(FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6684);
            iv_ruleHavingExpressions=ruleHavingExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingExpressions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingExpressions6694); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHavingExpressions"


    // $ANTLR start "ruleHavingExpressions"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3138:1: ruleHavingExpressions returns [EObject current=null] : ( (lv_expression_0_0= ruleSqlExpression ) ) ;
    public final EObject ruleHavingExpressions() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3141:28: ( ( (lv_expression_0_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3142:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3142:1: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3143:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3143:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3144:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingExpressionsAccess().getExpressionSqlExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6739);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHavingExpressionsRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHavingExpressions"


    // $ANTLR start "entryRuleOrderingTerm"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3168:1: entryRuleOrderingTerm returns [EObject current=null] : iv_ruleOrderingTerm= ruleOrderingTerm EOF ;
    public final EObject entryRuleOrderingTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderingTerm = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3169:2: (iv_ruleOrderingTerm= ruleOrderingTerm EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3170:2: iv_ruleOrderingTerm= ruleOrderingTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderingTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6774);
            iv_ruleOrderingTerm=ruleOrderingTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderingTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderingTerm6784); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrderingTerm"


    // $ANTLR start "ruleOrderingTerm"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3177:1: ruleOrderingTerm returns [EObject current=null] : ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) ;
    public final EObject ruleOrderingTerm() throws RecognitionException {
        EObject current = null;

        Token lv_asc_1_0=null;
        Token lv_desc_2_0=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3180:28: ( ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3181:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3181:1: ( ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3181:2: ( (lv_expression_0_0= ruleSqlExpression ) ) ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3181:2: ( (lv_expression_0_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3182:1: (lv_expression_0_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3182:1: (lv_expression_0_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3183:3: lv_expression_0_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderingTermAccess().getExpressionSqlExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6830);
            lv_expression_0_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderingTermRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_0_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3199:2: ( ( (lv_asc_1_0= 'asc' ) ) | ( (lv_desc_2_0= 'desc' ) ) )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==82) ) {
                alt61=1;
            }
            else if ( (LA61_0==83) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3199:3: ( (lv_asc_1_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3199:3: ( (lv_asc_1_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3200:1: (lv_asc_1_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3200:1: (lv_asc_1_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3201:3: lv_asc_1_0= 'asc'
                    {
                    lv_asc_1_0=(Token)match(input,82,FOLLOW_82_in_ruleOrderingTerm6849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asc_1_0, grammarAccess.getOrderingTermAccess().getAscAscKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrderingTermRule());
                      	        }
                             		setWithLastConsumed(current, "asc", true, "asc");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3215:6: ( (lv_desc_2_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3215:6: ( (lv_desc_2_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3216:1: (lv_desc_2_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3216:1: (lv_desc_2_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3217:3: lv_desc_2_0= 'desc'
                    {
                    lv_desc_2_0=(Token)match(input,83,FOLLOW_83_in_ruleOrderingTerm6886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_desc_2_0, grammarAccess.getOrderingTermAccess().getDescDescKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrderingTermRule());
                      	        }
                             		setWithLastConsumed(current, "desc", true, "desc");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrderingTerm"


    // $ANTLR start "entryRuleJoinSource"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3238:1: entryRuleJoinSource returns [EObject current=null] : iv_ruleJoinSource= ruleJoinSource EOF ;
    public final EObject entryRuleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3239:2: (iv_ruleJoinSource= ruleJoinSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3240:2: iv_ruleJoinSource= ruleJoinSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinSourceRule()); 
            }
            pushFollow(FOLLOW_ruleJoinSource_in_entryRuleJoinSource6937);
            iv_ruleJoinSource=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinSource6947); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJoinSource"


    // $ANTLR start "ruleJoinSource"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3247:1: ruleJoinSource returns [EObject current=null] : ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) ;
    public final EObject ruleJoinSource() throws RecognitionException {
        EObject current = null;

        EObject lv_source_0_0 = null;

        EObject lv_joinStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3250:28: ( ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3251:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3251:1: ( ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3251:2: ( (lv_source_0_0= ruleSingleSource ) ) ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3251:2: ( (lv_source_0_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3252:1: (lv_source_0_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3252:1: (lv_source_0_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3253:3: lv_source_0_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinSourceAccess().getSourceSingleSourceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinSource6993);
            lv_source_0_0=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinSourceRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_0_0, 
                      		"SingleSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3269:2: ( (lv_joinStatements_1_0= ruleJoinStatement ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=84 && LA62_0<=85)||(LA62_0>=87 && LA62_0<=89)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3270:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3270:1: (lv_joinStatements_1_0= ruleJoinStatement )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3271:3: lv_joinStatements_1_0= ruleJoinStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJoinSourceAccess().getJoinStatementsJoinStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJoinStatement_in_ruleJoinSource7014);
            	    lv_joinStatements_1_0=ruleJoinStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getJoinSourceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"joinStatements",
            	              		lv_joinStatements_1_0, 
            	              		"JoinStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJoinSource"


    // $ANTLR start "entryRuleSingleSource"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3295:1: entryRuleSingleSource returns [EObject current=null] : iv_ruleSingleSource= ruleSingleSource EOF ;
    public final EObject entryRuleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSource = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3296:2: (iv_ruleSingleSource= ruleSingleSource EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3297:2: iv_ruleSingleSource= ruleSingleSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSource_in_entryRuleSingleSource7051);
            iv_ruleSingleSource=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSource7061); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleSource"


    // $ANTLR start "ruleSingleSource"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3304:1: ruleSingleSource returns [EObject current=null] : (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) ;
    public final EObject ruleSingleSource() throws RecognitionException {
        EObject current = null;

        EObject this_SingleSourceTable_0 = null;

        EObject this_SingleSourceSelectStatement_1 = null;

        EObject this_SingleSourceJoin_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3307:28: ( (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3308:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3308:1: (this_SingleSourceTable_0= ruleSingleSourceTable | this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement | this_SingleSourceJoin_2= ruleSingleSourceJoin )
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            else if ( (LA63_0==15) ) {
                int LA63_2 = input.LA(2);

                if ( (LA63_2==76) ) {
                    alt63=2;
                }
                else if ( (LA63_2==RULE_ID||LA63_2==15) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3309:5: this_SingleSourceTable_0= ruleSingleSourceTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceTableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceTable_in_ruleSingleSource7108);
                    this_SingleSourceTable_0=ruleSingleSourceTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceTable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3319:5: this_SingleSourceSelectStatement_1= ruleSingleSourceSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceSelectStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource7135);
                    this_SingleSourceSelectStatement_1=ruleSingleSourceSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceSelectStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3329:5: this_SingleSourceJoin_2= ruleSingleSourceJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleSourceAccess().getSingleSourceJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource7162);
                    this_SingleSourceJoin_2=ruleSingleSourceJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleSourceJoin_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSingleSource"


    // $ANTLR start "entryRuleSingleSourceTable"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3345:1: entryRuleSingleSourceTable returns [EObject current=null] : iv_ruleSingleSourceTable= ruleSingleSourceTable EOF ;
    public final EObject entryRuleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceTable = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3346:2: (iv_ruleSingleSourceTable= ruleSingleSourceTable EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3347:2: iv_ruleSingleSourceTable= ruleSingleSourceTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceTableRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable7197);
            iv_ruleSingleSourceTable=ruleSingleSourceTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceTable7207); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleSourceTable"


    // $ANTLR start "ruleSingleSourceTable"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3354:1: ruleSingleSourceTable returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3357:28: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3358:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3358:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3358:2: () ( ( ruleQualifiedName ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3358:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3359:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceTableAccess().getSingleSourceTableAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3364:2: ( ( ruleQualifiedName ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3365:1: ( ruleQualifiedName )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3365:1: ( ruleQualifiedName )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3366:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceTableAccess().getTableReferenceTableDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable7264);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3379:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==69) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3379:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleSingleSourceTable7277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleSourceTableAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3383:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3384:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3384:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3385:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceTable7294); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getSingleSourceTableAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSingleSourceTableRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSingleSourceTable"


    // $ANTLR start "entryRuleSingleSourceSelectStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3409:1: entryRuleSingleSourceSelectStatement returns [EObject current=null] : iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF ;
    public final EObject entryRuleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceSelectStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3410:2: (iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3411:2: iv_ruleSingleSourceSelectStatement= ruleSingleSourceSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement7337);
            iv_ruleSingleSourceSelectStatement=ruleSingleSourceSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement7347); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleSourceSelectStatement"


    // $ANTLR start "ruleSingleSourceSelectStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3418:1: ruleSingleSourceSelectStatement returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleSingleSourceSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        EObject lv_selectStatement_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3421:28: ( ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3422:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3422:1: ( () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3422:2: () otherlv_1= '(' ( (lv_selectStatement_2_0= ruleSelectStatement ) ) otherlv_3= ')' (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3422:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3423:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleSourceSelectStatementAccess().getSingleSourceSelectStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleSingleSourceSelectStatement7393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSingleSourceSelectStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3432:1: ( (lv_selectStatement_2_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3433:1: (lv_selectStatement_2_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3433:1: (lv_selectStatement_2_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3434:3: lv_selectStatement_2_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceSelectStatementAccess().getSelectStatementSelectStatementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement7414);
            lv_selectStatement_2_0=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleSourceSelectStatementRule());
              	        }
                     		set(
                     			current, 
                     			"selectStatement",
                      		lv_selectStatement_2_0, 
                      		"SelectStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSingleSourceSelectStatement7426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSingleSourceSelectStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3454:1: (otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==69) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3454:3: otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleSingleSourceSelectStatement7439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSingleSourceSelectStatementAccess().getAsKeyword_4_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3458:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3459:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3459:1: (lv_name_5_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3460:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement7456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getSingleSourceSelectStatementAccess().getNameIDTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSingleSourceSelectStatementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSingleSourceSelectStatement"


    // $ANTLR start "entryRuleSingleSourceJoin"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3484:1: entryRuleSingleSourceJoin returns [EObject current=null] : iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF ;
    public final EObject entryRuleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleSourceJoin = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3485:2: (iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3486:2: iv_ruleSingleSourceJoin= ruleSingleSourceJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleSourceJoinRule()); 
            }
            pushFollow(FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7499);
            iv_ruleSingleSourceJoin=ruleSingleSourceJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleSourceJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleSourceJoin7509); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleSourceJoin"


    // $ANTLR start "ruleSingleSourceJoin"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3493:1: ruleSingleSourceJoin returns [EObject current=null] : (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) ;
    public final EObject ruleSingleSourceJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_joinSource_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3496:28: ( (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3497:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3497:1: (otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3497:3: otherlv_0= '(' ( (lv_joinSource_1_0= ruleJoinSource ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSingleSourceJoin7546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSingleSourceJoinAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3501:1: ( (lv_joinSource_1_0= ruleJoinSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3502:1: (lv_joinSource_1_0= ruleJoinSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3502:1: (lv_joinSource_1_0= ruleJoinSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3503:3: lv_joinSource_1_0= ruleJoinSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleSourceJoinAccess().getJoinSourceJoinSourceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7567);
            lv_joinSource_1_0=ruleJoinSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleSourceJoinRule());
              	        }
                     		set(
                     			current, 
                     			"joinSource",
                      		lv_joinSource_1_0, 
                      		"JoinSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSingleSourceJoin7579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSingleSourceJoinAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSingleSourceJoin"


    // $ANTLR start "entryRuleJoinStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3531:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3532:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3533:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7615);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement7625); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJoinStatement"


    // $ANTLR start "ruleJoinStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3540:1: ruleJoinStatement returns [EObject current=null] : ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleJoinStatement() throws RecognitionException {
        EObject current = null;

        Token lv_natural_1_0=null;
        Token lv_left_2_0=null;
        Token lv_outer_3_0=null;
        Token lv_inner_4_0=null;
        Token lv_cross_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_singleSource_7_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3543:28: ( ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:1: ( () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:2: () ( (lv_natural_1_0= 'natural' ) )? ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )? otherlv_6= 'join' ( (lv_singleSource_7_0= ruleSingleSource ) ) otherlv_8= 'on' ( (lv_expression_9_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3544:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3545:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJoinStatementAccess().getJoinStatementAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3550:2: ( (lv_natural_1_0= 'natural' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==84) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3551:1: (lv_natural_1_0= 'natural' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3551:1: (lv_natural_1_0= 'natural' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3552:3: lv_natural_1_0= 'natural'
                    {
                    lv_natural_1_0=(Token)match(input,84,FOLLOW_84_in_ruleJoinStatement7677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_natural_1_0, grammarAccess.getJoinStatementAccess().getNaturalNaturalKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "natural", true, "natural");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3565:3: ( ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? ) | ( (lv_inner_4_0= 'inner' ) ) | ( (lv_cross_5_0= 'cross' ) ) )?
            int alt68=4;
            switch ( input.LA(1) ) {
                case 85:
                    {
                    alt68=1;
                    }
                    break;
                case 87:
                    {
                    alt68=2;
                    }
                    break;
                case 88:
                    {
                    alt68=3;
                    }
                    break;
            }

            switch (alt68) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3565:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3565:4: ( ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3565:5: ( (lv_left_2_0= 'left' ) ) ( (lv_outer_3_0= 'outer' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3565:5: ( (lv_left_2_0= 'left' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3566:1: (lv_left_2_0= 'left' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3566:1: (lv_left_2_0= 'left' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3567:3: lv_left_2_0= 'left'
                    {
                    lv_left_2_0=(Token)match(input,85,FOLLOW_85_in_ruleJoinStatement7711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_left_2_0, grammarAccess.getJoinStatementAccess().getLeftLeftKeyword_2_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "left", true, "left");
                      	    
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3580:2: ( (lv_outer_3_0= 'outer' ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==86) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3581:1: (lv_outer_3_0= 'outer' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3581:1: (lv_outer_3_0= 'outer' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3582:3: lv_outer_3_0= 'outer'
                            {
                            lv_outer_3_0=(Token)match(input,86,FOLLOW_86_in_ruleJoinStatement7742); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_outer_3_0, grammarAccess.getJoinStatementAccess().getOuterOuterKeyword_2_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getJoinStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "outer", true, "outer");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3596:6: ( (lv_inner_4_0= 'inner' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3596:6: ( (lv_inner_4_0= 'inner' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3597:1: (lv_inner_4_0= 'inner' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3597:1: (lv_inner_4_0= 'inner' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3598:3: lv_inner_4_0= 'inner'
                    {
                    lv_inner_4_0=(Token)match(input,87,FOLLOW_87_in_ruleJoinStatement7781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_inner_4_0, grammarAccess.getJoinStatementAccess().getInnerInnerKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "inner", true, "inner");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3612:6: ( (lv_cross_5_0= 'cross' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3612:6: ( (lv_cross_5_0= 'cross' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3613:1: (lv_cross_5_0= 'cross' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3613:1: (lv_cross_5_0= 'cross' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3614:3: lv_cross_5_0= 'cross'
                    {
                    lv_cross_5_0=(Token)match(input,88,FOLLOW_88_in_ruleJoinStatement7818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_cross_5_0, grammarAccess.getJoinStatementAccess().getCrossCrossKeyword_2_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinStatementRule());
                      	        }
                             		setWithLastConsumed(current, "cross", true, "cross");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,89,FOLLOW_89_in_ruleJoinStatement7845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getJoinStatementAccess().getJoinKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3631:1: ( (lv_singleSource_7_0= ruleSingleSource ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3632:1: (lv_singleSource_7_0= ruleSingleSource )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3632:1: (lv_singleSource_7_0= ruleSingleSource )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3633:3: lv_singleSource_7_0= ruleSingleSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getSingleSourceSingleSourceParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSingleSource_in_ruleJoinStatement7866);
            lv_singleSource_7_0=ruleSingleSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
              	        }
                     		set(
                     			current, 
                     			"singleSource",
                      		lv_singleSource_7_0, 
                      		"SingleSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleJoinStatement7878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getJoinStatementAccess().getOnKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3653:1: ( (lv_expression_9_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3654:1: (lv_expression_9_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3654:1: (lv_expression_9_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3655:3: lv_expression_9_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinStatementAccess().getExpressionSqlExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleJoinStatement7899);
            lv_expression_9_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_9_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJoinStatement"


    // $ANTLR start "entryRuleResultColumn"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3679:1: entryRuleResultColumn returns [EObject current=null] : iv_ruleResultColumn= ruleResultColumn EOF ;
    public final EObject entryRuleResultColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3680:2: (iv_ruleResultColumn= ruleResultColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3681:2: iv_ruleResultColumn= ruleResultColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultColumnRule()); 
            }
            pushFollow(FOLLOW_ruleResultColumn_in_entryRuleResultColumn7935);
            iv_ruleResultColumn=ruleResultColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResultColumn7945); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResultColumn"


    // $ANTLR start "ruleResultColumn"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3688:1: ruleResultColumn returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleResultColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3691:28: ( ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3692:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3692:1: ( () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3692:2: () ( (lv_expression_1_0= ruleSqlExpression ) ) (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3692:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3693:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getResultColumnAccess().getResultColumnAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3698:2: ( (lv_expression_1_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3699:1: (lv_expression_1_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3699:1: (lv_expression_1_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3700:3: lv_expression_1_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResultColumnAccess().getExpressionSqlExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleResultColumn8000);
            lv_expression_1_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResultColumnRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3716:2: (otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==69) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3716:4: otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleResultColumn8013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getResultColumnAccess().getAsKeyword_2_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3720:1: ( (lv_name_3_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3721:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3721:1: (lv_name_3_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3722:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResultColumn8030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getResultColumnAccess().getNameIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getResultColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleResultColumn"


    // $ANTLR start "entryRuleLiteralValue"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3746:1: entryRuleLiteralValue returns [EObject current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final EObject entryRuleLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3747:2: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3748:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue8073);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValue8083); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3755:1: ruleLiteralValue returns [EObject current=null] : ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) ;
    public final EObject ruleLiteralValue() throws RecognitionException {
        EObject current = null;

        Token lv_literal_3_0=null;
        Token lv_literal_5_0=null;
        Token lv_literal_7_0=null;
        Token lv_literal_9_0=null;
        Token lv_literal_11_0=null;
        AntlrDatatypeRuleToken lv_number_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3758:28: ( ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3759:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3759:1: ( ( () ( (lv_number_1_0= ruleSignedNumber ) ) ) | ( () ( (lv_literal_3_0= RULE_STRING ) ) ) | ( () ( (lv_literal_5_0= 'null' ) ) ) | ( () ( (lv_literal_7_0= 'current_time' ) ) ) | ( () ( (lv_literal_9_0= 'current_date' ) ) ) | ( () ( (lv_literal_11_0= 'current_timestamp' ) ) ) )
            int alt70=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
            case 35:
                {
                alt70=1;
                }
                break;
            case RULE_STRING:
                {
                alt70=2;
                }
                break;
            case 90:
                {
                alt70=3;
                }
                break;
            case 91:
                {
                alt70=4;
                }
                break;
            case 92:
                {
                alt70=5;
                }
                break;
            case 93:
                {
                alt70=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3759:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3759:2: ( () ( (lv_number_1_0= ruleSignedNumber ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3759:3: () ( (lv_number_1_0= ruleSignedNumber ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3759:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3760:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNumericLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3765:2: ( (lv_number_1_0= ruleSignedNumber ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3766:1: (lv_number_1_0= ruleSignedNumber )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3766:1: (lv_number_1_0= ruleSignedNumber )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3767:3: lv_number_1_0= ruleSignedNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralValueAccess().getNumberSignedNumberParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedNumber_in_ruleLiteralValue8139);
                    lv_number_1_0=ruleSignedNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralValueRule());
                      	        }
                             		set(
                             			current, 
                             			"number",
                              		lv_number_1_0, 
                              		"SignedNumber");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3784:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3784:6: ( () ( (lv_literal_3_0= RULE_STRING ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3784:7: () ( (lv_literal_3_0= RULE_STRING ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3784:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3785:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getStringLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3790:2: ( (lv_literal_3_0= RULE_STRING ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3791:1: (lv_literal_3_0= RULE_STRING )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3791:1: (lv_literal_3_0= RULE_STRING )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3792:3: lv_literal_3_0= RULE_STRING
                    {
                    lv_literal_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteralValue8173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_literal_3_0, grammarAccess.getLiteralValueAccess().getLiteralSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"literal",
                              		lv_literal_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:6: ( () ( (lv_literal_5_0= 'null' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:7: () ( (lv_literal_5_0= 'null' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3809:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3810:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getNullLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3815:2: ( (lv_literal_5_0= 'null' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3816:1: (lv_literal_5_0= 'null' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3816:1: (lv_literal_5_0= 'null' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3817:3: lv_literal_5_0= 'null'
                    {
                    lv_literal_5_0=(Token)match(input,90,FOLLOW_90_in_ruleLiteralValue8213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_5_0, grammarAccess.getLiteralValueAccess().getLiteralNullKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_5_0, "null");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:6: ( () ( (lv_literal_7_0= 'current_time' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:7: () ( (lv_literal_7_0= 'current_time' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3831:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3832:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3837:2: ( (lv_literal_7_0= 'current_time' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3838:1: (lv_literal_7_0= 'current_time' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3838:1: (lv_literal_7_0= 'current_time' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3839:3: lv_literal_7_0= 'current_time'
                    {
                    lv_literal_7_0=(Token)match(input,91,FOLLOW_91_in_ruleLiteralValue8261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_7_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_timeKeyword_3_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_7_0, "current_time");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3853:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3853:6: ( () ( (lv_literal_9_0= 'current_date' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3853:7: () ( (lv_literal_9_0= 'current_date' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3853:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3854:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentDateLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3859:2: ( (lv_literal_9_0= 'current_date' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3860:1: (lv_literal_9_0= 'current_date' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3860:1: (lv_literal_9_0= 'current_date' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3861:3: lv_literal_9_0= 'current_date'
                    {
                    lv_literal_9_0=(Token)match(input,92,FOLLOW_92_in_ruleLiteralValue8309); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_9_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_dateKeyword_4_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_9_0, "current_date");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3875:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3875:6: ( () ( (lv_literal_11_0= 'current_timestamp' ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3875:7: () ( (lv_literal_11_0= 'current_timestamp' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3875:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3876:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralValueAccess().getCurrentTimeStampLiteralAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3881:2: ( (lv_literal_11_0= 'current_timestamp' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3882:1: (lv_literal_11_0= 'current_timestamp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3882:1: (lv_literal_11_0= 'current_timestamp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3883:3: lv_literal_11_0= 'current_timestamp'
                    {
                    lv_literal_11_0=(Token)match(input,93,FOLLOW_93_in_ruleLiteralValue8357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_literal_11_0, grammarAccess.getLiteralValueAccess().getLiteralCurrent_timestampKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLiteralValueRule());
                      	        }
                             		setWithLastConsumed(current, "literal", lv_literal_11_0, "current_timestamp");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleDDLStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3904:1: entryRuleDDLStatement returns [EObject current=null] : iv_ruleDDLStatement= ruleDDLStatement EOF ;
    public final EObject entryRuleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3905:2: (iv_ruleDDLStatement= ruleDDLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3906:2: iv_ruleDDLStatement= ruleDDLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement8407);
            iv_ruleDDLStatement=ruleDDLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDDLStatement8417); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDDLStatement"


    // $ANTLR start "ruleDDLStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3913:1: ruleDDLStatement returns [EObject current=null] : (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) ;
    public final EObject ruleDDLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CreateTableStatement_0 = null;

        EObject this_CreateViewStatement_1 = null;

        EObject this_CreateTriggerStatement_2 = null;

        EObject this_CreateIndexStatement_3 = null;

        EObject this_AlterTableRenameStatement_4 = null;

        EObject this_AlterTableAddColumnStatement_5 = null;

        EObject this_DropTableStatement_6 = null;

        EObject this_DropTriggerStatement_7 = null;

        EObject this_DropViewStatement_8 = null;

        EObject this_DropIndexStatement_9 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3916:28: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3917:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3917:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )
            int alt71=10;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3918:5: this_CreateTableStatement_0= ruleCreateTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTableStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement8464);
                    this_CreateTableStatement_0=ruleCreateTableStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateTableStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3928:5: this_CreateViewStatement_1= ruleCreateViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateViewStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8491);
                    this_CreateViewStatement_1=ruleCreateViewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateViewStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3938:5: this_CreateTriggerStatement_2= ruleCreateTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateTriggerStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8518);
                    this_CreateTriggerStatement_2=ruleCreateTriggerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateTriggerStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3948:5: this_CreateIndexStatement_3= ruleCreateIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getCreateIndexStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8545);
                    this_CreateIndexStatement_3=ruleCreateIndexStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateIndexStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3958:5: this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableRenameStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8572);
                    this_AlterTableRenameStatement_4=ruleAlterTableRenameStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlterTableRenameStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3968:5: this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getAlterTableAddColumnStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8599);
                    this_AlterTableAddColumnStatement_5=ruleAlterTableAddColumnStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AlterTableAddColumnStatement_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3978:5: this_DropTableStatement_6= ruleDropTableStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTableStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8626);
                    this_DropTableStatement_6=ruleDropTableStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropTableStatement_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3988:5: this_DropTriggerStatement_7= ruleDropTriggerStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropTriggerStatementParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8653);
                    this_DropTriggerStatement_7=ruleDropTriggerStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropTriggerStatement_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:3998:5: this_DropViewStatement_8= ruleDropViewStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropViewStatementParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8680);
                    this_DropViewStatement_8=ruleDropViewStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropViewStatement_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4008:5: this_DropIndexStatement_9= ruleDropIndexStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDDLStatementAccess().getDropIndexStatementParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8707);
                    this_DropIndexStatement_9=ruleDropIndexStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DropIndexStatement_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDDLStatement"


    // $ANTLR start "entryRuleCreateTableStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4024:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4025:2: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4026:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8742);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTableStatement8752); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4033:1: ruleCreateTableStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_temporary_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_columnDefs_6_0 = null;

        EObject lv_columnDefs_8_0 = null;

        EObject lv_constraints_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4036:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4037:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4037:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4037:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'table' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_columnDefs_6_0= ruleColumnDef ) ) (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )* (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )* otherlv_11= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4037:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4038:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateTableStatementAccess().getCreateTableStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleCreateTableStatement8798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4047:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==95) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4048:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4048:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4049:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateTableStatement8816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_2_0, grammarAccess.getCreateTableStatementAccess().getTemporaryTempKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTableStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,96,FOLLOW_96_in_ruleCreateTableStatement8842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4066:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4067:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4067:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4068:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTableStatement8859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getCreateTableStatementAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTableStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleCreateTableStatement8876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4088:1: ( (lv_columnDefs_6_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4089:1: (lv_columnDefs_6_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4089:1: (lv_columnDefs_6_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4090:3: lv_columnDefs_6_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8897);
            lv_columnDefs_6_0=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
              	        }
                     		add(
                     			current, 
                     			"columnDefs",
                      		lv_columnDefs_6_0, 
                      		"ColumnDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4106:2: (otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==16) ) {
                    int LA73_1 = input.LA(2);

                    if ( (LA73_1==RULE_ID) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4106:4: otherlv_7= ',' ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleCreateTableStatement8910); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_7_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4110:1: ( (lv_columnDefs_8_0= ruleColumnDef ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4111:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4111:1: (lv_columnDefs_8_0= ruleColumnDef )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4112:3: lv_columnDefs_8_0= ruleColumnDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnDefsColumnDefParserRuleCall_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8931);
            	    lv_columnDefs_8_0=ruleColumnDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columnDefs",
            	              		lv_columnDefs_8_0, 
            	              		"ColumnDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4128:4: (otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==16) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4128:6: otherlv_9= ',' ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleCreateTableStatement8946); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getCreateTableStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4132:1: ( (lv_constraints_10_0= ruleTableConstraint ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4133:1: (lv_constraints_10_0= ruleTableConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4133:1: (lv_constraints_10_0= ruleTableConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4134:3: lv_constraints_10_0= ruleTableConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateTableStatementAccess().getConstraintsTableConstraintParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8967);
            	    lv_constraints_10_0=ruleTableConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_10_0, 
            	              		"TableConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleCreateTableStatement8981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCreateTableStatementAccess().getRightParenthesisKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleCreateViewStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4162:1: entryRuleCreateViewStatement returns [EObject current=null] : iv_ruleCreateViewStatement= ruleCreateViewStatement EOF ;
    public final EObject entryRuleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4163:2: (iv_ruleCreateViewStatement= ruleCreateViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4164:2: iv_ruleCreateViewStatement= ruleCreateViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement9017);
            iv_ruleCreateViewStatement=ruleCreateViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateViewStatement9027); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreateViewStatement"


    // $ANTLR start "ruleCreateViewStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4171:1: ruleCreateViewStatement returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) ;
    public final EObject ruleCreateViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_temporary_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_selectStatement_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4174:28: ( ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4175:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4175:1: ( () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4175:2: () otherlv_1= 'create' ( (lv_temporary_2_0= 'temp' ) )? otherlv_3= 'view' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'as' ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4175:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4176:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCreateViewStatementAccess().getCreateViewStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleCreateViewStatement9073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCreateViewStatementAccess().getCreateKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4185:1: ( (lv_temporary_2_0= 'temp' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==95) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4186:1: (lv_temporary_2_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4186:1: (lv_temporary_2_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4187:3: lv_temporary_2_0= 'temp'
                    {
                    lv_temporary_2_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateViewStatement9091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_2_0, grammarAccess.getCreateViewStatementAccess().getTemporaryTempKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateViewStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,97,FOLLOW_97_in_ruleCreateViewStatement9117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCreateViewStatementAccess().getViewKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4204:1: ( (lv_name_4_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4205:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4205:1: (lv_name_4_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4206:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateViewStatement9134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getCreateViewStatementAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleCreateViewStatement9151); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewStatementAccess().getAsKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4226:1: ( (lv_selectStatement_6_0= ruleSelectStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4227:1: (lv_selectStatement_6_0= ruleSelectStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4227:1: (lv_selectStatement_6_0= ruleSelectStatement )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4228:3: lv_selectStatement_6_0= ruleSelectStatement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewStatementAccess().getSelectStatementSelectStatementParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement9172);
            lv_selectStatement_6_0=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateViewStatementRule());
              	        }
                     		set(
                     			current, 
                     			"selectStatement",
                      		lv_selectStatement_6_0, 
                      		"SelectStatement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCreateViewStatement"


    // $ANTLR start "entryRuleCreateTriggerStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4252:1: entryRuleCreateTriggerStatement returns [EObject current=null] : iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF ;
    public final EObject entryRuleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4253:2: (iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4254:2: iv_ruleCreateTriggerStatement= ruleCreateTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement9208);
            iv_ruleCreateTriggerStatement=ruleCreateTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateTriggerStatement9218); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreateTriggerStatement"


    // $ANTLR start "ruleCreateTriggerStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4261:1: ruleCreateTriggerStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) ;
    public final EObject ruleCreateTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_temporary_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_when_4_1=null;
        Token lv_when_4_2=null;
        Token lv_when_4_3=null;
        Token lv_eventType_5_0=null;
        Token lv_eventType_6_0=null;
        Token lv_eventType_7_0=null;
        Token otherlv_8=null;
        Token lv_updateColumnNames_9_0=null;
        Token otherlv_10=null;
        Token lv_updateColumnNames_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_forEachRow_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_whenExpression_16_0 = null;

        EObject lv_statements_18_0 = null;

        EObject lv_statements_20_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4264:28: ( (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4265:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4265:1: (otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4265:3: otherlv_0= 'create' ( (lv_temporary_1_0= 'temp' ) )? otherlv_2= 'trigger' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )? ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) ) otherlv_12= 'on' ( (otherlv_13= RULE_ID ) ) ( (lv_forEachRow_14_0= 'for each row' ) )? (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )? otherlv_17= 'begin' ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )? otherlv_22= 'end'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateTriggerStatement9255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateTriggerStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4269:1: ( (lv_temporary_1_0= 'temp' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==95) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4270:1: (lv_temporary_1_0= 'temp' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4270:1: (lv_temporary_1_0= 'temp' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4271:3: lv_temporary_1_0= 'temp'
                    {
                    lv_temporary_1_0=(Token)match(input,95,FOLLOW_95_in_ruleCreateTriggerStatement9273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_temporary_1_0, grammarAccess.getCreateTriggerStatementAccess().getTemporaryTempKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "temporary", true, "temp");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,98,FOLLOW_98_in_ruleCreateTriggerStatement9299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateTriggerStatementAccess().getTriggerKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4288:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4289:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4289:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4290:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateTriggerStatementAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4306:2: ( ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=99 && LA78_0<=101)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4307:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4307:1: ( (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4308:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4308:1: (lv_when_4_1= 'before' | lv_when_4_2= 'after' | lv_when_4_3= 'instead of' )
                    int alt77=3;
                    switch ( input.LA(1) ) {
                    case 99:
                        {
                        alt77=1;
                        }
                        break;
                    case 100:
                        {
                        alt77=2;
                        }
                        break;
                    case 101:
                        {
                        alt77=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }

                    switch (alt77) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4309:3: lv_when_4_1= 'before'
                            {
                            lv_when_4_1=(Token)match(input,99,FOLLOW_99_in_ruleCreateTriggerStatement9341); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_1, grammarAccess.getCreateTriggerStatementAccess().getWhenBeforeKeyword_4_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4321:8: lv_when_4_2= 'after'
                            {
                            lv_when_4_2=(Token)match(input,100,FOLLOW_100_in_ruleCreateTriggerStatement9370); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_2, grammarAccess.getCreateTriggerStatementAccess().getWhenAfterKeyword_4_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4333:8: lv_when_4_3= 'instead of'
                            {
                            lv_when_4_3=(Token)match(input,101,FOLLOW_101_in_ruleCreateTriggerStatement9399); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_when_4_3, grammarAccess.getCreateTriggerStatementAccess().getWhenInsteadOfKeyword_4_0_2());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		setWithLastConsumed(current, "when", lv_when_4_3, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4348:3: ( ( (lv_eventType_5_0= 'delete' ) ) | ( (lv_eventType_6_0= 'insert' ) ) | ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? ) )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt81=1;
                }
                break;
            case 103:
                {
                alt81=2;
                }
                break;
            case 104:
                {
                alt81=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4348:4: ( (lv_eventType_5_0= 'delete' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4348:4: ( (lv_eventType_5_0= 'delete' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4349:1: (lv_eventType_5_0= 'delete' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4349:1: (lv_eventType_5_0= 'delete' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4350:3: lv_eventType_5_0= 'delete'
                    {
                    lv_eventType_5_0=(Token)match(input,102,FOLLOW_102_in_ruleCreateTriggerStatement9435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_5_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeDeleteKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_5_0, "delete");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4364:6: ( (lv_eventType_6_0= 'insert' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4364:6: ( (lv_eventType_6_0= 'insert' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4365:1: (lv_eventType_6_0= 'insert' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4365:1: (lv_eventType_6_0= 'insert' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4366:3: lv_eventType_6_0= 'insert'
                    {
                    lv_eventType_6_0=(Token)match(input,103,FOLLOW_103_in_ruleCreateTriggerStatement9472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_6_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeInsertKeyword_5_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_6_0, "insert");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4380:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4380:6: ( ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4380:7: ( (lv_eventType_7_0= 'update' ) ) (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4380:7: ( (lv_eventType_7_0= 'update' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4381:1: (lv_eventType_7_0= 'update' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4381:1: (lv_eventType_7_0= 'update' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4382:3: lv_eventType_7_0= 'update'
                    {
                    lv_eventType_7_0=(Token)match(input,104,FOLLOW_104_in_ruleCreateTriggerStatement9510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_eventType_7_0, grammarAccess.getCreateTriggerStatementAccess().getEventTypeUpdateKeyword_5_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "eventType", lv_eventType_7_0, "update");
                      	    
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4395:2: (otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==105) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4395:4: otherlv_8= 'of' ( (lv_updateColumnNames_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            {
                            otherlv_8=(Token)match(input,105,FOLLOW_105_in_ruleCreateTriggerStatement9536); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getCreateTriggerStatementAccess().getOfKeyword_5_2_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4399:1: ( (lv_updateColumnNames_9_0= RULE_ID ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4400:1: (lv_updateColumnNames_9_0= RULE_ID )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4400:1: (lv_updateColumnNames_9_0= RULE_ID )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4401:3: lv_updateColumnNames_9_0= RULE_ID
                            {
                            lv_updateColumnNames_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9553); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_updateColumnNames_9_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_5_2_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                              	        }
                                     		addWithLastConsumed(
                                     			current, 
                                     			"updateColumnNames",
                                      		lv_updateColumnNames_9_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4417:2: (otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==16) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4417:4: otherlv_10= ',' ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleCreateTriggerStatement9571); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_10, grammarAccess.getCreateTriggerStatementAccess().getCommaKeyword_5_2_1_2_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4421:1: ( (lv_updateColumnNames_11_0= RULE_ID ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4422:1: (lv_updateColumnNames_11_0= RULE_ID )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4423:3: lv_updateColumnNames_11_0= RULE_ID
                            	    {
                            	    lv_updateColumnNames_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9588); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      			newLeafNode(lv_updateColumnNames_11_0, grammarAccess.getCreateTriggerStatementAccess().getUpdateColumnNamesIDTerminalRuleCall_5_2_1_2_1_0()); 
                            	      		
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                            	      	        }
                            	             		addWithLastConsumed(
                            	             			current, 
                            	             			"updateColumnNames",
                            	              		lv_updateColumnNames_11_0, 
                            	              		"ID");
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop79;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleCreateTriggerStatement9611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCreateTriggerStatementAccess().getOnKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4443:1: ( (otherlv_13= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4444:1: (otherlv_13= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4444:1: (otherlv_13= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4445:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getCreateTriggerStatementAccess().getTableTableDefinitionCrossReference_7_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4456:2: ( (lv_forEachRow_14_0= 'for each row' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==106) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4457:1: (lv_forEachRow_14_0= 'for each row' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4457:1: (lv_forEachRow_14_0= 'for each row' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4458:3: lv_forEachRow_14_0= 'for each row'
                    {
                    lv_forEachRow_14_0=(Token)match(input,106,FOLLOW_106_in_ruleCreateTriggerStatement9649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_forEachRow_14_0, grammarAccess.getCreateTriggerStatementAccess().getForEachRowForEachRowKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "forEachRow", lv_forEachRow_14_0, "for each row");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4471:3: (otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==71) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4471:5: otherlv_15= 'when' ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    {
                    otherlv_15=(Token)match(input,71,FOLLOW_71_in_ruleCreateTriggerStatement9676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCreateTriggerStatementAccess().getWhenKeyword_9_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4475:1: ( (lv_whenExpression_16_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4476:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4476:1: (lv_whenExpression_16_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4477:3: lv_whenExpression_16_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getWhenExpressionSqlExpressionParserRuleCall_9_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9697);
                    lv_whenExpression_16_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whenExpression",
                              		lv_whenExpression_16_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,107,FOLLOW_107_in_ruleCreateTriggerStatement9711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getCreateTriggerStatementAccess().getBeginKeyword_10());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4497:1: ( ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==76||(LA85_0>=102 && LA85_0<=104)||LA85_0==121) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4497:2: ( (lv_statements_18_0= ruleDMLStatement ) ) otherlv_19= ';' ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4497:2: ( (lv_statements_18_0= ruleDMLStatement ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4498:1: (lv_statements_18_0= ruleDMLStatement )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4498:1: (lv_statements_18_0= ruleDMLStatement )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4499:3: lv_statements_18_0= ruleDMLStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9733);
                    lv_statements_18_0=ruleDMLStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_18_0, 
                              		"DMLStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleCreateTriggerStatement9745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4519:1: ( ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';' )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==76||(LA84_0>=102 && LA84_0<=104)||LA84_0==121) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4519:2: ( (lv_statements_20_0= ruleDMLStatement ) ) otherlv_21= ';'
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4519:2: ( (lv_statements_20_0= ruleDMLStatement ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4520:1: (lv_statements_20_0= ruleDMLStatement )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4520:1: (lv_statements_20_0= ruleDMLStatement )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4521:3: lv_statements_20_0= ruleDMLStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateTriggerStatementAccess().getStatementsDMLStatementParserRuleCall_11_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9767);
                    	    lv_statements_20_0=ruleDMLStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCreateTriggerStatementRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_20_0, 
                    	              		"DMLStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_21=(Token)match(input,20,FOLLOW_20_in_ruleCreateTriggerStatement9779); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_21, grammarAccess.getCreateTriggerStatementAccess().getSemicolonKeyword_11_2_1());
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,67,FOLLOW_67_in_ruleCreateTriggerStatement9795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getCreateTriggerStatementAccess().getEndKeyword_12());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCreateTriggerStatement"


    // $ANTLR start "entryRuleAlterTableRenameStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4553:1: entryRuleAlterTableRenameStatement returns [EObject current=null] : iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF ;
    public final EObject entryRuleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableRenameStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4554:2: (iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4555:2: iv_ruleAlterTableRenameStatement= ruleAlterTableRenameStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableRenameStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9831);
            iv_ruleAlterTableRenameStatement=ruleAlterTableRenameStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableRenameStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9841); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlterTableRenameStatement"


    // $ANTLR start "ruleAlterTableRenameStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4562:1: ruleAlterTableRenameStatement returns [EObject current=null] : ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleAlterTableRenameStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4565:28: ( ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4566:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4566:1: ( () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4566:2: () otherlv_1= 'alter' otherlv_2= 'table' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'rename to' ( (lv_name_5_0= RULE_ID ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4566:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4567:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAlterTableRenameStatementAccess().getAlterTableRenameStatementAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,108,FOLLOW_108_in_ruleAlterTableRenameStatement9887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableRenameStatementAccess().getAlterKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,96,FOLLOW_96_in_ruleAlterTableRenameStatement9899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAlterTableRenameStatementAccess().getTableKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4580:1: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4581:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4581:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4582:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getAlterTableRenameStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,109,FOLLOW_109_in_ruleAlterTableRenameStatement9931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAlterTableRenameStatementAccess().getRenameToKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4597:1: ( (lv_name_5_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4598:1: (lv_name_5_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4598:1: (lv_name_5_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4599:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getAlterTableRenameStatementAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableRenameStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAlterTableRenameStatement"


    // $ANTLR start "entryRuleAlterTableAddColumnStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4623:1: entryRuleAlterTableAddColumnStatement returns [EObject current=null] : iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF ;
    public final EObject entryRuleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterTableAddColumnStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4624:2: (iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4625:2: iv_ruleAlterTableAddColumnStatement= ruleAlterTableAddColumnStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlterTableAddColumnStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9989);
            iv_ruleAlterTableAddColumnStatement=ruleAlterTableAddColumnStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlterTableAddColumnStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9999); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlterTableAddColumnStatement"


    // $ANTLR start "ruleAlterTableAddColumnStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4632:1: ruleAlterTableAddColumnStatement returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) ;
    public final EObject ruleAlterTableAddColumnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_columnDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4635:28: ( (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4636:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4636:1: (otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4636:3: otherlv_0= 'alter' otherlv_1= 'table' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'add column' ( (lv_columnDef_4_0= ruleColumnDef ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleAlterTableAddColumnStatement10036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlterTableAddColumnStatementAccess().getAlterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleAlterTableAddColumnStatement10048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlterTableAddColumnStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4644:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4645:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4645:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4646:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement10068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getAlterTableAddColumnStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,110,FOLLOW_110_in_ruleAlterTableAddColumnStatement10080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlterTableAddColumnStatementAccess().getAddColumnKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4661:1: ( (lv_columnDef_4_0= ruleColumnDef ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4662:1: (lv_columnDef_4_0= ruleColumnDef )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4662:1: (lv_columnDef_4_0= ruleColumnDef )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4663:3: lv_columnDef_4_0= ruleColumnDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlterTableAddColumnStatementAccess().getColumnDefColumnDefParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement10101);
            lv_columnDef_4_0=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlterTableAddColumnStatementRule());
              	        }
                     		set(
                     			current, 
                     			"columnDef",
                      		lv_columnDef_4_0, 
                      		"ColumnDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAlterTableAddColumnStatement"


    // $ANTLR start "entryRuleDropTableStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4687:1: entryRuleDropTableStatement returns [EObject current=null] : iv_ruleDropTableStatement= ruleDropTableStatement EOF ;
    public final EObject entryRuleDropTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTableStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4688:2: (iv_ruleDropTableStatement= ruleDropTableStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4689:2: iv_ruleDropTableStatement= ruleDropTableStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTableStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement10137);
            iv_ruleDropTableStatement=ruleDropTableStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTableStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTableStatement10147); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDropTableStatement"


    // $ANTLR start "ruleDropTableStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4696:1: ruleDropTableStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4699:28: ( (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4700:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4700:1: (otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4700:3: otherlv_0= 'drop' otherlv_1= 'table' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropTableStatement10184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTableStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleDropTableStatement10196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTableStatementAccess().getTableKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4708:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==112) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4709:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4709:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4710:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropTableStatement10214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropTableStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropTableStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4723:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4724:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4724:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4725:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTableStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTableStatement10248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropTableStatementAccess().getTableTableDefinitionCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDropTableStatement"


    // $ANTLR start "entryRuleDropTriggerStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4744:1: entryRuleDropTriggerStatement returns [EObject current=null] : iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF ;
    public final EObject entryRuleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropTriggerStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4745:2: (iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4746:2: iv_ruleDropTriggerStatement= ruleDropTriggerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropTriggerStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement10284);
            iv_ruleDropTriggerStatement=ruleDropTriggerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropTriggerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropTriggerStatement10294); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDropTriggerStatement"


    // $ANTLR start "ruleDropTriggerStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4753:1: ruleDropTriggerStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropTriggerStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4756:28: ( (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4757:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4757:1: (otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4757:3: otherlv_0= 'drop' otherlv_1= 'trigger' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropTriggerStatement10331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropTriggerStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,98,FOLLOW_98_in_ruleDropTriggerStatement10343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropTriggerStatementAccess().getTriggerKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4765:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==112) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4766:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4766:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4767:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropTriggerStatement10361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropTriggerStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4780:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4781:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4781:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4782:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropTriggerStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropTriggerStatement10395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropTriggerStatementAccess().getTriggerCreateTriggerStatementCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDropTriggerStatement"


    // $ANTLR start "entryRuleDropViewStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4801:1: entryRuleDropViewStatement returns [EObject current=null] : iv_ruleDropViewStatement= ruleDropViewStatement EOF ;
    public final EObject entryRuleDropViewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropViewStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4802:2: (iv_ruleDropViewStatement= ruleDropViewStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4803:2: iv_ruleDropViewStatement= ruleDropViewStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropViewStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement10431);
            iv_ruleDropViewStatement=ruleDropViewStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropViewStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropViewStatement10441); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDropViewStatement"


    // $ANTLR start "ruleDropViewStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4810:1: ruleDropViewStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropViewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4813:28: ( (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4814:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4814:1: (otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4814:3: otherlv_0= 'drop' otherlv_1= 'view' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropViewStatement10478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropViewStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleDropViewStatement10490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropViewStatementAccess().getViewKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4822:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==112) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4823:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4823:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4824:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropViewStatement10508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropViewStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropViewStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4837:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4838:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4838:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4839:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropViewStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropViewStatement10542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropViewStatementAccess().getViewCreateViewStatementCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDropViewStatement"


    // $ANTLR start "entryRuleCreateIndexStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4858:1: entryRuleCreateIndexStatement returns [EObject current=null] : iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF ;
    public final EObject entryRuleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4859:2: (iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4860:2: iv_ruleCreateIndexStatement= ruleCreateIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10578);
            iv_ruleCreateIndexStatement=ruleCreateIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreateIndexStatement10588); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCreateIndexStatement"


    // $ANTLR start "ruleCreateIndexStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4867:1: ruleCreateIndexStatement returns [EObject current=null] : (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) ;
    public final EObject ruleCreateIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_unique_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_columns_7_0 = null;

        EObject lv_columns_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4870:28: ( (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4871:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4871:1: (otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4871:3: otherlv_0= 'create' ( (lv_unique_1_0= 'unique' ) )? otherlv_2= 'index' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( (lv_columns_7_0= ruleIndexedColumn ) ) (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )* otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_ruleCreateIndexStatement10625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCreateIndexStatementAccess().getCreateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4875:1: ( (lv_unique_1_0= 'unique' ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==24) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4876:1: (lv_unique_1_0= 'unique' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4876:1: (lv_unique_1_0= 'unique' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4877:3: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,24,FOLLOW_24_in_ruleCreateIndexStatement10643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_unique_1_0, grammarAccess.getCreateIndexStatementAccess().getUniqueUniqueKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
                      	        }
                             		setWithLastConsumed(current, "unique", true, "unique");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,113,FOLLOW_113_in_ruleCreateIndexStatement10669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateIndexStatementAccess().getIndexKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4894:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4895:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4895:1: (lv_name_3_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4896:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getCreateIndexStatementAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleCreateIndexStatement10703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCreateIndexStatementAccess().getOnKeyword_4());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4916:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4917:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4917:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4918:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateIndexStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreateIndexStatement10723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getCreateIndexStatementAccess().getTableTableDefinitionCrossReference_5_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleCreateIndexStatement10735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCreateIndexStatementAccess().getLeftParenthesisKeyword_6());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4933:1: ( (lv_columns_7_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4934:1: (lv_columns_7_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4934:1: (lv_columns_7_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4935:3: lv_columns_7_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10756);
            lv_columns_7_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateIndexStatementRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_7_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4951:2: (otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==16) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4951:4: otherlv_8= ',' ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleCreateIndexStatement10769); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getCreateIndexStatementAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4955:1: ( (lv_columns_9_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4956:1: (lv_columns_9_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4956:1: (lv_columns_9_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4957:3: lv_columns_9_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCreateIndexStatementAccess().getColumnsIndexedColumnParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10790);
            	    lv_columns_9_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCreateIndexStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_9_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleCreateIndexStatement10804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getCreateIndexStatementAccess().getRightParenthesisKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCreateIndexStatement"


    // $ANTLR start "entryRuleDropIndexStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4985:1: entryRuleDropIndexStatement returns [EObject current=null] : iv_ruleDropIndexStatement= ruleDropIndexStatement EOF ;
    public final EObject entryRuleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropIndexStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4986:2: (iv_ruleDropIndexStatement= ruleDropIndexStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4987:2: iv_ruleDropIndexStatement= ruleDropIndexStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDropIndexStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10840);
            iv_ruleDropIndexStatement=ruleDropIndexStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDropIndexStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDropIndexStatement10850); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDropIndexStatement"


    // $ANTLR start "ruleDropIndexStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4994:1: ruleDropIndexStatement returns [EObject current=null] : (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDropIndexStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ifExists_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4997:28: ( (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4998:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4998:1: (otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:4998:3: otherlv_0= 'drop' otherlv_1= 'index' ( (lv_ifExists_2_0= 'if exists' ) )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleDropIndexStatement10887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDropIndexStatementAccess().getDropKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,113,FOLLOW_113_in_ruleDropIndexStatement10899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDropIndexStatementAccess().getIndexKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5006:1: ( (lv_ifExists_2_0= 'if exists' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==112) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5007:1: (lv_ifExists_2_0= 'if exists' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5007:1: (lv_ifExists_2_0= 'if exists' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5008:3: lv_ifExists_2_0= 'if exists'
                    {
                    lv_ifExists_2_0=(Token)match(input,112,FOLLOW_112_in_ruleDropIndexStatement10917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_ifExists_2_0, grammarAccess.getDropIndexStatementAccess().getIfExistsIfExistsKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
                      	        }
                             		setWithLastConsumed(current, "ifExists", true, "if exists");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5021:3: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5022:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5022:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5023:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDropIndexStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDropIndexStatement10951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getDropIndexStatementAccess().getIndexCreateIndexStatementCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDropIndexStatement"


    // $ANTLR start "entryRuleColumnDef"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5042:1: entryRuleColumnDef returns [EObject current=null] : iv_ruleColumnDef= ruleColumnDef EOF ;
    public final EObject entryRuleColumnDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDef = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5043:2: (iv_ruleColumnDef= ruleColumnDef EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5044:2: iv_ruleColumnDef= ruleColumnDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnDefRule()); 
            }
            pushFollow(FOLLOW_ruleColumnDef_in_entryRuleColumnDef10987);
            iv_ruleColumnDef=ruleColumnDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDef10997); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColumnDef"


    // $ANTLR start "ruleColumnDef"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5051:1: ruleColumnDef returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) ;
    public final EObject ruleColumnDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5054:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5055:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5055:1: ( () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5055:2: () ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleColumnType ) ) ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5055:2: ()
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5056:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getColumnDefAccess().getColumnDefAction_0(),
                          current);
                  
            }

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5061:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5062:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5062:1: (lv_name_1_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5063:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnDef11048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getColumnDefAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5079:2: ( (lv_type_2_0= ruleColumnType ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5080:1: (lv_type_2_0= ruleColumnType )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5080:1: (lv_type_2_0= ruleColumnType )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5081:3: lv_type_2_0= ruleColumnType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnDefAccess().getTypeColumnTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleColumnType_in_ruleColumnDef11074);
            lv_type_2_0=ruleColumnType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getColumnDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"ColumnType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5097:2: ( (lv_constraints_3_0= ruleColumnConstraint ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==24||LA92_0==58||LA92_0==114||(LA92_0>=116 && LA92_0<=117)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5098:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5098:1: (lv_constraints_3_0= ruleColumnConstraint )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5099:3: lv_constraints_3_0= ruleColumnConstraint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getColumnDefAccess().getConstraintsColumnConstraintParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleColumnConstraint_in_ruleColumnDef11095);
            	    lv_constraints_3_0=ruleColumnConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getColumnDefRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constraints",
            	              		lv_constraints_3_0, 
            	              		"ColumnConstraint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleColumnDef"


    // $ANTLR start "entryRuleColumnConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5123:1: entryRuleColumnConstraint returns [EObject current=null] : iv_ruleColumnConstraint= ruleColumnConstraint EOF ;
    public final EObject entryRuleColumnConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5124:2: (iv_ruleColumnConstraint= ruleColumnConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5125:2: iv_ruleColumnConstraint= ruleColumnConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint11132);
            iv_ruleColumnConstraint=ruleColumnConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumnConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnConstraint11142); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColumnConstraint"


    // $ANTLR start "ruleColumnConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5132:1: ruleColumnConstraint returns [EObject current=null] : ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) ;
    public final EObject ruleColumnConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_asc_2_0=null;
        Token lv_desc_3_0=null;
        Token lv_autoincrement_4_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_conflictClause_7_0 = null;

        EObject lv_conflictClause_10_0 = null;

        EObject lv_defaultValue_13_0 = null;

        EObject lv_expression_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5135:28: ( ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5136:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5136:1: ( ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? ) | ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? ) | ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? ) | ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) ) | ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' ) )
            int alt97=5;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt97=1;
                }
                break;
            case 58:
                {
                alt97=2;
                }
                break;
            case 24:
                {
                alt97=3;
                }
                break;
            case 116:
                {
                alt97=4;
                }
                break;
            case 117:
                {
                alt97=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5136:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5136:2: ( () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5136:3: () otherlv_1= 'primary key' ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )? ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5136:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5137:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getPrimaryKeyColumnConstraintAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,114,FOLLOW_114_in_ruleColumnConstraint11189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getColumnConstraintAccess().getPrimaryKeyKeyword_0_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5146:1: ( ( (lv_asc_2_0= 'asc' ) ) | ( (lv_desc_3_0= 'desc' ) ) )?
                    int alt93=3;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==82) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==83) ) {
                        alt93=2;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5146:2: ( (lv_asc_2_0= 'asc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5146:2: ( (lv_asc_2_0= 'asc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5147:1: (lv_asc_2_0= 'asc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5147:1: (lv_asc_2_0= 'asc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5148:3: lv_asc_2_0= 'asc'
                            {
                            lv_asc_2_0=(Token)match(input,82,FOLLOW_82_in_ruleColumnConstraint11208); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_asc_2_0, grammarAccess.getColumnConstraintAccess().getAscAscKeyword_0_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "asc", true, "asc");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5162:6: ( (lv_desc_3_0= 'desc' ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5162:6: ( (lv_desc_3_0= 'desc' ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5163:1: (lv_desc_3_0= 'desc' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5163:1: (lv_desc_3_0= 'desc' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5164:3: lv_desc_3_0= 'desc'
                            {
                            lv_desc_3_0=(Token)match(input,83,FOLLOW_83_in_ruleColumnConstraint11245); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_desc_3_0, grammarAccess.getColumnConstraintAccess().getDescDescKeyword_0_2_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "desc", true, "desc");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5177:4: ( (lv_autoincrement_4_0= 'autoincrement' ) )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==115) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5178:1: (lv_autoincrement_4_0= 'autoincrement' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5178:1: (lv_autoincrement_4_0= 'autoincrement' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5179:3: lv_autoincrement_4_0= 'autoincrement'
                            {
                            lv_autoincrement_4_0=(Token)match(input,115,FOLLOW_115_in_ruleColumnConstraint11278); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_autoincrement_4_0, grammarAccess.getColumnConstraintAccess().getAutoincrementAutoincrementKeyword_0_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		setWithLastConsumed(current, "autoincrement", true, "autoincrement");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5193:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5193:6: ( () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5193:7: () otherlv_6= 'not null' ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5193:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5194:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getNotNullConstraintAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,58,FOLLOW_58_in_ruleColumnConstraint11321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getColumnConstraintAccess().getNotNullKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5203:1: ( (lv_conflictClause_7_0= ruleConflictClause ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==23) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5204:1: (lv_conflictClause_7_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5204:1: (lv_conflictClause_7_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5205:3: lv_conflictClause_7_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint11342);
                            lv_conflictClause_7_0=ruleConflictClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictClause",
                                      		lv_conflictClause_7_0, 
                                      		"ConflictClause");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5222:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5222:6: ( () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5222:7: () otherlv_9= 'unique' ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5222:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5223:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getUniqueConstraintAction_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleColumnConstraint11372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getColumnConstraintAccess().getUniqueKeyword_2_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5232:1: ( (lv_conflictClause_10_0= ruleConflictClause ) )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==23) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5233:1: (lv_conflictClause_10_0= ruleConflictClause )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5233:1: (lv_conflictClause_10_0= ruleConflictClause )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5234:3: lv_conflictClause_10_0= ruleConflictClause
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getConflictClauseConflictClauseParserRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictClause_in_ruleColumnConstraint11393);
                            lv_conflictClause_10_0=ruleConflictClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictClause",
                                      		lv_conflictClause_10_0, 
                                      		"ConflictClause");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5251:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5251:6: ( () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5251:7: () otherlv_12= 'default' ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5251:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5252:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getDefaultConstraintAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,116,FOLLOW_116_in_ruleColumnConstraint11423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getColumnConstraintAccess().getDefaultKeyword_3_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5261:1: ( (lv_defaultValue_13_0= ruleDefaultValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5262:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5262:1: (lv_defaultValue_13_0= ruleDefaultValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5263:3: lv_defaultValue_13_0= ruleDefaultValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getDefaultValueDefaultValueParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultValue_in_ruleColumnConstraint11444);
                    lv_defaultValue_13_0=ruleDefaultValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_13_0, 
                              		"DefaultValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5280:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5280:6: ( () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5280:7: () otherlv_15= 'check' otherlv_16= '(' ( (lv_expression_17_0= ruleSqlExpression ) ) otherlv_18= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5280:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5281:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getColumnConstraintAccess().getCheckConstraintAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,117,FOLLOW_117_in_ruleColumnConstraint11473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getColumnConstraintAccess().getCheckKeyword_4_1());
                          
                    }
                    otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleColumnConstraint11485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getColumnConstraintAccess().getLeftParenthesisKeyword_4_2());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5294:1: ( (lv_expression_17_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5295:1: (lv_expression_17_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5295:1: (lv_expression_17_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5296:3: lv_expression_17_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnConstraintAccess().getExpressionSqlExpressionParserRuleCall_4_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleColumnConstraint11506);
                    lv_expression_17_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getColumnConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_17_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleColumnConstraint11518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getColumnConstraintAccess().getRightParenthesisKeyword_4_4());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleColumnConstraint"


    // $ANTLR start "entryRuleTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5324:1: entryRuleTableConstraint returns [EObject current=null] : iv_ruleTableConstraint= ruleTableConstraint EOF ;
    public final EObject entryRuleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5325:2: (iv_ruleTableConstraint= ruleTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5326:2: iv_ruleTableConstraint= ruleTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11555);
            iv_ruleTableConstraint=ruleTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableConstraint11565); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTableConstraint"


    // $ANTLR start "ruleTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5333:1: ruleTableConstraint returns [EObject current=null] : (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) ;
    public final EObject ruleTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_UniqueTableConstraint_0 = null;

        EObject this_PrimaryConstraint_1 = null;

        EObject this_CheckTableConstraint_2 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5336:28: ( (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5337:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5337:1: (this_UniqueTableConstraint_0= ruleUniqueTableConstraint | this_PrimaryConstraint_1= rulePrimaryConstraint | this_CheckTableConstraint_2= ruleCheckTableConstraint )
            int alt98=3;
            switch ( input.LA(1) ) {
            case 118:
                {
                int LA98_1 = input.LA(2);

                if ( (LA98_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 114:
                        {
                        alt98=2;
                        }
                        break;
                    case 24:
                        {
                        alt98=1;
                        }
                        break;
                    case 117:
                        {
                        alt98=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt98=1;
                }
                break;
            case 114:
                {
                alt98=2;
                }
                break;
            case 117:
                {
                alt98=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5338:5: this_UniqueTableConstraint_0= ruleUniqueTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getUniqueTableConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11612);
                    this_UniqueTableConstraint_0=ruleUniqueTableConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UniqueTableConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5348:5: this_PrimaryConstraint_1= rulePrimaryConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getPrimaryConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11639);
                    this_PrimaryConstraint_1=rulePrimaryConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5358:5: this_CheckTableConstraint_2= ruleCheckTableConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTableConstraintAccess().getCheckTableConstraintParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11666);
                    this_CheckTableConstraint_2=ruleCheckTableConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CheckTableConstraint_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTableConstraint"


    // $ANTLR start "entryRuleUniqueTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5374:1: entryRuleUniqueTableConstraint returns [EObject current=null] : iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF ;
    public final EObject entryRuleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniqueTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5375:2: (iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5376:2: iv_ruleUniqueTableConstraint= ruleUniqueTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniqueTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11701);
            iv_ruleUniqueTableConstraint=ruleUniqueTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniqueTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniqueTableConstraint11711); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUniqueTableConstraint"


    // $ANTLR start "ruleUniqueTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5383:1: ruleUniqueTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
    public final EObject ruleUniqueTableConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_columns_4_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_conflictClause_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5386:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5387:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5387:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5387:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'unique' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5387:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==118) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5387:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,118,FOLLOW_118_in_ruleUniqueTableConstraint11749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getUniqueTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5391:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5392:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5392:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5393:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getUniqueTableConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUniqueTableConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleUniqueTableConstraint11785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUniqueTableConstraintAccess().getUniqueKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleUniqueTableConstraint11797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUniqueTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5417:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5418:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5418:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5419:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11818);
            lv_columns_4_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_4_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5435:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==16) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5435:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleUniqueTableConstraint11831); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getUniqueTableConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5439:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5440:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5440:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5441:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11852);
            	    lv_columns_6_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_6_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleUniqueTableConstraint11866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUniqueTableConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5461:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5462:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5462:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5463:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniqueTableConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11887);
            lv_conflictClause_8_0=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUniqueTableConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"conflictClause",
                      		lv_conflictClause_8_0, 
                      		"ConflictClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUniqueTableConstraint"


    // $ANTLR start "entryRulePrimaryConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5487:1: entryRulePrimaryConstraint returns [EObject current=null] : iv_rulePrimaryConstraint= rulePrimaryConstraint EOF ;
    public final EObject entryRulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5488:2: (iv_rulePrimaryConstraint= rulePrimaryConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5489:2: iv_rulePrimaryConstraint= rulePrimaryConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11923);
            iv_rulePrimaryConstraint=rulePrimaryConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryConstraint11933); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryConstraint"


    // $ANTLR start "rulePrimaryConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5496:1: rulePrimaryConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) ;
    public final EObject rulePrimaryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_columns_4_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_conflictClause_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5499:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5500:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5500:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5500:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'primary key' otherlv_3= '(' ( (lv_columns_4_0= ruleIndexedColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )* otherlv_7= ')' ( (lv_conflictClause_8_0= ruleConflictClause ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5500:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==118) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5500:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,118,FOLLOW_118_in_rulePrimaryConstraint11971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5504:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5505:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5505:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5506:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryConstraint11988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getPrimaryConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimaryConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,114,FOLLOW_114_in_rulePrimaryConstraint12007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimaryConstraintAccess().getPrimaryKeyKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePrimaryConstraint12019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPrimaryConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5530:1: ( (lv_columns_4_0= ruleIndexedColumn ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5531:1: (lv_columns_4_0= ruleIndexedColumn )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5531:1: (lv_columns_4_0= ruleIndexedColumn )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5532:3: lv_columns_4_0= ruleIndexedColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint12040);
            lv_columns_4_0=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
              	        }
                     		add(
                     			current, 
                     			"columns",
                      		lv_columns_4_0, 
                      		"IndexedColumn");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5548:2: (otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==16) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5548:4: otherlv_5= ',' ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_rulePrimaryConstraint12053); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getPrimaryConstraintAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5552:1: ( (lv_columns_6_0= ruleIndexedColumn ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5553:1: (lv_columns_6_0= ruleIndexedColumn )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5553:1: (lv_columns_6_0= ruleIndexedColumn )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5554:3: lv_columns_6_0= ruleIndexedColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getColumnsIndexedColumnParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint12074);
            	    lv_columns_6_0=ruleIndexedColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_6_0, 
            	              		"IndexedColumn");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_rulePrimaryConstraint12088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPrimaryConstraintAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5574:1: ( (lv_conflictClause_8_0= ruleConflictClause ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5575:1: (lv_conflictClause_8_0= ruleConflictClause )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5575:1: (lv_conflictClause_8_0= ruleConflictClause )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5576:3: lv_conflictClause_8_0= ruleConflictClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimaryConstraintAccess().getConflictClauseConflictClauseParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictClause_in_rulePrimaryConstraint12109);
            lv_conflictClause_8_0=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimaryConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"conflictClause",
                      		lv_conflictClause_8_0, 
                      		"ConflictClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryConstraint"


    // $ANTLR start "entryRuleCheckTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5600:1: entryRuleCheckTableConstraint returns [EObject current=null] : iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF ;
    public final EObject entryRuleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckTableConstraint = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5601:2: (iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5602:2: iv_ruleCheckTableConstraint= ruleCheckTableConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCheckTableConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint12145);
            iv_ruleCheckTableConstraint=ruleCheckTableConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCheckTableConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckTableConstraint12155); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCheckTableConstraint"


    // $ANTLR start "ruleCheckTableConstraint"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5609:1: ruleCheckTableConstraint returns [EObject current=null] : ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleCheckTableConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5612:28: ( ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5613:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5613:1: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5613:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )? otherlv_2= 'check' otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5613:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==118) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5613:4: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,118,FOLLOW_118_in_ruleCheckTableConstraint12193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCheckTableConstraintAccess().getConstraintKeyword_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5617:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5618:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5618:1: (lv_name_1_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5619:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckTableConstraint12210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getCheckTableConstraintAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCheckTableConstraintRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,117,FOLLOW_117_in_ruleCheckTableConstraint12229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCheckTableConstraintAccess().getCheckKeyword_1());
                  
            }
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCheckTableConstraint12241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCheckTableConstraintAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5643:1: ( (lv_expression_4_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5644:1: (lv_expression_4_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5644:1: (lv_expression_4_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5645:3: lv_expression_4_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCheckTableConstraintAccess().getExpressionSqlExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint12262);
            lv_expression_4_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCheckTableConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleCheckTableConstraint12274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCheckTableConstraintAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCheckTableConstraint"


    // $ANTLR start "entryRuleIndexedColumn"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5673:1: entryRuleIndexedColumn returns [EObject current=null] : iv_ruleIndexedColumn= ruleIndexedColumn EOF ;
    public final EObject entryRuleIndexedColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedColumn = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5674:2: (iv_ruleIndexedColumn= ruleIndexedColumn EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5675:2: iv_ruleIndexedColumn= ruleIndexedColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedColumnRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn12310);
            iv_ruleIndexedColumn=ruleIndexedColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedColumn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedColumn12320); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIndexedColumn"


    // $ANTLR start "ruleIndexedColumn"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5682:1: ruleIndexedColumn returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) ;
    public final EObject ruleIndexedColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_collationName_2_0=null;
        Token lv_asc_3_0=null;
        Token lv_desc_4_0=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5685:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5686:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5686:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5686:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )? ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5686:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5687:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5688:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIndexedColumnRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn12365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIndexedColumnAccess().getColumnReferenceColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5699:2: (otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==119) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5699:4: otherlv_1= 'collate' ( (lv_collationName_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,119,FOLLOW_119_in_ruleIndexedColumn12378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIndexedColumnAccess().getCollateKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5703:1: ( (lv_collationName_2_0= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5704:1: (lv_collationName_2_0= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5704:1: (lv_collationName_2_0= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5705:3: lv_collationName_2_0= RULE_ID
                    {
                    lv_collationName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndexedColumn12395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_collationName_2_0, grammarAccess.getIndexedColumnAccess().getCollationNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"collationName",
                              		lv_collationName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5721:4: ( ( (lv_asc_3_0= 'asc' ) ) | ( (lv_desc_4_0= 'desc' ) ) )?
            int alt105=3;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==82) ) {
                alt105=1;
            }
            else if ( (LA105_0==83) ) {
                alt105=2;
            }
            switch (alt105) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5721:5: ( (lv_asc_3_0= 'asc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5721:5: ( (lv_asc_3_0= 'asc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5722:1: (lv_asc_3_0= 'asc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5722:1: (lv_asc_3_0= 'asc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5723:3: lv_asc_3_0= 'asc'
                    {
                    lv_asc_3_0=(Token)match(input,82,FOLLOW_82_in_ruleIndexedColumn12421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_asc_3_0, grammarAccess.getIndexedColumnAccess().getAscAscKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(current, "asc", true, "asc");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5737:6: ( (lv_desc_4_0= 'desc' ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5737:6: ( (lv_desc_4_0= 'desc' ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5738:1: (lv_desc_4_0= 'desc' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5738:1: (lv_desc_4_0= 'desc' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5739:3: lv_desc_4_0= 'desc'
                    {
                    lv_desc_4_0=(Token)match(input,83,FOLLOW_83_in_ruleIndexedColumn12458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_desc_4_0, grammarAccess.getIndexedColumnAccess().getDescDescKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIndexedColumnRule());
                      	        }
                             		setWithLastConsumed(current, "desc", true, "desc");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIndexedColumn"


    // $ANTLR start "entryRuleDefaultValue"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5760:1: entryRuleDefaultValue returns [EObject current=null] : iv_ruleDefaultValue= ruleDefaultValue EOF ;
    public final EObject entryRuleDefaultValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultValue = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5761:2: (iv_ruleDefaultValue= ruleDefaultValue EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5762:2: iv_ruleDefaultValue= ruleDefaultValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultValueRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue12509);
            iv_ruleDefaultValue=ruleDefaultValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValue12519); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefaultValue"


    // $ANTLR start "ruleDefaultValue"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5769:1: ruleDefaultValue returns [EObject current=null] : ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDefaultValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_1_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5772:28: ( ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:1: ( ( () ( (lv_literal_1_0= ruleLiteralValue ) ) ) | ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=RULE_STRING && LA106_0<=RULE_NUMBER)||LA106_0==35||(LA106_0>=90 && LA106_0<=93)) ) {
                alt106=1;
            }
            else if ( (LA106_0==15) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:2: ( () ( (lv_literal_1_0= ruleLiteralValue ) ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:3: () ( (lv_literal_1_0= ruleLiteralValue ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5773:3: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5774:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getLiteralDefaultValueAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5779:2: ( (lv_literal_1_0= ruleLiteralValue ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5780:1: (lv_literal_1_0= ruleLiteralValue )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5780:1: (lv_literal_1_0= ruleLiteralValue )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5781:3: lv_literal_1_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getLiteralLiteralValueParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralValue_in_ruleDefaultValue12575);
                    lv_literal_1_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_1_0, 
                              		"LiteralValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5798:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5798:6: ( () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5798:7: () otherlv_3= '(' ( (lv_expression_4_0= ruleSqlExpression ) ) otherlv_5= ')'
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5798:7: ()
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5799:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getDefaultValueAccess().getExpressionDefaultValueAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDefaultValue12604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefaultValueAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5808:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5809:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5809:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5810:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefaultValueAccess().getExpressionSqlExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDefaultValue12625);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefaultValueRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleDefaultValue12637); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDefaultValueAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDefaultValue"


    // $ANTLR start "entryRuleConflictClause"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5838:1: entryRuleConflictClause returns [EObject current=null] : iv_ruleConflictClause= ruleConflictClause EOF ;
    public final EObject entryRuleConflictClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConflictClause = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5839:2: (iv_ruleConflictClause= ruleConflictClause EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5840:2: iv_ruleConflictClause= ruleConflictClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConflictClauseRule()); 
            }
            pushFollow(FOLLOW_ruleConflictClause_in_entryRuleConflictClause12674);
            iv_ruleConflictClause=ruleConflictClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConflictClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConflictClause12684); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConflictClause"


    // $ANTLR start "ruleConflictClause"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5847:1: ruleConflictClause returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) ;
    public final EObject ruleConflictClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_resolution_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5850:28: ( (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5851:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5851:1: (otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5851:3: otherlv_0= 'on' otherlv_1= 'conflict' ( (lv_resolution_2_0= ruleConflictResolution ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleConflictClause12721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConflictClauseAccess().getOnKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,120,FOLLOW_120_in_ruleConflictClause12733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConflictClauseAccess().getConflictKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5859:1: ( (lv_resolution_2_0= ruleConflictResolution ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5860:1: (lv_resolution_2_0= ruleConflictResolution )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5860:1: (lv_resolution_2_0= ruleConflictResolution )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5861:3: lv_resolution_2_0= ruleConflictResolution
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConflictClauseAccess().getResolutionConflictResolutionEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConflictResolution_in_ruleConflictClause12754);
            lv_resolution_2_0=ruleConflictResolution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConflictClauseRule());
              	        }
                     		set(
                     			current, 
                     			"resolution",
                      		lv_resolution_2_0, 
                      		"ConflictResolution");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConflictClause"


    // $ANTLR start "entryRuleDMLStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5885:1: entryRuleDMLStatement returns [EObject current=null] : iv_ruleDMLStatement= ruleDMLStatement EOF ;
    public final EObject entryRuleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMLStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5886:2: (iv_ruleDMLStatement= ruleDMLStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5887:2: iv_ruleDMLStatement= ruleDMLStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMLStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12790);
            iv_ruleDMLStatement=ruleDMLStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMLStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDMLStatement12800); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDMLStatement"


    // $ANTLR start "ruleDMLStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5894:1: ruleDMLStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) ;
    public final EObject ruleDMLStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5897:28: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5898:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5898:1: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt107=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt107=1;
                }
                break;
            case 103:
            case 121:
                {
                alt107=2;
                }
                break;
            case 104:
                {
                alt107=3;
                }
                break;
            case 102:
                {
                alt107=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5899:5: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleDMLStatement12847);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelectStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5909:5: this_InsertStatement_1= ruleInsertStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getInsertStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInsertStatement_in_ruleDMLStatement12874);
                    this_InsertStatement_1=ruleInsertStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InsertStatement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5919:5: this_UpdateStatement_2= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getUpdateStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12901);
                    this_UpdateStatement_2=ruleUpdateStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UpdateStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5929:5: this_DeleteStatement_3= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDMLStatementAccess().getDeleteStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12928);
                    this_DeleteStatement_3=ruleDeleteStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeleteStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDMLStatement"


    // $ANTLR start "entryRuleDeleteStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5945:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5946:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5947:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12963);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement12973); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeleteStatement"


    // $ANTLR start "ruleDeleteStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5954:1: ruleDeleteStatement returns [EObject current=null] : (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5957:28: ( (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5958:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5958:1: (otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5958:3: otherlv_0= 'delete' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleDeleteStatement13010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDeleteStatement13022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getFromKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5966:1: ( (otherlv_2= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5967:1: (otherlv_2= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5967:1: (otherlv_2= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5968:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteStatementRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeleteStatement13042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5979:2: (otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==79) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5979:4: otherlv_3= 'where' ( (lv_expression_4_0= ruleSqlExpression ) )
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_79_in_ruleDeleteStatement13055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getWhereKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5983:1: ( (lv_expression_4_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5984:1: (lv_expression_4_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5984:1: (lv_expression_4_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:5985:3: lv_expression_4_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getExpressionSqlExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleDeleteStatement13076);
                    lv_expression_4_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleInsertStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6009:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6010:2: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6011:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInsertStatementRule()); 
            }
            pushFollow(FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement13114);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInsertStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertStatement13124); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInsertStatement"


    // $ANTLR start "ruleInsertStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6018:1: ruleInsertStatement returns [EObject current=null] : ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_conflictResolution_2_0 = null;

        EObject lv_expressions_13_0 = null;

        EObject lv_expressions_15_0 = null;

        EObject lv_selectStatement_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6021:28: ( ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6022:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6022:1: ( ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6022:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' ) otherlv_4= 'into' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6022:2: ( (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ) | otherlv_3= 'replace' )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==103) ) {
                alt110=1;
            }
            else if ( (LA110_0==121) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6022:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6022:3: (otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6022:5: otherlv_0= 'insert' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    {
                    otherlv_0=(Token)match(input,103,FOLLOW_103_in_ruleInsertStatement13163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0_0_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6026:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==56) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6026:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            {
                            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleInsertStatement13176); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getOrKeyword_0_0_1_0());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6030:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6031:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6031:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6032:3: lv_conflictResolution_2_0= ruleConflictResolution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_0_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConflictResolution_in_ruleInsertStatement13197);
                            lv_conflictResolution_2_0=ruleConflictResolution();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"conflictResolution",
                                      		lv_conflictResolution_2_0, 
                                      		"ConflictResolution");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6049:7: otherlv_3= 'replace'
                    {
                    otherlv_3=(Token)match(input,121,FOLLOW_121_in_ruleInsertStatement13218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getReplaceKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,122,FOLLOW_122_in_ruleInsertStatement13231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6057:1: ( (otherlv_5= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6058:1: (otherlv_5= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6058:1: (otherlv_5= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6059:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInsertStatementRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement13251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6070:2: (otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==15) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6070:4: otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement13264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6074:1: ( (otherlv_7= RULE_ID ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6075:1: (otherlv_7= RULE_ID )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6075:1: (otherlv_7= RULE_ID )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6076:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement13284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6087:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==16) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6087:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement13297); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6091:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6092:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6092:1: (otherlv_9= RULE_ID )
                    	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6093:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInsertStatementRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInsertStatement13317); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getColumnNamesColumnDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleInsertStatement13331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6108:3: ( ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) ) | (otherlv_18= 'default' otherlv_19= 'values' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==76||LA115_0==123) ) {
                alt115=1;
            }
            else if ( (LA115_0==116) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6108:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6108:4: ( (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' ) | ( (lv_selectStatement_17_0= ruleSelectStatement ) ) )
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==123) ) {
                        alt114=1;
                    }
                    else if ( (LA114_0==76) ) {
                        alt114=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 0, input);

                        throw nvae;
                    }
                    switch (alt114) {
                        case 1 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6108:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6108:5: (otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')' )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6108:7: otherlv_11= 'values' otherlv_12= '(' ( (lv_expressions_13_0= ruleSqlExpression ) ) (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )* otherlv_16= ')'
                            {
                            otherlv_11=(Token)match(input,123,FOLLOW_123_in_ruleInsertStatement13348); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_0_0_0());
                                  
                            }
                            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleInsertStatement13360); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4_0_0_1());
                                  
                            }
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6116:1: ( (lv_expressions_13_0= ruleSqlExpression ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6117:1: (lv_expressions_13_0= ruleSqlExpression )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6117:1: (lv_expressions_13_0= ruleSqlExpression )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6118:3: lv_expressions_13_0= ruleSqlExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement13381);
                            lv_expressions_13_0=ruleSqlExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"expressions",
                                      		lv_expressions_13_0, 
                                      		"SqlExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6134:2: (otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) ) )*
                            loop113:
                            do {
                                int alt113=2;
                                int LA113_0 = input.LA(1);

                                if ( (LA113_0==16) ) {
                                    alt113=1;
                                }


                                switch (alt113) {
                            	case 1 :
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6134:4: otherlv_14= ',' ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    {
                            	    otherlv_14=(Token)match(input,16,FOLLOW_16_in_ruleInsertStatement13394); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_4_0_0_3_0());
                            	          
                            	    }
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6138:1: ( (lv_expressions_15_0= ruleSqlExpression ) )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6139:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    {
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6139:1: (lv_expressions_15_0= ruleSqlExpression )
                            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6140:3: lv_expressions_15_0= ruleSqlExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getInsertStatementAccess().getExpressionsSqlExpressionParserRuleCall_4_0_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSqlExpression_in_ruleInsertStatement13415);
                            	    lv_expressions_15_0=ruleSqlExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"expressions",
                            	              		lv_expressions_15_0, 
                            	              		"SqlExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop113;
                                }
                            } while (true);

                            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleInsertStatement13429); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_4_0_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6161:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6161:6: ( (lv_selectStatement_17_0= ruleSelectStatement ) )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6162:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            {
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6162:1: (lv_selectStatement_17_0= ruleSelectStatement )
                            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6163:3: lv_selectStatement_17_0= ruleSelectStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectStatementSelectStatementParserRuleCall_4_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectStatement_in_ruleInsertStatement13457);
                            lv_selectStatement_17_0=ruleSelectStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInsertStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"selectStatement",
                                      		lv_selectStatement_17_0, 
                                      		"SelectStatement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6180:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6180:6: (otherlv_18= 'default' otherlv_19= 'values' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6180:8: otherlv_18= 'default' otherlv_19= 'values'
                    {
                    otherlv_18=(Token)match(input,116,FOLLOW_116_in_ruleInsertStatement13477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getInsertStatementAccess().getDefaultKeyword_4_1_0());
                          
                    }
                    otherlv_19=(Token)match(input,123,FOLLOW_123_in_ruleInsertStatement13489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getInsertStatementAccess().getValuesKeyword_4_1_1());
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInsertStatement"


    // $ANTLR start "entryRuleUpdateStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6196:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6197:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6198:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement13527);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement13537); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6205:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_conflictResolution_2_0 = null;

        EObject lv_updateColumnExpressions_5_0 = null;

        EObject lv_updateColumnExpressions_7_0 = null;

        EObject lv_whereExpression_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6208:28: ( (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6209:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6209:1: (otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )? )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6209:3: otherlv_0= 'update' (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )? ( (otherlv_3= RULE_ID ) ) otherlv_4= 'set' ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) ) (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )* (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            {
            otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleUpdateStatement13574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6213:1: (otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==56) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6213:3: otherlv_1= 'or' ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleUpdateStatement13587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getOrKeyword_1_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6217:1: ( (lv_conflictResolution_2_0= ruleConflictResolution ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6218:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6218:1: (lv_conflictResolution_2_0= ruleConflictResolution )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6219:3: lv_conflictResolution_2_0= ruleConflictResolution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getConflictResolutionConflictResolutionEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13608);
                    lv_conflictResolution_2_0=ruleConflictResolution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"conflictResolution",
                              		lv_conflictResolution_2_0, 
                              		"ConflictResolution");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6235:4: ( (otherlv_3= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6236:1: (otherlv_3= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6236:1: (otherlv_3= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6237:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateStatementRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateStatement13630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getTableTableDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,124,FOLLOW_124_in_ruleUpdateStatement13642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6252:1: ( (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6253:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6253:1: (lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6254:3: lv_updateColumnExpressions_5_0= ruleUpdateColumnExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13663);
            lv_updateColumnExpressions_5_0=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
              	        }
                     		add(
                     			current, 
                     			"updateColumnExpressions",
                      		lv_updateColumnExpressions_5_0, 
                      		"UpdateColumnExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:2: (otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==16) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6270:4: otherlv_6= ',' ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleUpdateStatement13676); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6274:1: ( (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression ) )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6275:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    {
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6275:1: (lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression )
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6276:3: lv_updateColumnExpressions_7_0= ruleUpdateColumnExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsUpdateColumnExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13697);
            	    lv_updateColumnExpressions_7_0=ruleUpdateColumnExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"updateColumnExpressions",
            	              		lv_updateColumnExpressions_7_0, 
            	              		"UpdateColumnExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6292:4: (otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==79) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6292:6: otherlv_8= 'where' ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    {
                    otherlv_8=(Token)match(input,79,FOLLOW_79_in_ruleUpdateStatement13712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                          
                    }
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6296:1: ( (lv_whereExpression_9_0= ruleSqlExpression ) )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6297:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6297:1: (lv_whereExpression_9_0= ruleSqlExpression )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6298:3: lv_whereExpression_9_0= ruleSqlExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereExpressionSqlExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13733);
                    lv_whereExpression_9_0=ruleSqlExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whereExpression",
                              		lv_whereExpression_9_0, 
                              		"SqlExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleUpdateColumnExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6322:1: entryRuleUpdateColumnExpression returns [EObject current=null] : iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF ;
    public final EObject entryRuleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateColumnExpression = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6323:2: (iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6324:2: iv_ruleUpdateColumnExpression= ruleUpdateColumnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateColumnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13771);
            iv_ruleUpdateColumnExpression=ruleUpdateColumnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateColumnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateColumnExpression13781); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUpdateColumnExpression"


    // $ANTLR start "ruleUpdateColumnExpression"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6331:1: ruleUpdateColumnExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) ;
    public final EObject ruleUpdateColumnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6334:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6335:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6335:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6335:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleSqlExpression ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6335:2: ( (otherlv_0= RULE_ID ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6336:1: (otherlv_0= RULE_ID )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6336:1: (otherlv_0= RULE_ID )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6337:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getUpdateColumnExpressionAccess().getColumnNameColumnDefCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleUpdateColumnExpression13838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateColumnExpressionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6352:1: ( (lv_expression_2_0= ruleSqlExpression ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6353:1: (lv_expression_2_0= ruleSqlExpression )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6353:1: (lv_expression_2_0= ruleSqlExpression )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6354:3: lv_expression_2_0= ruleSqlExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateColumnExpressionAccess().getExpressionSqlExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13859);
            lv_expression_2_0=ruleSqlExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateColumnExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"SqlExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUpdateColumnExpression"


    // $ANTLR start "entryRuleSignedNumber"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6378:1: entryRuleSignedNumber returns [String current=null] : iv_ruleSignedNumber= ruleSignedNumber EOF ;
    public final String entryRuleSignedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedNumber = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6379:2: (iv_ruleSignedNumber= ruleSignedNumber EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6380:2: iv_ruleSignedNumber= ruleSignedNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedNumberRule()); 
            }
            pushFollow(FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13896);
            iv_ruleSignedNumber=ruleSignedNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedNumber13907); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignedNumber"


    // $ANTLR start "ruleSignedNumber"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6387:1: ruleSignedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) ;
    public final AntlrDatatypeRuleToken ruleSignedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6390:28: ( ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6391:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6391:1: ( (kw= '-' )? this_NUMBER_1= RULE_NUMBER )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6391:2: (kw= '-' )? this_NUMBER_1= RULE_NUMBER
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6391:2: (kw= '-' )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==35) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6392:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleSignedNumber13946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedNumberAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleSignedNumber13963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NUMBER_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NUMBER_1, grammarAccess.getSignedNumberAccess().getNUMBERTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSignedNumber"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6412:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6413:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6414:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName14009);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName14020); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6421:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6424:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6425:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6425:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6425:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6432:1: (kw= '.' this_ID_2= RULE_ID )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==62) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6433:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleQualifiedName14079); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14094); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleCompoundOperator"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6453:1: ruleCompoundOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) ;
    public final Enumerator ruleCompoundOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6455:28: ( ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6456:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6456:1: ( (enumLiteral_0= 'union all' ) | (enumLiteral_1= 'union' ) | (enumLiteral_2= 'intersect' ) | (enumLiteral_3= 'except' ) )
            int alt121=4;
            switch ( input.LA(1) ) {
            case 125:
                {
                alt121=1;
                }
                break;
            case 126:
                {
                alt121=2;
                }
                break;
            case 127:
                {
                alt121=3;
                }
                break;
            case 128:
                {
                alt121=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6456:2: (enumLiteral_0= 'union all' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6456:2: (enumLiteral_0= 'union all' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6456:4: enumLiteral_0= 'union all'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_125_in_ruleCompoundOperator14155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompoundOperatorAccess().getUnionallEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6462:6: (enumLiteral_1= 'union' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6462:6: (enumLiteral_1= 'union' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6462:8: enumLiteral_1= 'union'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_126_in_ruleCompoundOperator14172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompoundOperatorAccess().getUnionEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6468:6: (enumLiteral_2= 'intersect' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6468:6: (enumLiteral_2= 'intersect' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6468:8: enumLiteral_2= 'intersect'
                    {
                    enumLiteral_2=(Token)match(input,127,FOLLOW_127_in_ruleCompoundOperator14189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompoundOperatorAccess().getIntersectEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6474:6: (enumLiteral_3= 'except' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6474:6: (enumLiteral_3= 'except' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6474:8: enumLiteral_3= 'except'
                    {
                    enumLiteral_3=(Token)match(input,128,FOLLOW_128_in_ruleCompoundOperator14206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompoundOperatorAccess().getExceptEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompoundOperatorAccess().getExceptEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompoundOperator"


    // $ANTLR start "ruleSqliteDataType"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6484:1: ruleSqliteDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) ;
    public final Enumerator ruleSqliteDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6486:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6487:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6487:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'none' ) | (enumLiteral_5= 'numeric' ) )
            int alt122=6;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt122=1;
                }
                break;
            case 130:
                {
                alt122=2;
                }
                break;
            case 131:
                {
                alt122=3;
                }
                break;
            case 132:
                {
                alt122=4;
                }
                break;
            case 133:
                {
                alt122=5;
                }
                break;
            case 134:
                {
                alt122=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6487:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6487:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6487:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,129,FOLLOW_129_in_ruleSqliteDataType14251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSqliteDataTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6493:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6493:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6493:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,130,FOLLOW_130_in_ruleSqliteDataType14268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSqliteDataTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6499:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6499:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6499:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,131,FOLLOW_131_in_ruleSqliteDataType14285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSqliteDataTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6505:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6505:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6505:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,132,FOLLOW_132_in_ruleSqliteDataType14302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSqliteDataTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6511:6: (enumLiteral_4= 'none' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6511:6: (enumLiteral_4= 'none' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6511:8: enumLiteral_4= 'none'
                    {
                    enumLiteral_4=(Token)match(input,133,FOLLOW_133_in_ruleSqliteDataType14319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getSqliteDataTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6517:6: (enumLiteral_5= 'numeric' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6517:6: (enumLiteral_5= 'numeric' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6517:8: enumLiteral_5= 'numeric'
                    {
                    enumLiteral_5=(Token)match(input,134,FOLLOW_134_in_ruleSqliteDataType14336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSqliteDataTypeAccess().getNumericEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getSqliteDataTypeAccess().getNumericEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSqliteDataType"


    // $ANTLR start "ruleColumnType"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6527:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6529:28: ( ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6530:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6530:1: ( (enumLiteral_0= 'text' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'real' ) | (enumLiteral_3= 'blob' ) | (enumLiteral_4= 'boolean' ) )
            int alt123=5;
            switch ( input.LA(1) ) {
            case 129:
                {
                alt123=1;
                }
                break;
            case 130:
                {
                alt123=2;
                }
                break;
            case 131:
                {
                alt123=3;
                }
                break;
            case 132:
                {
                alt123=4;
                }
                break;
            case 135:
                {
                alt123=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6530:2: (enumLiteral_0= 'text' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6530:2: (enumLiteral_0= 'text' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6530:4: enumLiteral_0= 'text'
                    {
                    enumLiteral_0=(Token)match(input,129,FOLLOW_129_in_ruleColumnType14381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getTextEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6536:6: (enumLiteral_1= 'integer' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6536:6: (enumLiteral_1= 'integer' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6536:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,130,FOLLOW_130_in_ruleColumnType14398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6542:6: (enumLiteral_2= 'real' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6542:6: (enumLiteral_2= 'real' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6542:8: enumLiteral_2= 'real'
                    {
                    enumLiteral_2=(Token)match(input,131,FOLLOW_131_in_ruleColumnType14415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getRealEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6548:6: (enumLiteral_3= 'blob' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6548:6: (enumLiteral_3= 'blob' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6548:8: enumLiteral_3= 'blob'
                    {
                    enumLiteral_3=(Token)match(input,132,FOLLOW_132_in_ruleColumnType14432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getColumnTypeAccess().getBlobEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6554:6: (enumLiteral_4= 'boolean' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6554:6: (enumLiteral_4= 'boolean' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6554:8: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,135,FOLLOW_135_in_ruleColumnType14449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getColumnTypeAccess().getBooleanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getColumnTypeAccess().getBooleanEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "ruleConflictResolution"
    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6564:1: ruleConflictResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) ;
    public final Enumerator ruleConflictResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6566:28: ( ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) ) )
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6567:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            {
            // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6567:1: ( (enumLiteral_0= 'rollback' ) | (enumLiteral_1= 'abort' ) | (enumLiteral_2= 'fail' ) | (enumLiteral_3= 'ignore' ) | (enumLiteral_4= 'replace' ) )
            int alt124=5;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt124=1;
                }
                break;
            case 137:
                {
                alt124=2;
                }
                break;
            case 138:
                {
                alt124=3;
                }
                break;
            case 139:
                {
                alt124=4;
                }
                break;
            case 121:
                {
                alt124=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6567:2: (enumLiteral_0= 'rollback' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6567:2: (enumLiteral_0= 'rollback' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6567:4: enumLiteral_0= 'rollback'
                    {
                    enumLiteral_0=(Token)match(input,136,FOLLOW_136_in_ruleConflictResolution14494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConflictResolutionAccess().getRollbackEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6573:6: (enumLiteral_1= 'abort' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6573:6: (enumLiteral_1= 'abort' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6573:8: enumLiteral_1= 'abort'
                    {
                    enumLiteral_1=(Token)match(input,137,FOLLOW_137_in_ruleConflictResolution14511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConflictResolutionAccess().getAbortEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6579:6: (enumLiteral_2= 'fail' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6579:6: (enumLiteral_2= 'fail' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6579:8: enumLiteral_2= 'fail'
                    {
                    enumLiteral_2=(Token)match(input,138,FOLLOW_138_in_ruleConflictResolution14528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConflictResolutionAccess().getFailEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6585:6: (enumLiteral_3= 'ignore' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6585:6: (enumLiteral_3= 'ignore' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6585:8: enumLiteral_3= 'ignore'
                    {
                    enumLiteral_3=(Token)match(input,139,FOLLOW_139_in_ruleConflictResolution14545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConflictResolutionAccess().getIgnoreEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6591:6: (enumLiteral_4= 'replace' )
                    {
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6591:6: (enumLiteral_4= 'replace' )
                    // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:6591:8: enumLiteral_4= 'replace'
                    {
                    enumLiteral_4=(Token)match(input,121,FOLLOW_121_in_ruleConflictResolution14562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConflictResolutionAccess().getReplaceEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getConflictResolutionAccess().getReplaceEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConflictResolution"

    // $ANTLR start synpred1_InternalMickeyLang
    public final void synpred1_InternalMickeyLang_fragment() throws RecognitionException {   
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2019:5: ( ( RULE_ID ) )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2020:1: ( RULE_ID )
        {
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2020:1: ( RULE_ID )
        // ../com.justeat.mickeydb/src-gen/com/justeat/mickeydb/parser/antlr/internal/InternalMickeyLang.g:2021:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang4483); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMickeyLang

    // Delegated rules

    public final boolean synpred1_InternalMickeyLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMickeyLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA46 dfa46 = new DFA46(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA71 dfa71 = new DFA71(this);
    static final String DFA46_eotS =
        "\15\uffff";
    static final String DFA46_eofS =
        "\3\uffff\1\13\11\uffff";
    static final String DFA46_minS =
        "\1\4\2\uffff\1\16\1\uffff\1\4\7\uffff";
    static final String DFA46_maxS =
        "\1\135\2\uffff\1\u0080\1\uffff\1\135\7\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\11\1\12\1\10\1\3\1\5";
    static final String DFA46_specialS =
        "\15\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\3\2\4\10\uffff\1\5\23\uffff\1\4\30\uffff\1\1\1\2\1\uffff\2\6\1\7\2\uffff\1\10\1\uffff\1\11\23\uffff\4\4",
            "",
            "",
            "\1\13\1\12\2\13\2\uffff\1\13\1\uffff\1\13\3\uffff\1\13\1\uffff\40\13\2\uffff\1\13\3\uffff\2\13\1\uffff\1\13\1\uffff\5\13\3\uffff\7\13\1\uffff\3\13\4\uffff\1\13\14\uffff\2\13\2\uffff\1\13\15\uffff\4\13",
            "",
            "\3\14\10\uffff\1\14\23\uffff\1\14\30\uffff\2\14\1\uffff\3\14\2\uffff\1\14\1\uffff\1\14\5\uffff\1\6\15\uffff\4\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "1965:1: ( ( () otherlv_1= 'new.' ( (otherlv_2= RULE_ID ) ) ) | ( () otherlv_4= 'old.' ( (otherlv_5= RULE_ID ) ) ) | ( () ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) ) ) | ( () ( (lv_literalValue_15_0= ruleLiteralValue ) ) ) | ( () otherlv_17= '(' ( (lv_expression_18_0= ruleSqlExpression ) ) otherlv_19= ')' ) | ( () ( (lv_not_21_0= 'not' ) )? ( (lv_exists_22_0= 'exists' ) )? otherlv_23= '(' ( (lv_select_24_0= ruleSelectStatement ) ) otherlv_25= ')' ) | ( () otherlv_27= 'case' ( (lv_caseExpression_28_0= ruleSqlExpression ) )? ( (lv_cases_29_0= ruleCase ) )+ (otherlv_30= 'else' ( (lv_elseExpression_31_0= ruleSqlExpression ) ) )? otherlv_32= 'end' ) | ( () ( (lv_name_34_0= RULE_ID ) ) otherlv_35= '(' ( ( (lv_all_36_0= '*' ) ) | ( ( (lv_arguments_37_0= ruleSqlExpression ) ) (otherlv_38= ',' ( (lv_arguments_39_0= ruleSqlExpression ) ) )* ) ) otherlv_40= ')' ) | ( () otherlv_42= 'cast' otherlv_43= '(' ( (lv_expression_44_0= ruleSqlExpression ) ) otherlv_45= 'as' ( (lv_type_46_0= ruleSqliteDataType ) ) otherlv_47= ')' ) | ( () otherlv_49= '$' ( (otherlv_50= RULE_ID ) ) ) )";
        }
    }
    static final String DFA38_eotS =
        "\127\uffff";
    static final String DFA38_eofS =
        "\1\uffff\1\3\1\44\1\uffff\1\5\122\uffff";
    static final String DFA38_minS =
        "\1\4\1\16\1\4\1\uffff\1\4\104\uffff\1\4\14\uffff\1\0";
    static final String DFA38_maxS =
        "\1\4\2\u0080\1\uffff\1\u0080\104\uffff\1\135\14\uffff\1\0";
    static final String DFA38_acceptS =
        "\3\uffff\1\3\1\uffff\1\2\103\1\1\uffff\14\1\1\uffff";
    static final String DFA38_specialS =
        "\2\uffff\1\1\1\uffff\1\2\121\uffff\1\0}>";
    static final String[] DFA38_transitionS = {
            "\1\1",
            "\1\3\1\uffff\2\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\3\1\uffff\40\3\2\uffff\1\2\3\uffff\2\3\1\uffff\1\3\1\uffff\5\3\3\uffff\7\3\1\uffff\3\3\4\uffff\1\3\14\uffff\2\3\2\uffff\1\3\15\uffff\4\3",
            "\1\5\11\uffff\1\55\1\uffff\1\50\1\45\2\uffff\1\63\1\uffff\1\56\3\uffff\1\41\1\uffff\1\23\1\62\1\104\1\43\1\4\1\42\1\37\1\40\1\33\1\34\1\35\1\36\1\27\1\30\1\31\1\32\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\24\1\25\1\26\1\12\1\11\1\6\1\7\1\10\6\uffff\1\53\1\47\1\uffff\1\51\1\uffff\1\46\1\52\1\72\1\73\1\54\3\uffff\1\76\1\64\1\65\1\74\1\75\1\77\1\100\1\uffff\1\101\1\102\1\103\4\uffff\1\57\14\uffff\1\105\1\60\2\uffff\1\61\15\uffff\1\66\1\67\1\70\1\71",
            "",
            "\1\110\1\113\1\112\7\uffff\1\5\1\120\2\5\2\uffff\1\5\1\uffff\1\5\3\uffff\1\5\1\uffff\7\5\1\111\30\5\1\106\1\107\1\uffff\1\121\1\122\1\123\2\5\1\124\1\5\1\125\5\5\3\uffff\7\5\1\uffff\3\5\1\114\1\115\1\116\1\117\1\5\14\uffff\2\5\2\uffff\1\5\15\uffff\4\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\5\1\126\10\uffff\1\5\23\uffff\1\5\30\uffff\2\5\1\uffff\3\5\2\uffff\1\5\1\uffff\1\5\23\uffff\4\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff"
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2019:2: ( ( ( ( ( RULE_ID ) )=> (otherlv_7= RULE_ID ) ) otherlv_8= '.' ) | ( ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( ( (lv_all_11_0= '*' ) ) | ( (otherlv_12= RULE_ID ) ) ) ) | ( (otherlv_13= RULE_ID ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_86 = input.LA(1);

                         
                        int index38_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMickeyLang()) ) {s = 85;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index38_86);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA38_2==32) ) {s = 4;}

                        else if ( (LA38_2==RULE_ID) ) {s = 5;}

                        else if ( (LA38_2==57) && (synpred1_InternalMickeyLang())) {s = 6;}

                        else if ( (LA38_2==58) && (synpred1_InternalMickeyLang())) {s = 7;}

                        else if ( (LA38_2==59) && (synpred1_InternalMickeyLang())) {s = 8;}

                        else if ( (LA38_2==56) && (synpred1_InternalMickeyLang())) {s = 9;}

                        else if ( (LA38_2==55) && (synpred1_InternalMickeyLang())) {s = 10;}

                        else if ( (LA38_2==44) && (synpred1_InternalMickeyLang())) {s = 11;}

                        else if ( (LA38_2==45) && (synpred1_InternalMickeyLang())) {s = 12;}

                        else if ( (LA38_2==46) && (synpred1_InternalMickeyLang())) {s = 13;}

                        else if ( (LA38_2==47) && (synpred1_InternalMickeyLang())) {s = 14;}

                        else if ( (LA38_2==48) && (synpred1_InternalMickeyLang())) {s = 15;}

                        else if ( (LA38_2==49) && (synpred1_InternalMickeyLang())) {s = 16;}

                        else if ( (LA38_2==50) && (synpred1_InternalMickeyLang())) {s = 17;}

                        else if ( (LA38_2==51) && (synpred1_InternalMickeyLang())) {s = 18;}

                        else if ( (LA38_2==28) && (synpred1_InternalMickeyLang())) {s = 19;}

                        else if ( (LA38_2==52) && (synpred1_InternalMickeyLang())) {s = 20;}

                        else if ( (LA38_2==53) && (synpred1_InternalMickeyLang())) {s = 21;}

                        else if ( (LA38_2==54) && (synpred1_InternalMickeyLang())) {s = 22;}

                        else if ( (LA38_2==40) && (synpred1_InternalMickeyLang())) {s = 23;}

                        else if ( (LA38_2==41) && (synpred1_InternalMickeyLang())) {s = 24;}

                        else if ( (LA38_2==42) && (synpred1_InternalMickeyLang())) {s = 25;}

                        else if ( (LA38_2==43) && (synpred1_InternalMickeyLang())) {s = 26;}

                        else if ( (LA38_2==36) && (synpred1_InternalMickeyLang())) {s = 27;}

                        else if ( (LA38_2==37) && (synpred1_InternalMickeyLang())) {s = 28;}

                        else if ( (LA38_2==38) && (synpred1_InternalMickeyLang())) {s = 29;}

                        else if ( (LA38_2==39) && (synpred1_InternalMickeyLang())) {s = 30;}

                        else if ( (LA38_2==34) && (synpred1_InternalMickeyLang())) {s = 31;}

                        else if ( (LA38_2==35) && (synpred1_InternalMickeyLang())) {s = 32;}

                        else if ( (LA38_2==26) && (synpred1_InternalMickeyLang())) {s = 33;}

                        else if ( (LA38_2==33) && (synpred1_InternalMickeyLang())) {s = 34;}

                        else if ( (LA38_2==31) && (synpred1_InternalMickeyLang())) {s = 35;}

                        else if ( (LA38_2==EOF) && (synpred1_InternalMickeyLang())) {s = 36;}

                        else if ( (LA38_2==17) && (synpred1_InternalMickeyLang())) {s = 37;}

                        else if ( (LA38_2==71) && (synpred1_InternalMickeyLang())) {s = 38;}

                        else if ( (LA38_2==67) && (synpred1_InternalMickeyLang())) {s = 39;}

                        else if ( (LA38_2==16) && (synpred1_InternalMickeyLang())) {s = 40;}

                        else if ( (LA38_2==69) && (synpred1_InternalMickeyLang())) {s = 41;}

                        else if ( (LA38_2==72) && (synpred1_InternalMickeyLang())) {s = 42;}

                        else if ( (LA38_2==66) && (synpred1_InternalMickeyLang())) {s = 43;}

                        else if ( (LA38_2==75) && (synpred1_InternalMickeyLang())) {s = 44;}

                        else if ( (LA38_2==14) && (synpred1_InternalMickeyLang())) {s = 45;}

                        else if ( (LA38_2==22) && (synpred1_InternalMickeyLang())) {s = 46;}

                        else if ( (LA38_2==94) && (synpred1_InternalMickeyLang())) {s = 47;}

                        else if ( (LA38_2==108) && (synpred1_InternalMickeyLang())) {s = 48;}

                        else if ( (LA38_2==111) && (synpred1_InternalMickeyLang())) {s = 49;}

                        else if ( (LA38_2==29) && (synpred1_InternalMickeyLang())) {s = 50;}

                        else if ( (LA38_2==20) && (synpred1_InternalMickeyLang())) {s = 51;}

                        else if ( (LA38_2==80) && (synpred1_InternalMickeyLang())) {s = 52;}

                        else if ( (LA38_2==81) && (synpred1_InternalMickeyLang())) {s = 53;}

                        else if ( (LA38_2==125) && (synpred1_InternalMickeyLang())) {s = 54;}

                        else if ( (LA38_2==126) && (synpred1_InternalMickeyLang())) {s = 55;}

                        else if ( (LA38_2==127) && (synpred1_InternalMickeyLang())) {s = 56;}

                        else if ( (LA38_2==128) && (synpred1_InternalMickeyLang())) {s = 57;}

                        else if ( (LA38_2==73) && (synpred1_InternalMickeyLang())) {s = 58;}

                        else if ( (LA38_2==74) && (synpred1_InternalMickeyLang())) {s = 59;}

                        else if ( (LA38_2==82) && (synpred1_InternalMickeyLang())) {s = 60;}

                        else if ( (LA38_2==83) && (synpred1_InternalMickeyLang())) {s = 61;}

                        else if ( (LA38_2==79) && (synpred1_InternalMickeyLang())) {s = 62;}

                        else if ( (LA38_2==84) && (synpred1_InternalMickeyLang())) {s = 63;}

                        else if ( (LA38_2==85) && (synpred1_InternalMickeyLang())) {s = 64;}

                        else if ( (LA38_2==87) && (synpred1_InternalMickeyLang())) {s = 65;}

                        else if ( (LA38_2==88) && (synpred1_InternalMickeyLang())) {s = 66;}

                        else if ( (LA38_2==89) && (synpred1_InternalMickeyLang())) {s = 67;}

                        else if ( (LA38_2==30) && (synpred1_InternalMickeyLang())) {s = 68;}

                        else if ( (LA38_2==107) && (synpred1_InternalMickeyLang())) {s = 69;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA38_4==60) && (synpred1_InternalMickeyLang())) {s = 70;}

                        else if ( (LA38_4==61) && (synpred1_InternalMickeyLang())) {s = 71;}

                        else if ( (LA38_4==RULE_ID) && (synpred1_InternalMickeyLang())) {s = 72;}

                        else if ( (LA38_4==35) ) {s = 73;}

                        else if ( (LA38_4==RULE_NUMBER) && (synpred1_InternalMickeyLang())) {s = 74;}

                        else if ( (LA38_4==RULE_STRING) && (synpred1_InternalMickeyLang())) {s = 75;}

                        else if ( (LA38_4==90) && (synpred1_InternalMickeyLang())) {s = 76;}

                        else if ( (LA38_4==91) && (synpred1_InternalMickeyLang())) {s = 77;}

                        else if ( (LA38_4==92) && (synpred1_InternalMickeyLang())) {s = 78;}

                        else if ( (LA38_4==93) && (synpred1_InternalMickeyLang())) {s = 79;}

                        else if ( (LA38_4==15) && (synpred1_InternalMickeyLang())) {s = 80;}

                        else if ( (LA38_4==63) && (synpred1_InternalMickeyLang())) {s = 81;}

                        else if ( (LA38_4==64) && (synpred1_InternalMickeyLang())) {s = 82;}

                        else if ( (LA38_4==65) && (synpred1_InternalMickeyLang())) {s = 83;}

                        else if ( (LA38_4==68) && (synpred1_InternalMickeyLang())) {s = 84;}

                        else if ( (LA38_4==70) && (synpred1_InternalMickeyLang())) {s = 85;}

                        else if ( (LA38_4==EOF||LA38_4==14||(LA38_4>=16 && LA38_4<=17)||LA38_4==20||LA38_4==22||LA38_4==26||(LA38_4>=28 && LA38_4<=34)||(LA38_4>=36 && LA38_4<=59)||(LA38_4>=66 && LA38_4<=67)||LA38_4==69||(LA38_4>=71 && LA38_4<=75)||(LA38_4>=79 && LA38_4<=85)||(LA38_4>=87 && LA38_4<=89)||LA38_4==94||(LA38_4>=107 && LA38_4<=108)||LA38_4==111||(LA38_4>=125 && LA38_4<=128)) ) {s = 5;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\21\uffff";
    static final String DFA71_eofS =
        "\21\uffff";
    static final String DFA71_minS =
        "\1\136\1\30\3\140\4\uffff\1\4\4\uffff\1\155\2\uffff";
    static final String DFA71_maxS =
        "\1\157\1\161\1\140\1\161\1\142\4\uffff\1\4\4\uffff\1\156\2\uffff";
    static final String DFA71_acceptS =
        "\5\uffff\1\3\1\1\1\2\1\4\1\uffff\1\10\1\12\1\11\1\7\1\uffff\1\6\1\5";
    static final String DFA71_specialS =
        "\21\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\15\uffff\1\2\2\uffff\1\3",
            "\1\10\106\uffff\1\4\1\6\1\7\1\5\16\uffff\1\10",
            "\1\11",
            "\1\15\1\14\1\12\16\uffff\1\13",
            "\1\6\1\7\1\5",
            "",
            "",
            "",
            "",
            "\1\16",
            "",
            "",
            "",
            "",
            "\1\20\1\17",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "3917:1: (this_CreateTableStatement_0= ruleCreateTableStatement | this_CreateViewStatement_1= ruleCreateViewStatement | this_CreateTriggerStatement_2= ruleCreateTriggerStatement | this_CreateIndexStatement_3= ruleCreateIndexStatement | this_AlterTableRenameStatement_4= ruleAlterTableRenameStatement | this_AlterTableAddColumnStatement_5= ruleAlterTableAddColumnStatement | this_DropTableStatement_6= ruleDropTableStatement | this_DropTriggerStatement_7= ruleDropTriggerStatement | this_DropViewStatement_8= ruleDropViewStatement | this_DropIndexStatement_9= ruleDropIndexStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleMickeyFile_in_entryRuleMickeyFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMickeyFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMickeyFile122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMickeyFile143 = new BitSet(new long[]{0x0000000020406002L,0x0000900040000000L});
    public static final BitSet FOLLOW_13_in_ruleMickeyFile156 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleMickeyFile177 = new BitSet(new long[]{0x0000000020404002L,0x0000900040000000L});
    public static final BitSet FOLLOW_ruleMickeyBlock_in_ruleMickeyFile200 = new BitSet(new long[]{0x0000000020404002L,0x0000900040000000L});
    public static final BitSet FOLLOW_ruleMickeyBlock_in_entryRuleMickeyBlock237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMickeyBlock247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMickeyFunction_in_ruleMickeyBlock294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_ruleMickeyBlock321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMickeyBlock348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_ruleMickeyBlock375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMickeyFunction_in_entryRuleMickeyFunction410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMickeyFunction420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMickeyFunction457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMickeyFunction474 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMickeyFunction491 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x000000000000009EL});
    public static final BitSet FOLLOW_ruleFunctionArg_in_ruleMickeyFunction513 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMickeyFunction526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000009EL});
    public static final BitSet FOLLOW_ruleFunctionArg_in_ruleMickeyFunction547 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleMickeyFunction563 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleMickeyFunction576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMickeyFunction599 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMickeyFunction613 = new BitSet(new long[]{0x0000000000200000L,0x020001C000001000L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleMickeyFunction635 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMickeyFunction647 = new BitSet(new long[]{0x0000000000200000L,0x020001C000001000L});
    public static final BitSet FOLLOW_21_in_ruleMickeyFunction661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionStatement_in_entryRuleActionStatement697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionStatement707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleActionStatement744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionStatement761 = new BitSet(new long[]{0x0000000004880010L});
    public static final BitSet FOLLOW_ruleContentUri_in_ruleActionStatement787 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleActionStatement799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActionStatement822 = new BitSet(new long[]{0x0000000001080002L});
    public static final BitSet FOLLOW_24_in_ruleActionStatement840 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleActionStatement867 = new BitSet(new long[]{0x000000000A200000L});
    public static final BitSet FOLLOW_ruleContentUriQueryParam_in_ruleActionStatement888 = new BitSet(new long[]{0x000000000A200000L});
    public static final BitSet FOLLOW_ruleContentNotificationUri_in_ruleActionStatement910 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleActionStatement923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentNotificationUri_in_entryRuleContentNotificationUri961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentNotificationUri971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleContentNotificationUri1008 = new BitSet(new long[]{0x0000000004080010L});
    public static final BitSet FOLLOW_ruleNotifyContentUri_in_ruleContentNotificationUri1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArg_in_entryRuleFunctionArg1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArg1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleFunctionArg1121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionArg1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotifyContentUri_in_entryRuleNotifyContentUri1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotifyContentUri1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotifyContentUriSegment_in_ruleNotifyContentUri1244 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleNotifyContentUri1258 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleNotifyContentUriSegment_in_ruleNotifyContentUri1279 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleNotifyContentUriSegment_in_entryRuleNotifyContentUriSegment1317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotifyContentUriSegment1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotifyContentUriSegment1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNotifyContentUriSegment1402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotifyContentUriSegment1419 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNotifyContentUriSegment1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUri_in_entryRuleContentUri1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUri1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri1538 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleContentUri1552 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_ruleContentUri1573 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleContentUriQueryParam_in_entryRuleContentUriQueryParam1611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriQueryParam1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleContentUriQueryParam1658 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_ruleContentUriQueryParam1676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriQueryParam1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContentUriSegment_in_entryRuleContentUriSegment1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContentUriSegment1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleContentUriSegment1831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContentUriSegment1851 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleContentUriSegment1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationBlock_in_entryRuleMigrationBlock1900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationBlock1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMigrationBlock1956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMigrationBlock1973 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleMigrationBlock1991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMigrationBlock2014 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationBlock2028 = new BitSet(new long[]{0x0000000000200000L,0x0000900040000000L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_ruleMigrationBlock2050 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationBlock2062 = new BitSet(new long[]{0x0000000000200000L,0x0000900040000000L});
    public static final BitSet FOLLOW_21_in_ruleMigrationBlock2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_entryRuleSqlExpression2112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSqlExpression2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_ruleSqlExpression2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprConcat_in_entryRuleExprConcat2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprConcat2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat2259 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleExprConcat2286 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleExprMult_in_ruleExprConcat2320 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleExprMult_in_entryRuleExprMult2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprMult2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult2415 = new BitSet(new long[]{0x0000000304000002L});
    public static final BitSet FOLLOW_32_in_ruleExprMult2444 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_26_in_ruleExprMult2473 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_33_in_ruleExprMult2502 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleExprAdd_in_ruleExprMult2539 = new BitSet(new long[]{0x0000000304000002L});
    public static final BitSet FOLLOW_ruleExprAdd_in_entryRuleExprAdd2577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAdd2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2634 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleExprAdd2663 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_35_in_ruleExprAdd2692 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleExprBit_in_ruleExprAdd2729 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleExprBit_in_entryRuleExprBit2767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprBit2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2824 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_36_in_ruleExprBit2853 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_37_in_ruleExprBit2882 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_38_in_ruleExprBit2911 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_39_in_ruleExprBit2940 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleExprRelate_in_ruleExprBit2977 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleExprRelate_in_entryRuleExprRelate3015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprRelate3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate3072 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_40_in_ruleExprRelate3101 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_41_in_ruleExprRelate3130 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_42_in_ruleExprRelate3159 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_43_in_ruleExprRelate3188 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleExprEqual_in_ruleExprRelate3225 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_ruleExprEqual_in_entryRuleExprEqual3263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEqual3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3320 = new BitSet(new long[]{0x007FF00010000002L});
    public static final BitSet FOLLOW_44_in_ruleExprEqual3349 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_45_in_ruleExprEqual3378 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_46_in_ruleExprEqual3407 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_47_in_ruleExprEqual3436 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_48_in_ruleExprEqual3465 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_49_in_ruleExprEqual3494 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_50_in_ruleExprEqual3523 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_51_in_ruleExprEqual3552 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_28_in_ruleExprEqual3581 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_52_in_ruleExprEqual3610 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_53_in_ruleExprEqual3639 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_54_in_ruleExprEqual3668 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprEqual3705 = new BitSet(new long[]{0x007FF00010000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd3743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3800 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleExprAnd3827 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd3861 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr3899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr3956 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleExprOr3983 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_ruleExprOr4017 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleNullCheckExpression_in_entryRuleNullCheckExpression4055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullCheckExpression4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNullCheckExpression4112 = new BitSet(new long[]{0x0E00000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleNullCheckExpression4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression4180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNullExpression4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNullExpression4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNullExpression4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryExpression4380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimaryExpression4429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4500 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4540 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_rulePrimaryExpression4552 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_rulePrimaryExpression4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_rulePrimaryExpression4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression4706 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4727 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimaryExpression4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimaryExpression4774 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_rulePrimaryExpression4806 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression4832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_rulePrimaryExpression4853 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimaryExpression4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryExpression4894 = new BitSet(new long[]{0xB000000800008070L,0x000000003C0000D3L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4915 = new BitSet(new long[]{0xB000000800008070L,0x000000003C0000D3L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression4937 = new BitSet(new long[]{0xB000000800008070L,0x000000003C0000DFL});
    public static final BitSet FOLLOW_66_in_rulePrimaryExpression4951 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression4972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_rulePrimaryExpression4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression5020 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression5037 = new BitSet(new long[]{0xB000000900008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_32_in_rulePrimaryExpression5056 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5097 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression5110 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5131 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_rulePrimaryExpression5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePrimaryExpression5176 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression5188 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_rulePrimaryExpression5209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rulePrimaryExpression5221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000007EL});
    public static final BitSet FOLLOW_ruleSqliteDataType_in_rulePrimaryExpression5242 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePrimaryExpression5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePrimaryExpression5283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase5340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCase5387 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase5408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleCase5420 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCase5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement5477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_ruleSelectStatement5533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleSelectStatement5546 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_ruleSelectStatement5567 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleSelectStatement5582 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5603 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleSelectStatement5617 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_16_in_ruleSelectStatement5635 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleSelectStatement5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTermList_in_entryRuleOrderingTermList5697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTermList5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5753 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleOrderingTermList5766 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_ruleOrderingTermList5787 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSelectCore_in_entryRuleSelectCore5825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectCore5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5882 = new BitSet(new long[]{0x0000000000000002L,0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleCompoundOperator_in_ruleSelectCore5912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectCore5933 = new BitSet(new long[]{0x0000000000000002L,0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression5971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleSelectExpression6027 = new BitSet(new long[]{0xB000000900008070L,0x000000003C006053L});
    public static final BitSet FOLLOW_77_in_ruleSelectExpression6046 = new BitSet(new long[]{0xB000000900008070L,0x000000003C006053L});
    public static final BitSet FOLLOW_78_in_ruleSelectExpression6083 = new BitSet(new long[]{0xB000000900008070L,0x000000003C006053L});
    public static final BitSet FOLLOW_32_in_ruleSelectExpression6117 = new BitSet(new long[]{0x0000000040000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleSelectList_in_ruleSelectExpression6157 = new BitSet(new long[]{0x0000000040000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_30_in_ruleSelectExpression6171 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSelectExpression6192 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_79_in_ruleSelectExpression6207 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_ruleSelectExpression6228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_ruleSelectExpression6243 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_ruleSelectExpression6264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleSelectExpression6279 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_ruleSelectExpression6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectList_in_entryRuleSelectList6338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectList6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList6394 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleSelectList6407 = new BitSet(new long[]{0xB000000900008070L,0x000000003C006053L});
    public static final BitSet FOLLOW_ruleResultColumn_in_ruleSelectList6428 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleWhereExpressions_in_entryRuleWhereExpressions6466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereExpressions6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleWhereExpressions6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByExpressions_in_entryRuleGroupByExpressions6556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByExpressions6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6612 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleGroupByExpressions6625 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleGroupByExpressions6646 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleHavingExpressions_in_entryRuleHavingExpressions6684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingExpressions6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleHavingExpressions6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderingTerm_in_entryRuleOrderingTerm6774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderingTerm6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleOrderingTerm6830 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleOrderingTerm6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOrderingTerm6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinSource_in_entryRuleJoinSource6937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinSource6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinSource6993 = new BitSet(new long[]{0x0000000000000002L,0x0000000003B00000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleJoinSource7014 = new BitSet(new long[]{0x0000000000000002L,0x0000000003B00000L});
    public static final BitSet FOLLOW_ruleSingleSource_in_entryRuleSingleSource7051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSource7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_ruleSingleSource7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_ruleSingleSource7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_ruleSingleSource7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceTable_in_entryRuleSingleSourceTable7197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceTable7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSingleSourceTable7264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSingleSourceTable7277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceTable7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceSelectStatement_in_entryRuleSingleSourceSelectStatement7337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceSelectStatement7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSingleSourceSelectStatement7393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSingleSourceSelectStatement7414 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSingleSourceSelectStatement7426 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleSingleSourceSelectStatement7439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleSourceSelectStatement7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleSourceJoin_in_entryRuleSingleSourceJoin7499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleSourceJoin7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSingleSourceJoin7546 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleJoinSource_in_ruleSingleSourceJoin7567 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSingleSourceJoin7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement7615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleJoinStatement7677 = new BitSet(new long[]{0x0000000000000000L,0x0000000003A00000L});
    public static final BitSet FOLLOW_85_in_ruleJoinStatement7711 = new BitSet(new long[]{0x0000000000000000L,0x0000000002400000L});
    public static final BitSet FOLLOW_86_in_ruleJoinStatement7742 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_87_in_ruleJoinStatement7781 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_88_in_ruleJoinStatement7818 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleJoinStatement7845 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSingleSource_in_ruleJoinStatement7866 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleJoinStatement7878 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleJoinStatement7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResultColumn_in_entryRuleResultColumn7935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResultColumn7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleResultColumn8000 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleResultColumn8013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResultColumn8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_entryRuleLiteralValue8073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValue8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_ruleLiteralValue8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteralValue8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleLiteralValue8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleLiteralValue8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleLiteralValue8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleLiteralValue8357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDDLStatement_in_entryRuleDDLStatement8407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDDLStatement8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_ruleDDLStatement8464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_ruleDDLStatement8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_ruleDDLStatement8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_ruleDDLStatement8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_ruleDDLStatement8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_ruleDDLStatement8599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_ruleDDLStatement8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_ruleDDLStatement8653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_ruleDDLStatement8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_ruleDDLStatement8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTableStatement_in_entryRuleCreateTableStatement8742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTableStatement8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateTableStatement8798 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTableStatement8816 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleCreateTableStatement8842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTableStatement8859 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCreateTableStatement8876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8897 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleCreateTableStatement8910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleCreateTableStatement8931 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleCreateTableStatement8946 = new BitSet(new long[]{0x0000000001000000L,0x0064000000000000L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_ruleCreateTableStatement8967 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleCreateTableStatement8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateViewStatement_in_entryRuleCreateViewStatement9017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateViewStatement9027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateViewStatement9073 = new BitSet(new long[]{0x0000000000000000L,0x0000000280000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateViewStatement9091 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleCreateViewStatement9117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateViewStatement9134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleCreateViewStatement9151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleCreateViewStatement9172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateTriggerStatement_in_entryRuleCreateTriggerStatement9208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateTriggerStatement9218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateTriggerStatement9255 = new BitSet(new long[]{0x0000000000000000L,0x0000000480000000L});
    public static final BitSet FOLLOW_95_in_ruleCreateTriggerStatement9273 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleCreateTriggerStatement9299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9316 = new BitSet(new long[]{0x0000000000000000L,0x000001F800000000L});
    public static final BitSet FOLLOW_99_in_ruleCreateTriggerStatement9341 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_100_in_ruleCreateTriggerStatement9370 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_101_in_ruleCreateTriggerStatement9399 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_102_in_ruleCreateTriggerStatement9435 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_103_in_ruleCreateTriggerStatement9472 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_104_in_ruleCreateTriggerStatement9510 = new BitSet(new long[]{0x0000000000800000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_ruleCreateTriggerStatement9536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9553 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_16_in_ruleCreateTriggerStatement9571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9588 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_23_in_ruleCreateTriggerStatement9611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateTriggerStatement9631 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000080L});
    public static final BitSet FOLLOW_106_in_ruleCreateTriggerStatement9649 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000080L});
    public static final BitSet FOLLOW_71_in_ruleCreateTriggerStatement9676 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCreateTriggerStatement9697 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ruleCreateTriggerStatement9711 = new BitSet(new long[]{0x0000000000000000L,0x020001C000001008L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9733 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCreateTriggerStatement9745 = new BitSet(new long[]{0x0000000000000000L,0x020001C000001008L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_ruleCreateTriggerStatement9767 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCreateTriggerStatement9779 = new BitSet(new long[]{0x0000000000000000L,0x020001C000001008L});
    public static final BitSet FOLLOW_67_in_ruleCreateTriggerStatement9795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableRenameStatement_in_entryRuleAlterTableRenameStatement9831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableRenameStatement9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAlterTableRenameStatement9887 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleAlterTableRenameStatement9899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9919 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleAlterTableRenameStatement9931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableRenameStatement9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlterTableAddColumnStatement_in_entryRuleAlterTableAddColumnStatement9989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlterTableAddColumnStatement9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAlterTableAddColumnStatement10036 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleAlterTableAddColumnStatement10048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlterTableAddColumnStatement10068 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleAlterTableAddColumnStatement10080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnDef_in_ruleAlterTableAddColumnStatement10101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTableStatement_in_entryRuleDropTableStatement10137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTableStatement10147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropTableStatement10184 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_ruleDropTableStatement10196 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropTableStatement10214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTableStatement10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropTriggerStatement_in_entryRuleDropTriggerStatement10284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropTriggerStatement10294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropTriggerStatement10331 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleDropTriggerStatement10343 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropTriggerStatement10361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropTriggerStatement10395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropViewStatement_in_entryRuleDropViewStatement10431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropViewStatement10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropViewStatement10478 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDropViewStatement10490 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropViewStatement10508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropViewStatement10542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreateIndexStatement_in_entryRuleCreateIndexStatement10578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreateIndexStatement10588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCreateIndexStatement10625 = new BitSet(new long[]{0x0000000001000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_24_in_ruleCreateIndexStatement10643 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleCreateIndexStatement10669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10686 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCreateIndexStatement10703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreateIndexStatement10723 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCreateIndexStatement10735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10756 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleCreateIndexStatement10769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleCreateIndexStatement10790 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleCreateIndexStatement10804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDropIndexStatement_in_entryRuleDropIndexStatement10840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDropIndexStatement10850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleDropIndexStatement10887 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleDropIndexStatement10899 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDropIndexStatement10917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDropIndexStatement10951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDef_in_entryRuleColumnDef10987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDef10997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnDef11048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000009EL});
    public static final BitSet FOLLOW_ruleColumnType_in_ruleColumnDef11074 = new BitSet(new long[]{0x0400000001000002L,0x0034000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_ruleColumnDef11095 = new BitSet(new long[]{0x0400000001000002L,0x0034000000000000L});
    public static final BitSet FOLLOW_ruleColumnConstraint_in_entryRuleColumnConstraint11132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnConstraint11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleColumnConstraint11189 = new BitSet(new long[]{0x0000000000000002L,0x00080000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleColumnConstraint11208 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_83_in_ruleColumnConstraint11245 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleColumnConstraint11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleColumnConstraint11321 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint11342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleColumnConstraint11372 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleColumnConstraint11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleColumnConstraint11423 = new BitSet(new long[]{0x0000000800008060L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_ruleColumnConstraint11444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleColumnConstraint11473 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColumnConstraint11485 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleColumnConstraint11506 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleColumnConstraint11518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableConstraint_in_entryRuleTableConstraint11555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableConstraint11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_ruleTableConstraint11612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_ruleTableConstraint11639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_ruleTableConstraint11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniqueTableConstraint_in_entryRuleUniqueTableConstraint11701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniqueTableConstraint11711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleUniqueTableConstraint11749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUniqueTableConstraint11766 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleUniqueTableConstraint11785 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleUniqueTableConstraint11797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11818 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleUniqueTableConstraint11831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_ruleUniqueTableConstraint11852 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleUniqueTableConstraint11866 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_ruleUniqueTableConstraint11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryConstraint_in_entryRulePrimaryConstraint11923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryConstraint11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_rulePrimaryConstraint11971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryConstraint11988 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_rulePrimaryConstraint12007 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryConstraint12019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint12040 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryConstraint12053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_rulePrimaryConstraint12074 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_rulePrimaryConstraint12088 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleConflictClause_in_rulePrimaryConstraint12109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckTableConstraint_in_entryRuleCheckTableConstraint12145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckTableConstraint12155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleCheckTableConstraint12193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckTableConstraint12210 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleCheckTableConstraint12229 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCheckTableConstraint12241 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleCheckTableConstraint12262 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCheckTableConstraint12274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedColumn_in_entryRuleIndexedColumn12310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedColumn12320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn12365 = new BitSet(new long[]{0x0000000000000002L,0x00800000000C0000L});
    public static final BitSet FOLLOW_119_in_ruleIndexedColumn12378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndexedColumn12395 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_ruleIndexedColumn12421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleIndexedColumn12458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValue_in_entryRuleDefaultValue12509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValue12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValue_in_ruleDefaultValue12575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDefaultValue12604 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDefaultValue12625 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDefaultValue12637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConflictClause_in_entryRuleConflictClause12674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConflictClause12684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleConflictClause12721 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleConflictClause12733 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleConflictClause12754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDMLStatement_in_entryRuleDMLStatement12790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDMLStatement12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleDMLStatement12847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_ruleDMLStatement12874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleDMLStatement12901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleDMLStatement12928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement12963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleDeleteStatement13010 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDeleteStatement13022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeleteStatement13042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleDeleteStatement13055 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleDeleteStatement13076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertStatement_in_entryRuleInsertStatement13114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertStatement13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleInsertStatement13163 = new BitSet(new long[]{0x0100000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_56_in_ruleInsertStatement13176 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleInsertStatement13197 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_121_in_ruleInsertStatement13218 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleInsertStatement13231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement13251 = new BitSet(new long[]{0x0000000000008000L,0x0810000000001000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement13264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement13284 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement13297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInsertStatement13317 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInsertStatement13331 = new BitSet(new long[]{0x0000000000000000L,0x0810000000001000L});
    public static final BitSet FOLLOW_123_in_ruleInsertStatement13348 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsertStatement13360 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement13381 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInsertStatement13394 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleInsertStatement13415 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInsertStatement13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleInsertStatement13457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleInsertStatement13477 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleInsertStatement13489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement13527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement13537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleUpdateStatement13574 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_56_in_ruleUpdateStatement13587 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_ruleConflictResolution_in_ruleUpdateStatement13608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateStatement13630 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleUpdateStatement13642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13663 = new BitSet(new long[]{0x0000000000010002L,0x0000000000008000L});
    public static final BitSet FOLLOW_16_in_ruleUpdateStatement13676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_ruleUpdateStatement13697 = new BitSet(new long[]{0x0000000000010002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleUpdateStatement13712 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateStatement13733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateColumnExpression_in_entryRuleUpdateColumnExpression13771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateColumnExpression13781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUpdateColumnExpression13826 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleUpdateColumnExpression13838 = new BitSet(new long[]{0xB000000800008070L,0x000000003C000053L});
    public static final BitSet FOLLOW_ruleSqlExpression_in_ruleUpdateColumnExpression13859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedNumber_in_entryRuleSignedNumber13896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedNumber13907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSignedNumber13946 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleSignedNumber13963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName14009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName14020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14060 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleQualifiedName14079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14094 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleCompoundOperator14155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleCompoundOperator14172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleCompoundOperator14189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleCompoundOperator14206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSqliteDataType14251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleSqliteDataType14268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleSqliteDataType14285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleSqliteDataType14302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleSqliteDataType14319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleSqliteDataType14336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleColumnType14381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleColumnType14398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleColumnType14415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleColumnType14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleColumnType14449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleConflictResolution14494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleConflictResolution14511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleConflictResolution14528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleConflictResolution14545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleConflictResolution14562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalMickeyLang4483 = new BitSet(new long[]{0x0000000000000002L});

}