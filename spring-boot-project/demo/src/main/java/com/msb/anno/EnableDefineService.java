package com.msb.anno;

import com.msb.config.MyDefineImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-04 16:37
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited // 允许被继承
@Import({MyDefineImportSelector.class})
public @interface EnableDefineService {

	String name() default "";

//	String value() default "";

	String[] packages() default "";

}
