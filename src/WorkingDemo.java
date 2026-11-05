
public class WorkingDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 85);

        student.showDetails();

        if (student.hasPassed()) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    boolean hasPassed() {
        return score >= 50;
    }

    void showDetails() {
        System.out.println("Student: " + name);
        System.out.println("Score: " + score);
    }
}
