package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.essentialocl.cs2as.EssentialOCLCS2AS;

public class ImperativeOCLCS2AS extends EssentialOCLCS2AS {
	

	public ImperativeOCLCS2AS(@NonNull EnvironmentFactoryInternal environmentFactory,
			@NonNull BaseCSResource csResource, @NonNull ASResource asResource) {
		super(environmentFactory, csResource, asResource);
	}
	/*
	@Override
	protected @NonNull ImperativeOCLCSVisitor<Continuation<?>> createContainmentVisitor(
			@NonNull CS2ASConversion converter) {
		return new NewImperativeOCLCSContainmentVisitor(converter);
	}
	
	@Override
	protected @NonNull
	ImperativeOCLCSVisitor<Continuation<?>> createPreOrderVisitor(
			@NonNull CS2ASConversion converter) {
	
		return new ImperativeOCLCSPreOrderVisitor(converter);
	}
	
	@Override
	protected @NonNull
	ImperativeOCLCSVisitor<Continuation<?>> createPostOrderVisitor(
			@NonNull CS2ASConversion converter) {
		return new ImperativeOCLCSPostOrderVisitor(converter);
	}

	@Override
	protected @NonNull
	ImperativeOCLCSVisitor<Element> createLeft2RightVisitor(
			@NonNull CS2ASConversion converter) {
		return new ImperativeOCLCSLeft2RightVisitor(converter);
	}
	*/
}
