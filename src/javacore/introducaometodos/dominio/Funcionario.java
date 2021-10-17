package javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public Integer idade;
    public Double[] salarios;

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

    public void imprimiMediaDosSalarios() {
        double aux = 0d;

        try {
            for (Double aDouble : this.salarios) {
                aux += aDouble;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        double media = Math.floor(aux / this.salarios.length);
        System.out.println("Média salarial = " + media);
    }
}
