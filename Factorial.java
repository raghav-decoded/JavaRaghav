/* Experiment 2(B)
   AIM: Find the factorial of a given number using Recursion.

   Raghav Singh
   00615611921
   S13 (AI & DS)
*/

import java.util.*;  

class Factorial {
   static int factorial(int n) {
      if (n == 0)
         return 1;
      else
         return (n * factorial(n - 1));
   }

   public static void main(String args[]) {
      int fact = 1;
      Scanner sc = new Scanner(System.in); // System.in is a standard input stream
      System.out.print("Enter the number: ");
      int a = sc.nextInt();

      fact = factorial(a);
      System.out.println("Factorial of " + a + " is: " + fact);
      sc.close();
   }
}