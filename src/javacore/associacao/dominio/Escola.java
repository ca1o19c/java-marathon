package javacore.associacao.dominio;

import java.util.Arrays;
import java.util.Objects;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime() {
        System.out.println(this.nome);

        if (professores == null) return;

        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Escola escola = (Escola) o;
        return Objects.equals(nome, escola.nome) && Arrays.equals(professores, escola.professores);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nome);
        result = 31 * result + Arrays.hashCode(professores);
        return result;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", professores=" + Arrays.toString(professores) +
                '}';
    }
}
