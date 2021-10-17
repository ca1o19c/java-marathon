package javacore.introducaometodos.dominio;

public class Estudante {
    public String nome;
    public Integer idade;
    public Character sexo;

    public void imprime() {
        System.out.println("---------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
