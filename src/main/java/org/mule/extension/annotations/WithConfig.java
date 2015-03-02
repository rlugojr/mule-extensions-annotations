package org.mule.extension.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is to be used on classes which implement
 * an extension operation. It means that the configuration instance
 * that the operation is going to be using should be injected
 * into the field annotated with this instance.
 *
 * Because there could be many registered instances of the configuration
 * class and because the developer cannot (and shouldn't) be able
 * to know the name of the selected config, the traditional
 * {@code Inject} annotation from JSR-250 is not applicable to this purpose,
 * hence the creation of this annotation.
 *
 * @since 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WithConfig
{

}
