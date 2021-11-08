package introducao;

public class EstruturaCondicional01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean autorizadoParaCommprarBebidaAlcoolica =  idade >= 18;

        if (autorizadoParaCommprarBebidaAlcoolica) {
            System.out.println("Authorized to buy alcoholic beverage");
        } else {
            System.out.println("Not authorized to buy alcoholic beverage");
        }
    }
}
