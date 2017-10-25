package org.eclipse.qvto.examples.xtext.imperativeocl.utilities;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.xtext.essentialocl.utilities.EssentialOCLCSResource;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeOCLPackage;

public class ImperativeOCLCSResource extends EssentialOCLCSResource {

	@Override
	public @NonNull String getASContentType() {
		return ImperativeOCLPackage.eCONTENT_TYPE;
	}

	@Override
	public @NonNull URI getASURI(@NonNull URI csURI) {
		return URI.createURI(csURI.toString() + "as");
	}

	@Override
	public @NonNull String getEditorName() {
		return "Imperative OCL";
	}

	//	/* (non-Javadoc)
	//	 * @see org.eclipse.ocl.xtext.essentialocl.utilities.EssentialOCLCSResource#createMetaModelManager()
	//	 */
	//	@Override
	//	public final @NonNull MetaModelManager createMetaModelManager() {
	//		// FIXME move this to EssentialOCLCS Resource
	//		ResourceSet resourceSet = getResourceSet();
	//		if (resourceSet != null) {
	//			MetaModelManagerResourceSetAdapter resourceSetAdapter = MetaModelManagerResourceSetAdapter.findAdapter(resourceSet);
	//			if (resourceSetAdapter != null) {
	//				return resourceSetAdapter.getMetaModelManager();
	//			}
	//		}
	//		return doCreateMetamodeManager();
	//	}
	//
	//	protected MetaModelManager doCreateMetamodeManager() {
	//		return new ImperativeOCLMetamodelManager();
	//	}
}
