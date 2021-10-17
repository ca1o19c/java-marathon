package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Estudante;
import javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Caio";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabi";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
