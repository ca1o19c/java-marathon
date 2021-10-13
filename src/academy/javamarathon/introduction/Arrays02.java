package academy.javamarathon.introduction;

public class Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float and double -> 0
        // char -> '\u0000'
        // boolean -> false
        // String null

        String[] names = new String[3];

        names[0] = "Maria";
        names[1] = "Caio";
        names[2] = "Marcio";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
