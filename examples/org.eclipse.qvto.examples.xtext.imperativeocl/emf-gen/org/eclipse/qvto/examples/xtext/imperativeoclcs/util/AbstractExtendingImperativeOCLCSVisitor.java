/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.eclipse.qvto.examples.xtext.imperativeocl/model/ImperativeOCLCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.qvto.examples.xtext.imperativeoclcs.util;

import org.eclipse.jdt.annotation.NonNull;

/**
 * An AbstractExtendingImperativeOCLCSVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingImperativeOCLCSVisitor<R, C>
	extends org.eclipse.ocl.xtext.essentialoclcs.util.AbstractExtendingEssentialOCLCSVisitor<R, C>
	implements ImperativeOCLCSVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 *
	 * @param context my initial result value
	 */
	protected AbstractExtendingImperativeOCLCSVisitor(C context) {
		super(context);
	}

	@Override
	public R visitAssertExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull AssertExpCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitAssignExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull AssignExpCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitBreakExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull BreakExpCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitCatchExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull CatchExpCS object) {
		return visitExpressionBlockCS(object);
	}

	@Override
	public R visitComputeExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ComputeExpCS object) {
		return visitExpressionBlockCS(object);
	}

	@Override
	public R visitContinueExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ContinueExpCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitDictLiteralExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	@Override
	public R visitDictLiteralPartCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictLiteralPartCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitDictTypeCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictTypeCS object) {
		return visitTypedRefCS(object);
	}

	@Override
	public R visitExpressionBlockCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ExpressionBlockCS object) {
		return visitExpCS(object);
	}

	@Override
	public R visitExtentRefCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ExtentRefCS object) {
		return visitElementRefCS(object);
	}

	@Override
	public R visitForExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ForExpCS object) {
		return visitImperativeLoopExpCS(object);
	}

	@Override
	public R visitImperativeIterateExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ImperativeIterateExpCS object) {
		return visitImperativeLoopExpCS(object);
	}

	@Override
	public R visitImperativeLoopExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ImperativeLoopExpCS object) {
		return visitCallExpCS(object);
	}

	@Override
	public R visitInstantiationExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull InstantiationExpCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitListLiteralExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ListLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	@Override
	public R visitListTypeCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ListTypeCS object) {
		return visitTypedRefCS(object);
	}

	@Override
	public R visitLogExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull LogExpCS object) {
		return visitCallExpCS(object);
	}

	@Override
	public R visitRaiseExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull RaiseExpCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitReturnExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ReturnExpCS object) {
		return visitExpCS(object);
	}

	@Override
	public R visitStatementCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull StatementCS object) {
		return visitExpCS(object);
	}

	@Override
	public R visitSwitchAltCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull SwitchAltCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitSwitchExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull SwitchExpCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitTryExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull TryExpCS object) {
		return visitExpressionBlockCS(object);
	}

	@Override
	public R visitVarDeclarationCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull VarDeclarationCS object) {
		return visitVariableCS(object);
	}

	@Override
	public R visitVarsInitializationCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull VarsInitializationCS object) {
		return visitStatementCS(object);
	}

	@Override
	public R visitWhileExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull WhileExpCS object) {
		return visitExpressionBlockCS(object);
	}
}
