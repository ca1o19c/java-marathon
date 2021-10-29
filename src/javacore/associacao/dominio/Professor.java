package javacore.associacao.dominio;

import java.util.Arrays;
import java.util.Objects;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimeRelatorio() {
        System.out.println("----------");
        System.out.println("Professor: " + this.nome);

        if (this.seminarios == null) return;

        System.out.println("\n## Seminários cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());

            if (seminario.getLocal() != null) {
                System.out.println("\n## Local do seminário ##");
                System.out.println(seminario.getLocal().getEndereco());
            }

            if (seminario.getAlunos() != null) {
                System.out.print("\n## Alunos cadastrados ##");
                for (Aluno aluno : seminario.getAlunos()) {
                    System.out.println("\nNome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade());
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(nome, professor.nome) && Objects.equals(especialidade, professor.especialidade) && Arrays.equals(seminarios, professor.seminarios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nome, especialidade);
        result = 31 * result + Arrays.hashCode(seminarios);
        return result;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", seminarios=" + Arrays.toString(seminarios) +
                '}';
    }
}
