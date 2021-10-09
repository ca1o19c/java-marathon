package academy.javamarathon.introduction;

public class StructureConditional03 {
    public static void main(String[] args) {
        double salary = 6000;
        String donateMessage = "I will donate 600 to DevDojo";
        String notDonateMessage = "I will not donate to DevDojo";
        String result = (salary > 5000) ? donateMessage : notDonateMessage;

        System.out.println(result);
    }
}
