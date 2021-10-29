package javacore.associacao.dominio;

import java.util.Arrays;
import java.util.Objects;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seminario seminario = (Seminario) o;
        return Objects.equals(titulo, seminario.titulo) && Objects.equals(local, seminario.local) && Arrays.equals(alunos, seminario.alunos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(titulo, local);
        result = 31 * result + Arrays.hashCode(alunos);
        return result;
    }

    @Override
    public String toString() {
        return "Seminario{" +
                "titulo='" + titulo + '\'' +
                ", local=" + local +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }
}
