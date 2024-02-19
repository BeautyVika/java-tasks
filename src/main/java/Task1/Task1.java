package Task1;

/*
Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой
научной работы.
Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5,
то сумма 2000 руб, иначе 1900. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма
2500 руб, иначе 2200.
Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента
массива.

•  Добавить в класс Student константу MIN_MARK, которая равна 3 и означает минимальную оценку для получения стипендии.
 Изменить метод getScholarship() так, чтобы он возвращал 0, если средняя оценка студента меньше MIN_MARK.

•  Добавить в класс Aspirant переменную String work, которая содержит название научной работы. Добавить в класс Aspirant
конструктор с пятью параметрами, который вызывает конструктор суперкласса и инициализирует переменную work. Добавить в класс
Aspirant метод getWork(), который возвращает название научной работы.

•  Добавить в класс Student абстрактный метод printInfo(), который выводит на консоль информацию о студенте. Реализовать
этот метод в классах Student и Aspirant так, чтобы он выводил имя, фамилию, группу, среднюю оценку и название научной работы
(если есть).

•  Добавить в класс Student интерфейс Comparable<Student>, который позволяет сравнивать студентов по средней оценке.
Реализовать метод compareTo(Student other), который возвращает положительное число, если средняя оценка текущего студента больше,
чем у другого, отрицательное число, если меньше, и ноль, если равны.

•  Добавить в класс Student статический метод sortStudents(Student[] students), который сортирует массив студентов по
убыванию средней оценки, используя метод Arrays.sort() и интерфейс Comparable.
 */
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

        student.getScholarship();

        UnivercityService service = new UnivercityService();

        // Добавление студентов
        service.addStudent(1, "Bob", "Smith", "Group1", 4.5);
        service.addAspirant(2, "July", "Thomson", "Group2", 5.0, "Science Work");
        service.addStudent(3, "Tom", "Johnson", "Group3", 3.0);

        System.out.println("Students sorted by average mark:");
        service.viewAllStudentsSortedByAverageMark();

        System.out.println("Search student by name:");
        service.searchStudentByFirstName("Tom");

        System.out.println("After delete student:");
        service.deleteStudent("July", "Thomson");


    }
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    " (Average Mark: " + student.getAverageMark() + ") ");
            System.out.println("Стипендия у " + student.getFirstName() + " " + student.getScholarship());
        }
    }


}
