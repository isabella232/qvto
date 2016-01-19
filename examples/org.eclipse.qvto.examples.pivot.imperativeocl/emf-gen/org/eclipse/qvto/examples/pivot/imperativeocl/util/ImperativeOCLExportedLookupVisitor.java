/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package org.eclipse.qvto.examples.pivot.imperativeocl.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.lookup.LookupEnvironment;
import org.eclipse.ocl.pivot.internal.lookup.LookupPackage;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionIndexOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.util.PivotExportedLookupVisitor;
import org.eclipse.ocl.pivot.util.PivotQualifiedLookupVisitor;
import org.eclipse.ocl.pivot.util.PivotUnqualifiedLookupVisitor;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.qvto.examples.pivot.imperativeocl.AltExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.AssertExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.AssignExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.BlockExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.BreakExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.CatchExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.ComputeExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.ContinueExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.DictLiteralExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.DictLiteralPart;
import org.eclipse.qvto.examples.pivot.imperativeocl.DictionaryType;
import org.eclipse.qvto.examples.pivot.imperativeocl.ForExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeExpression;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeIterateExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeLoopExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeOCLPackage;
import org.eclipse.qvto.examples.pivot.imperativeocl.InstantiationExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.ListLiteralExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.ListType;
import org.eclipse.qvto.examples.pivot.imperativeocl.LogExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.OrderedTupleLiteralExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.OrderedTupleLiteralPart;
import org.eclipse.qvto.examples.pivot.imperativeocl.OrderedTupleType;
import org.eclipse.qvto.examples.pivot.imperativeocl.RaiseExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.ReturnExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.SwitchExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.TryExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.Typedef;
import org.eclipse.qvto.examples.pivot.imperativeocl.UnlinkExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.UnpackExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.VariableInitExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.WhileExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.util.ImperativeOCLVisitor;

public class ImperativeOCLExportedLookupVisitor
	extends PivotExportedLookupVisitor
	implements ImperativeOCLVisitor<LookupEnvironment>
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Lookup = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/Lookup", null, LookupPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/ImperativeOCL", null, ImperativeOCLPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_java_c_s_s_org_eclipse_qvto_examples_pivot_imperativeocl_util = IdManager.getRootPackageId("java://org.eclipse.qvto.examples.pivot.imperativeocl.util");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_AltExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("AltExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_AssertExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("AssertExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_AssignExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("AssignExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_BlockExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("BlockExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_BreakExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("BreakExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_CatchExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("CatchExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ComputeExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ComputeExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ContinueExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ContinueExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DictLiteralExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("DictLiteralExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DictLiteralPart = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("DictLiteralPart", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DictionaryType = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("DictionaryType", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Element = PACKid_$metamodel$.getClassId("Element", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ForExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ForExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ImperativeExpression = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ImperativeExpression", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ImperativeIterateExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ImperativeIterateExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ImperativeLoopExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ImperativeLoopExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ImperativeOCLUnqualifiedLookupVisitor = PACKid_java_c_s_s_org_eclipse_qvto_examples_pivot_imperativeocl_util.getClassId("ImperativeOCLUnqualifiedLookupVisitor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_InstantiationExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("InstantiationExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ListLiteralExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ListLiteralExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ListType = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ListType", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LogExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("LogExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Lookup.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OCLExpression = PACKid_$metamodel$.getClassId("OCLExpression", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OrderedTupleLiteralExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("OrderedTupleLiteralExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OrderedTupleLiteralPart = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("OrderedTupleLiteralPart", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OrderedTupleType = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("OrderedTupleType", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_RaiseExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("RaiseExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ReturnExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ReturnExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_SwitchExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("SwitchExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TryExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("TryExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Typedef = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("Typedef", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_UnlinkExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("UnlinkExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_UnpackExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("UnpackExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Variable = PACKid_$metamodel$.getClassId("Variable", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_VariableInitExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("VariableInitExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_WhileExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("WhileExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_OCLExpression = TypeId.ORDERED_SET.getSpecializedId(CLSSid_OCLExpression);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Variable = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Variable);
    
    protected final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object importer;
    
    public ImperativeOCLExportedLookupVisitor(/*@NonNull*/ LookupEnvironment context, /*@NonNull*/ Object importer) {
        super(context, importer);
        this.importer = importer;
    }

	@Override
	public LookupEnvironment visitAltExp(@NonNull AltExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitAssertExp(@NonNull AssertExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitAssignExp(@NonNull AssignExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitBlockExp(@NonNull BlockExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitBreakExp(@NonNull BreakExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitCatchExp(@NonNull CatchExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitComputeExp(@NonNull ComputeExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitContinueExp(@NonNull ContinueExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitDictLiteralExp(@NonNull DictLiteralExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitDictLiteralPart(@NonNull DictLiteralPart object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitDictionaryType(@NonNull DictionaryType object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitForExp(@NonNull ForExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitImperativeExpression(@NonNull ImperativeExpression object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitImperativeIterateExp(@NonNull ImperativeIterateExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitImperativeLoopExp(@NonNull ImperativeLoopExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitInstantiationExp(@NonNull InstantiationExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitListLiteralExp(@NonNull ListLiteralExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitListType(@NonNull ListType object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitLogExp(@NonNull LogExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitOrderedTupleLiteralExp(@NonNull OrderedTupleLiteralExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitOrderedTupleLiteralPart(@NonNull OrderedTupleLiteralPart object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitOrderedTupleType(@NonNull OrderedTupleType object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitRaiseExp(@NonNull RaiseExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitReturnExp(@NonNull ReturnExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitSwitchExp(@NonNull SwitchExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitTryExp(@NonNull TryExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitTypedef(@NonNull Typedef object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitUnlinkExp(@NonNull UnlinkExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitUnpackExp(@NonNull UnpackExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitVariableInitExp(@NonNull VariableInitExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitWhileExp(@NonNull WhileExp object) {
		// TODO Auto-generated method stub
		return context;
	}
}
