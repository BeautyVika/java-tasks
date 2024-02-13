package Task4;
/*
Создайте базовый класс Animal с общими свойствами и методами. Затем создайте несколько подклассов
(например, Dog, Cat), унаследованных от базового класса. Реализуйте уникальные свойства и методы для каждого подкласса.
 */

public class Task4 {
    public static void main (String[] args){
        Dog dog = new Dog("Sharik");
        System.out.println(dog.pow);

        Cat cat = new Cat("Barsik");
        cat.sleep();
    }
}
