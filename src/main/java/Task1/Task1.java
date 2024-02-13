package Task1;

public class Task1 {
    public static void main (String[] args){
        Student student = new Student("Harry", "Potter", "Group 1", 4.6);
        Aspirant aspirant = new Aspirant("Germiona", "Grenjer", "Group 5",
                5.0, "ScienceWork");
         Student[] arr = {student, aspirant};

        for(Student s: arr){
            s.getScholarship();
        }

    }
}
