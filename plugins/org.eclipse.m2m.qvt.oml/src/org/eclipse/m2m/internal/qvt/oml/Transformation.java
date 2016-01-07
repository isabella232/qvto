package org.eclipse.m2m.internal.qvt.oml;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

public interface Transformation {
	
	public OperationalTransformation getTransformation(IProgressMonitor monitor);
	
	public ExecutionDiagnostic getDiagnostic();
	
	public URI getURI();
	
	public ResourceSet getResourceSet();
	
	public void cleanup();
	
	public CompiledUnit getUnit();
}
