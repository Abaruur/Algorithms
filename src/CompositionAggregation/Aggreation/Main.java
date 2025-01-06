package CompositionAggregation.Aggreation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("john");
        Student s2 = new Student("Alice");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        School school = new School(studentList);
        school.displayStudents();

    }
}
