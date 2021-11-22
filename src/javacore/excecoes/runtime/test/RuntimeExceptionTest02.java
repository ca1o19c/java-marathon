package javacore.excecoes.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1d, 0d);
        }catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Código finalizado");
    }

    private static double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }

        return a / b;
    }
}
