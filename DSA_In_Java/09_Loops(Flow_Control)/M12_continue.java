public class M12_continue {
    public static void main(String[] args) {
        for (int counter=1; counter<=10; counter++) {
            if (counter == 5) {
                continue;
            }
            System.out.println(counter);
        }
        System.out.println("Out of loop");
    }
}
