package Task5;

public class Task5 {
    public static void main (String[] args){
        Student student = new Student();

        student.setName("July");
        student.setAge(25);
        student.setStudentId(1);
        System.out.println("Имя студента: " + student.getName() + " , возраст: " + student.getAge()
                           + " ,id: " + student.getStudentId());
    }
}
