package javacore.enumeradores.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int tipoInt;
    private final String tipoString;

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

    @Override
    public String toString() {
        return "TipoCliente{" +
                "tipoInt=" + tipoInt +
                ", tipoString='" + tipoString + '\'' +
                '}';
    }
}
