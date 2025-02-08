import java.util.*;

// Question 2: In a program, input the side of a square. You have to output the area of the square.
// (Hint : area of a square is (side x side))
public class Q2_squareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the side of a square.");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("The area of the square : " + area);
        sc.close();
    }
}