package Annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    String name;
    double salary;

    @MyAnnotation
    public void increaseSalary() {
        salary*=2;
    }
}

@Target({ElementType.TYPE ,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotation{

}