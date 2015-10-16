/*
 * generated by Xtext
 */
package org.eclipse.qvto.examples.xtext.qvtoperational.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.qvto.examples.xtext.qvtoperational.services.QVTOperationalGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class QVTOperationalSyntacticSequencer extends AbstractSyntacticSequencer {

	protected QVTOperationalGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ClassCS_SemicolonKeyword_1_q;
	protected AbstractElementAlias match_ClassifierPropertyCS_TildeKeyword_6_1_q;
	protected AbstractElementAlias match_EntryOperationCS_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_EnumerationCS_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_ExpressionBlockCS_DoKeyword_1_q;
	protected AbstractElementAlias match_ExpressionStatementCS_SemicolonKeyword_1_q;
	protected AbstractElementAlias match_LibraryDefCS_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_MetamodelCS_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_ModelTypeCS___WhereKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_2__q;
	protected AbstractElementAlias match_SwitchExpCS_EndifKeyword_4_q;
	protected AbstractElementAlias match_TransformationDefCS_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	protected AbstractElementAlias match_VarDeclarationCS_ColonColonEqualsSignKeyword_2_0_2_or_ColonEqualsSignKeyword_2_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QVTOperationalGrammarAccess) access;
		match_ClassCS_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getClassCSAccess().getSemicolonKeyword_1());
		match_ClassifierPropertyCS_TildeKeyword_6_1_q = new TokenAlias(false, true, grammarAccess.getClassifierPropertyCSAccess().getTildeKeyword_6_1());
		match_EntryOperationCS_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getEntryOperationCSAccess().getSemicolonKeyword_4());
		match_EnumerationCS_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getEnumerationCSAccess().getSemicolonKeyword_3());
		match_ExpressionBlockCS_DoKeyword_1_q = new TokenAlias(false, true, grammarAccess.getExpressionBlockCSAccess().getDoKeyword_1());
		match_ExpressionStatementCS_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getExpressionStatementCSAccess().getSemicolonKeyword_1());
		match_LibraryDefCS_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getLibraryDefCSAccess().getSemicolonKeyword_4());
		match_MetamodelCS_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getMetamodelCSAccess().getSemicolonKeyword_5());
		match_ModelTypeCS___WhereKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getModelTypeCSAccess().getWhereKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getModelTypeCSAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getModelTypeCSAccess().getRightCurlyBracketKeyword_6_2()));
		match_SwitchExpCS_EndifKeyword_4_q = new TokenAlias(false, true, grammarAccess.getSwitchExpCSAccess().getEndifKeyword_4());
		match_TransformationDefCS_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getTransformationDefCSAccess().getSemicolonKeyword_4());
		match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2()));
		match_VarDeclarationCS_ColonColonEqualsSignKeyword_2_0_2_or_ColonEqualsSignKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getVarDeclarationCSAccess().getColonColonEqualsSignKeyword_2_0_2()), new TokenAlias(false, false, grammarAccess.getVarDeclarationCSAccess().getColonEqualsSignKeyword_2_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ClassCS_SemicolonKeyword_1_q.equals(syntax))
				emit_ClassCS_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassifierPropertyCS_TildeKeyword_6_1_q.equals(syntax))
				emit_ClassifierPropertyCS_TildeKeyword_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EntryOperationCS_SemicolonKeyword_4_q.equals(syntax))
				emit_EntryOperationCS_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumerationCS_SemicolonKeyword_3_q.equals(syntax))
				emit_EnumerationCS_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExpressionBlockCS_DoKeyword_1_q.equals(syntax))
				emit_ExpressionBlockCS_DoKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExpressionStatementCS_SemicolonKeyword_1_q.equals(syntax))
				emit_ExpressionStatementCS_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LibraryDefCS_SemicolonKeyword_4_q.equals(syntax))
				emit_LibraryDefCS_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetamodelCS_SemicolonKeyword_5_q.equals(syntax))
				emit_MetamodelCS_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModelTypeCS___WhereKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_2__q.equals(syntax))
				emit_ModelTypeCS___WhereKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SwitchExpCS_EndifKeyword_4_q.equals(syntax))
				emit_SwitchExpCS_EndifKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TransformationDefCS_SemicolonKeyword_4_q.equals(syntax))
				emit_TransformationDefCS_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VarDeclarationCS_ColonColonEqualsSignKeyword_2_0_2_or_ColonEqualsSignKeyword_2_0_1.equals(syntax))
				emit_VarDeclarationCS_ColonColonEqualsSignKeyword_2_0_2_or_ColonEqualsSignKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=UnrestrictedName (ambiguity) (rule end)
	 *     ownedAnnotations+=TagCS ';' '}' (ambiguity) (rule end)
	 *     ownedOperations+=ClassifierOperationCS ';' '}' (ambiguity) (rule end)
	 *     ownedProperties+=ClassifierPropertyCS ';' '}' (ambiguity) (rule end)
	 *     ownedSuperTypes+=TypedRefCS (ambiguity) (rule end)
	 */
	protected void emit_ClassCS_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '~'?
	 *
	 * This ambiguous syntax occurs at:
	 *     default=SINGLE_QUOTED_STRING 'opposites' (ambiguity) opposite=Identifier
	 *     ownedType=TypedMultiplicityRef2CS 'opposites' (ambiguity) opposite=Identifier
	 */
	protected void emit_ClassifierPropertyCS_TildeKeyword_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     body=OperationBodyCS (ambiguity) (rule end)
	 */
	protected void emit_EntryOperationCS_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     ownedLiterals+=EnumerationLiteralCS '}' (ambiguity) (rule end)
	 */
	protected void emit_EnumerationCS_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'do'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' '}' ';'? (rule start)
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' ownedExps+=ExpressionStatementCS
	 */
	protected void emit_ExpressionBlockCS_DoKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '*' (ambiguity) (rule start)
	 *     (rule start) 'Dict' '{' '}' (ambiguity) (rule start)
	 *     (rule start) 'List' '{' '}' (ambiguity) (rule start)
	 *     (rule start) 'break' (ambiguity) (rule start)
	 *     (rule start) 'continue' (ambiguity) (rule start)
	 *     (rule start) 'do'? '{' '}' (ambiguity) (rule start)
	 *     (rule start) 'invalid' (ambiguity) (rule start)
	 *     (rule start) 'null' (ambiguity) (rule start)
	 *     (rule start) 'return' (ambiguity) (rule start)
	 *     (rule start) 'self' (ambiguity) (rule start)
	 *     isPre?='@' 'pre' (ambiguity) (rule end)
	 *     ownedAltParts+=SwitchAltCS 'endif'? (ambiguity) (rule end)
	 *     ownedArguments+=ExpCS ')' (ambiguity) (rule end)
	 *     ownedAssertion=ExpCS (ambiguity) (rule end)
	 *     ownedBody=ExpCS ')' (ambiguity) (rule end)
	 *     ownedBody=ExpCS (ambiguity) (rule end)
	 *     ownedCatchs+=CatchExpCS (ambiguity) (rule end)
	 *     ownedClassRef=TypeExpCS '(' ')' (ambiguity) (rule end)
	 *     ownedCondition=ExpCS ')' '{' '}' (ambiguity) (rule end)
	 *     ownedCondition=ExpCS ')' (ambiguity) (rule end)
	 *     ownedCondition=ExpCS (ambiguity) (rule end)
	 *     ownedCurlyBracketedClause=CurlyBracketedClauseCS (ambiguity) (rule end)
	 *     ownedDefault=ExpCS (ambiguity) (rule end)
	 *     ownedElement=ExpCS ')' (ambiguity) (rule end)
	 *     ownedElseExpression=ExpCS 'endif' (ambiguity) (rule end)
	 *     ownedElsePart=ExpCS 'endif'? (ambiguity) (rule end)
	 *     ownedExpression=ExpCS ')' (ambiguity) (rule end)
	 *     ownedExpressionCS=ExpCS '}' (ambiguity) (rule end)
	 *     ownedExps+=ExpressionStatementCS '}' (ambiguity) (rule end)
	 *     ownedExtentRef=TypeNameExpCS '(' ')' (ambiguity) (rule end)
	 *     ownedInExpression=ExpCS (ambiguity) (rule end)
	 *     ownedLog=LogExpCS (ambiguity) (rule end)
	 *     ownedMessage=StringLiteralExpCS ')' (ambiguity) (rule end)
	 *     ownedParts+=CollectionLiteralPartCS '}' (ambiguity) (rule end)
	 *     ownedParts+=DictLiteralPartCS '}' (ambiguity) (rule end)
	 *     ownedParts+=MapLiteralPartCS '}' (ambiguity) (rule end)
	 *     ownedParts+=TupleLiteralPartCS '}' (ambiguity) (rule end)
	 *     ownedPathName=PathNameCS (ambiguity) (rule end)
	 *     ownedRight=ExpCS (ambiguity) (rule end)
	 *     ownedRight=PrefixedLetExpCS (ambiguity) (rule end)
	 *     ownedRight=PrefixedPrimaryExpCS (ambiguity) (rule end)
	 *     ownedRoundBracketedClause=RoundBracketedClauseCS (ambiguity) (rule end)
	 *     ownedSquareBracketedClauses+=SquareBracketedClauseCS (ambiguity) (rule end)
	 *     ownedType=CollectionTypeCS '{' '}' (ambiguity) (rule end)
	 *     ownedType=MapTypeCS '{' '}' (ambiguity) (rule end)
	 *     ownedType=TypeLiteralWithMultiplicityCS (ambiguity) (rule end)
	 *     ownedValue=ExpCS (ambiguity) (rule end)
	 *     ownedVarDeclarations+=VarDeclarationCS (ambiguity) (rule end)
	 *     segments+=StringLiteral (ambiguity) (rule end)
	 *     severity=SEVERITY_KIND ')' (ambiguity) (rule end)
	 *     symbol='false' (ambiguity) (rule end)
	 *     symbol='true' (ambiguity) (rule end)
	 *     symbol=NUMBER_LITERAL (ambiguity) (rule end)
	 */
	protected void emit_ExpressionStatementCS_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     moduleUsages+=ModuleUsageCS '{' '}' (ambiguity) (rule end)
	 *     ownedOperations+=ModuleOperationCS '}' (ambiguity) (rule end)
	 *     ownedProperties+=ModulePropertyCS '}' (ambiguity) (rule end)
	 *     parameters+=ModelTypeRefCS ')' '{' '}' (ambiguity) (rule end)
	 */
	protected void emit_LibraryDefCS_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=UnrestrictedName '{' '}' (ambiguity) (rule end)
	 *     ownedAnnotations+=TagCS '}' (ambiguity) (rule end)
	 *     ownedClasses+=ClassCS '}' (ambiguity) (rule end)
	 *     ownedClasses+=EnumerationCS '}' (ambiguity) (rule end)
	 */
	protected void emit_MetamodelCS_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('where' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     packageRefs+=PackageRefCS (ambiguity) ';' (rule end)
	 */
	protected void emit_ModelTypeCS___WhereKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'endif'?
	 *
	 * This ambiguous syntax occurs at:
	 *     ownedAltParts+=SwitchAltCS (ambiguity) ';'? (rule end)
	 *     ownedAltParts+=SwitchAltCS (ambiguity) (rule end)
	 *     ownedElsePart=ExpCS (ambiguity) ';'? (rule end)
	 *     ownedElsePart=ExpCS (ambiguity) (rule end)
	 */
	protected void emit_SwitchExpCS_EndifKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     moduleUsages+=ModuleUsageCS '{' '}' (ambiguity) (rule end)
	 *     ownedOperations+=ModuleOperationCS '}' (ambiguity) (rule end)
	 *     ownedProperties+=ModulePropertyCS '}' (ambiguity) (rule end)
	 *     parameters+=ParameterDeclarationCS ')' '{' '}' (ambiguity) (rule end)
	 *     refines=ModuleRefCS '{' '}' (ambiguity) (rule end)
	 */
	protected void emit_TransformationDefCS_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name='Tuple' (ambiguity) (rule end)
	 *     name='Tuple' (ambiguity) ownedMultiplicity=MultiplicityCS
	 */
	protected void emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':=' | '::='
	 *
	 * This ambiguous syntax occurs at:
	 *     name=UnrestrictedName (ambiguity) ownedInitExpression=ExpCS
	 *     ownedType=TypeExpCS (ambiguity) ownedInitExpression=ExpCS
	 */
	protected void emit_VarDeclarationCS_ColonColonEqualsSignKeyword_2_0_2_or_ColonEqualsSignKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
