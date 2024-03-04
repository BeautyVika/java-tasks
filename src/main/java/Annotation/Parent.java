package Annotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Parent {
    private String name;

    public void showInfo() {
        System.out.println("It's parent name " + name);
    }
}

class Child extends Parent {
    public Child(String name) {
        super(name);
    }
    @Override
    public void showInfo() {
        System.out.println("It's child class., name"  + getName());
    }
}