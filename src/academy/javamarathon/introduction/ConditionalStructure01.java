package academy.javamarathon.introduction;

public class ConditionalStructure01 {
    public static void main(String[] args) {
        int age = 19;
        boolean authorizedToBuyAlcoholicBeverage =  age >= 18;

        if (authorizedToBuyAlcoholicBeverage) {
            System.out.println("Authorized to buy alcoholic beverage");
        } else {
            System.out.println("Not authorized to buy alcoholic beverage");
        }
    }
}
