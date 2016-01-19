/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package org.eclipse.qvto.examples.pivot.qvtoperational.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.lookup.LookupEnvironment;
import org.eclipse.ocl.pivot.internal.lookup.LookupPackage;
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
import org.eclipse.qvto.examples.pivot.imperativeocl.util.ImperativeOCLExportedLookupVisitor;
import org.eclipse.qvto.examples.pivot.qvtoperational.Constructor;
import org.eclipse.qvto.examples.pivot.qvtoperational.ConstructorBody;
import org.eclipse.qvto.examples.pivot.qvtoperational.ContextualProperty;
import org.eclipse.qvto.examples.pivot.qvtoperational.DummyRelation;
import org.eclipse.qvto.examples.pivot.qvtoperational.DummyRelationDomain;
import org.eclipse.qvto.examples.pivot.qvtoperational.DummyRelationalTransformation;
import org.eclipse.qvto.examples.pivot.qvtoperational.EntryOperation;
import org.eclipse.qvto.examples.pivot.qvtoperational.Helper;
import org.eclipse.qvto.examples.pivot.qvtoperational.ImperativeCallExp;
import org.eclipse.qvto.examples.pivot.qvtoperational.ImperativeOperation;
import org.eclipse.qvto.examples.pivot.qvtoperational.Library;
import org.eclipse.qvto.examples.pivot.qvtoperational.MappingBody;
import org.eclipse.qvto.examples.pivot.qvtoperational.MappingCallExp;
import org.eclipse.qvto.examples.pivot.qvtoperational.MappingOperation;
import org.eclipse.qvto.examples.pivot.qvtoperational.MappingParameter;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModelParameter;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModelType;
import org.eclipse.qvto.examples.pivot.qvtoperational.Module;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModuleImport;
import org.eclipse.qvto.examples.pivot.qvtoperational.ObjectExp;
import org.eclipse.qvto.examples.pivot.qvtoperational.OperationBody;
import org.eclipse.qvto.examples.pivot.qvtoperational.OperationalTransformation;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.ResolveExp;
import org.eclipse.qvto.examples.pivot.qvtoperational.ResolveInExp;
import org.eclipse.qvto.examples.pivot.qvtoperational.Tag;
import org.eclipse.qvto.examples.pivot.qvtoperational.VarParameter;

public class QVTOperationalExportedLookupVisitor
	extends ImperativeOCLExportedLookupVisitor
	implements QVTOperationalVisitor<LookupEnvironment>
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_PRIMid_OclAny = TypeId.ORDERED_SET.getSpecializedId(TypeId.OCL_ANY);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Lookup = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/Lookup", null, LookupPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/ImperativeOCL", null, ImperativeOCLPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/QVTOperational", null, QVTOperationalPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_java_c_s_s_org_eclipse_qvto_examples_pivot_qvtoperational_util = IdManager.getRootPackageId("java://org.eclipse.qvto.examples.pivot.qvtoperational.util");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Constructor = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("Constructor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ConstructorBody = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ConstructorBody", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ContextualProperty = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ContextualProperty", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DummyRelation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("DummyRelation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DummyRelationDomain = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("DummyRelationDomain", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_DummyRelationalTransformation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("DummyRelationalTransformation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Element = PACKid_$metamodel$.getClassId("Element", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_EntryOperation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("EntryOperation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Helper = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("Helper", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ImperativeCallExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ImperativeCallExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ImperativeOperation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ImperativeOperation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Library = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("Library", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Lookup.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MappingBody = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingBody", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MappingCallExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingCallExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MappingOperation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingOperation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MappingParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingParameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModelParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ModelParameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModelType = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ModelType", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Module = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("Module", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModuleImport = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ModuleImport", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_NamedElement = PACKid_$metamodel$.getClassId("NamedElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OCLExpression = PACKid_$metamodel$.getClassId("OCLExpression", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ObjectExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ObjectExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Operation = PACKid_$metamodel$.getClassId("Operation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OperationBody = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("OperationBody", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OperationalTransformation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("OperationalTransformation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Package = PACKid_$metamodel$.getClassId("Package", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Parameter = PACKid_$metamodel$.getClassId("Parameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Property = PACKid_$metamodel$.getClassId("Property", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_QVTOperationalUnqualifiedLookupVisitor = PACKid_java_c_s_s_org_eclipse_qvto_examples_pivot_qvtoperational_util.getClassId("QVTOperationalUnqualifiedLookupVisitor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ResolveExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ResolveExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ResolveInExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ResolveInExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Tag = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("Tag", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_VarParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("VarParameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Variable = PACKid_$metamodel$.getClassId("Variable", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_VariableInitExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("VariableInitExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId COL_CLSSid_OclElement = TypeId.COLLECTION.getSpecializedId(CLSSid_OclElement);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_ModelParameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ModelParameter);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_ModuleImport = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ModuleImport);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_NamedElement = TypeId.ORDERED_SET.getSpecializedId(CLSSid_NamedElement);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_OCLExpression = TypeId.ORDERED_SET.getSpecializedId(CLSSid_OCLExpression);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Operation = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Operation);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Package = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Package);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Parameter);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Property = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Property);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_VarParameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_VarParameter);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_VariableInitExp = TypeId.ORDERED_SET.getSpecializedId(CLSSid_VariableInitExp);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_namedElements = CLSSid_LookupEnvironment.getPropertyId("namedElements");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Module = TypeId.SEQUENCE.getSpecializedId(CLSSid_Module);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Variable = TypeId.SEQUENCE.getSpecializedId(CLSSid_Variable);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Variable = TypeId.SET.getSpecializedId(CLSSid_Variable);
    
    protected final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.NonNull Object importer;
    
    public QVTOperationalExportedLookupVisitor(/*@NonNull*/ LookupEnvironment context, /*@NonNull*/ Object importer) {
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

	@Override
	public LookupEnvironment visitConstructor(@NonNull Constructor object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitConstructorBody(@NonNull ConstructorBody object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitContextualProperty(@NonNull ContextualProperty object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitDummyRelation(@NonNull DummyRelation object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitDummyRelationDomain(@NonNull DummyRelationDomain object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitDummyRelationalTransformation(@NonNull DummyRelationalTransformation object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitEntryOperation(@NonNull EntryOperation object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitHelper(@NonNull Helper object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitImperativeCallExp(@NonNull ImperativeCallExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitImperativeOperation(@NonNull ImperativeOperation object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitLibrary(@NonNull Library object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitMappingBody(@NonNull MappingBody object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitMappingCallExp(@NonNull MappingCallExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitMappingOperation(@NonNull MappingOperation object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitMappingParameter(@NonNull MappingParameter object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitModelParameter(@NonNull ModelParameter object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitModelType(@NonNull ModelType object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitModule(@NonNull Module object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitModuleImport(@NonNull ModuleImport object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitObjectExp(@NonNull ObjectExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitOperationBody(@NonNull OperationBody object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitOperationalTransformation(@NonNull OperationalTransformation object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitResolveExp(@NonNull ResolveExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitResolveInExp(@NonNull ResolveInExp object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitTag(@NonNull Tag object) {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public LookupEnvironment visitVarParameter(@NonNull VarParameter object) {
		// TODO Auto-generated method stub
		return context;
	}
}
