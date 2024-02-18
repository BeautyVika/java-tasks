package Task1;

import java.util.*;

public class UnivercityService {
    private Map<Integer, Student> database;

    public UnivercityService() {
        database = new HashMap<>();
    }

    public void addStudent(int id, String firstName, String lastName, String group, double averageMark) {
        Student student = new Student(firstName, lastName, group, averageMark);
        database.put(id, student);
    }

    public void addAspirant(int id, String firstName, String lastName, String group, double averageMark, String work) {
        Aspirant aspirant = new Aspirant(firstName, lastName, group, averageMark, work);
        database.put(id, aspirant);
    }

    public void viewAllStudentsSortedByAverageMark() {
        List<Student> sortedStudents = new ArrayList<>(database.values());
        sortedStudents.sort(Comparator.comparing(Student::getAverageMark));
        for (Student student: sortedStudents) {
            student.printInfo();
        }
    }

    public void searchStudentByFirstName(String name) {
        for (Student student: database.values()){
            if(student.getFirstName() == name){
                student.printInfo();
            }
        }
    }

    public void searchAspirantByWork(String work) {
        for (Student student: database.values()) {
            if( student instanceof Aspirant && ((Aspirant) student).getWork() == work){
                student.printInfo();
            }
        }
    }

    public void editStudent(int id, String firstName, String lastName, String group, double averageMark, String work) {
        if (database.containsKey(id)) {
            Student student = database.get(id);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setGroup(group);
            student.setAverageMark(averageMark);
            if (student instanceof Aspirant){
                ((Aspirant) student).setWork(work);
            }
            student.printInfo();
        }
    }

    public void deleteStudent(String firstName, String lastName){
        List<Student> students = new ArrayList(database.values());
        for (Student student: students){
            if(student.getFirstName() == firstName && student.getLastName() == lastName){
                students.remove(student);
            }
            System.out.println(students);
        }
    }

    public void calculateScholarship(int id) {
        Student student = database.get(id);
        System.out.println(student.getScholarship());
    }

}
