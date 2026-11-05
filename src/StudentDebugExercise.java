
public class StudentDebugExercise {

    public static void main(String[] args) {
        int[] scores = {80, 70, 90};

        double average = calculateAverage(scores);

        System.out.println("Expected average: 80.0");
        System.out.println("Actual average: " + average);
    }

    static double calculateAverage(int[] scores) {
        int total = 0;

        for (int i = 0; i < scores.length-1; i++) {
            total += scores[i];
        }

        return (double) total / scores.length;
    }
}
