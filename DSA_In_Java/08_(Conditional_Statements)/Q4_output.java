// Question 4 : What will be the value of x & y in the following program:
// public class Solution {
// public static void main(String args[]) {
// int a = 63, b = 36;
// boolean x = (a < b ) ? true : false;
// int y= (a > b ) ? a : b;
// }
// }
public class Q4_output {

    public static void main(String args[]) {
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        System.out.println("x = " + x + ", y = " + y);
    }

}
