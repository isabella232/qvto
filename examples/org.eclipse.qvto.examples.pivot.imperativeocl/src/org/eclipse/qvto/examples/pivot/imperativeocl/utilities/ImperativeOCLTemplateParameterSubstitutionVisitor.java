package org.eclipse.qvto.examples.pivot.imperativeocl.utilities;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.qvto.examples.pivot.imperativeocl.util.AbstractImperativeOCLTemplateParameterSubstitutionVisitor;

public class ImperativeOCLTemplateParameterSubstitutionVisitor 
	extends AbstractImperativeOCLTemplateParameterSubstitutionVisitor {

	protected ImperativeOCLTemplateParameterSubstitutionVisitor(@NonNull EnvironmentFactoryInternal environmentFactory,
			@Nullable Type selfType, @Nullable Type selfTypeValue) {
		super(environmentFactory, selfType, selfTypeValue);
	}

}
