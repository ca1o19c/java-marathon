package introducao;

public class EstruturaCondicional02 {
    public static void main(String[] args) {
        int idade = 19;
        String categoria;

        if (idade < 15) {
            categoria = "infant";
        } else if (idade >= 15 && idade < 18) {
            categoria = "young";
        } else {
            categoria = "Adult";
        }

        System.out.println(categoria);

        String categoriaJediMaster = idade < 15 ? "infant" : idade >= 15 && idade < 18 ? "young" : "Adult";

        System.out.println(categoriaJediMaster);
    }
}
