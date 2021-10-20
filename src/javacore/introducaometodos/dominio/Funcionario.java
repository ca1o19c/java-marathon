package javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private Integer idade;
    private Double[] salarios;
    private Double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(Double[] salarios) {
        this.salarios = salarios;
    }

    public Double getMedia() {
        return media;
    }

    public void imprimiRelatorio() {
        try {
            System.out.println(this.nome);
            System.out.println(this.idade);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            for (Double aDouble : this.salarios) {
                System.out.println("Salário = " + aDouble);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        imprimiMediaDosSalarios();
    }


    private void imprimiMediaDosSalarios() {
        this.media = 0d;

        try {
            for (Double aDouble : this.salarios) {
                this.media += aDouble;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        this.media = Math.floor(this.media / this.salarios.length);
    }
}
