package javacore.strings.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String username = "ca1o19c";

        username.concat("dev");

        var substring = username.substring(0, 3);

        System.out.println(substring);

        System.out.println(username);

        StringBuilder sb = new StringBuilder("ca1o19c"); // Não é imutável

        sb.append(" dev").append(" java");

        sb.reverse();

        sb.delete(0, 3);

        sb.reverse();

        System.out.println(sb);
    }
}
