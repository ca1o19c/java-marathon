package javacore.excecoes.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        System.out.println("---------");
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
