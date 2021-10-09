package academy.javamarathon.introduction;

public class RepeatingStructure {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            System.out.println("inside while -> " + count);
            count++;
        }

        count = 0;

        do {
            System.out.println("inside do while -> " + count);
            count++;
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("inside for -> " + i);
        }

        int maxValue = 50;

        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) {
                break;
            }

            System.out.println(i);
        }
    }
}
