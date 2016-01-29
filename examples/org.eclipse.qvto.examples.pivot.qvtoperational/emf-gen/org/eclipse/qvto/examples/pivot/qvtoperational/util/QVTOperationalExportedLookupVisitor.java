/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.autogen.lookup.LookupExportedVisitorCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package org.eclipse.qvto.examples.pivot.qvtoperational.util;

import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.internal.lookup.LookupEnvironment;
import org.eclipse.ocl.pivot.util.Visitable;
import org.eclipse.qvto.examples.pivot.imperativeocl.util.ImperativeOCLExportedLookupVisitor;

public class QVTOperationalExportedLookupVisitor
	extends AbstractQVTOperationalCommonLookupVisitor
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_evaluation = IdManager.getRootPackageId("org.eclipse.ocl.pivot.evaluation");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_ids = IdManager.getRootPackageId("org.eclipse.ocl.pivot.ids");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Executor = PACKid_org_eclipse_ocl_pivot_evaluation.getClassId("Executor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IdResolver = PACKid_org_eclipse_ocl_pivot_ids.getClassId("IdResolver", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.evaluation.@org.eclipse.jdt.annotation.NonNull Executor executor;
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver;
    protected final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object importer;
    
    public QVTOperationalExportedLookupVisitor(/*@NonNull*/ LookupEnvironment context, /*@NonNull*/ Object importer) {
        super(context);
        this.executor = context.getExecutor();
        this.idResolver = executor.getIdResolver();
        this.importer = importer;
    }
    
    @Override
    protected /*@Nullable*/ LookupEnvironment doVisiting(/*@NonNull*/ Visitable visitable) {
        return context;
    }
    @Override
    protected ImperativeOCLExportedLookupVisitor createSuperLangVisitor() {
        return new ImperativeOCLExportedLookupVisitor(context,importer);}
}
