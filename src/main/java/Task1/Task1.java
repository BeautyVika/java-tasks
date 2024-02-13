package Task1;

public class Task1 {
    public static void main (String[] args){
        Student student = new Student("Harry", "Potter", "Group 1", 4.6);
        Aspirant aspirant = new Aspirant("Germiona", "Grenjer", "Group 5",
                5.0, "ScienceWork");
        Student[] arr = {aspirant, student};

        System.out.println("Before sorting:");
        printStudents(arr);

        Student.sortStudents(arr);

        System.out.println("After sorting:");
        printStudents(arr);

    }
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    " (Average Mark: " + student.getAverageMark() + ")");
            student.getScholarship();
        }
    }
}
