import java.util.*;

public class M14_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // int flag = 0;
        // for(int i=2; i<=n/2; i++){
        // if(n%i == 0){
        // flag = 1;
        // break;
        // }
        // }
        // if(flag == 0){
        // System.out.println(n + " is a prime number.");
        // }else{
        // System.out.println(n + " is not a prime number.");
        // }
        // sc.close();
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
        sc.close();
    }

}
