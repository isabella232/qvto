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
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ImperativeOCLCSVisitor<R> extends org.eclipse.ocl.xtext.essentialoclcs.util.EssentialOCLCSVisitor<R>
{
	R visitAssertExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull AssertExpCS object);
	R visitAssignExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull AssignExpCS object);
	R visitBreakExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull BreakExpCS object);
	R visitCatchExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull CatchExpCS object);
	R visitComputeExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ComputeExpCS object);
	R visitContinueExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ContinueExpCS object);
	R visitDictLiteralExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictLiteralExpCS object);
	R visitDictLiteralPartCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictLiteralPartCS object);
	R visitDictTypeCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull DictTypeCS object);
	R visitExpressionBlockCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ExpressionBlockCS object);
	R visitExtentRefCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ExtentRefCS object);
	R visitForExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ForExpCS object);
	R visitImperativeIterateExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ImperativeIterateExpCS object);
	R visitImperativeLoopExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ImperativeLoopExpCS object);
	R visitInstantiationExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull InstantiationExpCS object);
	R visitListLiteralExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ListLiteralExpCS object);
	R visitListTypeCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ListTypeCS object);
	R visitLogExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull LogExpCS object);
	R visitRaiseExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull RaiseExpCS object);
	R visitReturnExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull ReturnExpCS object);
	R visitStatementCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull StatementCS object);
	R visitSwitchAltCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull SwitchAltCS object);
	R visitSwitchExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull SwitchExpCS object);
	R visitTryExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull TryExpCS object);
	R visitVarDeclarationCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull VarDeclarationCS object);
	R visitVarsInitializationCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull VarsInitializationCS object);
	R visitWhileExpCS(org.eclipse.qvto.examples.xtext.imperativeoclcs.@NonNull WhileExpCS object);
}
