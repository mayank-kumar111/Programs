public class M4_elseIf {
    public static void main(String[] args) {
        int age = 23;
        if (age >= 18) {
            System.out.println("Adult: You are eligible to vote");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager: You are not eligible to vote");
        } else {
            System.out.println("Child: You are not eligible to vote");
        }
    }
}
