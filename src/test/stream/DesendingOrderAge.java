package test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import test.stream.Student;

public class DesendingOrderAge {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(101, "Anup", 85),
                new Student(102, "Ravi", 75),
                new Student(103, "Neha", 92),
                new Student(104, "Kiran", 88)
        );

        // 75, 85
        List<Student> list = students.stream()
                                        .sorted((s1, s2) -> Integer.compare(s2.marks, s1.marks))
                                        .toList();
        // or sorted((s1, s2) -> s2.marks - s1.marks)
        // or .sorted(Comparator.comparing(Student::getMarks).reversed())

        list.forEach(s -> System.out.println(s.id + " " + s.name + " " + s.marks));




    }
}
