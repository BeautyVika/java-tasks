package Task1;

import lombok.Getter;

@Getter
public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    @Override
    public void getScholarship() {
        if(getAverageMark() == 5){
            System.out.println("Стипендия у " + getFirstName() + " " + + 2500);
        }else {
            System.out.println("Стипендия у " + getFirstName() + " " + + 2000);
        }
    }
    @Override
    public void printInfo() {
        System.out.println("Фамилия и имя аспиранта: " + getFirstName() + getLastName() + " группа: " + getGroup()
                + " средняя оценка: " + getAverageMark() + " работа: " + work);
    }
}
