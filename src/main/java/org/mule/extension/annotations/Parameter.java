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
 * Marks a field inside a mule extension as being a parameter that the user can set.
 * It can either be applied
 * to a class defining a configuration, or to a class in which operations are implemented.
 * <p/>
 * If applied to an operation class, then the parameter will be added to all the operations defined in that
 * class.
 * <p/>
 * The field must be a Java bean property (ie it needs to have setters and getters matching the field name).
 *
 * @since 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Parameter
{

    /**
     * If {@code false} then this parameter does not support expressions
     * @return {@code true} if the parameter supports expressions. {@code false} otherwise
     */
    boolean isDynamic() default true;
}