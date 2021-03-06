/*******************************************************************************
 * Copyright (c) 2010-present Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Stuart McCulloch (Sonatype, Inc.) - initial API and implementation
 *
 * Minimal facade required to be binary-compatible with legacy Plexus API
 *******************************************************************************/
package org.codehaus.plexus.component.configurator.expression;

import java.io.File;

public class DefaultExpressionEvaluator
    implements ExpressionEvaluator
{
    public Object evaluate( final String expression )
    {
        return expression;
    }

    public File alignToBaseDirectory( final File path )
    {
        return path;
    }
}
