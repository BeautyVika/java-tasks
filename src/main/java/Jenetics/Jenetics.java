package Jenetics;

public class Jenetics {
    public static void main (String[] args){
        Info<String > info1 = new Info<>("Hello");
        System.out.println(info1);

        Info<Integer> info2 = new Info<>(1);
        System.out.println(info2);
    }
}

class Info <T> {
    private T value;

    @Override
    public String toString() {
        return "{" +
                "" + value +
                '}';
    }

    public Info(T value) {
        this.value = value;
    }
}