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
 * An AbstractDelegatingImperativeOCLCSVisitor delegates all visits.
 */
public abstract class AbstractDelegatingImperativeOCLCSVisitor<R, C, @NonNull D extends ImperativeOCLCSVisitor<R>>
	extends org.eclipse.ocl.xtext.essentialoclcs.util.AbstractDelegatingEssentialOCLCSVisitor<R, C, D>
	implements ImperativeOCLCSVisitor<R>
{
	protected AbstractDelegatingImperativeOCLCSVisitor(@NonNull D delegate, C context) {
		super(delegate, context);
	}

	@Override
	public R visiting(org.eclipse.ocl.xtext.basecs.util.@NonNull VisitableCS visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public R visitAssertExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull AssertExpCS object) {
		return delegate.visitAssertExpCS(object);
	}

	@Override
	public R visitAssignExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull AssignExpCS object) {
		return delegate.visitAssignExpCS(object);
	}

	@Override
	public R visitBreakExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull BreakExpCS object) {
		return delegate.visitBreakExpCS(object);
	}

	@Override
	public R visitCatchExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull CatchExpCS object) {
		return delegate.visitCatchExpCS(object);
	}

	@Override
	public R visitComputeExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ComputeExpCS object) {
		return delegate.visitComputeExpCS(object);
	}

	@Override
	public R visitContinueExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ContinueExpCS object) {
		return delegate.visitContinueExpCS(object);
	}

	@Override
	public R visitDictLiteralExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictLiteralExpCS object) {
		return delegate.visitDictLiteralExpCS(object);
	}

	@Override
	public R visitDictLiteralPartCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictLiteralPartCS object) {
		return delegate.visitDictLiteralPartCS(object);
	}

	@Override
	public R visitDictTypeCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictTypeCS object) {
		return delegate.visitDictTypeCS(object);
	}

	@Override
	public R visitExpressionBlockCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ExpressionBlockCS object) {
		return delegate.visitExpressionBlockCS(object);
	}

	@Override
	public R visitExtentRefCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ExtentRefCS object) {
		return delegate.visitExtentRefCS(object);
	}

	@Override
	public R visitForExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ForExpCS object) {
		return delegate.visitForExpCS(object);
	}

	@Override
	public R visitImperativeIterateExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ImperativeIterateExpCS object) {
		return delegate.visitImperativeIterateExpCS(object);
	}

	@Override
	public R visitImperativeLoopExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ImperativeLoopExpCS object) {
		return delegate.visitImperativeLoopExpCS(object);
	}

	@Override
	public R visitInstantiationExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull InstantiationExpCS object) {
		return delegate.visitInstantiationExpCS(object);
	}

	@Override
	public R visitListLiteralExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ListLiteralExpCS object) {
		return delegate.visitListLiteralExpCS(object);
	}

	@Override
	public R visitListTypeCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ListTypeCS object) {
		return delegate.visitListTypeCS(object);
	}

	@Override
	public R visitLogExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull LogExpCS object) {
		return delegate.visitLogExpCS(object);
	}

	@Override
	public R visitRaiseExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull RaiseExpCS object) {
		return delegate.visitRaiseExpCS(object);
	}

	@Override
	public R visitReturnExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ReturnExpCS object) {
		return delegate.visitReturnExpCS(object);
	}

	@Override
	public R visitStatementCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull StatementCS object) {
		return delegate.visitStatementCS(object);
	}

	@Override
	public R visitSwitchAltCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull SwitchAltCS object) {
		return delegate.visitSwitchAltCS(object);
	}

	@Override
	public R visitSwitchExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull SwitchExpCS object) {
		return delegate.visitSwitchExpCS(object);
	}

	@Override
	public R visitTryExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull TryExpCS object) {
		return delegate.visitTryExpCS(object);
	}

	@Override
	public R visitVarDeclarationCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull VarDeclarationCS object) {
		return delegate.visitVarDeclarationCS(object);
	}

	@Override
	public R visitVarsInitializationCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull VarsInitializationCS object) {
		return delegate.visitVarsInitializationCS(object);
	}

	@Override
	public R visitWhileExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull WhileExpCS object) {
		return delegate.visitWhileExpCS(object);
	}
}
