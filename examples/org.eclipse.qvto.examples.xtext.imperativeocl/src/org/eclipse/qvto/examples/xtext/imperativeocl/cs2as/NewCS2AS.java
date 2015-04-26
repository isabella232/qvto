package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
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
		
		CS2ASTransformationExecutor tx = null;		
		//QVTiFacade qvt = QVTiFacade.createInstance(QVTiFacade.NO_PROJECTS, rSet);
		try {/*
			//TransformationEvaluator evaluator = qvt.createTxEvaluator(Source2Target_qvtp_qvtias.class);
			TransformationEvaluator evaluator = null;
			tx = (CS2ASTransformationExecutor) evaluator.getExecutor();
			
			tx.addRootObjects("leftCS", ClassUtil.nonNullState(eResource.getContents()));
			if (tx.run()) {
				URI asModelURI = eResource.getURI().appendFileExtension("xmi");
				Resource outputResource = rSet.getResource(asModelURI, false);
				if (outputResource == null) {
					outputResource = rSet.createResource(asModelURI);
				}
				outputResource.getContents().clear();
				outputResource.getContents().addAll(tx.getRootObjects("rightAS"));
				outputResource.save(null); // FIXME
			}*/
			return true;
		}
		catch (CS2ASException exception) {
			addDiagnostic((ElementCS) exception.getCSObject(), exception.getMessage());
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

	
}
