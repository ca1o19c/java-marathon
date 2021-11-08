package introducao;

public class EstruturaCondicional03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDeDoacao = "I will donate 600 to DevDojo";
        String mensagemDeNaoDoar = "I will not donate to DevDojo";
        String resultado = salario > 5000 ? mensagemDeDoacao : mensagemDeNaoDoar;

        System.out.println(resultado);
    }
}
