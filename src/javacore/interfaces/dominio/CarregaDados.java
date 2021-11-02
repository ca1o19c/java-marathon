package javacore.interfaces.dominio;

public interface CarregaDados {
    void carregar();

    default void verificarPermissao() {
        System.out.println("Fazendo a verificação das permissões");
    }
}
