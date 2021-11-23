package javacore.excecoes.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {

        try {
            throw new ArithmeticException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do \"ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException\"");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do \"IndexOutOfBoundsException\"");
        } catch (RuntimeException e) {
            System.out.println("Dentro do \"RuntimeException\"");
        }

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, IOException {
        // TODO document why this method is empty
    }
}
