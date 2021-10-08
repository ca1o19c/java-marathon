package academy.javamarathon.introduction;

public class StructureConditional {
    public static void main(String[] args) {
        int age = 19;
        boolean authorizedToBuyAlcoholicBeverage =  age >= 18;

        if (authorizedToBuyAlcoholicBeverage) {
            System.out.println("Authorized to buy alcoholic beverage");
        }

        if (!authorizedToBuyAlcoholicBeverage) {
            System.out.println("Not authorized to buy alcoholic beverage");
        }
    }
}
