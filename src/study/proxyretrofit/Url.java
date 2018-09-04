package study.proxyretrofit;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.PARAMETER,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Url {
    String value();
}
