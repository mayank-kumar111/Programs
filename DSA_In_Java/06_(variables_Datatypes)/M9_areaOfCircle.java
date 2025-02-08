import java.util.*;

public class M9_areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println("Area of the circle with radius " + r + " is " + area);
        sc.close();
    }
}