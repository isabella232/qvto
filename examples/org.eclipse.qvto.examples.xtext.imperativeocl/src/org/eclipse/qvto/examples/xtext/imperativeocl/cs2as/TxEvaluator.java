package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.ocl.pivot.CompleteEnvironment;
import org.eclipse.ocl.pivot.evaluation.tx.AbstractTransformationEvaluator;
import org.eclipse.ocl.pivot.evaluation.tx.TransformationExecutor;

public class TxEvaluator extends AbstractTransformationEvaluator {

	public TxEvaluator(CompleteEnvironment environment, Class<? extends TransformationExecutor> txClass)
			throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		super(environment, txClass);
	}

}
