/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 ********************************************************************************/

package org.eclipse.qvto.examples.pivot.qvtoperational.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.Parameter;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.lookup.LookupEnvironment;
import org.eclipse.ocl.pivot.internal.lookup.LookupPackage;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionIndexOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeOCLPackage;
import org.eclipse.qvto.examples.pivot.imperativeocl.VariableInitExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.util.ImperativeOCLUnqualifiedLookupVisitor;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModelParameter;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModuleImport;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.VarParameter;

public class QVTOperationalUnqualifiedLookupVisitor
	extends ImperativeOCLUnqualifiedLookupVisitor
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
    
    protected /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child;
    
    public QVTOperationalUnqualifiedLookupVisitor(/*@NonNull*/ LookupEnvironment context) {
        super(context);
    }
    
    /**
     * visitConstructor(element : qvtoperational::Constructor[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitConstructor(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Constructor element) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element);
        return parentEnv;
    }
    
    /**
     * visitConstructorBody(element : qvtoperational::ConstructorBody[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitConstructorBody(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ConstructorBody element_0) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> content = element_0.getContent();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_content = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, content);
        final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_content, child).booleanValue());
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (includes) {
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_0 = idResolver.getClass(CLSSid_VariableInitExp, null);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable = element_0.getVariable();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(variable);
            /*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_OCLExpression);
            /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_content.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue select;
            while (true) {
                if (!ITERATOR_x.hasNext()) {
                    select = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression x = (OCLExpression)ITERATOR_x.next();
                /**
                 * _'<' : Boolean[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, x));
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_0 = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, child));
                final /*@Thrown*/ boolean lt = ClassUtil.nonNullState(OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf, indexOf_0).booleanValue());
                //
                if (lt == ValueUtil.TRUE_VALUE) {
                    accumulator.add(x);
                }
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = ClassUtil.nonNullState((OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, select, TYP_imperativeocl_c_c_VariableInitExp_0));
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR__1 = selectByKind.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    collect = accumulator_0;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1 = (VariableInitExp)ITERATOR__1.next();
                /**
                 * _'null' : Variable[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable = _1.getReferredVariable();
                //
                accumulator_0.add(referredVariable);
            }
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, collect);
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ECORE_collect);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_0);
                symbol_0 = parentEnv;
            }
            symbol_1 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_0);
            symbol_1 = parentEnv_0;
        }
        return symbol_1;
    }
    
    /**
     * visitContextualProperty(element : qvtoperational::ContextualProperty[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitContextualProperty(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ContextualProperty element_1) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_1);
        return parentEnv;
    }
    
    /**
     * visitDummyRelation(element : qvtoperational::DummyRelation[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitDummyRelation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull DummyRelation element_2) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_2);
        return parentEnv;
    }
    
    /**
     * visitDummyRelationDomain(element : qvtoperational::DummyRelationDomain[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitDummyRelationDomain(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull DummyRelationDomain element_3) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_3);
        return parentEnv;
    }
    
    /**
     * visitDummyRelationalTransformation(element : qvtoperational::DummyRelationalTransformation[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitDummyRelationalTransformation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull DummyRelationalTransformation element_4) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_4);
        return parentEnv;
    }
    
    /**
     * visitEntryOperation(element : qvtoperational::EntryOperation[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitEntryOperation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull EntryOperation element_5) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_5);
        return parentEnv;
    }
    
    /**
     * visitHelper(element : qvtoperational::Helper[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitHelper(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Helper element_6) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_6);
        return parentEnv;
    }
    
    /**
     * visitImperativeCallExp(element : qvtoperational::ImperativeCallExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitImperativeCallExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ImperativeCallExp element_7) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_7);
        return parentEnv;
    }
    
    /**
     * visitImperativeOperation(element : qvtoperational::ImperativeOperation[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitImperativeOperation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ImperativeOperation element_8) {
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable OperationBody body = element_8.getBody();
        final /*@Thrown*/ boolean eq = (body != null) ? body.equals(child) : (child == null);
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (eq) {
            final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable VarParameter context_0 = element_8.getContext();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElement = context.addElement(context_0);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<VarParameter> result = element_8.getResult();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = addElement.addElements(result);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Parameter> ownedParameters = element_8.getOwnedParameters();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ownedParameters);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_8);
                symbol_0 = parentEnv;
            }
            symbol_1 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_8);
            symbol_1 = parentEnv_0;
        }
        return symbol_1;
    }
    
    /**
     * visitLibrary(element : qvtoperational::Library[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitLibrary(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Library element_9) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Property> ownedProperties = element_9.getOwnedProperties();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(ownedProperties);
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Operation> ownedOperations = element_9.getOwnedOperations();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_0 = addElements.addElements(ownedOperations);
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ownedVariable = element_9.getOwnedVariable();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements_0.addElements(ownedVariable);
        final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
        if (hasFinalResult) {
            symbol_2 = inner;
        }
        else {
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ModuleImport> moduleImport = element_9.getModuleImport();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_moduleImport = idResolver.createOrderedSetOfAll(ORD_CLSSid_ModuleImport, moduleImport);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Module);
            /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_moduleImport.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue elements;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    elements = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable ModuleImport _1 = (ModuleImport)ITERATOR__1.next();
                /**
                 * _'null' : qvtoperational::Module[?]
                 */
                if (_1 == null) {
                    throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/qvt/pivot/1.0/QVTOperational\'::ModuleImport::module\'");
                }
                final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable Module module = _1.getModule();
                //
                accumulator.add(module);
            }
            /*@NonInvalid*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment acc = context;
            /*@Nullable*/ Iterator<?> ITERATOR_element_25 = elements.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment iterate;
            while (true) {
                if (!ITERATOR_element_25.hasNext()) {
                    iterate = acc;
                    break;
                }
                /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object element_25 = (Object)ITERATOR_element_25.next();
                /**
                 * _'null' : lookup::LookupEnvironment[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment OP_pivot_c_c_OclElement_c_c__env_o_OclElement_91_63_93_e_32_c_32_lookup_c_c_LookupEnvironment_91_63_93_0 = idResolver.getOperation(OPid__env);
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment newEnv = (LookupEnvironment)OP_pivot_c_c_OclElement_c_c__env_o_OclElement_91_63_93_e_32_c_32_lookup_c_c_LookupEnvironment_91_63_93_0.evaluate(executor, CLSSid_LookupEnvironment, element_25, null);
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_namedElements = idResolver.getProperty(PROPid_namedElements);
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<NamedElement> namedElements = acc.getNamedElements();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_NamedElement, namedElements);
                if (newEnv == null) {
                    throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/ocl/2015/Lookup\'::LookupEnvironment::namedElements\'");
                }
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<NamedElement> namedElements_0 = newEnv.getNamedElements();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_NamedElement, namedElements_0);
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue including = ClassUtil.nonNullState((OrderedSetValue)CollectionIncludingOperation.INSTANCE.evaluate(BOXED_namedElements, BOXED_namedElements_0));
                final List<? extends Object> UNBOXED_including = including.asEcoreObjects(idResolver, Object.class);
                assert UNBOXED_including != null;
                CTORid_namedElements.initValue(symbol_0, UNBOXED_including);
                //
                acc = symbol_0;
            }
            if (iterate == null) {
                throw new InvalidValueException("Null source for \'lookup::LookupEnvironment::hasFinalResult() : Boolean[?]\'");
            }
            final /*@Thrown*/ boolean hasFinalResult_0 = iterate.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
            if (hasFinalResult_0) {
                symbol_1 = iterate;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_9);
                symbol_1 = parentEnv;
            }
            symbol_2 = symbol_1;
        }
        return symbol_2;
    }
    
    /**
     * visitMappingBody(element : qvtoperational::MappingBody[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitMappingBody(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull MappingBody element_10) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> content = element_10.getContent();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_content = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, content);
        final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_content, child).booleanValue());
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_5;
        if (includes) {
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_0 = idResolver.getClass(CLSSid_VariableInitExp, null);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable = element_10.getVariable();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(variable);
            /*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_OCLExpression);
            /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_content.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue select;
            while (true) {
                if (!ITERATOR_x.hasNext()) {
                    select = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression x = (OCLExpression)ITERATOR_x.next();
                /**
                 * _'<' : Boolean[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, x));
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_0 = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, child));
                final /*@Thrown*/ boolean lt = ClassUtil.nonNullState(OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf, indexOf_0).booleanValue());
                //
                if (lt == ValueUtil.TRUE_VALUE) {
                    accumulator.add(x);
                }
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = ClassUtil.nonNullState((OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, select, TYP_imperativeocl_c_c_VariableInitExp_0));
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR__1 = selectByKind.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    collect = accumulator_0;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1 = (VariableInitExp)ITERATOR__1.next();
                /**
                 * _'null' : Variable[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable = _1.getReferredVariable();
                //
                accumulator_0.add(referredVariable);
            }
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, collect);
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ECORE_collect);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_10);
                symbol_0 = parentEnv;
            }
            symbol_5 = symbol_0;
        }
        else {
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> initSection = element_10.getInitSection();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_initSection = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, initSection);
            final /*@Thrown*/ boolean includes_0 = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_initSection, child).booleanValue());
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_4;
            if (includes_0) {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_1 = idResolver.getClass(CLSSid_VariableInitExp, null);
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable_0 = element_10.getVariable();
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_0 = context.addElements(variable_0);
                /*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_1 = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_OCLExpression);
                /*@Nullable*/ Iterator<?> ITERATOR_x_0 = BOXED_content.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue select_0;
                while (true) {
                    if (!ITERATOR_x_0.hasNext()) {
                        select_0 = accumulator_1;
                        break;
                    }
                    /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression x_0 = (OCLExpression)ITERATOR_x_0.next();
                    /**
                     * _'<' : Boolean[1]
                     */
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_1 = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_initSection, x_0));
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_2 = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_initSection, child));
                    final /*@Thrown*/ boolean lt_0 = ClassUtil.nonNullState(OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf_1, indexOf_2).booleanValue());
                    //
                    if (lt_0 == ValueUtil.TRUE_VALUE) {
                        accumulator_1.add(x_0);
                    }
                }
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind_0 = ClassUtil.nonNullState((OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, select_0, TYP_imperativeocl_c_c_VariableInitExp_1));
                /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_2 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
                /*@NonNull*/ Iterator<?> ITERATOR__1_0 = selectByKind_0.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_0;
                while (true) {
                    if (!ITERATOR__1_0.hasNext()) {
                        collect_0 = accumulator_2;
                        break;
                    }
                    /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1_0 = (VariableInitExp)ITERATOR__1_0.next();
                    /**
                     * _'null' : Variable[1]
                     */
                    final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable_0 = _1_0.getReferredVariable();
                    //
                    accumulator_2.add(referredVariable_0);
                }
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_collect_0 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, collect_0);
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = addElements_0.addElements(ECORE_collect_0);
                final /*@Thrown*/ boolean hasFinalResult_0 = inner_0.hasFinalResult();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
                if (hasFinalResult_0) {
                    symbol_1 = inner_0;
                }
                else {
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_10);
                    symbol_1 = parentEnv_0;
                }
                symbol_4 = symbol_1;
            }
            else {
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> endSection = element_10.getEndSection();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_endSection = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, endSection);
                final /*@Thrown*/ boolean includes_1 = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_endSection, child).booleanValue());
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_3;
                if (includes_1) {
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_2 = idResolver.getClass(CLSSid_VariableInitExp, null);
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable_1 = element_10.getVariable();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_1 = context.addElements(variable_1);
                    /*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_3 = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_OCLExpression);
                    /*@Nullable*/ Iterator<?> ITERATOR_x_1 = BOXED_content.iterator();
                    /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue select_1;
                    while (true) {
                        if (!ITERATOR_x_1.hasNext()) {
                            select_1 = accumulator_3;
                            break;
                        }
                        /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression x_1 = (OCLExpression)ITERATOR_x_1.next();
                        /**
                         * _'<' : Boolean[1]
                         */
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_3 = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_endSection, x_1));
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_4 = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_endSection, child));
                        final /*@Thrown*/ boolean lt_1 = ClassUtil.nonNullState(OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf_3, indexOf_4).booleanValue());
                        //
                        if (lt_1 == ValueUtil.TRUE_VALUE) {
                            accumulator_3.add(x_1);
                        }
                    }
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind_1 = ClassUtil.nonNullState((OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, select_1, TYP_imperativeocl_c_c_VariableInitExp_2));
                    /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_4 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
                    /*@NonNull*/ Iterator<?> ITERATOR__1_1 = selectByKind_1.iterator();
                    /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_1;
                    while (true) {
                        if (!ITERATOR__1_1.hasNext()) {
                            collect_1 = accumulator_4;
                            break;
                        }
                        /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1_1 = (VariableInitExp)ITERATOR__1_1.next();
                        /**
                         * _'null' : Variable[1]
                         */
                        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable_1 = _1_1.getReferredVariable();
                        //
                        accumulator_4.add(referredVariable_1);
                    }
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_collect_1 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, collect_1);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_1 = addElements_1.addElements(ECORE_collect_1);
                    final /*@Thrown*/ boolean hasFinalResult_1 = inner_1.hasFinalResult();
                    /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
                    if (hasFinalResult_1) {
                        symbol_2 = inner_1;
                    }
                    else {
                        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_1 = this.parentEnv(element_10);
                        symbol_2 = parentEnv_1;
                    }
                    symbol_3 = symbol_2;
                }
                else {
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_2 = this.parentEnv(element_10);
                    symbol_3 = parentEnv_2;
                }
                symbol_4 = symbol_3;
            }
            symbol_5 = symbol_4;
        }
        return symbol_5;
    }
    
    /**
     * visitMappingCallExp(element : qvtoperational::MappingCallExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitMappingCallExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull MappingCallExp element_11) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_11);
        return parentEnv;
    }
    
    /**
     * visitMappingOperation(element : qvtoperational::MappingOperation[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitMappingOperation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull MappingOperation element_12) {
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable OperationBody body = element_12.getBody();
        final /*@Thrown*/ boolean eq = (body != null) ? body.equals(child) : (child == null);
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_5;
        if (eq) {
            final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable VarParameter context_0 = element_12.getContext();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElement = context.addElement(context_0);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<VarParameter> result = element_12.getResult();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = addElement.addElements(result);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Parameter> ownedParameters = element_12.getOwnedParameters();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ownedParameters);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_12);
                symbol_0 = parentEnv;
            }
            symbol_5 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression when = element_12.getWhen();
            final /*@Thrown*/ boolean eq_0 = (when != null) ? when.equals(child) : (child == null);
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_4;
            if (eq_0) {
                final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable VarParameter context_1 = element_12.getContext();
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElement_0 = context.addElement(context_1);
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Parameter> ownedParameters_0 = element_12.getOwnedParameters();
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = addElement_0.addElements(ownedParameters_0);
                final /*@Thrown*/ boolean hasFinalResult_0 = inner_0.hasFinalResult();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
                if (hasFinalResult_0) {
                    symbol_1 = inner_0;
                }
                else {
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_12);
                    symbol_1 = parentEnv_0;
                }
                symbol_4 = symbol_1;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression where = element_12.getWhere();
                final /*@Thrown*/ boolean eq_1 = (where != null) ? where.equals(child) : (child == null);
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_3;
                if (eq_1) {
                    final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable VarParameter context_2 = element_12.getContext();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElement_1 = context.addElement(context_2);
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Parameter> ownedParameters_1 = element_12.getOwnedParameters();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_0 = addElement_1.addElements(ownedParameters_1);
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<VarParameter> result_0 = element_12.getResult();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_1 = addElements_0.addElements(result_0);
                    final /*@Thrown*/ boolean hasFinalResult_1 = inner_1.hasFinalResult();
                    /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
                    if (hasFinalResult_1) {
                        symbol_2 = inner_1;
                    }
                    else {
                        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_1 = this.parentEnv(element_12);
                        symbol_2 = parentEnv_1;
                    }
                    symbol_3 = symbol_2;
                }
                else {
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_2 = this.parentEnv(element_12);
                    symbol_3 = parentEnv_2;
                }
                symbol_4 = symbol_3;
            }
            symbol_5 = symbol_4;
        }
        return symbol_5;
    }
    
    /**
     * visitMappingParameter(element : qvtoperational::MappingParameter[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitMappingParameter(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull MappingParameter element_13) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_13);
        return parentEnv;
    }
    
    /**
     * visitModelParameter(element : qvtoperational::ModelParameter[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitModelParameter(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ModelParameter element_14) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_14);
        return parentEnv;
    }
    
    /**
     * visitModelType(element : qvtoperational::ModelType[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitModelType(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ModelType element_15) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Package> metamodel_0 = element_15.getMetamodel();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = context.addElements(metamodel_0);
        final /*@Thrown*/ boolean hasFinalResult_0 = inner_0.hasFinalResult();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (hasFinalResult_0) {
            symbol_1 = inner_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_15);
            symbol_1 = parentEnv_0;
        }
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> additionalCondition = element_15.getAdditionalCondition();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_additionalCondition = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, additionalCondition);
        final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_additionalCondition, child).booleanValue());
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
        if (includes) {
            symbol_2 = symbol_1;
        }
        else {
            symbol_2 = symbol_1;
        }
        return symbol_2;
    }
    
    /**
     * visitModule(element : qvtoperational::Module[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitModule(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Module element_16) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Property> ownedProperties = element_16.getOwnedProperties();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(ownedProperties);
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Operation> ownedOperations = element_16.getOwnedOperations();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_0 = addElements.addElements(ownedOperations);
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ownedVariable = element_16.getOwnedVariable();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements_0.addElements(ownedVariable);
        final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
        if (hasFinalResult) {
            symbol_2 = inner;
        }
        else {
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ModuleImport> moduleImport = element_16.getModuleImport();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_moduleImport = idResolver.createOrderedSetOfAll(ORD_CLSSid_ModuleImport, moduleImport);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Module);
            /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_moduleImport.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue elements;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    elements = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable ModuleImport _1 = (ModuleImport)ITERATOR__1.next();
                /**
                 * _'null' : qvtoperational::Module[?]
                 */
                if (_1 == null) {
                    throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/qvt/pivot/1.0/QVTOperational\'::ModuleImport::module\'");
                }
                final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable Module module = _1.getModule();
                //
                accumulator.add(module);
            }
            /*@NonInvalid*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment acc = context;
            /*@Nullable*/ Iterator<?> ITERATOR_element_25 = elements.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment iterate;
            while (true) {
                if (!ITERATOR_element_25.hasNext()) {
                    iterate = acc;
                    break;
                }
                /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object element_25 = (Object)ITERATOR_element_25.next();
                /**
                 * _'null' : lookup::LookupEnvironment[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment OP_pivot_c_c_OclElement_c_c__env_o_OclElement_91_63_93_e_32_c_32_lookup_c_c_LookupEnvironment_91_63_93_0 = idResolver.getOperation(OPid__env);
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment newEnv = (LookupEnvironment)OP_pivot_c_c_OclElement_c_c__env_o_OclElement_91_63_93_e_32_c_32_lookup_c_c_LookupEnvironment_91_63_93_0.evaluate(executor, CLSSid_LookupEnvironment, element_25, null);
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_namedElements = idResolver.getProperty(PROPid_namedElements);
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<NamedElement> namedElements = acc.getNamedElements();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_NamedElement, namedElements);
                if (newEnv == null) {
                    throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/ocl/2015/Lookup\'::LookupEnvironment::namedElements\'");
                }
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<NamedElement> namedElements_0 = newEnv.getNamedElements();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_NamedElement, namedElements_0);
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue including = ClassUtil.nonNullState((OrderedSetValue)CollectionIncludingOperation.INSTANCE.evaluate(BOXED_namedElements, BOXED_namedElements_0));
                final List<? extends Object> UNBOXED_including = including.asEcoreObjects(idResolver, Object.class);
                assert UNBOXED_including != null;
                CTORid_namedElements.initValue(symbol_0, UNBOXED_including);
                //
                acc = symbol_0;
            }
            if (iterate == null) {
                throw new InvalidValueException("Null source for \'lookup::LookupEnvironment::hasFinalResult() : Boolean[?]\'");
            }
            final /*@Thrown*/ boolean hasFinalResult_0 = iterate.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
            if (hasFinalResult_0) {
                symbol_1 = iterate;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_16);
                symbol_1 = parentEnv;
            }
            symbol_2 = symbol_1;
        }
        return symbol_2;
    }
    
    /**
     * visitModuleImport(element : qvtoperational::ModuleImport[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitModuleImport(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ModuleImport element_17) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_17);
        return parentEnv;
    }
    
    /**
     * visitObjectExp(element : qvtoperational::ObjectExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitObjectExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ObjectExp element_18) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_18);
        return parentEnv;
    }
    
    /**
     * visitOperationBody(element : qvtoperational::OperationBody[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitOperationBody(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationBody element_19) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> content = element_19.getContent();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_content = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, content);
        final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_content, child).booleanValue());
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (includes) {
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_0 = idResolver.getClass(CLSSid_VariableInitExp, null);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable = element_19.getVariable();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(variable);
            /*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_OCLExpression);
            /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_content.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue select;
            while (true) {
                if (!ITERATOR_x.hasNext()) {
                    select = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression x = (OCLExpression)ITERATOR_x.next();
                /**
                 * _'<' : Boolean[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, x));
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_0 = ClassUtil.nonNullState(OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, child));
                final /*@Thrown*/ boolean lt = ClassUtil.nonNullState(OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf, indexOf_0).booleanValue());
                //
                if (lt == ValueUtil.TRUE_VALUE) {
                    accumulator.add(x);
                }
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = ClassUtil.nonNullState((OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, select, TYP_imperativeocl_c_c_VariableInitExp_0));
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR__1 = selectByKind.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    collect = accumulator_0;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1 = (VariableInitExp)ITERATOR__1.next();
                /**
                 * _'null' : Variable[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable = _1.getReferredVariable();
                //
                accumulator_0.add(referredVariable);
            }
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_collect = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, collect);
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ECORE_collect);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_19);
                symbol_0 = parentEnv;
            }
            symbol_1 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_19);
            symbol_1 = parentEnv_0;
        }
        return symbol_1;
    }
    
    /**
     * visitOperationalTransformation(element : qvtoperational::OperationalTransformation[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitOperationalTransformation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationalTransformation element_20) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ModelParameter> modelParameter = element_20.getModelParameter();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Operation> ownedOperations = element_20.getOwnedOperations();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Property> ownedProperties = element_20.getOwnedProperties();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ownedVariable = element_20.getOwnedVariable();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(ownedProperties);
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_0 = addElements.addElements(ownedOperations);
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_modelParameter = idResolver.createOrderedSetOfAll(ORD_CLSSid_ModelParameter, modelParameter);
        final /*@Thrown*/ boolean includes = ClassUtil.nonNullState(CollectionIncludesOperation.INSTANCE.evaluate(BOXED_modelParameter, child).booleanValue());
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_6;
        if (includes) {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements_0.addElements(ownedVariable);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
            if (hasFinalResult) {
                symbol_2 = inner;
            }
            else {
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ModuleImport> moduleImport = element_20.getModuleImport();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_moduleImport = idResolver.createOrderedSetOfAll(ORD_CLSSid_ModuleImport, moduleImport);
                /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Module);
                /*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_moduleImport.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue elements;
                while (true) {
                    if (!ITERATOR__1.hasNext()) {
                        elements = accumulator;
                        break;
                    }
                    /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable ModuleImport _1 = (ModuleImport)ITERATOR__1.next();
                    /**
                     * _'null' : qvtoperational::Module[?]
                     */
                    if (_1 == null) {
                        throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/qvt/pivot/1.0/QVTOperational\'::ModuleImport::module\'");
                    }
                    final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable Module module = _1.getModule();
                    //
                    accumulator.add(module);
                }
                /*@NonInvalid*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment acc = context;
                /*@Nullable*/ Iterator<?> ITERATOR_element_25 = elements.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment iterate;
                while (true) {
                    if (!ITERATOR_element_25.hasNext()) {
                        iterate = acc;
                        break;
                    }
                    /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object element_25 = (Object)ITERATOR_element_25.next();
                    /**
                     * _'null' : lookup::LookupEnvironment[1]
                     */
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment OP_pivot_c_c_OclElement_c_c__env_o_OclElement_91_63_93_e_32_c_32_lookup_c_c_LookupEnvironment_91_63_93_0 = idResolver.getOperation(OPid__env);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment newEnv = (LookupEnvironment)OP_pivot_c_c_OclElement_c_c__env_o_OclElement_91_63_93_e_32_c_32_lookup_c_c_LookupEnvironment_91_63_93_0.evaluate(executor, CLSSid_LookupEnvironment, element_25, null);
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_0 = idResolver.getClass(CLSSid_LookupEnvironment, null);
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_namedElements = idResolver.getProperty(PROPid_namedElements);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_0 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_0.createInstance();
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<NamedElement> namedElements = acc.getNamedElements();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements = idResolver.createOrderedSetOfAll(ORD_CLSSid_NamedElement, namedElements);
                    if (newEnv == null) {
                        throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/ocl/2015/Lookup\'::LookupEnvironment::namedElements\'");
                    }
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<NamedElement> namedElements_0 = newEnv.getNamedElements();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_NamedElement, namedElements_0);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue including = ClassUtil.nonNullState((OrderedSetValue)CollectionIncludingOperation.INSTANCE.evaluate(BOXED_namedElements, BOXED_namedElements_0));
                    final List<? extends Object> UNBOXED_including = including.asEcoreObjects(idResolver, Object.class);
                    assert UNBOXED_including != null;
                    CTORid_namedElements.initValue(symbol_0, UNBOXED_including);
                    //
                    acc = symbol_0;
                }
                if (iterate == null) {
                    throw new InvalidValueException("Null source for \'lookup::LookupEnvironment::hasFinalResult() : Boolean[?]\'");
                }
                final /*@Thrown*/ boolean hasFinalResult_0 = iterate.hasFinalResult();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
                if (hasFinalResult_0) {
                    symbol_1 = iterate;
                }
                else {
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_20);
                    symbol_1 = parentEnv;
                }
                symbol_2 = symbol_1;
            }
            symbol_6 = symbol_2;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_3 = addElements_0.addElements(ownedVariable);
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = addElements_3.addElements(modelParameter);
            final /*@Thrown*/ boolean hasFinalResult_1 = inner_0.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_5;
            if (hasFinalResult_1) {
                symbol_5 = inner_0;
            }
            else {
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ModuleImport> moduleImport_0 = element_20.getModuleImport();
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_moduleImport_0 = idResolver.createOrderedSetOfAll(ORD_CLSSid_ModuleImport, moduleImport_0);
                /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Module);
                /*@Nullable*/ Iterator<?> ITERATOR__1_0 = BOXED_moduleImport_0.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue elements_0;
                while (true) {
                    if (!ITERATOR__1_0.hasNext()) {
                        elements_0 = accumulator_0;
                        break;
                    }
                    /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable ModuleImport _1_0 = (ModuleImport)ITERATOR__1_0.next();
                    /**
                     * _'null' : qvtoperational::Module[?]
                     */
                    if (_1_0 == null) {
                        throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/qvt/pivot/1.0/QVTOperational\'::ModuleImport::module\'");
                    }
                    final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable Module module_0 = _1_0.getModule();
                    //
                    accumulator_0.add(module_0);
                }
                /*@NonInvalid*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment acc_0 = context;
                /*@Nullable*/ Iterator<?> ITERATOR_element_26 = elements_0.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment iterate_0;
                while (true) {
                    if (!ITERATOR_element_26.hasNext()) {
                        iterate_0 = acc_0;
                        break;
                    }
                    /*@NonInvalid*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object element_26 = (Object)ITERATOR_element_26.next();
                    /**
                     * _'null' : lookup::LookupEnvironment[1]
                     */
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment OP_pivot_c_c_OclElement_c_c__env_o_OclElement_91_63_93_e_32_c_32_lookup_c_c_LookupEnvironment_91_63_93_1 = idResolver.getOperation(OPid__env);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment newEnv_0 = (LookupEnvironment)OP_pivot_c_c_OclElement_c_c__env_o_OclElement_91_63_93_e_32_c_32_lookup_c_c_LookupEnvironment_91_63_93_1.evaluate(executor, CLSSid_LookupEnvironment, element_26, null);
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_lookup_c_c_LookupEnvironment_1 = idResolver.getClass(CLSSid_LookupEnvironment, null);
                    final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Property CTORid_namedElements_0 = idResolver.getProperty(PROPid_namedElements);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment symbol_3 = (LookupEnvironment)TYP_lookup_c_c_LookupEnvironment_1.createInstance();
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<NamedElement> namedElements_2 = acc_0.getNamedElements();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements_2 = idResolver.createOrderedSetOfAll(ORD_CLSSid_NamedElement, namedElements_2);
                    if (newEnv_0 == null) {
                        throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/ocl/2015/Lookup\'::LookupEnvironment::namedElements\'");
                    }
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<NamedElement> namedElements_3 = newEnv_0.getNamedElements();
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_namedElements_3 = idResolver.createOrderedSetOfAll(ORD_CLSSid_NamedElement, namedElements_3);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue including_0 = ClassUtil.nonNullState((OrderedSetValue)CollectionIncludingOperation.INSTANCE.evaluate(BOXED_namedElements_2, BOXED_namedElements_3));
                    final List<? extends Object> UNBOXED_including_0 = including_0.asEcoreObjects(idResolver, Object.class);
                    assert UNBOXED_including_0 != null;
                    CTORid_namedElements_0.initValue(symbol_3, UNBOXED_including_0);
                    //
                    acc_0 = symbol_3;
                }
                if (iterate_0 == null) {
                    throw new InvalidValueException("Null source for \'lookup::LookupEnvironment::hasFinalResult() : Boolean[?]\'");
                }
                final /*@Thrown*/ boolean hasFinalResult_2 = iterate_0.hasFinalResult();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_4;
                if (hasFinalResult_2) {
                    symbol_4 = iterate_0;
                }
                else {
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_20);
                    symbol_4 = parentEnv_0;
                }
                symbol_5 = symbol_4;
            }
            symbol_6 = symbol_5;
        }
        return symbol_6;
    }
    
    /**
     * visitResolveExp(element : qvtoperational::ResolveExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitResolveExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ResolveExp element_21) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression condition = element_21.getCondition();
        final /*@Thrown*/ boolean eq = (condition != null) ? condition.equals(child) : (child == null);
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (eq) {
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Variable target = element_21.getTarget();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = context.addElement(target);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_21);
                symbol_0 = parentEnv;
            }
            symbol_1 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_21);
            symbol_1 = parentEnv_0;
        }
        return symbol_1;
    }
    
    /**
     * visitResolveInExp(element : qvtoperational::ResolveInExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitResolveInExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ResolveInExp element_22) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_22);
        return parentEnv;
    }
    
    /**
     * visitTag(element : qvtoperational::Tag[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitTag(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Tag element_23) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_23);
        return parentEnv;
    }
    
    /**
     * visitVarParameter(element : qvtoperational::VarParameter[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitVarParameter(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull VarParameter element_24) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_24);
        return parentEnv;
    }
}
