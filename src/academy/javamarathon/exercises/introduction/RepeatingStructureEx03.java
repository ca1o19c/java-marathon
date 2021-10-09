package academy.javamarathon.exercises.introduction;

public class RepeatingStructureEx03 {
    public static void main(String[] args) {
        double totalValue = 30000;

        for (int i = (int) totalValue; i >= 1; i--) {
            double installmentValue = totalValue / i;

            if (installmentValue < 1000) {
                continue;
            }

            System.out.println("installment " + i + " -> R$ " + installmentValue);
        }
    }
}
