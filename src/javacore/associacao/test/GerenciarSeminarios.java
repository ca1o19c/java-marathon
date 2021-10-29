package javacore.associacao.test;

import javacore.associacao.dominio.Aluno;
import javacore.associacao.dominio.Local;
import javacore.associacao.dominio.Professor;
import javacore.associacao.dominio.Seminario;

public class GerenciarSeminarios {
    public static void main(String[] args) {
        var local = new Local("Rua de cima");
        var aluno = new Aluno("Victoria", 20);
        var professor = new Professor("Caio", "Desenvolvimento Web");

        var aluno2 = new Aluno("Julia", 20);

        var alunos = new Aluno[]{aluno, aluno2};

        var seminario = new Seminario("Desenvolvimento Java", local, alunos);

        var seminarios = new Seminario[]{seminario};

        professor.setSeminarios(seminarios);

        professor.imprimeRelatorio();
    }
}
