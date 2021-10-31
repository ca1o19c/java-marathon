package javacore.enumeradores.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int tipoInt;
    private final String tipoString;

    public static TipoCliente tipoClientePorNomeDoRelatorio(String tipoString) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getTipoString().equals(tipoString)) {
                return tipoCliente;
            }
        }
        return null;
    }

    TipoCliente(int tipoInt, String tipoString) {
        this.tipoInt = tipoInt;
        this.tipoString = tipoString;
    }

    public int getTipoInt() {
        return tipoInt;
    }

    public String getTipoString() {
        return tipoString;
    }
}
