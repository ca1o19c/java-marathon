package introducao;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            System.out.println("dentro do 'while' -> " + contador);
            contador++;
        }

        contador = 0;

        do {
            System.out.println("dentro do 'do while' -> " + contador);
            contador++;
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("dentro do 'for' -> " + i);
        }

        int maximo = 50;

        for (int i = 0; i <= maximo; i++) {
            if (i > 25) {
                break;
            }

            System.out.println(i);
        }
    }
}
