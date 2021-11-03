package javacore.interfaces.dominio;

public interface CarregaDados {
    int TAMANHO_MAXIMO_DOS_DADOS = 10;

    void carregar();

    default void verificarPermissao() {
        System.out.println("Fazendo a verificação das permissões");
    }

    static void retentaTamanhoMaximoDosDados() {
        System.out.println("Dentro do 'retentaTamanhoMaximoDosDados()' na interface 'CarregaDados'");
    }
}
