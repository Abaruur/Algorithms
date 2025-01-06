package CompositionAggregation.Aggreation;

import java.util.List;

public class School {
    private List<Student> students;

    School(List<Student> students) {
        this.students = students; // Aggregation: Students passed as a parameter
    }

    void displayStudents() {
        for (Student s : students) {
            s.display();
        }
    }
}
