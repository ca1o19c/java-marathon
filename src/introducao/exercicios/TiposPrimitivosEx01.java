package introducao.exercicios;

/*
 * Prática
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem
 *
 * Eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salário de <salário>, na data <data>
 */

import java.time.LocalDate;

public class TiposPrimitivosEx01 {
    public static void main(String[] args) {
        String nome = "Caio";
        String endereco = "Rua Fake";
        float salario = 2000F;

        System.out.println("Eu " + nome + ", morando no endereço " + endereco +
                " confirmo que recebi o salário de " + salario + ", na data " + LocalDate.now());
    }
}
