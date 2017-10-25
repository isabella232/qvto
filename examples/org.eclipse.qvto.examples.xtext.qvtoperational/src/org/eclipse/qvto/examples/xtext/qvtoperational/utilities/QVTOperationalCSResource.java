package org.eclipse.qvto.examples.xtext.qvtoperational.utilities;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.xtext.imperativeocl.utilities.ImperativeOCLCSResource;

public class QVTOperationalCSResource
extends ImperativeOCLCSResource {

	@Override
	public @NonNull String getASContentType() {
		return QVTOperationalPackage.eCONTENT_TYPE;
	}

	@Override
	public @NonNull URI getASURI(@NonNull URI csURI) {
		return csURI.trimFileExtension().appendFileExtension("qvtoas");
	}

	@Override
	public @NonNull
	String getEditorName() {
		return "QVT Operational";
	}
}
