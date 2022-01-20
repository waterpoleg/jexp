package inheritance.task01;

public class Aspirant extends Student {
    private String study;

    public Aspirant(String firstName, String secondName, String study, double averageMark) {
        super(firstName, secondName, averageMark);
        this.study = study;
    }

    @Override
    public double getScholarship() {
        return getAverageMark() == 5.0 ? 200 : 100;
    }
}
