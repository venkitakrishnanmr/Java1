package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy. CLASS)
public @interface ClassAnnotation 
{
    String Classname();
    String Description();
}
