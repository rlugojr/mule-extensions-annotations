/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.annotation.api;

import org.mule.extension.api.introspection.OperationModel;
import org.mule.extension.api.runtime.ContentMetadata;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * Indicates that an {@link OperationModel} should expose parameters which
 * allow mutating the current {@link ContentMetadata}.
 * <p>
 * This annotation is intended to be used in {@link Method methods} which are
 * also annotated with {@link Operation}
 *
 * @since 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ContentMetadataParameters
{

}
