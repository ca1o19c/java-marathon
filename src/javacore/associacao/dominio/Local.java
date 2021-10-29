package javacore.associacao.dominio;

import java.util.Objects;

public class Local {
    public String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return Objects.equals(endereco, local.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endereco);
    }

    @Override
    public String toString() {
        return "Local{" +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
