package LambdaExample;

import java.util.ArrayList;

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
        info.testStudent(students, (Student s) -> s.getAge() < 24);
        info.testStudent(students, (Student s) -> s.getAge() >20 && s.getAvgGrade()<9.6 && s.getSex() == 'f');

    }
    void testStudent(ArrayList<Student> a1, CheckStudent sc) {
        for(Student s: a1) {
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }
}

