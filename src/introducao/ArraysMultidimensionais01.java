package introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        // Imprimindo no modo raiz
        System.out.print(dias[0][0] + " ");
        System.out.print(dias[0][1] + " ");
        System.out.print(dias[0][2] + " ");

        System.out.println("");

        System.out.print(dias[1][0] + " ");
        System.out.print(dias[1][1] + " ");
        System.out.print(dias[1][2] + " ");

        System.out.println("");

        System.out.print(dias[2][0] + " ");
        System.out.print(dias[2][1] + " ");
        System.out.print(dias[2][2] + " ");

        System.out.println("\n");

        // Imprimindo no modo nutella XD
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias.length; j++) {
                System.out.print(dias[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
