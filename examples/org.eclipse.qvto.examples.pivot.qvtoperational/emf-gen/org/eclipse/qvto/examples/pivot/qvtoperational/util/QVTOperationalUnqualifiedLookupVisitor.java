/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.autogen.lookup.LookupUnqualifiedCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package org.eclipse.qvto.examples.pivot.qvtoperational.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionIndexOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.util.Visitable;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeOCLPackage;
import org.eclipse.qvto.examples.pivot.imperativeocl.VariableInitExp;
import org.eclipse.qvto.examples.pivot.imperativeocl.util.ImperativeOCLUnqualifiedLookupVisitor;
import org.eclipse.qvto.examples.pivot.qvtoperational.ModelParameter;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.VarParameter;

public class QVTOperationalUnqualifiedLookupVisitor
	extends AbstractQVTOperationalCommonLookupVisitor
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Lookup = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/Lookup", null, LookupPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/ImperativeOCL", null, ImperativeOCLPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/QVTOperational", null, QVTOperationalPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_java_c_s_s_org_eclipse_qvto_examples_pivot_qvtoperational_util = IdManager.getRootPackageId("java://org.eclipse.qvto.examples.pivot.qvtoperational.util");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_evaluation = IdManager.getRootPackageId("org.eclipse.ocl.pivot.evaluation");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_ids = IdManager.getRootPackageId("org.eclipse.ocl.pivot.ids");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Class = PACKid_$metamodel$.getClassId("Class", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ConstructorBody = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ConstructorBody", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Executor = PACKid_org_eclipse_ocl_pivot_evaluation.getClassId("Executor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IdResolver = PACKid_org_eclipse_ocl_pivot_ids.getClassId("IdResolver", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ImperativeOperation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ImperativeOperation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Library = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("Library", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_LookupEnvironment = PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Lookup.getClassId("LookupEnvironment", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MappingBody = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingBody", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_MappingOperation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("MappingOperation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModelParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ModelParameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ModelType = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ModelType", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OCLExpression = PACKid_$metamodel$.getClassId("OCLExpression", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OclElement = PACKid_$metamodel$.getClassId("OclElement", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Operation = PACKid_$metamodel$.getClassId("Operation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OperationBody = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("OperationBody", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_OperationalTransformation = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("OperationalTransformation", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Package = PACKid_$metamodel$.getClassId("Package", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Parameter = PACKid_$metamodel$.getClassId("Parameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Property = PACKid_$metamodel$.getClassId("Property", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_QVTOperationalUnqualifiedLookupVisitor = PACKid_java_c_s_s_org_eclipse_qvto_examples_pivot_qvtoperational_util.getClassId("QVTOperationalUnqualifiedLookupVisitor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ResolveExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("ResolveExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_VarParameter = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_QVTOperational.getClassId("VarParameter", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Variable = PACKid_$metamodel$.getClassId("Variable", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_VariableInitExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("VariableInitExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_ModelParameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_ModelParameter);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_OCLExpression = TypeId.ORDERED_SET.getSpecializedId(CLSSid_OCLExpression);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Operation = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Operation);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Package = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Package);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Parameter);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_Property = TypeId.ORDERED_SET.getSpecializedId(CLSSid_Property);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_VarParameter = TypeId.ORDERED_SET.getSpecializedId(CLSSid_VarParameter);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId ORD_CLSSid_VariableInitExp = TypeId.ORDERED_SET.getSpecializedId(CLSSid_VariableInitExp);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SEQ_CLSSid_Variable = TypeId.SEQUENCE.getSpecializedId(CLSSid_Variable);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_OCLExpression = TypeId.SET.getSpecializedId(CLSSid_OCLExpression);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_OperationBody = TypeId.SET.getSpecializedId(CLSSid_OperationBody);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull CollectionTypeId SET_CLSSid_Variable = TypeId.SET.getSpecializedId(CLSSid_Variable);
    
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.evaluation.@org.eclipse.jdt.annotation.NonNull Executor executor;
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver;
    protected /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child;
    
    public QVTOperationalUnqualifiedLookupVisitor(/*@NonNull*/ LookupEnvironment context) {
        super(context);
        this.executor = context.getExecutor();
        this.idResolver = executor.getIdResolver();
    }
    
    @Override
    protected /*@Nullable*/ LookupEnvironment doVisiting(/*@NonNull*/ Visitable visitable) {
        return parentEnv((EObject)visitable);
    }
    @Override
    protected ImperativeOCLUnqualifiedLookupVisitor createSuperLangVisitor() {
        return new ImperativeOCLUnqualifiedLookupVisitor(context);}
    
    /**
     * Continue the search for matches in the parent of element.
     */
    protected /*@Nullable*/ LookupEnvironment parentEnv(/*@NonNull*/ EObject element) {
        EObject parent = element.eContainer();
        if (parent instanceof Visitable) {
            this.child = element;
            return ((Visitable)parent).accept(this);
        }
        else {
            return context;
        }
    }
    
    /**
     * visitConstructorBody(element : qvtoperational::ConstructorBody[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitConstructorBody(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ConstructorBody element) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> content = element.getContent();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_content = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, content);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_content, child).booleanValue();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (includes) {
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_0 = idResolver.getClass(CLSSid_VariableInitExp, null);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable = element.getVariable();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(variable);
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_content, TYP_imperativeocl_c_c_VariableInitExp_0);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR__1 = selectByKind.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    collect = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1 = (VariableInitExp)ITERATOR__1.next();
                /**
                 * _'null' : Variable[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable = _1.getReferredVariable();
                //
                accumulator.add(referredVariable);
            }
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR_x = collect.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue select;
            while (true) {
                if (!ITERATOR_x.hasNext()) {
                    select = accumulator_0;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable x = (Variable)ITERATOR_x.next();
                /**
                 * _'<' : Boolean[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, x);
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_0 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, child);
                final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf, indexOf_0).booleanValue();
                //
                if (lt == ValueUtil.TRUE_VALUE) {
                    accumulator_0.add(x);
                }
            }
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_select = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, select);
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ECORE_select);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element);
                symbol_0 = parentEnv;
            }
            symbol_1 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element);
            symbol_1 = parentEnv_0;
        }
        return symbol_1;
    }
    
    /**
     * visitImperativeOperation(element : qvtoperational::ImperativeOperation[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitImperativeOperation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ImperativeOperation element_0) {
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable OperationBody body = element_0.getBody();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_OperationBody, body);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(oclAsSet, child).booleanValue();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (includes) {
            final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable VarParameter context_0 = element_0.getContext();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElement = context.addElement(context_0);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<VarParameter> result = element_0.getResult();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = addElement.addElements(result);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Parameter> ownedParameters = element_0.getOwnedParameters();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ownedParameters);
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
     * visitLibrary(element : qvtoperational::Library[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitLibrary(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull Library element_1) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Property> ownedProperties = element_1.getOwnedProperties();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(ownedProperties);
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Operation> ownedOperations = element_1.getOwnedOperations();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_0 = addElements.addElements(ownedOperations);
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ownedVariable = element_1.getOwnedVariable();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements_0.addElements(ownedVariable);
        final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
        if (hasFinalResult) {
            symbol_0 = inner;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_1);
            symbol_0 = parentEnv;
        }
        return symbol_0;
    }
    
    /**
     * visitMappingBody(element : qvtoperational::MappingBody[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitMappingBody(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull MappingBody element_2) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> content = element_2.getContent();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_content = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, content);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_content, child).booleanValue();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_3;
        if (includes) {
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_0 = idResolver.getClass(CLSSid_VariableInitExp, null);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable = element_2.getVariable();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(variable);
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_content, TYP_imperativeocl_c_c_VariableInitExp_0);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR__1 = selectByKind.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    collect = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1 = (VariableInitExp)ITERATOR__1.next();
                /**
                 * _'null' : Variable[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable = _1.getReferredVariable();
                //
                accumulator.add(referredVariable);
            }
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR_x = collect.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue select;
            while (true) {
                if (!ITERATOR_x.hasNext()) {
                    select = accumulator_0;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable x = (Variable)ITERATOR_x.next();
                /**
                 * _'<' : Boolean[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, x);
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_0 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, child);
                final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf, indexOf_0).booleanValue();
                //
                if (lt == ValueUtil.TRUE_VALUE) {
                    accumulator_0.add(x);
                }
            }
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_select = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, select);
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ECORE_select);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_2);
                symbol_0 = parentEnv;
            }
            symbol_3 = symbol_0;
        }
        else {
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> initSection = element_2.getInitSection();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_initSection = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, initSection);
            final /*@Thrown*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_initSection, child).booleanValue();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
            if (includes_0) {
                final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_1 = idResolver.getClass(CLSSid_VariableInitExp, null);
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable_0 = element_2.getVariable();
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_0 = context.addElements(variable_0);
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind_0 = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_initSection, TYP_imperativeocl_c_c_VariableInitExp_1);
                /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
                /*@NonNull*/ Iterator<?> ITERATOR__1_0 = selectByKind_0.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect_0;
                while (true) {
                    if (!ITERATOR__1_0.hasNext()) {
                        collect_0 = accumulator_1;
                        break;
                    }
                    /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1_0 = (VariableInitExp)ITERATOR__1_0.next();
                    /**
                     * _'null' : Variable[1]
                     */
                    final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable_0 = _1_0.getReferredVariable();
                    //
                    accumulator_1.add(referredVariable_0);
                }
                /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_2 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
                /*@NonNull*/ Iterator<?> ITERATOR_x_0 = collect_0.iterator();
                /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue select_0;
                while (true) {
                    if (!ITERATOR_x_0.hasNext()) {
                        select_0 = accumulator_2;
                        break;
                    }
                    /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable x_0 = (Variable)ITERATOR_x_0.next();
                    /**
                     * _'<' : Boolean[1]
                     */
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_1 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_initSection, x_0);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_2 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_initSection, child);
                    final /*@Thrown*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf_1, indexOf_2).booleanValue();
                    //
                    if (lt_0 == ValueUtil.TRUE_VALUE) {
                        accumulator_2.add(x_0);
                    }
                }
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_select_0 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, select_0);
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = addElements_0.addElements(ECORE_select_0);
                final /*@Thrown*/ boolean hasFinalResult_0 = inner_0.hasFinalResult();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
                if (hasFinalResult_0) {
                    symbol_1 = inner_0;
                }
                else {
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_2);
                    symbol_1 = parentEnv_0;
                }
                symbol_2 = symbol_1;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_1 = this.parentEnv(element_2);
                symbol_2 = parentEnv_1;
            }
            symbol_3 = symbol_2;
        }
        return symbol_3;
    }
    
    /**
     * visitMappingOperation(element : qvtoperational::MappingOperation[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitMappingOperation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull MappingOperation element_3) {
        final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable OperationBody body = element_3.getBody();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_OperationBody, body);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(oclAsSet, child).booleanValue();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_3;
        if (includes) {
            final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable VarParameter context_0 = element_3.getContext();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElement = context.addElement(context_0);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<VarParameter> result = element_3.getResult();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = addElement.addElements(result);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Parameter> ownedParameters = element_3.getOwnedParameters();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ownedParameters);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_3);
                symbol_0 = parentEnv;
            }
            symbol_3 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression when = element_3.getWhen();
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_OCLExpression, when);
            final /*@Thrown*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE.evaluate(oclAsSet_0, child).booleanValue();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
            if (includes_0) {
                final /*@Thrown*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.Nullable VarParameter context_1 = element_3.getContext();
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElement_0 = context.addElement(context_1);
                final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Parameter> ownedParameters_0 = element_3.getOwnedParameters();
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = addElement_0.addElements(ownedParameters_0);
                final /*@Thrown*/ boolean hasFinalResult_0 = inner_0.hasFinalResult();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
                if (hasFinalResult_0) {
                    symbol_1 = inner_0;
                }
                else {
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_3);
                    symbol_1 = parentEnv_0;
                }
                symbol_2 = symbol_1;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_1 = this.parentEnv(element_3);
                symbol_2 = parentEnv_1;
            }
            symbol_3 = symbol_2;
        }
        return symbol_3;
    }
    
    /**
     * visitModelType(element : qvtoperational::ModelType[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitModelType(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ModelType element_4) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Package> metamodel_0 = element_4.getMetamodel();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = context.addElements(metamodel_0);
        final /*@Thrown*/ boolean hasFinalResult_0 = inner_0.hasFinalResult();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (hasFinalResult_0) {
            symbol_1 = inner_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_4);
            symbol_1 = parentEnv_0;
        }
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> additionalCondition = element_4.getAdditionalCondition();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_additionalCondition = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, additionalCondition);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_additionalCondition, child).booleanValue();
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
     * visitOperationBody(element : qvtoperational::OperationBody[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitOperationBody(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationBody element_5) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> content = element_5.getContent();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_content = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, content);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_content, child).booleanValue();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (includes) {
            final /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Class TYP_imperativeocl_c_c_VariableInitExp_0 = idResolver.getClass(CLSSid_VariableInitExp, null);
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> variable = element_5.getVariable();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(variable);
            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue selectByKind = (OrderedSetValue)CollectionSelectByKindOperation.INSTANCE.evaluate(executor, BOXED_content, TYP_imperativeocl_c_c_VariableInitExp_0);
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR__1 = selectByKind.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue collect;
            while (true) {
                if (!ITERATOR__1.hasNext()) {
                    collect = accumulator;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp _1 = (VariableInitExp)ITERATOR__1.next();
                /**
                 * _'null' : Variable[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable referredVariable = _1.getReferredVariable();
                //
                accumulator.add(referredVariable);
            }
            /*@Thrown*/ SequenceValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(SEQ_CLSSid_Variable);
            /*@NonNull*/ Iterator<?> ITERATOR_x = collect.iterator();
            /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SequenceValue select;
            while (true) {
                if (!ITERATOR_x.hasNext()) {
                    select = accumulator_0;
                    break;
                }
                /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable x = (Variable)ITERATOR_x.next();
                /**
                 * _'<' : Boolean[1]
                 */
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, x);
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_0 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_content, child);
                final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf, indexOf_0).booleanValue();
                //
                if (lt == ValueUtil.TRUE_VALUE) {
                    accumulator_0.add(x);
                }
            }
            final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_select = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, select);
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElements(ECORE_select);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_5);
                symbol_0 = parentEnv;
            }
            symbol_1 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_5);
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
    public /*@NonInvalid*/ LookupEnvironment visitOperationalTransformation(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull OperationalTransformation element_6) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<ModelParameter> modelParameter = element_6.getModelParameter();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Operation> ownedOperations = element_6.getOwnedOperations();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Property> ownedProperties = element_6.getOwnedProperties();
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ownedVariable = element_6.getOwnedVariable();
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(ownedProperties);
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_0 = addElements.addElements(ownedOperations);
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_modelParameter = idResolver.createOrderedSetOfAll(ORD_CLSSid_ModelParameter, modelParameter);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_modelParameter, child).booleanValue();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_2;
        if (includes) {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements_0.addElements(ownedVariable);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_6);
                symbol_0 = parentEnv;
            }
            symbol_2 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements_3 = addElements_0.addElements(ownedVariable);
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = addElements_3.addElements(modelParameter);
            final /*@Thrown*/ boolean hasFinalResult_0 = inner_0.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
            if (hasFinalResult_0) {
                symbol_1 = inner_0;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_6);
                symbol_1 = parentEnv_0;
            }
            symbol_2 = symbol_1;
        }
        return symbol_2;
    }
    
    /**
     * visitResolveExp(element : qvtoperational::ResolveExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[1]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitResolveExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.qvtoperational.@org.eclipse.jdt.annotation.NonNull ResolveExp element_7) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression condition = element_7.getCondition();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, SET_CLSSid_OCLExpression, condition);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(oclAsSet, child).booleanValue();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_1;
        if (includes) {
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Variable target = element_7.getTarget();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = context.addElement(target);
            final /*@Thrown*/ boolean hasFinalResult = inner.hasFinalResult();
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
            if (hasFinalResult) {
                symbol_0 = inner;
            }
            else {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_7);
                symbol_0 = parentEnv;
            }
            symbol_1 = symbol_0;
        }
        else {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_7);
            symbol_1 = parentEnv_0;
        }
        return symbol_1;
    }
}
