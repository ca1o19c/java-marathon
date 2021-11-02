package javacore.interfaces.dominio;

public class CarregaDeArquivos implements CarregaDados, RemoveDados {
    @Override
    public void carregar() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void verificarPermissao() {
        System.out.println("Checando permissões no arquivo");
    }
}
