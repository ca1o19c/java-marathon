package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Estudante;
import javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Caio";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabi";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
