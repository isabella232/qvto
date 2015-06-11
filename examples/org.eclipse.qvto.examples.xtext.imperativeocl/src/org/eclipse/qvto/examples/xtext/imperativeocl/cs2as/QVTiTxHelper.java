package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.evaluation.tx.TransformationExecutor;
import org.eclipse.ocl.pivot.utilities.OCL;


public class QVTiTxHelper  {
	
	final private OCL ocl; 
	
	public QVTiTxHelper(@NonNull OCL ocl) {
		this.ocl = ocl;
	}
	
	public @NonNull TxEvaluator createTxEvaluator(Class<? extends TransformationExecutor> txClass)
			throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		return new TxEvaluator(ocl.getCompleteEnvironment(), txClass);
	}	

}
