package org.eclipse.m2m.internal.qvt.oml.blackbox.java.jdt;

import java.util.Collections;
import java.util.List;

import org.eclipse.m2m.internal.qvt.oml.blackbox.java.ModuleHandle;

public class JdtModuleHandle extends ModuleHandle {
	
	private final Class<?> moduleJavaClass;
		
	JdtModuleHandle(String moduleName, Class<?> moduleJavaClass) {
		super(moduleJavaClass.getName(), moduleName);
		this.moduleJavaClass = moduleJavaClass;
	}
		
	@Override
	public List<String> getUsedPackages() {
		return Collections.emptyList();
	}
	
	@Override
	public Class<?> getModuleJavaClass() throws ClassNotFoundException {
		return moduleJavaClass;
	}

}
