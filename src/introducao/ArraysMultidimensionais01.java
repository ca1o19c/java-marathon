package introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

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
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
