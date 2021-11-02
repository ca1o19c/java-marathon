package introducao;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 10;

        System.out.println(calculadora("soma", numero1, numero2));
        System.out.println(calculadora("subtração", numero1, numero2));
        System.out.println(calculadora("multiplicação", numero1, numero2));
        System.out.println(calculadora("divisão", numero1, numero2));

        boolean dezMaiorQueVinte = 10 > 20;

        System.out.println(dezMaiorQueVinte);

        boolean dezMenorQueVinte = 10 < 20;

        System.out.println(dezMenorQueVinte);

        boolean dezIgualAVinte = 10 == 20;

        System.out.println(dezIgualAVinte);

        boolean dezDiferenteDeVinte = 10 != 20;

        System.out.println(dezDiferenteDeVinte);

        int idade = 19;
        float salario = 3500F;
        boolean dentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean dentroDaLeiMenorQueTrinta = idade < 30 && salario < 3381;

        System.out.println(dentroDaLeiMaiorQueTrinta);
        System.out.println(dentroDaLeiMenorQueTrinta);

        double valorTotalDaContaCorrente = 200;
        double valorTotalDaContaPoupanca = 10000;
        float valorDoPs5 = 5000;
        boolean playstationEhCompravel = valorTotalDaContaCorrente > valorDoPs5 || valorTotalDaContaPoupanca > valorDoPs5;

        System.out.println(playstationEhCompravel);
    }

    public static String calculadora(String operacao, int n1, int n2) {
        String resultado;

        switch (operacao) {
            case "soma":
                resultado = operacao + " -> " + (n1 + n2);
                break;
            case "subtração":
                resultado = operacao + " -> " + (n1 - n2);
                break;
            case "multiplicação":
                resultado = operacao + " -> " + (n1 * n2);
                break;
            case "divisão":
                resultado = operacao + " -> " + (n1 / n2);
                break;
            default:
                throw new IllegalStateException("Valor inesperado: " + operacao);
        }

        return resultado;
    }
}
