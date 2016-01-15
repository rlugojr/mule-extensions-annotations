package org.mule.extension.annotation.api;

import org.mule.extension.api.runtime.source.Source;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to be used on a {@link Class} also annotated with {@link Extension}, to list
 * the {@link Source}s that the extension exposes.
 *
 * @since 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Sources
{

    /**
     * An array of classes which extend the {@link Source} class.
     *
     * @return A not empty array
     */
    Class<? extends Source>[] value();
}
