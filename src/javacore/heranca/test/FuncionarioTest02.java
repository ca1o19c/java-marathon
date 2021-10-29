package javacore.heranca.test;

import javacore.heranca.dominio.Funcionario;

public class FuncionarioTest02 {
    public static void main(String[] args) {

        // 0 - Bloco de inicialização Static da super classe é executado quando a JVM carregar super classe
        // 1 - Bloco de inicialização Static da sub classe é executado quando a JVM carregar classe filha
        // 2 - Alocado espaco em memoria para o objeto da super classe
        // 3 - Cada atributo da super classe é criado e inicializado com valores default ou o que for passado
        // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
        // 5 - Construtor da super classe é executado
        // 6 - Alocado espaco em memoria para o objeto da sub classe
        // 7 - Cada atributo da sub classe é criado e inicializado com valores default ou o que for passado
        // 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece
        // 9 - Construtor da sub classe é executado

        var funcionario = new Funcionario("Jiraya");
    }
}
