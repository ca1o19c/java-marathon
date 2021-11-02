package introducao.exercicios;

public class EstruturaDeRepeticaoEx02 {
    public static void main(String[] args) {
        double valorTotal =  30000;

        for (int i = 1; i <= valorTotal; i++) {
            double valorDaParcela = valorTotal / i;

            if (valorDaParcela >= 1000) {
                System.out.println("parcela " + i + " -> R$ " + valorDaParcela);
            } else {
                break;
            }
        }
    }
}
