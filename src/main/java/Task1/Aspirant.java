package Task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aspirant extends Student {
    String work;
    private final int scholarship = 2500;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        if(getAverageMark() == 5){
            return scholarship;
        }else {
           return 2200;
        }
    }
    @Override
    public void printInfo() {
        System.out.println("Фамилия и имя аспиранта: " + getFirstName() + " " + getLastName() + " группа: " + getGroup()
                + " средняя оценка: " + getAverageMark() + " работа: " + work);
    }
}
