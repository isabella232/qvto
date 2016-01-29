/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package org.eclipse.qvto.examples.xtext.qvtoperational.cs2as._QVTOperationalCS2AS_qvtp_qvtias;

import java.util.Iterator;
import java.util.List;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.PropertyId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionLastOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.internal.lookup.util.PivotLookupResult;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.xtext.base.cs2as.tx.AbstractCS2ASTransformer;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.ClassCS;
import org.eclipse.ocl.xtext.basecs.OperationCS;
import org.eclipse.ocl.xtext.basecs.PackageCS;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.StructuralFeatureCS;
import org.eclipse.ocl.xtext.basecs.TypeCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.qvto.examples.pivot.qvtoperational.Library;
import org.eclipse.qvto.examples.pivot.qvtoperational.MappingOperation;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModelParameter;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModelType;
import org.eclipse.qvto.examples.pivot.qvtoperational.OperationalTransformation;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalFactory;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.VarParameter;
import org.eclipse.qvto.examples.pivot.qvtoperational.lookup.util.QVTOperationalLookupSolver;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS;

/**
 * The QVTOperationalCS2AS_qvtp_qvtias transformation:
 * <p>
 * Construct with an evaluator
 * <br>
 * Populate each input model with {@link addRootObjects(String,List)}
 * <br>
 * {@link run()}
 * <br>
 * Extract each output model with {@link getRootObjects(String)}
 */
