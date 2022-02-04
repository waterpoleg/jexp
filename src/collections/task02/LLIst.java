package collections.task02;

import collections.Student;

import java.util.LinkedList;
import java.util.List;

public class LLIst {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("martin", 18));
        students.add(new Student("john", 24));
        students.add(new Student("melania", 20));
        students.add(new Student("jerry", 22));
        students.add(new Student("lili", 19));

        students.removeIf(s -> s.getAge() > 18);
        System.out.println(students);
    }
}
