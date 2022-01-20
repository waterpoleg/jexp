package inheritance.task01;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("name", "familyName", 4.9);
        Student asp1 = new Aspirant("name1", "familyName1", "math",5);
        Aspirant asp2 = new Aspirant("name2", "familyName2", "cs",3.5);

        Student[] members = {student, asp1, asp2};

        for (var m : members) {
            System.out.println(m.getScholarship());
        }
    }
}
