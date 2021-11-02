package javacore.interfaces.dominio;

public class CarregadorDeBancoDeDados implements CarregadorDeDados{

    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados");
    }
}
