/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.annotation.api.connector;

import org.mule.api.connection.ConnectionProvider;
import org.mule.extension.api.introspection.ConnectionProviderModel;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to be used on {@link Class classes} which implement the {@link ConnectionProvider} interface.
 * It allows customizing metadata of the {@link ConnectionProviderModel} which is derived from such class
 *
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Provider
{

    /**
     * The value to be returned by the {@link ConnectionProviderModel#getName()}
     * derived from the {@link Class} annotated with this annotation. Not to be
     * confused with the name under which a particular {@link ConnectionProvider}
     * instance is held in the registry
     */
    String name();

    /**
     * The value to be returned by the {@link ConnectionProviderModel#getDescription()}
     * derived from the {@link Class} annotated with this annotation.
     */
    String description() default "";
}
