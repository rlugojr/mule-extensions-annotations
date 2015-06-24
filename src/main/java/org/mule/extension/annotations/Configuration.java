/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to express that a class should be used to describe
 * a {@code org.mule.extension.introspection.Configuration} model.
 * The class will be scanned for fields annotated with {@link Parameter}
 * or {@link ParameterGroup} to obtain that configuration's parameters
 *
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Configuration
{

    /**
     * The name of the configuration. This attribute is optional
     * and if not provided, the configuration's name will default
     * to &quot;config&quot;. Configuration name can't be duplicated.
     * Only one config can use the default config name
     */
    String name() default "";

    /**
     * Provides a description of the configuration.
     */
    String description() default "";
}
