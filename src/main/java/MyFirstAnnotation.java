import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface MyFirstAnnotation {
    boolean flag() default false;
}
