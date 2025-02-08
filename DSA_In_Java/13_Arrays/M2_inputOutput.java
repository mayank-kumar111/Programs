import java.util.*;

public class M2_inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        System.out.println("physic " + marks[0]);
        System.out.println("chemistry " + marks[1]);
        System.out.println("maths " + marks[2]);
        System.out.println("biology  " + marks[3]);
        // update marks
        marks[0] = 30;
        marks[1] = marks[1] + 79;
        System.out.println("updated marks");
        System.out.println("physic " + marks[0]);
        System.out.println("chemistry " + marks[1]);
        System.out.println("maths " + marks[2]);
        System.out.println("biology " + marks[3]);
        // percentage
        int total = (marks[0] + marks[1] + marks[2] + marks[3]) / 4;
        System.out.println("percentage " + total + "%");
        // lelngth of array
        System.out.println("length of array " + marks.length);
        sc.close();
    }

}
