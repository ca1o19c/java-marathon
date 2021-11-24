package javacore.excecoes.exception.test;

import javacore.excecoes.exception.dominio.Leitor1;
import javacore.excecoes.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        teste();
    }

    private static void lerArquivoRaiz() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void lerArquivoNutella() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void teste() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
