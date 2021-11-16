package introducao;

public class EstruturaCondicionais04 {
    public static void main(String[] args) {
        byte dia = 6;

        switch (dia) {
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

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Men");
                break;
            case 'F':
                System.out.println("Women");
                break;
        }
    }
}
