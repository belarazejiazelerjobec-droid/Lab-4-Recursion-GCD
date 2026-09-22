import java.util.Scanner;

/* Description: A student program calculating GCD using the Euclidean algorithm 
   with an automated recursion trace to showcase stack frames.
   Programmed by: Aze Jiazeler Jobe C. Belar, BSIT CC104
   Last Modified: September 22, 2026
   Version: 1.0
   Acknowledgements: Formatted with assistance from AI
*/

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number (A):");
        int num1 = input.nextInt();
        
        System.out.println("Enter second number (B):");
        int num2 = input.nextInt();
        
        if (num1 == 0 && num2 == 0) {
            System.out.println("Error: Both numbers cannot be zero.");
        } else {
            System.out.println("");
            System.out.println("Starting Recursion Trace");
            
            int finalAnswer = findGCD(num1, num2);
            
            System.out.println("");
            System.out.println("The final GCD is: " + finalAnswer);
        }
        
        input.close();
    }

    public static int findGCD(int a, int b) {
        System.out.println("Running findGCD with a = " + a + " and b = " + b);
        
        // Base Case: check this first to prevent a % 0 crashes!
        if (b == 0) {
            System.out.println("Base case reached because b is 0. Returning: " + a);
            return a;
        }
        
        // Safe to calculate now because we know b is not 0
        int remainder = a % b;
        System.out.println("The remainder of " + a + " % " + b + " is: " + remainder);
        System.out.println("Not zero yet, moving to next step.");
        
        return findGCD(b, remainder);
    }
}
