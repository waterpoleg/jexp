package inheritance.task01;

public class Student {
    private String firstName;
    private String secondName;
    private double averageMark;

    public Student(String firstName, String secondName, double averageMark) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public double getScholarship() {
        return averageMark == 5.0 ? 100 : 80;
    }
}
