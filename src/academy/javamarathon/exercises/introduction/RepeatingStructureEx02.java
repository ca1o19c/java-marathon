package academy.javamarathon.exercises.introduction;

public class RepeatingStructureEx02 {
    public static void main(String[] args) {
        double totalValue =  30000;

        for (int i = 1; i <= totalValue; i++) {
            double installmentValue = totalValue / i;

            if (installmentValue >= 1000) {
                System.out.println("installment " + i + " -> R$ " + installmentValue);
            } else {
                break;
            }
        }
    }
}
