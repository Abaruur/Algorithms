package CompositionAggregation.Aggreation;

public class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Student name: " + name);
    }
}
