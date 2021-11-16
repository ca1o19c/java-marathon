package introducao;

public class ArraysMultidimensionais03 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int [] array = {1, 2};

        arrayInt[0] = array;
        arrayInt[1] = new int[]{ 1, 2, 3 };
        arrayInt[2] = new int[]{ 1, 2, 3, 4, 5, 6};

        for (int[] arrayBase :
                arrayInt) {
            for (int num :
                    arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }
}
