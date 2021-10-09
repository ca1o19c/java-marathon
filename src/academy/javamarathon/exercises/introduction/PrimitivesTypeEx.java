package academy.javamarathon.exercises.introduction;

/*
 * Prática
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem
 *
 * Eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salário de <salário>, na data <data>
 */

import java.time.LocalDate;

public class PrimitivesTypeEx {
    public static void main(String[] args) {
        String name = "Caio";
        String address = "Rua Serra Dourada";
        float salary = 2000F;

        System.out.println("Eu " + name + ", morando no endereço " + address +
                " confirmo que recebi o salário de " + salary + ", na data " + LocalDate.now());
    }
}
