package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Jedi Master";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("idade: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
