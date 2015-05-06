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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SINGLE_QUOTED_STRING", "RULE_DOUBLE_QUOTED_STRING", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_ACCESS_OP", "RULE_ASSIGN_OP", "RULE_CMP_OP", "RULE_MULT_OP", "RULE_MULTI_ITERATOR_OP", "RULE_RESOLVE_IN_KIND", "RULE_RESOLVE_KIND", "RULE_SIMPLE_ITERATOR_OP", "RULE_UNARY_OP", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'List'", "'('", "')'", "'Dict'", "','", "'{'", "'}'", "'='", "'return'", "'-'", "'not'", "'*'", "'/'", "'+'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", "'or'", "'xor'", "'implies'", "'.'", "'->'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "':'", "'..'", "'++'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'pre'", "'['", "']'", "'in'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'?'", "'::'", "'extends'", "'&&'"
    };
    public static final int RULE_CMP_OP=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_ESCAPED_CHARACTER=18;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_ESCAPED_ID=7;
    public static final int RULE_DOUBLE_QUOTED_STRING=5;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_RESOLVE_KIND=15;
    public static final int RULE_SIMPLE_ID=6;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_SINGLE_QUOTED_STRING=4;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_LETTER_CHARACTER=19;
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
    public static final int RULE_UNARY_OP=17;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_RESOLVE_IN_KIND=14;
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
    public static final int RULE_INT=8;
    public static final int RULE_SIMPLE_ITERATOR_OP=16;
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
    public static final int RULE_MULT_OP=12;
    public static final int T__49=49;
    public static final int RULE_ACCESS_OP=9;
    public static final int RULE_MULTI_ITERATOR_OP=13;
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
    public static final int RULE_ASSIGN_OP=10;
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
    public String getGrammarFileName() { return "../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g"; }



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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:73:1: entryRuleGrammmarCS returns [EObject current=null] : iv_ruleGrammmarCS= ruleGrammmarCS EOF ;
    public final EObject entryRuleGrammmarCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammmarCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:74:2: (iv_ruleGrammmarCS= ruleGrammmarCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:75:2: iv_ruleGrammmarCS= ruleGrammmarCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:82:1: ruleGrammmarCS returns [EObject current=null] : this_ImperativeOCLExpCS_0= ruleImperativeOCLExpCS ;
    public final EObject ruleGrammmarCS() throws RecognitionException {
        EObject current = null;

        EObject this_ImperativeOCLExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:85:28: (this_ImperativeOCLExpCS_0= ruleImperativeOCLExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:87:2: this_ImperativeOCLExpCS_0= ruleImperativeOCLExpCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:114:1: entryRuleImperativeOCLExpCS returns [EObject current=null] : iv_ruleImperativeOCLExpCS= ruleImperativeOCLExpCS EOF ;
    public final EObject entryRuleImperativeOCLExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeOCLExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:115:2: (iv_ruleImperativeOCLExpCS= ruleImperativeOCLExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:116:2: iv_ruleImperativeOCLExpCS= ruleImperativeOCLExpCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:123:1: ruleImperativeOCLExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleImperativeOCLExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:126:28: (this_ExpCS_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:128:2: this_ExpCS_0= ruleExpCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:147:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:148:2: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:149:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:156:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS | this_ListTypeCS_4= ruleListTypeCS | this_DictTypeCS_5= ruleDictTypeCS ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:159:28: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS | this_ListTypeCS_4= ruleListTypeCS | this_DictTypeCS_5= ruleDictTypeCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:160:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS | this_ListTypeCS_4= ruleListTypeCS | this_DictTypeCS_5= ruleDictTypeCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:160:1: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS | this_ListTypeCS_4= ruleListTypeCS | this_DictTypeCS_5= ruleDictTypeCS )
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:161:2: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:174:2: this_CollectionTypeCS_1= ruleCollectionTypeCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:187:2: this_MapTypeCS_2= ruleMapTypeCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:200:2: this_TupleTypeCS_3= ruleTupleTypeCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:213:2: this_ListTypeCS_4= ruleListTypeCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:226:2: this_DictTypeCS_5= ruleDictTypeCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:245:1: entryRuleListTypeCS returns [EObject current=null] : iv_ruleListTypeCS= ruleListTypeCS EOF ;
    public final EObject entryRuleListTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTypeCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:246:2: (iv_ruleListTypeCS= ruleListTypeCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:247:2: iv_ruleListTypeCS= ruleListTypeCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:254:1: ruleListTypeCS returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) ;
    public final EObject ruleListTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:257:28: ( (otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:258:1: (otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:258:1: (otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:258:3: otherlv_0= 'List' otherlv_1= '(' ( (lv_type_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleListTypeCS567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListTypeCSAccess().getListKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleListTypeCS579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListTypeCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:266:1: ( (lv_type_2_0= ruleTypeExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:267:1: (lv_type_2_0= ruleTypeExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:267:1: (lv_type_2_0= ruleTypeExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:268:3: lv_type_2_0= ruleTypeExpCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:296:1: entryRuleDictTypeCS returns [EObject current=null] : iv_ruleDictTypeCS= ruleDictTypeCS EOF ;
    public final EObject entryRuleDictTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictTypeCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:297:2: (iv_ruleDictTypeCS= ruleDictTypeCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:298:2: iv_ruleDictTypeCS= ruleDictTypeCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:305:1: ruleDictTypeCS returns [EObject current=null] : (otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:308:28: ( (otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:309:1: (otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:309:1: (otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:309:3: otherlv_0= 'Dict' otherlv_1= '(' ( (lv_keyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_valueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDictTypeCS695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDictTypeCSAccess().getDictKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDictTypeCS707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDictTypeCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:317:1: ( (lv_keyType_2_0= ruleTypeExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:318:1: (lv_keyType_2_0= ruleTypeExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:318:1: (lv_keyType_2_0= ruleTypeExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:319:3: lv_keyType_2_0= ruleTypeExpCS
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:339:1: ( (lv_valueType_4_0= ruleTypeExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:340:1: (lv_valueType_4_0= ruleTypeExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:340:1: (lv_valueType_4_0= ruleTypeExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:341:3: lv_valueType_4_0= ruleTypeExpCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:369:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:370:2: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:371:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:378:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:381:28: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:382:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:382:1: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_ListLiteralExpCS_8= ruleListLiteralExpCS | this_DictLiteralExpCS_9= ruleDictLiteralExpCS | this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS | this_ReturnExpCS_11= ruleReturnExpCS | this_NameExpCS_12= ruleNameExpCS )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:383:2: this_NestedExpCS_0= ruleNestedExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:396:2: this_IfExpCS_1= ruleIfExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:409:2: this_SelfExpCS_2= ruleSelfExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:422:2: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:435:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:448:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:461:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:474:2: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:487:2: this_ListLiteralExpCS_8= ruleListLiteralExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:500:2: this_DictLiteralExpCS_9= ruleDictLiteralExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:513:2: this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:526:2: this_ReturnExpCS_11= ruleReturnExpCS
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:539:2: this_NameExpCS_12= ruleNameExpCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:558:1: entryRuleListLiteralExpCS returns [EObject current=null] : iv_ruleListLiteralExpCS= ruleListLiteralExpCS EOF ;
    public final EObject entryRuleListLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:559:2: (iv_ruleListLiteralExpCS= ruleListLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:560:2: iv_ruleListLiteralExpCS= ruleListLiteralExpCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:567:1: ruleListLiteralExpCS returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:570:28: ( (otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:571:1: (otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:571:1: (otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:571:3: otherlv_0= 'List' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleListLiteralExpCS1311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListLiteralExpCSAccess().getListKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleListLiteralExpCS1323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:579:1: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:580:2: 
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:588:2: ( ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_SINGLE_QUOTED_STRING && LA4_0<=RULE_INT)||(LA4_0>=25 && LA4_0<=26)||LA4_0==28||(LA4_0>=33 && LA4_0<=36)||(LA4_0>=52 && LA4_0<=67)||LA4_0==70||(LA4_0>=72 && LA4_0<=75)||LA4_0==83||(LA4_0>=88 && LA4_0<=89)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:588:3: ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:588:3: ( (lv_ownedParts_3_0= ruleCollectionLiteralPartCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:589:1: (lv_ownedParts_3_0= ruleCollectionLiteralPartCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:589:1: (lv_ownedParts_3_0= ruleCollectionLiteralPartCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:590:3: lv_ownedParts_3_0= ruleCollectionLiteralPartCS
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:606:2: (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==29) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:606:4: otherlv_4= ',' ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleListLiteralExpCS1370); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getListLiteralExpCSAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:610:1: ( (lv_ownedParts_5_0= ruleCollectionLiteralPartCS ) )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:611:1: (lv_ownedParts_5_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:611:1: (lv_ownedParts_5_0= ruleCollectionLiteralPartCS )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:612:3: lv_ownedParts_5_0= ruleCollectionLiteralPartCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:640:1: entryRuleDictLiteralExpCS returns [EObject current=null] : iv_ruleDictLiteralExpCS= ruleDictLiteralExpCS EOF ;
    public final EObject entryRuleDictLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:641:2: (iv_ruleDictLiteralExpCS= ruleDictLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:642:2: iv_ruleDictLiteralExpCS= ruleDictLiteralExpCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:649:1: ruleDictLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:652:28: ( (otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:653:1: (otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:653:1: (otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:653:3: otherlv_0= 'Dict' otherlv_1= '{' () ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDictLiteralExpCS1490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDictLiteralExpCSAccess().getDictKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDictLiteralExpCS1502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDictLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:661:1: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:662:2: 
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:670:2: ( ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SINGLE_QUOTED_STRING && LA6_0<=RULE_DOUBLE_QUOTED_STRING)||LA6_0==RULE_INT||LA6_0==36||(LA6_0>=72 && LA6_0<=75)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:670:3: ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) ) (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )*
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:670:3: ( (lv_ownedParts_3_0= ruleDictLiteralPartCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:671:1: (lv_ownedParts_3_0= ruleDictLiteralPartCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:671:1: (lv_ownedParts_3_0= ruleDictLiteralPartCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:672:3: lv_ownedParts_3_0= ruleDictLiteralPartCS
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:688:2: (otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==29) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:688:4: otherlv_4= ',' ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDictLiteralExpCS1549); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDictLiteralExpCSAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:692:1: ( (lv_ownedParts_5_0= ruleDictLiteralPartCS ) )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:693:1: (lv_ownedParts_5_0= ruleDictLiteralPartCS )
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:693:1: (lv_ownedParts_5_0= ruleDictLiteralPartCS )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:694:3: lv_ownedParts_5_0= ruleDictLiteralPartCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:722:1: entryRuleDictLiteralPartCS returns [EObject current=null] : iv_ruleDictLiteralPartCS= ruleDictLiteralPartCS EOF ;
    public final EObject entryRuleDictLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictLiteralPartCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:723:2: (iv_ruleDictLiteralPartCS= ruleDictLiteralPartCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:724:2: iv_ruleDictLiteralPartCS= ruleDictLiteralPartCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:731:1: ruleDictLiteralPartCS returns [EObject current=null] : ( ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleDictLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:734:28: ( ( ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:735:1: ( ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:735:1: ( ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:735:2: ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:735:2: ( (lv_key_0_0= rulePrimitiveLiteralExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:736:1: (lv_key_0_0= rulePrimitiveLiteralExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:736:1: (lv_key_0_0= rulePrimitiveLiteralExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:737:3: lv_key_0_0= rulePrimitiveLiteralExpCS
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:757:1: ( (lv_value_2_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:758:1: (lv_value_2_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:758:1: (lv_value_2_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:759:3: lv_value_2_0= ruleExpCS
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:783:1: entryRuleReturnExpCS returns [EObject current=null] : iv_ruleReturnExpCS= ruleReturnExpCS EOF ;
    public final EObject entryRuleReturnExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:784:2: (iv_ruleReturnExpCS= ruleReturnExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:785:2: iv_ruleReturnExpCS= ruleReturnExpCS EOF
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:792:1: ruleReturnExpCS returns [EObject current=null] : (otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )? ) ;
    public final EObject ruleReturnExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:795:28: ( (otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:796:1: (otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:796:1: (otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:796:3: otherlv_0= 'return' () ( (lv_value_2_0= ruleExpCS ) )?
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleReturnExpCS1794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReturnExpCSAccess().getReturnKeyword_0());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:800:1: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:801:2: 
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:809:2: ( (lv_value_2_0= ruleExpCS ) )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: (lv_value_2_0= ruleExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: (lv_value_2_0= ruleExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:811:3: lv_value_2_0= ruleExpCS
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


    // $ANTLR start "entryRuleStringLiteral"
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:835:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:836:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:837:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1865);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral1876); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:844:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING | this_DOUBLE_QUOTED_STRING_1= RULE_DOUBLE_QUOTED_STRING ) ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;
        Token this_DOUBLE_QUOTED_STRING_1=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:847:28: ( (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING | this_DOUBLE_QUOTED_STRING_1= RULE_DOUBLE_QUOTED_STRING ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:848:1: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING | this_DOUBLE_QUOTED_STRING_1= RULE_DOUBLE_QUOTED_STRING )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:848:1: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING | this_DOUBLE_QUOTED_STRING_1= RULE_DOUBLE_QUOTED_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_DOUBLE_QUOTED_STRING) ) {
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:848:6: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
                    {
                    this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral1916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SINGLE_QUOTED_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:856:10: this_DOUBLE_QUOTED_STRING_1= RULE_DOUBLE_QUOTED_STRING
                    {
                    this_DOUBLE_QUOTED_STRING_1=(Token)match(input,RULE_DOUBLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_DOUBLE_QUOTED_STRING_in_ruleStringLiteral1942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOUBLE_QUOTED_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOUBLE_QUOTED_STRING_1, grammarAccess.getStringLiteralAccess().getDOUBLE_QUOTED_STRINGTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorName"
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:875:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:876:2: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:877:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorName_in_entryRuleEssentialOCLUnaryOperatorName1992);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorName2003); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:884:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:887:28: ( (kw= '-' | kw= 'not' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:888:1: (kw= '-' | kw= 'not' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:888:1: (kw= '-' | kw= 'not' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            else if ( (LA9_0==35) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:889:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLUnaryOperatorName2041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:896:2: kw= 'not'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEssentialOCLUnaryOperatorName2060); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:909:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:910:2: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:911:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorName_in_entryRuleEssentialOCLInfixOperatorName2101);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorName2112); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:918:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:921:28: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:922:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:922:1: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'or' | kw= 'xor' | kw= 'implies' )
            int alt10=14;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            case 39:
                {
                alt10=5;
                }
                break;
            case 40:
                {
                alt10=6;
                }
                break;
            case 41:
                {
                alt10=7;
                }
                break;
            case 42:
                {
                alt10=8;
                }
                break;
            case 32:
                {
                alt10=9;
                }
                break;
            case 43:
                {
                alt10=10;
                }
                break;
            case 44:
                {
                alt10=11;
                }
                break;
            case 45:
                {
                alt10=12;
                }
                break;
            case 46:
                {
                alt10=13;
                }
                break;
            case 47:
                {
                alt10=14;
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:923:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEssentialOCLInfixOperatorName2150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:930:2: kw= '/'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEssentialOCLInfixOperatorName2169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:937:2: kw= '+'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEssentialOCLInfixOperatorName2188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:944:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEssentialOCLInfixOperatorName2207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:951:2: kw= '>'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEssentialOCLInfixOperatorName2226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:958:2: kw= '<'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEssentialOCLInfixOperatorName2245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:965:2: kw= '>='
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEssentialOCLInfixOperatorName2264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:972:2: kw= '<='
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEssentialOCLInfixOperatorName2283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:979:2: kw= '='
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEssentialOCLInfixOperatorName2302); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:986:2: kw= '<>'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEssentialOCLInfixOperatorName2321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:993:2: kw= 'and'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEssentialOCLInfixOperatorName2340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1000:2: kw= 'or'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEssentialOCLInfixOperatorName2359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1007:2: kw= 'xor'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEssentialOCLInfixOperatorName2378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1014:2: kw= 'implies'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEssentialOCLInfixOperatorName2397); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1027:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1028:2: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1029:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorName_in_entryRuleEssentialOCLNavigationOperatorName2438);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorName2449); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1036:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1039:28: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1040:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1040:1: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt11=1;
                }
                break;
            case 49:
                {
                alt11=2;
                }
                break;
            case 50:
                {
                alt11=3;
                }
                break;
            case 51:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1041:2: kw= '.'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEssentialOCLNavigationOperatorName2487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1048:2: kw= '->'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEssentialOCLNavigationOperatorName2506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1055:2: kw= '?.'
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEssentialOCLNavigationOperatorName2525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1062:2: kw= '?->'
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEssentialOCLNavigationOperatorName2544); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1075:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1076:2: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1077:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_entryRuleBinaryOperatorName2585);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperatorName2596); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1084:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1087:28: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1088:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1088:1: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32||LA12_0==34||(LA12_0>=36 && LA12_0<=47)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=48 && LA12_0<=51)) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1089:5: this_InfixOperatorName_0= ruleInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getInfixOperatorNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorName_in_ruleBinaryOperatorName2643);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1101:5: this_NavigationOperatorName_1= ruleNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getNavigationOperatorNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorName_in_ruleBinaryOperatorName2676);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1119:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1120:2: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1121:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInfixOperatorName_in_entryRuleInfixOperatorName2722);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInfixOperatorName2733); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1128:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1131:28: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1133:5: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInfixOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLInfixOperatorName_in_ruleInfixOperatorName2779);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1151:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1152:2: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1153:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigationOperatorName_in_entryRuleNavigationOperatorName2824);
            iv_ruleNavigationOperatorName=ruleNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigationOperatorName2835); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1160:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1163:28: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1165:5: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLNavigationOperatorName_in_ruleNavigationOperatorName2881);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1183:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1184:2: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1185:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_entryRuleUnaryOperatorName2926);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperatorName2937); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1192:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1195:28: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1197:5: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnaryOperatorName_in_ruleUnaryOperatorName2983);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1215:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1216:2: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1217:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName3028);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName3039); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1224:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1227:28: (this_Identifier_0= ruleIdentifier )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1229:5: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName3085);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1247:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1248:2: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1249:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName3130);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnrestrictedName3141); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1256:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1259:28: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1261:5: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName3187);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1279:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1280:2: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1281:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName3232);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName3243); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1288:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1291:28: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1292:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1292:1: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt13=1;
                }
                break;
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt13=2;
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
                alt13=3;
                }
                break;
            case 52:
                {
                alt13=4;
                }
                break;
            case 53:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1293:5: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName3290);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1305:5: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName3323);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1317:5: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName3356);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1329:2: kw= 'Map'
                    {
                    kw=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEssentialOCLUnreservedName3380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1336:2: kw= 'Tuple'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEssentialOCLUnreservedName3399); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1349:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1350:2: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1351:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName3440);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnreservedName3451); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1358:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1361:28: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1363:5: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName3497);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1383:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1384:2: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1385:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS3543);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURIFirstPathElementCS3553); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1392:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1395:28: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1396:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1396:1: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_SIMPLE_ID && LA14_0<=RULE_ESCAPED_ID)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_SINGLE_QUOTED_STRING) ) {
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1396:2: ( ( ruleUnrestrictedName ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1396:2: ( ( ruleUnrestrictedName ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1397:1: ( ruleUnrestrictedName )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1397:1: ( ruleUnrestrictedName )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1398:3: ruleUnrestrictedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS3605);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1415:6: ( () ( ( ruleURI ) ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1415:6: ( () ( ( ruleURI ) ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1415:7: () ( ( ruleURI ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1415:7: ()
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1416:2: 
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1424:2: ( ( ruleURI ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1425:1: ( ruleURI )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1425:1: ( ruleURI )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1426:3: ruleURI
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
                    pushFollow(FollowSets000.FOLLOW_ruleURI_in_ruleURIFirstPathElementCS3651);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1450:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1451:2: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1452:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier3689);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier3700); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1459:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1462:28: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1463:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1463:1: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt15=1;
                }
                break;
            case 55:
                {
                alt15=2;
                }
                break;
            case 56:
                {
                alt15=3;
                }
                break;
            case 57:
                {
                alt15=4;
                }
                break;
            case 58:
                {
                alt15=5;
                }
                break;
            case 59:
                {
                alt15=6;
                }
                break;
            case 60:
                {
                alt15=7;
                }
                break;
            case 61:
                {
                alt15=8;
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1464:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulePrimitiveTypeIdentifier3738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1471:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulePrimitiveTypeIdentifier3757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1478:2: kw= 'Real'
                    {
                    kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulePrimitiveTypeIdentifier3776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1485:2: kw= 'String'
                    {
                    kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimitiveTypeIdentifier3795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1492:2: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_rulePrimitiveTypeIdentifier3814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1499:2: kw= 'OclAny'
                    {
                    kw=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulePrimitiveTypeIdentifier3833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1506:2: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulePrimitiveTypeIdentifier3852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1513:2: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_rulePrimitiveTypeIdentifier3871); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1526:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1527:2: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1528:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS3911);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveTypeCS3921); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1535:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1538:28: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1539:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1539:1: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1540:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1540:1: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1541:3: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS3966);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1565:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1566:2: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1567:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier4002);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier4013); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1574:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1577:28: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1578:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1578:1: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt16=1;
                }
                break;
            case 63:
                {
                alt16=2;
                }
                break;
            case 64:
                {
                alt16=3;
                }
                break;
            case 65:
                {
                alt16=4;
                }
                break;
            case 66:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1579:2: kw= 'Set'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCollectionTypeIdentifier4051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1586:2: kw= 'Bag'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleCollectionTypeIdentifier4070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1593:2: kw= 'Sequence'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCollectionTypeIdentifier4089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1600:2: kw= 'Collection'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleCollectionTypeIdentifier4108); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1607:2: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleCollectionTypeIdentifier4127); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1620:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1621:2: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1622:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS4167);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionTypeCS4177); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1629:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1632:28: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1633:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1633:1: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1633:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1633:2: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1634:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1634:1: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1635:3: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS4223);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1651:2: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1651:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCollectionTypeCS4236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1655:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1656:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1656:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1657:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS4257);
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

                    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCollectionTypeCS4269); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1685:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1686:2: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1687:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_entryRuleMapTypeCS4307);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapTypeCS4317); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1694:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1697:28: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1698:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1698:1: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1698:2: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1698:2: ( (lv_name_0_0= 'Map' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1699:1: (lv_name_0_0= 'Map' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1699:1: (lv_name_0_0= 'Map' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1700:3: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMapTypeCS4360); if (state.failed) return current;
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1713:2: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1713:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMapTypeCS4386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1717:1: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1718:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1718:1: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1719:3: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4407);
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

                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMapTypeCS4419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1739:1: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1740:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1740:1: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1741:3: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4440);
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

                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMapTypeCS4452); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1769:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1770:2: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1771:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS4490);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeCS4500); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1778:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1781:28: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1782:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1782:1: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1782:2: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1782:2: ( (lv_name_0_0= 'Tuple' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1783:1: (lv_name_0_0= 'Tuple' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1783:1: (lv_name_0_0= 'Tuple' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1784:3: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTupleTypeCS4543); if (state.failed) return current;
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1797:2: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1797:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTupleTypeCS4569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1801:1: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_SIMPLE_ID && LA20_0<=RULE_ESCAPED_ID)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1801:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1801:2: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1802:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1802:1: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1803:3: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4591);
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

                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1819:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==29) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1819:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTupleTypeCS4604); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1823:1: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1824:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1824:1: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1825:3: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4625);
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
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTupleTypeCS4641); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1853:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1854:2: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1855:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4679);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTuplePartCS4689); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1862:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1865:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1866:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1866:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1866:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1866:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1867:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1867:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1868:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4735);
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

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTuplePartCS4747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1888:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1889:1: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1889:1: (lv_ownedType_2_0= ruleTypeExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1890:3: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4768);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1914:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1915:2: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1916:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4804);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4814); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1923:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1926:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1927:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1927:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1927:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1927:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1928:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1928:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1929:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4860);
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

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionLiteralExpCS4872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1949:1: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_SINGLE_QUOTED_STRING && LA23_0<=RULE_INT)||(LA23_0>=25 && LA23_0<=26)||LA23_0==28||(LA23_0>=33 && LA23_0<=36)||(LA23_0>=52 && LA23_0<=67)||LA23_0==70||(LA23_0>=72 && LA23_0<=75)||LA23_0==83||(LA23_0>=88 && LA23_0<=89)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1949:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1949:2: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1950:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1950:1: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1951:3: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4894);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1967:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==29) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1967:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCollectionLiteralExpCS4907); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1971:1: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1972:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1972:1: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:1973:3: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4928);
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
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionLiteralExpCS4944); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2001:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2002:2: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2003:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS4980);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS4990); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2010:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2013:28: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2014:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2014:1: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt25=2;
            switch ( input.LA(1) ) {
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_DOUBLE_QUOTED_STRING:
            case RULE_INT:
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
                alt25=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==26||(LA25_2>=29 && LA25_2<=32)||LA25_2==34||(LA25_2>=36 && LA25_2<=51)||LA25_2==68||LA25_2==76||LA25_2==78||LA25_2==91) ) {
                    alt25=1;
                }
                else if ( (LA25_2==67) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA25_3 = input.LA(2);

                if ( (LA25_3==EOF||LA25_3==26||(LA25_3>=29 && LA25_3<=32)||LA25_3==34||(LA25_3>=36 && LA25_3<=51)||LA25_3==68||LA25_3==76||LA25_3==78||LA25_3==91) ) {
                    alt25=1;
                }
                else if ( (LA25_3==67) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt25=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2014:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2014:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2014:3: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2014:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2015:1: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2015:1: (lv_ownedExpression_0_0= ruleExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2016:3: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS5037);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2032:2: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==68) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2032:4: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCollectionLiteralPartCS5050); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                                  
                            }
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2036:1: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2037:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2037:1: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2038:3: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS5071);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2055:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2055:6: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2056:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2056:1: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2057:3: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionLiteralPartCS5101);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2081:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2082:2: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2083:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionPatternCS_in_entryRuleCollectionPatternCS5137);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectionPatternCS5147); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2090:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2093:28: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2094:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2094:1: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2094:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2094:2: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2095:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2095:1: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2096:3: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCollectionTypeCS_in_ruleCollectionPatternCS5193);
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

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCollectionPatternCS5205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2116:1: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_SIMPLE_ID && LA27_0<=RULE_ESCAPED_ID)||LA27_0==67) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2116:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2116:2: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2117:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2117:1: (lv_ownedParts_2_0= rulePatternExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2118:3: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5227);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2134:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==29) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2134:4: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCollectionPatternCS5240); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2138:1: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2139:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2139:1: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2140:3: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5261);
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
                    	    break loop26;
                        }
                    } while (true);

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2156:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2156:6: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleCollectionPatternCS5276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2160:1: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2161:1: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2161:1: (lv_restVariableName_6_0= ruleIdentifier )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2162:3: lv_restVariableName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIdentifierParserRuleCall_2_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleCollectionPatternCS5297);
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

            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCollectionPatternCS5312); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2190:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2191:2: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2192:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_entryRuleShadowPartCS5348);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShadowPartCS5358); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2199:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2202:28: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2203:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2203:1: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2203:2: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2203:2: ( ( ruleUnrestrictedName ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2204:1: ( ruleUnrestrictedName )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2204:1: ( ruleUnrestrictedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2205:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleShadowPartCS5410);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleShadowPartCS5422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2225:1: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2226:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2226:1: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2227:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2227:1: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
            int alt28=2;
            switch ( input.LA(1) ) {
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_DOUBLE_QUOTED_STRING:
            case RULE_INT:
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
                alt28=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==67) ) {
                    alt28=2;
                }
                else if ( (LA28_2==EOF||LA28_2==26||(LA28_2>=29 && LA28_2<=32)||LA28_2==34||(LA28_2>=36 && LA28_2<=51)||LA28_2==76||LA28_2==78||LA28_2==91) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==67) ) {
                    alt28=2;
                }
                else if ( (LA28_3==EOF||LA28_3==26||(LA28_3>=29 && LA28_3<=32)||LA28_3==34||(LA28_3>=36 && LA28_3<=51)||LA28_3==76||LA28_3==78||LA28_3==91) ) {
                    alt28=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt28=2;
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2228:3: lv_ownedInitExpression_2_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleShadowPartCS5445);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2243:8: lv_ownedInitExpression_2_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleShadowPartCS5464);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2269:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2270:2: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2271:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_entryRulePatternExpCS5503);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePatternExpCS5513); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2278:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2281:28: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2282:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2282:1: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2282:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2282:2: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_SIMPLE_ID && LA29_0<=RULE_ESCAPED_ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2283:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2283:1: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2284:3: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_rulePatternExpCS5559);
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

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulePatternExpCS5572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2304:1: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2305:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2305:1: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2306:3: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_rulePatternExpCS5593);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2330:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2331:2: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2332:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLambdaLiteralExpCS_in_entryRuleLambdaLiteralExpCS5629);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLambdaLiteralExpCS5639); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2339:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2342:28: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2343:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2343:1: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2343:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleLambdaLiteralExpCS5676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLambdaLiteralExpCS5688); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2351:1: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2352:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2352:1: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2353:3: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLambdaLiteralExpCS5709);
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

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLambdaLiteralExpCS5721); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2381:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2382:2: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2383:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapLiteralExpCS_in_entryRuleMapLiteralExpCS5757);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapLiteralExpCS5767); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2390:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2393:28: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2394:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2394:1: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2394:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2394:2: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2395:1: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2395:1: (lv_ownedType_0_0= ruleMapTypeCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2396:3: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapTypeCS_in_ruleMapLiteralExpCS5813);
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

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMapLiteralExpCS5825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2416:1: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_SINGLE_QUOTED_STRING && LA31_0<=RULE_INT)||(LA31_0>=25 && LA31_0<=26)||LA31_0==28||(LA31_0>=33 && LA31_0<=36)||(LA31_0>=52 && LA31_0<=66)||LA31_0==70||(LA31_0>=72 && LA31_0<=75)||LA31_0==83||(LA31_0>=88 && LA31_0<=89)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2416:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2416:2: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2417:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2417:1: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2418:3: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5847);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2434:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==29) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2434:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMapLiteralExpCS5860); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2438:1: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2439:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2439:1: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2440:3: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5881);
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
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMapLiteralExpCS5897); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2468:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2469:2: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2470:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMapLiteralPartCS_in_entryRuleMapLiteralPartCS5933);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMapLiteralPartCS5943); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2477:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2480:28: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2481:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2481:1: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2481:2: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2481:2: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2482:1: (lv_ownedKey_0_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2482:1: (lv_ownedKey_0_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2483:3: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5989);
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

            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleMapLiteralPartCS6001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2503:1: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2504:1: (lv_ownedValue_2_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2504:1: (lv_ownedValue_2_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2505:3: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS6022);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2529:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2530:2: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2531:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS6058);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS6068); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2538:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2541:28: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2542:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2542:1: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt32=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt32=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_DOUBLE_QUOTED_STRING:
                {
                alt32=2;
                }
                break;
            case 72:
            case 73:
                {
                alt32=3;
                }
                break;
            case 36:
                {
                alt32=4;
                }
                break;
            case 74:
                {
                alt32=5;
                }
                break;
            case 75:
                {
                alt32=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2543:2: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS6118);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2556:2: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS6148);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2569:2: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS6178);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2582:2: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS6208);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2595:2: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS6238);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2608:2: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS6268);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2627:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2628:2: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2629:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS6303);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpCS6313); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2636:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2639:28: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2640:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2640:1: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2640:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTupleLiteralExpCS6350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTupleLiteralExpCS6362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2648:1: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2649:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2649:1: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2650:3: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6383);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2666:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2666:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTupleLiteralExpCS6396); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2670:1: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2671:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2671:1: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2672:3: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6417);
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
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTupleLiteralExpCS6431); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2700:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2701:2: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2702:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS6467);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralPartCS6477); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2709:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2712:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2713:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2713:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2713:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2713:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2714:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2714:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2715:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS6523);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2731:2: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==67) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2731:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTupleLiteralPartCS6536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2735:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2736:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2736:1: (lv_ownedType_2_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2737:3: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS6557);
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

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTupleLiteralPartCS6571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2757:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2758:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2758:1: (lv_ownedInitExpression_4_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2759:3: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS6592);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2783:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2784:2: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2785:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS6628);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberLiteralExpCS6638); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2792:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2795:28: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2796:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2796:1: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2797:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2797:1: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2798:3: lv_symbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolNUMBER_LITERALParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS6683);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2822:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2823:2: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2824:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS6718);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteralExpCS6728); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2831:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2834:28: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2835:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2835:1: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_SINGLE_QUOTED_STRING && LA35_0<=RULE_DOUBLE_QUOTED_STRING)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2836:1: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2836:1: (lv_segments_0_0= ruleStringLiteral )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2837:3: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS6773);
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
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2861:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2862:2: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2863:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS6809);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS6819); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2870:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2873:28: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2874:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2874:1: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            else if ( (LA36_0==73) ) {
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2874:2: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2874:2: ( (lv_symbol_0_0= 'true' ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2875:1: (lv_symbol_0_0= 'true' )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2875:1: (lv_symbol_0_0= 'true' )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2876:3: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleBooleanLiteralExpCS6862); if (state.failed) return current;
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2890:6: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2890:6: ( (lv_symbol_1_0= 'false' ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2891:1: (lv_symbol_1_0= 'false' )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2891:1: (lv_symbol_1_0= 'false' )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2892:3: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleBooleanLiteralExpCS6899); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2913:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2914:2: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2915:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS6948);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS6958); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2922:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2925:28: ( ( () otherlv_1= '*' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2926:1: ( () otherlv_1= '*' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2926:1: ( () otherlv_1= '*' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2926:2: () otherlv_1= '*'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2926:2: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2927:2: 
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

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUnlimitedNaturalLiteralExpCS7007); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2947:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2948:2: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2949:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS7043);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS7053); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2956:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2959:28: ( ( () otherlv_1= 'invalid' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2960:1: ( () otherlv_1= 'invalid' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2960:1: ( () otherlv_1= 'invalid' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2960:2: () otherlv_1= 'invalid'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2960:2: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2961:2: 
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

            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleInvalidLiteralExpCS7102); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2981:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2982:2: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2983:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS7138);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNullLiteralExpCS7148); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2990:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2993:28: ( ( () otherlv_1= 'null' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2994:1: ( () otherlv_1= 'null' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2994:1: ( () otherlv_1= 'null' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2994:2: () otherlv_1= 'null'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2994:2: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:2995:2: 
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

            otherlv_1=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleNullLiteralExpCS7197); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3015:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3016:2: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3017:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS7233);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS7243); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3024:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3027:28: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3028:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3028:1: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3029:2: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS7293);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TypeLiteralCS_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3040:1: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==78) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3041:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3041:1: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3042:3: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS7313);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3066:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3067:2: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3068:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS7350);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeLiteralExpCS7360); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3075:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3078:28: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3079:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3079:1: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3080:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3080:1: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3081:3: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS7405);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3105:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3106:2: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3107:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS7440);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeNameExpCS7450); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3114:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3117:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3118:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3118:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3118:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3118:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3119:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3119:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3120:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS7496);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3136:2: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3136:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3136:3: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3137:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3137:1: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3138:3: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_ruleTypeNameExpCS7518);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3154:2: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==30) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3154:4: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTypeNameExpCS7531); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                                  
                            }
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3158:1: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3159:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3159:1: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3160:3: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleTypeNameExpCS7552);
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

                            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTypeNameExpCS7564); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3188:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3189:2: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3190:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS7604);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeExpCS7614); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3197:1: ruleTypeExpCS returns [EObject current=null] : ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;

        EObject lv_ownedMultiplicity_3_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3200:28: ( ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3201:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3201:1: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3201:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3201:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt40=3;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3202:2: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeNameExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS7665);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3215:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeLiteralCSParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS7695);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3228:2: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeExpCSAccess().getCollectionPatternCSParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCollectionPatternCS_in_ruleTypeExpCS7725);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3239:2: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==78) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3240:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3240:1: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3241:3: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS7746);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3265:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3266:2: (iv_ruleExpCS= ruleExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3267:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_entryRuleExpCS7783);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpCS7793); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3274:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3277:28: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3278:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3278:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3278:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3278:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3279:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_ruleExpCS7844);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrefixedPrimaryExpCS_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt42=2;
                    alt42 = dfa42.predict(input);
                    switch (alt42) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:2: ()
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3291:2: 
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

                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3299:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3300:1: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3300:1: (lv_name_2_0= ruleBinaryOperatorName )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3301:3: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_ruleExpCS7877);
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

                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3317:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3318:1: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3318:1: (lv_ownedRight_3_0= ruleExpCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3319:3: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleExpCS7898);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3337:2: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_ruleExpCS7932);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3356:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3357:2: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3358:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_entryRulePrefixedLetExpCS7967);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedLetExpCS7977); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3365:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3368:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3369:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3369:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=34 && LA44_0<=35)) ) {
                alt44=1;
            }
            else if ( (LA44_0==88) ) {
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3369:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3369:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3369:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3369:3: ()
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3370:2: 
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3378:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3379:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3379:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3380:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_rulePrefixedLetExpCS8036);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3396:2: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3397:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3397:1: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3398:3: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedLetExpCS_in_rulePrefixedLetExpCS8057);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3416:2: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_rulePrefixedLetExpCS8089);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3435:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3436:2: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3437:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_entryRulePrefixedPrimaryExpCS8124);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrefixedPrimaryExpCS8134); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3444:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3447:28: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3448:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3448:1: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=34 && LA45_0<=35)) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_SINGLE_QUOTED_STRING && LA45_0<=RULE_INT)||(LA45_0>=25 && LA45_0<=26)||LA45_0==28||LA45_0==33||LA45_0==36||(LA45_0>=52 && LA45_0<=66)||LA45_0==70||(LA45_0>=72 && LA45_0<=75)||LA45_0==83||LA45_0==89) ) {
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3448:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3448:2: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3448:3: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3448:3: ()
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3449:2: 
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3457:2: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3458:1: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3458:1: (lv_name_1_0= ruleUnaryOperatorName )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3459:3: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperatorName_in_rulePrefixedPrimaryExpCS8193);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3475:2: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3476:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3476:1: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3477:3: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_rulePrefixedPrimaryExpCS8214);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3495:2: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpCS_in_rulePrefixedPrimaryExpCS8246);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3514:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3515:2: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3516:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS8281);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNameExpCS8291); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3523:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3526:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3527:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3527:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3527:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3527:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3528:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3528:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3529:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleNameExpCS8337);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3545:2: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==78) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3546:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3546:1: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3547:3: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSquareBracketedClauseCS_in_ruleNameExpCS8358);
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
            	    break loop46;
                }
            } while (true);

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3563:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==26) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3564:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3564:1: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3565:3: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_ruleNameExpCS8380);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3581:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==30) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3582:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3582:1: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3583:3: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_ruleNameExpCS8402);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3599:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==76) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3599:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3599:4: ( (lv_isPre_4_0= '@' ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3600:1: (lv_isPre_4_0= '@' )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3600:1: (lv_isPre_4_0= '@' )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3601:3: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleNameExpCS8422); if (state.failed) return current;
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

                    otherlv_5=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleNameExpCS8447); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3626:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3627:2: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3628:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCurlyBracketedClauseCS_in_entryRuleCurlyBracketedClauseCS8485);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCurlyBracketedClauseCS8495); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3635:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3638:28: ( ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3639:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3639:1: ( () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3639:2: () otherlv_1= '{' ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) ) otherlv_6= '}'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3639:2: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3640:2: 
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

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCurlyBracketedClauseCS8544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3652:1: ( ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? | ( (lv_value_5_0= ruleStringLiteral ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_SIMPLE_ID && LA52_0<=RULE_ESCAPED_ID)||LA52_0==31) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_SINGLE_QUOTED_STRING && LA52_0<=RULE_DOUBLE_QUOTED_STRING)) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3652:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3652:2: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=RULE_SIMPLE_ID && LA51_0<=RULE_ESCAPED_ID)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3652:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3652:3: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3653:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3653:1: (lv_ownedParts_2_0= ruleShadowPartCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3654:3: lv_ownedParts_2_0= ruleShadowPartCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8567);
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

                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3670:2: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==29) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3670:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCurlyBracketedClauseCS8580); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_0_1_0());
                            	          
                            	    }
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3674:1: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3675:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    {
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3675:1: (lv_ownedParts_4_0= ruleShadowPartCS )
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3676:3: lv_ownedParts_4_0= ruleShadowPartCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8601);
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
                            	    break loop50;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3693:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3693:6: ( (lv_value_5_0= ruleStringLiteral ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3694:1: (lv_value_5_0= ruleStringLiteral )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3694:1: (lv_value_5_0= ruleStringLiteral )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3695:3: lv_value_5_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getValueStringLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleCurlyBracketedClauseCS8632);
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

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCurlyBracketedClauseCS8645); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3723:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3724:2: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3725:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_entryRuleRoundBracketedClauseCS8681);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoundBracketedClauseCS8691); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3732:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3735:28: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3736:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3736:1: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3736:2: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )? otherlv_8= ')'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3736:2: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3737:2: 
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

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRoundBracketedClauseCS8740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3749:1: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_SINGLE_QUOTED_STRING && LA58_0<=RULE_INT)||(LA58_0>=25 && LA58_0<=26)||LA58_0==28||(LA58_0>=33 && LA58_0<=36)||(LA58_0>=52 && LA58_0<=67)||LA58_0==70||(LA58_0>=72 && LA58_0<=75)||LA58_0==83||(LA58_0>=88 && LA58_0<=89)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3749:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )* ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )? ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3749:2: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3750:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3750:1: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3751:3: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_ruleRoundBracketedClauseCS8762);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3767:2: ( (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==29) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3768:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3768:1: (lv_ownedArguments_3_0= ruleNavigatingCommaArgCS )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3769:3: lv_ownedArguments_3_0= ruleNavigatingCommaArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8783);
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
                    	    break loop53;
                        }
                    } while (true);

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3785:3: ( ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==82) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3785:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) ) ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3785:4: ( (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3786:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3786:1: (lv_ownedArguments_4_0= ruleNavigatingSemiArgCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3787:3: lv_ownedArguments_4_0= ruleNavigatingSemiArgCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_ruleRoundBracketedClauseCS8806);
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

                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3803:2: ( (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==29) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3804:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    {
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3804:1: (lv_ownedArguments_5_0= ruleNavigatingCommaArgCS )
                            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3805:3: lv_ownedArguments_5_0= ruleNavigatingCommaArgCS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8827);
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
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3821:5: ( ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )* )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==81) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3821:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) ) ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3821:6: ( (lv_ownedArguments_6_0= ruleNavigatingBarArgCS ) )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3822:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3822:1: (lv_ownedArguments_6_0= ruleNavigatingBarArgCS )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3823:3: lv_ownedArguments_6_0= ruleNavigatingBarArgCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_3_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_ruleRoundBracketedClauseCS8852);
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

                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3839:2: ( (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS ) )*
                    	    loop56:
                    	    do {
                    	        int alt56=2;
                    	        int LA56_0 = input.LA(1);

                    	        if ( (LA56_0==29) ) {
                    	            alt56=1;
                    	        }


                    	        switch (alt56) {
                    	    	case 1 :
                    	    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3840:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    {
                    	    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3840:1: (lv_ownedArguments_7_0= ruleNavigatingCommaArgCS )
                    	    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3841:3: lv_ownedArguments_7_0= ruleNavigatingCommaArgCS
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	      	        newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_3_1_0()); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8873);
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
                    	    	    break loop56;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRoundBracketedClauseCS8890); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3869:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3870:2: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3871:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSquareBracketedClauseCS_in_entryRuleSquareBracketedClauseCS8926);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSquareBracketedClauseCS8936); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3878:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3881:28: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3882:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3882:1: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3882:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleSquareBracketedClauseCS8973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3886:1: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3887:1: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3887:1: (lv_ownedTerms_1_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3888:3: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS8994);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3904:2: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==29) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3904:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSquareBracketedClauseCS9007); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3908:1: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3909:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3909:1: (lv_ownedTerms_3_0= ruleExpCS )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3910:3: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9028);
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
            	    break loop59;
                }
            } while (true);

            otherlv_4=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleSquareBracketedClauseCS9042); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3938:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3939:2: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3940:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS9078);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgCS9088); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3947:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3950:28: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3951:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3951:1: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? ) | (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_SINGLE_QUOTED_STRING && LA62_0<=RULE_INT)||(LA62_0>=25 && LA62_0<=26)||LA62_0==28||(LA62_0>=33 && LA62_0<=36)||(LA62_0>=52 && LA62_0<=66)||LA62_0==70||(LA62_0>=72 && LA62_0<=75)||LA62_0==83||(LA62_0>=88 && LA62_0<=89)) ) {
                alt62=1;
            }
            else if ( (LA62_0==67) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3951:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3951:2: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )? )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3951:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3951:3: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3952:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3952:1: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3953:3: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS9135);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3969:2: ( (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) ) )?
                    int alt61=3;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==67) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==80) ) {
                        alt61=2;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3969:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3969:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3969:5: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingArgCS9149); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_0_0());
                                  
                            }
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3973:1: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3974:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3974:1: (lv_ownedType_2_0= ruleTypeExpCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3975:3: lv_ownedType_2_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9170);
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

                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3991:2: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==32) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3991:4: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingArgCS9183); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                          
                                    }
                                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3995:1: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3996:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3996:1: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3997:3: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9204);
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
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4014:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4014:6: (otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4014:8: otherlv_5= 'in' ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            {
                            otherlv_5=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleNavigatingArgCS9226); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_1_0());
                                  
                            }
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4018:1: ( (lv_ownedInitExpression_6_0= ruleExpCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4019:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4019:1: (lv_ownedInitExpression_6_0= ruleExpCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4020:3: lv_ownedInitExpression_6_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9247);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4037:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4037:6: (otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4037:8: otherlv_7= ':' ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    {
                    otherlv_7=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingArgCS9270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4041:1: ( (lv_ownedType_8_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4042:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4042:1: (lv_ownedType_8_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4043:3: lv_ownedType_8_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9291);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4067:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4068:2: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4069:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS9328);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingBarArgCS9338); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4076:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4079:28: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4080:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4080:1: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4080:2: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4080:2: ( (lv_prefix_0_0= '|' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4081:1: (lv_prefix_0_0= '|' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4081:1: (lv_prefix_0_0= '|' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4082:3: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleNavigatingBarArgCS9381); if (state.failed) return current;
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4095:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4096:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4096:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4097:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS9415);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4113:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==67) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4113:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingBarArgCS9428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4117:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4118:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4118:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4119:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS9449);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4135:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==32) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4135:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingBarArgCS9462); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4139:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4140:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4140:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4141:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS9483);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4165:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4166:2: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4167:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS9523);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS9533); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4174:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4177:28: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4178:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4178:1: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4178:2: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4178:2: ( (lv_prefix_0_0= ',' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4179:1: (lv_prefix_0_0= ',' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4179:1: (lv_prefix_0_0= ',' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4180:3: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNavigatingCommaArgCS9576); if (state.failed) return current;
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4193:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4194:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4194:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4195:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS9610);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4211:2: ( (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) ) )?
            int alt66=3;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==67) ) {
                alt66=1;
            }
            else if ( (LA66_0==80) ) {
                alt66=2;
            }
            switch (alt66) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4211:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4211:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4211:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingCommaArgCS9624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_0_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4215:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4216:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4216:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4217:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS9645);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4233:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==32) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4233:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingCommaArgCS9658); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                                  
                            }
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4237:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4238:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4238:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4239:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9679);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4256:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4256:6: (otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4256:8: otherlv_6= 'in' ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    {
                    otherlv_6=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleNavigatingCommaArgCS9701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_1_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4260:1: ( (lv_ownedInitExpression_7_0= ruleExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4261:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4261:1: (lv_ownedInitExpression_7_0= ruleExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4262:3: lv_ownedInitExpression_7_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9722);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4286:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4287:2: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4288:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS9761);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS9771); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4295:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4298:28: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4299:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4299:1: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4299:2: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4299:2: ( (lv_prefix_0_0= ';' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4300:1: (lv_prefix_0_0= ';' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4300:1: (lv_prefix_0_0= ';' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4301:3: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleNavigatingSemiArgCS9814); if (state.failed) return current;
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4314:2: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4315:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4315:1: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4316:3: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS9848);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4332:2: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==67) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4332:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleNavigatingSemiArgCS9861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4336:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4337:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4337:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4338:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS9882);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4354:2: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==32) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4354:4: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNavigatingSemiArgCS9895); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                                  
                            }
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4358:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4359:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4359:1: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4360:3: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS9916);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4384:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4385:2: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4386:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS9956);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNavigatingArgExpCS9966); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4393:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4396:28: (this_ExpCS_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4398:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS10015);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4417:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4418:2: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4419:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS10049);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfExpCS10059); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4426:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4429:28: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4430:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4430:1: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4430:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleIfExpCS10096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4434:1: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4435:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4435:1: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4436:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4436:1: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt69=2;
            switch ( input.LA(1) ) {
            case RULE_SINGLE_QUOTED_STRING:
            case RULE_DOUBLE_QUOTED_STRING:
            case RULE_INT:
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
                alt69=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA69_2 = input.LA(2);

                if ( (LA69_2==26||LA69_2==30||LA69_2==32||LA69_2==34||(LA69_2>=36 && LA69_2<=51)||LA69_2==76||LA69_2==78||LA69_2==84||LA69_2==91) ) {
                    alt69=1;
                }
                else if ( (LA69_2==67) ) {
                    alt69=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA69_3 = input.LA(2);

                if ( (LA69_3==67) ) {
                    alt69=2;
                }
                else if ( (LA69_3==26||LA69_3==30||LA69_3==32||LA69_3==34||(LA69_3>=36 && LA69_3<=51)||LA69_3==76||LA69_3==78||LA69_3==84||LA69_3==91) ) {
                    alt69=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt69=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4437:3: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10119);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4452:8: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePatternExpCS_in_ruleIfExpCS10138);
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

            otherlv_2=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleIfExpCS10153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4474:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4475:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4475:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4476:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10174);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4492:2: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==87) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4493:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4493:1: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4494:3: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElseIfThenExpCS_in_ruleIfExpCS10195);
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
            	    break loop70;
                }
            } while (true);

            otherlv_5=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleIfExpCS10208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4514:1: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4515:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4515:1: (lv_ownedElseExpression_6_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4516:3: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleIfExpCS10229);
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

            otherlv_7=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleIfExpCS10241); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4544:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4545:2: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4546:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElseIfThenExpCS_in_entryRuleElseIfThenExpCS10277);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElseIfThenExpCS10287); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4553:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4556:28: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4557:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4557:1: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4557:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleElseIfThenExpCS10324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4561:1: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4562:1: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4562:1: (lv_ownedCondition_1_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4563:3: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10345);
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

            otherlv_2=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleElseIfThenExpCS10357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4583:1: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4584:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4584:1: (lv_ownedThenExpression_3_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4585:3: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10378);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4609:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4610:2: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4611:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS10414);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpCS10424); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4618:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4621:28: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4622:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4622:1: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4622:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleLetExpCS10461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4626:1: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4627:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4627:1: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4628:3: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10482);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4644:2: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==29) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4644:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLetExpCS10495); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4648:1: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4649:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4649:1: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4650:3: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10516);
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
            	    break loop71;
                }
            } while (true);

            otherlv_4=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleLetExpCS10530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4670:1: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4671:1: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4671:1: (lv_ownedInExpression_5_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4672:3: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetExpCS10551);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4696:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4697:2: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4698:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS10587);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetVariableCS10597); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4705:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
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
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4708:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4709:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4709:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4709:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4709:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4710:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4710:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4711:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS10643);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4727:2: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==26) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4728:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4728:1: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4729:3: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRoundBracketedClauseCS_in_ruleLetVariableCS10664);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4745:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==67) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4745:5: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleLetVariableCS10678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4749:1: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4750:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4750:1: (lv_ownedType_3_0= ruleTypeExpCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4751:3: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS10699);
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

            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLetVariableCS10713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4771:1: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4772:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4772:1: (lv_ownedInitExpression_5_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4773:3: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleLetVariableCS10734);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4797:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4798:2: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4799:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS10770);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNestedExpCS10780); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4806:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4809:28: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4810:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4810:1: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4810:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNestedExpCS10817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4814:1: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4815:1: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4815:1: (lv_ownedExpression_1_0= ruleExpCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4816:3: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_ruleNestedExpCS10838);
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

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleNestedExpCS10850); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4844:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4845:2: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4846:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS10886);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelfExpCS10896); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4853:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4856:28: ( ( () otherlv_1= 'self' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4857:1: ( () otherlv_1= 'self' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4857:1: ( () otherlv_1= 'self' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4857:2: () otherlv_1= 'self'
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4857:2: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4858:2: 
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

            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleSelfExpCS10945); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4878:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4879:2: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4880:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS10981);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS10991); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4887:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4890:28: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4891:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4891:1: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4891:2: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4891:2: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4892:1: (lv_lowerBound_0_0= ruleLOWER )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4892:1: (lv_lowerBound_0_0= ruleLOWER )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4893:3: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS11037);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4909:2: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==68) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4909:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleMultiplicityBoundsCS11050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4913:1: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4914:1: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4914:1: (lv_upperBound_2_0= ruleUPPER )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4915:3: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS11071);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4939:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4940:2: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4941:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS11109);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityCS11119); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4948:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4951:28: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4952:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4952:1: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4952:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleMultiplicityCS11156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4956:1: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_INT) ) {
                alt75=1;
            }
            else if ( (LA75_0==36||LA75_0==38||LA75_0==90) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4957:2: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS11182);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4970:2: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS11212);
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

            otherlv_3=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleMultiplicityCS11224); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4993:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4994:2: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:4995:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS11260);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicityStringCS11270); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5002:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5005:28: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5006:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5006:1: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5007:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5007:1: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5008:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5008:1: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt76=1;
                }
                break;
            case 38:
                {
                alt76=2;
                }
                break;
            case 90:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5009:3: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultiplicityStringCS11314); if (state.failed) return current;
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5021:8: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMultiplicityStringCS11343); if (state.failed) return current;
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5033:8: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleMultiplicityStringCS11372); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5056:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5057:2: (iv_rulePathNameCS= rulePathNameCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5058:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_entryRulePathNameCS11423);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePathNameCS11433); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5065:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5068:28: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5069:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5069:1: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5069:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5069:2: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5070:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5070:1: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5071:3: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS11479);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5087:2: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==91) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5087:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,91,FollowSets000.FOLLOW_91_in_rulePathNameCS11492); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	          
            	    }
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5091:1: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5092:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5092:1: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5093:3: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_rulePathNameCS11513);
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
            	    break loop77;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5117:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5118:2: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5119:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS11551);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFirstPathElementCS11561); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5126:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5129:28: ( ( ( ruleUnrestrictedName ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5130:1: ( ( ruleUnrestrictedName ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5130:1: ( ( ruleUnrestrictedName ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5131:1: ( ruleUnrestrictedName )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5131:1: ( ruleUnrestrictedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5132:3: ruleUnrestrictedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS11612);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5156:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5157:2: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5158:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS11647);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextPathElementCS11657); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5165:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5168:28: ( ( ( ruleUnreservedName ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5169:1: ( ( ruleUnreservedName ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5169:1: ( ( ruleUnreservedName ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5170:1: ( ruleUnreservedName )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5170:1: ( ruleUnreservedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5171:3: ruleUnreservedName
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
            pushFollow(FollowSets000.FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS11708);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5195:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5196:2: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5197:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateBindingCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateBindingCS_in_entryRuleTemplateBindingCS11743);
            iv_ruleTemplateBindingCS=ruleTemplateBindingCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateBindingCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateBindingCS11753); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5204:1: ruleTemplateBindingCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedSubstitutions_1_0 = null;

        EObject lv_ownedSubstitutions_3_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5207:28: ( (otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5208:1: (otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5208:1: (otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')' )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5208:3: otherlv_0= '(' ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTemplateBindingCS11790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateBindingCSAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5212:1: ( (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5213:1: (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5213:1: (lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5214:3: lv_ownedSubstitutions_1_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11811);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5230:2: (otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==29) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5230:4: otherlv_2= ',' ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTemplateBindingCS11824); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5234:1: ( (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS ) )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5235:1: (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5235:1: (lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS )
            	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5236:3: lv_ownedSubstitutions_3_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11845);
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
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTemplateBindingCS11859); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5264:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5265:2: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5266:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemplateParameterSubstitutionCS_in_entryRuleTemplateParameterSubstitutionCS11895);
            iv_ruleTemplateParameterSubstitutionCS=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterSubstitutionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemplateParameterSubstitutionCS11905); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5273:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5276:28: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5277:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5277:1: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5278:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5278:1: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5279:3: lv_ownedActualParameter_0_0= ruleTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSAccess().getOwnedActualParameterTypeRefCSParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeRefCS_in_ruleTemplateParameterSubstitutionCS11950);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5305:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5306:2: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5307:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeParameterCS_in_entryRuleTypeParameterCS11987);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeParameterCS11997); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5314:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5317:28: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5318:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5318:1: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5318:2: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5318:2: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5319:1: (lv_name_0_0= ruleUnrestrictedName )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5319:1: (lv_name_0_0= ruleUnrestrictedName )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5320:3: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnrestrictedName_in_ruleTypeParameterCS12043);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5336:2: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==92) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5336:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleTypeParameterCS12056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5340:1: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5341:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5341:1: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5342:3: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12077);
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

                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5358:2: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==93) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5358:4: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleTypeParameterCS12090); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5362:1: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5363:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5363:1: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5364:3: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12111);
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
                    	    break loop79;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5388:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5389:2: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5390:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeRefCS_in_entryRuleTypeRefCS12151);
            iv_ruleTypeRefCS=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeRefCS12161); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5397:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5400:28: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5401:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5401:1: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_SIMPLE_ID && LA81_0<=RULE_ESCAPED_ID)) ) {
                alt81=1;
            }
            else if ( (LA81_0==90) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5402:2: this_TypedRefCS_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getTypedRefCSParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleTypeRefCS12211);
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5415:2: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleWildcardTypeRefCS_in_ruleTypeRefCS12241);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5434:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5435:2: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5436:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_entryRuleTypedRefCS12276);
            iv_ruleTypedRefCS=ruleTypedRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedRefCS12286); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5443:1: ruleTypedRefCS returns [EObject current=null] : this_TypedTypeRefCS_0= ruleTypedTypeRefCS ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTypeRefCS_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5446:28: (this_TypedTypeRefCS_0= ruleTypedTypeRefCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5448:2: this_TypedTypeRefCS_0= ruleTypedTypeRefCS
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypedTypeRefCSParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedTypeRefCS_in_ruleTypedRefCS12335);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5467:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5468:2: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5469:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedTypeRefCS_in_entryRuleTypedTypeRefCS12369);
            iv_ruleTypedTypeRefCS=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedTypeRefCS12379); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5476:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_1_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5479:28: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5480:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5480:1: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5480:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5480:2: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5481:1: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5481:1: (lv_ownedPathName_0_0= rulePathNameCS )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5482:3: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePathNameCS_in_ruleTypedTypeRefCS12425);
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

            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5498:2: ( (lv_ownedBinding_1_0= ruleTemplateBindingCS ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==26) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5499:1: (lv_ownedBinding_1_0= ruleTemplateBindingCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5499:1: (lv_ownedBinding_1_0= ruleTemplateBindingCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5500:3: lv_ownedBinding_1_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemplateBindingCS_in_ruleTypedTypeRefCS12446);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5524:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5525:2: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5526:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleWildcardTypeRefCS_in_entryRuleWildcardTypeRefCS12483);
            iv_ruleWildcardTypeRefCS=ruleWildcardTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWildcardTypeRefCS12493); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5533:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5536:28: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5537:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5537:1: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5537:2: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5537:2: ()
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5538:2: 
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

            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleWildcardTypeRefCS12542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5550:1: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==92) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5550:3: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleWildcardTypeRefCS12555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5554:1: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5555:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5555:1: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5556:3: lv_ownedExtends_3_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWildcardTypeRefCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedRefCS_in_ruleWildcardTypeRefCS12576);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5580:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5581:2: (iv_ruleID= ruleID EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5582:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_entryRuleID12615);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleID12626); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5589:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5592:28: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5593:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5593:1: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_SIMPLE_ID) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_ESCAPED_ID) ) {
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
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5593:6: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_RULE_SIMPLE_ID_in_ruleID12666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SIMPLE_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5601:10: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_RULE_ESCAPED_ID_in_ruleID12692); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5616:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5617:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5618:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier12738);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier12749); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5625:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;


         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5628:28: (this_ID_0= ruleID )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5630:5: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleID_in_ruleIdentifier12795);
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5648:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5649:2: (iv_ruleLOWER= ruleLOWER EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5650:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLOWER_in_entryRuleLOWER12840);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLOWER12851); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5657:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5660:28: (this_INT_0= RULE_INT )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5661:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLOWER12890); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5676:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5677:2: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5678:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL12935);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNUMBER_LITERAL12946); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5685:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5688:28: (this_INT_0= RULE_INT )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5689:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL12985); if (state.failed) return current;
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


    // $ANTLR start "entryRuleUPPER"
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5704:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5705:2: (iv_ruleUPPER= ruleUPPER EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5706:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUPPER_in_entryRuleUPPER13030);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUPPER13041); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5713:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5716:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5717:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5717:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_INT) ) {
                alt85=1;
            }
            else if ( (LA85_0==36) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5717:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUPPER13081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5726:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUPPER13105); if (state.failed) return current;
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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5739:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5740:2: (iv_ruleURI= ruleURI EOF )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5741:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleURI_in_entryRuleURI13146);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleURI13157); if (state.failed) return current;

            }

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
    // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5748:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;

         enterRule(); 
            
        try {
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5751:28: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:5752:5: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI13196); if (state.failed) return current;
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


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:435:2: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:435:2: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
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


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:448:2: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:448:2: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
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


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:461:2: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:461:2: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
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


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:487:2: (this_ListLiteralExpCS_8= ruleListLiteralExpCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:487:2: this_ListLiteralExpCS_8= ruleListLiteralExpCS
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


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:500:2: (this_DictLiteralExpCS_9= ruleDictLiteralExpCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:500:2: this_DictLiteralExpCS_9= ruleDictLiteralExpCS
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


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:513:2: (this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:513:2: this_TypeLiteralExpCS_10= ruleTypeLiteralExpCS
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


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: ( (lv_value_2_0= ruleExpCS ) )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: (lv_value_2_0= ruleExpCS )
        {
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:810:1: (lv_value_2_0= ruleExpCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:811:3: lv_value_2_0= ruleExpCS
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

    // $ANTLR start synpred86_InternalImperativeOCL
    public final void synpred86_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3215:2: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3215:2: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleTypeLiteralCS_in_synpred86_InternalImperativeOCL7695);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_InternalImperativeOCL

    // $ANTLR start synpred88_InternalImperativeOCL
    public final void synpred88_InternalImperativeOCL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:2: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
        {
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:2: ()
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3291:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3299:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3300:1: (lv_name_2_0= ruleBinaryOperatorName )
        {
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3300:1: (lv_name_2_0= ruleBinaryOperatorName )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3301:3: lv_name_2_0= ruleBinaryOperatorName
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_synpred88_InternalImperativeOCL7877);
        lv_name_2_0=ruleBinaryOperatorName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3317:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3318:1: (lv_ownedRight_3_0= ruleExpCS )
        {
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3318:1: (lv_ownedRight_3_0= ruleExpCS )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3319:3: lv_ownedRight_3_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred88_InternalImperativeOCL7898);
        lv_ownedRight_3_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred88_InternalImperativeOCL

    // $ANTLR start synpred89_InternalImperativeOCL
    public final void synpred89_InternalImperativeOCL_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3278:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3278:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3278:2: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3279:2: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_rulePrefixedPrimaryExpCS_in_synpred89_InternalImperativeOCL7844);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==32||LA96_0==34||(LA96_0>=36 && LA96_0<=51)) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:2: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3290:2: ()
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3291:2: 
                {
                if ( state.backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3299:2: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3300:1: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3300:1: (lv_name_2_0= ruleBinaryOperatorName )
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3301:3: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleBinaryOperatorName_in_synpred89_InternalImperativeOCL7877);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3317:2: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3318:1: (lv_ownedRight_3_0= ruleExpCS )
                {
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3318:1: (lv_ownedRight_3_0= ruleExpCS )
                // ../../examples/org.eclipse.qvto.examples.xtext.imperativeocl/src-gen/org/eclipse/qvto/examples/xtext/imperativeocl/parser/antlr/internal/InternalImperativeOCL.g:3319:3: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleExpCS_in_synpred89_InternalImperativeOCL7898);
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
    // $ANTLR end synpred89_InternalImperativeOCL

    // Delegated rules

    public final boolean synpred89_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalImperativeOCL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred86_InternalImperativeOCL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalImperativeOCL_fragment(); // can never throw exception
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
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA2_eotS =
        "\46\uffff";
    static final String DFA2_eofS =
        "\46\uffff";
    static final String DFA2_minS =
        "\1\4\13\uffff\7\0\1\uffff\2\0\20\uffff";
    static final String DFA2_maxS =
        "\1\131\13\uffff\7\0\1\uffff\2\0\20\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\16\uffff\1\10\2\uffff\1\13\7\uffff\1\14"+
        "\1\15\1\uffff\1\5\1\6\1\7\1\11\1\12";
    static final String DFA2_specialS =
        "\14\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\20\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\4\2\37\1\4\20\uffff\1\24\1\1\1\uffff\1\25\4\uffff\1\36\2"+
            "\uffff\1\4\17\uffff\1\15\1\14\10\26\1\16\1\17\1\20\1\21\1\22"+
            "\3\uffff\1\23\1\uffff\4\4\7\uffff\1\2\5\uffff\1\3",
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
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalImperativeOCL()) ) {s = 33;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_13 = input.LA(1);

                         
                        int index2_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalImperativeOCL()) ) {s = 34;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 35;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_15 = input.LA(1);

                         
                        int index2_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 35;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 35;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_17 = input.LA(1);

                         
                        int index2_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 35;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_18 = input.LA(1);

                         
                        int index2_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalImperativeOCL()) ) {s = 35;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_18);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_20 = input.LA(1);

                         
                        int index2_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalImperativeOCL()) ) {s = 36;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_20);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_21 = input.LA(1);

                         
                        int index2_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalImperativeOCL()) ) {s = 37;}

                        else if ( (synpred16_InternalImperativeOCL()) ) {s = 22;}

                         
                        input.seek(index2_21);
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
        "\103\uffff";
    static final String DFA7_eofS =
        "\1\44\102\uffff";
    static final String DFA7_minS =
        "\1\4\1\0\11\uffff\1\0\67\uffff";
    static final String DFA7_maxS =
        "\1\131\1\0\11\uffff\1\0\67\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\41\uffff\1\2\36\uffff";
    static final String DFA7_specialS =
        "\1\uffff\1\0\11\uffff\1\1\67\uffff}>";
    static final String[] DFA7_transitionS = {
            "\5\2\20\uffff\2\2\1\44\1\2\1\44\1\uffff\2\44\1\2\1\1\1\2\1"+
            "\13\17\44\17\2\2\44\1\uffff\1\2\1\44\4\2\3\uffff\4\44\1\2\4"+
            "\44\2\2",
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

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalImperativeOCL()) ) {s = 2;}

                        else if ( (true) ) {s = 36;}

                         
                        input.seek(index7_11);
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
    static final String DFA40_eotS =
        "\25\uffff";
    static final String DFA40_eofS =
        "\25\uffff";
    static final String DFA40_minS =
        "\1\6\12\uffff\5\0\5\uffff";
    static final String DFA40_maxS =
        "\1\102\12\uffff\5\0\5\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\20\uffff\1\3";
    static final String DFA40_specialS =
        "\13\uffff\1\0\1\1\1\2\1\3\1\4\5\uffff}>";
    static final String[] DFA40_transitionS = {
            "\2\1\21\uffff\1\3\2\uffff\1\3\27\uffff\12\3\1\13\1\14\1\15"+
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "3201:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_11 = input.LA(1);

                         
                        int index40_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index40_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_12 = input.LA(1);

                         
                        int index40_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index40_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_13 = input.LA(1);

                         
                        int index40_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index40_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_14 = input.LA(1);

                         
                        int index40_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index40_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_15 = input.LA(1);

                         
                        int index40_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index40_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\44\uffff";
    static final String DFA43_eofS =
        "\44\uffff";
    static final String DFA43_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA43_maxS =
        "\1\131\2\0\41\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\1\1\37\uffff\1\2";
    static final String DFA43_specialS =
        "\1\uffff\1\0\1\1\41\uffff}>";
    static final String[] DFA43_transitionS = {
            "\5\3\20\uffff\2\3\1\uffff\1\3\4\uffff\1\3\1\1\1\2\1\3\17\uffff"+
            "\17\3\3\uffff\1\3\1\uffff\4\3\7\uffff\1\3\4\uffff\1\43\1\3",
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
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "3278:1: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalImperativeOCL()) ) {s = 3;}

                        else if ( (true) ) {s = 35;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\25\uffff";
    static final String DFA42_eofS =
        "\1\23\24\uffff";
    static final String DFA42_minS =
        "\1\33\22\0\2\uffff";
    static final String DFA42_maxS =
        "\1\127\22\0\2\uffff";
    static final String DFA42_acceptS =
        "\23\uffff\1\2\1\1";
    static final String DFA42_specialS =
        "\1\uffff\1\12\1\2\1\0\1\4\1\5\1\7\1\6\1\1\1\3\1\14\1\13\1\17\1"+
        "\21\1\11\1\20\1\16\1\10\1\15\2\uffff}>";
    static final String[] DFA42_transitionS = {
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
            return "3290:1: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_4 = input.LA(1);

                         
                        int index42_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_7 = input.LA(1);

                         
                        int index42_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA42_17 = input.LA(1);

                         
                        int index42_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_17);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA42_14 = input.LA(1);

                         
                        int index42_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA42_11 = input.LA(1);

                         
                        int index42_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA42_10 = input.LA(1);

                         
                        int index42_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_10);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA42_18 = input.LA(1);

                         
                        int index42_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_18);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA42_16 = input.LA(1);

                         
                        int index42_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA42_12 = input.LA(1);

                         
                        int index42_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_12);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA42_15 = input.LA(1);

                         
                        int index42_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_15);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA42_13 = input.LA(1);

                         
                        int index42_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalImperativeOCL()) ) {s = 20;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index42_13);
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
        public static final BitSet FOLLOW_26_in_ruleListTypeCS579 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleListTypeCS600 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleListTypeCS612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictTypeCS_in_entryRuleDictTypeCS648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDictTypeCS658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDictTypeCS695 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleDictTypeCS707 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleDictTypeCS728 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDictTypeCS740 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
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
        public static final BitSet FOLLOW_30_in_ruleListLiteralExpCS1323 = new BitSet(new long[]{0xFFF0001E960001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleListLiteralExpCS1357 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleListLiteralExpCS1370 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleListLiteralExpCS1391 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleListLiteralExpCS1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictLiteralExpCS_in_entryRuleDictLiteralExpCS1443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDictLiteralExpCS1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDictLiteralExpCS1490 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDictLiteralExpCS1502 = new BitSet(new long[]{0x0000001080000130L,0x0000000000000F00L});
        public static final BitSet FOLLOW_ruleDictLiteralPartCS_in_ruleDictLiteralExpCS1536 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleDictLiteralExpCS1549 = new BitSet(new long[]{0x0000001000000130L,0x0000000000000F00L});
        public static final BitSet FOLLOW_ruleDictLiteralPartCS_in_ruleDictLiteralExpCS1570 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleDictLiteralExpCS1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictLiteralPartCS_in_entryRuleDictLiteralPartCS1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDictLiteralPartCS1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_ruleDictLiteralPartCS1678 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDictLiteralPartCS1690 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleDictLiteralPartCS1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReturnExpCS_in_entryRuleReturnExpCS1747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReturnExpCS1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleReturnExpCS1794 = new BitSet(new long[]{0xFFF0001E160001F2L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleReturnExpCS1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleStringLiteral1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_QUOTED_STRING_in_ruleStringLiteral1942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorName_in_entryRuleEssentialOCLUnaryOperatorName1992 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnaryOperatorName2003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLUnaryOperatorName2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEssentialOCLUnaryOperatorName2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorName_in_entryRuleEssentialOCLInfixOperatorName2101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLInfixOperatorName2112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEssentialOCLInfixOperatorName2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEssentialOCLInfixOperatorName2169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEssentialOCLInfixOperatorName2188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEssentialOCLInfixOperatorName2207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEssentialOCLInfixOperatorName2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEssentialOCLInfixOperatorName2245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleEssentialOCLInfixOperatorName2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEssentialOCLInfixOperatorName2283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEssentialOCLInfixOperatorName2302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleEssentialOCLInfixOperatorName2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleEssentialOCLInfixOperatorName2340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleEssentialOCLInfixOperatorName2359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEssentialOCLInfixOperatorName2378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEssentialOCLInfixOperatorName2397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorName_in_entryRuleEssentialOCLNavigationOperatorName2438 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLNavigationOperatorName2449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleEssentialOCLNavigationOperatorName2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEssentialOCLNavigationOperatorName2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleEssentialOCLNavigationOperatorName2525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleEssentialOCLNavigationOperatorName2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_entryRuleBinaryOperatorName2585 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperatorName2596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorName_in_ruleBinaryOperatorName2643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorName_in_ruleBinaryOperatorName2676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInfixOperatorName_in_entryRuleInfixOperatorName2722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInfixOperatorName2733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLInfixOperatorName_in_ruleInfixOperatorName2779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigationOperatorName_in_entryRuleNavigationOperatorName2824 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigationOperatorName2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLNavigationOperatorName_in_ruleNavigationOperatorName2881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_entryRuleUnaryOperatorName2926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperatorName2937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnaryOperatorName_in_ruleUnaryOperatorName2983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_entryRuleEssentialOCLUnrestrictedName3028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnrestrictedName3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleEssentialOCLUnrestrictedName3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_entryRuleUnrestrictedName3130 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnrestrictedName3141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnrestrictedName_in_ruleUnrestrictedName3187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_entryRuleEssentialOCLUnreservedName3232 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEssentialOCLUnreservedName3243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleEssentialOCLUnreservedName3290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleEssentialOCLUnreservedName3323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_ruleEssentialOCLUnreservedName3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEssentialOCLUnreservedName3380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleEssentialOCLUnreservedName3399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_entryRuleUnreservedName3440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnreservedName3451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEssentialOCLUnreservedName_in_ruleUnreservedName3497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURIFirstPathElementCS_in_entryRuleURIFirstPathElementCS3543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURIFirstPathElementCS3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleURIFirstPathElementCS3605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_ruleURIFirstPathElementCS3651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_entryRulePrimitiveTypeIdentifier3689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeIdentifier3700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulePrimitiveTypeIdentifier3738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rulePrimitiveTypeIdentifier3757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulePrimitiveTypeIdentifier3776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePrimitiveTypeIdentifier3795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rulePrimitiveTypeIdentifier3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rulePrimitiveTypeIdentifier3833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulePrimitiveTypeIdentifier3852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rulePrimitiveTypeIdentifier3871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeCS_in_entryRulePrimitiveTypeCS3911 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeCS3921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveTypeIdentifier_in_rulePrimitiveTypeCS3966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_entryRuleCollectionTypeIdentifier4002 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeIdentifier4013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCollectionTypeIdentifier4051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleCollectionTypeIdentifier4070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCollectionTypeIdentifier4089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleCollectionTypeIdentifier4108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCollectionTypeIdentifier4127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_entryRuleCollectionTypeCS4167 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionTypeCS4177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeIdentifier_in_ruleCollectionTypeCS4223 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleCollectionTypeCS4236 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleCollectionTypeCS4257 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleCollectionTypeCS4269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_entryRuleMapTypeCS4307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapTypeCS4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleMapTypeCS4360 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleMapTypeCS4386 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4407 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleMapTypeCS4419 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleMapTypeCS4440 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMapTypeCS4452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeCS_in_entryRuleTupleTypeCS4490 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeCS4500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTupleTypeCS4543 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleTupleTypeCS4569 = new BitSet(new long[]{0x00000000080000C0L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4591 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_29_in_ruleTupleTypeCS4604 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_ruleTupleTypeCS4625 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_27_in_ruleTupleTypeCS4641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTuplePartCS_in_entryRuleTuplePartCS4679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTuplePartCS4689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTuplePartCS4735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleTuplePartCS4747 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTuplePartCS4768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_entryRuleCollectionLiteralExpCS4804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralExpCS4814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionLiteralExpCS4860 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleCollectionLiteralExpCS4872 = new BitSet(new long[]{0xFFF0001E960001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4894 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleCollectionLiteralExpCS4907 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_ruleCollectionLiteralExpCS4928 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionLiteralExpCS4944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralPartCS_in_entryRuleCollectionLiteralPartCS4980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionLiteralPartCS4990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS5037 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleCollectionLiteralPartCS5050 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleCollectionLiteralPartCS5071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionLiteralPartCS5101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionPatternCS_in_entryRuleCollectionPatternCS5137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectionPatternCS5147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionTypeCS_in_ruleCollectionPatternCS5193 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleCollectionPatternCS5205 = new BitSet(new long[]{0xFFF0001E960001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5227 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_29_in_ruleCollectionPatternCS5240 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleCollectionPatternCS5261 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_69_in_ruleCollectionPatternCS5276 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleCollectionPatternCS5297 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCollectionPatternCS5312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_entryRuleShadowPartCS5348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShadowPartCS5358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleShadowPartCS5410 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleShadowPartCS5422 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleShadowPartCS5445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleShadowPartCS5464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_entryRulePatternExpCS5503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePatternExpCS5513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_rulePatternExpCS5559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_rulePatternExpCS5572 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_rulePatternExpCS5593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLambdaLiteralExpCS_in_entryRuleLambdaLiteralExpCS5629 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLambdaLiteralExpCS5639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleLambdaLiteralExpCS5676 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLambdaLiteralExpCS5688 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLambdaLiteralExpCS5709 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleLambdaLiteralExpCS5721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_entryRuleMapLiteralExpCS5757 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapLiteralExpCS5767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapTypeCS_in_ruleMapLiteralExpCS5813 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleMapLiteralExpCS5825 = new BitSet(new long[]{0xFFF0001E960001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5847 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleMapLiteralExpCS5860 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_ruleMapLiteralExpCS5881 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleMapLiteralExpCS5897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralPartCS_in_entryRuleMapLiteralPartCS5933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMapLiteralPartCS5943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS5989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleMapLiteralPartCS6001 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleMapLiteralPartCS6022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveLiteralExpCS_in_entryRulePrimitiveLiteralExpCS6058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveLiteralExpCS6068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_rulePrimitiveLiteralExpCS6118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_rulePrimitiveLiteralExpCS6148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_rulePrimitiveLiteralExpCS6178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_rulePrimitiveLiteralExpCS6208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_rulePrimitiveLiteralExpCS6238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_rulePrimitiveLiteralExpCS6268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_entryRuleTupleLiteralExpCS6303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpCS6313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTupleLiteralExpCS6350 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleTupleLiteralExpCS6362 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6383 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleTupleLiteralExpCS6396 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_ruleTupleLiteralExpCS6417 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_31_in_ruleTupleLiteralExpCS6431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralPartCS_in_entryRuleTupleLiteralPartCS6467 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralPartCS6477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTupleLiteralPartCS6523 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleTupleLiteralPartCS6536 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleTupleLiteralPartCS6557 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleTupleLiteralPartCS6571 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTupleLiteralPartCS6592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberLiteralExpCS_in_entryRuleNumberLiteralExpCS6628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteralExpCS6638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_ruleNumberLiteralExpCS6683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteralExpCS_in_entryRuleStringLiteralExpCS6718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteralExpCS6728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleStringLiteralExpCS6773 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpCS_in_entryRuleBooleanLiteralExpCS6809 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpCS6819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleBooleanLiteralExpCS6862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleBooleanLiteralExpCS6899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnlimitedNaturalLiteralExpCS_in_entryRuleUnlimitedNaturalLiteralExpCS6948 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedNaturalLiteralExpCS6958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleUnlimitedNaturalLiteralExpCS7007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvalidLiteralExpCS_in_entryRuleInvalidLiteralExpCS7043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvalidLiteralExpCS7053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleInvalidLiteralExpCS7102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNullLiteralExpCS_in_entryRuleNullLiteralExpCS7138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteralExpCS7148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleNullLiteralExpCS7197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_entryRuleTypeLiteralWithMultiplicityCS7233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralWithMultiplicityCS7243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeLiteralWithMultiplicityCS7293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeLiteralWithMultiplicityCS7313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_entryRuleTypeLiteralExpCS7350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteralExpCS7360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralWithMultiplicityCS_in_ruleTypeLiteralExpCS7405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_entryRuleTypeNameExpCS7440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameExpCS7450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypeNameExpCS7496 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_ruleTypeNameExpCS7518 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleTypeNameExpCS7531 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleTypeNameExpCS7552 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleTypeNameExpCS7564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_entryRuleTypeExpCS7604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeExpCS7614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeNameExpCS_in_ruleTypeExpCS7665 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_ruleTypeExpCS7695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleCollectionPatternCS_in_ruleTypeExpCS7725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_ruleTypeExpCS7746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_entryRuleExpCS7783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpCS7793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_ruleExpCS7844 = new BitSet(new long[]{0x000FFFF500000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_ruleExpCS7877 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleExpCS7898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_ruleExpCS7932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_entryRulePrefixedLetExpCS7967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedLetExpCS7977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_rulePrefixedLetExpCS8036 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_rulePrefixedLetExpCS_in_rulePrefixedLetExpCS8057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_rulePrefixedLetExpCS8089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_entryRulePrefixedPrimaryExpCS8124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrefixedPrimaryExpCS8134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperatorName_in_rulePrefixedPrimaryExpCS8193 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000002080F47L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_rulePrefixedPrimaryExpCS8214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpCS_in_rulePrefixedPrimaryExpCS8246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNameExpCS_in_entryRuleNameExpCS8281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNameExpCS8291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleNameExpCS8337 = new BitSet(new long[]{0x0000000044000002L,0x0000000000005000L});
        public static final BitSet FOLLOW_ruleSquareBracketedClauseCS_in_ruleNameExpCS8358 = new BitSet(new long[]{0x0000000044000002L,0x0000000000005000L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_ruleNameExpCS8380 = new BitSet(new long[]{0x0000000040000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_ruleNameExpCS8402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_ruleNameExpCS8422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruleNameExpCS8447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurlyBracketedClauseCS_in_entryRuleCurlyBracketedClauseCS8485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCurlyBracketedClauseCS8495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCurlyBracketedClauseCS8544 = new BitSet(new long[]{0x00000000800000F0L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8567 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_29_in_ruleCurlyBracketedClauseCS8580 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleShadowPartCS_in_ruleCurlyBracketedClauseCS8601 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleCurlyBracketedClauseCS8632 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCurlyBracketedClauseCS8645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_entryRuleRoundBracketedClauseCS8681 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoundBracketedClauseCS8691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleRoundBracketedClauseCS8740 = new BitSet(new long[]{0xFFF0001E1E0001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_ruleRoundBracketedClauseCS8762 = new BitSet(new long[]{0x0000000028000000L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8783 = new BitSet(new long[]{0x0000000028000000L,0x0000000000060000L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_ruleRoundBracketedClauseCS8806 = new BitSet(new long[]{0x0000000028000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8827 = new BitSet(new long[]{0x0000000028000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_ruleRoundBracketedClauseCS8852 = new BitSet(new long[]{0x0000000028000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_ruleRoundBracketedClauseCS8873 = new BitSet(new long[]{0x0000000028000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_27_in_ruleRoundBracketedClauseCS8890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSquareBracketedClauseCS_in_entryRuleSquareBracketedClauseCS8926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSquareBracketedClauseCS8936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleSquareBracketedClauseCS8973 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS8994 = new BitSet(new long[]{0x0000000020000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_29_in_ruleSquareBracketedClauseCS9007 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleSquareBracketedClauseCS9028 = new BitSet(new long[]{0x0000000020000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleSquareBracketedClauseCS9042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgCS_in_entryRuleNavigatingArgCS9078 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgCS9088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingArgCS9135 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingArgCS9149 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9170 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingArgCS9183 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleNavigatingArgCS9226 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgCS9247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingArgCS9270 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingArgCS9291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingBarArgCS_in_entryRuleNavigatingBarArgCS9328 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingBarArgCS9338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleNavigatingBarArgCS9381 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingBarArgCS9415 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingBarArgCS9428 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingBarArgCS9449 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingBarArgCS9462 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingBarArgCS9483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingCommaArgCS_in_entryRuleNavigatingCommaArgCS9523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingCommaArgCS9533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleNavigatingCommaArgCS9576 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingCommaArgCS9610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingCommaArgCS9624 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingCommaArgCS9645 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingCommaArgCS9658 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleNavigatingCommaArgCS9701 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingCommaArgCS9722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingSemiArgCS_in_entryRuleNavigatingSemiArgCS9761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingSemiArgCS9771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleNavigatingSemiArgCS9814 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_ruleNavigatingSemiArgCS9848 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleNavigatingSemiArgCS9861 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleNavigatingSemiArgCS9882 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleNavigatingSemiArgCS9895 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingSemiArgCS9916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNavigatingArgExpCS_in_entryRuleNavigatingArgExpCS9956 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNavigatingArgExpCS9966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNavigatingArgExpCS10015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfExpCS_in_entryRuleIfExpCS10049 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfExpCS10059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleIfExpCS10096 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F4FL});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_rulePatternExpCS_in_ruleIfExpCS10138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleIfExpCS10153 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000A00000L});
        public static final BitSet FOLLOW_ruleElseIfThenExpCS_in_ruleIfExpCS10195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000A00000L});
        public static final BitSet FOLLOW_85_in_ruleIfExpCS10208 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleIfExpCS10229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_86_in_ruleIfExpCS10241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElseIfThenExpCS_in_entryRuleElseIfThenExpCS10277 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElseIfThenExpCS10287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleElseIfThenExpCS10324 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleElseIfThenExpCS10357 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleElseIfThenExpCS10378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpCS_in_entryRuleLetExpCS10414 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpCS10424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleLetExpCS10461 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10482 = new BitSet(new long[]{0x0000000020000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_29_in_ruleLetExpCS10495 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_ruleLetExpCS10516 = new BitSet(new long[]{0x0000000020000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleLetExpCS10530 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetExpCS10551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetVariableCS_in_entryRuleLetVariableCS10587 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetVariableCS10597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleLetVariableCS10643 = new BitSet(new long[]{0x0000000104000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleRoundBracketedClauseCS_in_ruleLetVariableCS10664 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleLetVariableCS10678 = new BitSet(new long[]{0xFFF00000120000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTypeExpCS_in_ruleLetVariableCS10699 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleLetVariableCS10713 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleLetVariableCS10734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNestedExpCS_in_entryRuleNestedExpCS10770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNestedExpCS10780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleNestedExpCS10817 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_ruleNestedExpCS10838 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleNestedExpCS10850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelfExpCS_in_entryRuleSelfExpCS10886 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelfExpCS10896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleSelfExpCS10945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_entryRuleMultiplicityBoundsCS10981 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityBoundsCS10991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_ruleMultiplicityBoundsCS11037 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleMultiplicityBoundsCS11050 = new BitSet(new long[]{0x0000001000000100L});
        public static final BitSet FOLLOW_ruleUPPER_in_ruleMultiplicityBoundsCS11071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityCS_in_entryRuleMultiplicityCS11109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityCS11119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleMultiplicityCS11156 = new BitSet(new long[]{0x0000005000000100L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleMultiplicityBoundsCS_in_ruleMultiplicityCS11182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_ruleMultiplicityCS11212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleMultiplicityCS11224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicityStringCS_in_entryRuleMultiplicityStringCS11260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityStringCS11270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMultiplicityStringCS11314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMultiplicityStringCS11343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleMultiplicityStringCS11372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_entryRulePathNameCS11423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePathNameCS11433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_rulePathNameCS11479 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_91_in_rulePathNameCS11492 = new BitSet(new long[]{0xFFF00000000000C0L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_rulePathNameCS11513 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleFirstPathElementCS_in_entryRuleFirstPathElementCS11551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFirstPathElementCS11561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleFirstPathElementCS11612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextPathElementCS_in_entryRuleNextPathElementCS11647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextPathElementCS11657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnreservedName_in_ruleNextPathElementCS11708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateBindingCS_in_entryRuleTemplateBindingCS11743 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateBindingCS11753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTemplateBindingCS11790 = new BitSet(new long[]{0x00000000000000C0L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11811 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_29_in_ruleTemplateBindingCS11824 = new BitSet(new long[]{0x00000000000000C0L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_ruleTemplateBindingCS11845 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_27_in_ruleTemplateBindingCS11859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemplateParameterSubstitutionCS_in_entryRuleTemplateParameterSubstitutionCS11895 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterSubstitutionCS11905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeRefCS_in_ruleTemplateParameterSubstitutionCS11950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeParameterCS_in_entryRuleTypeParameterCS11987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameterCS11997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnrestrictedName_in_ruleTypeParameterCS12043 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleTypeParameterCS12056 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12077 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleTypeParameterCS12090 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeParameterCS12111 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleTypeRefCS_in_entryRuleTypeRefCS12151 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeRefCS12161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleTypeRefCS12211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcardTypeRefCS_in_ruleTypeRefCS12241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_entryRuleTypedRefCS12276 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedRefCS12286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedTypeRefCS_in_ruleTypedRefCS12335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedTypeRefCS_in_entryRuleTypedTypeRefCS12369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedTypeRefCS12379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePathNameCS_in_ruleTypedTypeRefCS12425 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleTemplateBindingCS_in_ruleTypedTypeRefCS12446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWildcardTypeRefCS_in_entryRuleWildcardTypeRefCS12483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWildcardTypeRefCS12493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleWildcardTypeRefCS12542 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleWildcardTypeRefCS12555 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_ruleTypedRefCS_in_ruleWildcardTypeRefCS12576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_entryRuleID12615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleID12626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SIMPLE_ID_in_ruleID12666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ESCAPED_ID_in_ruleID12692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier12738 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier12749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleID_in_ruleIdentifier12795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLOWER_in_entryRuleLOWER12840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLOWER12851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLOWER12890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNUMBER_LITERAL_in_entryRuleNUMBER_LITERAL12935 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER_LITERAL12946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER_LITERAL12985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUPPER_in_entryRuleUPPER13030 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUPPER13041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUPPER13081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleUPPER13105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleURI_in_entryRuleURI13146 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleURI13157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SINGLE_QUOTED_STRING_in_ruleURI13196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpCS_in_synpred10_InternalImperativeOCL989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMapLiteralExpCS_in_synpred11_InternalImperativeOCL1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectionLiteralExpCS_in_synpred12_InternalImperativeOCL1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListLiteralExpCS_in_synpred14_InternalImperativeOCL1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDictLiteralExpCS_in_synpred15_InternalImperativeOCL1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralExpCS_in_synpred16_InternalImperativeOCL1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred22_InternalImperativeOCL1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeLiteralCS_in_synpred86_InternalImperativeOCL7695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_synpred88_InternalImperativeOCL7877 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred88_InternalImperativeOCL7898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrefixedPrimaryExpCS_in_synpred89_InternalImperativeOCL7844 = new BitSet(new long[]{0x000FFFF500000002L});
        public static final BitSet FOLLOW_ruleBinaryOperatorName_in_synpred89_InternalImperativeOCL7877 = new BitSet(new long[]{0xFFF0001E160001F0L,0x0000000003080F47L});
        public static final BitSet FOLLOW_ruleExpCS_in_synpred89_InternalImperativeOCL7898 = new BitSet(new long[]{0x0000000000000002L});
    }


}