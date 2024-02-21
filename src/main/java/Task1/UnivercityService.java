package Task1;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class UnivercityService {
    private Map<Integer, Student> database;

    public UnivercityService() {
        database = new HashMap<Integer, Student>();
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
        database.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(s -> log.info("{}\n", s.getValue()));
    }

    public void searchStudentByFirstName(String name) {
        database.entrySet().stream().filter(s -> s.getValue().getFirstName() == name)
                .forEach(s -> System.out.println(s.getValue()));
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
        database.entrySet().stream().filter(s -> s.getValue().getFirstName() != firstName && s.getValue().getLastName() != lastName)
                .forEach(System.out::println);

    }

    public void calculateScholarship(int id) {
        Student student = database.get(id);
        System.out.println(student.getScholarship());
    }

}
