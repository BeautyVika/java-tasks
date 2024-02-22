package Jenetics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main (String[] args){
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
    }

}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al1) {
        return al1.get(1);
    }
}