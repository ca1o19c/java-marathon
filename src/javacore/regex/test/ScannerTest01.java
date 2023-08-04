package javacore.regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Xpto1, Xpto2, Xpto3";
        String[] xptos = texto.split(",");

        for (String xpto :
             xptos) {
            System.out.println(xpto.trim());
        }
    }
}
