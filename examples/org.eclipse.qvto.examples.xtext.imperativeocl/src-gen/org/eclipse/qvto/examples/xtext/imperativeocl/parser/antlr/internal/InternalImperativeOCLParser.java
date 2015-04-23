package org.eclipse.qvto.examples.xtext.imperativeocl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.qvto.examples.xtext.imperativeocl.services.ImperativeOCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalImperativeOCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_ACCESS_OP", "RULE_ASSIGN_OP", "RULE_CMP_OP", "RULE_MULT_OP", "RULE_MULTI_ITERATOR_OP", "RULE_RESOLVE_IN_KIND", "RULE_RESOLVE_KIND", "RULE_SIMPLE_ITERATOR_OP", "RULE_UNARY_OP", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'List'", "'('", "')'", "'Dict'", "','", "'{'", "'}'", "'='", "'return'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "':'", "'..'", "'++'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'pre'", "'['", "']'", "'in'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'?'", "'::'", "'extends'", "'&&'"
    };
    public static final int RULE_CMP_OP=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_ESCAPED_CHARACTER=17;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_ESCAPED_ID=5;
    public static final int RULE_DOUBLE_QUOTED_STRING=19;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_RESOLVE_KIND=14;
    public static final int RULE_SIMPLE_ID=4;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_SINGLE_QUOTED_STRING=7;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_LETTER_CHARACTER=18;
    public static final int RULE_ML_COMMENT=21;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int RULE_UNARY_OP=16;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_RESOLVE_IN_KIND=13;
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
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_SIMPLE_ITERATOR_OP=15;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=20;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_MULT_OP=11;
    public static final int T__49=49;
    public static final int RULE_ACCESS_OP=8;
    public static final int RULE_MULTI_ITERATOR_OP=12;
    public static final int RULE_SL_COMMENT=22;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_ASSIGN_OP=9;
    public static final int T__39=39;
    public static final int RULE_WS=23;

    // delegates
    // delegators


        public InternalImperativeOCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalImperativeOCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalImperativeOCLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ImperativeOCLGrammarAccess grammarAccess;
     	
        public InternalImperativeOCLParser(TokenStream input, ImperativeOCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GrammmarCS";	
       	}
       	
       	@Override
       	protected ImperativeOCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGrammmarCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:73:1: entryRuleGrammmarCS returns [EObject current=null] : iv_ruleGrammmarCS= ruleGrammmarCS EOF ;
    public final EObject entryRuleGrammmarCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammmarCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:74:2: (iv_ruleGrammmarCS= ruleGrammmarCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:75:2: iv_ruleGrammmarCS= ruleGrammmarCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGrammmarCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGrammmarCS_in_entryRuleGrammmarCS81);
            iv_ruleGrammmarCS=ruleGrammmarCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGrammmarCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammmarCS91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGrammmarCS"


    // $ANTLR start "ruleGrammmarCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:82:1: ruleGrammmarCS returns [EObject current=null] : this_ImperativeOCLExpCS_0= ruleImperativeOCLExpCS ;
    public final EObject ruleGrammmarCS() throws RecognitionException {
        EObject current = null;

        EObject this_ImperativeOCLExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:85:28: (this_ImperativeOCLExpCS_0= ruleImperativeOCLExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:87:2: this_ImperativeOCLExpCS_0= ruleImperativeOCLExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGrammmarCSAccess().getImperativeOCLExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleImperativeOCLExpCS_in_ruleGrammmarCS140);
            this_ImperativeOCLExpCS_0=ruleImperativeOCLExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImperativeOCLExpCS_0; 
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
    // $ANTLR end "ruleGrammmarCS"


    // $ANTLR start "entryRuleImperativeOCLExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:114:1: entryRuleImperativeOCLExpCS returns [EObject current=null] : iv_ruleImperativeOCLExpCS= ruleImperativeOCLExpCS EOF ;
    public final EObject entryRuleImperativeOCLExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeOCLExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:115:2: (iv_ruleImperativeOCLExpCS= ruleImperativeOCLExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:116:2: iv_ruleImperativeOCLExpCS= ruleImperativeOCLExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImperativeOCLExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImperativeOCLExpCS_in_entryRuleImperativeOCLExpCS182);
            iv_ruleImperativeOCLExpCS=ruleImperativeOCLExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImperativeOCLExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImperativeOCLExpCS192); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImperativeOCLExpCS"


    // $ANTLR start "ruleImperativeOCLExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:123:1: ruleImperativeOCLExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleImperativeOCLExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:126:28: (this_ExpCS_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:128:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImperativeOCLExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleImperativeOCLExpCS241);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpCS_0; 
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
    // $ANTLR end "ruleImperativeOCLExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:147:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:148:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:149:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS275);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralCS285); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:156:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS | this_ListTypeCS_4= ruleListTypeCS | this_DictTypeCS_5= ruleDictTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;

        EObject this_ListTypeCS_4 = null;

        EObject this_DictTypeCS_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:159:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS | this_ListTypeCS_4= ruleListTypeCS | this_DictTypeCS_5= ruleDictTypeCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:160:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS | this_ListTypeCS_4= ruleListTypeCS | this_DictTypeCS_5= ruleDictTypeCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:160:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS | this_ListTypeCS_4= ruleListTypeCS | this_DictTypeCS_5= ruleDictTypeCS )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt1=1;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt1=2;
                }
                break;
            case 52:
                {
                alt1=3;
                }
                break;
            case 53:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            case 28:
                {
                alt1=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:161:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS335);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveTypeCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:174:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS365);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionTypeCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:187:2: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_ruleTypeLiteralCS395);
                    this_MapTypeCS_2=ruleMapTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapTypeCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:200:2: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS425);
                    this_TupleTypeCS_3=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleTypeCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:213:2: this_ListTypeCS_4= ruleListTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getListTypeCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleListTypeCS_in_ruleTypeLiteralCS455);
                    this_ListTypeCS_4=ruleListTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListTypeCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:226:2: this_DictTypeCS_5= ruleDictTypeCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getDictTypeCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDictTypeCS_in_ruleTypeLiteralCS485);
                    this_DictTypeCS_5=ruleDictTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DictTypeCS_5; 
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
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleListTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:245:1: entryRuleListTypeCS returns [EObject current=null] : iv_ruleListTypeCS= ruleListTypeCS EOF ;
    public final EObject entryRuleListTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTypeCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:246:2: (iv_ruleListTypeCS= ruleListTypeCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:247:2: iv_ruleListTypeCS= ruleListTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleListTypeCS_in_entryRuleListTypeCS520);
            iv_ruleListTypeCS=ruleListTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListTypeCS530); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListTypeCS"


    // $ANTLR start "ruleListTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:254:1: ruleListTypeCS returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) ;
    public final EObject ruleListTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:257:28: ( (otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:258:1: (otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:258:1: (otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:258:3: otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleListTypeCS567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListTypeCSAccess().getListKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleListTypeCS579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListTypeCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:266:1: ( (lv_type_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:267:1: (lv_type_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:267:1: (lv_type_2_0= ruleTypeExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:268:3: lv_type_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListTypeCSAccess().getTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleListTypeCS600);
            lv_type_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getListTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"TypeExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleListTypeCS612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getListTypeCSAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleListTypeCS"


    // $ANTLR start "entryRuleDictTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:296:1: entryRuleDictTypeCS returns [EObject current=null] : iv_ruleDictTypeCS= ruleDictTypeCS EOF ;
    public final EObject entryRuleDictTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictTypeCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:297:2: (iv_ruleDictTypeCS= ruleDictTypeCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:298:2: iv_ruleDictTypeCS= ruleDictTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDictTypeCS_in_entryRuleDictTypeCS648);
            iv_ruleDictTypeCS=ruleDictTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDictTypeCS658); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDictTypeCS"


    // $ANTLR start "ruleDictTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:305:1: ruleDictTypeCS returns [EObject current=null] : (otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' ) ;
    public final EObject ruleDictTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyType_2_0 = null;

        EObject lv_valueType_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:308:28: ( (otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:309:1: (otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:309:1: (otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:309:3: otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDictTypeCS695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDictTypeCSAccess().getDictKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDictTypeCS707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDictTypeCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:317:1: ( (lv_keyType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:318:1: (lv_keyType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:318:1: (lv_keyType_2_0= ruleTypeExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:319:3: lv_keyType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictTypeCSAccess().getKeyTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleDictTypeCS728);
            lv_keyType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDictTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"keyType",
                      		lv_keyType_2_0, 
                      		"TypeExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDictTypeCS740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDictTypeCSAccess().getCommaKeyword_3());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:339:1: ( (lv_valueType_4_0= ruleTypeExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:340:1: (lv_valueType_4_0= ruleTypeExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:340:1: (lv_valueType_4_0= ruleTypeExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:341:3: lv_valueType_4_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictTypeCSAccess().getValueTypeTypeExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleDictTypeCS761);
            lv_valueType_4_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDictTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"valueType",
                      		lv_valueType_4_0, 
                      		"TypeExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDictTypeCS773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDictTypeCSAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleDictTypeCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:369:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:370:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:371:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS809);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpCS819); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:378:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NestedExpCS_0 = null;

        EObject this_IfExpCS_1 = null;

        EObject this_SelfExpCS_2 = null;

        EObject this_PrimitiveLiteralExpCS_3 = null;

        EObject this_TupleLiteralExpCS_4 = null;

        EObject this_MapLiteralExpCS_5 = null;

        EObject this_CollectionLiteralExpCS_6 = null;

        EObject this_LambdaLiteralExpCS_7 = null;

        EObject this_ListLiteralExpCS_8 = null;

        EObject this_DictLiteralExpCS_9 = null;

        EObject this_TypeLiteralExpCS_10 = null;

        EObject this_ReturnExpCS_11 = null;

        EObject this_NameExpCS_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:381:28: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:382:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:382:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:383:2: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS869);
                    this_NestedExpCS_0=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NestedExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:396:2: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS899);
                    this_IfExpCS_1=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:409:2: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS929);
                    this_SelfExpCS_2=ruleSelfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelfExpCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:422:2: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS959);
                    this_PrimitiveLiteralExpCS_3=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveLiteralExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:435:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS989);
                    this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleLiteralExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:448:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_rulePrimaryExpCS1019);
                    this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapLiteralExpCS_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:461:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS1049);
                    this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionLiteralExpCS_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:474:2: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLambdaLiteralExpCS_in_rulePrimaryExpCS1079);
                    this_LambdaLiteralExpCS_7=ruleLambdaLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LambdaLiteralExpCS_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:487:2: this_ListLiteralExpCS_8= ruleListLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getListLiteralExpCSParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleListLiteralExpCS_in_rulePrimaryExpCS1109);
                    this_ListLiteralExpCS_8=ruleListLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListLiteralExpCS_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:500:2: this_DictLiteralExpCS_9= ruleDictLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getDictLiteralExpCSParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDictLiteralExpCS_in_rulePrimaryExpCS1139);
                    this_DictLiteralExpCS_9=ruleDictLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DictLiteralExpCS_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:513:2: this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS1169);
                    this_TypeLiteralExpCS_10=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralExpCS_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:526:2: this_ReturnExpCS_11= ruleReturnExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getReturnExpCSParserRuleCall_11()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleReturnExpCS_in_rulePrimaryExpCS1199);
                    this_ReturnExpCS_11=ruleReturnExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnExpCS_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:539:2: this_NameExpCS_12= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_12()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_rulePrimaryExpCS1229);
                    this_NameExpCS_12=ruleNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NameExpCS_12; 
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
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRuleListLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:558:1: entryRuleListLiteralExpCS returns [EObject current=null] : iv_ruleListLiteralExpCS= ruleListLiteralExpCS EOF ;
    public final EObject entryRuleListLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:559:2: (iv_ruleListLiteralExpCS= ruleListLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:560:2: iv_ruleListLiteralExpCS= ruleListLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleListLiteralExpCS_in_entryRuleListLiteralExpCS1264);
            iv_ruleListLiteralExpCS=ruleListLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListLiteralExpCS1274); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListLiteralExpCS"


    // $ANTLR start "ruleListLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:567:1: ruleListLiteralExpCS returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleListLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownedParts_3_0 = null;

        EObject lv_ownedParts_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:570:28: ( (otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:571:1: (otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:571:1: (otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:571:3: otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleListLiteralExpCS1311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListLiteralExpCSAccess().getListKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleListLiteralExpCS1323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:579:1: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:580:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getListLiteralExpCSAccess().getListLiteralExpCSAction_2(),
                          current);
                  
            }

            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:588:2: ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_SIMPLE_ID && LA4_0<=RULE_SINGLE_QUOTED_STRING)||(LA4_0>=25 && LA4_0<=26)||LA4_0==28||(LA4_0>=33 && LA4_0<=36)||(LA4_0>=52 && LA4_0<=67)||LA4_0==70||(LA4_0>=72 && LA4_0<=75)||LA4_0==83||(LA4_0>=88 && LA4_0<=89)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:588:3: ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:588:3: ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:589:1: (lv_ownedParts_3_0= ruleCollectionLiteralPartCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:589:1: (lv_ownedParts_3_0= ruleCollectionLiteralPartCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:590:3: lv_ownedParts_3_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleListLiteralExpCS1357);
                    lv_ownedParts_3_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListLiteralExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_3_0, 
                              		"CollectionLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:606:2: (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==29) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:606:4: otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleListLiteralExpCS1370); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getListLiteralExpCSAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:610:1: ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:611:1: (lv_ownedParts_5_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:611:1: (lv_ownedParts_5_0= ruleCollectionLiteralPartCS )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:612:3: lv_ownedParts_5_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getListLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleListLiteralExpCS1391);
                    	    lv_ownedParts_5_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getListLiteralExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_5_0, 
                    	              		"CollectionLiteralPartCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleListLiteralExpCS1407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getListLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleListLiteralExpCS"


    // $ANTLR start "entryRuleDictLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:640:1: entryRuleDictLiteralExpCS returns [EObject current=null] : iv_ruleDictLiteralExpCS= ruleDictLiteralExpCS EOF ;
    public final EObject entryRuleDictLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:641:2: (iv_ruleDictLiteralExpCS= ruleDictLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:642:2: iv_ruleDictLiteralExpCS= ruleDictLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDictLiteralExpCS_in_entryRuleDictLiteralExpCS1443);
            iv_ruleDictLiteralExpCS=ruleDictLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDictLiteralExpCS1453); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDictLiteralExpCS"


    // $ANTLR start "ruleDictLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:649:1: ruleDictLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleDictLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownedParts_3_0 = null;

        EObject lv_ownedParts_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:652:28: ( (otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:653:1: (otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:653:1: (otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:653:3: otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDictLiteralExpCS1490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDictLiteralExpCSAccess().getDictKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDictLiteralExpCS1502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDictLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:661:1: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:662:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDictLiteralExpCSAccess().getDictLiteralExpCSAction_2(),
                          current);
                  
            }

            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:670:2: ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_SINGLE_QUOTED_STRING)||LA6_0==36||(LA6_0>=72 && LA6_0<=75)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:670:3: ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )*
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:670:3: ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:671:1: (lv_ownedParts_3_0= ruleDictLiteralPartCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:671:1: (lv_ownedParts_3_0= ruleDictLiteralPartCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:672:3: lv_ownedParts_3_0= ruleDictLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictLiteralExpCSAccess().getOwnedPartsDictLiteralPartCSParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDictLiteralPartCS_in_ruleDictLiteralExpCS1536);
                    lv_ownedParts_3_0=ruleDictLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictLiteralExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_3_0, 
                              		"DictLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:688:2: (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==29) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:688:4: otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDictLiteralExpCS1549); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDictLiteralExpCSAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:692:1: ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:693:1: (lv_ownedParts_5_0= ruleDictLiteralPartCS )
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:693:1: (lv_ownedParts_5_0= ruleDictLiteralPartCS )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:694:3: lv_ownedParts_5_0= ruleDictLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDictLiteralExpCSAccess().getOwnedPartsDictLiteralPartCSParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleDictLiteralPartCS_in_ruleDictLiteralExpCS1570);
                    	    lv_ownedParts_5_0=ruleDictLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDictLiteralExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_5_0, 
                    	              		"DictLiteralPartCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDictLiteralExpCS1586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDictLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleDictLiteralExpCS"


    // $ANTLR start "entryRuleDictLiteralPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:722:1: entryRuleDictLiteralPartCS returns [EObject current=null] : iv_ruleDictLiteralPartCS= ruleDictLiteralPartCS EOF ;
    public final EObject entryRuleDictLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictLiteralPartCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:723:2: (iv_ruleDictLiteralPartCS= ruleDictLiteralPartCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:724:2: iv_ruleDictLiteralPartCS= ruleDictLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDictLiteralPartCS_in_entryRuleDictLiteralPartCS1622);
            iv_ruleDictLiteralPartCS=ruleDictLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDictLiteralPartCS1632); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDictLiteralPartCS"


    // $ANTLR start "ruleDictLiteralPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:731:1: ruleDictLiteralPartCS returns [EObject current=null] : ( ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleDictLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:734:28: ( ( ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:735:1: ( ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:735:1: ( ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:735:2: ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:735:2: ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:736:1: (lv_key_0_0= rulePrimitiveLiteralExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:736:1: (lv_key_0_0= rulePrimitiveLiteralExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:737:3: lv_key_0_0= rulePrimitiveLiteralExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictLiteralPartCSAccess().getKeyPrimitiveLiteralExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_ruleDictLiteralPartCS1678);
            lv_key_0_0=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDictLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"PrimitiveLiteralExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDictLiteralPartCS1690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDictLiteralPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:757:1: ( (lv_value_2_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:758:1: (lv_value_2_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:758:1: (lv_value_2_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:759:3: lv_value_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictLiteralPartCSAccess().getValueExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleDictLiteralPartCS1711);
            lv_value_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDictLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"ExpCS");
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
    // $ANTLR end "ruleDictLiteralPartCS"


    // $ANTLR start "entryRuleReturnExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:783:1: entryRuleReturnExpCS returns [EObject current=null] : iv_ruleReturnExpCS= ruleReturnExpCS EOF ;
    public final EObject entryRuleReturnExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:784:2: (iv_ruleReturnExpCS= ruleReturnExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:785:2: iv_ruleReturnExpCS= ruleReturnExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReturnExpCS_in_entryRuleReturnExpCS1747);
            iv_ruleReturnExpCS=ruleReturnExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReturnExpCS1757); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnExpCS"


    // $ANTLR start "ruleReturnExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:792:1: ruleReturnExpCS returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )? ) ;
    public final EObject ruleReturnExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:795:28: ( (otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:796:1: (otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:796:1: (otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:796:3: otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )?
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleReturnExpCS1794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnExpCSAccess().getReturnKeyword_0());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:800:1: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:801:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnExpCSAccess().getReturnExpCSAction_1(),
                          current);
                  
            }

            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:809:2: ( (lv_value_2_0= ruleExpCS ) )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: (lv_value_2_0= ruleExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: (lv_value_2_0= ruleExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:811:3: lv_value_2_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnExpCSAccess().getValueExpCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleReturnExpCS1827);
                    lv_value_2_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReturnExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleReturnExpCS"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:839:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:840:2: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:841:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorName_in_entryRuleEssentialOCLUnaryOperatorName1869);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorName1880); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnaryOperatorName"


    // $ANTLR start "ruleEssentialOCLUnaryOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:848:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:851:28: ( (kw= '-' | kw= 'not' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:852:1: (kw= '-' | kw= 'not' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:852:1: (kw= '-' | kw= 'not' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:853:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLUnaryOperatorName1918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:860:2: kw= 'not'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLUnaryOperatorName1937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1()); 
                          
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
    // $ANTLR end "ruleEssentialOCLUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLInfixOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:873:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:874:2: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:875:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorName_in_entryRuleEssentialOCLInfixOperatorName1978);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorName1989); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLInfixOperatorName"


    // $ANTLR start "ruleEssentialOCLInfixOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:882:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:885:28: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:886:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:886:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt9=14;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            case 39:
                {
                alt9=5;
                }
                break;
            case 40:
                {
                alt9=6;
                }
                break;
            case 41:
                {
                alt9=7;
                }
                break;
            case 42:
                {
                alt9=8;
                }
                break;
            case 32:
                {
                alt9=9;
                }
                break;
            case 43:
                {
                alt9=10;
                }
                break;
            case 44:
                {
                alt9=11;
                }
                break;
            case 45:
                {
                alt9=12;
                }
                break;
            case 46:
                {
                alt9=13;
                }
                break;
            case 47:
                {
                alt9=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:887:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLInfixOperatorName2027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:894:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperatorName2046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:901:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEssentialOCLInfixOperatorName2065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:908:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperatorName2084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:915:2: kw= '>'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEssentialOCLInfixOperatorName2103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:922:2: kw= '<'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEssentialOCLInfixOperatorName2122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:929:2: kw= '>='
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEssentialOCLInfixOperatorName2141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:936:2: kw= '<='
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEssentialOCLInfixOperatorName2160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:943:2: kw= '='
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLInfixOperatorName2179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:950:2: kw= '<>'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEssentialOCLInfixOperatorName2198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:957:2: kw= 'and'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEssentialOCLInfixOperatorName2217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:964:2: kw= 'or'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEssentialOCLInfixOperatorName2236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:971:2: kw= 'xor'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEssentialOCLInfixOperatorName2255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:978:2: kw= 'implies'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEssentialOCLInfixOperatorName2274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_13()); 
                          
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
    // $ANTLR end "ruleEssentialOCLInfixOperatorName"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:991:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:992:2: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:993:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorName_in_entryRuleEssentialOCLNavigationOperatorName2315);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorName2326); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorName"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1000:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1003:28: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1004:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1004:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt10=1;
                }
                break;
            case 49:
                {
                alt10=2;
                }
                break;
            case 50:
                {
                alt10=3;
                }
                break;
            case 51:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1005:2: kw= '.'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEssentialOCLNavigationOperatorName2364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1012:2: kw= '->'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLNavigationOperatorName2383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1019:2: kw= '?.'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEssentialOCLNavigationOperatorName2402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1026:2: kw= '?->'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEssentialOCLNavigationOperatorName2421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_3()); 
                          
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
    // $ANTLR end "ruleEssentialOCLNavigationOperatorName"


    // $ANTLR start "entryRuleBinaryOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1039:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1040:2: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1041:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_entryRuleBinaryOperatorName2462);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorName2473); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryOperatorName"


    // $ANTLR start "ruleBinaryOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1048:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1051:28: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1052:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1052:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32||LA11_0==34||(LA11_0>=36 && LA11_0<=47)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=48 && LA11_0<=51)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1053:5: this_InfixOperatorName_0= ruleInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getInfixOperatorNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorName_in_ruleBinaryOperatorName2520);
                    this_InfixOperatorName_0=ruleInfixOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InfixOperatorName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1065:5: this_NavigationOperatorName_1= ruleNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getNavigationOperatorNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorName_in_ruleBinaryOperatorName2553);
                    this_NavigationOperatorName_1=ruleNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NavigationOperatorName_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleBinaryOperatorName"


    // $ANTLR start "entryRuleInfixOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1083:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1084:2: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1085:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorName_in_entryRuleInfixOperatorName2599);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorName2610); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInfixOperatorName"


    // $ANTLR start "ruleInfixOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1092:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1095:28: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1097:5: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorName_in_ruleInfixOperatorName2656);
            this_EssentialOCLInfixOperatorName_0=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLInfixOperatorName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleInfixOperatorName"


    // $ANTLR start "entryRuleNavigationOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1115:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1116:2: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1117:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorName_in_entryRuleNavigationOperatorName2701);
            iv_ruleNavigationOperatorName=ruleNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorName2712); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigationOperatorName"


    // $ANTLR start "ruleNavigationOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1124:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1127:28: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1129:5: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorName_in_ruleNavigationOperatorName2758);
            this_EssentialOCLNavigationOperatorName_0=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLNavigationOperatorName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleNavigationOperatorName"


    // $ANTLR start "entryRuleUnaryOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1147:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1148:2: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1149:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_entryRuleUnaryOperatorName2803);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorName2814); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOperatorName"


    // $ANTLR start "ruleUnaryOperatorName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1156:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1159:28: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1161:5: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorName_in_ruleUnaryOperatorName2860);
            this_EssentialOCLUnaryOperatorName_0=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnaryOperatorName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1179:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1180:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1181:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName2905);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName2916); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1188:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1191:28: (this_Identifier_0= ruleIdentifier )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1193:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName2962);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1211:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1212:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1213:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName3007);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName3018); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1220:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1223:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1225:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName3064);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1243:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1244:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1245:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName3109);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName3120); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1252:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1255:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1256:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1256:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt12=1;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt12=2;
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt12=3;
                }
                break;
            case 52:
                {
                alt12=4;
                }
                break;
            case 53:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1257:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName3167);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UnrestrictedName_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1269:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName3200);
                    this_CollectionTypeIdentifier_1=ruleCollectionTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CollectionTypeIdentifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1281:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName3233);
                    this_PrimitiveTypeIdentifier_2=rulePrimitiveTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimitiveTypeIdentifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1293:2: kw= 'Map'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEssentialOCLUnreservedName3257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1300:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEssentialOCLUnreservedName3276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_4()); 
                          
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
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRuleUnreservedName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1313:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1314:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1315:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName3317);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName3328); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnreservedName"


    // $ANTLR start "ruleUnreservedName"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1322:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1325:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1327:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName3374);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnreservedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleUnreservedName"


    // $ANTLR start "entryRuleURIFirstPathElementCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1347:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1348:2: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1349:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS3420);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIFirstPathElementCS3430); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURIFirstPathElementCS"


    // $ANTLR start "ruleURIFirstPathElementCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1356:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1359:28: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1360:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1360:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_SIMPLE_ID && LA13_0<=RULE_ESCAPED_ID)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1360:2: ( ( ruleUnrestrictedName ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1360:2: ( ( ruleUnrestrictedName ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1361:1: ( ruleUnrestrictedName )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1361:1: ( ruleUnrestrictedName )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1362:3: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS3482);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1379:6: ( () ( ( ruleURI ) ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1379:6: ( () ( ( ruleURI ) ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1379:7: () ( ( ruleURI ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1379:7: ()
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1380:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getURIFirstPathElementCSAccess().getPathElementWithURICSAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1388:2: ( ( ruleURI ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1389:1: ( ruleURI )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1389:1: ( ruleURI )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1390:3: ruleURI
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamespaceCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleURI_in_ruleURIFirstPathElementCS3528);
                    ruleURI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleURIFirstPathElementCS"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1414:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1415:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1416:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier3566);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier3577); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1423:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1426:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1427:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1427:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt14=1;
                }
                break;
            case 55:
                {
                alt14=2;
                }
                break;
            case 56:
                {
                alt14=3;
                }
                break;
            case 57:
                {
                alt14=4;
                }
                break;
            case 58:
                {
                alt14=5;
                }
                break;
            case 59:
                {
                alt14=6;
                }
                break;
            case 60:
                {
                alt14=7;
                }
                break;
            case 61:
                {
                alt14=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1428:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimitiveTypeIdentifier3615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1435:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimitiveTypeIdentifier3634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1442:2: kw= 'Real'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulePrimitiveTypeIdentifier3653); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1449:2: kw= 'String'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimitiveTypeIdentifier3672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1456:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulePrimitiveTypeIdentifier3691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1463:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimitiveTypeIdentifier3710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1470:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulePrimitiveTypeIdentifier3729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1477:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_rulePrimitiveTypeIdentifier3748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7()); 
                          
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
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1490:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1491:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1492:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS3788);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS3798); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1499:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1502:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1503:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1503:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1504:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1504:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1505:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS3843);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"PrimitiveTypeIdentifier");
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
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1529:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1530:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1531:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier3879);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier3890); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1538:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1541:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1542:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1542:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt15=1;
                }
                break;
            case 63:
                {
                alt15=2;
                }
                break;
            case 64:
                {
                alt15=3;
                }
                break;
            case 65:
                {
                alt15=4;
                }
                break;
            case 66:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1543:2: kw= 'Set'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCollectionTypeIdentifier3928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1550:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCollectionTypeIdentifier3947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1557:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCollectionTypeIdentifier3966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1564:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCollectionTypeIdentifier3985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1571:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleCollectionTypeIdentifier4004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4()); 
                          
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
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1584:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1585:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1586:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS4044);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS4054); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1593:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1596:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1597:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1597:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1597:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1597:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1598:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1598:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1599:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS4100);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"CollectionTypeIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1615:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1615:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCollectionTypeCS4113); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1619:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1620:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1620:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1621:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS4134);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCollectionTypeCS4146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMapTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1649:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1650:2: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1651:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_entryRuleMapTypeCS4184);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapTypeCS4194); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapTypeCS"


    // $ANTLR start "ruleMapTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1658:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleMapTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1661:28: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1662:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1662:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1662:2: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1662:2: ( (lv_name_0_0= 'Map' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1663:1: (lv_name_0_0= 'Map' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1663:1: (lv_name_0_0= 'Map' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1664:3: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMapTypeCS4237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getMapTypeCSAccess().getNameMapKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMapTypeCSRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "Map");
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1677:2: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1677:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMapTypeCS4263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1681:1: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1682:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1682:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1683:3: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4284);
                    lv_ownedKeyType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedKeyType",
                              		lv_ownedKeyType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMapTypeCS4296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1703:1: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1704:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1704:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1705:3: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4317);
                    lv_ownedValueType_4_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedValueType",
                              		lv_ownedValueType_4_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMapTypeCS4329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getMapTypeCSAccess().getRightParenthesisKeyword_1_4());
                          
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
    // $ANTLR end "ruleMapTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1733:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1734:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1735:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS4367);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS4377); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1742:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1745:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1746:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1746:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1746:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1746:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1747:1: (lv_name_0_0= 'Tuple' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1747:1: (lv_name_0_0= 'Tuple' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1748:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTupleTypeCS4420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTupleTypeCSRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1761:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1761:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTupleTypeCS4446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1765:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_SIMPLE_ID && LA19_0<=RULE_ESCAPED_ID)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1765:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1765:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1766:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1766:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1767:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4468);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedParts",
                                      		lv_ownedParts_2_0, 
                                      		"TuplePartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1783:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==29) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1783:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTupleTypeCS4481); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1787:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1788:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1788:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1789:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4502);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedParts",
                            	              		lv_ownedParts_4_0, 
                            	              		"TuplePartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTupleTypeCS4518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                          
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
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1817:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1818:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1819:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4556);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTuplePartCS4566); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1826:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1829:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1830:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1830:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1830:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1830:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1831:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1831:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1832:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4612);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTuplePartCS4624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1852:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1853:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1853:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1854:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4645);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_2_0, 
                      		"TypeExpCS");
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
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1878:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1879:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1880:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4681);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4691); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1887:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1890:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1891:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1891:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1891:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1891:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1892:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1892:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1893:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4737);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"CollectionTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionLiteralExpCS4749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1913:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_SIMPLE_ID && LA22_0<=RULE_SINGLE_QUOTED_STRING)||(LA22_0>=25 && LA22_0<=26)||LA22_0==28||(LA22_0>=33 && LA22_0<=36)||(LA22_0>=52 && LA22_0<=67)||LA22_0==70||(LA22_0>=72 && LA22_0<=75)||LA22_0==83||(LA22_0>=88 && LA22_0<=89)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1913:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1913:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1914:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1914:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1915:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4771);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_2_0, 
                              		"CollectionLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1931:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==29) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1931:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCollectionLiteralExpCS4784); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1935:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1936:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1936:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1937:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4805);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_4_0, 
                    	              		"CollectionLiteralPartCS");
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
                    break;

            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionLiteralExpCS4821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1965:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1966:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1967:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS4857);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS4867); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1974:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1977:28: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1978:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1978:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt24=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 25:
            case 26:
            case 28:
            case 33:
            case 34:
            case 35:
            case 36:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 70:
            case 72:
            case 73:
            case 74:
            case 75:
            case 83:
            case 88:
            case 89:
                {
                alt24=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==67) ) {
                    alt24=2;
                }
                else if ( (LA24_2==EOF||LA24_2==26||(LA24_2>=29 && LA24_2<=32)||LA24_2==34||(LA24_2>=36 && LA24_2<=51)||LA24_2==68||LA24_2==76||LA24_2==78||LA24_2==91) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==67) ) {
                    alt24=2;
                }
                else if ( (LA24_3==EOF||LA24_3==26||(LA24_3>=29 && LA24_3<=32)||LA24_3==34||(LA24_3>=36 && LA24_3<=51)||LA24_3==68||LA24_3==76||LA24_3==78||LA24_3==91) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt24=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1978:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1978:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1978:3: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1978:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1979:1: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1979:1: (lv_ownedExpression_0_0= ruleExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1980:3: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4914);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_0_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1996:2: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==68) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1996:4: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCollectionLiteralPartCS4927); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                                  
                            }
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2000:1: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2001:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2001:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2002:3: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4948);
                            lv_ownedLastExpression_2_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedLastExpression",
                                      		lv_ownedLastExpression_2_0, 
                                      		"ExpCS");
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
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2019:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2019:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2020:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2020:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2021:3: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionLiteralPartCS4978);
                    lv_ownedExpression_3_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_3_0, 
                              		"PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleCollectionPatternCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2045:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2046:2: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2047:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionPatternCS_in_entryRuleCollectionPatternCS5014);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionPatternCS5024); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionPatternCS"


    // $ANTLR start "ruleCollectionPatternCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2054:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        AntlrDatatypeRuleToken lv_restVariableName_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2057:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2058:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2058:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2058:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2058:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2059:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2059:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2060:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionPatternCS5070);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"CollectionTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionPatternCS5082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2080:1: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_SIMPLE_ID && LA26_0<=RULE_ESCAPED_ID)||LA26_0==67) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2080:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2080:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2081:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2081:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2082:3: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5104);
                    lv_ownedParts_2_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_2_0, 
                              		"PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2098:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==29) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2098:4: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCollectionPatternCS5117); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2102:1: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2103:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2103:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2104:3: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5138);
                    	    lv_ownedParts_4_0=rulePatternExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_4_0, 
                    	              		"PatternExpCS");
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

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2120:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2120:6: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleCollectionPatternCS5153); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2124:1: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2125:1: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2125:1: (lv_restVariableName_6_0= ruleIdentifier )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2126:3: lv_restVariableName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIdentifierParserRuleCall_2_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleCollectionPatternCS5174);
                    lv_restVariableName_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      	        }
                             		set(
                             			current, 
                             			"restVariableName",
                              		lv_restVariableName_6_0, 
                              		"Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionPatternCS5189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCollectionPatternCSAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleCollectionPatternCS"


    // $ANTLR start "entryRuleShadowPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2154:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2155:2: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2156:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_entryRuleShadowPartCS5225);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShadowPartCS5235); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShadowPartCS"


    // $ANTLR start "ruleShadowPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2163:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2166:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2167:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2167:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2167:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2167:2: ( ( ruleUnrestrictedName ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2168:1: ( ruleUnrestrictedName )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2168:1: ( ruleUnrestrictedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2169:3: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getShadowPartCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getReferredPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleShadowPartCS5287);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleShadowPartCS5299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2189:1: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2190:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2190:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2191:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2191:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            int alt27=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 25:
            case 26:
            case 28:
            case 33:
            case 34:
            case 35:
            case 36:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 70:
            case 72:
            case 73:
            case 74:
            case 75:
            case 83:
            case 88:
            case 89:
                {
                alt27=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==67) ) {
                    alt27=2;
                }
                else if ( (LA27_2==EOF||LA27_2==26||(LA27_2>=29 && LA27_2<=32)||LA27_2==34||(LA27_2>=36 && LA27_2<=51)||LA27_2==76||LA27_2==78||LA27_2==91) ) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==EOF||LA27_3==26||(LA27_3>=29 && LA27_3<=32)||LA27_3==34||(LA27_3>=36 && LA27_3<=51)||LA27_3==76||LA27_3==78||LA27_3==91) ) {
                    alt27=1;
                }
                else if ( (LA27_3==67) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2192:3: lv_ownedInitExpression_2_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleShadowPartCS5322);
                    lv_ownedInitExpression_2_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedInitExpression",
                              		lv_ownedInitExpression_2_1, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2207:8: lv_ownedInitExpression_2_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleShadowPartCS5341);
                    lv_ownedInitExpression_2_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedInitExpression",
                              		lv_ownedInitExpression_2_2, 
                              		"PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleShadowPartCS"


    // $ANTLR start "entryRulePatternExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2233:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2234:2: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2235:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_entryRulePatternExpCS5380);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePatternExpCS5390); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternExpCS"


    // $ANTLR start "rulePatternExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2242:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2245:28: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2246:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2246:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2246:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2246:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_SIMPLE_ID && LA28_0<=RULE_ESCAPED_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2247:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2247:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2248:3: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_rulePatternExpCS5436);
                    lv_patternVariableName_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"patternVariableName",
                              		lv_patternVariableName_0_0, 
                              		"UnrestrictedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePatternExpCS5449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2268:1: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2269:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2269:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2270:3: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_rulePatternExpCS5470);
            lv_ownedPatternType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPatternType",
                      		lv_ownedPatternType_2_0, 
                      		"TypeExpCS");
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
    // $ANTLR end "rulePatternExpCS"


    // $ANTLR start "entryRuleLambdaLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2294:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2295:2: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2296:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLambdaLiteralExpCS_in_entryRuleLambdaLiteralExpCS5506);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLambdaLiteralExpCS5516); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLambdaLiteralExpCS"


    // $ANTLR start "ruleLambdaLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2303:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2306:28: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2307:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2307:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2307:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleLambdaLiteralExpCS5553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLambdaLiteralExpCS5565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2315:1: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2316:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2316:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2317:3: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLambdaLiteralExpCS5586);
            lv_ownedExpressionCS_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLambdaLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedExpressionCS",
                      		lv_ownedExpressionCS_2_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLambdaLiteralExpCS5598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLambdaLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleLambdaLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2345:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2346:2: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2347:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_entryRuleMapLiteralExpCS5634);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapLiteralExpCS5644); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteralExpCS"


    // $ANTLR start "ruleMapLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2354:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2357:28: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2358:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2358:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2358:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2358:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2359:1: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2359:1: (lv_ownedType_0_0= ruleMapTypeCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2360:3: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_ruleMapLiteralExpCS5690);
            lv_ownedType_0_0=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"MapTypeCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMapLiteralExpCS5702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2380:1: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_SIMPLE_ID && LA30_0<=RULE_SINGLE_QUOTED_STRING)||(LA30_0>=25 && LA30_0<=26)||LA30_0==28||(LA30_0>=33 && LA30_0<=36)||(LA30_0>=52 && LA30_0<=66)||LA30_0==70||(LA30_0>=72 && LA30_0<=75)||LA30_0==83||(LA30_0>=88 && LA30_0<=89)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2380:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2380:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2381:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2381:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2382:3: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5724);
                    lv_ownedParts_2_0=ruleMapLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedParts",
                              		lv_ownedParts_2_0, 
                              		"MapLiteralPartCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2398:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==29) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2398:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMapLiteralExpCS5737); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2402:1: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2403:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2403:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2404:3: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5758);
                    	    lv_ownedParts_4_0=ruleMapLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedParts",
                    	              		lv_ownedParts_4_0, 
                    	              		"MapLiteralPartCS");
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
                    break;

            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMapLiteralExpCS5774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMapLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleMapLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2432:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2433:2: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2434:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_entryRuleMapLiteralPartCS5810);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapLiteralPartCS5820); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteralPartCS"


    // $ANTLR start "ruleMapLiteralPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2441:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2444:28: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2445:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2445:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2445:2: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2445:2: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2446:1: (lv_ownedKey_0_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2446:1: (lv_ownedKey_0_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2447:3: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5866);
            lv_ownedKey_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedKey",
                      		lv_ownedKey_0_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleMapLiteralPartCS5878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2467:1: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2468:1: (lv_ownedValue_2_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2468:1: (lv_ownedValue_2_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2469:3: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5899);
            lv_ownedValue_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_2_0, 
                      		"ExpCS");
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
    // $ANTLR end "ruleMapLiteralPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2493:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2494:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2495:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS5935);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS5945); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2502:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2505:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2506:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2506:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt31=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt31=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt31=2;
                }
                break;
            case 72:
            case 73:
                {
                alt31=3;
                }
                break;
            case 36:
                {
                alt31=4;
                }
                break;
            case 74:
                {
                alt31=5;
                }
                break;
            case 75:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2507:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS5995);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteralExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2520:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS6025);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteralExpCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2533:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS6055);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteralExpCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2546:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS6085);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnlimitedNaturalLiteralExpCS_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2559:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS6115);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvalidLiteralExpCS_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2572:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS6145);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteralExpCS_5; 
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
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2591:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2592:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2593:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS6180);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS6190); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2600:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2603:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2604:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2604:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2604:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTupleLiteralExpCS6227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTupleLiteralExpCS6239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2612:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2613:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2613:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2614:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6260);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedParts",
                      		lv_ownedParts_2_0, 
                      		"TupleLiteralPartCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2630:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2630:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTupleLiteralExpCS6273); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2634:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2635:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2635:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2636:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6294);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedParts",
            	              		lv_ownedParts_4_0, 
            	              		"TupleLiteralPartCS");
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

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTupleLiteralExpCS6308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2664:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2665:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2666:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS6344);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS6354); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2673:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2676:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2677:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2677:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2677:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2677:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2678:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2678:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2679:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS6400);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2695:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==67) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2695:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTupleLiteralPartCS6413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2699:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2700:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2700:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2701:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS6434);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_2_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTupleLiteralPartCS6448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2721:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2722:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2722:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2723:3: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS6469);
            lv_ownedInitExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedInitExpression",
                      		lv_ownedInitExpression_4_0, 
                      		"ExpCS");
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
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2747:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2748:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2749:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS6505);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS6515); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2756:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2759:28: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2760:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2760:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2761:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2761:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2762:3: lv_symbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS6560);
            lv_symbol_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"symbol",
                      		lv_symbol_0_0, 
                      		"NUMBER_LITERAL");
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
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2786:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2787:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2788:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS6595);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS6605); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2795:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2798:28: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2799:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2799:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2800:1: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2800:1: (lv_segments_0_0= ruleStringLiteral )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2801:3: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS6650);
            	    lv_segments_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"segments",
            	              		lv_segments_0_0, 
            	              		"StringLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


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
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2825:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2826:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2827:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS6686);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS6696); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2834:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2837:28: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2838:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2838:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==72) ) {
                alt35=1;
            }
            else if ( (LA35_0==73) ) {
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
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2838:2: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2838:2: ( (lv_symbol_0_0= 'true' ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2839:1: (lv_symbol_0_0= 'true' )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2839:1: (lv_symbol_0_0= 'true' )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2840:3: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleBooleanLiteralExpCS6739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_symbol_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolTrueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "symbol", lv_symbol_0_0, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2854:6: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2854:6: ( (lv_symbol_1_0= 'false' ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2855:1: (lv_symbol_1_0= 'false' )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2855:1: (lv_symbol_1_0= 'false' )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2856:3: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleBooleanLiteralExpCS6776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_symbol_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolFalseKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "symbol", lv_symbol_1_0, "false");
                      	    
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
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2877:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2878:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2879:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS6825);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS6835); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2886:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2889:28: ( ( () otherlv_1= '*' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2890:1: ( () otherlv_1= '*' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2890:1: ( () otherlv_1= '*' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2890:2: () otherlv_1= '*'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2890:2: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2891:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUnlimitedNaturalLiteralExpCS6884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
                  
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
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2911:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2912:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2913:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS6920);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS6930); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2920:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2923:28: ( ( () otherlv_1= 'invalid' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2924:1: ( () otherlv_1= 'invalid' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2924:1: ( () otherlv_1= 'invalid' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2924:2: () otherlv_1= 'invalid'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2924:2: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2925:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleInvalidLiteralExpCS6979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
                  
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
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2945:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2946:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2947:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS7015);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS7025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2954:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2957:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2958:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2958:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2958:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2958:2: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2959:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleNullLiteralExpCS7074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
                  
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
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralWithMultiplicityCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2979:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2980:2: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2981:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS7110);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS7120); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "ruleTypeLiteralWithMultiplicityCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2988:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2991:28: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2992:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2992:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2993:2: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS7170);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypeLiteralCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3004:1: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==78) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3005:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3005:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3006:3: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS7190);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeLiteralWithMultiplicityCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedMultiplicity",
                              		lv_ownedMultiplicity_1_0, 
                              		"MultiplicityCS");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3030:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3031:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3032:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS7227);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS7237); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3039:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3042:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3043:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3043:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3044:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3044:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3045:3: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS7282);
            lv_ownedType_0_0=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedType",
                      		lv_ownedType_0_0, 
                      		"TypeLiteralWithMultiplicityCS");
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
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3069:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3070:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3071:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS7317);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS7327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3078:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3081:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3082:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3082:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3082:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3082:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3083:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3083:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3084:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS7373);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPathName",
                      		lv_ownedPathName_0_0, 
                      		"PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3100:2: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3100:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3100:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3101:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3101:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3102:3: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_ruleTypeNameExpCS7395);
                    lv_ownedCurlyBracketedClause_1_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedCurlyBracketedClause",
                              		lv_ownedCurlyBracketedClause_1_0, 
                              		"CurlyBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3118:2: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==30) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3118:4: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTypeNameExpCS7408); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                                  
                            }
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3122:1: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3123:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3123:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3124:3: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTypeNameExpCS7429);
                            lv_ownedPatternGuard_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedPatternGuard",
                                      		lv_ownedPatternGuard_3_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTypeNameExpCS7441); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getTypeNameExpCSAccess().getRightCurlyBracketKeyword_1_1_2());
                                  
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
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3152:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3153:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3154:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS7481);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS7491); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3161:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;

        EObject lv_ownedMultiplicity_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3164:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3165:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3165:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3165:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3165:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt39=3;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3166:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS7542);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeNameExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3179:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS7572);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeLiteralCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3192:2: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getCollectionPatternCSParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionPatternCS_in_ruleTypeExpCS7602);
                    this_CollectionPatternCS_2=ruleCollectionPatternCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CollectionPatternCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3203:2: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==78) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3204:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3204:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3205:3: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS7623);
                    lv_ownedMultiplicity_3_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedMultiplicity",
                              		lv_ownedMultiplicity_3_0, 
                              		"MultiplicityCS");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3229:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3230:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3231:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS7660);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS7670); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3238:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3241:28: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3242:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3242:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3242:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3242:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3243:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_ruleExpCS7721);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedPrimaryExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt41=2;
                    alt41 = dfa41.predict(input);
                    switch (alt41) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:2: ()
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3255:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3263:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3264:1: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3264:1: (lv_name_2_0= ruleBinaryOperatorName )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3265:3: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_ruleExpCS7754);
                            lv_name_2_0=ruleBinaryOperatorName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_2_0, 
                                      		"BinaryOperatorName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3281:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3282:1: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3282:1: (lv_ownedRight_3_0= ruleExpCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3283:3: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleExpCS7775);
                            lv_ownedRight_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedRight",
                                      		lv_ownedRight_3_0, 
                                      		"ExpCS");
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
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3301:2: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_ruleExpCS7809);
                    this_PrefixedLetExpCS_4=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedLetExpCS_4; 
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
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRulePrefixedLetExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3320:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3321:2: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3322:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_entryRulePrefixedLetExpCS7844);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedLetExpCS7854); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedLetExpCS"


    // $ANTLR start "rulePrefixedLetExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3329:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3332:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3333:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3333:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=34 && LA43_0<=35)) ) {
                alt43=1;
            }
            else if ( (LA43_0==88) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3333:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3333:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3333:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3333:3: ()
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3334:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedLetExpCSAccess().getPrefixExpCSAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3342:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3343:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3343:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3344:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_rulePrefixedLetExpCS7913);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"UnaryOperatorName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3360:2: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3361:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3361:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3362:3: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_rulePrefixedLetExpCS7934);
                    lv_ownedRight_2_0=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedRight",
                              		lv_ownedRight_2_0, 
                              		"PrefixedLetExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3380:2: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_rulePrefixedLetExpCS7966);
                    this_LetExpCS_3=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExpCS_3; 
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
    // $ANTLR end "rulePrefixedLetExpCS"


    // $ANTLR start "entryRulePrefixedPrimaryExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3399:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3400:2: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3401:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_entryRulePrefixedPrimaryExpCS8001);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedPrimaryExpCS8011); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedPrimaryExpCS"


    // $ANTLR start "rulePrefixedPrimaryExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3408:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3411:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3412:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3412:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=34 && LA44_0<=35)) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_SIMPLE_ID && LA44_0<=RULE_SINGLE_QUOTED_STRING)||(LA44_0>=25 && LA44_0<=26)||LA44_0==28||LA44_0==33||LA44_0==36||(LA44_0>=52 && LA44_0<=66)||LA44_0==70||(LA44_0>=72 && LA44_0<=75)||LA44_0==83||LA44_0==89) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3412:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3412:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3412:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3412:3: ()
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3413:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrefixedPrimaryExpCSAccess().getPrefixExpCSAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3421:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3422:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3422:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3423:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_rulePrefixedPrimaryExpCS8070);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"UnaryOperatorName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3439:2: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3440:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3440:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3441:3: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_rulePrefixedPrimaryExpCS8091);
                    lv_ownedRight_2_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedRight",
                              		lv_ownedRight_2_0, 
                              		"PrefixedPrimaryExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3459:2: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedPrimaryExpCS8123);
                    this_PrimaryExpCS_3=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimaryExpCS_3; 
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
    // $ANTLR end "rulePrefixedPrimaryExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3478:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3479:2: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3480:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS8158);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameExpCS8168); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3487:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_isPre_4_0=null;
        Token otherlv_5=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedSquareBracketedClauses_1_0 = null;

        EObject lv_ownedRoundBracketedClause_2_0 = null;

        EObject lv_ownedCurlyBracketedClause_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3490:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3491:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3491:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3491:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3491:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3492:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3492:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3493:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleNameExpCS8214);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPathName",
                      		lv_ownedPathName_0_0, 
                      		"PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3509:2: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==78) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3510:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3510:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3511:3: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSquareBracketedClauseCS_in_ruleNameExpCS8235);
            	    lv_ownedSquareBracketedClauses_1_0=ruleSquareBracketedClauseCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNameExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSquareBracketedClauses",
            	              		lv_ownedSquareBracketedClauses_1_0, 
            	              		"SquareBracketedClauseCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3527:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3528:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3528:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3529:3: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_ruleNameExpCS8257);
                    lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedRoundBracketedClause",
                              		lv_ownedRoundBracketedClause_2_0, 
                              		"RoundBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3545:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3546:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3546:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3547:3: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_ruleNameExpCS8279);
                    lv_ownedCurlyBracketedClause_3_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedCurlyBracketedClause",
                              		lv_ownedCurlyBracketedClause_3_0, 
                              		"CurlyBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3563:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==76) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3563:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3563:4: ( (lv_isPre_4_0= '@' ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3564:1: (lv_isPre_4_0= '@' )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3564:1: (lv_isPre_4_0= '@' )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3565:3: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleNameExpCS8299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isPre_4_0, grammarAccess.getNameExpCSAccess().getIsPreCommercialAtKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNameExpCSRule());
                      	        }
                             		setWithLastConsumed(current, "isPre", true, "@");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleNameExpCS8324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getNameExpCSAccess().getPreKeyword_4_1());
                          
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
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleCurlyBracketedClauseCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3590:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3591:2: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3592:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_entryRuleCurlyBracketedClauseCS8362);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCurlyBracketedClauseCS8372); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCurlyBracketedClauseCS"


    // $ANTLR start "ruleCurlyBracketedClauseCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3599:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3602:28: ( ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3603:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3603:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3603:2: () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3603:2: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3604:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCurlyBracketedClauseCSAccess().getCurlyBracketedClauseCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCurlyBracketedClauseCS8421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3616:1: ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_SIMPLE_ID && LA51_0<=RULE_ESCAPED_ID)||LA51_0==31) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3616:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3616:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=RULE_SIMPLE_ID && LA50_0<=RULE_ESCAPED_ID)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3616:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3616:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3617:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3617:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3618:3: lv_ownedParts_2_0= ruleShadowPartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8444);
                            lv_ownedParts_2_0=ruleShadowPartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedParts",
                                      		lv_ownedParts_2_0, 
                                      		"ShadowPartCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3634:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==29) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3634:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCurlyBracketedClauseCS8457); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3638:1: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3639:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    {
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3639:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3640:3: lv_ownedParts_4_0= ruleShadowPartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8478);
                            	    lv_ownedParts_4_0=ruleShadowPartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedParts",
                            	              		lv_ownedParts_4_0, 
                            	              		"ShadowPartCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop49;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3657:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3657:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3658:1: (lv_value_5_0= ruleStringLiteral )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3658:1: (lv_value_5_0= ruleStringLiteral )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3659:3: lv_value_5_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getValueStringLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleCurlyBracketedClauseCS8509);
                    lv_value_5_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"StringLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCurlyBracketedClauseCS8522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCurlyBracketedClauseCSAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleCurlyBracketedClauseCS"


    // $ANTLR start "entryRuleRoundBracketedClauseCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3687:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3688:2: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3689:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_entryRuleRoundBracketedClauseCS8558);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoundBracketedClauseCS8568); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRoundBracketedClauseCS"


    // $ANTLR start "ruleRoundBracketedClauseCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3696:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) ;
    public final EObject ruleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_8=null;
        EObject lv_ownedArguments_2_0 = null;

        EObject lv_ownedArguments_3_0 = null;

        EObject lv_ownedArguments_4_0 = null;

        EObject lv_ownedArguments_5_0 = null;

        EObject lv_ownedArguments_6_0 = null;

        EObject lv_ownedArguments_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3699:28: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3700:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3700:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3700:2: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3700:2: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3701:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRoundBracketedClauseCSAccess().getRoundBracketedClauseCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRoundBracketedClauseCS8617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3713:1: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_SIMPLE_ID && LA57_0<=RULE_SINGLE_QUOTED_STRING)||(LA57_0>=25 && LA57_0<=26)||LA57_0==28||(LA57_0>=33 && LA57_0<=36)||(LA57_0>=52 && LA57_0<=67)||LA57_0==70||(LA57_0>=72 && LA57_0<=75)||LA57_0==83||(LA57_0>=88 && LA57_0<=89)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3713:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3713:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3714:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3714:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3715:3: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_ruleRoundBracketedClauseCS8639);
                    lv_ownedArguments_2_0=ruleNavigatingArgCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedArguments",
                              		lv_ownedArguments_2_0, 
                              		"NavigatingArgCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3731:2: ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==29) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3732:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3732:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3733:3: lv_ownedArguments_3_0= ruleNavigatingCommaArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8660);
                    	    lv_ownedArguments_3_0=ruleNavigatingCommaArgCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedArguments",
                    	              		lv_ownedArguments_3_0, 
                    	              		"NavigatingCommaArgCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3749:3: ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==82) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3749:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3749:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3750:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3750:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3751:3: lv_ownedArguments_4_0= ruleNavigatingSemiArgCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_ruleRoundBracketedClauseCS8683);
                            lv_ownedArguments_4_0=ruleNavigatingSemiArgCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"ownedArguments",
                                      		lv_ownedArguments_4_0, 
                                      		"NavigatingSemiArgCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3767:2: ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==29) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3768:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3768:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3769:3: lv_ownedArguments_5_0= ruleNavigatingCommaArgCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8704);
                            	    lv_ownedArguments_5_0=ruleNavigatingCommaArgCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"ownedArguments",
                            	              		lv_ownedArguments_5_0, 
                            	              		"NavigatingCommaArgCS");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3785:5: ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==81) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3785:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3785:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3786:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3786:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3787:3: lv_ownedArguments_6_0= ruleNavigatingBarArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_3_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_ruleRoundBracketedClauseCS8729);
                    	    lv_ownedArguments_6_0=ruleNavigatingBarArgCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedArguments",
                    	              		lv_ownedArguments_6_0, 
                    	              		"NavigatingBarArgCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3803:2: ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    loop55:
                    	    do {
                    	        int alt55=2;
                    	        int LA55_0 = input.LA(1);

                    	        if ( (LA55_0==29) ) {
                    	            alt55=1;
                    	        }


                    	        switch (alt55) {
                    	    	case 1 :
                    	    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3804:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    {
                    	    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3804:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3805:3: lv_ownedArguments_7_0= ruleNavigatingCommaArgCS
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_3_1_0()); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8750);
                    	    	    lv_ownedArguments_7_0=ruleNavigatingCommaArgCS();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	    	      	        }
                    	    	             		add(
                    	    	             			current, 
                    	    	             			"ownedArguments",
                    	    	              		lv_ownedArguments_7_0, 
                    	    	              		"NavigatingCommaArgCS");
                    	    	      	        afterParserOrEnumRuleCall();
                    	    	      	    
                    	    	    }

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop55;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRoundBracketedClauseCS8767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRoundBracketedClauseCSAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleRoundBracketedClauseCS"


    // $ANTLR start "entryRuleSquareBracketedClauseCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3833:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3834:2: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3835:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSquareBracketedClauseCS_in_entryRuleSquareBracketedClauseCS8803);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSquareBracketedClauseCS8813); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSquareBracketedClauseCS"


    // $ANTLR start "ruleSquareBracketedClauseCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3842:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3845:28: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3846:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3846:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3846:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleSquareBracketedClauseCS8850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3850:1: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3851:1: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3851:1: (lv_ownedTerms_1_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3852:3: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS8871);
            lv_ownedTerms_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedTerms",
                      		lv_ownedTerms_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3868:2: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==29) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3868:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSquareBracketedClauseCS8884); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3872:1: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3873:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3873:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3874:3: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS8905);
            	    lv_ownedTerms_3_0=ruleExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedTerms",
            	              		lv_ownedTerms_3_0, 
            	              		"ExpCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_4=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleSquareBracketedClauseCS8919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSquareBracketedClauseCSAccess().getRightSquareBracketKeyword_3());
                  
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
    // $ANTLR end "ruleSquareBracketedClauseCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3902:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3903:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3904:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS8955);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS8965); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3911:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedNameExpression_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;

        EObject lv_ownedInitExpression_6_0 = null;

        EObject lv_ownedType_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3914:28: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3915:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3915:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_SIMPLE_ID && LA61_0<=RULE_SINGLE_QUOTED_STRING)||(LA61_0>=25 && LA61_0<=26)||LA61_0==28||(LA61_0>=33 && LA61_0<=36)||(LA61_0>=52 && LA61_0<=66)||LA61_0==70||(LA61_0>=72 && LA61_0<=75)||LA61_0==83||(LA61_0>=88 && LA61_0<=89)) ) {
                alt61=1;
            }
            else if ( (LA61_0==67) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3915:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3915:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3915:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3915:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3916:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3916:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3917:3: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS9012);
                    lv_ownedNameExpression_0_0=ruleNavigatingArgExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedNameExpression",
                              		lv_ownedNameExpression_0_0, 
                              		"NavigatingArgExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3933:2: ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    int alt60=3;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==67) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==80) ) {
                        alt60=2;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3933:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3933:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3933:5: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingArgCS9026); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_0_0());
                                  
                            }
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3937:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3938:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3938:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3939:3: lv_ownedType_2_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9047);
                            lv_ownedType_2_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedType",
                                      		lv_ownedType_2_0, 
                                      		"TypeExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3955:2: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==32) ) {
                                alt59=1;
                            }
                            switch (alt59) {
                                case 1 :
                                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3955:4: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingArgCS9060); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                          
                                    }
                                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3959:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3960:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3960:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3961:3: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9081);
                                    lv_ownedInitExpression_4_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"ownedInitExpression",
                                              		lv_ownedInitExpression_4_0, 
                                              		"ExpCS");
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
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3978:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3978:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3978:8: otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            {
                            otherlv_5=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleNavigatingArgCS9103); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_1_0());
                                  
                            }
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3982:1: ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3983:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3983:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3984:3: lv_ownedInitExpression_6_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9124);
                            lv_ownedInitExpression_6_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedInitExpression",
                                      		lv_ownedInitExpression_6_0, 
                                      		"ExpCS");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

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
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4001:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4001:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4001:8: otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    {
                    otherlv_7=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingArgCS9147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4005:1: ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4006:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4006:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4007:3: lv_ownedType_8_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9168);
                    lv_ownedType_8_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_8_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4031:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4032:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4033:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS9205);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS9215); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4040:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4043:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4044:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4044:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4044:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4044:2: ( (lv_prefix_0_0= '|' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4045:1: (lv_prefix_0_0= '|' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4045:1: (lv_prefix_0_0= '|' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4046:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleNavigatingBarArgCS9258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4059:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4060:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4060:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4061:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS9292);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedNameExpression",
                      		lv_ownedNameExpression_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4077:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==67) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4077:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingBarArgCS9305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4081:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4082:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4082:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4083:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS9326);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4099:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==32) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4099:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingBarArgCS9339); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4103:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4104:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4104:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4105:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS9360);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedInitExpression",
                                      		lv_ownedInitExpression_5_0, 
                                      		"ExpCS");
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
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4129:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4130:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4131:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS9400);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS9410); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4138:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;

        EObject lv_ownedInitExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4141:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4142:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4142:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4142:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4142:2: ( (lv_prefix_0_0= ',' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4143:1: (lv_prefix_0_0= ',' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4143:1: (lv_prefix_0_0= ',' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4144:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNavigatingCommaArgCS9453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4157:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4158:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4158:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4159:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS9487);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedNameExpression",
                      		lv_ownedNameExpression_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4175:2: ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==67) ) {
                alt65=1;
            }
            else if ( (LA65_0==80) ) {
                alt65=2;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4175:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4175:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4175:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingCommaArgCS9501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4179:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4180:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4180:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4181:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS9522);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4197:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==32) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4197:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingCommaArgCS9535); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                                  
                            }
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4201:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4202:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4202:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4203:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9556);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedInitExpression",
                                      		lv_ownedInitExpression_5_0, 
                                      		"ExpCS");
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
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4220:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4220:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4220:8: otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    {
                    otherlv_6=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleNavigatingCommaArgCS9578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_1_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4224:1: ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4225:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4225:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4226:3: lv_ownedInitExpression_7_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9599);
                    lv_ownedInitExpression_7_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedInitExpression",
                              		lv_ownedInitExpression_7_0, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4250:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4251:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4252:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS9638);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS9648); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4259:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4262:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4263:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4263:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4263:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4263:2: ( (lv_prefix_0_0= ';' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4264:1: (lv_prefix_0_0= ';' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4264:1: (lv_prefix_0_0= ';' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4265:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleNavigatingSemiArgCS9691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              	        }
                     		setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4278:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4279:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4279:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4280:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS9725);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedNameExpression",
                      		lv_ownedNameExpression_1_0, 
                      		"NavigatingArgExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4296:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==67) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4296:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingSemiArgCS9738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4300:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4301:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4301:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4302:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS9759);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4318:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==32) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4318:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingSemiArgCS9772); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4322:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4323:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4323:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4324:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS9793);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedInitExpression",
                                      		lv_ownedInitExpression_5_0, 
                                      		"ExpCS");
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
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4348:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4349:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4350:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS9833);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS9843); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4357:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4360:28: (this_ExpCS_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4362:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS9892);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ExpCS_0; 
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
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleIfExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4381:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4382:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4383:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS9926);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS9936); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4390:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedCondition_1_1 = null;

        EObject lv_ownedCondition_1_2 = null;

        EObject lv_ownedThenExpression_3_0 = null;

        EObject lv_ownedIfThenExpressions_4_0 = null;

        EObject lv_ownedElseExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4393:28: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4394:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4394:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4394:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleIfExpCS9973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4398:1: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4399:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4399:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4400:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4400:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt68=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 25:
            case 26:
            case 28:
            case 33:
            case 34:
            case 35:
            case 36:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 70:
            case 72:
            case 73:
            case 74:
            case 75:
            case 83:
            case 88:
            case 89:
                {
                alt68=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA68_2 = input.LA(2);

                if ( (LA68_2==67) ) {
                    alt68=2;
                }
                else if ( (LA68_2==26||LA68_2==30||LA68_2==32||LA68_2==34||(LA68_2>=36 && LA68_2<=51)||LA68_2==76||LA68_2==78||LA68_2==84||LA68_2==91) ) {
                    alt68=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA68_3 = input.LA(2);

                if ( (LA68_3==26||LA68_3==30||LA68_3==32||LA68_3==34||(LA68_3>=36 && LA68_3<=51)||LA68_3==76||LA68_3==78||LA68_3==84||LA68_3==91) ) {
                    alt68=1;
                }
                else if ( (LA68_3==67) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt68=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4401:3: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS9996);
                    lv_ownedCondition_1_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedCondition",
                              		lv_ownedCondition_1_1, 
                              		"ExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4416:8: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleIfExpCS10015);
                    lv_ownedCondition_1_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedCondition",
                              		lv_ownedCondition_1_2, 
                              		"PatternExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleIfExpCS10030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4438:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4439:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4439:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4440:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10051);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedThenExpression",
                      		lv_ownedThenExpression_3_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4456:2: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==87) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4457:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4457:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4458:3: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElseIfThenExpCS_in_ruleIfExpCS10072);
            	    lv_ownedIfThenExpressions_4_0=ruleElseIfThenExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedIfThenExpressions",
            	              		lv_ownedIfThenExpressions_4_0, 
            	              		"ElseIfThenExpCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_5=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleIfExpCS10085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4478:1: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4479:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4479:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4480:3: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10106);
            lv_ownedElseExpression_6_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedElseExpression",
                      		lv_ownedElseExpression_6_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleIfExpCS10118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIfExpCSAccess().getEndifKeyword_7());
                  
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
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleElseIfThenExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4508:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4509:2: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4510:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElseIfThenExpCS_in_entryRuleElseIfThenExpCS10154);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElseIfThenExpCS10164); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseIfThenExpCS"


    // $ANTLR start "ruleElseIfThenExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4517:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4520:28: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4521:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4521:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4521:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleElseIfThenExpCS10201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4525:1: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4526:1: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4526:1: (lv_ownedCondition_1_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4527:3: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10222);
            lv_ownedCondition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedCondition",
                      		lv_ownedCondition_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleElseIfThenExpCS10234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4547:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4548:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4548:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4549:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10255);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedThenExpression",
                      		lv_ownedThenExpression_3_0, 
                      		"ExpCS");
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
    // $ANTLR end "ruleElseIfThenExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4573:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4574:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4575:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS10291);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS10301); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4582:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedVariables_1_0 = null;

        EObject lv_ownedVariables_3_0 = null;

        EObject lv_ownedInExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4585:28: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4586:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4586:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4586:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleLetExpCS10338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4590:1: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4591:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4591:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4592:3: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10359);
            lv_ownedVariables_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedVariables",
                      		lv_ownedVariables_1_0, 
                      		"LetVariableCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4608:2: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==29) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4608:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLetExpCS10372); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4612:1: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4613:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4613:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4614:3: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10393);
            	    lv_ownedVariables_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedVariables",
            	              		lv_ownedVariables_3_0, 
            	              		"LetVariableCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_4=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleLetExpCS10407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4634:1: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4635:1: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4635:1: (lv_ownedInExpression_5_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4636:3: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS10428);
            lv_ownedInExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedInExpression",
                      		lv_ownedInExpression_5_0, 
                      		"ExpCS");
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
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4660:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4661:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4662:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS10464);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS10474); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4669:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRoundBracketedClause_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4672:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4673:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4673:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4673:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4673:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4674:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4674:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4675:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS10520);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4691:2: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==26) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4692:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4692:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4693:3: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_ruleLetVariableCS10541);
                    lv_ownedRoundBracketedClause_1_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedRoundBracketedClause",
                              		lv_ownedRoundBracketedClause_1_0, 
                              		"RoundBracketedClauseCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4709:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==67) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4709:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleLetVariableCS10555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4713:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4714:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4714:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4715:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS10576);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedType",
                              		lv_ownedType_3_0, 
                              		"TypeExpCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLetVariableCS10590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4735:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4736:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4736:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4737:3: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS10611);
            lv_ownedInitExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedInitExpression",
                      		lv_ownedInitExpression_5_0, 
                      		"ExpCS");
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
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4761:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4762:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4763:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS10647);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS10657); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4770:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4773:28: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4774:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4774:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4774:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNestedExpCS10694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4778:1: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4779:1: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4779:1: (lv_ownedExpression_1_0= ruleExpCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4780:3: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS10715);
            lv_ownedExpression_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedExpression",
                      		lv_ownedExpression_1_0, 
                      		"ExpCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleNestedExpCS10727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4808:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4809:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4810:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS10763);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS10773); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4817:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4820:28: ( ( () otherlv_1= 'self' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4821:1: ( () otherlv_1= 'self' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4821:1: ( () otherlv_1= 'self' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4821:2: () otherlv_1= 'self'
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4821:2: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4822:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleSelfExpCS10822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSelfExpCSAccess().getSelfKeyword_1());
                  
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
    // $ANTLR end "ruleSelfExpCS"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4842:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4843:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4844:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS10858);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS10868); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4851:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4854:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4855:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4855:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4855:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4855:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4856:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4856:1: (lv_lowerBound_0_0= ruleLOWER )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4857:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS10914);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_0_0, 
                      		"LOWER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4873:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==68) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4873:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleMultiplicityBoundsCS10927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4877:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4878:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4878:1: (lv_upperBound_2_0= ruleUPPER )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4879:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS10948);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_0, 
                              		"UPPER");
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
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4903:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4904:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4905:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS10986);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityCS10996); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4912:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4915:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4916:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4916:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4916:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleMultiplicityCS11033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4920:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_INT) ) {
                alt74=1;
            }
            else if ( (LA74_0==36||LA74_0==38||LA74_0==90) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4921:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS11059);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiplicityBoundsCS_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4934:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS11089);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiplicityStringCS_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleMultiplicityCS11101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_2());
                  
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
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4957:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4958:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4959:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS11137);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityStringCS11147); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4966:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4969:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4970:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4970:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4971:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4971:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4972:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4972:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt75=1;
                }
                break;
            case 38:
                {
                alt75=2;
                }
                break;
            case 90:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4973:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultiplicityStringCS11191); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4985:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMultiplicityStringCS11220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4997:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleMultiplicityStringCS11249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      	        }
                             		setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRulePathNameCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5020:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5021:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5022:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_entryRulePathNameCS11300);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathNameCS11310); if (state.failed) return current;

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
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5029:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5032:28: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5033:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5033:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5033:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5033:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5034:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5034:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5035:3: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS11356);
            lv_ownedPathElements_0_0=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedPathElements",
                      		lv_ownedPathElements_0_0, 
                      		"FirstPathElementCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5051:2: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==91) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5051:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,91,FollowSets000.FOLLOW_91_in_rulePathNameCS11369); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5055:1: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5056:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5056:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5057:3: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_rulePathNameCS11390);
            	    lv_ownedPathElements_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPathElements",
            	              		lv_ownedPathElements_2_0, 
            	              		"NextPathElementCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleFirstPathElementCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5081:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5082:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5083:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS11428);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFirstPathElementCS11438); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFirstPathElementCS"


    // $ANTLR start "ruleFirstPathElementCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5090:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5093:28: ( ( ( ruleUnrestrictedName ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5094:1: ( ( ruleUnrestrictedName ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5094:1: ( ( ruleUnrestrictedName ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5095:1: ( ruleUnrestrictedName )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5095:1: ( ruleUnrestrictedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5096:3: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFirstPathElementCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS11489);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleFirstPathElementCS"


    // $ANTLR start "entryRuleNextPathElementCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5120:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5121:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5122:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS11524);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextPathElementCS11534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNextPathElementCS"


    // $ANTLR start "ruleNextPathElementCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5129:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5132:28: ( ( ( ruleUnreservedName ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5133:1: ( ( ruleUnreservedName ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5133:1: ( ( ruleUnreservedName ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5134:1: ( ruleUnreservedName )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5134:1: ( ruleUnreservedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5135:3: ruleUnreservedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNextPathElementCSRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNextPathElementCSAccess().getReferredElementNamedElementCrossReference_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS11585);
            ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleNextPathElementCS"


    // $ANTLR start "entryRuleTemplateBindingCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5159:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5160:2: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5161:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateBindingCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateBindingCS_in_entryRuleTemplateBindingCS11620);
            iv_ruleTemplateBindingCS=ruleTemplateBindingCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateBindingCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateBindingCS11630); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateBindingCS"


    // $ANTLR start "ruleTemplateBindingCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5168:1: ruleTemplateBindingCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedSubstitutions_1_0 = null;

        EObject lv_ownedSubstitutions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5171:28: ( (otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5172:1: (otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5172:1: (otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')' )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5172:3: otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTemplateBindingCS11667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateBindingCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5176:1: ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5177:1: (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5177:1: (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5178:3: lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11688);
            lv_ownedSubstitutions_1_0=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
              	        }
                     		add(
                     			current, 
                     			"ownedSubstitutions",
                      		lv_ownedSubstitutions_1_0, 
                      		"TemplateParameterSubstitutionCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5194:2: (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==29) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5194:4: otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTemplateBindingCS11701); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5198:1: ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5199:1: (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5199:1: (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS )
            	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5200:3: lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11722);
            	    lv_ownedSubstitutions_3_0=ruleTemplateParameterSubstitutionCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedSubstitutions",
            	              		lv_ownedSubstitutions_3_0, 
            	              		"TemplateParameterSubstitutionCS");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTemplateBindingCS11736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTemplateBindingCSAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleTemplateBindingCS"


    // $ANTLR start "entryRuleTemplateParameterSubstitutionCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5228:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5229:2: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5230:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_entryRuleTemplateParameterSubstitutionCS11772);
            iv_ruleTemplateParameterSubstitutionCS=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterSubstitutionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateParameterSubstitutionCS11782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateParameterSubstitutionCS"


    // $ANTLR start "ruleTemplateParameterSubstitutionCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5237:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5240:28: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5241:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5241:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5242:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5242:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5243:3: lv_ownedActualParameter_0_0= ruleTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSAccess().getOwnedActualParameterTypeRefCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeRefCS_in_ruleTemplateParameterSubstitutionCS11827);
            lv_ownedActualParameter_0_0=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemplateParameterSubstitutionCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedActualParameter",
                      		lv_ownedActualParameter_0_0, 
                      		"TypeRefCS");
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
    // $ANTLR end "ruleTemplateParameterSubstitutionCS"


    // $ANTLR start "entryRuleTypeParameterCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5269:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5270:2: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5271:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeParameterCS_in_entryRuleTypeParameterCS11864);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeParameterCS11874); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeParameterCS"


    // $ANTLR start "ruleTypeParameterCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5278:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5281:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5282:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5282:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5282:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5282:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5283:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5283:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5284:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeParameterCS11920);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"UnrestrictedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5300:2: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==92) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5300:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleTypeParameterCS11933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5304:1: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5305:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5305:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5306:3: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS11954);
                    lv_ownedExtends_2_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedExtends",
                              		lv_ownedExtends_2_0, 
                              		"TypedRefCS");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5322:2: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==93) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5322:4: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleTypeParameterCS11967); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5326:1: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5327:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5327:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5328:3: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS11988);
                    	    lv_ownedExtends_4_0=ruleTypedRefCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedExtends",
                    	              		lv_ownedExtends_4_0, 
                    	              		"TypedRefCS");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTypeParameterCS"


    // $ANTLR start "entryRuleTypeRefCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5352:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5353:2: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5354:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeRefCS_in_entryRuleTypeRefCS12028);
            iv_ruleTypeRefCS=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRefCS12038); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeRefCS"


    // $ANTLR start "ruleTypeRefCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5361:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5364:28: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5365:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5365:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_SIMPLE_ID && LA80_0<=RULE_ESCAPED_ID)) ) {
                alt80=1;
            }
            else if ( (LA80_0==90) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5366:2: this_TypedRefCS_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getTypedRefCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeRefCS12088);
                    this_TypedRefCS_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedRefCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5379:2: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleWildcardTypeRefCS_in_ruleTypeRefCS12118);
                    this_WildcardTypeRefCS_1=ruleWildcardTypeRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WildcardTypeRefCS_1; 
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
    // $ANTLR end "ruleTypeRefCS"


    // $ANTLR start "entryRuleTypedRefCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5398:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5399:2: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5400:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_entryRuleTypedRefCS12153);
            iv_ruleTypedRefCS=ruleTypedRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedRefCS12163); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedRefCS"


    // $ANTLR start "ruleTypedRefCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5407:1: ruleTypedRefCS returns [EObject current=null] : this_TypedTypeRefCS_0= ruleTypedTypeRefCS ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTypeRefCS_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5410:28: (this_TypedTypeRefCS_0= ruleTypedTypeRefCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5412:2: this_TypedTypeRefCS_0= ruleTypedTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypedTypeRefCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedTypeRefCS_in_ruleTypedRefCS12212);
            this_TypedTypeRefCS_0=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypedTypeRefCS_0; 
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
    // $ANTLR end "ruleTypedRefCS"


    // $ANTLR start "entryRuleTypedTypeRefCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5431:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5432:2: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5433:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedTypeRefCS_in_entryRuleTypedTypeRefCS12246);
            iv_ruleTypedTypeRefCS=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedTypeRefCS12256); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedTypeRefCS"


    // $ANTLR start "ruleTypedTypeRefCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5440:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5443:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5444:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5444:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5444:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5444:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5445:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5445:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5446:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypedTypeRefCS12302);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
              	        }
                     		set(
                     			current, 
                     			"ownedPathName",
                      		lv_ownedPathName_0_0, 
                      		"PathNameCS");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5462:2: ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==26) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5463:1: (lv_ownedBinding_1_0= ruleTemplateBindingCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5463:1: (lv_ownedBinding_1_0= ruleTemplateBindingCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5464:3: lv_ownedBinding_1_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateBindingCS_in_ruleTypedTypeRefCS12323);
                    lv_ownedBinding_1_0=ruleTemplateBindingCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedBinding",
                              		lv_ownedBinding_1_0, 
                              		"TemplateBindingCS");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleTypedTypeRefCS"


    // $ANTLR start "entryRuleWildcardTypeRefCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5488:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5489:2: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5490:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWildcardTypeRefCS_in_entryRuleWildcardTypeRefCS12360);
            iv_ruleWildcardTypeRefCS=ruleWildcardTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcardTypeRefCS12370); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWildcardTypeRefCS"


    // $ANTLR start "ruleWildcardTypeRefCS"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5497:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5500:28: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5501:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5501:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5501:2: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5501:2: ()
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5502:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWildcardTypeRefCSAccess().getWildcardTypeRefCSAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleWildcardTypeRefCS12419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5514:1: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==92) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5514:3: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleWildcardTypeRefCS12432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5518:1: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5519:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5519:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5520:3: lv_ownedExtends_3_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWildcardTypeRefCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleWildcardTypeRefCS12453);
                    lv_ownedExtends_3_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWildcardTypeRefCSRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExtends",
                              		lv_ownedExtends_3_0, 
                              		"TypedRefCS");
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
    // $ANTLR end "ruleWildcardTypeRefCS"


    // $ANTLR start "entryRuleID"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5544:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5545:2: (iv_ruleID= ruleID EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5546:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID12492);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID12503); if (state.failed) return current;

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
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5553:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5556:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5557:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5557:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_SIMPLE_ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_ESCAPED_ID) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5557:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleID12543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5565:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_RULE_ESCAPED_ID_in_ruleID12569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ESCAPED_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ESCAPED_ID_1, grammarAccess.getIDAccess().getESCAPED_IDTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5580:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5581:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5582:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier12615);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier12626); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5589:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5592:28: (this_ID_0= ruleID )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5594:5: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier12672);
            this_ID_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleLOWER"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5612:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5613:2: (iv_ruleLOWER= ruleLOWER EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5614:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_entryRuleLOWER12717);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLOWER12728); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5621:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5624:28: (this_INT_0= RULE_INT )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5625:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLOWER12767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getLOWERAccess().getINTTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5640:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5641:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5642:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL12812);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL12823); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5649:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5652:28: (this_INT_0= RULE_INT )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5653:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL12862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5668:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5669:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5670:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral12907);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral12918); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5677:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5680:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5681:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral12957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleUPPER"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5696:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5697:2: (iv_ruleUPPER= ruleUPPER EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5698:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_entryRuleUPPER13002);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUPPER13013); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5705:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5708:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5709:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5709:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_INT) ) {
                alt84=1;
            }
            else if ( (LA84_0==36) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5709:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUPPER13053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5718:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUPPER13077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1()); 
                          
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
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleURI"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5731:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5732:2: (iv_ruleURI= ruleURI EOF )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5733:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI13118);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI13129); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5740:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5743:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5744:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI13168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getURIAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleURI"

    // $ANTLR start synpred10_InternalImperativeOCL
    public final void synpred10_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:435:2: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:435:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_synpred10_InternalImperativeOCL989);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalImperativeOCL

    // $ANTLR start synpred11_InternalImperativeOCL
    public final void synpred11_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_5 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:448:2: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:448:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_synpred11_InternalImperativeOCL1019);
        this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalImperativeOCL

    // $ANTLR start synpred12_InternalImperativeOCL
    public final void synpred12_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_6 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:461:2: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:461:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_synpred12_InternalImperativeOCL1049);
        this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalImperativeOCL

    // $ANTLR start synpred14_InternalImperativeOCL
    public final void synpred14_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_ListLiteralExpCS_8 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:487:2: (this_ListLiteralExpCS_8= ruleListLiteralExpCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:487:2: this_ListLiteralExpCS_8= ruleListLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleListLiteralExpCS_in_synpred14_InternalImperativeOCL1109);
        this_ListLiteralExpCS_8=ruleListLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalImperativeOCL

    // $ANTLR start synpred15_InternalImperativeOCL
    public final void synpred15_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_DictLiteralExpCS_9 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:500:2: (this_DictLiteralExpCS_9= ruleDictLiteralExpCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:500:2: this_DictLiteralExpCS_9= ruleDictLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleDictLiteralExpCS_in_synpred15_InternalImperativeOCL1139);
        this_DictLiteralExpCS_9=ruleDictLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalImperativeOCL

    // $ANTLR start synpred16_InternalImperativeOCL
    public final void synpred16_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_10 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:513:2: (this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:513:2: this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_synpred16_InternalImperativeOCL1169);
        this_TypeLiteralExpCS_10=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalImperativeOCL

    // $ANTLR start synpred22_InternalImperativeOCL
    public final void synpred22_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject lv_value_2_0 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: ( (lv_value_2_0= ruleExpCS ) )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: (lv_value_2_0= ruleExpCS )
        {
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: (lv_value_2_0= ruleExpCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:811:3: lv_value_2_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getReturnExpCSAccess().getValueExpCSParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred22_InternalImperativeOCL1827);
        lv_value_2_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred22_InternalImperativeOCL

    // $ANTLR start synpred85_InternalImperativeOCL
    public final void synpred85_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3179:2: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3179:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_synpred85_InternalImperativeOCL7572);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_InternalImperativeOCL

    // $ANTLR start synpred87_InternalImperativeOCL
    public final void synpred87_InternalImperativeOCL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:2: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
        {
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:2: ()
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3255:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3263:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3264:1: (lv_name_2_0= ruleBinaryOperatorName )
        {
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3264:1: (lv_name_2_0= ruleBinaryOperatorName )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3265:3: lv_name_2_0= ruleBinaryOperatorName
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_synpred87_InternalImperativeOCL7754);
        lv_name_2_0=ruleBinaryOperatorName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3281:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3282:1: (lv_ownedRight_3_0= ruleExpCS )
        {
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3282:1: (lv_ownedRight_3_0= ruleExpCS )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3283:3: lv_ownedRight_3_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred87_InternalImperativeOCL7775);
        lv_ownedRight_3_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred87_InternalImperativeOCL

    // $ANTLR start synpred88_InternalImperativeOCL
    public final void synpred88_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3242:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3242:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3242:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3243:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_synpred88_InternalImperativeOCL7721);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==32||LA95_0==34||(LA95_0>=36 && LA95_0<=51)) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3254:2: ()
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3255:2: 
                {
                if ( state.backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3263:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3264:1: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3264:1: (lv_name_2_0= ruleBinaryOperatorName )
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3265:3: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_synpred88_InternalImperativeOCL7754);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3281:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3282:1: (lv_ownedRight_3_0= ruleExpCS )
                {
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3282:1: (lv_ownedRight_3_0= ruleExpCS )
                // ../org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3283:3: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred88_InternalImperativeOCL7775);
                lv_ownedRight_3_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred88_InternalImperativeOCL

    // Delegated rules

    public final boolean synpred12_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA2_eotS =
        "\45\uffff";
    static final String DFA2_eofS =
        "\45\uffff";
    static final String DFA2_minS =
        "\1\4\12\uffff\7\0\1\uffff\2\0\20\uffff";
    static final String DFA2_maxS =
        "\1\131\12\uffff\7\0\1\uffff\2\0\20\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\10\2\uffff\1\13\7\uffff\1\14"+
        "\1\15\1\uffff\1\5\1\6\1\7\1\11\1\12";
    static final String DFA2_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\20\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\36\2\4\21\uffff\1\23\1\1\1\uffff\1\24\4\uffff\1\35\2\uffff"+
            "\1\4\17\uffff\1\14\1\13\10\25\1\15\1\16\1\17\1\20\1\21\3\uffff"+
            "\1\22\1\uffff\4\4\7\uffff\1\2\5\uffff\1\3",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "382:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalImperativeOCL()) ) {s = 32;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalImperativeOCL()) ) {s = 33;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 34;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 34;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 34;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 34;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_17 = input.LA(1);

                         
                        int index2_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 34;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_19 = input.LA(1);

                         
                        int index2_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalImperativeOCL()) ) {s = 35;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_19);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_20 = input.LA(1);

                         
                        int index2_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalImperativeOCL()) ) {s = 36;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 21;}

                         
                        input.seek(index2_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA7_eotS =
        "\102\uffff";
    static final String DFA7_eofS =
        "\1\43\101\uffff";
    static final String DFA7_minS =
        "\1\4\1\0\10\uffff\1\0\67\uffff";
    static final String DFA7_maxS =
        "\1\131\1\0\10\uffff\1\0\67\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\40\uffff\1\2\36\uffff";
    static final String DFA7_specialS =
        "\1\uffff\1\0\10\uffff\1\1\67\uffff}>";
    static final String[] DFA7_transitionS = {
            "\4\2\21\uffff\2\2\1\43\1\2\1\43\1\uffff\2\43\1\2\1\1\1\2\1"+
            "\12\17\43\17\2\2\43\1\uffff\1\2\1\43\4\2\3\uffff\4\43\1\2\4"+
            "\43\2\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "809:2: ( (lv_value_2_0= ruleExpCS ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalImperativeOCL()) ) {s = 2;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalImperativeOCL()) ) {s = 2;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\25\uffff";
    static final String DFA39_eofS =
        "\25\uffff";
    static final String DFA39_minS =
        "\1\4\12\uffff\5\0\5\uffff";
    static final String DFA39_maxS =
        "\1\102\12\uffff\5\0\5\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\20\uffff\1\3";
    static final String DFA39_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\5\uffff}>";
    static final String[] DFA39_transitionS = {
            "\2\1\23\uffff\1\3\2\uffff\1\3\27\uffff\12\3\1\13\1\14\1\15"+
            "\1\16\1\17",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "3165:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_11 = input.LA(1);

                         
                        int index39_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index39_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_12 = input.LA(1);

                         
                        int index39_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index39_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_13 = input.LA(1);

                         
                        int index39_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index39_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_14 = input.LA(1);

                         
                        int index39_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index39_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_15 = input.LA(1);

                         
                        int index39_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index39_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\43\uffff";
    static final String DFA42_eofS =
        "\43\uffff";
    static final String DFA42_minS =
        "\1\4\2\0\40\uffff";
    static final String DFA42_maxS =
        "\1\131\2\0\40\uffff";
    static final String DFA42_acceptS =
        "\3\uffff\1\1\36\uffff\1\2";
    static final String DFA42_specialS =
        "\1\uffff\1\0\1\1\40\uffff}>";
    static final String[] DFA42_transitionS = {
            "\4\3\21\uffff\2\3\1\uffff\1\3\4\uffff\1\3\1\1\1\2\1\3\17\uffff"+
            "\17\3\3\uffff\1\3\1\uffff\4\3\7\uffff\1\3\4\uffff\1\42\1\3",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "3242:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 34;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\25\uffff";
    static final String DFA41_eofS =
        "\1\23\24\uffff";
    static final String DFA41_minS =
        "\1\33\22\0\2\uffff";
    static final String DFA41_maxS =
        "\1\127\22\0\2\uffff";
    static final String DFA41_acceptS =
        "\23\uffff\1\2\1\1";
    static final String DFA41_specialS =
        "\1\uffff\1\14\1\5\1\0\1\11\1\10\1\12\1\4\1\1\1\2\1\15\1\13\1\17"+
        "\1\20\1\6\1\7\1\21\1\16\1\3\2\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\23\1\uffff\1\23\1\uffff\1\23\1\11\1\uffff\1\4\1\uffff\1"+
            "\1\1\2\1\3\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\20\1\21\1\22\17\uffff\2\23\2\uffff\1\23\7\uffff\4\23\1\uffff"+
            "\4\23",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "3254:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_8 = input.LA(1);

                         
                        int index41_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_9 = input.LA(1);

                         
                        int index41_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_18 = input.LA(1);

                         
                        int index41_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_18);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA41_7 = input.LA(1);

                         
                        int index41_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA41_14 = input.LA(1);

                         
                        int index41_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA41_15 = input.LA(1);

                         
                        int index41_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA41_4 = input.LA(1);

                         
                        int index41_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_4);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA41_11 = input.LA(1);

                         
                        int index41_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA41_10 = input.LA(1);

                         
                        int index41_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_10);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA41_17 = input.LA(1);

                         
                        int index41_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_17);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA41_12 = input.LA(1);

                         
                        int index41_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_12);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA41_13 = input.LA(1);

                         
                        int index41_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_13);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA41_16 = input.LA(1);

                         
                        int index41_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index41_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGrammmarCS_in_entryRuleGrammmarCS81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammmarCS91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImperativeOCLExpCS_in_ruleGrammmarCS140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImperativeOCLExpCS_in_entryRuleImperativeOCLExpCS182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImperativeOCLExpCS192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleImperativeOCLExpCS241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_entryRuleTypeLiteralCS275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralCS285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_ruleTypeLiteralCS335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleTypeLiteralCS365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_ruleTypeLiteralCS395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_ruleTypeLiteralCS425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListTypeCS_in_ruleTypeLiteralCS455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictTypeCS_in_ruleTypeLiteralCS485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListTypeCS_in_entryRuleListTypeCS520 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListTypeCS530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleListTypeCS567 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleListTypeCS579 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleListTypeCS600 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleListTypeCS612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictTypeCS_in_entryRuleDictTypeCS648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDictTypeCS658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDictTypeCS695 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleDictTypeCS707 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleDictTypeCS728 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDictTypeCS740 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleDictTypeCS761 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleDictTypeCS773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_entryRulePrimaryExpCS809 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpCS819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_rulePrimaryExpCS869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_rulePrimaryExpCS899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_rulePrimaryExpCS929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_rulePrimaryExpCS959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_rulePrimaryExpCS989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_rulePrimaryExpCS1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_rulePrimaryExpCS1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLambdaLiteralExpCS_in_rulePrimaryExpCS1079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListLiteralExpCS_in_rulePrimaryExpCS1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictLiteralExpCS_in_rulePrimaryExpCS1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_rulePrimaryExpCS1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnExpCS_in_rulePrimaryExpCS1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_rulePrimaryExpCS1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListLiteralExpCS_in_entryRuleListLiteralExpCS1264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListLiteralExpCS1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleListLiteralExpCS1311 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleListLiteralExpCS1323 = new BitSet(new long[]{0xFFF0001E960000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleListLiteralExpCS1357 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleListLiteralExpCS1370 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleListLiteralExpCS1391 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleListLiteralExpCS1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictLiteralExpCS_in_entryRuleDictLiteralExpCS1443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDictLiteralExpCS1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDictLiteralExpCS1490 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDictLiteralExpCS1502 = new BitSet(new long[]{0x00000010800000C0L,0x0000000000000F00L});
        public static final BitSet FOLLOW_ruleDictLiteralPartCS_in_ruleDictLiteralExpCS1536 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleDictLiteralExpCS1549 = new BitSet(new long[]{0x00000010000000C0L,0x0000000000000F00L});
        public static final BitSet FOLLOW_ruleDictLiteralPartCS_in_ruleDictLiteralExpCS1570 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleDictLiteralExpCS1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictLiteralPartCS_in_entryRuleDictLiteralPartCS1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDictLiteralPartCS1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_ruleDictLiteralPartCS1678 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDictLiteralPartCS1690 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleDictLiteralPartCS1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnExpCS_in_entryRuleReturnExpCS1747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReturnExpCS1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleReturnExpCS1794 = new BitSet(new long[]{0xFFF0001E160000F2L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleReturnExpCS1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorName_in_entryRuleEssentialOCLUnaryOperatorName1869 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorName1880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLUnaryOperatorName1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLUnaryOperatorName1937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorName_in_entryRuleEssentialOCLInfixOperatorName1978 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorName1989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLInfixOperatorName2027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperatorName2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEssentialOCLInfixOperatorName2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperatorName2084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEssentialOCLInfixOperatorName2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEssentialOCLInfixOperatorName2122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEssentialOCLInfixOperatorName2141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEssentialOCLInfixOperatorName2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLInfixOperatorName2179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEssentialOCLInfixOperatorName2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEssentialOCLInfixOperatorName2217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEssentialOCLInfixOperatorName2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEssentialOCLInfixOperatorName2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEssentialOCLInfixOperatorName2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorName_in_entryRuleEssentialOCLNavigationOperatorName2315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorName2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEssentialOCLNavigationOperatorName2364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLNavigationOperatorName2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEssentialOCLNavigationOperatorName2402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEssentialOCLNavigationOperatorName2421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_entryRuleBinaryOperatorName2462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorName2473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorName_in_ruleBinaryOperatorName2520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorName_in_ruleBinaryOperatorName2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorName_in_entryRuleInfixOperatorName2599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorName2610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorName_in_ruleInfixOperatorName2656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorName_in_entryRuleNavigationOperatorName2701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorName2712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorName_in_ruleNavigationOperatorName2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_entryRuleUnaryOperatorName2803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorName2814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorName_in_ruleUnaryOperatorName2860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName2905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName2962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName3007 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName3018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName3064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName3109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName3120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName3167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName3200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName3233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEssentialOCLUnreservedName3257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleEssentialOCLUnreservedName3276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName3317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName3374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS3420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIFirstPathElementCS3430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS3482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_ruleURIFirstPathElementCS3528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier3566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier3577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePrimitiveTypeIdentifier3615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulePrimitiveTypeIdentifier3634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulePrimitiveTypeIdentifier3653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePrimitiveTypeIdentifier3672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulePrimitiveTypeIdentifier3691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePrimitiveTypeIdentifier3710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulePrimitiveTypeIdentifier3729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rulePrimitiveTypeIdentifier3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS3788 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS3798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS3843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier3879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier3890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCollectionTypeIdentifier3928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCollectionTypeIdentifier3947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCollectionTypeIdentifier3966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCollectionTypeIdentifier3985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCollectionTypeIdentifier4004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS4044 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS4054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS4100 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleCollectionTypeCS4113 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS4134 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleCollectionTypeCS4146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_entryRuleMapTypeCS4184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapTypeCS4194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleMapTypeCS4237 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleMapTypeCS4263 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4284 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMapTypeCS4296 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4317 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMapTypeCS4329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS4367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS4377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTupleTypeCS4420 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleTupleTypeCS4446 = new BitSet(new long[]{0x0000000008000030L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4468 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_29_in_ruleTupleTypeCS4481 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4502 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_27_in_ruleTupleTypeCS4518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTuplePartCS4566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleTuplePartCS4624 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4737 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleCollectionLiteralExpCS4749 = new BitSet(new long[]{0xFFF0001E960000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4771 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleCollectionLiteralExpCS4784 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4805 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionLiteralExpCS4821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS4857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS4867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleCollectionLiteralPartCS4927 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS4948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionLiteralPartCS4978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionPatternCS_in_entryRuleCollectionPatternCS5014 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionPatternCS5024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionPatternCS5070 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleCollectionPatternCS5082 = new BitSet(new long[]{0xFFF0001E960000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5104 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_29_in_ruleCollectionPatternCS5117 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5138 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleCollectionPatternCS5153 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleCollectionPatternCS5174 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionPatternCS5189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_entryRuleShadowPartCS5225 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShadowPartCS5235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleShadowPartCS5287 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleShadowPartCS5299 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleShadowPartCS5322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleShadowPartCS5341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_entryRulePatternExpCS5380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePatternExpCS5390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_rulePatternExpCS5436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePatternExpCS5449 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_rulePatternExpCS5470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLambdaLiteralExpCS_in_entryRuleLambdaLiteralExpCS5506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLambdaLiteralExpCS5516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleLambdaLiteralExpCS5553 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLambdaLiteralExpCS5565 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLambdaLiteralExpCS5586 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleLambdaLiteralExpCS5598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_entryRuleMapLiteralExpCS5634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapLiteralExpCS5644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_ruleMapLiteralExpCS5690 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMapLiteralExpCS5702 = new BitSet(new long[]{0xFFF0001E960000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5724 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleMapLiteralExpCS5737 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5758 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleMapLiteralExpCS5774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_entryRuleMapLiteralPartCS5810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapLiteralPartCS5820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleMapLiteralPartCS5878 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS5935 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS5945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS5995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS6025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS6055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS6085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS6115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS6145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS6180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS6190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTupleLiteralExpCS6227 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleTupleLiteralExpCS6239 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6260 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleTupleLiteralExpCS6273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6294 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleTupleLiteralExpCS6308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS6344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS6354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS6400 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleTupleLiteralPartCS6413 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS6434 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleTupleLiteralPartCS6448 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS6469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS6505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS6515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS6560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS6595 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS6605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS6650 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS6686 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS6696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleBooleanLiteralExpCS6739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleBooleanLiteralExpCS6776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS6825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS6835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleUnlimitedNaturalLiteralExpCS6884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS6920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS6930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleInvalidLiteralExpCS6979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS7015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS7025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleNullLiteralExpCS7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS7110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS7120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS7170 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS7190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS7227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS7237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS7282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS7317 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS7327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS7373 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_ruleTypeNameExpCS7395 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTypeNameExpCS7408 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTypeNameExpCS7429 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTypeNameExpCS7441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS7481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS7491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS7542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS7572 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleCollectionPatternCS_in_ruleTypeExpCS7602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS7623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS7660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS7670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_ruleExpCS7721 = new BitSet(new long[]{0x000FFFF500000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_ruleExpCS7754 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleExpCS7775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_ruleExpCS7809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_entryRulePrefixedLetExpCS7844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedLetExpCS7854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_rulePrefixedLetExpCS7913 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_rulePrefixedLetExpCS7934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_rulePrefixedLetExpCS7966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_entryRulePrefixedPrimaryExpCS8001 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedPrimaryExpCS8011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_rulePrefixedPrimaryExpCS8070 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000002080F47L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_rulePrefixedPrimaryExpCS8091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedPrimaryExpCS8123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS8158 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameExpCS8168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleNameExpCS8214 = new BitSet(new long[]{0x0000000044000002L,0x0000000000005000L});
        public static final BitSet FOLLOW_ruleSquareBracketedClauseCS_in_ruleNameExpCS8235 = new BitSet(new long[]{0x0000000044000002L,0x0000000000005000L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_ruleNameExpCS8257 = new BitSet(new long[]{0x0000000040000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_ruleNameExpCS8279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_ruleNameExpCS8299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleNameExpCS8324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_entryRuleCurlyBracketedClauseCS8362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCurlyBracketedClauseCS8372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCurlyBracketedClauseCS8421 = new BitSet(new long[]{0x00000000800000B0L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8444 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleCurlyBracketedClauseCS8457 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8478 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleCurlyBracketedClauseCS8509 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCurlyBracketedClauseCS8522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_entryRuleRoundBracketedClauseCS8558 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoundBracketedClauseCS8568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleRoundBracketedClauseCS8617 = new BitSet(new long[]{0xFFF0001E1E0000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_ruleRoundBracketedClauseCS8639 = new BitSet(new long[]{0x0000000028000000L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8660 = new BitSet(new long[]{0x0000000028000000L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_ruleRoundBracketedClauseCS8683 = new BitSet(new long[]{0x0000000028000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8704 = new BitSet(new long[]{0x0000000028000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_ruleRoundBracketedClauseCS8729 = new BitSet(new long[]{0x0000000028000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8750 = new BitSet(new long[]{0x0000000028000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_27_in_ruleRoundBracketedClauseCS8767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSquareBracketedClauseCS_in_entryRuleSquareBracketedClauseCS8803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSquareBracketedClauseCS8813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleSquareBracketedClauseCS8850 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS8871 = new BitSet(new long[]{0x0000000020000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_29_in_ruleSquareBracketedClauseCS8884 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS8905 = new BitSet(new long[]{0x0000000020000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleSquareBracketedClauseCS8919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS8955 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS8965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS9012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingArgCS9026 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9047 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingArgCS9060 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleNavigatingArgCS9103 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingArgCS9147 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS9205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS9215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleNavigatingBarArgCS9258 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS9292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingBarArgCS9305 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS9326 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingBarArgCS9339 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS9360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS9400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS9410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleNavigatingCommaArgCS9453 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS9487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingCommaArgCS9501 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS9522 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingCommaArgCS9535 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleNavigatingCommaArgCS9578 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS9638 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS9648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleNavigatingSemiArgCS9691 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS9725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingSemiArgCS9738 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS9759 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingSemiArgCS9772 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS9793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS9833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS9843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS9892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS9926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS9936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleIfExpCS9973 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS9996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleIfExpCS10015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleIfExpCS10030 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000A00000L});
        public static final BitSet FOLLOW_ruleElseIfThenExpCS_in_ruleIfExpCS10072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000A00000L});
        public static final BitSet FOLLOW_85_in_ruleIfExpCS10085 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_86_in_ruleIfExpCS10118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElseIfThenExpCS_in_entryRuleElseIfThenExpCS10154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElseIfThenExpCS10164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleElseIfThenExpCS10201 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleElseIfThenExpCS10234 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS10291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS10301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleLetExpCS10338 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10359 = new BitSet(new long[]{0x0000000020000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_29_in_ruleLetExpCS10372 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10393 = new BitSet(new long[]{0x0000000020000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleLetExpCS10407 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS10428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS10464 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS10474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS10520 = new BitSet(new long[]{0x0000000104000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_ruleLetVariableCS10541 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleLetVariableCS10555 = new BitSet(new long[]{0xFFF0000012000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS10576 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleLetVariableCS10590 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS10611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS10647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS10657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleNestedExpCS10694 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS10715 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleNestedExpCS10727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS10763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS10773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleSelfExpCS10822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS10858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS10868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS10914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleMultiplicityBoundsCS10927 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS10948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS10986 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityCS10996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleMultiplicityCS11033 = new BitSet(new long[]{0x0000005000000040L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS11059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS11089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleMultiplicityCS11101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS11137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityStringCS11147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMultiplicityStringCS11191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMultiplicityStringCS11220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleMultiplicityStringCS11249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS11300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS11310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS11356 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_91_in_rulePathNameCS11369 = new BitSet(new long[]{0xFFF0000000000030L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_rulePathNameCS11390 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS11428 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFirstPathElementCS11438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS11489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS11524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextPathElementCS11534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS11585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateBindingCS_in_entryRuleTemplateBindingCS11620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateBindingCS11630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTemplateBindingCS11667 = new BitSet(new long[]{0x0000000000000030L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11688 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_29_in_ruleTemplateBindingCS11701 = new BitSet(new long[]{0x0000000000000030L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11722 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_27_in_ruleTemplateBindingCS11736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_entryRuleTemplateParameterSubstitutionCS11772 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterSubstitutionCS11782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRefCS_in_ruleTemplateParameterSubstitutionCS11827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeParameterCS_in_entryRuleTypeParameterCS11864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameterCS11874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeParameterCS11920 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleTypeParameterCS11933 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS11954 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleTypeParameterCS11967 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS11988 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleTypeRefCS_in_entryRuleTypeRefCS12028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRefCS12038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeRefCS12088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcardTypeRefCS_in_ruleTypeRefCS12118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_entryRuleTypedRefCS12153 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedRefCS12163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedTypeRefCS_in_ruleTypedRefCS12212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedTypeRefCS_in_entryRuleTypedTypeRefCS12246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedTypeRefCS12256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypedTypeRefCS12302 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleTemplateBindingCS_in_ruleTypedTypeRefCS12323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcardTypeRefCS_in_entryRuleWildcardTypeRefCS12360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcardTypeRefCS12370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleWildcardTypeRefCS12419 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleWildcardTypeRefCS12432 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleWildcardTypeRefCS12453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID12492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID12503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleID12543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ESCAPED_ID_in_ruleID12569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier12615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier12626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier12672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_entryRuleLOWER12717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLOWER12728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLOWER12767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL12812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL12823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL12862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral12907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral12918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral12957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUPPER_in_entryRuleUPPER13002 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUPPER13013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUPPER13053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleUPPER13077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI13118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI13129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI13168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred10_InternalImperativeOCL989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_synpred11_InternalImperativeOCL1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred12_InternalImperativeOCL1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListLiteralExpCS_in_synpred14_InternalImperativeOCL1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictLiteralExpCS_in_synpred15_InternalImperativeOCL1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred16_InternalImperativeOCL1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred22_InternalImperativeOCL1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_synpred85_InternalImperativeOCL7572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_synpred87_InternalImperativeOCL7754 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred87_InternalImperativeOCL7775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_synpred88_InternalImperativeOCL7721 = new BitSet(new long[]{0x000FFFF500000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_synpred88_InternalImperativeOCL7754 = new BitSet(new long[]{0xFFF0001E160000F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred88_InternalImperativeOCL7775 = new BitSet(new long[]{0x0000000000000002L});
    }


}