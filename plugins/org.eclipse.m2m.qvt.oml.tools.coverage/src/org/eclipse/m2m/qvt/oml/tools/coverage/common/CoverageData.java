/*****************************************************************************
 * Copyright (c) 2014,2015 ASML Netherlands B.V. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  ASML Netherlands B.V. - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.m2m.qvt.oml.tools.coverage.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CoverageData implements Serializable {

    private static final long serialVersionUID = 1L;

    // private static CoverageData instance;

    private List<TransformationCoverageData> transformations;

    public CoverageData() {
        transformations = new ArrayList<TransformationCoverageData>();
    }

    public void add(TransformationCoverageData data) {
        transformations.add(data);
    }

    public TransformationCoverageData[] getData() {
        return transformations.toArray(new TransformationCoverageData[transformations.size()]);
    }

    public void clear() {
        transformations.clear();
    }
}
