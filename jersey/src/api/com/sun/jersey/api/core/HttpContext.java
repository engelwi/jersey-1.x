/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 2007 Sun Microsystems, Inc. All rights reserved. 
 * 
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License("CDDL") (the "License").  You may not use this file
 * except in compliance with the License. 
 * 
 * You can obtain a copy of the License at:
 *     https://jersey.dev.java.net/license.txt
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * When distributing the Covered Code, include this CDDL Header Notice in each
 * file and include the License file at:
 *     https://jersey.dev.java.net/license.txt
 * If applicable, add the following below this CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 *     "Portions Copyrighted [year] [name of copyright owner]"
 */

package com.sun.jersey.api.core;

import com.sun.jersey.api.uri.ExtendedUriInfo;
import java.util.Map;

/**
 * A HttpContext makes it possible for a web resource implementation class to 
 * access and manipulate HTTP request and response information directly. Typically
 * a HttpContext is injected on to a resource class using the 
 * annotation {@link javax.ws.rs.core.Context}.
 */
public interface HttpContext {
    /**
     * Get the extended URI information.
     * @return the extended URI information.
     */
    ExtendedUriInfo getUriInfo();
    
    /**
     * Get the HTTP request information.
     * @return the HTTP request information
     */
    HttpRequestContext getRequest();

    /**
     * Get the HTTP response information.
     * @return the HTTP response information
     */
    HttpResponseContext getResponse();
    
    /**
     * Get the mutable propertiee.
     * 
     * @return the properties.
     */
    Map<String, Object> getProperties();
}