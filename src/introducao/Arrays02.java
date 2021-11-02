package introducao;

public class Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float and double -> 0
        // char -> '\u0000'
        // boolean -> false
        // String null

        String[] nomes = new String[3];

        nomes[0] = "Maria";
        nomes[1] = "Caio";
        nomes[2] = "Marcio";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
