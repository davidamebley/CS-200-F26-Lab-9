
public class InheritanceDemo {

    public static void main(String[] args) {

        StudentInfo student = new StudentInfo("Alice", 20);
        GraduateStudent grad = new GraduateStudent("David", 50, "Computer Science");

        student.displayInfo();
        grad.displayInfo();
    }
}

class StudentInfo {
    String name;
    int age;

    StudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class GraduateStudent extends StudentInfo {
    String researchArea;

    GraduateStudent(String name, int age, String researchArea) {
        super(name, age);
        this.researchArea = researchArea;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Research Area: " + researchArea);
    }
}
