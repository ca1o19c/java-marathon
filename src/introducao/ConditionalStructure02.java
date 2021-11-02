package introducao;

public class ConditionalStructure02 {
    public static void main(String[] args) {
        int age = 19;
        String category;

        if (age < 15) {
            category = "infant";
        } else if (age >= 15 && age < 18) {
            category = "young";
        } else {
            category = "Adult";
        }

        System.out.println(category);

        String categoryJediMaster = age < 15 ? "infant" : age >= 15 && age < 18 ? "young" : "Adult";

        System.out.println(categoryJediMaster);
    }
}
