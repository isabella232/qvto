/*******************************************************************************
 * «codeGenHelper.getCopyright(' * ')»
 *
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.autogen.lookup.LookupUnqualifiedCodeGenerator
 *
 * Do not edit it.
 ********************************************************************************/

package org.eclipse.qvto.examples.pivot.imperativeocl.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.OCLExpression;
import org.eclipse.ocl.pivot.Variable;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.lookup.LookupEnvironment;
import org.eclipse.ocl.pivot.internal.lookup.LookupPackage;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionIndexOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.util.PivotUnqualifiedLookupVisitor;
import org.eclipse.ocl.pivot.util.Visitable;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeOCLPackage;

public class ImperativeOCLUnqualifiedLookupVisitor
	extends AbstractImperativeOCLCommonLookupVisitor
{
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_ocl_s_2015_s_Lookup = IdManager.getNsURIPackageId("http://www.eclipse.org/ocl/2015/Lookup", null, LookupPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL = IdManager.getNsURIPackageId("http://www.eclipse.org/qvt/pivot/1.0/ImperativeOCL", null, ImperativeOCLPackage.eINSTANCE);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_java_c_s_s_org_eclipse_qvto_examples_pivot_imperativeocl_util = IdManager.getRootPackageId("java://org.eclipse.qvto.examples.pivot.imperativeocl.util");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_evaluation = IdManager.getRootPackageId("org.eclipse.ocl.pivot.evaluation");
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull RootPackageId PACKid_org_eclipse_ocl_pivot_ids = IdManager.getRootPackageId("org.eclipse.ocl.pivot.ids");
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
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_Executor = PACKid_org_eclipse_ocl_pivot_evaluation.getClassId("Executor", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_ForExp = PACKid_http_c_s_s_www_eclipse_org_s_qvt_s_pivot_s_1_0_s_ImperativeOCL.getClassId("ForExp", 0);
    public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull ClassId CLSSid_IdResolver = PACKid_org_eclipse_ocl_pivot_ids.getClassId("IdResolver", 0);
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
    
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.evaluation.@org.eclipse.jdt.annotation.NonNull Executor executor;
    protected final /*@Thrown*/ org.eclipse.ocl.pivot.ids.@org.eclipse.jdt.annotation.NonNull IdResolver idResolver;
    protected /*@Thrown*/ java.lang.@org.eclipse.jdt.annotation.Nullable Object child;
    
    public ImperativeOCLUnqualifiedLookupVisitor(/*@NonNull*/ LookupEnvironment context) {
        super(context);
        this.executor = context.getExecutor();
        this.idResolver = executor.getIdResolver();
    }
    
    @Override
    protected /*@Nullable*/ LookupEnvironment doVisiting(/*@NonNull*/ Visitable visitable) {
        return parentEnv((EObject)visitable);
    }
    @Override
    protected PivotUnqualifiedLookupVisitor createSuperLangVisitor() {
        return new PivotUnqualifiedLookupVisitor(context);}
    
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
     * visitAltExp(element : imperativeocl::AltExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitAltExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull AltExp element) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element);
        return parentEnv;
    }
    
    /**
     * visitAssertExp(element : imperativeocl::AssertExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitAssertExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull AssertExp element_0) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_0);
        return parentEnv;
    }
    
    /**
     * visitAssignExp(element : imperativeocl::AssignExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitAssignExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull AssignExp element_1) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_1);
        return parentEnv;
    }
    
    /**
     * visitBlockExp(element : imperativeocl::BlockExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitBlockExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull BlockExp element_2) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_2);
        return parentEnv;
    }
    
    /**
     * visitBreakExp(element : imperativeocl::BreakExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitBreakExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull BreakExp element_3) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_3);
        return parentEnv;
    }
    
    /**
     * visitCatchExp(element : imperativeocl::CatchExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitCatchExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull CatchExp element_4) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_4);
        return parentEnv;
    }
    
    /**
     * visitComputeExp(element : imperativeocl::ComputeExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitComputeExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ComputeExp element_5) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_5);
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull OCLExpression body = element_5.getBody();
        final /*@Thrown*/ boolean eq = body.equals(child);
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
        if (eq) {
            if (parentEnv_0 == null) {
                throw new InvalidValueException("Null source for \'lookup::LookupEnvironment::addElement(NamedElement[?]) : lookup::LookupEnvironment[1]\'");
            }
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull Variable returnedElement = element_5.getReturnedElement();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElement = parentEnv_0.addElement(returnedElement);
            symbol_0 = addElement;
        }
        else {
            symbol_0 = parentEnv_0;
        }
        return symbol_0;
    }
    
    /**
     * visitContinueExp(element : imperativeocl::ContinueExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitContinueExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ContinueExp element_6) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_6);
        return parentEnv;
    }
    
    /**
     * visitDictLiteralExp(element : imperativeocl::DictLiteralExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitDictLiteralExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull DictLiteralExp element_7) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_7);
        return parentEnv;
    }
    
    /**
     * visitDictLiteralPart(element : imperativeocl::DictLiteralPart[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitDictLiteralPart(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull DictLiteralPart element_8) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_8);
        return parentEnv;
    }
    
    /**
     * visitDictionaryType(element : imperativeocl::DictionaryType[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitDictionaryType(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull DictionaryType element_9) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_9);
        return parentEnv;
    }
    
    /**
     * visitForExp(element : imperativeocl::ForExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitForExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ForExp element_10) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ownedIterators = element_10.getOwnedIterators();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression condition = element_10.getCondition();
        final /*@Thrown*/ boolean eq = (condition != null) ? condition.equals(child) : (child == null);
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_5;
        if (eq) {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = context.addElements(ownedIterators);
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
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull OCLExpression ownedBody = element_10.getOwnedBody();
            final /*@Thrown*/ boolean eq_0 = ownedBody.equals(child);
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_4;
            if (eq_0) {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = context.addElements(ownedIterators);
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
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedIterators_1 = idResolver.createOrderedSetOfAll(ORD_CLSSid_Variable, ownedIterators);
                final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_ownedIterators_1, child).booleanValue();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_3;
                if (includes) {
                    /*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_Variable);
                    /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_ownedIterators_1.iterator();
                    /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue select;
                    while (true) {
                        if (!ITERATOR_x.hasNext()) {
                            select = accumulator;
                            break;
                        }
                        /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Variable x = (Variable)ITERATOR_x.next();
                        /**
                         * _'<' : Boolean[1]
                         */
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_ownedIterators_1, x);
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_0 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_ownedIterators_1, child);
                        final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf, indexOf_0).booleanValue();
                        //
                        if (lt == ValueUtil.TRUE_VALUE) {
                            accumulator.add(x);
                        }
                    }
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_select = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, select);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_1 = context.addElements(ECORE_select);
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
     * visitImperativeExpression(element : imperativeocl::ImperativeExpression[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitImperativeExpression(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ImperativeExpression element_11) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_11);
        return parentEnv;
    }
    
    /**
     * visitImperativeIterateExp(element : imperativeocl::ImperativeIterateExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitImperativeIterateExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ImperativeIterateExp element_12) {
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ownedIterators_1 = element_12.getOwnedIterators();
        final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable OCLExpression condition = element_12.getCondition();
        final /*@Thrown*/ boolean eq = (condition != null) ? condition.equals(child) : (child == null);
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_5;
        if (eq) {
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment addElements = context.addElements(ownedIterators_1);
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Variable target = element_12.getTarget();
            final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner = addElements.addElement(target);
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
            final /*@Thrown*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.NonNull OCLExpression ownedBody = element_12.getOwnedBody();
            final /*@Thrown*/ boolean eq_0 = ownedBody.equals(child);
            /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_4;
            if (eq_0) {
                final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_0 = context.addElements(ownedIterators_1);
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
                final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_ownedIterators_1 = idResolver.createOrderedSetOfAll(ORD_CLSSid_Variable, ownedIterators_1);
                final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_ownedIterators_1, child).booleanValue();
                /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_3;
                if (includes) {
                    /*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ORD_CLSSid_Variable);
                    /*@Nullable*/ Iterator<?> ITERATOR_x = BOXED_ownedIterators_1.iterator();
                    /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue select;
                    while (true) {
                        if (!ITERATOR_x.hasNext()) {
                            select = accumulator;
                            break;
                        }
                        /*@NonInvalid*/ org.eclipse.ocl.pivot.@org.eclipse.jdt.annotation.Nullable Variable x = (Variable)ITERATOR_x.next();
                        /**
                         * _'<' : Boolean[1]
                         */
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_ownedIterators_1, x);
                        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull IntegerValue indexOf_0 = OrderedCollectionIndexOfOperation.INSTANCE.evaluate(BOXED_ownedIterators_1, child);
                        final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE.evaluate(executor, indexOf, indexOf_0).booleanValue();
                        //
                        if (lt == ValueUtil.TRUE_VALUE) {
                            accumulator.add(x);
                        }
                    }
                    final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<Variable> ECORE_select = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Variable.class, select);
                    final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.NonNull LookupEnvironment inner_1 = context.addElements(ECORE_select);
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
     * visitImperativeLoopExp(element : imperativeocl::ImperativeLoopExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitImperativeLoopExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ImperativeLoopExp element_13) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_13);
        return parentEnv;
    }
    
    /**
     * visitInstantiationExp(element : imperativeocl::InstantiationExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitInstantiationExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull InstantiationExp element_14) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_14);
        return parentEnv;
    }
    
    /**
     * visitListLiteralExp(element : imperativeocl::ListLiteralExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitListLiteralExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ListLiteralExp element_15) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_15);
        return parentEnv;
    }
    
    /**
     * visitListType(element : imperativeocl::ListType[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitListType(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ListType element_16) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_16);
        return parentEnv;
    }
    
    /**
     * visitLogExp(element : imperativeocl::LogExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitLogExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull LogExp element_17) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_17);
        return parentEnv;
    }
    
    /**
     * visitOrderedTupleLiteralExp(element : imperativeocl::OrderedTupleLiteralExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitOrderedTupleLiteralExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull OrderedTupleLiteralExp element_18) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_18);
        return parentEnv;
    }
    
    /**
     * visitOrderedTupleLiteralPart(element : imperativeocl::OrderedTupleLiteralPart[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitOrderedTupleLiteralPart(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull OrderedTupleLiteralPart element_19) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_19);
        return parentEnv;
    }
    
    /**
     * visitOrderedTupleType(element : imperativeocl::OrderedTupleType[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitOrderedTupleType(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull OrderedTupleType element_20) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_20);
        return parentEnv;
    }
    
    /**
     * visitRaiseExp(element : imperativeocl::RaiseExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitRaiseExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull RaiseExp element_21) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_21);
        return parentEnv;
    }
    
    /**
     * visitReturnExp(element : imperativeocl::ReturnExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitReturnExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull ReturnExp element_22) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_22);
        return parentEnv;
    }
    
    /**
     * visitSwitchExp(element : imperativeocl::SwitchExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitSwitchExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull SwitchExp element_23) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_23);
        return parentEnv;
    }
    
    /**
     * visitTryExp(element : imperativeocl::TryExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitTryExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull TryExp element_24) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv_0 = this.parentEnv(element_24);
        final /*@Thrown*/ java.util.@org.eclipse.jdt.annotation.NonNull List<OCLExpression> tryBody = element_24.getTryBody();
        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@org.eclipse.jdt.annotation.NonNull OrderedSetValue BOXED_tryBody = idResolver.createOrderedSetOfAll(ORD_CLSSid_OCLExpression, tryBody);
        final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_tryBody, child).booleanValue();
        /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment symbol_0;
        if (includes) {
            symbol_0 = parentEnv_0;
        }
        else {
            symbol_0 = parentEnv_0;
        }
        return symbol_0;
    }
    
    /**
     * visitTypedef(element : imperativeocl::Typedef[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitTypedef(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull Typedef element_25) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_25);
        return parentEnv;
    }
    
    /**
     * visitUnlinkExp(element : imperativeocl::UnlinkExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitUnlinkExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull UnlinkExp element_26) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_26);
        return parentEnv;
    }
    
    /**
     * visitUnpackExp(element : imperativeocl::UnpackExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitUnpackExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull UnpackExp element_27) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_27);
        return parentEnv;
    }
    
    /**
     * visitVariableInitExp(element : imperativeocl::VariableInitExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitVariableInitExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull VariableInitExp element_28) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_28);
        return parentEnv;
    }
    
    /**
     * visitWhileExp(element : imperativeocl::WhileExp[1]) : lookup::LookupEnvironment[?]
     * 
     * _'null' : lookup::LookupEnvironment[?]
     */
    @Override
    public /*@NonInvalid*/ LookupEnvironment visitWhileExp(final /*@NonInvalid*/ org.eclipse.qvto.examples.pivot.imperativeocl.@org.eclipse.jdt.annotation.NonNull WhileExp element_29) {
        final /*@Thrown*/ org.eclipse.ocl.pivot.internal.lookup.@org.eclipse.jdt.annotation.Nullable LookupEnvironment parentEnv = this.parentEnv(element_29);
        return parentEnv;
    }
}
