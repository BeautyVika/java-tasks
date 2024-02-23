package LambdaExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main (String[] args){
        Student st1 = new Student("Ivan", 'm', 22,3, 8.3);
        Student st2 = new Student("Andrew", 'm', 23,4, 7.3);
        Student st3 = new Student("Kate", 'f', 22,3, 9.0);
        Student st4 = new Student("Ann", 'f', 20,2, 8.6);
        Student st5 = new Student("Tom", 'm', 24,5, 7.8);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        LambdaExample info = new LambdaExample();
//        info.testStudent(students, s -> s.getAge() < 24);
//        System.out.println("enter");
//        info.testStudent(students, s -> s.getAge() >20 && s.getAvgGrade()<9.6 && s.getSex() == 'f');
//        System.out.println("enter");
//        info.testStudent(students, s -> s.getAvgGrade() < 8);
        double result = avgOfSmth(students, student -> (double)student.getAge());
        System.out.println(result);

        Predicate<Student> p1 = student -> student.getAvgGrade() < 8;
        Predicate<Student> p2 = student -> student.getSex() == 'm';
        info.testStudent(students, p1.negate());

        ArrayList<Car> ourCar = createThreeCars(() -> new Car("bmv", "red", 1.3));
        System.out.println(ourCar);

        changeCar(ourCar.get(0), car -> {
                                   car.setColor("blue");
                                   car.setEngine(1.8);
                                   System.out.println("Upgrade car:" + car);});
        System.out.println("Our car" + ourCar);
    }
    void testStudent(ArrayList<Student> a1, Predicate<Student> sc) {
        for(Student s: a1) {
            if(sc.test(s)){
                System.out.println(s);
            }
        }
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList();
        for(int i = 0; i < 3; i++){
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f){
        double result = 0;
        for(Student st: list){
            result += f.apply(st);
        }
        result = result/list.size();
        return result;
    }
}

