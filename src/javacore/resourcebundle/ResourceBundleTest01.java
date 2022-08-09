package javacore.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        ResourceBundle resourceBundle = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("saudacao1"));
        System.out.println(resourceBundle.getString("saudacao2"));

        resourceBundle = ResourceBundle.getBundle("mensagem");
        System.out.println(resourceBundle.getString("saudacao1"));
        System.out.println(resourceBundle.getString("saudacao2"));

        // Locale("fr", "CA")
        // mensagem_fr_CA.properties
        // mensagem_fr.properties
        // mensagem_pt_BR.properties
        // mensagem_pt.properties
        // mensagem.properties

        System.out.println(resourceBundle.getString("hi"));
    }
}
