package javacore.enumeradores.test;

import javacore.enumeradores.dominio.Cliente;

import static javacore.enumeradores.dominio.TipoCliente.PESSOA_FISICA;
import static javacore.enumeradores.dominio.TipoCliente.PESSOA_JURIDICA;

public class ClienteTest01 {
    public static void main(String[] args) {
        var cliente1 = new Cliente("Cliente1", PESSOA_FISICA);
        var cliente2 = new Cliente("Cliente2", PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
