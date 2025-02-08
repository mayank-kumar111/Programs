import java.util.*;
public class Q4_multiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the multiplication table: ");
        int num = sc.nextInt();
        System.out.println("Enter the range till which you want to print the multiplication table: ");
        int range = sc.nextInt();
        for(int i=1; i<=range; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
        sc.close();

        // Using function
        System.out.println();
        System.out.println("Using function: ");
        multiplicationTable(num, range);
    }

    public static void multiplicationTable(int num, int range){
        for(int i=1; i<=range; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
    
}
