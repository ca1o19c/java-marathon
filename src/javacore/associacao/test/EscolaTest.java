package javacore.associacao.test;

import javacore.associacao.dominio.Escola;
import javacore.associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        var professor1 = new Professor("Jiraya");
        var professor2 = new Professor("Kakashi");
        var professores = new Professor[]{professor1, professor2};

        var escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
