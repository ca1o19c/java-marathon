package javacore.construtores.dominio;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Filme {
    private String titulo;
    private Double imdb;
    private Integer ano;
    private List<String> escritores;

    public Filme(String titulo, Double imdb, Integer ano, List<String> escritores) {
        this.titulo = titulo;
        this.imdb = imdb;
        this.ano = ano;
        this.escritores = escritores;
    }

    public Filme() {

    }

    public void imprime() {
        System.out.println(this.titulo);
        System.out.println(this.imdb);
        System.out.println(this.ano);
        System.out.println(this.escritores);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getImdb() {
        return imdb;
    }

    public void setImdb(Double imdb) {
        this.imdb = imdb;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public List<String> getEscritores() {
        return Optional.ofNullable(escritores)
                .map(Collections::unmodifiableList)
                .orElse(List.of());
    }

    public void setEscritores(List<String> escritores) {
        this.escritores = escritores;
    }
}
