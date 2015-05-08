package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;




public class NewCS2AS extends CS2ASConversion {

	
	public NewCS2AS(CS2AS converter, IDiagnosticConsumer diagnosticsConsumer) {
		super(converter, diagnosticsConsumer);

	}
	
	@Override
	public boolean update(@NonNull BaseCSResource csResource) {
		
		ResourceSet rSet = csResource.getResourceSet();
		CS2ASTransformationExecutor tx = null;		
		OCL qvt = OCL.newInstance(OCL.NO_PROJECTS, rSet);
		QVTiTxHelper helper = new QVTiTxHelper(qvt);
		try {
			TransformationEvaluator evaluator = helper.createTxEvaluator(getCS2ASTxClass());
			tx = (CS2ASTransformationExecutor) evaluator.getExecutor();
			
			tx.addRootObjects("leftCS", ClassUtil.nonNullState(csResource.getContents()));
			if (tx.run()) {
				URI asModelURI = csResource.getURI().appendFileExtension("xmi");
				Resource outputResource = rSet.getResource(asModelURI, false);
				if (outputResource == null) {
					outputResource = rSet.createResource(asModelURI);
				}
				outputResource.getContents().clear();
				outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
				outputResource.save(null); // FIXME
			}
			return true;
		}
		catch (CS2ASException exception) {
			addDiagnostic((ElementCS) exception.getCSObject(), exception.getMessage());
			return false;
		} catch(Exception exception) {
			// TODO 
			return false;
		} finally {
			if (tx != null) {
				List<CS2ASDiagnostic<ElementCS>> txErrors = tx.getErrors();
				for (CS2ASDiagnostic<ElementCS> diagnostic : txErrors) {
					addDiagnostic(diagnostic.getCSObject(), diagnostic.getMessage());				
				}
				txErrors.clear();
			}
			//qvt.dispose();
		}
	}

	protected Class<? extends TransformationExecutor> getCS2ASTxClass() {
		return null; // TODO for ImperativeOCL
	}
}
