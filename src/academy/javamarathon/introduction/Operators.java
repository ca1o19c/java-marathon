package academy.javamarathon.introduction;

public class Operators {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 10;

        System.out.println(calculator("soma", number1, number2));
        System.out.println(calculator("subtração", number1, number2));
        System.out.println(calculator("multiplicação", number1, number2));
        System.out.println(calculator("divisão", number1, number2));

        boolean tenIsGreaterThanTwenty = 10 > 20;

        System.out.println(tenIsGreaterThanTwenty);

        boolean tenIsLessThanTwenty = 10 < 20;

        System.out.println(tenIsLessThanTwenty);

        boolean tenIsEqualToTwenty = 10 == 20;

        System.out.println(tenIsLessThanTwenty);

        boolean tenIsDifferentThanTwenty = 10 != 20;

        System.out.println(tenIsDifferentThanTwenty);

        int age = 19;
        float salary = 3500F;
        boolean withinTheLawGreaterThanThirty = age > 30 && salary > 4612;
        boolean withinTheLawLessThanThirty = age < 30 && salary < 3381;

        System.out.println(withinTheLawGreaterThanThirty);
        System.out.println(withinTheLawLessThanThirty);

        double totalValueOfCheckingAccount = 200;
        double totalValueOfSavingsAccount = 10000;
        float valueOfPlaystation = 5000;
        boolean playstationFiveBuyable = totalValueOfCheckingAccount > valueOfPlaystation || totalValueOfSavingsAccount > valueOfPlaystation;

        System.out.println(playstationFiveBuyable);
    }

    public static String calculator(String operation, int n1, int n2) {
        String result;

        switch (operation) {
            case "soma":
                result = operation + " -> " + (n1 + n2);
                break;
            case "subtração":
                result = operation + " -> " + (n1 - n2);
                break;
            case "multiplicação":
                result = operation + " -> " + (n1 * n2);
                break;
            case "divisão":
                result = operation + " -> " + (n1 / n2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }

        return result;
    }
}
