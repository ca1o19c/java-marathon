package introducao.exercicios;

public class EstruturaDeRepeticaoEx03 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int i = (int) valorTotal; i >= 1; i--) {
            double valorDaParcela = valorTotal / i;

            if (valorDaParcela < 1000) {
                continue;
            }

            System.out.println("installment " + i + " -> R$ " + valorDaParcela);
        }
    }
}
