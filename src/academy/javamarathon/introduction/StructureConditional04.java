package academy.javamarathon.introduction;

public class StructureConditional04 {
    public static void main(String[] args) {
        byte day = 6;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Day not found : (");
        }

        char gender = 'M';

        switch (gender) {
            case 'M':
                System.out.println("Men");
                break;
            case 'F':
                System.out.println("Women");
                break;
        }
    }
}
