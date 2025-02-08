import java.util.*; 
public class M11_updateithBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and ith bit to update: ");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int v = sc.nextInt();
        int updateithBit = updateithBit(n, i, v);
        System.out.println(updateithBit);
        sc.close();
    }

    public static int updateithBit(int n, int i, int v) {
        int mask = ~(1 << i);
        int clearithBit = n & mask;
        int setithBit = v << i;
        int updateithBit = clearithBit | setithBit;
        return updateithBit;
    }

     
}
