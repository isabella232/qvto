/*******************************************************************************
 * Copyright (c) 2021 Christopher Gerking and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.bbox;

import java.util.Date;

import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;

public class Bug566216_Library {

	public static Date toDate(XMLCalendar self) {
		return self.getDate();
	}

	public Number simpleCreateBigInt(String value) {
		return Float.parseFloat(value);
	}

}
