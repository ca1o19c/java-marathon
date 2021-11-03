package javacore.interfaces.dominio;

public class CarregaDoBancoDeDados implements CarregaDados, RemoveDados {
    // private -> default -> protected -> public

    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void verificarPermissao() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retentaTamanhoMaximoDosDados() {
        System.out.println("Dentro do 'retentaTamanhoMaximoDosDados()' na classe 'CarregaDoBancoDeDados'");
    }
}
