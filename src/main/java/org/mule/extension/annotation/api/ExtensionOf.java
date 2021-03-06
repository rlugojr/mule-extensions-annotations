/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.annotation.api;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes that a given member is an implementation of a type annotated with {@link Extensible}.
 * <p/>
 * It can either be applied to a class containing methods annotated with
 * {@link Operation} or to one of those methods themselves. If applied to a class,
 * then this declaration is propagated to all the comprised operation methods. If
 * one of those methods are also annotated, then the declaration of the method
 * takes precedence over the one on the type.
 *
 * @since 1.0.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExtensionOf
{

    /**
     * The type being extended. The type has to be
     * annotated with {@link Extensible}
     */
    Class<?> value();
}
