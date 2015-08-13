/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.annotations.connector;

import org.mule.extension.connection.ConnectionHandler;
import org.mule.extension.introspection.ConfigurationModel;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * To be applied on a class which is being used to describe a {@link ConfigurationModel},
 * in order to express that such configuration requires connectivity services
 *
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Connector
{

    /**
     * The {@link Class} of the {@link ConnectionHandler} to be used
     *
     * @return a {@link Class} which has {@link ConnectionHandler} as an interface
     */
    Class<? extends ConnectionHandler> value();
}
