package collections.task01;

import collections.Student;

import java.util.ArrayList;
import java.util.List;

public class AList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("martin", 18));
        students.add(new Student("john", 24));
        students.add(new Student("melania", 20));
        students.add(new Student("jerry", 22));
        students.add(new Student("lili", 19));

        for (Student s : students) {
            if (s.getName().length() > 4) {
                s.setAge(s.getAge() + 4);
            }
        }
        System.out.println(students);
    }
}