@SuppressWarnings("nls")
public class QVTOperationalCS2AS_qvtp_qvtias extends AbstractCS2ASTransformer
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/BaseCS", null, BaseCSPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/QVTOperational", null, QVTOperationalPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS", null, QVTOperationalCSPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ClassCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("ClassCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ClassifierPropertyCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("ClassifierPropertyCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Element = PACKid_$metamodel$.getClassId("Element", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Library = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("Library", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MappingOperation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingOperation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MappingOperationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("MappingOperationCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MetamodelCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("MetamodelCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Model = PACKid_$metamodel$.getClassId("Model", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModelParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ModelParameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModelType = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ModelType", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModelTypeCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("ModelTypeCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModuleCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("ModuleCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_NamedElement = PACKid_$metamodel$.getClassId("NamedElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Operation = PACKid_$metamodel$.getClassId("Operation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OperationCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("OperationCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OperationalTransformation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("OperationalTransformation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Package = PACKid_$metamodel$.getClassId("Package", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_PackageCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("PackageCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Parameter = PACKid_$metamodel$.getClassId("Parameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ParameterCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("ParameterCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ParameterDeclarationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("ParameterDeclarationCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_PathElement2CS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("PathElement2CS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_PathName2CS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("PathName2CS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Property = PACKid_$metamodel$.getClassId("Property", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_QVToClassCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("QVToClassCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_QVToLibraryCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("QVToLibraryCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_StructuralFeatureCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("StructuralFeatureCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TopLevelCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("TopLevelCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TransformationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("TransformationCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TypeCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("TypeCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TypedRefCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("TypedRefCS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_TypedTypeRef2CS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("TypedTypeRef2CS", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_VarParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("VarParameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Visitable = PACKid_$metamodel$.getClassId("Visitable", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull EnumerationId ENUMid_QualifierKindCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getEnumerationId("QualifierKindCS");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
    public static final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull String STR_ = "";
    public static final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.NonNull String STR_composite = "composite";
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull EnumerationLiteralId ELITid_abstract = ENUMid_QualifierKindCS.getEnumerationLiteralId("abstract");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull EnumerationLiteralId ELITid_blackbox = ENUMid_QualifierKindCS.getEnumerationLiteralId("blackbox");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_ClassCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ClassCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_OperationCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_OperationCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_PackageCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_PackageCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_ParameterCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ParameterCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_PathElement2CS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_PathElement2CS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_StructuralFeatureCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_StructuralFeatureCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_TypeCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_TypeCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_name = CLSSid_NamedElement.getPropertyId("name");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull PropertyId PROPid_ownedClasses = CLSSid_Package.getPropertyId("ownedClasses");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Class = TypeId.SEQUENCE.getSpecializedId(CLSSid_Class);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Element = TypeId.SEQUENCE.getSpecializedId(CLSSid_Element);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_ModelParameter = TypeId.SEQUENCE.getSpecializedId(CLSSid_ModelParameter);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_ModelType = TypeId.SEQUENCE.getSpecializedId(CLSSid_ModelType);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Operation = TypeId.SEQUENCE.getSpecializedId(CLSSid_Operation);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Package = TypeId.SEQUENCE.getSpecializedId(CLSSid_Package);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Parameter = TypeId.SEQUENCE.getSpecializedId(CLSSid_Parameter);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Property = TypeId.SEQUENCE.getSpecializedId(CLSSid_Property);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Class = TypeId.SET.getSpecializedId(CLSSid_Class);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_ClassifierPropertyCS = TypeId.SET.getSpecializedId(CLSSid_ClassifierPropertyCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_MappingOperationCS = TypeId.SET.getSpecializedId(CLSSid_MappingOperationCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_MetamodelCS = TypeId.SET.getSpecializedId(CLSSid_MetamodelCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_ModelTypeCS = TypeId.SET.getSpecializedId(CLSSid_ModelTypeCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Package = TypeId.SET.getSpecializedId(CLSSid_Package);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_ParameterDeclarationCS = TypeId.SET.getSpecializedId(CLSSid_ParameterDeclarationCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_QVToClassCS = TypeId.SET.getSpecializedId(CLSSid_QVToClassCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_QVToLibraryCS = TypeId.SET.getSpecializedId(CLSSid_QVToLibraryCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_TopLevelCS = TypeId.SET.getSpecializedId(CLSSid_TopLevelCS);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_TransformationCS = TypeId.SET.getSpecializedId(CLSSid_TransformationCS);
    
    /*
     * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
     */
    private static final /*@NonNull*/ ClassId[] classIndex2classId = new /*@NonNull*/ ClassId[]{
        CLSSid_ClassifierPropertyCS,    // 0 => ClassifierPropertyCS
        CLSSid_MappingOperationCS,      // 1 => MappingOperationCS
        CLSSid_MetamodelCS,             // 2 => MetamodelCS
        CLSSid_ModelTypeCS,             // 3 => ModelTypeCS
        CLSSid_ParameterDeclarationCS,  // 4 => ParameterDeclarationCS
        CLSSid_QVToClassCS,             // 5 => QVToClassCS
        CLSSid_QVToLibraryCS,           // 6 => QVToLibraryCS
        CLSSid_TopLevelCS,              // 7 => TopLevelCS
        CLSSid_TransformationCS         // 8 => TransformationCS
    };
    
    /*
     * Mapping from each ClassIndex to all the ClassIndexes to which an object of the outer index
     * may contribute results to an allInstances() invocation.
     * Non trivial inner arrays arise when one ClassId is a derivation of another and so an
     * instance of the derived classId contributes to derived and inherited ClassIndexes.
     */
    private final static int /*@NonNull*/ [] /*@NonNull*/ [] classIndex2allClassIndexes = new int /*@NonNull*/ [] /*@NonNull*/ [] {
        {0},                    // 0 : ClassifierPropertyCS -> {ClassifierPropertyCS}
        {1},                    // 1 : MappingOperationCS -> {MappingOperationCS}
        {2},                    // 2 : MetamodelCS -> {MetamodelCS}
        {3},                    // 3 : ModelTypeCS -> {ModelTypeCS}
        {4},                    // 4 : ParameterDeclarationCS -> {ParameterDeclarationCS}
        {5},                    // 5 : QVToClassCS -> {QVToClassCS}
        {6},                    // 6 : QVToLibraryCS -> {QVToLibraryCS}
        {7},                    // 7 : TopLevelCS -> {TopLevelCS}
        {8}                     // 8 : TransformationCS -> {TransformationCS}
    };
    
    private final QVTOperationalLookupSolver lookupSolver = new QVTOperationalLookupSolver(executor);
    
    public QVTOperationalCS2AS_qvtp_qvtias(final /*@NonNull*/ Executor executor) throws ReflectiveOperationException {
        super(executor, new /*@NonNull*/ String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
    }
    
    public boolean run() throws ReflectiveOperationException {
        return MAP___root__() && invocationManager.flush();
    }
    
    /**
     * 
     * map cClassifierPropertyCS_2_Property in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (classifierPropertyCS : qvtoperationalcs::ClassifierPropertyCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize property : Property[1];
     *  |}
     * where ( |)
     * { |
     * classifierPropertyCS.pivot := property;
     * }
     * 
     */
    protected boolean MAP_cClassifierPropertyCS_2_Property(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ClassifierPropertyCS classifierPropertyCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Property property = PivotFactory.eINSTANCE.createProperty();
        assert property != null;
        models[1/*rightAS*/].add(property);
        // property assignments
        classifierPropertyCS.setPivot(property);
        return true;
    }
    
    /**
     * 
     * map cMappingOperationCS_2_MappingOperation in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (mappingOperationCS : qvtoperationalcs::MappingOperationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize mappingOperation : qvtoperational::MappingOperation[1];
     *  |}
     * where ( |)
     * { |
     * mappingOperationCS.pivot := mappingOperation;
     * }
     * 
     */
    protected boolean MAP_cMappingOperationCS_2_MappingOperation(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MappingOperationCS mappingOperationCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable MappingOperation mappingOperation = QVTOperationalFactory.eINSTANCE.createMappingOperation();
        assert mappingOperation != null;
        models[1/*rightAS*/].add(mappingOperation);
        // property assignments
        mappingOperationCS.setPivot(mappingOperation);
        return true;
    }
    
    /**
     * 
     * map cMetamodelCS_2_Package in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (metamodelCS : qvtoperationalcs::MetamodelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize package : Package[1];
     *  |}
     * where ( |)
     * { |
     * metamodelCS.pivot := package;
     * }
     * 
     */
    protected boolean MAP_cMetamodelCS_2_Package(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS metamodelCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Package symbol_0 = PivotFactory.eINSTANCE.createPackage();
        assert symbol_0 != null;
        models[1/*rightAS*/].add(symbol_0);
        // property assignments
        metamodelCS.setPivot(symbol_0);
        return true;
    }
    
    /**
     * 
     * map cModelTypeCS_2_ModelType in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (modelTypeCS : qvtoperationalcs::ModelTypeCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize modelType : qvtoperational::ModelType[1];
     *  |}
     * where ( |)
     * { |
     * modelTypeCS.pivot := modelType;
     * }
     * 
     */
    protected boolean MAP_cModelTypeCS_2_ModelType(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ModelTypeCS modelTypeCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable ModelType modelType = QVTOperationalFactory.eINSTANCE.createModelType();
        assert modelType != null;
        models[1/*rightAS*/].add(modelType);
        // property assignments
        modelTypeCS.setPivot(modelType);
        return true;
    }
    
    /**
     * 
     * map cParameterDeclarationCS_2_VarParameter in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize varParameter : qvtoperational::VarParameter[1];
     *  |}
     * where ( |
     * not containedInModule()
     *   notContainedInModule())
     * { |
     * parameterDeclarationCS.pivot := varParameter;
     * }
     * 
     */
    protected boolean MAP_cParameterDeclarationCS_2_VarParameter(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS parameterDeclarationCS) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, parameterDeclarationCS);
        final /*@Thrown*/ boolean oclIsKindOf = ClassUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue());
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ModuleCS_1 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, parameterDeclarationCS);
        final /*@Thrown*/ boolean oclIsKindOf_0 = ClassUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_qvtoperationalcs_c_c_ModuleCS_1).booleanValue());
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf_0);
        if (not_0 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable VarParameter varParameter = QVTOperationalFactory.eINSTANCE.createVarParameter();
        assert varParameter != null;
        models[1/*rightAS*/].add(varParameter);
        // property assignments
        parameterDeclarationCS.setPivot(varParameter);
        return true;
    }
    
    /**
     * 
     * map cParameterDeclarationCS_2_ModelParameter in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize modelParameter : qvtoperational::ModelParameter[1];
     *  |}
     * where ( |
     * containedInModule())
     * { |
     * parameterDeclarationCS.pivot := modelParameter;
     * }
     * 
     */
    protected boolean MAP_cParameterDeclarationCS_2_ModelParameter(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS parameterDeclarationCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, parameterDeclarationCS_0);
        final /*@Thrown*/ boolean oclIsKindOf = ClassUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue());
        if (oclIsKindOf != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable ModelParameter modelParameter = QVTOperationalFactory.eINSTANCE.createModelParameter();
        assert modelParameter != null;
        models[1/*rightAS*/].add(modelParameter);
        // property assignments
        parameterDeclarationCS_0.setPivot(modelParameter);
        return true;
    }
    
    /**
     * 
     * map cQVToClassCS_2_Class in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (qVToClassCS : qvtoperationalcs::QVToClassCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize class : Class[1];
     *  |}
     * where ( |)
     * { |
     * qVToClassCS.pivot := class;
     * }
     * 
     */
    protected boolean MAP_cQVToClassCS_2_Class(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToClassCS qVToClassCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Class symbol_0 = PivotFactory.eINSTANCE.createClass();
        assert symbol_0 != null;
        models[1/*rightAS*/].add(symbol_0);
        // property assignments
        qVToClassCS.setPivot(symbol_0);
        return true;
    }
    
    /**
     * 
     * map cQVToLibraryCS_2_Library in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (qVToLibraryCS : qvtoperationalcs::QVToLibraryCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize library : qvtoperational::Library[1];
     *  |}
     * where ( |)
     * { |
     * qVToLibraryCS.pivot := library;
     * }
     * 
     */
    protected boolean MAP_cQVToLibraryCS_2_Library(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS qVToLibraryCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable Library library = QVTOperationalFactory.eINSTANCE.createLibrary();
        assert library != null;
        models[1/*rightAS*/].add(library);
        // property assignments
        qVToLibraryCS.setPivot(library);
        return true;
    }
    
    /**
     * 
     * map cTopLevelCS_2_Model in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (topLevelCS : qvtoperationalcs::TopLevelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize model : Model[1];
     *  |}
     * where ( |)
     * { |
     * topLevelCS.pivot := model;
     * }
     * 
     */
    protected boolean MAP_cTopLevelCS_2_Model(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TopLevelCS topLevelCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Model model = PivotFactory.eINSTANCE.createModel();
        assert model != null;
        models[1/*rightAS*/].add(model);
        // property assignments
        topLevelCS.setPivot(model);
        return true;
    }
    
    /**
     * 
     * map cTransformationCS_2_OperationalTransformation in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (transformationCS : qvtoperationalcs::TransformationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize operationalTransformation : qvtoperational::OperationalTransformation[1];
     *  |}
     * where ( |)
     * { |
     * transformationCS.pivot := operationalTransformation;
     * }
     * 
     */
    protected boolean MAP_cTransformationCS_2_OperationalTransformation(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS transformationCS) throws ReflectiveOperationException {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable OperationalTransformation operationalTransformation = QVTOperationalFactory.eINSTANCE.createOperationalTransformation();
        assert operationalTransformation != null;
        models[1/*rightAS*/].add(operationalTransformation);
        // property assignments
        transformationCS.setPivot(operationalTransformation);
        return true;
    }
    
    /**
     * 
     * map uProperty_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (classifierPropertyCS : qvtoperationalcs::ClassifierPropertyCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Property[1];
     * _1 : String[?];
     *  |
     * _0 := classifierPropertyCS.pivot.oclAsType(Property);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uProperty_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ClassifierPropertyCS classifierPropertyCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Property_0 = idResolver.getClass(CLSSid_Property, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = classifierPropertyCS_0.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property oclAsType = ClassUtil.nonNullState((Property)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Property_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = classifierPropertyCS_0.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uProperty_isComposite in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (classifierPropertyCS : qvtoperationalcs::ClassifierPropertyCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Property[1];
     * _1 : Boolean[?];
     *  |
     * _0 := classifierPropertyCS.pivot.oclAsType(Property)
     *   ;
     * _1 := qualifiers->exists(x | x = 'composite');
     * _0.isComposite := _1;
     * }
     * 
     */
    protected boolean MAP_uProperty_isComposite(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ClassifierPropertyCS classifierPropertyCS_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Property_0 = idResolver.getClass(CLSSid_Property, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = classifierPropertyCS_1.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property oclAsType = ClassUtil.nonNullState((Property)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Property_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<String> qualifiers = classifierPropertyCS_1.getQualifiers();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_qualifiers = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, qualifiers);
        /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object accumulator = ValueUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_qualifiers.iterator();
        /*@Thrown*/ boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValueUtil.FALSE_VALUE) {
                    exists = ValueUtil.FALSE_VALUE;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String x = (String)ITERATOR_x.next();
            /**
             * x = 'composite'
             */
            final /*@NonInvalid*/ boolean eq = STR_composite.equals(x);
            //
            if (eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
                exists = ValueUtil.TRUE_VALUE;
                break;														// Stop immediately 
            }
            else if (eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
                ;															// Carry on
            }
            else {															// Impossible badly typed result
                accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
            }
        }
        // property assignments
        oclAsType.setIsComposite(exists);
        return true;
    }
    
    /**
     * 
     * map uMappingOperation_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (mappingOperationCS : qvtoperationalcs::MappingOperationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::MappingOperation[1];
     * _1 : String[?];
     *  |
     * _0 := mappingOperationCS.pivot.oclAsType(qvtoperational::MappingOperation);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uMappingOperation_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MappingOperationCS mappingOperationCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_MappingOperation_0 = idResolver.getClass(CLSSid_MappingOperation, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = mappingOperationCS_0.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull MappingOperation oclAsType = ClassUtil.nonNullState((MappingOperation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_MappingOperation_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = mappingOperationCS_0.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uMappingOperation_ownedParameters in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (mappingOperationCS : qvtoperationalcs::MappingOperationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::MappingOperation[1];
     * _1 : Sequence(Parameter);
     *  |
     * _0 := mappingOperationCS.pivot.oclAsType(qvtoperational::MappingOperation)
     *   ;
     * _1 := ownedParameters.pivot.oclAsType(Parameter);
     * _0.ownedParameters := _1;
     * }
     * 
     */
    protected boolean MAP_uMappingOperation_ownedParameters(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MappingOperationCS mappingOperationCS_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_MappingOperation_0 = idResolver.getClass(CLSSid_MappingOperation, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = mappingOperationCS_1.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull MappingOperation oclAsType = ClassUtil.nonNullState((MappingOperation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_MappingOperation_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ParameterCS> ownedParameters = mappingOperationCS_1.getOwnedParameters();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedParameters = idResolver.createOrderedSetOfAll(ORD_CLSSid_ParameterCS, ownedParameters);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Parameter);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedParameters.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable ParameterCS _1 = (ParameterCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Parameter)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Parameter_0 = idResolver.getClass(CLSSid_Parameter, null);
            if (_1 == null) {
                throw throwNull(mappingOperationCS_1, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_0 = _1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Parameter oclAsType_0 = ClassUtil.nonNullState((Parameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_0, TYP_Parameter_0));
            //
            accumulator.add(oclAsType_0);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Parameter> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Parameter.class, collect);
        oclAsType.getOwnedParameters().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map uPackage_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (metamodelCS : qvtoperationalcs::MetamodelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Package[1];
     * _1 : String[?];
     *  |
     * _0 := metamodelCS.pivot.oclAsType(Package);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uPackage_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS metamodelCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = metamodelCS_0.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Package oclAsType = ClassUtil.nonNullState((Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Package_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = metamodelCS_0.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uPackage_nsPrefix in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (metamodelCS : qvtoperationalcs::MetamodelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Package[1];
     * _1 : String[?];
     *  |
     * _0 := metamodelCS.pivot.oclAsType(Package);
     * _1 := name;
     * _0.nsPrefix := _1;
     * }
     * 
     */
    protected boolean MAP_uPackage_nsPrefix(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS metamodelCS_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = metamodelCS_1.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Package oclAsType = ClassUtil.nonNullState((Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Package_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = metamodelCS_1.getName();
        // property assignments
        oclAsType.setNsPrefix(name);
        return true;
    }
    
    /**
     * 
     * map uPackage_URI in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (metamodelCS : qvtoperationalcs::MetamodelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Package[1];
     * _1 : String[?];
     *  |
     * _0 := metamodelCS.pivot.oclAsType(Package);
     * _1 := name;
     * _0.URI := _1;
     * }
     * 
     */
    protected boolean MAP_uPackage_URI(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS metamodelCS_2) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = metamodelCS_2.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Package oclAsType = ClassUtil.nonNullState((Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Package_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = metamodelCS_2.getName();
        // property assignments
        oclAsType.setURI(name);
        return true;
    }
    
    /**
     * 
     * map uPackage_ownedClasses in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (metamodelCS : qvtoperationalcs::MetamodelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Package[1];
     * _1 : Sequence(Class);
     *  |
     * _0 := metamodelCS.pivot.oclAsType(Package)
     *   ;
     * _1 := ownedClasses.pivot.oclAsType(Class);
     * _0.ownedClasses := _1;
     * }
     * 
     */
    protected boolean MAP_uPackage_ownedClasses(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS metamodelCS_3) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = metamodelCS_3.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Package oclAsType = ClassUtil.nonNullState((Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Package_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ClassCS> ownedClasses = metamodelCS_3.getOwnedClasses();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedClasses = idResolver.createOrderedSetOfAll(ORD_CLSSid_ClassCS, ownedClasses);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Class);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedClasses.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable ClassCS _1 = (ClassCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Class)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
            if (_1 == null) {
                throw throwNull(metamodelCS_3, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_0 = _1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class oclAsType_0 = ClassUtil.nonNullState((Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_0, TYP_Class_0));
            //
            accumulator.add(oclAsType_0);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Class> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Class.class, collect);
        oclAsType.getOwnedClasses().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map uModelType_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (modelTypeCS : qvtoperationalcs::ModelTypeCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::ModelType[1];
     * _1 : String[?];
     *  |
     * _0 := modelTypeCS.pivot.oclAsType(qvtoperational::ModelType);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uModelType_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ModelTypeCS modelTypeCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_ModelType_0 = idResolver.getClass(CLSSid_ModelType, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = modelTypeCS_0.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ModelType oclAsType = ClassUtil.nonNullState((ModelType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_ModelType_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = modelTypeCS_0.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uVarParameter_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * not containedInModule()
     *   notContainedInModule()
     *   )
     * {_0 : qvtoperational::VarParameter[1];
     * _1 : String[?];
     *  |
     * _0 := parameterDeclarationCS.pivot.oclAsType(qvtoperational::VarParameter);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uVarParameter_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS parameterDeclarationCS_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, parameterDeclarationCS_1);
        final /*@Thrown*/ boolean oclIsKindOf = ClassUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue());
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ModuleCS_1 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, parameterDeclarationCS_1);
        final /*@Thrown*/ boolean oclIsKindOf_0 = ClassUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_qvtoperationalcs_c_c_ModuleCS_1).booleanValue());
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf_0);
        if (not_0 != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_VarParameter_0 = idResolver.getClass(CLSSid_VarParameter, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = parameterDeclarationCS_1.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull VarParameter oclAsType = ClassUtil.nonNullState((VarParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_VarParameter_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = parameterDeclarationCS_1.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uModelParameter_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * containedInModule()
     *   )
     * {_0 : qvtoperational::ModelParameter[1];
     * _1 : String[?];
     *  |
     * _0 := parameterDeclarationCS.pivot.oclAsType(qvtoperational::ModelParameter);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uModelParameter_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS parameterDeclarationCS_2) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, parameterDeclarationCS_2);
        final /*@Thrown*/ boolean oclIsKindOf = ClassUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue());
        if (oclIsKindOf != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_ModelParameter_0 = idResolver.getClass(CLSSid_ModelParameter, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = parameterDeclarationCS_2.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ModelParameter oclAsType = ClassUtil.nonNullState((ModelParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_ModelParameter_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = parameterDeclarationCS_2.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uModelParameter_type in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |
     * containedInModule()
     *   )
     * {_0 : qvtoperational::ModelParameter[1];
     * _1 : qvtoperational::ModelType[?];
     *  |
     * _0 := parameterDeclarationCS.pivot.oclAsType(qvtoperational::ModelParameter)
     *   ;
     * _1 := pivot.oclAsType(qvtoperational::VarParameter)
     *   .lookupModelType(
     *     parameterDeclarationCS.ownedType.oclAsType(qvtoperationalcs::TypedTypeRef2CS));
     * _0.type := _1;
     * }
     * 
     */
    protected boolean MAP_uModelParameter_type(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS parameterDeclarationCS_3) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, parameterDeclarationCS_3);
        final /*@Thrown*/ boolean oclIsKindOf = ClassUtil.nonNullState(OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue());
        if (oclIsKindOf != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_ModelParameter_0 = idResolver.getClass(CLSSid_ModelParameter, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_VarParameter_0 = idResolver.getClass(CLSSid_VarParameter, null);
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = parameterDeclarationCS_3.getPivot();
        // variable assignments
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ModelParameter oclAsType = ClassUtil.nonNullState((ModelParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_ModelParameter_0));
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull VarParameter self_0 = ClassUtil.nonNullState((VarParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_VarParameter_0));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_TypedTypeRef2CS_0 = idResolver.getClass(CLSSid_TypedTypeRef2CS, null);
        final /*@Thrown*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable TypedRefCS ownedType = parameterDeclarationCS_3.getOwnedType();
        final /*@Thrown*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TypedTypeRef2CS typedRef = ClassUtil.nonNullState((TypedTypeRef2CS)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ownedType, TYP_qvtoperationalcs_c_c_TypedTypeRef2CS_0));
        final /*@Thrown*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.Nullable PathName2CS ownedPathName = typedRef.getOwnedPathName();
        if (ownedPathName == null) {
            throw throwNull(parameterDeclarationCS_3, "Null source for \'\'http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS\'::PathName2CS::ownedPathElements2\'");
        }
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<PathElement2CS> pathSeq = ownedPathName.getOwnedPathElements2();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_pathSeq = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElement2CS, pathSeq);
        final /*@Thrown*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.Nullable PathElement2CS last = (PathElement2CS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_pathSeq);
        if (last == null) {
            throw throwNull(parameterDeclarationCS_3, "Null source for \'\'http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS\'::PathElement2CS::name\'");
        }
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = last.getName();
        PivotLookupResult<ModelType> _lookupResult = lookupSolver._lookupModelType(self_0, name);
        ModelType _lookupModelType = null;
        if (_lookupResult.size() == 1) {
            _lookupModelType = _lookupResult.getSingleResult();
        } else {
            handleLookupError(pathSeq,last);
        };
        // property assignments
        oclAsType.setType(_lookupModelType);
        return true;
    }
    
    /**
     * 
     * map uClass_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (qVToClassCS : qvtoperationalcs::QVToClassCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Class[1];
     * _1 : String[?];
     *  |
     * _0 := qVToClassCS.pivot.oclAsType(Class);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uClass_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToClassCS qVToClassCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = qVToClassCS_0.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class oclAsType = ClassUtil.nonNullState((Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Class_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = qVToClassCS_0.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uClass_ownedProperties in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (qVToClassCS : qvtoperationalcs::QVToClassCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Class[1];
     * _1 : Sequence(Property[*|1]);
     *  |
     * _0 := qVToClassCS.pivot.oclAsType(Class)
     *   ;
     * _1 := ownedProperties.pivot.oclAsType(Element)
     *   .oclAsType(Property);
     * _0.ownedProperties := _1;
     * }
     * 
     */
    protected boolean MAP_uClass_ownedProperties(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToClassCS qVToClassCS_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = qVToClassCS_1.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class oclAsType = ClassUtil.nonNullState((Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Class_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<StructuralFeatureCS> ownedProperties = qVToClassCS_1.getOwnedProperties();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedProperties = idResolver.createOrderedSetOfAll(ORD_CLSSid_StructuralFeatureCS, ownedProperties);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Element);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedProperties.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable StructuralFeatureCS _1 = (StructuralFeatureCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Element)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Element_0 = idResolver.getClass(CLSSid_Element, null);
            if (_1 == null) {
                throw throwNull(qVToClassCS_1, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_0 = _1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Element oclAsType_0 = ClassUtil.nonNullState((Element)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_0, TYP_Element_0));
            //
            accumulator.add(oclAsType_0);
        }
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Property);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element _1_0 = (Element)ITERATOR__1_0.next();
            /**
             * oclAsType(Property)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Property_0 = idResolver.getClass(CLSSid_Property, null);
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property oclAsType_1 = ClassUtil.nonNullState((Property)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_0, TYP_Property_0));
            //
            accumulator_0.add(oclAsType_1);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Property> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Property.class, collect);
        oclAsType.getOwnedProperties().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map uClass_ownedOperations in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (qVToClassCS : qvtoperationalcs::QVToClassCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Class[1];
     * _1 : Sequence(Operation);
     *  |
     * _0 := qVToClassCS.pivot.oclAsType(Class)
     *   ;
     * _1 := ownedOperations.pivot.oclAsType(Operation);
     * _0.ownedOperations := _1;
     * }
     * 
     */
    protected boolean MAP_uClass_ownedOperations(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToClassCS qVToClassCS_2) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = qVToClassCS_2.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class oclAsType = ClassUtil.nonNullState((Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Class_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OperationCS> ownedOperations = qVToClassCS_2.getOwnedOperations();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedOperations = idResolver.createOrderedSetOfAll(ORD_CLSSid_OperationCS, ownedOperations);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Operation);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedOperations.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable OperationCS _1 = (OperationCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Operation)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Operation_0 = idResolver.getClass(CLSSid_Operation, null);
            if (_1 == null) {
                throw throwNull(qVToClassCS_2, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_0 = _1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Operation oclAsType_0 = ClassUtil.nonNullState((Operation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_0, TYP_Operation_0));
            //
            accumulator.add(oclAsType_0);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Operation> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Operation.class, collect);
        oclAsType.getOwnedOperations().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map uLibrary_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (qVToLibraryCS : qvtoperationalcs::QVToLibraryCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::Library[1];
     * _1 : String[?];
     *  |
     * _0 := qVToLibraryCS.pivot.oclAsType(qvtoperational::Library);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uLibrary_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS qVToLibraryCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_Library_0 = idResolver.getClass(CLSSid_Library, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = qVToLibraryCS_0.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Library oclAsType = ClassUtil.nonNullState((Library)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_Library_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = qVToLibraryCS_0.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uLibrary_ownedOperations in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (qVToLibraryCS : qvtoperationalcs::QVToLibraryCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::Library[1];
     * _1 : Sequence(Operation);
     *  |
     * _0 := qVToLibraryCS.pivot.oclAsType(qvtoperational::Library)
     *   ;
     * _1 := ownedOperations.pivot.oclAsType(Operation);
     * _0.ownedOperations := _1;
     * }
     * 
     */
    protected boolean MAP_uLibrary_ownedOperations(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS qVToLibraryCS_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_Library_0 = idResolver.getClass(CLSSid_Library, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = qVToLibraryCS_1.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Library oclAsType = ClassUtil.nonNullState((Library)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_Library_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OperationCS> ownedOperations = qVToLibraryCS_1.getOwnedOperations();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedOperations = idResolver.createOrderedSetOfAll(ORD_CLSSid_OperationCS, ownedOperations);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Operation);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedOperations.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable OperationCS _1 = (OperationCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Operation)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Operation_0 = idResolver.getClass(CLSSid_Operation, null);
            if (_1 == null) {
                throw throwNull(qVToLibraryCS_1, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_0 = _1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Operation oclAsType_0 = ClassUtil.nonNullState((Operation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_0, TYP_Operation_0));
            //
            accumulator.add(oclAsType_0);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Operation> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Operation.class, collect);
        oclAsType.getOwnedOperations().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map uLibrary_usedModelType in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (qVToLibraryCS : qvtoperationalcs::QVToLibraryCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::Library[1];
     * _1 : Sequence(qvtoperational::ModelType);
     *  |
     * _0 := qVToLibraryCS.pivot.oclAsType(qvtoperational::Library)
     *   ;
     * _1 := ownedParameters->collect(x |
     *     pivot.oclAsType(qvtoperational::Library)
     *     .lookupModelType(
     *       x.ownedType.oclAsType(qvtoperationalcs::TypedTypeRef2CS)));
     * _0.usedModelType := _1;
     * }
     * 
     */
    protected boolean MAP_uLibrary_usedModelType(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS qVToLibraryCS_2) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_Library_0 = idResolver.getClass(CLSSid_Library, null);
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = qVToLibraryCS_2.getPivot();
        // variable assignments
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Library oclAsType = ClassUtil.nonNullState((Library)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_Library_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ParameterCS> ownedParameters = qVToLibraryCS_2.getOwnedParameters();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedParameters = idResolver.createOrderedSetOfAll(ORD_CLSSid_ParameterCS, ownedParameters);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_ModelType);
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_ownedParameters.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable ParameterCS x = (ParameterCS)ITERATOR_x.next();
            /**
             * _'null' : qvtoperational::ModelType[?]
             */
            final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Library self_0 = ClassUtil.nonNullState((Library)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_Library_0));
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_TypedTypeRef2CS_0 = idResolver.getClass(CLSSid_TypedTypeRef2CS, null);
            if (x == null) {
                throw throwNull(qVToLibraryCS_2, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::TypedElementCS::ownedType\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable TypedRefCS ownedType = x.getOwnedType();
            final /*@Thrown*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TypedTypeRef2CS typedRef = ClassUtil.nonNullState((TypedTypeRef2CS)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, ownedType, TYP_qvtoperationalcs_c_c_TypedTypeRef2CS_0));
            final /*@Thrown*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.Nullable PathName2CS ownedPathName = typedRef.getOwnedPathName();
            if (ownedPathName == null) {
                throw throwNull(qVToLibraryCS_2, "Null source for \'\'http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS\'::PathName2CS::ownedPathElements2\'");
            }
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<PathElement2CS> pathSeq = ownedPathName.getOwnedPathElements2();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_pathSeq = idResolver.createOrderedSetOfAll(ORD_CLSSid_PathElement2CS, pathSeq);
            final /*@Thrown*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.Nullable PathElement2CS last = (PathElement2CS)OrderedCollectionLastOperation.INSTANCE.evaluate(BOXED_pathSeq);
            if (last == null) {
                throw throwNull(qVToLibraryCS_2, "Null source for \'\'http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS\'::PathElement2CS::name\'");
            }
            final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = last.getName();
            PivotLookupResult<ModelType> _lookupResult = lookupSolver._lookupModelType(self_0, name);
            ModelType _lookupModelType = null;
            if (_lookupResult.size() == 1) {
                _lookupModelType = _lookupResult.getSingleResult();
            } else {
                handleLookupError(pathSeq,last);
            };
            //
            accumulator.add(_lookupModelType);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ModelType> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(ModelType.class, collect);
        oclAsType.getUsedModelType().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map uLibrary_isBlackbox in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (qVToLibraryCS : qvtoperationalcs::QVToLibraryCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::Library[1];
     * _1 : Boolean[?];
     *  |
     * _0 := qVToLibraryCS.pivot.oclAsType(qvtoperational::Library)
     *   ;
     * _1 := ownedQualifiers->exists(x | x = qvtoperationalcs::QualifierKindCS::blackbox);
     * _0.isBlackbox := _1;
     * }
     * 
     */
    protected boolean MAP_uLibrary_isBlackbox(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS qVToLibraryCS_3) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_Library_0 = idResolver.getClass(CLSSid_Library, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = qVToLibraryCS_3.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Library oclAsType = ClassUtil.nonNullState((Library)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_Library_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<String> ownedQualifiers = qVToLibraryCS_3.getOwnedQualifiers();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedQualifiers = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, ownedQualifiers);
        /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object accumulator = ValueUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_ownedQualifiers.iterator();
        /*@Thrown*/ boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValueUtil.FALSE_VALUE) {
                    exists = ValueUtil.FALSE_VALUE;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String x = (String)ITERATOR_x.next();
            /**
             * x = qvtoperationalcs::QualifierKindCS::blackbox
             */
            final /*@NonInvalid*/ boolean eq = ELITid_blackbox.equals(x);
            //
            if (eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
                exists = ValueUtil.TRUE_VALUE;
                break;														// Stop immediately 
            }
            else if (eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
                ;															// Carry on
            }
            else {															// Impossible badly typed result
                accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
            }
        }
        // property assignments
        oclAsType.setIsBlackbox(exists);
        return true;
    }
    
    /**
     * 
     * map uModel_ownedPackages in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (topLevelCS : qvtoperationalcs::TopLevelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : Model[1];
     * _1 : Set(Package);
     *  |
     * _0 := topLevelCS.pivot.oclAsType(Model)
     *   ;
     * _1 := let
     *     dummyPackage : Package[1] = Package{
     *       name = '', ownedClasses = ownedTypes.pivot.oclAsType(Element)
     *       .oclAsType(Class)
     *     };
     * 
     *   in
     *     dummyPackage->includingAll(ownedPackages.pivot.oclAsType(Package));
     * _0.ownedPackages := _1;
     * }
     * 
     */
    protected boolean MAP_uModel_ownedPackages(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TopLevelCS topLevelCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_name = idResolver.getProperty(PROPid_name);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Model_0 = idResolver.getClass(CLSSid_Model, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_ownedClasses = idResolver.getProperty(PROPid_ownedClasses);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = topLevelCS_0.getPivot();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Model oclAsType = ClassUtil.nonNullState((org.eclipse.ocl.pivot.Model)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_Model_0));
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Package dummyPackage = (Package)TYP_Package_0.createInstance();
        CTORid_name.initValue(dummyPackage, STR_);
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<TypeCS> ownedTypes = topLevelCS_0.getOwnedTypes();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedTypes = idResolver.createOrderedSetOfAll(ORD_CLSSid_TypeCS, ownedTypes);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Element);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedTypes.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable TypeCS _1 = (TypeCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Element)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Element_0 = idResolver.getClass(CLSSid_Element, null);
            if (_1 == null) {
                throw throwNull(topLevelCS_0, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_0 = _1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Element oclAsType_0 = ClassUtil.nonNullState((Element)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_0, TYP_Element_0));
            //
            accumulator.add(oclAsType_0);
        }
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Class);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element _1_0 = (Element)ITERATOR__1_0.next();
            /**
             * oclAsType(Class)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class oclAsType_1 = ClassUtil.nonNullState((Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_0, TYP_Class_0));
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<Class> UNBOXED_collect = collect.asEcoreObjects(idResolver, Class.class);
        assert UNBOXED_collect != null;
        CTORid_ownedClasses.initValue(dummyPackage, UNBOXED_collect);
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet = ClassUtil.nonNullState(OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_Package, dummyPackage));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<PackageCS> ownedPackages = topLevelCS_0.getOwnedPackages();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedPackages = idResolver.createOrderedSetOfAll(ORD_CLSSid_PackageCS, ownedPackages);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Package);
        /*@Nullable*/ Iterator<?> ITERATOR__1_1 = BOXED_ownedPackages.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_1;
        while (true) {
            if (!ITERATOR__1_1.hasNext()) {
                collect_1 = accumulator_1;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable PackageCS _1_1 = (PackageCS)ITERATOR__1_1.next();
            /**
             * pivot.oclAsType(Package)
             */
            if (_1_1 == null) {
                throw throwNull(topLevelCS_0, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_1 = _1_1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Package oclAsType_2 = ClassUtil.nonNullState((Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_1, TYP_Package_0));
            //
            accumulator_1.add(oclAsType_2);
        }
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue includingAll = ClassUtil.nonNullState((SetValue)CollectionIncludingAllOperation.INSTANCE.evaluate(oclAsSet, collect_1));
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Package> ECORE_includingAll = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Package.class, includingAll);
        oclAsType.getOwnedPackages().addAll(ECORE_includingAll);
        return true;
    }
    
    /**
     * 
     * map uOperationalTransformation_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (transformationCS : qvtoperationalcs::TransformationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::OperationalTransformation[1];
     * _1 : String[?];
     *  |
     * _0 := transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation);
     * _1 := name;
     * _0.name := _1;
     * }
     * 
     */
    protected boolean MAP_uOperationalTransformation_name(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS transformationCS_0) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = transformationCS_0.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationalTransformation oclAsType = ClassUtil.nonNullState((OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0));
        final /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable String name = transformationCS_0.getName();
        // property assignments
        oclAsType.setName(name);
        return true;
    }
    
    /**
     * 
     * map uOperationalTransformation_modelParameter in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (transformationCS : qvtoperationalcs::TransformationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::OperationalTransformation[1];
     * _1 : Sequence(qvtoperational::ModelParameter[*|1]);
     *  |
     * _0 := transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation)
     *   ;
     * _1 := ownedParameters.pivot.oclAsType(Parameter)
     *   .oclAsType(qvtoperational::ModelParameter);
     * _0.modelParameter := _1;
     * }
     * 
     */
    protected boolean MAP_uOperationalTransformation_modelParameter(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS transformationCS_1) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = transformationCS_1.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationalTransformation oclAsType = ClassUtil.nonNullState((OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ParameterCS> ownedParameters = transformationCS_1.getOwnedParameters();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedParameters = idResolver.createOrderedSetOfAll(ORD_CLSSid_ParameterCS, ownedParameters);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Parameter);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedParameters.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable ParameterCS _1 = (ParameterCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Parameter)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Parameter_0 = idResolver.getClass(CLSSid_Parameter, null);
            if (_1 == null) {
                throw throwNull(transformationCS_1, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_0 = _1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Parameter oclAsType_0 = ClassUtil.nonNullState((Parameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_0, TYP_Parameter_0));
            //
            accumulator.add(oclAsType_0);
        }
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_ModelParameter);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Parameter _1_0 = (Parameter)ITERATOR__1_0.next();
            /**
             * oclAsType(qvtoperational::ModelParameter)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_ModelParameter_0 = idResolver.getClass(CLSSid_ModelParameter, null);
            final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ModelParameter oclAsType_1 = ClassUtil.nonNullState((ModelParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_0, TYP_qvtoperational_c_c_ModelParameter_0));
            //
            accumulator_0.add(oclAsType_1);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ModelParameter> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(ModelParameter.class, collect);
        oclAsType.getModelParameter().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map uOperationalTransformation_ownedOperations in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (transformationCS : qvtoperationalcs::TransformationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::OperationalTransformation[1];
     * _1 : Sequence(Operation);
     *  |
     * _0 := transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation)
     *   ;
     * _1 := ownedOperations.pivot.oclAsType(Operation);
     * _0.ownedOperations := _1;
     * }
     * 
     */
    protected boolean MAP_uOperationalTransformation_ownedOperations(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS transformationCS_2) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = transformationCS_2.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationalTransformation oclAsType = ClassUtil.nonNullState((OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OperationCS> ownedOperations = transformationCS_2.getOwnedOperations();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedOperations = idResolver.createOrderedSetOfAll(ORD_CLSSid_OperationCS, ownedOperations);
        /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Operation);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedOperations.iterator();
        /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@NonInvalid*/ org.eclipse.ocl.xtext.basecs.@org.eclipse.jdt.annotation.Nullable OperationCS _1 = (OperationCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Operation)
             */
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_Operation_0 = idResolver.getClass(CLSSid_Operation, null);
            if (_1 == null) {
                throw throwNull(transformationCS_2, "Null source for \'\'http://www.eclipse.org/ocl/2015/BaseCS\'::PivotableElementCS::pivot\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot_0 = _1.getPivot();
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Operation oclAsType_0 = ClassUtil.nonNullState((Operation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot_0, TYP_Operation_0));
            //
            accumulator.add(oclAsType_0);
        }
        // property assignments
        final /*@NonInvalid*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Operation> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Operation.class, collect);
        oclAsType.getOwnedOperations().addAll(ECORE_collect);
        return true;
    }
    
    /**
     * 
     * map uOperationalTransformation_isBlackbox in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (transformationCS : qvtoperationalcs::TransformationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::OperationalTransformation[1];
     * _1 : Boolean[?];
     *  |
     * _0 := transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation)
     *   ;
     * _1 := ownedQualifiers->exists(x | x = qvtoperationalcs::QualifierKindCS::blackbox);
     * _0.isBlackbox := _1;
     * }
     * 
     */
    protected boolean MAP_uOperationalTransformation_isBlackbox(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS transformationCS_3) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = transformationCS_3.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationalTransformation oclAsType = ClassUtil.nonNullState((OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<String> ownedQualifiers = transformationCS_3.getOwnedQualifiers();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedQualifiers = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, ownedQualifiers);
        /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object accumulator = ValueUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_ownedQualifiers.iterator();
        /*@Thrown*/ boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValueUtil.FALSE_VALUE) {
                    exists = ValueUtil.FALSE_VALUE;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String x = (String)ITERATOR_x.next();
            /**
             * x = qvtoperationalcs::QualifierKindCS::blackbox
             */
            final /*@NonInvalid*/ boolean eq = ELITid_blackbox.equals(x);
            //
            if (eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
                exists = ValueUtil.TRUE_VALUE;
                break;														// Stop immediately 
            }
            else if (eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
                ;															// Carry on
            }
            else {															// Impossible badly typed result
                accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
            }
        }
        // property assignments
        oclAsType.setIsBlackbox(exists);
        return true;
    }
    
    /**
     * 
     * map uOperationalTransformation_isAbstract in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (transformationCS : qvtoperationalcs::TransformationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * {_0 : qvtoperational::OperationalTransformation[1];
     * _1 : Boolean[?];
     *  |
     * _0 := transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation)
     *   ;
     * _1 := ownedQualifiers->exists(x | x = qvtoperationalcs::QualifierKindCS::abstract);
     * _0.isAbstract := _1;
     * }
     * 
     */
    protected boolean MAP_uOperationalTransformation_isAbstract(final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS transformationCS_4) throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // variable assignments
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Element pivot = transformationCS_4.getPivot();
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationalTransformation oclAsType = ClassUtil.nonNullState((OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0));
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<String> ownedQualifiers = transformationCS_4.getOwnedQualifiers();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedQualifiers = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, ownedQualifiers);
        /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object accumulator = ValueUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_ownedQualifiers.iterator();
        /*@Thrown*/ boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValueUtil.FALSE_VALUE) {
                    exists = ValueUtil.FALSE_VALUE;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable String x = (String)ITERATOR_x.next();
            /**
             * x = qvtoperationalcs::QualifierKindCS::abstract
             */
            final /*@NonInvalid*/ boolean eq = ELITid_abstract.equals(x);
            //
            if (eq == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
                exists = ValueUtil.TRUE_VALUE;
                break;														// Stop immediately 
            }
            else if (eq == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
                ;															// Carry on
            }
            else {															// Impossible badly typed result
                accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
            }
        }
        // property assignments
        oclAsType.setIsAbstract(exists);
        return true;
    }
    
    /**
     * 
     * map __root__ in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   where ( |)
     * { |}
     * for parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS in qvtoperationalcs::ParameterDeclarationCS.allInstances()
     *    {
     * 
     *     map cParameterDeclarationCS_2_VarParameter {
     * parameterDeclarationCS := parameterDeclarationCS;
     * }}
     *   for parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS in qvtoperationalcs::ParameterDeclarationCS.allInstances()
     *    {
     * 
     *     map cParameterDeclarationCS_2_ModelParameter {
     * parameterDeclarationCS := parameterDeclarationCS;
     * }}
     *   for parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS in qvtoperationalcs::ParameterDeclarationCS.allInstances()
     *    {
     * 
     *     map uVarParameter_name {
     * parameterDeclarationCS := parameterDeclarationCS;
     * }}
     *   for parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS in qvtoperationalcs::ParameterDeclarationCS.allInstances()
     *    {
     * 
     *     map uModelParameter_name {
     * parameterDeclarationCS := parameterDeclarationCS;
     * }}
     *   for modelTypeCS : qvtoperationalcs::ModelTypeCS in qvtoperationalcs::ModelTypeCS.allInstances()
     *    {
     * map cModelTypeCS_2_ModelType {
     * modelTypeCS := modelTypeCS;
     * }}
     *   for modelTypeCS : qvtoperationalcs::ModelTypeCS in qvtoperationalcs::ModelTypeCS.allInstances()
     *    {
     * map uModelType_name {
     * modelTypeCS := modelTypeCS;
     * }}
     *   for transformationCS : qvtoperationalcs::TransformationCS in qvtoperationalcs::TransformationCS.allInstances()
     *    {
     * 
     *     map cTransformationCS_2_OperationalTransformation {
     * transformationCS := transformationCS;
     * }}
     *   for transformationCS : qvtoperationalcs::TransformationCS in qvtoperationalcs::TransformationCS.allInstances()
     *    {
     * 
     *     map uOperationalTransformation_modelParameter {
     * transformationCS := transformationCS;
     * }}
     *   for parameterDeclarationCS : qvtoperationalcs::ParameterDeclarationCS in qvtoperationalcs::ParameterDeclarationCS.allInstances()
     *    {
     * 
     *     map uModelParameter_type {
     * parameterDeclarationCS := parameterDeclarationCS;
     * }}
     *   for classifierPropertyCS : qvtoperationalcs::ClassifierPropertyCS in qvtoperationalcs::ClassifierPropertyCS.allInstances()
     *    {
     * 
     *     map cClassifierPropertyCS_2_Property {
     * classifierPropertyCS := classifierPropertyCS;
     * }}
     *   for mappingOperationCS : qvtoperationalcs::MappingOperationCS in qvtoperationalcs::MappingOperationCS.allInstances()
     *    {
     * 
     *     map cMappingOperationCS_2_MappingOperation {
     * mappingOperationCS := mappingOperationCS;
     * }}
     *   for metamodelCS : qvtoperationalcs::MetamodelCS in qvtoperationalcs::MetamodelCS.allInstances()
     *    {
     * map cMetamodelCS_2_Package {
     * metamodelCS := metamodelCS;
     * }}
     *   for qVToClassCS : qvtoperationalcs::QVToClassCS in qvtoperationalcs::QVToClassCS.allInstances()
     *    {
     * map cQVToClassCS_2_Class {
     * qVToClassCS := qVToClassCS;
     * }}
     *   for qVToLibraryCS : qvtoperationalcs::QVToLibraryCS in qvtoperationalcs::QVToLibraryCS.allInstances()
     *    {
     * map cQVToLibraryCS_2_Library {
     * qVToLibraryCS := qVToLibraryCS;
     * }}
     *   for topLevelCS : qvtoperationalcs::TopLevelCS in qvtoperationalcs::TopLevelCS.allInstances()
     *    {
     * map cTopLevelCS_2_Model {
     * topLevelCS := topLevelCS;
     * }}
     *   for classifierPropertyCS : qvtoperationalcs::ClassifierPropertyCS in qvtoperationalcs::ClassifierPropertyCS.allInstances()
     *    {
     * map uProperty_name {
     * classifierPropertyCS := classifierPropertyCS;
     * }}
     *   for classifierPropertyCS : qvtoperationalcs::ClassifierPropertyCS in qvtoperationalcs::ClassifierPropertyCS.allInstances()
     *    {
     * 
     *     map uProperty_isComposite {
     * classifierPropertyCS := classifierPropertyCS;
     * }}
     *   for mappingOperationCS : qvtoperationalcs::MappingOperationCS in qvtoperationalcs::MappingOperationCS.allInstances()
     *    {
     * map uMappingOperation_name {
     * mappingOperationCS := mappingOperationCS;
     * }}
     *   for mappingOperationCS : qvtoperationalcs::MappingOperationCS in qvtoperationalcs::MappingOperationCS.allInstances()
     *    {
     * 
     *     map uMappingOperation_ownedParameters {
     * mappingOperationCS := mappingOperationCS;
     * }}
     *   for metamodelCS : qvtoperationalcs::MetamodelCS in qvtoperationalcs::MetamodelCS.allInstances()
     *    {
     * map uPackage_name {
     * metamodelCS := metamodelCS;
     * }}
     *   for metamodelCS : qvtoperationalcs::MetamodelCS in qvtoperationalcs::MetamodelCS.allInstances()
     *    {
     * map uPackage_nsPrefix {
     * metamodelCS := metamodelCS;
     * }}
     *   for metamodelCS : qvtoperationalcs::MetamodelCS in qvtoperationalcs::MetamodelCS.allInstances()
     *    {
     * map uPackage_URI {
     * metamodelCS := metamodelCS;
     * }}
     *   for metamodelCS : qvtoperationalcs::MetamodelCS in qvtoperationalcs::MetamodelCS.allInstances()
     *    {
     * map uPackage_ownedClasses {
     * metamodelCS := metamodelCS;
     * }}
     *   for qVToClassCS : qvtoperationalcs::QVToClassCS in qvtoperationalcs::QVToClassCS.allInstances()
     *    {
     * map uClass_name {
     * qVToClassCS := qVToClassCS;
     * }}
     *   for qVToClassCS : qvtoperationalcs::QVToClassCS in qvtoperationalcs::QVToClassCS.allInstances()
     *    {
     * map uClass_ownedProperties {
     * qVToClassCS := qVToClassCS;
     * }}
     *   for qVToClassCS : qvtoperationalcs::QVToClassCS in qvtoperationalcs::QVToClassCS.allInstances()
     *    {
     * map uClass_ownedOperations {
     * qVToClassCS := qVToClassCS;
     * }}
     *   for qVToLibraryCS : qvtoperationalcs::QVToLibraryCS in qvtoperationalcs::QVToLibraryCS.allInstances()
     *    {
     * map uLibrary_name {
     * qVToLibraryCS := qVToLibraryCS;
     * }}
     *   for qVToLibraryCS : qvtoperationalcs::QVToLibraryCS in qvtoperationalcs::QVToLibraryCS.allInstances()
     *    {
     * map uLibrary_ownedOperations {
     * qVToLibraryCS := qVToLibraryCS;
     * }}
     *   for qVToLibraryCS : qvtoperationalcs::QVToLibraryCS in qvtoperationalcs::QVToLibraryCS.allInstances()
     *    {
     * map uLibrary_usedModelType {
     * qVToLibraryCS := qVToLibraryCS;
     * }}
     *   for qVToLibraryCS : qvtoperationalcs::QVToLibraryCS in qvtoperationalcs::QVToLibraryCS.allInstances()
     *    {
     * map uLibrary_isBlackbox {
     * qVToLibraryCS := qVToLibraryCS;
     * }}
     *   for topLevelCS : qvtoperationalcs::TopLevelCS in qvtoperationalcs::TopLevelCS.allInstances()
     *    {
     * map uModel_ownedPackages {
     * topLevelCS := topLevelCS;
     * }}
     *   for transformationCS : qvtoperationalcs::TransformationCS in qvtoperationalcs::TransformationCS.allInstances()
     *    {
     * 
     *     map uOperationalTransformation_name {
     * transformationCS := transformationCS;
     * }}
     *   for transformationCS : qvtoperationalcs::TransformationCS in qvtoperationalcs::TransformationCS.allInstances()
     *    {
     * 
     *     map uOperationalTransformation_ownedOperations {
     * transformationCS := transformationCS;
     * }}
     *   for transformationCS : qvtoperationalcs::TransformationCS in qvtoperationalcs::TransformationCS.allInstances()
     *    {
     * 
     *     map uOperationalTransformation_isBlackbox {
     * transformationCS := transformationCS;
     * }}
     *   for transformationCS : qvtoperationalcs::TransformationCS in qvtoperationalcs::TransformationCS.allInstances()
     *    {
     * 
     *     map uOperationalTransformation_isAbstract {
     * transformationCS := transformationCS;
     * }}
     */
    protected boolean MAP___root__() throws ReflectiveOperationException {
        // predicates
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver = executor.getIdResolver();
        // mapping statements
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ClassifierPropertyCS_2 = idResolver.getClass(CLSSid_ClassifierPropertyCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_MappingOperationCS_2 = idResolver.getClass(CLSSid_MappingOperationCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_MetamodelCS_4 = idResolver.getClass(CLSSid_MetamodelCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ModelTypeCS_1 = idResolver.getClass(CLSSid_ModelTypeCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_ParameterDeclarationCS_4 = idResolver.getClass(CLSSid_ParameterDeclarationCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_QVToClassCS_3 = idResolver.getClass(CLSSid_QVToClassCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_QVToLibraryCS_4 = idResolver.getClass(CLSSid_QVToLibraryCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_TopLevelCS_1 = idResolver.getClass(CLSSid_TopLevelCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_qvtoperationalcs_c_c_TransformationCS_5 = idResolver.getClass(CLSSid_TransformationCS, null);
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_14 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_ClassifierPropertyCS, TYP_qvtoperationalcs_c_c_ClassifierPropertyCS_2));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_16 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_MappingOperationCS, TYP_qvtoperationalcs_c_c_MappingOperationCS_2));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_18 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_MetamodelCS, TYP_qvtoperationalcs_c_c_MetamodelCS_4));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_4 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_ModelTypeCS, TYP_qvtoperationalcs_c_c_ModelTypeCS_1));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_0 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_ParameterDeclarationCS, TYP_qvtoperationalcs_c_c_ParameterDeclarationCS_4));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_22 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_QVToClassCS, TYP_qvtoperationalcs_c_c_QVToClassCS_3));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_25 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_QVToLibraryCS, TYP_qvtoperationalcs_c_c_QVToLibraryCS_4));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_29 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_TopLevelCS, TYP_qvtoperationalcs_c_c_TopLevelCS_1));
        final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue allInstances_6 = ClassUtil.nonNullState(ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, SET_CLSSid_TransformationCS, TYP_qvtoperationalcs_c_c_TransformationCS_5));
        for (ParameterDeclarationCS parameterDeclarationCS_9 : ValueUtil.typedIterable(ParameterDeclarationCS.class, allInstances_0)) {
            if (parameterDeclarationCS_9 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS symbol_0 = (ParameterDeclarationCS)parameterDeclarationCS_9;
                MAP_cParameterDeclarationCS_2_VarParameter(symbol_0);
            }
        }
        for (ParameterDeclarationCS parameterDeclarationCS_10 : ValueUtil.typedIterable(ParameterDeclarationCS.class, allInstances_0)) {
            if (parameterDeclarationCS_10 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS symbol_3 = (ParameterDeclarationCS)parameterDeclarationCS_10;
                MAP_cParameterDeclarationCS_2_ModelParameter(symbol_3);
            }
        }
        for (ParameterDeclarationCS parameterDeclarationCS_11 : ValueUtil.typedIterable(ParameterDeclarationCS.class, allInstances_0)) {
            if (parameterDeclarationCS_11 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS symbol_6 = (ParameterDeclarationCS)parameterDeclarationCS_11;
                MAP_uVarParameter_name(symbol_6);
            }
        }
        for (ParameterDeclarationCS parameterDeclarationCS_12 : ValueUtil.typedIterable(ParameterDeclarationCS.class, allInstances_0)) {
            if (parameterDeclarationCS_12 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS symbol_9 = (ParameterDeclarationCS)parameterDeclarationCS_12;
                MAP_uModelParameter_name(symbol_9);
            }
        }
        for (ModelTypeCS modelTypeCS_3 : ValueUtil.typedIterable(ModelTypeCS.class, allInstances_4)) {
            if (modelTypeCS_3 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ModelTypeCS symbol_12 = (ModelTypeCS)modelTypeCS_3;
                MAP_cModelTypeCS_2_ModelType(symbol_12);
            }
        }
        for (ModelTypeCS modelTypeCS_4 : ValueUtil.typedIterable(ModelTypeCS.class, allInstances_4)) {
            if (modelTypeCS_4 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ModelTypeCS symbol_15 = (ModelTypeCS)modelTypeCS_4;
                MAP_uModelType_name(symbol_15);
            }
        }
        for (TransformationCS transformationCS_11 : ValueUtil.typedIterable(TransformationCS.class, allInstances_6)) {
            if (transformationCS_11 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS symbol_18 = (TransformationCS)transformationCS_11;
                MAP_cTransformationCS_2_OperationalTransformation(symbol_18);
            }
        }
        for (TransformationCS transformationCS_12 : ValueUtil.typedIterable(TransformationCS.class, allInstances_6)) {
            if (transformationCS_12 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS symbol_21 = (TransformationCS)transformationCS_12;
                MAP_uOperationalTransformation_modelParameter(symbol_21);
            }
        }
        for (ParameterDeclarationCS parameterDeclarationCS_13 : ValueUtil.typedIterable(ParameterDeclarationCS.class, allInstances_0)) {
            if (parameterDeclarationCS_13 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ParameterDeclarationCS symbol_24 = (ParameterDeclarationCS)parameterDeclarationCS_13;
                MAP_uModelParameter_type(symbol_24);
            }
        }
        for (ClassifierPropertyCS classifierPropertyCS_5 : ValueUtil.typedIterable(ClassifierPropertyCS.class, allInstances_14)) {
            if (classifierPropertyCS_5 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ClassifierPropertyCS symbol_27 = (ClassifierPropertyCS)classifierPropertyCS_5;
                MAP_cClassifierPropertyCS_2_Property(symbol_27);
            }
        }
        for (MappingOperationCS mappingOperationCS_5 : ValueUtil.typedIterable(MappingOperationCS.class, allInstances_16)) {
            if (mappingOperationCS_5 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MappingOperationCS symbol_30 = (MappingOperationCS)mappingOperationCS_5;
                MAP_cMappingOperationCS_2_MappingOperation(symbol_30);
            }
        }
        for (MetamodelCS metamodelCS_9 : ValueUtil.typedIterable(MetamodelCS.class, allInstances_18)) {
            if (metamodelCS_9 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS symbol_33 = (MetamodelCS)metamodelCS_9;
                MAP_cMetamodelCS_2_Package(symbol_33);
            }
        }
        for (QVToClassCS qVToClassCS_7 : ValueUtil.typedIterable(QVToClassCS.class, allInstances_22)) {
            if (qVToClassCS_7 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToClassCS symbol_36 = (QVToClassCS)qVToClassCS_7;
                MAP_cQVToClassCS_2_Class(symbol_36);
            }
        }
        for (QVToLibraryCS qVToLibraryCS_9 : ValueUtil.typedIterable(QVToLibraryCS.class, allInstances_25)) {
            if (qVToLibraryCS_9 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS symbol_39 = (QVToLibraryCS)qVToLibraryCS_9;
                MAP_cQVToLibraryCS_2_Library(symbol_39);
            }
        }
        for (TopLevelCS topLevelCS_3 : ValueUtil.typedIterable(TopLevelCS.class, allInstances_29)) {
            if (topLevelCS_3 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TopLevelCS symbol_42 = (TopLevelCS)topLevelCS_3;
                MAP_cTopLevelCS_2_Model(symbol_42);
            }
        }
        for (ClassifierPropertyCS classifierPropertyCS_6 : ValueUtil.typedIterable(ClassifierPropertyCS.class, allInstances_14)) {
            if (classifierPropertyCS_6 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ClassifierPropertyCS symbol_45 = (ClassifierPropertyCS)classifierPropertyCS_6;
                MAP_uProperty_name(symbol_45);
            }
        }
        for (ClassifierPropertyCS classifierPropertyCS_7 : ValueUtil.typedIterable(ClassifierPropertyCS.class, allInstances_14)) {
            if (classifierPropertyCS_7 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull ClassifierPropertyCS symbol_48 = (ClassifierPropertyCS)classifierPropertyCS_7;
                MAP_uProperty_isComposite(symbol_48);
            }
        }
        for (MappingOperationCS mappingOperationCS_6 : ValueUtil.typedIterable(MappingOperationCS.class, allInstances_16)) {
            if (mappingOperationCS_6 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MappingOperationCS symbol_51 = (MappingOperationCS)mappingOperationCS_6;
                MAP_uMappingOperation_name(symbol_51);
            }
        }
        for (MappingOperationCS mappingOperationCS_7 : ValueUtil.typedIterable(MappingOperationCS.class, allInstances_16)) {
            if (mappingOperationCS_7 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MappingOperationCS symbol_54 = (MappingOperationCS)mappingOperationCS_7;
                MAP_uMappingOperation_ownedParameters(symbol_54);
            }
        }
        for (MetamodelCS metamodelCS_10 : ValueUtil.typedIterable(MetamodelCS.class, allInstances_18)) {
            if (metamodelCS_10 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS symbol_57 = (MetamodelCS)metamodelCS_10;
                MAP_uPackage_name(symbol_57);
            }
        }
        for (MetamodelCS metamodelCS_11 : ValueUtil.typedIterable(MetamodelCS.class, allInstances_18)) {
            if (metamodelCS_11 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS symbol_60 = (MetamodelCS)metamodelCS_11;
                MAP_uPackage_nsPrefix(symbol_60);
            }
        }
        for (MetamodelCS metamodelCS_12 : ValueUtil.typedIterable(MetamodelCS.class, allInstances_18)) {
            if (metamodelCS_12 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS symbol_63 = (MetamodelCS)metamodelCS_12;
                MAP_uPackage_URI(symbol_63);
            }
        }
        for (MetamodelCS metamodelCS_13 : ValueUtil.typedIterable(MetamodelCS.class, allInstances_18)) {
            if (metamodelCS_13 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull MetamodelCS symbol_66 = (MetamodelCS)metamodelCS_13;
                MAP_uPackage_ownedClasses(symbol_66);
            }
        }
        for (QVToClassCS qVToClassCS_8 : ValueUtil.typedIterable(QVToClassCS.class, allInstances_22)) {
            if (qVToClassCS_8 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToClassCS symbol_69 = (QVToClassCS)qVToClassCS_8;
                MAP_uClass_name(symbol_69);
            }
        }
        for (QVToClassCS qVToClassCS_9 : ValueUtil.typedIterable(QVToClassCS.class, allInstances_22)) {
            if (qVToClassCS_9 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToClassCS symbol_72 = (QVToClassCS)qVToClassCS_9;
                MAP_uClass_ownedProperties(symbol_72);
            }
        }
        for (QVToClassCS qVToClassCS_10 : ValueUtil.typedIterable(QVToClassCS.class, allInstances_22)) {
            if (qVToClassCS_10 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToClassCS symbol_75 = (QVToClassCS)qVToClassCS_10;
                MAP_uClass_ownedOperations(symbol_75);
            }
        }
        for (QVToLibraryCS qVToLibraryCS_10 : ValueUtil.typedIterable(QVToLibraryCS.class, allInstances_25)) {
            if (qVToLibraryCS_10 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS symbol_78 = (QVToLibraryCS)qVToLibraryCS_10;
                MAP_uLibrary_name(symbol_78);
            }
        }
        for (QVToLibraryCS qVToLibraryCS_11 : ValueUtil.typedIterable(QVToLibraryCS.class, allInstances_25)) {
            if (qVToLibraryCS_11 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS symbol_81 = (QVToLibraryCS)qVToLibraryCS_11;
                MAP_uLibrary_ownedOperations(symbol_81);
            }
        }
        for (QVToLibraryCS qVToLibraryCS_12 : ValueUtil.typedIterable(QVToLibraryCS.class, allInstances_25)) {
            if (qVToLibraryCS_12 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS symbol_84 = (QVToLibraryCS)qVToLibraryCS_12;
                MAP_uLibrary_usedModelType(symbol_84);
            }
        }
        for (QVToLibraryCS qVToLibraryCS_13 : ValueUtil.typedIterable(QVToLibraryCS.class, allInstances_25)) {
            if (qVToLibraryCS_13 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull QVToLibraryCS symbol_87 = (QVToLibraryCS)qVToLibraryCS_13;
                MAP_uLibrary_isBlackbox(symbol_87);
            }
        }
        for (TopLevelCS topLevelCS_4 : ValueUtil.typedIterable(TopLevelCS.class, allInstances_29)) {
            if (topLevelCS_4 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TopLevelCS symbol_90 = (TopLevelCS)topLevelCS_4;
                MAP_uModel_ownedPackages(symbol_90);
            }
        }
        for (TransformationCS transformationCS_13 : ValueUtil.typedIterable(TransformationCS.class, allInstances_6)) {
            if (transformationCS_13 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS symbol_93 = (TransformationCS)transformationCS_13;
                MAP_uOperationalTransformation_name(symbol_93);
            }
        }
        for (TransformationCS transformationCS_14 : ValueUtil.typedIterable(TransformationCS.class, allInstances_6)) {
            if (transformationCS_14 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS symbol_96 = (TransformationCS)transformationCS_14;
                MAP_uOperationalTransformation_ownedOperations(symbol_96);
            }
        }
        for (TransformationCS transformationCS_15 : ValueUtil.typedIterable(TransformationCS.class, allInstances_6)) {
            if (transformationCS_15 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS symbol_99 = (TransformationCS)transformationCS_15;
                MAP_uOperationalTransformation_isBlackbox(symbol_99);
            }
        }
        for (TransformationCS transformationCS_16 : ValueUtil.typedIterable(TransformationCS.class, allInstances_6)) {
            if (transformationCS_16 != null) {
                final /*@NonInvalid*/ org.eclipse.qvto.examples.xtext.qvtoperationalcs.@org.eclipse.jdt.annotation.NonNull TransformationCS symbol_102 = (TransformationCS)transformationCS_16;
                MAP_uOperationalTransformation_isAbstract(symbol_102);
            }
        }
        return true;
    }
}
