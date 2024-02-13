package Task1;

public class Aspirant extends Student {
    private String scienceWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public void getScholarship() {
        if(getAverageMark() == 5){
            System.out.println("2500");
        }else {
            System.out.println("2000");
        }
    }
}
