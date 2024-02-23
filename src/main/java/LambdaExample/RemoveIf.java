package LambdaExample;

import java.util.ArrayList;

public class RemoveIf {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("hi");
        list.add("bye");
        list.add("goodbye");
        list.add("welcome");
        list.removeIf(element -> element.length() > 4);
        System.out.println(list);
    }
}
