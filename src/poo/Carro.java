package poo;

import java.util.Objects;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public String getMarca() {
        return marca;
    }

    public Carro setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public Carro setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
        return this;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public Carro setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
        return this;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public Carro setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return numPassageiros == carro.numPassageiros && Double.compare(carro.capCombustivel, capCombustivel) == 0 && Double.compare(carro.consumoCombustivel, consumoCombustivel) == 0 && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo);
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "Km");
    }

    double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;

        return  qtdCombustivel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, numPassageiros, capCombustivel, consumoCombustivel);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numPassageiros=" + numPassageiros +
                ", capCombustivel=" + capCombustivel +
                ", consumoCombustivel=" + consumoCombustivel +
                '}';
    }
}
