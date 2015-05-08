/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package org.eclipse.qvto.examples.xtext.qvtoperational.cs2as;

import java.util.Iterator;
import java.util.List;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.PropertyId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingAllOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.ClassCS;
import org.eclipse.ocl.xtext.basecs.OperationCS;
import org.eclipse.ocl.xtext.basecs.PackageCS;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.StructuralFeatureCS;
import org.eclipse.ocl.xtext.basecs.TypeCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.cs2as.CS2ASTransformationExecutor;
import org.eclipse.qvto.examples.pivot.qvtoperational.Library;
import org.eclipse.qvto.examples.pivot.qvtoperational.MappingOperation;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModelParameter;
import org.eclipse.qvto.examples.pivot.qvtoperational.OperationalTransformation;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalFactory;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.VarParameter;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS;

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
public class QVTOperationalCS2AS_qvtp_qvtias extends CS2ASTransformationExecutor
{
    public static final /*@NonNull*/ /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/BaseCS", null, BaseCSPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/QVTOperational", null, QVTOperationalPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS", null, QVTOperationalCSPackage.eINSTANCE);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ClassCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("ClassCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ClassifierPropertyCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("ClassifierPropertyCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Element = PACKid_$metamodel$.getClassId("Element", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Library = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("Library", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_MappingOperation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingOperation", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_MappingOperationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("MappingOperationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_MetamodelCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("MetamodelCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Model = PACKid_$metamodel$.getClassId("Model", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ModelParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ModelParameter", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ModuleCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("ModuleCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_NamedElement = PACKid_$metamodel$.getClassId("NamedElement", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Operation = PACKid_$metamodel$.getClassId("Operation", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_OperationCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("OperationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_OperationParameterDeclarationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("OperationParameterDeclarationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_OperationalTransformation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("OperationalTransformation", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Package = PACKid_$metamodel$.getClassId("Package", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_PackageCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("PackageCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Parameter = PACKid_$metamodel$.getClassId("Parameter", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ParameterCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("ParameterCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_ParameterDeclarationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("ParameterDeclarationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_Property = PACKid_$metamodel$.getClassId("Property", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_QVToClassCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("QVToClassCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_QVToLibraryCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("QVToLibraryCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_StructuralFeatureCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("StructuralFeatureCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_TopLevelCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("TopLevelCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_TransformationCS = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperationalCS.getClassId("TransformationCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_TypeCS = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_BaseCS.getClassId("TypeCS", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ ClassId CLSSid_VarParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("VarParameter", 0);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_ = "";
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_abstract = "abstract";
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_blackbox = "blackbox";
    public static final /*@NonNull*/ /*@NonInvalid*/ String STR_composite = "composite";
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ClassCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ClassCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_OperationCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_OperationCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PackageCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_PackageCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ParameterCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ParameterCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ParameterDeclarationCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ParameterDeclarationCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_StructuralFeatureCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_StructuralFeatureCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_TypeCS = TypeId.ORDERED_SET.getSpecializedId(CLSSid_TypeCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ PropertyId PROPid_name = CLSSid_NamedElement.getPropertyId("name");
    public static final /*@NonNull*/ /*@NonInvalid*/ PropertyId PROPid_ownedClasses = CLSSid_Package.getPropertyId("ownedClasses");
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Class = TypeId.SEQUENCE.getSpecializedId(CLSSid_Class);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Element = TypeId.SEQUENCE.getSpecializedId(CLSSid_Element);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_ModelParameter = TypeId.SEQUENCE.getSpecializedId(CLSSid_ModelParameter);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Operation = TypeId.SEQUENCE.getSpecializedId(CLSSid_Operation);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Package = TypeId.SEQUENCE.getSpecializedId(CLSSid_Package);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Parameter = TypeId.SEQUENCE.getSpecializedId(CLSSid_Parameter);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_Property = TypeId.SEQUENCE.getSpecializedId(CLSSid_Property);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_QVToClassCS = TypeId.SEQUENCE.getSpecializedId(CLSSid_QVToClassCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_VarParameter = TypeId.SEQUENCE.getSpecializedId(CLSSid_VarParameter);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Class = TypeId.SET.getSpecializedId(CLSSid_Class);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ClassifierPropertyCS = TypeId.SET.getSpecializedId(CLSSid_ClassifierPropertyCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_MappingOperationCS = TypeId.SET.getSpecializedId(CLSSid_MappingOperationCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_MetamodelCS = TypeId.SET.getSpecializedId(CLSSid_MetamodelCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_OperationParameterDeclarationCS = TypeId.SET.getSpecializedId(CLSSid_OperationParameterDeclarationCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Package = TypeId.SET.getSpecializedId(CLSSid_Package);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ParameterDeclarationCS = TypeId.SET.getSpecializedId(CLSSid_ParameterDeclarationCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_QVToClassCS = TypeId.SET.getSpecializedId(CLSSid_QVToClassCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_QVToLibraryCS = TypeId.SET.getSpecializedId(CLSSid_QVToLibraryCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_TopLevelCS = TypeId.SET.getSpecializedId(CLSSid_TopLevelCS);
    public static final /*@NonNull*/ /*@NonInvalid*/ CollectionTypeId SET_CLSSid_TransformationCS = TypeId.SET.getSpecializedId(CLSSid_TransformationCS);
    
    /*
     * Array of the ClassIds of each class for which allInstances() may be invoked. Array index is the ClassIndex.
     */
    private static final /*@NonNull*/ ClassId[] classIndex2classId = new ClassId[]{
        CLSSid_ClassifierPropertyCS,    // 0 => ClassifierPropertyCS
        CLSSid_MappingOperationCS,      // 1 => MappingOperationCS
        CLSSid_MetamodelCS,             // 2 => MetamodelCS
        CLSSid_OperationParameterDeclarationCS,// 3 => OperationParameterDeclarationCS
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
    private final static /*@NonNull*/ int[][] classIndex2allClassIndexes = new int[][] {
        {0},                    // 0 : ClassifierPropertyCS -> {ClassifierPropertyCS}
        {1},                    // 1 : MappingOperationCS -> {MappingOperationCS}
        {2},                    // 2 : MetamodelCS -> {MetamodelCS}
        {3},                    // 3 : OperationParameterDeclarationCS -> {OperationParameterDeclarationCS}
        {4},                    // 4 : ParameterDeclarationCS -> {ParameterDeclarationCS}
        {5},                    // 5 : QVToClassCS -> {QVToClassCS}
        {6},                    // 6 : QVToLibraryCS -> {QVToLibraryCS}
        {7},                    // 7 : TopLevelCS -> {TopLevelCS}
        {8}                     // 8 : TransformationCS -> {TransformationCS}
    };
    
    public QVTOperationalCS2AS_qvtp_qvtias(final /*@NonNull*/ Evaluator evaluator) {
        super(evaluator, new String[] {"leftCS", "rightAS"}, null, classIndex2classId, classIndex2allClassIndexes);
    }
    
    public boolean run() {
        return __root__();
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
    protected boolean cClassifierPropertyCS_2_Property(final /*@NonNull*/ /*@NonInvalid*/ ClassifierPropertyCS classifierPropertyCS) {
        // predicates
        // creations
        final /*@Thrown*/ Property property = PivotFactory.eINSTANCE.createProperty();
        assert property != null;
        models[1/*rightAS*/].add(property);
        // assignments
        classifierPropertyCS.setPivot(property);
        // mapping statements
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
    protected boolean cMappingOperationCS_2_MappingOperation(final /*@NonNull*/ /*@NonInvalid*/ MappingOperationCS mappingOperationCS) {
        // predicates
        // creations
        final /*@Thrown*/ MappingOperation mappingOperation = QVTOperationalFactory.eINSTANCE.createMappingOperation();
        assert mappingOperation != null;
        models[1/*rightAS*/].add(mappingOperation);
        // assignments
        mappingOperationCS.setPivot(mappingOperation);
        // mapping statements
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
    protected boolean cMetamodelCS_2_Package(final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS metamodelCS) {
        // predicates
        // creations
        final /*@Thrown*/ Package symbol_0 = PivotFactory.eINSTANCE.createPackage();
        assert symbol_0 != null;
        models[1/*rightAS*/].add(symbol_0);
        // assignments
        metamodelCS.setPivot(symbol_0);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cOperationParameterDeclarationCS_2_VarParameter in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (operationParameterDeclarationCS : qvtoperationalcs::OperationParameterDeclarationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize varParameter : qvtoperational::VarParameter[1];
     *  |}
     * where ( |)
     * { |
     * operationParameterDeclarationCS.pivot := varParameter;
     * }
     * 
     */
    protected boolean cOperationParameterDeclarationCS_2_VarParameter(final /*@NonNull*/ /*@NonInvalid*/ OperationParameterDeclarationCS operationParameterDeclarationCS) {
        // predicates
        // creations
        final /*@Thrown*/ VarParameter varParameter = QVTOperationalFactory.eINSTANCE.createVarParameter();
        assert varParameter != null;
        models[1/*rightAS*/].add(varParameter);
        // assignments
        operationParameterDeclarationCS.setPivot(varParameter);
        // mapping statements
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
     * not parameterDeclarationCS.oclContainer()
     *   .oclIsKindOf(qvtoperationalcs::ModuleCS))
     * { |
     * parameterDeclarationCS.pivot := varParameter;
     * }
     * 
     */
    protected boolean cParameterDeclarationCS_2_VarParameter(final /*@NonNull*/ /*@NonInvalid*/ ParameterDeclarationCS parameterDeclarationCS) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@Nullable*/ /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, parameterDeclarationCS);
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        // creations
        final /*@Thrown*/ VarParameter varParameter = QVTOperationalFactory.eINSTANCE.createVarParameter();
        assert varParameter != null;
        models[1/*rightAS*/].add(varParameter);
        // assignments
        parameterDeclarationCS.setPivot(varParameter);
        // mapping statements
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
     * parameterDeclarationCS.oclContainer()
     *   .oclIsKindOf(qvtoperationalcs::ModuleCS))
     * { |
     * parameterDeclarationCS.pivot := modelParameter;
     * }
     * 
     */
    protected boolean cParameterDeclarationCS_2_ModelParameter(final /*@NonNull*/ /*@NonInvalid*/ ParameterDeclarationCS parameterDeclarationCS_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@Nullable*/ /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, parameterDeclarationCS_0);
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue();
        if (!oclIsKindOf) {
            return false;
        }
        // creations
        final /*@Thrown*/ ModelParameter modelParameter = QVTOperationalFactory.eINSTANCE.createModelParameter();
        assert modelParameter != null;
        models[1/*rightAS*/].add(modelParameter);
        // assignments
        parameterDeclarationCS_0.setPivot(modelParameter);
        // mapping statements
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
    protected boolean cQVToClassCS_2_Class(final /*@NonNull*/ /*@NonInvalid*/ QVToClassCS qVToClassCS) {
        // predicates
        // creations
        final /*@Thrown*/ Class symbol_0 = PivotFactory.eINSTANCE.createClass();
        assert symbol_0 != null;
        models[1/*rightAS*/].add(symbol_0);
        // assignments
        qVToClassCS.setPivot(symbol_0);
        // mapping statements
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
    protected boolean cQVToLibraryCS_2_Library(final /*@NonNull*/ /*@NonInvalid*/ QVToLibraryCS qVToLibraryCS) {
        // predicates
        // creations
        final /*@Thrown*/ Library library = QVTOperationalFactory.eINSTANCE.createLibrary();
        assert library != null;
        models[1/*rightAS*/].add(library);
        // assignments
        qVToLibraryCS.setPivot(library);
        // mapping statements
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
    protected boolean cTopLevelCS_2_Model(final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS topLevelCS) {
        // predicates
        // creations
        final /*@Thrown*/ org.eclipse.ocl.pivot.Model model = PivotFactory.eINSTANCE.createModel();
        assert model != null;
        models[1/*rightAS*/].add(model);
        // assignments
        topLevelCS.setPivot(model);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map cTopLevelCS_2_Package in QVTOperationalCS2AS_qvtp_qvtias {
     * leftCS (topLevelCS : qvtoperationalcs::TopLevelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * {realize package : Package[1];
     *  |}
     * where ( |)
     * { |
     * topLevelCS.pivot := package;
     * }
     * 
     */
    protected boolean cTopLevelCS_2_Package(final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS topLevelCS_0) {
        // predicates
        // creations
        final /*@Thrown*/ Package symbol_0 = PivotFactory.eINSTANCE.createPackage();
        assert symbol_0 != null;
        models[1/*rightAS*/].add(symbol_0);
        // assignments
        topLevelCS_0.setPivot(symbol_0);
        // mapping statements
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
    protected boolean cTransformationCS_2_OperationalTransformation(final /*@NonNull*/ /*@NonInvalid*/ TransformationCS transformationCS) {
        // predicates
        // creations
        final /*@Thrown*/ OperationalTransformation operationalTransformation = QVTOperationalFactory.eINSTANCE.createOperationalTransformation();
        assert operationalTransformation != null;
        models[1/*rightAS*/].add(operationalTransformation);
        // assignments
        transformationCS.setPivot(operationalTransformation);
        // mapping statements
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
     * { |
     * classifierPropertyCS.pivot.oclAsType(Property).name := name;
     * }
     * 
     */
    protected boolean uProperty_name(final /*@NonNull*/ /*@NonInvalid*/ ClassifierPropertyCS classifierPropertyCS_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Property_0 = idResolver.getClass(CLSSid_Property, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = classifierPropertyCS_0.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Property oclAsType = (Property)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Property_0);
        final /*@Nullable*/ /*@Thrown*/ String name = classifierPropertyCS_0.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * { |
     * classifierPropertyCS.pivot.oclAsType(Property)
     *   .isComposite := qualifiers->exists(x | x = 'composite');
     * }
     * 
     */
    protected boolean uProperty_isComposite(final /*@NonNull*/ /*@NonInvalid*/ ClassifierPropertyCS classifierPropertyCS_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Property_0 = idResolver.getClass(CLSSid_Property, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = classifierPropertyCS_1.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Property oclAsType = (Property)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Property_0);
        final /*@Nullable*/ /*@Thrown*/ List<String> qualifiers = classifierPropertyCS_1.getQualifiers();
        assert qualifiers != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_qualifiers = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, qualifiers);
        /*@NonNull*/ /*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_qualifiers.iterator();
        /*@Thrown*/ boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValueUtil.FALSE_VALUE) {
                    exists = (Boolean)accumulator;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ String x = (String)ITERATOR_x.next();
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
        oclAsType.setIsComposite(exists);
        // mapping statements
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
     * { |
     * mappingOperationCS.pivot.oclAsType(qvtoperational::MappingOperation).name := name;
     * }
     * 
     */
    protected boolean uMappingOperation_name(final /*@NonNull*/ /*@NonInvalid*/ MappingOperationCS mappingOperationCS_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_MappingOperation_0 = idResolver.getClass(CLSSid_MappingOperation, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = mappingOperationCS_0.getPivot();
        final /*@Nullable*/ /*@Thrown*/ MappingOperation oclAsType = (MappingOperation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_MappingOperation_0);
        final /*@Nullable*/ /*@Thrown*/ String name = mappingOperationCS_0.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * { |
     * mappingOperationCS.pivot.oclAsType(qvtoperational::MappingOperation)
     *   .ownedParameters := ownedParameters.pivot.oclAsType(Parameter);
     * }
     * 
     */
    protected boolean uMappingOperation_ownedParameters(final /*@NonNull*/ /*@NonInvalid*/ MappingOperationCS mappingOperationCS_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_MappingOperation_0 = idResolver.getClass(CLSSid_MappingOperation, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = mappingOperationCS_1.getPivot();
        final /*@Nullable*/ /*@Thrown*/ MappingOperation oclAsType = (MappingOperation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_MappingOperation_0);
        final /*@Nullable*/ /*@Thrown*/ List<ParameterCS> ownedParameters = mappingOperationCS_1.getOwnedParameters();
        assert ownedParameters != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedParameters = idResolver.createOrderedSetOfAll(ORD_CLSSid_ParameterCS, ownedParameters);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Parameter);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedParameters.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ ParameterCS _1 = (ParameterCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Parameter)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Parameter_0 = idResolver.getClass(CLSSid_Parameter, null);
            if (_1 == null) {
                throwNull(mappingOperationCS_1, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Parameter oclAsType_0 = (Parameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_Parameter_0);
            //
            accumulator.add(oclAsType_0);
        }
        final List<Parameter> UNBOXED_collect = collect.asEcoreObjects(idResolver, Parameter.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnedParameters().addAll(UNBOXED_collect);
        // mapping statements
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
     * { |
     * metamodelCS.pivot.oclAsType(Package).name := name;
     * }
     * 
     */
    protected boolean uPackage_name(final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS metamodelCS_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = metamodelCS_0.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Package oclAsType = (Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Package_0);
        final /*@Nullable*/ /*@Thrown*/ String name = metamodelCS_0.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * { |
     * metamodelCS.pivot.oclAsType(Package).nsPrefix := name;
     * }
     * 
     */
    protected boolean uPackage_nsPrefix(final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS metamodelCS_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = metamodelCS_1.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Package oclAsType = (Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Package_0);
        final /*@Nullable*/ /*@Thrown*/ String name = metamodelCS_1.getName();
        oclAsType.setNsPrefix(name);
        // mapping statements
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
     * { |
     * metamodelCS.pivot.oclAsType(Package).URI := name;
     * }
     * 
     */
    protected boolean uPackage_URI(final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS metamodelCS_2) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = metamodelCS_2.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Package oclAsType = (Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Package_0);
        final /*@Nullable*/ /*@Thrown*/ String name = metamodelCS_2.getName();
        oclAsType.setURI(name);
        // mapping statements
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
     * { |
     * metamodelCS.pivot.oclAsType(Package)
     *   .ownedClasses := ownedClasses.oclAsType(qvtoperationalcs::QVToClassCS)
     *   .pivot.oclAsType(Class);
     * }
     * 
     */
    protected boolean uPackage_ownedClasses(final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS metamodelCS_3) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = metamodelCS_3.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Package oclAsType = (Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Package_0);
        final /*@Nullable*/ /*@Thrown*/ List<ClassCS> ownedClasses = metamodelCS_3.getOwnedClasses();
        assert ownedClasses != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedClasses = idResolver.createOrderedSetOfAll(ORD_CLSSid_ClassCS, ownedClasses);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_QVToClassCS);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedClasses.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ ClassCS _1 = (ClassCS)ITERATOR__1.next();
            /**
             * oclAsType(qvtoperationalcs::QVToClassCS)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_QVToClassCS_0 = idResolver.getClass(CLSSid_QVToClassCS, null);
            final /*@Nullable*/ /*@Thrown*/ QVToClassCS oclAsType_0 = (QVToClassCS)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1, TYP_qvtoperationalcs_c_c_QVToClassCS_0);
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Class);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ QVToClassCS _1_0 = (QVToClassCS)ITERATOR__1_0.next();
            /**
             * pivot.oclAsType(Class)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
            if (_1_0 == null) {
                throwNull(metamodelCS_3, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1_0.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Class oclAsType_1 = (Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_Class_0);
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<Class> UNBOXED_collect = collect.asEcoreObjects(idResolver, Class.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnedClasses().addAll(UNBOXED_collect);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uVarParameter_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (operationParameterDeclarationCS : qvtoperationalcs::OperationParameterDeclarationCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * { |
     * operationParameterDeclarationCS.pivot.oclAsType(qvtoperational::VarParameter).name := name;
     * }
     * 
     */
    protected boolean uVarParameter_name(final /*@NonNull*/ /*@NonInvalid*/ OperationParameterDeclarationCS operationParameterDeclarationCS_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_VarParameter_0 = idResolver.getClass(CLSSid_VarParameter, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = operationParameterDeclarationCS_0.getPivot();
        final /*@Nullable*/ /*@Thrown*/ VarParameter oclAsType = (VarParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_VarParameter_0);
        final /*@Nullable*/ /*@Thrown*/ String name = operationParameterDeclarationCS_0.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * not parameterDeclarationCS.oclContainer()
     *   .oclIsKindOf(qvtoperationalcs::ModuleCS)
     *   )
     * { |
     * parameterDeclarationCS.pivot.oclAsType(qvtoperational::VarParameter).name := name;
     * }
     * 
     */
    protected boolean uVarParameter_name(final /*@NonNull*/ /*@NonInvalid*/ ParameterDeclarationCS parameterDeclarationCS_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@Nullable*/ /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, parameterDeclarationCS_1);
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue();
        final /*@Nullable*/ /*@Thrown*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsKindOf);
        if (not != ValueUtil.TRUE_VALUE) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_VarParameter_0 = idResolver.getClass(CLSSid_VarParameter, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = parameterDeclarationCS_1.getPivot();
        final /*@Nullable*/ /*@Thrown*/ VarParameter oclAsType = (VarParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_VarParameter_0);
        final /*@Nullable*/ /*@Thrown*/ String name = parameterDeclarationCS_1.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * parameterDeclarationCS.oclContainer()
     *   .oclIsKindOf(qvtoperationalcs::ModuleCS)
     *   )
     * { |
     * parameterDeclarationCS.pivot.oclAsType(qvtoperational::ModelParameter).name := name;
     * }
     * 
     */
    protected boolean uModelParameter_name(final /*@NonNull*/ /*@NonInvalid*/ ParameterDeclarationCS parameterDeclarationCS_2) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_ModuleCS_0 = idResolver.getClass(CLSSid_ModuleCS, null);
        final /*@Nullable*/ /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(evaluator, parameterDeclarationCS_2);
        final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(evaluator, oclContainer, TYP_qvtoperationalcs_c_c_ModuleCS_0).booleanValue();
        if (!oclIsKindOf) {
            return false;
        }
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_ModelParameter_0 = idResolver.getClass(CLSSid_ModelParameter, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = parameterDeclarationCS_2.getPivot();
        final /*@Nullable*/ /*@Thrown*/ ModelParameter oclAsType = (ModelParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_ModelParameter_0);
        final /*@Nullable*/ /*@Thrown*/ String name = parameterDeclarationCS_2.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * { |
     * qVToClassCS.pivot.oclAsType(Class).name := name;
     * }
     * 
     */
    protected boolean uClass_name(final /*@NonNull*/ /*@NonInvalid*/ QVToClassCS qVToClassCS_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = qVToClassCS_0.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Class oclAsType = (Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Class_0);
        final /*@Nullable*/ /*@Thrown*/ String name = qVToClassCS_0.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * { |
     * qVToClassCS.pivot.oclAsType(Class)
     *   .ownedProperties := ownedProperties.pivot.oclAsType(Element)
     *   .oclAsType(Property);
     * }
     * 
     */
    protected boolean uClass_ownedProperties(final /*@NonNull*/ /*@NonInvalid*/ QVToClassCS qVToClassCS_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = qVToClassCS_1.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Class oclAsType = (Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Class_0);
        final /*@Nullable*/ /*@Thrown*/ List<StructuralFeatureCS> ownedProperties = qVToClassCS_1.getOwnedProperties();
        assert ownedProperties != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedProperties = idResolver.createOrderedSetOfAll(ORD_CLSSid_StructuralFeatureCS, ownedProperties);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Element);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedProperties.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ StructuralFeatureCS _1 = (StructuralFeatureCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Element)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Element_0 = idResolver.getClass(CLSSid_Element, null);
            if (_1 == null) {
                throwNull(qVToClassCS_1, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Element oclAsType_0 = (Element)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_Element_0);
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Property);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Element _1_0 = (Element)ITERATOR__1_0.next();
            /**
             * oclAsType(Property)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Property_0 = idResolver.getClass(CLSSid_Property, null);
            final /*@Nullable*/ /*@Thrown*/ Property oclAsType_1 = (Property)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1_0, TYP_Property_0);
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<Property> UNBOXED_collect = collect.asEcoreObjects(idResolver, Property.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnedProperties().addAll(UNBOXED_collect);
        // mapping statements
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
     * { |
     * qVToClassCS.pivot.oclAsType(Class)
     *   .ownedOperations := ownedOperations.pivot.oclAsType(Operation);
     * }
     * 
     */
    protected boolean uClass_ownedOperations(final /*@NonNull*/ /*@NonInvalid*/ QVToClassCS qVToClassCS_2) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = qVToClassCS_2.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Class oclAsType = (Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Class_0);
        final /*@Nullable*/ /*@Thrown*/ List<OperationCS> ownedOperations = qVToClassCS_2.getOwnedOperations();
        assert ownedOperations != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedOperations = idResolver.createOrderedSetOfAll(ORD_CLSSid_OperationCS, ownedOperations);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Operation);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedOperations.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ OperationCS _1 = (OperationCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Operation)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Operation_0 = idResolver.getClass(CLSSid_Operation, null);
            if (_1 == null) {
                throwNull(qVToClassCS_2, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Operation oclAsType_0 = (Operation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_Operation_0);
            //
            accumulator.add(oclAsType_0);
        }
        final List<Operation> UNBOXED_collect = collect.asEcoreObjects(idResolver, Operation.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnedOperations().addAll(UNBOXED_collect);
        // mapping statements
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
     * { |
     * qVToLibraryCS.pivot.oclAsType(qvtoperational::Library).name := name;
     * }
     * 
     */
    protected boolean uLibrary_name(final /*@NonNull*/ /*@NonInvalid*/ QVToLibraryCS qVToLibraryCS_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_Library_0 = idResolver.getClass(CLSSid_Library, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = qVToLibraryCS_0.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Library oclAsType = (Library)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_Library_0);
        final /*@Nullable*/ /*@Thrown*/ String name = qVToLibraryCS_0.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * { |
     * qVToLibraryCS.pivot.oclAsType(qvtoperational::Library)
     *   .ownedOperations := ownedOperations.pivot.oclAsType(Operation);
     * }
     * 
     */
    protected boolean uLibrary_ownedOperations(final /*@NonNull*/ /*@NonInvalid*/ QVToLibraryCS qVToLibraryCS_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_Library_0 = idResolver.getClass(CLSSid_Library, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = qVToLibraryCS_1.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Library oclAsType = (Library)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_Library_0);
        final /*@Nullable*/ /*@Thrown*/ List<OperationCS> ownedOperations = qVToLibraryCS_1.getOwnedOperations();
        assert ownedOperations != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedOperations = idResolver.createOrderedSetOfAll(ORD_CLSSid_OperationCS, ownedOperations);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Operation);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedOperations.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ OperationCS _1 = (OperationCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Operation)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Operation_0 = idResolver.getClass(CLSSid_Operation, null);
            if (_1 == null) {
                throwNull(qVToLibraryCS_1, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Operation oclAsType_0 = (Operation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_Operation_0);
            //
            accumulator.add(oclAsType_0);
        }
        final List<Operation> UNBOXED_collect = collect.asEcoreObjects(idResolver, Operation.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnedOperations().addAll(UNBOXED_collect);
        // mapping statements
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
     * { |
     * qVToLibraryCS.pivot.oclAsType(qvtoperational::Library)
     *   .isBlackbox := qualifiers->exists(x | x = 'blackbox');
     * }
     * 
     */
    protected boolean uLibrary_isBlackbox(final /*@NonNull*/ /*@NonInvalid*/ QVToLibraryCS qVToLibraryCS_2) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_Library_0 = idResolver.getClass(CLSSid_Library, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = qVToLibraryCS_2.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Library oclAsType = (Library)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_Library_0);
        final /*@Nullable*/ /*@Thrown*/ List<String> qualifiers = qVToLibraryCS_2.getQualifiers();
        assert qualifiers != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_qualifiers = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, qualifiers);
        /*@NonNull*/ /*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_qualifiers.iterator();
        /*@Thrown*/ boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValueUtil.FALSE_VALUE) {
                    exists = (Boolean)accumulator;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ String x = (String)ITERATOR_x.next();
            /**
             * x = 'blackbox'
             */
            final /*@NonInvalid*/ boolean eq = STR_blackbox.equals(x);
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
        oclAsType.setIsBlackbox(exists);
        // mapping statements
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
     * { |
     * topLevelCS.pivot.oclAsType(Model)
     *   .ownedPackages := let
     *     dummyPackage : Package[1] = Package{
     *       name = '', ownedClasses = ownedTypes.pivot.oclAsType(Element)
     *       .oclAsType(Class)
     *     };
     * 
     *   in
     *     dummyPackage->includingAll(ownedPackages.pivot.oclAsType(Package));
     * }
     * 
     */
    protected boolean uModel_ownedPackages(final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS topLevelCS_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Property CTORid_name = idResolver.getProperty(PROPid_name);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Model_0 = idResolver.getClass(CLSSid_Model, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        final /*@NonNull*/ /*@NonInvalid*/ Property CTORid_ownedClasses = idResolver.getProperty(PROPid_ownedClasses);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = topLevelCS_1.getPivot();
        final /*@Nullable*/ /*@Thrown*/ org.eclipse.ocl.pivot.Model oclAsType = (org.eclipse.ocl.pivot.Model)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Model_0);
        final /*@NonNull*/ /*@Thrown*/ Package dummyPackage = (Package)TYP_Package_0.createInstance();
        CTORid_name.initValue(dummyPackage, STR_);
        final /*@Nullable*/ /*@Thrown*/ List<TypeCS> ownedTypes = topLevelCS_1.getOwnedTypes();
        assert ownedTypes != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedTypes = idResolver.createOrderedSetOfAll(ORD_CLSSid_TypeCS, ownedTypes);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Element);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedTypes.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ TypeCS _1 = (TypeCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Element)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Element_0 = idResolver.getClass(CLSSid_Element, null);
            if (_1 == null) {
                throwNull(topLevelCS_1, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Element oclAsType_0 = (Element)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_Element_0);
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Class);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Element _1_0 = (Element)ITERATOR__1_0.next();
            /**
             * oclAsType(Class)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
            final /*@Nullable*/ /*@Thrown*/ Class oclAsType_1 = (Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1_0, TYP_Class_0);
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<Class> UNBOXED_collect = collect.asEcoreObjects(idResolver, Class.class);
        assert UNBOXED_collect != null;
        CTORid_ownedClasses.initValue(dummyPackage, UNBOXED_collect);
        final /*@NonNull*/ /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_Package, dummyPackage);
        final /*@Nullable*/ /*@Thrown*/ List<PackageCS> ownedPackages = topLevelCS_1.getOwnedPackages();
        assert ownedPackages != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedPackages = idResolver.createOrderedSetOfAll(ORD_CLSSid_PackageCS, ownedPackages);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Package);
        /*@Nullable*/ Iterator<?> ITERATOR__1_1 = BOXED_ownedPackages.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_1;
        while (true) {
            if (!ITERATOR__1_1.hasNext()) {
                collect_1 = accumulator_1;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ PackageCS _1_1 = (PackageCS)ITERATOR__1_1.next();
            /**
             * pivot.oclAsType(Package)
             */
            if (_1_1 == null) {
                throwNull(topLevelCS_1, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_1 = _1_1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Package oclAsType_2 = (Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_1, TYP_Package_0);
            //
            accumulator_1.add(oclAsType_2);
        }
        final /*@NonNull*/ /*@Thrown*/ SetValue includingAll = (SetValue)CollectionIncludingAllOperation.INSTANCE.evaluate(oclAsSet, collect_1);
        final List<Package> UNBOXED_includingAll = includingAll.asEcoreObjects(idResolver, Package.class);
        assert UNBOXED_includingAll != null;
        oclAsType.getOwnedPackages().addAll(UNBOXED_includingAll);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uPackage_name in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (topLevelCS : qvtoperationalcs::TopLevelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * { |
     * topLevelCS.pivot.oclAsType(Package).name := '';
     * }
     * 
     */
    protected boolean uPackage_name(final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS topLevelCS_2) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = topLevelCS_2.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Package oclAsType = (Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Package_0);
        oclAsType.setName(STR_);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map uPackage_ownedClasses in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   leftCS (topLevelCS : qvtoperationalcs::TopLevelCS[1];
     *  |)
     * { |}
     * rightAS ( |)
     * { |}
     * where ( |)
     * { |
     * topLevelCS.pivot.oclAsType(Package)
     *   .ownedClasses := ownedTypes.pivot.oclAsType(Element)
     *   .oclAsType(Class);
     * }
     * 
     */
    protected boolean uPackage_ownedClasses(final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS topLevelCS_3) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Package_0 = idResolver.getClass(CLSSid_Package, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = topLevelCS_3.getPivot();
        final /*@Nullable*/ /*@Thrown*/ Package oclAsType = (Package)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_Package_0);
        final /*@Nullable*/ /*@Thrown*/ List<TypeCS> ownedTypes = topLevelCS_3.getOwnedTypes();
        assert ownedTypes != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedTypes = idResolver.createOrderedSetOfAll(ORD_CLSSid_TypeCS, ownedTypes);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Element);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedTypes.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ TypeCS _1 = (TypeCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Element)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Element_0 = idResolver.getClass(CLSSid_Element, null);
            if (_1 == null) {
                throwNull(topLevelCS_3, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Element oclAsType_0 = (Element)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_Element_0);
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Class);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ Element _1_0 = (Element)ITERATOR__1_0.next();
            /**
             * oclAsType(Class)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Class_0 = idResolver.getClass(CLSSid_Class, null);
            final /*@Nullable*/ /*@Thrown*/ Class oclAsType_1 = (Class)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1_0, TYP_Class_0);
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<Class> UNBOXED_collect = collect.asEcoreObjects(idResolver, Class.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnedClasses().addAll(UNBOXED_collect);
        // mapping statements
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
     * { |
     * transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation).name := name;
     * }
     * 
     */
    protected boolean uOperationalTransformation_name(final /*@NonNull*/ /*@NonInvalid*/ TransformationCS transformationCS_0) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = transformationCS_0.getPivot();
        final /*@Nullable*/ /*@Thrown*/ OperationalTransformation oclAsType = (OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0);
        final /*@Nullable*/ /*@Thrown*/ String name = transformationCS_0.getName();
        oclAsType.setName(name);
        // mapping statements
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
     * { |
     * transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation)
     *   .modelParameter := parameters.pivot.oclAsType(qvtoperational::VarParameter)
     *   .oclAsType(qvtoperational::ModelParameter);
     * }
     * 
     */
    protected boolean uOperationalTransformation_modelParameter(final /*@NonNull*/ /*@NonInvalid*/ TransformationCS transformationCS_1) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = transformationCS_1.getPivot();
        final /*@Nullable*/ /*@Thrown*/ OperationalTransformation oclAsType = (OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0);
        final /*@Nullable*/ /*@Thrown*/ List<ParameterDeclarationCS> parameters = transformationCS_1.getParameters();
        assert parameters != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_parameters = idResolver.createOrderedSetOfAll(ORD_CLSSid_ParameterDeclarationCS, parameters);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_VarParameter);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_parameters.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect_0;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect_0 = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ ParameterDeclarationCS _1 = (ParameterDeclarationCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(qvtoperational::VarParameter)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_VarParameter_0 = idResolver.getClass(CLSSid_VarParameter, null);
            if (_1 == null) {
                throwNull(transformationCS_1, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ VarParameter oclAsType_0 = (VarParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_qvtoperational_c_c_VarParameter_0);
            //
            accumulator.add(oclAsType_0);
        }
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_ModelParameter);
        /*@Nullable*/ Iterator<?> ITERATOR__1_0 = collect_0.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1_0.hasNext()) {
                collect = accumulator_0;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ VarParameter _1_0 = (VarParameter)ITERATOR__1_0.next();
            /**
             * oclAsType(qvtoperational::ModelParameter)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_ModelParameter_0 = idResolver.getClass(CLSSid_ModelParameter, null);
            final /*@Nullable*/ /*@Thrown*/ ModelParameter oclAsType_1 = (ModelParameter)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, _1_0, TYP_qvtoperational_c_c_ModelParameter_0);
            //
            accumulator_0.add(oclAsType_1);
        }
        final List<ModelParameter> UNBOXED_collect = collect.asEcoreObjects(idResolver, ModelParameter.class);
        assert UNBOXED_collect != null;
        oclAsType.getModelParameter().addAll(UNBOXED_collect);
        // mapping statements
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
     * { |
     * transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation)
     *   .ownedOperations := ownedOperations.pivot.oclAsType(Operation);
     * }
     * 
     */
    protected boolean uOperationalTransformation_ownedOperations(final /*@NonNull*/ /*@NonInvalid*/ TransformationCS transformationCS_2) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = transformationCS_2.getPivot();
        final /*@Nullable*/ /*@Thrown*/ OperationalTransformation oclAsType = (OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0);
        final /*@Nullable*/ /*@Thrown*/ List<OperationCS> ownedOperations = transformationCS_2.getOwnedOperations();
        assert ownedOperations != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_ownedOperations = idResolver.createOrderedSetOfAll(ORD_CLSSid_OperationCS, ownedOperations);
        /*@NonNull*/ /*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Operation);
        /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_ownedOperations.iterator();
        /*@NonNull*/ /*@Thrown*/ SequenceValue collect;
        while (true) {
            if (!ITERATOR__1.hasNext()) {
                collect = accumulator;
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ OperationCS _1 = (OperationCS)ITERATOR__1.next();
            /**
             * pivot.oclAsType(Operation)
             */
            final /*@NonNull*/ /*@NonInvalid*/ Class TYP_Operation_0 = idResolver.getClass(CLSSid_Operation, null);
            if (_1 == null) {
                throwNull(transformationCS_2, "Null source for \'basecs::PivotableElementCS::pivot\'");
            }
            final /*@Nullable*/ /*@Thrown*/ Element pivot_0 = _1.getPivot();
            final /*@Nullable*/ /*@Thrown*/ Operation oclAsType_0 = (Operation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot_0, TYP_Operation_0);
            //
            accumulator.add(oclAsType_0);
        }
        final List<Operation> UNBOXED_collect = collect.asEcoreObjects(idResolver, Operation.class);
        assert UNBOXED_collect != null;
        oclAsType.getOwnedOperations().addAll(UNBOXED_collect);
        // mapping statements
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
     * { |
     * transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation)
     *   .isBlackbox := qualifiers->exists(x | x = 'blackbox');
     * }
     * 
     */
    protected boolean uOperationalTransformation_isBlackbox(final /*@NonNull*/ /*@NonInvalid*/ TransformationCS transformationCS_3) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = transformationCS_3.getPivot();
        final /*@Nullable*/ /*@Thrown*/ OperationalTransformation oclAsType = (OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0);
        final /*@Nullable*/ /*@Thrown*/ List<String> qualifiers = transformationCS_3.getQualifiers();
        assert qualifiers != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_qualifiers = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, qualifiers);
        /*@NonNull*/ /*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_qualifiers.iterator();
        /*@Thrown*/ boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValueUtil.FALSE_VALUE) {
                    exists = (Boolean)accumulator;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ String x = (String)ITERATOR_x.next();
            /**
             * x = 'blackbox'
             */
            final /*@NonInvalid*/ boolean eq = STR_blackbox.equals(x);
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
        oclAsType.setIsBlackbox(exists);
        // mapping statements
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
     * { |
     * transformationCS.pivot.oclAsType(qvtoperational::OperationalTransformation)
     *   .isAbstract := qualifiers->exists(x | x = 'abstract');
     * }
     * 
     */
    protected boolean uOperationalTransformation_isAbstract(final /*@NonNull*/ /*@NonInvalid*/ TransformationCS transformationCS_4) {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperational_c_c_OperationalTransformation_0 = idResolver.getClass(CLSSid_OperationalTransformation, null);
        // creations
        // assignments
        final /*@Nullable*/ /*@Thrown*/ Element pivot = transformationCS_4.getPivot();
        final /*@Nullable*/ /*@Thrown*/ OperationalTransformation oclAsType = (OperationalTransformation)OclAnyOclAsTypeOperation.INSTANCE.evaluate(evaluator, pivot, TYP_qvtoperational_c_c_OperationalTransformation_0);
        final /*@Nullable*/ /*@Thrown*/ List<String> qualifiers = transformationCS_4.getQualifiers();
        assert qualifiers != null;
        final /*@NonNull*/ /*@Thrown*/ OrderedSetValue BOXED_qualifiers = idResolver.createOrderedSetOfAll(ORD_PRIMid_String, qualifiers);
        /*@NonNull*/ /*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
        /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_qualifiers.iterator();
        /*@Thrown*/ boolean exists;
        while (true) {
            if (!ITERATOR_x.hasNext()) {
                if (accumulator == ValueUtil.FALSE_VALUE) {
                    exists = (Boolean)accumulator;
                }
                else {
                    throw (InvalidValueException)accumulator;
                }
                break;
            }
            /*@Nullable*/ /*@NonInvalid*/ String x = (String)ITERATOR_x.next();
            /**
             * x = 'abstract'
             */
            final /*@NonInvalid*/ boolean eq = STR_abstract.equals(x);
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
        oclAsType.setIsAbstract(exists);
        // mapping statements
        return true;
    }
    
    /**
     * 
     * map __root__ in QVTOperationalCS2AS_qvtp_qvtias {
     * 
     *   where ( |)
     * { |}
     * for operationParameterDeclarationCS : qvtoperationalcs::OperationParameterDeclarationCS in qvtoperationalcs::OperationParameterDeclarationCS.allInstances()
     *    {
     * 
     *     map cOperationParameterDeclarationCS_2_VarParameter {
     * operationParameterDeclarationCS := operationParameterDeclarationCS;
     * }}
     *   for operationParameterDeclarationCS : qvtoperationalcs::OperationParameterDeclarationCS in qvtoperationalcs::OperationParameterDeclarationCS.allInstances()
     *    {
     * 
     *     map uVarParameter_name {
     * operationParameterDeclarationCS := operationParameterDeclarationCS;
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
     *     map cParameterDeclarationCS_2_VarParameter {
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
     *   for topLevelCS : qvtoperationalcs::TopLevelCS in qvtoperationalcs::TopLevelCS.allInstances()
     *    {
     * map cTopLevelCS_2_Package {
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
     * map uLibrary_isBlackbox {
     * qVToLibraryCS := qVToLibraryCS;
     * }}
     *   for topLevelCS : qvtoperationalcs::TopLevelCS in qvtoperationalcs::TopLevelCS.allInstances()
     *    {
     * map uModel_ownedPackages {
     * topLevelCS := topLevelCS;
     * }}
     *   for topLevelCS : qvtoperationalcs::TopLevelCS in qvtoperationalcs::TopLevelCS.allInstances()
     *    {
     * map uPackage_name {
     * topLevelCS := topLevelCS;
     * }}
     *   for topLevelCS : qvtoperationalcs::TopLevelCS in qvtoperationalcs::TopLevelCS.allInstances()
     *    {
     * map uPackage_ownedClasses {
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
    protected boolean __root__() {
        // predicates
        final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_ClassifierPropertyCS_2 = idResolver.getClass(CLSSid_ClassifierPropertyCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_MappingOperationCS_2 = idResolver.getClass(CLSSid_MappingOperationCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_MetamodelCS_4 = idResolver.getClass(CLSSid_MetamodelCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_OperationParameterDeclarationCS_1 = idResolver.getClass(CLSSid_OperationParameterDeclarationCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_ParameterDeclarationCS_3 = idResolver.getClass(CLSSid_ParameterDeclarationCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_QVToClassCS_3 = idResolver.getClass(CLSSid_QVToClassCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_QVToLibraryCS_3 = idResolver.getClass(CLSSid_QVToLibraryCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_TopLevelCS_4 = idResolver.getClass(CLSSid_TopLevelCS, null);
        final /*@NonNull*/ /*@NonInvalid*/ Class TYP_qvtoperationalcs_c_c_TransformationCS_5 = idResolver.getClass(CLSSid_TransformationCS, null);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_14 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_ClassifierPropertyCS, TYP_qvtoperationalcs_c_c_ClassifierPropertyCS_2);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_16 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_MappingOperationCS, TYP_qvtoperationalcs_c_c_MappingOperationCS_2);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_18 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_MetamodelCS, TYP_qvtoperationalcs_c_c_MetamodelCS_4);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_0 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_OperationParameterDeclarationCS, TYP_qvtoperationalcs_c_c_OperationParameterDeclarationCS_1);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_2 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_ParameterDeclarationCS, TYP_qvtoperationalcs_c_c_ParameterDeclarationCS_3);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_22 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_QVToClassCS, TYP_qvtoperationalcs_c_c_QVToClassCS_3);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_25 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_QVToLibraryCS, TYP_qvtoperationalcs_c_c_QVToLibraryCS_3);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_13 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_TopLevelCS, TYP_qvtoperationalcs_c_c_TopLevelCS_4);
        final /*@NonNull*/ /*@Thrown*/ SetValue allInstances_6 = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, SET_CLSSid_TransformationCS, TYP_qvtoperationalcs_c_c_TransformationCS_5);
        final List<ClassifierPropertyCS> UNBOXED_allInstances_14 = allInstances_14.asEcoreObjects(idResolver, ClassifierPropertyCS.class);
        assert UNBOXED_allInstances_14 != null;
        final List<MappingOperationCS> UNBOXED_allInstances_16 = allInstances_16.asEcoreObjects(idResolver, MappingOperationCS.class);
        assert UNBOXED_allInstances_16 != null;
        final List<MetamodelCS> UNBOXED_allInstances_18 = allInstances_18.asEcoreObjects(idResolver, MetamodelCS.class);
        assert UNBOXED_allInstances_18 != null;
        final List<OperationParameterDeclarationCS> UNBOXED_allInstances_0 = allInstances_0.asEcoreObjects(idResolver, OperationParameterDeclarationCS.class);
        assert UNBOXED_allInstances_0 != null;
        final List<ParameterDeclarationCS> UNBOXED_allInstances_2 = allInstances_2.asEcoreObjects(idResolver, ParameterDeclarationCS.class);
        assert UNBOXED_allInstances_2 != null;
        final List<QVToClassCS> UNBOXED_allInstances_22 = allInstances_22.asEcoreObjects(idResolver, QVToClassCS.class);
        assert UNBOXED_allInstances_22 != null;
        final List<QVToLibraryCS> UNBOXED_allInstances_25 = allInstances_25.asEcoreObjects(idResolver, QVToLibraryCS.class);
        assert UNBOXED_allInstances_25 != null;
        final List<TopLevelCS> UNBOXED_allInstances_13 = allInstances_13.asEcoreObjects(idResolver, TopLevelCS.class);
        assert UNBOXED_allInstances_13 != null;
        final List<TransformationCS> UNBOXED_allInstances_6 = allInstances_6.asEcoreObjects(idResolver, TransformationCS.class);
        assert UNBOXED_allInstances_6 != null;
        // creations
        // assignments
        // mapping statements
        ;
        for (OperationParameterDeclarationCS operationParameterDeclarationCS_3 : UNBOXED_allInstances_0) {
            if (operationParameterDeclarationCS_3 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ OperationParameterDeclarationCS symbol_1 = (OperationParameterDeclarationCS)operationParameterDeclarationCS_3;
                cOperationParameterDeclarationCS_2_VarParameter(symbol_1);
            }
        }
        ;
        for (OperationParameterDeclarationCS operationParameterDeclarationCS_4 : UNBOXED_allInstances_0) {
            if (operationParameterDeclarationCS_4 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ OperationParameterDeclarationCS symbol_5 = (OperationParameterDeclarationCS)operationParameterDeclarationCS_4;
                uVarParameter_name(symbol_5);
            }
        }
        ;
        for (ParameterDeclarationCS parameterDeclarationCS_7 : UNBOXED_allInstances_2) {
            if (parameterDeclarationCS_7 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ParameterDeclarationCS symbol_9 = (ParameterDeclarationCS)parameterDeclarationCS_7;
                cParameterDeclarationCS_2_ModelParameter(symbol_9);
            }
        }
        ;
        for (ParameterDeclarationCS parameterDeclarationCS_8 : UNBOXED_allInstances_2) {
            if (parameterDeclarationCS_8 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ParameterDeclarationCS symbol_13 = (ParameterDeclarationCS)parameterDeclarationCS_8;
                cParameterDeclarationCS_2_VarParameter(symbol_13);
            }
        }
        ;
        for (ParameterDeclarationCS parameterDeclarationCS_9 : UNBOXED_allInstances_2) {
            if (parameterDeclarationCS_9 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ParameterDeclarationCS symbol_17 = (ParameterDeclarationCS)parameterDeclarationCS_9;
                uVarParameter_name(symbol_17);
            }
        }
        ;
        for (ParameterDeclarationCS parameterDeclarationCS_10 : UNBOXED_allInstances_2) {
            if (parameterDeclarationCS_10 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ParameterDeclarationCS symbol_21 = (ParameterDeclarationCS)parameterDeclarationCS_10;
                uModelParameter_name(symbol_21);
            }
        }
        ;
        for (TransformationCS transformationCS_11 : UNBOXED_allInstances_6) {
            if (transformationCS_11 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TransformationCS symbol_25 = (TransformationCS)transformationCS_11;
                cTransformationCS_2_OperationalTransformation(symbol_25);
            }
        }
        ;
        for (TransformationCS transformationCS_12 : UNBOXED_allInstances_6) {
            if (transformationCS_12 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TransformationCS symbol_29 = (TransformationCS)transformationCS_12;
                uOperationalTransformation_modelParameter(symbol_29);
            }
        }
        ;
        for (ClassifierPropertyCS classifierPropertyCS_5 : UNBOXED_allInstances_14) {
            if (classifierPropertyCS_5 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ClassifierPropertyCS symbol_33 = (ClassifierPropertyCS)classifierPropertyCS_5;
                cClassifierPropertyCS_2_Property(symbol_33);
            }
        }
        ;
        for (MappingOperationCS mappingOperationCS_5 : UNBOXED_allInstances_16) {
            if (mappingOperationCS_5 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ MappingOperationCS symbol_37 = (MappingOperationCS)mappingOperationCS_5;
                cMappingOperationCS_2_MappingOperation(symbol_37);
            }
        }
        ;
        for (MetamodelCS metamodelCS_9 : UNBOXED_allInstances_18) {
            if (metamodelCS_9 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS symbol_41 = (MetamodelCS)metamodelCS_9;
                cMetamodelCS_2_Package(symbol_41);
            }
        }
        ;
        for (QVToClassCS qVToClassCS_7 : UNBOXED_allInstances_22) {
            if (qVToClassCS_7 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ QVToClassCS symbol_45 = (QVToClassCS)qVToClassCS_7;
                cQVToClassCS_2_Class(symbol_45);
            }
        }
        ;
        for (QVToLibraryCS qVToLibraryCS_7 : UNBOXED_allInstances_25) {
            if (qVToLibraryCS_7 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ QVToLibraryCS symbol_49 = (QVToLibraryCS)qVToLibraryCS_7;
                cQVToLibraryCS_2_Library(symbol_49);
            }
        }
        ;
        for (TopLevelCS topLevelCS_9 : UNBOXED_allInstances_13) {
            if (topLevelCS_9 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS symbol_53 = (TopLevelCS)topLevelCS_9;
                cTopLevelCS_2_Model(symbol_53);
            }
        }
        ;
        for (TopLevelCS topLevelCS_10 : UNBOXED_allInstances_13) {
            if (topLevelCS_10 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS symbol_57 = (TopLevelCS)topLevelCS_10;
                cTopLevelCS_2_Package(symbol_57);
            }
        }
        ;
        for (ClassifierPropertyCS classifierPropertyCS_6 : UNBOXED_allInstances_14) {
            if (classifierPropertyCS_6 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ClassifierPropertyCS symbol_61 = (ClassifierPropertyCS)classifierPropertyCS_6;
                uProperty_name(symbol_61);
            }
        }
        ;
        for (ClassifierPropertyCS classifierPropertyCS_7 : UNBOXED_allInstances_14) {
            if (classifierPropertyCS_7 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ ClassifierPropertyCS symbol_65 = (ClassifierPropertyCS)classifierPropertyCS_7;
                uProperty_isComposite(symbol_65);
            }
        }
        ;
        for (MappingOperationCS mappingOperationCS_6 : UNBOXED_allInstances_16) {
            if (mappingOperationCS_6 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ MappingOperationCS symbol_69 = (MappingOperationCS)mappingOperationCS_6;
                uMappingOperation_name(symbol_69);
            }
        }
        ;
        for (MappingOperationCS mappingOperationCS_7 : UNBOXED_allInstances_16) {
            if (mappingOperationCS_7 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ MappingOperationCS symbol_73 = (MappingOperationCS)mappingOperationCS_7;
                uMappingOperation_ownedParameters(symbol_73);
            }
        }
        ;
        for (MetamodelCS metamodelCS_10 : UNBOXED_allInstances_18) {
            if (metamodelCS_10 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS symbol_77 = (MetamodelCS)metamodelCS_10;
                uPackage_name(symbol_77);
            }
        }
        ;
        for (MetamodelCS metamodelCS_11 : UNBOXED_allInstances_18) {
            if (metamodelCS_11 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS symbol_81 = (MetamodelCS)metamodelCS_11;
                uPackage_nsPrefix(symbol_81);
            }
        }
        ;
        for (MetamodelCS metamodelCS_12 : UNBOXED_allInstances_18) {
            if (metamodelCS_12 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS symbol_85 = (MetamodelCS)metamodelCS_12;
                uPackage_URI(symbol_85);
            }
        }
        ;
        for (MetamodelCS metamodelCS_13 : UNBOXED_allInstances_18) {
            if (metamodelCS_13 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ MetamodelCS symbol_89 = (MetamodelCS)metamodelCS_13;
                uPackage_ownedClasses(symbol_89);
            }
        }
        ;
        for (QVToClassCS qVToClassCS_8 : UNBOXED_allInstances_22) {
            if (qVToClassCS_8 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ QVToClassCS symbol_93 = (QVToClassCS)qVToClassCS_8;
                uClass_name(symbol_93);
            }
        }
        ;
        for (QVToClassCS qVToClassCS_9 : UNBOXED_allInstances_22) {
            if (qVToClassCS_9 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ QVToClassCS symbol_97 = (QVToClassCS)qVToClassCS_9;
                uClass_ownedProperties(symbol_97);
            }
        }
        ;
        for (QVToClassCS qVToClassCS_10 : UNBOXED_allInstances_22) {
            if (qVToClassCS_10 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ QVToClassCS symbol_101 = (QVToClassCS)qVToClassCS_10;
                uClass_ownedOperations(symbol_101);
            }
        }
        ;
        for (QVToLibraryCS qVToLibraryCS_8 : UNBOXED_allInstances_25) {
            if (qVToLibraryCS_8 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ QVToLibraryCS symbol_105 = (QVToLibraryCS)qVToLibraryCS_8;
                uLibrary_name(symbol_105);
            }
        }
        ;
        for (QVToLibraryCS qVToLibraryCS_9 : UNBOXED_allInstances_25) {
            if (qVToLibraryCS_9 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ QVToLibraryCS symbol_109 = (QVToLibraryCS)qVToLibraryCS_9;
                uLibrary_ownedOperations(symbol_109);
            }
        }
        ;
        for (QVToLibraryCS qVToLibraryCS_10 : UNBOXED_allInstances_25) {
            if (qVToLibraryCS_10 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ QVToLibraryCS symbol_113 = (QVToLibraryCS)qVToLibraryCS_10;
                uLibrary_isBlackbox(symbol_113);
            }
        }
        ;
        for (TopLevelCS topLevelCS_11 : UNBOXED_allInstances_13) {
            if (topLevelCS_11 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS symbol_117 = (TopLevelCS)topLevelCS_11;
                uModel_ownedPackages(symbol_117);
            }
        }
        ;
        for (TopLevelCS topLevelCS_12 : UNBOXED_allInstances_13) {
            if (topLevelCS_12 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS symbol_121 = (TopLevelCS)topLevelCS_12;
                uPackage_name(symbol_121);
            }
        }
        ;
        for (TopLevelCS topLevelCS_13 : UNBOXED_allInstances_13) {
            if (topLevelCS_13 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TopLevelCS symbol_125 = (TopLevelCS)topLevelCS_13;
                uPackage_ownedClasses(symbol_125);
            }
        }
        ;
        for (TransformationCS transformationCS_13 : UNBOXED_allInstances_6) {
            if (transformationCS_13 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TransformationCS symbol_129 = (TransformationCS)transformationCS_13;
                uOperationalTransformation_name(symbol_129);
            }
        }
        ;
        for (TransformationCS transformationCS_14 : UNBOXED_allInstances_6) {
            if (transformationCS_14 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TransformationCS symbol_133 = (TransformationCS)transformationCS_14;
                uOperationalTransformation_ownedOperations(symbol_133);
            }
        }
        ;
        for (TransformationCS transformationCS_15 : UNBOXED_allInstances_6) {
            if (transformationCS_15 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TransformationCS symbol_137 = (TransformationCS)transformationCS_15;
                uOperationalTransformation_isBlackbox(symbol_137);
            }
        }
        ;
        for (TransformationCS transformationCS_16 : UNBOXED_allInstances_6) {
            if (transformationCS_16 != null) {
                final /*@NonNull*/ /*@NonInvalid*/ TransformationCS symbol_141 = (TransformationCS)transformationCS_16;
                uOperationalTransformation_isAbstract(symbol_141);
            }
        }
        return true;
    }
}
