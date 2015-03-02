package org.mule.extension.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a field inside a mule extension as being a set of parameters that the user can set.
 * This annotation is intended to be applied into fields which type is a POJO which properties
 * are to be processed as attributes. For example:
 * <p/>
 * <pre>
 *     {@code
 *     @Extension
 *     public class MyExtension {
 *
 *         @Parameters
 *         private Options options;
 *     }
 *
 *     public class Options {
 *
 *          @Parameter
 *          private String color;
 *
 *          @Parameter
 *          @Optional
 *          private String mode;
 *
 *          private String owner;
 *     }
 *     }
 * </pre>
 * <p/>
 * The outcome of the code above is a configuration with two parameters called 'color' and 'mode', one required and the other optional.
 * The configuration has no attribute called options. If the Options class were to have another field also annotated with
 * {@link Parameters}, then such fields will be ignored.
 * <p/>
 * In the same way, the annotation can be applied to a class holding operations:
 * <pre>
 *     {@code
 *
 *     public class Operations {
 *
 *         @Parameters
 *         private Options options;
 *
 *         @Operation
 *         public void hello(String message) {
 *             ...
 *         }
 *
 *         @Operation
 *         public void goodBye(String message) {
 *
 *         }
 *     }
 * </pre>
 * <p/>
 * In this case, both operations will have three parameters: message, color and mode.
 * <p/>
 * The last use case for this annotation is to have nested parameter classes:
 * <pre>
 * <pre>
 *     {@code
 *
 *     public class Options {
 *
 *          @Parameter
 *          private String color;
 *
 *          @Parameter
 *          @Optional
 *          private String mode;
 *
 *          @Parameters
 *          private MoreOptions moreOptions;
 *     }
 *     }
 * </pre>
 * </pre>
 * In this last example, the configuration/operation that is augmented with this extra parameters
 * will have the sum of Options and MoreOptions parameters. Those parameters will be flattened, meaning
 * that the model will contain no reference to the fact that the MoreOptions parameters were nested inside
 * Options.
 * <p/>
 * The field must be a Java bean property (ie it needs to have setters and getters matching the field name).
 *
 * @since 1.0
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Parameters
{

}
