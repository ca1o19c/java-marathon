package javacore.interfaces.dominio;

public class CarregadorDeArquivos implements CarregadorDeDados{
    @Override
    public void carregar() {
        System.out.println("Carregano dados de um arquivo");
    }
}
