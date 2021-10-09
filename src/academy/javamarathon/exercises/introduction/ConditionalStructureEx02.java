package academy.javamarathon.exercises.introduction;

public class ConditionalStructureEx02 {
    public static void main(String[] args) {
        byte day = 1;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Business day");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Day not found : (");
                break;
        }
    }
}
