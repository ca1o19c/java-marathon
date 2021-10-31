package javacore.enumeradores.test;

import javacore.enumeradores.dominio.Cliente;
import javacore.enumeradores.dominio.TipoCliente;

import static javacore.enumeradores.dominio.TipoCliente.PESSOA_FISICA;
import static javacore.enumeradores.dominio.TipoCliente.PESSOA_JURIDICA;
import static javacore.enumeradores.dominio.TipoPagamento.CREDITO;
import static javacore.enumeradores.dominio.TipoPagamento.DEBITO;

public class ClienteTest01 {
    public static void main(String[] args) {
        var cliente1 = new Cliente("Cliente1", PESSOA_FISICA, DEBITO);
        var cliente2 = new Cliente("Cliente2", PESSOA_JURIDICA, CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(DEBITO.calcularDesconto(100));
        System.out.println(CREDITO.calcularDesconto(100));

        var tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getTipoString());

        var tipoCliente2 = TipoCliente.tipoClientePorNomeDoRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
