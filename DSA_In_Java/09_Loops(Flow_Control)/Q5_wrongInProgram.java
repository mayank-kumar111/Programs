// Question 5 :
// What is wrong in the following program ?

public class Q5_wrongInProgram {
public static void main(String args[]) {
for(int i = 0; i <= 5; i++ ) {
System.out.println("i = " + i );
}
//System.out.println("i after the loop = " + i ); // Error: i cannot be resolved to a variable 
// The variable i is declared inside the for loop and is not accessible outside the loop.
}
} 
    

