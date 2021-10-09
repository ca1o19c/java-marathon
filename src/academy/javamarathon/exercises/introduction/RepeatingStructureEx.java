package academy.javamarathon.exercises.introduction;

public class RepeatingStructureEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("number -> " + i + " is even");
            }
        }
    }
}
